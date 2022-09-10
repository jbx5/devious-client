import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("FloorOverlayDefinition_archive")
	public static AbstractArchive FloorOverlayDefinition_archive;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("FloorOverlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("WorldMapElement_fonts")
	static Fonts WorldMapElement_fonts;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -513383363
	)
	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1475480229
	)
	@Export("texture")
	public int texture;
	@ObfuscatedName("k")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 2030186885
	)
	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1770337771
	)
	@Export("hue")
	public int hue;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1122902615
	)
	@Export("saturation")
	public int saturation;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -2142098127
	)
	@Export("lightness")
	public int lightness;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1651171061
	)
	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1008787805
	)
	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1117781413
	)
	@Export("secondaryLightness")
	public int secondaryLightness;

	static {
		FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64); // L: 11
	}

	public FloorOverlayDefinition() {
		this.primaryRgb = 0; // L: 12
		this.texture = -1; // L: 13
		this.hideUnderlay = true; // L: 14
		this.secondaryRgb = -1; // L: 15
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2130558716"
	)
	@Export("postDecode")
	public void postDecode() {
		if (this.secondaryRgb != -1) { // L: 28
			this.setHsl(this.secondaryRgb); // L: 29
			this.secondaryHue = this.hue; // L: 30
			this.secondarySaturation = this.saturation; // L: 31
			this.secondaryLightness = this.lightness;
		}

		this.setHsl(this.primaryRgb); // L: 34
	} // L: 35

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqq;II)V",
		garbageValue = "-1223843884"
	)
	@Export("decode")
	public void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte(); // L: 39
			if (var3 == 0) { // L: 40
				return; // L: 43
			}

			this.decodeNext(var1, var3, var2); // L: 41
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lqq;IIB)V",
		garbageValue = "81"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) { // L: 46
			this.primaryRgb = var1.readMedium();
		} else if (var2 == 2) {
			this.texture = var1.readUnsignedByte(); // L: 47
		} else if (var2 == 5) { // L: 48
			this.hideUnderlay = false;
		} else if (var2 == 7) {
			this.secondaryRgb = var1.readMedium(); // L: 49
		} else if (var2 == 8) { // L: 50
		}

	} // L: 52

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-601790577"
	)
	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = (double)(var1 >> 16 & 255) / 256.0D; // L: 55
		double var4 = (double)(var1 >> 8 & 255) / 256.0D; // L: 56
		double var6 = (double)(var1 & 255) / 256.0D; // L: 57
		double var8 = var2; // L: 58
		if (var4 < var2) { // L: 59
			var8 = var4;
		}

		if (var6 < var8) { // L: 60
			var8 = var6;
		}

		double var10 = var2; // L: 61
		if (var4 > var2) { // L: 62
			var10 = var4;
		}

		if (var6 > var10) { // L: 63
			var10 = var6;
		}

		double var12 = 0.0D; // L: 64
		double var14 = 0.0D; // L: 65
		double var16 = (var10 + var8) / 2.0D; // L: 66
		if (var8 != var10) { // L: 67
			if (var16 < 0.5D) { // L: 68
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) { // L: 69
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var10 == var2) { // L: 70
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) { // L: 71
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var10 == var6) {
				var12 = 4.0D + (var2 - var4) / (var10 - var8); // L: 72
			}
		}

		var12 /= 6.0D; // L: 74
		this.hue = (int)(var12 * 256.0D); // L: 75
		this.saturation = (int)(var14 * 256.0D); // L: 76
		this.lightness = (int)(256.0D * var16); // L: 77
		if (this.saturation < 0) { // L: 78
			this.saturation = 0;
		} else if (this.saturation > 255) { // L: 79
			this.saturation = 255;
		}

		if (this.lightness < 0) { // L: 80
			this.lightness = 0;
		} else if (this.lightness > 255) { // L: 81
			this.lightness = 255;
		}

	} // L: 82

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "878298994"
	)
	static void method3912(int var0) {
	} // L: 32

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1358201950"
	)
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (class83.Widget_loadedInterfaces[var0]) { // L: 238
			return true;
		} else if (!MouseHandler.Widget_archive.tryLoadGroup(var0)) { // L: 239
			return false;
		} else {
			int var1 = MouseHandler.Widget_archive.getGroupFileCount(var0); // L: 240
			if (var1 == 0) { // L: 241
				class83.Widget_loadedInterfaces[var0] = true; // L: 242
				return true; // L: 243
			} else {
				if (Calendar.Widget_interfaceComponents[var0] == null) { // L: 245
					Calendar.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) { // L: 246
					if (Calendar.Widget_interfaceComponents[var0][var2] == null) { // L: 247
						byte[] var3 = MouseHandler.Widget_archive.takeFile(var0, var2); // L: 248
						if (var3 != null) { // L: 249
							Calendar.Widget_interfaceComponents[var0][var2] = new Widget(); // L: 250
							Calendar.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16); // L: 251
							if (var3[0] == -1) { // L: 252
								Calendar.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								Calendar.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3)); // L: 253
							}
						}
					}
				}

				class83.Widget_loadedInterfaces[var0] = true; // L: 257
				return true; // L: 258
			}
		}
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "999765437"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		AbstractWorldMapIcon.method5183(); // L: 8126
		Client.menuActions[0] = "Cancel"; // L: 8127
		Client.menuTargets[0] = ""; // L: 8128
		Client.menuOpcodes[0] = 1006; // L: 8129
		Client.menuShiftClick[0] = false; // L: 8130
		Client.menuOptionsCount = 1; // L: 8131
	} // L: 8132
}
