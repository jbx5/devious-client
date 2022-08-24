import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("hb")
public class class228 implements WorldMapSection {
	@ObfuscatedName("ek")
	@ObfuscatedGetter(longValue = -2072947809351730293L)
	static long field2765;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 47745645)
	int field2770;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 263675681)
	int field2761;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 1353652937)
	int field2762;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 305913255)
	int field2763;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 730488789)
	int field2764;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -2135219953)
	int field2767;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 887995033)
	int field2766;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 258163739)
	int field2768;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 498509109)
	int field2760;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = -229699945)
	int field2769;

	class228() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lht;I)V", garbageValue = "362337348")
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2764) {
			var1.regionLowX = this.field2764;
		}
		if (var1.regionHighX < this.field2764) {
			var1.regionHighX = this.field2764;
		}
		if (var1.regionLowY > this.field2767) {
			var1.regionLowY = this.field2767;
		}
		if (var1.regionHighY < this.field2767) {
			var1.regionHighY = this.field2767;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(IIIS)Z", garbageValue = "-6948")
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field2770 && var1 < this.field2770 + this.field2761) {
			return var2 >= (this.field2762 << 6) + (this.field2766 << 3) && var2 <= (this.field2762 << 6) + (this.field2766 << 3) + 7 && var3 >= (this.field2763 << 6) + (this.field2768 << 3) && var3 <= (this.field2763 << 6) + (this.field2768 << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(III)Z", garbageValue = "-1464078865")
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field2764 << 6) + (this.field2760 << 3) && var1 <= (this.field2764 << 6) + (this.field2760 << 3) + 7 && var2 >= (this.field2767 << 6) + (this.field2769 << 3) && var2 <= (this.field2767 << 6) + (this.field2769 << 3) + 7;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(IIII)[I", garbageValue = "2119764221")
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{ this.field2764 * 64 - this.field2762 * 64 + var2 + (this.field2760 * 8 - this.field2766 * 8), var3 + (this.field2767 * 64 - this.field2763 * 64) + (this.field2769 * 8 - this.field2768 * 8) };
			return var4;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(III)Lku;", garbageValue = "-1688632698")
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.field2762 * 64 - this.field2764 * 64 + (this.field2766 * 8 - this.field2760 * 8) + var1;
			int var4 = this.field2763 * 64 - this.field2767 * 64 + var2 + (this.field2768 * 8 - this.field2769 * 8);
			return new Coord(this.field2770, var3, var4);
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lqr;B)V", garbageValue = "-89")
	@Export("read")
	public void read(Buffer var1) {
		this.field2770 = var1.readUnsignedByte();
		this.field2761 = var1.readUnsignedByte();
		this.field2762 = var1.readUnsignedShort();
		this.field2766 = var1.readUnsignedByte();
		this.field2763 = var1.readUnsignedShort();
		this.field2768 = var1.readUnsignedByte();
		this.field2764 = var1.readUnsignedShort();
		this.field2760 = var1.readUnsignedByte();
		this.field2767 = var1.readUnsignedShort();
		this.field2769 = var1.readUnsignedByte();
		this.method4791();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1191123108")
	void method4791() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;I)Z", garbageValue = "-1392891672")
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		boolean var2 = false;
		boolean var3 = false;
		int var4 = 0;
		int var5 = var0.length();
		int var6 = 0;
		boolean var1;
		while (true) {
			if (var6 >= var5) {
				var1 = var3;
				break;
			}
			label85 : {
				char var7 = var0.charAt(var6);
				if (var6 == 0) {
					if (var7 == '-') {
						var2 = true;
						break label85;
					}
					if (var7 == '+') {
						break label85;
					}
				}
				int var9;
				if (var7 >= '0' && var7 <= '9') {
					var9 = var7 - 48;
				} else if (var7 >= 'A' && var7 <= 'Z') {
					var9 = var7 - 55;
				} else {
					if (var7 < 'a' || var7 > 'z') {
						var1 = false;
						break;
					}
					var9 = var7 - 87;
				}
				if (var9 >= 10) {
					var1 = false;
					break;
				}
				if (var2) {
					var9 = -var9;
				}
				int var8 = var9 + var4 * 10;
				if (var4 != var8 / 10) {
					var1 = false;
					break;
				}
				var4 = var8;
				var3 = true;
			}
			++var6;
		} 
		return var1;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "(IIB)I", garbageValue = "70")
	static final int method4802(int var0, int var1) {
		int var2 = var0 + var1 * 57;
		var2 ^= var2 << 13;
		int var3 = var2 * (var2 * var2 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 255;
	}
}