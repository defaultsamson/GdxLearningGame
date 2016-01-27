package net.qwertysam.api.builder;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.physics.box2d.Body;

import box2dLight.ConeLight;
import box2dLight.PointLight;
import box2dLight.RayHandler;
import net.qwertysam.api.util.PhysicsUtil;

public class LightBuilder
{
	public static final boolean DEFAULT_XRAY = false;
	public static final float DEFAULT_SOFTNESS = 2F;
	public static final int DEFAULT_RAYS = 200;
	
	/**
	 * Creates a PointLight object.
	 * 
	 * @param rayHandler the RayHandler for the PointLight
	 * @param body the physics Body that the PointLight is attached to.
	 * @param colour the colour for the PointLight
	 * @param distance the distance of the light for the PointLight
	 * @return a PointLight with the given parameters.
	 */
	public static PointLight createPointLight(RayHandler rayHandler, Body body, Color colour, float distance)
	{
		return createPointLight(rayHandler, body, DEFAULT_RAYS, DEFAULT_SOFTNESS, colour, distance, DEFAULT_XRAY, 0F, 0F);
	}
	
	/**
	 * Creates a PointLight object.
	 * 
	 * @param rayHandler the RayHandler for the PointLight
	 * @param body the physics Body that the PointLight is attached to.
	 * @param colour the colour for the PointLight
	 * @param distance the distance of the light for the PointLight
	 * @param xRay if the light can pass through objects or not
	 * @return a PointLight with the given parameters.
	 */
	public static PointLight createPointLight(RayHandler rayHandler, Body body, Color colour, float distance, boolean xRay)
	{
		return createPointLight(rayHandler, body, DEFAULT_RAYS, DEFAULT_SOFTNESS, colour, distance, xRay, 0F, 0F);
	}
	
	/**
	 * Creates a PointLight object.
	 * 
	 * @param rayHandler the RayHandler for the PointLight
	 * @param body the physics Body that the PointLight is attached to.
	 * @param softness the ray softness for the PointLight
	 * @param colour the colour for the PointLight
	 * @param distance the distance of the light for the PointLight
	 * @return a PointLight with the given parameters.
	 */
	public static PointLight createPointLight(RayHandler rayHandler, Body body, float softness, Color colour, float distance)
	{
		return createPointLight(rayHandler, body, DEFAULT_RAYS, softness, colour, distance, DEFAULT_XRAY, 0F, 0F);
	}
	
	/**
	 * Creates a PointLight object.
	 * 
	 * @param rayHandler the RayHandler for the PointLight
	 * @param body the physics Body that the PointLight is attached to.
	 * @param softness the ray softness for the PointLight
	 * @param colour the colour for the PointLight
	 * @param distance the distance of the light for the PointLight
	 * @param xRay if the light can pass through objects or not
	 * @return a PointLight with the given parameters.
	 */
	public static PointLight createPointLight(RayHandler rayHandler, Body body, float softness, Color colour, float distance, boolean xRay)
	{
		return createPointLight(rayHandler, body, DEFAULT_RAYS, softness, colour, distance, xRay, 0F, 0F);
	}
	
	/**
	 * Creates a PointLight object.
	 * 
	 * @param rayHandler the RayHandler for the PointLight
	 * @param body the physics Body that the PointLight is attached to.
	 * @param rays the ray count for the PointLight
	 * @param colour the colour for the PointLight
	 * @param distance the distance of the light for the PointLight
	 * @return a PointLight with the given parameters.
	 */
	public static PointLight createPointLight(RayHandler rayHandler, Body body, int rays, Color colour, float distance)
	{
		return createPointLight(rayHandler, body, rays, DEFAULT_SOFTNESS, colour, distance, DEFAULT_XRAY, 0F, 0F);
	}
	
	/**
	 * Creates a PointLight object.
	 * 
	 * @param rayHandler the RayHandler for the PointLight
	 * @param body the physics Body that the PointLight is attached to.
	 * @param rays the ray count for the PointLight
	 * @param colour the colour for the PointLight
	 * @param distance the distance of the light for the PointLight
	 * @param xRay if the light can pass through objects or not
	 * @return a PointLight with the given parameters.
	 */
	public static PointLight createPointLight(RayHandler rayHandler, Body body, int rays, Color colour, float distance, boolean xRay)
	{
		return createPointLight(rayHandler, body, rays, DEFAULT_SOFTNESS, colour, distance, xRay, 0F, 0F);
	}
	
	/**
	 * Creates a PointLight object.
	 * 
	 * @param rayHandler the RayHandler for the PointLight
	 * @param body the physics Body that the PointLight is attached to.
	 * @param rays the ray count for the PointLight
	 * @param softness the ray softness for the PointLight
	 * @param colour the colour for the PointLight
	 * @param distance the distance of the light for the PointLight
	 * @return a PointLight with the given parameters.
	 */
	public static PointLight createPointLight(RayHandler rayHandler, Body body, int rays, float softness, Color colour, float distance)
	{
		return createPointLight(rayHandler, body, rays, softness, colour, distance, DEFAULT_XRAY, 0F, 0F);
	}
	
