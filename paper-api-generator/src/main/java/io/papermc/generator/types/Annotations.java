package io.papermc.generator.types;

import com.squareup.javapoet.AnnotationSpec;
import java.util.List;

import com.squareup.javapoet.ClassName;
import net.minecraft.SharedConstants;
import org.bukkit.MinecraftExperimental;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

public final class Annotations {

    public static final List<AnnotationSpec> EXPERIMENTAL_ANNOTATIONS = List.of(
        AnnotationSpec.builder(ApiStatus.Experimental.class).build(),
        AnnotationSpec.builder(MinecraftExperimental.class)
            .addMember("value", "$S", "update 1.20")
            .build()
    );
    public static final AnnotationSpec NOT_NULL = AnnotationSpec.builder(NotNull.class).build();
    public static final Iterable<AnnotationSpec> CLASS_HEADER = List.of(
        AnnotationSpec.builder(SuppressWarnings.class)
            .addMember("value", "$S", "unused")
            .addMember("value", "$S", "SpellCheckingInspection")
            .build(),
        AnnotationSpec.builder(ClassName.get("io.papermc.paper.generated", "GeneratedFrom"))
            .addMember("value", "$S", SharedConstants.getCurrentVersion().getName())
            .build()
    );

    private Annotations() {
    }
}
