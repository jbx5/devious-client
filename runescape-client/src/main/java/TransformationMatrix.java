import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qy")
@Implements("TransformationMatrix")
public final class TransformationMatrix {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Lqy;"
	)
	public static TransformationMatrix[] field4684;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1798521433
	)
	static int field4682;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 2021170549
	)
	public static int field4683;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	public static final TransformationMatrix field4687;
	@ObfuscatedName("ax")
	public float[] field4686;

	static {
		field4684 = new TransformationMatrix[0];
		field4682 = 100;
		field4684 = new TransformationMatrix[100];
		field4683 = 0;
		field4687 = new TransformationMatrix();
	}

	public TransformationMatrix() {
		this.field4686 = new float[16];
		this.method7865();
	}

	@ObfuscatedSignature(
		descriptor = "(Lqy;)V"
	)
	public TransformationMatrix(TransformationMatrix var1) {
		this.field4686 = new float[16];
		this.method7869(var1);
	}

	@ObfuscatedSignature(
		descriptor = "(Lvg;Z)V"
	)
	public TransformationMatrix(Buffer var1, boolean var2) {
		this.field4686 = new float[16];
		this.method7864(var1, var2);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "718834154"
	)
	public void method7903() {
		synchronized(field4684) {
			if (field4683 < field4682 - 1) {
				field4684[++field4683 - 1] = this;
			}

		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvg;ZB)V",
		garbageValue = "-41"
	)
	void method7864(Buffer var1, boolean var2) {
		if (var2) {
			class426 var4 = new class426();
			var4.method7946(PlayerUpdateManager.method2892(var1.readShort()));
			var4.method7952(PlayerUpdateManager.method2892(var1.readShort()));
			var4.method7948(PlayerUpdateManager.method2892(var1.readShort()));
			var4.method7955((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort());
			this.method7876(var4);
		} else {
			for (int var3 = 0; var3 < 16; ++var3) {
				this.field4686[var3] = var1.method9614();
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(S)[F",
		garbageValue = "134"
	)
	float[] method7915() {
		float[] var1 = new float[3];
		if ((double)this.field4686[2] < 0.999D && (double)this.field4686[2] > -0.999D) {
			var1[1] = (float)(-Math.asin((double)this.field4686[2]));
			double var2 = Math.cos((double)var1[1]);
			var1[0] = (float)Math.atan2((double)this.field4686[6] / var2, (double)this.field4686[10] / var2);
			var1[2] = (float)Math.atan2((double)this.field4686[1] / var2, (double)this.field4686[0] / var2);
		} else {
			var1[0] = 0.0F;
			var1[1] = (float)Math.atan2((double)this.field4686[2], 0.0D);
			var1[2] = (float)Math.atan2((double)(-this.field4686[9]), (double)this.field4686[5]);
		}

		return var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-1847846352"
	)
	public float[] method7897() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4686[6])), 0.0F, 0.0F};
		double var2 = Math.cos((double)var1[0]);
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) {
			var4 = (double)this.field4686[2];
			var6 = (double)this.field4686[10];
			double var8 = (double)this.field4686[4];
			double var10 = (double)this.field4686[5];
			var1[1] = (float)Math.atan2(var4, var6);
			var1[2] = (float)Math.atan2(var8, var10);
		} else {
			var4 = (double)this.field4686[1];
			var6 = (double)this.field4686[0];
			if (this.field4686[6] < 0.0F) {
				var1[1] = (float)Math.atan2(var4, var6);
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6));
			}

			var1[2] = 0.0F;
		}

		return var1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "331598711"
	)
	public void method7865() {
		this.field4686[0] = 1.0F;
		this.field4686[1] = 0.0F;
		this.field4686[2] = 0.0F;
		this.field4686[3] = 0.0F;
		this.field4686[4] = 0.0F;
		this.field4686[5] = 1.0F;
		this.field4686[6] = 0.0F;
		this.field4686[7] = 0.0F;
		this.field4686[8] = 0.0F;
		this.field4686[9] = 0.0F;
		this.field4686[10] = 1.0F;
		this.field4686[11] = 0.0F;
		this.field4686[12] = 0.0F;
		this.field4686[13] = 0.0F;
		this.field4686[14] = 0.0F;
		this.field4686[15] = 1.0F;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2125602608"
	)
	public void method7868() {
		this.field4686[0] = 0.0F;
		this.field4686[1] = 0.0F;
		this.field4686[2] = 0.0F;
		this.field4686[3] = 0.0F;
		this.field4686[4] = 0.0F;
		this.field4686[5] = 0.0F;
		this.field4686[6] = 0.0F;
		this.field4686[7] = 0.0F;
		this.field4686[8] = 0.0F;
		this.field4686[9] = 0.0F;
		this.field4686[10] = 0.0F;
		this.field4686[11] = 0.0F;
		this.field4686[12] = 0.0F;
		this.field4686[13] = 0.0F;
		this.field4686[14] = 0.0F;
		this.field4686[15] = 0.0F;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)V",
		garbageValue = "-856021521"
	)
	public void method7869(TransformationMatrix var1) {
		System.arraycopy(var1.field4686, 0, this.field4686, 0, 16);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "1256788625"
	)
	public void method7870(float var1) {
		this.method7898(var1, var1, var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "652773836"
	)
	public void method7898(float var1, float var2, float var3) {
		this.method7865();
		this.field4686[0] = var1;
		this.field4686[5] = var2;
		this.field4686[10] = var3;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lqy;B)V",
		garbageValue = "10"
	)
	public void method7872(TransformationMatrix var1) {
		for (int var2 = 0; var2 < this.field4686.length; ++var2) {
			float[] var10000 = this.field4686;
			var10000[var2] += var1.field4686[var2];
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)V",
		garbageValue = "-565612860"
	)
	public void method7891(TransformationMatrix var1) {
		float var2 = var1.field4686[12] * this.field4686[3] + var1.field4686[8] * this.field4686[2] + this.field4686[0] * var1.field4686[0] + this.field4686[1] * var1.field4686[4];
		float var3 = var1.field4686[13] * this.field4686[3] + this.field4686[0] * var1.field4686[1] + var1.field4686[5] * this.field4686[1] + var1.field4686[9] * this.field4686[2];
		float var4 = this.field4686[3] * var1.field4686[14] + var1.field4686[6] * this.field4686[1] + this.field4686[0] * var1.field4686[2] + var1.field4686[10] * this.field4686[2];
		float var5 = var1.field4686[15] * this.field4686[3] + var1.field4686[11] * this.field4686[2] + var1.field4686[7] * this.field4686[1] + var1.field4686[3] * this.field4686[0];
		float var6 = var1.field4686[12] * this.field4686[7] + this.field4686[5] * var1.field4686[4] + this.field4686[4] * var1.field4686[0] + var1.field4686[8] * this.field4686[6];
		float var7 = var1.field4686[13] * this.field4686[7] + this.field4686[4] * var1.field4686[1] + this.field4686[5] * var1.field4686[5] + this.field4686[6] * var1.field4686[9];
		float var8 = var1.field4686[6] * this.field4686[5] + var1.field4686[2] * this.field4686[4] + var1.field4686[10] * this.field4686[6] + this.field4686[7] * var1.field4686[14];
		float var9 = var1.field4686[15] * this.field4686[7] + var1.field4686[11] * this.field4686[6] + var1.field4686[7] * this.field4686[5] + this.field4686[4] * var1.field4686[3];
		float var10 = var1.field4686[12] * this.field4686[11] + this.field4686[10] * var1.field4686[8] + var1.field4686[4] * this.field4686[9] + this.field4686[8] * var1.field4686[0];
		float var11 = this.field4686[9] * var1.field4686[5] + this.field4686[8] * var1.field4686[1] + var1.field4686[9] * this.field4686[10] + this.field4686[11] * var1.field4686[13];
		float var12 = this.field4686[10] * var1.field4686[10] + this.field4686[8] * var1.field4686[2] + this.field4686[9] * var1.field4686[6] + var1.field4686[14] * this.field4686[11];
		float var13 = this.field4686[11] * var1.field4686[15] + this.field4686[10] * var1.field4686[11] + var1.field4686[3] * this.field4686[8] + var1.field4686[7] * this.field4686[9];
		float var14 = var1.field4686[8] * this.field4686[14] + this.field4686[12] * var1.field4686[0] + this.field4686[13] * var1.field4686[4] + this.field4686[15] * var1.field4686[12];
		float var15 = this.field4686[13] * var1.field4686[5] + var1.field4686[1] * this.field4686[12] + var1.field4686[9] * this.field4686[14] + var1.field4686[13] * this.field4686[15];
		float var16 = var1.field4686[14] * this.field4686[15] + this.field4686[13] * var1.field4686[6] + this.field4686[12] * var1.field4686[2] + this.field4686[14] * var1.field4686[10];
		float var17 = this.field4686[13] * var1.field4686[7] + var1.field4686[3] * this.field4686[12] + this.field4686[14] * var1.field4686[11] + this.field4686[15] * var1.field4686[15];
		this.field4686[0] = var2;
		this.field4686[1] = var3;
		this.field4686[2] = var4;
		this.field4686[3] = var5;
		this.field4686[4] = var6;
		this.field4686[5] = var7;
		this.field4686[6] = var8;
		this.field4686[7] = var9;
		this.field4686[8] = var10;
		this.field4686[9] = var11;
		this.field4686[10] = var12;
		this.field4686[11] = var13;
		this.field4686[12] = var14;
		this.field4686[13] = var15;
		this.field4686[14] = var16;
		this.field4686[15] = var17;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "-83"
	)
	public void method7874(class419 var1) {
		float var2 = var1.field4659.field4680 * var1.field4659.field4680;
		float var3 = var1.field4659.field4677 * var1.field4659.field4680;
		float var4 = var1.field4659.field4681 * var1.field4659.field4680;
		float var5 = var1.field4659.field4679 * var1.field4659.field4680;
		float var6 = var1.field4659.field4677 * var1.field4659.field4677;
		float var7 = var1.field4659.field4681 * var1.field4659.field4677;
		float var8 = var1.field4659.field4679 * var1.field4659.field4677;
		float var9 = var1.field4659.field4681 * var1.field4659.field4681;
		float var10 = var1.field4659.field4679 * var1.field4659.field4681;
		float var11 = var1.field4659.field4679 * var1.field4659.field4679;
		this.field4686[0] = var6 + var2 - var11 - var9;
		this.field4686[1] = var7 + var5 + var7 + var5;
		this.field4686[2] = var8 - var4 - var4 + var8;
		this.field4686[4] = var7 + (var7 - var5 - var5);
		this.field4686[5] = var2 + var9 - var6 - var11;
		this.field4686[6] = var3 + var10 + var10 + var3;
		this.field4686[8] = var8 + var4 + var8 + var4;
		this.field4686[9] = var10 - var3 - var3 + var10;
		this.field4686[10] = var11 + var2 - var9 - var6;
		float[] var12 = this.field4686;
		float[] var13 = this.field4686;
		this.field4686[11] = 0.0F;
		var13[7] = 0.0F;
		var12[3] = 0.0F;
		this.field4686[12] = var1.field4657.field4672;
		this.field4686[13] = var1.field4657.field4669;
		this.field4686[14] = var1.field4657.field4671;
		this.field4686[15] = 1.0F;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lqf;I)V",
		garbageValue = "-352050313"
	)
	public void method7934(class424 var1) {
		float var2 = var1.field4680 * var1.field4680;
		float var3 = var1.field4677 * var1.field4680;
		float var4 = var1.field4680 * var1.field4681;
		float var5 = var1.field4680 * var1.field4679;
		float var6 = var1.field4677 * var1.field4677;
		float var7 = var1.field4681 * var1.field4677;
		float var8 = var1.field4677 * var1.field4679;
		float var9 = var1.field4681 * var1.field4681;
		float var10 = var1.field4681 * var1.field4679;
		float var11 = var1.field4679 * var1.field4679;
		this.field4686[0] = var6 + var2 - var11 - var9;
		this.field4686[1] = var5 + var7 + var5 + var7;
		this.field4686[2] = var8 + (var8 - var4 - var4);
		this.field4686[4] = var7 - var5 - var5 + var7;
		this.field4686[5] = var9 + var2 - var6 - var11;
		this.field4686[6] = var10 + var3 + var10 + var3;
		this.field4686[8] = var8 + var4 + var8 + var4;
		this.field4686[9] = var10 - var3 - var3 + var10;
		this.field4686[10] = var11 + var2 - var9 - var6;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lqi;B)V",
		garbageValue = "93"
	)
	public void method7876(class426 var1) {
		this.field4686[0] = var1.field4701;
		this.field4686[1] = var1.field4694;
		this.field4686[2] = var1.field4692;
		this.field4686[3] = 0.0F;
		this.field4686[4] = var1.field4693;
		this.field4686[5] = var1.field4702;
		this.field4686[6] = var1.field4695;
		this.field4686[7] = 0.0F;
		this.field4686[8] = var1.field4698;
		this.field4686[9] = var1.field4696;
		this.field4686[10] = var1.field4690;
		this.field4686[11] = 0.0F;
		this.field4686[12] = var1.field4691;
		this.field4686[13] = var1.field4700;
		this.field4686[14] = var1.field4699;
		this.field4686[15] = 1.0F;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "950078171"
	)
	float method7867() {
		return this.field4686[12] * this.field4686[3] * this.field4686[6] * this.field4686[9] + (this.field4686[14] * this.field4686[5] * this.field4686[3] * this.field4686[8] + this.field4686[13] * this.field4686[10] * this.field4686[3] * this.field4686[4] + (this.field4686[11] * this.field4686[5] * this.field4686[2] * this.field4686[12] + (this.field4686[6] * this.field4686[1] * this.field4686[8] * this.field4686[15] + this.field4686[1] * this.field4686[4] * this.field4686[11] * this.field4686[14] + (this.field4686[0] * this.field4686[7] * this.field4686[9] * this.field4686[14] + this.field4686[0] * this.field4686[5] * this.field4686[10] * this.field4686[15] - this.field4686[11] * this.field4686[5] * this.field4686[0] * this.field4686[14] - this.field4686[6] * this.field4686[0] * this.field4686[9] * this.field4686[15] + this.field4686[11] * this.field4686[0] * this.field4686[6] * this.field4686[13] - this.field4686[13] * this.field4686[0] * this.field4686[7] * this.field4686[10] - this.field4686[10] * this.field4686[4] * this.field4686[1] * this.field4686[15]) - this.field4686[11] * this.field4686[1] * this.field4686[6] * this.field4686[12] - this.field4686[14] * this.field4686[8] * this.field4686[7] * this.field4686[1] + this.field4686[1] * this.field4686[7] * this.field4686[10] * this.field4686[12] + this.field4686[15] * this.field4686[4] * this.field4686[2] * this.field4686[9] - this.field4686[11] * this.field4686[4] * this.field4686[2] * this.field4686[13] - this.field4686[15] * this.field4686[8] * this.field4686[5] * this.field4686[2]) + this.field4686[7] * this.field4686[2] * this.field4686[8] * this.field4686[13] - this.field4686[12] * this.field4686[9] * this.field4686[7] * this.field4686[2] - this.field4686[14] * this.field4686[4] * this.field4686[3] * this.field4686[9]) - this.field4686[12] * this.field4686[10] * this.field4686[5] * this.field4686[3] - this.field4686[13] * this.field4686[8] * this.field4686[6] * this.field4686[3]);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1001854560"
	)
	public void method7878() {
		float var1 = 1.0F / this.method7867();
		float var2 = (this.field4686[10] * this.field4686[5] * this.field4686[15] - this.field4686[5] * this.field4686[11] * this.field4686[14] - this.field4686[6] * this.field4686[9] * this.field4686[15] + this.field4686[11] * this.field4686[6] * this.field4686[13] + this.field4686[14] * this.field4686[7] * this.field4686[9] - this.field4686[13] * this.field4686[10] * this.field4686[7]) * var1;
		float var3 = (this.field4686[9] * this.field4686[2] * this.field4686[15] + this.field4686[14] * this.field4686[11] * this.field4686[1] + this.field4686[15] * this.field4686[10] * -this.field4686[1] - this.field4686[13] * this.field4686[11] * this.field4686[2] - this.field4686[3] * this.field4686[9] * this.field4686[14] + this.field4686[3] * this.field4686[10] * this.field4686[13]) * var1;
		float var4 = (this.field4686[3] * this.field4686[5] * this.field4686[14] + this.field4686[13] * this.field4686[2] * this.field4686[7] + (this.field4686[15] * this.field4686[6] * this.field4686[1] - this.field4686[1] * this.field4686[7] * this.field4686[14] - this.field4686[15] * this.field4686[5] * this.field4686[2]) - this.field4686[3] * this.field4686[6] * this.field4686[13]) * var1;
		float var5 = (this.field4686[2] * this.field4686[5] * this.field4686[11] + this.field4686[11] * -this.field4686[1] * this.field4686[6] + this.field4686[7] * this.field4686[1] * this.field4686[10] - this.field4686[9] * this.field4686[7] * this.field4686[2] - this.field4686[5] * this.field4686[3] * this.field4686[10] + this.field4686[3] * this.field4686[6] * this.field4686[9]) * var1;
		float var6 = (this.field4686[10] * -this.field4686[4] * this.field4686[15] + this.field4686[14] * this.field4686[11] * this.field4686[4] + this.field4686[15] * this.field4686[6] * this.field4686[8] - this.field4686[12] * this.field4686[11] * this.field4686[6] - this.field4686[14] * this.field4686[8] * this.field4686[7] + this.field4686[12] * this.field4686[7] * this.field4686[10]) * var1;
		float var7 = (this.field4686[14] * this.field4686[3] * this.field4686[8] + this.field4686[15] * this.field4686[10] * this.field4686[0] - this.field4686[11] * this.field4686[0] * this.field4686[14] - this.field4686[15] * this.field4686[8] * this.field4686[2] + this.field4686[11] * this.field4686[2] * this.field4686[12] - this.field4686[10] * this.field4686[3] * this.field4686[12]) * var1;
		float var8 = (this.field4686[12] * this.field4686[3] * this.field4686[6] + (this.field4686[15] * this.field4686[6] * -this.field4686[0] + this.field4686[7] * this.field4686[0] * this.field4686[14] + this.field4686[15] * this.field4686[4] * this.field4686[2] - this.field4686[12] * this.field4686[2] * this.field4686[7] - this.field4686[3] * this.field4686[4] * this.field4686[14])) * var1;
		float var9 = (this.field4686[10] * this.field4686[3] * this.field4686[4] + this.field4686[2] * this.field4686[7] * this.field4686[8] + (this.field4686[11] * this.field4686[0] * this.field4686[6] - this.field4686[0] * this.field4686[7] * this.field4686[10] - this.field4686[11] * this.field4686[2] * this.field4686[4]) - this.field4686[8] * this.field4686[6] * this.field4686[3]) * var1;
		float var10 = (this.field4686[9] * this.field4686[4] * this.field4686[15] - this.field4686[13] * this.field4686[11] * this.field4686[4] - this.field4686[5] * this.field4686[8] * this.field4686[15] + this.field4686[12] * this.field4686[5] * this.field4686[11] + this.field4686[13] * this.field4686[7] * this.field4686[8] - this.field4686[9] * this.field4686[7] * this.field4686[12]) * var1;
		float var11 = var1 * (this.field4686[0] * this.field4686[11] * this.field4686[13] + this.field4686[15] * -this.field4686[0] * this.field4686[9] + this.field4686[1] * this.field4686[8] * this.field4686[15] - this.field4686[12] * this.field4686[1] * this.field4686[11] - this.field4686[3] * this.field4686[8] * this.field4686[13] + this.field4686[12] * this.field4686[9] * this.field4686[3]);
		float var12 = var1 * (this.field4686[7] * this.field4686[1] * this.field4686[12] + (this.field4686[5] * this.field4686[0] * this.field4686[15] - this.field4686[13] * this.field4686[7] * this.field4686[0] - this.field4686[15] * this.field4686[1] * this.field4686[4]) + this.field4686[3] * this.field4686[4] * this.field4686[13] - this.field4686[3] * this.field4686[5] * this.field4686[12]);
		float var13 = (this.field4686[11] * this.field4686[4] * this.field4686[1] + this.field4686[5] * -this.field4686[0] * this.field4686[11] + this.field4686[9] * this.field4686[7] * this.field4686[0] - this.field4686[1] * this.field4686[7] * this.field4686[8] - this.field4686[9] * this.field4686[4] * this.field4686[3] + this.field4686[8] * this.field4686[3] * this.field4686[5]) * var1;
		float var14 = (this.field4686[4] * this.field4686[10] * this.field4686[13] + this.field4686[14] * this.field4686[9] * -this.field4686[4] + this.field4686[14] * this.field4686[5] * this.field4686[8] - this.field4686[5] * this.field4686[10] * this.field4686[12] - this.field4686[13] * this.field4686[6] * this.field4686[8] + this.field4686[9] * this.field4686[6] * this.field4686[12]) * var1;
		float var15 = (this.field4686[12] * this.field4686[1] * this.field4686[10] + (this.field4686[14] * this.field4686[9] * this.field4686[0] - this.field4686[13] * this.field4686[10] * this.field4686[0] - this.field4686[1] * this.field4686[8] * this.field4686[14]) + this.field4686[13] * this.field4686[2] * this.field4686[8] - this.field4686[12] * this.field4686[2] * this.field4686[9]) * var1;
		float var16 = var1 * (this.field4686[6] * this.field4686[0] * this.field4686[13] + -this.field4686[0] * this.field4686[5] * this.field4686[14] + this.field4686[1] * this.field4686[4] * this.field4686[14] - this.field4686[12] * this.field4686[1] * this.field4686[6] - this.field4686[2] * this.field4686[4] * this.field4686[13] + this.field4686[2] * this.field4686[5] * this.field4686[12]);
		float var17 = (this.field4686[9] * this.field4686[2] * this.field4686[4] + this.field4686[10] * this.field4686[0] * this.field4686[5] - this.field4686[9] * this.field4686[0] * this.field4686[6] - this.field4686[10] * this.field4686[4] * this.field4686[1] + this.field4686[6] * this.field4686[1] * this.field4686[8] - this.field4686[2] * this.field4686[5] * this.field4686[8]) * var1;
		this.field4686[0] = var2;
		this.field4686[1] = var3;
		this.field4686[2] = var4;
		this.field4686[3] = var5;
		this.field4686[4] = var6;
		this.field4686[5] = var7;
		this.field4686[6] = var8;
		this.field4686[7] = var9;
		this.field4686[8] = var10;
		this.field4686[9] = var11;
		this.field4686[10] = var12;
		this.field4686[11] = var13;
		this.field4686[12] = var14;
		this.field4686[13] = var15;
		this.field4686[14] = var16;
		this.field4686[15] = var17;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "862283080"
	)
	public void method7879(float var1, float var2, float var3, float var4) {
		this.field4686[0] = var1;
		this.field4686[1] = 0.0F;
		this.field4686[2] = 0.0F;
		this.field4686[3] = 0.0F;
		this.field4686[4] = 0.0F;
		this.field4686[5] = var2;
		this.field4686[6] = 0.0F;
		this.field4686[7] = 0.0F;
		this.field4686[8] = 0.0F;
		this.field4686[9] = 0.0F;
		this.field4686[10] = var3;
		this.field4686[11] = 0.0F;
		this.field4686[12] = 0.0F;
		this.field4686[13] = 0.0F;
		this.field4686[14] = 0.0F;
		this.field4686[15] = var4;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(FFF[FI)V",
		garbageValue = "1412467339"
	)
	@Export("transformPoint")
	public void transformPoint(float var1, float var2, float var3, float[] var4) {
		var4[0] = this.field4686[12] + var2 * this.field4686[4] + this.field4686[0] * var1 + var3 * this.field4686[8];
		var4[1] = var2 * this.field4686[5] + var1 * this.field4686[1] + var3 * this.field4686[9] + this.field4686[13];
		var4[2] = this.field4686[14] + var3 * this.field4686[10] + this.field4686[6] * var2 + this.field4686[2] * var1;
		if (var4.length > 3) {
			var4[3] = this.field4686[15] + this.field4686[11] * var3 + var2 * this.field4686[7] + var1 * this.field4686[3];
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(FFFI)F",
		garbageValue = "-726439764"
	)
	public float method7881(float var1, float var2, float var3) {
		return this.field4686[8] * var3 + var1 * this.field4686[0] + var2 * this.field4686[4] + this.field4686[12];
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(FFFI)F",
		garbageValue = "-523207071"
	)
	public float method7882(float var1, float var2, float var3) {
		return this.field4686[13] + var3 * this.field4686[9] + var1 * this.field4686[1] + this.field4686[5] * var2;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(FFFI)F",
		garbageValue = "-579209069"
	)
	public float method7937(float var1, float var2, float var3) {
		return this.field4686[14] + this.field4686[2] * var1 + var2 * this.field4686[6] + this.field4686[10] * var3;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "330869820"
	)
	public float[] method7884() {
		float[] var1 = new float[3];
		class423 var2 = new class423(this.field4686[0], this.field4686[1], this.field4686[2]);
		class423 var3 = new class423(this.field4686[4], this.field4686[5], this.field4686[6]);
		class423 var4 = new class423(this.field4686[8], this.field4686[9], this.field4686[10]);
		var1[0] = var2.method7818();
		var1[1] = var3.method7818();
		var1[2] = var4.method7818();
		return var1;
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method7897();
		this.method7915();

		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.field4686[var3 + var2 * 4];
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) {
					var4 = 0.0F;
				}

				var1.append(var4);
			}

			var1.append("\n");
		}

		return var1.toString();
	}

	public int hashCode() {
		boolean var1 = true;
		byte var2 = 1;
		int var3 = var2 * 31 + Arrays.hashCode(this.field4686);
		return var3;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof TransformationMatrix)) {
			return false;
		} else {
			TransformationMatrix var2 = (TransformationMatrix)var1;

			for (int var3 = 0; var3 < 16; ++var3) {
				if (this.field4686[var3] != var2.field4686[var3]) {
					return false;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1907981556"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}
}
