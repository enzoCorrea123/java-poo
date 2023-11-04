package com.game.dinos;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.badlogic.gdx.math.Vector2;

public abstract class Dino extends Sprite implements InputProcessor {
	public Vector2 velocity = new Vector2();
	protected float speed = 60 * 2;
	protected float gravity = 60 * 1.8f;
	protected Texture texture;
	private TiledMapTileLayer collisionLayer;
	
	public Dino() {

	}

	public Dino(Sprite sprite) {
		super(sprite);
        
	}
	
	public abstract String changeDino();

	@Override
	public void draw(Batch batch) {
		super.draw(batch);
		update(Gdx.graphics.getDeltaTime());
	}

	private void update(float delta) {
		// aplicando gravidade
		velocity.y -= gravity * delta;
		if (velocity.y > speed) {
			velocity.y = speed;

		} else if (velocity.y < speed) {
			velocity.y = -speed;
		}
		
		setX(getX() + velocity.x * delta);
		setY(getY() + velocity.y * delta);

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
/*float oldX = getX();
float oldY = getY();
float tileWidth = collisionLayer.getTileWidth();
float tileHeight = collisionLayer.getTileHeight();
boolean collisionX = false;
boolean collisionY = false;
//movimentar no eixo x
setX(getX() + velocity.x * delta);
if(velocity.x<0) {//se movimentando para a esquerda no x
	//cima
	collisionX = collisionLayer.getCell((int) (getX() / tileWidth),(int) ((getY() + getHeight()) / tileHeight)).getTile().getProperties().containsKey("blocked");
	//meio
	if(!collisionX) {
		collisionX = collisionLayer.getCell((int) (getX() / tileWidth),(int) ((getY() + getHeight() / 2) / tileHeight)).getTile().getProperties().containsKey("blocked");
	}
	//chao
	if(!collisionX) {
		collisionX = collisionLayer.getCell((int) (getX() / tileWidth),(int) (getY() / tileHeight)).getTile().getProperties().containsKey("blocked");
		
	}
	
}else if(velocity.x>0) {//se movimentando para a direita no x
	
	//cima
	collisionX = collisionLayer.getCell((int) ((getX() + getWidth()) / tileWidth),(int) ((getY() + getHeight()) / tileHeight)).getTile().getProperties().containsKey("blocked");
	//meio
	if(!collisionX) {
		collisionX = collisionLayer.getCell((int) ((getX() + getWidth()) / tileWidth),(int) ((getY() + getHeight() / 2) / tileHeight)).getTile().getProperties().containsKey("blocked");
	}
	//chao
	if(!collisionX) {
		collisionX = collisionLayer.getCell((int) ((getX() + getWidth()) / tileWidth),(int) (getY() / tileHeight)).getTile().getProperties().containsKey("blocked");
		
	}
}
//reagindo na colisao do x
if(collisionX) {
	setX(oldX);
	velocity.x = 0;
		
}
//movimentar no eixo y
setY(getY() + velocity.y * delta);
if(velocity.y<0) {//se movimentando para a esquerda no y
	
	//baixo esquerda
	collisionY = collisionLayer.getCell((int) (getX() / tileWidth),(int) (getY() / tileHeight)).getTile().getProperties().containsKey("blocked");
	//baixo meio
	if(!collisionY) {
		collisionY = collisionLayer.getCell((int) ((getX() + getWidth()/2) / tileWidth),(int) (getY() / tileHeight)).getTile().getProperties().containsKey("blocked");
	}
	//b
	if(!collisionY) {
		collisionY = collisionLayer.getCell((int) ((getX() + getWidth()) / tileWidth),(int) (getY() / tileHeight)).getTile().getProperties().containsKey("blocked");
	}
	
}else if(velocity.y>0) {//se movimentando para a direita no y
	//cima
	collisionY = collisionLayer.getCell((int) (getX() / tileWidth),(int) ((getY() + getHeight()) / tileHeight)).getTile().getProperties().containsKey("blocked");
	//meio
	if(!collisionY) {
		collisionY = collisionLayer.getCell((int) ((getX() + getWidth()/2) / tileWidth),(int) ((getY() + getHeight()) / tileHeight)).getTile().getProperties().containsKey("blocked");
	}
	//chao
	if(!collisionY) {
		collisionY = collisionLayer.getCell((int) ((getX() + getWidth()) / tileWidth),(int) ((getY() + getHeight()) / tileHeight)).getTile().getProperties().containsKey("blocked");
	}
}
//reagindo na colisao do x
		if(collisionY) {
			setY(oldY);
			velocity.y = 0;
				
		}
*/