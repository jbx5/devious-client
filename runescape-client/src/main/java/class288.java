import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("li")
public class class288 implements WorldMapSection {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 915141991
	)
	int field3172;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 206502247
	)
	int field3163;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1330644163
	)
	int field3171;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1562467789
	)
	int field3170;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 2093035069
	)
	int field3166;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1354628523
	)
	int field3167;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1313961753
	)
	int field3168;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -737665065
	)
	int field3169;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -419349839
	)
	int field3165;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2014038361
	)
	int field3162;

	class288() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lkp;I)V",
		garbageValue = "-1801855578"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field3166) {
			var1.regionLowX = this.field3166;
		}

		if (var1.regionHighX < this.field3166) {
			var1.regionHighX = this.field3166;
		}

		if (var1.regionLowY > this.field3167) {
			var1.regionLowY = this.field3167;
		}

		if (var1.regionHighY < this.field3167) {
			var1.regionHighY = this.field3167;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1302944886"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field3172 && var1 < this.field3172 + this.field3163) {
			return var2 >= (this.field3171 << 6) + (this.field3168 << 3) && var2 <= (this.field3171 << 6) + (this.field3168 << 3) + 7 && var3 >= (this.field3170 << 6) + (this.field3169 << 3) && var3 <= (this.field3170 << 6) + (this.field3169 << 3) + 7;
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
		return var1 >= (this.field3166 << 6) + (this.field3165 << 3) && var1 <= (this.field3166 << 6) + (this.field3165 << 3) + 7 && var2 >= (this.field3167 << 6) + (this.field3162 << 3) && var2 <= (this.field3167 << 6) + (this.field3162 << 3) + 7;
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
			int[] var4 = new int[]{this.field3166 * 64 - this.field3171 * 64 + var2 + (this.field3165 * 8 - this.field3168 * 8), var3 + (this.field3167 * 64 - this.field3170 * 64) + (this.field3162 * 8 - this.field3169 * 8)};
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
			int var3 = this.field3171 * 64 - this.field3166 * 64 + (this.field3168 * 8 - this.field3165 * 8) + var1;
			int var4 = this.field3170 * 64 - this.field3167 * 64 + var2 + (this.field3169 * 8 - this.field3162 * 8);
			return new Coord(this.field3172, var3, var4);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvl;I)V",
		garbageValue = "2108862730"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field3172 = var1.readUnsignedByte();
		this.field3163 = var1.readUnsignedByte();
		this.field3171 = var1.readUnsignedShort();
		this.field3168 = var1.readUnsignedByte();
		this.field3170 = var1.readUnsignedShort();
		this.field3169 = var1.readUnsignedByte();
		this.field3166 = var1.readUnsignedShort();
		this.field3165 = var1.readUnsignedByte();
		this.field3167 = var1.readUnsignedShort();
		this.field3162 = var1.readUnsignedByte();
		this.method6181();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1429807149"
	)
	void method6181() {
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1636941146"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}
}
