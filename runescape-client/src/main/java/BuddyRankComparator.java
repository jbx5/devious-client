import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1111006345
	)
	static int field1396;
	@ObfuscatedName("fk")
	@ObfuscatedGetter(
		intValue = -54248331
	)
	@Export("currentPort")
	static int currentPort;
	@ObfuscatedName("c")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnr;Lnr;I)I",
		garbageValue = "1824850774"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.rank != var1.rank) { // L: 14
			return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "-168568172"
	)
	public static byte[] method2790(byte[] var0) {
		int var1 = var0.length; // L: 22
		byte[] var2 = new byte[var1]; // L: 23
		System.arraycopy(var0, 0, var2, 0, var1); // L: 24
		return var2; // L: 25
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	public static boolean method2791(int var0) {
		return var0 >= WorldMapDecorationType.field3579.id && var0 <= WorldMapDecorationType.field3560.id; // L: 47
	}
}
