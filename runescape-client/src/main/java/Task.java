import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
@Implements("Task")
public class Task {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("at")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 891628141
	)
	@Export("type")
	int type;
	@ObfuscatedName("ao")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("ab")
	@Export("objectArgument")
	Object objectArgument;
	@ObfuscatedName("aw")
	@Export("result")
	public volatile Object result;

	Task() {
		this.status = 0;
	}
}
