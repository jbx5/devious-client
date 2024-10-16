import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("sh")
	static boolean field848;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -513104655
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -808336809
	)
	@Export("x")
	int x;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1707025792
	)
	@Export("y")
	int y;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 879112143
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 744845696
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 41172405
	)
	int field832;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1555856707
	)
	int field839;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1225863439
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1844002325
	)
	int field842;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1572506639
	)
	int field841;
	@ObfuscatedName("ao")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1923768399
	)
	int field845;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lbf;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("obj")
	ObjectComposition obj;

	static {
		objectSounds = new NodeDeque();
	}

	ObjectSound() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-259924495"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectComposition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field832 = var2.int7 * 16384;
			this.field839 = var2.int8 * 16384;
			this.field842 = var2.int5;
			this.field841 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
		} else {
			this.soundEffectId = -1;
			this.field832 = 0;
			this.field839 = 0;
			this.field842 = 0;
			this.field841 = 0;
			this.soundEffectIds = null;
		}

		if (var1 != this.soundEffectId && this.stream1 != null) {
			Widget.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1101002526"
	)
	public static int method2083(int var0) {
		return var0 >>> 4 & class550.field5411;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ldn;IIIB)I",
		garbageValue = "-58"
	)
	static int method2081(WorldView var0, int var1, int var2, int var3) {
		if ((var0.tileSettings[var1][var2][var3] & 8) != 0) {
			return 0;
		} else {
			return var1 > 0 && (var0.tileSettings[1][var2][var3] & 2) != 0 ? var1 - 1 : var1;
		}
	}

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1455819180"
	)
	static final boolean method2082() {
		return Client.isMenuOpen;
	}
}
