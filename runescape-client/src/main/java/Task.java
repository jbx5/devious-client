import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ii")
@Implements("Task")
public class Task {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("next")
	Task next;
	@ObfuscatedName("ai")
	@Export("status")
	public volatile int status;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -240452455
	)
	@Export("type")
	int type;
	@ObfuscatedName("as")
	@Export("intArgument")
	public int intArgument;
	@ObfuscatedName("aa")
	@Export("objectArgument")
	Object objectArgument;
	@ObfuscatedName("az")
	@Export("result")
	public volatile Object result;

	Task() {
		this.status = 0;
	}
}
