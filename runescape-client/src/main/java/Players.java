import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
@Implements("Players")
public class Players {
	@ObfuscatedName("al")
	static byte[] field1379;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[Lip;"
	)
	static class233[] field1378;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[Luq;"
	)
	static Buffer[] field1389;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -880622585
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("aa")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -334792955
	)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("ao")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("au")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("ak")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("ah")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -2005939831
	)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("af")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	static Buffer field1381;
	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "[Lvd;"
	)
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;

	static {
		field1379 = new byte[2048];
		field1378 = new class233[2048];
		field1389 = new Buffer[2048];
		Players_count = 0;
		Players_indices = new int[2048];
		Players_emptyIdxCount = 0;
		Players_emptyIndices = new int[2048];
		Players_regions = new int[2048];
		Players_orientations = new int[2048];
		Players_targetIndices = new int[2048];
		Players_pendingUpdateCount = 0;
		Players_pendingUpdateIndices = new int[2048];
		field1381 = new Buffer(new byte[5000]);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ZZI)Lvg;",
		garbageValue = "-1785638983"
	)
	static IndexedSprite method2785(boolean var0, boolean var1) {
		return var0 ? (var1 ? class557.field5358 : class472.options_buttons_2Sprite) : (var1 ? UserComparator2.field5265 : class128.options_buttons_0Sprite);
	}
}
