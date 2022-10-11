import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
@Implements("UserComparator10")
public class UserComparator10 extends AbstractUserComparator {
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -13271251
	)
	static int field1393;
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("er")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	@Export("archive19")
	static Archive archive19;
	@ObfuscatedName("c")
	@Export("reversed")
	final boolean reversed;

	public UserComparator10(boolean var1) {
		this.reversed = var1; // L: 11
	} // L: 12

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnr;Lnr;I)I",
		garbageValue = "-1298946916"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) { // L: 15
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 16
		} else {
			return this.compareUser(var1, var2); // L: 18
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 22
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZB)I",
		garbageValue = "80"
	)
	static int method2782(int var0, Script var1, boolean var2) {
		return 2; // L: 2678
	}

	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "(I)Lpi;",
		garbageValue = "-1585871942"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return Decimator.worldMap; // L: 707
	}
}
