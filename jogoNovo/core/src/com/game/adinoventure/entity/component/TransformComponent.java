package com.game.adinoventure.entity.component;

import com.artemis.Component;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

public class TransformComponent extends Component{
	public final Vector2 position = new Vector2();
	public final Vector2 origin = new Vector2();
	//veririfcar se está no centro
	public final boolean originCenter = false; 
	public float rotation = 0;
	public float scaleX = 1;
	public float scaleY = 1;
}
