import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vg")
public class class555 implements Enum {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	public static final class555 field5472;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	public static final class555 field5467;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	static final class555 field5468;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	static final class555 field5469;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	static final class555 field5470;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	static final class555 field5471;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1502251435
	)
	final int field5473;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 656207155
	)
	final int field5466;

	static {
		field5472 = new class555(3, 0);
		field5467 = new class555(1, 2);
		field5468 = new class555(2, 5);
		field5469 = new class555(4, 6);
		field5470 = new class555(5, 7);
		field5471 = new class555(0, 8);
	}

	class555(int var1, int var2) {
		this.field5473 = var1;
		this.field5466 = var2;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-350930589"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5466;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-4"
	)
	public boolean method10223() {
		return this == field5467;
	}
}
