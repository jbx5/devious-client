import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nn")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 117039165
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1601399073
	)
	@Export("x")
	public int x;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1982010185
	)
	@Export("y")
	public int y;

	@ObfuscatedSignature(
		descriptor = "(Lnn;)V"
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

	public Coord() {
		this.plane = -1;
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "54"
	)
	public void method6842(int var1) {
		if (var1 == -1) {
			this.plane = -1;
		} else {
			this.plane = var1 >> 28 & 3;
			this.x = var1 >> 14 & 16383;
			this.y = var1 & 16383;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1667386076"
	)
	@Export("packed")
	public int packed() {
		return method6849(this.plane, this.x, this.y);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2043487038"
	)
	public int method6848() {
		return method6849(this.plane, this.x >> 13, this.y >> 13);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-57"
	)
	public void method6881(int var1, int var2, int var3) {
		int var4 = var1 >> 14 & 255;
		int var5 = var1 & 255;
		this.plane = var1 >> 28;
		this.x = (var4 << 13) + var2;
		this.y = var3 + (var5 << 13);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)Z",
		garbageValue = "-1806576163"
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "2133081217"
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-274710312"
	)
	public static int method6849(int var0, int var1, int var2) {
		return var0 << 28 | var1 << 14 | var2;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-739043109"
	)
	public static int method6862(int var0) {
		return var0 >> 28;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "87"
	)
	public static int method6845(int var0) {
		return var0 >> 14 & 16383;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1197838969"
	)
	public static int method6882(int var0) {
		return var0 & 16383;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "49"
	)
	public static int method6852(int var0) {
		return var0 << 3;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-910235717"
	)
	public static int method6853(int var0) {
		return var0 << 7;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "398338174"
	)
	public static int method6854(int var0) {
		return (var0 << 7) + 64;
	}
}
