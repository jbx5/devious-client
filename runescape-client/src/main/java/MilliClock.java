import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("v")
	long[] field1767;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	-2105737199)

	int field1769;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	-626928133)

	int field1768;
	@ObfuscatedName("f")
	@ObfuscatedGetter(longValue = 
	4722522205761016929L)

	long field1766;
	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 
	-186041197)

	int field1770;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	-1637603131)

	int field1771;

	public MilliClock() {
		this.field1767 = new long[10];
		this.field1769 = 256;
		this.field1768 = 1;
		this.field1770 = 0;
		this.field1766 = class136.method2931();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1767[var1] = this.field1766;
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1350330504")

	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1767[var1] = 0L;
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(III)I", garbageValue = 
	"2026134141")

	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field1769;
		int var4 = this.field1768;
		this.field1769 = 300;
		this.field1768 = 1;
		this.field1766 = class136.method2931();
		if (this.field1767[this.field1771] == 0L) {
			this.field1769 = var3;
			this.field1768 = var4;
		} else if (this.field1766 > this.field1767[this.field1771]) {
			this.field1769 = ((int) (((long) (var1 * 2560)) / (this.field1766 - this.field1767[this.field1771])));
		}

		if (this.field1769 < 25) {
			this.field1769 = 25;
		}

		if (this.field1769 > 256) {
			this.field1769 = 256;
			this.field1768 = ((int) (((long) (var1)) - ((this.field1766 - this.field1767[this.field1771]) / 10L)));
		}

		if (this.field1768 > var1) {
			this.field1768 = var1;
		}

		this.field1767[this.field1771] = this.field1766;
		this.field1771 = (this.field1771 + 1) % 10;
		int var5;
		if (this.field1768 > 1) {
			for (var5 = 0; var5 < 10; ++var5) {
				if (0L != this.field1767[var5]) {
					this.field1767[var5] += ((long) (this.field1768));
				}
			}
		}

		if (this.field1768 < var2) {
			this.field1768 = var2;
		}

		class93.method2384(((long) (this.field1768)));

		for (var5 = 0; this.field1770 < 256; this.field1770 += this.field1769) {
			++var5;
		}

		this.field1770 &= 255;
		return var5;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/Throwable;Ljava/lang/String;)Lqo;")

	@Export("newRunException")
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) {
			var2 = ((RunException) (var0));
			var2.message = (var2.message + ' ') + var1;
		} else {
			var2 = new RunException(var0, var1);
		}

		return var2;
	}
}