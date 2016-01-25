package net.qwertysam.rendering;

import com.badlogic.gdx.graphics.g2d.Sprite;

public interface Renderable
{
	public Sprite getSprite();
	
	public float getX();
	
	public float getY();
	
	public float getRotation();
}
