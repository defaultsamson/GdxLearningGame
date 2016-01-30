package net.qwertysam.gui.screens;

import com.badlogic.gdx.graphics.Color;

import box2dLight.PointLight;
import net.qwertysam.api.builder.LightBuilder;
import net.qwertysam.api.entity.physics.PhysicsBoundsEntity;
import net.qwertysam.api.entity.physics.PhysicsEntity;
import net.qwertysam.api.entity.physics.PhysicsSpriteEntity;
import net.qwertysam.api.gui.screen.PhysicsScreen;
import net.qwertysam.api.rendering.RenderableHolder;
import net.qwertysam.main.MyGdxGame;

public class PlayScreen extends PhysicsScreen
{
	private RenderableHolder<PhysicsSpriteEntity> spriteEntities;
	
	PhysicsSpriteEntity meme;
	PhysicsBoundsEntity worldBounds;
	
	PointLight light;
	
	public PlayScreen(MyGdxGame game)
	{
		super(game);
		
		meme = new PhysicsSpriteEntity(0.5F, world, game.assets().kakchoke, PhysicsEntity.DEFAULT_FRICTION, PhysicsEntity.DEFAULT_RESTITUTION, 65000F, 600F, 400F, false, true);
		
		worldBounds = new PhysicsBoundsEntity(world, 0F, 0F, game.assets().background.getWidth(), game.assets().background.getHeight());
		
		spriteEntities = new RenderableHolder<PhysicsSpriteEntity>();
		
		spriteEntities.registerEntry(meme);
		spriteEntities.registerEntry(new PhysicsSpriteEntity(2F, world, game.assets().potato, PhysicsEntity.DEFAULT_FRICTION, PhysicsEntity.DEFAULT_RESTITUTION, 30000F, 650F, 0F, false, true));
		spriteEntities.registerEntry(new PhysicsSpriteEntity(3F, world, game.assets().bill, PhysicsEntity.DEFAULT_FRICTION, PhysicsEntity.DEFAULT_RESTITUTION, 15000F, 650F, 0F, false, true));
		spriteEntities.registerEntry(new PhysicsSpriteEntity(world, game.assets().bob, PhysicsEntity.DEFAULT_FRICTION, PhysicsEntity.DEFAULT_RESTITUTION, 15000F, 650F, 0F, false, false));
		spriteEntities.registerEntry(new PhysicsSpriteEntity(world, game.assets().bill_mad, PhysicsEntity.DEFAULT_FRICTION, PhysicsEntity.DEFAULT_RESTITUTION, 15000F, 650F, 0F, true, false));
		spriteEntities.registerEntry(new PhysicsSpriteEntity(world, game.assets().arthur, PhysicsEntity.DEFAULT_FRICTION, PhysicsEntity.DEFAULT_RESTITUTION, 20000F, 650F, 0F, false, false));
		
		spriteEntities.registerEntry(new PhysicsSpriteEntity(world, game.assets().bill_mad, PhysicsEntity.DEFAULT_FRICTION, PhysicsEntity.DEFAULT_RESTITUTION, 20000F, 200, 700, true, false));
		
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
		
		if (isTouched())
		{
			float xTouch = getTouches().get(0).x;
			float yTouch = getTouches().get(0).y;
			
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
