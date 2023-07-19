import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mj")
@Implements("MusicSong")
public class MusicSong
{
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("musicTrackArchive")
	public AbstractArchive musicTrackArchive;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1260242075
	)
	@Export("musicTrackGroupId")
	public int musicTrackGroupId;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1235114521
	)
	@Export("musicTrackFileId")
	public int musicTrackFileId;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1673909135
	)
	@Export("musicTrackVolume")
	public int musicTrackVolume;
	@ObfuscatedName("as")
	public float field3511;
	@ObfuscatedName("aj")
	@Export("musicTrackBoolean")
	public boolean musicTrackBoolean;
	@ObfuscatedName("ag")
	public boolean field3513;
	@ObfuscatedName("az")
	public boolean field3508;
	@ObfuscatedName("av")
	public boolean field3515;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("midiPcmStream")
	public MidiPcmStream midiPcmStream;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lbh;"
	)
	public SoundCache field3517;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmp;"
	)
	public MusicTrack field3518;

	@ObfuscatedSignature(
		descriptor = "(Lnd;Ljava/lang/String;Ljava/lang/String;IZ)V"
	)
	public MusicSong(AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field3511 = 0.0F;
		this.musicTrackBoolean = false;
		this.field3515 = false;
		this.musicTrackGroupId = var1.getGroupId(var2);
		this.musicTrackFileId = var1.getFileId(this.musicTrackGroupId, var3);
		this.method6067(var1, this.musicTrackGroupId, this.musicTrackFileId, var4, var5);
	}

	@ObfuscatedSignature(
		descriptor = "(Lnd;IIIZ)V"
	)
	public MusicSong(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field3511 = 0.0F;
		this.musicTrackBoolean = false;
		this.field3515 = false;
		this.method6067(var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lnd;IIIZB)V",
		garbageValue = "10"
	)
	void method6067(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.musicTrackArchive = var1;
		this.musicTrackGroupId = var2;
		this.musicTrackFileId = var3;
		this.musicTrackVolume = var4;
		this.musicTrackBoolean = var5;
	}
}
