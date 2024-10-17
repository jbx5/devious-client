import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hi")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lhi;"
	)
	field1990(1, 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lhi;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(2, 1),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lhi;"
	)
	field1989(0, 2);

	@ObfuscatedName("gd")
	@ObfuscatedGetter(
		intValue = -760675889
	)
	@Export("currentPort")
	static int currentPort;
	@ObfuscatedName("us")
	@ObfuscatedGetter(
		intValue = -540479249
	)
	static int field1997;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1050399395
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1346706139
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1837624059"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lpe;I)V",
		garbageValue = "2121332038"
	)
	public static void method3987(AbstractArchive var0) {
		FloorOverlayDefinition.FloorOverlayDefinition_archive = var0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "1"
	)
	public static boolean method3988(int var0) {
		return (var0 >> 20 & 1) != 0;
	}
}
