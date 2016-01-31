package net.qwertysam.api.input;

import com.badlogic.gdx.math.Vector2;

import javafx.scene.shape.Rectangle;

public abstract class TouchableArea
{
	protected boolean isTouched;
	
	protected Rectangle rect;
	
	// These need separate variables because the rectangle's ones are offset by the touchRadius
	private float x, y;
	
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
		
		this.x = x - (touchRadius / 2);
		this.y = y - (touchRadius / 2);
		
		rect = new Rectangle(x - touchRadius, y - touchRadius, width + touchRadius, height + touchRadius);
		rect.setRotate(rotation);
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
	public float getWidth()
	{
		return (float) rect.getWidth();
	}
	
	/**
	 * @return the height of this.
	 */
	public float getHeight()
	{
		return (float) rect.getHeight();
	}
	
	/**
	 * @return the y ordinate of this.
	 */
	public float getX()
	{
		return x;
	}
	
	/**
	 * @return the x ordinate of this.
	 */
	public float getY()
	{
		return y;
	}
	
	/**
	 * @return the y ordinate of this.
	 */
	public float getRectX()
	{
		return (float) rect.getX();
	}
	
	/**
	 * @return the x ordinate of this.
	 */
	public float getRectY()
	{
		return (float) rect.getY();
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
