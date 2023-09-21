import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
public class class60 {
	@ObfuscatedName("ac")
	byte[] field458;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 70742755
	)
	int field457;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1755072615
	)
	int field456;

	class60() {
		this.field458 = null;
		this.field457 = 0;
		this.field456 = 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1668070165"
	)
	int method1171(int var1) {
		int var2 = 0;

		int var3;
		int var4;
		for (var3 = 0; var1 >= 8 - this.field456; var1 -= var4) {
			var4 = 8 - this.field456;
			int var5 = (1 << var4) - 1;
			var2 += (this.field458[this.field457] >> this.field456 & var5) << var3;
			this.field456 = 0;
			++this.field457;
			var3 += var4;
		}

		if (var1 > 0) {
			var4 = (1 << var1) - 1;
			var2 += (this.field458[this.field457] >> this.field456 & var4) << var3;
			this.field456 += var1;
		}

		return var2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1671970145"
	)
	int method1172() {
		int var1 = this.field458[this.field457] >> this.field456 & 1;
		++this.field456;
		this.field457 += this.field456 >> 3;
		this.field456 &= 7;
		return var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([BIS)V",
		garbageValue = "-20687"
	)
	void method1174(byte[] var1, int var2) {
		this.field458 = var1;
		this.field457 = var2;
		this.field456 = 0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "1"
	)
	public static boolean method1185(int var0) {
		return var0 >= WorldMapDecorationType.field3876.id && var0 <= WorldMapDecorationType.field3860.id || var0 == WorldMapDecorationType.field3861.id;
	}
}
