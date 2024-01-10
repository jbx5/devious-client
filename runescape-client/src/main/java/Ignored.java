import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ru")
@Implements("Ignored")
public class Ignored extends User {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1657208759
	)
	@Export("id")
	int id;

	Ignored() {
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lru;I)I",
		garbageValue = "497005894"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lrq;B)I",
		garbageValue = "111"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareTo_ignored((Ignored)var1);
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1);
	}
}
