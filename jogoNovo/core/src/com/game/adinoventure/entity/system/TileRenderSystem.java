package com.game.adinoventure.entity.system;

import com.artemis.BaseSystem;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.game.adinoventure.Blocks.Block;
import com.game.adinoventure.Dictionary.World;

public class TileRenderSystem extends BaseSystem{
	private World world;
	private OrthographicCamera camera;
	private SpriteBatch batch;
	public TileRenderSystem(World world, OrthographicCamera camera) {
		this.world = world;
		this.camera = camera;
		this.batch = new SpriteBatch();
	}
	@Override
	protected void begin() {
		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		
	}
	@Override
	protected void processSystem() {
		renderBackground(batch);
		
	}

	private void renderBackground(Batch batch) {
		Texture texture = null;
		for (int x = 0; x < world.getWidth(); x++) {
			for (int y = 0; y < world.getHeigth(); y++) {
				texture = world.getBlock(x, y).texture;

				if (texture != null) {
					batch.draw(texture, x * Block.TILE_SIZE, y * Block.TILE_SIZE);
				}
			}
		}
		
	}
	@Override
	protected void end() {
		batch.end();
	}

}
