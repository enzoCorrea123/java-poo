package com.game.adinoventure;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.game.adinoventure.Adinoventure;
import com.game.adinoventure.dino.Dino;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setWindowedMode(800, 480);//resolução HD
		config.setTitle("Adinoventure");
		new Lwjgl3Application(Adinoventure.getInstance(), config);
		//oi Enzo.
	}
}
