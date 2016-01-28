package net.qwertysam.api.rendering;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract interface Renderable
{
	public abstract Sprite getSprite();
	
	public abstract float getX();
	
	public abstract float getY();
	
	public abstract float getRotation();
	
	/**
	 * Draws this to the batch.
	 * 
	 * @param batch the sprite batch to render to
	 * @param xOffset the x offset of this
	 * @param yOffset the y offset of this
	 */
	public void render(SpriteBatch batch, float xOffset, float yOffset);
}
