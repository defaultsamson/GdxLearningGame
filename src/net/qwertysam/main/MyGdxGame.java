package net.qwertysam.main;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.Game;

import net.qwertysam.api.gui.screen.ScreenManager;
import net.qwertysam.api.util.IDisposable;
import net.qwertysam.assets.Assets;
import net.qwertysam.assets.Files;

public class MyGdxGame extends Game
{
	private boolean isYInverted;
	
	private List<IDisposable> disposables;
	
	private Assets assets;
	private Files files;
	private ScreenManager screenManager;
	
	@Override
	public void create()
	{
		isYInverted = false;
		
		disposables = new ArrayList<IDisposable>();
		
		assets = new Assets(this);
		assets.load();
		
		files = new Files(this);
		screenManager = new ScreenManager(this);
		
		registerDisposable(assets());
		registerDisposable(screenManager());
		
		screenManager.switchScreen(screenManager.mainMenu);
	}
	
	@Override
	public void dispose()
	{
		for (IDisposable disposable : disposables)
		{
			disposable.dispose();
		}
		disposables.clear();
	}
	
	public void registerDisposable(IDisposable disposable)
	{
		disposables.add(disposable);
	}
	
	public Assets assets()
	{
		return assets;
	}
	
	public Files files()
	{
		return files;
	}
	
	public ScreenManager screenManager()
	{
		return screenManager;
	}
	
	public boolean isInverted()
	{
		return isYInverted;
	}
}
