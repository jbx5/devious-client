import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gp")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("ak")
	long[] field1906;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 229547495
	)
	int field1903;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1612662661
	)
	int field1902;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = -1499200024151752591L
	)
	long field1905;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 596736119
	)
	int field1904;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -19734087
	)
	int field1907;

	public MilliClock() {
		this.field1906 = new long[10];
		this.field1903 = 256;
		this.field1902 = 1;
		this.field1904 = 0;
		this.field1905 = class129.method3033();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1906[var1] = this.field1905;
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1748185955"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1906[var1] = 0L;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "127"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field1903;
		int var4 = this.field1902;
		this.field1903 = 300;
		this.field1902 = 1;
		this.field1905 = class129.method3033();
		if (0L == this.field1906[this.field1907]) {
			this.field1903 = var3;
			this.field1902 = var4;
		} else if (this.field1905 > this.field1906[this.field1907]) {
			this.field1903 = (int)((long)(var1 * 2560) / (this.field1905 - this.field1906[this.field1907]));
		}

		if (this.field1903 < 25) {
			this.field1903 = 25;
		}

		if (this.field1903 > 256) {
			this.field1903 = 256;
			this.field1902 = (int)((long)var1 - (this.field1905 - this.field1906[this.field1907]) / 10L);
		}

		if (this.field1902 > var1) {
			this.field1902 = var1;
		}

		this.field1906[this.field1907] = this.field1905;
		this.field1907 = (this.field1907 + 1) % 10;
		int var5;
		if (this.field1902 > 1) {
			for (var5 = 0; var5 < 10; ++var5) {
				if (0L != this.field1906[var5]) {
					this.field1906[var5] += (long)this.field1902;
				}
			}
		}

		if (this.field1902 < var2) {
			this.field1902 = var2;
		}

		class484.method8889((long)this.field1902);

		for (var5 = 0; this.field1904 < 256; this.field1904 += this.field1903) {
			++var5;
		}

		this.field1904 &= 255;
		return var5;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lhi;",
		garbageValue = "336880011"
	)
	public static class183 method3646() {
		return class183.field1911;
	}
}
