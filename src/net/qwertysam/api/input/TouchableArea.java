package net.qwertysam.api.input;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public abstract class TouchableArea
{
	protected boolean isTouched;
	
	protected Rectangle rect;
	
	// These need separate variables because the rectangle's ones are offset by the touchRadius
	private float x, y, width, height;
	
	/**
	 * An area that acts as an input for touch coordinates.
	 * 
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 * @param touchRadius
	 * @param rotation
	 */
	public TouchableArea(float x, float y, float width, float height, float touchRadius, float rotation)
	{
		isTouched = false;
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
		rect = new Rectangle(x - touchRadius, y - touchRadius, width + (touchRadius * 2), height + (touchRadius * 2));
		//rect.setRotate(rotation);
		
	}
	
	/**
	 * Updates the onPressed() and onReleased() methods.
	 * 
	 * @param touch the touch coordinates.
	 */
	public void update(Vector2 touch)
	{
		boolean previouslyTouched = isTouched;
		isTouched = isTouching(touch);
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
		else if (isTouched && (canHold() || !previouslyTouched))
		{
			onPressed();
		}
	}
	
	/**
	 * If the button can be held down. (Useful for on-screen controls in-game)
	 */
	public abstract boolean canHold();
	
	/**
	 * Activates when the area is pressed.
	 */
	protected abstract void onPressed();
	
	/**
	 * Activates when the area has been released.
	 */
	protected abstract void onRelease();
	
	/**
	 * @return the width of this.
	 */
	public float getHitboxWidth()
	{
		return rect.getWidth();
	}
	
	/**
	 * @return the height of this.
	 */
	public float getHitboxHeight()
	{
		return rect.getHeight();
	}
	
	/**
	 * @return the y ordinate of this (offset by the touch radius).
	 */
	public float getHitboxX()
	{
		return rect.getX();
	}
	
	/**
	 * @return the y ordinate of this (offset by the touch radius).
	 */
	public float getHitboxY()
	{
		return rect.getY();
	}
	
	public float getRotation()
	{
		return 0F;
		//return (float) rect.getRotate();
	}
	
	/**
	 * @return the x ordinate of this, ignoring the touch radius offset for the hitbox (useful for in-game visible coordinates or for rendering).
	 */
	public float getX()
	{
		return x;
	}
	
	/**
	 * @return the y ordinate of this, ignoring the touch radius offset for the hitbox (useful for in-game visible coordinates or for rendering).
	 */
	public float getY()
	{
		return y;
	}
	
	/**
	 * @return the width of this, ignoring the touch radius offset for the hitbox (useful for in-game visible width or for rendering).
	 */
	public float getWidth()
	{
		return width;
	}
	
	/**
	 * @return the height of this, ignoring the touch radius offset for the hitbox (useful for in-game visible height or for rendering).
	 */
	public float getHeight()
	{
		return height;
	}
	
	/**
	 * Tells if the touch is within this TouchableArea.
	 * 
	 * @param touch the touch coordinates
	 * @return if the touch is within this.
	 */
	public boolean isTouching(Vector2 touch)
	{
		if (touch == null) return false;
		return rect.contains(touch.x, touch.y);
	}
}
