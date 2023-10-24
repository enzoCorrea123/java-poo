package com.game.adinoventure.entity.component;

import com.artemis.Component;
import com.badlogic.gdx.math.Rectangle;

public class CollidableComponent extends Component{
	private boolean onGround;
	private boolean onCeiling;//teto
	private boolean onLeftWall;
	private boolean onRightWall;
	private final com.badlogic.gdx.math.Rectangle collisionBox = new com.badlogic.gdx.math.Rectangle();
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
