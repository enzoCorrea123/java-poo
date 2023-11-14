package com.game.dinos;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.physics.box2d.Body;
import com.game.screens.PlayScreen;

public class Roar extends Dino{
	private float speed = 5.0f; // Velocidade de movimento
    private boolean crouching = false; // Estado de agachamento

    public Roar(Body body, Texture texture) {
        super(body, texture);
    }

    @Override
    public void update(float delta) {
        // Atualiza a posição e verifica a lógica do estado (por exemplo, agachamento)
        body.setLinearVelocity(getMovementVelocity());	
        checkCrouching();
    }

    @Override
    public void render(SpriteBatch batch) {
    	batch.draw(texture, body.getPosition().x, body.getPosition().y);
    }

    @Override
    public void handleInput() {
        // Lógica de entrada para movimento e agachamento
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            moveLeft();
        } else if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            moveRight();
        }

        if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
            crouching = true;
        } else {
            crouching = false;
        }
    }

    private void moveLeft() {
        body.applyLinearImpulse(-speed, 0, body.getWorldCenter().x, body.getWorldCenter().y, true);
    }

    private void moveRight() {
        body.applyLinearImpulse(speed, 0, body.getWorldCenter().x, body.getWorldCenter().y, true);
    }

    private void checkCrouching() {
        // Lógica para alterar o estado/tamanho do corpo quando agachado
        if (crouching) {
            // Reduzir o tamanho do corpo ou alterar a hitbox
        } else {
            // Restaurar o tamanho original do corpo ou hitbox
        }
    }

    private com.badlogic.gdx.math.Vector2 getMovementVelocity() {
        float xVelocity = 0;
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            xVelocity = -speed;
        } else if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            xVelocity = speed;
        }
        return new com.badlogic.gdx.math.Vector2(xVelocity, body.getLinearVelocity().y);
    }
	

}
