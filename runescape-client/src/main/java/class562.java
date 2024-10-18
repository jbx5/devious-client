import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ve")
public class class562 implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lve;"
	)
	public static final class562 field5522;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lve;"
	)
	public static final class562 field5517;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lve;"
	)
	static final class562 field5521;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lve;"
	)
	static final class562 field5520;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lve;"
	)
	static final class562 field5516;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lve;"
	)
	static final class562 field5519;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -290706789
	)
	final int field5518;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1743514517
	)
	final int field5523;

	static {
		field5522 = new class562(4, 0);
		field5517 = new class562(3, 2);
		field5521 = new class562(2, 5);
		field5520 = new class562(5, 6);
		field5516 = new class562(0, 7);
		field5519 = new class562(1, 8);
	}

	class562(int var1, int var2) {
		this.field5518 = var1;
		this.field5523 = var2;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-29"
	)
	public boolean method10413() {
		return this == field5517;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1837624059"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5523;
	}
}
