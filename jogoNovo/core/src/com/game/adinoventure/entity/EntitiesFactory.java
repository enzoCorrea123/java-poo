package com.game.adinoventure.entity;

import com.artemis.ComponentMapper;
import com.artemis.Entity;
import com.artemis.EntityEdit;
import com.artemis.World;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.game.adinoventure.entity.component.PlayerComponent;
import com.game.adinoventure.entity.component.RigidBodyComponent;
import com.game.adinoventure.entity.component.SpriteComponent;
import com.game.adinoventure.entity.component.TransformComponent;

public class EntitiesFactory {

	private ComponentMapper<TransformComponent> transformMapper;
	private ComponentMapper<RigidBodyComponent> rigidBodyMapper;
	private ComponentMapper<PlayerComponent> playerMapper;
	private ComponentMapper<SpriteComponent> spriteMapper;
	public int createPlayer(World world, float x, float y) {
		int entity = world.create();
		
		TransformComponent transformComponent = transformMapper.create(entity);
		transformComponent.position.set(x,y);

		SpriteComponent spriteComponent = spriteMapper.create(entity);
		spriteComponent.sprite = new Sprite(new Texture("./roar.png"));
		
		PlayerComponent playerComponent = playerMapper.create(entity);
		
		RigidBodyComponent rigidBodyComponent = rigidBodyMapper.create(entity);
		
		return entity;
		
	}
}
