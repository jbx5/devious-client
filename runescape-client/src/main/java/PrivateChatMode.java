import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ut")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	static final PrivateChatMode field5206;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	public static final PrivateChatMode field5205;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	static final PrivateChatMode field5207;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1426884309
	)
	public final int field5208;

	static {
		field5206 = new PrivateChatMode(0);
		field5205 = new PrivateChatMode(1);
		field5207 = new PrivateChatMode(2);
	}

	PrivateChatMode(int var1) {
		this.field5208 = var1;
	}
}
