import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("VarbitDefinition_archive")
	public static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("VarbitDefinition_cached")
	public static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("aj")
	static final int[] field2092;
	@ObfuscatedName("gy")
	@Export("worldHost")
	static String worldHost;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1797505233
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1893247295
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 323707367
	)
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64);
		field2092 = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			field2092[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)V",
		garbageValue = "1506861624"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lty;IB)V",
		garbageValue = "-7"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.baseVar = var1.readUnsignedShort();
			this.startBit = var1.readUnsignedByte();
			this.endBit = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lmt;",
		garbageValue = "-2070721746"
	)
	@Export("getWidget")
	public static Widget getWidget(int var0) {
		int var1 = var0 >> 16;
		int var2 = var0 & 65535;
		if (ArchiveLoader.Widget_interfaceComponents[var1] == null || ArchiveLoader.Widget_interfaceComponents[var1][var2] == null) {
			boolean var3 = Login.loadInterface(var1);
			if (!var3) {
				return null;
			}
		}

		return ArchiveLoader.Widget_interfaceComponents[var1][var2];
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([Lcr;II[I[II)V",
		garbageValue = "-1873571758"
	)
	@Export("sortWorlds")
	static void sortWorlds(World[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) {
			int var5 = var1 - 1;
			int var6 = var2 + 1;
			int var7 = (var2 + var1) / 2;
			World var8 = var0[var7];
			var0[var7] = var0[var1];
			var0[var1] = var8;

			while (var5 < var6) {
				boolean var9 = true;

				int var10;
				int var11;
				int var12;
				do {
					--var6;

					for (var10 = 0; var10 < 4; ++var10) {
						if (var3[var10] == 2) {
							var11 = var0[var6].index;
							var12 = var8.index;
						} else if (var3[var10] == 1) {
							var11 = var0[var6].population;
							var12 = var8.population;
							if (var11 == -1 && var4[var10] == 1) {
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) {
								var12 = 2001;
							}
						} else if (var3[var10] == 3) {
							var11 = var0[var6].isMembersOnly() ? 1 : 0;
							var12 = var8.isMembersOnly() ? 1 : 0;
						} else {
							var11 = var0[var6].id;
							var12 = var8.id;
						}

						if (var12 != var11) {
							if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) {
								var9 = false;
							}
							break;
						}

						if (var10 == 3) {
							var9 = false;
						}
					}
				} while(var9);

				var9 = true;

				do {
					++var5;

					for (var10 = 0; var10 < 4; ++var10) {
						if (var3[var10] == 2) {
							var11 = var0[var5].index;
							var12 = var8.index;
						} else if (var3[var10] == 1) {
							var11 = var0[var5].population;
							var12 = var8.population;
							if (var11 == -1 && var4[var10] == 1) {
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) {
								var12 = 2001;
							}
						} else if (var3[var10] == 3) {
							var11 = var0[var5].isMembersOnly() ? 1 : 0;
							var12 = var8.isMembersOnly() ? 1 : 0;
						} else {
							var11 = var0[var5].id;
							var12 = var8.id;
						}

						if (var11 != var12) {
							if ((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) {
								var9 = false;
							}
							break;
						}

						if (var10 == 3) {
							var9 = false;
						}
					}
				} while(var9);

				if (var5 < var6) {
					World var13 = var0[var5];
					var0[var5] = var0[var6];
					var0[var6] = var13;
				}
			}

			sortWorlds(var0, var1, var6, var3, var4);
			sortWorlds(var0, var6 + 1, var2, var3, var4);
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1174907654"
	)
	@Export("SpriteBuffer_decode")
	public static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		var1.offset = var0.length - 2;
		class528.SpriteBuffer_spriteCount = var1.readUnsignedShort();
		class492.SpriteBuffer_xOffsets = new int[class528.SpriteBuffer_spriteCount];
		class134.SpriteBuffer_yOffsets = new int[class528.SpriteBuffer_spriteCount];
		class172.SpriteBuffer_spriteWidths = new int[class528.SpriteBuffer_spriteCount];
		class528.SpriteBuffer_spriteHeights = new int[class528.SpriteBuffer_spriteCount];
		ArchiveDiskAction.SpriteBuffer_pixels = new byte[class528.SpriteBuffer_spriteCount][];
		var1.offset = var0.length - 7 - class528.SpriteBuffer_spriteCount * 8;
		class528.SpriteBuffer_spriteWidth = var1.readUnsignedShort();
		class528.SpriteBuffer_spriteHeight = var1.readUnsignedShort();
		int var2 = (var1.readUnsignedByte() & 255) + 1;

		int var3;
		for (var3 = 0; var3 < class528.SpriteBuffer_spriteCount; ++var3) {
			class492.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class528.SpriteBuffer_spriteCount; ++var3) {
			class134.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class528.SpriteBuffer_spriteCount; ++var3) {
			class172.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class528.SpriteBuffer_spriteCount; ++var3) {
			class528.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class528.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3;
		class528.SpriteBuffer_spritePalette = new int[var2];

		for (var3 = 1; var3 < var2; ++var3) {
			class528.SpriteBuffer_spritePalette[var3] = var1.readMedium();
			if (class528.SpriteBuffer_spritePalette[var3] == 0) {
				class528.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0;

		for (var3 = 0; var3 < class528.SpriteBuffer_spriteCount; ++var3) {
			int var4 = class172.SpriteBuffer_spriteWidths[var3];
			int var5 = class528.SpriteBuffer_spriteHeights[var3];
			int var6 = var5 * var4;
			byte[] var7 = new byte[var6];
			ArchiveDiskAction.SpriteBuffer_pixels[var3] = var7;
			int var8 = var1.readUnsignedByte();
			int var9;
			if (var8 == 0) {
				for (var9 = 0; var9 < var6; ++var9) {
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) {
				for (var9 = 0; var9 < var4; ++var9) {
					for (int var10 = 0; var10 < var5; ++var10) {
						var7[var9 + var10 * var4] = var1.readByte();
					}
				}
			}
		}

	}

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "(Lmt;I)V",
		garbageValue = "-164966121"
	)
	static final void method3823(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 324) {
			if (Client.field720 == -1) {
				Client.field720 = var0.spriteId2;
				Client.field802 = var0.spriteId;
			}

			if (Client.playerAppearance.gender == 1) {
				var0.spriteId2 = Client.field720;
			} else {
				var0.spriteId2 = Client.field802;
			}

		} else if (var1 == 325) {
			if (Client.field720 == -1) {
				Client.field720 = var0.spriteId2;
				Client.field802 = var0.spriteId;
			}

			if (Client.playerAppearance.gender == 1) {
				var0.spriteId2 = Client.field802;
			} else {
				var0.spriteId2 = Client.field720;
			}

		} else if (var1 == 327) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 0;
		} else if (var1 == 328) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 1;
		}
	}
}
