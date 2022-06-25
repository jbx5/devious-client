import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("kr")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("c")
	@Export("Varps_masks")
	static int[] Varps_masks;

	@ObfuscatedName("v")
	@Export("Varps_temp")
	public static int[] Varps_temp;

	@ObfuscatedName("q")
	@Export("Varps_main")
	public static int[] Varps_main;

	static {
		Varps_masks = new int[32];
		int var0 = 2;
		for (int var1 = 0; var1 < 32; ++var1) {
			Varps_masks[var1] = var0 - 1;
			var0 += var0;
		}
		Varps_temp = new int[4000];
		Varps_main = new int[4000];
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/Object;ZB)[B", garbageValue = "74")
	public static byte[] method5530(Object var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var3 = ((byte[]) ((byte[]) (var0)));
			return var1 ? MusicPatch.method5432(var3) : var3;
		} else if (var0 instanceof AbstractByteArrayCopier) {
			AbstractByteArrayCopier var2 = ((AbstractByteArrayCopier) (var0));
			return var2.get();
		} else {
			throw new IllegalArgumentException();
		}
	}
}