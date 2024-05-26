import java.util.BitSet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jy")
@Implements("Scene")
public class Scene extends Renderable {
	@ObfuscatedName("al")
	@Export("Scene_isLowDetail")
	public static boolean Scene_isLowDetail;
	@ObfuscatedName("bj")
	static final int[] field2751;
	@ObfuscatedName("bc")
	static final int[] field2726;
	@ObfuscatedName("bz")
	static final int[] field2753;
	@ObfuscatedName("ba")
	static final int[] field2754;
	@ObfuscatedName("bb")
	static final int[] field2755;
	@ObfuscatedName("by")
	static final int[] field2756;
	@ObfuscatedName("cw")
	static final int[] field2757;
	@ObfuscatedName("ak")
	@Export("worldViewId")
	final int worldViewId;
	@ObfuscatedName("aj")
	public int field2707;
	@ObfuscatedName("az")
	@Export("planes")
	int planes;
	@ObfuscatedName("af")
	@Export("xSize")
	int xSize;
	@ObfuscatedName("aa")
	@Export("ySize")
	int ySize;
	@ObfuscatedName("at")
	@Export("tileHeights")
	int[][][] tileHeights;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[[[Ljz;"
	)
	@Export("tiles")
	Tile[][][] tiles;
	@ObfuscatedName("ac")
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ao")
	@Export("tempGameObjectsCount")
	int tempGameObjectsCount;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lkf;"
	)
	@Export("tempGameObjects")
	GameObject[] tempGameObjects;
	@ObfuscatedName("av")
	int[][][] field2716;
	@ObfuscatedName("au")
	@Export("Scene_offsetOccluder")
	int Scene_offsetOccluder;
	@ObfuscatedName("as")
	@Export("tileUpdateCount")
	int tileUpdateCount;
	@ObfuscatedName("aw")
	@Export("Scene_plane")
	public int Scene_plane;
	@ObfuscatedName("ad")
	@Export("Scene_drawnCount")
	int Scene_drawnCount;
	@ObfuscatedName("ai")
	@Export("Scene_cameraXTileMin")
	int Scene_cameraXTileMin;
	@ObfuscatedName("an")
	@Export("Scene_cameraXTileMax")
	int Scene_cameraXTileMax;
	@ObfuscatedName("am")
	@Export("Scene_cameraYTileMin")
	int Scene_cameraYTileMin;
	@ObfuscatedName("ar")
	@Export("Scene_cameraYTileMax")
	int Scene_cameraYTileMax;
	@ObfuscatedName("ag")
	@Export("Scene_cameraXTile")
	int Scene_cameraXTile;
	@ObfuscatedName("bs")
	@Export("Scene_cameraYTile")
	int Scene_cameraYTile;
	@ObfuscatedName("bf")
	@Export("Scene_cameraX")
	int Scene_cameraX;
	@ObfuscatedName("bo")
	@Export("Scene_cameraY")
	int Scene_cameraY;
	@ObfuscatedName("bi")
	@Export("Scene_cameraZ")
	int Scene_cameraZ;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "[Lkf;"
	)
	@Export("gameObjects")
	GameObject[] gameObjects;
	@ObfuscatedName("bn")
	@Export("checkClick")
	boolean checkClick;
	@ObfuscatedName("bw")
	@Export("Scene_selectedPlane")
	int Scene_selectedPlane;
	@ObfuscatedName("bl")
	@Export("Scene_selectedScreenX")
	int Scene_selectedScreenX;
	@ObfuscatedName("be")
	@Export("Scene_selectedScreenY")
	int Scene_selectedScreenY;
	@ObfuscatedName("bg")
	@Export("baseX")
	public int baseX;
	@ObfuscatedName("bu")
	@Export("baseY")
	public int baseY;
	@ObfuscatedName("bh")
	@Export("viewportWalking")
	boolean viewportWalking;
	@ObfuscatedName("br")
	@Export("scenePlanesCount")
	int scenePlanesCount;
	@ObfuscatedName("bx")
	@Export("Scene_planeOccluderCounts")
	int[] Scene_planeOccluderCounts;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "[[Ljf;"
	)
	@Export("Scene_planeOccluders")
	Occluder[][] Scene_planeOccluders;
	@ObfuscatedName("bv")
	@Export("Scene_currentOccludersCount")
	int Scene_currentOccludersCount8;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "[Ljf;"
	)
	@Export("Scene_currentOccluders")
	Occluder[] Scene_currentOccluders;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	@Export("Scene_tilesDeque")
	NodeDeque Scene_tilesDeque;
	@ObfuscatedName("cd")
	@Export("tileShape2D")
	int[][] tileShape2D;
	@ObfuscatedName("cs")
	@Export("tileRotation2D")
	int[][] tileRotation2D;
	@ObfuscatedName("cm")
	int[] field2764;
	@ObfuscatedName("ci")
	int field2736;
	@ObfuscatedName("cc")
	int field2724;
	@ObfuscatedName("cb")
	int field2765;
	@ObfuscatedName("cr")
	int field2758;
	@ObfuscatedName("co")
	final int field2769;
	@ObfuscatedName("cf")
	BitSet field2770;
	@ObfuscatedName("ce")
	BitSet field2771;
	@ObfuscatedName("cz")
	final int field2772;
	@ObfuscatedName("ca")
	final int field2773;
	@ObfuscatedName("cl")
	final int field2774;
	@ObfuscatedName("cq")
	final int field2775;
	@ObfuscatedName("cy")
	BitSet field2776;
	@ObfuscatedName("ct")
	BitSet field2777;
	@ObfuscatedName("cg")
	final int field2781;
	@ObfuscatedName("cv")
	final int field2779;
	@ObfuscatedName("cj")
	final int field2780;
	@ObfuscatedName("cu")
	int field2767;
	@ObfuscatedName("cx")
	int field2782;
	@ObfuscatedName("dj")
	int field2783;
	@ObfuscatedName("dq")
	int field2784;
	@ObfuscatedName("dm")
	int field2785;
	@ObfuscatedName("dr")
	int field2786;
	@ObfuscatedName("db")
	int field2787;
	@ObfuscatedName("do")
	int field2788;

	static {
		Scene_isLowDetail = false;
		field2751 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
		field2726 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
		field2753 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
		field2754 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
		field2755 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
		field2756 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
		field2757 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
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
		this.Scene_currentOccludersCount8 = 0;
		this.Scene_currentOccluders = new Occluder[500];
		this.Scene_tilesDeque = new NodeDeque();
		this.tileShape2D = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
		this.tileRotation2D = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
		this.field2764 = new int[9];
		this.planes = var2;
		this.xSize = var3;
		this.ySize = var4;
		this.tiles = new Tile[var2][var3][var4];
		this.field2716 = new int[var2][var3 + 1][var4 + 1];
		this.tileHeights = var6;
		this.Scene_offsetOccluder = var5;
		this.worldViewId = var1;
		if (var1 != -1) {
			this.field2769 = 0;
			this.field2770 = null;
			this.field2771 = null;
			this.field2772 = 0;
			this.field2773 = 0;
			this.field2774 = 0;
			this.field2775 = 0;
			this.field2776 = null;
			this.field2777 = null;
			this.field2781 = 0;
			this.field2779 = 0;
			this.field2780 = 0;
		} else {
			this.field2769 = 8386816;
			this.field2770 = new BitSet(this.field2769);
			this.field2771 = new BitSet(this.field2769);
			this.field2772 = 1048352;
			this.field2773 = 32761;
			this.field2774 = 181;
			this.field2775 = 9644832;
			this.field2776 = new BitSet(this.field2775);
			this.field2777 = new BitSet(this.field2775);
			this.field2781 = 1071648;
			this.field2779 = 33489;
			this.field2780 = 183;
		}

		AbstractRasterizer.method4828(var5);
		this.clearTempGameObjects();
	}

	@ObfuscatedName("ak")
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

	@ObfuscatedName("al")
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

	@ObfuscatedName("aj")
	@Export("setLinkBelow")
	public void setLinkBelow(int var1, int var2) {
		Tile var3 = this.tiles[0][var1][var2];

		for (int var4 = 0; var4 < 3; ++var4) {
			Tile var5 = this.tiles[var4][var1][var2] = this.tiles[var4 + 1][var1][var2];
			if (var5 != null) {
				--var5.plane;

				for (int var6 = 0; var6 < var5.gameObjectsCount; ++var6) {
					GameObject var7 = var5.gameObjects[var6];
					if (Clock.method3771(var7.tag) && var7.startX == var1 && var2 == var7.startY) {
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

	@ObfuscatedName("az")
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

	@ObfuscatedName("af")
	@Export("setTileMinPlane")
	public void setTileMinPlane(int var1, int var2, int var3, int var4) {
		Tile var5 = this.tiles[var1][var2][var3];
		if (var5 != null) {
			this.tiles[var1][var2][var3].minPlane = var4;
		}
	}

	@ObfuscatedName("aa")
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIILju;JI)V"
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIILju;JLju;Lju;)V"
	)
	@Export("newGroundItemPile")
	public void newGroundItemPile(int var1, int var2, int var3, int var4, Renderable var5, long var6, Renderable var8, Renderable var9) {
		ItemLayer var10 = new ItemLayer();
		var10.first = var5;
		var10.x = var2 * 128 + 64;
		var10.y = var3 * 128 + 64;
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIILju;Lju;IIJI)V"
	)
	@Export("newBoundaryObject")
	public void newBoundaryObject(int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, long var9, int var11) {
		if (var5 != null || var6 != null) {
			BoundaryObject var12 = new BoundaryObject();
			var12.tag = var9;
			var12.flags = var11;
			var12.x = var2 * 128 + 64;
			var12.y = var3 * 128 + 64;
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIILju;Lju;IIIIJI)V"
	)
	@Export("newWallDecoration")
	public void newWallDecoration(int var1, int var2, int var3, int var4, Renderable var5, Renderable var6, int var7, int var8, int var9, int var10, long var11, int var13) {
		if (var5 != null) {
			WallDecoration var14 = new WallDecoration();
			var14.tag = var11;
			var14.flags = var13;
			var14.x = var2 * 8192 + 4096;
			var14.y = var3 * 128 + 64;
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILju;IJI)Z"
	)
	public boolean method4861(int var1, int var2, int var3, int var4, int var5, int var6, Renderable var7, int var8, long var9, int var11) {
		if (var7 == null) {
			return true;
		} else {
			int var12 = var5 * 64 + var2 * 128;
			int var13 = var6 * 64 + var3 * 128;
			return this.newGameObject(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIIILju;IJZ)Z"
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIIILju;IJIIII)Z"
	)
	@Export("addNullableObject")
	public boolean addNullableObject(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, int var10, int var11, int var12, int var13) {
		return var6 == null ? true : this.newGameObject(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILju;IZJI)Z"
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

	@ObfuscatedName("ay")
	@Export("setViewportWalking")
	public void setViewportWalking() {
		for (int var1 = 0; var1 < this.tempGameObjectsCount; ++var1) {
			GameObject var2 = this.tempGameObjects[var1];
			this.removeGameObject(var2);
			this.tempGameObjects[var1] = null;
		}

		this.tempGameObjectsCount = 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lkf;)V"
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
	public void method4886(int var1, int var2, int var3, int var4) {
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

	@ObfuscatedName("ad")
	@Export("removeWallDecoration")
	public void removeWallDecoration(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 != null) {
			var4.wallDecoration = null;
		}
	}

	@ObfuscatedName("ai")
	@Export("removeGameObject")
	public void removeGameObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 != null) {
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) {
				GameObject var6 = var4.gameObjects[var5];
				if (Clock.method3771(var6.tag) && var2 == var6.startX && var3 == var6.startY) {
					this.removeGameObject(var6);
					return;
				}
			}

		}
	}

	@ObfuscatedName("an")
	@Export("removeFloorDecoration")
	public void removeFloorDecoration(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 != null) {
			var4.floorDecoration = null;
		}
	}

	@ObfuscatedName("am")
	@Export("removeGroundItemPile")
	public void removeGroundItemPile(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 != null) {
			var4.itemLayer = null;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)Lkt;"
	)
	@Export("getGameObject")
	public BoundaryObject getGameObject(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		return var4 == null ? null : var4.boundaryObject;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Lkj;"
	)
	@Export("getFloorDecoration")
	public WallDecoration getFloorDecoration(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		return var4 == null ? null : var4.wallDecoration;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(III)Lkf;"
	)
	public GameObject method4875(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 == null) {
			return null;
		} else {
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) {
				GameObject var6 = var4.gameObjects[var5];
				if (Clock.method3771(var6.tag) && var2 == var6.startX && var3 == var6.startY) {
					return var6;
				}
			}

			return null;
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(III)Ljm;"
	)
	public FloorDecoration method4876(int var1, int var2, int var3) {
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

	@ObfuscatedName("bt")
	@Export("getGameObjectTag")
	public long getGameObjectTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		if (var4 == null) {
			return 0L;
		} else {
			for (int var5 = 0; var5 < var4.gameObjectsCount; ++var5) {
				GameObject var6 = var4.gameObjects[var5];
				if (Clock.method3771(var6.tag) && var2 == var6.startX && var3 == var6.startY) {
					return var6.tag;
				}
			}

			return 0L;
		}
	}

	@ObfuscatedName("bn")
	@Export("getFloorDecorationTag")
	public long getFloorDecorationTag(int var1, int var2, int var3) {
		Tile var4 = this.tiles[var1][var2][var3];
		return var4 != null && var4.floorDecoration != null ? var4.floorDecoration.tag : 0L;
	}

	@ObfuscatedName("bw")
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

	@ObfuscatedName("bl")
	public void method4882(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.planes; ++var4) {
			for (int var5 = 0; var5 < this.xSize; ++var5) {
				for (int var6 = 0; var6 < this.ySize; ++var6) {
					Tile var7 = this.tiles[var4][var5][var6];
					if (var7 != null) {
						BoundaryObject var8 = var7.boundaryObject;
						ModelData var10;
						if (var8 != null && var8.renderable1 instanceof ModelData) {
							ModelData var9 = (ModelData)var8.renderable1;
							this.method4884(var9, var4, var5, var6, 1, 1);
							if (var8.renderable2 instanceof ModelData) {
								var10 = (ModelData)var8.renderable2;
								this.method4884(var10, var4, var5, var6, 1, 1);
								ModelData.method4610(var9, var10, 0, 0, 0, false);
								var8.renderable2 = var10.toModel(var10.ambient, var10.contrast, var1, var2, var3);
							}

							var8.renderable1 = var9.toModel(var9.ambient, var9.contrast, var1, var2, var3);
						}

						for (int var12 = 0; var12 < var7.gameObjectsCount; ++var12) {
							GameObject var14 = var7.gameObjects[var12];
							if (var14 != null && var14.renderable instanceof ModelData) {
								ModelData var11 = (ModelData)var14.renderable;
								this.method4884(var11, var4, var5, var6, var14.endX - var14.startX + 1, var14.endY - var14.startY + 1);
								var14.renderable = var11.toModel(var11.ambient, var11.contrast, var1, var2, var3);
							}
						}

						FloorDecoration var13 = var7.floorDecoration;
						if (var13 != null && var13.renderable instanceof ModelData) {
							var10 = (ModelData)var13.renderable;
							this.method4883(var10, var4, var5, var6);
							var13.renderable = var10.toModel(var10.ambient, var10.contrast, var1, var2, var3);
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ljb;III)V"
	)
	void method4883(ModelData var1, int var2, int var3, int var4) {
		int var6 = var3 + 1;
		int var7 = var4 - 1;
		int var8 = var4 + 1;

		for (int var9 = var3; var9 <= var6; ++var9) {
			if (var9 >= 0 && var9 < this.xSize) {
				for (int var10 = var7; var10 <= var8; ++var10) {
					if (var10 >= 0 && var10 < this.ySize && (var9 >= var6 || var10 >= var8)) {
						Tile var11 = this.tiles[var2][var9][var10];
						if (var11 != null && var11.floorDecoration != null && var11.floorDecoration.renderable instanceof ModelData) {
							int var12 = this.method4885(var2, var9, var10, var2, var3, var4);
							ModelData var13 = (ModelData)var11.floorDecoration.renderable;
							ModelData.method4610(var1, var13, (var9 - var3) * 128, var12, (var10 - var4) * 128, true);
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Ljb;IIIII)V"
	)
	void method4884(ModelData var1, int var2, int var3, int var4, int var5, int var6) {
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
									int var16 = this.method4885(var12, var13, var14, var2, var3, var4);
									BoundaryObject var17 = var15.boundaryObject;
									if (var17 != null) {
										ModelData var18;
										if (var17.renderable1 instanceof ModelData) {
											var18 = (ModelData)var17.renderable1;
											ModelData.method4610(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
										}

										if (var17.renderable2 instanceof ModelData) {
											var18 = (ModelData)var17.renderable2;
											ModelData.method4610(var1, var18, (1 - var5) * 64 + (var13 - var3) * 128, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
										}
									}

									for (int var23 = 0; var23 < var15.gameObjectsCount; ++var23) {
										GameObject var19 = var15.gameObjects[var23];
										if (var19 != null && var19.renderable instanceof ModelData) {
											ModelData var20 = (ModelData)var19.renderable;
											int var21 = var19.endX - var19.startX + 1;
											int var22 = var19.endY - var19.startY + 1;
											ModelData.method4610(var1, var20, (var21 - var5) * 64 + (var19.startX - var3) * 128, var16, (var19.startY - var4) * 128 + (var22 - var6) * 64, var7);
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

	@ObfuscatedName("bu")
	int method4885(int var1, int var2, int var3, int var4, int var5, int var6) {
		return this.method4854(var1, var2, var3) - this.method4854(var4, var5, var6);
	}

	@ObfuscatedName("bh")
	int method4854(int var1, int var2, int var3) {
		return (this.tileHeights[var1][var2 + 1][var3 + 1] + this.tileHeights[var1][var2][var3] + this.tileHeights[var1][var2][var3 + 1] + this.tileHeights[var1][var2 + 1][var3]) / 4;
	}

	@ObfuscatedName("bk")
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

	@ObfuscatedName("bp")
	public void method4971(int var1) {
		int var2 = Math.max(25, Math.min(var1, 90));
		this.Scene_offsetOccluder = var2;
		AbstractRasterizer.method4828(this.Scene_offsetOccluder);
		if (this.field2764 != null && this.field2764.length > 0) {
			this.method4901(this.field2764, this.field2736, this.field2724, this.field2765, this.field2758);
		}

	}

	@ObfuscatedName("br")
	boolean method4889(BitSet var1, int var2, int var3, int var4, int var5) {
		return var1.get(var5 + var4 * this.field2774 + var2 * this.field2772 + var3 * this.field2773);
	}

	@ObfuscatedName("bx")
	boolean method4890(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
		var1.set(var5 + var4 * this.field2774 + var2 * this.field2772 + var3 * this.field2773, var6);
		return var6;
	}

	@ObfuscatedName("bd")
	boolean method4891(int var1, int var2, int var3, int var4) {
		return this.method4889(this.field2770, var1, var2, var3, var4);
	}

	@ObfuscatedName("bv")
	boolean method4942(int var1, int var2, int var3, int var4, boolean var5) {
		return this.method4890(this.field2770, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("bm")
	boolean method5041(int var1, int var2, int var3, int var4) {
		return this.method4889(this.field2771, var1, var2, var3, var4);
	}

	@ObfuscatedName("bq")
	boolean method4894(int var1, int var2, int var3, int var4, boolean var5) {
		return this.method4890(this.field2771, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("bj")
	boolean method4895(BitSet var1, int var2, int var3, int var4, int var5) {
		return var1.get(var5 + var4 * this.field2780 + var2 * this.field2781 + var3 * this.field2779);
	}

	@ObfuscatedName("bc")
	boolean method4896(BitSet var1, int var2, int var3, int var4, int var5, boolean var6) {
		var1.set(var5 + var4 * this.field2780 + var2 * this.field2781 + var3 * this.field2779, var6);
		return var6;
	}

	@ObfuscatedName("bz")
	boolean method4897(int var1, int var2, int var3, int var4) {
		return this.method4895(this.field2776, var1, var2, var3, var4);
	}

	@ObfuscatedName("ba")
	boolean method4898(int var1, int var2, int var3, int var4, boolean var5) {
		return this.method4896(this.field2776, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("bb")
	boolean method4899(int var1, int var2, int var3, int var4) {
		return this.method4895(this.field2777, var1, var2, var3, var4);
	}

	@ObfuscatedName("by")
	boolean method4900(int var1, int var2, int var3, int var4, boolean var5) {
		return this.method4896(this.field2777, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("cw")
	public void method4901(int[] var1, int var2, int var3, int var4, int var5) {
		this.field2764 = var1;
		this.field2736 = var2;
		this.field2724 = var3;
		this.field2765 = var4;
		this.field2758 = var5;
		this.field2785 = 0;
		this.field2786 = 0;
		this.field2787 = var4;
		this.field2788 = var5;
		this.field2783 = var4 / 2;
		this.field2784 = var5 / 2;
		this.field2771.set(0, this.field2771.size());
		this.field2777.set(0, this.field2777.size());
	}

	@ObfuscatedName("ck")
	@Export("visibilityMap")
	void visibilityMap(int var1, int var2) {
		this.field2767 = var1;
		this.field2782 = var2;
	}

	@ObfuscatedName("cn")
	@Export("visibleTiles")
	boolean visibleTiles(int var1, int var2) {
		if (!this.method5041(this.field2767, this.field2782, var1, var2)) {
			return this.method4891(this.field2767, this.field2782, var1, var2);
		} else {
			this.method4894(this.field2767, this.field2782, var1, var2, false);
			boolean var3 = false;

			for (int var4 = -1; var4 <= 1; ++var4) {
				for (int var5 = -1; var5 <= 1; ++var5) {
					if (this.method4904(this.field2767, this.field2782, var4 + var1 + 1, var5 + var2 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (this.method4904(this.field2767, (this.field2782 + 1) % 31, var4 + var1 + 1, var5 + var2 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (this.method4904(this.field2767 + 1, this.field2782, var4 + var1 + 1, var5 + var2 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}

					if (this.method4904(this.field2767 + 1, (this.field2782 + 1) % 31, var4 + var1 + 1, var5 + var2 + 1)) {
						var3 = true;
						var4 = 2;
						break;
					}
				}
			}

			return this.method4942(this.field2767, this.field2782, var1, var2, var3);
		}
	}

	@ObfuscatedName("ch")
	boolean method4904(int var1, int var2, int var3, int var4) {
		if (!this.method4899(var1, var2, var3, var4)) {
			return this.method4897(var1, var2, var3, var4);
		} else {
			this.method4900(var1, var2, var3, var4, false);
			int var5 = var1 * 32 + 128;
			int var6 = var2 * 64;
			int var7 = (var3 - this.Scene_offsetOccluder - 1) * 128;
			int var8 = (var4 - this.Scene_offsetOccluder - 1) * 128;

			for (int var9 = -this.field2736; var9 <= this.field2724; var9 += 128) {
				if (this.method4905(var7, var9 + this.field2764[var1], var8, var5, var6)) {
					return this.method4898(var1, var2, var3, var4, true);
				}
			}

			return this.method4898(var1, var2, var3, var4, false);
		}
	}

	@ObfuscatedName("cp")
	boolean method4905(int var1, int var2, int var3, int var4, int var5) {
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
		if (var14 >= 50 && var14 <= AbstractRasterizer.method4842()) {
			int var16 = var12 * 128 / var14 + this.field2783;
			int var17 = var15 * 128 / var14 + this.field2784;
			return var16 >= this.field2785 && var16 <= this.field2787 && var17 >= this.field2786 && var17 <= this.field2788;
		} else {
			return false;
		}
	}

	@ObfuscatedName("cd")
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

	@ObfuscatedName("cs")
	public void method4907() {
		this.viewportWalking = true;
	}

	@ObfuscatedName("cm")
	@Export("shouldSendWalk")
	public boolean shouldSendWalk() {
		return this.viewportWalking && this.baseX != -1;
	}

	@ObfuscatedName("ci")
	public void method4986() {
		this.baseX = -1;
		this.viewportWalking = false;
	}

	@ObfuscatedName("cc")
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
		this.method4911(var7);
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Lkl;)V"
	)
	void method4911(Projection var1) {
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

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(Lkl;Ljz;Z)V"
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
													if (!this.method4916(0, var5, var6)) {
														var1.drawTileUnderlay(this, var10.paint, 0, var5, var6);
													}
												} else if (var10.model != null && !this.method4916(0, var5, var6)) {
													var1.drawTileOverlay(this, var10.model, var5, var6);
												}

												var11 = var10.boundaryObject;
												if (var11 != null) {
													var1.draw(var11.renderable1, 0, var11.x * 4096, var11.z, var11.y * 4096, var11.tag);
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
												if (!this.method4916(var8, var5, var6)) {
													var20 = true;
													if (var4.paint.neColor != 12345678 || this.checkClick && var7 <= this.Scene_selectedPlane) {
														var1.drawTileUnderlay(this, var4.paint, var8, var5, var6);
													}
												}
											} else if (var4.model != null && !this.method4916(var8, var5, var6)) {
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

												var12 = field2751[var21];
												var4.field2658 = field2753[var21];
											}

											if (var31 != null) {
												if ((var31.orientationA & field2726[var21]) != 0) {
													if (var31.orientationA == 16) {
														var4.drawGameObjectEdges = 3;
														var4.field2660 = field2754[var21];
														var4.field2657 = 3 - var4.field2660;
													} else if (var31.orientationA == 32) {
														var4.drawGameObjectEdges = 6;
														var4.field2660 = field2755[var21];
														var4.field2657 = 6 - var4.field2660;
													} else if (var31.orientationA == 64) {
														var4.drawGameObjectEdges = 12;
														var4.field2660 = field2756[var21];
														var4.field2657 = 12 - var4.field2660;
													} else {
														var4.drawGameObjectEdges = 9;
														var4.field2660 = field2757[var21];
														var4.field2657 = 9 - var4.field2660;
													}
												} else {
													var4.drawGameObjectEdges = 0;
												}

												if ((var31.orientationA & var12) != 0 && !this.method4917(var8, var5, var6, var31.orientationA)) {
													var1.draw(var31.renderable1, 0, var31.x * 4096, var31.z, var31.y * 4096, var31.tag);
												}

												if ((var31.orientationB & var12) != 0 && !this.method4917(var8, var5, var6, var31.orientationB)) {
													var1.draw(var31.renderable2, 0, var31.x * 4096, var31.z, var31.y * 4096, var31.tag);
												}
											}

											if (var14 != null && !this.method4918(var8, var5, var6, var14.renderable1.height)) {
												if ((var14.orientation & var12) != 0) {
													var1.draw(var14.renderable1, 0, var14.x * 64 + var14.xOffset, var14.z, var14.y * 4096 + var14.yOffset, var14.tag);
												} else if (var14.orientation == 256) {
													var15 = var14.x * 64 - this.Scene_cameraX;
													var16 = var14.y * 4096 - this.Scene_cameraZ;
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
														var1.draw(var14.renderable1, 0, var14.x * 64 + var14.xOffset, var14.z, var14.y * 4096 + var14.yOffset, var14.tag);
													} else if (var14.renderable2 != null) {
														var1.draw(var14.renderable2, 0, var14.x * 64, var14.z, var14.y * 4096, var14.tag);
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
														var1.draw(var23.second, 0, var23.x * 4096, var23.z, var23.y * 4096, var23.tag);
													}

													if (var23.third != null) {
														var1.draw(var23.third, 0, var23.x * 4096, var23.z, var23.y * 4096, var23.tag);
													}

													if (var23.first != null) {
														var1.draw(var23.first, 0, var23.x * 4096, var23.z, var23.y * 4096, var23.tag);
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
												if (var4.gameObjects[var21].lastDrawn != this.Scene_drawnCount && (var4.gameObjectEdgeMasks[var21] & var4.drawGameObjectEdges) == var4.field2660) {
													var20 = false;
													break;
												}
											}

											if (var20) {
												var11 = var4.boundaryObject;
												if (!this.method4917(var8, var5, var6, var11.orientationA)) {
													var1.draw(var11.renderable1, 0, var11.x * 4096, var11.z, var11.y * 4096, var11.tag);
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

																if ((var17 & var36.drawGameObjectEdges) == var4.field2657) {
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
														var13.field3026 = var24 + var17;
													} else {
														var13.field3026 = var24 + var16;
													}
												}
											}

											while (var21 > 0) {
												var12 = -50;
												var25 = -1;

												for (var24 = 0; var24 < var21; ++var24) {
													GameObject var35 = this.gameObjects[var24];
													if (var35.lastDrawn != this.Scene_drawnCount) {
														if (var35.field3026 > var12) {
															var12 = var35.field3026;
															var25 = var24;
														} else if (var12 == var35.field3026) {
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
												if (!this.method4919(var8, var33.startX, var33.endX, var33.startY, var33.endY, var33.renderable.height)) {
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
					var1.draw(var32.second, 0, var32.x * 4096, var32.z - var32.height, var32.y * 4096, var32.tag);
				}

				if (var32.third != null) {
					var1.draw(var32.third, 0, var32.x * 4096, var32.z - var32.height, var32.y * 4096, var32.tag);
				}

				if (var32.first != null) {
					var1.draw(var32.first, 0, var32.x * 4096, var32.z - var32.height, var32.y * 4096, var32.tag);
				}
			}

			if (var4.field2658 != 0) {
				WallDecoration var29 = var4.wallDecoration;
				if (var29 != null && !this.method4918(var8, var5, var6, var29.renderable1.height)) {
					if ((var29.orientation & var4.field2658) != 0) {
						var1.draw(var29.renderable1, 0, var29.x * 64 + var29.xOffset, var29.z, var29.y * 4096 + var29.yOffset, var29.tag);
					} else if (var29.orientation == 256) {
						var12 = var29.x * 64 - this.Scene_cameraX;
						var25 = var29.y * 4096 - this.Scene_cameraZ;
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
							var1.draw(var29.renderable1, 0, var29.x * 64 + var29.xOffset, var29.z, var29.y * 4096 + var29.yOffset, var29.tag);
						} else if (var29.renderable2 != null) {
							var1.draw(var29.renderable2, 0, var29.x * 64, var29.z, var29.y * 4096, var29.tag);
						}
					}
				}

				BoundaryObject var27 = var4.boundaryObject;
				if (var27 != null) {
					if ((var27.orientationB & var4.field2658) != 0 && !this.method4917(var8, var5, var6, var27.orientationB)) {
						var1.draw(var27.renderable2, 0, var27.x * 4096, var27.z, var27.y * 4096, var27.tag);
					}

					if ((var27.orientationA & var4.field2658) != 0 && !this.method4917(var8, var5, var6, var27.orientationA)) {
						var1.draw(var27.renderable1, 0, var27.x * 4096, var27.z, var27.y * 4096, var27.tag);
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

	@ObfuscatedName("ce")
	@Export("occlude")
	void occlude() {
		int var1 = this.Scene_planeOccluderCounts[this.Scene_plane];
		Occluder[] var2 = this.Scene_planeOccluders[this.Scene_plane];
		this.Scene_currentOccludersCount8 = 0;

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
							var4.field2823 = 1;
						} else {
							if (var9 >= -32) {
								continue;
							}

							var4.field2823 = 2;
							var9 = -var9;
						}

						var4.field2819 = (var4.minZ - this.Scene_cameraZ << 8) / var9;
						var4.field2827 = (var4.maxZ - this.Scene_cameraZ << 8) / var9;
						var4.field2816 = (var4.minY - this.Scene_cameraY << 8) / var9;
						var4.field2829 = (var4.maxY - this.Scene_cameraY << 8) / var9;
						this.Scene_currentOccluders[this.Scene_currentOccludersCount8++] = var4;
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
							var4.field2823 = 3;
						} else {
							if (var9 >= -32) {
								continue;
							}

							var4.field2823 = 4;
							var9 = -var9;
						}

						var4.field2824 = (var4.minX - this.Scene_cameraX << 8) / var9;
						var4.field2825 = (var4.maxX - this.Scene_cameraX << 8) / var9;
						var4.field2816 = (var4.minY - this.Scene_cameraY << 8) / var9;
						var4.field2829 = (var4.maxY - this.Scene_cameraY << 8) / var9;
						this.Scene_currentOccluders[this.Scene_currentOccludersCount8++] = var4;
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

						label149:
						for (int var11 = var8; var11 <= var9; ++var11) {
							for (int var12 = var6; var12 <= var7; ++var12) {
								if (this.visibleTiles(var11, var12)) {
									var10 = true;
									break label149;
								}
							}
						}

						if (var10) {
							var4.field2823 = 5;
							var4.field2824 = (var4.minX - this.Scene_cameraX << 8) / var5;
							var4.field2825 = (var4.maxX - this.Scene_cameraX << 8) / var5;
							var4.field2819 = (var4.minZ - this.Scene_cameraZ << 8) / var5;
							var4.field2827 = (var4.maxZ - this.Scene_cameraZ << 8) / var5;
							this.Scene_currentOccluders[this.Scene_currentOccludersCount8++] = var4;
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("cz")
	boolean method4916(int var1, int var2, int var3) {
		int var4 = this.field2716[var1][var2][var3];
		if (var4 == -this.Scene_drawnCount) {
			return false;
		} else if (var4 == this.Scene_drawnCount) {
			return true;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			if (this.method4920(var5 + 1, this.tileHeights[var1][var2][var3], var6 + 1) && this.method4920(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3], var6 + 1) && this.method4920(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method4920(var5 + 1, this.tileHeights[var1][var2][var3 + 1], var6 + 128 - 1)) {
				this.field2716[var1][var2][var3] = this.Scene_drawnCount;
				return true;
			} else {
				this.field2716[var1][var2][var3] = -this.Scene_drawnCount;
				return false;
			}
		}
	}

	@ObfuscatedName("ca")
	boolean method4917(int var1, int var2, int var3, int var4) {
		if (!this.method4916(var1, var2, var3)) {
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
						if (!this.method4920(var5, var7, var6)) {
							return false;
						}

						if (!this.method4920(var5, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method4920(var5, var8, var6)) {
							return false;
						}

						if (!this.method4920(var5, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.method4920(var5, var9, var6)) {
						return false;
					}

					if (!this.method4920(var5, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 2) {
					if (var6 < this.Scene_cameraZ) {
						if (!this.method4920(var5, var7, var6 + 128)) {
							return false;
						}

						if (!this.method4920(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method4920(var5, var8, var6 + 128)) {
							return false;
						}

						if (!this.method4920(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.method4920(var5, var9, var6 + 128)) {
						return false;
					}

					if (!this.method4920(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 4) {
					if (var5 < this.Scene_cameraX) {
						if (!this.method4920(var5 + 128, var7, var6)) {
							return false;
						}

						if (!this.method4920(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method4920(var5 + 128, var8, var6)) {
							return false;
						}

						if (!this.method4920(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.method4920(var5 + 128, var9, var6)) {
						return false;
					}

					if (!this.method4920(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 8) {
					if (var6 > this.Scene_cameraZ) {
						if (!this.method4920(var5, var7, var6)) {
							return false;
						}

						if (!this.method4920(var5 + 128, var7, var6)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method4920(var5, var8, var6)) {
							return false;
						}

						if (!this.method4920(var5 + 128, var8, var6)) {
							return false;
						}
					}

					if (!this.method4920(var5, var9, var6)) {
						return false;
					}

					if (!this.method4920(var5 + 128, var9, var6)) {
						return false;
					}

					return true;
				}
			}

			if (!this.method4920(var5 + 64, var10, var6 + 64)) {
				return false;
			} else if (var4 == 16) {
				return this.method4920(var5, var9, var6 + 128);
			} else if (var4 == 32) {
				return this.method4920(var5 + 128, var9, var6 + 128);
			} else if (var4 == 64) {
				return this.method4920(var5 + 128, var9, var6);
			} else if (var4 == 128) {
				return this.method4920(var5, var9, var6);
			} else {
				return true;
			}
		}
	}

	@ObfuscatedName("cl")
	boolean method4918(int var1, int var2, int var3, int var4) {
		if (!this.method4916(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			return this.method4920(var5 + 1, this.tileHeights[var1][var2][var3] - var4, var6 + 1) && this.method4920(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3] - var4, var6 + 1) && this.method4920(var5 + 128 - 1, this.tileHeights[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method4920(var5 + 1, this.tileHeights[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
		}
	}

	@ObfuscatedName("cq")
	boolean method4919(int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		int var8;
		if (var3 == var2 && var5 == var4) {
			if (!this.method4916(var1, var2, var4)) {
				return false;
			} else {
				var7 = var2 << 7;
				var8 = var4 << 7;
				return this.method4920(var7 + 1, this.tileHeights[var1][var2][var4] - var6, var8 + 1) && this.method4920(var7 + 128 - 1, this.tileHeights[var1][var2 + 1][var4] - var6, var8 + 1) && this.method4920(var7 + 128 - 1, this.tileHeights[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method4920(var7 + 1, this.tileHeights[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
			}
		} else {
			for (var7 = var2; var7 <= var3; ++var7) {
				for (var8 = var4; var8 <= var5; ++var8) {
					if (this.field2716[var1][var7][var8] == -this.Scene_drawnCount) {
						return false;
					}
				}
			}

			var7 = (var2 << 7) + 1;
			var8 = (var4 << 7) + 2;
			int var9 = this.tileHeights[var1][var2][var4] - var6;
			if (!this.method4920(var7, var9, var8)) {
				return false;
			} else {
				int var10 = (var3 << 7) - 1;
				if (!this.method4920(var10, var9, var8)) {
					return false;
				} else {
					int var11 = (var5 << 7) - 1;
					if (!this.method4920(var7, var9, var11)) {
						return false;
					} else if (!this.method4920(var10, var9, var11)) {
						return false;
					} else {
						return true;
					}
				}
			}
		}
	}

	@ObfuscatedName("cy")
	boolean method4920(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.Scene_currentOccludersCount8; ++var4) {
			Occluder var5 = this.Scene_currentOccluders[var4];
			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			if (var5.field2823 == 1) {
				var6 = var5.minX - var1;
				if (var6 > 0) {
					var7 = (var6 * var5.field2819 >> 8) + var5.minZ;
					var8 = (var6 * var5.field2827 >> 8) + var5.maxZ;
					var9 = (var6 * var5.field2816 >> 8) + var5.minY;
					var10 = (var6 * var5.field2829 >> 8) + var5.maxY;
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field2823 == 2) {
				var6 = var1 - var5.minX;
				if (var6 > 0) {
					var7 = (var6 * var5.field2819 >> 8) + var5.minZ;
					var8 = (var6 * var5.field2827 >> 8) + var5.maxZ;
					var9 = (var6 * var5.field2816 >> 8) + var5.minY;
					var10 = (var6 * var5.field2829 >> 8) + var5.maxY;
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field2823 == 3) {
				var6 = var5.minZ - var3;
				if (var6 > 0) {
					var7 = (var6 * var5.field2824 >> 8) + var5.minX;
					var8 = (var6 * var5.field2825 >> 8) + var5.maxX;
					var9 = (var6 * var5.field2816 >> 8) + var5.minY;
					var10 = (var6 * var5.field2829 >> 8) + var5.maxY;
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field2823 == 4) {
				var6 = var3 - var5.minZ;
				if (var6 > 0) {
					var7 = (var6 * var5.field2824 >> 8) + var5.minX;
					var8 = (var6 * var5.field2825 >> 8) + var5.maxX;
					var9 = (var6 * var5.field2816 >> 8) + var5.minY;
					var10 = (var6 * var5.field2829 >> 8) + var5.maxY;
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field2823 == 5) {
				var6 = var2 - var5.minY;
				if (var6 > 0) {
					var7 = (var6 * var5.field2824 >> 8) + var5.minX;
					var8 = (var6 * var5.field2825 >> 8) + var5.maxX;
					var9 = (var6 * var5.field2819 >> 8) + var5.minZ;
					var10 = (var6 * var5.field2827 >> 8) + var5.maxZ;
					if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
						return true;
					}
				}
			}
		}

		return false;
	}

	@ObfuscatedName("ef")
	void vmethod5198(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10) {
		class424 var12 = new class424();
		var12.method7925((float)((double)(-var2) * 0.0030679615D));
		var12.method7926((float)((double)(-var3) * 0.0030679615D));
		var12.method7928((float)var7, (float)var8, (float)var9);
		class423 var13 = new class423();
		var13.method7919(var12);
		var13.method7864();
		int var14 = this.field2707 % 300;
		float var15 = (float)var14 / 300.0F * 6.283F;
		float var16 = (float)Math.sin((double)var15);
		float var17 = (float)Math.cos((double)var15);
		float var18 = var16 * 3.14159F / 100.0F;
		float var19 = var17 * 3.14159F / 100.0F;
		class417 var20 = new class417();
		class423 var21 = new class423();
		var20.field4667 = new class422((float)((double)var1 * 0.0030679615D), var18, var19);
		var20.field4668 = new class421((float)var4, (float)var5, (float)var6);
		class423 var22 = new class423();
		var22.method7860(var20);
		var22.method7864();
		class417 var23 = new class417();
		var23.field4668 = new class421((float)(-(this.xSize * 64)), 0.0F, (float)(-(this.ySize * 64)));
		class423 var24 = new class423();
		var24.method7860(var23);
		var21.method7859(1.0F, 1.0F, 1.0F, 1.0F);
		var24.method7898(var21);
		var21.method7860(var20);
		var24.method7898(var21);
		var24.method7898(var13);
		this.Scene_cameraX = (int)var22.method7877((float)var7, (float)var8, (float)var9);
		this.Scene_cameraY = (int)var22.method7861((float)var7, (float)var8, (float)var9);
		this.Scene_cameraZ = (int)var22.method7863((float)var7, (float)var8, (float)var9);
		this.Scene_cameraXTile = this.Scene_cameraX / 128;
		this.Scene_cameraYTile = this.Scene_cameraZ / 128;
		class253 var25 = new class253(var24);
		this.method4911(var25);
	}

	@ObfuscatedName("co")
	static final int method4913(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	@ObfuscatedName("cf")
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
