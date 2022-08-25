import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("nv")
@Implements("Ignored")
public class Ignored extends User {
	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lkn;")
	@Export("scriptActiveWidget")
	static Widget scriptActiveWidget;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 410982667)
	@Export("id")
	int id;

	Ignored() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lnv;I)I", garbageValue = "2045269019")
	@Export("compareTo_ignored")
	int compareTo_ignored(Ignored var1) {
		return this.id - var1.id;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Lnb;I)I", garbageValue = "1550816169")
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareTo_ignored(((Ignored) (var1)));
	}

	public int compareTo(Object var1) {
		return this.compareTo_ignored(((Ignored) (var1)));
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1092263394")
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		Client.menuActions[0] = "Cancel";
		Client.menuTargets[0] = "";
		Client.menuOpcodes[0] = 1006;
		Client.menuShiftClick[0] = false;
		Client.menuOptionsCount = 1;
	}
}