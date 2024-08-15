import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ng")
@Implements("MusicSong")
public class MusicSong {
	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "[Lvc;"
	)
	@Export("crossSprites")
	static SpritePixels[] crossSprites;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	@Export("musicTrackArchive")
	public AbstractArchive musicTrackArchive;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -277647425
	)
	@Export("musicTrackGroupId")
	public int musicTrackGroupId;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 2066235199
	)
	@Export("musicTrackFileId")
	public int musicTrackFileId;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -757114409
	)
	@Export("musicTrackVolume")
	public int musicTrackVolume;
	@ObfuscatedName("ax")
	public float field3676;
	@ObfuscatedName("ao")
	@Export("musicTrackBoolean")
	public boolean musicTrackBoolean;
	@ObfuscatedName("am")
	public boolean field3678;
	@ObfuscatedName("ac")
	public boolean field3679;
	@ObfuscatedName("ae")
	public boolean field3680;
	@ObfuscatedName("ad")
	boolean field3681;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("midiPcmStream")
	public MidiPcmStream midiPcmStream;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lbn;"
	)
	public SoundCache field3683;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	public MusicTrack field3684;

	@ObfuscatedSignature(
		descriptor = "(Lob;Ljava/lang/String;Ljava/lang/String;IZ)V"
	)
	public MusicSong(AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field3676 = 0.0F;
		this.musicTrackBoolean = false;
		this.field3680 = false;
		this.field3681 = false;
		this.musicTrackGroupId = var1.getGroupId(var2);
		this.musicTrackFileId = var1.getFileId(this.musicTrackGroupId, var3);
		this.method6484(var1, this.musicTrackGroupId, this.musicTrackFileId, var4, var5);
	}

	@ObfuscatedSignature(
		descriptor = "(Lob;IIIZ)V"
	)
	public MusicSong(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field3676 = 0.0F;
		this.musicTrackBoolean = false;
		this.field3680 = false;
		this.field3681 = false;
		this.method6484(var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lob;IIIZI)V",
		garbageValue = "-1775931191"
	)
	void method6484(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.musicTrackArchive = var1;
		this.musicTrackGroupId = var2;
		this.musicTrackFileId = var3;
		this.musicTrackVolume = var4;
		this.musicTrackBoolean = var5;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-24245568"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}
}
