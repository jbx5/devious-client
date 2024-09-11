import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
public class class241 {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lfb;"
	)
	class134[] field2609;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1006244985
	)
	int field2607;

	@ObfuscatedSignature(
		descriptor = "(Lvf;I)V"
	)
	class241(Buffer var1, int var2) {
		this.field2609 = new class134[var2];
		this.field2607 = var1.readUnsignedByte();

		for (int var3 = 0; var3 < this.field2609.length; ++var3) {
			class134 var4 = new class134(this.field2607, var1, false);
			this.field2609[var3] = var4;
		}

		this.method4822();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "444449256"
	)
	void method4822() {
		class134[] var1 = this.field2609;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class134 var3 = var1[var2];
			if (var3.field1581 >= 0) {
				var3.field1569 = this.field2609[var3.field1581];
			}
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	public int method4823() {
		return this.field2609.length;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Lfb;",
		garbageValue = "-2112171220"
	)
	class134 method4824(int var1) {
		return var1 >= this.method4823() ? null : this.field2609[var1];
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfb;",
		garbageValue = "-1750062588"
	)
	class134[] method4821() {
		return this.field2609;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lfo;II)V",
		garbageValue = "-873617787"
	)
	void method4832(class145 var1, int var2) {
		this.method4839(var1, var2, (boolean[])null, false);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lfo;I[ZZI)V",
		garbageValue = "2001180754"
	)
	void method4839(class145 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method3397();
		int var6 = 0;
		class134[] var7 = this.method4821();

		for (int var8 = 0; var8 < var7.length; ++var8) {
			class134 var9 = var7[var8];
			if (var3 == null || var4 == var3[var6]) {
				var1.method3399(var2, var9, var6, var5);
			}

			++var6;
		}

	}
}
