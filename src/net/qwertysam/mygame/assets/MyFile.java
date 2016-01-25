package net.qwertysam.mygame.assets;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;

public class MyFile
{
	FileHandle data;
	
	public MyFile(String path)
	{
		data = Gdx.files.external(path);
	}
	
	public void writeBytes(byte[] bytes)
	{
		data.writeBytes(bytes, false); // false to overwrite every time
	}
	
	public void writeString(String string)
	{
		data.writeString(string, false); // false to overwrite every time
	}
	
	public void delete()
	{
		data.delete();
	}
}
