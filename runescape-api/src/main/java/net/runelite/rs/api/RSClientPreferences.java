package net.runelite.rs.api;

import java.util.Map;
import net.runelite.api.Preferences;
import net.runelite.mapping.Import;

public interface RSClientPreferences extends Preferences
{
	@Import("roofsHidden")
	@Override
	void setHidingRoofs(boolean hidden);

	@Import("roofsHidden")
	@Override
	boolean isHidingRoofs();

	@Import("hideUsername")
	@Override
	boolean getHideUsername();

	@Import("hideUsername")
	@Override
	void setHideUsername(boolean hide);

	@Import("titleMusicDisabled")
	@Override
	boolean isTitleMusicDisabled();

	@Import("titleMusicDisabled")
	@Override
	void setTitleMusicDisabled(boolean disabled);

	@Import("displayFps")
	@Override
	boolean isDisplayFps();

	@Import("displayFps")
	@Override
	void setDisplayFps(boolean displayFps);

	@Import("brightness")
	@Override
	double getBrightness();

	@Import("brightness")
	@Override
	void setBrightness(double brightness);

	@Import("musicVolume")
	@Override
	int getMusicVolume();

	@Import("musicVolume")
	@Override
	void setMusicVolume(int i);

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

	@Import("eula")
	@Override
	int getEula();

	@Import("eula")
	@Override
	void setEula(int eula);

	@Import("rememberedUsername")
	@Override
	String getRememberedUsername();

	@Import("rememberedUsername")
	@Override
	void setRememberedUsername(String username);

	@Import("windowMode")
	@Override
	void setWindowMode(int mode);

	@Import("windowMode")
	@Override
	int getWindowMode();

	@Import("drawDistance")
	@Override
	int getDrawDistance();

	@Import("drawDistance")
	@Override
	void setDrawDistance(int drawDistance);

	@Import("parameters")
	@Override
	Map getParameters();

	@Import("savePreferences")
	@Override
	void savePreferences();
}
