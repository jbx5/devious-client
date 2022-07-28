import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("fn")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("o")
	long[] field1783 = new long[10];

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -410274933)
	int field1776 = 256;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 603484071)
	int field1778 = 1;

	@ObfuscatedName("u")
	@ObfuscatedGetter(longValue = -1778229211141023355L)
	long field1784 = class131.method2916();

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -1749275441)
	int field1779 = 0;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 281585177)
	int field1781;

	MilliClock() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1783[var1] = this.field1784;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-972249227")
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1783[var1] = 0L;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(III)I", garbageValue = "-1486724184")
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field1776;
		int var4 = this.field1778;
		this.field1776 = 300;
		this.field1778 = 1;
		this.field1784 = class131.method2916();
		if (0L == this.field1783[this.field1781]) {
			this.field1776 = var3;
			this.field1778 = var4;
		} else if (this.field1784 > this.field1783[this.field1781]) {
			this.field1776 = ((int) (((long) (var1 * 2560)) / (this.field1784 - this.field1783[this.field1781])));
		}
		if (this.field1776 < 25) {
			this.field1776 = 25;
		}
		if (this.field1776 > 256) {
			this.field1776 = 256;
			this.field1778 = ((int) (((long) (var1)) - (this.field1784 - this.field1783[this.field1781]) / 10L));
		}
		if (this.field1778 > var1) {
			this.field1778 = var1;
		}
		this.field1783[this.field1781] = this.field1784;
		this.field1781 = (this.field1781 + 1) % 10;
		int var5;
		if (this.field1778 > 1) {
			for (var5 = 0; var5 < 10; ++var5) {
				if (0L != this.field1783[var5]) {
					this.field1783[var5] += ((long) (this.field1778));
				}
			}
		}
		if (this.field1778 < var2) {
			this.field1778 = var2;
		}
		WorldMapDecoration.method4967(((long) (this.field1778)));
		for (var5 = 0; this.field1779 < 256; this.field1779 += this.field1776) {
			++var5;
		}
		this.field1779 &= 255;
		return var5;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Llc;IB)V", garbageValue = "46")
	static void method3293(AbstractArchive var0, int var1) {
		if ((var1 & 536870912) != 0) {
			Canvas.logoSprite = BufferedNetSocket.SpriteBuffer_getIndexedSpriteByName(var0, "logo_deadman_mode", "");
		} else if ((var1 & 1073741824) != 0) {
			Canvas.logoSprite = BufferedNetSocket.SpriteBuffer_getIndexedSpriteByName(var0, "logo_seasonal_mode", "");
		} else {
			Canvas.logoSprite = BufferedNetSocket.SpriteBuffer_getIndexedSpriteByName(var0, "logo", "");
		}
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1158178047")
	static final void method3292() {
		Client.field694 = Client.cycleCntr;
		class122.field1499 = true;
	}
}