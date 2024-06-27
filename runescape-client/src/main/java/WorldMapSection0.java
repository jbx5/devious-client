import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("bk")
	static String field2656;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	static Bounds field2657;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1200076691
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -218939471
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 760931579
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -329528349
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -998317303
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 40711577
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1186226363
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -650038491
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1340854329
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -422996183
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -663064165
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1256569709
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 374574747
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 2104035971
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljm;I)V",
		garbageValue = "1568670940"
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "115"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.newZ + this.oldZ) {
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-898385408"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "-35"
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)Lnl;",
		garbageValue = "-55064754"
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "301668137"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-628373235"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BII)I",
		garbageValue = "-1039324313"
	)
	@Export("encodeStringCp1252")
	public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1;

		for (int var6 = 0; var6 < var5; ++var6) {
			char var7 = var0.charAt(var6 + var1);
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) {
				var3[var6 + var4] = (byte)var7;
			} else if (var7 == 8364) {
				var3[var6 + var4] = -128;
			} else if (var7 == 8218) {
				var3[var6 + var4] = -126;
			} else if (var7 == 402) {
				var3[var6 + var4] = -125;
			} else if (var7 == 8222) {
				var3[var6 + var4] = -124;
			} else if (var7 == 8230) {
				var3[var6 + var4] = -123;
			} else if (var7 == 8224) {
				var3[var6 + var4] = -122;
			} else if (var7 == 8225) {
				var3[var6 + var4] = -121;
			} else if (var7 == 710) {
				var3[var6 + var4] = -120;
			} else if (var7 == 8240) {
				var3[var6 + var4] = -119;
			} else if (var7 == 352) {
				var3[var6 + var4] = -118;
			} else if (var7 == 8249) {
				var3[var6 + var4] = -117;
			} else if (var7 == 338) {
				var3[var6 + var4] = -116;
			} else if (var7 == 381) {
				var3[var6 + var4] = -114;
			} else if (var7 == 8216) {
				var3[var6 + var4] = -111;
			} else if (var7 == 8217) {
				var3[var6 + var4] = -110;
			} else if (var7 == 8220) {
				var3[var6 + var4] = -109;
			} else if (var7 == 8221) {
				var3[var6 + var4] = -108;
			} else if (var7 == 8226) {
				var3[var6 + var4] = -107;
			} else if (var7 == 8211) {
				var3[var6 + var4] = -106;
			} else if (var7 == 8212) {
				var3[var6 + var4] = -105;
			} else if (var7 == 732) {
				var3[var6 + var4] = -104;
			} else if (var7 == 8482) {
				var3[var6 + var4] = -103;
			} else if (var7 == 353) {
				var3[var6 + var4] = -102;
			} else if (var7 == 8250) {
				var3[var6 + var4] = -101;
			} else if (var7 == 339) {
				var3[var6 + var4] = -100;
			} else if (var7 == 382) {
				var3[var6 + var4] = -98;
			} else if (var7 == 376) {
				var3[var6 + var4] = -97;
			} else {
				var3[var6 + var4] = 63;
			}
		}

		return var5;
	}
}
