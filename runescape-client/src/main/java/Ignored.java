import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ng")
@Implements("Ignored")
public class Ignored extends User {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1587700263
	)
	@Export("id")
	int id;

	Ignored() {
	} // L: 6

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lng;I)I",
		garbageValue = "-1633511303"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id; // L: 9
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lnc;I)I",
		garbageValue = "-1401768476"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareTo_ignored((Ignored)var1); // L: 13
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1); // L: 17
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "31135"
	)
	public static void method6968() {
		DbTableType.DBTableType_cache.clear(); // L: 67
	} // L: 68
}
