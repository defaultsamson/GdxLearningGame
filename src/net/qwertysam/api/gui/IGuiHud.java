package net.qwertysam.api.gui;

public interface IGuiHud
{
	public void init();
	
	public void pressAction(int buttonID);
	
	public void releaseAction(int buttonID);
}
