import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gu")
@Implements("Task")
public class Task {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("am")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1237847137
	)
	@Export("type")
	int type;
	@ObfuscatedName("aj")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("ag")
	@Export("objectArgument")
	Object objectArgument;
	@ObfuscatedName("az")
	@Export("result")
	public volatile Object result;

	Task() {
		this.status = 0;
	}
}
