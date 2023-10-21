package com.game.adinoventure.entity.system;

import com.artemis.Aspect;
import com.artemis.ComponentMapper;
import com.artemis.Aspect.Builder;
import com.artemis.systems.IteratingSystem;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.InputMultiplexer;
import com.game.adinoventure.entity.component.CollidableComponent;
import com.game.adinoventure.entity.component.PlayerComponent;
import com.game.adinoventure.entity.component.RigidBodyComponent;
import com.game.adinoventure.entity.component.TransformComponent;

public class PlayerControllerSystem extends IteratingSystem{

	private ComponentMapper<PlayerComponent> playerMappper;
	private ComponentMapper<RigidBodyComponent> rigidBodyMapper;
	private ComponentMapper<CollidableComponent> collidableMapper;
	
	private boolean moveRight;
	private boolean moveLeft;
	private boolean jump;
	private boolean down;
	private boolean special;
	public PlayerControllerSystem() {
		super(Aspect.all(PlayerComponent.class, RigidBodyComponent.class, CollidableComponent.class));

		Gdx.input.setInputProcessor(new InputMultiplexer(new GameInputAdapter()));//manipular entradas do personagem. Multiplexer é multiplas entradas
	}

	@Override
	protected void process(int entityId) {
		RigidBodyComponent rigidBodyComponent = rigidBodyMapper.get(entityId);
		CollidableComponent collidableComponent = collidableMapper.get(entityId);
		PlayerComponent playerComponent = playerMappper.get(entityId);
		
		if(playerComponent.canJump && collidableComponent.onGround && jump) {
			rigidBodyComponent.velocity.y = playerComponent.jumpSpeed;
			System.out.println("aaaaaaa");
		}
		
		if(playerComponent.canWalk) {
			if(moveLeft == moveRight) {
				rigidBodyComponent.velocity.x = 0;
			}
			if(moveLeft) {
				rigidBodyComponent.velocity.x = -playerComponent.walkSpeed;
				
			}else if(moveRight) {
				rigidBodyComponent.velocity.x = playerComponent.walkSpeed;
				System.out.println("pra frente");
			}
		}
	}
	
	private class GameInputAdapter extends InputAdapter{
		@Override
		public boolean keyDown(int keycode) {
			switch(keycode) {
			case Input.Keys.W:
			case Input.Keys.UP:
				jump = true;
				break;
				
			case Input.Keys.D:
			case Input.Keys.RIGHT:
				moveRight = true;
				break;
				
			case Input.Keys.A:
			case Input.Keys.LEFT:
				moveLeft = true;
				break;
				
			case Input.Keys.S:
			case Input.Keys.DOWN:
				down = true;
				break;
				
			case Input.Keys.SPACE:
				special = true;
				break;
			
			}
			return true;
		}
		
		@Override
		public boolean keyUp(int keycode) {
			switch(keycode) {
			case Input.Keys.W:
			case Input.Keys.UP:
				jump = false;
				break;
				
			case Input.Keys.D:
			case Input.Keys.RIGHT:
				moveRight = false;
				break;
				
			case Input.Keys.A:
			case Input.Keys.LEFT:
				moveLeft = false;
				break;
				
			case Input.Keys.S:
			case Input.Keys.DOWN:
				down = false;
				break;
				
			case Input.Keys.SPACE:
				special = false;
				break;
			
			}
			return true;
		}
	}

}
