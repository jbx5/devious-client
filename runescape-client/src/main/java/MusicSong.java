import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ns")
@Implements("MusicSong")
public class MusicSong {
	@ObfuscatedName("ai")
	@Export("ByteArrayPool_alternativeSizes")
	public static int[] ByteArrayPool_alternativeSizes;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("musicTrackArchive")
	public AbstractArchive musicTrackArchive;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1710436281
	)
	@Export("musicTrackGroupId")
	public int musicTrackGroupId;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1578912913
	)
	@Export("musicTrackFileId")
	public int musicTrackFileId;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1733889231
	)
	@Export("musicTrackVolume")
	public int musicTrackVolume;
	@ObfuscatedName("ax")
	public float field3730;
	@ObfuscatedName("aq")
	@Export("musicTrackBoolean")
	public boolean musicTrackBoolean;
	@ObfuscatedName("af")
	public boolean field3739;
	@ObfuscatedName("at")
	public boolean field3733;
	@ObfuscatedName("au")
	public boolean field3734;
	@ObfuscatedName("ar")
	boolean field3735;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("midiPcmStream")
	public MidiPcmStream midiPcmStream;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lbo;"
	)
	public SoundCache field3737;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	public MusicTrack field3731;

	@ObfuscatedSignature(
		descriptor = "(Lpo;Ljava/lang/String;Ljava/lang/String;IZ)V"
	)
	public MusicSong(AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field3730 = 0.0F;
		this.musicTrackBoolean = false;
		this.field3734 = false;
		this.field3735 = false;
		this.musicTrackGroupId = var1.getGroupId(var2);
		this.musicTrackFileId = var1.getFileId(this.musicTrackGroupId, var3);
		this.method6764(var1, this.musicTrackGroupId, this.musicTrackFileId, var4, var5);
	}

	@ObfuscatedSignature(
		descriptor = "(Lpo;IIIZ)V"
	)
	public MusicSong(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field3730 = 0.0F;
		this.musicTrackBoolean = false;
		this.field3734 = false;
		this.field3735 = false;
		this.method6764(var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lpo;IIIZI)V",
		garbageValue = "-2071384166"
	)
	void method6764(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.musicTrackArchive = var1;
		this.musicTrackGroupId = var2;
		this.musicTrackFileId = var3;
		this.musicTrackVolume = var4;
		this.musicTrackBoolean = var5;
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(Lof;Ljava/lang/String;B)V",
		garbageValue = "-72"
	)
	static void method6768(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1);
		Client.archiveLoaders.add(var2);
		Client.field814 += var2.groupCount;
	}
}
