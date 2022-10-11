import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
public enum class83 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	field1078(0, -1),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	field1073(1, 2),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	field1074(2, 3),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	field1075(3, 4),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	field1076(4, 5),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	field1077(5, 6);

	@ObfuscatedName("rp")
	@ObfuscatedSignature(
		descriptor = "Led;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;
	@ObfuscatedName("g")
	@Export("Widget_loadedInterfaces")
	public static boolean[] Widget_loadedInterfaces;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	static Archive field1081;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -407710019
	)
	final int field1079;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1377684863
	)
	final int field1072;

	class83(int var3, int var4) {
		this.field1079 = var3; // L: 21
		this.field1072 = var4; // L: 22
	} // L: 23

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1072; // L: 27
	}
}
