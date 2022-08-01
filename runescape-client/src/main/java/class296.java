import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("kg")
public enum class296 implements MouseWheel {

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lkg;")
	field3533(0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lkg;")
	field3534(1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lkg;")
	field3530(2),
	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lkg;")
	field3531(3),
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lkg;")
	field3532(4);
	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -178082109)
	final int field3535;

	class296(int var3) {
		this.field3535 = var3;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1790946346")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3535;
	}
}