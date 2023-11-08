import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rk")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lrk;"
	)
	static final DefaultsGroup field4736;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lrk;"
	)
	static final DefaultsGroup field4737;
	@ObfuscatedName("jh")
	@ObfuscatedGetter(
		intValue = 1536968685
	)
	static int field4740;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1428460945
	)
	@Export("group")
	final int group;

	static {
		field4736 = new DefaultsGroup(1);
		field4737 = new DefaultsGroup(3);
	}

	DefaultsGroup(int var1) {
		this.group = var1;
	}
}
