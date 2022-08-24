import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
@ObfuscatedName("qi")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lqi;")
	static final PrivateChatMode field4825 = new PrivateChatMode(0);

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Lqi;")
	public static final PrivateChatMode field4823 = new PrivateChatMode(1);

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lqi;")
	static final PrivateChatMode field4826 = new PrivateChatMode(2);

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -582494507)
	public final int field4824;

	PrivateChatMode(int var1) {
		this.field4824 = var1;
	}
}