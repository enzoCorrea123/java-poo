package com.game.adinoventure.dino;

import com.badlogic.gdx.graphics.Texture;

public class Tum extends Dino{

	@Override
	public void changeDino() {
		nome = "Tum";
		texture = new Texture("tum.png");
		
	}

	public Tum() {
		super();
		// TODO Auto-generated constructor stub
	}
}
