import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
public class class130 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -408274121
	)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -345198087
	)
	int field1526;
	@ObfuscatedName("ad")
	float field1527;
	@ObfuscatedName("ag")
	float field1528;
	@ObfuscatedName("ak")
	float field1529;
	@ObfuscatedName("ap")
	float field1535;
	@ObfuscatedName("an")
	float field1531;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	class130 field1532;

	class130() {
		this.field1528 = Float.MAX_VALUE;
		this.field1529 = Float.MAX_VALUE;
		this.field1535 = Float.MAX_VALUE;
		this.field1531 = Float.MAX_VALUE;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;II)V",
		garbageValue = "-115750084"
	)
	void method3052(Buffer var1, int var2) {
		this.field1526 = var1.readShort();
		this.field1527 = var1.method9565();
		this.field1528 = var1.method9565();
		this.field1529 = var1.method9565();
		this.field1535 = var1.method9565();
		this.field1531 = var1.method9565();
	}
}
