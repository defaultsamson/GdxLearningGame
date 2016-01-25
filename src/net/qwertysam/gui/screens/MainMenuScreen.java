package net.qwertysam.gui.screens;

import net.qwertysam.gui.huds.MainMenuGui;
import net.qwertysam.main.MyGdxGame;

public class MainMenuScreen extends GuiScreen
{
	private MainMenuGui buttonHolder;
	
	public MainMenuScreen(MyGdxGame game)
	{
		super(game);
		
		buttonHolder = new MainMenuGui(game);
	}
	
	@Override
	public void tick(float delta)
	{
		super.tick(delta);
		
		buttonHolder.onTick(touches.getTouches(), camera.position.x - (camera.viewportWidth / 2), camera.position.y - (camera.viewportHeight / 2));
	}
	
	@Override
	public void drawScreen(float delta)
	{
		batch.draw(game.assets().background, 0, 0);
		
		game.assets().font.draw(batch, "" + touches.touches.size(), 100, 200);
		
		buttonHolder.renderEntries(batch);
	}
}
