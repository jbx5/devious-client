import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("he")
@Implements("Task")
public class Task {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("az")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 307111393
	)
	@Export("type")
	int type;
	@ObfuscatedName("aa")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("at")
	@Export("objectArgument")
	Object objectArgument;
	@ObfuscatedName("ab")
	@Export("result")
	public volatile Object result;

	Task() {
		this.status = 0;
	}
}