	/**
	 * Creates a PointLight object.
	 * 
	 * @param rayHandler the RayHandler for the PointLight
	 * @param body the physics Body that the PointLight is attached to.
	 * @param rays the ray count for the PointLight
	 * @param softness the ray softness for the PointLight
	 * @param colour the colour for the PointLight
	 * @param distance the distance of the light for the PointLight
	 * @param xRay if the light can pass through objects or not
	 * @return a PointLight with the given parameters.
	 */
	public static PointLight createPointLight(RayHandler rayHandler, Body body, int rays, float softness, Color colour, float distance, boolean xRay)
	{
		return createPointLight(rayHandler, body, rays, softness, colour, distance, xRay, 0F, 0F);
	}
	
	/**
	 * Creates a PointLight object.
	 * 
	 * @param rayHandler the RayHandler for the PointLight
	 * @param colour the colour for the PointLight
	 * @param distance the distance of the light for the PointLight
	 * @return a PointLight with the given parameters.
	 */
	public static PointLight createPointLight(RayHandler rayHandler, Color colour, float distance)
	{
		return createPointLight(rayHandler, null, DEFAULT_RAYS, DEFAULT_SOFTNESS, colour, distance, DEFAULT_XRAY, 0F, 0F);
	}
	
	/**
	 * Creates a PointLight object.
	 * 
	 * @param rayHandler the RayHandler for the PointLight
	 * @param colour the colour for the PointLight
	 * @param distance the distance of the light for the PointLight
	 * @param x the x ordinate of the light in pixels
	 * @param y the y ordinate of the light in pixels
	 * @return a PointLight with the given parameters.
	 */
	public static PointLight createPointLight(RayHandler rayHandler, Color colour, float distance, float x, float y)
	{
		return createPointLight(rayHandler, null, DEFAULT_RAYS, DEFAULT_SOFTNESS, colour, distance, DEFAULT_XRAY, x, y);
	}
	
	/**
	 * Creates a PointLight object.
	 * 
	 * @param rayHandler the RayHandler for the PointLight
	 * @param colour the colour for the PointLight
	 * @param distance the distance of the light for the PointLight
	 * @param xRay if the light can pass through objects or not
	 * @return a PointLight with the given parameters.
	 */
	public static PointLight createPointLight(RayHandler rayHandler, Color colour, float distance, boolean xRay)
	{
		return createPointLight(rayHandler, null, DEFAULT_RAYS, DEFAULT_SOFTNESS, colour, distance, xRay, 0F, 0F);
	}
	
	/**
	 * Creates a PointLight object.
	 * 
	 * @param rayHandler the RayHandler for the PointLight
	 * @param colour the colour for the PointLight
	 * @param distance the distance of the light for the PointLight
	 * @param xRay if the light can pass through objects or not
	 * @param x the x ordinate of the light in pixels
	 * @param y the y ordinate of the light in pixels
	 * @return a PointLight with the given parameters.
	 */
	public static PointLight createPointLight(RayHandler rayHandler, Color colour, float distance, boolean xRay, float x, float y)
	{
		return createPointLight(rayHandler, null, DEFAULT_RAYS, DEFAULT_SOFTNESS, colour, distance, xRay, x, y);
	}
	
	/**
	 * Creates a PointLight object.
	 * 
	 * @param rayHandler the RayHandler for the PointLight
	 * @param softness the ray softness for the PointLight
	 * @param colour the colour for the PointLight
	 * @param distance the distance of the light for the PointLight
	 * @return a PointLight with the given parameters.
	 */
	public static PointLight createPointLight(RayHandler rayHandler, float softness, Color colour, float distance)
	{
		return createPointLight(rayHandler, null, DEFAULT_RAYS, softness, colour, distance, DEFAULT_XRAY, 0F, 0F);
	}
	
	/**
	 * Creates a PointLight object.
	 * 
	 * @param rayHandler the RayHandler for the PointLight
	 * @param softness the ray softness for the PointLight
	 * @param colour the colour for the PointLight
	 * @param distance the distance of the light for the PointLight
	 * @param x the x ordinate of the light in pixels
	 * @param y the y ordinate of the light in pixels
	 * @return a PointLight with the given parameters.
	 */
	public static PointLight createPointLight(RayHandler rayHandler, float softness, Color colour, float distance, float x, float y)
	{
		return createPointLight(rayHandler, null, DEFAULT_RAYS, softness, colour, distance, DEFAULT_XRAY, x, y);
	}
	
