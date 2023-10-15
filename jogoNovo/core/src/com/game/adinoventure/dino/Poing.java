package com.game.adinoventure.dino;

import com.badlogic.gdx.graphics.Texture;

public class Poing extends Dino{

	public Poing() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeDino() {
		nome = "poing";
		texture = new Texture("poing.png");
		
	}
}
