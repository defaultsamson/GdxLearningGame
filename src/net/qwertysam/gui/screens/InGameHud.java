package net.qwertysam.gui.screens;

import net.qwertysam.api.gui.ButtonHud;
import net.qwertysam.api.gui.GuiButton;
import net.qwertysam.main.MyGdxGame;

public class InGameHud extends ButtonHud
{
	public InGameHud(MyGdxGame game)
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
				break;
		}
	}
}
