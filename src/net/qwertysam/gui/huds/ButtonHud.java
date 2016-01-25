package net.qwertysam.gui.huds;

import java.util.List;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

import net.qwertysam.gui.GuiButton;
import net.qwertysam.main.MyGdxGame;
import net.qwertysam.rendering.RenderableHolder;
import net.qwertysam.resource.IDisposable;

public class ButtonHud extends RenderableHolder<GuiButton> implements IDisposable
{
	protected MyGdxGame game;
	
	/** The x offset of this. */
	private float x;
	/** The y offset of this. */
	private float y;
	
	public ButtonHud(MyGdxGame game)
	{
		this.game = game;
		init();
	}
	
	public void init()
	{}
	
	/**
	 * Ticks all buttons in this.
	 * 
	 * @param touch the touch position on the screen
	 */
	public void onTick(List<Vector2> touch)
	{
		onTick(touch, 0F, 0F);
	}
	
	/**
	 * Ticks all buttons in this.
	 * 
	 * @param touches the touches' positions on the screen
	 * @param xOffset the bottom left x ordinate of the camera position relative to the world
	 * @param yOffset the bottom left y ordinate of the camera position relative to the world
	 */
	public void onTick(List<Vector2> touches, float xOffset, float yOffset)
	{
		x = xOffset;
		y = yOffset;
		
		if (touches.isEmpty())
		{
			updateButtons(null);
		}
		else
		{
			for (Vector2 touch : touches)
			{
				updateButtons(touch.add(xOffset, yOffset));// new Vector2(touch.x - xOffset, touch.y - yOffset)
			}
		}
	}
	
	@Override
	public void renderEntries(SpriteBatch batch)
	{
		renderEntries(batch, x, y);
	}
	
	private void updateButtons(Vector2 touch)
	{
		for (GuiButton entry : getEntries())
		{
			entry.update(touch);
		}
	}
	
	public void pressAction(int buttonID)
	{
	
	}
	
	public void releaseAction(int buttonID)
	{
	
	}
}
