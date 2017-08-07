package com.libgdx.anagram.objects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;

public class Disc extends AbstractGameObject {

	Pixmap pixmap;
	Texture texture;
	int length;
	public Disc(int length) {
		pixmap = createPixmap();
		texture = new Texture(pixmap);
	}

	@Override
	public void render(SpriteBatch batch) {
		batch.draw(texture, LEFT_MARGIN, TOP_MARGIN);
	}
	

	private Pixmap createPixmap() {
		pixmap = new Pixmap(TEXTURE_WIDTH, TEXTURE_HIEGHT, Format.RGB888);
		pixmap.setColor(Color.BLUE);
		pixmap.fill();
		addSectors(pixmap);
		return pixmap;
	}

	private Pixmap addSectors(Pixmap pixmap) {
		pixmap.setColor(Color.YELLOW);
		pixmap.fillCircle(TEXTURE_WIDTH / 2, TEXTURE_HIEGHT / 2, CIRCLE_RADIUS);
		drawLines(pixmap, 10);
		pixmap.setColor(Color.BLUE);
		pixmap.fillCircle(TEXTURE_WIDTH / 2, TEXTURE_HIEGHT / 2, CIRCLE_RADIUS / 2);
		return pixmap;
	}

	public void drawLines(Pixmap pixmap, int numberOfLines) {
		pixmap.setColor(Color.BLUE);
		for (int i = 1; i <= numberOfLines; i++) {
			float theta = (float) ((2 * MathUtils.PI / numberOfLines) * i);
			int x = (int) ((CIRCLE_RADIUS) * MathUtils.sin(theta));
			int y = (int) ((CIRCLE_RADIUS) * MathUtils.cos(theta));
			Gdx.gl.glLineWidth(10);
			pixmap.drawLine(CIRCLE_RADIUS, CIRCLE_RADIUS, CIRCLE_RADIUS + x, CIRCLE_RADIUS + y);
		}
	}
}
