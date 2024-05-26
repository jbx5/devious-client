import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("at")
public enum class6 implements Enum {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lat;"
	)
	field15(0, 0);

	@ObfuscatedName("wm")
	@ObfuscatedSignature(
		descriptor = "Ltb;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -504213815
	)
	final int field12;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 234575775
	)
	final int field13;

	class6(int var3, int var4) {
		this.field12 = var3;
		this.field13 = var4;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-311400525"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field13;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "66"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9';
	}
}
