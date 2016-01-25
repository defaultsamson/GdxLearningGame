package net.qwertysam.mygame.assets;

import net.qwertysam.main.MyGdxGame;
import net.qwertysam.resource.IDisposable;

public class FileManager implements IDisposable
{
	private MyGdxGame game;
	
	public MyFile file1;
	
	public FileManager(MyGdxGame game)
	{
		this.game = game;
		
		load();
	}
	
	private void load()
	{
		file1 = new MyFile("qwertysam/save1.qw");
	}
	
	@Override
	public void dispose()
	{
	
	}
}
