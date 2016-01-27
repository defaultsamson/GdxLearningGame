package net.qwertysam.api.entity;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.World;

import net.qwertysam.api.rendering.Renderable;

public class SpriteEntity extends BoxEntity implements Renderable
{
	private Sprite sprite;
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param sprite the sprite for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param x the x ordinate of this in pixels
	 * @param y the y ordinate of this in pixels
	 */
	public SpriteEntity(Sprite sprite, World world, float mass, float x, float y)
	{
		this(1F, sprite, DEFAULT_FRICTION, world, mass, x, y, sprite.getWidth(), sprite.getHeight(), IS_STATIC_DEFAULT);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param sprite the sprite for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param x the x ordinate of this in pixels
	 * @param y the y ordinate of this in pixels
	 * @param isStatic if this is capable of having motion
	 */
	public SpriteEntity(Sprite sprite, World world, float mass, float x, float y, boolean isStatic)
	{
		this(1F, sprite, DEFAULT_FRICTION, world, mass, x, y, sprite.getWidth(), sprite.getHeight(), isStatic);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param sprite the sprite for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param x the x ordinate of this in pixels
	 * @param y the y ordinate of this in pixels
	 * @param isStatic if this is capable of having motion
	 * @param canRotate if this is capable of rotating
	 */
	public SpriteEntity(Sprite sprite, World world, float mass, float x, float y, boolean isStatic, boolean canRotate)
	{
		this(1F, sprite, DEFAULT_FRICTION, DEFAULT_RESTITUTION, world, mass, x, y, sprite.getWidth(), sprite.getHeight(), isStatic, canRotate);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param sprite the sprite for this
	 * @param friction the coefficient of friction for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param x the x ordinate of this in pixels
	 * @param y the y ordinate of this in pixels
	 */
	public SpriteEntity(Sprite sprite, float friction, World world, float mass, float x, float y)
	{
		this(1F, sprite, friction, world, mass, x, y, sprite.getWidth(), sprite.getHeight(), IS_STATIC_DEFAULT);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param sprite the sprite for this
	 * @param friction the coefficient of friction for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param x the x ordinate of this in pixels
	 * @param y the y ordinate of this in pixels
	 * @param isStatic if this is capable of having motion
	 */
	public SpriteEntity(Sprite sprite, float friction, World world, float mass, float x, float y, boolean isStatic)
	{
		this(1F, sprite, friction, DEFAULT_RESTITUTION, world, mass, x, y, sprite.getWidth(), sprite.getHeight(), isStatic, CAN_ROTATE_DEFAULT);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param sprite the sprite for this
	 * @param friction the coefficient of friction for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param x the x ordinate of this in pixels
	 * @param y the y ordinate of this in pixels
	 * @param isStatic if this is capable of having motion
	 * @param canRotate if this is capable of rotating
	 */
	public SpriteEntity(Sprite sprite, float friction, World world, float mass, float x, float y, boolean isStatic, boolean canRotate)
	{
		this(1F, sprite, friction, DEFAULT_RESTITUTION, world, mass, x, y, sprite.getWidth(), sprite.getHeight(), isStatic, canRotate);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param sprite the sprite for this
	 * @param friction the coefficient of friction for this
	 * @param restitution the restitution for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param x the x ordinate of this in pixels
	 * @param y the y ordinate of this in pixels
	 */
	public SpriteEntity(Sprite sprite, float friction, float restitution, World world, float mass, float x, float y)
	{
		this(1F, sprite, friction, restitution, world, mass, x, y, sprite.getWidth(), sprite.getHeight(), IS_STATIC_DEFAULT);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param sprite the sprite for this
	 * @param friction the coefficient of friction for this
	 * @param restitution the restitution for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param x the x ordinate of this in pixels
	 * @param y the y ordinate of this in pixels
	 * @param isStatic if this is capable of having motion
	 */
	public SpriteEntity(Sprite sprite, float friction, float restitution, World world, float mass, float x, float y, boolean isStatic)
	{
		this(1F, sprite, friction, restitution, world, mass, x, y, sprite.getWidth(), sprite.getHeight(), isStatic, CAN_ROTATE_DEFAULT);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param sprite the sprite for this
	 * @param friction the coefficient of friction for this
	 * @param restitution the restitution for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param x the x ordinate of this in pixels
	 * @param y the y ordinate of this in pixels
	 * @param isStatic if this is capable of having motion
	 * @param canRotate if this is capable of rotating
	 */
	public SpriteEntity(Sprite sprite, float friction, float restitution, World world, float mass, float x, float y, boolean isStatic, boolean canRotate)
	{
		this(1F, sprite, friction, restitution, world, mass, x, y, sprite.getWidth(), sprite.getHeight(), isStatic, canRotate);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param sprite the sprite for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param x the x ordinate of this in pixels
	 * @param y the y ordinate of this in pixels
	 * @param width the width of this in pixels
	 * @param height the height of this in pixels
	 */
	public SpriteEntity(Sprite sprite, World world, float mass, float x, float y, float width, float height)
	{
		this(1F, sprite, DEFAULT_FRICTION, world, mass, x, y, width, height, IS_STATIC_DEFAULT);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param sprite the sprite for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param x the x ordinate of this in pixels
	 * @param y the y ordinate of this in pixels
	 * @param width the width of this in pixels
	 * @param height the height of this in pixels
	 * @param isStatic if this is capable of having motion
	 */
	public SpriteEntity(Sprite sprite, World world, float mass, float x, float y, float width, float height, boolean isStatic)
	{
		this(1F, sprite, DEFAULT_FRICTION, world, mass, x, y, width, height, isStatic);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param sprite the sprite for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param x the x ordinate of this in pixels
	 * @param y the y ordinate of this in pixels
	 * @param width the width of this in pixels
	 * @param height the height of this in pixels
	 * @param isStatic if this is capable of having motion
	 * @param canRotate if this is capable of rotating
	 */
	public SpriteEntity(Sprite sprite, World world, float mass, float x, float y, float width, float height, boolean isStatic, boolean canRotate)
	{
		this(1F, sprite, DEFAULT_FRICTION, world, mass, x, y, width, height, isStatic, canRotate);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param sprite the sprite for this
	 * @param friction the coefficient of friction for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param x the x ordinate of this in pixels
	 * @param y the y ordinate of this in pixels
	 * @param width the width of this in pixels
	 * @param height the height of this in pixels
	 */
	public SpriteEntity(Sprite sprite, float friction, World world, float mass, float x, float y, float width, float height)
	{
		this(1F, sprite, friction, world, mass, x, y, width, height, IS_STATIC_DEFAULT);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param sprite the sprite for this
	 * @param friction the coefficient of friction for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param x the x ordinate of this in pixels
	 * @param y the y ordinate of this in pixels
	 * @param width the width of this in pixels
	 * @param height the height of this in pixels
	 * @param isStatic if this is capable of having motion
	 */
	public SpriteEntity(Sprite sprite, float friction, World world, float mass, float x, float y, float width, float height, boolean isStatic)
	{
		this(1F, sprite, friction, world, mass, x, y, width, height, isStatic, CAN_ROTATE_DEFAULT);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param sprite the sprite for this
	 * @param friction the coefficient of friction for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param x the x ordinate of this in pixels
	 * @param y the y ordinate of this in pixels
	 * @param width the width of this in pixels
	 * @param height the height of this in pixels
	 * @param isStatic if this is capable of having motion
	 * @param canRotate if this is capable of rotating
	 */
	public SpriteEntity(Sprite sprite, float friction, World world, float mass, float x, float y, float width, float height, boolean isStatic, boolean canRotate)
	{
		this(1F, sprite, friction, DEFAULT_RESTITUTION, world, mass, x, y, width, height, isStatic, canRotate);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param sprite the sprite for this
	 * @param friction the coefficient of friction for this
	 * @param restitution the restitution for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param x the x ordinate of this in pixels
	 * @param y the y ordinate of this in pixels
	 * @param width the width of this in pixels
	 * @param height the height of this in pixels
	 */
	public SpriteEntity(Sprite sprite, float friction, float restitution, World world, float mass, float x, float y, float width, float height)
	{
		this(1F, sprite, friction, restitution, world, mass, x, y, width, height, IS_STATIC_DEFAULT, CAN_ROTATE_DEFAULT);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param sprite the sprite for this
	 * @param friction the coefficient of friction for this
	 * @param restitution the restitution for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param x the x ordinate of this in pixels
	 * @param y the y ordinate of this in pixels
	 * @param width the width of this in pixels
	 * @param height the height of this in pixels
	 * @param isStatic if this is capable of having motion
	 */
	public SpriteEntity(Sprite sprite, float friction, float restitution, World world, float mass, float x, float y, float width, float height, boolean isStatic)
	{
		this(1F, sprite, friction, restitution, world, mass, x, y, width, height, isStatic, CAN_ROTATE_DEFAULT);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param sprite the sprite for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param x the x ordinate of this in pixels
	 * @param y the y ordinate of this in pixels
	 */
	public SpriteEntity(float scale, Sprite sprite, World world, float mass, float x, float y)
	{
		this(scale, sprite, DEFAULT_FRICTION, world, mass, x, y, sprite.getWidth(), sprite.getHeight(), IS_STATIC_DEFAULT);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param sprite the sprite for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param x the x ordinate of this in pixels
	 * @param y the y ordinate of this in pixels
	 * @param isStatic if this is capable of having motion
	 */
	public SpriteEntity(float scale, Sprite sprite, World world, float mass, float x, float y, boolean isStatic)
	{
		this(scale, sprite, DEFAULT_FRICTION, world, mass, x, y, sprite.getWidth(), sprite.getHeight(), isStatic);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param sprite the sprite for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param x the x ordinate of this in pixels
	 * @param y the y ordinate of this in pixels
	 * @param isStatic if this is capable of having motion
	 * @param canRotate if this is capable of rotating
	 */
	public SpriteEntity(float scale, Sprite sprite, World world, float mass, float x, float y, boolean isStatic, boolean canRotate)
	{
		this(scale, sprite, DEFAULT_FRICTION, DEFAULT_RESTITUTION, world, mass, x, y, sprite.getWidth(), sprite.getHeight(), isStatic, canRotate);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param sprite the sprite for this
	 * @param friction the coefficient of friction for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param x the x ordinate of this in pixels
	 * @param y the y ordinate of this in pixels
	 */
	public SpriteEntity(float scale, Sprite sprite, float friction, World world, float mass, float x, float y)
	{
		this(scale, sprite, friction, world, mass, x, y, sprite.getWidth(), sprite.getHeight(), IS_STATIC_DEFAULT);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param sprite the sprite for this
	 * @param friction the coefficient of friction for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param x the x ordinate of this in pixels
	 * @param y the y ordinate of this in pixels
	 * @param isStatic if this is capable of having motion
	 */
	public SpriteEntity(float scale, Sprite sprite, float friction, World world, float mass, float x, float y, boolean isStatic)
	{
		this(scale, sprite, friction, DEFAULT_RESTITUTION, world, mass, x, y, sprite.getWidth(), sprite.getHeight(), isStatic, CAN_ROTATE_DEFAULT);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param sprite the sprite for this
	 * @param friction the coefficient of friction for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param x the x ordinate of this in pixels
	 * @param y the y ordinate of this in pixels
	 * @param isStatic if this is capable of having motion
	 * @param canRotate if this is capable of rotating
	 */
	public SpriteEntity(float scale, Sprite sprite, float friction, World world, float mass, float x, float y, boolean isStatic, boolean canRotate)
	{
		this(scale, sprite, friction, DEFAULT_RESTITUTION, world, mass, x, y, sprite.getWidth(), sprite.getHeight(), isStatic, canRotate);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param sprite the sprite for this
	 * @param friction the coefficient of friction for this
	 * @param restitution the restitution for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param x the x ordinate of this in pixels
	 * @param y the y ordinate of this in pixels
	 */
	public SpriteEntity(float scale, Sprite sprite, float friction, float restitution, World world, float mass, float x, float y)
	{
		this(scale, sprite, friction, restitution, world, mass, x, y, sprite.getWidth(), sprite.getHeight(), IS_STATIC_DEFAULT);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param sprite the sprite for this
	 * @param friction the coefficient of friction for this
	 * @param restitution the restitution for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param x the x ordinate of this in pixels
	 * @param y the y ordinate of this in pixels
	 * @param isStatic if this is capable of having motion
	 */
	public SpriteEntity(float scale, Sprite sprite, float friction, float restitution, World world, float mass, float x, float y, boolean isStatic)
	{
		this(scale, sprite, friction, restitution, world, mass, x, y, sprite.getWidth(), sprite.getHeight(), isStatic, CAN_ROTATE_DEFAULT);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param sprite the sprite for this
	 * @param friction the coefficient of friction for this
	 * @param restitution the restitution for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param x the x ordinate of this in pixels
	 * @param y the y ordinate of this in pixels
	 * @param isStatic if this is capable of having motion
	 * @param canRotate if this is capable of rotating
	 */
	public SpriteEntity(float scale, Sprite sprite, float friction, float restitution, World world, float mass, float x, float y, boolean isStatic, boolean canRotate)
	{
		this(scale, sprite, friction, restitution, world, mass, x, y, sprite.getWidth(), sprite.getHeight(), isStatic, canRotate);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param sprite the sprite for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param x the x ordinate of this in pixels
	 * @param y the y ordinate of this in pixels
	 * @param width the width of this in pixels
	 * @param height the height of this in pixels
	 */
	public SpriteEntity(float scale, Sprite sprite, World world, float mass, float x, float y, float width, float height)
	{
		this(scale, sprite, DEFAULT_FRICTION, world, mass, x, y, width, height, IS_STATIC_DEFAULT);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param sprite the sprite for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param x the x ordinate of this in pixels
	 * @param y the y ordinate of this in pixels
	 * @param width the width of this in pixels
	 * @param height the height of this in pixels
	 * @param isStatic if this is capable of having motion
	 */
	public SpriteEntity(float scale, Sprite sprite, World world, float mass, float x, float y, float width, float height, boolean isStatic)
	{
		this(scale, sprite, DEFAULT_FRICTION, world, mass, x, y, width, height, isStatic);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param sprite the sprite for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param x the x ordinate of this in pixels
	 * @param y the y ordinate of this in pixels
	 * @param width the width of this in pixels
	 * @param height the height of this in pixels
	 * @param isStatic if this is capable of having motion
	 * @param canRotate if this is capable of rotating
	 */
	public SpriteEntity(float scale, Sprite sprite, World world, float mass, float x, float y, float width, float height, boolean isStatic, boolean canRotate)
	{
		this(scale, sprite, DEFAULT_FRICTION, world, mass, x, y, width, height, isStatic, canRotate);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param sprite the sprite for this
	 * @param friction the coefficient of friction for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param x the x ordinate of this in pixels
	 * @param y the y ordinate of this in pixels
	 * @param width the width of this in pixels
	 * @param height the height of this in pixels
	 */
	public SpriteEntity(float scale, Sprite sprite, float friction, World world, float mass, float x, float y, float width, float height)
	{
		this(scale, sprite, friction, world, mass, x, y, width, height, IS_STATIC_DEFAULT);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param sprite the sprite for this
	 * @param friction the coefficient of friction for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param x the x ordinate of this in pixels
	 * @param y the y ordinate of this in pixels
	 * @param width the width of this in pixels
	 * @param height the height of this in pixels
	 * @param isStatic if this is capable of having motion
	 */
	public SpriteEntity(float scale, Sprite sprite, float friction, World world, float mass, float x, float y, float width, float height, boolean isStatic)
	{
		this(scale, sprite, friction, world, mass, x, y, width, height, isStatic, CAN_ROTATE_DEFAULT);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param sprite the sprite for this
	 * @param friction the coefficient of friction for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param x the x ordinate of this in pixels
	 * @param y the y ordinate of this in pixels
	 * @param width the width of this in pixels
	 * @param height the height of this in pixels
	 * @param isStatic if this is capable of having motion
	 * @param canRotate if this is capable of rotating
	 */
	public SpriteEntity(float scale, Sprite sprite, float friction, World world, float mass, float x, float y, float width, float height, boolean isStatic, boolean canRotate)
	{
		this(scale, sprite, friction, DEFAULT_RESTITUTION, world, mass, x, y, width, height, isStatic, canRotate);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param sprite the sprite for this
	 * @param friction the coefficient of friction for this
	 * @param restitution the restitution for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param x the x ordinate of this in pixels
	 * @param y the y ordinate of this in pixels
	 * @param width the width of this in pixels
	 * @param height the height of this in pixels
	 */
	public SpriteEntity(float scale, Sprite sprite, float friction, float restitution, World world, float mass, float x, float y, float width, float height)
	{
		this(scale, sprite, friction, restitution, world, mass, x, y, width, height, IS_STATIC_DEFAULT, CAN_ROTATE_DEFAULT);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param sprite the sprite for this
	 * @param friction the coefficient of friction for this
	 * @param restitution the restitution for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param x the x ordinate of this in pixels
	 * @param y the y ordinate of this in pixels
	 * @param width the width of this in pixels
	 * @param height the height of this in pixels
	 * @param isStatic if this is capable of having motion
	 */
	public SpriteEntity(float scale, Sprite sprite, float friction, float restitution, World world, float mass, float x, float y, float width, float height, boolean isStatic)
	{
		this(scale, sprite, friction, restitution, world, mass, x, y, width, height, isStatic, CAN_ROTATE_DEFAULT);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param sprite the sprite for this
	 * @param friction the coefficient of friction for this
	 * @param restitution the restitution for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param x the x ordinate of this in pixels
	 * @param y the y ordinate of this in pixels
	 * @param width the width of this in pixels
	 * @param height the height of this in pixels
	 * @param isStatic if this is capable of having motion
	 * @param canRotate if this is capable of rotating
	 */
	public SpriteEntity(float scale, Sprite sprite, float friction, float restitution, World world, float mass, float x, float y, float width, float height, boolean isStatic, boolean canRotate)
	{
		super(friction, restitution, world, mass, x, y, width * scale, height * scale, isStatic, canRotate);
		
		sprite.setSize(width * scale, height * scale);
		this.sprite = sprite;
	}
	
	/**
	 * Gets the Sprite of this.
	 * 
	 * @return the Sprite of this
	 */
	@Override
	public Sprite getSprite()
	{
		return sprite;
	}
}
