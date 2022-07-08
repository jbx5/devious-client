import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("bv")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Llo;")
	@Export("objectSounds")
	static NodeDeque objectSounds;

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "Lqt;")
	@Export("NetCache_responseArchiveBuffer")
	public static Buffer NetCache_responseArchiveBuffer;

	@ObfuscatedName("hz")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 383647409)
	@Export("plane")
	int plane;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -452601419)
	@Export("x")
	int x;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -1502495581)
	@Export("y")
	int y;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = -440386389)
	@Export("maxX")
	int maxX;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 1252508363)
	@Export("maxY")
	int maxY;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = -1534240837)
	int field812;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -1052748779)
	@Export("soundEffectId")
	int soundEffectId;

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "Lai;")
	@Export("stream1")
	RawPcmStream stream1;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = -780332289)
	int field819;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = -26226485)
	int field811;

	@ObfuscatedName("t")
	@Export("soundEffectIds")
	int[] soundEffectIds;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 2025868067)
	int field809;

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "Lgk;")
	@Export("obj")
	ObjectComposition obj;

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lai;")
	@Export("stream2")
	RawPcmStream stream2;

	static {
		objectSounds = new NodeDeque();
	}

	ObjectSound() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1121489071")
	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectComposition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field812 = var2.int7 * 128;
			this.field819 = var2.int5;
			this.field811 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
		} else {
			this.soundEffectId = -1;
			this.field812 = 0;
			this.field819 = 0;
			this.field811 = 0;
			this.soundEffectIds = null;
		}
		if (var1 != this.soundEffectId && this.stream1 != null) {
			class21.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(IB)Lfx;", garbageValue = "84")
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = ((SpotAnimationDefinition) (SpotAnimationDefinition.SpotAnimationDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0);
			var1 = new SpotAnimationDefinition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}
			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "([Ljava/lang/String;[SIII)V", garbageValue = "-1948932811")
	@Export("sortItemsByName")
	public static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			short var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;
			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					short var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}
			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			sortItemsByName(var0, var1, var2, var5 - 1);
			sortItemsByName(var0, var1, var5 + 1, var3);
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1730846792")
	public static void method1702() {
		ItemComposition.ItemDefinition_cached.clear();
		ItemComposition.ItemDefinition_cachedModels.clear();
		ItemComposition.ItemDefinition_cachedSprites.clear();
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(descriptor = "(Lkb;B)Z", garbageValue = "103")
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) {
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) {
				int var2 = Canvas.method319(var0, var1);
				int var3 = var0.cs1ComparisonValues[var1];
				if (var0.cs1Comparisons[var1] == 2) {
					if (var2 >= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) {
					if (var2 <= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) {
					if (var2 == var3) {
						return false;
					}
				} else if (var2 != var3) {
					return false;
				}
			}
			return true;
		}
	}
}