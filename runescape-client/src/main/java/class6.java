import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
public enum class6 implements MouseWheel {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	field22(0, 0);

	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1017770969
	)
	final int field20;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1367799773
	)
	final int field19;

	class6(int var3, int var4) {
		this.field20 = var3;
		this.field19 = var4;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1644350448"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field19;
	}

	@ObfuscatedName("as")
	public static int method44(long var0) {
		return (int)(var0 >>> 14 & 3L);
	}
}
