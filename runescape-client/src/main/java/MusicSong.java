import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nm")
@Implements("MusicSong")
public class MusicSong {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("musicTrackArchive")
	public AbstractArchive musicTrackArchive;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1234485003
	)
	@Export("musicTrackGroupId")
	public int musicTrackGroupId;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 821498491
	)
	@Export("musicTrackFileId")
	public int musicTrackFileId;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 562187867
	)
	@Export("musicTrackVolume")
	public int musicTrackVolume;
	@ObfuscatedName("ap")
	public float field3704;
	@ObfuscatedName("an")
	@Export("musicTrackBoolean")
	public boolean musicTrackBoolean;
	@ObfuscatedName("aj")
	public boolean field3709;
	@ObfuscatedName("av")
	public boolean field3710;
	@ObfuscatedName("ab")
	public boolean field3715;
	@ObfuscatedName("ai")
	public boolean field3712;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("midiPcmStream")
	public MidiPcmStream midiPcmStream;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lbh;"
	)
	public SoundCache field3714;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	public MusicTrack field3703;

	@ObfuscatedSignature(
		descriptor = "(Lok;Ljava/lang/String;Ljava/lang/String;IZ)V"
	)
	public MusicSong(AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field3704 = 0.0F;
		this.musicTrackBoolean = false;
		this.field3715 = false;
		this.field3712 = false;
		this.musicTrackGroupId = var1.getGroupId(var2);
		this.musicTrackFileId = var1.getFileId(this.musicTrackGroupId, var3);
		this.method6439(var1, this.musicTrackGroupId, this.musicTrackFileId, var4, var5);
	}

	@ObfuscatedSignature(
		descriptor = "(Lok;IIIZ)V"
	)
	public MusicSong(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field3704 = 0.0F;
		this.musicTrackBoolean = false;
		this.field3715 = false;
		this.field3712 = false;
		this.method6439(var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lok;IIIZS)V",
		garbageValue = "7788"
	)
	void method6439(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.musicTrackArchive = var1;
		this.musicTrackGroupId = var2;
		this.musicTrackFileId = var3;
		this.musicTrackVolume = var4;
		this.musicTrackBoolean = var5;
	}
}
