import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	static IndexedSprite field1506;
	@ObfuscatedName("ns")
	@ObfuscatedGetter(
		intValue = -1236472029
	)
	@Export("menuY")
	static int menuY;
	@ObfuscatedName("aq")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lsh;Lsh;I)I",
		garbageValue = "1637037113"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) {
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(DDII)[D",
		garbageValue = "-1504286701"
	)
	public static double[] method3018(double var0, double var2, int var4) {
		int var5 = var4 * 2 + 1;
		double[] var6 = new double[var5];
		int var7 = -var4;

		for (int var8 = 0; var7 <= var4; ++var8) {
			var6[var8] = WorldMapArea.method4698((double)var7, var0, var2);
			++var7;
		}

		return var6;
	}
}
