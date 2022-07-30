import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("nl")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lnl;")
	static final DefaultsGroup field4373 = new DefaultsGroup(3);

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -786082887)
	@Export("group")
	final int group;

	DefaultsGroup(int var1) {
		this.group = var1;
	}
}