package net.qwertysam.api.gui;

import java.util.List;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import net.qwertysam.api.gui.screen.GuiScreen;
import net.qwertysam.api.input.TouchableArea;
import net.qwertysam.api.rendering.RenderUtil;
import net.qwertysam.api.rendering.Renderable;

public class GuiButton extends TouchableArea implements Renderable
{
	private GuiScreen screen;
	
	private int id;
	
	private Sprite normal;
	private Sprite depressed;
	
	private float spriteX;
	private float spriteY;
	
	public GuiButton(GuiScreen screen, List<Sprite> sprites, int id, float x, float y)
	{
		this(screen, sprites, 1F, id, x, y, 0F);
	}
	
	public GuiButton(GuiScreen screen, List<Sprite> sprites, float scale, int id, float x, float y)
	{
		this(screen, sprites, scale, id, x, y, 0F);
	}
	
	public GuiButton(GuiScreen screen, List<Sprite> sprites, int id, float x, float y, float touchRadius)
	{
		this(screen, sprites, 1F, id, x, y, touchRadius, 0F);
	}
	
	public GuiButton(GuiScreen screen, List<Sprite> sprites, float scale, int id, float x, float y, float touchRadius)
	{
		this(screen, sprites, scale, id, x, y, touchRadius, 0F);
	}
	
	public GuiButton(GuiScreen screen, List<Sprite> sprites, int id, float x, float y, float touchRadius, float rotation)
	{
		this(screen, sprites, 1F, id, x, y, touchRadius, rotation);
	}
	
	public GuiButton(GuiScreen screen, List<Sprite> sprites, float scale, int id, float x, float y, float touchRadius, float rotation)
	{
		super(x, y, sprites.get(0).getWidth() * scale, sprites.get(0).getHeight() * scale, touchRadius, rotation);
		
		this.screen = screen;
		this.id = id;
		
		spriteX = x + ((sprites.get(0).getWidth() * (scale - 1F)) / 2);
		spriteY = y + ((sprites.get(0).getHeight() * (scale - 1F)) / 2);
		
		normal = new Sprite(sprites.get(0));
		normal.scale(scale - 1F);
		depressed = new Sprite(sprites.get(1));
		depressed.scale(scale - 1F);
	}
	
	@Override
	public boolean canHold()
	{
		return false;
	}
	
	@Override
	protected void onPressed()
	{
		screen.pressAction(id);
		
	}
	
	@Override
	protected void onRelease()
	{
		screen.releaseAction(id);
	}
	
	@Override
	public Sprite getSprite()
	{
		return (isTouched ? depressed : normal);
	}
	
	/**
	 * @return the x ordinate of which to draw the sprite from for it to render properly.
	 */
	private float getSpriteX()
	{
		return spriteX;
	}
	
	/**
	 * @return the y ordinate of which to draw the sprite from for it to render properly.
	 */
	private float getSpriteY()
	{
		return spriteY;
	}
	
	@Override
	public void render(SpriteBatch batch, float xOffset, float yOffset)
	{
		RenderUtil.drawSprite(batch, getSprite(), getSpriteX(), getSpriteY(), xOffset, yOffset, getRotation());
	}
	
	@Override
	public float getRotation()
	{
		return super.getRotation();
	}
}
