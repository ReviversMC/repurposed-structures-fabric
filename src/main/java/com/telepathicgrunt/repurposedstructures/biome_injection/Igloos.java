package com.telepathicgrunt.repurposedstructures.biome_injection;

import com.telepathicgrunt.repurposedstructures.RepurposedStructures;
import com.telepathicgrunt.repurposedstructures.modinit.RSConfiguredFeatures;
import com.telepathicgrunt.repurposedstructures.modinit.RSConfiguredStructures;
import com.telepathicgrunt.repurposedstructures.modinit.RSStructureTagMap;
import com.telepathicgrunt.repurposedstructures.utils.BiomeSelection;
import com.telepathicgrunt.repurposedstructures.utils.GeneralUtils;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class Igloos {

    public static void addIgloos() {

        GeneralUtils.addToBiome("grassy_igloo",
                (context) -> BiomeSelection.haveCategories(context, Category.FOREST, Category.PLAINS)
                        && RepurposedStructures.RSAllConfig.RSMainConfig.igloos.grassyIglooMaxChunkDistance != 1001
                        && BiomeSelection.isBiomeAllowed(context, "igloos")
                        && (BiomeSelection.hasNamespace(context, "minecraft") || RepurposedStructures.RSAllConfig.RSMainConfig.igloos.addGrassyIglooToModdedBiomes),
                context -> context.getGenerationSettings().addBuiltInStructure(RSConfiguredStructures.GRASSY_IGLOO));

        GeneralUtils.addToBiome("stone_igloo",
                (context) -> BiomeSelection.haveCategories(context, Category.TAIGA)
                        && BiomeSelection.hasName(context, "giant", "redwood")
                        && RepurposedStructures.RSAllConfig.RSMainConfig.igloos.stoneIglooMaxChunkDistance != 1001
                        && BiomeSelection.isBiomeAllowed(context, "igloos")
                        && (BiomeSelection.hasNamespace(context, "minecraft") || RepurposedStructures.RSAllConfig.RSMainConfig.igloos.addStoneIglooToModdedBiomes),
                context -> context.getGenerationSettings().addBuiltInStructure(RSConfiguredStructures.STONE_IGLOO));
    }
}
