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
    GuiTextButton backButton;
	
	public HelpScreen(MyGdxGame game, GuiScreen parentScreen)
	{
		super(game);
		this.parentScreen = parentScreen;
	}
	
	@Override
	public void init()
	{
        backButton = new GuiTextButton(this, game.assets().button_small, game.assets().ubuntu.white_small.italic, 4F, 0, 20, game.getGutterOffset() + 20, TranslationKey.GUI_BUTTON_BACK);
        registerEntry(backButton);
	}
	
	@Override
	public void drawScreen(float delta, float cameraXOffset, float cameraYOffset)
	{
		game.centerCamera();
		//batch.draw(game.assets().background, 0, 0);
		
		RenderUtil.drawCenteredFont(batch, game.assets().ubuntu.black_medium.normal, MyGdxGame.CAMERA_WIDTH / 2, 800, 0, 0, "Press play twice");
		RenderUtil.drawCenteredFont(batch, game.assets().ubuntu.black_medium.normal, MyGdxGame.CAMERA_WIDTH / 2, 680, 0, 0, "to switch games!");
		
		int fingers = InputUtil.getTouches(50, viewport).size();
		
		RenderUtil.drawCenteredFont(batch, game.assets().ubuntu.black_medium.normal, MyGdxGame.CAMERA_WIDTH / 2, 420, 0, 0, "You have " + fingers + " finger" + (fingers == 1 ? "" : "s") + "!");
		
		renderButtons(batch);
		
		RenderUtil.drawVignette(batch, game);
		
		RenderUtil.drawCenteredFont(batch, game.assets().ubuntu.black_big.bold, MyGdxGame.CAMERA_WIDTH / 2, 1000, 0, 0, "Help");
	}

    @Override
    public void resize(int width, int height)
    {
        super.resize(width, height);

        backButton.setY(game.getGutterOffset() + 20);
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
				game.setScreen(parentScreen);
				break;
		}
	}
}
