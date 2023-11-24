package net.abidcahngrembel.betterbuildingblocks.datagen.loot;

import net.abidcahngrembel.betterbuildingblocks.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        this.add(ModBlocks.DIAMOND_SLAB.get(), block -> createSlabItemTable(ModBlocks.DIAMOND_SLAB.get()));

        this.dropSelf(ModBlocks.DIAMOND_STAIRS.get());

        this.dropSelf(ModBlocks.DIAMOND_FENCE.get());

        this.dropSelf(ModBlocks.DIAMOND_FENCE_GATE.get());

        this.dropSelf(ModBlocks.DIAMOND_WALL.get());

    }
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
