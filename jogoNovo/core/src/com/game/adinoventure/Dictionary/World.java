package com.game.adinoventure.Dictionary;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.game.adinoventure.Blocks.Block;
//ECS - entity component system
public class World {
	private int[][] map = new int[80][45]; // 1280/16 e 720/16
	com.artemis.World world;
	public World() {

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
	

	public void render(Batch batch) {
		renderBackground(batch);
	}

	private void renderBackground(Batch batch) {
		Texture texture = null;
		for (int x = 0; x < getWidth(); x++) {
			for (int y = 0; y < getHeigth(); y++) {
				texture = getBlock(x, y).texture;

				if (texture != null) {
					batch.draw(texture, x * Block.TILE_SIZE, y * Block.TILE_SIZE);
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

}
