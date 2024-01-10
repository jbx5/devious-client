import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
public class class126 {
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	static Bounds field1486;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1051106761
	)
	int field1483;
	@ObfuscatedName("ap")
	float field1480;
	@ObfuscatedName("af")
	float field1482;
	@ObfuscatedName("aj")
	float field1479;
	@ObfuscatedName("aq")
	float field1481;
	@ObfuscatedName("ar")
	float field1484;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	class126 field1485;

	class126() {
		this.field1482 = Float.MAX_VALUE;
		this.field1479 = Float.MAX_VALUE;
		this.field1481 = Float.MAX_VALUE;
		this.field1484 = Float.MAX_VALUE;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;II)V",
		garbageValue = "-617971224"
	)
	void method3009(Buffer var1, int var2) {
		this.field1483 = var1.readShort();
		this.field1480 = var1.method9394();
		this.field1482 = var1.method9394();
		this.field1479 = var1.method9394();
		this.field1481 = var1.method9394();
		this.field1484 = var1.method9394();
	}

	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "48"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop;
	}
}
