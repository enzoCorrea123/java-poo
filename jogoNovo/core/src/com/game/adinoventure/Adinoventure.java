package com.game.adinoventure;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.FPSLogger;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.FillViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.game.adinoventure.Dictionary.World;
import com.game.adinoventure.resource.Assets;
import com.game.adinoventure.screen.GameScreen;
import com.game.adinoventure.screen.PreloadScreen;

public class Adinoventure extends Game {
	
	public static final boolean DEBUG = true;
	private static Adinoventure instance;
	FPSLogger fpsLogger = new FPSLogger();
	
	@Override
	public void create() {
		this.setScreen(new PreloadScreen());
		
	}
	
	private Adinoventure() {}
	public static Adinoventure getInstance() {
		if(instance == null) {
			instance = new Adinoventure();
		}
		return instance;
	}
	@Override
	public void render() {
		super.render();
		fpsLogger.log();
	}
	@Override
	public void dispose() {
		Assets.manager.dispose();
	}
	
	
}
