import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oy")
public class class372 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	static final class372 field4069;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	static final class372 field4065;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Loy;"
	)
	static final class372[] field4067;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1370579203
	)
	final int field4066;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -382716461
	)
	final int field4068;

	static {
		field4069 = new class372(51, 27, class376.field4110, Coord.method6489(0), Coord.method6489(2), Coord.method6489(2));
		field4065 = new class372(25, 28, class376.field4110, Coord.method6489(82), Coord.method6489(5), Coord.method6489(5));
		field4067 = method7070();
	}

	class372(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field4066 = var5;
		this.field4068 = var6;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)[Loy;",
		garbageValue = "-69"
	)
	static class372[] method7070() {
		return new class372[]{field4069, field4065};
	}
}
