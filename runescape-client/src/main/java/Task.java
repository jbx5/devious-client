import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
@Implements("Task")
public class Task {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("ak")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1441962407
	)
	@Export("type")
	int type;
	@ObfuscatedName("an")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("aj")
	@Export("objectArgument")
	Object objectArgument;
	@ObfuscatedName("av")
	@Export("result")
	public volatile Object result;

	Task() {
		this.status = 0;
	}
}
