package com.game.adinoventure.Dictionary;

import com.artemis.WorldConfiguration;
import com.artemis.WorldConfigurationBuilder;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.game.adinoventure.Blocks.Block;
import com.game.adinoventure.entity.EntitiesFactory;
import com.game.adinoventure.entity.system.SpriteRenderSystem;
import com.game.adinoventure.entity.system.TileRenderSystem;
//ECS - entity component system
public class World {
	private int[][] map = new int[80][45]; // 1280/16 e 720/16
	//criou o mundo usando biblioteca artemis
	com.artemis.World world;
	public World(OrthographicCamera camera) {
		//definido sistemas
		WorldConfigurationBuilder worldConfigBuilder = new WorldConfigurationBuilder()
				.with(new TileRenderSystem(this, camera))
				.with(new SpriteRenderSystem(camera));
		WorldConfiguration config = worldConfigBuilder.build();
		//definiu valor para o mundo
		world = new com.artemis.World(config);
		//criou uma entitdade para o mundo
		EntitiesFactory.createPlayer(world, 0, 0);
	}

	public void regenerate() {
		for (int x = 0; x < getWidth(); x++) {
			for (int y = 0; y < getHeigth(); y++) {
				if (y < 2) {
					map[x][y] = Blocks.getIdByBlock(Blocks.TERRA);

				} else {
					map[x][y] = Blocks.getIdByBlock(Blocks.FUNDO);
				}
			}
		}
	}
	
	public Block getBlock(int x, int y) {
		return Blocks.getBlockbyId(map[x][y]);

	}

	public int getWidth() {
		return map.length;
	}

	public int getHeigth() {
		return map[0].length;
	}

	public void update(float deltaTime) {
		world.setDelta(deltaTime);
		world.process();
		
	}

}
