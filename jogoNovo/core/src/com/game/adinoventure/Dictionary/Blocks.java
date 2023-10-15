package com.game.adinoventure.Dictionary;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.IntMap;
import com.game.adinoventure.Blocks.Block;

public class Blocks {
	
	public static final IntMap<Block> REGISTER = new IntMap<Block>();
	public static final int AIR_ID = 0;
	public static final Block TERRA;
	public static final Block AIR;
	public static final Block PEDRA;
	public static final Block TIJOLO;
	public static final Block PAREDE;
	public static final Block FUNDO;
	
	public static Block getBlockbyId(int id) {
		return REGISTER.get(id);
	}
	public static int getIdByBlock(Block block) {
		return REGISTER.findKey(block,true, AIR_ID);
	}
	public static Block register(int id, Block block) {
		REGISTER.put(id,block);
		return block;
	}
	
	static{
		AIR = register(AIR_ID, new Block(null));
		TERRA = register(1, new Block(new Texture("terra.png")));
		PEDRA = register(2, new Block(new Texture("pedra.png")));
		TIJOLO = register(3, new Block(new Texture("tijolo.png")));
		PAREDE = register(4, new Block(new Texture("parede (1).png")));
		FUNDO = register(5, new Block(new Texture("fundo.png")));
		
		
	}
	
}
