import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
@Implements("Task")
public class Task {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("n")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -822445223
	)
	@Export("type")
	int type;
	@ObfuscatedName("w")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("s")
	@Export("objectArgument")
	Object objectArgument;
	@ObfuscatedName("q")
	@Export("result")
	public volatile Object result;

	Task() {
		this.status = 0; // L: 10
	} // L: 22
}
