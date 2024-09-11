import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ve")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lve;"
	)
	static final PrivateChatMode field5566;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lve;"
	)
	public static final PrivateChatMode field5569;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lve;"
	)
	static final PrivateChatMode field5568;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 52166545
	)
	public final int field5567;

	static {
		field5566 = new PrivateChatMode(0);
		field5569 = new PrivateChatMode(1);
		field5568 = new PrivateChatMode(2);
	}

	PrivateChatMode(int var1) {
		this.field5567 = var1;
	}
}
