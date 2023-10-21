package com.game.adinoventure.Dictionary;

import com.artemis.Entity;
import com.artemis.WorldConfiguration;
import com.artemis.WorldConfigurationBuilder;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.game.adinoventure.Adinoventure;
import com.game.adinoventure.Blocks.Block;
import com.game.adinoventure.entity.EntitiesFactory;
import com.game.adinoventure.entity.system.MovementSystem;
import com.game.adinoventure.entity.system.SpriteRenderSystem;
import com.game.adinoventure.entity.system.TileRenderSystem;

import net.namekdev.entity_tracker.EntityTracker;
import net.namekdev.entity_tracker.ui.EntityTrackerMainWindow;
//ECS - entity component system
public class World {
	private int[][] map = new int[80][45]; // 1280/16 e 720/16
	//criou o mundo usando biblioteca artemis
	private com.artemis.World world;
	private EntityTrackerMainWindow entityTrackerMainWindow;
	private float gravity = -576;//gravidade está puxando o personagem para baixo
	private int ground = 2;
	private int player;

	private EntitiesFactory entitiesFactory;

	public World(OrthographicCamera camera) {
		//definido sistemas
		WorldConfigurationBuilder worldConfigBuilder = new WorldConfigurationBuilder()
				.with(new MovementSystem(this))
				.with(new TileRenderSystem(this, camera))
				.with(new SpriteRenderSystem(camera));
		
		if(Adinoventure.DEBUG) {//inspecionador de entitades
			entityTrackerMainWindow = new EntityTrackerMainWindow(false,false);
			worldConfigBuilder.with(new EntityTracker(entityTrackerMainWindow));
		}
		WorldConfiguration config = worldConfigBuilder.build();
		//definiu valor para o mundo
		world = new com.artemis.World(config);
		entitiesFactory = new EntitiesFactory();
		world.inject(entitiesFactory);
		//criou uma entitdade para o mundo
		player = entitiesFactory.createPlayer(world, 0, getHeigth() * Block.TILE_SIZE);
	}

	public EntityTrackerMainWindow getEntityTrackerMainWindow() {
		return entityTrackerMainWindow;
	}

	public void regenerate() {
		for (int x = 0; x < getWidth(); x++) {
			for (int y = 0; y < getHeigth(); y++) {
				if (y < getGround()) {
					map[x][y] = Blocks.getIdByBlock(Blocks.TERRA);

				} else {
					map[x][y] = Blocks.getIdByBlock(Blocks.FUNDO);
				}
			}
		}
	}
	public void update(float deltaTime) {
		world.setDelta(deltaTime);
		world.process();
		
	}
	public int getPlayer() {
		return player;
	}
	public int getGround() {
		return ground;
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
	
	public float getGravity() {
		return gravity;
	}

	public com.artemis.World getWorld() {
		return world;
	}

	public void setGravity(float gravity) {
		this.gravity = gravity;
	}
	public void dispose() {
		world.dispose();
	}


}
