package com.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.game.dinos.Dino;
import com.game.dinos.Poing;
import com.game.dinos.Roar;
import com.game.dinos.Tum;
import com.game.physics.Collidable;
import com.game.utils.Tiled;

public class PlayScreen implements Screen {
	Tiled tiled;
	OrthographicCamera camera;
	Dino dino;
	Collidable collidable;
	World world;
	
	
	public Tiled getTiled() {
		return tiled;
	}

	public void setTiled(Tiled tiled) {
		this.tiled = tiled;
	}

	public Dino getDino() {
		return dino;
	}

	public void setDino(Dino dino) {
		this.dino = dino;
	}

	public Collidable getCollidable() {
		return collidable;
	}

	public void setCollidable(Collidable collidable) {
		this.collidable = collidable;
	}

	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
	}

	@Override
	public void show() {// método chamado quando a tela vira a atual
		tiled = new Tiled(this);
		world = new World(new Vector2(0,-10), true);
		camera = new OrthographicCamera();
		
		dino = new Roar();
		Gdx.input.setInputProcessor(dino);
		dino.setTexture(dino.changeDino());
		dino = new Roar(new Sprite(dino.getTexture()), this);
		dino.setPosition(0, 100);
		
		collidable = new Collidable(this);
		collidable.collidableBrick();
		collidable.collidableDoor();
		collidable.collidableGround();
		collidable.collidableSpike();
		collidable.collidableWall();

	}

	@Override
	public void render(float delta) {// sempre é chamado para renderizar o mapa
		handleInput();
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		tiled.viewMap(camera);
		tiled.mapRender();
		collidable.renderDebugLines(camera);
		collidable.checkCollision();
		tiled.beginRenderer();
		dino.draw(tiled.getRenderer().getBatch());
		tiled.endRenderer();
		world.step(Gdx.graphics.getDeltaTime(), 5, 5);
		System.out.println(dino.getY());

	}

	public void handleInput() {
		//world.destroyBody(dino.getBody());
		if (Gdx.input.isKeyJustPressed(Input.Keys.NUM_1)) {
			dino = new Poing();
			dino.setTexture(dino.changeDino());
			dino = new Poing(new Sprite(dino.getTexture()), this);
		}
		if (Gdx.input.isKeyJustPressed(Input.Keys.NUM_2)) {
			dino = new Tum();
			dino.setTexture(dino.changeDino());
			dino = new Tum(new Sprite(dino.getTexture()), this);
		}
		if (Gdx.input.isKeyJustPressed(Input.Keys.NUM_3)) {
			dino = new Roar();
			dino.setTexture(dino.changeDino());
			dino = new Roar(new Sprite(dino.getTexture()), this);
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
