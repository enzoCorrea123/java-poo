package com.game.dinos;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.physics.box2d.Body;
import com.game.screens.PlayScreen;

public class Poing extends Dino{

	public Poing(Body body, Texture texture) {
        super(body, texture);
    }

    @Override
    public void update(float delta) {
        // L�gica de atualiza��o espec�fica do Poing
    }

    @Override
    public void render(SpriteBatch batch) {
    	batch.draw(texture, body.getPosition().x, body.getPosition().y);
    }

    @Override
    public void handleInput() {
        // L�gica de entrada para pulo duplo e chutar
    }

}
