package com.game.adinoventure.Dictionary;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.IntMap;
import com.game.adinoventure.Blocks.Block;
import com.game.adinoventure.resource.Assets;

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
		TERRA = register(1, new Block(Assets.manager.get(Assets.terra)));
		PEDRA = register(2, new Block(Assets.manager.get(Assets.pedra)));
		TIJOLO = register(3, new Block(Assets.manager.get(Assets.tijolo)));
		PAREDE = register(4, new Block(Assets.manager.get(Assets.parede)));
		FUNDO = register(5, new Block(Assets.manager.get(Assets.fundo)));
		
		
	}
	
}
