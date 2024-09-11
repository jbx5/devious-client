import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -498412323
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 409050067
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -566069601
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 739844149
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1081973779
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 233061489
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -505610063
	)
	int field3097;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1142252377
	)
	int field3094;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 580409731
	)
	int field3095;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1955863965
	)
	int field3096;

	WorldMapSection2() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lky;I)V",
		garbageValue = "-1991951399"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field3097) {
			var1.regionLowX = this.field3097;
		}

		if (var1.regionHighX < this.field3095) {
			var1.regionHighX = this.field3095;
		}

		if (var1.regionLowY > this.field3094) {
			var1.regionLowY = this.field3094;
		}

		if (var1.regionHighY < this.field3096) {
			var1.regionHighY = this.field3096;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-644828112"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.minPlane + this.planes) {
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
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
		return var1 >> 6 >= this.field3097 && var1 >> 6 <= this.field3095 && var2 >> 6 >= this.field3094 && var2 >> 6 <= this.field3096;
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
			int[] var4 = new int[]{this.field3097 * 64 - this.regionStartX * 64 + var2, var3 + (this.field3094 * 64 - this.regionStartY * 64)};
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
			int var3 = this.regionStartX * 64 - this.field3097 * 64 + var1;
			int var4 = this.regionStartY * 64 - this.field3094 * 64 + var2;
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvf;I)V",
		garbageValue = "814828591"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.field3097 = var1.readUnsignedShort();
		this.field3094 = var1.readUnsignedShort();
		this.field3095 = var1.readUnsignedShort();
		this.field3096 = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("postRead")
	void postRead() {
	}
}
