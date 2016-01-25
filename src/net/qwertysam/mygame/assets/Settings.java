package net.qwertysam.mygame.assets;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;

public class Settings
{
	private Preferences settings;
	
	public Settings()
	{
		load();
	}
	
	public void load()
	{
		settings = Gdx.app.getPreferences("settings");
	}
	
	public Preferences getSettings()
	{
		return settings;
	}
	
	public String getSetting(String key)
	{
		return settings.getString(key, "No String Found");
	}
}
