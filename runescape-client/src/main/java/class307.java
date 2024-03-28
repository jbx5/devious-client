import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lf")
public class class307 {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)I",
		garbageValue = "1584361082"
	)
	public static int method5908(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) {
			int var6 = var3;
			var3 = var4;
			var4 = var6;
		}

		var2 &= 3;
		if (var2 == 0) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0 - (var3 - 1);
		} else {
			return var2 == 2 ? 7 - var1 - (var4 - 1) : var0;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZB)V",
		garbageValue = "0"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var6 = (var0 + var1) / 2;
			int var7 = var0;
			World var8 = World.World_worlds[var6];
			World.World_worlds[var6] = World.World_worlds[var1];
			World.World_worlds[var1] = var8;

			for (int var9 = var0; var9 < var1; ++var9) {
				World var11 = World.World_worlds[var9];
				int var12 = HttpAuthenticationHeader.compareWorlds(var11, var8, var2, var3);
				int var10;
				if (var12 != 0) {
					if (var3) {
						var10 = -var12;
					} else {
						var10 = var12;
					}
				} else if (var4 == -1) {
					var10 = 0;
				} else {
					int var13 = HttpAuthenticationHeader.compareWorlds(var11, var8, var4, var5);
					if (var5) {
						var10 = -var13;
					} else {
						var10 = var13;
					}
				}

				if (var10 <= 0) {
					World var14 = World.World_worlds[var9];
					World.World_worlds[var9] = World.World_worlds[var7];
					World.World_worlds[var7++] = var14;
				}
			}

			World.World_worlds[var1] = World.World_worlds[var7];
			World.World_worlds[var7] = var8;
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5);
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5);
		}

	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1464619508"
	)
	static final void method5910() {
		int[] var0 = Players.Players_indices;

		int var1;
		for (var1 = 0; var1 < Players.Players_count; ++var1) {
			Player var4 = Client.players[var0[var1]];
			if (var4 != null && var4.overheadTextCyclesRemaining > 0) {
				--var4.overheadTextCyclesRemaining;
				if (var4.overheadTextCyclesRemaining == 0) {
					var4.overheadText = null;
				}
			}
		}

		for (var1 = 0; var1 < Client.npcCount; ++var1) {
			int var2 = Client.npcIndices[var1];
			NPC var3 = Client.npcs[var2];
			if (var3 != null && var3.overheadTextCyclesRemaining > 0) {
				--var3.overheadTextCyclesRemaining;
				if (var3.overheadTextCyclesRemaining == 0) {
					var3.overheadText = null;
				}
			}
		}

	}
}
