package com.libgdx.anagram.screen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.libgdx.anagram.utils.Constants;

/**
 * Created by vishnu on 6/29/2017.
 */

public abstract class AbstractGameScreen implements Screen, Constants {

	protected Game game;

	public AbstractGameScreen(Game game) {
		this.game = game;
	}

	public abstract void render(float deltaTime);

	public abstract void resize(int width, int height);

	public abstract void show();

	public abstract void hide();

	public abstract void pause();

	public void resume() {
	}

	public void dispose() {
	}

}
