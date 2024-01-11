import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
public class class128 {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -969057907
	)
	public final int field1494;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	public class128 field1495;
	@ObfuscatedName("af")
	float[][] field1496;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lrh;"
	)
	final class466[] field1506;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lrh;"
	)
	class466[] field1498;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[Lrh;"
	)
	class466[] field1500;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lrh;"
	)
	class466 field1499;
	@ObfuscatedName("ao")
	boolean field1501;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lrh;"
	)
	class466 field1502;
	@ObfuscatedName("aa")
	boolean field1497;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lrh;"
	)
	class466 field1504;
	@ObfuscatedName("an")
	float[][] field1505;
	@ObfuscatedName("ad")
	float[][] field1503;
	@ObfuscatedName("ax")
	float[][] field1507;

	@ObfuscatedSignature(
		descriptor = "(ILuk;Z)V"
	)
	public class128(int var1, Buffer var2, boolean var3) {
		this.field1499 = new class466();
		this.field1501 = true;
		this.field1502 = new class466();
		this.field1497 = true;
		this.field1504 = new class466();
		this.field1494 = var2.readShort();
		this.field1506 = new class466[var1];
		this.field1498 = new class466[this.field1506.length];
		this.field1500 = new class466[this.field1506.length];
		this.field1496 = new float[this.field1506.length][3];

		for (int var4 = 0; var4 < this.field1506.length; ++var4) {
			this.field1506[var4] = new class466(var2, var3);
			this.field1496[var4][0] = var2.method9394();
			this.field1496[var4][1] = var2.method9394();
			this.field1496[var4][2] = var2.method9394();
		}

		this.method3065();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "392360057"
	)
	void method3065() {
		this.field1505 = new float[this.field1506.length][3];
		this.field1503 = new float[this.field1506.length][3];
		this.field1507 = new float[this.field1506.length][3];
		class466 var1 = class255.method5035();

		for (int var2 = 0; var2 < this.field1506.length; ++var2) {
			class466 var3 = this.method3032(var2);
			var1.method8548(var3);
			var1.method8556();
			this.field1505[var2] = var1.method8542();
			this.field1503[var2][0] = var3.field4809[12];
			this.field1503[var2][1] = var3.field4809[13];
			this.field1503[var2][2] = var3.field4809[14];
			this.field1507[var2] = var3.method8560();
		}

		var1.method8559();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Lrh;",
		garbageValue = "-808461038"
	)
	class466 method3032(int var1) {
		return this.field1506[var1];
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Lrh;",
		garbageValue = "-2050887165"
	)
	class466 method3038(int var1) {
		if (this.field1498[var1] == null) {
			this.field1498[var1] = new class466(this.method3032(var1));
			if (this.field1495 != null) {
				this.field1498[var1].method8552(this.field1495.method3038(var1));
			} else {
				this.field1498[var1].method8552(class466.field4807);
			}
		}

		return this.field1498[var1];
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lrh;",
		garbageValue = "-2052086319"
	)
	class466 method3030(int var1) {
		if (this.field1500[var1] == null) {
			this.field1500[var1] = new class466(this.method3038(var1));
			this.field1500[var1].method8556();
		}

		return this.field1500[var1];
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lrh;I)V",
		garbageValue = "-581632848"
	)
	void method3053(class466 var1) {
		this.field1499.method8548(var1);
		this.field1501 = true;
		this.field1497 = true;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lrh;",
		garbageValue = "1188417619"
	)
	class466 method3062() {
		return this.field1499;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Lrh;",
		garbageValue = "8"
	)
	class466 method3036() {
		if (this.field1501) {
			this.field1502.method8548(this.method3062());
			if (this.field1495 != null) {
				this.field1502.method8552(this.field1495.method3036());
			}

			this.field1501 = false;
		}

		return this.field1502;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Lrh;",
		garbageValue = "-1978149370"
	)
	public class466 method3037(int var1) {
		if (this.field1497) {
			this.field1504.method8548(this.method3030(var1));
			this.field1504.method8552(this.method3036());
			this.field1497 = false;
		}

		return this.field1504;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "1301707188"
	)
	float[] method3051(int var1) {
		return this.field1505[var1];
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)[F",
		garbageValue = "1"
	)
	float[] method3054(int var1) {
		return this.field1503[var1];
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)[F",
		garbageValue = "91"
	)
	float[] method3040(int var1) {
		return this.field1507[var1];
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgm;",
		garbageValue = "-112"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0);
			var1 = new VarpDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lnn;IIB)V",
		garbageValue = "39"
	)
	public static void method3070(Widget var0, int var1, int var2) {
		var0.field3759.bodyColors[var1] = var2;
		var0.field3759.method6383();
	}
}
