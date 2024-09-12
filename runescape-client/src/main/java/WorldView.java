import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
@Implements("WorldView")
public class WorldView extends Node {
	@ObfuscatedName("nt")
	@ObfuscatedGetter(
		intValue = 2042950949
	)
	static int field1360;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1011931441
	)
	@Export("id")
	int id;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljh;"
	)
	@Export("scene")
	public Scene scene;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Lkd;"
	)
	@Export("collisionMaps")
	CollisionMap[] collisionMaps;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 97097587
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 754660757
	)
	@Export("sizeX")
	int sizeX;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1090907831
	)
	@Export("sizeY")
	int sizeY;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 2072219689
	)
	@Export("baseX")
	int baseX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1001606641
	)
	@Export("baseY")
	int baseY;
	@ObfuscatedName("au")
	@Export("tileLastDrawnActor")
	int[][] tileLastDrawnActor;
	@ObfuscatedName("ar")
	@Export("tileHeights")
	int[][][] tileHeights;
	@ObfuscatedName("al")
	@Export("tileSettings")
	byte[][][] tileSettings;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[Ldi;"
	)
	@Export("players")
	Player[] players;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lea;"
	)
	@Export("npcs")
	NPC[] npcs;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -514517369
	)
	@Export("npcCount")
	int npcCount;
	@ObfuscatedName("ab")
	@Export("npcIndices")
	int[] npcIndices;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[Lsu;"
	)
	@Export("worldEntities")
	WorldEntity[] worldEntities;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -557899353
	)
	@Export("worldEntityCount")
	int worldEntityCount;
	@ObfuscatedName("ai")
	@Export("worldEntityIndices")
	int[] worldEntityIndices;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[[[Lpk;"
	)
	@Export("groundItems")
	NodeDeque[][][] groundItems;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	@Export("pendingSpawns")
	NodeDeque pendingSpawns;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	@Export("projectiles")
	NodeDeque projectiles;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	@Export("graphicsObjects")
	NodeDeque graphicsObjects;

	@ObfuscatedSignature(
		descriptor = "(IIIILin;)V"
	)
	WorldView(int var1, int var2, int var3, int var4, class232 var5) {
		this.collisionMaps = new CollisionMap[4];
		this.players = new Player[2048];
		this.npcs = new NPC[65536];
		this.npcIndices = new int[65536];
		this.worldEntities = new WorldEntity[2048];
		this.worldEntityIndices = new int[2048];
		this.pendingSpawns = new NodeDeque();
		this.projectiles = new NodeDeque();
		this.graphicsObjects = new NodeDeque();
		this.id = var1;
		this.sizeX = var2;
		this.sizeY = var3;
		this.groundItems = new NodeDeque[4][var2][var3];
		this.tileHeights = new int[4][var2 + 1][var3 + 1];
		this.tileSettings = new byte[4][var2][var3];
		this.tileLastDrawnActor = new int[var2][var3];

		for (int var6 = 0; var6 < 4; ++var6) {
			this.collisionMaps[var6] = new CollisionMap(var2, var3);
		}

		this.scene = new Scene(var1, 4, var2, var3, var4, var5, this.tileHeights);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2087936340"
	)
	void method2860() {
		this.npcCount = 0;
		this.worldEntityCount = 0;

		int var1;
		for (var1 = 0; var1 < 2048; ++var1) {
			this.players[var1] = null;
		}

		for (var1 = 0; var1 < 65536; ++var1) {
			this.npcs[var1] = null;
		}

		for (var1 = 0; var1 < 2048; ++var1) {
			this.worldEntities[var1] = null;
		}

		this.projectiles.clear();
		this.graphicsObjects.clear();
		this.pendingSpawns = new NodeDeque();

		for (var1 = 0; var1 < 4; ++var1) {
			for (int var2 = 0; var2 < this.sizeX; ++var2) {
				for (int var3 = 0; var3 < this.sizeY; ++var3) {
					this.groundItems[var1][var2][var3] = null;
				}
			}
		}

		this.scene.clearTempGameObjects();

		for (var1 = 0; var1 < 4; ++var1) {
			this.collisionMaps[var1].clear();
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1939275323"
	)
	void method2856() {
		int var1;
		for (var1 = 0; var1 < 2048; ++var1) {
			this.players[var1] = null;
		}

		for (var1 = 0; var1 < this.npcs.length; ++var1) {
			NPC var2 = this.npcs[var1];
			if (var2 != null) {
				var2.targetIndex = -1;
				var2.false0 = false;
			}
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lny;IB)V",
		garbageValue = "0"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field3928 == null) {
			throw new RuntimeException();
		} else {
			if (var0.field4000 == null) {
				var0.field4000 = new int[var0.field3928.length];
			}

			var0.field4000[var1] = Integer.MAX_VALUE;
		}
	}
}
