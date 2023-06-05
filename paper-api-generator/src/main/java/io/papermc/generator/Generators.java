package io.papermc.generator;

import io.papermc.generator.types.GeneratedKeyType;
import io.papermc.generator.types.SourceGenerator;
import io.papermc.generator.types.goal.MobGoalGenerator;
import net.kyori.adventure.key.Keyed;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import org.bukkit.GameEvent;
import org.bukkit.block.Biome;
import org.bukkit.generator.structure.StructureType;
import org.bukkit.inventory.meta.trim.TrimMaterial;
import org.bukkit.inventory.meta.trim.TrimPattern;

public interface Generators {

    SourceGenerator[] API = {
        simpleKey("GameEventKeys", GameEvent.class, Registries.GAME_EVENT, true),
        simpleKey("BiomeKeys", Biome.class, Registries.BIOME, true),
        simpleKey("TrimMaterialKeys", TrimMaterial.class, Registries.TRIM_MATERIAL, true),
        simpleKey("TrimPatternKeys", TrimPattern.class, Registries.TRIM_PATTERN, true),
        simpleKey("StructureTypeKeys", StructureType.class, Registries.STRUCTURE_TYPE, false),
        new MobGoalGenerator("VanillaGoal", "io.papermc.paper.generated")
    };

    SourceGenerator[] SERVER = {
    };


    private static <T> SourceGenerator simpleKey(final String className, final Class<? extends Keyed> apiType, final ResourceKey<? extends Registry<T>> registryKey, final boolean publicCreateKeyMethod) {
        return new GeneratedKeyType<>(className, apiType, "io.papermc.paper.generated", registryKey, "null", publicCreateKeyMethod);
    }
}
