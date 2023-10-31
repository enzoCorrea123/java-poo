package com.game.adinoventure.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.game.adinoventure.Adinoventure;
import com.game.adinoventure.resource.Assets;

public class PreloadScreen extends ScreenAdapter{
	
	@Override
	public void show() {
		Assets.load();
	}
	@Override
	public void render(float delta) {
		Gdx.app.log("Progress", Assets.manager.getProgress() * 100 + "%");
		if(Assets.manager.update()) {
			Adinoventure.getInstance().setScreen(new GameScreen());
		}
		
	}
}
