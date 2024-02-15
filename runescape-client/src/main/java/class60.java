import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
public class class60 {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1913802217
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;
	@ObfuscatedName("ng")
	@ObfuscatedGetter(
		intValue = -1977376505
	)
	@Export("menuWidth")
	static int menuWidth;
	@ObfuscatedName("aq")
	byte[] field431;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1308733505
	)
	int field430;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 296190363
	)
	int field434;

	class60() {
		this.field431 = null;
		this.field430 = 0;
		this.field434 = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1558898831"
	)
	int method1138(int var1) {
		int var2 = 0;

		int var3;
		int var4;
		for (var3 = 0; var1 >= 8 - this.field434; var1 -= var4) {
			var4 = 8 - this.field434;
			int var5 = (1 << var4) - 1;
			var2 += (this.field431[this.field430] >> this.field434 & var5) << var3;
			this.field434 = 0;
			++this.field430;
			var3 += var4;
		}

		if (var1 > 0) {
			var4 = (1 << var1) - 1;
			var2 += (this.field431[this.field430] >> this.field434 & var4) << var3;
			this.field434 += var1;
		}

		return var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1615671029"
	)
	int method1139() {
		int var1 = this.field431[this.field430] >> this.field434 & 1;
		++this.field434;
		this.field430 += this.field434 >> 3;
		this.field434 &= 7;
		return var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([BIB)V",
		garbageValue = "50"
	)
	void method1141(byte[] var1, int var2) {
		this.field431 = var1;
		this.field430 = var2;
		this.field434 = 0;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Lbj;B)V",
		garbageValue = "8"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false;
		if (var0.sound != null) {
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1);
		}

	}
}
