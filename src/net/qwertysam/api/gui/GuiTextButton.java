package net.qwertysam.api.gui;

import java.util.List;

import com.badlogic.gdx.graphics.g2d.Sprite;

import net.qwertysam.api.gui.screen.GuiScreen;

public class GuiTextButton extends GuiButton
{
	public GuiTextButton(GuiScreen screen, int id, List<Sprite> sprites, float x, float y)
	{
		this(screen, id, sprites, x, y, 0F);
	}
	
	public GuiTextButton(GuiScreen screen, int id, List<Sprite> sprites, float x, float y, float touchRadius)
	{
		this(screen, id, sprites, x, y, touchRadius, 0F);
	}
	
	public GuiTextButton(GuiScreen screen, int id, List<Sprite> sprites, float x, float y, float touchRadius, float rotation)
	{
		super(screen, id, sprites, x, y, touchRadius, rotation);
	}
}
