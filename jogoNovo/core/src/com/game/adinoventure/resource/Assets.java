package com.game.adinoventure.resource;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;

public class Assets {
	public static final AssetManager manager = new AssetManager();
	public static final AssetDescriptor<Texture> roar = new AssetDescriptor<>("./roar.png", Texture.class);
	public static final AssetDescriptor<Texture> tum = new AssetDescriptor<>("./tum.png", Texture.class);
	public static final AssetDescriptor<Texture> poing = new AssetDescriptor<>("./poing.png", Texture.class);
	public static void load() {
		Texture.setAssetManager(manager);
		manager.load(roar);
		manager.load(tum);
		manager.load(poing);
	}
}
