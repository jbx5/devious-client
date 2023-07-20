import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("as")
public final class class4 {
	@ObfuscatedName("ua")
	@ObfuscatedGetter(
		intValue = -1085545727
	)
	static int field11;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	static IndexedSprite field10;

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "67"
	)
	static final int method18(int var0) {
		return Math.abs(var0 - class456.cameraYaw) > 1024 ? 2048 * (var0 < class456.cameraYaw ? 1 : -1) + var0 : var0;
	}
}
