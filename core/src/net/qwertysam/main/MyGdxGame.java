package net.qwertysam.main;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;

import net.qwertysam.api.language.Language;
import net.qwertysam.api.resource.IDisposable;
import net.qwertysam.assets.Assets;
import net.qwertysam.assets.Files;
import net.qwertysam.game.GameScripter;
import net.qwertysam.gui.screens.LoadingScreen;
import net.qwertysam.language.GameTranslations;

public class MyGdxGame extends Game
{
	private static MyGdxGame game;
	
	/**
	 * <b>THERE SHOULD NEVER BE A NEED FOR THIS</b>
	 * 
	 * @return the game instance.
	 */
	@Deprecated
	public static MyGdxGame getInstance()
	{
		return game;
	}
	
	/** The width of the virtual viewport. */
	public static final float CAMERA_WIDTH = 720;
	/** The height of the virtual viewport. */
	public static final float CAMERA_HEIGHT = 1440; //1280

	public static float gutterOffset;
	
	private boolean isYInverted;
	
	private List<IDisposable> disposables;
	
	private Assets assets;
	private Files files;
	private OrthographicCamera camera;
	private Language language;
	private GameTranslations translator;
	private GameScripter scripter;
	
	@Override
	public void create()
	{
		System.out.println("Loading...");

		game = this;
		isYInverted = false;
		
		disposables = new ArrayList<IDisposable>();
		
		translator = new GameTranslations(this);
		registerDisposable(translator);
		
		scripter = new GameScripter(this);
		
		// TODO make language selector
		language = Language.ENGLISH;
		
		// MUST INSTANCIATE CAMERA BEFORE SCREEN MANAGER
		camera = new OrthographicCamera(CAMERA_WIDTH, CAMERA_HEIGHT);
		centerCamera();
		
		assets = new Assets(this);
		registerDisposable(assets);
		
		files = new Files(this);
		registerDisposable(files);

		/*
		float percentageOfScreenShowing = ((float) Gdx.graphics.getHeight() / (float) Gdx.graphics.getWidth()) * (CAMERA_WIDTH / CAMERA_HEIGHT);
		float pixelsOffScreen = CAMERA_HEIGHT - (CAMERA_HEIGHT * percentageOfScreenShowing);
		gutterOffset = pixelsOffScreen / 2;*/
		gutterOffset = 0;
		
		
		// Load sequence
		setScreen(new LoadingScreen(this));
		// LoadingScreen now handles the loading of assets and files
		//assets.load();
		//files.load();
		
		
		// After loading everything, show game screen
		//setScreen(new MainMenuGui(this));
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
	 * Brings the camera to the centre of the screen.
	 */
	public void centerCamera()
	{
		getCamera().setToOrtho(isInverted(), CAMERA_WIDTH, CAMERA_HEIGHT);;
	}
	
	/**
	 * @return the selected language.
	 */
	public Language getLanguage()
	{
		return language;
	}
	
	/**
	 * @return the TranslationManager instance.
	 */
	public GameTranslations getTranslator()
	{
		return translator;
	}
	
	/**
	 * @return the amount of pixels below/above the screen that aren't being shown.
	 */
	public float getGutterOffset()
	{
		return gutterOffset;
	}
	
	/**
	 * @return the GameScripter instance.
	 */
	public GameScripter getScripter()
	{
		return scripter;
	}
}
