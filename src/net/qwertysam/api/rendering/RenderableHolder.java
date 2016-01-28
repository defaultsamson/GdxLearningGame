package net.qwertysam.api.rendering;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import net.qwertysam.api.util.Holder;

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
				((Renderable) entry).render(batch, xOffset, yOffset);
			}
		}
		
		if (close) batch.end();
	}
}
