package com.libgdx.anagram.objects;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;

public class Words extends AbstractGameObject {

	private ArrayList<GlyphLayout> layouts;
	private BitmapFont font;
	private String word;
	public Words(String word, BitmapFont font) {
		this.font = font;
		this.word = word;
		layouts = new ArrayList<GlyphLayout>();
		for (int i = 0; i < word.length(); i++) {
			GlyphLayout layout = new GlyphLayout();
			layout.setText(font, String.valueOf(word.charAt(i)));
			layouts.add(layout);
		}
	}

	@Override
	public void render(SpriteBatch batch) {
		drawCharacters(batch);
	}
	
	public void drawCharacters(SpriteBatch batch) {
		int noOfCharacters = layouts.size();
		font.setColor(Color.PURPLE);
		for (int i = 0; i < noOfCharacters; i++) {
			float theta = (float) ((2 * MathUtils.PI / noOfCharacters) * (i + 1));
			theta = theta + (MathUtils.PI / noOfCharacters);
			int x = (int) ((CIRCLE_RADIUS * 0.8) * MathUtils.sin(theta));
			int y = (int) ((CIRCLE_RADIUS * 0.8) * MathUtils.cos(theta));

			System.out.println("char x : " + x + " y  :" + y);

			font.draw(batch, String.valueOf(word.charAt(i)), x + LEFT_MARGIN + CIRCLE_RADIUS,
					y + (TOP_MARGIN + CIRCLE_RADIUS));
		}
	}
}
