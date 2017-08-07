package com.libgdx.anagram;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.libgdx.anagram.screen.GameScreen;

public class AnagramGame extends Game {
	
	@Override
	public void create() {
		Gdx.app.setLogLevel(Application.LOG_DEBUG);
		setScreen(new GameScreen(this));
	}

}
