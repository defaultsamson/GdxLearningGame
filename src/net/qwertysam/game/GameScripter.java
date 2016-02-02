package net.qwertysam.game;

import net.qwertysam.game.screens.StackEmScreen;
import net.qwertysam.gui.screens.MainMenuGui;
import net.qwertysam.main.MyGdxGame;

public class GameScripter
{
	private MyGdxGame game;
	private int currentLevel;
	
	public GameScripter(MyGdxGame game)
	{
		this.game = game;
		this.currentLevel = -1;
		
	}
	
	public void gotoNextLevel()
	{
		currentLevel++;
		
		switch (currentLevel)
		{
			case 0:
				game.setScreen(new StackEmScreen(game));
				break;
			default:
				currentLevel = -1;
				game.setScreen(new MainMenuGui(game));
				break;
		}
	}
	
	public MyGdxGame getGame()
	{
		return game;
	}
}
