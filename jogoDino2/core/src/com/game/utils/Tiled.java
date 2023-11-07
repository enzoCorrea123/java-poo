package com.game.utils;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.game.screens.PlayScreen;

public class Tiled {
	private TmxMapLoader mapLoader;
	private TiledMap map;
	private OrthogonalTiledMapRenderer renderer;
	PlayScreen screen;
	public Tiled(PlayScreen screen) {
		this.screen = screen;
		mapLoader = new TmxMapLoader();
		map = mapLoader.load("mapaAdinoventure1.tmx");
		renderer = new OrthogonalTiledMapRenderer(map);//pode alterar a escala
	}
	
	public void viewMap(OrthographicCamera camera) {
		renderer.setView(camera);
	}
	public void mapRender() {
		renderer.render();
	}

	public TiledMap getMap() {
		return map;
	}

	public void setMap(TiledMap map) {
		this.map = map;
	}

	public OrthogonalTiledMapRenderer getRenderer() {
		return renderer;
	}

	public void setRenderer(OrthogonalTiledMapRenderer renderer) {
		this.renderer = renderer;
	}
	public void beginRenderer() {
		renderer.getBatch().begin();
	}
	public void endRenderer() {
		renderer.getBatch().end();
	}

}
