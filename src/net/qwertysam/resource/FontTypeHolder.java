package net.qwertysam.resource;

import com.badlogic.gdx.graphics.g2d.BitmapFont;

import net.qwertysam.api.resource.IDisposable;

public class FontTypeHolder implements IDisposable
{
	public BitmapFont normal;
	public BitmapFont bold;
	public BitmapFont italic;
	
	public FontTypeHolder(BitmapFont normal, BitmapFont bold, BitmapFont italic)
	{
		this.normal = normal;
		this.bold = bold;
		this.italic = italic;
	}

	@Override
	public void dispose()
	{
		normal.dispose();
		bold.dispose();
		italic.dispose();
	}
}
