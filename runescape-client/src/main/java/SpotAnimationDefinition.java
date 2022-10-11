import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("SpotAnimationDefinition_archive")
	static AbstractArchive SpotAnimationDefinition_archive;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("SpotAnimationDefinition_cached")
	static EvictingDualNodeHashTable SpotAnimationDefinition_cached;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("SpotAnimationDefinition_cachedModels")
	static EvictingDualNodeHashTable SpotAnimationDefinition_cachedModels;
	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "[Lqi;"
	)
	@Export("crossSprites")
	static SpritePixels[] crossSprites;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1753731371
	)
	@Export("id")
	int id;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1094245679
	)
	@Export("archive")
	int archive;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 123967633
	)
	@Export("sequence")
	public int sequence;
	@ObfuscatedName("q")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("m")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("x")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("j")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -2122918033
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1500333515
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1138258447
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1615497413
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1594501559
	)
	@Export("contrast")
	int contrast;

	static {
		SpotAnimationDefinition_cached = new EvictingDualNodeHashTable(64); // L: 14
		SpotAnimationDefinition_cachedModels = new EvictingDualNodeHashTable(30); // L: 15
	}

	SpotAnimationDefinition() {
		this.sequence = -1; // L: 18
		this.widthScale = 128; // L: 23
		this.heightScale = 128; // L: 24
		this.orientation = 0; // L: 25
		this.ambient = 0; // L: 26
		this.contrast = 0; // L: 27
	} // L: 29

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqq;I)V",
		garbageValue = "-1005863468"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 49
			if (var2 == 0) { // L: 50
				return; // L: 53
			}

			this.decodeNext(var1, var2); // L: 51
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lqq;IS)V",
		garbageValue = "9298"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 56
			this.archive = var1.readUnsignedShort();
		} else if (var2 == 2) { // L: 57
			this.sequence = var1.readUnsignedShort();
		} else if (var2 == 4) { // L: 58
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 5) { // L: 59
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 6) { // L: 60
			this.orientation = var1.readUnsignedShort();
		} else if (var2 == 7) { // L: 61
			this.ambient = var1.readUnsignedByte();
		} else if (var2 == 8) {
			this.contrast = var1.readUnsignedByte(); // L: 62
		} else {
			int var3;
			int var4;
			if (var2 == 40) { // L: 63
				var3 = var1.readUnsignedByte(); // L: 64
				this.recolorFrom = new short[var3]; // L: 65
				this.recolorTo = new short[var3]; // L: 66

				for (var4 = 0; var4 < var3; ++var4) { // L: 67
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 68
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 69
				}
			} else if (var2 == 41) { // L: 72
				var3 = var1.readUnsignedByte(); // L: 73
				this.retextureFrom = new short[var3]; // L: 74
				this.retextureTo = new short[var3]; // L: 75

				for (var4 = 0; var4 < var3; ++var4) { // L: 76
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 77
					this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 78
				}
			}
		}

	} // L: 82

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Lha;",
		garbageValue = "232626041"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		Model var2 = (Model)SpotAnimationDefinition_cachedModels.get((long)this.id); // L: 85
		if (var2 == null) { // L: 86
			ModelData var3 = ModelData.ModelData_get(class11.SpotAnimationDefinition_modelArchive, this.archive, 0); // L: 87
			if (var3 == null) { // L: 88
				return null;
			}

			int var4;
			if (this.recolorFrom != null) { // L: 89
				for (var4 = 0; var4 < this.recolorFrom.length; ++var4) { // L: 90
					var3.recolor(this.recolorFrom[var4], this.recolorTo[var4]); // L: 91
				}
			}

			if (this.retextureFrom != null) { // L: 94
				for (var4 = 0; var4 < this.retextureFrom.length; ++var4) { // L: 95
					var3.retexture(this.retextureFrom[var4], this.retextureTo[var4]); // L: 96
				}
			}

			var2 = var3.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30); // L: 99
			SpotAnimationDefinition_cachedModels.put(var2, (long)this.id); // L: 100
		}

		Model var5;
		if (this.sequence != -1 && var1 != -1) { // L: 103
			var5 = class4.SequenceDefinition_get(this.sequence).transformSpotAnimationModel(var2, var1);
		} else {
			var5 = var2.toSharedSpotAnimationModel(true); // L: 104
		}

		if (this.widthScale != 128 || this.heightScale != 128) { // L: 105
			var5.scale(this.widthScale, this.heightScale, this.widthScale);
		}

		if (this.orientation != 0) { // L: 106
			if (this.orientation == 90) { // L: 107
				var5.rotateY90Ccw();
			}

			if (this.orientation == 180) { // L: 108
				var5.rotateY90Ccw(); // L: 109
				var5.rotateY90Ccw(); // L: 110
			}

			if (this.orientation == 270) { // L: 112
				var5.rotateY90Ccw(); // L: 113
				var5.rotateY90Ccw(); // L: 114
				var5.rotateY90Ccw(); // L: 115
			}
		}

		return var5; // L: 118
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IS)Lkw;",
		garbageValue = "18609"
	)
	@Export("getWidget")
	public static Widget getWidget(int var0) {
		int var1 = var0 >> 16; // L: 221
		int var2 = var0 & 65535; // L: 222
		if (Calendar.Widget_interfaceComponents[var1] == null || Calendar.Widget_interfaceComponents[var1][var2] == null) { // L: 223
			boolean var3 = FloorOverlayDefinition.loadInterface(var1); // L: 224
			if (!var3) { // L: 225
				return null;
			}
		}

		return Calendar.Widget_interfaceComponents[var1][var2]; // L: 227
	}
}
