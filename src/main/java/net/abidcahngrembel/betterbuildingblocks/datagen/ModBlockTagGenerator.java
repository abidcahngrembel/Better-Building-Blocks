package net.abidcahngrembel.betterbuildingblocks.datagen;

import net.abidcahngrembel.betterbuildingblocks.BetterBuildingBlocks;
import net.abidcahngrembel.betterbuildingblocks.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, BetterBuildingBlocks.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(BlockTags.FENCES)
                .add(ModBlocks.DIAMOND_FENCE.get());

        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.DIAMOND_FENCE_GATE.get());

        this.tag(BlockTags.SLABS)
                .add(ModBlocks.DIAMOND_SLAB.get());

        this.tag(BlockTags.STAIRS)
                .add(ModBlocks.DIAMOND_STAIRS.get());

        this.tag(BlockTags.WALLS)
                .add(ModBlocks.DIAMOND_WALL.get());
    }
}
