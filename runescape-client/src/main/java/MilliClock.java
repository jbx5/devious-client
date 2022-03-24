import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("v")
	long[] field1788;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	-1148661387)

	int field1784;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	426032869)

	int field1785;
	@ObfuscatedName("g")
	@ObfuscatedGetter(longValue = 
	-8930858235242911925L)

	long field1786;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	-1472705891)

	int field1787;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	-985366599)

	int field1783;

	MilliClock() {
		this.field1788 = new long[10];
		this.field1784 = 256;
		this.field1785 = 1;
		this.field1787 = 0;
		this.field1786 = WorldMapSprite.getServerTime();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1788[var1] = this.field1786;
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"947451014")

	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1788[var1] = 0L;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(III)I", garbageValue = 
	"-932830121")

	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field1784;
		int var4 = this.field1785;
		this.field1784 = 300;
		this.field1785 = 1;
		this.field1786 = WorldMapSprite.getServerTime();
		if (this.field1788[this.field1783] == 0L) {
			this.field1784 = var3;
			this.field1785 = var4;
		} else if (this.field1786 > this.field1788[this.field1783]) {
			this.field1784 = ((int) (((long) (var1 * 2560)) / (this.field1786 - this.field1788[this.field1783])));
		}

		if (this.field1784 < 25) {
			this.field1784 = 25;
		}

		if (this.field1784 > 256) {
			this.field1784 = 256;
			this.field1785 = ((int) (((long) (var1)) - ((this.field1786 - this.field1788[this.field1783]) / 10L)));
		}

		if (this.field1785 > var1) {
			this.field1785 = var1;
		}

		this.field1788[this.field1783] = this.field1786;
		this.field1783 = (this.field1783 + 1) % 10;
		int var5;
		if (this.field1785 > 1) {
			for (var5 = 0; var5 < 10; ++var5) {
				if (this.field1788[var5] != 0L) {
					this.field1788[var5] += ((long) (this.field1785));
				}
			}
		}

		if (this.field1785 < var2) {
			this.field1785 = var2;
		}

		GrandExchangeOfferTotalQuantityComparator.method6007(((long) (this.field1785)));

		for (var5 = 0; this.field1787 < 256; this.field1787 += this.field1784) {
			++var5;
		}

		this.field1787 &= 255;
		return var5;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(IIIZII)J", garbageValue = 
	"-220853787")

	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
		long var5 = ((long) ((((var0 & 127) << 0) | ((var1 & 127) << 7)) | ((var2 & 3) << 14))) | ((((long) (var4)) & 4294967295L) << 17);
		if (var3) {
			var5 |= 65536L;
		}

		return var5;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(descriptor = 
	"(ILbo;ZI)I", garbageValue = 
	"2046695299")

	static int method3293(int var0, Script var1, boolean var2) {
		if (var0 == 6800) {
			Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
			return 1;
		} else if ((var0 != 6801) && (var0 != 6802)) {
			if (var0 == 6850) {
				Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
				return 1;
			} else if ((var0 != 6851) && (var0 != 6852)) {
				if (var0 == 6853) {
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
					return 1;
				} else {
					return 2;
				}
			} else {
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
				return 1;
			}
		} else {
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
			return 1;
		}
	}
}