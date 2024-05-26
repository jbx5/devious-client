import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("gn")
	@ObfuscatedGetter(
		intValue = 1565926211
	)
	static int field1520;
	@ObfuscatedName("ak")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lso;Lso;I)I",
		garbageValue = "1604250082"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.rank != var1.rank) {
			return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Lfk;",
		garbageValue = "992074618"
	)
	static class131 method3011(int var0) {
		class131[] var1 = new class131[]{class131.field1570, class131.field1566, class131.field1573, class131.field1568, class131.field1569};
		class131 var2 = (class131)MenuAction.findEnumerated(var1, var0);
		if (var2 == null) {
			var2 = class131.field1570;
		}

		return var2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Lfo;",
		garbageValue = "1041375441"
	)
	static class141 method3009(int var0) {
		class141 var2 = HealthBar.method2651(var0);
		int var1;
		if (var2 == null) {
			var1 = 2;
		} else {
			var1 = var2.method3149() ? 0 : 1;
		}

		return var1 != 0 ? null : HealthBar.method2651(var0);
	}
}
