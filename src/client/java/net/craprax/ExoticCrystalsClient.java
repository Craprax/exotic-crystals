package net.craprax;

import net.craprax.util.ModModelPredicateProvider;
import net.fabricmc.api.ClientModInitializer;

public class ExoticCrystalsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		ModModelPredicateProvider.registerModModels();
	}
}