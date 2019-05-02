package net.qwertysam.api.save;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;

public class Settings
{
	private Preferences settings;
	private String fileName;
	
	/**
	 * A list of settings.
	 * 
	 * @param fileName the name of the file to save to
	 */
	public Settings(String fileName)
	{
		this.fileName = fileName;
		load();
	}
	
	/**
	 * Loads the options.
	 */
	public void load()
	{
		settings = Gdx.app.getPreferences(fileName);
	}
	
	/**
	 * Gets the Preferences instance.
	 * 
	 * @return the Preferences instance.
	 */
	public Preferences getSave()
	{
		return settings;
	}
	
	/**
	 * Sets a setting to a specified value.
	 * 
	 * @param key the key for the setting
	 * @param value the new value for the setting
	 */
	public void setBoolean(String key, boolean value)
	{
		settings.putBoolean(key, value);
	}
	
	/**
	 * Gets the value for a setting with the given key.
	 * 
	 * @param key the key of the setting
	 * @return the value for the setting.
	 */
	public boolean getBoolean(String key)
	{
		return settings.getBoolean(key, false);
	}
	
	/**
	 * Sets a setting to a specified value.
	 * 
	 * @param key the key for the setting
	 * @param value the new value for the setting
	 */
	public void setFloat(String key, float value)
	{
		settings.putFloat(key, value);
	}
	
	/**
	 * Gets the value for a setting with the given key.
	 * 
	 * @param key the key of the setting
	 * @return the value for the setting.
	 */
	public float getFloat(String key)
	{
		return settings.getFloat(key, 0.0F);
	}
	
	/**
	 * Sets a setting to a specified value.
	 * 
	 * @param key the key for the setting
	 * @param value the new value for the setting
	 */
	public void setInt(String key, int value)
	{
		settings.putInteger(key, value);
	}
	
	/**
	 * Gets the value for a setting with the given key.
	 * 
	 * @param key the key of the setting
	 * @return the value for the setting.
	 */
	public int getInt(String key)
	{
		return settings.getInteger(key, 0);
	}
	
	/**
	 * Sets a setting to a specified value.
	 * 
	 * @param key the key for the setting
	 * @param value the new value for the setting
	 */
	public void setLong(String key, long value)
	{
		settings.putLong(key, value);
	}
	
	/**
	 * Gets the value for a setting with the given key.
	 * 
	 * @param key the key of the setting
	 * @return the value for the setting.
	 */
	public long getLong(String key)
	{
		return settings.getLong(key, 0L);
	}
	
	/**
	 * Sets a setting to a specified value.
	 * 
	 * @param key the key for the setting
	 * @param value the new value for the setting
	 */
	public void setString(String key, String value)
	{
		settings.putString(key, value);
	}
	
	/**
	 * Gets the value for a setting with the given key.
	 * 
	 * @param key the key of the setting
	 * @return the value for the setting.
	 */
	public String getSetting(String key)
	{
		return settings.getString(key, "No String Found");
	}
}
