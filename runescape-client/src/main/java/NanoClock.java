import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
@Implements("NanoClock")
public class NanoClock extends Clock {
	@ObfuscatedName("v")
	@ObfuscatedGetter(longValue = 
	5608793746955803797L)

	@Export("lastTimeNano")
	long lastTimeNano;

	NanoClock() {
		this.lastTimeNano = System.nanoTime();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"947451014")

	@Export("mark")
	public void mark() {
		this.lastTimeNano = System.nanoTime();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(III)I", garbageValue = 
	"-932830121")

	@Export("wait")
	public int wait(int var1, int var2) {
		long var3 = ((long) (var2)) * 1000000L;
		long var5 = this.lastTimeNano - System.nanoTime();
		if (var5 < var3) {
			var5 = var3;
		}

		GrandExchangeOfferTotalQuantityComparator.method6007(var5 / 1000000L);
		long var7 = System.nanoTime();

		int var9;
		for (var9 = 0; (var9 < 10) && ((var9 < 1) || (this.lastTimeNano < var7)); this.lastTimeNano += ((long) (var1)) * 1000000L) {
			++var9;
		}

		if (this.lastTimeNano < var7) {
			this.lastTimeNano = var7;
		}

		return var9;
	}
}