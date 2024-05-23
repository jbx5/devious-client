import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements Enum {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	field2171(2, 0),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(0, 1),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lie;"
	)
	field2169(1, 2);

	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -574374745
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1906955675
	)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-311400525"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1466610076"
	)
	static void method4030() {
		ParamComposition.updateLoginIndex(24);
		WorldMapSection2.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", "");
	}
}
