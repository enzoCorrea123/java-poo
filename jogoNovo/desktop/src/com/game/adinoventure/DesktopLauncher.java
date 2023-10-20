package com.game.adinoventure;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.game.adinoventure.Adinoventure;
import com.game.adinoventure.dino.Dino;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setWindowedMode(1280, 720);//resolução HD
		config.setResizable(false);//não mudar o tamanho da janela
		config.useVsync(true);
		config.setTitle("Adinoventure");
		new Lwjgl3Application(Adinoventure.getInstance(), config);
	}
}
