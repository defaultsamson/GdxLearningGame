package net.qwertysam.entity;

import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;

import net.qwertysam.util.PhysicsUtil;

/**
 * An Entity with a square physics Body.
 */
public class BoxEntity extends Entity
{
	/** The width of this in pixels. */
	private float width;
	/** The width of this in pixels. */
	private float height;
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param width the width of this in pixels
	 * @param height the height of this in pixels
	 */
	public BoxEntity(World world, float mass, float width, float height)
	{
		this(DEFAULT_FRICTION, world, mass, 0F, 0F, width, height, IS_STATIC_DEFAULT);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param x the x ordinate of this in pixels
	 * @param y the y ordinate of this in pixels
	 * @param width the width of this in pixels
	 * @param height the height of this in pixels
	 */
	public BoxEntity(World world, float mass, float x, float y, float width, float height)
	{
		this(DEFAULT_FRICTION, world, mass, x, y, width, height, IS_STATIC_DEFAULT);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param width the width of this in pixels
	 * @param height the height of this in pixels
	 * @param isStatic if this is capable of having motion
	 */
	public BoxEntity(World world, float mass, float width, float height, boolean isStatic)
	{
		this(DEFAULT_FRICTION, world, mass, 0F, 0F, width, height, isStatic);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param width the width of this in pixels
	 * @param height the height of this in pixels
	 * @param isStatic if this is capable of having motion
	 * @param canRotate if this is capable of rotating
	 */
	public BoxEntity(World world, float mass, float width, float height, boolean isStatic, boolean canRotate)
	{
		this(DEFAULT_FRICTION, DEFAULT_RESTITUTION, world, mass, 0F, 0F, width, height, isStatic, canRotate);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param x the x ordinate of this in pixels
	 * @param y the y ordinate of this in pixels
	 * @param width the width of this in pixels
	 * @param height the height of this in pixels
	 * @param isStatic if this is capable of having motion
	 */
	public BoxEntity(World world, float mass, float x, float y, float width, float height, boolean isStatic)
	{
		this(DEFAULT_FRICTION, world, mass, x, y, width, height, isStatic);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param friction the coefficient of friction for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param width the width of this in pixels
	 * @param height the height of this in pixels
	 */
	public BoxEntity(float friction, World world, float mass, float width, float height)
	{
		this(friction, world, mass, 0F, 0F, width, height, IS_STATIC_DEFAULT);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param friction the coefficient of friction for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param x the x ordinate of this in pixels
	 * @param y the y ordinate of this in pixels
	 * @param width the width of this in pixels
	 * @param height the height of this in pixels
	 */
	public BoxEntity(float friction, World world, float mass, float x, float y, float width, float height)
	{
		this(friction, world, mass, x, y, width, height, IS_STATIC_DEFAULT);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param friction the coefficient of friction for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param width the width of this in pixels
	 * @param height the height of this in pixels
	 * @param isStatic if this is capable of having motion
	 */
	public BoxEntity(float friction, World world, float mass, float width, float height, boolean isStatic)
	{
		this(friction, world, mass, 0F, 0F, width, height, isStatic);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param friction the coefficient of friction for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param width the width of this in pixels
	 * @param height the height of this in pixels
	 * @param isStatic if this is capable of having motion
	 * @param canRotate if this is capable of rotating
	 */
	public BoxEntity(float friction, World world, float mass, float width, float height, boolean isStatic, boolean canRotate)
	{
		this(friction, DEFAULT_RESTITUTION, world, mass, 0F, 0F, width, height, isStatic, canRotate);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param friction the coefficient of friction for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param x the x ordinate of this in pixels
	 * @param y the y ordinate of this in pixels
	 * @param width the width of this in pixels
	 * @param height the height of this in pixels
	 * @param isStatic if this is capable of having motion
	 */
	public BoxEntity(float friction, World world, float mass, float x, float y, float width, float height, boolean isStatic)
	{
		this(friction, DEFAULT_RESTITUTION, world, mass, x, y, width, height, isStatic, CAN_ROTATE_DEFAULT);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param friction the coefficient of friction for this
	 * @param restitution the restitution for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param width the width of this in pixels
	 * @param height the height of this in pixels
	 */
	public BoxEntity(float friction, float restitution, World world, float mass, float width, float height)
	{
		this(friction, restitution, world, mass, 0F, 0F, width, height, IS_STATIC_DEFAULT, CAN_ROTATE_DEFAULT);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param friction the coefficient of friction for this
	 * @param restitution the restitution for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param x the x ordinate of this in pixels
	 * @param y the y ordinate of this in pixels
	 * @param width the width of this in pixels
	 * @param height the height of this in pixels
	 */
	public BoxEntity(float friction, float restitution, World world, float mass, float x, float y, float width, float height)
	{
		this(friction, restitution, world, mass, x, y, width, height, IS_STATIC_DEFAULT, CAN_ROTATE_DEFAULT);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param friction the coefficient of friction for this
	 * @param restitution the restitution for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param width the width of this in pixels
	 * @param height the height of this in pixels
	 * @param isStatic if this is capable of having motion
	 */
	public BoxEntity(float friction, float restitution, World world, float mass, float width, float height, boolean isStatic)
	{
		this(friction, restitution, world, mass, 0F, 0F, width, height, isStatic, CAN_ROTATE_DEFAULT);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
	 * @param friction the coefficient of friction for this
	 * @param restitution the restitution for this
	 * @param world the physics world that is in
	 * @param mass the mass of this in grams
	 * @param width the width of this in pixels
	 * @param height the height of this in pixels
	 * @param isStatic if this is capable of having motion
	 * @param canRotate if this is capable of rotating
	 */
	public BoxEntity(float friction, float restitution, World world, float mass, float width, float height, boolean isStatic, boolean canRotate)
	{
		this(friction, restitution, world, mass, 0F, 0F, width, height, isStatic, canRotate);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
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
	public BoxEntity(float friction, float restitution, World world, float mass, float x, float y, float width, float height, boolean isStatic)
	{
		this(friction, restitution, world, mass, x, y, width, height, isStatic, CAN_ROTATE_DEFAULT);
	}
	
	/**
	 * An Entity with a square physics Body.
	 * 
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
	public BoxEntity(float friction, float restitution, World world, float mass, float x, float y, float width, float height, boolean isStatic, boolean canRotate)
	{
		super(createBoxBody(friction, restitution, world, mass, x, y, width, height, isStatic, canRotate));
		
		this.width = width;
		this.height = height;
	}
	
	/**
	 * Creates a physics Body with the specified parameters.
	 * 
	 * @param world the world that the physics body is in
	 * @param x the x ordinate of the physics body in pixels
	 * @param y the y ordinate of the physics body in pixels
	 * @param width the width of the physics body in pixels
	 * @param height the height of the physics body in pixels
	 * @param isStatic if the physics body is capable of having motion
	 * @param canRotate if the physics body is capable of rotating
	 * @return a physics Body with the specified parameters.
	 */
	private static Body createBoxBody(float friction, float restitution, World world, float mass, float x, float y, float width, float height, boolean isStatic, boolean canRotate)
	{
		// Defines the physics object in the simulation
		BodyDef bodyDef = new BodyDef();
		
		if (isStatic)
		{
			bodyDef.type = BodyDef.BodyType.StaticBody;
		}
		else
		{
			bodyDef.type = BodyDef.BodyType.DynamicBody;
		}
		
		bodyDef.fixedRotation = !canRotate;
		
		// Set physics body to specified position in the physics engine in
		// meters
		bodyDef.position.set((x + width / 2) / PhysicsUtil.PIXELS_PER_METER, (y + height / 2) / PhysicsUtil.PIXELS_PER_METER);
		
		// Creates a body in the world using our definition
		Body body = world.createBody(bodyDef);
		
		// The shape for the fixture
		PolygonShape shape = new PolygonShape();
		// Set the dimensions of the shape in meters to that of the specified
		// width and height
		shape.setAsBox((width / 2) / PhysicsUtil.PIXELS_PER_METER, (height / 2) / PhysicsUtil.PIXELS_PER_METER);
		
		// The defining features of the Fixture
		FixtureDef fixtureDef = new FixtureDef();
		fixtureDef.shape = shape;
		// Calculates the density of the fixture from the specified mass and
		// area
		fixtureDef.density = mass / ((width / PhysicsUtil.PIXELS_PER_METER) * (height / PhysicsUtil.PIXELS_PER_METER)); // d=m/v
		fixtureDef.friction = friction;
		fixtureDef.restitution = restitution;
		
		// Adds the fixture to the physics body
		body.createFixture(fixtureDef);
		
		// Dispose the shape instance
		shape.dispose();
		
		return body;
	}
	
	/**
	 * Gets the height of this in pixels.
	 * 
	 * @return the height of this in pixels.
	 */
	public float getHeight()
	{
		return height;
	}
	
	/**
	 * Gets the width of this in pixels.
	 * 
	 * @return the width of this in pixels.
	 */
	public float getWidth()
	{
		return width;
	}
	
	/**
	 * Gets the bottom left x ordinate of this.
	 * 
	 * @return the bottom left x ordinate of this
	 */
	public float getX()
	{
		return getCenterX() - (getWidth() / 2);
	}
	
	/**
	 * Gets the bottom left y ordinate of this.
	 * 
	 * @return the bottom left y ordinate of this
	 */
	public float getY()
	{
		return getCenterY() - (getHeight() / 2);
	}
	
	/**
	 * Tells if this is fully contained within the specified BoundsEntity.
	 * 
	 * @param bounds the BoundsEntity to test for
	 * @return if this is fully contained within <b>bounds</b>.
	 */
	public boolean isInWorldBounds(BoundsEntity bounds)
	{
		return !(getX() < bounds.getX1() || getX() + getWidth() > bounds.getX2() || getY() < bounds.getY1() || getY() + getHeight() > bounds.getY2());
	}
}
