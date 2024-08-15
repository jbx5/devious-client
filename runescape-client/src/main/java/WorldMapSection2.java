import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -80832215
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1835255729
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 898103917
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 407543859
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1064809825
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -545487737
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1620958091
	)
	int field3051;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1666055681
	)
	int field3052;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1364962315
	)
	int field3046;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1915981431
	)
	int field3054;

	WorldMapSection2() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lku;I)V",
		garbageValue = "1421552299"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field3051) {
			var1.regionLowX = this.field3051;
		}

		if (var1.regionHighX < this.field3046) {
			var1.regionHighX = this.field3046;
		}

		if (var1.regionLowY > this.field3052) {
			var1.regionLowY = this.field3052;
		}

		if (var1.regionHighY < this.field3054) {
			var1.regionHighY = this.field3054;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "1107005253"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) {
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
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
		return var1 >> 6 >= this.field3051 && var1 >> 6 <= this.field3046 && var2 >> 6 >= this.field3052 && var2 >> 6 <= this.field3054;
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
			int[] var4 = new int[]{this.field3051 * 64 - this.regionStartX * 64 + var2, var3 + (this.field3052 * 64 - this.regionStartY * 64)};
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
			int var3 = this.regionStartX * 64 - this.field3051 * 64 + var1;
			int var4 = this.regionStartY * 64 - this.field3052 * 64 + var2;
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)V",
		garbageValue = "-597206269"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.field3051 = var1.readUnsignedShort();
		this.field3052 = var1.readUnsignedShort();
		this.field3046 = var1.readUnsignedShort();
		this.field3054 = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-58"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldh;",
		garbageValue = "-1153882968"
	)
	static class91[] method5560() {
		return new class91[]{class91.field1087, class91.field1086, class91.field1088, class91.field1084, class91.field1097};
	}
}
