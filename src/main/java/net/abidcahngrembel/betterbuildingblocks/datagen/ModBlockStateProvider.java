package net.abidcahngrembel.betterbuildingblocks.datagen;

import net.abidcahngrembel.betterbuildingblocks.BetterBuildingBlocks;
import net.abidcahngrembel.betterbuildingblocks.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, BetterBuildingBlocks.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        slabBlock(((SlabBlock) ModBlocks.DIAMOND_SLAB.get()),
                blockTexture(Blocks.DIAMOND_BLOCK), blockTexture(Blocks.DIAMOND_BLOCK));

        stairsBlock(((StairBlock) ModBlocks.DIAMOND_STAIRS.get()), blockTexture(Blocks.DIAMOND_BLOCK));

        fenceBlock(((FenceBlock) ModBlocks.DIAMOND_FENCE.get()), blockTexture(Blocks.DIAMOND_BLOCK));

        fenceGateBlock(((FenceGateBlock) ModBlocks.DIAMOND_FENCE_GATE.get()), blockTexture(Blocks.DIAMOND_BLOCK));

        wallBlock(((WallBlock) ModBlocks.DIAMOND_WALL.get()), blockTexture(Blocks.DIAMOND_BLOCK));
    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
