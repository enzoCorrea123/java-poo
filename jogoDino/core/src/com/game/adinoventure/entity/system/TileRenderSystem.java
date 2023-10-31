package com.game.adinoventure.entity.system;

import com.artemis.BaseSystem;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.game.adinoventure.Dictionary.Tiled;
import com.game.adinoventure.Dictionary.World;
import com.game.adinoventure.entity.component.CollidableComponent;

public class TileRenderSystem extends BaseSystem{
	private World world;
	private OrthographicCamera camera;
	private SpriteBatch batch;
	private Tiled tiled;
	CollidableComponent collidableComponent;
	public TileRenderSystem(World world, OrthographicCamera camera) {
		this.world = world;
		this.camera = camera;
		this.batch = new SpriteBatch();
		tiled = new Tiled();
		collidableComponent = new CollidableComponent();
	}
	@Override
	protected void begin() {
		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		tiled.viewMap(camera);
		
	}
	@Override
	protected void processSystem() {
		renderBackground(batch);
//		collidableComponent.collidableGround();
//		collidableComponent.colldiableBrick();
//		collidableComponent.collidableStone();
//		collidableComponent.collidableSpike();
//		collidableComponent.collidableDoor();
//		collidableComponent.collidableWall();
		
	}

	private void renderBackground(Batch batch) {
		tiled.mapRender();
		//collidableComponent.renderCollidable(camera);
		
	}
	@Override
	protected void end() {
		batch.end();
	}
	@Override
	protected void dispose() {
		batch.dispose();
	}

}
