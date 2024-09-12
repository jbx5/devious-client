import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lq")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1331055067
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -462533521
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 915525411
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 183671469
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1705926385
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 681022681
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 77127323
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1272378045
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 2018777527
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 581490365
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 273479137
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1859722893
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 993980911
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -914697121
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lky;I)V",
		garbageValue = "-1991951399"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.newX) {
			var1.regionLowX = this.newX;
		}

		if (var1.regionHighX < this.newX) {
			var1.regionHighX = this.newX;
		}

		if (var1.regionLowY > this.newY) {
			var1.regionLowY = this.newY;
		}

		if (var1.regionHighY < this.newY) {
			var1.regionHighY = this.newY;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-644828112"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.oldZ + this.newZ) {
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "2038421096"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "1"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.newX * 64 - this.oldX * 64 + var2 + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)};
			return var4;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)Lnm;",
		garbageValue = "1877296615"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + var1;
			int var4 = this.oldY * 64 - this.newY * 64 + var2 + (this.oldChunkYLow * 8 - this.newChunkYLow * 8);
			return new Coord(this.oldZ, var3, var4);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvf;I)V",
		garbageValue = "814828591"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.oldZ = var1.readUnsignedByte();
		this.newZ = var1.readUnsignedByte();
		this.oldX = var1.readUnsignedShort();
		this.oldChunkXLow = var1.readUnsignedByte();
		this.oldChunkXHigh = var1.readUnsignedByte();
		this.oldY = var1.readUnsignedShort();
		this.oldChunkYLow = var1.readUnsignedByte();
		this.oldChunkYHigh = var1.readUnsignedByte();
		this.newX = var1.readUnsignedShort();
		this.newChunkXLow = var1.readUnsignedByte();
		this.newChunkXHigh = var1.readUnsignedByte();
		this.newY = var1.readUnsignedShort();
		this.newChunkYLow = var1.readUnsignedByte();
		this.newChunkYHigh = var1.readUnsignedByte();
		this.postRead();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-134830175"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-73440136"
	)
	static final int method6118(int var0) {
		return Math.abs(var0 - class267.cameraYaw) > 1024 ? 2048 * (var0 < class267.cameraYaw ? 1 : -1) + var0 : var0;
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "639281147"
	)
	static final void method6138(int var0) {
		int[] var1 = Tiles.sceneMinimapSprite.pixels;
		int var2 = var1.length;

		int var3;
		for (var3 = 0; var3 < var2; ++var3) {
			var1[var3] = 0;
		}

		int var4;
		int var5;
		for (var3 = 1; var3 < 103; ++var3) {
			var4 = (103 - var3) * 2048 + 24628;

			for (var5 = 1; var5 < 103; ++var5) {
				if ((ClientPreferences.topLevelWorldView.tileSettings[var0][var5][var3] & 24) == 0) {
					ClientPreferences.topLevelWorldView.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
				}

				if (var0 < 3 && (ClientPreferences.topLevelWorldView.tileSettings[var0 + 1][var5][var3] & 8) != 0) {
					ClientPreferences.topLevelWorldView.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
				}

				var4 += 4;
			}
		}

		var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
		var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
		Tiles.sceneMinimapSprite.setRaster();

		int var6;
		for (var5 = 1; var5 < 103; ++var5) {
			for (var6 = 1; var6 < 103; ++var6) {
				if ((ClientPreferences.topLevelWorldView.tileSettings[var0][var6][var5] & 24) == 0) {
					NPC.drawObject(var0, var6, var5, var3, var4);
				}

				if (var0 < 3 && (ClientPreferences.topLevelWorldView.tileSettings[var0 + 1][var6][var5] & 8) != 0) {
					NPC.drawObject(var0 + 1, var6, var5, var3, var4);
				}
			}
		}

		Client.mapIconCount = 0;

		for (var5 = 0; var5 < 104; ++var5) {
			for (var6 = 0; var6 < 104; ++var6) {
				long var7 = ClientPreferences.topLevelWorldView.scene.getFloorDecorationTag(ClientPreferences.topLevelWorldView.plane, var5, var6);
				if (0L != var7) {
					int var9 = class213.Entity_unpackID(var7);
					int var10 = class273.getObjectDefinition(var9).mapIconId;
					if (var10 >= 0 && class142.WorldMapElement_get(var10).field1909) {
						Client.mapIcons[Client.mapIconCount] = class142.WorldMapElement_get(var10).getSpriteBool(false);
						Client.mapIconXs[Client.mapIconCount] = var5;
						Client.mapIconYs[Client.mapIconCount] = var6;
						++Client.mapIconCount;
					}
				}
			}
		}

		class310.rasterProvider.apply();
	}
}
