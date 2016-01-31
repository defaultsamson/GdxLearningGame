package net.qwertysam.language;

import net.qwertysam.api.language.Language;
import net.qwertysam.api.language.Translation;
import net.qwertysam.api.language.TranslationHolder;
import net.qwertysam.api.language.TranslationKey;
import net.qwertysam.api.language.TranslationManager;
import net.qwertysam.main.MyGdxGame;

public class GameTranslations extends TranslationManager
{
	private MyGdxGame game;
	
	public GameTranslations(MyGdxGame game)
	{
		super();
		this.game = game;
		
		registerEntry(new TranslationHolder(TranslationKey.GUI_BUTTON_PLAY, new Translation("Play", Language.ENGLISH, Language.AMERICAN_ENGLISH), new Translation("Joue", Language.FRENCH)));
	}
	
	/**
	 * Gets the translation of a key for the game's selected language.
	 * 
	 * @param key the key
	 * @return the translation of the key.
	 */
	public String getTranslation(TranslationKey key)
	{
		return getTranslation(key, game.getLanguage());
	}
}
