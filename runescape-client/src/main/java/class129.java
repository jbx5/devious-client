import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
public class class129 {
	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "[Lvb;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1632075363
	)
	int field1507;
	@ObfuscatedName("ay")
	float field1501;
	@ObfuscatedName("an")
	float field1502;
	@ObfuscatedName("au")
	float field1503;
	@ObfuscatedName("ax")
	float field1504;
	@ObfuscatedName("ao")
	float field1505;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Leg;"
	)
	class129 field1500;

	class129() {
		this.field1502 = Float.MAX_VALUE;
		this.field1503 = Float.MAX_VALUE;
		this.field1504 = Float.MAX_VALUE;
		this.field1505 = Float.MAX_VALUE;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvg;IB)V",
		garbageValue = "-114"
	)
	void method3111(Buffer var1, int var2) {
		this.field1507 = var1.readShort();
		this.field1501 = var1.method9614();
		this.field1502 = var1.method9614();
		this.field1503 = var1.method9614();
		this.field1504 = var1.method9614();
		this.field1505 = var1.method9614();
	}
}
