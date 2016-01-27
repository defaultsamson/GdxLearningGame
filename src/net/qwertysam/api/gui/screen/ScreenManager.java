package net.qwertysam.api.gui.screen;

import com.badlogic.gdx.Screen;

import net.qwertysam.api.util.IDisposable;
import net.qwertysam.gui.screens.MainMenuScreen;
import net.qwertysam.gui.screens.PlayScreen;
import net.qwertysam.main.MyGdxGame;

public class ScreenManager implements IDisposable
{
	private MyGdxGame game;
	
	public Screen playScreen;
	public Screen mainMenu;
	
	public ScreenManager(MyGdxGame game)
	{
		this.game = game;
		
		loadScreens();
	}
	
	private void loadScreens()
	{
		playScreen = new PlayScreen(game);
		mainMenu = new MainMenuScreen(game);
	}
	
	public void switchScreen(Screen screen)
	{
		game.setScreen(screen);
	}
	
	@Override
	public void dispose()
	{
		playScreen.dispose();
		mainMenu.dispose();
	}
}
