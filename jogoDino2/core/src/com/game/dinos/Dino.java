package com.game.dinos;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.badlogic.gdx.math.Vector2;

public abstract class Dino extends Sprite {
	protected Vector2 velocity = new Vector2();
	protected float speed = 60 * 2;
	protected float gravity = 60 * 1.8f;
	protected Texture texture;
	private TiledMapTileLayer collisionLayer;

	public Dino() {

	}

	public Dino(Sprite sprite, TiledMapTileLayer collisionLayer) {
		super(sprite);
		this.collisionLayer = collisionLayer;
	}

	public abstract String changeDino();
	

	@Override
	public void draw(Batch batch) {
		update(Gdx.graphics.getDeltaTime());
		super.draw(batch);
	}

	private void update(float delta) {
		// aplicando gravidade
		velocity.y -= gravity * delta;
		if (velocity.y > speed) {
			velocity.y = speed;

		} else if (velocity.y < speed) {
			velocity.y = -speed;
		}
		
		float oldX = getX();
		float oldY = getY();
		float tileWidth = collisionLayer.getTileWidth();
		float tileHeight = collisionLayer.getTileHeight();
		boolean collisionX = false;
		boolean collisionY = false;
		//movimentar no eixo x
		setX(getX() + velocity.x * delta);
		if(velocity.x<0) {//se movimentando para a esquerda
			//cima
			collisionX = collisionLayer.getCell((int) getX() / tileWidth,(int) getY() / tileWidth);
			//meio
			
			//chao
			
		}else if(velocity.x>0) {//se movimentando para a direita
			
		}
		//movimentar no eixo y
		setY(getY() + velocity.y * delta);
		if(velocity.y<0) {//se movimentando para a esquerda
			
		}else if(velocity.y>0) {//se movimentando para a direita
			
		}
		

	}
	public Texture getTexture() {
		return texture;
	}

	public void setTexture(Texture texture) {
		this.texture = texture;
	}
}
