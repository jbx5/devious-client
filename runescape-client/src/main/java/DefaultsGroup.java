import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rf")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lrf;"
	)
	static final DefaultsGroup field4706;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1205360631
	)
	@Export("group")
	final int group;

	static {
		field4706 = new DefaultsGroup(3);
	}

	DefaultsGroup(int var1) {
		this.group = var1;
	}
}
