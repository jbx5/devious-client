import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
@Implements("Clock")
public abstract class Clock {
	Clock() {
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "503557522"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-234645031"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "2048"
	)
	public static void method3690() {
		class36.reflectionChecks = new IterableNodeDeque();
	}
}
