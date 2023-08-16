import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ii")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -756670045
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1079694399
	)
	@Export("x")
	int x;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1746194663
	)
	@Export("y")
	int y;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1776469753
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljo;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Liy;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1021009161
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Ljy;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("al")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1421808519
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1452461007
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ab")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("ag")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("am")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 864324559
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -806270863
	)
	int field2524;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1737135905
	)
	int field2527;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 102071475
	)
	int field2528;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lii;"
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1321170330"
	)
	static String method4373(int var0) {
		return "<img=" + var0 + ">";
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Lfv;",
		garbageValue = "-1875628936"
	)
	static class137 method4372(int var0) {
		return ClientPreferences.method2552(var0) != 0 ? null : class338.method6589(var0);
	}
}
