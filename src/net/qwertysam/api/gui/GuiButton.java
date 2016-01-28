package net.qwertysam.api.gui;

import java.util.List;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

import net.qwertysam.api.gui.screen.GuiScreen;
import net.qwertysam.api.rendering.RenderUtil;
import net.qwertysam.api.rendering.Renderable;

public class GuiButton implements IGuiButton, Renderable
{
	private GuiScreen screen;
	private int id;
	
	private Sprite normal;
	private Sprite depressed;
	
	private float x;
	private float y;
	private float rotation;
	private float touchRadius;
	
	private boolean isTouched;
	
	public GuiButton(GuiScreen screen, int id, List<Sprite> sprites, float x, float y)
	{
		this(screen, id, sprites, x, y, 0F);
	}
	
	public GuiButton(GuiScreen screen, int id, List<Sprite> sprites, float x, float y, float touchRadius)
	{
		this(screen, id, sprites, x, y, touchRadius, 0F);
	}
	
	public GuiButton(GuiScreen screen, int id, List<Sprite> sprites, float x, float y, float touchRadius, float rotation)
	{
		this.screen = screen;
		this.id = id;
		
		normal = sprites.get(0);
		depressed = sprites.get(1);
		
		this.x = x;
		this.y = y;
		this.rotation = rotation;
		this.touchRadius = touchRadius;
		
		this.isTouched = false;
	}
	
	public void update(Vector2 touch)
	{
		boolean previouslyTouched = isTouched;
		isTouched = isBeingTouched(touch);
		boolean screenReleased = false;
		
		if (touch == null)
		{
			screenReleased = true;
		}
		// If the button was touched last tick but is no longer being touched
		if (previouslyTouched && !isTouched && screenReleased)
		{
			onRelease();
		}
		// Else if button is currently being touched and the button can be held or it wasn't previously touched
		else if (isBeingTouched(touch) && (canHold() || !previouslyTouched))
		{
			onPressed();
		}
	}
	
	@Override
	public boolean canHold()
	{
		return false;
	}
	
	private void onPressed()
	{
		screen.pressAction(id);
		
	}
	
	private void onRelease()
	{
		screen.releaseAction(id);
	}
	
	@Override
	public Sprite getSprite()
	{
		return (isTouched ? depressed : normal);
	}
	
	public float getWidth()
	{
		return normal.getWidth();
	}
	
	public float getHeight()
	{
		return normal.getHeight();
	}
	
	@Override
	public float getX()
	{
		return x;
	}
	
	@Override
	public float getY()
	{
		return y;
	}
	
	public boolean isBeingTouched(Vector2 touch)
	{
		return touch == null ? false : (touch.x > getX() - touchRadius && touch.x < getX() + getWidth() + touchRadius && touch.y > getY() - touchRadius && touch.y < getY() + getHeight() + touchRadius);
	}
	
	@Override
	public float getRotation()
	{
		return rotation;
	}
	
	public float getTouchRadius()
	{
		return touchRadius;
	}

	@Override
	public void render(SpriteBatch batch, float xOffset, float yOffset)
	{
		RenderUtil.defaultDraw(batch, getSprite(), getX(), getY(), xOffset, yOffset, getRotation());
	}
}
