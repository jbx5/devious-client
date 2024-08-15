import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
public class class131 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 741526147
	)
	public final int field1539;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	public class131 field1525;
	@ObfuscatedName("an")
	float[][] field1524;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lqy;"
	)
	final TransformationMatrix[] field1527;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Lqy;"
	)
	TransformationMatrix[] field1535;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lqy;"
	)
	TransformationMatrix[] field1529;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	TransformationMatrix field1530;
	@ObfuscatedName("ac")
	boolean field1526;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	TransformationMatrix field1532;
	@ObfuscatedName("ad")
	boolean field1533;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	TransformationMatrix field1534;
	@ObfuscatedName("al")
	float[][] field1531;
	@ObfuscatedName("aj")
	float[][] field1528;
	@ObfuscatedName("as")
	float[][] field1536;

	@ObfuscatedSignature(
		descriptor = "(ILvg;Z)V"
	)
	public class131(int var1, Buffer var2, boolean var3) {
		this.field1530 = new TransformationMatrix();
		this.field1526 = true;
		this.field1532 = new TransformationMatrix();
		this.field1533 = true;
		this.field1534 = new TransformationMatrix();
		this.field1539 = var2.readShort();
		this.field1527 = new TransformationMatrix[var1];
		this.field1535 = new TransformationMatrix[this.field1527.length];
		this.field1529 = new TransformationMatrix[this.field1527.length];
		this.field1524 = new float[this.field1527.length][3];

		for (int var4 = 0; var4 < this.field1527.length; ++var4) {
			this.field1527[var4] = new TransformationMatrix(var2, var3);
			this.field1524[var4][0] = var2.method9614();
			this.field1524[var4][1] = var2.method9614();
			this.field1524[var4][2] = var2.method9614();
		}

		this.method3134();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "786475740"
	)
	void method3134() {
		this.field1531 = new float[this.field1527.length][3];
		this.field1528 = new float[this.field1527.length][3];
		this.field1536 = new float[this.field1527.length][3];
		TransformationMatrix var1;
		synchronized(TransformationMatrix.field4684) {
			if (TransformationMatrix.field4683 == 0) {
				var1 = new TransformationMatrix();
			} else {
				TransformationMatrix.field4684[--TransformationMatrix.field4683].method7865();
				var1 = TransformationMatrix.field4684[TransformationMatrix.field4683];
			}
		}

		TransformationMatrix var2 = var1;

		for (int var5 = 0; var5 < this.field1527.length; ++var5) {
			TransformationMatrix var4 = this.method3165(var5);
			var2.method7869(var4);
			var2.method7878();
			this.field1531[var5] = var2.method7897();
			this.field1528[var5][0] = var4.field4686[12];
			this.field1528[var5][1] = var4.field4686[13];
			this.field1528[var5][2] = var4.field4686[14];
			this.field1536[var5] = var4.method7884();
		}

		var2.method7903();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Lqy;",
		garbageValue = "713674542"
	)
	TransformationMatrix method3165(int var1) {
		return this.field1527[var1];
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lqy;",
		garbageValue = "122581855"
	)
	TransformationMatrix method3155(int var1) {
		if (this.field1535[var1] == null) {
			this.field1535[var1] = new TransformationMatrix(this.method3165(var1));
			if (this.field1525 != null) {
				this.field1535[var1].method7891(this.field1525.method3155(var1));
			} else {
				this.field1535[var1].method7891(TransformationMatrix.field4687);
			}
		}

		return this.field1535[var1];
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Lqy;",
		garbageValue = "-971170558"
	)
	TransformationMatrix method3137(int var1) {
		if (this.field1529[var1] == null) {
			this.field1529[var1] = new TransformationMatrix(this.method3155(var1));
			this.field1529[var1].method7878();
		}

		return this.field1529[var1];
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lqy;B)V",
		garbageValue = "-125"
	)
	void method3153(TransformationMatrix var1) {
		this.field1530.method7869(var1);
		this.field1526 = true;
		this.field1533 = true;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lqy;",
		garbageValue = "-1544859912"
	)
	TransformationMatrix method3169() {
		return this.field1530;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Lqy;",
		garbageValue = "-567052835"
	)
	TransformationMatrix method3140() {
		if (this.field1526) {
			this.field1532.method7869(this.method3169());
			if (this.field1525 != null) {
				this.field1532.method7891(this.field1525.method3140());
			}

			this.field1526 = false;
		}

		return this.field1532;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Lqy;",
		garbageValue = "-2042610885"
	)
	public TransformationMatrix method3141(int var1) {
		if (this.field1533) {
			this.field1534.method7869(this.method3137(var1));
			this.field1534.method7891(this.method3140());
			this.field1533 = false;
		}

		return this.field1534;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-1567142867"
	)
	float[] method3142(int var1) {
		return this.field1531[var1];
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)[F",
		garbageValue = "61"
	)
	float[] method3136(int var1) {
		return this.field1528[var1];
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "1150406771"
	)
	float[] method3144(int var1) {
		return this.field1536[var1];
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1118607478"
	)
	static void method3176() {
		if (Login.Login_username == null || Login.Login_username.length() <= 0) {
			if (TileItem.clientPreferences.getRememberedUsername() != null) {
				Login.Login_username = TileItem.clientPreferences.getRememberedUsername();
				Client.Login_isUsernameRemembered = true;
			} else {
				Client.Login_isUsernameRemembered = false;
			}

		}
	}
}
