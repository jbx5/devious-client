import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
@ObfuscatedName("qb")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lqb;")
	static final PrivateChatMode field4827 = new PrivateChatMode(0);

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lqb;")
	public static final PrivateChatMode field4825 = new PrivateChatMode(1);

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lqb;")
	static final PrivateChatMode field4828 = new PrivateChatMode(2);

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 320367397)
	public final int field4826;

	PrivateChatMode(int var1) {
		this.field4826 = var1;
	}
}