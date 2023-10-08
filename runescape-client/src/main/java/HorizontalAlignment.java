import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hb")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements MouseWheel {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lhb;"
	)
	field2032(1, 0),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lhb;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(0, 1),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lhb;"
	)
	field2027(2, 2);

	@ObfuscatedName("gj")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static Archive field2028;
	@ObfuscatedName("jf")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -328609999
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -507682681
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1243971674"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
