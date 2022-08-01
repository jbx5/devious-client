import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("fl")
@Implements("Clock")
public abstract class Clock {
	@ObfuscatedName("cw")
	public static char field1797;

	Clock() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-972249227")
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(III)I", garbageValue = "-1486724184")
	@Export("wait")
	public abstract int wait(int var1, int var2);
}