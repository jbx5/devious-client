import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mr")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -536753651
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1062897029
	)
	@Export("x")
	public int x;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1689417395
	)
	@Export("y")
	public int y;

	@ObfuscatedSignature(
		descriptor = "(Lmr;)V"
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1164685435"
	)
	@Export("packed")
	public int packed() {
		return class492.method8812(this.plane, this.x, this.y);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lmr;I)Z",
		garbageValue = "916547059"
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
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "16"
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
