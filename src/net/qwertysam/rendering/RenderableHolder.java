package net.qwertysam.rendering;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import net.qwertysam.resource.Holder;

public class RenderableHolder<T> extends Holder<T>
{
	public void renderEntries(SpriteBatch batch)
	{
		renderEntries(batch, 0F, 0F);
	}
	
	public void renderEntries(SpriteBatch batch, float xOffset, float yOffset)
	{
		boolean close = false;
		if (!batch.isDrawing())
		{
			batch.begin();
			// Tells program to close the batch after it's done drawing.
			close = true;
		}
		
		for (T entry : getEntries())
		{
			if (entry instanceof Renderable)
			{
				Renderable rEntry = (Renderable) entry;
				
				Sprite sprite = rEntry.getSprite();
				
				batch.draw(sprite, rEntry.getX() + xOffset, rEntry.getY() + yOffset, sprite.getOriginX() + xOffset, sprite.getOriginY() + yOffset, sprite.getWidth(), sprite.getHeight(), sprite.getScaleX(), sprite.getScaleY(), rEntry.getRotation());
			}
		}
		
		if (close) batch.end();
	}
}
