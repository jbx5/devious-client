import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("au")
	long[] field1900;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 215476723
	)
	int field1896;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -868536703
	)
	int field1899;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = 798114243387116605L
	)
	long field1898;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1786287119
	)
	int field1895;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1522261221
	)
	int field1901;

	public MilliClock() {
		this.field1900 = new long[10];
		this.field1896 = 256;
		this.field1899 = 1;
		this.field1895 = 0;
		this.field1898 = GameEngine.method661();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1900[var1] = this.field1898;
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1021685028"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1900[var1] = 0L;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "20"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field1896;
		int var4 = this.field1899;
		this.field1896 = 300;
		this.field1899 = 1;
		this.field1898 = GameEngine.method661();
		if (0L == this.field1900[this.field1901]) {
			this.field1896 = var3;
			this.field1899 = var4;
		} else if (this.field1898 > this.field1900[this.field1901]) {
			this.field1896 = (int)((long)(var1 * 2560) / (this.field1898 - this.field1900[this.field1901]));
		}

		if (this.field1896 < 25) {
			this.field1896 = 25;
		}

		if (this.field1896 > 256) {
			this.field1896 = 256;
			this.field1899 = (int)((long)var1 - (this.field1898 - this.field1900[this.field1901]) / 10L);
		}

		if (this.field1899 > var1) {
			this.field1899 = var1;
		}

		this.field1900[this.field1901] = this.field1898;
		this.field1901 = (this.field1901 + 1) % 10;
		int var5;
		if (this.field1899 > 1) {
			for (var5 = 0; var5 < 10; ++var5) {
				if (0L != this.field1900[var5]) {
					this.field1900[var5] += (long)this.field1899;
				}
			}
		}

		if (this.field1899 < var2) {
			this.field1899 = var2;
		}

		PendingSpawn.method2365((long)this.field1899);

		for (var5 = 0; this.field1895 < 256; this.field1895 += this.field1896) {
			++var5;
		}

		this.field1895 &= 255;
		return var5;
	}
}
