package net.qwertysam.gui.huds;

import net.qwertysam.gui.GuiButton;
import net.qwertysam.main.MyGdxGame;

public class MainMenuGui extends ButtonHud
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
				game.assets().dst.play();
				break;
		}
	}
}
