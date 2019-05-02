package net.qwertysam.game.screens;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.math.Vector2;

public class StackEmBlockHolder
{
	private List<Vector2> blocks;
	
	private int width, height, workingX, workingWidth;
	
	public StackEmBlockHolder(int width, int height)
	{
		blocks = new ArrayList<Vector2>();
		this.width = width;
		this.height = height;
		workingX = 0;
		workingWidth = width;
	}
	
	/**
	 * @param x
	 * @param y
	 * @return if the coordinates contains a block.
	 */
	public boolean isBlocked(int x, int y)
	{
		for (Vector2 block : blocks)
		{
			if (block.x == x && block.y == y) return true;
		}
		
		return false;
	}
	
	public boolean isOffscreen(int x, int y)
	{
		return x < 0 || y < 0 || x >= width || y >= height;
	}
	
	public void progressBlocks()
	{
		for (Vector2 block : getBlocks())
		{
			// if there's a block below it or off screen below it
			if (!isBlocked((int) block.x, (int) block.y - 1) && !isOffscreen((int) block.x, (int) block.y - 1)) 
			{
				block.add(0, -1);
			}
		}
	}
	
	public List<Vector2> getBlocks()
	{
		return blocks;
	}
	
	public float getWorkingWidth()
	{
		return workingWidth;
	}
	
	public int getFullWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public void addBlock(int xOrd)
	{
		if (xOrd >= workingX && xOrd < workingX + workingWidth) blocks.add(new Vector2(xOrd, height));
	}
}
	
