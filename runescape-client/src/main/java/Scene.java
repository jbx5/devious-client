import java.util.BitSet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
@Implements("Scene")
public class Scene extends Renderable {
	@ObfuscatedName("ad")
	@Export("Scene_isLowDetail")
	public static boolean Scene_isLowDetail;
	@ObfuscatedName("bq")
	static final int[] field2963;
	@ObfuscatedName("bd")
	static final int[] field2964;
	@ObfuscatedName("bz")
	static final int[] field2990;
	@ObfuscatedName("bk")
	static final int[] field2931;
	@ObfuscatedName("br")
	static final int[] field2925;
	@ObfuscatedName("bf")
	static final int[] field2951;
	@ObfuscatedName("cf")
	static final int[] field2993;
	@ObfuscatedName("aq")
	@Export("worldViewId")
	final int worldViewId;
	@ObfuscatedName("ag")
	public int field2966;
	@ObfuscatedName("ak")
	@Export("planes")
	int planes;
	@ObfuscatedName("ap")
	@Export("xSize")
	int xSize;
	@ObfuscatedName("an")
	@Export("ySize")
	int ySize;
	@ObfuscatedName("aj")
	@Export("tileHeights")
	int[][][] tileHeights;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[[[Lki;"
	)
	@Export("tiles")
	Tile[][][] tiles;
	@ObfuscatedName("ab")
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ai")
	@Export("tempGameObjectsCount")
	int tempGameObjectsCount;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Llp;"
	)
	@Export("tempGameObjects")
	GameObject[] tempGameObjects;
	@ObfuscatedName("au")
	int[][][] field2928;
	@ObfuscatedName("ay")
	@Export("Scene_offsetOccluder")
	int Scene_offsetOccluder;
	@ObfuscatedName("ao")
	@Export("tileUpdateCount")
	int tileUpdateCount;
	@ObfuscatedName("aa")
	@Export("Scene_plane")
	public int Scene_plane;
	@ObfuscatedName("as")
	@Export("Scene_drawnCount")
	int Scene_drawnCount;
	@ObfuscatedName("aw")
	@Export("Scene_cameraXTileMin")
	int Scene_cameraXTileMin;
	@ObfuscatedName("at")
	@Export("Scene_cameraXTileMax")
	int Scene_cameraXTileMax;
	@ObfuscatedName("af")
	@Export("Scene_cameraYTileMin")
	int Scene_cameraYTileMin;
	@ObfuscatedName("am")
	@Export("Scene_cameraYTileMax")
	int Scene_cameraYTileMax;
	@ObfuscatedName("ar")
	@Export("Scene_cameraXTile")
	int Scene_cameraXTile;
	@ObfuscatedName("bt")
	@Export("Scene_cameraYTile")
	int Scene_cameraYTile;
	@ObfuscatedName("bj")
	@Export("Scene_cameraX")
	int Scene_cameraX;
	@ObfuscatedName("be")
	@Export("Scene_cameraY")
	int Scene_cameraY;
	@ObfuscatedName("bm")
	@Export("Scene_cameraZ")
	int Scene_cameraZ;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "[Llp;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("bi")
	@Export("checkClick")
	boolean checkClick;
	@ObfuscatedName("ba")
	@Export("Scene_selectedPlane")
	int Scene_selectedPlane;
	@ObfuscatedName("bg")
	@Export("Scene_selectedScreenX")
	int Scene_selectedScreenX;
	@ObfuscatedName("bs")
	@Export("Scene_selectedScreenY")
	int Scene_selectedScreenY;
	@ObfuscatedName("bp")
	@Export("baseX")
	public int baseX;
	@ObfuscatedName("bx")
	@Export("baseY")
	public int baseY;
	@ObfuscatedName("bu")
	@Export("viewportWalking")
	boolean viewportWalking;
	@ObfuscatedName("bl")
	@Export("scenePlanesCount")
	int scenePlanesCount;
	@ObfuscatedName("bc")
	@Export("Scene_planeOccluderCounts")
	int[] Scene_planeOccluderCounts;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "[[Llq;"
	)
	@Export("Scene_planeOccluders")
	Occluder[][] Scene_planeOccluders;
	@ObfuscatedName("bb")
	@Export("Scene_currentOccludersCount")
	int Scene_currentOccludersCount;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "[Llq;"
	)
	@Export("Scene_currentOccluders")
	Occluder[] Scene_currentOccluders;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("Scene_tilesDeque")
	NodeDeque Scene_tilesDeque;
	@ObfuscatedName("cu")
	@Export("tileShape2D")
	int[][] tileShape2D;
	@ObfuscatedName("cn")
	@Export("tileRotation2D")
	int[][] tileRotation2D;
	@ObfuscatedName("ce")
	int[] field2998;
	@ObfuscatedName("co")
	int field2977;
	@ObfuscatedName("ch")
	int field2981;
	@ObfuscatedName("ct")
	int field2979;
	@ObfuscatedName("cd")
	int field2980;
	@ObfuscatedName("ck")
	final int field2957;
	@ObfuscatedName("cq")
	BitSet field2982;
	@ObfuscatedName("cs")
	BitSet field2983;
	@ObfuscatedName("cp")
	final int field2970;
	@ObfuscatedName("cy")
	final int field2985;
	@ObfuscatedName("cw")
	final int field2936;
	@ObfuscatedName("ci")
	final int field2987;
	@ObfuscatedName("cc")
	BitSet field2988;
	@ObfuscatedName("cr")
	BitSet field2965;
	@ObfuscatedName("cb")
	final int field2997;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1515787825
	)
	final int field2991;
	@ObfuscatedName("cj")
	final int field2992;
	@ObfuscatedName("cx")
	int field2968;
	@ObfuscatedName("ca")
	int field2994;
	@ObfuscatedName("df")
	int field2995;
	@ObfuscatedName("dd")
	int field2996;
	@ObfuscatedName("dg")
	int field2940;
	@ObfuscatedName("dr")
	int field2971;
	@ObfuscatedName("dn")
	int field2999;
	@ObfuscatedName("ds")
	int field3000;

	static {
		Scene_isLowDetail = false;
		field2963 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
		field2964 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
		field2990 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
		field2931 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
		field2925 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
		field2951 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
		field2993 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
	}

	public Scene(int var1, int var2, int var3, int var4, int var5, int[][][] var6) {
		this.minPlane = 0;
		this.tempGameObjectsCount = 0;
		this.tempGameObjects = new GameObject[5000];
		this.Scene_offsetOccluder = 0;
		this.tileUpdateCount = 0;
		this.Scene_plane = 0;
		this.gameObjects = new GameObject[100];
		this.checkClick = false;
		this.Scene_selectedPlane = 0;
		this.Scene_selectedScreenX = 0;
		this.Scene_selectedScreenY = 0;
		this.baseX = -1;
		this.baseY = -1;
		this.viewportWalking = false;
		this.scenePlanesCount = 4;
		this.Scene_planeOccluderCounts = new int[this.scenePlanesCount];
		this.Scene_planeOccluders = new Occluder[this.scenePlanesCount][500];
		this.Scene_currentOccludersCount = 0;
		this.Scene_currentOccluders = new Occluder[500];
		this.Scene_tilesDeque = new NodeDeque();
		this.tileShape2D = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
		this.tileRotation2D = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
		this.field2998 = new int[9];
		this.planes = var2;
		this.xSize = var3;
		this.ySize = var4;
		this.tiles = new Tile[var2][var3][var4];
		this.field2928 = new int[var2][var3 + 1][var4 + 1];
		this.tileHeights = var6;
		this.Scene_offsetOccluder = var5;
		this.worldViewId = var1;
		if (var1 != -1) {
			this.field2957 = 0;
			this.field2982 = null;
			this.field2983 = null;
			this.field2970 = 0;
			this.field2985 = 0;
			this.field2936 = 0;
			this.field2987 = 0;
			this.field2988 = null;
			this.field2965 = null;
			this.field2997 = 0;
			this.field2991 = 0;
			this.field2992 = 0;
		} else {
			this.field2957 = 8386816;
			this.field2982 = new BitSet(this.field2957);
			this.field2983 = new BitSet(this.field2957);
			this.field2970 = 1048352;
			this.field2985 = 32761;
			this.field2936 = 181;
			this.field2987 = 9644832;
			this.field2988 = new BitSet(this.field2987);
			this.field2965 = new BitSet(this.field2987);
			this.field2997 = 1071648;
			this.field2991 = 1;
			this.field2992 = 183;
		}

		AbstractRasterizer.method5371(var5);
		this.clearTempGameObjects();
	}

	@ObfuscatedName("aq")
	@Export("clearTempGameObjects")
	public void clearTempGameObjects() {
		int var1;
		int var2;
		for (var1 = 0; var1 < this.planes; ++var1) {
			for (var2 = 0; var2 < this.xSize; ++var2) {
				for (int var3 = 0; var3 < this.ySize; ++var3) {
					this.tiles[var1][var2][var3] = null;
				}
			}
		}

		for (var1 = 0; var1 < this.scenePlanesCount; ++var1) {
			for (var2 = 0; var2 < this.Scene_planeOccluderCounts[var1]; ++var2) {
				this.Scene_planeOccluders[var1][var2] = null;
			}

			this.Scene_planeOccluderCounts[var1] = 0;
		}

		for (var1 = 0; var1 < this.tempGameObjectsCount; ++var1) {
			this.tempGameObjects[var1] = null;
		}

		this.tempGameObjectsCount = 0;

		for (var1 = 0; var1 < this.gameObjects.length; ++var1) {
			this.gameObjects[var1] = null;
		}

	}

	@ObfuscatedName("ad")
	@Export("init")
	public void init(int var1) {
		this.minPlane = var1;

		for (int var2 = 0; var2 < this.xSize; ++var2) {
			for (int var3 = 0; var3 < this.ySize; ++var3) {
				if (this.tiles[var1][var2][var3] == null) {
					this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
				}
			}
		}

	}

	@ObfuscatedName("ag")
	@Export("setLinkBelow")
	public void setLinkBelow(int var1, int var2) {
		Tile var3 = this.tiles[0][var1][var2];

		for (int var4 = 0; var4 < 3; ++var4) {
			Tile var5 = this.tiles[var4][var1][var2] = this.tiles[var4 + 1][var1][var2];
			if (var5 != null) {
				--var5.plane;

				for (int var6 = 0; var6 < var5.gameObjectsCount; ++var6) {
					GameObject var7 = var5.gameObjects[var6];
					long var9 = var7.tag;
					int var11 = (int)(var9 >>> 14 & 3L);
					boolean var8 = var11 == 2;
					if (var8 && var7.startX == var1 && var2 == var7.startY) {
						--var7.plane;
					}
				}
			}
		}

		if (this.tiles[0][var1][var2] == null) {
			this.tiles[0][var1][var2] = new Tile(0, var1, var2);
		}

		this.tiles[0][var1][var2].linkedBelowTile = var3;
		this.tiles[3][var1][var2] = null;
	}

	@ObfuscatedName("ak")
	@Export("Scene_addOccluder")
	public void Scene_addOccluder(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Occluder var9 = new Occluder();
		var9.minTileX = var3 / 128;
		var9.maxTileX = var4 / 128;
		var9.minTileY = var5 / 128;
		var9.maxTileY = var6 / 128;
		var9.type = var2;
		var9.minX = var3;
		var9.maxX = var4;
		var9.minZ = var5;
		var9.maxZ = var6;
		var9.minY = var7;
		var9.maxY = var8;
		this.Scene_planeOccluders[var1][this.Scene_planeOccluderCounts[var1]++] = var9;
	}

	@ObfuscatedName("ap")
	@Export("setTileMinPlane")
	public void setTileMinPlane(int var1, int var2, int var3, int var4) {
		Tile var5 = this.tiles[var1][var2][var3];
		if (var5 != null) {
			this.tiles[var1][var2][var3].minPlane = var4;
		}
	}

	@ObfuscatedName("an")
	@Export("addTile")
	public void addTile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
		SceneTilePaint var21;
		int var22;
		if (var4 == 0) {
			var21 = new SceneTilePaint(var11, var12, var13, var14, -1, var19, false);

			for (var22 = var1; var22 >= 0; --var22) {
				if (this.tiles[var22][var2][var3] == null) {
					this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].paint = var21;
		} else if (var4 != 1) {
			SceneTileModel var23 = new SceneTileModel(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

			for (var22 = var1; var22 >= 0; --var22) {
				if (this.tiles[var22][var2][var3] == null) {
					this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].model = var23;
		} else {
			var21 = new SceneTilePaint(var15, var16, var17, var18, var6, var20, var8 == var7 && var7 == var9 && var10 == var7);

			for (var22 = var1; var22 >= 0; --var22) {
				if (this.tiles[var22][var2][var3] == null) {
					this.tiles[var22][var2][var3] = new Tile(var22, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].paint = var21;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIILkt;JI)V"
	)
	@Export("newFloorDecoration")
	public void newFloorDecoration(int var1, int var2, int var3, int var4, Renderable var5, long var6, int var8) {
		if (var5 != null) {
			FloorDecoration var9 = new FloorDecoration();
			var9.renderable = var5;
			var9.x = var2 * 128 + 64;
			var9.y = var3 * 8192 + 4096;
			var9.z = var4;
			var9.tag = var6;
			var9.flags = var8;
			if (this.tiles[var1][var2][var3] == null) {
				this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
			}

			this.tiles[var1][var2][var3].floorDecoration = var9;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIILkt;JLkt;Lkt;)V"
	)
	@Export("newGroundItemPile")
	public void newGroundItemPile(int var1, int var2, int var3, int var4, Renderable var5, long var6, Renderable var8, Renderable var9) {
		ItemLayer var10 = new ItemLayer();
		var10.first = var5;
		var10.x = var2 * 128 + 64;
		var10.y = var3 * 8192 + 4096;
		var10.z = var4;
		var10.tag = var6;
		var10.second = var8;
		var10.third = var9;
		int var11 = 0;
		Tile var12 = this.tiles[var1][var2][var3];
		if (var12 != null) {
			for (int var13 = 0; var13 < var12.gameObjectsCount; ++var13) {
				if ((var12.gameObjects[var13].flags & 256) == 256 && var12.gameObjects[var13].renderable instanceof Model) {
					Model var14 = (Model)var12.gameObjects[var13].renderable;
					var14.calculateBoundsCylinder();
					if (var14.height > var11) {
						var11 = var14.height;
					}
				}
			}
		}

		var10.height = var11;
		if (this.tiles[var1][var2][var3] == null) {
			this.tiles[var1][var2][var3] = new Tile(var1, var2, var3);
		}

		this.tiles[var1][var2][var3].itemLayer = var10;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIILkt;Lkt;IIJI)V"
	)
	@Export("newBoundaryObject")
	public void newBoundaryObject(int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, long var9, int var11) {
		if (var5 != null || var6 != null) {
			BoundaryObject var12 = new BoundaryObject();
			var12.tag = var9;
			var12.flags = var11;
			var12.x = var2 * 128 + 64;
			var12.y = var3 * 8192 + 4096;
			var12.z = var4;
			var12.renderable1 = var5;
			var12.renderable2 = var6;
			var12.orientationA = var7;
			var12.orientationB = var8;

			for (int var13 = var1; var13 >= 0; --var13) {
				if (this.tiles[var13][var2][var3] == null) {
					this.tiles[var13][var2][var3] = new Tile(var13, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].boundaryObject = var12;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIIILkt;Lkt;IIIIJI)V"
	)
	@Export("newWallDecoration")
	public void newWallDecoration(int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, int var9, int var10, long var11, int var13) {
		if (var5 != null) {
			WallDecoration var14 = new WallDecoration();
			var14.tag = var11;
			var14.flags = var13;
			var14.x = var2 * 8192 + 4096;
			var14.y = var3 * 8192 + 4096;
			var14.z = var4;
			var14.renderable1 = var5;
			var14.renderable2 = var6;
			var14.orientation = var7;
			var14.orientation2 = var8;
			var14.xOffset = var9;
			var14.yOffset = var10;

			for (int var15 = var1; var15 >= 0; --var15) {
				if (this.tiles[var15][var2][var3] == null) {
					this.tiles[var15][var2][var3] = new Tile(var15, var2, var3);
				}
			}

			this.tiles[var1][var2][var3].wallDecoration = var14;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILkt;IJI)Z"
	)
	public boolean method5424(int var1, int var2, int var3, int var4, int var5, int var6, Renderable var7, int var8, long var9, int var11) {
		if (var7 == null) {
			return true;
		} else {
			int var12 = var5 * 64 + var2 * 128;
			int var13 = var6 * 64 + var3 * 128;
			return this.newGameObject(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIIILkt;IJZ)Z"
	)
	@Export("drawEntity")
	public boolean drawEntity(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, boolean var10) {
		if (var6 == null) {
			return true;
		} else {
			int var11 = var2 - var5;
			int var12 = var3 - var5;
			int var13 = var5 + var2;
			int var14 = var3 + var5;
			if (var10) {
				if (var7 > 640 && var7 < 1408) {
					var14 += 128;
				}

				if (var7 > 1152 && var7 < 1920) {
					var13 += 128;
				}

				if (var7 > 1664 || var7 < 384) {
					var12 -= 128;
				}

				if (var7 > 128 && var7 < 896) {
					var11 -= 128;
				}
			}

			var11 /= 128;
			var12 /= 128;
			var13 /= 128;
			var14 /= 128;
			return this.newGameObject(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIIILkt;IJIIII)Z"
	)
	@Export("addNullableObject")
	public boolean addNullableObject(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, int var10, int var11, int var12, int var13) {
		return var6 == null ? true : this.newGameObject(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILkt;IZJI)Z"
	)
	@Export("newGameObject")
	boolean newGameObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, Renderable var9, int var10, boolean var11, long var12, int var14) {
		int var16;
		for (int var15 = var2; var15 < var2 + var4; ++var15) {
			for (var16 = var3; var16 < var3 + var5; ++var16) {
				if (var15 < 0 || var16 < 0 || var15 >= this.xSize || var16 >= this.ySize) {
					return false;
				}

				Tile var23 = this.tiles[var1][var15][var16];
				if (var23 != null && var23.gameObjectsCount >= 5) {
					return false;
				}
			}
		}

		GameObject var21 = new GameObject();
		var21.tag = var12;
		var21.flags = var14;
		var21.plane = var1;
		var21.centerX = var6;
		var21.centerY = var7;
		var21.z = var8;
		var21.renderable = var9;
		var21.orientation = var10;
		var21.startX = var2;
		var21.startY = var3;
		var21.endX = var2 + var4 - 1;
		var21.endY = var3 + var5 - 1;

		for (var16 = var2; var16 < var2 + var4; ++var16) {
			for (int var17 = var3; var17 < var3 + var5; ++var17) {
				int var18 = 0;
				if (var16 > var2) {
					++var18;
				}

				if (var16 < var2 + var4 - 1) {
					var18 += 4;
				}

				if (var17 > var3) {
					var18 += 8;
				}

				if (var17 < var3 + var5 - 1) {
					var18 += 2;
				}

				for (int var19 = var1; var19 >= 0; --var19) {
					if (this.tiles[var19][var16][var17] == null) {
						this.tiles[var19][var16][var17] = new Tile(var19, var16, var17);
					}
				}

				Tile var22 = this.tiles[var1][var16][var17];
				var22.gameObjects[var22.gameObjectsCount] = var21;
				var22.gameObjectEdgeMasks[var22.gameObjectsCount] = var18;
				var22.gameObjectsEdgeMask |= var18;
				++var22.gameObjectsCount;
			}
		}

		if (var11) {
			this.tempGameObjects[this.tempGameObjectsCount++] = var21;
		}

		return true;
	}

	@ObfuscatedName("ao")
	@Export("setViewportWalking")
	public void setViewportWalking() {
		for (int var1 = 0; var1 < this.tempGameObjectsCount; ++var1) {
			GameObject var2 = this.tempGameObjects[var1];
			this.removeGameObject(var2);
			this.tempGameObjects[var1] = null;
		}

		this.tempGameObjectsCount = 0;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Llp;)V"
	)
	@Export("removeGameObject")
	void removeGameObject(GameObject var1) {
		for (int var2 = var1.startX; var2 <= var1.endX; ++var2) {
			for (int var3 = var1.startY; var3 <= var1.endY; ++var3) {
				Tile var4 = this.tiles[var1.plane][var2][var3];
				if (var4 != null) {
					int var5;
					for (var5 = 0; var5 < var4.gameObjectsCount; ++var5) {
						if (var4.gameObjects[var5] == var1) {
							--var4.gameObjectsCount;

							for (int var6 = var5; var6 < var4.gameObjectsCount; ++var6) {
								var4.gameObjects[var6] = var4.gameObjects[var6 + 1];
								var4.gameObjectEdgeMasks[var6] = var4.gameObjectEdgeMasks[var6 + 1];
							}

							var4.gameObjects[var4.gameObjectsCount] = null;
							break;
						}
					}

					var4.gameObjectsEdgeMask = 0;

					for (var5 = 0; var5 < var4.gameObjectsCount; ++var5) {
						var4.gameObjectsEdgeMask |= var4.gameObjectEdgeMasks[var5];
					}
				}
			}
		}

	}

	@ObfuscatedName("as")
	public void method5515(int var1, int var2, int var3, int var4) {
		Tile var5 = this.tiles[var1][var2][var3];
		if (var5 != null) {
			WallDecoration var6 = var5.wallDecoration;
			if (var6 != null) {
				var6.xOffset = var4 * var6.xOffset / 16;
				var6.yOffset = var4 * var6.yOffset / 16;
			}
		}
	}

	@ObfuscatedName("aw")
	@Export("removeBoundaryObject")
	public void removeBoundaryObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 != null) {
			var4.boundaryObject = null;
		}
	}

	@ObfuscatedName("at")
	@Export("removeWallDecoration")
	public void removeWallDecoration(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 != null) {
			var4.wallDecoration = null;
		}
	}

	@ObfuscatedName("af")
	@Export("removeGameObject")
	public void removeGameObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 != null) {
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) {
				GameObject var6 = var4.gameObjects[var5];
				long var8 = var6.tag;
				int var10 = (int)(var8 >>> 14 & 3L);
				boolean var7 = var10 == 2;
				if (var7 && var2 == var6.startX && var3 == var6.startY) {
					this.removeGameObject(var6);
					return;
				}
			}

		}
	}

	@ObfuscatedName("am")
	@Export("removeFloorDecoration")
	public void removeFloorDecoration(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 != null) {
			var4.floorDecoration = null;
		}
	}

	@ObfuscatedName("ar")
	@Export("removeGroundItemPile")
	public void removeGroundItemPile(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 != null) {
			var4.itemLayer = null;
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(III)Lla;"
	)
	@Export("getBoundaryObject")
	public BoundaryObject getBoundaryObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		return var4 == null ? null : var4.boundaryObject;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(III)Llu;"
	)
	@Export("getWallDecoration")
	public WallDecoration getWallDecoration(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		return var4 == null ? null : var4.wallDecoration;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(III)Llp;"
	)
	@Export("getGameObject")
	public GameObject getGameObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 == null) {
			return null;
		} else {
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) {
				GameObject var6 = var4.gameObjects[var5];
				long var8 = var6.tag;
				int var10 = (int)(var8 >>> 14 & 3L);
				boolean var7 = var10 == 2;
				if (var7 && var2 == var6.startX && var3 == var6.startY) {
					return var6;
				}
			}

			return null;
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(III)Lkk;"
	)
	@Export("getFloorDecoration")
	public FloorDecoration getFloorDecoration(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		return var4 != null && var4.floorDecoration != null ? var4.floorDecoration : null;
	}

	@ObfuscatedName("bo")
	@Export("getBoundaryObjectTag")
	public long getBoundaryObjectTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		return var4 != null && var4.boundaryObject != null ? var4.boundaryObject.tag : 0L;
	}

	@ObfuscatedName("bi")
	@Export("getWallDecorationTag")
	public long getWallDecorationTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		return var4 != null && var4.wallDecoration != null ? var4.wallDecoration.tag : 0L;
	}

	@ObfuscatedName("ba")
	@Export("getGameObjectTag")
	public long getGameObjectTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 == null) {
			return 0L;
		} else {
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) {
				GameObject var6 = var4.gameObjects[var5];
				long var8 = var6.tag;
				int var10 = (int)(var8 >>> 14 & 3L);
				boolean var7 = var10 == 2;
				if (var7 && var2 == var6.startX && var3 == var6.startY) {
					return var6.tag;
				}
			}

			return 0L;
		}
	}

	@ObfuscatedName("bg")
	@Export("getFloorDecorationTag")
	public long getFloorDecorationTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		return var4 != null && var4.floorDecoration != null ? var4.floorDecoration.tag : 0L;
	}

	@ObfuscatedName("bs")
	@Export("getObjectFlags")
	public int getObjectFlags(int var1, int var2, int var3, long var4) {
		Tile var6 = this.tiles[var1][var2][var3];
		if (var6 == null) {
			return -1;
		} else if (var6.boundaryObject != null && var6.boundaryObject.tag == var4) {
			return var6.boundaryObject.flags & 255;
		} else if (var6.wallDecoration != null && var6.wallDecoration.tag == var4) {
			return var6.wallDecoration.flags & 255;
		} else if (var6.floorDecoration != null && var6.floorDecoration.tag == var4) {
			return var6.floorDecoration.flags & 255;
		} else {
			for (int var7 = 0; var7 < var6.gameObjectsCount; ++var7) {
				if (var6.gameObjects[var7].tag == var4) {
					return var6.gameObjects[var7].flags & 255;
				}
			}

			return -1;
		}
	}

	@ObfuscatedName("bp")
	public void method5494(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.planes; ++var4) {
			for (int var5 = 0; var5 < this.xSize; ++var5) {
				for (int var6 = 0; var6 < this.ySize; ++var6) {
					Tile var7 = this.tiles[var4][var5][var6];
					if (var7 != null) {
						BoundaryObject var8 = var7.boundaryObject;
						ModelData var10;
						if (var8 != null && var8.renderable1 instanceof ModelData) {
							ModelData var9 = (ModelData)var8.renderable1;
							this.method5447(var9, var4, var5, var6, 1, 1);
							if (var8.renderable2 instanceof ModelData) {
								var10 = (ModelData)var8.renderable2;
								this.method5447(var10, var4, var5, var6, 1, 1);
								ModelData.method5179(var9, var10, 0, 0, 0, false);
								var8.renderable2 = var10.toModel(var10.ambient, var10.contrast, var1, var2, var3);
							}

							var8.renderable1 = var9.toModel(var9.ambient, var9.contrast, var1, var2, var3);
						}

						for (int var12 = 0; var12 < var7.gameObjectsCount; ++var12) {
							GameObject var14 = var7.gameObjects[var12];
							if (var14 != null && var14.renderable instanceof ModelData) {
								ModelData var11 = (ModelData)var14.renderable;
								this.method5447(var11, var4, var5, var6, var14.endX - var14.startX + 1, var14.endY - var14.startY + 1);
								var14.renderable = var11.toModel(var11.ambient, var11.contrast, var1, var2, var3);
							}
						}

						FloorDecoration var13 = var7.floorDecoration;
						if (var13 != null && var13.renderable instanceof ModelData) {
							var10 = (ModelData)var13.renderable;
							this.method5640(var10, var4, var5, var6);
							var13.renderable = var10.toModel(var10.ambient, var10.contrast, var1, var2, var3);
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lkr;III)V"
	)
	void method5640(ModelData var1, int var2, int var3, int var4) {
		int var6 = var3 + 1;
		int var7 = var4 - 1;
		int var8 = var4 + 1;

		for (int var9 = var3; var9 <= var6; ++var9) {
			if (var9 >= 0 && var9 < this.xSize) {
				for (int var10 = var7; var10 <= var8; ++var10) {
					if (var10 >= 0 && var10 < this.ySize && (var9 >= var6 || var10 >= var8)) {
						Tile var11 = this.tiles[var2][var9][var10];
						if (var11 != null && var11.floorDecoration != null && var11.floorDecoration.renderable instanceof ModelData) {
							int var12 = this.method5448(var2, var9, var10, var2, var3, var4);
							ModelData var13 = (ModelData)var11.floorDecoration.renderable;
							ModelData.method5179(var1, var13, (var9 - var3) * 128, var12, (var10 - var4) * 128, true);
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lkr;IIIII)V"
	)
	void method5447(ModelData var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true;
		int var8 = var3;
		int var9 = var3 + var5;
		int var10 = var4 - 1;
		int var11 = var4 + var6;

		for (int var12 = var2; var12 <= var2 + 1; ++var12) {
			if (var12 != this.planes) {
				for (int var13 = var8; var13 <= var9; ++var13) {
					if (var13 >= 0 && var13 < this.xSize) {
						for (int var14 = var10; var14 <= var11; ++var14) {
							if (var14 >= 0 && var14 < this.ySize && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var3 != var13)) {
								Tile var15 = this.tiles[var12][var13][var14];
								if (var15 != null) {
									int var16 = this.method5448(var12, var13, var14, var2, var3, var4);
									BoundaryObject var17 = var15.boundaryObject;
									if (var17 != null) {
										ModelData var18;
										if (var17.renderable1 instanceof ModelData) {
											var18 = (ModelData)var17.renderable1;
											ModelData.method5179(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
										}

										if (var17.renderable2 instanceof ModelData) {
											var18 = (ModelData)var17.renderable2;
											ModelData.method5179(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
										}
									}

									for (int var23 = 0; var23 < var15.gameObjectsCount; ++var23) {
										GameObject var19 = var15.gameObjects[var23];
										if (var19 != null && var19.renderable instanceof ModelData) {
											ModelData var20 = (ModelData)var19.renderable;
											int var21 = var19.endX - var19.startX + 1;
											int var22 = var19.endY - var19.startY + 1;
											ModelData.method5179(var1, var20, (var21 - var5) * 64 + (var19.startX - var3) * 128, var16, (var19.startY - var4) * 128 + (var22 - var6) * 64, var7);
										}
									}
								}
							}
						}
					}
				}

				--var8;
				var7 = false;
			}
		}

	}

	@ObfuscatedName("by")
	int method5448(int var1, int var2, int var3, int var4, int var5, int var6) {
		return this.method5650(var1, var2, var3) - this.method5650(var4, var5, var6);
	}

	@ObfuscatedName("bw")
	int method5650(int var1, int var2, int var3) {
		return (this.tileHeights[var1][var2 + 1][var3 + 1] + this.tileHeights[var1][var2][var3] + this.tileHeights[var1][var2][var3 + 1] + this.tileHeights[var1][var2 + 1][var3]) / 4;
	}

	@ObfuscatedName("bl")
	@Export("drawTileMinimap")
	public void drawTileMinimap(int[] var1, int var2, int var3, int var4, int var5, int var6) {
		Tile var7 = this.tiles[var4][var5][var6];
		if (var7 != null) {
			SceneTilePaint var8 = var7.paint;
			int var10;
			if (var8 != null) {
				int var18 = var8.rgb;
				if (var18 != 0) {
					for (var10 = 0; var10 < 4; ++var10) {
						var1[var2] = var18;
						var1[var2 + 1] = var18;
						var1[var2 + 2] = var18;
						var1[var2 + 3] = var18;
						var2 += var3;
					}

				}
			} else {
				SceneTileModel var9 = var7.model;
				if (var9 != null) {
					var10 = var9.shape;
					int var11 = var9.rotation;
					int var12 = var9.underlayRgb;
					int var13 = var9.overlayRgb;
					int[] var14 = this.tileShape2D[var10];
					int[] var15 = this.tileRotation2D[var11];
					int var16 = 0;
					int var17;
					if (var12 != 0) {
						for (var17 = 0; var17 < 4; ++var17) {
							var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
							var2 += var3;
						}
					} else {
						for (var17 = 0; var17 < 4; ++var17) {
							if (var14[var15[var16++]] != 0) {
								var1[var2] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 1] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 2] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 3] = var13;
							}

							var2 += var3;
						}
					}

				}
			}
		}
	}

	@ObfuscatedName("bc")
	public void method5451(int var1) {
		this.Scene_offsetOccluder = class154.method3321(25, 90, var1);
		AbstractRasterizer.method5371(this.Scene_offsetOccluder);
		if (this.field2998 != null && this.field2998.length > 0) {
			this.method5464(this.field2998, this.field2977, this.field2981, this.field2979, this.field2980);
		}

	}

	@ObfuscatedName("bv")
	boolean method5452(BitSet var1, int var2, int var3, int var4, int var5) {
		return var1.get(var5 + var4 * this.field2936 + var2 * this.field2970 + var3 * this.field2985);
	}

	@ObfuscatedName("bb")
	boolean method5524(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
		var1.set(var5 + var4 * this.field2936 + var2 * this.field2970 + var3 * this.field2985, var6);
		return var6;
	}

	@ObfuscatedName("bn")
	boolean method5632(int var1, int var2, int var3, int var4) {
		return this.method5452(this.field2982, var1, var2, var3, var4);
	}

	@ObfuscatedName("bh")
	boolean method5455(int var1, int var2, int var3, int var4, boolean var5) {
		return this.method5524(this.field2982, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("bq")
	boolean method5456(int var1, int var2, int var3, int var4) {
		return this.method5452(this.field2983, var1, var2, var3, var4);
	}

	@ObfuscatedName("bd")
	boolean method5483(int var1, int var2, int var3, int var4, boolean var5) {
		return this.method5524(this.field2983, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("bz")
	boolean method5458(BitSet var1, int var2, int var3, int var4, int var5) {
		return var1.get(var5 + var4 * this.field2992 + var3 * this.field2991 * 33489 + var2 * this.field2997);
	}

	@ObfuscatedName("bk")
	boolean method5569(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
		var1.set(var5 + var4 * this.field2992 + var3 * this.field2991 * 33489 + var2 * this.field2997, var6);
		return var6;
	}

	@ObfuscatedName("br")
	boolean method5460(int var1, int var2, int var3, int var4) {
		return this.method5458(this.field2988, var1, var2, var3, var4);
	}

	@ObfuscatedName("bf")
	boolean method5461(int var1, int var2, int var3, int var4, boolean var5) {
		return this.method5569(this.field2988, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("cf")
	boolean method5462(int var1, int var2, int var3, int var4) {
		return this.method5458(this.field2965, var1, var2, var3, var4);
	}

	@ObfuscatedName("cv")
	boolean method5463(int var1, int var2, int var3, int var4, boolean var5) {
		return this.method5569(this.field2965, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("cl")
	public void method5464(int[] var1, int var2, int var3, int var4, int var5) {
		this.field2998 = var1;
		this.field2977 = var2;
		this.field2981 = var3;
		this.field2979 = var4;
		this.field2980 = var5;
		this.field2940 = 0;
		this.field2971 = 0;
		this.field2999 = var4;
		this.field3000 = var5;
		this.field2995 = var4 / 2;
		this.field2996 = var5 / 2;
		this.field2983.set(0, this.field2983.size());
		this.field2965.set(0, this.field2965.size());
	}

	@ObfuscatedName("cm")
	@Export("visibilityMap")
	void visibilityMap(int var1, int var2) {
		this.field2968 = var1;
		this.field2994 = var2;
	}

	@ObfuscatedName("cg")
	@Export("visibleTiles")
	boolean visibleTiles(int var1, int var2) {
		if (!this.method5456(this.field2968, this.field2994, var1, var2)) {
			return this.method5632(this.field2968, this.field2994, var1, var2);
		} else {
			this.method5483(this.field2968, this.field2994, var1, var2, false);
			boolean var3 = false;

			for (int var4 = -1; var4 <= 1; ++var4) {
				for (int var5 = -1; var5 <= 1; ++var5) {
					if (this.method5480(this.field2968, this.field2994, var4 + var1 + 1, var5 + var2 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (this.method5480(this.field2968, (this.field2994 + 1) % 31, var4 + var1 + 1, var5 + var2 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (this.method5480(this.field2968 + 1, this.field2994, var4 + var1 + 1, var5 + var2 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (this.method5480(this.field2968 + 1, (this.field2994 + 1) % 31, var4 + var1 + 1, var5 + var2 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}
				}
			}

			return this.method5455(this.field2968, this.field2994, var1, var2, var3);
		}
	}

	@ObfuscatedName("cu")
	boolean method5480(int var1, int var2, int var3, int var4) {
		if (!this.method5462(var1, var2, var3, var4)) {
			return this.method5460(var1, var2, var3, var4);
		} else {
			this.method5463(var1, var2, var3, var4, false);
			int var5 = var1 * 32 + 128;
			int var6 = var2 * 64;
			int var7 = (var3 - this.Scene_offsetOccluder - 1) * 128;
			int var8 = (var4 - this.Scene_offsetOccluder - 1) * 128;

			for (int var9 = -this.field2977; var9 <= this.field2981; var9 += 128) {
				if (this.method5548(var7, var9 + this.field2998[var1], var8, var5, var6)) {
					return this.method5461(var1, var2, var3, var4, true);
				}
			}

			return this.method5461(var1, var2, var3, var4, false);
		}
	}

	@ObfuscatedName("cn")
	boolean method5548(int var1, int var2, int var3, int var4, int var5) {
		int[] var6 = Rasterizer3D.Rasterizer3D_sine;
		int[] var7 = Rasterizer3D.Rasterizer3D_cosine;
		int var8 = var6[var4];
		int var9 = var7[var4];
		int var10 = var6[var5];
		int var11 = var7[var5];
		int var12 = var11 * var1 + var3 * var10 >> 16;
		int var13 = var3 * var11 - var10 * var1 >> 16;
		int var14 = var13 * var9 + var8 * var2 >> 16;
		int var15 = var9 * var2 - var13 * var8 >> 16;
		if (var14 >= 50 && var14 <= AbstractRasterizer.method5369()) {
			int var16 = var12 * 128 / var14 + this.field2995;
			int var17 = var15 * 128 / var14 + this.field2996;
			return var16 >= this.field2940 && var16 <= this.field2999 && var17 >= this.field2971 && var17 <= this.field3000;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ce")
	@Export("menuOpen")
	public void menuOpen(int var1, int var2, int var3, boolean var4) {
		if (!this.shouldSendWalk() || var4) {
			this.checkClick = true;
			this.viewportWalking = var4;
			this.Scene_selectedPlane = var1;
			this.Scene_selectedScreenX = var2;
			this.Scene_selectedScreenY = var3;
			this.baseX = -1;
			this.baseY = -1;
		}
	}

	@ObfuscatedName("co")
	public void method5470() {
		this.viewportWalking = true;
	}

	@ObfuscatedName("ch")
	@Export("shouldSendWalk")
	public boolean shouldSendWalk() {
		return this.viewportWalking && this.baseX != -1;
	}

	@ObfuscatedName("ct")
	public void method5531() {
		this.baseX = -1;
		this.viewportWalking = false;
	}

	@ObfuscatedName("cd")
	@Export("draw")
	public void draw(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 < 0) {
			var1 = 0;
		} else if (var1 >= this.xSize * 128) {
			var1 = this.xSize * 128 - 1;
		}

		if (var3 < 0) {
			var3 = 0;
		} else if (var3 >= this.ySize * 128) {
			var3 = this.ySize * 128 - 1;
		}

		if (var4 < 128) {
			var4 = 128;
		} else if (var4 > 383) {
			var4 = 383;
		}

		this.visibilityMap((var4 - 128) / 32, var5 / 64);
		this.Scene_cameraX = var1;
		this.Scene_cameraY = var2;
		this.Scene_cameraZ = var3;
		this.Scene_cameraXTile = var1 / 128;
		this.Scene_cameraYTile = var3 / 128;
		this.Scene_plane = var6;
		IntProjection var7 = new IntProjection(var1, var2, var3, var4, var5);
		this.updateVisibleTilesAndOccluders(var7);
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(Lln;)V"
	)
	@Export("updateVisibleTilesAndOccluders")
	void updateVisibleTilesAndOccluders(Projection var1) {
		++this.Scene_drawnCount;
		this.Scene_cameraXTileMin = this.Scene_cameraXTile - this.Scene_offsetOccluder;
		if (this.Scene_cameraXTileMin < 0) {
			this.Scene_cameraXTileMin = 0;
		}

		this.Scene_cameraYTileMin = this.Scene_cameraYTile - this.Scene_offsetOccluder;
		if (this.Scene_cameraYTileMin < 0) {
			this.Scene_cameraYTileMin = 0;
		}

		this.Scene_cameraXTileMax = this.Scene_cameraXTile + this.Scene_offsetOccluder;
		if (this.Scene_cameraXTileMax > this.xSize) {
			this.Scene_cameraXTileMax = this.xSize;
		}

		this.Scene_cameraYTileMax = this.Scene_cameraYTile + this.Scene_offsetOccluder;
		if (this.Scene_cameraYTileMax > this.ySize) {
			this.Scene_cameraYTileMax = this.ySize;
		}

		if (this.worldViewId == -1) {
			this.occlude();
		}

		this.tileUpdateCount = 0;

		int var2;
		Tile[][] var3;
		int var4;
		int var5;
		for (var2 = this.minPlane; var2 < this.planes; ++var2) {
			var3 = this.tiles[var2];

			for (var4 = this.Scene_cameraXTileMin; var4 < this.Scene_cameraXTileMax; ++var4) {
				for (var5 = this.Scene_cameraYTileMin; var5 < this.Scene_cameraYTileMax; ++var5) {
					Tile var11 = var3[var4][var5];
					if (var11 != null) {
						if (var11.minPlane > this.Scene_plane || this.worldViewId == -1 && !this.visibleTiles(var4 - this.Scene_cameraXTile + this.Scene_offsetOccluder, var5 - this.Scene_cameraYTile + this.Scene_offsetOccluder) && this.tileHeights[var2][var4][var5] - this.Scene_cameraY < 2000) {
							var11.drawPrimary = false;
							var11.drawSecondary = false;
							var11.drawGameObjectEdges = 0;
						} else {
							var11.drawPrimary = true;
							var11.drawSecondary = true;
							if (var11.gameObjectsCount > 0) {
								var11.drawGameObjects = true;
							} else {
								var11.drawGameObjects = false;
							}

							++this.tileUpdateCount;
						}
					}
				}
			}
		}

		int var6;
		int var7;
		int var8;
		int var9;
		Tile var10;
		for (var2 = this.minPlane; var2 < this.planes; ++var2) {
			var3 = this.tiles[var2];

			for (var4 = -this.Scene_offsetOccluder; var4 <= 0; ++var4) {
				var5 = var4 + this.Scene_cameraXTile;
				var6 = this.Scene_cameraXTile - var4;
				if (var5 >= this.Scene_cameraXTileMin || var6 < this.Scene_cameraXTileMax) {
					for (var7 = -this.Scene_offsetOccluder; var7 <= 0; ++var7) {
						var8 = var7 + this.Scene_cameraYTile;
						var9 = this.Scene_cameraYTile - var7;
						if (var5 >= this.Scene_cameraXTileMin && var5 < this.Scene_cameraXTileMax) {
							if (var8 >= this.Scene_cameraYTileMin && var8 < this.Scene_cameraYTileMax) {
								var10 = var3[var5][var8];
								if (var10 != null && var10.drawPrimary) {
									this.drawTile(var1, var10, true);
								}
							}

							if (var9 >= this.Scene_cameraYTileMin && var9 < this.Scene_cameraYTileMax) {
								var10 = var3[var5][var9];
								if (var10 != null && var10.drawPrimary) {
									this.drawTile(var1, var10, true);
								}
							}
						}

						if (var6 >= this.Scene_cameraXTileMin && var6 < this.Scene_cameraXTileMax) {
							if (var8 >= this.Scene_cameraYTileMin && var8 < this.Scene_cameraYTileMax) {
								var10 = var3[var6][var8];
								if (var10 != null && var10.drawPrimary) {
									this.drawTile(var1, var10, true);
								}
							}

							if (var9 >= this.Scene_cameraYTileMin && var9 < this.Scene_cameraYTileMax) {
								var10 = var3[var6][var9];
								if (var10 != null && var10.drawPrimary) {
									this.drawTile(var1, var10, true);
								}
							}
						}

						if (this.tileUpdateCount == 0) {
							this.checkClick = false;
							return;
						}
					}
				}
			}
		}

		for (var2 = this.minPlane; var2 < this.planes; ++var2) {
			var3 = this.tiles[var2];

			for (var4 = -this.Scene_offsetOccluder; var4 <= 0; ++var4) {
				var5 = var4 + this.Scene_cameraXTile;
				var6 = this.Scene_cameraXTile - var4;
				if (var5 >= this.Scene_cameraXTileMin || var6 < this.Scene_cameraXTileMax) {
					for (var7 = -this.Scene_offsetOccluder; var7 <= 0; ++var7) {
						var8 = var7 + this.Scene_cameraYTile;
						var9 = this.Scene_cameraYTile - var7;
						if (var5 >= this.Scene_cameraXTileMin && var5 < this.Scene_cameraXTileMax) {
							if (var8 >= this.Scene_cameraYTileMin && var8 < this.Scene_cameraYTileMax) {
								var10 = var3[var5][var8];
								if (var10 != null && var10.drawPrimary) {
									this.drawTile(var1, var10, false);
								}
							}

							if (var9 >= this.Scene_cameraYTileMin && var9 < this.Scene_cameraYTileMax) {
								var10 = var3[var5][var9];
								if (var10 != null && var10.drawPrimary) {
									this.drawTile(var1, var10, false);
								}
							}
						}

						if (var6 >= this.Scene_cameraXTileMin && var6 < this.Scene_cameraXTileMax) {
							if (var8 >= this.Scene_cameraYTileMin && var8 < this.Scene_cameraYTileMax) {
								var10 = var3[var6][var8];
								if (var10 != null && var10.drawPrimary) {
									this.drawTile(var1, var10, false);
								}
							}

							if (var9 >= this.Scene_cameraYTileMin && var9 < this.Scene_cameraYTileMax) {
								var10 = var3[var6][var9];
								if (var10 != null && var10.drawPrimary) {
									this.drawTile(var1, var10, false);
								}
							}
						}

						if (this.tileUpdateCount == 0) {
							this.checkClick = false;
							return;
						}
					}
				}
			}
		}

		this.checkClick = false;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(Lln;Lki;Z)V"
	)
	@Export("drawTile")
	void drawTile(Projection var1, Tile var2, boolean var3) {
		this.Scene_tilesDeque.addFirst(var2);

		while (true) {
			Tile var4;
			int var5;
			int var6;
			int var7;
			int var8;
			Tile[][] var9;
			Tile var10;
			int var12;
			int var15;
			int var16;
			int var24;
			int var25;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										BoundaryObject var11;
										GameObject var13;
										int var17;
										int var18;
										int var19;
										boolean var20;
										int var21;
										Tile var36;
										while (true) {
											do {
												var4 = (Tile)this.Scene_tilesDeque.removeLast();
												if (var4 == null) {
													return;
												}
											} while(!var4.drawSecondary);

											var5 = var4.x;
											var6 = var4.y;
											var7 = var4.plane;
											var8 = var4.originalPlane;
											var9 = this.tiles[var7];
											if (!var4.drawPrimary) {
												break;
											}

											if (var3) {
												if (var7 > 0) {
													var10 = this.tiles[var7 - 1][var5][var6];
													if (var10 != null && var10.drawSecondary) {
														continue;
													}
												}

												if (var5 <= this.Scene_cameraXTile && var5 > this.Scene_cameraXTileMin) {
													var10 = var9[var5 - 1][var6];
													if (var10 != null && var10.drawSecondary && (var10.drawPrimary || (var4.gameObjectsEdgeMask & 1) == 0)) {
														continue;
													}
												}

												if (var5 >= this.Scene_cameraXTile && var5 < this.Scene_cameraXTileMax - 1) {
													var10 = var9[var5 + 1][var6];
													if (var10 != null && var10.drawSecondary && (var10.drawPrimary || (var4.gameObjectsEdgeMask & 4) == 0)) {
														continue;
													}
												}

												if (var6 <= this.Scene_cameraYTile && var6 > this.Scene_cameraYTileMin) {
													var10 = var9[var5][var6 - 1];
													if (var10 != null && var10.drawSecondary && (var10.drawPrimary || (var4.gameObjectsEdgeMask & 8) == 0)) {
														continue;
													}
												}

												if (var6 >= this.Scene_cameraYTile && var6 < this.Scene_cameraYTileMax - 1) {
													var10 = var9[var5][var6 + 1];
													if (var10 != null && var10.drawSecondary && (var10.drawPrimary || (var4.gameObjectsEdgeMask & 2) == 0)) {
														continue;
													}
												}
											} else {
												var3 = true;
											}

											var4.drawPrimary = false;
											if (var4.linkedBelowTile != null) {
												var10 = var4.linkedBelowTile;
												if (var10.paint != null) {
													if (!this.method5479(0, var5, var6)) {
														var1.drawTileUnderlay(this, var10.paint, 0, var5, var6);
													}
												} else if (var10.model != null && !this.method5479(0, var5, var6)) {
													var1.drawTileOverlay(this, var10.model, var5, var6);
												}

												var11 = var10.boundaryObject;
												if (var11 != null) {
													var1.draw(var11.renderable1, 0, var11.x * 4096, var11.z, var11.y * 64, var11.tag);
												}

												for (var12 = 0; var12 < var10.gameObjectsCount; ++var12) {
													var13 = var10.gameObjects[var12];
													if (var13 != null) {
														var1.draw(var13.renderable, var13.orientation, var13.centerX, var13.z, var13.centerY, var13.tag);
													}
												}
											}

											var20 = false;
											if (var4.paint != null) {
												if (!this.method5479(var8, var5, var6)) {
													var20 = true;
													if (var4.paint.neColor != 12345678 || this.checkClick && var7 <= this.Scene_selectedPlane) {
														var1.drawTileUnderlay(this, var4.paint, var8, var5, var6);
													}
												}
											} else if (var4.model != null && !this.method5479(var8, var5, var6)) {
												var20 = true;
												var1.drawTileOverlay(this, var4.model, var5, var6);
											}

											var21 = 0;
											var12 = 0;
											BoundaryObject var31 = var4.boundaryObject;
											WallDecoration var14 = var4.wallDecoration;
											if (var31 != null || var14 != null) {
												if (var5 == this.Scene_cameraXTile) {
													++var21;
												} else if (this.Scene_cameraXTile < var5) {
													var21 += 2;
												}

												if (var6 == this.Scene_cameraYTile) {
													var21 += 3;
												} else if (this.Scene_cameraYTile > var6) {
													var21 += 6;
												}

												var12 = field2963[var21];
												var4.field2870 = field2990[var21];
											}

											if (var31 != null) {
												if ((var31.orientationA & field2964[var21]) != 0) {
													if (var31.orientationA == 16) {
														var4.drawGameObjectEdges = 3;
														var4.field2873 = field2931[var21];
														var4.field2849 = 3 - var4.field2873;
													} else if (var31.orientationA == 32) {
														var4.drawGameObjectEdges = 6;
														var4.field2873 = field2925[var21];
														var4.field2849 = 6 - var4.field2873;
													} else if (var31.orientationA == 64) {
														var4.drawGameObjectEdges = 12;
														var4.field2873 = field2951[var21];
														var4.field2849 = 12 - var4.field2873;
													} else {
														var4.drawGameObjectEdges = 9;
														var4.field2873 = field2993[var21];
														var4.field2849 = 9 - var4.field2873;
													}
												} else {
													var4.drawGameObjectEdges = 0;
												}

												if ((var31.orientationA & var12) != 0 && !this.method5439(var8, var5, var6, var31.orientationA)) {
													var1.draw(var31.renderable1, 0, var31.x * 4096, var31.z, var31.y * 64, var31.tag);
												}

												if ((var31.orientationB & var12) != 0 && !this.method5439(var8, var5, var6, var31.orientationB)) {
													var1.draw(var31.renderable2, 0, var31.x * 4096, var31.z, var31.y * 64, var31.tag);
												}
											}

											if (var14 != null && !this.method5481(var8, var5, var6, var14.renderable1.height)) {
												if ((var14.orientation & var12) != 0) {
													var1.draw(var14.renderable1, 0, var14.x * 64 + var14.xOffset, var14.z, var14.y * 64 + var14.yOffset, var14.tag);
												} else if (var14.orientation == 256) {
													var15 = var14.x * 64 - this.Scene_cameraX;
													var16 = var14.y * 64 - this.Scene_cameraZ;
													var17 = var14.orientation2;
													if (var17 != 1 && var17 != 2) {
														var18 = var15;
													} else {
														var18 = -var15;
													}

													if (var17 != 2 && var17 != 3) {
														var19 = var16;
													} else {
														var19 = -var16;
													}

													if (var19 < var18) {
														var1.draw(var14.renderable1, 0, var14.x * 64 + var14.xOffset, var14.z, var14.y * 64 + var14.yOffset, var14.tag);
													} else if (var14.renderable2 != null) {
														var1.draw(var14.renderable2, 0, var14.x * 64, var14.z, var14.y * 64, var14.tag);
													}
												}
											}

											if (var20) {
												FloorDecoration var22 = var4.floorDecoration;
												if (var22 != null) {
													var1.draw(var22.renderable, 0, var22.x * 4096, var22.z, var22.y * 64, var22.tag);
												}

												ItemLayer var23 = var4.itemLayer;
												if (var23 != null && var23.height == 0) {
													if (var23.second != null) {
														var1.draw(var23.second, 0, var23.x * 4096, var23.z, var23.y * 64, var23.tag);
													}

													if (var23.third != null) {
														var1.draw(var23.third, 0, var23.x * 4096, var23.z, var23.y * 64, var23.tag);
													}

													if (var23.first != null) {
														var1.draw(var23.first, 0, var23.x * 4096, var23.z, var23.y * 64, var23.tag);
													}
												}
											}

											var15 = var4.gameObjectsEdgeMask;
											if (var15 != 0) {
												if (var5 < this.Scene_cameraXTile && var5 >= this.Scene_cameraXTileMin && var5 < this.Scene_cameraXTileMax - 1 && (var15 & 4) != 0) {
													var36 = var9[var5 + 1][var6];
													if (var36 != null && var36.drawSecondary) {
														this.Scene_tilesDeque.addFirst(var36);
													}
												}

												if (var6 < this.Scene_cameraYTile && var6 >= this.Scene_cameraYTileMin && var6 < this.Scene_cameraYTileMax - 1 && (var15 & 2) != 0) {
													var36 = var9[var5][var6 + 1];
													if (var36 != null && var36.drawSecondary) {
														this.Scene_tilesDeque.addFirst(var36);
													}
												}

												if (var5 > this.Scene_cameraXTile && var5 > this.Scene_cameraXTileMin && var5 < this.Scene_cameraXTileMax && (var15 & 1) != 0) {
													var36 = var9[var5 - 1][var6];
													if (var36 != null && var36.drawSecondary) {
														this.Scene_tilesDeque.addFirst(var36);
													}
												}

												if (var6 > this.Scene_cameraYTile && var6 > this.Scene_cameraYTileMin && var6 < this.Scene_cameraYTileMax && (var15 & 8) != 0) {
													var36 = var9[var5][var6 - 1];
													if (var36 != null && var36.drawSecondary) {
														this.Scene_tilesDeque.addFirst(var36);
													}
												}
											}
											break;
										}

										if (var4.drawGameObjectEdges != 0) {
											var20 = true;

											for (var21 = 0; var21 < var4.gameObjectsCount; ++var21) {
												if (var4.gameObjects[var21].lastDrawn != this.Scene_drawnCount && (var4.gameObjectEdgeMasks[var21] & var4.drawGameObjectEdges) == var4.field2873) {
													var20 = false;
													break;
												}
											}

											if (var20) {
												var11 = var4.boundaryObject;
												if (!this.method5439(var8, var5, var6, var11.orientationA)) {
													var1.draw(var11.renderable1, 0, var11.x * 4096, var11.z, var11.y * 64, var11.tag);
												}

												var4.drawGameObjectEdges = 0;
											}
										}

										if (!var4.drawGameObjects) {
											break;
										}

										try {
											int var34 = var4.gameObjectsCount;
											var4.drawGameObjects = false;
											var21 = 0;

											label595:
											for (var12 = 0; var12 < var34; ++var12) {
												var13 = var4.gameObjects[var12];
												if (var13.lastDrawn != this.Scene_drawnCount) {
													for (var24 = var13.startX; var24 <= var13.endX; ++var24) {
														for (var15 = var13.startY; var15 <= var13.endY; ++var15) {
															var36 = var9[var24][var15];
															if (var36.drawPrimary) {
																var4.drawGameObjects = true;
																continue label595;
															}

															if (var36.drawGameObjectEdges != 0) {
																var17 = 0;
																if (var24 > var13.startX) {
																	++var17;
																}

																if (var24 < var13.endX) {
																	var17 += 4;
																}

																if (var15 > var13.startY) {
																	var17 += 8;
																}

																if (var15 < var13.endY) {
																	var17 += 2;
																}

																if ((var17 & var36.drawGameObjectEdges) == var4.field2849) {
																	var4.drawGameObjects = true;
																	continue label595;
																}
															}
														}
													}

													this.gameObjects[var21++] = var13;
													var24 = this.Scene_cameraXTile - var13.startX;
													var15 = var13.endX - this.Scene_cameraXTile;
													if (var15 > var24) {
														var24 = var15;
													}

													var16 = this.Scene_cameraYTile - var13.startY;
													var17 = var13.endY - this.Scene_cameraYTile;
													if (var17 > var16) {
														var13.field3235 = var24 + var17;
													} else {
														var13.field3235 = var24 + var16;
													}
												}
											}

											while (var21 > 0) {
												var12 = -50;
												var25 = -1;

												for (var24 = 0; var24 < var21; ++var24) {
													GameObject var35 = this.gameObjects[var24];
													if (var35.lastDrawn != this.Scene_drawnCount) {
														if (var35.field3235 > var12) {
															var12 = var35.field3235;
															var25 = var24;
														} else if (var12 == var35.field3235) {
															var16 = var35.centerX - this.Scene_cameraX;
															var17 = var35.centerY - this.Scene_cameraZ;
															var18 = this.gameObjects[var25].centerX - this.Scene_cameraX;
															var19 = this.gameObjects[var25].centerY - this.Scene_cameraZ;
															if (var16 * var16 + var17 * var17 > var18 * var18 + var19 * var19) {
																var25 = var24;
															}
														}
													}
												}

												if (var25 == -1) {
													break;
												}

												GameObject var33 = this.gameObjects[var25];
												var33.lastDrawn = this.Scene_drawnCount;
												if (!this.method5503(var8, var33.startX, var33.endX, var33.startY, var33.endY, var33.renderable.height)) {
													var1.draw(var33.renderable, var33.orientation, var33.centerX, var33.z, var33.centerY, var33.tag);
												}

												for (var15 = var33.startX; var15 <= var33.endX; ++var15) {
													for (var16 = var33.startY; var16 <= var33.endY; ++var16) {
														Tile var26 = var9[var15][var16];
														if (var26.drawGameObjectEdges != 0) {
															this.Scene_tilesDeque.addFirst(var26);
														} else if ((var15 != var5 || var16 != var6) && var26.drawSecondary) {
															this.Scene_tilesDeque.addFirst(var26);
														}
													}
												}
											}

											if (!var4.drawGameObjects) {
												break;
											}
										} catch (Exception var28) {
											var4.drawGameObjects = false;
											break;
										}
									}
								} while(!var4.drawSecondary);
							} while(var4.drawGameObjectEdges != 0);

							if (var5 > this.Scene_cameraXTile || var5 <= this.Scene_cameraXTileMin) {
								break;
							}

							var10 = var9[var5 - 1][var6];
						} while(var10 != null && var10.drawSecondary);

						if (var5 < this.Scene_cameraXTile || var5 >= this.Scene_cameraXTileMax - 1) {
							break;
						}

						var10 = var9[var5 + 1][var6];
					} while(var10 != null && var10.drawSecondary);

					if (var6 > this.Scene_cameraYTile || var6 <= this.Scene_cameraYTileMin) {
						break;
					}

					var10 = var9[var5][var6 - 1];
				} while(var10 != null && var10.drawSecondary);

				if (var6 < this.Scene_cameraYTile || var6 >= this.Scene_cameraYTileMax - 1) {
					break;
				}

				var10 = var9[var5][var6 + 1];
			} while(var10 != null && var10.drawSecondary);

			var4.drawSecondary = false;
			--this.tileUpdateCount;
			ItemLayer var32 = var4.itemLayer;
			if (var32 != null && var32.height != 0) {
				if (var32.second != null) {
					var1.draw(var32.second, 0, var32.x * 4096, var32.z - var32.height, var32.y * 64, var32.tag);
				}

				if (var32.third != null) {
					var1.draw(var32.third, 0, var32.x * 4096, var32.z - var32.height, var32.y * 64, var32.tag);
				}

				if (var32.first != null) {
					var1.draw(var32.first, 0, var32.x * 4096, var32.z - var32.height, var32.y * 64, var32.tag);
				}
			}

			if (var4.field2870 != 0) {
				WallDecoration var29 = var4.wallDecoration;
				if (var29 != null && !this.method5481(var8, var5, var6, var29.renderable1.height)) {
					if ((var29.orientation & var4.field2870) != 0) {
						var1.draw(var29.renderable1, 0, var29.x * 64 + var29.xOffset, var29.z, var29.y * 64 + var29.yOffset, var29.tag);
					} else if (var29.orientation == 256) {
						var12 = var29.x * 64 - this.Scene_cameraX;
						var25 = var29.y * 64 - this.Scene_cameraZ;
						var24 = var29.orientation2;
						if (var24 != 1 && var24 != 2) {
							var15 = var12;
						} else {
							var15 = -var12;
						}

						if (var24 != 2 && var24 != 3) {
							var16 = var25;
						} else {
							var16 = -var25;
						}

						if (var16 >= var15) {
							var1.draw(var29.renderable1, 0, var29.x * 64 + var29.xOffset, var29.z, var29.y * 64 + var29.yOffset, var29.tag);
						} else if (var29.renderable2 != null) {
							var1.draw(var29.renderable2, 0, var29.x * 64, var29.z, var29.y * 64, var29.tag);
						}
					}
				}

				BoundaryObject var27 = var4.boundaryObject;
				if (var27 != null) {
					if ((var27.orientationB & var4.field2870) != 0 && !this.method5439(var8, var5, var6, var27.orientationB)) {
						var1.draw(var27.renderable2, 0, var27.x * 4096, var27.z, var27.y * 64, var27.tag);
					}

					if ((var27.orientationA & var4.field2870) != 0 && !this.method5439(var8, var5, var6, var27.orientationA)) {
						var1.draw(var27.renderable1, 0, var27.x * 4096, var27.z, var27.y * 64, var27.tag);
					}
				}
			}

			Tile var30;
			if (var7 < this.planes - 1) {
				var30 = this.tiles[var7 + 1][var5][var6];
				if (var30 != null && var30.drawSecondary) {
					this.Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var5 < this.Scene_cameraXTile && var5 >= this.Scene_cameraXTileMin && var5 < this.Scene_cameraXTileMax - 1) {
				var30 = var9[var5 + 1][var6];
				if (var30 != null && var30.drawSecondary) {
					this.Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var6 < this.Scene_cameraYTile && var6 >= this.Scene_cameraYTileMin && var6 < this.Scene_cameraYTileMax - 1) {
				var30 = var9[var5][var6 + 1];
				if (var30 != null && var30.drawSecondary) {
					this.Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var5 > this.Scene_cameraXTile && var5 > this.Scene_cameraXTileMin && var5 < this.Scene_cameraXTileMax) {
				var30 = var9[var5 - 1][var6];
				if (var30 != null && var30.drawSecondary) {
					this.Scene_tilesDeque.addFirst(var30);
				}
			}

			if (var6 > this.Scene_cameraYTile && var6 > this.Scene_cameraYTileMin && var6 < this.Scene_cameraYTileMax) {
				var30 = var9[var5][var6 - 1];
				if (var30 != null && var30.drawSecondary) {
					this.Scene_tilesDeque.addFirst(var30);
				}
			}
		}
	}

	@ObfuscatedName("cy")
	@Export("occlude")
	void occlude() {
		int var1 = this.Scene_planeOccluderCounts[this.Scene_plane];
		Occluder[] var2 = this.Scene_planeOccluders[this.Scene_plane];
		this.Scene_currentOccludersCount = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			Occluder var4 = var2[var3];
			int var5;
			int var6;
			int var7;
			int var9;
			boolean var13;
			if (var4.type == 1) {
				var5 = var4.minTileX - this.Scene_cameraXTile + this.Scene_offsetOccluder;
				if (var5 >= 0 && var5 <= this.Scene_offsetOccluder + this.Scene_offsetOccluder) {
					var6 = var4.minTileY - this.Scene_cameraYTile + this.Scene_offsetOccluder;
					if (var6 < 0) {
						var6 = 0;
					}

					var7 = var4.maxTileY - this.Scene_cameraYTile + this.Scene_offsetOccluder;
					if (var7 > this.Scene_offsetOccluder + this.Scene_offsetOccluder) {
						var7 = this.Scene_offsetOccluder + this.Scene_offsetOccluder;
					}

					var13 = false;

					while (var6 <= var7) {
						if (this.visibleTiles(var5, var6++)) {
							var13 = true;
							break;
						}
					}

					if (var13) {
						var9 = this.Scene_cameraX - var4.minX;
						if (var9 > 32) {
							var4.field3039 = 1;
						} else {
							if (var9 >= -32) {
								continue;
							}

							var4.field3039 = 2;
							var9 = -var9;
						}

						var4.field3044 = (var4.minZ - this.Scene_cameraZ << 8) / var9;
						var4.field3031 = (var4.maxZ - this.Scene_cameraZ << 8) / var9;
						var4.field3032 = (var4.minY - this.Scene_cameraY << 8) / var9;
						var4.field3045 = (var4.maxY - this.Scene_cameraY << 8) / var9;
						this.Scene_currentOccluders[this.Scene_currentOccludersCount++] = var4;
					}
				}
			} else if (var4.type == 2) {
				var5 = var4.minTileY - this.Scene_cameraYTile + this.Scene_offsetOccluder;
				if (var5 >= 0 && var5 <= this.Scene_offsetOccluder + this.Scene_offsetOccluder) {
					var6 = var4.minTileX - this.Scene_cameraXTile + this.Scene_offsetOccluder;
					if (var6 < 0) {
						var6 = 0;
					}

					var7 = var4.maxTileX - this.Scene_cameraXTile + this.Scene_offsetOccluder;
					if (var7 > this.Scene_offsetOccluder + this.Scene_offsetOccluder) {
						var7 = this.Scene_offsetOccluder + this.Scene_offsetOccluder;
					}

					var13 = false;

					while (var6 <= var7) {
						if (this.visibleTiles(var6++, var5)) {
							var13 = true;
							break;
						}
					}

					if (var13) {
						var9 = this.Scene_cameraZ - var4.minZ;
						if (var9 > 32) {
							var4.field3039 = 3;
						} else {
							if (var9 >= -32) {
								continue;
							}

							var4.field3039 = 4;
							var9 = -var9;
						}

						var4.field3043 = (var4.minX - this.Scene_cameraX << 8) / var9;
						var4.field3041 = (var4.maxX - this.Scene_cameraX << 8) / var9;
						var4.field3032 = (var4.minY - this.Scene_cameraY << 8) / var9;
						var4.field3045 = (var4.maxY - this.Scene_cameraY << 8) / var9;
						this.Scene_currentOccluders[this.Scene_currentOccludersCount++] = var4;
					}
				}
			} else if (var4.type == 4) {
				var5 = var4.minY - this.Scene_cameraY;
				if (var5 > 128) {
					var6 = var4.minTileY - this.Scene_cameraYTile + this.Scene_offsetOccluder;
					if (var6 < 0) {
						var6 = 0;
					}

					var7 = var4.maxTileY - this.Scene_cameraYTile + this.Scene_offsetOccluder;
					if (var7 > this.Scene_offsetOccluder + this.Scene_offsetOccluder) {
						var7 = this.Scene_offsetOccluder + this.Scene_offsetOccluder;
					}

					if (var6 <= var7) {
						int var8 = var4.minTileX - this.Scene_cameraXTile + this.Scene_offsetOccluder;
						if (var8 < 0) {
							var8 = 0;
						}

						var9 = var4.maxTileX - this.Scene_cameraXTile + this.Scene_offsetOccluder;
						if (var9 > this.Scene_offsetOccluder + this.Scene_offsetOccluder) {
							var9 = this.Scene_offsetOccluder + this.Scene_offsetOccluder;
						}

						boolean var10 = false;

						label148:
						for (int var11 = var8; var11 <= var9; ++var11) {
							for (int var12 = var6; var12 <= var7; ++var12) {
								if (this.visibleTiles(var11, var12)) {
									var10 = true;
									break label148;
								}
							}
						}

						if (var10) {
							var4.field3039 = 5;
							var4.field3043 = (var4.minX - this.Scene_cameraX << 8) / var5;
							var4.field3041 = (var4.maxX - this.Scene_cameraX << 8) / var5;
							var4.field3044 = (var4.minZ - this.Scene_cameraZ << 8) / var5;
							var4.field3031 = (var4.maxZ - this.Scene_cameraZ << 8) / var5;
							this.Scene_currentOccluders[this.Scene_currentOccludersCount++] = var4;
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("cw")
	boolean method5479(int var1, int var2, int var3) {
		int var4 = this.field2928[var1][var2][var3];
		if (var4 == -this.Scene_drawnCount) {
			return false;
		} else if (var4 == this.Scene_drawnCount) {
			return true;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			if (this.method5553(var5 + 1, this.tileHeights[var1][var2][var3], var6 + 1) && this.method5553(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3], var6 + 1) && this.method5553(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method5553(var5 + 1, this.tileHeights[var1][var2][var3 + 1], var6 + 128 - 1)) {
				this.field2928[var1][var2][var3] = this.Scene_drawnCount;
				return true;
			} else {
				this.field2928[var1][var2][var3] = -this.Scene_drawnCount;
				return false;
			}
		}
	}

	@ObfuscatedName("ci")
	boolean method5439(int var1, int var2, int var3, int var4) {
		if (!this.method5479(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			int var7 = this.tileHeights[var1][var2][var3] - 1;
			int var8 = var7 - 120;
			int var9 = var7 - 230;
			int var10 = var7 - 238;
			if (var4 < 16) {
				if (var4 == 1) {
					if (var5 > this.Scene_cameraX) {
						if (!this.method5553(var5, var7, var6)) {
							return false;
						}

						if (!this.method5553(var5, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method5553(var5, var8, var6)) {
							return false;
						}

						if (!this.method5553(var5, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.method5553(var5, var9, var6)) {
						return false;
					}

					if (!this.method5553(var5, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 2) {
					if (var6 < this.Scene_cameraZ) {
						if (!this.method5553(var5, var7, var6 + 128)) {
							return false;
						}

						if (!this.method5553(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method5553(var5, var8, var6 + 128)) {
							return false;
						}

						if (!this.method5553(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.method5553(var5, var9, var6 + 128)) {
						return false;
					}

					if (!this.method5553(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 4) {
					if (var5 < this.Scene_cameraX) {
						if (!this.method5553(var5 + 128, var7, var6)) {
							return false;
						}

						if (!this.method5553(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method5553(var5 + 128, var8, var6)) {
							return false;
						}

						if (!this.method5553(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.method5553(var5 + 128, var9, var6)) {
						return false;
					}

					if (!this.method5553(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 8) {
					if (var6 > this.Scene_cameraZ) {
						if (!this.method5553(var5, var7, var6)) {
							return false;
						}

						if (!this.method5553(var5 + 128, var7, var6)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method5553(var5, var8, var6)) {
							return false;
						}

						if (!this.method5553(var5 + 128, var8, var6)) {
							return false;
						}
					}

					if (!this.method5553(var5, var9, var6)) {
						return false;
					}

					if (!this.method5553(var5 + 128, var9, var6)) {
						return false;
					}

					return true;
				}
			}

			if (!this.method5553(var5 + 64, var10, var6 + 64)) {
				return false;
			} else if (var4 == 16) {
				return this.method5553(var5, var9, var6 + 128);
			} else if (var4 == 32) {
				return this.method5553(var5 + 128, var9, var6 + 128);
			} else if (var4 == 64) {
				return this.method5553(var5 + 128, var9, var6);
			} else if (var4 == 128) {
				return this.method5553(var5, var9, var6);
			} else {
				return true;
			}
		}
	}

	@ObfuscatedName("cc")
	boolean method5481(int var1, int var2, int var3, int var4) {
		if (!this.method5479(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			return this.method5553(var5 + 1, this.tileHeights[var1][var2][var3] - var4, var6 + 1) && this.method5553(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3] - var4, var6 + 1) && this.method5553(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method5553(var5 + 1, this.tileHeights[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
		}
	}

	@ObfuscatedName("cr")
	boolean method5503(int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		int var8;
		if (var3 == var2 && var5 == var4) {
			if (!this.method5479(var1, var2, var4)) {
				return false;
			} else {
				var7 = var2 << 7;
				var8 = var4 << 7;
				return this.method5553(var7 + 1, this.tileHeights[var1][var2][var4] - var6, var8 + 1) && this.method5553(var7 + 128 - 1, this.tileHeights[var1][var2 + 1][var4] - var6, var8 + 1) && this.method5553(var7 + 128 - 1, this.tileHeights[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method5553(var7 + 1, this.tileHeights[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
			}
		} else {
			for (var7 = var2; var7 <= var3; ++var7) {
				for (var8 = var4; var8 <= var5; ++var8) {
					if (this.field2928[var1][var7][var8] == -this.Scene_drawnCount) {
						return false;
					}
				}
			}

			var7 = (var2 << 7) + 1;
			var8 = (var4 << 7) + 2;
			int var9 = this.tileHeights[var1][var2][var4] - var6;
			if (!this.method5553(var7, var9, var8)) {
				return false;
			} else {
				int var10 = (var3 << 7) - 1;
				if (!this.method5553(var10, var9, var8)) {
					return false;
				} else {
					int var11 = (var5 << 7) - 1;
					if (!this.method5553(var7, var9, var11)) {
						return false;
					} else if (!this.method5553(var10, var9, var11)) {
						return false;
					} else {
						return true;
					}
				}
			}
		}
	}

	@ObfuscatedName("cb")
	boolean method5553(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.Scene_currentOccludersCount; ++var4) {
			Occluder var5 = this.Scene_currentOccluders[var4];
			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			if (var5.field3039 == 1) {
				var6 = var5.minX - var1;
				if (var6 > 0) {
					var7 = (var6 * var5.field3044 >> 8) + var5.minZ;
					var8 = (var6 * var5.field3031 >> 8) + var5.maxZ;
					var9 = (var6 * var5.field3032 >> 8) + var5.minY;
					var10 = (var6 * var5.field3045 >> 8) + var5.maxY;
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field3039 == 2) {
				var6 = var1 - var5.minX;
				if (var6 > 0) {
					var7 = (var6 * var5.field3044 >> 8) + var5.minZ;
					var8 = (var6 * var5.field3031 >> 8) + var5.maxZ;
					var9 = (var6 * var5.field3032 >> 8) + var5.minY;
					var10 = (var6 * var5.field3045 >> 8) + var5.maxY;
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field3039 == 3) {
				var6 = var5.minZ - var3;
				if (var6 > 0) {
					var7 = (var6 * var5.field3043 >> 8) + var5.minX;
					var8 = (var6 * var5.field3041 >> 8) + var5.maxX;
					var9 = (var6 * var5.field3032 >> 8) + var5.minY;
					var10 = (var6 * var5.field3045 >> 8) + var5.maxY;
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field3039 == 4) {
				var6 = var3 - var5.minZ;
				if (var6 > 0) {
					var7 = (var6 * var5.field3043 >> 8) + var5.minX;
					var8 = (var6 * var5.field3041 >> 8) + var5.maxX;
					var9 = (var6 * var5.field3032 >> 8) + var5.minY;
					var10 = (var6 * var5.field3045 >> 8) + var5.maxY;
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field3039 == 5) {
				var6 = var2 - var5.minY;
				if (var6 > 0) {
					var7 = (var6 * var5.field3043 >> 8) + var5.minX;
					var8 = (var6 * var5.field3041 >> 8) + var5.maxX;
					var9 = (var6 * var5.field3044 >> 8) + var5.minZ;
					var10 = (var6 * var5.field3031 >> 8) + var5.maxZ;
					if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
						return true;
					}
				}
			}
		}

		return false;
	}

	@ObfuscatedName("eh")
	void vmethod5778(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10) {
		class425 var12 = new class425();
		var12.method7861((float)((double)(-var2) * 0.0030679615D));
		var12.method7871((float)((double)(-var3) * 0.0030679615D));
		var12.method7864((float)var7, (float)var8, (float)var9);
		class424 var13 = new class424();
		var13.method7788(var12);
		var13.method7790();
		int var14 = this.field2966 % 300;
		float var15 = (float)var14 / 300.0F * 6.283F;
		float var16 = (float)Math.sin((double)var15);
		float var17 = (float)Math.cos((double)var15);
		float var18 = var16 * 3.14159F / 100.0F;
		float var19 = var17 * 3.14159F / 100.0F;
		class418 var20 = new class418();
		class424 var21 = new class424();
		var20.field4681 = new class423((float)((double)var1 * 0.0030679615D), var18, var19);
		var20.field4682 = new class422((float)var4, (float)var5, (float)var6);
		class424 var22 = new class424();
		var22.method7786(var20);
		var22.method7790();
		class418 var23 = new class418();
		var23.field4682 = new class422((float)(-(this.xSize * 64)), 0.0F, (float)(-(this.ySize * 64)));
		class424 var24 = new class424();
		var24.method7786(var23);
		var21.method7791(1.0F, 1.0F, 1.0F, 1.0F);
		var24.method7785(var21);
		var21.method7786(var20);
		var24.method7785(var21);
		var24.method7785(var13);
		this.Scene_cameraX = (int)var22.method7784((float)var7, (float)var8, (float)var9);
		this.Scene_cameraY = (int)var22.method7853((float)var7, (float)var8, (float)var9);
		this.Scene_cameraZ = (int)var22.method7795((float)var7, (float)var8, (float)var9);
		this.Scene_cameraXTile = this.Scene_cameraX / 128;
		this.Scene_cameraYTile = this.Scene_cameraZ / 128;
		TilesProjection var25 = new TilesProjection(var24);
		this.updateVisibleTilesAndOccluders(var25);
	}

	@ObfuscatedName("cs")
	static final int method5643(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	@ObfuscatedName("cp")
	@Export("containsBounds")
	static boolean containsBounds(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var1 < var2 && var1 < var3 && var1 < var4) {
			return false;
		} else if (var1 > var2 && var1 > var3 && var1 > var4) {
			return false;
		} else if (var0 < var5 && var0 < var6 && var0 < var7) {
			return false;
		} else if (var0 > var5 && var0 > var6 && var0 > var7) {
			return false;
		} else {
			int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
			int var9 = (var7 - var6) * (var1 - var3) - (var0 - var6) * (var4 - var3);
			int var10 = (var5 - var7) * (var1 - var4) - (var2 - var4) * (var0 - var7);
			if (var8 == 0) {
				if (var9 != 0) {
					return var9 < 0 ? var10 <= 0 : var10 >= 0;
				} else {
					return true;
				}
			} else {
				return var8 < 0 ? var9 <= 0 && var10 <= 0 : var9 >= 0 && var10 >= 0;
			}
		}
	}
}
