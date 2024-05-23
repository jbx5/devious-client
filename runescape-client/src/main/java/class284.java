import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kh")
public class class284 implements WorldMapSection {
	@ObfuscatedName("uf")
	@ObfuscatedGetter(
		intValue = -1298204288
	)
	static int field3133;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1720094217
	)
	int field3124;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1353748853
	)
	int field3129;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 377124275
	)
	int field3126;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1548514205
	)
	int field3123;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -267670147
	)
	int field3127;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1042513445
	)
	int field3128;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 943478777
	)
	int field3125;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1779465705
	)
	int field3130;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 183984075
	)
	int field3135;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -744624811
	)
	int field3132;

	class284() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lkz;I)V",
		garbageValue = "45239804"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field3127) {
			var1.regionLowX = this.field3127;
		}

		if (var1.regionHighX < this.field3127) {
			var1.regionHighX = this.field3127;
		}

		if (var1.regionLowY > this.field3128) {
			var1.regionLowY = this.field3128;
		}

		if (var1.regionHighY < this.field3128) {
			var1.regionHighY = this.field3128;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1685132689"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field3124 && var1 < this.field3124 + this.field3129) {
			return var2 >= (this.field3126 << 6) + (this.field3125 << 3) && var2 <= (this.field3126 << 6) + (this.field3125 << 3) + 7 && var3 >= (this.field3123 << 6) + (this.field3130 << 3) && var3 <= (this.field3123 << 6) + (this.field3130 << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1460062086"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field3127 << 6) + (this.field3135 << 3) && var1 <= (this.field3127 << 6) + (this.field3135 << 3) + 7 && var2 >= (this.field3128 << 6) + (this.field3132 << 3) && var2 <= (this.field3128 << 6) + (this.field3132 << 3) + 7;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-1177670631"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.field3127 * 64 - this.field3126 * 64 + var2 + (this.field3135 * 8 - this.field3125 * 8), var3 + (this.field3128 * 64 - this.field3123 * 64) + (this.field3132 * 8 - this.field3130 * 8)};
			return var4;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)Lnj;",
		garbageValue = "-2141859493"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.field3126 * 64 - this.field3127 * 64 + (this.field3125 * 8 - this.field3135 * 8) + var1;
			int var4 = this.field3123 * 64 - this.field3128 * 64 + var2 + (this.field3130 * 8 - this.field3132 * 8);
			return new Coord(this.field3124, var3, var4);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lua;B)V",
		garbageValue = "-78"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field3124 = var1.readUnsignedByte();
		this.field3129 = var1.readUnsignedByte();
		this.field3126 = var1.readUnsignedShort();
		this.field3125 = var1.readUnsignedByte();
		this.field3123 = var1.readUnsignedShort();
		this.field3130 = var1.readUnsignedByte();
		this.field3127 = var1.readUnsignedShort();
		this.field3135 = var1.readUnsignedByte();
		this.field3128 = var1.readUnsignedShort();
		this.field3132 = var1.readUnsignedByte();
		this.method5820();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-322693145"
	)
	void method5820() {
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-38"
	)
	static final int method5844(int var0) {
		return Math.min(Math.max(var0, 128), 383);
	}
}
