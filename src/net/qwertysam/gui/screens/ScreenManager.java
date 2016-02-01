package net.qwertysam.gui.screens;

import com.badlogic.gdx.Screen;

import net.qwertysam.main.MyGdxGame;

public class ScreenManager
{
	private MyGdxGame game;
	
	public ScreenManager(MyGdxGame game)
	{
		this.game = game;
	}
	
	public void switchScreen(Screen screen)
	{
		game.setScreen(screen);
	}
}
