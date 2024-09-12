import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sw")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	static final DefaultsGroup field5053;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	static final DefaultsGroup field5050;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1172590335
	)
	static int field5051;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -350729741
	)
	@Export("group")
	final int group;

	static {
		field5053 = new DefaultsGroup(1);
		field5050 = new DefaultsGroup(3);
	}

	DefaultsGroup(int var1) {
		this.group = var1;
	}
}
