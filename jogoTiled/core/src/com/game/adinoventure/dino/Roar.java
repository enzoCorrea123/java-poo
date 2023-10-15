package com.game.adinoventure.dino;

import com.badlogic.gdx.graphics.Texture;

public class Roar extends Dino{
	Dino dino;

	@Override
	public void changeDino() {
		nome = "Roar";
		texture = new Texture("roar.png");
		
	}

	public Roar() {
		
		
	}
	
}
