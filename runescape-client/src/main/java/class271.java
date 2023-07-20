import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kx")
public class class271 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	static final class271 field3021;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	static final class271 field3017;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1656058953
	)
	@Export("value")
	final int value;

	static {
		field3021 = new class271(0);
		field3017 = new class271(1);
	}

	class271(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "25"
	)
	static final int method5517(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}
}
