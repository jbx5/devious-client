import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vp")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lvp;"
	)
	static final PrivateChatMode field5539;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lvp;"
	)
	public static final PrivateChatMode field5537;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lvp;"
	)
	static final PrivateChatMode field5536;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -23548893
	)
	public final int field5540;

	static {
		field5539 = new PrivateChatMode(0);
		field5537 = new PrivateChatMode(1);
		field5536 = new PrivateChatMode(2);
	}

	PrivateChatMode(int var1) {
		this.field5540 = var1;
	}
}
