import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hv")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -73287099
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1513255117
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1244038431
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 544911691
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1432633353
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("ao")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -426460639
	)
	@Export("rgb")
	int rgb;

	SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.isFlat = true;
		this.swColor = var1;
		this.seColor = var2;
		this.neColor = var3;
		this.nwColor = var4;
		this.texture = var5;
		this.rgb = var6;
		this.isFlat = var7;
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(Ldy;I)V",
		garbageValue = "-1884695961"
	)
	static final void method4377(WorldView var0) {
		int[] var1 = var0.playerUpdateManager.playerIndices;

		int var2;
		for (var2 = 0; var2 < var0.playerUpdateManager.playerCount; ++var2) {
			Player var5 = var0.players[var1[var2]];
			if (var5 != null && var5.overheadTextCyclesRemaining > 0) {
				--var5.overheadTextCyclesRemaining;
				if (var5.overheadTextCyclesRemaining == 0) {
					var5.overheadText = null;
				}
			}
		}

		for (var2 = 0; var2 < var0.npcCount; ++var2) {
			int var3 = var0.npcIndices[var2];
			NPC var4 = var0.npcs[var3];
			if (var4 != null && var4.overheadTextCyclesRemaining > 0) {
				--var4.overheadTextCyclesRemaining;
				if (var4.overheadTextCyclesRemaining == 0) {
					var4.overheadText = null;
				}
			}
		}

	}
}
