package com.game.adinoventure.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.FillViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.game.adinoventure.Adinoventure;
import com.game.adinoventure.Dictionary.World;
import com.game.adinoventure.entity.component.RigidBodyComponent;
import com.game.adinoventure.entity.component.TransformComponent;

public class GameScreen extends ScreenAdapter{
public SpriteBatch batch;
	
	protected OrthographicCamera camera;
	
	protected Viewport viewport;
	
	protected World world;
	
	public void show () {
		batch = new SpriteBatch();
		camera = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		camera.setToOrtho(false);
		viewport = new FillViewport(Gdx.graphics.getWidth(), Gdx.graphics.getHeight(),camera);
		world = new World(camera);
		world.regenerate();
		
		/*if(Adinoventure.DEBUG) {
			final int player = world.getPlayer();
			Gdx.input.setInputProcessor(new InputAdapter() {
				@Override
				public boolean touchDown(int screenX, int screenY, int pointer, int button) {
					world.getWorld().getEntity(player).getComponent(TransformComponent.class).position.set(screenX,Gdx.graphics.getHeight() - screenY);
					world.getWorld().getEntity(player).getComponent(RigidBodyComponent.class).velocity.set(0, 0);
					return true;
				}
			});
		}*/
		
	}

	@Override
	public void render (float delta) {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		world.update(delta);
		if(Adinoventure.DEBUG) {
			if(Gdx.input.isKeyPressed(Input.Keys.Y)) {
				if(world.getEntityTrackerMainWindow() != null) {
					world.getEntityTrackerMainWindow().setVisible(!world.getEntityTrackerMainWindow().isVisible());
			}
			
		}
		}
		

	}
	
	public void resize(int width, int height) {
		viewport.update(width, height);
	}
	@Override
	public void dispose () {
		batch.dispose();
		world.dispose();
	}
}