	/**
	 * Creates a PointLight object.
	 * 
	 * @param rayHandler the RayHandler for the PointLight
	 * @param softness the ray softness for the PointLight
	 * @param colour the colour for the PointLight
	 * @param distance the distance of the light for the PointLight
	 * @param xRay if the light can pass through objects or not
	 * @return a PointLight with the given parameters.
	 */
	public static PointLight createPointLight(RayHandler rayHandler, float softness, Color colour, float distance, boolean xRay)
	{
		return createPointLight(rayHandler, null, DEFAULT_RAYS, softness, colour, distance, xRay, 0F, 0F);
	}
	
	/**
	 * Creates a PointLight object.
	 * 
	 * @param rayHandler the RayHandler for the PointLight
	 * @param softness the ray softness for the PointLight
	 * @param colour the colour for the PointLight
	 * @param distance the distance of the light for the PointLight
	 * @param xRay if the light can pass through objects or not
	 * @param x the x ordinate of the light in pixels
	 * @param y the y ordinate of the light in pixels
	 * @return a PointLight with the given parameters.
	 */
	public static PointLight createPointLight(RayHandler rayHandler, float softness, Color colour, float distance, boolean xRay, float x, float y)
	{
		return createPointLight(rayHandler, null, DEFAULT_RAYS, softness, colour, distance, xRay, x, y);
	}
	
	/**
	 * Creates a PointLight object.
	 * 
	 * @param rayHandler the RayHandler for the PointLight
	 * @param body the physics Body that the PointLight is attached to. If not
	 *            null, will ignore <b>x</b> and <b>y</b> ordinates.
	 * @param rays the ray count for the PointLight
	 * @param colour the colour for the PointLight
	 * @param distance the distance of the light for the PointLight
	 * @return a PointLight with the given parameters.
	 */
	public static PointLight createPointLight(RayHandler rayHandler, int rays, Color colour, float distance)
	{
		return createPointLight(rayHandler, null, rays, DEFAULT_SOFTNESS, colour, distance, DEFAULT_XRAY, 0F, 0F);
	}
	
	/**
	 * Creates a PointLight object.
	 * 
	 * @param rayHandler the RayHandler for the PointLight
	 * @param rays the ray count for the PointLight
	 * @param colour the colour for the PointLight
	 * @param distance the distance of the light for the PointLight
	 * @param x the x ordinate of the light in pixels
	 * @param y the y ordinate of the light in pixels
	 * @return a PointLight with the given parameters.
	 */
	public static PointLight createPointLight(RayHandler rayHandler, int rays, Color colour, float distance, float x, float y)
	{
		return createPointLight(rayHandler, null, rays, DEFAULT_SOFTNESS, colour, distance, DEFAULT_XRAY, x, y);
	}
	
	/**
	 * Creates a PointLight object.
	 * 
	 * @param rayHandler the RayHandler for the PointLight
	 * @param rays the ray count for the PointLight
	 * @param colour the colour for the PointLight
	 * @param distance the distance of the light for the PointLight
	 * @param xRay if the light can pass through objects or not
	 * @return a PointLight with the given parameters.
	 */
	public static PointLight createPointLight(RayHandler rayHandler, int rays, Color colour, float distance, boolean xRay)
	{
		return createPointLight(rayHandler, null, rays, DEFAULT_SOFTNESS, colour, distance, xRay, 0F, 0F);
	}
	
	/**
	 * Creates a PointLight object.
	 * 
	 * @param rayHandler the RayHandler for the PointLight
	 * @param rays the ray count for the PointLight
	 * @param colour the colour for the PointLight
	 * @param distance the distance of the light for the PointLight
	 * @param xRay if the light can pass through objects or not
	 * @param x the x ordinate of the light in pixels
	 * @param y the y ordinate of the light in pixels
	 * @return a PointLight with the given parameters.
	 */
	public static PointLight createPointLight(RayHandler rayHandler, int rays, Color colour, float distance, boolean xRay, float x, float y)
	{
		return createPointLight(rayHandler, null, rays, DEFAULT_SOFTNESS, colour, distance, xRay, y, x);
	}
	
	/**
	 * Creates a PointLight object.
	 * 
	 * @param rayHandler the RayHandler for the PointLight
	 * @param rays the ray count for the PointLight
	 * @param softness the ray softness for the PointLight
	 * @param colour the colour for the PointLight
	 * @param distance the distance of the light for the PointLight
	 * @return a PointLight with the given parameters.
	 */
	public static PointLight createPointLight(RayHandler rayHandler, int rays, float softness, Color colour, float distance)
	{
		return createPointLight(rayHandler, null, rays, softness, colour, distance, DEFAULT_XRAY, 0F, 0F);
	}
	
