import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kc")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -372555315
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -2079606133
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -302019897
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 389714171
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1932484253
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1897444735
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1106182365
	)
	int field3105;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1778377555
	)
	int field3098;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1300089979
	)
	int field3106;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1452700781
	)
	int field3097;

	WorldMapSection2() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lkp;I)V",
		garbageValue = "-1801855578"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field3105) {
			var1.regionLowX = this.field3105;
		}

		if (var1.regionHighX < this.field3106) {
			var1.regionHighX = this.field3106;
		}

		if (var1.regionLowY > this.field3098) {
			var1.regionLowY = this.field3098;
		}

		if (var1.regionHighY < this.field3097) {
			var1.regionHighY = this.field3097;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1302944886"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) {
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-75"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field3105 && var1 >> 6 <= this.field3106 && var2 >> 6 >= this.field3098 && var2 >> 6 <= this.field3097;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "114"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.field3105 * 64 - this.regionStartX * 64 + var2, var3 + (this.field3098 * 64 - this.regionStartY * 64)};
			return var4;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)Lnn;",
		garbageValue = "-246633808"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.regionStartX * 64 - this.field3105 * 64 + var1;
			int var4 = this.regionStartY * 64 - this.field3098 * 64 + var2;
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvl;I)V",
		garbageValue = "2108862730"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.field3105 = var1.readUnsignedShort();
		this.field3098 = var1.readUnsignedShort();
		this.field3106 = var1.readUnsignedShort();
		this.field3097 = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "23"
	)
	@Export("postRead")
	void postRead() {
	}
}
