import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ns")
@Implements("MusicSong")
public class MusicSong {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("musicTrackArchive")
	public AbstractArchive musicTrackArchive;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1516252477
	)
	@Export("musicTrackGroupId")
	public int musicTrackGroupId;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -239630077
	)
	@Export("musicTrackFileId")
	public int musicTrackFileId;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1287935663
	)
	@Export("musicTrackVolume")
	public int musicTrackVolume;
	@ObfuscatedName("af")
	public float field3688;
	@ObfuscatedName("aa")
	@Export("musicTrackBoolean")
	public boolean musicTrackBoolean;
	@ObfuscatedName("at")
	public boolean field3687;
	@ObfuscatedName("ab")
	public boolean field3694;
	@ObfuscatedName("ac")
	public boolean field3696;
	@ObfuscatedName("ao")
	boolean field3692;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	@Export("midiPcmStream")
	public MidiPcmStream midiPcmStream;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lbq;"
	)
	public SoundCache field3695;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	public MusicTrack field3685;

	@ObfuscatedSignature(
		descriptor = "(Lor;Ljava/lang/String;Ljava/lang/String;IZ)V"
	)
	public MusicSong(AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field3688 = 0.0F;
		this.musicTrackBoolean = false;
		this.field3696 = false;
		this.field3692 = false;
		this.musicTrackGroupId = var1.getGroupId(var2);
		this.musicTrackFileId = var1.getFileId(this.musicTrackGroupId, var3);
		this.method6492(var1, this.musicTrackGroupId, this.musicTrackFileId, var4, var5);
	}

	@ObfuscatedSignature(
		descriptor = "(Lor;IIIZ)V"
	)
	public MusicSong(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field3688 = 0.0F;
		this.musicTrackBoolean = false;
		this.field3696 = false;
		this.field3692 = false;
		this.method6492(var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lor;IIIZB)V",
		garbageValue = "-94"
	)
	void method6492(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.musicTrackArchive = var1;
		this.musicTrackGroupId = var2;
		this.musicTrackFileId = var3;
		this.musicTrackVolume = var4;
		this.musicTrackBoolean = var5;
	}
}
