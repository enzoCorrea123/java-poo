package com.game.adinoventure.Dictionary;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;

public class Tiled {
	private TmxMapLoader mapLoader;
	private TiledMap map;
	private OrthogonalTiledMapRenderer renderer;
	
	public Tiled() {
		mapLoader = new TmxMapLoader();
		map = mapLoader.load("mapaAdinoventure1.tmx");
		renderer = new OrthogonalTiledMapRenderer(map);
	}
	
	public void viewMap(OrthographicCamera gamecam) {
		renderer.setView(gamecam);
	}
	public void mapRender() {
		renderer.render();
	}
}
