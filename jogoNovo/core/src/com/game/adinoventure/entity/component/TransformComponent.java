package com.game.adinoventure.entity.component;

import com.artemis.Component;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

public class TransformComponent extends Component{
	public final Vector2 position = new Vector2();
	private final Vector2 velocity = new Vector2();
	public final Vector2 origin = new Vector2();
	//veririfcar se está no centro
	public final boolean originCenter = false; 
	public float rotation = 0;
	public float scaleX = 1;
	public float scaleY = 1;

	public float getPositionX() {
		return position.x;
	}
	public Vector2 getPosition() {
		return position;
	}
	public Vector2 getVelocity() {
		return velocity;
	}
	public float getPositionY() {
		return position.y;
	}
	public float getVelocityX() {
		return velocity.x;
	}
	public float getVelocityY() {
		return velocity.y;
	}
	public void setPositionX(float positionX){
		this.position.x = positionX;
	}
	public void setPositionY(float positionY){
		this.position.y = positionY;
	}
	public void setVelocityX(float velocityX){
		this.velocity.x = velocityX;
	}
	public void setVelocityY(float velocityY){
		this.velocity.y = velocityY;
	}

	public Vector2 getOrigin() {
		return origin;
	}

	public boolean isOriginCenter() {
		return originCenter;
	}

	public float getRotation() {
		return rotation;
	}

	public float getScaleX() {
		return scaleX;
	}

	public float getScaleY() {
		return scaleY;
	}

	public void setRotation(float rotation) {
		this.rotation = rotation;
	}

	public void setScaleX(float scaleX) {
		this.scaleX = scaleX;
	}

	public void setScaleY(float scaleY) {
		this.scaleY = scaleY;
	}
}
