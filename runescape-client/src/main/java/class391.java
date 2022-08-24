import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("op")
public enum class391 implements MouseWheel {

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lop;")
	field4428(0, 1),
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Lop;")
	field4422(2, 2),
	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lop;")
	field4423(3, 3),
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lop;")
	field4421(1, 10);
	@ObfuscatedName("ah")
	@Export("hasFocus")
	protected static boolean hasFocus;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 638529671)
	final int field4424;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -127163675)
	final int field4426;

	class391(int var3, int var4) {
		this.field4424 = var3;
		this.field4426 = var4;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "104")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4426;
	}
}