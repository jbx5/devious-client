import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
public enum class138 implements MouseWheel {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	field1635(0, 0),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	field1633(1, 1),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	field1634(2, 2),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	field1638(3, 3),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	field1636(4, 4),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	field1637(5, 5),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	field1632(6, 6),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	field1639(7, 7),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	field1640(8, 8);

	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = 1742355953
	)
	static int field1643;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 360150709
	)
	final int field1641;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1042578959
	)
	final int field1642;

	class138(int var3, int var4) {
		this.field1641 = var3;
		this.field1642 = var4;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "41"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1642;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Lhd;",
		garbageValue = "-2092352148"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0);
	}
}
