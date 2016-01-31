package net.qwertysam.api.rendering;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class RenderUtil
{
	public static void drawSprite(SpriteBatch batch, Sprite sprite, float x, float y, float xOffset, float yOffset, float rotation)
	{
		batch.draw(sprite, x + xOffset, y + yOffset, sprite.getOriginX() + xOffset, sprite.getOriginY() + yOffset, sprite.getWidth(), sprite.getHeight(), sprite.getScaleX(), sprite.getScaleY(), rotation);
	}
	
	public static void drawFont(SpriteBatch batch, BitmapFont font, float x, float y, String text)
	{
		font.draw(batch, text, x, y);
	}
}
