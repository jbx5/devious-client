import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1691745147
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 184593053
	)
	@Export("x")
	int x;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1775365173
	)
	@Export("y")
	int y;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1245839573
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lic;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1838003371
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[Lkc;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("ah")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1948448495
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 27132243
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("az")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("aa")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("ai")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -2121915807
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1947464997
	)
	int field2579;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2068875803
	)
	int field2577;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -612984139
	)
	int field2573;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lje;"
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
}