	/**
	 * Creates a PointLight object.
	 * 
	 * @param rayHandler the RayHandler for the PointLight
	 * @param rays the ray count for the PointLight
	 * @param softness the ray softness for the PointLight
	 * @param colour the colour for the PointLight
	 * @param distance the distance of the light for the PointLight
	 * @param x the x ordinate of the light in pixels
	 * @param y the y ordinate of the light in pixels
	 * @return a PointLight with the given parameters.
	 */
	public static PointLight createPointLight(RayHandler rayHandler, int rays, float softness, Color colour, float distance, float x, float y)
	{
		return createPointLight(rayHandler, null, rays, softness, colour, distance, DEFAULT_XRAY, x, y);
	}
	
	/**
	 * Creates a PointLight object.
	 * 
	 * @param rayHandler the RayHandler for the PointLight
	 * @param rays the ray count for the PointLight
	 * @param softness the ray softness for the PointLight
	 * @param colour the colour for the PointLight
	 * @param distance the distance of the light for the PointLight
	 * @param xRay if the light can pass through objects or not
	 * @return a PointLight with the given parameters.
	 */
	public static PointLight createPointLight(RayHandler rayHandler, int rays, float softness, Color colour, float distance, boolean xRay)
	{
		return createPointLight(rayHandler, null, rays, softness, colour, distance, xRay, 0F, 0F);
	}
	
	/**
	 * Creates a PointLight object.
	 * 
	 * @param rayHandler the RayHandler for the PointLight
	 * @param body the physics Body that the PointLight is attached to. If not
	 *            null, will ignore <b>x</b> and <b>y</b> ordinates.
	 * @param rays the ray count for the PointLight
	 * @param softness the ray softness for the PointLight
	 * @param colour the colour for the PointLight
	 * @param distance the distance of the light for the PointLight
	 * @param xRay if the light can pass through objects or not
	 * @param x the x ordinate of the light in pixels
	 * @param y the y ordinate of the light in pixels
	 * @return a PointLight with the given parameters.
	 */
	public static PointLight createPointLight(RayHandler rayHandler, Body body, int rays, float softness, Color colour, float distance, boolean xRay, float x, float y)
	{
		PointLight light = new PointLight(rayHandler, rays, colour, distance / PhysicsUtil.PIXELS_PER_METER, x / PhysicsUtil.PIXELS_PER_METER, y / PhysicsUtil.PIXELS_PER_METER);
		light.setSoftnessLength(softness);
		light.setXray(xRay);
		light.attachToBody(body);
		
		return light;
	}
	
	/**
	 * Creates a ConeLight object.
	 * 
	 * @param rayHandler the RayHandler for the ConeLight
	 * @param body the physics Body that the ConeLight is attached to.
	 * @param colour the colour for the ConeLight
	 * @param distance the distance of the light for the ConeLight
	 * @param dir the direction that the light is aiming in degrees
	 * @param cone spanning width degree of the light (0 degrees - 360 degrees)
	 * @return a ConeLight with the given parameters.
	 */
	public static ConeLight createConeLight(RayHandler rayHandler, Body body, Color colour, float distance, float dir, float cone)
	{
		return createConeLight(rayHandler, body, DEFAULT_RAYS, DEFAULT_SOFTNESS, colour, distance, DEFAULT_XRAY, 0F, 0F, dir, cone);
	}
	
	/**
	 * Creates a ConeLight object.
	 * 
	 * @param rayHandler the RayHandler for the ConeLight
	 * @param body the physics Body that the ConeLight is attached to.
	 * @param colour the colour for the ConeLight
	 * @param distance the distance of the light for the ConeLight
	 * @param xRay if the light can pass through objects or not
	 * @param dir the direction that the light is aiming in degrees
	 * @param cone spanning width degree of the light (0 degrees - 360 degrees)
	 * @return a ConeLight with the given parameters.
	 */
	public static ConeLight createConeLight(RayHandler rayHandler, Body body, Color colour, float distance, boolean xRay, float dir, float cone)
	{
		return createConeLight(rayHandler, body, DEFAULT_RAYS, DEFAULT_SOFTNESS, colour, distance, xRay, 0F, 0F, dir, cone);
	}
	
	/**
	 * Creates a ConeLight object.
	 * 
	 * @param rayHandler the RayHandler for the ConeLight
	 * @param body the physics Body that the ConeLight is attached to.
	 * @param softness the ray softness for the ConeLight
	 * @param colour the colour for the ConeLight
	 * @param distance the distance of the light for the ConeLight
	 * @param dir the direction that the light is aiming in degrees
	 * @param cone spanning width degree of the light (0 degrees - 360 degrees)
	 * @return a ConeLight with the given parameters.
	 */
	public static ConeLight createConeLight(RayHandler rayHandler, Body body, float softness, Color colour, float distance, float dir, float cone)
	{
		return createConeLight(rayHandler, body, DEFAULT_RAYS, softness, colour, distance, DEFAULT_XRAY, 0F, 0F, dir, cone);
	}
	
