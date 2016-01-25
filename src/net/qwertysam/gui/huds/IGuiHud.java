package net.qwertysam.gui.huds;

public interface IGuiHud
{
	public void init();
	
	public void pressAction(int buttonID);
	
	public void releaseAction(int buttonID);
}
