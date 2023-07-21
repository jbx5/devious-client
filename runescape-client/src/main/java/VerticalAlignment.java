import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements MouseWheel {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2046(0, 0),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(2, 1),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	field2045(1, 2);

	@ObfuscatedName("wk")
	@ObfuscatedGetter(
		longValue = -3870115189330449071L
	)
	static long field2049;
	@ObfuscatedName("ty")
	@ObfuscatedSignature(
		descriptor = "Lbk;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1128563287
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2111203505
	)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1644350448"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
