import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("EnumDefinition_cached")
	public static EvictingDualNodeHashTable EnumDefinition_cached;
	@ObfuscatedName("an")
	@Export("inputType")
	public char inputType;
	@ObfuscatedName("au")
	@Export("outputType")
	public char outputType;
	@ObfuscatedName("ax")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1651979163
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -630931315
	)
	@Export("outputCount")
	public int outputCount;
	@ObfuscatedName("ac")
	@Export("keys")
	public int[] keys;
	@ObfuscatedName("ae")
	@Export("intVals")
	public int[] intVals;
	@ObfuscatedName("ad")
	@Export("strVals")
	public String[] strVals;

	static {
		EnumDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	EnumComposition() {
		this.defaultStr = "null";
		this.outputCount = 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvg;B)V",
		garbageValue = "-101"
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvg;II)V",
		garbageValue = "1503105002"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.inputType = (char)var1.readUnsignedByte();
		} else if (var2 == 2) {
			this.outputType = (char)var1.readUnsignedByte();
		} else if (var2 == 3) {
			this.defaultStr = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.defaultInt = var1.readInt();
		} else {
			int var3;
			if (var2 == 5) {
				this.outputCount = var1.readUnsignedShort();
				this.keys = new int[this.outputCount];
				this.strVals = new String[this.outputCount];

				for (var3 = 0; var3 < this.outputCount; ++var3) {
					this.keys[var3] = var1.readInt();
					this.strVals[var3] = var1.readStringCp1252NullTerminated();
				}
			} else if (var2 == 6) {
				this.outputCount = var1.readUnsignedShort();
				this.keys = new int[this.outputCount];
				this.intVals = new int[this.outputCount];

				for (var3 = 0; var3 < this.outputCount; ++var3) {
					this.keys[var3] = var1.readInt();
					this.intVals[var3] = var1.readInt();
				}
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1574102526"
	)
	@Export("size")
	public int size() {
		return this.outputCount;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ILdp;ZI)I",
		garbageValue = "-853024556"
	)
	static int method4895(int var0, Script var1, boolean var2) {
		return 2;
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1244753161"
	)
	static void method4884() {
		for (class266 var0 = (class266)Client.field712.last(); var0 != null; var0 = (class266)Client.field712.previous()) {
			var0.remove();
		}

	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-1030277393"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		Scene var5 = ConcurrentMidiTask.topLevelWorldView.scene;
		long var6 = var5.getBoundaryObjectTag(var0, var1, var2);
		int var8;
		int var9;
		int var10;
		int var11;
		int var13;
		int var14;
		if (0L != var6) {
			var8 = var5.getObjectFlags(var0, var1, var2, var6);
			var9 = var8 >> 6 & 3;
			var10 = var8 & 31;
			var11 = var3;
			if (class402.method7489(var6)) {
				var11 = var4;
			}

			int[] var12 = class91.sceneMinimapSprite.pixels;
			var13 = var1 * 4 + (103 - var2) * 2048 + 24624;
			var14 = class513.Entity_unpackID(var6);
			ObjectComposition var15 = class222.getObjectDefinition(var14);
			if (var15.mapSceneId != -1) {
				IndexedSprite var16 = BufferedSource.mapSceneSprites[var15.mapSceneId];
				if (var16 != null) {
					int var17 = (var15.sizeX * 4 - var16.subWidth) / 2;
					int var18 = (var15.sizeY * 4 - var16.subHeight * -1220193712) / 2;
					var16.drawAt(var1 * 4 + var17 + 48, (104 - var2 - var15.sizeY) * 4 + var18 + 48);
				}
			} else {
				if (var10 == 0 || var10 == 2) {
					if (var9 == 0) {
						var12[var13] = var11;
						var12[var13 + 512] = var11;
						var12[var13 + 1024] = var11;
						var12[var13 + 1536] = var11;
					} else if (var9 == 1) {
						var12[var13] = var11;
						var12[var13 + 1] = var11;
						var12[var13 + 2] = var11;
						var12[var13 + 3] = var11;
					} else if (var9 == 2) {
						var12[var13 + 3] = var11;
						var12[var13 + 512 + 3] = var11;
						var12[var13 + 1024 + 3] = var11;
						var12[var13 + 1536 + 3] = var11;
					} else if (var9 == 3) {
						var12[var13 + 1536] = var11;
						var12[var13 + 1536 + 1] = var11;
						var12[var13 + 1536 + 2] = var11;
						var12[var13 + 1536 + 3] = var11;
					}
				}

				if (var10 == 3) {
					if (var9 == 0) {
						var12[var13] = var11;
					} else if (var9 == 1) {
						var12[var13 + 3] = var11;
					} else if (var9 == 2) {
						var12[var13 + 1536 + 3] = var11;
					} else if (var9 == 3) {
						var12[var13 + 1536] = var11;
					}
				}

				if (var10 == 2) {
					if (var9 == 3) {
						var12[var13] = var11;
						var12[var13 + 512] = var11;
						var12[var13 + 1024] = var11;
						var12[var13 + 1536] = var11;
					} else if (var9 == 0) {
						var12[var13] = var11;
						var12[var13 + 1] = var11;
						var12[var13 + 2] = var11;
						var12[var13 + 3] = var11;
					} else if (var9 == 1) {
						var12[var13 + 3] = var11;
						var12[var13 + 512 + 3] = var11;
						var12[var13 + 1024 + 3] = var11;
						var12[var13 + 1536 + 3] = var11;
					} else if (var9 == 2) {
						var12[var13 + 1536] = var11;
						var12[var13 + 1536 + 1] = var11;
						var12[var13 + 1536 + 2] = var11;
						var12[var13 + 1536 + 3] = var11;
					}
				}
			}
		}

		var6 = var5.getGameObjectTag(var0, var1, var2);
		if (0L != var6) {
			var8 = var5.getObjectFlags(var0, var1, var2, var6);
			var9 = var8 >> 6 & 3;
			var10 = var8 & 31;
			var11 = class513.Entity_unpackID(var6);
			ObjectComposition var25 = class222.getObjectDefinition(var11);
			int var20;
			if (var25.mapSceneId != -1) {
				IndexedSprite var21 = BufferedSource.mapSceneSprites[var25.mapSceneId];
				if (var21 != null) {
					var14 = (var25.sizeX * 4 - var21.subWidth) / 2;
					var20 = (var25.sizeY * 4 - var21.subHeight * -1220193712) / 2;
					var21.drawAt(var14 + var1 * 4 + 48, var20 + (104 - var2 - var25.sizeY) * 4 + 48);
				}
			} else if (var10 == 9) {
				var13 = 15658734;
				if (class402.method7489(var6)) {
					var13 = 15597568;
				}

				int[] var19 = class91.sceneMinimapSprite.pixels;
				var20 = var1 * 4 + (103 - var2) * 2048 + 24624;
				if (var9 != 0 && var9 != 2) {
					var19[var20] = var13;
					var19[var20 + 1 + 512] = var13;
					var19[var20 + 1024 + 2] = var13;
					var19[var20 + 1536 + 3] = var13;
				} else {
					var19[var20 + 1536] = var13;
					var19[var20 + 1 + 1024] = var13;
					var19[var20 + 512 + 2] = var13;
					var19[var20 + 3] = var13;
				}
			}
		}

		var6 = var5.getFloorDecorationTag(var0, var1, var2);
		if (0L != var6) {
			var8 = class513.Entity_unpackID(var6);
			ObjectComposition var22 = class222.getObjectDefinition(var8);
			if (var22.mapSceneId != -1) {
				IndexedSprite var23 = BufferedSource.mapSceneSprites[var22.mapSceneId];
				if (var23 != null) {
					var11 = (var22.sizeX * 4 - var23.subWidth) / 2;
					int var24 = (var22.sizeY * 4 - var23.subHeight * -1220193712) / 2;
					var23.drawAt(var1 * 4 + var11 + 48, var24 + (104 - var2 - var22.sizeY) * 4 + 48);
				}
			}
		}

	}
}
