package net.qwertysam.gui.screens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

import net.qwertysam.api.gui.screen.GuiScreen;
import net.qwertysam.main.MyGdxGame;

public class LoadingScreen extends GuiScreen
{
	private static final String LOAD_TEXTURE_PATH = "textures/loading.jpg";
	private Sprite sprite;
	
	public LoadingScreen(MyGdxGame game)
	{
		super(game);
		
		game.assets().getManager().load(LOAD_TEXTURE_PATH, Texture.class);
		game.assets().getManager().finishLoading();
		
		sprite = new Sprite(game.assets().getManager().get(LOAD_TEXTURE_PATH, Texture.class));
		sprite.flip(false, game.isInverted());
		
		//Texture texture = new Texture(Gdx.files.internal("textures/loading.jpg"));
		//texture.setFilter(AssetBuilder.DEFAULT_TEXTURE_FILTER, AssetBuilder.DEFAULT_TEXTURE_FILTER);
		//sprite = new Sprite(texture);
		//sprite.flip(false, game.isInverted());
	}
	
	private boolean firstTime = true;
	
	@Override
	public void drawScreen(float delta, float cameraXOffset, float cameraYOffset)
	{
		if (!firstTime)
		{
			game.assets().load();
			game.setScreen(new MainMenuGui(game));
			game.assets().getManager().unload(LOAD_TEXTURE_PATH);
		}
		else
		{
			firstTime = false;
		}
		
		game.centerCamera();
		batch.draw(sprite, 0, 0);
	}
	
	@Override
	public void pressAction(int buttonID)
	{
	
	}
	
	@Override
	public void releaseAction(int buttonID)
	{
		
	}
}
