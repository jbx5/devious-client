import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nv")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -557937039
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1908230263
	)
	@Export("x")
	public int x;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1467490479
	)
	@Export("y")
	public int y;

	@ObfuscatedSignature(
		descriptor = "(Lnv;)V"
	)
	public Coord(Coord var1) {
		this.plane = var1.plane;
		this.x = var1.x;
		this.y = var1.y;
	}

	public Coord(int var1, int var2, int var3) {
		this.plane = var1;
		this.x = var2;
		this.y = var3;
	}

	public Coord(int var1) {
		if (var1 == -1) {
			this.plane = -1;
		} else {
			this.plane = var1 >> 28 & 3;
			this.x = var1 >> 14 & 16383;
			this.y = var1 & 16383;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "381623486"
	)
	@Export("packed")
	public int packed() {
		return method6504(this.plane, this.x, this.y);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lnv;B)Z",
		garbageValue = "20"
	)
	@Export("equalsCoord")
	boolean equalsCoord(Coord var1) {
		if (this.plane != var1.plane) {
			return false;
		} else if (this.x != var1.x) {
			return false;
		} else {
			return this.y == var1.y;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-169299092"
	)
	@Export("toString")
	String toString(String var1) {
		return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63);
	}

	public boolean equals(Object var1) {
		if (this == var1) {
			return true;
		} else {
			return !(var1 instanceof Coord) ? false : this.equalsCoord((Coord)var1);
		}
	}

	public int hashCode() {
		return this.packed();
	}

	public String toString() {
		return this.toString(",");
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "158958770"
	)
	public static int method6504(int var0, int var1, int var2) {
		return var0 << 28 | var1 << 14 | var2;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1822344311"
	)
	public static int method6505(int var0) {
		return var0 >> 28;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "33"
	)
	public static int method6506(int var0) {
		return var0 >> 14 & 16383;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-301557704"
	)
	public static int method6507(int var0) {
		return var0 & 16383;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-17"
	)
	public static int method6512(int var0) {
		return var0 >> 3;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1037824649"
	)
	public static int method6531(int var0) {
		return var0 << 3;
	}
}