	/**
	 * Creates a ConeLight object.
	 * 
	 * @param rayHandler the RayHandler for the ConeLight
	 * @param body the physics Body that the ConeLight is attached to.
	 * @param softness the ray softness for the ConeLight
	 * @param colour the colour for the ConeLight
	 * @param distance the distance of the light for the ConeLight
	 * @param xRay if the light can pass through objects or not
	 * @param dir the direction that the light is aiming in degrees
	 * @param cone spanning width degree of the light (0 degrees - 360 degrees)
	 * @return a ConeLight with the given parameters.
	 */
	public static ConeLight createConeLight(RayHandler rayHandler, Body body, float softness, Color colour, float distance, boolean xRay, float dir, float cone)
	{
		return createConeLight(rayHandler, body, DEFAULT_RAYS, softness, colour, distance, xRay, 0F, 0F, dir, cone);
	}
	
	/**
	 * Creates a ConeLight object.
	 * 
	 * @param rayHandler the RayHandler for the ConeLight
	 * @param body the physics Body that the ConeLight is attached to.
	 * @param rays the ray count for the ConeLight
	 * @param colour the colour for the ConeLight
	 * @param distance the distance of the light for the ConeLight
	 * @param dir the direction that the light is aiming in degrees
	 * @param cone spanning width degree of the light (0 degrees - 360 degrees)
	 * @return a ConeLight with the given parameters.
	 */
	public static ConeLight createConeLight(RayHandler rayHandler, Body body, int rays, Color colour, float distance, float dir, float cone)
	{
		return createConeLight(rayHandler, body, rays, DEFAULT_SOFTNESS, colour, distance, DEFAULT_XRAY, 0F, 0F, dir, cone);
	}
	
	/**
	 * Creates a ConeLight object.
	 * 
	 * @param rayHandler the RayHandler for the ConeLight
	 * @param body the physics Body that the ConeLight is attached to.
	 * @param rays the ray count for the ConeLight
	 * @param colour the colour for the ConeLight
	 * @param distance the distance of the light for the ConeLight
	 * @param xRay if the light can pass through objects or not
	 * @param dir the direction that the light is aiming in degrees
	 * @param cone spanning width degree of the light (0 degrees - 360 degrees)
	 * @return a ConeLight with the given parameters.
	 */
	public static ConeLight createConeLight(RayHandler rayHandler, Body body, int rays, Color colour, float distance, boolean xRay, float dir, float cone)
	{
		return createConeLight(rayHandler, body, rays, DEFAULT_SOFTNESS, colour, distance, xRay, 0F, 0F, dir, cone);
	}
	
	/**
	 * Creates a ConeLight object.
	 * 
	 * @param rayHandler the RayHandler for the ConeLight
	 * @param body the physics Body that the ConeLight is attached to.
	 * @param rays the ray count for the ConeLight
	 * @param softness the ray softness for the ConeLight
	 * @param colour the colour for the ConeLight
	 * @param distance the distance of the light for the ConeLight
	 * @param dir the direction that the light is aiming in degrees
	 * @param cone spanning width degree of the light (0 degrees - 360 degrees)
	 * @return a ConeLight with the given parameters.
	 */
	public static ConeLight createConeLight(RayHandler rayHandler, Body body, int rays, float softness, Color colour, float distance, float dir, float cone)
	{
		return createConeLight(rayHandler, body, rays, softness, colour, distance, DEFAULT_XRAY, 0F, 0F, dir, cone);
	}
	
	/**
	 * Creates a ConeLight object.
	 * 
	 * @param rayHandler the RayHandler for the ConeLight
	 * @param body the physics Body that the ConeLight is attached to.
	 * @param rays the ray count for the ConeLight
	 * @param softness the ray softness for the ConeLight
	 * @param colour the colour for the ConeLight
	 * @param distance the distance of the light for the ConeLight
	 * @param xRay if the light can pass through objects or not
	 * @param dir the direction that the light is aiming in degrees
	 * @param cone spanning width degree of the light (0 degrees - 360 degrees)
	 * @return a ConeLight with the given parameters.
	 */
	public static ConeLight createConeLight(RayHandler rayHandler, Body body, int rays, float softness, Color colour, float distance, boolean xRay, float dir, float cone)
	{
		return createConeLight(rayHandler, body, rays, softness, colour, distance, xRay, 0F, 0F, dir, cone);
	}
	
	/**
	 * Creates a ConeLight object.
	 * 
	 * @param rayHandler the RayHandler for the ConeLight
	 * @param colour the colour for the ConeLight
	 * @param distance the distance of the light for the ConeLight
	 * @param dir the direction that the light is aiming in degrees
	 * @param cone spanning width degree of the light (0 degrees - 360 degrees)
	 * @return a ConeLight with the given parameters.
	 */
	public static ConeLight createConeLight(RayHandler rayHandler, Color colour, float distance, float dir, float cone)
	{
		return createConeLight(rayHandler, null, DEFAULT_RAYS, DEFAULT_SOFTNESS, colour, distance, DEFAULT_XRAY, 0F, 0F, dir, cone);
	}
	
