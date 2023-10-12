package com.game.adinoventure.Scenes;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.game.adinoventure.Adinoventure;
import com.game.adinoventure.dino.Dino;
import com.game.adinoventure.dino.Roar;

public class Hud {
	public Stage stage;
	private Viewport viewport;
	private Dino dino;
	private Integer worldTimer;
	private float timeCount;

	Label countdownLabel;
	Label timeLabel;
	Label levelLabel;
	Label worldLabel;
	Label dinoLabel;
	Label chooseDino;

	public Hud(SpriteBatch sb) {
		worldTimer = 300;
		timeCount = 0;

		viewport = new FitViewport(Adinoventure.width, Adinoventure.height, new OrthographicCamera());
		stage = new Stage(viewport, sb);
		dino = new Roar();
		Table table = new Table();
		table.top();
		table.setFillParent(true);
		countdownLabel = new Label(String.format("%03d", worldTimer),
				new Label.LabelStyle(new BitmapFont(), Color.WHITE));
		timeLabel = new Label("TIME", new Label.LabelStyle(new BitmapFont(), Color.WHITE));
		levelLabel = new Label("1-0", new Label.LabelStyle(new BitmapFont(), Color.WHITE));
		worldLabel = new Label("Cave", new Label.LabelStyle(new BitmapFont(), Color.WHITE));
		dinoLabel = new Label("Character", new Label.LabelStyle(new BitmapFont(), Color.WHITE));
		chooseDino = new Label(dino.getNome() + " - " + dino.getNome(),
				new Label.LabelStyle(new BitmapFont(), Color.WHITE));

		table.add(dinoLabel).expandX().padTop(10);
		table.add(worldLabel).expandX().padTop(10);
		table.add(timeLabel).expandX().padTop(10);
		table.row();
		table.add(chooseDino).expandX();
		table.add(levelLabel).expandX();
		table.add(countdownLabel).expandX();

		stage.addActor(table);
	}
}
