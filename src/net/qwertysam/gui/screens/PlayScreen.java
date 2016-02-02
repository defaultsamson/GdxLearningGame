package net.qwertysam.gui.screens;

import com.badlogic.gdx.math.Vector2;

import net.qwertysam.api.gui.GuiTextButton;
import net.qwertysam.api.gui.screen.PhysicsScreen;
import net.qwertysam.api.language.TranslationKey;
import net.qwertysam.api.rendering.RenderUtil;
import net.qwertysam.main.MyGdxGame;

public abstract class PlayScreen extends PhysicsScreen
{
	public PlayScreen(MyGdxGame game)
	{
		super(game);
		
	}
	
	@Override
	public void init()
	{
		registerEntry(new GuiTextButton(this, game.assets().button_small, game.assets().ubuntu.white_small.italic, 4F, 0, 20, game.getGutterOffset() + 20, TranslationKey.GUI_BUTTON_BACK));
	}
	
	@Override
	public void tick(float delta)
	{
		super.tick(delta);
		
		Vector2 p1t1 = null, p1t2 = null, p2t1 = null, p2t2 = null;
		
		if (isTouched())
		{
			for (Vector2 touch : getTouches())
			{
				// Player 2 (across the table)
				if (touch.x > MyGdxGame.CAMERA_HEIGHT / 2)
				{
					if (p2t1 == null) p2t1 = touch;
					else if (p2t2 == null) p2t2 = touch;
				}
				else // Player 1
				{
					if (p1t1 == null) p1t1 = touch;
					else if (p1t2 == null) p1t2 = touch;
				}
			}
		}
		touchTick(delta, p1t1, p1t2, p2t1, p2t2);
	}
	
	protected abstract void touchTick(float delta, Vector2 player1touch1, Vector2 player1touch2, Vector2 player2touch1, Vector2 player2touch2);
	
	@Override
	public void drawScreen(float delta, float cameraXOffset, float cameraYOffset)
	{
		batch.draw(game.assets().background, 0, 0);
		
		renderButtons(batch);
		
		RenderUtil.drawVignette(batch, game, cameraXOffset, cameraYOffset);
		
		if (!getTouches().isEmpty()) game.assets().ubuntu.white_big.italic.draw(batch, "" + (int) getTouches().get(0).x + ", " + (int) getTouches().get(0).y, 100, 200);
		
	}
	
	@Override
	public void releaseAction(int buttonID)
	{
		switch (buttonID)
		{
			case 0:
				game.setScreen(new MainMenuGui(game));
				break;
		}
	}
	
	@Override
	public void pressAction(int buttonID)
	{
	
	}
}
