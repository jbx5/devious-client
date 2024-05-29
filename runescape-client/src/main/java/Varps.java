import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nm")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("ak")
	@Export("Varps_masks")
	static int[] Varps_masks;
	@ObfuscatedName("aj")
	@Export("Varps_temp")
	public static int[] Varps_temp;
	@ObfuscatedName("az")
	@Export("Varps_main")
	public static int[] Varps_main;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	static IndexedSprite field3710;
	@ObfuscatedName("up")
	@ObfuscatedGetter(
		intValue = -747937664
	)
	static int field3707;

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
}
