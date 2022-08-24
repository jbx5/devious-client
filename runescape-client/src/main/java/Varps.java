import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ka")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("s")
	@Export("Varps_masks")
	static int[] Varps_masks = new int[32];

	@ObfuscatedName("h")
	@Export("Varps_temp")
	public static int[] Varps_temp;

	@ObfuscatedName("w")
	@Export("Varps_main")
	public static int[] Varps_main;

	static {
		int var0 = 2;
		for (int var1 = 0; var1 < 32; ++var1) {
			Varps_masks[var1] = var0 - 1;
			var0 += var0;
		}
		Varps_temp = new int[4000];
		Varps_main = new int[4000];
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(IIB)Lbz;", garbageValue = "8")
	static Script method5465(int var0, int var1) {
		Script var2 = ((Script) (Script.Script_cached.get(((long) (var0 << 16)))));
		if (var2 != null) {
			return var2;
		} else {
			String var3 = String.valueOf(var0);
			int var4 = SequenceDefinition.archive12.getGroupId(var3);
			if (var4 == -1) {
				return null;
			} else {
				byte[] var5 = SequenceDefinition.archive12.takeFileFlat(var4);
				if (var5 != null) {
					if (var5.length <= 1) {
						return null;
					}
					var2 = class21.newScript(var5);
					if (var2 != null) {
						Script.Script_cached.put(var2, ((long) (var0 << 16)));
						return var2;
					}
				}
				return null;
			}
		}
	}
}