package com.game.adinoventure.entity.component;

import com.artemis.Component;

public class PlayerComponent extends Component{
	public boolean canWalk = true;
	public boolean canJump = true;
	public float walkSpeed = 300;
	public float jumpSpeed = 200;

	public boolean isCanWalk() {
		return canWalk;
	}

	public boolean isCanJump() {
		return canJump;
	}

	public float getWalkSpeed() {
		return walkSpeed;
	}

	public float getJumpSpeed() {
		return jumpSpeed;
	}

	public void setCanWalk(boolean canWalk) {
		this.canWalk = canWalk;
	}

	public void setCanJump(boolean canJump) {
		this.canJump = canJump;
	}

	public void setWalkSpeed(float walkSpeed) {
		this.walkSpeed = walkSpeed;
	}

	public void setJumpSpeed(float jumpSpeed) {
		this.jumpSpeed = jumpSpeed;
	}
}
