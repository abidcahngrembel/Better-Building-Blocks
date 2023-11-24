package net.abidcahngrembel.betterbuildingblocks.datagen;

import net.abidcahngrembel.betterbuildingblocks.BetterBuildingBlocks;
import net.abidcahngrembel.betterbuildingblocks.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.Collection;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, BetterBuildingBlocks.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        fenceItem(ModBlocks.DIAMOND_FENCE, Blocks.DIAMOND_BLOCK);
        wallItem(ModBlocks.DIAMOND_WALL, Blocks.DIAMOND_BLOCK);

    }

    private void wallItem(RegistryObject<Block> diamondWall, Block diamondBlock) {
    }

    private void fenceItem(RegistryObject<Block> diamondFence, Block diamondBlock) {
    }

}
