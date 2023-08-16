import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ub")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	static final PrivateChatMode field5248;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	public static final PrivateChatMode field5247;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	static final PrivateChatMode field5245;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -826058471
	)
	public final int field5246;

	static {
		field5248 = new PrivateChatMode(0);
		field5247 = new PrivateChatMode(1);
		field5245 = new PrivateChatMode(2);
	}

	PrivateChatMode(int var1) {
		this.field5246 = var1;
	}
}
