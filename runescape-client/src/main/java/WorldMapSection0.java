import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("ks")
	@ObfuscatedGetter(
		intValue = 1651679029
	)
	@Export("cameraZ")
	static int cameraZ;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1796215389
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -288122705
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 476713003
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -365977569
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -2136261203
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -192131773
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 767041357
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1374436349
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -620977797
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1116515397
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1158608889
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1127882075
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -882481913
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -440899155
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lku;I)V",
		garbageValue = "1421552299"
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "1107005253"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.newZ + this.oldZ) {
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "34"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "63"
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
		descriptor = "(III)Lnv;",
		garbageValue = "-554690101"
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)V",
		garbageValue = "-597206269"
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-99"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("my")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lnq;I)Ljava/lang/String;",
		garbageValue = "-1065325825"
	)
	static String method5891(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) {
			for (int var2 = 1; var2 <= 5; ++var2) {
				while (true) {
					int var3 = var0.indexOf("%" + var2);
					if (var3 == -1) {
						break;
					}

					String var4 = var0.substring(0, var3);
					int var6 = FloorDecoration.method3719(var1, var2 - 1);
					String var5;
					if (var6 < 999999999) {
						var5 = Integer.toString(var6);
					} else {
						var5 = "*";
					}

					var0 = var4 + var5 + var0.substring(var3 + 2);
				}
			}
		}

		return var0;
	}
}
