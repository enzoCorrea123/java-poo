package com.game.adinoventure.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.game.adinoventure.Adinoventure;
import com.game.adinoventure.Scenes.Hud;
import com.game.adinoventure.Scenes.Tiled;
import com.game.adinoventure.dino.Dino;
import com.game.adinoventure.dino.Poing;
import com.game.adinoventure.dino.Roar;
import com.game.adinoventure.dino.Tum;

public class PlayScreen implements Screen {
	private Adinoventure game;
	private OrthographicCamera gamecam;
	private Viewport gamePort;
	private Hud hud;
	private Dino dino;
	private Tiled tiled;
	private Texture texture;
	public PlayScreen(Adinoventure game) {
		this.game = game;
		gamecam = new OrthographicCamera();
		gamePort = new FitViewport(Adinoventure.width, Adinoventure.height);
		hud = new Hud(game.batch);
		tiled = new Tiled();
		 dino = new Roar();
		 dino.changeDino();
		 texture = dino.getTexture();
		gamecam.position.set(gamePort.getWorldWidth() / 2, gamePort.getWorldHeight()/2, 0);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

	public void update(float dt) {
		handleInput(dt);
		gamecam.update();
		tiled.viewMap(gamecam);
		
	}

	private void handleInput(float dt) {
		if(Gdx.input.isKeyJustPressed(Input.Keys.SPACE)) {
			gamecam.position.x += 100 * dt;//fazer mover o mapa
		}
		
	}

	@Override
	public void render(float delta) {// limpando a tela
		//handleClick();
		Gdx.gl.glClearColor(0, 0, 0, 1);// cores - preto
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);// limpa a tela
		game.batch.setProjectionMatrix(hud.stage.getCamera().combined);
		tiled.mapRender();
		update(delta);
	}

	public void handleClick() {
		/*
		 * if(Gdx.input.isKeyJustPressed(Input.Keys.NUM_1)) { dino = new Poing();
		 * dino.changeDino(); this.texture = dino.getTexture(); }
		 * if(Gdx.input.isKeyJustPressed(Input.Keys.NUM_2)) { dino = new Tum();
		 * dino.changeDino(); this.texture = dino.getTexture(); }
		 * if(Gdx.input.isKeyJustPressed(Input.Keys.NUM_3)) { dino = new Roar();
		 * dino.changeDino(); this.texture = dino.getTexture(); }
		 */
	}

	@Override
	public void resize(int width, int height) {
		gamePort.update(width, height);

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
