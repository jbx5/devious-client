import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("ac")
	long[] field1876;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 791839951
	)
	int field1870;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1907363063
	)
	int field1871;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		longValue = -5892739104209832185L
	)
	long field1869;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 429897187
	)
	int field1873;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 54371443
	)
	int field1874;

	MilliClock() {
		this.field1876 = new long[10];
		this.field1870 = 256;
		this.field1871 = 1;
		this.field1873 = 0;
		this.field1869 = GrandExchangeOfferTotalQuantityComparator.method7049();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1876[var1] = this.field1869;
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "436321701"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1876[var1] = 0L;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "712947185"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field1870;
		int var4 = this.field1871;
		this.field1870 = 300;
		this.field1871 = 1;
		this.field1869 = GrandExchangeOfferTotalQuantityComparator.method7049();
		if (this.field1876[this.field1874] == 0L) {
			this.field1870 = var3;
			this.field1871 = var4;
		} else if (this.field1869 > this.field1876[this.field1874]) {
			this.field1870 = (int)((long)(var1 * 2560) / (this.field1869 - this.field1876[this.field1874]));
		}

		if (this.field1870 < 25) {
			this.field1870 = 25;
		}

		if (this.field1870 > 256) {
			this.field1870 = 256;
			this.field1871 = (int)((long)var1 - (this.field1869 - this.field1876[this.field1874]) / 10L);
		}

		if (this.field1871 > var1) {
			this.field1871 = var1;
		}

		this.field1876[this.field1874] = this.field1869;
		this.field1874 = (this.field1874 + 1) % 10;
		int var5;
		if (this.field1871 > 1) {
			for (var5 = 0; var5 < 10; ++var5) {
				if (this.field1876[var5] != 0L) {
					this.field1876[var5] += (long)this.field1871;
				}
			}
		}

		if (this.field1871 < var2) {
			this.field1871 = var2;
		}

		Players.method2741((long)this.field1871);

		for (var5 = 0; this.field1873 < 256; this.field1873 += this.field1870) {
			++var5;
		}

		this.field1873 &= 255;
		return var5;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lom;I)V",
		garbageValue = "2111970758"
	)
	public static void method3572(AbstractArchive var0) {
		DbTableType.field5080 = var0;
	}
}
