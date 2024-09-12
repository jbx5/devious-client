import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("st")
@Implements("Ignored")
public class Ignored extends User {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1539892605
	)
	static int field4993;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 307366565
	)
	@Export("id")
	int id;

	Ignored() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lst;I)I",
		garbageValue = "-1030181960"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lss;S)I",
		garbageValue = "151"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareTo_ignored((Ignored)var1);
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)[Lsv;",
		garbageValue = "-1902375311"
	)
	static class488[] method8979() {
		return new class488[]{class488.field5074, class488.field5077, class488.field5072, class488.field5071};
	}
}
