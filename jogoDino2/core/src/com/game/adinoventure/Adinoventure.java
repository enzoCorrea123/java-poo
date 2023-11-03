package com.game.adinoventure;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.FPSLogger;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.game.screens.PlayScreen;

public class Adinoventure extends Game {
	FPSLogger fpsLogger = new FPSLogger();
	@Override
	public void create () {
		setScreen(new PlayScreen());//cria a tela atual do jogo
	}

	@Override
	public void render () {
		super.render();
		fpsLogger.log();
	}
	
	@Override
	public void dispose () {
		super.dispose();
	}
	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
	}
	@Override
	public void pause() {
		super.pause();
	}
	@Override
	public void resume() {
		super.resume();
	}
}
