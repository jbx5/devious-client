import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iu")
@Implements("Clock")
public abstract class Clock {
	@ObfuscatedName("am")
	@Export("ByteArrayPool_alternativeSizes")
	static int[] ByteArrayPool_alternativeSizes;
	@ObfuscatedName("iw")
	@ObfuscatedGetter(
		longValue = 6364188858341517481L
	)
	static long field2337;

	Clock() {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1366277024"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-2001388980"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);
}
