import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kz")
public class class267 {
	@ObfuscatedName("aq")
	@Export("ByteArrayPool_altSizeArrayCounts")
	static int[] ByteArrayPool_altSizeArrayCounts;
	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	static Archive field2778;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lej;"
	)
	class128[] field2777;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1061697901
	)
	int field2779;

	@ObfuscatedSignature(
		descriptor = "(Luj;I)V"
	)
	class267(Buffer var1, int var2) {
		this.field2777 = new class128[var2];
		this.field2779 = var1.readUnsignedByte();

		for (int var3 = 0; var3 < this.field2777.length; ++var3) {
			class128 var4 = new class128(this.field2779, var1, false);
			this.field2777[var3] = var4;
		}

		this.method5268();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1372666290"
	)
	void method5268() {
		class128[] var1 = this.field2777;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class128 var3 = var1[var2];
			if (var3.field1507 >= 0) {
				var3.field1497 = this.field2777[var3.field1507];
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "4095"
	)
	public int method5269() {
		return this.field2777.length;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Lej;",
		garbageValue = "-2147483647"
	)
	class128 method5270(int var1) {
		return var1 >= this.method5269() ? null : this.field2777[var1];
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)[Lej;",
		garbageValue = "-943395454"
	)
	class128[] method5271() {
		return this.field2777;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lfo;IB)V",
		garbageValue = "-54"
	)
	void method5272(class139 var1, int var2) {
		this.method5282(var1, var2, (boolean[])null, false);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lfo;I[ZZI)V",
		garbageValue = "-869028175"
	)
	void method5282(class139 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method3190();
		int var6 = 0;
		class128[] var7 = this.method5271();

		for (int var8 = 0; var8 < var7.length; ++var8) {
			class128 var9 = var7[var8];
			if (var3 == null || var4 == var3[var6]) {
				var1.method3167(var2, var9, var6, var5);
			}

			++var6;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "618264850"
	)
	public static void method5275() {
		ObjectComposition.ObjectDefinition_cached.clear();
		ObjectComposition.ObjectDefinition_cachedModelData.clear();
		ObjectComposition.ObjectDefinition_cachedEntities.clear();
		ObjectComposition.ObjectDefinition_cachedModels.clear();
	}
}
