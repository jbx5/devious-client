import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qn")
@Implements("Ignored")
public class Ignored extends User {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1713746187
	)
	@Export("id")
	int id;

	Ignored() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lqn;I)I",
		garbageValue = "-315070761"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lqe;B)I",
		garbageValue = "114"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareTo_ignored((Ignored)var1);
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([BI)[I",
		garbageValue = "-957986123"
	)
	public static int[] method8066(byte[] var0) {
		if (var0 != null && var0.length != 0 && var0.length <= 8) {
			int[] var1 = new int[var0.length];

			for (int var2 = 0; var2 < var0.length; ++var2) {
				if (var0[var2] < 0 || var0[var2] > class538.field5229.length) {
					return null;
				}

				var1[var2] = class538.field5229[var0[var2]];
			}

			return var1;
		} else {
			return null;
		}
	}
}
