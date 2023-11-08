import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
@Implements("Task")
public class Task {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("ao")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 671081225
	)
	@Export("type")
	int type;
	@ObfuscatedName("au")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("aa")
	@Export("objectArgument")
	Object objectArgument;
	@ObfuscatedName("ac")
	@Export("result")
	public volatile Object result;

	Task() {
		this.status = 0;
	}
}
