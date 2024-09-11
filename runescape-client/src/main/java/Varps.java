import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("no")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("ac")
	@Export("Varps_masks")
	static int[] Varps_masks;
	@ObfuscatedName("ag")
	@Export("Varps_temp")
	public static int[] Varps_temp;
	@ObfuscatedName("am")
	@Export("Varps_main")
	public static int[] Varps_main;

	static {
		Varps_masks = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			Varps_masks[var1] = var0 - 1;
			var0 += var0;
		}

		Varps_temp = new int[5000];
		Varps_main = new int[5000];
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IS)F",
		garbageValue = "10147"
	)
	public static float method6780(int var0) {
		var0 &= 16383;
		return (float)((double)((float)var0) * 3.834951969714103E-4D);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZI)[B",
		garbageValue = "1487021364"
	)
	public static byte[] method6779(Object var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var6 = (byte[])((byte[])var0);
			if (var1) {
				int var4 = var6.length;
				byte[] var5 = new byte[var4];
				System.arraycopy(var6, 0, var5, 0, var4);
				return var5;
			} else {
				return var6;
			}
		} else if (var0 instanceof AbstractByteArrayCopier) {
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0;
			return var2.get();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
