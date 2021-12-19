package net.runelite.rs.api;

import net.runelite.api.Preferences;
import net.runelite.mapping.Import;

public interface RSClientPreferences extends Preferences
{
	@Import("rememberedUsername")
	@Override
	String getRememberedUsername();

	@Import("rememberedUsername")
	@Override
	void setRememberedUsername(String username);

	@Import("soundEffectsVolume")
	@Override
	int getSoundEffectVolume();

	@Import("soundEffectsVolume")
	@Override
	void setSoundEffectVolume(int i);

	@Import("areaSoundEffectsVolume")
	@Override
	int getAreaSoundEffectVolume();

	@Import("areaSoundEffectsVolume")
	@Override
	void setAreaSoundEffectVolume(int i);

	@Import("musicVolume")
	int getMusicVolume();

	@Import("musicVolume")
	void setMusicVolume(int i);

	@Import("hideUsername")
	boolean getHideUsername();

	@Import("roofsHidden")
	@Override
	void setHidingRoofs(boolean hidden);

	@Import("roofsHidden")
	@Override
	boolean isHidingRoofs();

	@Import("windowMode")
	@Override
	void setWindowMode(int mode);

	@Import("windowMode")
	@Override
	int getWindowMode();

	@Import("titleMusicDisabled")
	@Override
	boolean isTitleMusicDisabled();

	@Import("titleMusicDisabled")
	@Override
	void setTitleMusicDisabled(boolean disabled);
}
