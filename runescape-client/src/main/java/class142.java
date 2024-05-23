import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
public enum class142 implements Enum {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	field1658(0, 0),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	field1668(1, 1),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	field1659(2, 2),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	field1660(3, 3),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	field1664(4, 4),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	field1662(5, 5),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	field1663(6, 6),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	field1666(7, 7),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	field1657(8, 8);

	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2091009523
	)
	final int field1667;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1640782011
	)
	final int field1665;

	class142(int var3, int var4) {
		this.field1667 = var3;
		this.field1665 = var4;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-311400525"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1665;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2107252753"
	)
	public static final void method3192() {
		ViewportMouse.ViewportMouse_isInViewport = false;
		ViewportMouse.ViewportMouse_entityCount = 0;
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(B)Ltb;",
		garbageValue = "28"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return class6.worldMap;
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(Ldt;I)V",
		garbageValue = "-1182418693"
	)
	static void method3190(class101 var0) {
		int var1 = var0.field1346 / 8;
		int var2 = var0.field1330 / 8;
		boolean var3 = false;
		HttpRequest.method99(false);
		var3 = true;

		int var4;
		for (var4 = 0; var4 < SpriteMask.field3706.length; ++var4) {
			if (class148.field1696[var4] != -1 && SpriteMask.field3706[var4] == null) {
				SpriteMask.field3706[var4] = SceneTilePaint.archive9.takeFile(class148.field1696[var4], 0);
				if (SpriteMask.field3706[var4] == null) {
					var3 = false;
				}
			}

			if (class47.field333[var4] != -1 && class135.field1636[var4] == null) {
				class135.field1636[var4] = SceneTilePaint.archive9.takeFileEncrypted(class47.field333[var4], 0, class508.field5102[var4]);
				if (class135.field1636[var4] == null) {
					var3 = false;
				}
			}
		}

		if (var3) {
			HttpRequest.method99(false);
			var3 = true;

			for (var4 = 0; var4 < SpriteMask.field3706.length; ++var4) {
				byte[] var17 = class135.field1636[var4];
				if (var17 != null) {
					byte var6 = 10;
					byte var7 = 10;
					var3 &= AbstractSocket.method8801(var17, var6, var7);
				}
			}

			if (var3) {
				int var5;
				for (var4 = 0; var4 < 4; ++var4) {
					for (var5 = 0; var5 < var0.field1340[var4].length; ++var5) {
						Arrays.fill(var0.field1340[var4][var5], (byte)0);
					}
				}

				class212.method4031();
				GrandExchangeOfferNameComparator.method7382();
				class151.method3270();
				HttpRequest.method99(true);

				int var8;
				int var9;
				int var10;
				int var11;
				int var12;
				int var13;
				int var18;
				for (var4 = 0; var4 < 4; ++var4) {
					class212.method4031();

					for (var5 = 0; var5 < var1; ++var5) {
						for (var18 = 0; var18 < var2; ++var18) {
							boolean var19 = false;
							var8 = Client.field601[var4][var5][var18];
							if (var8 != -1) {
								var9 = var8 >> 24 & 3;
								var10 = var8 >> 1 & 3;
								var11 = var8 >> 14 & 1023;
								var12 = var8 >> 3 & 2047;
								var13 = (var11 / 8 << 8) + var12 / 8;

								for (int var14 = 0; var14 < UserComparator4.field1495.length; ++var14) {
									if (UserComparator4.field1495[var14] == var13 && SpriteMask.field3706[var14] != null) {
										int var15 = (var11 - var5) * 8;
										int var16 = (var12 - var18) * 8;
										UserComparator10.method2998(var0, SpriteMask.field3706[var14], var4, var5 * 8, var18 * 8, var9, (var11 & 7) * 8, (var12 & 7) * 8, var10, var15, var16);
										var19 = true;
										break;
									}
								}
							}

							if (!var19) {
								SequenceDefinition.method4373(var0.field1339, var4, var5 * 8, var18 * 8);
							}
						}
					}
				}

				for (var4 = 0; var4 < 13; ++var4) {
					for (var5 = 0; var5 < 13; ++var5) {
						var18 = Client.field601[0][var4][var5];
						if (var18 == -1) {
							class232.method4489(var0, var4 * 8, var5 * 8, 8, 8);
						}
					}
				}

				HttpRequest.method99(true);

				for (var4 = 0; var4 < 4; ++var4) {
					class212.method4031();

					for (var5 = 0; var5 < var1; ++var5) {
						for (var18 = 0; var18 < var2; ++var18) {
							int var20 = Client.field601[var4][var5][var18];
							if (var20 != -1) {
								var8 = var20 >> 24 & 3;
								var9 = var20 >> 1 & 3;
								var10 = var20 >> 14 & 1023;
								var11 = var20 >> 3 & 2047;
								var12 = (var10 / 8 << 8) + var11 / 8;

								for (var13 = 0; var13 < UserComparator4.field1495.length; ++var13) {
									if (UserComparator4.field1495[var13] == var12 && class135.field1636[var13] != null) {
										Tiles.method2249(var0, class135.field1636[var13], var4, var5 * 8, var18 * 8, var8, (var10 & 7) * 8, (var11 & 7) * 8, var9);
										break;
									}
								}
							}
						}
					}
				}

				HttpRequest.method99(true);
				class212.method4031();
				class533.method9517(var0);
				HttpRequest.method99(true);
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				class212.method4031();
				UserComparator6.method3016();
				Client.field684 = false;
			}
		}
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIIIILde;I)V",
		garbageValue = "94672833"
	)
	static void method3197(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Player var13) {
		ObjectComposition var14 = HitSplatDefinition.getObjectDefinition(var6);
		int var15;
		int var16;
		if (var4 != 1 && var4 != 3) {
			var15 = var14.sizeX;
			var16 = var14.sizeY;
		} else {
			var15 = var14.sizeY;
			var16 = var14.sizeX;
		}

		int var17 = (var15 >> 1) + var1;
		int var18 = (var15 + 1 >> 1) + var1;
		int var19 = (var16 >> 1) + var2;
		int var20 = var2 + (var16 + 1 >> 1);
		int[][] var21 = ModeWhere.field4623.field1339[var0];
		int var22 = var21[var18][var19] + var21[var17][var19] + var21[var17][var20] + var21[var18][var20] >> 2;
		int var23 = (var1 << 7) + (var15 << 6);
		int var24 = (var2 << 7) + (var16 << 6);
		Model var25 = var14.getModel(var3, var4, var21, var23, var22, var24);
		if (var25 != null) {
			class162.method3417(ModeWhere.field4623, var0, var1, var2, var5, -1, 0, 0, 31, var7 + 1, var8 + 1);
			var13.field1143 = var7 + Client.cycle;
			var13.field1144 = var8 + Client.cycle;
			var13.field1158 = var25;
			var13.field1145 = var1 * 128 + var15 * 64;
			var13.field1154 = var16 * 64 + var2 * 128;
			var13.field1146 = var22;
			int var26;
			if (var9 > var11) {
				var26 = var9;
				var9 = var11;
				var11 = var26;
			}

			if (var10 > var12) {
				var26 = var10;
				var10 = var12;
				var12 = var26;
			}

			var13.field1149 = var9 + var1;
			var13.field1151 = var11 + var1;
			var13.field1155 = var10 + var2;
			var13.field1140 = var2 + var12;
		}

	}
}
