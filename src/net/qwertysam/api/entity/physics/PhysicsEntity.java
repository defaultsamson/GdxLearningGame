package net.qwertysam.api.entity.physics;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;

import net.qwertysam.api.util.PhysicsUtil;

/**
 * A physical Entity.
 */
@Deprecated
public class PhysicsEntity
{
	/** If entities can rotate by default. */
	public static final boolean CAN_ROTATE_DEFAULT = true;
	/** If entities are static by default. */
	public static final boolean IS_STATIC_DEFAULT = false;
	/** The default coefficient of friction for Entities. */
	public static final float DEFAULT_FRICTION = 0.1F;
	/** The default elasticity for Entities. */
	public static final float DEFAULT_RESTITUTION = 0.1F;
	
	/** The physics Body of this. */
	protected Body body;
	
	/**
	 * A physical Entity.
	 * 
	 * @param body the physics Body for this
	 */
	public PhysicsEntity(Body body)
	{
		this.body = body;
	}
	
	/**
	 * Adds a velocity to this.
	 * 
	 * @param x the x velocity in m/s
	 * @param y the y velocity in m/s
	 */
	public void addVelocity(float x, float y)
	{
		body.setLinearVelocity(body.getLinearVelocity().x + x, body.getLinearVelocity().y + y);
	}
	
	/**
	 * Sets the velocity of this.
	 * 
	 * @param x the x velocity in m/s
	 * @param y the y velocity in m/s
	 */
	public void setVelocity(float x, float y)
	{
		body.setLinearVelocity(x, y);
	}
	
	/**
	 * Sets the x velocity of this.
	 * 
	 * @param x the x velocity in m/s
	 */
	public void setXVelocity(float x)
	{
		body.setLinearVelocity(x, body.getLinearVelocity().y);
	}
	
	/**
	 * Sets the y velocity of this.
	 * 
	 * @param y the y velocity in m/s
	 */
	public void setYVelocity(float y)
	{
		body.setLinearVelocity(body.getLinearVelocity().x, y);
	}
	
	/**
	 * Gets the velocity of this.
	 * 
	 * @return the velocity of this.
	 */
	public Vector2 getVelocity()
	{
		return body.getLinearVelocity();
	}
	
	/**
	 * Gets the x coordinate of the center of this in pixels.
	 * 
	 * @return the x coordinate of the center of this in pixels
	 */
	public float getCenterX()
	{
		return body.getPosition().x * PhysicsUtil.PIXELS_PER_METER;
	}
	
	/**
	 * Gets the y coordinate of the center of this in pixels.
	 * 
	 * @return the y coordinate of the center of this in pixels
	 */
	public float getCenterY()
	{
		return body.getPosition().y * PhysicsUtil.PIXELS_PER_METER;
	}
	
	/**
	 * Gets the rotation of this in degrees.
	 * 
	 * @return the rotation of this in degrees
	 */
	public float getRotation()
	{
		return (float) Math.toDegrees(body.getAngle());
	}
	
	/**
	 * Gets the physics World that this' physics Body is in.
	 * 
	 * @return the physics World that this' physics Body is in
	 */
	public World getWorld()
	{
		return body.getWorld();
	}
	
	/**
	 * Gets the Body of this.
	 * 
	 * @return the Body of this.
	 */
	public Body getBody()
	{
		return body;
	}
}
