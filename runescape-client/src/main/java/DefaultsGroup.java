import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rc")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lrc;"
	)
	static final DefaultsGroup field4841;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lrc;"
	)
	static final DefaultsGroup field4840;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1130001369
	)
	@Export("group")
	final int group;

	static {
		field4841 = new DefaultsGroup(1);
		field4840 = new DefaultsGroup(3);
	}

	DefaultsGroup(int var1) {
		this.group = var1;
	}
}
