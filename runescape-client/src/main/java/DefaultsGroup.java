import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ra")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lra;"
	)
	static final DefaultsGroup field4773;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lra;"
	)
	static final DefaultsGroup field4776;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1589049753
	)
	@Export("group")
	final int group;

	static {
		field4773 = new DefaultsGroup(1);
		field4776 = new DefaultsGroup(3);
	}

	DefaultsGroup(int var1) {
		this.group = var1;
	}
}
