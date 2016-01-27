package net.qwertysam.api.util;

import com.badlogic.gdx.physics.box2d.World;

public class PhysicsUtil
{
	public static final float PIXELS_PER_METER = 180F;
	
	public static void stepWorld(World world, float delta)
	{
		world.step(delta, 6, 2);
	}
}
