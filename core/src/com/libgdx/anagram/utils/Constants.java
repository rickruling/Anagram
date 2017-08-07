package com.libgdx.anagram.utils;

import com.badlogic.gdx.graphics.Color;

public interface Constants {

	// constatnt values

	public static final int WIDTH = 480;
	public static final int HEIGHT = 800;

	public static final int TOP_MARGIN = 40;
	public static final int LEFT_MARGIN = 40;

	public static final int CIRCLE_RADIUS = 200;

	public static final Color BACKGROUND_COLOR = Color.BLUE;

	// derived values
	public static final int TEXTURE_HIEGHT = CIRCLE_RADIUS * 2;
	public static final int TEXTURE_WIDTH = CIRCLE_RADIUS * 2;

	public static final int CIRCLE_X = LEFT_MARGIN + CIRCLE_RADIUS;
	public static final int CIRCLE_Y = TOP_MARGIN - CIRCLE_RADIUS;

	// assets
	public static final String THREE_DIGIT_WORDS = "words/3_words.txt";
	public static final String FOUR_DIGIT_WORDS = "words/4_words.txt";
	public static final String FIVE_DIGIT_WORDS = "words/5_words.txt";
	public static final String SIX_DIGIT_WORDS = "words/6_words.txt";
	public static final String SEVEN_DIGIT_WORDS = "words/7_words.txt";
	public static final String EIGHT_DIGIT_WORDS = "words/8_words.txt";

}
