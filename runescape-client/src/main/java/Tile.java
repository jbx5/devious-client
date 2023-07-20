import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
@Implements("Tile")
public final class Tile extends Node {
	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "Lsz;"
	)
	static Fonts field2504;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1122725465
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 428828807
	)
	@Export("x")
	int x;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 801906035
	)
	@Export("y")
	int y;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1336528199
	)
	@Export("originalPlane")
	int originalPlane;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	@Export("paint")
	SceneTilePaint paint;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("model")
	SceneTileModel model;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lje;"
	)
	@Export("boundaryObject")
	BoundaryObject boundaryObject;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("wallDecoration")
	WallDecoration wallDecoration;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	@Export("floorDecoration")
	FloorDecoration floorDecoration;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	@Export("itemLayer")
	ItemLayer itemLayer;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 284655579
	)
	@Export("gameObjectsCount")
	int gameObjectsCount;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Ljc;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("ah")
	@Export("gameObjectEdgeMasks")
	int[] gameObjectEdgeMasks;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -357602357
	)
	@Export("gameObjectsEdgeMask")
	int gameObjectsEdgeMask;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1702284851
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("au")
	@Export("drawPrimary")
	boolean drawPrimary;
	@ObfuscatedName("ae")
	@Export("drawSecondary")
	boolean drawSecondary;
	@ObfuscatedName("ab")
	@Export("drawGameObjects")
	boolean drawGameObjects;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -495535849
	)
	@Export("drawGameObjectEdges")
	int drawGameObjectEdges;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 537651395
	)
	int field2502;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1270517303
	)
	int field2496;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -518966333
	)
	int field2501;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lil;"
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lhi;",
		garbageValue = "1533776836"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = IntHashTable.NpcDefinition_archive.takeFile(9, var0);
			var1 = new NPCComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "83"
	)
	static final void method4399(String var0) {
		class415.addGameMessage(30, "", var0);
	}

	@ObfuscatedName("na")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1158913545"
	)
	static final void method4401() {
		Client.field553 = Client.cycleCntr;
		class458.field4775 = true;
	}
}
