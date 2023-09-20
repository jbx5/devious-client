import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mo")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("ap")
	public static short[] field3572;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1564194149
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -550079985
	)
	@Export("x")
	public int x;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1195177655
	)
	@Export("y")
	public int y;

	@ObfuscatedSignature(
		descriptor = "(Lmo;)V"
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2125169401"
	)
	@Export("packed")
	public int packed() {
		return Player.method2411(this.plane, this.x, this.y);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lmo;I)Z",
		garbageValue = "467966647"
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-211582088"
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
}
