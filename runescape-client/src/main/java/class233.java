import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iu")
public enum class233 implements Enum {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	field2488((byte)-1),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	field2483((byte)0),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	field2486((byte)1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	field2485((byte)2);

	@ObfuscatedName("vn")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("an")
	public byte field2482;

	class233(byte var3) {
		this.field2482 = var3;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "800883718"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field2482;
	}
}
