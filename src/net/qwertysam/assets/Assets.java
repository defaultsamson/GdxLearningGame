package net.qwertysam.assets;

import java.util.List;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;

import net.qwertysam.api.assets.Asset;
import net.qwertysam.api.assets.AssetLoader;
import net.qwertysam.api.builder.AssetBuilder;
import net.qwertysam.main.MyGdxGame;

public class Assets extends AssetLoader
{
	public Assets(MyGdxGame game)
	{
		super(game);
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
	@Override
	public void queueLoad()
	{
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
	
	/**
	 * Loads all the to their variables.
	 */
	@Override
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
	
	@Override
	public void dispose()
	{
		super.dispose();
		
		// All the non-native manager disposables
		dst.dispose();
		font.dispose();
	}
}
