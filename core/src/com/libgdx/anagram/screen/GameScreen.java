package com.libgdx.anagram.screen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.libgdx.anagram.objects.Disc;
import com.libgdx.anagram.objects.Words;

public class GameScreen extends AbstractGameScreen {

	OrthographicCamera cam;
	SpriteBatch batch;
	BitmapFont font;
	String myText;
	Words words;
	Disc disc;

	public GameScreen(Game game) {
		super(game);
		cam = new OrthographicCamera(WIDTH, HEIGHT);
		batch = new SpriteBatch();
		font = new BitmapFont(Gdx.files.internal("myfont.fnt"));
		myText = "HelloWorld".toUpperCase();
		words = new Words(myText, font);
		disc = new Disc(myText.length());

	}

	@Override
	public void render(float deltaTime) {
		Gdx.gl.glClearColor(0x64 / 255.0f, 0x95 / 255.0f, 0xed / 255.0f, 0xff / 255.0f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		disc.render(batch);
		words.render(batch);
		batch.end();
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void show() {
		Gdx.input.setCatchBackKey(true);
	}

	@Override
	public void hide() {
		Gdx.input.setCatchBackKey(false);
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
		super.resume();
	}

}
