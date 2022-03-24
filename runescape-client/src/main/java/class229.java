import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
public class class229 implements WorldMapSection {
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	-948885225)

	int field2736;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	-593318449)

	int field2734;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	2083366699)

	int field2733;
	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 
	-187959117)

	int field2738;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	-196184405)

	int field2737;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	726632117)

	int field2743;
	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 
	-1653715279)

	int field2739;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	-759700891)

	int field2740;
	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 
	-1488339787)

	int field2741;
	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 
	-1323722061)

	int field2742;

	class229() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lhw;I)V", garbageValue = 
	"-1521793701")

	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2737) {
			var1.regionLowX = this.field2737;
		}

		if (var1.regionHighX < this.field2737) {
			var1.regionHighX = this.field2737;
		}

		if (var1.regionLowY > this.field2743) {
			var1.regionLowY = this.field2743;
		}

		if (var1.regionHighY < this.field2743) {
			var1.regionHighY = this.field2743;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(IIII)Z", garbageValue = 
	"-2091891709")

	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if ((var1 >= this.field2736) && (var1 < (this.field2734 + this.field2736))) {
			return (((var2 >= ((this.field2733 << 6) + (this.field2739 << 3))) && (var2 <= (((this.field2733 << 6) + (this.field2739 << 3)) + 7))) && (var3 >= ((this.field2738 << 6) + (this.field2740 << 3)))) && (var3 <= (((this.field2738 << 6) + (this.field2740 << 3)) + 7));
		} else {
			return false;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(IIB)Z", garbageValue = 
	"-59")

	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return (((var1 >= ((this.field2737 << 6) + (this.field2741 << 3))) && (var1 <= (((this.field2737 << 6) + (this.field2741 << 3)) + 7))) && (var2 >= ((this.field2743 << 6) + (this.field2742 << 3)))) && (var2 <= (((this.field2743 << 6) + (this.field2742 << 3)) + 7));
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(IIII)[I", garbageValue = 
	"-604533765")

	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{ (var2 + ((this.field2737 * 64) - (this.field2733 * 64))) + ((this.field2741 * 8) - (this.field2739 * 8)), (var3 + ((this.field2743 * 64) - (this.field2738 * 64))) + ((this.field2742 * 8) - (this.field2740 * 8)) };
			return var4;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(III)Lko;", garbageValue = 
	"-41254697")

	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = (((this.field2733 * 64) - (this.field2737 * 64)) + ((this.field2739 * 8) - (this.field2741 * 8))) + var1;
			int var4 = (var2 + ((this.field2738 * 64) - (this.field2743 * 64))) + ((this.field2740 * 8) - (this.field2742 * 8));
			return new Coord(this.field2736, var3, var4);
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;B)V", garbageValue = 
	"119")

	@Export("read")
	public void read(Buffer var1) {
		this.field2736 = var1.readUnsignedByte();
		this.field2734 = var1.readUnsignedByte();
		this.field2733 = var1.readUnsignedShort();
		this.field2739 = var1.readUnsignedByte();
		this.field2738 = var1.readUnsignedShort();
		this.field2740 = var1.readUnsignedByte();
		this.field2737 = var1.readUnsignedShort();
		this.field2741 = var1.readUnsignedByte();
		this.field2743 = var1.readUnsignedShort();
		this.field2742 = var1.readUnsignedByte();
		this.method4870();
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"48")

	void method4870() {
	}
}