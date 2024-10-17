import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("no")
@Implements("MusicSong")
public class MusicSong {
	@ObfuscatedName("va")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("musicTrackArchive")
	public AbstractArchive musicTrackArchive;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -893316127
	)
	@Export("musicTrackGroupId")
	public int musicTrackGroupId;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 380940733
	)
	@Export("musicTrackFileId")
	public int musicTrackFileId;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1286577357
	)
	@Export("musicTrackVolume")
	public int musicTrackVolume;
	@ObfuscatedName("ai")
	public float field3749;
	@ObfuscatedName("ay")
	@Export("musicTrackBoolean")
	public boolean musicTrackBoolean;
	@ObfuscatedName("as")
	public boolean field3757;
	@ObfuscatedName("ae")
	public boolean field3750;
	@ObfuscatedName("am")
	public boolean field3751;
	@ObfuscatedName("at")
	boolean field3752;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	@Export("midiPcmStream")
	public MidiPcmStream midiPcmStream;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lba;"
	)
	public SoundCache field3754;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	public MusicTrack field3753;

	@ObfuscatedSignature(
		descriptor = "(Lpe;Ljava/lang/String;Ljava/lang/String;IZ)V"
	)
	public MusicSong(AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field3749 = 0.0F;
		this.musicTrackBoolean = false;
		this.field3751 = false;
		this.field3752 = false;
		this.musicTrackGroupId = var1.getGroupId(var2);
		this.musicTrackFileId = var1.getFileId(this.musicTrackGroupId, var3);
		this.method6828(var1, this.musicTrackGroupId, this.musicTrackFileId, var4, var5);
	}

	@ObfuscatedSignature(
		descriptor = "(Lpe;IIIZ)V"
	)
	public MusicSong(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field3749 = 0.0F;
		this.musicTrackBoolean = false;
		this.field3751 = false;
		this.field3752 = false;
		this.method6828(var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lpe;IIIZB)V",
		garbageValue = "35"
	)
	void method6828(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.musicTrackArchive = var1;
		this.musicTrackGroupId = var2;
		this.musicTrackFileId = var3;
		this.musicTrackVolume = var4;
		this.musicTrackBoolean = var5;
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(Ldw;I)V",
		garbageValue = "440270635"
	)
	static final void method6829(Actor var0) {
		boolean var1 = var0.field1273 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0;
		if (!var1) {
			SequenceDefinition var2 = Widget.SequenceDefinition_get(var0.sequence);
			if (var2 != null && !var2.isCachedModelIdSet()) {
				var1 = var0.sequenceFrameCycle + 1 > var2.frameLengths[var0.sequenceFrame];
			} else {
				var1 = true;
			}
		}

		if (var1) {
			int var8 = var0.field1273 - var0.spotAnimation;
			int var3 = Client.cycle - var0.spotAnimation;
			int var4 = var0.field1268 * 128 + var0.field1220 * 64;
			int var5 = var0.field1228 * 128 + var0.field1220 * 64;
			int var6 = var0.field1286 * 128 + var0.field1220 * 64;
			int var7 = var0.field1271 * 128 + var0.field1220 * 64;
			var0.x = (var6 * var3 + var4 * (var8 - var3)) / var8;
			var0.y = (var3 * var7 + var5 * (var8 - var3)) / var8;
		}

		var0.field1263 = 0;
		var0.orientation = var0.field1223;
		var0.rotation = var0.orientation;
	}
}
