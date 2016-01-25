package net.qwertysam.assets;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.assets.loaders.FileHandleResolver;
import com.badlogic.gdx.assets.loaders.resolvers.InternalFileHandleResolver;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGeneratorLoader;
import com.badlogic.gdx.graphics.g2d.freetype.FreetypeFontLoader;

import net.qwertysam.builder.AssetBuilder;
import net.qwertysam.main.MyGdxGame;
import net.qwertysam.resource.IDisposable;

public class Assets implements IDisposable
{
	private MyGdxGame game;
	private final AssetManager manager;
	private List<Asset> assets;
	
	public Assets(MyGdxGame game)
	{
		this.game = game;
		manager = new AssetManager();
		assets = new ArrayList<Asset>();
	}
	
	public Sprite kakchoke;
	public List<Sprite> button;
	public Sprite background;
	public Sprite arthur;
	public Sprite potato;
	public Sprite bob;
	public Sprite bill;
	public Sprite bill_mad;
	public Sound dst;
	public BitmapFont font;
	
	/**
	 * Queues all the assets to be loaded by the manager.
	 */
	public void queueLoad()
	{
		// Set the loaders for the generator and the fonts themselves
		FileHandleResolver resolver = new InternalFileHandleResolver();
		manager.setLoader(FreeTypeFontGenerator.class, new FreeTypeFontGeneratorLoader(resolver));
		manager.setLoader(BitmapFont.class, ".ttf", new FreetypeFontLoader(resolver));
		
		// All the assets to be loaded.
		addAsset(new Asset("kakchoke", "meme/kak2.png", Texture.class));
		addAsset(new Asset("button", "buttons/button1.png", Texture.class));
		addAsset(new Asset("background", "menu/windows.png", Texture.class));
		addAsset(new Asset("arthur", "meme/1.jpg", Texture.class));
		addAsset(new Asset("potato", "meme/3.jpg", Texture.class));
		addAsset(new Asset("bob", "entity/bob.png", Texture.class));
		addAsset(new Asset("bill", "entity/bill.png", Texture.class));
		addAsset(new Asset("bill_mad", "entity/bill_mad.png", Texture.class));
		addAsset(new Asset("dst", "sound/sauce.mp3", Sound.class));
		addAsset(new Asset("font", "fonts/font1.ttf", FreeTypeFontGenerator.class));
		
		for (Asset asset : assets)
		{
			manager.load(asset.path, asset.type);
		}
	}
	
	public void load()
	{
		System.out.println("Loading Assets...");
		
		queueLoad();
		
		int queued = manager.getQueuedAssets();
		
		int previouslyLoaded = -1;
		
		long startTime = System.currentTimeMillis();
		
		while (!manager.update())
		{
			int loaded = manager.getLoadedAssets();
			
			if (previouslyLoaded != loaded)
			{
				System.out.println(loaded + "/" + queued + " (" + (int) (manager.getProgress() * 100) + "%)");
				previouslyLoaded = loaded;
			}
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println(queued + "/" + queued + " (100%) Assets loaded. Took: " + (endTime - startTime) + " milliseconds.");
		
		long startTime2 = System.currentTimeMillis();
		
		initialize();
		
		long endTime2 = System.currentTimeMillis();
		
		System.out.println("Objects initialized. Took: " + (endTime2 - startTime2) + " milliseconds.");
	}
	
	/**
	 * Loads all the to their variables.
	 */
	public void initialize()
	{
		kakchoke = AssetBuilder.createSprite(this, "kakchoke");
		button = AssetBuilder.createSprites(this, "button", 64);
		background = AssetBuilder.createSprite(this, "background");
		arthur = AssetBuilder.createSprite(this, "arthur");
		potato = AssetBuilder.createSprite(this, "potato");
		bob = AssetBuilder.createSprite(this, "bob");
		bill = AssetBuilder.createSprite(this, "bill");
		bill_mad = AssetBuilder.createSprite(this, "bill_mad");
		dst = AssetBuilder.createSound(this, "dst");
		font = AssetBuilder.createFont(this, "font", 128);
	}
	
	public void addAsset(Asset asset)
	{
		assets.add(asset);
	}
	
	/**
	 * Gets the asset with the specified key.
	 * 
	 * @param key the key used to identify the asset
	 * @return the asset with the specified key. <b>null</b> if there's no asset
	 *         with that key.
	 */
	public Asset getAsset(String key)
	{
		for (Asset asset : assets)
		{
			if (asset.key.equals(key)) return asset;
		}
		
		return null;
	}
	
	@Override
	public void dispose()
	{
		manager.dispose();
		
		// Disposes of all the assets not loaded from this' AssetManager
		font.dispose();
	}
	
	/**
	 * Gets the AssetManager of this.
	 * 
	 * @return the AssetManager of this
	 */
	public AssetManager getManager()
	{
		return manager;
	}
	
	/**
	 * Gets the game instance of this.
	 * 
	 * @return the game instance of this.
	 * 		
	 */
	public MyGdxGame getGame()
	{
		return game;
	}
}
