package com.game.physics;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.objects.RectangleMapObject;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.physics.box2d.BodyDef.BodyType;
import com.game.dinos.Dino;
import com.game.dinos.Roar;
import com.game.utils.Tiled;

public class Collidable {
	private World world;
	private Tiled tiled;
	private Box2DDebugRenderer debugRenderer;
	private BodyDef bodyDef;
	private PolygonShape polygonShape;
	private FixtureDef fixture;
	private Body body;
	private Dino dino;
	private float rectanglePositionX; 
	private float rectanglePositionY; 
	public Collidable() {
		world = new World(new Vector2(0, -10), true);
		debugRenderer = new Box2DDebugRenderer();
		bodyDef = new BodyDef();
        polygonShape = new PolygonShape();
        fixture = new FixtureDef();
        tiled = new Tiled();
        dino = new Roar();
	}
	
	public void collidableTiled(int indexLayer) {
		for(MapObject object : tiled.getMap().getLayers().get(indexLayer).getObjects().getByType(RectangleMapObject.class)) {//chão
        	Rectangle rectangle = ((RectangleMapObject) object).getRectangle();
        	
        	bodyDef.type = BodyType.StaticBody;
        	bodyDef.position.set(rectangle.getX() + rectangle.getWidth() / 2, rectangle.getY() + rectangle.getHeight()/2);
        	
        	body = world.createBody(bodyDef);
        	polygonShape.setAsBox(rectangle.getWidth() / 2, rectangle.getHeight() / 2);
        	fixture.shape = polygonShape;
        	body.createFixture(fixture);
        	rectanglePositionX = body.getPosition().x;
        	rectanglePositionY = body.getPosition().y;
        }
	}
	public void checkCollision() {
		float oldX = dino.getX();
		float oldY = dino.getY();
		if(dino.getY() == rectanglePositionY) {
			dino.setY(32);
			dino.velocity.y = 0;
		}
		if(dino.getX() == rectanglePositionX) {
			dino.setX(11);
			dino.velocity.x = 0;
		}
	}
	public void renderDebugLines(OrthographicCamera camera) {
		debugRenderer.render(world, camera.combined);
	}
	public void worldStep() {
		world.step(1/20f, 2, 1);
	}
	public void collidableGround() {
		//chão
		collidableTiled(1);
	}
	public void collidableBrick() {
		//tijolos
        collidableTiled(2);
	}
	public void collidableWall() {
		 //parede
		collidableTiled(3);
	}
	public void collidableSpike() {
		 //espinhos
		collidableTiled(4);
	}
	public void collidableDoor() {
		 //porta
		collidableTiled(5);
	}
}
