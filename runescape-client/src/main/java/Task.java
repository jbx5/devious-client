import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hi")
@Implements("Task")
public class Task {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lhi;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("ax")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1063865615
	)
	@Export("type")
	int type;
	@ObfuscatedName("ah")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("ar")
	@Export("objectArgument")
	Object objectArgument;
	@ObfuscatedName("ab")
	@Export("result")
	public volatile Object result;

	Task() {
		this.status = 0;
	}
}
