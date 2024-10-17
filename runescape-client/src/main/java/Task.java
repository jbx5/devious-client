import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iz")
@Implements("Task")
public class Task {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("aj")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1800729751
	)
	@Export("type")
	int type;
	@ObfuscatedName("ay")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("as")
	@Export("objectArgument")
	Object objectArgument;
	@ObfuscatedName("ae")
	@Export("result")
	public volatile Object result;

	Task() {
		this.status = 0;
	}
}
