import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kk")
@Implements("WorldMapRenderer")
public final class WorldMapRenderer {
	@ObfuscatedName("ac")
	@Export("loaded")
	boolean loaded;
	@ObfuscatedName("al")
	boolean field2970;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	@Export("mapAreaData")
	WorldMapAreaData mapAreaData;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	@Export("compositeTextureSprite")
	SpritePixels compositeTextureSprite;
	@ObfuscatedName("ao")
	@Export("icons")
	HashMap icons;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[[Lke;"
	)
	@Export("regions")
	WorldMapRegion[][] regions;
	@ObfuscatedName("ar")
	@Export("scaleHandlers")
	HashMap scaleHandlers;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lun;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("geographyArchive")
	final AbstractArchive geographyArchive;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("groundArchive")
	final AbstractArchive groundArchive;
	@ObfuscatedName("ag")
	@Export("fonts")
	final HashMap fonts;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1606493505
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1924593729
	)
	@Export("tileY")
	int tileY;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -687628608
	)
	@Export("tileWidth")
	int tileWidth;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1331006784
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 200238777
	)
	@Export("pixelsPerTile")
	public int pixelsPerTile;

	@ObfuscatedSignature(
		descriptor = "([Lun;Ljava/util/HashMap;Lom;Lom;)V"
	)
	public WorldMapRenderer(IndexedSprite[] var1, HashMap var2, AbstractArchive var3, AbstractArchive var4) {
		this.loaded = false;
		this.field2970 = false;
		this.scaleHandlers = new HashMap();
		this.pixelsPerTile = 0;
		this.mapSceneSprites = var1;
		this.fonts = var2;
		this.geographyArchive = var3;
		this.groundArchive = var4;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lom;Ljava/lang/String;ZZB)V",
		garbageValue = "121"
	)
	public void method5468(AbstractArchive var1, String var2, boolean var3, boolean var4) {
		if (!this.field2970) {
			this.loaded = false;
			this.field2970 = true;
			System.nanoTime();
			int var5 = var1.getGroupId(WorldMapCacheName.field3095.name);
			int var6 = var1.getFileId(var5, var2);
			Buffer var7 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field3095.name, var2));
			Buffer var8 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field3091.name, var2));
			System.nanoTime();
			System.nanoTime();
			this.mapAreaData = new WorldMapAreaData();

			try {
				this.mapAreaData.method5746(var7, var8, var6, var3, var4);
			} catch (IllegalStateException var20) {
				return;
			}

			this.mapAreaData.getOriginX();
			this.mapAreaData.getOriginPlane();
			this.mapAreaData.getOriginY();
			this.tileX = this.mapAreaData.getRegionLowX() * 64;
			this.tileY = this.mapAreaData.getRegionLowY() * 64;
			this.tileWidth = (this.mapAreaData.getRegionHighX() - this.mapAreaData.getRegionLowX() + 1) * 4096;
			this.tileHeight = (this.mapAreaData.getRegionHighY() - this.mapAreaData.getRegionLowY() + 1) * 4096;
			int var17 = this.mapAreaData.getRegionHighX() - this.mapAreaData.getRegionLowX() + 1;
			int var10 = this.mapAreaData.getRegionHighY() - this.mapAreaData.getRegionLowY() + 1;
			System.nanoTime();
			System.nanoTime();
			class139.method3111();
			this.regions = new WorldMapRegion[var17][var10];
			Iterator var11 = this.mapAreaData.field3100.iterator();

			while (var11.hasNext()) {
				WorldMapData_0 var12 = (WorldMapData_0)var11.next();
				int var13 = var12.regionX;
				int var14 = var12.regionY;
				int var15 = var13 - this.mapAreaData.getRegionLowX();
				int var16 = var14 - this.mapAreaData.getRegionLowY();
				this.regions[var15][var16] = new WorldMapRegion(var13, var14, this.mapAreaData.method5317(), this.fonts);
				this.regions[var15][var16].initWorldMapData0(var12, this.mapAreaData.iconList);
			}

			for (int var18 = 0; var18 < var17; ++var18) {
				for (int var19 = 0; var19 < var10; ++var19) {
					if (this.regions[var18][var19] == null) {
						this.regions[var18][var19] = new WorldMapRegion(this.mapAreaData.getRegionLowX() + var18, this.mapAreaData.getRegionLowY() + var19, this.mapAreaData.method5317(), this.fonts);
						this.regions[var18][var19].initWorldMapData1(this.mapAreaData.field3098, this.mapAreaData.iconList);
					}
				}
			}

			System.nanoTime();
			System.nanoTime();
			if (var1.isValidFileName(WorldMapCacheName.field3090.name, var2)) {
				byte[] var21 = var1.takeFileByNames(WorldMapCacheName.field3090.name, var2);
				this.compositeTextureSprite = Frames.method4854(var21);
			}

			System.nanoTime();
			var1.clearGroups();
			var1.clearFiles();
			this.loaded = true;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-236187865"
	)
	@Export("clearIcons")
	public final void clearIcons() {
		this.icons = null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "909385403"
	)
	@Export("drawTiles")
	public final void drawTiles(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int[] var9 = Rasterizer2D.Rasterizer2D_pixels;
		int var10 = Rasterizer2D.Rasterizer2D_width;
		int var11 = Rasterizer2D.Rasterizer2D_height;
		float[] var12 = Rasterizer2D.field5209;
		int[] var13 = new int[4];
		Rasterizer2D.Rasterizer2D_getClipArray(var13);
		WorldMapRectangle var14 = this.createWorldMapRectangle(var1, var2, var3, var4);
		float var15 = this.getPixelsPerTile(var7 - var5, var3 - var1);
		int var16 = (int)Math.ceil((double)var15);
		this.pixelsPerTile = var16;
		if (!this.scaleHandlers.containsKey(var16)) {
			WorldMapScaleHandler var17 = new WorldMapScaleHandler(var16);
			var17.init();
			this.scaleHandlers.put(var16, var17);
		}

		int var24 = var14.width + var14.x - 1;
		int var18 = var14.y + var14.height - 1;

		int var19;
		int var20;
		for (var19 = var14.x; var19 <= var24; ++var19) {
			for (var20 = var14.y; var20 <= var18; ++var20) {
				this.regions[var19][var20].drawTile(var16, (WorldMapScaleHandler)this.scaleHandlers.get(var16), this.mapSceneSprites, this.geographyArchive, this.groundArchive);
			}
		}

		Rasterizer3D.method4530(var9, var10, var11, var12);
		Rasterizer2D.Rasterizer2D_setClipArray(var13);
		var19 = (int)(var15 * 64.0F);
		var20 = this.tileX * 4096 + var1;
		int var21 = this.tileY * 4096 + var2;

		for (int var22 = var14.x; var22 < var14.x + var14.width; ++var22) {
			for (int var23 = var14.y; var23 < var14.height + var14.y; ++var23) {
				this.regions[var22][var23].method5346(var5 + var19 * (this.regions[var22][var23].regionX * 64 - var20) / 64, var8 - var19 * (this.regions[var22][var23].regionY * 64 - var21 + 64) / 64, var19);
			}
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V",
		garbageValue = "-1519783799"
	)
	@Export("drawElements")
	public final void drawElements(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
		WorldMapRectangle var14 = this.createWorldMapRectangle(var1, var2, var3, var4);
		float var15 = this.getPixelsPerTile(var7 - var5, var3 - var1);
		int var16 = (int)(var15 * 64.0F);
		int var17 = this.tileX * 4096 + var1;
		int var18 = this.tileY * 4096 + var2;

		int var19;
		int var20;
		for (var19 = var14.x; var19 < var14.x + var14.width; ++var19) {
			for (var20 = var14.y; var20 < var14.y + var14.height; ++var20) {
				if (var13) {
					this.regions[var19][var20].initWorldMapIcon1s();
				}

				this.regions[var19][var20].method5347(var5 + var16 * (this.regions[var19][var20].regionX * 64 - var17) / 64, var8 - var16 * (this.regions[var19][var20].regionY * 64 - var18 + 64) / 64, var16, var9);
			}
		}

		if (var10 != null && var11 > 0) {
			for (var19 = var14.x; var19 < var14.width + var14.x; ++var19) {
				for (var20 = var14.y; var20 < var14.height + var14.y; ++var20) {
					this.regions[var19][var20].flashElements(var10, var11, var12);
				}
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/util/HashSet;IIB)V",
		garbageValue = "65"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
		if (this.compositeTextureSprite != null) {
			this.compositeTextureSprite.drawScaledAt(var1, var2, var3, var4);
			if (var6 > 0 && var6 % var7 < var7 / 2) {
				if (this.icons == null) {
					this.buildIcons0();
				}

				Iterator var8 = var5.iterator();

				while (true) {
					List var10;
					do {
						if (!var8.hasNext()) {
							return;
						}

						int var9 = (Integer)var8.next();
						var10 = (List)this.icons.get(var9);
					} while(var10 == null);

					Iterator var11 = var10.iterator();

					while (var11.hasNext()) {
						AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var11.next();
						int var13 = var3 * (var12.coord2.x - this.tileX * 4096) / (this.tileWidth * 64);
						int var14 = var4 - (var12.coord2.y - this.tileY * 4096) * var4 / (this.tileHeight * 64);
						Rasterizer2D.Rasterizer2D_drawCircleAlpha(var13 + var1, var14 + var2, 2, 16776960, 256);
					}
				}
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIB)Ljava/util/List;",
		garbageValue = "13"
	)
	public List method5473(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		LinkedList var11 = new LinkedList();
		if (!this.loaded) {
			return var11;
		} else {
			WorldMapRectangle var12 = this.createWorldMapRectangle(var1, var2, var3, var4);
			float var13 = this.getPixelsPerTile(var7, var3 - var1);
			int var14 = (int)(64.0F * var13);
			int var15 = this.tileX * 4096 + var1;
			int var16 = this.tileY * 4096 + var2;

			for (int var17 = var12.x; var17 < var12.x + var12.width; ++var17) {
				for (int var18 = var12.y; var18 < var12.y + var12.height; ++var18) {
					List var19 = this.regions[var17][var18].method5368(var5 + var14 * (this.regions[var17][var18].regionX * 64 - var15) / 64, var8 + var6 - var14 * (this.regions[var17][var18].regionY * 64 - var16 + 64) / 64, var14, var9, var10);
					if (!var19.isEmpty()) {
						var11.addAll(var19);
					}
				}
			}

			return var11;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Lkx;",
		garbageValue = "-1144444981"
	)
	@Export("createWorldMapRectangle")
	WorldMapRectangle createWorldMapRectangle(int var1, int var2, int var3, int var4) {
		WorldMapRectangle var5 = new WorldMapRectangle(this);
		int var6 = this.tileX * 4096 + var1;
		int var7 = this.tileY * 4096 + var2;
		int var8 = var3 + this.tileX * 4096;
		int var9 = this.tileY * 4096 + var4;
		int var10 = var6 / 64;
		int var11 = var7 / 64;
		int var12 = var8 / 64;
		int var13 = var9 / 64;
		var5.width = var12 - var10 + 1;
		var5.height = var13 - var11 + 1;
		var5.x = var10 - this.mapAreaData.getRegionLowX();
		var5.y = var11 - this.mapAreaData.getRegionLowY();
		if (var5.x < 0) {
			var5.width += var5.x;
			var5.x = 0;
		}

		if (var5.x > this.regions.length - var5.width) {
			var5.width = this.regions.length - var5.x;
		}

		if (var5.y < 0) {
			var5.height += var5.y;
			var5.y = 0;
		}

		if (var5.y > this.regions[0].length - var5.height) {
			var5.height = this.regions[0].length - var5.y;
		}

		var5.width = Math.min(var5.width, this.regions.length);
		var5.height = Math.min(var5.height, this.regions[0].length);
		return var5;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1564953955"
	)
	@Export("isLoaded")
	public boolean isLoaded() {
		return this.loaded;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1360371503"
	)
	public int method5476() {
		return this.mapAreaData.method5277();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/HashMap;",
		garbageValue = "-868447675"
	)
	@Export("buildIcons")
	public HashMap buildIcons() {
		this.buildIcons0();
		return this.icons;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "76"
	)
	@Export("buildIcons0")
	void buildIcons0() {
		if (this.icons == null) {
			this.icons = new HashMap();
		}

		this.icons.clear();

		for (int var1 = 0; var1 < this.regions.length; ++var1) {
			for (int var2 = 0; var2 < this.regions[var1].length; ++var2) {
				List var3 = this.regions[var1][var2].icons();
				Iterator var4 = var3.iterator();

				while (var4.hasNext()) {
					AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
					if (var5.hasValidElement()) {
						int var6 = var5.getElement();
						if (!this.icons.containsKey(var6)) {
							LinkedList var7 = new LinkedList();
							var7.add(var5);
							this.icons.put(var6, var7);
						} else {
							List var8 = (List)this.icons.get(var6);
							var8.add(var5);
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)F",
		garbageValue = "-56693416"
	)
	@Export("getPixelsPerTile")
	float getPixelsPerTile(int var1, int var2) {
		float var3 = (float)var1 / (float)var2;
		if (var3 > 8.0F) {
			return 8.0F;
		} else if (var3 < 1.0F) {
			return 1.0F;
		} else {
			int var4 = Math.round(var3);
			return Math.abs((float)var4 - var3) < 0.05F ? (float)var4 : var3;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lbb;Lpu;Lpu;B)V",
		garbageValue = "77"
	)
	@Export("loginScreen")
	static void loginScreen(GameEngine var0, Font var1, Font var2) {
		int var5;
		boolean var11;
		int var40;
		int var41;
		boolean var55;
		if (Login.worldSelectOpen) {
			class226 var39 = class284.method5657();

			while (true) {
				if (!var39.method4256()) {
					if (MouseHandler.MouseHandler_lastButton != 1 && (UserComparator8.mouseCam || MouseHandler.MouseHandler_lastButton != 4)) {
						break;
					}

					int var4 = Login.xPadding + 280;
					if (MouseHandler.MouseHandler_lastPressedX >= var4 && MouseHandler.MouseHandler_lastPressedX <= var4 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						MouseHandler.changeWorldSelectSorting(0, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var4 + 15 && MouseHandler.MouseHandler_lastPressedX <= var4 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						MouseHandler.changeWorldSelectSorting(0, 1);
						break;
					}

					var5 = Login.xPadding + 390;
					if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						MouseHandler.changeWorldSelectSorting(1, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var5 + 15 && MouseHandler.MouseHandler_lastPressedX <= var5 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						MouseHandler.changeWorldSelectSorting(1, 1);
						break;
					}

					var40 = Login.xPadding + 500;
					if (MouseHandler.MouseHandler_lastPressedX >= var40 && MouseHandler.MouseHandler_lastPressedX <= var40 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						MouseHandler.changeWorldSelectSorting(2, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var40 + 15 && MouseHandler.MouseHandler_lastPressedX <= var40 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						MouseHandler.changeWorldSelectSorting(2, 1);
						break;
					}

					var41 = Login.xPadding + 610;
					if (MouseHandler.MouseHandler_lastPressedX >= var41 && MouseHandler.MouseHandler_lastPressedX <= var41 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						MouseHandler.changeWorldSelectSorting(3, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var41 + 15 && MouseHandler.MouseHandler_lastPressedX <= var41 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						MouseHandler.changeWorldSelectSorting(3, 1);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
						Login.worldSelectOpen = false;
						PcmPlayer.leftTitleSprite.drawAt(Login.xPadding, 0);
						Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
						Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
						break;
					}

					if (Login.hoveredWorldIndex != -1) {
						World var42 = UserComparator3.World_worlds[Login.hoveredWorldIndex];
						if (var42.isDeadman()) {
							var42.field833 = "beta";
						}

						var55 = false;
						if (var42.properties != Client.worldProperties) {
							boolean var56 = (Client.worldProperties & class525.field5112.rsOrdinal()) != 0;
							var11 = var42.isDeadman();
							if (var56 && !var11 || !var56 && var11) {
								var55 = true;
							}
						}

						Language.changeWorld(var42);
						Login.worldSelectOpen = false;
						PcmPlayer.leftTitleSprite.drawAt(Login.xPadding, 0);
						Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
						Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
						if (var55) {
							class140.method3120();
						}
					} else {
						if (Login.worldSelectPage > 0 && class372.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= class372.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= class491.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class491.canvasHeight / 2 + 50) {
							--Login.worldSelectPage;
						}

						if (Login.worldSelectPage < Login.worldSelectPagesCount && class230.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= class340.canvasWidth - class230.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= class340.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= class491.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class491.canvasHeight / 2 + 50) {
							++Login.worldSelectPage;
						}
					}
					break;
				}

				if (var39.field2386 == 13) {
					Login.worldSelectOpen = false;
					PcmPlayer.leftTitleSprite.drawAt(Login.xPadding, 0);
					Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
					Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
					break;
				}

				if (var39.field2386 == 96) {
					if (Login.worldSelectPage > 0 && class372.worldSelectLeftSprite != null) {
						--Login.worldSelectPage;
					}
				} else if (var39.field2386 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && class230.worldSelectRightSprite != null) {
					++Login.worldSelectPage;
				}
			}

		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !UserComparator8.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) {
				class91.clientPreferences.method2505(!class91.clientPreferences.method2503());
				if (!class91.clientPreferences.method2503()) {
					ArrayList var3 = new ArrayList();
					var3.add(new MusicSong(CollisionMap.archive6, "scape main", "", 255, false));
					class148.method3166(var3, 0, 0, 0, 100, false);
				} else {
					ItemComposition.method4136(0, 0);
				}

				class470.method8459();
			}

			if (Client.gameState != 5) {
				if (Login.field959 == -1L) {
					Login.field959 = GrandExchangeOfferTotalQuantityComparator.method7049() + 1000L;
				}

				long var23 = GrandExchangeOfferTotalQuantityComparator.method7049();
				if (ObjectSound.method1952() && Login.field955 == -1L) {
					Login.field955 = var23;
					if (Login.field955 > Login.field959) {
						Login.field959 = Login.field955;
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) {
					if (WorldMapLabelSize.clientLanguage == Language.Language_EN) {
						if (MouseHandler.MouseHandler_lastButton == 1 || !UserComparator8.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
							var5 = Login.xPadding + 5;
							short var6 = 463;
							byte var7 = 100;
							byte var25 = 35;
							if (MouseHandler.MouseHandler_lastPressedX >= var5 && MouseHandler.MouseHandler_lastPressedX <= var5 + var7 && MouseHandler.MouseHandler_lastPressedY >= var6 && MouseHandler.MouseHandler_lastPressedY <= var6 + var25) {
								if (Canvas.loadWorlds()) {
									Login.worldSelectOpen = true;
									Login.worldSelectPage = 0;
									Login.worldSelectPagesCount = 0;
								}

								return;
							}
						}

						if (class91.World_request != null && Canvas.loadWorlds()) {
							Login.worldSelectOpen = true;
							Login.worldSelectPage = 0;
							Login.worldSelectPagesCount = 0;
						}
					}

					var5 = MouseHandler.MouseHandler_lastButton;
					var40 = MouseHandler.MouseHandler_lastPressedX;
					var41 = MouseHandler.MouseHandler_lastPressedY;
					if (var5 == 0) {
						var40 = MouseHandler.MouseHandler_x;
						var41 = MouseHandler.MouseHandler_y;
					}

					if (!UserComparator8.mouseCam && var5 == 4) {
						var5 = 1;
					}

					class226 var8 = class284.method5657();
					short var44;
					int var45;
					if (Login.loginIndex == 0) {
						var55 = false;

						while (var8.method4256()) {
							if (var8.field2386 == 84) {
								var55 = true;
							}
						}

						var45 = class379.loginBoxCenter - 80;
						var44 = 291;
						if (var5 == 1 && var40 >= var45 - 75 && var40 <= var45 + 75 && var41 >= var44 - 20 && var41 <= var44 + 20) {
							VertexNormal.openURL(ScriptEvent.method2315("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var45 = class379.loginBoxCenter + 80;
						if (var5 == 1 && var40 >= var45 - 75 && var40 <= var45 + 75 && var41 >= var44 - 20 && var41 <= var44 + 20 || var55) {
							if ((Client.worldProperties & class525.field5120.rsOrdinal()) != 0) {
								Login.Login_response0 = "";
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
								Login.Login_response2 = "Your normal account will not be affected.";
								Login.Login_response3 = "";
								GameEngine.method647(1);
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
									Login.currentLoginField = 1;
								} else {
									Login.currentLoginField = 0;
								}
							} else if ((Client.worldProperties & class525.field5096.rsOrdinal()) != 0) {
								if ((Client.worldProperties & class525.field5105.rsOrdinal()) != 0) {
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
									Login.Login_response2 = "Players can attack each other almost everywhere";
									Login.Login_response3 = "and the Protect Item prayer won't work.";
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world.";
									Login.Login_response2 = "Players can attack each other";
									Login.Login_response3 = "almost everywhere.";
								}

								Login.Login_response0 = "Warning!";
								GameEngine.method647(1);
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
									Login.currentLoginField = 1;
								} else {
									Login.currentLoginField = 0;
								}
							} else if ((Client.worldProperties & class525.field5105.rsOrdinal()) != 0) {
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
								Login.Login_response2 = "The Protect Item prayer will";
								Login.Login_response3 = "not work on this world.";
								Login.Login_response0 = "Warning!";
								GameEngine.method647(1);
								if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
									Login.currentLoginField = 1;
								} else {
									Login.currentLoginField = 0;
								}
							} else {
								class429.Login_promptCredentials(false);
							}
						}
					} else {
						int var9;
						short var10;
						if (Login.loginIndex == 1) {
							while (true) {
								if (!var8.method4256()) {
									var9 = class379.loginBoxCenter - 80;
									var10 = 321;
									if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
										class429.Login_promptCredentials(false);
									}

									var9 = class379.loginBoxCenter + 80;
									if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
										GameEngine.method647(0);
									}
									break;
								}

								if (var8.field2386 == 84) {
									class429.Login_promptCredentials(false);
								} else if (var8.field2386 == 13) {
									GameEngine.method647(0);
								}
							}
						} else {
							int var13;
							int var14;
							int var30;
							short var43;
							boolean var47;
							if (Login.loginIndex == 2) {
								var43 = 201;
								var9 = var43 + 52;
								if (var5 == 1 && var41 >= var9 - 12 && var41 < var9 + 2) {
									Login.currentLoginField = 0;
								}

								var9 += 15;
								if (var5 == 1 && var41 >= var9 - 12 && var41 < var9 + 2) {
									Login.currentLoginField = 1;
								}

								var9 += 15;
								var43 = 361;
								if (class481.field4845 != null) {
									var45 = class481.field4845.highX / 2;
									if (var5 == 1 && var40 >= class481.field4845.lowX - var45 && var40 <= var45 + class481.field4845.lowX && var41 >= var43 - 15 && var41 < var43) {
										switch(Login.field938) {
										case 1:
											VertexNormal.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
											return;
										case 2:
											VertexNormal.openURL("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}

								var45 = class379.loginBoxCenter - 80;
								var44 = 321;
								if (var5 == 1 && var40 >= var45 - 75 && var40 <= var45 + 75 && var41 >= var44 - 20 && var41 <= var44 + 20) {
									class148.method3175();
									return;
								}

								var45 = Login.loginBoxX + 180 + 80;
								if (var5 == 1 && var40 >= var45 - 75 && var40 <= var45 + 75 && var41 >= var44 - 20 && var41 <= var44 + 20) {
									GameEngine.method647(0);
									Login.Login_username = "";
									Login.Login_password = "";
									ClientPreferences.field1295 = 0;
									class186.otp = "";
									Login.field951 = true;
								}

								var45 = class379.loginBoxCenter + -117;
								var44 = 277;
								Login.field949 = var40 >= var45 && var40 < var45 + class274.field2991 && var41 >= var44 && var41 < var44 + class202.field2025;
								if (var5 == 1 && Login.field949) {
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
									if (!Client.Login_isUsernameRemembered && class91.clientPreferences.method2576() != null) {
										class91.clientPreferences.method2520((String)null);
									}
								}

								var45 = class379.loginBoxCenter + 24;
								var44 = 277;
								Login.field924 = var40 >= var45 && var40 < var45 + class274.field2991 && var41 >= var44 && var41 < var44 + class202.field2025;
								if (var5 == 1 && Login.field924) {
									class91.clientPreferences.method2531(!class91.clientPreferences.method2504());
									if (!class91.clientPreferences.method2504()) {
										Login.Login_username = "";
										class91.clientPreferences.method2520((String)null);
										if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
											Login.currentLoginField = 1;
										} else {
											Login.currentLoginField = 0;
										}
									}
								}

								label1697:
								while (true) {
									Transferable var59;
									do {
										while (true) {
											label1613:
											do {
												while (true) {
													while (var8.method4256()) {
														if (var8.field2386 != 13) {
															if (Login.currentLoginField != 0) {
																continue label1613;
															}

															char var48 = var8.field2375;

															for (var13 = 0; var13 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var48 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var13); ++var13) {
															}

															if (var8.field2386 == 85 && Login.Login_username.length() > 0) {
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (var8.field2386 == 84 || var8.field2386 == 80) {
																Login.currentLoginField = 1;
															}

															char var50 = var8.field2375;
															boolean var53 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var50) != -1;
															if (var53 && Login.Login_username.length() < 320) {
																Login.Login_username = Login.Login_username + var8.field2375;
															}
														} else {
															GameEngine.method647(0);
															Login.Login_username = "";
															Login.Login_password = "";
															ClientPreferences.field1295 = 0;
															class186.otp = "";
															Login.field951 = true;
														}
													}

													return;
												}
											} while(Login.currentLoginField != 1);

											if (var8.field2386 == 85 && Login.Login_password.length() > 0) {
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
											} else if (var8.field2386 == 84 || var8.field2386 == 80) {
												Login.currentLoginField = 0;
												if (var8.field2386 == 84) {
													Login.Login_username = Login.Login_username.trim();
													if (Login.Login_username.length() == 0) {
														AbstractWorldMapIcon.setLoginResponseString("", "Please enter your username/email address.", "");
														return;
													}

													if (Login.Login_password.length() == 0) {
														AbstractWorldMapIcon.setLoginResponseString("", "Please enter your password.", "");
														return;
													}

													AbstractWorldMapIcon.setLoginResponseString("", "Connecting to server...", "");
													UserComparator6.method2942(false);
													DefaultsGroup.updateGameState(20);
													return;
												}
											}

											if ((var8.method4280(82) || var8.method4280(87)) && var8.field2386 == 67) {
												Clipboard var58 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var59 = var58.getContents(class159.client);
												var14 = 20 - Login.Login_password.length();
												break;
											}

											char var54 = var8.field2375;
											if (var54 >= ' ' && var54 < 127 || var54 > 127 && var54 < 160 || var54 > 160 && var54 <= 255) {
												var47 = true;
											} else {
												label1869: {
													if (var54 != 0) {
														char[] var60 = class399.cp1252AsciiExtension;

														for (var30 = 0; var30 < var60.length; ++var30) {
															char var16 = var60[var30];
															if (var16 == var54) {
																var47 = true;
																break label1869;
															}
														}
													}

													var47 = false;
												}
											}

											if (var47) {
												char var62 = var8.field2375;
												boolean var51 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var62) != -1;
												if (var51 && Login.Login_password.length() < 20) {
													Login.Login_password = Login.Login_password + var8.field2375;
												}
											}
										}
									} while(var14 <= 0);

									try {
										String var15 = (String)var59.getTransferData(DataFlavor.stringFlavor);
										int var52 = Math.min(var14, var15.length());
										int var17 = 0;

										while (true) {
											if (var17 >= var52) {
												Login.Login_password = Login.Login_password + var15.substring(0, var52);
												continue label1697;
											}

											char var19 = var15.charAt(var17);
											boolean var18;
											if ((var19 < ' ' || var19 >= 127) && (var19 <= 127 || var19 >= 160) && (var19 <= 160 || var19 > 255)) {
												label1853: {
													if (var19 != 0) {
														char[] var20 = class399.cp1252AsciiExtension;

														for (int var21 = 0; var21 < var20.length; ++var21) {
															char var22 = var20[var21];
															if (var19 == var22) {
																var18 = true;
																break label1853;
															}
														}
													}

													var18 = false;
												}
											} else {
												var18 = true;
											}

											if (!var18) {
												break;
											}

											char var57 = var15.charAt(var17);
											boolean var28 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var57) != -1;
											if (!var28) {
												break;
											}

											++var17;
										}

										GameEngine.method647(3);
										return;
									} catch (UnsupportedFlavorException var37) {
									} catch (IOException var38) {
									}
								}
							} else {
								Bounds var31;
								if (Login.loginIndex == 3) {
									var9 = Login.loginBoxX + 180;
									var10 = 241;
									var31 = var1.method7636(25, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.".length() - 34, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", var9, var10);
									if (var5 == 1 && var31.method8284(var40, var41)) {
										VertexNormal.openURL("https://oldschool.runescape.com/launcher", true, false);
									}

									var9 = Login.loginBoxX + 180;
									var10 = 276;
									if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
										MusicPatchNode2.method5929(false);
									}

									var9 = Login.loginBoxX + 180;
									var10 = 326;
									if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
										VertexNormal.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
										return;
									}
								} else {
									int var12;
									if (Login.loginIndex == 4) {
										var9 = Login.loginBoxX + 180 - 80;
										var10 = 321;
										if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
											class186.otp.trim();
											if (class186.otp.length() != 6) {
												AbstractWorldMapIcon.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
												return;
											}

											ClientPreferences.field1295 = Integer.parseInt(class186.otp);
											class186.otp = "";
											UserComparator6.method2942(true);
											AbstractWorldMapIcon.setLoginResponseString("", "Connecting to server...", "");
											DefaultsGroup.updateGameState(20);
											return;
										}

										if (var5 == 1 && var40 >= Login.loginBoxX + 180 - 9 && var40 <= Login.loginBoxX + 180 + 130 && var41 >= 263 && var41 <= 296) {
											Login.field951 = !Login.field951;
										}

										if (var5 == 1 && var40 >= Login.loginBoxX + 180 - 34 && var40 <= Login.loginBoxX + 34 + 180 && var41 >= 351 && var41 <= 363) {
											VertexNormal.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
										}

										var9 = Login.loginBoxX + 180 + 80;
										if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
											GameEngine.method647(0);
											Login.Login_username = "";
											Login.Login_password = "";
											ClientPreferences.field1295 = 0;
											class186.otp = "";
										}

										while (var8.method4256()) {
											var11 = false;

											for (var12 = 0; var12 < "1234567890".length(); ++var12) {
												if (var8.field2375 == "1234567890".charAt(var12)) {
													var11 = true;
													break;
												}
											}

											if (var8.field2386 == 13) {
												GameEngine.method647(0);
												Login.Login_username = "";
												Login.Login_password = "";
												ClientPreferences.field1295 = 0;
												class186.otp = "";
											} else {
												if (var8.field2386 == 85 && class186.otp.length() > 0) {
													class186.otp = class186.otp.substring(0, class186.otp.length() - 1);
												}

												if (var8.field2386 == 84) {
													class186.otp.trim();
													if (class186.otp.length() != 6) {
														AbstractWorldMapIcon.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
														return;
													}

													ClientPreferences.field1295 = Integer.parseInt(class186.otp);
													class186.otp = "";
													UserComparator6.method2942(true);
													AbstractWorldMapIcon.setLoginResponseString("", "Connecting to server...", "");
													DefaultsGroup.updateGameState(20);
													return;
												}

												if (var11 && class186.otp.length() < 6) {
													class186.otp = class186.otp + var8.field2375;
												}
											}
										}
									} else if (Login.loginIndex == 5) {
										var9 = Login.loginBoxX + 180 - 80;
										var10 = 321;
										if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
											Login.Login_username = Login.Login_username.trim();
											if (Login.Login_username.length() == 0) {
												AbstractWorldMapIcon.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
											} else {
												long var32 = class7.method43();
												int var46;
												if (0L == var32) {
													var46 = 5;
												} else {
													var46 = class178.method3551(var32, Login.Login_username);
												}

												switch(var46) {
												case 2:
													AbstractWorldMapIcon.setLoginResponseString(Strings.field4188, Strings.field4024, Strings.field4213);
													GameEngine.method647(6);
													break;
												case 3:
													AbstractWorldMapIcon.setLoginResponseString("", "Error connecting to server.", "");
													break;
												case 4:
													AbstractWorldMapIcon.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
													break;
												case 5:
													AbstractWorldMapIcon.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
													break;
												case 6:
													AbstractWorldMapIcon.setLoginResponseString("", "Error connecting to server.", "");
													break;
												case 7:
													AbstractWorldMapIcon.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
												}
											}

											return;
										}

										var9 = Login.loginBoxX + 180 + 80;
										if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
											class429.Login_promptCredentials(true);
										}

										var44 = 361;
										if (Message.field504 != null) {
											var12 = Message.field504.highX / 2;
											if (var5 == 1 && var40 >= Message.field504.lowX - var12 && var40 <= var12 + Message.field504.lowX && var41 >= var44 - 15 && var41 < var44) {
												VertexNormal.openURL(ScriptEvent.method2315("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
											}
										}

										while (var8.method4256()) {
											var47 = false;

											for (var13 = 0; var13 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var13) {
												if (var8.field2375 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var13)) {
													var47 = true;
													break;
												}
											}

											if (var8.field2386 == 13) {
												class429.Login_promptCredentials(true);
											} else {
												if (var8.field2386 == 85 && Login.Login_username.length() > 0) {
													Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
												}

												if (var8.field2386 == 84) {
													Login.Login_username = Login.Login_username.trim();
													if (Login.Login_username.length() == 0) {
														AbstractWorldMapIcon.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
													} else {
														long var34 = class7.method43();
														if (0L == var34) {
															var13 = 5;
														} else {
															var13 = class178.method3551(var34, Login.Login_username);
														}

														switch(var13) {
														case 2:
															AbstractWorldMapIcon.setLoginResponseString(Strings.field4188, Strings.field4024, Strings.field4213);
															GameEngine.method647(6);
															break;
														case 3:
															AbstractWorldMapIcon.setLoginResponseString("", "Error connecting to server.", "");
															break;
														case 4:
															AbstractWorldMapIcon.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
															break;
														case 5:
															AbstractWorldMapIcon.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
															break;
														case 6:
															AbstractWorldMapIcon.setLoginResponseString("", "Error connecting to server.", "");
															break;
														case 7:
															AbstractWorldMapIcon.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
														}
													}

													return;
												}

												if (var47 && Login.Login_username.length() < 320) {
													Login.Login_username = Login.Login_username + var8.field2375;
												}
											}
										}
									} else if (Login.loginIndex != 6) {
										if (Login.loginIndex == 7) {
											if (MusicPatchNode2.field3427 && !Client.onMobile) {
												var9 = class379.loginBoxCenter - 150;
												var45 = var9 + 40 + 240 + 25;
												var44 = 231;
												var12 = var44 + 40;
												if (var5 == 1 && var40 >= var9 && var40 <= var45 && var41 >= var44 && var41 <= var12) {
													var14 = var9;
													var30 = 0;

													while (true) {
														if (var30 >= 8) {
															var13 = 0;
															break;
														}

														if (var40 <= var14 + 30) {
															var13 = var30;
															break;
														}

														var14 += 30;
														var14 += var30 != 1 && var30 != 3 ? 5 : 20;
														++var30;
													}

													Login.field946 = var13;
												}

												var13 = Login.loginBoxX + 180 - 80;
												short var49 = 321;
												boolean var61;
												if (var5 == 1 && var40 >= var13 - 75 && var40 <= var13 + 75 && var41 >= var49 - 20 && var41 <= var49 + 20) {
													var61 = class159.method3332();
													if (var61) {
														DefaultsGroup.updateGameState(50);
														return;
													}
												}

												var13 = Login.loginBoxX + 180 + 80;
												if (var5 == 1 && var40 >= var13 - 75 && var40 <= var13 + 75 && var41 >= var49 - 20 && var41 <= var49 + 20) {
													Login.field947 = new String[8];
													class429.Login_promptCredentials(true);
												}

												while (var8.method4256()) {
													if (var8.field2386 == 101) {
														Login.field947[Login.field946] = null;
													}

													if (var8.field2386 == 85) {
														if (Login.field947[Login.field946] == null && Login.field946 > 0) {
															--Login.field946;
														}

														Login.field947[Login.field946] = null;
													}

													if (var8.field2375 >= '0' && var8.field2375 <= '9') {
														Login.field947[Login.field946] = "" + var8.field2375;
														if (Login.field946 < 7) {
															++Login.field946;
														}
													}

													if (var8.field2386 == 84) {
														var61 = class159.method3332();
														if (var61) {
															DefaultsGroup.updateGameState(50);
														}

														return;
													}
												}
											} else {
												var9 = Login.loginBoxX + 180 - 80;
												var10 = 321;
												if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
													VertexNormal.openURL(ScriptEvent.method2315("secure", true) + "m=dob/set_dob.ws", true, false);
													AbstractWorldMapIcon.setLoginResponseString("", "Page has opened in the browser.", "");
													GameEngine.method647(6);
													return;
												}

												var9 = Login.loginBoxX + 180 + 80;
												if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
													class429.Login_promptCredentials(true);
												}
											}
										} else if (Login.loginIndex == 8) {
											var9 = Login.loginBoxX + 180 - 80;
											var10 = 321;
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
												VertexNormal.openURL("https://www.jagex.com/terms/privacy", true, false);
												AbstractWorldMapIcon.setLoginResponseString("", "Page has opened in the browser.", "");
												GameEngine.method647(6);
												return;
											}

											var9 = Login.loginBoxX + 180 + 80;
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
												class429.Login_promptCredentials(true);
											}
										} else if (Login.loginIndex == 9) {
											var9 = Login.loginBoxX + 180;
											var10 = 311;
											if (var8.field2386 == 84 || var8.field2386 == 13 || var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
												MusicPatchNode2.method5929(false);
											}
										} else if (Login.loginIndex == 10) {
											var9 = Login.loginBoxX + 180;
											var10 = 209;
											if (var8.field2386 == 84 || var5 == 1 && var40 >= var9 - 109 && var40 <= var9 + 109 && var41 >= var10 && var41 <= var10 + 68) {
												AbstractWorldMapIcon.setLoginResponseString("", "Connecting to server...", "");
												Client.field559 = class534.field5192;
												UserComparator6.method2942(false);
												DefaultsGroup.updateGameState(20);
											}
										} else if (Login.loginIndex == 12) {
											var9 = class379.loginBoxCenter;
											var10 = 233;
											var31 = var2.method7636(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10);
											Bounds var26 = var2.method7636(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10);
											Bounds var27 = var2.method7636(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var9, var10);
											var45 = var10 + 17;
											Bounds var29 = var2.method7636(0, 34, "<col=ffd200>agreement (EULA)</col>.", var9, var45);
											if (var5 == 1) {
												if (var31.method8284(var40, var41)) {
													VertexNormal.openURL("https://www.jagex.com/terms", true, false);
												} else if (var26.method8284(var40, var41)) {
													VertexNormal.openURL("https://www.jagex.com/terms/privacy", true, false);
												} else if (var27.method8284(var40, var41) || var29.method8284(var40, var41)) {
													VertexNormal.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
												}
											}

											var9 = class379.loginBoxCenter - 80;
											var10 = 311;
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
												Tile.method4513();
												MusicPatchNode2.method5929(true);
											}

											var9 = class379.loginBoxCenter + 80;
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
												Login.loginIndex = 13;
											}
										} else if (Login.loginIndex == 13) {
											var9 = class379.loginBoxCenter;
											var10 = 321;
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
												MusicPatchNode2.method5929(true);
											}
										} else if (Login.loginIndex == 14) {
											String var36 = "";
											switch(Login.Login_banType) {
											case 0:
												var36 = "https://secure.runescape.com/m=offence-appeal/account-history";
												break;
											case 1:
												var36 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
												break;
											case 2:
												var36 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
												break;
											default:
												class429.Login_promptCredentials(false);
											}

											var45 = Login.loginBoxX + 180;
											var44 = 276;
											if (var5 == 1 && var40 >= var45 - 75 && var40 <= var45 + 75 && var41 >= var44 - 20 && var41 <= var44 + 20) {
												VertexNormal.openURL(var36, true, false);
												AbstractWorldMapIcon.setLoginResponseString("", "Page has opened in the browser.", "");
												GameEngine.method647(6);
												return;
											}

											var45 = Login.loginBoxX + 180;
											var44 = 326;
											if (var5 == 1 && var40 >= var45 - 75 && var40 <= var45 + 75 && var41 >= var44 - 20 && var41 <= var44 + 20) {
												class429.Login_promptCredentials(false);
											}
										} else if (Login.loginIndex == 24) {
											var9 = Login.loginBoxX + 180;
											var10 = 301;
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
												MusicPatchNode2.method5929(false);
											}
										} else if (Login.loginIndex == 32) {
											var9 = Login.loginBoxX + 180 - 80;
											var10 = 321;
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
												VertexNormal.openURL(ScriptEvent.method2315("secure", true) + "m=dob/set_dob.ws", true, false);
												AbstractWorldMapIcon.setLoginResponseString("", "Page has opened in the browser.", "");
												GameEngine.method647(6);
												return;
											}

											var9 = Login.loginBoxX + 180 + 80;
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
												class429.Login_promptCredentials(true);
											}
										} else if (Login.loginIndex == 33) {
											var9 = Login.loginBoxX + 180;
											var10 = 276;
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
												VertexNormal.openURL("https://oldschool.runescape.com/launcher", true, false);
											}

											var9 = Login.loginBoxX + 180;
											var10 = 326;
											if (var5 == 1 && var40 >= var9 - 75 && var40 <= var9 + 75 && var41 >= var10 - 20 && var41 <= var10 + 20) {
												class429.Login_promptCredentials(true);
											}
										}
									} else {
										while (true) {
											do {
												if (!var8.method4256()) {
													var43 = 321;
													if (var5 == 1 && var41 >= var43 - 20 && var41 <= var43 + 20) {
														class429.Login_promptCredentials(true);
													}

													return;
												}
											} while(var8.field2386 != 84 && var8.field2386 != 13);

											class429.Login_promptCredentials(true);
										}
									}
								}
							}
						}
					}

				}
			}
		}
	}
}
