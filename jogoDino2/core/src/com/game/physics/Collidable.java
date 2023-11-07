package com.game.physics;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.objects.RectangleMapObject;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.BodyDef.BodyType;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;
import com.game.dinos.Dino;
import com.game.dinos.Roar;
import com.game.screens.PlayScreen;
import com.game.utils.Tiled;

public class Collidable {
	private World world;
	private Tiled tiled;
	PlayScreen screen;
	private Box2DDebugRenderer debugRenderer;
	private BodyDef bodyDef;
	private PolygonShape polygonShape;
	private FixtureDef fixture;
	private Body body;
	private Dino dino;
	private float rectanglePositionX; 
	private float rectanglePositionY; 
	public Collidable(PlayScreen screen) {
		this.screen = screen;
		this.world = screen.getWorld();
		debugRenderer = new Box2DDebugRenderer();
		bodyDef = new BodyDef();
        polygonShape = new PolygonShape();
        fixture = new FixtureDef();
        this.tiled = screen.getTiled();
        dino = new Roar();
	}
	
	public void collidableTiled(int indexLayer) {
		for(MapObject object : tiled.getMap().getLayers().get(indexLayer).getObjects().getByType(RectangleMapObject.class)) {
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
			dino.setY(rectanglePositionY);
			dino.velocity.y = 0;
		}
		if(dino.getX() == rectanglePositionX) {
			dino.setX(rectanglePositionX);
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
