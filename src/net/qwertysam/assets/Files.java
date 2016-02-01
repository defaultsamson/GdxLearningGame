package net.qwertysam.assets;

import net.qwertysam.api.resource.IDisposable;
import net.qwertysam.api.save.File;
import net.qwertysam.main.MyGdxGame;

public class Files implements IDisposable
{
	private MyGdxGame game;
	
	public File file1;
	
	public Files(MyGdxGame game)
	{
		this.game = game;
		
		load();
	}
	
	private void load()
	{
		file1 = new File("qwertysam/save1.qw");
	}
	
	@Override
	public void dispose()
	{
	
	}
	
	public MyGdxGame getGame()
	{
		return game;
	}
}
