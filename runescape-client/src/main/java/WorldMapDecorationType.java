import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kc")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	field3572(0, 0),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	field3571(1, 0),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	field3561(2, 0),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	field3563(3, 0),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	field3583(9, 2),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	field3564(4, 1),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	field3565(5, 1),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	field3580(6, 1),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	field3562(7, 1),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	field3568(8, 1),
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	field3569(12, 2),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	field3574(13, 2),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	field3567(14, 2),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	field3570(15, 2),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	field3573(16, 2),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	field3566(17, 2),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	field3559(18, 2),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	field3576(19, 2),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	field3577(20, 2),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	field3578(21, 2),
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	field3579(10, 2),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	field3560(11, 2),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	field3581(22, 3);

	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -401413117
	)
	@Export("id")
	public final int id;

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	WorldMapDecorationType(int var3, int var4) {
		this.id = var3; // L: 34
	} // L: 35

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 39
	}
}
