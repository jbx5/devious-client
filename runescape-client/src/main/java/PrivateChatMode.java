import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qr")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	static final PrivateChatMode field4854;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	public static final PrivateChatMode field4851;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	static final PrivateChatMode field4852;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1482100875
	)
	public final int field4853;

	static {
		field4854 = new PrivateChatMode(0); // L: 5
		field4851 = new PrivateChatMode(1); // L: 6
		field4852 = new PrivateChatMode(2);
	} // L: 7

	PrivateChatMode(int var1) {
		this.field4853 = var1; // L: 15
	} // L: 16
}
