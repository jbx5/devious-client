import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sr")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	static final DefaultsGroup field4992;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	static final DefaultsGroup field4991;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1770343747
	)
	@Export("group")
	final int group;

	static {
		field4992 = new DefaultsGroup(1);
		field4991 = new DefaultsGroup(3);
	}

	DefaultsGroup(int var1) {
		this.group = var1;
	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1839552253"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		Client.menu.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		Client.menu.menuWorldViewIds[0] = -1;
		Client.menu.menuActions[0] = "Cancel";
		Client.menu.menuTargets[0] = "";
		Client.menu.menuOpcodes[0] = 1006;
		Client.menu.menuShiftClick[0] = false;
		Client.menu.subMenus[0] = null;
		Client.menu.menuOptionsCount = 1;
	}
}
