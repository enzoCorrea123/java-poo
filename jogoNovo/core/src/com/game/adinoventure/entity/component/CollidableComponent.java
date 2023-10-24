package com.game.adinoventure.entity.component;

import com.artemis.Component;

public class CollidableComponent extends Component{
	private boolean onGround;

	public boolean isOnGround() {
		return onGround;
	}

	public void setOnGround(boolean onGround) {
		this.onGround = onGround;
	}
}
