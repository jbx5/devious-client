import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vh")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lvh;"
	)
	static final PrivateChatMode field5484;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lvh;"
	)
	public static final PrivateChatMode field5483;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lvh;"
	)
	static final PrivateChatMode field5485;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1298431127
	)
	public final int field5482;

	static {
		field5484 = new PrivateChatMode(0);
		field5483 = new PrivateChatMode(1);
		field5485 = new PrivateChatMode(2);
	}

	PrivateChatMode(int var1) {
		this.field5482 = var1;
	}
}
