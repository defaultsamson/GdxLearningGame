package net.qwertysam.gui.screens;

import com.badlogic.gdx.graphics.Color;

import box2dLight.PointLight;
import net.qwertysam.api.builder.LightBuilder;
import net.qwertysam.api.entity.BoundsEntity;
import net.qwertysam.api.entity.SpriteEntity;
import net.qwertysam.api.gui.screen.PhysicsScreen;
import net.qwertysam.api.rendering.RenderableHolder;
import net.qwertysam.main.MyGdxGame;

public class PlayScreen extends PhysicsScreen
{
	private RenderableHolder<SpriteEntity> spriteEntities;
	
	SpriteEntity meme;
	BoundsEntity worldBounds;
	
	PointLight light;
	
	public PlayScreen(MyGdxGame game)
	{
		super(game);
		
		spriteEntities = new RenderableHolder<SpriteEntity>();
		
		meme = new SpriteEntity(game.assets().kakchoke, world, 65000F, 600, 400, false, true);
		
		worldBounds = new BoundsEntity(world, 0F, 0F, game.assets().background.getWidth(), game.assets().background.getHeight());
		
		spriteEntities.registerEntry(meme);
		spriteEntities.registerEntry(new SpriteEntity(2F, game.assets().potato, world, 30000F, 650, 0));
		spriteEntities.registerEntry(new SpriteEntity(3F, game.assets().bill, world, 15000F, 650, 0));
		spriteEntities.registerEntry(new SpriteEntity(game.assets().bob, world, 15000F, 650, 0));
		spriteEntities.registerEntry(new SpriteEntity(game.assets().bill_mad, world, 15000F, 650, 0));
		spriteEntities.registerEntry(new SpriteEntity(game.assets().arthur, world, 20000F, 650, 0));
		
		rayHandler.setAmbientLight(1.5F);
		
		light = LightBuilder.createPointLight(rayHandler, 200, new Color(0F, 0F, 0F, 1F), 1000, 200, 200);
		
		light.setSoftnessLength(1.5F);
		
		// light.attachToBody(meme.getBody());
		
		// DirectionalLight sun = new DirectionalLight(rayHandler, 500, Color.WHITE, 270);
		
		// sun.setSoftnessLength(2);
		// sun.setXray(true);
	}
	
	@Override
	public void tick(float delta)
	{
		super.tick(delta);
		
		if (touches.isTouched())
		{
			float xTouch = touches.getTouches().get(0).x;
			float yTouch = touches.getTouches().get(0).y;
			
			{
				// Vector components
				float xComp = xTouch - meme.getCenterX();
				float yComp = yTouch - meme.getCenterY();
				
				float totalComp;
				
				// Corrects for negative numbers
				if (xComp < 0 && yComp < 0)
				{
					totalComp = -xComp - yComp;
				}
				else if (xComp < 0)
				{
					totalComp = -xComp + yComp;
				}
				else if (yComp < 0)
				{
					totalComp = xComp - yComp;
				}
				else
				{
					totalComp = xComp + yComp;
				}
				
				double xRatioPercent = xComp / totalComp;
				double yRatioPercent = yComp / totalComp;
				
				final float totalVelocity = 0.5F;
				
				xVel = (float) (totalVelocity * xRatioPercent);
				yVel = (float) (totalVelocity * yRatioPercent);
				
				meme.addVelocity(xVel, yVel);
			}
		}
		
		buttonTick(touches.getTouches(), camera.position.x - (camera.viewportWidth / 2), camera.position.y - (camera.viewportHeight / 2));
	}
	
	private float xVel = 0F;
	private float yVel = 0F;
	
	@Override
	public void drawScreen(float delta)
	{
		batch.draw(game.assets().background, 0, 0);
		
		spriteEntities.renderEntries(batch);
		renderEntries(batch);
		
		camera.position.set(meme.getCenterX(), meme.getCenterY(), 0);
		
		rayHandler.render();
	}
}
