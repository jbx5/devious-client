import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("fj")
@Implements("KitDefinition")
public class KitDefinition extends DualNode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("KitDefinition_archive")
	public static AbstractArchive KitDefinition_archive;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("KitDefinition_modelsArchive")
	public static AbstractArchive KitDefinition_modelsArchive;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 1716974829)
	@Export("KitDefinition_fileCount")
	public static int KitDefinition_fileCount;

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lia;")
	@Export("KitDefinition_cached")
	public static EvictingDualNodeHashTable KitDefinition_cached = new EvictingDualNodeHashTable(64);

	@ObfuscatedName("am")
	@ObfuscatedSignature(descriptor = "Lnz;")
	static Bounds field1860;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -198149691)
	@Export("bodypartID")
	public int bodypartID = -1;

	@ObfuscatedName("w")
	@Export("models2")
	int[] models2;

	@ObfuscatedName("z")
	@Export("recolorFrom")
	short[] recolorFrom;

	@ObfuscatedName("j")
	@Export("recolorTo")
	short[] recolorTo;

	@ObfuscatedName("h")
	@Export("retextureFrom")
	short[] retextureFrom;

	@ObfuscatedName("a")
	@Export("retextureTo")
	short[] retextureTo;

	@ObfuscatedName("d")
	@Export("models")
	int[] models = new int[]{ -1, -1, -1, -1, -1 };

	@ObfuscatedName("n")
	@Export("nonSelectable")
	public boolean nonSelectable = false;

	KitDefinition() {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lqw;I)V", garbageValue = "-142028586")
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}
			this.decodeNext(var1, var2);
		} 
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Lqw;II)V", garbageValue = "-2119387594")
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.bodypartID = var1.readUnsignedByte();
		} else {
			int var3;
			int var4;
			if (var2 == 2) {
				var3 = var1.readUnsignedByte();
				this.models2 = new int[var3];
				for (var4 = 0; var4 < var3; ++var4) {
					this.models2[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 3) {
				this.nonSelectable = true;
			} else if (var2 == 40) {
				var3 = var1.readUnsignedByte();
				this.recolorFrom = new short[var3];
				this.recolorTo = new short[var3];
				for (var4 = 0; var4 < var3; ++var4) {
					this.recolorFrom[var4] = ((short) (var1.readUnsignedShort()));
					this.recolorTo[var4] = ((short) (var1.readUnsignedShort()));
				}
			} else if (var2 == 41) {
				var3 = var1.readUnsignedByte();
				this.retextureFrom = new short[var3];
				this.retextureTo = new short[var3];
				for (var4 = 0; var4 < var3; ++var4) {
					this.retextureFrom[var4] = ((short) (var1.readUnsignedShort()));
					this.retextureTo[var4] = ((short) (var1.readUnsignedShort()));
				}
			} else if (var2 >= 60 && var2 < 70) {
				this.models[var2 - 60] = var1.readUnsignedShort();
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "417497565")
	@Export("ready")
	public boolean ready() {
		if (this.models2 == null) {
			return true;
		} else {
			boolean var1 = true;
			for (int var2 = 0; var2 < this.models2.length; ++var2) {
				if (!KitDefinition_modelsArchive.tryLoadFile(this.models2[var2], 0)) {
					var1 = false;
				}
			}
			return var1;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)Lgw;", garbageValue = "820896030")
	@Export("getModelData")
	public ModelData getModelData() {
		if (this.models2 == null) {
			return null;
		} else {
			ModelData[] var1 = new ModelData[this.models2.length];
			for (int var2 = 0; var2 < this.models2.length; ++var2) {
				var1[var2] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models2[var2], 0);
			}
			ModelData var4;
			if (var1.length == 1) {
				var4 = var1[0];
			} else {
				var4 = new ModelData(var1, var1.length);
			}
			int var3;
			if (this.recolorFrom != null) {
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) {
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]);
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
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-1596959264")
	public boolean method3399() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; ++var2) {
			if (this.models[var2] != -1 && !KitDefinition_modelsArchive.tryLoadFile(this.models[var2], 0)) {
				var1 = false;
			}
		}
		return var1;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(B)Lgw;", garbageValue = "-49")
	@Export("getKitDefinitionModels")
	public ModelData getKitDefinitionModels() {
		ModelData[] var1 = new ModelData[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; ++var3) {
			if (this.models[var3] != -1) {
				var1[var2++] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models[var3], 0);
			}
		}
		ModelData var5 = new ModelData(var1, var2);
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
		return var5;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(Ldp;FZB)F", garbageValue = "-34")
	static float method3390(class117 var0, float var1, boolean var2) {
		float var3 = 0.0F;
		if (var0 != null && var0.method2785() != 0) {
			float var4 = ((float) (var0.field1437[0].field1390));
			float var5 = ((float) (var0.field1437[var0.method2785() - 1].field1390));
			float var6 = var5 - var4;
			if (0.0 == ((double) (var6))) {
				return var0.field1437[0].field1389;
			} else {
				float var7 = 0.0F;
				if (var1 > var5) {
					var7 = (var1 - var5) / var6;
				} else {
					var7 = (var1 - var4) / var6;
				}
				double var8 = ((double) ((int) (var7)));
				float var10 = Math.abs(((float) (((double) (var7)) - var8)));
				float var11 = var10 * var6;
				var8 = Math.abs(var8 + 1.0);
				double var12 = var8 / 2.0;
				double var14 = ((double) ((int) (var12)));
				var10 = ((float) (var12 - var14));
				float var16;
				float var17;
				if (var2) {
					if (var0.field1435 == class116.field1422) {
						if (((double) (var10)) != 0.0) {
							var11 += var4;
						} else {
							var11 = var5 - var11;
						}
					} else if (var0.field1435 != class116.field1424 && var0.field1435 != class116.field1425) {
						if (var0.field1435 == class116.field1423) {
							var11 = var4 - var1;
							var16 = var0.field1437[0].field1391;
							var17 = var0.field1437[0].field1396;
							var3 = var0.field1437[0].field1389;
							if (((double) (var16)) != 0.0) {
								var3 -= var17 * var11 / var16;
							}
							return var3;
						}
					} else {
						var11 = var5 - var11;
					}
				} else if (var0.field1436 == class116.field1422) {
					if (0.0 != ((double) (var10))) {
						var11 = var5 - var11;
					} else {
						var11 += var4;
					}
				} else if (var0.field1436 != class116.field1424 && var0.field1436 != class116.field1425) {
					if (var0.field1436 == class116.field1423) {
						var11 = var1 - var5;
						var16 = var0.field1437[var0.method2785() - 1].field1392;
						var17 = var0.field1437[var0.method2785() - 1].field1393;
						var3 = var0.field1437[var0.method2785() - 1].field1389;
						if (((double) (var16)) != 0.0) {
							var3 += var11 * var17 / var16;
						}
						return var3;
					}
				} else {
					var11 += var4;
				}
				var3 = MouseHandler.method600(var0, var11);
				float var18;
				if (var2 && var0.field1435 == class116.field1425) {
					var18 = var0.field1437[var0.method2785() - 1].field1389 - var0.field1437[0].field1389;
					var3 = ((float) (((double) (var3)) - ((double) (var18)) * var8));
				} else if (!var2 && var0.field1436 == class116.field1425) {
					var18 = var0.field1437[var0.method2785() - 1].field1389 - var0.field1437[0].field1389;
					var3 = ((float) (((double) (var3)) + ((double) (var18)) * var8));
				}
				return var3;
			}
		} else {
			return var3;
		}
	}
}