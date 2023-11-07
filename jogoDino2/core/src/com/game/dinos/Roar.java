package com.game.dinos;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.game.screens.PlayScreen;

public class Roar extends Dino{
	
	@Override
	public Texture changeDino() {
		return new Texture("roar.png");
		
	}

	public Roar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Roar(Sprite sprite, PlayScreen screen) {
		super(sprite, screen);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean keyDown(int keycode) {
		switch(keycode) {
		case Keys.W:
			
			break;
		case Keys.A:
			velocityX = 2.0f;
			break;
		case Keys.S:
			break;
		case Keys.D:
			velocityX = -2.0f;
			break;
		case Keys.SPACE:
			break;
		
		}
		getBody().setLinearVelocity(velocityX, velocityY);
		return true;
	}

	@Override
	public boolean keyUp(int keycode) {
		switch(keycode) {
		case Keys.A:
		case Keys.D:
			velocityX = 0;
			break;
		}
		getBody().setLinearVelocity(velocityX, velocityY);
		return true;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchCancelled(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(float amountX, float amountY) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
