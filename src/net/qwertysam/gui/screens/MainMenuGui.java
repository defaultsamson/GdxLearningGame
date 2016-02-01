package net.qwertysam.gui.screens;

import net.qwertysam.api.gui.GuiTextButton;
import net.qwertysam.api.gui.screen.GuiScreen;
import net.qwertysam.api.language.TranslationKey;
import net.qwertysam.api.rendering.RenderUtil;
import net.qwertysam.main.MyGdxGame;

public class MainMenuGui extends GuiScreen
{
	public MainMenuGui(MyGdxGame game)
	{
		super(game);
	}
	
	@Override
	public void init()
	{
		//registerEntry(new GuiButton(this, game.assets().button_square, 4F, 1, 100, 100, 0, 0));
		registerEntry(new GuiTextButton(this, game.assets().button_small, game.assets().ubuntu.white_medium.normal, 8F, 0, 40, 650, 30, 50, TranslationKey.GUI_BUTTON_PLAY.translate(game)));
		registerEntry(new GuiTextButton(this, game.assets().button_small, game.assets().ubuntu.white_medium.normal, 8F, 1, 40, 400, 30, 50, TranslationKey.GUI_BUTTON_OPTIONS.translate(game)));
		registerEntry(new GuiTextButton(this, game.assets().button_small, game.assets().ubuntu.white_medium.normal, 8F, 2, 40, 150, 30, 50, TranslationKey.GUI_BUTTON_HELP.translate(game)));
	}
	
	@Override
	public void drawScreen(float delta)
	{
		game.centerCamera();
		//batch.draw(game.assets().background, 0, 0);
		
		renderButtons(batch);
		
		RenderUtil.drawVignette(batch, game);
		
		RenderUtil.drawCenteredFont(batch, game.assets().ubuntu.black_big.bold, MyGdxGame.CAMERA_WIDTH / 2, 1000, 0, 0, "Good Game");
	}
	
	@Override
	public void pressAction(int buttonID)
	{
	
	}
	
	@Override
	public void releaseAction(int buttonID)
	{
		switch (buttonID)
		{
			case 0:
				game.setScreen(new PlayScreen(game));
				// game.assets().dst.play();
				break;
			case 1:
				game.setScreen(new OptionsScreen(game, this));
				break;
			case 2:
				game.setScreen(new HelpScreen(game, this));
				break;
		}
	}
}
