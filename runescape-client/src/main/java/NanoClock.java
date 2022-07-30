import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ed")
@Implements("NanoClock")
public class NanoClock extends Clock {
	@ObfuscatedName("o")
	@ObfuscatedGetter(longValue = 4182987866949171559L)
	@Export("lastTimeNano")
	long lastTimeNano = System.nanoTime();

	NanoClock() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-972249227")
	@Export("mark")
	public void mark() {
		this.lastTimeNano = System.nanoTime();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(III)I", garbageValue = "-1486724184")
	@Export("wait")
	public int wait(int var1, int var2) {
		long var3 = 1000000L * ((long) (var2));
		long var5 = this.lastTimeNano - System.nanoTime();
		if (var5 < var3) {
			var5 = var3;
		}
		WorldMapDecoration.method4967(var5 / 1000000L);
		long var7 = System.nanoTime();
		int var9;
		for (var9 = 0; var9 < 10 && (var9 < 1 || this.lastTimeNano < var7); this.lastTimeNano += ((long) (var1)) * 1000000L) {
			++var9;
		}
		if (this.lastTimeNano < var7) {
			this.lastTimeNano = var7;
		}
		return var9;
	}
}