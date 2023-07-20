package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSMusicSong
{
	@Import("midiPcmStream")
	RSMidiPcmStream getMidiPcmStream();

	@Import("musicTrackArchive")
	void setMusicTrackArchive(RSAbstractArchive var0);

	@Import("musicTrackGroupId")
	void setMusicTrackGroupId(int var0);

	@Import("musicTrackFileId")
	void setMusicTrackFileId(int var0);

	@Import("musicTrackVolume")
	void setMusicTrackVolume(int volume);

	@Import("musicTrackBoolean")
	void setMusicTrackBoolean(boolean var0);

	@Import("musicTrackGroupId")
	int getMusicTrackGroupId();

	@Import("musicTrackFileId")
	int getMusicTrackFileId();

	//@Import("pcmSampleLength")
	//void setPcmSampleLength(int var0);
}
