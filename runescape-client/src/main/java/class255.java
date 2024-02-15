import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jm")
public class class255 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	static final class255 field2655;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	static final class255 field2653;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1886188331
	)
	@Export("value")
	final int value;

	static {
		field2655 = new class255(0);
		field2653 = new class255(1);
	}

	class255(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1731550026"
	)
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
