package net.qwertysam.api.entity.physics;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.physics.box2d.World;

import net.qwertysam.api.rendering.RenderUtil;
import net.qwertysam.api.rendering.Renderable;

//@Deprecated
public class PhysicsSpriteEntity extends PhysicsBoxEntity implements Renderable
{
	private Sprite sprite;
	
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
	public PhysicsSpriteEntity(World world, Sprite sprite, float friction, float restitution, float mass, float x, float y, boolean isStatic, boolean canRotate)
	{
		this(1F, world, sprite, friction, restitution, mass, x, y, sprite.getWidth(), sprite.getHeight(), isStatic, canRotate);
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
	public PhysicsSpriteEntity(World world, Sprite sprite, float friction, float restitution, float mass, float x, float y, float width, float height, boolean isStatic, boolean canRotate)
	{
		this(1F, world, sprite, friction, restitution, mass, x, y, width, height, isStatic, canRotate);
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
	public PhysicsSpriteEntity(float scale, World world, Sprite sprite, float friction, float restitution, float mass, float x, float y, boolean isStatic, boolean canRotate)
	{
		this(scale, world, sprite, friction, restitution, mass, x, y, sprite.getWidth(), sprite.getHeight(), isStatic, canRotate);
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
	public PhysicsSpriteEntity(float scale, World world, Sprite sprite, float friction, float restitution, float mass, float x, float y, float width, float height, boolean isStatic, boolean canRotate)
	{
		super(world, friction, restitution, mass, x, y, width * scale, height * scale, isStatic, canRotate);
		
		float scaledWidth = width * scale;
		float scaledHeight = height * scale;
		
		sprite.setOrigin(scaledWidth / 2, scaledHeight / 2);
		sprite.setSize(scaledWidth, scaledHeight);
		
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

	@Override
	public void render(SpriteBatch batch, float xOffset, float yOffset)
	{
		RenderUtil.defaultDraw(batch, sprite, getX(), getY(), xOffset, yOffset, getRotation());
	}
}
