import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ki")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field2872;
	@ObfuscatedName("tj")
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 608241537
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -720986189
	)
	@Export("x")
	int x;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -2079615869
	)
	@Export("y")
	int y;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -608515825
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llw;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lla;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1837845291
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Llp;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("ah")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1687914105
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 336523667
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ac")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("al")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("ay")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 690710773
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1732174243
	)
	int field2873;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1384418897
	)
	int field2849;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1923980729
	)
	int field2870;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	@Export("linkedBelowTile")
	Tile linkedBelowTile;

	Tile(int var1, int var2, int var3) {
		this.gameObjects = new GameObject[5];
		this.gameObjectEdgeMasks = new int[5];
		this.gameObjectsEdgeMask = 0;
		this.originalPlane = this.plane = var1;
		this.x = var2;
		this.y = var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(CI)B",
		garbageValue = "-1848754324"
	)
	@Export("charToByteCp1252")
	public static byte charToByteCp1252(char var0) {
		byte var1;
		if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) {
			var1 = (byte)var0;
		} else if (var0 == 8364) {
			var1 = -128;
		} else if (var0 == 8218) {
			var1 = -126;
		} else if (var0 == 402) {
			var1 = -125;
		} else if (var0 == 8222) {
			var1 = -124;
		} else if (var0 == 8230) {
			var1 = -123;
		} else if (var0 == 8224) {
			var1 = -122;
		} else if (var0 == 8225) {
			var1 = -121;
		} else if (var0 == 710) {
			var1 = -120;
		} else if (var0 == 8240) {
			var1 = -119;
		} else if (var0 == 352) {
			var1 = -118;
		} else if (var0 == 8249) {
			var1 = -117;
		} else if (var0 == 338) {
			var1 = -116;
		} else if (var0 == 381) {
			var1 = -114;
		} else if (var0 == 8216) {
			var1 = -111;
		} else if (var0 == 8217) {
			var1 = -110;
		} else if (var0 == 8220) {
			var1 = -109;
		} else if (var0 == 8221) {
			var1 = -108;
		} else if (var0 == 8226) {
			var1 = -107;
		} else if (var0 == 8211) {
			var1 = -106;
		} else if (var0 == 8212) {
			var1 = -105;
		} else if (var0 == 732) {
			var1 = -104;
		} else if (var0 == 8482) {
			var1 = -103;
		} else if (var0 == 353) {
			var1 = -102;
		} else if (var0 == 8250) {
			var1 = -101;
		} else if (var0 == 339) {
			var1 = -100;
		} else if (var0 == 382) {
			var1 = -98;
		} else if (var0 == 376) {
			var1 = -97;
		} else {
			var1 = 63;
		}

		return var1;
	}
}
