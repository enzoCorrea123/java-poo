package com.game.adinoventure.entity.component;

import com.artemis.Component;
import com.badlogic.gdx.graphics.OrthographicCamera;
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
import com.game.adinoventure.Dictionary.Tiled;

public class CollidableComponent extends Component{
	private boolean onGround;
	private boolean onCeiling;//teto
	private boolean onLeftWall;
	private boolean onRightWall;

    private World world;
	private Box2DDebugRenderer debugRenderer;
	private BodyDef bodyDef;
	private PolygonShape polygonShape;
	private FixtureDef fixture;
	private Body body;
	private Tiled tiled;
	private final com.badlogic.gdx.math.Rectangle collisionBox = new com.badlogic.gdx.math.Rectangle();
	
	public CollidableComponent() {
		 world = new World(new Vector2(0, 0), true);
		debugRenderer = new Box2DDebugRenderer();
        bodyDef = new BodyDef();
        polygonShape = new PolygonShape();
        fixture = new FixtureDef();
        tiled = new Tiled();
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
        }
	}
	public void collidableGround() {
		//chão
		collidableTiled(1);
	}
	public void colldiableBrick() {
		//tijolos
        collidableTiled(2);
	}
	public void collidableWall() {
		 //parede
		collidableTiled(3);
	}
	public void collidableStone() {
		//pedras
		collidableTiled(4);
	}
	public void collidableSpike() {
		 //espinhos
		collidableTiled(5);
	}
	public void collidableDoor() {
		 //porta
		collidableTiled(6);
	}
	public void renderCollidable(OrthographicCamera camera) {
        debugRenderer.render(world,camera.combined);
	}
	public boolean isOnGround() {
		return onGround;
	}
	public void setOnGround(boolean onGround) {
		this.onGround = onGround;
	}

	public boolean isOnCeiling() {
		return onCeiling;
	}

	public boolean isOnLeftWall() {
		return onLeftWall;
	}

	public boolean isOnRightWall() {
		return onRightWall;
	}

	public Rectangle getCollisionBox() {
		return collisionBox;
	}

	public void setOnCeiling(boolean onCeiling) {
		this.onCeiling = onCeiling;
	}

	public void setOnLeftWall(boolean onLeftWall) {
		this.onLeftWall = onLeftWall;
	}

	public void setOnRightWall(boolean onRightWall) {
		this.onRightWall = onRightWall;
	}
}
