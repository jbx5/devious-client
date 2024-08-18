import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("ab")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lsc;Lsc;I)I",
		garbageValue = "-1496538344"
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1582841826"
	)
	static final int method3089(int var0, int var1) {
		int var2 = var0 + var1 * 57;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 255;
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lkl;",
		garbageValue = "91"
	)
	static RouteStrategy method3097(int var0, int var1) {
		Client.field741.approxDestinationX = var0;
		Client.field741.approxDestinationY = var1;
		Client.field741.approxDestinationSizeX = 1;
		Client.field741.approxDestinationSizeY = 1;
		return Client.field741;
	}
}
