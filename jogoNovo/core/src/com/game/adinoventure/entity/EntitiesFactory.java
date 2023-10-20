package com.game.adinoventure.entity;

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
	public static Entity createPlayer(World world, float x, float y) {
		Entity entity = world.createEntity();
		EntityEdit entityEdit = entity.edit();
		
		TransformComponent transformComponent = new TransformComponent();
		transformComponent.position.set(x,y);
		
		entityEdit.add(transformComponent);
		SpriteComponent spriteComponent = new SpriteComponent();
		spriteComponent.sprite = new Sprite(new Texture("./roar.png"));
		entityEdit.add(spriteComponent);
		
		PlayerComponent playerComponent = new PlayerComponent();
		entityEdit.add(playerComponent);
		
		RigidBodyComponent rigidBodyComponent = new RigidBodyComponent();
		entityEdit.add(rigidBodyComponent);
		
		return entity;
		
	}
}
