package com.game.adinoventure.entity.system;

import com.artemis.Aspect;
import com.artemis.Aspect.Builder;
import com.artemis.ComponentMapper;
import com.artemis.systems.IteratingSystem;
import com.game.adinoventure.Blocks.Block;
import com.game.adinoventure.Dictionary.World;
import com.game.adinoventure.entity.component.CollidableComponent;
import com.game.adinoventure.entity.component.RigidBodyComponent;
import com.game.adinoventure.entity.component.TransformComponent;

public class MovementSystem extends IteratingSystem{
	private ComponentMapper<TransformComponent> transformMapper;
	private ComponentMapper<RigidBodyComponent> RigidBodyMapper;
	private ComponentMapper<CollidableComponent> collidableMapper;
	private World world;
	
	public MovementSystem(World world) {
		super(Aspect.all(TransformComponent.class, RigidBodyComponent.class));
		this.world = world;
	}
	
	@Override
	protected void process(int entityId) {
		TransformComponent transformComponent = transformMapper.get(entityId);
		RigidBodyComponent rigidBodyComponent = RigidBodyMapper.get(entityId);
		CollidableComponent collidableComponent = collidableMapper.get(entityId);
		
		//posição + velocidade * delta
		float delta = super.world.getDelta();
		
		transformComponent.position.mulAdd(rigidBodyComponent.velocity,delta);//fórmula do sorvete posição + velocidade * delta
		
		rigidBodyComponent.velocity.y += world.getGravity() * delta;
		
		if(collidableComponent != null) {
			if(transformComponent.position.y < world.getGround() * Block.TILE_SIZE) {
				rigidBodyComponent.velocity.y = 0;
				transformComponent.position.y = world.getGround() * Block.TILE_SIZE - 7;
				
				collidableComponent.onGround = true;
			}else {
				collidableComponent.onGround = false;
			}
		}
	}

}
