import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1069532165
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1918020157
	)
	@Export("x")
	int x;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -492521873
	)
	@Export("y")
	int y;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -160459392
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 531903743
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1201609771
	)
	int field836;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1297309625
	)
	int field834;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1959928721
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lbs;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -889091399
	)
	int field837;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1050964171
	)
	int field841;
	@ObfuscatedName("aj")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -179344927
	)
	int field839;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lbs;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("obj")
	ObjectComposition obj;

	static {
		objectSounds = new NodeDeque();
	}

	ObjectSound() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-92"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectComposition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field836 = var2.int7 * 16384;
			this.field834 = var2.int8 * 128;
			this.field837 = var2.int5;
			this.field841 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
		} else {
			this.soundEffectId = -1;
			this.field836 = 0;
			this.field834 = 0;
			this.field837 = 0;
			this.field841 = 0;
			this.soundEffectIds = null;
		}

		if (var1 != this.soundEffectId && this.stream1 != null) {
			ScriptFrame.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lnc;I)V",
		garbageValue = "-1022609164"
	)
	public static void method2013(class338 var0) {
		if (!class332.field3569.contains(var0)) {
			class332.field3569.add(var0);
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1283663274"
	)
	public static int method2012(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 : 7 - var1;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Lju;",
		garbageValue = "-2117537492"
	)
	@Export("getParamDefinition")
	public static ParamComposition getParamDefinition(int var0) {
		ParamComposition var1 = (ParamComposition)ParamComposition.ParamDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ParamComposition.ParamDefinition_archive.takeFile(11, var0);
			var1 = new ParamComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			ParamComposition.ParamDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
