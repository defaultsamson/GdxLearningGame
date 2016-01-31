package net.qwertysam.main;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.OrthographicCamera;

import net.qwertysam.api.gui.screen.ScreenManager;
import net.qwertysam.api.util.IDisposable;
import net.qwertysam.assets.Assets;
import net.qwertysam.assets.Files;

public class MyGdxGame extends Game
{
	/** The width of the virtual viewport. */
	public static final float CAMERA_WIDTH = 720;
	/** The height of the virtual viewport. */
	public static final float CAMERA_HEIGHT = 1280;
	
	private boolean isYInverted;
	
	private List<IDisposable> disposables;
	
	private Assets assets;
	private Files files;
	private ScreenManager screenManager;
	private OrthographicCamera camera;
	
	@Override
	public void create()
	{
		isYInverted = false;
		
		disposables = new ArrayList<IDisposable>();
		
		assets = new Assets(this);
		registerDisposable(assets);
		
		files = new Files(this);
		registerDisposable(files);
		
		// MUST INSTANCIATE CAMERA BEFORE SCREEN MANAGER
		camera = new OrthographicCamera(CAMERA_WIDTH, CAMERA_HEIGHT);
		centerCamera();
		// ScreenManager uses the camera instance
		screenManager = new ScreenManager(this);
		registerDisposable(screenManager);
		
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
	
	/**
	 * Adds a disposable to dispose of when this is disposed.
	 * 
	 * @param disposable the disposable to add
	 */
	public void registerDisposable(IDisposable disposable)
	{
		disposables.add(disposable);
	}
	
	/**
	 * @return the Assets instance.
	 */
	public Assets assets()
	{
		return assets;
	}
	
	/**
	 * @return the File manager instance.
	 */
	public Files files()
	{
		return files;
	}
	
	/**
	 * @return the instance of the ScreenManager.
	 */
	public ScreenManager screenManager()
	{
		return screenManager;
	}
	
	/**
	 * @return if the screen is inverted in the Y axis (if the y ordinates start at the bottom or the top).
	 */
	public boolean isInverted()
	{
		return isYInverted;
	}
	
	/**
	 * @return the instance of the camera.
	 */
	public OrthographicCamera getCamera()
	{
		return camera;
	}
	
	/**
	 * Brings the camera to the center of the screen.
	 */
	public void centerCamera()
	{
		getCamera().setToOrtho(isInverted(), CAMERA_WIDTH, CAMERA_HEIGHT);;
	}
}
