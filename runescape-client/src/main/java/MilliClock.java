import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("az")
	long[] field1897;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -981477377
	)
	int field1892;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 632704011
	)
	int field1894;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = 1026994790827227657L
	)
	long field1895;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 352660841
	)
	int field1896;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1326604207
	)
	int field1893;

	MilliClock() {
		this.field1897 = new long[10];
		this.field1892 = 256;
		this.field1894 = 1;
		this.field1896 = 0;
		this.field1895 = VerticalAlignment.method3924();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1897[var1] = this.field1895;
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "503557522"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1897[var1] = 0L;
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-234645031"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field1892;
		int var4 = this.field1894;
		this.field1892 = 300;
		this.field1894 = 1;
		this.field1895 = VerticalAlignment.method3924();
		if (this.field1897[this.field1893] == 0L) {
			this.field1892 = var3;
			this.field1894 = var4;
		} else if (this.field1895 > this.field1897[this.field1893]) {
			this.field1892 = (int)((long)(var1 * 2560) / (this.field1895 - this.field1897[this.field1893]));
		}

		if (this.field1892 < 25) {
			this.field1892 = 25;
		}

		if (this.field1892 > 256) {
			this.field1892 = 256;
			this.field1894 = (int)((long)var1 - (this.field1895 - this.field1897[this.field1893]) / 10L);
		}

		if (this.field1894 > var1) {
			this.field1894 = var1;
		}

		this.field1897[this.field1893] = this.field1895;
		this.field1893 = (this.field1893 + 1) % 10;
		int var5;
		if (this.field1894 > 1) {
			for (var5 = 0; var5 < 10; ++var5) {
				if (0L != this.field1897[var5]) {
					this.field1897[var5] += (long)this.field1894;
				}
			}
		}

		if (this.field1894 < var2) {
			this.field1894 = var2;
		}

		class499.method8677((long)this.field1894);

		for (var5 = 0; this.field1896 < 256; this.field1896 += this.field1892) {
			++var5;
		}

		this.field1896 &= 255;
		return var5;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1865360983"
	)
	static final int method3544(int var0, int var1) {
		int var2 = TileItem.method2691(var0 - 1, var1 - 1) + TileItem.method2691(1 + var0, var1 - 1) + TileItem.method2691(var0 - 1, 1 + var1) + TileItem.method2691(1 + var0, 1 + var1);
		int var3 = TileItem.method2691(var0 - 1, var1) + TileItem.method2691(1 + var0, var1) + TileItem.method2691(var0, var1 - 1) + TileItem.method2691(var0, 1 + var1);
		int var4 = TileItem.method2691(var0, var1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}
}
