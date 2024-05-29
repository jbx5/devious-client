import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("ph")
	@ObfuscatedGetter(
		intValue = -896049715
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("qj")
	@ObfuscatedSignature(
		descriptor = "Luj;"
	)
	static class528 field2639;
	@ObfuscatedName("un")
	@ObfuscatedGetter(
		intValue = -1619357703
	)
	static int field2641;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1506494255
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -118489229
	)
	@Export("x")
	int x;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1838880061
	)
	@Export("y")
	int y;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 100104241
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 8092243
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[Lkf;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("aq")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1261156353
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 225429201
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ax")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("ay")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("au")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1960205435
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 176877587
	)
	int field2660;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1016934781
	)
	int field2657;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 2034123681
	)
	int field2658;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
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
