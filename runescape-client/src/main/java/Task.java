import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
@Implements("Task")
public class Task {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("au")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -2068869357
	)
	@Export("type")
	int type;
	@ObfuscatedName("ao")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("am")
	@Export("objectArgument")
	Object objectArgument;
	@ObfuscatedName("ac")
	@Export("result")
	public volatile Object result;

	Task() {
		this.status = 0;
	}
}
