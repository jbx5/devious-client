import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
@Implements("Players")
public class Players {
	@ObfuscatedName("af")
	static byte[] field1355;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lir;"
	)
	static class231[] field1348;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Luk;"
	)
	static Buffer[] field1347;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -330310691
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("ag")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1979773207
	)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("ae")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("aa")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("au")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("an")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 844236579
	)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("ax")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	static Buffer field1351;
	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "[Luc;"
	)
	@Export("crossSprites")
	static SpritePixels[] crossSprites;

	static {
		field1355 = new byte[2048];
		field1348 = new class231[2048];
		field1347 = new Buffer[2048];
		Players_count = 0;
		Players_indices = new int[2048];
		Players_emptyIdxCount = 0;
		Players_emptyIndices = new int[2048];
		Players_regions = new int[2048];
		Players_orientations = new int[2048];
		Players_targetIndices = new int[2048];
		Players_pendingUpdateCount = 0;
		Players_pendingUpdateIndices = new int[2048];
		field1351 = new Buffer(new byte[5000]);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lmb;I)V",
		garbageValue = "-1302012413"
	)
	public static void method2786(class325 var0) {
		if (!class319.field3463.contains(var0)) {
			class319.field3463.add(var0);
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Luo;II)Z",
		garbageValue = "-494610009"
	)
	@Export("updateExternalPlayer")
	static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
		int var2 = var0.readBits(2);
		int var3;
		int var4;
		int var7;
		int var8;
		int var9;
		int var10;
		if (var2 == 0) {
			if (var0.readBits(1) != 0) {
				updateExternalPlayer(var0, var1);
			}

			var3 = var0.readBits(13);
			var4 = var0.readBits(13);
			boolean var12 = var0.readBits(1) == 1;
			if (var12) {
				Players_pendingUpdateIndices[++Players_pendingUpdateCount - 1] = var1;
			}

			if (Client.players[var1] != null) {
				throw new RuntimeException();
			} else {
				Player var11 = Client.players[var1] = new Player();
				var11.index = var1;
				if (field1347[var1] != null) {
					var11.read(field1347[var1]);
				}

				var11.orientation = Players_orientations[var1];
				var11.targetIndex = Players_targetIndices[var1];
				var7 = Players_regions[var1];
				var8 = var7 >> 28;
				var9 = var7 >> 14 & 255;
				var10 = var7 & 255;
				var11.pathTraversed[0] = field1348[var1];
				var11.plane = (byte)var8;
				var11.resetPath((var9 << 13) + var3 - HealthBarDefinition.baseX * 64, (var10 << 13) + var4 - WorldMapScaleHandler.baseY * 64);
				var11.field1124 = false;
				return true;
			}
		} else if (var2 == 1) {
			var3 = var0.readBits(2);
			var4 = Players_regions[var1];
			Players_regions[var1] = (var4 & 268435455) + (((var4 >> 28) + var3 & 3) << 28);
			return false;
		} else {
			int var5;
			int var6;
			if (var2 == 2) {
				var3 = var0.readBits(5);
				var4 = var3 >> 3;
				var5 = var3 & 7;
				var6 = Players_regions[var1];
				var7 = (var6 >> 28) + var4 & 3;
				var8 = var6 >> 14 & 255;
				var9 = var6 & 255;
				if (var5 == 0) {
					--var8;
					--var9;
				}

				if (var5 == 1) {
					--var9;
				}

				if (var5 == 2) {
					++var8;
					--var9;
				}

				if (var5 == 3) {
					--var8;
				}

				if (var5 == 4) {
					++var8;
				}

				if (var5 == 5) {
					--var8;
					++var9;
				}

				if (var5 == 6) {
					++var9;
				}

				if (var5 == 7) {
					++var8;
					++var9;
				}

				Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28);
				return false;
			} else {
				var3 = var0.readBits(18);
				var4 = var3 >> 16;
				var5 = var3 >> 8 & 255;
				var6 = var3 & 255;
				var7 = Players_regions[var1];
				var8 = (var7 >> 28) + var4 & 3;
				var9 = var5 + (var7 >> 14) & 255;
				var10 = var6 + var7 & 255;
				Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28);
				return false;
			}
		}
	}
}
