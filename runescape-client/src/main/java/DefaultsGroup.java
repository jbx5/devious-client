import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sa")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lsa;"
	)
	static final DefaultsGroup field5098;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsa;"
	)
	static final DefaultsGroup field5096;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1891273653
	)
	@Export("group")
	final int group;

	static {
		field5098 = new DefaultsGroup(1);
		field5096 = new DefaultsGroup(3);
	}

	DefaultsGroup(int var1) {
		this.group = var1;
	}
}
