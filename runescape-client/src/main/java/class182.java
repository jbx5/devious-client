import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
public class class182 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Lfm;"
	)
	class131[] field1958;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1285680583
	)
	int field1959;

	@ObfuscatedSignature(
		descriptor = "(Lvg;I)V"
	)
	class182(Buffer var1, int var2) {
		this.field1958 = new class131[var2];
		this.field1959 = var1.readUnsignedByte();

		for (int var3 = 0; var3 < this.field1958.length; ++var3) {
			class131 var4 = new class131(this.field1959, var1, false);
			this.field1958[var3] = var4;
		}

		this.method3826();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "191295212"
	)
	void method3826() {
		class131[] var1 = this.field1958;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class131 var3 = var1[var2];
			if (var3.field1539 >= 0) {
				var3.field1525 = this.field1958[var3.field1539];
			}
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "231608461"
	)
	public int method3827() {
		return this.field1958.length;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lfm;",
		garbageValue = "-1997282138"
	)
	class131 method3828(int var1) {
		return var1 >= this.method3827() ? null : this.field1958[var1];
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfm;",
		garbageValue = "-264069258"
	)
	class131[] method3837() {
		return this.field1958;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lfq;II)V",
		garbageValue = "-1504688689"
	)
	void method3839(class142 var1, int var2) {
		this.method3831(var1, var2, (boolean[])null, false);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lfq;I[ZZB)V",
		garbageValue = "103"
	)
	void method3831(class142 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method3263();
		int var6 = 0;
		class131[] var7 = this.method3837();

		for (int var8 = 0; var8 < var7.length; ++var8) {
			class131 var9 = var7[var8];
			if (var3 == null || var4 == var3[var6]) {
				var1.method3286(var2, var9, var6, var5);
			}

			++var6;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Lkr;",
		garbageValue = "-88"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class536.SequenceDefinition_archive.takeFile(12, var0);
			var1 = new SequenceDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
