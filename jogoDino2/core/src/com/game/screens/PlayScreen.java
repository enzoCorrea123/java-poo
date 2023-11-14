package com.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
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
	Dino roar, poing, tum;
	Dino currentDino;
	Collidable collidable;
	World world;
	Box2DDebugRenderer debugRenderer;
	private SpriteBatch batch;
	@Override
	public void show() {// mÃ©todo chamado quando a tela vira a atual
		tiled = new Tiled(this);
		world = new World(new Vector2(0,-9.81f), true);
		
		camera = new OrthographicCamera();
		camera.setToOrtho(false, Gdx.graphics.getWidth()/2, Gdx.graphics.getHeight()/2);
		
		debugRenderer = new Box2DDebugRenderer();
		batch = new SpriteBatch();
		
	    poing = initializePoing();
	    tum = initializeTum();
	    roar = initializeRoar();
		currentDino = roar;
		
		collidable = new Collidable(this);
		collidable.collidableBrick();
		collidable.collidableDoor();
		collidable.collidableGround();
		collidable.collidableSpike();
		collidable.collidableWall();

	}

	private Dino initializeTum() {
		BodyDef bodyDef = new BodyDef();
	    bodyDef.type = BodyDef.BodyType.DynamicBody;
	    // Defina a posição inicial do Roar
	    bodyDef.position.set(new Vector2(10, 50));

	    Body body = world.createBody(bodyDef);

	    PolygonShape shape = new PolygonShape();
	    shape.setAsBox(20, 40); // Exemplo de tamanho
	    FixtureDef fixtureDef = new FixtureDef();
	    fixtureDef.shape = shape;
	    body.createFixture(fixtureDef);
	    shape.dispose();
	    return new Tum(body, new Texture("tum.png"));
	}

	private Dino initializePoing() {
		BodyDef bodyDef = new BodyDef();
	    bodyDef.type = BodyDef.BodyType.DynamicBody;
	    // Defina a posição inicial do Roar
	    bodyDef.position.set(new Vector2(10, 50));

	    Body body = world.createBody(bodyDef);

	    PolygonShape shape = new PolygonShape();
	    shape.setAsBox(20, 40); // Exemplo de tamanho
	    FixtureDef fixtureDef = new FixtureDef();
	    fixtureDef.shape = shape;
	    body.createFixture(fixtureDef);
	    shape.dispose();
	    return new Poing(body, new Texture("poing.png"));
	}

	private Dino initializeRoar() {
		BodyDef bodyDef = new BodyDef();
	    bodyDef.type = BodyDef.BodyType.DynamicBody;
	    // Defina a posição inicial do Roar
	    bodyDef.position.set(new Vector2(10, 50));

	    Body body = world.createBody(bodyDef);

	    PolygonShape shape = new PolygonShape();
	    shape.setAsBox(20, 40); // Exemplo de tamanho
	    FixtureDef fixtureDef = new FixtureDef();
	    fixtureDef.shape = shape;
	    body.createFixture(fixtureDef);
	    shape.dispose();
	    return new Roar(body, new Texture("roar.png"));
	}

	@Override
	public void render(float delta) {// sempre Ã© chamado para renderizar o mapa
		handleInput();
		
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		camera.position.set(currentDino.getX() + currentDino.getWidth() / 2, currentDino.getY() + currentDino.getHeight() / 2, 0);
		
		tiled.viewMap(camera);
		tiled.mapRender();
		tiled.beginRenderer();
		tiled.endRenderer();
		
		world.step(Gdx.graphics.getDeltaTime(), 6, 2);
		
		currentDino.update(delta);
		batch.begin();
        currentDino.render(batch);
        batch.end();

	}

	public void handleInput() {
		// Troca de personagens
        if (Gdx.input.isKeyJustPressed(Input.Keys.NUM_1)) currentDino = roar;
        if (Gdx.input.isKeyJustPressed(Input.Keys.NUM_2)) currentDino = poing;
        if (Gdx.input.isKeyJustPressed(Input.Keys.NUM_3)) currentDino = tum;

        // Movimento e habilidades do personagem
        currentDino.handleInput();

	}

	@Override
	public void resize(int width, int height) {
		camera.viewportWidth = width / 2;
		camera.viewportHeight = height / 2;
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
		batch.dispose();
	}

	public Tiled getTiled() {
		return tiled;
	}

	public void setTiled(Tiled tiled) {
		this.tiled = tiled;
	}

	public Dino getRoar() {
		return roar;
	}

	public void setRoar(Dino roar) {
		this.roar = roar;
	}

	public Dino getPoing() {
		return poing;
	}

	public void setPoing(Dino poing) {
		this.poing = poing;
	}

	public Dino getTum() {
		return tum;
	}

	public void setTum(Dino tum) {
		this.tum = tum;
	}

	public Dino getCurrentDino() {
		return currentDino;
	}

	public void setCurrentDino(Dino currentDino) {
		this.currentDino = currentDino;
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

}
