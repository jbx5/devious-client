import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1158956325
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -547034607
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1483350349
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1276080201
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 2132992395
	)
	@Export("type")
	int type;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -467035677
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -939224903
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1654652849
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 706234479
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1054556819
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -2080775187
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -780505003
	)
	int field2769;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1894401611
	)
	int field2765;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1935487863
	)
	int field2764;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1147100935
	)
	int field2767;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1153712795
	)
	int field2768;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1715337079
	)
	int field2766;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1216485973
	)
	int field2753;

	Occluder() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lfv;FI)F",
		garbageValue = "447766942"
	)
	static float method5268(class137 var0, float var1) {
		if (var0 != null && var0.method3452() != 0) {
			if (var1 < (float)var0.field1596[0].field1538) {
				return var0.field1605 == class135.field1576 ? var0.field1596[0].field1541 : WorldMapData_0.method5869(var0, var1, true);
			} else if (var1 > (float)var0.field1596[var0.method3452() - 1].field1538) {
				return var0.field1595 == class135.field1576 ? var0.field1596[var0.method3452() - 1].field1541 : WorldMapData_0.method5869(var0, var1, false);
			} else if (var0.field1593) {
				return var0.field1596[0].field1541;
			} else {
				class132 var2 = var0.method3463(var1);
				boolean var3 = false;
				boolean var4 = false;
				if (var2 == null) {
					return 0.0F;
				} else {
					float var5;
					float var6;
					if (var2.field1543 == 0.0F && 0.0F == var2.field1537) {
						var3 = true;
					} else if (var2.field1543 == Float.MAX_VALUE && var2.field1537 == Float.MAX_VALUE) {
						var4 = true;
					} else if (var2.field1539 != null) {
						if (var0.field1608) {
							var5 = (float)var2.field1538;
							float var9 = var2.field1541;
							var6 = var5 + 0.33333334F * var2.field1543;
							float var10 = var9 + 0.33333334F * var2.field1537;
							float var8 = (float)var2.field1539.field1538;
							float var12 = var2.field1539.field1541;
							float var7 = var8 - var2.field1539.field1542 * 0.33333334F;
							float var11 = var12 - 0.33333334F * var2.field1539.field1540;
							if (var0.field1599) {
								class267.method5642(var0, var5, var6, var7, var8, var9, var10, var11, var12);
							} else {
								TileItem.method3065(var0, var5, var6, var7, var8, var9, var10, var11, var12);
							}

							var0.field1608 = false;
						}
					} else {
						var3 = true;
					}

					if (var3) {
						return var2.field1541;
					} else if (var4) {
						return (float)var2.field1538 != var1 && var2.field1539 != null ? var2.field1539.field1541 : var2.field1541;
					} else if (var0.field1599) {
						return Canvas.method331(var0, var1);
					} else {
						if (var0 == null) {
							var5 = 0.0F;
						} else {
							var6 = var1 - var0.field1598;
							var5 = (var6 * (var0.field1601 + var6 * var0.field1600) + var0.field1592) * var6 + var0.field1603;
						}

						return var5;
					}
				}
			}
		} else {
			return 0.0F;
		}
	}

	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1187021346"
	)
	static void method5269() {
		if (class77.field922 != null) {
			Client.field800 = Client.cycle;
			class77.field922.method7818();

			for (int var0 = 0; var0 < class198.topLevelWorldView.players.length; ++var0) {
				if (class198.topLevelWorldView.players[var0] != null) {
					class77.field922.method7817((class198.topLevelWorldView.players[var0].x >> 7) + class198.topLevelWorldView.baseX, (class198.topLevelWorldView.players[var0].y >> 7) + class198.topLevelWorldView.baseY);
				}
			}
		}

	}
}
