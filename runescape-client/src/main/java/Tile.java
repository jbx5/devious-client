import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kd")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1960032189
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 934684243
	)
	@Export("x")
	int x;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1545522719
	)
	@Export("y")
	int y;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -207645507
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1181518301
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lll;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("ad")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1388713263
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1788936995
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("az")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("av")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("ak")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1754732641
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 2017344355
	)
	int field2780;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 780240341
	)
	int field2796;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1224610147
	)
	int field2799;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
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
