import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("fz")
@Implements("Task")
public class Task {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lfz;")
	@Export("next")
	Task next;

	@ObfuscatedName("u")
	@Export("status")
	public volatile int status = 0;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -1505132591)
	@Export("type")
	int type;

	@ObfuscatedName("w")
	@Export("intArgument")
	public int intArgument;

	@ObfuscatedName("z")
	@Export("objectArgument")
	Object objectArgument;

	@ObfuscatedName("j")
	@Export("result")
	public volatile Object result;

	Task() {
	}
}