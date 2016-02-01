package net.qwertysam.assets;

import java.util.List;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;

import net.qwertysam.api.assets.Asset;
import net.qwertysam.api.assets.AssetLoader;
import net.qwertysam.api.builder.AssetBuilder;
import net.qwertysam.main.MyGdxGame;
import net.qwertysam.resource.FontTypeHolder;
import net.qwertysam.resource.FontVarietyHolder;

public class Assets extends AssetLoader
{
	public Assets(MyGdxGame game)
	{
		super(game);
	}
	
	public Sprite kakchoke;
	public List<Sprite> button;
	public List<Sprite> button_large;
	public List<Sprite> button_medium;
	public List<Sprite> button_small;
	public List<Sprite> button_square;
	public Sprite background;
	public Sprite arthur;
	public Sprite potato;
	public Sprite bob;
	public Sprite bill;
	public Sprite bill_mad;
	public Sound dst;
	public FontVarietyHolder ubuntu;
	/*
	public BitmapFont font_normal;
	public BitmapFont font_italic;
	public BitmapFont font_bold;
	public BitmapFont font_small_normal;
	public BitmapFont font_small_italic;
	public BitmapFont font_small_bold;
	public BitmapFont font_black_normal;
	public BitmapFont font_black_italic;
	public BitmapFont font_black_bold;
	*/
	public Sprite vignette;
	
	/**
	 * Queues all the assets to be loaded by the manager.
	 */
	@Override
	protected void queueLoad()
	{
		// All the assets to be loaded.
		addAsset(new Asset("kakchoke", "meme/kak2.png", Texture.class));
		addAsset(new Asset("button", "buttons/button1.png", Texture.class));
		addAsset(new Asset("button_large", "textures/gui/buttons/button_large.png", Texture.class));
		addAsset(new Asset("button_medium", "textures/gui/buttons/button_medium.png", Texture.class));
		addAsset(new Asset("button_small", "textures/gui/buttons/button_small.png", Texture.class));
		addAsset(new Asset("button_square", "textures/gui/buttons/button_square.png", Texture.class));
		addAsset(new Asset("background", "menu/windows.png", Texture.class));
		addAsset(new Asset("arthur", "meme/4.jpg", Texture.class));
		addAsset(new Asset("potato", "meme/3.jpg", Texture.class));
		addAsset(new Asset("bob", "entity/bob.png", Texture.class));
		addAsset(new Asset("bill", "entity/bill.png", Texture.class));
		addAsset(new Asset("bill_mad", "entity/bill_mad.png", Texture.class));
		addAsset(new Asset("dst", "sound/sauce.mp3", Sound.class));
		addAsset(new Asset("font_normal", "fonts/Ubuntu-L.ttf", FreeTypeFontGenerator.class));
		addAsset(new Asset("font_italic", "fonts/Ubuntu-LI.ttf", FreeTypeFontGenerator.class));
		addAsset(new Asset("font_bold", "fonts/Ubuntu-R.ttf", FreeTypeFontGenerator.class));
		addAsset(new Asset("vignette", "textures/vignette.png", Texture.class));
	}
	
	/**
	 * Loads all the to their variables.
	 */
	@Override
	public void initialize()
	{
		kakchoke = AssetBuilder.createSprite(this, "kakchoke");
		button = AssetBuilder.createSprites(this, "button", 64);
		button_large = AssetBuilder.createSprites(this, "button_large", 200, 20);
		button_medium = AssetBuilder.createSprites(this, "button_medium", 140, 20);
		button_small = AssetBuilder.createSprites(this, "button_small", 80, 20);
		button_square = AssetBuilder.createSprites(this, "button_square", 20);
		background = AssetBuilder.createSprite(this, "background");
		arthur = AssetBuilder.createSprite(this, "arthur");
		potato = AssetBuilder.createSprite(this, "potato");
		bob = AssetBuilder.createSprite(this, "bob");
		bill = AssetBuilder.createSprite(this, "bill");
		bill_mad = AssetBuilder.createSprite(this, "bill_mad");
		dst = AssetBuilder.createSound(this, "dst");
		
		int big_font = 128, medium_font = 82, small_font = 54;
		ubuntu = new FontVarietyHolder(
				new FontTypeHolder(
						AssetBuilder.createFont(this, "font_normal", big_font),
						AssetBuilder.createFont(this, "font_bold", big_font), 
						AssetBuilder.createFont(this, "font_italic", big_font)),
		
				new FontTypeHolder(
						AssetBuilder.createFont(this, "font_normal", medium_font),
						AssetBuilder.createFont(this, "font_bold", medium_font), 
						AssetBuilder.createFont(this, "font_italic", medium_font)),
				
				new FontTypeHolder(
						AssetBuilder.createFont(this, "font_normal", small_font),
						AssetBuilder.createFont(this, "font_bold", small_font), 
						AssetBuilder.createFont(this, "font_italic", small_font)),
				
				new FontTypeHolder(
						AssetBuilder.createFont(this, "font_normal", Color.BLACK, big_font),
						AssetBuilder.createFont(this, "font_bold", Color.BLACK, big_font), 
						AssetBuilder.createFont(this, "font_italic", Color.BLACK, big_font)),
		
				new FontTypeHolder(
						AssetBuilder.createFont(this, "font_normal", Color.BLACK, medium_font),
						AssetBuilder.createFont(this, "font_bold", Color.BLACK, medium_font), 
						AssetBuilder.createFont(this, "font_italic", Color.BLACK, medium_font)),
				
				new FontTypeHolder(
						AssetBuilder.createFont(this, "font_normal", Color.BLACK, small_font),
						AssetBuilder.createFont(this, "font_bold", Color.BLACK, small_font), 
						AssetBuilder.createFont(this, "font_italic", Color.BLACK, small_font))
				);
		vignette = AssetBuilder.createSprite(this, "vignette");
	}
	
	@Override
	public void dispose()
	{
		super.dispose();
		
		// All the non-native manager disposables
		dst.dispose();
		ubuntu.dispose();
	}
}
