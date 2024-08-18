import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
@Implements("WorldView")
public class WorldView {
	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	static Archive field1305;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1918244811
	)
	@Export("id")
	int id;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lhf;"
	)
	@Export("scene")
	public Scene scene;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lkd;"
	)
	@Export("collisionMaps")
	CollisionMap[] collisionMaps;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -208768165
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1169251995
	)
	@Export("sizeX")
	int sizeX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1481398255
	)
	@Export("sizeY")
	int sizeY;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 171461951
	)
	@Export("baseX")
	int baseX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 617581699
	)
	@Export("baseY")
	int baseY;
	@ObfuscatedName("ae")
	@Export("tileLastDrawnActor")
	int[][] tileLastDrawnActor;
	@ObfuscatedName("ad")
	@Export("tileHeights")
	int[][][] tileHeights;
	@ObfuscatedName("aq")
	@Export("tileSettings")
	byte[][][] tileSettings;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Ldw;"
	)
	@Export("players")
	Player[] players;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	@Export("playerUpdateManager")
	PlayerUpdateManager playerUpdateManager;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Ldd;"
	)
	@Export("npcs")
	NPC[] npcs;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1220558653
	)
	@Export("npcCount")
	int npcCount;
	@ObfuscatedName("af")
	@Export("npcIndices")
	int[] npcIndices;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[Lsv;"
	)
	@Export("worldEntities")
	WorldEntity[] worldEntities;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1644830975
	)
	@Export("worldEntityCount")
	int worldEntityCount;
	@ObfuscatedName("ag")
	@Export("worldEntityIndices")
	int[] worldEntityIndices;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[[[Lpr;"
	)
	@Export("groundItems")
	NodeDeque[][][] groundItems;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("pendingSpawns")
	NodeDeque pendingSpawns;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("projectiles")
	NodeDeque projectiles;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("graphicsObjects")
	NodeDeque graphicsObjects;

	@ObfuscatedSignature(
		descriptor = "(IIIILgj;)V"
	)
	public WorldView(int var1, int var2, int var3, int var4, class173 var5) {
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

		for (int var6 = 0; var6 < 4; ++var6) {
			this.collisionMaps[var6] = new CollisionMap(var2, var3);
		}

		this.scene = new Scene(var1, 4, var2, var3, var4, var5, this.tileHeights);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-93"
	)
	@Export("isTopLevelWorldView")
	boolean isTopLevelWorldView() {
		return this.id == -1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1199563977"
	)
	void method2726() {
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "460893304"
	)
	public static void method2731() {
		InvDefinition.InvDefinition_cached.clear();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1913220207"
	)
	@Export("SpriteBuffer_decode")
	public static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		var1.offset = var0.length - 2;
		class563.SpriteBuffer_spriteCount = var1.readUnsignedShort();
		class149.SpriteBuffer_xOffsets = new int[class563.SpriteBuffer_spriteCount];
		class563.SpriteBuffer_yOffsets = new int[class563.SpriteBuffer_spriteCount];
		class563.SpriteBuffer_spriteWidths = new int[class563.SpriteBuffer_spriteCount];
		class372.SpriteBuffer_spriteHeights = new int[class563.SpriteBuffer_spriteCount];
		class563.SpriteBuffer_pixels = new byte[class563.SpriteBuffer_spriteCount][];
		var1.offset = var0.length - 7 - class563.SpriteBuffer_spriteCount * 8;
		SpriteBufferProperties.SpriteBuffer_spriteWidth = var1.readUnsignedShort();
		class563.SpriteBuffer_spriteHeight = var1.readUnsignedShort();
		int var2 = (var1.readUnsignedByte() & 255) + 1;

		int var3;
		for (var3 = 0; var3 < class563.SpriteBuffer_spriteCount; ++var3) {
			class149.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class563.SpriteBuffer_spriteCount; ++var3) {
			class563.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class563.SpriteBuffer_spriteCount; ++var3) {
			class563.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class563.SpriteBuffer_spriteCount; ++var3) {
			class372.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class563.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3;
		RouteStrategy.SpriteBuffer_spritePalette = new int[var2];

		for (var3 = 1; var3 < var2; ++var3) {
			RouteStrategy.SpriteBuffer_spritePalette[var3] = var1.readMedium();
			if (RouteStrategy.SpriteBuffer_spritePalette[var3] == 0) {
				RouteStrategy.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0;

		for (var3 = 0; var3 < class563.SpriteBuffer_spriteCount; ++var3) {
			int var4 = class563.SpriteBuffer_spriteWidths[var3];
			int var5 = class372.SpriteBuffer_spriteHeights[var3];
			int var6 = var5 * var4;
			byte[] var7 = new byte[var6];
			class563.SpriteBuffer_pixels[var3] = var7;
			int var8 = var1.readUnsignedByte();
			int var9;
			if (var8 == 0) {
				for (var9 = 0; var9 < var6; ++var9) {
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) {
				for (var9 = 0; var9 < var4; ++var9) {
					for (int var10 = 0; var10 < var5; ++var10) {
						var7[var9 + var4 * var10] = var1.readByte();
					}
				}
			}
		}

	}

	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "(III)Ljava/lang/String;",
		garbageValue = "-1879159437"
	)
	static final String method2734(int var0, int var1) {
		int var2 = var1 - var0;
		if (var2 < -9) {
			return TransformationMatrix.colorStartTag(16711680);
		} else if (var2 < -6) {
			return TransformationMatrix.colorStartTag(16723968);
		} else if (var2 < -3) {
			return TransformationMatrix.colorStartTag(16740352);
		} else if (var2 < 0) {
			return TransformationMatrix.colorStartTag(16756736);
		} else if (var2 > 9) {
			return TransformationMatrix.colorStartTag(65280);
		} else if (var2 > 6) {
			return TransformationMatrix.colorStartTag(4259584);
		} else if (var2 > 3) {
			return TransformationMatrix.colorStartTag(8453888);
		} else {
			return var2 > 0 ? TransformationMatrix.colorStartTag(12648192) : TransformationMatrix.colorStartTag(16776960);
		}
	}
}
