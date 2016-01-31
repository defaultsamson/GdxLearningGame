package net.qwertysam.api.rendering;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class RenderUtil
{
	public static void drawSprite(SpriteBatch batch, Sprite sprite, float x, float y, float xOffset, float yOffset, float rotation)
	{
		batch.draw(sprite, x + xOffset, y + yOffset, sprite.getOriginX() + xOffset, sprite.getOriginY() + yOffset, sprite.getWidth(), sprite.getHeight(), sprite.getScaleX(), sprite.getScaleY(), rotation);
	}
	
	public static void drawFont(SpriteBatch batch, BitmapFont font, float x, float y, float xOffset, float yOffset, String text)
	{
		float height = font.getCapHeight();
		font.draw(batch, text, x + xOffset, y + yOffset + height);
	}
	
	public static void drawCenteredFont(SpriteBatch batch, BitmapFont font, float x, float y, float xOffset, float yOffset, String text)
	{
		GlyphLayout lay = new GlyphLayout(font, text);
		
		float height = font.getCapHeight();
		float width = lay.width;
		
		font.draw(batch, lay, x + xOffset - (width / 2), y + yOffset + height - (height / 2));
	}
}
