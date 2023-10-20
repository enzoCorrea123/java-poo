package com.game.adinoventure.entity.system;

import com.artemis.Aspect;
import com.artemis.Aspect.Builder;
import com.artemis.ComponentMapper;
import com.artemis.systems.IteratingSystem;
import com.game.adinoventure.Blocks.Block;
import com.game.adinoventure.Dictionary.World;
import com.game.adinoventure.entity.component.RigidBodyComponent;
import com.game.adinoventure.entity.component.TransformComponent;

public class MovementSystem extends IteratingSystem{
	private ComponentMapper<TransformComponent> transformMapper;
	private ComponentMapper<RigidBodyComponent> RigidBodyMapper;
	private World world;
	
	public MovementSystem(World world) {
		super(Aspect.all(TransformComponent.class, RigidBodyComponent.class));
		this.world = world;
	}
	
	@Override
	protected void process(int entityId) {
		TransformComponent transformComponent = transformMapper.get(entityId);
		RigidBodyComponent rigidBodyComponent = RigidBodyMapper.get(entityId);
		
		//método de euler para calcular a posição
		//posição + velocidade * delta
		float delta = super.world.getDelta();
		float newton = transformComponent.position.y + rigidBodyComponent.velocity.y * delta + 0.5f * world.getGravity()  * delta * delta;
		
		transformComponent.position.y = newton;
		rigidBodyComponent.velocity.add(0,world.getGravity() * delta);
		
		if(transformComponent.position.y < world.getGround() * Block.TILE_SIZE) {
			rigidBodyComponent.velocity.y = 0;
			transformComponent.position.y = world.getGround() * Block.TILE_SIZE - 7;
		}
	}

}
