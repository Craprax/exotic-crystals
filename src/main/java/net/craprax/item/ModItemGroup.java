package net.craprax.item;

import net.craprax.ExoticCrystals;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup EXOTIC_CRYSTALS = FabricItemGroupBuilder
            .build(new Identifier(ExoticCrystals.MOD_ID, "exotic_crystals"), () -> new ItemStack(ModItems.ROOT_CRYSTAL));
}
