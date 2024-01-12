import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
	@ObfuscatedName("am")
	@Export("reversed")
	final boolean reversed;

	public UserComparator8(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lrj;Lrj;B)I",
		garbageValue = "4"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world) {
			if (var2.world != Client.worldId) {
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world == Client.worldId) {
			return this.reversed ? 1 : -1;
		}

		return this.compareUser(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lfx;FZB)F",
		garbageValue = "7"
	)
	static float method2944(class131 var0, float var1, boolean var2) {
		float var3 = 0.0F;
		if (var0 != null && var0.method3088() != 0) {
			float var4 = (float)var0.field1545[0].field1483;
			float var5 = (float)var0.field1545[var0.method3088() - 1].field1483;
			float var6 = var5 - var4;
			if (0.0D == (double)var6) {
				return var0.field1545[0].field1480;
			} else {
				float var7 = 0.0F;
				if (var1 > var5) {
					var7 = (var1 - var5) / var6;
				} else {
					var7 = (var1 - var4) / var6;
				}

				double var8 = (double)((int)var7);
				float var10 = Math.abs((float)((double)var7 - var8));
				float var11 = var6 * var10;
				var8 = Math.abs(1.0D + var8);
				double var12 = var8 / 2.0D;
				double var14 = (double)((int)var12);
				var10 = (float)(var12 - var14);
				float var16;
				float var17;
				if (var2) {
					if (var0.field1539 == class129.field1514) {
						if (0.0D != (double)var10) {
							var11 += var4;
						} else {
							var11 = var5 - var11;
						}
					} else if (var0.field1539 != class129.field1512 && var0.field1539 != class129.field1515) {
						if (var0.field1539 == class129.field1510) {
							var11 = var4 - var1;
							var16 = var0.field1545[0].field1482;
							var17 = var0.field1545[0].field1479;
							var3 = var0.field1545[0].field1480;
							if (0.0D != (double)var16) {
								var3 -= var17 * var11 / var16;
							}

							return var3;
						}
					} else {
						var11 = var5 - var11;
					}
				} else if (var0.field1530 == class129.field1514) {
					if ((double)var10 != 0.0D) {
						var11 = var5 - var11;
					} else {
						var11 += var4;
					}
				} else if (var0.field1530 != class129.field1512 && var0.field1530 != class129.field1515) {
					if (var0.field1530 == class129.field1510) {
						var11 = var1 - var5;
						var16 = var0.field1545[var0.method3088() - 1].field1481;
						var17 = var0.field1545[var0.method3088() - 1].field1484;
						var3 = var0.field1545[var0.method3088() - 1].field1480;
						if ((double)var16 != 0.0D) {
							var3 += var11 * var17 / var16;
						}

						return var3;
					}
				} else {
					var11 += var4;
				}

				var3 = class155.method3423(var0, var11);
				float var18;
				if (var2 && var0.field1539 == class129.field1515) {
					var18 = var0.field1545[var0.method3088() - 1].field1480 - var0.field1545[0].field1480;
					var3 = (float)((double)var3 - (double)var18 * var8);
				} else if (!var2 && var0.field1530 == class129.field1515) {
					var18 = var0.field1545[var0.method3088() - 1].field1480 - var0.field1545[0].field1480;
					var3 = (float)((double)var3 + (double)var18 * var8);
				}

				return var3;
			}
		} else {
			return var3;
		}
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(Lhl;IIILdf;I)V",
		garbageValue = "146736324"
	)
	static void method2938(SequenceDefinition var0, int var1, int var2, int var3, Actor var4) {
		if (Client.soundEffectCount < 50) {
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) {
				int var5 = var0.soundEffects[var1] & 15;
				if ((var5 <= 0 || class93.clientPreferences.getAreaSoundEffectsVolume() != 0) && (var5 != 0 || class93.clientPreferences.getSoundEffectsVolume() != 0)) {
					class152.method3320(var0.soundEffects[var1], var2, var3, var4 == KeyHandler.localPlayer);
				}
			}
		}
	}
}
