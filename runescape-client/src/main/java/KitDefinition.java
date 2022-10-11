import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
@Implements("KitDefinition")
public class KitDefinition extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("KitDefinition_archive")
	public static AbstractArchive KitDefinition_archive;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -31943631
	)
	@Export("KitDefinition_fileCount")
	public static int KitDefinition_fileCount;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("KitDefinition_cached")
	public static EvictingDualNodeHashTable KitDefinition_cached;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 2136918165
	)
	@Export("bodypartID")
	public int bodypartID;
	@ObfuscatedName("w")
	@Export("models2")
	int[] models2;
	@ObfuscatedName("s")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("q")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("m")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("x")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("j")
	@Export("models")
	int[] models;
	@ObfuscatedName("v")
	@Export("nonSelectable")
	public boolean nonSelectable;

	static {
		KitDefinition_cached = new EvictingDualNodeHashTable(64); // L: 14
	}

	KitDefinition() {
		this.bodypartID = -1; // L: 15
		this.models = new int[]{-1, -1, -1, -1, -1}; // L: 21
		this.nonSelectable = false; // L: 22
	} // L: 24

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lqq;I)V",
		garbageValue = "1148972426"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 38
			if (var2 == 0) { // L: 39
				return; // L: 42
			}

			this.decodeNext(var1, var2); // L: 40
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqq;II)V",
		garbageValue = "527391355"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.bodypartID = var1.readUnsignedByte();
		} else {
			int var3;
			int var4;
			if (var2 == 2) {
				var3 = var1.readUnsignedByte(); // L: 47
				this.models2 = new int[var3]; // L: 48

				for (var4 = 0; var4 < var3; ++var4) { // L: 49
					this.models2[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 3) { // L: 51
				this.nonSelectable = true;
			} else if (var2 == 40) { // L: 52
				var3 = var1.readUnsignedByte(); // L: 53
				this.recolorFrom = new short[var3]; // L: 54
				this.recolorTo = new short[var3]; // L: 55

				for (var4 = 0; var4 < var3; ++var4) { // L: 56
					this.recolorFrom[var4] = (short)var1.readUnsignedShort(); // L: 57
					this.recolorTo[var4] = (short)var1.readUnsignedShort(); // L: 58
				}
			} else if (var2 == 41) { // L: 61
				var3 = var1.readUnsignedByte(); // L: 62
				this.retextureFrom = new short[var3]; // L: 63
				this.retextureTo = new short[var3]; // L: 64

				for (var4 = 0; var4 < var3; ++var4) { // L: 65
					this.retextureFrom[var4] = (short)var1.readUnsignedShort(); // L: 66
					this.retextureTo[var4] = (short)var1.readUnsignedShort(); // L: 67
				}
			} else if (var2 >= 60 && var2 < 70) { // L: 70
				this.models[var2 - 60] = var1.readUnsignedShort();
			}
		}

	} // L: 72

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "7"
	)
	@Export("ready")
	public boolean ready() {
		if (this.models2 == null) { // L: 75
			return true;
		} else {
			boolean var1 = true; // L: 76

			for (int var2 = 0; var2 < this.models2.length; ++var2) { // L: 77
				if (!class431.KitDefinition_modelsArchive.tryLoadFile(this.models2[var2], 0)) {
					var1 = false;
				}
			}

			return var1; // L: 78
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Lgu;",
		garbageValue = "1781640364"
	)
	@Export("getModelData")
	public ModelData getModelData() {
		if (this.models2 == null) { // L: 82
			return null;
		} else {
			ModelData[] var1 = new ModelData[this.models2.length]; // L: 83

			for (int var2 = 0; var2 < this.models2.length; ++var2) { // L: 84
				var1[var2] = ModelData.ModelData_get(class431.KitDefinition_modelsArchive, this.models2[var2], 0);
			}

			ModelData var4;
			if (var1.length == 1) { // L: 86
				var4 = var1[0];
			} else {
				var4 = new ModelData(var1, var1.length); // L: 87
			}

			int var3;
			if (this.recolorFrom != null) { // L: 88
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) { // L: 89
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]); // L: 90
				}
			}

			if (this.retextureFrom != null) {
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) {
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-75"
	)
	public boolean method3569() {
		boolean var1 = true;

		for (int var2 = 0; var2 < 5; ++var2) { // L: 103
			if (this.models[var2] != -1 && !class431.KitDefinition_modelsArchive.tryLoadFile(this.models[var2], 0)) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)Lgu;",
		garbageValue = "2104174238"
	)
	@Export("getKitDefinitionModels")
	public ModelData getKitDefinitionModels() {
		ModelData[] var1 = new ModelData[5];
		int var2 = 0;

		for (int var3 = 0; var3 < 5; ++var3) {
			if (this.models[var3] != -1) {
				var1[var2++] = ModelData.ModelData_get(class431.KitDefinition_modelsArchive, this.models[var3], 0);
			}
		}

		ModelData var5 = new ModelData(var1, var2); // L: 115
		int var4;
		if (this.recolorFrom != null) {
			for (var4 = 0; var4 < this.recolorFrom.length; ++var4) {
				var5.recolor(this.recolorFrom[var4], this.recolorTo[var4]);
			}
		}

		if (this.retextureFrom != null) {
			for (var4 = 0; var4 < this.retextureFrom.length; ++var4) {
				var5.retexture(this.retextureFrom[var4], this.retextureTo[var4]);
			}
		}

		return var5; // L: 126
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1490798161"
	)
	public static int method3588(int var0, int var1, int var2) {
		int var3 = ArchiveLoader.method2208(var2 - var1 + 1); // L: 43
		var3 <<= var1; // L: 44
		var0 |= var3; // L: 45
		return var0; // L: 46
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lbo;Lbo;IZIZI)I",
		garbageValue = "716541357"
	)
	static int method3577(World var0, World var1, int var2, boolean var3, int var4, boolean var5) {
		int var6 = class308.compareWorlds(var0, var1, var2, var3); // L: 199
		if (var6 != 0) { // L: 200
			return var3 ? -var6 : var6; // L: 201
		} else if (var4 == -1) { // L: 204
			return 0;
		} else {
			int var7 = class308.compareWorlds(var0, var1, var4, var5); // L: 205
			return var5 ? -var7 : var7; // L: 206
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "53690591"
	)
	static final void method3589() {
		if (!ViewportMouse.ViewportMouse_false0) { // L: 92
			int var0 = Scene.Scene_cameraPitchSine; // L: 93
			int var1 = Scene.Scene_cameraPitchCosine; // L: 94
			int var2 = Scene.Scene_cameraYawSine; // L: 95
			int var3 = Scene.Scene_cameraYawCosine; // L: 96
			byte var4 = 50; // L: 97
			short var5 = 3500; // L: 98
			int var6 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var4 / Rasterizer3D.Rasterizer3D_zoom; // L: 99
			int var7 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var4 / Rasterizer3D.Rasterizer3D_zoom; // L: 100
			int var8 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var5 / Rasterizer3D.Rasterizer3D_zoom; // L: 101
			int var9 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var5 / Rasterizer3D.Rasterizer3D_zoom; // L: 102
			int var10 = Rasterizer3D.method4220(var7, var4, var1, var0); // L: 104
			int var11 = Rasterizer3D.method4157(var7, var4, var1, var0); // L: 105
			var7 = var10; // L: 106
			var10 = Rasterizer3D.method4220(var9, var5, var1, var0); // L: 107
			int var12 = Rasterizer3D.method4157(var9, var5, var1, var0); // L: 108
			var9 = var10; // L: 109
			var10 = Rasterizer3D.method4154(var6, var11, var3, var2); // L: 110
			var11 = Rasterizer3D.method4150(var6, var11, var3, var2); // L: 111
			var6 = var10; // L: 112
			var10 = Rasterizer3D.method4154(var8, var12, var3, var2); // L: 113
			var12 = Rasterizer3D.method4150(var8, var12, var3, var2); // L: 114
			ViewportMouse.field2619 = (var10 + var6) / 2; // L: 116
			GrandExchangeOfferOwnWorldComparator.field487 = (var7 + var9) / 2; // L: 117
			WorldMapID.field2870 = (var11 + var12) / 2; // L: 118
			class152.field1725 = (var10 - var6) / 2; // L: 119
			ViewportMouse.field2630 = (var9 - var7) / 2; // L: 120
			BuddyRankComparator.field1396 = (var12 - var11) / 2; // L: 121
			ViewportMouse.field2625 = Math.abs(class152.field1725); // L: 122
			class147.field1689 = Math.abs(ViewportMouse.field2630); // L: 123
			class328.field4128 = Math.abs(BuddyRankComparator.field1396); // L: 124
		}
	} // L: 125
}
