import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nn")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 2091700133
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1081214275
	)
	@Export("x")
	public int x;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1464789173
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

	public Coord(int var1) {
		if (var1 == -1) {
			this.plane = -1;
		} else {
			this.plane = var1 >> 28 & 3;
			this.x = var1 >> 14 & 16383;
			this.y = var1 & 16383;
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "804057570"
	)
	@Export("packed")
	public int packed() {
		return Actor.method2392(this.plane, this.x, this.y);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)Z",
		garbageValue = "655102500"
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
		descriptor = "(Ljava/lang/String;S)Ljava/lang/String;",
		garbageValue = "503"
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lcn;",
		garbageValue = "939558819"
	)
	@Export("Messages_getMessage")
	static Message Messages_getMessage(int var0) {
		return (Message)Messages.Messages_hashTable.get((long)var0);
	}
}
