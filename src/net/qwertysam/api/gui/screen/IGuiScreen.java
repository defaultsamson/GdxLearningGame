package net.qwertysam.api.gui.screen;

public interface IGuiScreen
{
	/**
	 * Progresses the game.
	 * 
	 * @param delta the time between the last time the game progressed and the time that this is currently being run
	 */
	public void tick(float delta);
	
	/**
	 * Draws the screen.
	 * 
	 * @param delta the time between the last time the screen was drawn and the time that this is currently being drawn
	 */
	public void drawScreen(float delta);
}
