import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("kz")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements MouseWheel {

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lkz;")
	field3532(0, 0),
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Lkz;")
	field3529(1, 0),
	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lkz;")
	field3523(2, 0),
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lkz;")
	field3531(3, 0),
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lkz;")
	field3520(9, 2),
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lkz;")
	field3519(4, 1),
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "Lkz;")
	field3524(5, 1),
	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "Lkz;")
	field3525(6, 1),
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lkz;")
	field3535(7, 1),
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "Lkz;")
	field3527(8, 1),
	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "Lkz;")
	field3528(12, 2),
	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "Lkz;")
	field3521(13, 2),
	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "Lkz;")
	field3530(14, 2),
	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lkz;")
	field3540(15, 2),
	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "Lkz;")
	field3522(16, 2),
	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "Lkz;")
	field3518(17, 2),
	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "Lkz;")
	field3534(18, 2),
	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "Lkz;")
	field3533(19, 2),
	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "Lkz;")
	field3536(20, 2),
	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "Lkz;")
	field3537(21, 2),
	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "Lkz;")
	field3538(10, 2),
	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "Lkz;")
	field3539(11, 2),
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lkz;")
	field3526(22, 3);
	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = -1322889823)
	@Export("id")
	public final int id;

	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "0")
	WorldMapDecorationType(int var3, int var4) {
		this.id = var3;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "104")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}