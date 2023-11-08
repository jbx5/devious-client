import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
public class class126 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1046447911
	)
	int field1477;
	@ObfuscatedName("ah")
	float field1478;
	@ObfuscatedName("ar")
	float field1480;
	@ObfuscatedName("ao")
	float field1483;
	@ObfuscatedName("ab")
	float field1481;
	@ObfuscatedName("au")
	float field1482;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	class126 field1479;

	class126() {
		this.field1480 = Float.MAX_VALUE;
		this.field1483 = Float.MAX_VALUE;
		this.field1481 = Float.MAX_VALUE;
		this.field1482 = Float.MAX_VALUE;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luj;IB)V",
		garbageValue = "116"
	)
	void method3023(Buffer var1, int var2) {
		this.field1477 = var1.readShort();
		this.field1478 = var1.method9268();
		this.field1480 = var1.method9268();
		this.field1483 = var1.method9268();
		this.field1481 = var1.method9268();
		this.field1482 = var1.method9268();
	}
}
