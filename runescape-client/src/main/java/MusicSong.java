import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mv")
@Implements("MusicSong")
public class MusicSong {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("musicTrackArchive")
	public AbstractArchive musicTrackArchive;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1113976665
	)
	@Export("musicTrackGroupId")
	public int musicTrackGroupId;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1736344083
	)
	@Export("musicTrackFileId")
	public int musicTrackFileId;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1137874919
	)
	@Export("musicTrackVolume")
	public int musicTrackVolume;
	@ObfuscatedName("ao")
	public float field3542;
	@ObfuscatedName("ah")
	@Export("musicTrackBoolean")
	public boolean musicTrackBoolean;
	@ObfuscatedName("ar")
	public boolean field3547;
	@ObfuscatedName("ab")
	public boolean field3545;
	@ObfuscatedName("am")
	public boolean field3546;
	@ObfuscatedName("av")
	boolean field3550;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("midiPcmStream")
	public MidiPcmStream midiPcmStream;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lbl;"
	)
	public SoundCache field3549;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public MusicTrack field3548;

	@ObfuscatedSignature(
		descriptor = "(Lom;IIIZ)V"
	)
	public MusicSong(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field3542 = 0.0F;
		this.musicTrackBoolean = false;
		this.field3546 = false;
		this.field3550 = false;
		this.method6207(var1, var2, var3, var4, var5);
	}

	@ObfuscatedSignature(
		descriptor = "(Lom;Ljava/lang/String;Ljava/lang/String;IZ)V"
	)
	public MusicSong(AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field3542 = 0.0F;
		this.musicTrackBoolean = false;
		this.field3546 = false;
		this.field3550 = false;
		this.musicTrackGroupId = var1.getGroupId(var2);
		this.musicTrackFileId = var1.getFileId(this.musicTrackGroupId, var3);
		this.method6207(var1, this.musicTrackGroupId, this.musicTrackFileId, var4, var5);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lom;IIIZB)V",
		garbageValue = "-90"
	)
	void method6207(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.musicTrackArchive = var1;
		this.musicTrackGroupId = var2;
		this.musicTrackFileId = var3;
		this.musicTrackVolume = var4;
		this.musicTrackBoolean = var5;
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(Lok;Ljava/lang/String;B)V",
		garbageValue = "-43"
	)
	static void method6210(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1);
		Client.archiveLoaders.add(var2);
		Client.field819 += var2.groupCount;
	}
}
