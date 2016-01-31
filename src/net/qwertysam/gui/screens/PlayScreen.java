package net.qwertysam.gui.screens;

import com.badlogic.gdx.graphics.Color;

import box2dLight.PointLight;
import net.qwertysam.api.builder.LightBuilder;
import net.qwertysam.api.entity.physics.PhysicsBoundsEntity;
import net.qwertysam.api.entity.physics.PhysicsEntity;
import net.qwertysam.api.entity.physics.PhysicsSpriteEntity;
import net.qwertysam.api.gui.GuiButton;
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
		
		meme = new PhysicsSpriteEntity(0.5F, getWorld(), game.assets().kakchoke, 0.02F, 0.3F, 65000, 600, 400, false, true);
		
		worldBounds = new PhysicsBoundsEntity(getWorld(), 0, 0, game.assets().background.getWidth(), game.assets().background.getHeight(), true, false);
		
		spriteEntities = new RenderableHolder<PhysicsSpriteEntity>();
		
		spriteEntities.registerEntry(meme);
		spriteEntities.registerEntry(new PhysicsSpriteEntity(2, getWorld(), game.assets().potato, PhysicsEntity.DEFAULT_FRICTION, PhysicsEntity.DEFAULT_RESTITUTION, 30000, 650, 0, false, true));
		spriteEntities.registerEntry(new PhysicsSpriteEntity(3, getWorld(), game.assets().bill, PhysicsEntity.DEFAULT_FRICTION, PhysicsEntity.DEFAULT_RESTITUTION, 15000, 650, 0, false, true));
		spriteEntities.registerEntry(new PhysicsSpriteEntity(getWorld(), game.assets().bob, PhysicsEntity.DEFAULT_FRICTION, PhysicsEntity.DEFAULT_RESTITUTION, 15000, 650, 0, false, false));
		spriteEntities.registerEntry(new PhysicsSpriteEntity(getWorld(), game.assets().bill_mad, PhysicsEntity.DEFAULT_FRICTION, PhysicsEntity.DEFAULT_RESTITUTION, 15000, 650, 0, true, false));
		spriteEntities.registerEntry(new PhysicsSpriteEntity(getWorld(), game.assets().arthur, PhysicsEntity.DEFAULT_FRICTION, PhysicsEntity.DEFAULT_RESTITUTION, 20000, 650, 0, false, false));
		
		rayHandler.setAmbientLight(0.5F);
		
		LightBuilder.createPointLight(rayHandler, 400, 1.5F, new Color(0F, 0F, 0F, 1F), 800, false, 200, 200);
		LightBuilder.createPointLight(rayHandler, 400, 1.5F, Color.BLUE.add(Color.LIME).add(new Color(0F, 0F, 0F, 0.8F)), 800, false, 1500, 900);
		LightBuilder.createPointLight(rayHandler, 400, 1.5F, Color.RED, 800, false, 1700, 200);
		
		// light.attachToBody(meme.getBody());
		
		// DirectionalLight sun = new DirectionalLight(rayHandler, 500, Color.WHITE, 270);
		
		// sun.setSoftnessLength(2);
		// sun.setXray(true);
	}
	
	@Override
	public void init()
	{
		registerEntry(new GuiButton(this, game.assets().button, 0, 20, 20));
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
		
		game.getCamera().position.set(meme.getCenterX(), meme.getCenterY(), 0);
		
		if (!getTouches().isEmpty()) game.assets().font.draw(batch, "" + (int) getTouches().get(0).x + ", " + (int) getTouches().get(0).y, 100, 200);
	}
	
	@Override
	public void releaseAction(int buttonID)
	{
		switch (buttonID)
		{
			case 0:
				game.setScreen(game.screenManager().mainMenu);
				// game.assets().dst.play();
				break;
		}
	}

	@Override
	public void pressAction(int buttonID)
	{
		
	}
}
