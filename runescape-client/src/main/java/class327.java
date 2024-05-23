import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mg")
public class class327 {
	@ObfuscatedName("ak")
	static int[] field3565;
	@ObfuscatedName("al")
	@Export("FileSystem_cacheDir")
	static File FileSystem_cacheDir;
	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	static Archive field3564;

	static {
		new Object();
		field3565 = new int[33];
		field3565[0] = 0;
		int var0 = 2;

		for (int var1 = 1; var1 < 33; ++var1) {
			field3565[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-106"
	)
	public static int method6223(int var0) {
		return var0 >> 17 & 7;
	}
}
