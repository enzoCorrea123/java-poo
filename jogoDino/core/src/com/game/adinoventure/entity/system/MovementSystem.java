package com.game.adinoventure.entity.system;

import com.artemis.Aspect;
import com.artemis.ComponentMapper;
import com.artemis.systems.IteratingSystem;
import com.game.adinoventure.Blocks.Block;
import com.game.adinoventure.Dictionary.World;
import com.game.adinoventure.entity.component.CollidableComponent;
import com.game.adinoventure.entity.component.TransformComponent;

public class MovementSystem extends IteratingSystem{
	private ComponentMapper<TransformComponent> transformMapper;
	private ComponentMapper<CollidableComponent> collidableMapper;
	private World world;
	
	public MovementSystem(World world) {
		super(Aspect.all(TransformComponent.class));
		this.world = world;
	}
	
	@Override
	protected void process(int entityId) {
		TransformComponent transformComponent = transformMapper.get(entityId);
		CollidableComponent collidableComponent = collidableMapper.get(entityId);
		float velocityY = transformComponent.getVelocityY();
		//posição + velocidade * delta
		float delta = super.world.getDelta();
		
		transformComponent.getPosition().mulAdd(transformComponent.getVelocity(),delta);//fórmula do sorvete posição + velocidade * delta
		
		velocityY += world.getGravity() * delta;
		transformComponent.setVelocityY(velocityY);
		
		
		if(collidableMapper.has(entityId)) {
			collidableComponent.getCollisionBox().setCenter(transformComponent.getPosition());
			if(transformComponent.getPositionY() < world.getGround() * Block.TILE_SIZE) {
				transformComponent.setVelocityY(0);
				transformComponent.setPositionY(world.getGround() * Block.TILE_SIZE );
				
				collidableComponent.setOnGround(true);
			}else {
				collidableComponent.setOnGround(false);
			}
		}
	}

}
