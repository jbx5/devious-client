import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
public class class134 {
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -1407412519
	)
	static int field1573;
	@ObfuscatedName("js")
	@ObfuscatedGetter(
		intValue = 576765921
	)
	static int field1572;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 629003935
	)
	public final int field1569;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	public class134 field1574;
	@ObfuscatedName("ak")
	float[][] field1559;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[Lqs;"
	)
	final TransformationMatrix[] field1566;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[Lqs;"
	)
	TransformationMatrix[] field1561;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Lqs;"
	)
	TransformationMatrix[] field1562;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	TransformationMatrix field1568;
	@ObfuscatedName("ae")
	boolean field1560;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	TransformationMatrix field1565;
	@ObfuscatedName("at")
	boolean field1570;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	TransformationMatrix field1567;
	@ObfuscatedName("an")
	float[][] field1575;
	@ObfuscatedName("ao")
	float[][] field1563;
	@ObfuscatedName("af")
	float[][] field1557;

	@ObfuscatedSignature(
		descriptor = "(ILvl;Z)V"
	)
	public class134(int var1, Buffer var2, boolean var3) {
		this.field1568 = new TransformationMatrix();
		this.field1560 = true;
		this.field1565 = new TransformationMatrix();
		this.field1570 = true;
		this.field1567 = new TransformationMatrix();
		this.field1569 = var2.readShort();
		this.field1566 = new TransformationMatrix[var1];
		this.field1561 = new TransformationMatrix[this.field1566.length];
		this.field1562 = new TransformationMatrix[this.field1566.length];
		this.field1559 = new float[this.field1566.length][3];

		for (int var4 = 0; var4 < this.field1566.length; ++var4) {
			this.field1566[var4] = new TransformationMatrix(var2, var3);
			this.field1559[var4][0] = var2.method10096();
			this.field1559[var4][1] = var2.method10096();
			this.field1559[var4][2] = var2.method10096();
		}

		this.method3389();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "7"
	)
	void method3389() {
		this.field1575 = new float[this.field1566.length][3];
		this.field1563 = new float[this.field1566.length][3];
		this.field1557 = new float[this.field1566.length][3];
		TransformationMatrix var1 = class177.method3843();

		for (int var2 = 0; var2 < this.field1566.length; ++var2) {
			TransformationMatrix var3 = this.method3390(var2);
			var1.method8282(var3);
			var1.method8263();
			this.field1575[var2] = var1.method8252();
			this.field1563[var2][0] = var3.field4783[12];
			this.field1563[var2][1] = var3.field4783[13];
			this.field1563[var2][2] = var3.field4783[14];
			this.field1557[var2] = var3.method8331();
		}

		var1.method8284();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqs;",
		garbageValue = "-36"
	)
	TransformationMatrix method3390(int var1) {
		return this.field1566[var1];
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqs;",
		garbageValue = "109"
	)
	TransformationMatrix method3391(int var1) {
		if (this.field1561[var1] == null) {
			this.field1561[var1] = new TransformationMatrix(this.method3390(var1));
			if (this.field1574 != null) {
				this.field1561[var1].method8278(this.field1574.method3391(var1));
			} else {
				this.field1561[var1].method8278(TransformationMatrix.field4784);
			}
		}

		return this.field1561[var1];
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqs;",
		garbageValue = "-55"
	)
	TransformationMatrix method3392(int var1) {
		if (this.field1562[var1] == null) {
			this.field1562[var1] = new TransformationMatrix(this.method3391(var1));
			this.field1562[var1].method8263();
		}

		return this.field1562[var1];
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lqs;I)V",
		garbageValue = "326549326"
	)
	void method3393(TransformationMatrix var1) {
		this.field1568.method8282(var1);
		this.field1560 = true;
		this.field1570 = true;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Lqs;",
		garbageValue = "-124"
	)
	TransformationMatrix method3394() {
		return this.field1568;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Lqs;",
		garbageValue = "-27"
	)
	TransformationMatrix method3395() {
		if (this.field1560) {
			this.field1565.method8282(this.method3394());
			if (this.field1574 != null) {
				this.field1565.method8278(this.field1574.method3395());
			}

			this.field1560 = false;
		}

		return this.field1565;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Lqs;",
		garbageValue = "853655596"
	)
	public TransformationMatrix method3396(int var1) {
		if (this.field1570) {
			this.field1567.method8282(this.method3392(var1));
			this.field1567.method8278(this.method3395());
			this.field1570 = false;
		}

		return this.field1567;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-2131036687"
	)
	float[] method3397(int var1) {
		return this.field1575[var1];
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-2142082017"
	)
	float[] method3398(int var1) {
		return this.field1563[var1];
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-1743433841"
	)
	float[] method3406(int var1) {
		return this.field1557[var1];
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lpe;B)V",
		garbageValue = "116"
	)
	public static void method3428(AbstractArchive var0) {
		VarbitComposition.VarbitDefinition_archive = var0;
	}
}
