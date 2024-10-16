import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qs")
@Implements("TransformationMatrix")
public final class TransformationMatrix {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lqs;"
	)
	static TransformationMatrix[] field4781;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 155603777
	)
	static int field4780;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	public static final TransformationMatrix field4784;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("ItemDefinition_modelArchive")
	static AbstractArchive ItemDefinition_modelArchive;
	@ObfuscatedName("ai")
	public float[] field4783;

	static {
		field4781 = new TransformationMatrix[0];
		Widget.method7407(100);
		field4784 = new TransformationMatrix();
	}

	public TransformationMatrix() {
		this.field4783 = new float[16];
		this.method8271();
	}

	@ObfuscatedSignature(
		descriptor = "(Lqs;)V"
	)
	public TransformationMatrix(TransformationMatrix var1) {
		this.field4783 = new float[16];
		this.method8282(var1);
	}

	@ObfuscatedSignature(
		descriptor = "(Lvl;Z)V"
	)
	public TransformationMatrix(Buffer var1, boolean var2) {
		this.field4783 = new float[16];
		this.method8250(var1, var2);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-47"
	)
	public void method8284() {
		synchronized(field4781) {
			if (SecureRandomCallable.field1053 < field4780 - 1) {
				field4781[++SecureRandomCallable.field1053 - 1] = this;
			}

		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lvl;ZI)V",
		garbageValue = "-935615738"
	)
	void method8250(Buffer var1, boolean var2) {
		if (var2) {
			class429 var13 = new class429();
			int var6 = var1.readShort();
			var6 &= 16383;
			float var5 = (float)(3.834951969714103E-4D * (double)((float)var6));
			var13.method8339(var5);
			int var9 = var1.readShort();
			var9 &= 16383;
			float var8 = (float)(3.834951969714103E-4D * (double)((float)var9));
			var13.method8340(var8);
			int var12 = var1.readShort();
			var12 &= 16383;
			float var11 = (float)(3.834951969714103E-4D * (double)((float)var12));
			var13.method8341(var11);
			var13.method8338((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort());
			this.method8261(var13);
		} else {
			for (int var3 = 0; var3 < 16; ++var3) {
				this.field4783[var3] = var1.method10096();
			}
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "1073429274"
	)
	float[] method8272() {
		float[] var1 = new float[3];
		if ((double)this.field4783[2] < 0.999D && (double)this.field4783[2] > -0.999D) {
			var1[1] = (float)(-Math.asin((double)this.field4783[2]));
			double var2 = Math.cos((double)var1[1]);
			var1[0] = (float)Math.atan2((double)this.field4783[6] / var2, (double)this.field4783[10] / var2);
			var1[2] = (float)Math.atan2((double)this.field4783[1] / var2, (double)this.field4783[0] / var2);
		} else {
			var1[0] = 0.0F;
			var1[1] = (float)Math.atan2((double)this.field4783[2], 0.0D);
			var1[2] = (float)Math.atan2((double)(-this.field4783[9]), (double)this.field4783[5]);
		}

		return var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "-114"
	)
	public float[] method8252() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4783[6])), 0.0F, 0.0F};
		double var2 = Math.cos((double)var1[0]);
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) {
			var4 = (double)this.field4783[2];
			var6 = (double)this.field4783[10];
			double var8 = (double)this.field4783[4];
			double var10 = (double)this.field4783[5];
			var1[1] = (float)Math.atan2(var4, var6);
			var1[2] = (float)Math.atan2(var8, var10);
		} else {
			var4 = (double)this.field4783[1];
			var6 = (double)this.field4783[0];
			if (this.field4783[6] < 0.0F) {
				var1[1] = (float)Math.atan2(var4, var6);
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6));
			}

			var1[2] = 0.0F;
		}

		return var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "122"
	)
	void method8271() {
		this.field4783[0] = 1.0F;
		this.field4783[1] = 0.0F;
		this.field4783[2] = 0.0F;
		this.field4783[3] = 0.0F;
		this.field4783[4] = 0.0F;
		this.field4783[5] = 1.0F;
		this.field4783[6] = 0.0F;
		this.field4783[7] = 0.0F;
		this.field4783[8] = 0.0F;
		this.field4783[9] = 0.0F;
		this.field4783[10] = 1.0F;
		this.field4783[11] = 0.0F;
		this.field4783[12] = 0.0F;
		this.field4783[13] = 0.0F;
		this.field4783[14] = 0.0F;
		this.field4783[15] = 1.0F;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "71"
	)
	public void method8303() {
		this.field4783[0] = 0.0F;
		this.field4783[1] = 0.0F;
		this.field4783[2] = 0.0F;
		this.field4783[3] = 0.0F;
		this.field4783[4] = 0.0F;
		this.field4783[5] = 0.0F;
		this.field4783[6] = 0.0F;
		this.field4783[7] = 0.0F;
		this.field4783[8] = 0.0F;
		this.field4783[9] = 0.0F;
		this.field4783[10] = 0.0F;
		this.field4783[11] = 0.0F;
		this.field4783[12] = 0.0F;
		this.field4783[13] = 0.0F;
		this.field4783[14] = 0.0F;
		this.field4783[15] = 0.0F;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lqs;I)V",
		garbageValue = "-1650103875"
	)
	public void method8282(TransformationMatrix var1) {
		System.arraycopy(var1.field4783, 0, this.field4783, 0, 16);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "1159775402"
	)
	public void method8255(float var1) {
		this.method8256(var1, var1, var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "423602413"
	)
	public void method8256(float var1, float var2, float var3) {
		this.method8271();
		this.field4783[0] = var1;
		this.field4783[5] = var2;
		this.field4783[10] = var3;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lqs;I)V",
		garbageValue = "61210655"
	)
	public void method8257(TransformationMatrix var1) {
		for (int var2 = 0; var2 < this.field4783.length; ++var2) {
			float[] var10000 = this.field4783;
			var10000[var2] += var1.field4783[var2];
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lqs;I)V",
		garbageValue = "-386531990"
	)
	public void method8278(TransformationMatrix var1) {
		float var2 = this.field4783[1] * var1.field4783[4] + this.field4783[0] * var1.field4783[0] + this.field4783[2] * var1.field4783[8] + this.field4783[3] * var1.field4783[12];
		float var3 = this.field4783[1] * var1.field4783[5] + this.field4783[0] * var1.field4783[1] + var1.field4783[9] * this.field4783[2] + this.field4783[3] * var1.field4783[13];
		float var4 = this.field4783[0] * var1.field4783[2] + this.field4783[1] * var1.field4783[6] + var1.field4783[10] * this.field4783[2] + var1.field4783[14] * this.field4783[3];
		float var5 = this.field4783[3] * var1.field4783[15] + this.field4783[2] * var1.field4783[11] + var1.field4783[3] * this.field4783[0] + var1.field4783[7] * this.field4783[1];
		float var6 = var1.field4783[12] * this.field4783[7] + var1.field4783[8] * this.field4783[6] + this.field4783[4] * var1.field4783[0] + var1.field4783[4] * this.field4783[5];
		float var7 = this.field4783[7] * var1.field4783[13] + var1.field4783[5] * this.field4783[5] + this.field4783[4] * var1.field4783[1] + this.field4783[6] * var1.field4783[9];
		float var8 = this.field4783[4] * var1.field4783[2] + this.field4783[5] * var1.field4783[6] + this.field4783[6] * var1.field4783[10] + var1.field4783[14] * this.field4783[7];
		float var9 = this.field4783[6] * var1.field4783[11] + var1.field4783[3] * this.field4783[4] + var1.field4783[7] * this.field4783[5] + this.field4783[7] * var1.field4783[15];
		float var10 = this.field4783[10] * var1.field4783[8] + this.field4783[8] * var1.field4783[0] + var1.field4783[4] * this.field4783[9] + this.field4783[11] * var1.field4783[12];
		float var11 = this.field4783[11] * var1.field4783[13] + var1.field4783[1] * this.field4783[8] + var1.field4783[5] * this.field4783[9] + var1.field4783[9] * this.field4783[10];
		float var12 = var1.field4783[10] * this.field4783[10] + var1.field4783[2] * this.field4783[8] + var1.field4783[6] * this.field4783[9] + this.field4783[11] * var1.field4783[14];
		float var13 = this.field4783[8] * var1.field4783[3] + this.field4783[9] * var1.field4783[7] + var1.field4783[11] * this.field4783[10] + var1.field4783[15] * this.field4783[11];
		float var14 = this.field4783[15] * var1.field4783[12] + this.field4783[12] * var1.field4783[0] + this.field4783[13] * var1.field4783[4] + this.field4783[14] * var1.field4783[8];
		float var15 = var1.field4783[13] * this.field4783[15] + var1.field4783[9] * this.field4783[14] + var1.field4783[1] * this.field4783[12] + var1.field4783[5] * this.field4783[13];
		float var16 = var1.field4783[14] * this.field4783[15] + this.field4783[14] * var1.field4783[10] + this.field4783[13] * var1.field4783[6] + var1.field4783[2] * this.field4783[12];
		float var17 = this.field4783[15] * var1.field4783[15] + this.field4783[14] * var1.field4783[11] + var1.field4783[7] * this.field4783[13] + this.field4783[12] * var1.field4783[3];
		this.field4783[0] = var2;
		this.field4783[1] = var3;
		this.field4783[2] = var4;
		this.field4783[3] = var5;
		this.field4783[4] = var6;
		this.field4783[5] = var7;
		this.field4783[6] = var8;
		this.field4783[7] = var9;
		this.field4783[8] = var10;
		this.field4783[9] = var11;
		this.field4783[10] = var12;
		this.field4783[11] = var13;
		this.field4783[12] = var14;
		this.field4783[13] = var15;
		this.field4783[14] = var16;
		this.field4783[15] = var17;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lqj;I)V",
		garbageValue = "1591549714"
	)
	public void method8259(class422 var1) {
		float var2 = var1.field4752.field4779 * var1.field4752.field4779;
		float var3 = var1.field4752.field4778 * var1.field4752.field4779;
		float var4 = var1.field4752.field4774 * var1.field4752.field4779;
		float var5 = var1.field4752.field4777 * var1.field4752.field4779;
		float var6 = var1.field4752.field4778 * var1.field4752.field4778;
		float var7 = var1.field4752.field4774 * var1.field4752.field4778;
		float var8 = var1.field4752.field4777 * var1.field4752.field4778;
		float var9 = var1.field4752.field4774 * var1.field4752.field4774;
		float var10 = var1.field4752.field4777 * var1.field4752.field4774;
		float var11 = var1.field4752.field4777 * var1.field4752.field4777;
		this.field4783[0] = var2 + var6 - var11 - var9;
		this.field4783[1] = var5 + var5 + var7 + var7;
		this.field4783[2] = var8 - var4 - var4 + var8;
		this.field4783[4] = var7 + (var7 - var5 - var5);
		this.field4783[5] = var2 + var9 - var6 - var11;
		this.field4783[6] = var10 + var3 + var10 + var3;
		this.field4783[8] = var4 + var8 + var4 + var8;
		this.field4783[9] = var10 - var3 - var3 + var10;
		this.field4783[10] = var2 + var11 - var9 - var6;
		float[] var12 = this.field4783;
		float[] var13 = this.field4783;
		this.field4783[11] = 0.0F;
		var13[7] = 0.0F;
		var12[3] = 0.0F;
		this.field4783[12] = var1.field4753.field4771;
		this.field4783[13] = var1.field4753.field4772;
		this.field4783[14] = var1.field4753.field4766;
		this.field4783[15] = 1.0F;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lqp;I)V",
		garbageValue = "1589462474"
	)
	public void method8260(class427 var1) {
		float var2 = var1.field4779 * var1.field4779;
		float var3 = var1.field4779 * var1.field4778;
		float var4 = var1.field4774 * var1.field4779;
		float var5 = var1.field4779 * var1.field4777;
		float var6 = var1.field4778 * var1.field4778;
		float var7 = var1.field4778 * var1.field4774;
		float var8 = var1.field4778 * var1.field4777;
		float var9 = var1.field4774 * var1.field4774;
		float var10 = var1.field4774 * var1.field4777;
		float var11 = var1.field4777 * var1.field4777;
		this.field4783[0] = var2 + var6 - var11 - var9;
		this.field4783[1] = var7 + var5 + var7 + var5;
		this.field4783[2] = var8 + (var8 - var4 - var4);
		this.field4783[4] = var7 - var5 - var5 + var7;
		this.field4783[5] = var2 + var9 - var6 - var11;
		this.field4783[6] = var3 + var10 + var3 + var10;
		this.field4783[8] = var4 + var4 + var8 + var8;
		this.field4783[9] = var10 + (var10 - var3 - var3);
		this.field4783[10] = var11 + var2 - var9 - var6;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lqh;I)V",
		garbageValue = "-1473520632"
	)
	public void method8261(class429 var1) {
		this.field4783[0] = var1.field4789;
		this.field4783[1] = var1.field4787;
		this.field4783[2] = var1.field4796;
		this.field4783[3] = 0.0F;
		this.field4783[4] = var1.field4788;
		this.field4783[5] = var1.field4790;
		this.field4783[6] = var1.field4791;
		this.field4783[7] = 0.0F;
		this.field4783[8] = var1.field4792;
		this.field4783[9] = var1.field4793;
		this.field4783[10] = var1.field4794;
		this.field4783[11] = 0.0F;
		this.field4783[12] = var1.field4795;
		this.field4783[13] = var1.field4786;
		this.field4783[14] = var1.field4797;
		this.field4783[15] = 1.0F;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "58198887"
	)
	float method8262() {
		return this.field4783[3] * this.field4783[6] * this.field4783[9] * this.field4783[12] + (this.field4783[3] * this.field4783[5] * this.field4783[8] * this.field4783[14] + this.field4783[15] * this.field4783[5] * this.field4783[0] * this.field4783[10] - this.field4783[14] * this.field4783[11] * this.field4783[5] * this.field4783[0] - this.field4783[15] * this.field4783[9] * this.field4783[0] * this.field4783[6] + this.field4783[13] * this.field4783[0] * this.field4783[6] * this.field4783[11] + this.field4783[14] * this.field4783[9] * this.field4783[7] * this.field4783[0] - this.field4783[13] * this.field4783[10] * this.field4783[0] * this.field4783[7] - this.field4783[4] * this.field4783[1] * this.field4783[10] * this.field4783[15] + this.field4783[11] * this.field4783[1] * this.field4783[4] * this.field4783[14] + this.field4783[8] * this.field4783[6] * this.field4783[1] * this.field4783[15] - this.field4783[1] * this.field4783[6] * this.field4783[11] * this.field4783[12] - this.field4783[14] * this.field4783[1] * this.field4783[7] * this.field4783[8] + this.field4783[12] * this.field4783[10] * this.field4783[1] * this.field4783[7] + this.field4783[15] * this.field4783[2] * this.field4783[4] * this.field4783[9] - this.field4783[13] * this.field4783[2] * this.field4783[4] * this.field4783[11] - this.field4783[5] * this.field4783[2] * this.field4783[8] * this.field4783[15] + this.field4783[11] * this.field4783[5] * this.field4783[2] * this.field4783[12] + this.field4783[13] * this.field4783[8] * this.field4783[2] * this.field4783[7] - this.field4783[7] * this.field4783[2] * this.field4783[9] * this.field4783[12] - this.field4783[14] * this.field4783[9] * this.field4783[4] * this.field4783[3] + this.field4783[13] * this.field4783[3] * this.field4783[4] * this.field4783[10] - this.field4783[10] * this.field4783[3] * this.field4783[5] * this.field4783[12] - this.field4783[13] * this.field4783[8] * this.field4783[3] * this.field4783[6]);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "100"
	)
	public void method8263() {
		float var1 = 1.0F / this.method8262();
		float var2 = var1 * (this.field4783[13] * this.field4783[11] * this.field4783[6] + (this.field4783[5] * this.field4783[10] * this.field4783[15] - this.field4783[14] * this.field4783[5] * this.field4783[11] - this.field4783[6] * this.field4783[9] * this.field4783[15]) + this.field4783[7] * this.field4783[9] * this.field4783[14] - this.field4783[13] * this.field4783[10] * this.field4783[7]);
		float var3 = var1 * (this.field4783[9] * this.field4783[2] * this.field4783[15] + this.field4783[10] * -this.field4783[1] * this.field4783[15] + this.field4783[1] * this.field4783[11] * this.field4783[14] - this.field4783[11] * this.field4783[2] * this.field4783[13] - this.field4783[9] * this.field4783[3] * this.field4783[14] + this.field4783[10] * this.field4783[3] * this.field4783[13]);
		float var4 = var1 * (this.field4783[14] * this.field4783[5] * this.field4783[3] + this.field4783[15] * this.field4783[6] * this.field4783[1] - this.field4783[1] * this.field4783[7] * this.field4783[14] - this.field4783[15] * this.field4783[2] * this.field4783[5] + this.field4783[13] * this.field4783[7] * this.field4783[2] - this.field4783[6] * this.field4783[3] * this.field4783[13]);
		float var5 = var1 * (this.field4783[10] * this.field4783[7] * this.field4783[1] + this.field4783[6] * -this.field4783[1] * this.field4783[11] + this.field4783[5] * this.field4783[2] * this.field4783[11] - this.field4783[9] * this.field4783[2] * this.field4783[7] - this.field4783[3] * this.field4783[5] * this.field4783[10] + this.field4783[6] * this.field4783[3] * this.field4783[9]);
		float var6 = var1 * (this.field4783[12] * this.field4783[10] * this.field4783[7] + (this.field4783[8] * this.field4783[6] * this.field4783[15] + this.field4783[15] * -this.field4783[4] * this.field4783[10] + this.field4783[14] * this.field4783[11] * this.field4783[4] - this.field4783[12] * this.field4783[6] * this.field4783[11] - this.field4783[14] * this.field4783[8] * this.field4783[7]));
		float var7 = var1 * (this.field4783[15] * this.field4783[10] * this.field4783[0] - this.field4783[11] * this.field4783[0] * this.field4783[14] - this.field4783[15] * this.field4783[2] * this.field4783[8] + this.field4783[2] * this.field4783[11] * this.field4783[12] + this.field4783[14] * this.field4783[8] * this.field4783[3] - this.field4783[3] * this.field4783[10] * this.field4783[12]);
		float var8 = var1 * (this.field4783[6] * this.field4783[3] * this.field4783[12] + (this.field4783[6] * -this.field4783[0] * this.field4783[15] + this.field4783[14] * this.field4783[7] * this.field4783[0] + this.field4783[15] * this.field4783[2] * this.field4783[4] - this.field4783[12] * this.field4783[7] * this.field4783[2] - this.field4783[4] * this.field4783[3] * this.field4783[14]));
		float var9 = (this.field4783[6] * this.field4783[0] * this.field4783[11] - this.field4783[10] * this.field4783[0] * this.field4783[7] - this.field4783[4] * this.field4783[2] * this.field4783[11] + this.field4783[7] * this.field4783[2] * this.field4783[8] + this.field4783[3] * this.field4783[4] * this.field4783[10] - this.field4783[8] * this.field4783[6] * this.field4783[3]) * var1;
		float var10 = var1 * (this.field4783[9] * this.field4783[4] * this.field4783[15] - this.field4783[11] * this.field4783[4] * this.field4783[13] - this.field4783[15] * this.field4783[5] * this.field4783[8] + this.field4783[12] * this.field4783[11] * this.field4783[5] + this.field4783[7] * this.field4783[8] * this.field4783[13] - this.field4783[7] * this.field4783[9] * this.field4783[12]);
		float var11 = var1 * (this.field4783[9] * -this.field4783[0] * this.field4783[15] + this.field4783[11] * this.field4783[0] * this.field4783[13] + this.field4783[15] * this.field4783[8] * this.field4783[1] - this.field4783[12] * this.field4783[11] * this.field4783[1] - this.field4783[13] * this.field4783[8] * this.field4783[3] + this.field4783[12] * this.field4783[9] * this.field4783[3]);
		float var12 = (this.field4783[5] * this.field4783[0] * this.field4783[15] - this.field4783[7] * this.field4783[0] * this.field4783[13] - this.field4783[15] * this.field4783[1] * this.field4783[4] + this.field4783[12] * this.field4783[7] * this.field4783[1] + this.field4783[4] * this.field4783[3] * this.field4783[13] - this.field4783[12] * this.field4783[3] * this.field4783[5]) * var1;
		float var13 = var1 * (this.field4783[11] * this.field4783[4] * this.field4783[1] + this.field4783[11] * this.field4783[5] * -this.field4783[0] + this.field4783[9] * this.field4783[0] * this.field4783[7] - this.field4783[1] * this.field4783[7] * this.field4783[8] - this.field4783[4] * this.field4783[3] * this.field4783[9] + this.field4783[8] * this.field4783[5] * this.field4783[3]);
		float var14 = (this.field4783[8] * this.field4783[5] * this.field4783[14] + this.field4783[10] * this.field4783[4] * this.field4783[13] + this.field4783[9] * -this.field4783[4] * this.field4783[14] - this.field4783[12] * this.field4783[10] * this.field4783[5] - this.field4783[8] * this.field4783[6] * this.field4783[13] + this.field4783[6] * this.field4783[9] * this.field4783[12]) * var1;
		float var15 = (this.field4783[8] * this.field4783[2] * this.field4783[13] + this.field4783[9] * this.field4783[0] * this.field4783[14] - this.field4783[0] * this.field4783[10] * this.field4783[13] - this.field4783[8] * this.field4783[1] * this.field4783[14] + this.field4783[1] * this.field4783[10] * this.field4783[12] - this.field4783[12] * this.field4783[2] * this.field4783[9]) * var1;
		float var16 = var1 * (this.field4783[12] * this.field4783[5] * this.field4783[2] + (this.field4783[1] * this.field4783[4] * this.field4783[14] + this.field4783[14] * -this.field4783[0] * this.field4783[5] + this.field4783[13] * this.field4783[0] * this.field4783[6] - this.field4783[6] * this.field4783[1] * this.field4783[12] - this.field4783[13] * this.field4783[2] * this.field4783[4]));
		float var17 = (this.field4783[10] * this.field4783[5] * this.field4783[0] - this.field4783[9] * this.field4783[6] * this.field4783[0] - this.field4783[10] * this.field4783[1] * this.field4783[4] + this.field4783[6] * this.field4783[1] * this.field4783[8] + this.field4783[2] * this.field4783[4] * this.field4783[9] - this.field4783[8] * this.field4783[5] * this.field4783[2]) * var1;
		this.field4783[0] = var2;
		this.field4783[1] = var3;
		this.field4783[2] = var4;
		this.field4783[3] = var5;
		this.field4783[4] = var6;
		this.field4783[5] = var7;
		this.field4783[6] = var8;
		this.field4783[7] = var9;
		this.field4783[8] = var10;
		this.field4783[9] = var11;
		this.field4783[10] = var12;
		this.field4783[11] = var13;
		this.field4783[12] = var14;
		this.field4783[13] = var15;
		this.field4783[14] = var16;
		this.field4783[15] = var17;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "-659724977"
	)
	public void method8325(float var1, float var2, float var3, float var4) {
		this.field4783[0] = var1;
		this.field4783[1] = 0.0F;
		this.field4783[2] = 0.0F;
		this.field4783[3] = 0.0F;
		this.field4783[4] = 0.0F;
		this.field4783[5] = var2;
		this.field4783[6] = 0.0F;
		this.field4783[7] = 0.0F;
		this.field4783[8] = 0.0F;
		this.field4783[9] = 0.0F;
		this.field4783[10] = var3;
		this.field4783[11] = 0.0F;
		this.field4783[12] = 0.0F;
		this.field4783[13] = 0.0F;
		this.field4783[14] = 0.0F;
		this.field4783[15] = var4;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(FFF[FB)V",
		garbageValue = "118"
	)
	@Export("transformPoint")
	public void transformPoint(float var1, float var2, float var3, float[] var4) {
		var4[0] = var3 * this.field4783[8] + var2 * this.field4783[4] + var1 * this.field4783[0] + this.field4783[12];
		var4[1] = this.field4783[13] + var3 * this.field4783[9] + this.field4783[1] * var1 + this.field4783[5] * var2;
		var4[2] = this.field4783[14] + this.field4783[10] * var3 + this.field4783[6] * var2 + var1 * this.field4783[2];
		if (var4.length > 3) {
			var4[3] = this.field4783[11] * var3 + var1 * this.field4783[3] + this.field4783[7] * var2 + this.field4783[15];
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(FFFI)Lqt;",
		garbageValue = "821716019"
	)
	public class426 method8266(float var1, float var2, float var3) {
		float var4 = 1.0F / (var1 * this.field4783[3] + this.field4783[7] * var2 + var3 * this.field4783[11] + this.field4783[15]);
		return new class426((var1 * this.field4783[0] + var2 * this.field4783[4] + var3 * this.field4783[8] + this.field4783[12]) * var4, var4 * (this.field4783[13] + var3 * this.field4783[9] + this.field4783[1] * var1 + var2 * this.field4783[5]), var4 * (var2 * this.field4783[6] + var1 * this.field4783[2] + this.field4783[10] * var3 + this.field4783[14]));
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(FFFB)F",
		garbageValue = "7"
	)
	public float method8267(float var1, float var2, float var3) {
		return this.field4783[12] + this.field4783[8] * var3 + var1 * this.field4783[0] + var2 * this.field4783[4];
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(FFFI)F",
		garbageValue = "1230594649"
	)
	public float method8268(float var1, float var2, float var3) {
		return this.field4783[5] * var2 + var1 * this.field4783[1] + var3 * this.field4783[9] + this.field4783[13];
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(FFFB)F",
		garbageValue = "-122"
	)
	public float method8305(float var1, float var2, float var3) {
		return var3 * this.field4783[10] + var1 * this.field4783[2] + this.field4783[6] * var2 + this.field4783[14];
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-2048300447"
	)
	public float[] method8331() {
		float[] var1 = new float[3];
		class426 var2 = new class426(this.field4783[0], this.field4783[1], this.field4783[2]);
		class426 var3 = new class426(this.field4783[4], this.field4783[5], this.field4783[6]);
		class426 var4 = new class426(this.field4783[8], this.field4783[9], this.field4783[10]);
		var1[0] = var2.method8186();
		var1[1] = var3.method8186();
		var1[2] = var4.method8186();
		return var1;
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method8252();
		this.method8272();

		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.field4783[var3 + var2 * 4];
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
		int var3 = 31 * var2 + Arrays.hashCode(this.field4783);
		return var3;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof TransformationMatrix)) {
			return false;
		} else {
			TransformationMatrix var2 = (TransformationMatrix)var1;

			for (int var3 = 0; var3 < 16; ++var3) {
				if (this.field4783[var3] != var2.field4783[var3]) {
					return false;
				}
			}

			return true;
		}
	}
}
