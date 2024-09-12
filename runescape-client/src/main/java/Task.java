import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
@Implements("Task")
public class Task {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("am")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -352730199
	)
	@Export("type")
	int type;
	@ObfuscatedName("aq")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("af")
	@Export("objectArgument")
	Object objectArgument;
	@ObfuscatedName("at")
	@Export("result")
	public volatile Object result;

	Task() {
		this.status = 0;
	}
}
