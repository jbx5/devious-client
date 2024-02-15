import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vi")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	static final PrivateChatMode field5340;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	public static final PrivateChatMode field5343;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	static final PrivateChatMode field5341;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1837746733
	)
	public final int field5342;

	static {
		field5340 = new PrivateChatMode(0);
		field5343 = new PrivateChatMode(1);
		field5341 = new PrivateChatMode(2);
	}

	PrivateChatMode(int var1) {
		this.field5342 = var1;
	}
}
