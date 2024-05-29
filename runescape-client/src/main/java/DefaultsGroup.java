import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sw")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	static final DefaultsGroup field4985;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	static final DefaultsGroup field4986;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -20025103
	)
	@Export("group")
	final int group;

	static {
		field4985 = new DefaultsGroup(1);
		field4986 = new DefaultsGroup(3);
	}

	DefaultsGroup(int var1) {
		this.group = var1;
	}
}
