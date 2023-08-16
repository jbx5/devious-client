import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("nc")
	@ObfuscatedGetter(
		intValue = 1693604393
	)
	@Export("menuHeight")
	static int menuHeight;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1361881663
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -254851491
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 892109197
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1262324027
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1521030227
	)
	@Export("type")
	int type;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1488032469
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -234343827
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 90793175
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 211986193
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1860757305
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1051252903
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1064543433
	)
	int field2657;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1575321813
	)
	int field2658;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -471429039
	)
	int field2661;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 623652531
	)
	int field2660;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 2072845555
	)
	int field2664;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -721294081
	)
	int field2654;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1741613857
	)
	int field2646;

	Occluder() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZI)V",
		garbageValue = "124948705"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var6 = (var0 + var1) / 2;
			int var7 = var0;
			World var8 = class176.World_worlds[var6];
			class176.World_worlds[var6] = class176.World_worlds[var1];
			class176.World_worlds[var1] = var8;

			for (int var9 = var0; var9 < var1; ++var9) {
				if (HealthBarUpdate.method2411(class176.World_worlds[var9], var8, var2, var3, var4, var5) <= 0) {
					World var10 = class176.World_worlds[var9];
					class176.World_worlds[var9] = class176.World_worlds[var7];
					class176.World_worlds[var7++] = var10;
				}
			}

			class176.World_worlds[var1] = class176.World_worlds[var7];
			class176.World_worlds[var7] = var8;
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5);
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5);
		}

	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(Ldf;I)Z",
		garbageValue = "-1141977008"
	)
	static boolean method4725(Player var0) {
		if (Client.drawPlayerNames == 0) {
			return false;
		} else {
			boolean var1;
			if (VarbitComposition.localPlayer == var0) {
				var1 = (Client.drawPlayerNames & 8) != 0;
				return var1;
			} else {
				var1 = UserComparator6.method2921();
				if (!var1) {
					boolean var2 = (Client.drawPlayerNames & 1) != 0;
					var1 = var2 && var0.isFriend();
				}

				return var1 || UrlRequester.method2831() && var0.isFriendsChatMember();
			}
		}
	}
}
