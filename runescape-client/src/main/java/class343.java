import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("mf")
public final class class343 {
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("SequenceDefinition_archive")
	public static AbstractArchive SequenceDefinition_archive;

	@ObfuscatedName("id")
	@ObfuscatedSignature(descriptor = "[Lql;")
	@Export("modIconSprites")
	static IndexedSprite[] modIconSprites;

	@ObfuscatedName("jx")
	@ObfuscatedSignature(descriptor = "(Lku;II)I", garbageValue = "-823191393")
	static final int method6335(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) {
			try {
				int[] var2 = var0.cs1Instructions[var1];
				int var3 = 0;
				int var4 = 0;
				byte var5 = 0;
				while (true) {
					int var6 = var2[var4++];
					int var7 = 0;
					byte var8 = 0;
					if (var6 == 0) {
						return var3;
					}
					if (var6 == 1) {
						var7 = Client.currentLevels[var2[var4++]];
					}
					if (var6 == 2) {
						var7 = Client.levels[var2[var4++]];
					}
					if (var6 == 3) {
						var7 = Client.experience[var2[var4++]];
					}
					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = FloorUnderlayDefinition.getWidget(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!class258.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}
					if (var6 == 5) {
						var7 = Varps.Varps_main[var2[var4++]];
					}
					if (var6 == 6) {
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}
					if (var6 == 7) {
						var7 = Varps.Varps_main[var2[var4++]] * 100 / '뜛';
					}
					if (var6 == 8) {
						var7 = class28.localPlayer.combatLevel;
					}
					if (var6 == 9) {
						for (var9 = 0; var9 < 25; ++var9) {
							if (Skills.Skills_enabled[var9]) {
								var7 += Client.levels[var9];
							}
						}
					}
					if (var6 == 10) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = FloorUnderlayDefinition.getWidget(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!class258.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 = 999999999;
									break;
								}
							}
						}
					}
					if (var6 == 11) {
						var7 = Client.runEnergy;
					}
					if (var6 == 12) {
						var7 = Client.weight;
					}
					if (var6 == 13) {
						var9 = Varps.Varps_main[var2[var4++]];
						int var13 = var2[var4++];
						var7 = ((var9 & 1 << var13) != 0) ? 1 : 0;
					}
					if (var6 == 14) {
						var9 = var2[var4++];
						var7 = class271.getVarbit(var9);
					}
					if (var6 == 15) {
						var8 = 1;
					}
					if (var6 == 16) {
						var8 = 2;
					}
					if (var6 == 17) {
						var8 = 3;
					}
					if (var6 == 18) {
						var7 = class300.baseX * 8 + (class28.localPlayer.x >> 7);
					}
					if (var6 == 19) {
						var7 = Message.baseY * 64 + (class28.localPlayer.y >> 7);
					}
					if (var6 == 20) {
						var7 = var2[var4++];
					}
					if (var8 == 0) {
						if (var5 == 0) {
							var3 += var7;
						}
						if (var5 == 1) {
							var3 -= var7;
						}
						if (var5 == 2 && var7 != 0) {
							var3 /= var7;
						}
						if (var5 == 3) {
							var3 *= var7;
						}
						var5 = 0;
					} else {
						var5 = var8;
					}
				} 
			} catch (Exception var14) {
				return -1;
			}
		} else {
			return -2;
		}
	}
}