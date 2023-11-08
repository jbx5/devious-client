import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kv")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1542161315
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -794250693
	)
	@Export("x")
	int x;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -953310759
	)
	@Export("y")
	int y;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1305070591
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 740733941
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[Lle;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("ax")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -227378737
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1756345945
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ak")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("aj")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("am")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -321826469
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -675199519
	)
	int field2760;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 84209581
	)
	int field2747;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2116343905
	)
	int field2762;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lkv;"
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

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1636778707"
	)
	static void method5187() {
		for (class222 var0 = (class222)Client.field682.last(); var0 != null; var0 = (class222)Client.field682.previous()) {
			var0.remove();
		}

	}
}
