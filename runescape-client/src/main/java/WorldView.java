import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
@Implements("WorldView")
public class WorldView {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 2142034745
	)
	@Export("id")
	int id;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("scene")
	public Scene scene;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Lip;"
	)
	@Export("collisionMaps")
	CollisionMap[] collisionMaps;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1735177445
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1019381583
	)
	@Export("sizeX")
	int sizeX;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1628317125
	)
	@Export("sizeY")
	int sizeY;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 998139683
	)
	@Export("baseX")
	int baseX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1484949025
	)
	@Export("baseY")
	int baseY;
	@ObfuscatedName("ab")
	@Export("tileLastDrawnActor")
	int[][] tileLastDrawnActor;
	@ObfuscatedName("ai")
	@Export("tileHeights")
	int[][][] tileHeights;
	@ObfuscatedName("ae")
	@Export("tileSettings")
	byte[][][] tileSettings;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Ldb;"
	)
	@Export("players")
	Player[] players;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	@Export("playerUpdateManager")
	PlayerUpdateManager playerUpdateManager;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[Ldx;"
	)
	@Export("npcs")
	NPC[] npcs;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -959579827
	)
	@Export("npcCount")
	int npcCount;
	@ObfuscatedName("ac")
	@Export("npcIndices")
	int[] npcIndices;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lso;"
	)
	@Export("worldEntities")
	WorldEntity[] worldEntities;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1124408595
	)
	@Export("worldEntityCount")
	int worldEntityCount;
	@ObfuscatedName("ao")
	@Export("worldEntityIndices")
	int[] worldEntityIndices;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[[[Lpr;"
	)
	@Export("groundItems")
	NodeDeque[][][] groundItems;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("pendingSpawns")
	NodeDeque pendingSpawns;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("projectiles")
	NodeDeque projectiles;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("graphicsObjects")
	NodeDeque graphicsObjects;

	public WorldView(int var1, int var2, int var3, int var4) {
		this.collisionMaps = new CollisionMap[4];
		this.players = new Player[2048];
		this.playerUpdateManager = new PlayerUpdateManager(this);
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

		for (int var5 = 0; var5 < 4; ++var5) {
			this.collisionMaps[var5] = new CollisionMap(var2, var3);
		}

		this.scene = new Scene(var1, 4, var2, var3, var4, this.tileHeights);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "74"
	)
	boolean method2676() {
		return this.id == -1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-843666588"
	)
	@Export("clear")
	void clear() {
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-370890653"
	)
	void method2680() {
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

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1942851204"
	)
	static final void method2684(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
			if (Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetHeights[var4] + Client.rootWidgetYs[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
				Client.field722[var4] = true;
			}
		}

	}
}
