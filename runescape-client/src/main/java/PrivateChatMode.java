import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vc")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	static final PrivateChatMode field5500;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	public static final PrivateChatMode field5501;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	static final PrivateChatMode field5502;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1040445407
	)
	public final int field5503;

	static {
		field5500 = new PrivateChatMode(0);
		field5501 = new PrivateChatMode(1);
		field5502 = new PrivateChatMode(2);
	}

	PrivateChatMode(int var1) {
		this.field5503 = var1;
	}
}
