package net.qwertysam.game.screens;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.math.Vector2;

import net.qwertysam.api.gui.GuiButton;
import net.qwertysam.api.gui.GuiTextButton;
import net.qwertysam.api.language.TranslationKey;
import net.qwertysam.api.rendering.RenderUtil;
import net.qwertysam.gui.screens.MainMenuGui;
import net.qwertysam.main.MyGdxGame;

public class StackEmScreen extends PlayScreen
{
	private StackEmBlockHolder p1Blocks, p2Blocks;
	private int p1xOrd, p1width, p2xOrd, p2width;
	private boolean p1Dir, p2Dir;
	private int tickCount;

	GuiTextButton backButton;
	
	public StackEmScreen(MyGdxGame game)
	{
		super(game);
		p1Blocks = new StackEmBlockHolder(7, 10);
		p2Blocks = new StackEmBlockHolder(7, 10);
		p1xOrd = 0;
		p1width = 3;
		p2xOrd = 0;
		p2width = 3;
		p1Dir = true;
		p2Dir = true;
		tickCount = 0;
	}
	
	@Override
	public void init()
	{
		registerEntry(new GuiButton(this, game.assets().button_square, 4F, 0, 500, 300));

		backButton = new GuiTextButton(this, game.assets().button_small, game.assets().ubuntu.white_small.italic, 4F, 1, 20, game.getGutterOffset() + 20, TranslationKey.GUI_BUTTON_BACK);
		registerEntry(backButton);
	}
	
	@Override
	protected void touchTick(float delta, Vector2 player1touch1, Vector2 player1touch2, Vector2 player2touch1, Vector2 player2touch2)
	{
		if (tickCount % 5 == 0)
		{
			p1Blocks.progressBlocks();
			
			if (p1xOrd <= 0)
			{
				p1Dir = true;
			}
			else if (p1xOrd + p1width >= p1Blocks.getFullWidth())
			{
				p1Dir = false;
			}
			
			if (p1Dir) // Moving right
			{
				p1xOrd += 1;
			}
			else // Moving left
			{
				p1xOrd -= 1;
			}
			
			p2Blocks.progressBlocks();
			
			if (p2xOrd + p2width >= p2Blocks.getFullWidth() || p2xOrd <= 0)
			{
				p2Dir = !p2Dir;
			}
			
			if (p2Dir) // Moving right
			{
				p2xOrd += 1;
			}
			else // Moving left
			{
				p2xOrd -= 1;
			}
		}
		
		tickCount++;
	}

	@Override
	public void resize(int width, int height)
	{
		super.resize(width, height);

		backButton.setY(game.getGutterOffset() + 20);
	}

	@Override
	public void releaseAction(int buttonID)
	{
		switch (buttonID)
		{
			case 1:
				game.setScreen(new MainMenuGui(game));
				break;
		}
	}
	
	@Override
	public void pressAction(int buttonID)
	{
		switch(buttonID)
		{
			case 0:
				for (int xOrd : blocksToXOrds(p1xOrd, p1width))
				{
					p1Blocks.addBlock(xOrd);
					System.out.println(xOrd);
				}
				
				// System.out.println("OOMEGOO 1");
				//game.getScripter().gotoNextLevel();
				break;
		}
	}
	
	public List<Integer> blocksToXOrds(int xOrd, int width)
	{
		List<Integer> toReturn = new ArrayList<Integer>();
		
		for (int i = 0; i < width; i++)
		{
			toReturn.add(xOrd + i);
		}
		
		return toReturn;
	}
	
	@Override
	public void drawScreen(float delta, float cameraXOffset, float cameraYOffset)
	{
		RenderUtil.drawCenteredFont(batch, game.assets().ubuntu.black_big.bold, 260, 330, 0, 0, "Stack ->");
		
		float playableGutter = 400;
		
		float squareSize = 60;
		float spacing = 10;
		
		//batch.draw(game.assets().arthur, 200, 400, 400, 400);
		
		List<Vector2> toDraw = new ArrayList<Vector2>(p1Blocks.getBlocks());
		
		for (int ord : this.blocksToXOrds(p1xOrd, p1width)) toDraw.add(new Vector2(ord, p1Blocks.getHeight()));
		
		for (Vector2 block : toDraw)
		{
			//System.out.println("Drawing " + block.y);
			batch.draw(game.assets().button_square.get(0), ((block.x + 1) * spacing) + ((block.x) * squareSize), ((block.y + 1) * spacing) + (block.y * squareSize) + playableGutter, squareSize, squareSize);
		}
		
		this.renderButtons(batch);
	}
}
