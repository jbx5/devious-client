import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vj")
public class class550 implements Enum {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	public static final class550 field5403;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	public static final class550 field5396;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	static final class550 field5402;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	static final class550 field5398;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	static final class550 field5399;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	static final class550 field5400;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1018796563
	)
	final int field5401;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -652509963
	)
	final int field5397;

	static {
		field5403 = new class550(5, 0);
		field5396 = new class550(4, 2);
		field5402 = new class550(1, 5);
		field5398 = new class550(3, 6);
		field5399 = new class550(2, 7);
		field5400 = new class550(0, 8);
	}

	class550(int var1, int var2) {
		this.field5401 = var1;
		this.field5397 = var2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-311400525"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5397;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "833793152"
	)
	public boolean method9939() {
		return this == field5396;
	}
}
