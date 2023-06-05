package io.papermc.generator.types.goal;

import com.destroystokyo.paper.entity.ai.GoalKey;
import com.squareup.javapoet.*;
import io.github.classgraph.ClassGraph;
import io.github.classgraph.ScanResult;
import io.papermc.generator.types.Annotations;
import io.papermc.generator.types.SimpleGenerator;
import io.papermc.generator.utils.Formatting;
import net.minecraft.world.entity.ai.goal.Goal;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Mob;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.framework.qual.DefaultQualifier;

import javax.lang.model.element.Modifier;
import java.util.*;
import java.util.stream.Collectors;

@DefaultQualifier(NonNull.class)
public class MobGoalGenerator extends SimpleGenerator {

    public MobGoalGenerator(final String keysClassName, final String pkg) {
        super(keysClassName, pkg);
    }

    @Override
    protected TypeSpec getTypeSpec() {
        TypeName clazzType = TypeName.get(Class.class)
            .annotated(Annotations.NOT_NULL);
        TypeName keyType = TypeName.get(String.class)
            .annotated(Annotations.NOT_NULL);

        MethodSpec.Builder createMethod = MethodSpec.methodBuilder("of")
            .addModifiers(Modifier.PRIVATE, Modifier.STATIC)
            .addParameter(ParameterSpec.builder(keyType, "key", Modifier.FINAL)
                .build()
            )
            .addParameter(ParameterSpec.builder(clazzType, "clazz", Modifier.FINAL)
                .build()
            )
            .addCode("return $T.of(clazz, $T.minecraft(key));", GoalKey.class, NamespacedKey.class)
            .returns(ParameterizedTypeName.get(GoalKey.class).annotated(Annotations.NOT_NULL));


        TypeVariableName type = TypeVariableName.get("T", Mob.class);
        TypeSpec.Builder typeBuilder = TypeSpec.interfaceBuilder(this.className)
            .addSuperinterface(ParameterizedTypeName.get(ClassName.get(com.destroystokyo.paper.entity.ai.Goal.class), type))
            .addModifiers(Modifier.PUBLIC)
            .addTypeVariable(type)
            .addAnnotations(Annotations.CLASS_HEADER);


        List<Class<?>> classes;
        try (ScanResult scanResult = new ClassGraph().enableAllInfo().whitelistPackages("net.minecraft").scan()) {
            classes = scanResult.getSubclasses(net.minecraft.world.entity.ai.goal.Goal.class.getName()).loadClasses();
        }

        List<GoalKey<?>> vanillaNames = classes.stream()
            .filter(MobGoalGenerator::hasNoEnclosingClass)
            .filter(clazz -> !java.lang.reflect.Modifier.isAbstract(clazz.getModifiers()))
            .filter(clazz -> !net.minecraft.world.entity.ai.goal.WrappedGoal.class.equals(clazz)) // TODO - properly fix
            .map(goalClass -> MobGoalNames.getKey(goalClass.getName(), (Class<? extends Goal>) goalClass))
            .filter((key) -> !MobGoalNames.isIgnored(key.getNamespacedKey().getKey()))
            .sorted(Comparator.comparing(o -> o.getEntityClass().getName()))
            .collect(Collectors.toList());


        for (final GoalKey<?> value : vanillaNames) {
            TypeName typedKey = ParameterizedTypeName.get(GoalKey.class, value.getEntityClass());
            NamespacedKey key = value.getNamespacedKey();

            String keyPath = key.getKey();
            String fieldName = Formatting.formatKeyAsField(key);
            FieldSpec.Builder fieldBuilder = FieldSpec.builder(typedKey, fieldName, Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL)
                .initializer("$N($S, $T.class)", createMethod.build(), keyPath, value.getEntityClass());
            typeBuilder.addField(fieldBuilder.build());
        }

        return typeBuilder.addMethod(createMethod.build()).build();
    }

    @Override
    protected JavaFile.Builder file(JavaFile.Builder builder) {
        return builder
            .skipJavaLangImports(true);
    }

    private static boolean hasNoEnclosingClass(Class<?> clazz) {
        return clazz.getEnclosingClass() == null || hasNoEnclosingClass(clazz.getSuperclass());
    }
}
