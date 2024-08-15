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
	static void method8854() {
		Client.field650.field5518 = 0;
		Client.isMenuOpen = false;
		Client.field650.field5527[0] = -1;
		Client.field650.field5525[0] = "Cancel";
		Client.field650.field5522[0] = "";
		Client.field650.field5521[0] = 1006;
		Client.field650.field5528[0] = false;
		Client.field650.field5526[0] = null;
		Client.field650.field5518 = 1;
	}
}
