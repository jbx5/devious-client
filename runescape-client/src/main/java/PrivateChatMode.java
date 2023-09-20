import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("va")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	static final PrivateChatMode field5272;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	public static final PrivateChatMode field5274;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	static final PrivateChatMode field5273;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1169782383
	)
	public final int field5271;

	static {
		field5272 = new PrivateChatMode(0);
		field5274 = new PrivateChatMode(1);
		field5273 = new PrivateChatMode(2);
	}

	PrivateChatMode(int var1) {
		this.field5271 = var1;
	}
}
