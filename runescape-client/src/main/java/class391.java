import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("ok")
public enum class391 implements MouseWheel {

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lok;")
	field4433(2, 1),
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lok;")
	field4428(3, 2),
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lok;")
	field4430(1, 3),
	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lok;")
	field4431(0, 10);
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -954542115)
	final int field4432;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -331698987)
	final int field4429;

	class391(int var3, int var4) {
		this.field4432 = var3;
		this.field4429 = var4;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1790946346")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4429;
	}
}