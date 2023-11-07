import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mt")
@Implements("MusicSong")
public class MusicSong {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("musicTrackArchive")
	public AbstractArchive musicTrackArchive;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -472615137
	)
	@Export("musicTrackGroupId")
	public int musicTrackGroupId;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -244039391
	)
	@Export("musicTrackFileId")
	public int musicTrackFileId;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1531384173
	)
	@Export("musicTrackVolume")
	public int musicTrackVolume;
	@ObfuscatedName("ab")
	public float field3528;
	@ObfuscatedName("au")
	@Export("musicTrackBoolean")
	public boolean musicTrackBoolean;
	@ObfuscatedName("aa")
	public boolean field3536;
	@ObfuscatedName("ac")
	public boolean field3524;
	@ObfuscatedName("al")
	public boolean field3530;
	@ObfuscatedName("az")
	boolean field3526;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	@Export("midiPcmStream")
	public MidiPcmStream midiPcmStream;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lbc;"
	)
	public SoundCache field3533;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	public MusicTrack field3534;

	@ObfuscatedSignature(
		descriptor = "(Lol;Ljava/lang/String;Ljava/lang/String;IZ)V"
	)
	public MusicSong(AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field3528 = 0.0F;
		this.musicTrackBoolean = false;
		this.field3530 = false;
		this.field3526 = false;
		this.musicTrackGroupId = var1.getGroupId(var2);
		this.musicTrackFileId = var1.getFileId(this.musicTrackGroupId, var3);
		this.method6250(var1, this.musicTrackGroupId, this.musicTrackFileId, var4, var5);
	}

	@ObfuscatedSignature(
		descriptor = "(Lol;IIIZ)V"
	)
	public MusicSong(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field3528 = 0.0F;
		this.musicTrackBoolean = false;
		this.field3530 = false;
		this.field3526 = false;
		this.method6250(var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lol;IIIZI)V",
		garbageValue = "-2008731586"
	)
	void method6250(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.musicTrackArchive = var1;
		this.musicTrackGroupId = var2;
		this.musicTrackFileId = var3;
		this.musicTrackVolume = var4;
		this.musicTrackBoolean = var5;
	}
}
