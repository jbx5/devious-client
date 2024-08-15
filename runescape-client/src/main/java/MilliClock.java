import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("ab")
	long[] field2364;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1568340251
	)
	int field2365;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 385013459
	)
	int field2366;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		longValue = -3055554712284321075L
	)
	long field2367;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1679848443
	)
	int field2368;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -558912499
	)
	int field2369;

	MilliClock() {
		this.field2364 = new long[10];
		this.field2365 = 256;
		this.field2366 = 1;
		this.field2368 = 0;
		this.field2367 = RouteStrategy.method5439();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field2364[var1] = this.field2367;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-298272680"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field2364[var1] = 0L;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-2135279900"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field2365;
		int var4 = this.field2366;
		this.field2365 = 300;
		this.field2366 = 1;
		this.field2367 = RouteStrategy.method5439();
		if (this.field2364[this.field2369] == 0L) {
			this.field2365 = var3;
			this.field2366 = var4;
		} else if (this.field2367 > this.field2364[this.field2369]) {
			this.field2365 = (int)((long)(var1 * 2560) / (this.field2367 - this.field2364[this.field2369]));
		}

		if (this.field2365 < 25) {
			this.field2365 = 25;
		}

		if (this.field2365 > 256) {
			this.field2365 = 256;
			this.field2366 = (int)((long)var1 - (this.field2367 - this.field2364[this.field2369]) / 10L);
		}

		if (this.field2366 > var1) {
			this.field2366 = var1;
		}

		this.field2364[this.field2369] = this.field2367;
		this.field2369 = (this.field2369 + 1) % 10;
		int var5;
		if (this.field2366 > 1) {
			for (var5 = 0; var5 < 10; ++var5) {
				if (this.field2364[var5] != 0L) {
					this.field2364[var5] += (long)this.field2366;
				}
			}
		}

		if (this.field2366 < var2) {
			this.field2366 = var2;
		}

		ClanChannel.method3595((long)this.field2366);

		for (var5 = 0; this.field2368 < 256; this.field2368 += this.field2365) {
			++var5;
		}

		this.field2368 &= 255;
		return var5;
	}
}
