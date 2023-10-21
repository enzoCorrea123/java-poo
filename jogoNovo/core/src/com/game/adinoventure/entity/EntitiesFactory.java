package com.game.adinoventure.entity;

import com.artemis.ComponentMapper;
import com.artemis.Entity;
import com.artemis.EntityEdit;
import com.artemis.World;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.game.adinoventure.entity.component.CollidableComponent;
import com.game.adinoventure.entity.component.PlayerComponent;
import com.game.adinoventure.entity.component.RigidBodyComponent;
import com.game.adinoventure.entity.component.SpriteComponent;
import com.game.adinoventure.entity.component.TransformComponent;
import com.game.adinoventure.resource.Assets;

public class EntitiesFactory {

	private ComponentMapper<TransformComponent> transformMapper;
	private ComponentMapper<RigidBodyComponent> rigidBodyMapper;
	private ComponentMapper<PlayerComponent> playerMapper;
	private ComponentMapper<SpriteComponent> spriteMapper;
	private ComponentMapper<CollidableComponent> collidableMapper;
	
	public int createPlayer(World world, float x, float y) {
		int entity = world.create();
		
		TransformComponent transformComponent = transformMapper.create(entity);
		transformComponent.position.set(x,y);

		SpriteComponent spriteComponent = spriteMapper.create(entity);
		spriteComponent.sprite = new Sprite(Assets.manager.get(Assets.roar));
		
		PlayerComponent playerComponent = playerMapper.create(entity);
		
		RigidBodyComponent rigidBodyComponent = rigidBodyMapper.create(entity);
		
		CollidableComponent collidableComponent = collidableMapper.create(entity);
		
		return entity;
		
	}
}