	/**
	 * Creates a ConeLight object.
	 * 
	 * @param rayHandler the RayHandler for the ConeLight
	 * @param colour the colour for the ConeLight
	 * @param distance the distance of the light for the ConeLight
	 * @param x the x ordinate of the light in pixels
	 * @param y the y ordinate of the light in pixels
	 * @param dir the direction that the light is aiming in degrees
	 * @param cone spanning width degree of the light (0 degrees - 360 degrees)
	 * @return a ConeLight with the given parameters.
	 */
	public static ConeLight createConeLight(RayHandler rayHandler, Color colour, float distance, float x, float y, float dir, float cone)
	{
		return createConeLight(rayHandler, null, DEFAULT_RAYS, DEFAULT_SOFTNESS, colour, distance, DEFAULT_XRAY, x, y, dir, cone);
	}
	
	/**
	 * Creates a ConeLight object.
	 * 
	 * @param rayHandler the RayHandler for the ConeLight
	 * @param colour the colour for the ConeLight
	 * @param distance the distance of the light for the ConeLight
	 * @param xRay if the light can pass through objects or not
	 * @param dir the direction that the light is aiming in degrees
	 * @param cone spanning width degree of the light (0 degrees - 360 degrees)
	 * @return a ConeLight with the given parameters.
	 */
	public static ConeLight createConeLight(RayHandler rayHandler, Color colour, float distance, boolean xRay, float dir, float cone)
	{
		return createConeLight(rayHandler, null, DEFAULT_RAYS, DEFAULT_SOFTNESS, colour, distance, xRay, 0F, 0F, dir, cone);
	}
	
	/**
	 * Creates a ConeLight object.
	 * 
	 * @param rayHandler the RayHandler for the ConeLight
	 * @param colour the colour for the ConeLight
	 * @param distance the distance of the light for the ConeLight
	 * @param xRay if the light can pass through objects or not
	 * @param x the x ordinate of the light in pixels
	 * @param y the y ordinate of the light in pixels
	 * @param dir the direction that the light is aiming in degrees
	 * @param cone spanning width degree of the light (0 degrees - 360 degrees)
	 * @return a ConeLight with the given parameters.
	 */
	public static ConeLight createConeLight(RayHandler rayHandler, Color colour, float distance, boolean xRay, float x, float y, float dir, float cone)
	{
		return createConeLight(rayHandler, null, DEFAULT_RAYS, DEFAULT_SOFTNESS, colour, distance, xRay, x, y, dir, cone);
	}
	
	/**
	 * Creates a ConeLight object.
	 * 
	 * @param rayHandler the RayHandler for the ConeLight
	 * @param softness the ray softness for the ConeLight
	 * @param colour the colour for the ConeLight
	 * @param distance the distance of the light for the ConeLight
	 * @param dir the direction that the light is aiming in degrees
	 * @param cone spanning width degree of the light (0 degrees - 360 degrees)
	 * @return a ConeLight with the given parameters.
	 */
	public static ConeLight createConeLight(RayHandler rayHandler, float softness, Color colour, float distance, float dir, float cone)
	{
		return createConeLight(rayHandler, null, DEFAULT_RAYS, softness, colour, distance, DEFAULT_XRAY, 0F, 0F, dir, cone);
	}
	
	/**
	 * Creates a ConeLight object.
	 * 
	 * @param rayHandler the RayHandler for the ConeLight
	 * @param softness the ray softness for the ConeLight
	 * @param colour the colour for the ConeLight
	 * @param distance the distance of the light for the ConeLight
	 * @param x the x ordinate of the light in pixels
	 * @param y the y ordinate of the light in pixels
	 * @param dir the direction that the light is aiming in degrees
	 * @param cone spanning width degree of the light (0 degrees - 360 degrees)
	 * @return a ConeLight with the given parameters.
	 */
	public static ConeLight createConeLight(RayHandler rayHandler, float softness, Color colour, float distance, float x, float y, float dir, float cone)
	{
		return createConeLight(rayHandler, null, DEFAULT_RAYS, softness, colour, distance, DEFAULT_XRAY, x, y, dir, cone);
	}
	
	/**
	 * Creates a ConeLight object.
	 * 
	 * @param rayHandler the RayHandler for the ConeLight
	 * @param softness the ray softness for the ConeLight
	 * @param colour the colour for the ConeLight
	 * @param distance the distance of the light for the ConeLight
	 * @param xRay if the light can pass through objects or not
	 * @param dir the direction that the light is aiming in degrees
	 * @param cone spanning width degree of the light (0 degrees - 360 degrees)
	 * @return a ConeLight with the given parameters.
	 */
	public static ConeLight createConeLight(RayHandler rayHandler, float softness, Color colour, float distance, boolean xRay, float dir, float cone)
	{
		return createConeLight(rayHandler, null, DEFAULT_RAYS, softness, colour, distance, xRay, 0F, 0F, dir, cone);
	}
	
