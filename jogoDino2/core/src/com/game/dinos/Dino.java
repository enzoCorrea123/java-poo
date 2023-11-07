package com.game.dinos;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.BodyDef.BodyType;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;
import com.game.screens.PlayScreen;

public abstract class Dino extends Sprite implements InputProcessor {
	public Vector2 velocity = new Vector2();
	protected float speed = 60 * 2;
	protected float gravity = 60 * 1.8f;
	protected float velocityX = 0, velocityY = 0;
	protected Texture texture = new Texture("roar.png");
	private TiledMapTileLayer collisionLayer;
	private BodyDef bodyDef;
	private PolygonShape polygonShape;
	private FixtureDef fixture;
	private Body body;
	private World world;
	public Dino() {

	}


	public Body getBody() {
		return body;
	}


	public void setBody(Body body) {
		this.body = body;
	}


	public Dino(Sprite sprite, PlayScreen screen) {
		super(sprite);
		this.world = screen.getWorld();
		bodyDef = new BodyDef();
        polygonShape = new PolygonShape();
        fixture = new FixtureDef();
        collisionDino();
	}
	
	public abstract Texture changeDino();

	@Override
	public void draw(Batch batch) {
		super.draw(batch);
		batch.draw(texture, body.getPosition().x - (texture.getWidth() / 2), body.getPosition().y - (texture.getHeight() / 2));
		update(Gdx.graphics.getDeltaTime());
	}

	private void update(float delta) {
    	bodyDef.position.set(getX(), getY());
		
	}
	private void collisionDino() {
		bodyDef.type = BodyType.DynamicBody;
    	bodyDef.position.set(getX() + getWidth() / 2, getY() + getHeight()/2);
    	bodyDef.position.set(50, 100);
		
    	body = world.createBody(bodyDef);
    	polygonShape.setAsBox(getWidth() / 2, getHeight() / 2);
    	fixture.shape = polygonShape;
    	body.createFixture(fixture);
    	
    	
    
	}
	
	public Texture getTexture() {
		return texture;
	}

	public void setTexture(Texture texture) {
		this.texture = texture;
	}
	public Vector2 getVelocity() {
		return velocity;
	}

	public void setVelocity(Vector2 velocity) {
		this.velocity = velocity;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public float getGravity() {
		return gravity;
	}

	public void setGravity(float gravity) {
		this.gravity = gravity;
	}

	public TiledMapTileLayer getCollisionLayer() {
		return collisionLayer;
	}

	public void setCollisionLayer(TiledMapTileLayer collisionLayer) {
		this.collisionLayer = collisionLayer;
	}
}