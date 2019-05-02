package net.qwertysam.game;

import net.qwertysam.game.screens.OldPlayScreen;
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
			default:
				System.out.println("Main Menu");
				currentLevel = 0;
			case 0:
				System.out.println("Test Play Screen");
				game.setScreen(new OldPlayScreen(game));
				break;
			case 1:
				System.out.println("Stackem Screen");
				game.setScreen(new StackEmScreen(game));
				break;
		}
	}
	
	public MyGdxGame getGame()
	{
		return game;
	}
}
