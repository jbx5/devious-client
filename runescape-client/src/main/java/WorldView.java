import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
@Implements("WorldView")
public class WorldView {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1413982259
	)
	@Export("id")
	int id;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	@Export("scene")
	public Scene scene;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lir;"
	)
	@Export("collisionMaps")
	CollisionMap[] collisionMaps;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1305902891
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1392129955
	)
	@Export("sizeX")
	int sizeX;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1595806771
	)
	@Export("sizeY")
	int sizeY;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1010690991
	)
	@Export("baseX")
	int baseX;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -854149623
	)
	@Export("baseY")
	int baseY;
	@ObfuscatedName("ac")
	@Export("tileLastDrawnActor")
	int[][] tileLastDrawnActor;
	@ObfuscatedName("ao")
	@Export("tileHeights")
	int[][][] tileHeights;
	@ObfuscatedName("ah")
	@Export("tileSettings")
	byte[][][] tileSettings;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[Lde;"
	)
	@Export("players")
	Player[] players;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	@Export("playerUpdateManager")
	PlayerUpdateManager playerUpdateManager;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Ldv;"
	)
	@Export("npcs")
	NPC[] npcs;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1962706385
	)
	@Export("npcCount")
	int npcCount;
	@ObfuscatedName("ax")
	@Export("npcIndices")
	int[] npcIndices;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Lst;"
	)
	@Export("worldEntities")
	WorldEntity[] worldEntities;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1011567785
	)
	@Export("worldEntityCount")
	int worldEntityCount;
	@ObfuscatedName("as")
	@Export("worldEntityIndices")
	int[] worldEntityIndices;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[[[Lpk;"
	)
	@Export("groundItems")
	NodeDeque[][][] groundItems;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	@Export("pendingSpawns")
	NodeDeque pendingSpawns;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	@Export("projectiles")
	NodeDeque projectiles;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-799077622"
	)
	boolean method2634() {
		return this.id == -1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "841220988"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "66"
	)
	void method2640() {
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1128508700"
	)
	static void method2642() {
		Messages.Messages_channels.clear();
		Messages.Messages_hashTable.clear();
		Messages.Messages_queue.clear();
		Messages.Messages_count = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-121"
	)
	static boolean method2633(char var0) {
		for (int var1 = 0; var1 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var1) {
			if (var0 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var1)) {
				return true;
			}
		}

		return false;
	}
}
