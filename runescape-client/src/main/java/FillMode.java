import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("qe")
@Implements("FillMode")
public enum FillMode implements MouseWheel {

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lqe;")
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lqe;")
	field4785(1, 1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lqe;")
	field4783(2, 2);
	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 954203293)
	public final int field4786;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -1777591163)
	final int field4784;

	FillMode(int var3, int var4) {
		this.field4786 = var3;
		this.field4784 = var4;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1790946346")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4784;
	}
}