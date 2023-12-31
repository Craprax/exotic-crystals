package net.craprax.block;

import net.craprax.ExoticCrystals;
import net.craprax.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block PHOENIXIT_ORE = registerBlock("phoenixit_ore",
            new OreBlock(FabricBlockSettings.of(Material.METAL)
                    .strength(1f)
                    .requiresTool()),
            ModItemGroup.EXOTIC_CRYSTALS);

    public static final Block ROOTICIUM_LAMP = registerBlock("rooticium_lamp",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .strength(1f)
                    .luminance(10).nonOpaque()),
            ModItemGroup.EXOTIC_CRYSTALS);

    public static final Block PHOENIXIT_CRYSTAL_ORE = registerBlock("phoenixit_crystal_ore",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .strength(1f)
                    .luminance(8).nonOpaque()),
            ModItemGroup.EXOTIC_CRYSTALS);
    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(ExoticCrystals.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(ExoticCrystals.MOD_ID, name)
                , new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        ExoticCrystals.LOGGER.debug("Registering Modblocks for " + ExoticCrystals.MOD_ID);
    }
}
