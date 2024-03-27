import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
public class class243 {
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("widgetDefinition")
	static WidgetDefinition widgetDefinition;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lei;"
	)
	class128[] field2617;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 996036501
	)
	int field2616;

	@ObfuscatedSignature(
		descriptor = "(Lur;I)V"
	)
	class243(Buffer var1, int var2) {
		this.field2617 = new class128[var2];
		this.field2616 = var1.readUnsignedByte();

		for (int var3 = 0; var3 < this.field2617.length; ++var3) {
			class128 var4 = new class128(this.field2616, var1, false);
			this.field2617[var3] = var4;
		}

		this.method4654();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "966695954"
	)
	void method4654() {
		class128[] var1 = this.field2617;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class128 var3 = var1[var2];
			if (var3.field1539 >= 0) {
				var3.field1543 = this.field2617[var3.field1539];
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-102"
	)
	public int method4642() {
		return this.field2617.length;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Lei;",
		garbageValue = "1736628688"
	)
	class128 method4643(int var1) {
		return var1 >= this.method4642() ? null : this.field2617[var1];
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)[Lei;",
		garbageValue = "1"
	)
	class128[] method4644() {
		return this.field2617;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfa;II)V",
		garbageValue = "-436688583"
	)
	void method4651(class138 var1, int var2) {
		this.method4646(var1, var2, (boolean[])null, false);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lfa;I[ZZB)V",
		garbageValue = "-44"
	)
	void method4646(class138 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method3091();
		int var6 = 0;
		class128[] var7 = this.method4644();

		for (int var8 = 0; var8 < var7.length; ++var8) {
			class128 var9 = var7[var8];
			if (var3 == null || var4 == var3[var6]) {
				var1.method3090(var2, var9, var6, var5);
			}

			++var6;
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "1"
	)
	public static int method4661(int var0) {
		return class484.field4918[var0 & 16383];
	}
}
