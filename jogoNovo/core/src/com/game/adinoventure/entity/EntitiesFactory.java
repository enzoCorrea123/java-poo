package com.game.adinoventure.entity;

import com.artemis.ComponentMapper;
import com.artemis.World;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.game.adinoventure.entity.component.CollidableComponent;
import com.game.adinoventure.entity.component.PlayerComponent;
import com.game.adinoventure.entity.component.SpriteComponent;
import com.game.adinoventure.entity.component.TransformComponent;
import com.game.adinoventure.resource.Assets;

public class EntitiesFactory {

	private ComponentMapper<TransformComponent> transformMapper;
	private ComponentMapper<PlayerComponent> playerMapper;
	private ComponentMapper<SpriteComponent> spriteMapper;
	private ComponentMapper<CollidableComponent> collidableMapper;
	
	public int createPlayer(World world, float x, float y) {
		int entity = world.create();
		
		TransformComponent transformComponent = transformMapper.create(entity);
		transformComponent.position.set(x,y);

		Texture roar = Assets.manager.get(Assets.roar);
		SpriteComponent spriteComponent = spriteMapper.create(entity);
		spriteComponent.sprite = new Sprite(roar);
		
		PlayerComponent playerComponent = playerMapper.create(entity);
		
		CollidableComponent collidableComponent = collidableMapper.create(entity);
		collidableComponent.getCollisionBox().setSize(roar.getWidth(), roar.getHeight());
		collidableComponent.getCollisionBox().setCenter(new Vector2(x, y));
		
		return entity;
		
	}
}
