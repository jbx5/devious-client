import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lt")
public class class303 {
	@ObfuscatedName("au")
	static int[] field3386;

	static {
		new Object();
		field3386 = new int[33];
		field3386[0] = 0;
		int var0 = 2;

		for (int var1 = 1; var1 < 33; ++var1) {
			field3386[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[Laz;",
		garbageValue = "-2002695578"
	)
	public static class6[] method5741() {
		return new class6[]{class6.field19};
	}
}
