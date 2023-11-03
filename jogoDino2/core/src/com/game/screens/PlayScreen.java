package com.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.game.dinos.Dino;
import com.game.dinos.Poing;
import com.game.dinos.Roar;
import com.game.dinos.Tum;
import com.game.utils.Tiled;

public class PlayScreen implements Screen{
	Tiled tiled;
	OrthographicCamera camera;
	Dino dino;
	@Override
	public void show() {//método chamado quando a tela vira a atual
		tiled = new Tiled();
		camera = new OrthographicCamera();
		dino = new Roar();
		dino.setTexture(new Texture(dino.changeDino()));
		dino = new Roar(new Sprite(dino.getTexture()));
		 
		
	}

	@Override
	public void render(float delta) {//sempre é chamado para renderizar o mapa
		handleInput();
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		tiled.viewMap(camera);
		tiled.mapRender();
		tiled.beginRenderer();
		dino.draw(tiled.getRenderer().getBatch());
		tiled.endRenderer();
		
	}
	public void handleInput() {
		if(Gdx.input.isKeyJustPressed(Input.Keys.NUM_1)) { 
			 dino = new Poing();
			 dino.setTexture(new Texture(dino.changeDino())); 
			 dino = new Poing(new Sprite(dino.getTexture()));
		 }
		 if(Gdx.input.isKeyJustPressed(Input.Keys.NUM_2)) {
			 dino = new Tum();
			 dino.setTexture(new Texture(dino.changeDino()));
			 dino = new Tum(new Sprite(dino.getTexture()));
		 }
		 if(Gdx.input.isKeyJustPressed(Input.Keys.NUM_3)) {
			 dino = new Roar();
			 dino.setTexture(new Texture(dino.changeDino())); 
			 dino = new Roar(new Sprite(dino.getTexture()));
		 }
		 
	}

	@Override
	public void resize(int width, int height) {
		camera.viewportWidth = width;
		camera.viewportHeight = height;
		camera.update();
		
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
		dispose();
		
	}

	@Override
	public void dispose() {
		tiled.getMap().dispose();
		tiled.getRenderer().dispose();
	}

}
