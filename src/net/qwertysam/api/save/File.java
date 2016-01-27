package net.qwertysam.api.save;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;

/**
 * A file that can be written to and read from.
 */
public class File
{
	private FileHandle data;
	
	/**
	 * A file that can be written to and read from.
	 * 
	 * @param path the path of the file
	 */
	public File(String path)
	{
		data = Gdx.files.external(path);
	}
	
	/**
	 * Writes an array of bytes.
	 * 
	 * @param bytes the bye array to write.
	 */
	public void writeBytes(byte[] bytes)
	{
		data.writeBytes(bytes, false); // false to overwrite every time
	}
	
	/**
	 * Reads an array of bytes.
	 * 
	 * @return the byte array read.
	 */
	public byte[] readBytes()
	{
		return data.readBytes();
	}
	
	/**
	 * Writes a string.
	 * 
	 * @param string the string to write
	 */
	public void writeString(String string)
	{
		data.writeString(string, false); // false to overwrite every time
	}
	
	/**
	 * Reads a string.
	 * 
	 * @return the string being read.
	 */
	public String readString()
	{
		return data.readString();
	}
	
	/**
	 * Deletes the file.
	 */
	public void delete()
	{
		data.delete();
	}
}
