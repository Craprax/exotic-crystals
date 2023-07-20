package net.craprax;

import net.craprax.block.ModBlocks;
import net.craprax.util.ModModelPredicateProvider;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class ExoticCrystalsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		ModModelPredicateProvider.registerModModels();
		intializeBlockLayerMap();
	}

	private void intializeBlockLayerMap() {
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PHOENIXIT_CRYSTAL_ORE, RenderLayer.getCutout());
	}
}