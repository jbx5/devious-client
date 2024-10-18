import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jw")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("bg")
	static String field2584;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1153163
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 913761943
	)
	@Export("x")
	int x;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -2130835639
	)
	@Export("y")
	int y;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1013546863
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 2050644103
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lkf;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("ao")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1999985463
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -721376897
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ab")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("az")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("ag")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1376107145
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 424558461
	)
	int field2578;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -956985887
	)
	int field2582;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1678602377
	)
	int field2564;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
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
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "124"
	)
	static final void method4793(String var0) {
		StringBuilder var10000 = new StringBuilder();
		Object var10001 = null;
		var10000 = var10000.append("Please remove ").append(var0);
		var10001 = null;
		String var1 = var10000.append(" from your ignore list first").toString();
		class430.addGameMessage(30, "", var1);
	}
}
