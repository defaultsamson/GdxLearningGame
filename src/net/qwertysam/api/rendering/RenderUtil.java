package net.qwertysam.api.rendering;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class RenderUtil
{
	public static void defaultDraw(SpriteBatch batch, Sprite sprite, float x, float y, float xOffset, float yOffset, float rotation)
	{
		batch.draw(sprite, x + xOffset, y + yOffset, sprite.getOriginX() + xOffset, sprite.getOriginY() + yOffset, sprite.getWidth(), sprite.getHeight(), sprite.getScaleX(), sprite.getScaleY(), rotation);
	}
}
