package com.game.adinoventure.entity.system;

import com.artemis.Aspect;
import com.artemis.Aspect.Builder;
import com.artemis.ComponentMapper;
import com.artemis.systems.IteratingSystem;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.game.adinoventure.entity.component.PlayerComponent;
import com.game.adinoventure.entity.component.SpriteComponent;
import com.game.adinoventure.entity.component.TransformComponent;

public class SpriteRenderSystem extends IteratingSystem{
	
	private ComponentMapper<TransformComponent>transformMapper;
	private ComponentMapper<SpriteComponent>spriteMapper;
	OrthographicCamera camera;
	SpriteBatch batch;
	public SpriteRenderSystem(OrthographicCamera camera) {
		super(Aspect.all(TransformComponent.class,SpriteComponent.class));
		batch = new SpriteBatch();
		this.camera = camera;
	}
	
	

	@Override
	protected void process(int entityId) {
		TransformComponent transformComponent = transformMapper.get(entityId);
		SpriteComponent spriteComponent = spriteMapper.get(entityId);
		
		if(transformComponent.originCenter) {
			spriteComponent.sprite.setOriginCenter();
			
		}else {
			spriteComponent.sprite.setOrigin(transformComponent.origin.x,transformComponent.origin.y);
		}
		spriteComponent.sprite.setScale(transformComponent.scaleX, transformComponent.scaleY);
		spriteComponent.sprite.setRotation(transformComponent.rotation);
		spriteComponent.sprite.setPosition(transformComponent.position.x, transformComponent.position.y);
		spriteComponent.sprite.draw(batch);
	}
	
	
}
