import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sj")
@Implements("Ignored")
public class Ignored extends User {
	@ObfuscatedName("nn")
	@ObfuscatedGetter(
		intValue = 1281330719
	)
	@Export("menuY")
	static int menuY;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1307489943
	)
	@Export("id")
	int id;

	Ignored() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lsj;I)I",
		garbageValue = "-1992627858"
	)
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lsg;I)I",
		garbageValue = "-1406397913"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareTo_ignored((Ignored)var1);
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored((Ignored)var1);
	}
}
