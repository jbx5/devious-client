import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("ak")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lso;Lso;I)I",
		garbageValue = "-1683934789"
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-923319002"
	)
	public static void method2989() {
		VarcInt.VarcInt_cached.clear();
	}
}
