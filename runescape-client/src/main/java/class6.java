import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("s")
public enum class6 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ls;"
	)
	field19(0, 0);

	@ObfuscatedName("gp")
	@ObfuscatedGetter(
		longValue = -1719458249049383535L
	)
	static long field16;
	@ObfuscatedName("hk")
	@ObfuscatedGetter(
		intValue = -1990401303
	)
	static int field17;
	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "[Lqi;"
	)
	@Export("headIconPkSprites")
	static SpritePixels[] headIconPkSprites;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -919765491
	)
	final int field14;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -419063355
	)
	final int field15;

	class6(int var3, int var4) {
		this.field14 = var3; // L: 16
		this.field15 = var4; // L: 17
	} // L: 18

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field15; // L: 22
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Date;B)Z",
		garbageValue = "124"
	)
	static boolean method50(Date var0) {
		Date var1 = class136.method3074(); // L: 1089
		return var0.after(var1); // L: 1090
	}
}
