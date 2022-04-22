import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
public class class231 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"[Lda;")

	class115[] field2578;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	230124275)

	int field2577;

	@ObfuscatedSignature(descriptor = 
	"(Lpi;I)V")

	class231(Buffer var1, int var2) {
		this.field2578 = new class115[var2];
		this.field2577 = var1.readUnsignedByte();

		for (int var3 = 0; var3 < this.field2578.length; ++var3) {
			class115 var4 = new class115(this.field2577, var1, false);
			this.field2578[var3] = var4;
		}

		this.method4697();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-459048653")

	void method4697() {
		class115[] var1 = this.field2578;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class115 var3 = var1[var2];
			if (var3.field1395 >= 0) {
				var3.field1388 = this.field2578[var3.field1395];
			}
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"139338744")

	public int method4698() {
		return this.field2578.length;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(II)Lda;", garbageValue = 
	"-1090806170")

	class115 method4718(int var1) {
		return this.field2578[var1];
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(I)[Lda;", garbageValue = 
	"856290899")

	class115[] method4700() {
		return this.field2578;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(Ldo;II)V", garbageValue = 
	"-821248386")

	void method4717(class122 var1, int var2) {
		this.method4701(var1, var2, ((boolean[]) (null)), false);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(Ldo;I[ZZI)V", garbageValue = 
	"-1783408058")

	void method4701(class122 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method2766();
		int var6 = 0;
		class115[] var7 = this.method4700();

		for (int var8 = 0; var8 < var7.length; ++var8) {
			class115 var9 = var7[var8];
			if ((var3 == null) || (var4 == var3[var6])) {
				var1.method2796(var2, var9, var6, var5);
			}

			++var6;
		}

	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(descriptor = 
	"(Lky;I)V", garbageValue = 
	"640671653")

	static final void method4712(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 324) {
			if (Client.field561 == (-1)) {
				Client.field561 = var0.spriteId2;
				Client.field775 = var0.spriteId;
			}

			if (Client.playerAppearance.isFemale) {
				var0.spriteId2 = Client.field561;
			} else {
				var0.spriteId2 = Client.field775;
			}

		} else if (var1 == 325) {
			if (Client.field561 == (-1)) {
				Client.field561 = var0.spriteId2;
				Client.field775 = var0.spriteId;
			}

			if (Client.playerAppearance.isFemale) {
				var0.spriteId2 = Client.field775;
			} else {
				var0.spriteId2 = Client.field561;
			}

		} else if (var1 == 327) {
			var0.modelAngleX = 150;
			var0.modelAngleY = ((int) (Math.sin(((double) (Client.cycle)) / 40.0) * 256.0)) & 2047;
			var0.modelType = 5;
			var0.modelId = 0;
		} else if (var1 == 328) {
			var0.modelAngleX = 150;
			var0.modelAngleY = ((int) (Math.sin(((double) (Client.cycle)) / 40.0) * 256.0)) & 2047;
			var0.modelType = 5;
			var0.modelId = 1;
		}
	}
}