package net.qwertysam.resource;

import net.qwertysam.api.resource.IDisposable;

public class FontVarietyHolder implements IDisposable
{
	public FontTypeHolder white_big;
	public FontTypeHolder white_medium;
	public FontTypeHolder white_small;
	public FontTypeHolder black_big;
	public FontTypeHolder black_medium;
	public FontTypeHolder black_small;
	
	public FontVarietyHolder(FontTypeHolder white_big, FontTypeHolder white_medium, FontTypeHolder white_small, FontTypeHolder black_big, FontTypeHolder black_medium, FontTypeHolder black_small)
	{
		this.white_big = white_big;
		this.white_medium = white_medium;
		this.white_small = white_small;
		this.black_big = black_big;
		this.black_medium = black_medium;
		this.black_small = black_small;
	}

	@Override
	public void dispose()
	{
		white_big.dispose();
		white_medium.dispose();
		white_small.dispose();
		black_big.dispose();
		black_medium.dispose();
		black_small.dispose();
	}
}
