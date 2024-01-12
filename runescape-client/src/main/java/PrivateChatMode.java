import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ve")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lve;"
	)
	static final PrivateChatMode field5315;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lve;"
	)
	public static final PrivateChatMode field5314;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lve;"
	)
	static final PrivateChatMode field5316;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1723553713
	)
	public final int field5317;

	static {
		field5315 = new PrivateChatMode(0);
		field5314 = new PrivateChatMode(1);
		field5316 = new PrivateChatMode(2);
	}

	PrivateChatMode(int var1) {
		this.field5317 = var1;
	}
}
