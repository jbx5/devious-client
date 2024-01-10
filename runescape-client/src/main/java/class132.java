import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
public class class132 implements Enum {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	static final class132 field1555;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	static final class132 field1553;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	static final class132 field1554;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	static final class132 field1560;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	static final class132 field1556;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	static final class132 field1561;
	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	static Task field1563;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1569709707
	)
	final int field1558;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1331409345
	)
	final int field1559;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 2076256283
	)
	final int field1557;

	static {
		field1555 = new class132(0, 0, (String)null, 0);
		field1553 = new class132(1, 1, (String)null, 9);
		field1554 = new class132(2, 2, (String)null, 3);
		field1560 = new class132(3, 3, (String)null, 6);
		field1556 = new class132(4, 4, (String)null, 1);
		field1561 = new class132(5, 5, (String)null, 3);
	}

	class132(int var1, int var2, String var3, int var4) {
		this.field1558 = var1;
		this.field1559 = var2;
		this.field1557 = var4;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-884190501"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1559;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1760796725"
	)
	int method3117() {
		return this.field1557;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)I",
		garbageValue = "340165408"
	)
	static int method3116(Widget var0) {
		if (var0.type != 11) {
			--class211.Interpreter_stringStackSize;
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var0.method6712(var1);
			return 1;
		}
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(B)Ltc;",
		garbageValue = "0"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return GrandExchangeOfferUnitPriceComparator.worldMap;
	}
}
