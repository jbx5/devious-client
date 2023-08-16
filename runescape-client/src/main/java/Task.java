import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
@Implements("Task")
public class Task {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("at")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1453740939
	)
	@Export("type")
	int type;
	@ObfuscatedName("ai")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("az")
	@Export("objectArgument")
	Object objectArgument;
	@ObfuscatedName("ap")
	@Export("result")
	public volatile Object result;

	Task() {
		this.status = 0;
	}
}
