import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("fq")
@Implements("Task")
public class Task {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lfq;")
	@Export("next")
	Task next;

	@ObfuscatedName("v")
	@Export("status")
	public volatile int status = 0;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 329615287)
	@Export("type")
	int type;

	@ObfuscatedName("q")
	@Export("intArgument")
	public int intArgument;

	@ObfuscatedName("i")
	@Export("objectArgument")
	Object objectArgument;

	@ObfuscatedName("k")
	@Export("result")
	public volatile Object result;

	Task() {
	}
}