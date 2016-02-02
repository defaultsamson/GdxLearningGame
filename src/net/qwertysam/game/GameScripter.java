package net.qwertysam.game;

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
				break;
		}
	}
	
	public MyGdxGame getGame()
	{
		return game;
	}
}
