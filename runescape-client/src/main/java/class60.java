import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
public class class60 {
	@ObfuscatedName("gg")
	@Export("characterId")
	static String characterId;
	@ObfuscatedName("ok")
	@ObfuscatedGetter(
		intValue = -2095567381
	)
	@Export("menuHeight")
	static int menuHeight;
	@ObfuscatedName("pq")
	@ObfuscatedGetter(
		intValue = 931534025
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;
	@ObfuscatedName("am")
	byte[] field430;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 95763601
	)
	int field433;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1089651909
	)
	int field432;

	class60() {
		this.field430 = null;
		this.field433 = 0;
		this.field432 = 0;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1595212669"
	)
	int method1188(int var1) {
		int var2 = 0;

		int var3;
		int var4;
		for (var3 = 0; var1 >= 8 - this.field432; var1 -= var4) {
			var4 = 8 - this.field432;
			int var5 = (1 << var4) - 1;
			var2 += (this.field430[this.field433] >> this.field432 & var5) << var3;
			this.field432 = 0;
			++this.field433;
			var3 += var4;
		}

		if (var1 > 0) {
			var4 = (1 << var1) - 1;
			var2 += (this.field430[this.field433] >> this.field432 & var4) << var3;
			this.field432 += var1;
		}

		return var2;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "705214862"
	)
	int method1189() {
		int var1 = this.field430[this.field433] >> this.field432 & 1;
		++this.field432;
		this.field433 += this.field432 >> 3;
		this.field432 &= 7;
		return var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([BII)V",
		garbageValue = "176102354"
	)
	void method1187(byte[] var1, int var2) {
		this.field430 = var1;
		this.field433 = var2;
		this.field432 = 0;
	}
}
