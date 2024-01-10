import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
public enum class89 implements Enum {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	field1082(0, -1),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	field1079(1, 1),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	field1080(2, 7),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	field1085(3, 8),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	field1078(4, 9);

	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1609838865
	)
	final int field1083;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1619368997
	)
	final int field1084;

	class89(int var3, int var4) {
		this.field1083 = var3;
		this.field1084 = var4;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-884190501"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1084;
	}

	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1156583698"
	)
	static final int method2378() {
		float var0 = 200.0F * ((float)class93.clientPreferences.getBrightness() - 0.5F);
		return 100 - Math.round(var0);
	}
}
