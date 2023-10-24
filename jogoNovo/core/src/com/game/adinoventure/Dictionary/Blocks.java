package com.game.adinoventure.Dictionary;

import com.badlogic.gdx.utils.IntMap;
import com.game.adinoventure.Blocks.Block;

public class Blocks {
    public static final IntMap<Block> REGISTER = new IntMap<Block>();
    public static final int AIR_ID = 0;

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

}
