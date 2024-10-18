import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wl")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lwl;"
	)
	static final PrivateChatMode field5620;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lwl;"
	)
	public static final PrivateChatMode field5619;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lwl;"
	)
	static final PrivateChatMode field5621;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -692350423
	)
	public final int field5618;

	static {
		field5620 = new PrivateChatMode(0);
		field5619 = new PrivateChatMode(1);
		field5621 = new PrivateChatMode(2);
	}

	PrivateChatMode(int var1) {
		this.field5618 = var1;
	}
}
