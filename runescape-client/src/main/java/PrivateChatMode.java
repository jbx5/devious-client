import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qa")
@Implements("PrivateChatMode")
public class PrivateChatMode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lqa;")

	static final PrivateChatMode field4741;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lqa;")

	public static final PrivateChatMode field4739;
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"Lqa;")

	static final PrivateChatMode field4738;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	-1733713795)

	public final int field4740;
	static 
	{
		field4741 = new PrivateChatMode(0);
		field4739 = new PrivateChatMode(1);
		field4738 = new PrivateChatMode(2);
	}

	PrivateChatMode(int var1) {
		this.field4740 = var1;
	}
}