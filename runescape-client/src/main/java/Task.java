import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
@Implements("Task")
public class Task {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("aj")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1525290079
	)
	@Export("type")
	int type;
	@ObfuscatedName("ar")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("ag")
	@Export("objectArgument")
	Object objectArgument;
	@ObfuscatedName("ao")
	@Export("result")
	public volatile Object result;

	Task() {
		this.status = 0;
	}
}