	/**
	 * Creates a ConeLight object.
	 * 
	 * @param rayHandler the RayHandler for the ConeLight
	 * @param softness the ray softness for the ConeLight
	 * @param colour the colour for the ConeLight
	 * @param distance the distance of the light for the ConeLight
	 * @param xRay if the light can pass through objects or not
	 * @param x the x ordinate of the light in pixels
	 * @param y the y ordinate of the light in pixels
	 * @param dir the direction that the light is aiming in degrees
	 * @param cone spanning width degree of the light (0 degrees - 360 degrees)
	 * @return a ConeLight with the given parameters.
	 */
	public static ConeLight createConeLight(RayHandler rayHandler, float softness, Color colour, float distance, boolean xRay, float x, float y, float dir, float cone)
	{
		return createConeLight(rayHandler, null, DEFAULT_RAYS, softness, colour, distance, xRay, x, y, dir, cone);
	}
	
	/**
	 * Creates a ConeLight object.
	 * 
	 * @param rayHandler the RayHandler for the ConeLight
	 * @param body the physics Body that the ConeLight is attached to. If not
	 *            null, will ignore <b>x</b> and <b>y</b> ordinates.
	 * @param rays the ray count for the ConeLight
	 * @param colour the colour for the ConeLight
	 * @param distance the distance of the light for the ConeLight
	 * @param dir the direction that the light is aiming in degrees
	 * @param cone spanning width degree of the light (0 degrees - 360 degrees)
	 * @return a ConeLight with the given parameters.
	 */
	public static ConeLight createConeLight(RayHandler rayHandler, int rays, Color colour, float distance, float dir, float cone)
	{
		return createConeLight(rayHandler, null, rays, DEFAULT_SOFTNESS, colour, distance, DEFAULT_XRAY, 0F, 0F, dir, cone);
	}
	
	/**
	 * Creates a ConeLight object.
	 * 
	 * @param rayHandler the RayHandler for the ConeLight
	 * @param rays the ray count for the ConeLight
	 * @param colour the colour for the ConeLight
	 * @param distance the distance of the light for the ConeLight
	 * @param x the x ordinate of the light in pixels
	 * @param y the y ordinate of the light in pixels
	 * @param dir the direction that the light is aiming in degrees
	 * @param cone spanning width degree of the light (0 degrees - 360 degrees)
	 * @return a ConeLight with the given parameters.
	 */
	public static ConeLight createConeLight(RayHandler rayHandler, int rays, Color colour, float distance, float x, float y, float dir, float cone)
	{
		return createConeLight(rayHandler, null, rays, DEFAULT_SOFTNESS, colour, distance, DEFAULT_XRAY, x, y, dir, cone);
	}
	
	/**
	 * Creates a ConeLight object.
	 * 
	 * @param rayHandler the RayHandler for the ConeLight
	 * @param rays the ray count for the ConeLight
	 * @param colour the colour for the ConeLight
	 * @param distance the distance of the light for the ConeLight
	 * @param xRay if the light can pass through objects or not
	 * @param dir the direction that the light is aiming in degrees
	 * @param cone spanning width degree of the light (0 degrees - 360 degrees)
	 * @return a ConeLight with the given parameters.
	 */
	public static ConeLight createConeLight(RayHandler rayHandler, int rays, Color colour, float distance, boolean xRay, float dir, float cone)
	{
		return createConeLight(rayHandler, null, rays, DEFAULT_SOFTNESS, colour, distance, xRay, 0F, 0F, dir, cone);
	}
	
	/**
	 * Creates a ConeLight object.
	 * 
	 * @param rayHandler the RayHandler for the ConeLight
	 * @param rays the ray count for the ConeLight
	 * @param colour the colour for the ConeLight
	 * @param distance the distance of the light for the ConeLight
	 * @param xRay if the light can pass through objects or not
	 * @param x the x ordinate of the light in pixels
	 * @param y the y ordinate of the light in pixels
	 * @param dir the direction that the light is aiming in degrees
	 * @param cone spanning width degree of the light (0 degrees - 360 degrees)
	 * @return a ConeLight with the given parameters.
	 */
	public static ConeLight createConeLight(RayHandler rayHandler, int rays, Color colour, float distance, boolean xRay, float x, float y, float dir, float cone)
	{
		return createConeLight(rayHandler, null, rays, DEFAULT_SOFTNESS, colour, distance, xRay, y, x, dir, cone);
	}
	
