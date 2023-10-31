package com.game.adinoventure.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.game.adinoventure.Adinoventure;
import com.game.adinoventure.Dictionary.Tiled;
import com.game.adinoventure.Dictionary.World;
import com.game.adinoventure.entity.component.TransformComponent;

public class GameScreen extends ScreenAdapter{
public SpriteBatch batch;
	
	protected OrthographicCamera camera;
	
	protected Viewport viewport;
	
	protected World world;
	
	private TransformComponent transformComponent = new TransformComponent();
	
	private Tiled tiled = new Tiled();
	
	public void show () {
		batch = new SpriteBatch();
		camera = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		camera.setToOrtho(false);//evita deixar de cabeça para baixo
		viewport = new FitViewport(Gdx.graphics.getWidth(), Gdx.graphics.getHeight(), camera);
		camera.position.set(viewport.getWorldWidth()/2, viewport.getWorldHeight()/2, 0);
		world = new World(camera);
		
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
		cameraFollowPlayer(delta);
		camera.update();
		world.update(delta);
		tiled.viewMap(camera);
		
		if(Adinoventure.DEBUG) {
			if(Gdx.input.isKeyPressed(Input.Keys.Y)) {
				if(world.getEntityTrackerMainWindow() != null) {
					world.getEntityTrackerMainWindow().setVisible(!world.getEntityTrackerMainWindow().isVisible());
			}
			
		}
		}
		

	}
	private void cameraFollowPlayer(float delta) {
		if(Gdx.input.isKeyPressed(Input.Keys.D)) {
			camera.position.x += 9/2;
		}
		if(Gdx.input.isKeyPressed(Input.Keys.A)) {
			camera.position.x -= 9/2;
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
