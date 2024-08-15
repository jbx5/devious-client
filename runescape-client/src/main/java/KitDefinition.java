import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
@Implements("KitDefinition")
public class KitDefinition extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	@Export("KitDefinition_archive")
	public static AbstractArchive KitDefinition_archive;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	@Export("KitDefinition_modelsArchive")
	public static AbstractArchive KitDefinition_modelsArchive;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("KitDefinition_cached")
	static EvictingDualNodeHashTable KitDefinition_cached;
	@ObfuscatedName("ah")
	@Export("ByteArrayPool_alternativeSizes")
	static int[] ByteArrayPool_alternativeSizes;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1914905283
	)
	@Export("bodypartID")
	int bodypartID;
	@ObfuscatedName("ao")
	@Export("models2")
	int[] models2;
	@ObfuscatedName("am")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("ac")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("ae")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("ad")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("aq")
	@Export("models")
	int[] models;
	@ObfuscatedName("al")
	@Export("nonSelectable")
	public boolean nonSelectable;

	static {
		KitDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	KitDefinition() {
		this.bodypartID = -1;
		this.models = new int[]{-1, -1, -1, -1, -1};
		this.nonSelectable = false;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)V",
		garbageValue = "-1971894971"
	)
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lvg;II)V",
		garbageValue = "274363254"
	)
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
					this.recolorFrom[var4] = (short)var1.readUnsignedShort();
					this.recolorTo[var4] = (short)var1.readUnsignedShort();
				}
			} else if (var2 == 41) {
				var3 = var1.readUnsignedByte();
				this.retextureFrom = new short[var3];
				this.retextureTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.retextureFrom[var4] = (short)var1.readUnsignedShort();
					this.retextureTo[var4] = (short)var1.readUnsignedShort();
				}
			} else if (var2 >= 60 && var2 < 70) {
				this.models[var2 - 60] = var1.readUnsignedShort();
			}
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1352222285"
	)
	public boolean method4827(int var1, int var2) {
		if (var2 == 1) {
			return var1 + 7 == this.bodypartID;
		} else {
			return this.bodypartID == var1;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1813167689"
	)
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Lgm;",
		garbageValue = "6"
	)
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1057770776"
	)
	public boolean method4839() {
		boolean var1 = true;

		for (int var2 = 0; var2 < 5; ++var2) {
			if (this.models[var2] != -1 && !KitDefinition_modelsArchive.tryLoadFile(this.models[var2], 0)) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Lgm;",
		garbageValue = "62"
	)
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lob;B)V",
		garbageValue = "0"
	)
	public static void method4850(AbstractArchive var0) {
		ParamComposition.ParamDefinition_archive = var0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Lfe;",
		garbageValue = "1409302933"
	)
	static class136 method4853(int var0) {
		class136 var1 = (class136)class134.findEnumerated(Huffman.method7100(), var0);
		if (var1 == null) {
			var1 = class136.field1596;
		}

		return var1;
	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(I)Lte;",
		garbageValue = "-164931231"
	)
	@Export("getPlatformInfo")
	static PlatformInfo getPlatformInfo() {
		return WorldMapElement.platformInfo;
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(Ldy;IZS)V",
		garbageValue = "-23371"
	)
	@Export("addPlayerToScene")
	static void addPlayerToScene(WorldView var0, int var1, boolean var2) {
		Player var3 = var0.players[var1];
		if (var3 != null && var3.isVisible() && !var3.isHidden) {
			var3.isUnanimated = false;
			if ((Client.isLowDetail && var0.playerUpdateManager.playerCount > 50 || var0.playerUpdateManager.playerCount > 200) && var2 && var3.idleSequence == var3.movementSequence) {
				var3.isUnanimated = true;
			}

			int var4 = var3.x >> 7;
			int var5 = var3.y >> 7;
			if (0 <= var4 && var4 < 104 && 0 <= var5 && var5 < 104) {
				long var6 = class218.calculateTag(0, 0, 0, false, var3.index, var0.id);
				if (var3.model0 != null && Client.cycle >= var3.animationCycleStart && Client.cycle < var3.animationCycleEnd) {
					var3.isUnanimated = false;
					var3.tileHeight = class162.getTileHeight(var0, var3.x, var3.y, var0.plane);
					var3.playerCycle = Client.cycle;
					var0.scene.addNullableObject(var0.plane, var3.x, var3.y, var3.tileHeight, 60, var3, var3.rotation, var6, var3.minX, var3.minY, var3.maxX, var3.maxY);
				} else {
					if ((var3.x & 127) == 64 && (var3.y & 127) == 64) {
						if (var0.tileLastDrawnActor[var4][var5] == Client.viewportDrawCount) {
							return;
						}

						var0.tileLastDrawnActor[var4][var5] = Client.viewportDrawCount;
					}

					var3.tileHeight = class162.getTileHeight(var0, var3.x, var3.y, var0.plane);
					var3.playerCycle = Client.cycle;
					var0.scene.drawEntity(var0.plane, var3.x, var3.y, var3.tileHeight, 60, var3, var3.rotation, var6, var3.isWalking);
				}
			}
		}

	}
}