	/**
	 * Creates a ConeLight object.
	 * 
	 * @param rayHandler the RayHandler for the ConeLight
	 * @param rays the ray count for the ConeLight
	 * @param softness the ray softness for the ConeLight
	 * @param colour the colour for the ConeLight
	 * @param distance the distance of the light for the ConeLight
	 * @param dir the direction that the light is aiming in degrees
	 * @param cone spanning width degree of the light (0 degrees - 360 degrees)
	 * @return a ConeLight with the given parameters.
	 */
	public static ConeLight createConeLight(RayHandler rayHandler, int rays, float softness, Color colour, float distance, float dir, float cone)
	{
		return createConeLight(rayHandler, null, rays, softness, colour, distance, DEFAULT_XRAY, 0F, 0F, dir, cone);
	}
	
	/**
	 * Creates a ConeLight object.
	 * 
	 * @param rayHandler the RayHandler for the ConeLight
	 * @param rays the ray count for the ConeLight
	 * @param softness the ray softness for the ConeLight
	 * @param colour the colour for the ConeLight
	 * @param distance the distance of the light for the ConeLight
	 * @param x the x ordinate of the light in pixels
	 * @param y the y ordinate of the light in pixels
	 * @param dir the direction that the light is aiming in degrees
	 * @param cone spanning width degree of the light (0 degrees - 360 degrees)
	 * @return a ConeLight with the given parameters.
	 */
	public static ConeLight createConeLight(RayHandler rayHandler, int rays, float softness, Color colour, float distance, float x, float y, float dir, float cone)
	{
		return createConeLight(rayHandler, null, rays, softness, colour, distance, DEFAULT_XRAY, x, y, dir, cone);
	}
	
	/**
	 * Creates a ConeLight object.
	 * 
	 * @param rayHandler the RayHandler for the ConeLight
	 * @param rays the ray count for the ConeLight
	 * @param softness the ray softness for the ConeLight
	 * @param colour the colour for the ConeLight
	 * @param distance the distance of the light for the ConeLight
	 * @param xRay if the light can pass through objects or not
	 * @param dir the direction that the light is aiming in degrees
	 * @param cone spanning width degree of the light (0 degrees - 360 degrees)
	 * @return a ConeLight with the given parameters.
	 */
	public static ConeLight createConeLight(RayHandler rayHandler, int rays, float softness, Color colour, float distance, boolean xRay, float dir, float cone)
	{
		return createConeLight(rayHandler, null, rays, softness, colour, distance, xRay, 0F, 0F, dir, cone);
	}
	
	/**
	 * Creates a ConeLight object.
	 * 
	 * @param rayHandler the RayHandler for the ConeLight
	 * @param rays the ray count for the ConeLight
	 * @param softness the ray softness for the ConeLight
	 * @param colour the colour for the ConeLight
	 * @param distance the distance of the light for the ConeLight
	 * @param xRay if the light can pass through objects or not
	 * @param x the x ordinate of the light in pixels
	 * @param y the y ordinate of the light in pixels
	 * @param dir the direction that the light is aiming in degrees
	 * @param cone spanning width degree of the light (0 degrees - 360 degrees)
	 * @return a ConeLight with the given parameters.
	 */
	public static ConeLight createConeLight(RayHandler rayHandler, int rays, float softness, Color colour, float distance, boolean xRay, float x, float y, float dir, float cone)
	{
		return createConeLight(rayHandler, null, rays, softness, colour, distance, xRay, x, y, dir, cone);
	}
	
	/**
	 * Creates a ConeLight object.
	 * 
	 * @param rayHandler the RayHandler for the ConeLight
	 * @param body the physics Body that the ConeLight is attached to. If not
	 *            null, will ignore <b>x</b> and <b>y</b> ordinates.
	 * @param rays the ray count for the ConeLight
	 * @param softness the ray softness for the ConeLight
	 * @param colour the colour for the ConeLight
	 * @param distance the distance of the light for the ConeLight
	 * @param xRay if the light can pass through objects or not
	 * @param x the x ordinate of the light in pixels
	 * @param y the y ordinate of the light in pixels
	 * @param dir the direction that the light is aiming in degrees
	 * @param cone spanning width degree of the light (0 degrees - 360 degrees)
	 * @return a ConeLight with the given parameters.
	 */
	public static ConeLight createConeLight(RayHandler rayHandler, Body body, int rays, float softness, Color colour, float distance, boolean xRay, float x, float y, float dir, float cone)
	{
		ConeLight light = new ConeLight(rayHandler, rays, colour, distance / PhysicsUtil.PIXELS_PER_METER, x / PhysicsUtil.PIXELS_PER_METER, y / PhysicsUtil.PIXELS_PER_METER, dir, cone);
		light.setSoftnessLength(softness);
		light.setXray(xRay);
		light.attachToBody(body);
		
		return light;
	}
}
