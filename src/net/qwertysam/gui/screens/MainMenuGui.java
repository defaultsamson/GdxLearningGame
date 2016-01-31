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
		registerEntry(new GuiTextButton(this, game.assets().button_small, game.assets().font_bold, 8F, 0, 40, 650, 50, 50, TranslationKey.GUI_BUTTON_PLAY.translate(game)));
		registerEntry(new GuiTextButton(this, game.assets().button_small, game.assets().font_bold, 8F, 0, 40, 400, 50, 50, TranslationKey.GUI_BUTTON_OPTIONS.translate(game)));
		registerEntry(new GuiTextButton(this, game.assets().button_small, game.assets().font_bold, 8F, 0, 40, 150, 50, 50, TranslationKey.GUI_BUTTON_HELP.translate(game)));
	}
	
	@Override
	public void drawScreen(float delta)
	{
		game.centerCamera();
		//batch.draw(game.assets().background, 0, 0);
		
		game.assets().font_normal.draw(batch, "" + getTouches().size(), 100, 200);
		
		renderButtons(batch);
		
		RenderUtil.drawVignette(batch, game);
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
				game.setScreen(game.screenManager().playScreen);
				// game.assets().dst.play();
				break;
		}
	}
}
