import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
public class class135 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	static final class135 field1589;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	static final class135 field1586;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	static final class135 field1580;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	static final class135 field1583;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	static final class135 field1584;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	static final class135 field1585;
	@ObfuscatedName("cd")
	@Export("otp")
	static String otp;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 638022835
	)
	final int field1581;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1766087381
	)
	final int field1587;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2121333725
	)
	final int field1588;

	static {
		field1589 = new class135(0, 0, (String)null, 0);
		field1586 = new class135(1, 1, (String)null, 9);
		field1580 = new class135(2, 2, (String)null, 3);
		field1583 = new class135(3, 3, (String)null, 6);
		field1584 = new class135(4, 4, (String)null, 1);
		field1585 = new class135(5, 5, (String)null, 3);
	}

	class135(int var1, int var2, String var3, int var4) {
		this.field1581 = var1;
		this.field1587 = var2;
		this.field1588 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "111"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1587;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "970705422"
	)
	int method3223() {
		return this.field1588;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(CLpg;B)I",
		garbageValue = "0"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var2 = (var0 << 4) + 1;
		}

		if (var0 == 241 && var1 == Language.Language_ES) {
			var2 = 1762;
		}

		return var2;
	}
}
