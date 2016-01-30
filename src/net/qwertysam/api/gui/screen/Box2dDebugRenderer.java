package net.qwertysam.api.gui.screen;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;

import net.qwertysam.api.util.PhysicsUtil;

public class Box2dDebugRenderer
{
	private PhysicsScreen screen;
	private Box2DDebugRenderer debugRenderer;
	private Matrix4 debugMatrix;
	
	/**
	 * Renders the outlines of physics bodies for debug.
	 * 
	 * @param screen the PhysicsScreen to apply this to.
	 */
	public Box2dDebugRenderer(PhysicsScreen screen)
	{
		this.screen = screen;
		
		debugRenderer = new Box2DDebugRenderer();
	}
	
	/**
	 * Draws the Box2D debug.
	 */
	public void render()
	{
		debugMatrix = new Matrix4(screen.getCamera().combined);
		// Scale it by 100 as our box physics bodies are scaled down by 100
		debugMatrix.scale(PhysicsUtil.PIXELS_PER_METER, PhysicsUtil.PIXELS_PER_METER, 1f);
		
		screen.batch.begin();
		// BoxObjectManager.GetWorld() gets the reference to Box2d World object
		debugRenderer.render(screen.world, debugMatrix);
		screen.batch.end();
	}
}
