import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rh")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lrh;"
	)
	static final DefaultsGroup field4703;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1077035125
	)
	@Export("group")
	final int group;

	static {
		field4703 = new DefaultsGroup(3);
	}

	DefaultsGroup(int var1) {
		this.group = var1;
	}
}
