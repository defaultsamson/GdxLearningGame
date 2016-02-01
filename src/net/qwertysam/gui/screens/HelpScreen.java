package net.qwertysam.gui.screens;

import net.qwertysam.api.gui.GuiTextButton;
import net.qwertysam.api.gui.screen.GuiScreen;
import net.qwertysam.api.language.TranslationKey;
import net.qwertysam.api.rendering.RenderUtil;
import net.qwertysam.api.util.InputUtil;
import net.qwertysam.main.MyGdxGame;

public class HelpScreen extends GuiScreen
{
	private GuiScreen parentScreen;
	
	public HelpScreen(MyGdxGame game, GuiScreen parentScreen)
	{
		super(game);
		this.parentScreen = parentScreen;
	}
	
	@Override
	public void init()
	{
		//registerEntry(new GuiButton(this, game.assets().button_square, 4F, 1, 100, 100, 0, 0));
		registerEntry(new GuiTextButton(this, game.assets().button_small, game.assets().ubuntu.white_medium.normal, 8F, 2, 40, 150, 40, 50, TranslationKey.GUI_BUTTON_BACK.translate(game)));
	}
	
	@Override
	public void drawScreen(float delta)
	{
		game.centerCamera();
		//batch.draw(game.assets().background, 0, 0);
		
		RenderUtil.drawCenteredFont(batch, game.assets().ubuntu.black_medium.normal, MyGdxGame.CAMERA_WIDTH / 2, 800, 0, 0, "This game is");
		RenderUtil.drawCenteredFont(batch, game.assets().ubuntu.black_medium.normal, MyGdxGame.CAMERA_WIDTH / 2, 680, 0, 0, "pretty lame");
		
		int fingers = InputUtil.getTouches(10, viewport).size();
		
		RenderUtil.drawCenteredFont(batch, game.assets().ubuntu.black_medium.normal, MyGdxGame.CAMERA_WIDTH / 2, 400, 0, 0, fingers + "/" + getTouches().size() + " Touches");
		
		renderButtons(batch);
		
		RenderUtil.drawVignette(batch, game);
		
		RenderUtil.drawCenteredFont(batch, game.assets().ubuntu.black_big.bold, MyGdxGame.CAMERA_WIDTH / 2, 1000, 0, 0, "Help");
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
			case 2:
				game.setScreen(parentScreen);
				break;
		}
	}
}
