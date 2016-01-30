package net.qwertysam.gui.screens;

import net.qwertysam.api.gui.GuiButton;
import net.qwertysam.api.gui.screen.GuiScreen;
import net.qwertysam.main.MyGdxGame;

public class MainMenuGui extends GuiScreen
{
	public MainMenuGui(MyGdxGame game)
	{
		super(game);
	}
	
	@Override
	public void init()
	{
		registerEntry(new GuiButton(this, 0, game.assets().button, 200, 200));
	}
	
	@Override
	public void drawScreen(float delta)
	{
		batch.draw(game.assets().background, 0, 0);
		
		game.assets().font.draw(batch, "" + touches.size(), 100, 200);
	}
	
	@Override
	public void pressAction(int buttonID)
	{
	
	}
	
	@Override
	public void releaseAction(int buttonID)
	{
		switch (buttonID)
		{
			case 0:
				game.setScreen(game.screenManager().playScreen);
				// game.assets().dst.play();
				break;
		}
	}
}
