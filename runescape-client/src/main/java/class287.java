import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ln")
public class class287 implements WorldMapSection {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1807886027
	)
	int field3115;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -139626667
	)
	int field3104;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1784105949
	)
	int field3109;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 156373999
	)
	int field3106;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1693930521
	)
	int field3107;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 390424431
	)
	int field3116;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 127204673
	)
	int field3111;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1953108731
	)
	int field3108;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1137883371
	)
	int field3110;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 483714731
	)
	int field3112;

	class287() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lku;I)V",
		garbageValue = "1421552299"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field3107) {
			var1.regionLowX = this.field3107;
		}

		if (var1.regionHighX < this.field3107) {
			var1.regionHighX = this.field3107;
		}

		if (var1.regionLowY > this.field3116) {
			var1.regionLowY = this.field3116;
		}

		if (var1.regionHighY < this.field3116) {
			var1.regionHighY = this.field3116;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "1107005253"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field3115 && var1 < this.field3115 + this.field3104) {
			return var2 >= (this.field3109 << 6) + (this.field3111 << 3) && var2 <= (this.field3109 << 6) + (this.field3111 << 3) + 7 && var3 >= (this.field3106 << 6) + (this.field3108 << 3) && var3 <= (this.field3106 << 6) + (this.field3108 << 3) + 7;
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
		return var1 >= (this.field3107 << 6) + (this.field3110 << 3) && var1 <= (this.field3107 << 6) + (this.field3110 << 3) + 7 && var2 >= (this.field3116 << 6) + (this.field3112 << 3) && var2 <= (this.field3116 << 6) + (this.field3112 << 3) + 7;
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
			int[] var4 = new int[]{this.field3107 * 64 - this.field3109 * 64 + var2 + (this.field3110 * 8 - this.field3111 * 8), var3 + (this.field3116 * 64 - this.field3106 * 64) + (this.field3112 * 8 - this.field3108 * 8)};
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
			int var3 = this.field3109 * 64 - this.field3107 * 64 + (this.field3111 * 8 - this.field3110 * 8) + var1;
			int var4 = this.field3106 * 64 - this.field3116 * 64 + var2 + (this.field3108 * 8 - this.field3112 * 8);
			return new Coord(this.field3115, var3, var4);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)V",
		garbageValue = "-597206269"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field3115 = var1.readUnsignedByte();
		this.field3104 = var1.readUnsignedByte();
		this.field3109 = var1.readUnsignedShort();
		this.field3111 = var1.readUnsignedByte();
		this.field3106 = var1.readUnsignedShort();
		this.field3108 = var1.readUnsignedByte();
		this.field3107 = var1.readUnsignedShort();
		this.field3110 = var1.readUnsignedByte();
		this.field3116 = var1.readUnsignedShort();
		this.field3112 = var1.readUnsignedByte();
		this.method5850();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "804841346"
	)
	void method5850() {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "24"
	)
	public static int method5868(int var0) {
		return class513.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var0]);
	}
}
