package net.craprax.item;

import net.craprax.ExoticCrystals;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item ROOTICIUM_CRYSTAL = registerItem("rooticium_crystal",
            new Item(new FabricItemSettings().group(ModItemGroup.EXOTIC_CRYSTALS)));

    public static final Item ROOTICIUM_SHARD = registerItem("rooticium_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.EXOTIC_CRYSTALS)));

    public static final Item PHOENIXIT_SHARD = registerItem("phoenixit_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.EXOTIC_CRYSTALS)));

    public static final Item DELTARIUM_SHARD = registerItem("deltarium_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.EXOTIC_CRYSTALS)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ExoticCrystals.MOD_ID, name), item);
    }
    public static void registerModItems() {
        ExoticCrystals.LOGGER.debug("Registering Mod Items for " + ExoticCrystals.MOD_ID);
    }
}
