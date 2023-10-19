package com.game.adinoventure;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.FillViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.game.adinoventure.Dictionary.World;

public class Adinoventure extends Game {
	
	public static final boolean DEBUG = true;
	private static Adinoventure instance;
	public SpriteBatch batch;
	
	protected OrthographicCamera camera;
	
	protected Viewport viewport;
	
	protected World world;
	
	public Adinoventure() {
		instance = this;
	}
	public Adinoventure getInstance() {
		return instance;
	}
	@Override
	public void create () {
		batch = new SpriteBatch();
		camera = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		camera.setToOrtho(false);
		viewport = new FillViewport(Gdx.graphics.getWidth(), Gdx.graphics.getHeight(),camera);
		world = new World(camera);
		world.regenerate();
		
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		world.update(Gdx.graphics.getDeltaTime());

	}
	
	public void resize(int width, int height) {
		viewport.update(width, height);
	}
	@Override
	public void dispose () {
		batch.dispose();
	}
}
