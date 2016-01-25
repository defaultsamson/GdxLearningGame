package net.qwertysam.gui.screens;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;

import box2dLight.RayHandler;
import net.qwertysam.main.MyGdxGame;
import net.qwertysam.util.PhysicsUtil;

public class PhysicsScreen extends GuiScreen
{
	protected World world;
	protected RayHandler rayHandler;
	
	public PhysicsScreen(MyGdxGame game)
	{
		super(game);
		
		// Create a physics world, the heart of the simulation. The Vector
		// passed in is gravity
		world = new World(new Vector2(0, -9.8F), true);
		
		rayHandler = new RayHandler(world);
		rayHandler.setBlurNum(0);
	}
	
	@Override
	public void render(float delta)
	{
		super.render(delta);
		rayHandler.render();
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void tick(float delta)
	{
		super.tick(delta);
		
		// Makes the world physics go
		PhysicsUtil.stepWorld(world, delta);
		
		rayHandler.setCombinedMatrix(camera.combined.cpy().scale(PhysicsUtil.PIXELS_PER_METER, PhysicsUtil.PIXELS_PER_METER, PhysicsUtil.PIXELS_PER_METER));
		
		rayHandler.update();
	}
	
	@Override
	public void dispose()
	{
		super.dispose();
		world.dispose();
	}
}
