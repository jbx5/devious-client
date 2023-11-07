import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rz")
public final class class462 {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lrz;"
	)
	static class462[] field4770;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1548563589
	)
	static int field4771;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	public static final class462 field4769;
	@ObfuscatedName("ab")
	public float[] field4772;

	static {
		field4770 = new class462[0];
		ServerPacket.method5933(100);
		field4769 = new class462();
	}

	public class462() {
		this.field4772 = new float[16];
		this.method8457();
	}

	@ObfuscatedSignature(
		descriptor = "(Lrz;)V"
	)
	public class462(class462 var1) {
		this.field4772 = new float[16];
		this.method8435(var1);
	}

	@ObfuscatedSignature(
		descriptor = "(Luj;Z)V"
	)
	public class462(Buffer var1, boolean var2) {
		this.field4772 = new float[16];
		this.method8436(var1, var2);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2018425549"
	)
	public void method8459() {
		synchronized(field4770) {
			if (DirectByteArrayCopier.field3822 < field4771 - 1) {
				field4770[++DirectByteArrayCopier.field3822 - 1] = this;
			}

		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Luj;ZI)V",
		garbageValue = "-1679447945"
	)
	void method8436(Buffer var1, boolean var2) {
		if (var2) {
			class463 var13 = new class463();
			int var6 = var1.readShort();
			var6 &= 16383;
			float var5 = (float)(6.283185307179586D * (double)((float)var6 / 16384.0F));
			var13.method8498(var5);
			int var9 = var1.readShort();
			var9 &= 16383;
			float var8 = (float)(6.283185307179586D * (double)((float)var9 / 16384.0F));
			var13.method8514(var8);
			int var12 = var1.readShort();
			var12 &= 16383;
			float var11 = (float)(6.283185307179586D * (double)((float)var12 / 16384.0F));
			var13.method8499(var11);
			var13.method8501((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort());
			this.method8451(var13);
		} else {
			for (int var3 = 0; var3 < 16; ++var3) {
				this.field4772[var3] = var1.method9268();
			}
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "1"
	)
	float[] method8449() {
		float[] var1 = new float[3];
		if ((double)this.field4772[2] < 0.999D && (double)this.field4772[2] > -0.999D) {
			var1[1] = (float)(-Math.asin((double)this.field4772[2]));
			double var2 = Math.cos((double)var1[1]);
			var1[0] = (float)Math.atan2((double)this.field4772[6] / var2, (double)this.field4772[10] / var2);
			var1[2] = (float)Math.atan2((double)this.field4772[1] / var2, (double)this.field4772[0] / var2);
		} else {
			var1[0] = 0.0F;
			var1[1] = (float)Math.atan2((double)this.field4772[2], 0.0D);
			var1[2] = (float)Math.atan2((double)(-this.field4772[9]), (double)this.field4772[5]);
		}

		return var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "5"
	)
	public float[] method8438() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4772[6])), 0.0F, 0.0F};
		double var2 = Math.cos((double)var1[0]);
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) {
			var4 = (double)this.field4772[2];
			var6 = (double)this.field4772[10];
			double var8 = (double)this.field4772[4];
			double var10 = (double)this.field4772[5];
			var1[1] = (float)Math.atan2(var4, var6);
			var1[2] = (float)Math.atan2(var8, var10);
		} else {
			var4 = (double)this.field4772[1];
			var6 = (double)this.field4772[0];
			if (this.field4772[6] < 0.0F) {
				var1[1] = (float)Math.atan2(var4, var6);
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6));
			}

			var1[2] = 0.0F;
		}

		return var1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-60"
	)
	void method8457() {
		this.field4772[0] = 1.0F;
		this.field4772[1] = 0.0F;
		this.field4772[2] = 0.0F;
		this.field4772[3] = 0.0F;
		this.field4772[4] = 0.0F;
		this.field4772[5] = 1.0F;
		this.field4772[6] = 0.0F;
		this.field4772[7] = 0.0F;
		this.field4772[8] = 0.0F;
		this.field4772[9] = 0.0F;
		this.field4772[10] = 1.0F;
		this.field4772[11] = 0.0F;
		this.field4772[12] = 0.0F;
		this.field4772[13] = 0.0F;
		this.field4772[14] = 0.0F;
		this.field4772[15] = 1.0F;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "77"
	)
	public void method8488() {
		this.field4772[0] = 0.0F;
		this.field4772[1] = 0.0F;
		this.field4772[2] = 0.0F;
		this.field4772[3] = 0.0F;
		this.field4772[4] = 0.0F;
		this.field4772[5] = 0.0F;
		this.field4772[6] = 0.0F;
		this.field4772[7] = 0.0F;
		this.field4772[8] = 0.0F;
		this.field4772[9] = 0.0F;
		this.field4772[10] = 0.0F;
		this.field4772[11] = 0.0F;
		this.field4772[12] = 0.0F;
		this.field4772[13] = 0.0F;
		this.field4772[14] = 0.0F;
		this.field4772[15] = 0.0F;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lrz;I)V",
		garbageValue = "-1456016137"
	)
	public void method8435(class462 var1) {
		System.arraycopy(var1.field4772, 0, this.field4772, 0, 16);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "93"
	)
	public void method8462(float var1) {
		this.method8443(var1, var1, var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(FFFB)V",
		garbageValue = "111"
	)
	public void method8443(float var1, float var2, float var3) {
		this.method8457();
		this.field4772[0] = var1;
		this.field4772[5] = var2;
		this.field4772[10] = var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lrz;I)V",
		garbageValue = "-459748559"
	)
	public void method8442(class462 var1) {
		for (int var2 = 0; var2 < this.field4772.length; ++var2) {
			float[] var10000 = this.field4772;
			var10000[var2] += var1.field4772[var2];
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lrz;I)V",
		garbageValue = "1005316731"
	)
	public void method8445(class462 var1) {
		float var2 = var1.field4772[12] * this.field4772[3] + var1.field4772[8] * this.field4772[2] + var1.field4772[0] * this.field4772[0] + this.field4772[1] * var1.field4772[4];
		float var3 = var1.field4772[9] * this.field4772[2] + var1.field4772[5] * this.field4772[1] + this.field4772[0] * var1.field4772[1] + var1.field4772[13] * this.field4772[3];
		float var4 = var1.field4772[14] * this.field4772[3] + var1.field4772[6] * this.field4772[1] + var1.field4772[2] * this.field4772[0] + var1.field4772[10] * this.field4772[2];
		float var5 = this.field4772[3] * var1.field4772[15] + var1.field4772[3] * this.field4772[0] + var1.field4772[7] * this.field4772[1] + this.field4772[2] * var1.field4772[11];
		float var6 = this.field4772[7] * var1.field4772[12] + this.field4772[4] * var1.field4772[0] + var1.field4772[4] * this.field4772[5] + this.field4772[6] * var1.field4772[8];
		float var7 = this.field4772[7] * var1.field4772[13] + this.field4772[5] * var1.field4772[5] + var1.field4772[1] * this.field4772[4] + var1.field4772[9] * this.field4772[6];
		float var8 = this.field4772[7] * var1.field4772[14] + this.field4772[4] * var1.field4772[2] + var1.field4772[6] * this.field4772[5] + this.field4772[6] * var1.field4772[10];
		float var9 = var1.field4772[11] * this.field4772[6] + var1.field4772[3] * this.field4772[4] + this.field4772[5] * var1.field4772[7] + this.field4772[7] * var1.field4772[15];
		float var10 = this.field4772[8] * var1.field4772[0] + this.field4772[9] * var1.field4772[4] + this.field4772[10] * var1.field4772[8] + this.field4772[11] * var1.field4772[12];
		float var11 = var1.field4772[1] * this.field4772[8] + var1.field4772[5] * this.field4772[9] + var1.field4772[9] * this.field4772[10] + this.field4772[11] * var1.field4772[13];
		float var12 = this.field4772[8] * var1.field4772[2] + this.field4772[9] * var1.field4772[6] + this.field4772[10] * var1.field4772[10] + this.field4772[11] * var1.field4772[14];
		float var13 = this.field4772[11] * var1.field4772[15] + var1.field4772[7] * this.field4772[9] + var1.field4772[3] * this.field4772[8] + var1.field4772[11] * this.field4772[10];
		float var14 = var1.field4772[8] * this.field4772[14] + var1.field4772[0] * this.field4772[12] + var1.field4772[4] * this.field4772[13] + this.field4772[15] * var1.field4772[12];
		float var15 = var1.field4772[9] * this.field4772[14] + this.field4772[12] * var1.field4772[1] + this.field4772[13] * var1.field4772[5] + var1.field4772[13] * this.field4772[15];
		float var16 = var1.field4772[14] * this.field4772[15] + this.field4772[12] * var1.field4772[2] + var1.field4772[6] * this.field4772[13] + var1.field4772[10] * this.field4772[14];
		float var17 = this.field4772[13] * var1.field4772[7] + var1.field4772[3] * this.field4772[12] + var1.field4772[11] * this.field4772[14] + this.field4772[15] * var1.field4772[15];
		this.field4772[0] = var2;
		this.field4772[1] = var3;
		this.field4772[2] = var4;
		this.field4772[3] = var5;
		this.field4772[4] = var6;
		this.field4772[5] = var7;
		this.field4772[6] = var8;
		this.field4772[7] = var9;
		this.field4772[8] = var10;
		this.field4772[9] = var11;
		this.field4772[10] = var12;
		this.field4772[11] = var13;
		this.field4772[12] = var14;
		this.field4772[13] = var15;
		this.field4772[14] = var16;
		this.field4772[15] = var17;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lrq;I)V",
		garbageValue = "-2073322468"
	)
	public void method8446(class461 var1) {
		float var2 = var1.field4767 * var1.field4767;
		float var3 = var1.field4767 * var1.field4768;
		float var4 = var1.field4767 * var1.field4765;
		float var5 = var1.field4767 * var1.field4766;
		float var6 = var1.field4768 * var1.field4768;
		float var7 = var1.field4768 * var1.field4765;
		float var8 = var1.field4766 * var1.field4768;
		float var9 = var1.field4765 * var1.field4765;
		float var10 = var1.field4765 * var1.field4766;
		float var11 = var1.field4766 * var1.field4766;
		this.field4772[0] = var2 + var6 - var11 - var9;
		this.field4772[1] = var5 + var7 + var5 + var7;
		this.field4772[2] = var8 - var4 - var4 + var8;
		this.field4772[4] = var7 - var5 - var5 + var7;
		this.field4772[5] = var9 + var2 - var6 - var11;
		this.field4772[6] = var3 + var3 + var10 + var10;
		this.field4772[8] = var4 + var8 + var8 + var4;
		this.field4772[9] = var10 + (var10 - var3 - var3);
		this.field4772[10] = var2 + var11 - var9 - var6;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lrj;I)V",
		garbageValue = "-1749310376"
	)
	void method8451(class463 var1) {
		this.field4772[0] = var1.field4776;
		this.field4772[1] = var1.field4775;
		this.field4772[2] = var1.field4785;
		this.field4772[3] = 0.0F;
		this.field4772[4] = var1.field4777;
		this.field4772[5] = var1.field4778;
		this.field4772[6] = var1.field4779;
		this.field4772[7] = 0.0F;
		this.field4772[8] = var1.field4780;
		this.field4772[9] = var1.field4781;
		this.field4772[10] = var1.field4782;
		this.field4772[11] = 0.0F;
		this.field4772[12] = var1.field4783;
		this.field4772[13] = var1.field4784;
		this.field4772[14] = var1.field4774;
		this.field4772[15] = 1.0F;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "868032907"
	)
	float method8448() {
		return this.field4772[5] * this.field4772[3] * this.field4772[8] * this.field4772[14] + this.field4772[4] * this.field4772[3] * this.field4772[10] * this.field4772[13] + (this.field4772[8] * this.field4772[7] * this.field4772[2] * this.field4772[13] + this.field4772[15] * this.field4772[6] * this.field4772[1] * this.field4772[8] + this.field4772[13] * this.field4772[11] * this.field4772[6] * this.field4772[0] + (this.field4772[15] * this.field4772[5] * this.field4772[0] * this.field4772[10] - this.field4772[5] * this.field4772[0] * this.field4772[11] * this.field4772[14] - this.field4772[6] * this.field4772[0] * this.field4772[9] * this.field4772[15]) + this.field4772[14] * this.field4772[9] * this.field4772[0] * this.field4772[7] - this.field4772[7] * this.field4772[0] * this.field4772[10] * this.field4772[13] - this.field4772[15] * this.field4772[10] * this.field4772[4] * this.field4772[1] + this.field4772[11] * this.field4772[4] * this.field4772[1] * this.field4772[14] - this.field4772[1] * this.field4772[6] * this.field4772[11] * this.field4772[12] - this.field4772[14] * this.field4772[1] * this.field4772[7] * this.field4772[8] + this.field4772[1] * this.field4772[7] * this.field4772[10] * this.field4772[12] + this.field4772[15] * this.field4772[2] * this.field4772[4] * this.field4772[9] - this.field4772[13] * this.field4772[11] * this.field4772[2] * this.field4772[4] - this.field4772[2] * this.field4772[5] * this.field4772[8] * this.field4772[15] + this.field4772[12] * this.field4772[2] * this.field4772[5] * this.field4772[11] - this.field4772[12] * this.field4772[9] * this.field4772[7] * this.field4772[2] - this.field4772[9] * this.field4772[3] * this.field4772[4] * this.field4772[14]) - this.field4772[10] * this.field4772[5] * this.field4772[3] * this.field4772[12] - this.field4772[6] * this.field4772[3] * this.field4772[8] * this.field4772[13] + this.field4772[12] * this.field4772[9] * this.field4772[3] * this.field4772[6];
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-536017222"
	)
	public void method8437() {
		float var1 = 1.0F / this.method8448();
		float var2 = (this.field4772[7] * this.field4772[9] * this.field4772[14] + this.field4772[15] * this.field4772[10] * this.field4772[5] - this.field4772[14] * this.field4772[5] * this.field4772[11] - this.field4772[15] * this.field4772[9] * this.field4772[6] + this.field4772[13] * this.field4772[6] * this.field4772[11] - this.field4772[10] * this.field4772[7] * this.field4772[13]) * var1;
		float var3 = (this.field4772[13] * this.field4772[10] * this.field4772[3] + (this.field4772[15] * -this.field4772[1] * this.field4772[10] + this.field4772[11] * this.field4772[1] * this.field4772[14] + this.field4772[2] * this.field4772[9] * this.field4772[15] - this.field4772[13] * this.field4772[11] * this.field4772[2] - this.field4772[14] * this.field4772[9] * this.field4772[3])) * var1;
		float var4 = var1 * (this.field4772[15] * this.field4772[6] * this.field4772[1] - this.field4772[14] * this.field4772[7] * this.field4772[1] - this.field4772[15] * this.field4772[2] * this.field4772[5] + this.field4772[2] * this.field4772[7] * this.field4772[13] + this.field4772[3] * this.field4772[5] * this.field4772[14] - this.field4772[13] * this.field4772[6] * this.field4772[3]);
		float var5 = (this.field4772[5] * this.field4772[2] * this.field4772[11] + this.field4772[11] * this.field4772[6] * -this.field4772[1] + this.field4772[10] * this.field4772[1] * this.field4772[7] - this.field4772[7] * this.field4772[2] * this.field4772[9] - this.field4772[10] * this.field4772[5] * this.field4772[3] + this.field4772[6] * this.field4772[3] * this.field4772[9]) * var1;
		float var6 = var1 * (this.field4772[12] * this.field4772[7] * this.field4772[10] + (this.field4772[14] * this.field4772[11] * this.field4772[4] + -this.field4772[4] * this.field4772[10] * this.field4772[15] + this.field4772[6] * this.field4772[8] * this.field4772[15] - this.field4772[12] * this.field4772[11] * this.field4772[6] - this.field4772[7] * this.field4772[8] * this.field4772[14]));
		float var7 = var1 * (this.field4772[11] * this.field4772[2] * this.field4772[12] + (this.field4772[0] * this.field4772[10] * this.field4772[15] - this.field4772[0] * this.field4772[11] * this.field4772[14] - this.field4772[8] * this.field4772[2] * this.field4772[15]) + this.field4772[3] * this.field4772[8] * this.field4772[14] - this.field4772[12] * this.field4772[10] * this.field4772[3]);
		float var8 = (this.field4772[3] * this.field4772[6] * this.field4772[12] + (this.field4772[14] * this.field4772[7] * this.field4772[0] + this.field4772[6] * -this.field4772[0] * this.field4772[15] + this.field4772[4] * this.field4772[2] * this.field4772[15] - this.field4772[2] * this.field4772[7] * this.field4772[12] - this.field4772[3] * this.field4772[4] * this.field4772[14])) * var1;
		float var9 = var1 * (this.field4772[8] * this.field4772[2] * this.field4772[7] + (this.field4772[11] * this.field4772[6] * this.field4772[0] - this.field4772[10] * this.field4772[7] * this.field4772[0] - this.field4772[2] * this.field4772[4] * this.field4772[11]) + this.field4772[10] * this.field4772[3] * this.field4772[4] - this.field4772[6] * this.field4772[3] * this.field4772[8]);
		float var10 = var1 * (this.field4772[13] * this.field4772[7] * this.field4772[8] + this.field4772[15] * this.field4772[4] * this.field4772[9] - this.field4772[4] * this.field4772[11] * this.field4772[13] - this.field4772[5] * this.field4772[8] * this.field4772[15] + this.field4772[11] * this.field4772[5] * this.field4772[12] - this.field4772[7] * this.field4772[9] * this.field4772[12]);
		float var11 = var1 * (this.field4772[8] * this.field4772[1] * this.field4772[15] + this.field4772[15] * this.field4772[9] * -this.field4772[0] + this.field4772[0] * this.field4772[11] * this.field4772[13] - this.field4772[12] * this.field4772[1] * this.field4772[11] - this.field4772[8] * this.field4772[3] * this.field4772[13] + this.field4772[12] * this.field4772[9] * this.field4772[3]);
		float var12 = (this.field4772[7] * this.field4772[1] * this.field4772[12] + (this.field4772[15] * this.field4772[5] * this.field4772[0] - this.field4772[13] * this.field4772[7] * this.field4772[0] - this.field4772[4] * this.field4772[1] * this.field4772[15]) + this.field4772[13] * this.field4772[3] * this.field4772[4] - this.field4772[12] * this.field4772[3] * this.field4772[5]) * var1;
		float var13 = var1 * (this.field4772[8] * this.field4772[5] * this.field4772[3] + (this.field4772[11] * this.field4772[5] * -this.field4772[0] + this.field4772[0] * this.field4772[7] * this.field4772[9] + this.field4772[11] * this.field4772[1] * this.field4772[4] - this.field4772[8] * this.field4772[7] * this.field4772[1] - this.field4772[3] * this.field4772[4] * this.field4772[9]));
		float var14 = var1 * (this.field4772[14] * this.field4772[9] * -this.field4772[4] + this.field4772[13] * this.field4772[4] * this.field4772[10] + this.field4772[14] * this.field4772[5] * this.field4772[8] - this.field4772[5] * this.field4772[10] * this.field4772[12] - this.field4772[13] * this.field4772[8] * this.field4772[6] + this.field4772[9] * this.field4772[6] * this.field4772[12]);
		float var15 = (this.field4772[13] * this.field4772[2] * this.field4772[8] + this.field4772[10] * this.field4772[1] * this.field4772[12] + (this.field4772[9] * this.field4772[0] * this.field4772[14] - this.field4772[13] * this.field4772[0] * this.field4772[10] - this.field4772[1] * this.field4772[8] * this.field4772[14]) - this.field4772[12] * this.field4772[2] * this.field4772[9]) * var1;
		float var16 = var1 * (this.field4772[12] * this.field4772[2] * this.field4772[5] + (this.field4772[14] * -this.field4772[0] * this.field4772[5] + this.field4772[0] * this.field4772[6] * this.field4772[13] + this.field4772[14] * this.field4772[1] * this.field4772[4] - this.field4772[6] * this.field4772[1] * this.field4772[12] - this.field4772[13] * this.field4772[4] * this.field4772[2]));
		float var17 = var1 * (this.field4772[4] * this.field4772[2] * this.field4772[9] + this.field4772[5] * this.field4772[0] * this.field4772[10] - this.field4772[9] * this.field4772[6] * this.field4772[0] - this.field4772[10] * this.field4772[4] * this.field4772[1] + this.field4772[8] * this.field4772[1] * this.field4772[6] - this.field4772[2] * this.field4772[5] * this.field4772[8]);
		this.field4772[0] = var2;
		this.field4772[1] = var3;
		this.field4772[2] = var4;
		this.field4772[3] = var5;
		this.field4772[4] = var6;
		this.field4772[5] = var7;
		this.field4772[6] = var8;
		this.field4772[7] = var9;
		this.field4772[8] = var10;
		this.field4772[9] = var11;
		this.field4772[10] = var12;
		this.field4772[11] = var13;
		this.field4772[12] = var14;
		this.field4772[13] = var15;
		this.field4772[14] = var16;
		this.field4772[15] = var17;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-616853758"
	)
	public float[] method8450() {
		float[] var1 = new float[3];
		class460 var2 = new class460(this.field4772[0], this.field4772[1], this.field4772[2]);
		class460 var3 = new class460(this.field4772[4], this.field4772[5], this.field4772[6]);
		class460 var4 = new class460(this.field4772[8], this.field4772[9], this.field4772[10]);
		var1[0] = var2.method8402();
		var1[1] = var3.method8402();
		var1[2] = var4.method8402();
		return var1;
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method8438();
		this.method8449();

		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.field4772[var3 + var2 * 4];
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
		int var3 = var2 * 31 + Arrays.hashCode(this.field4772);
		return var3;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class462)) {
			return false;
		} else {
			class462 var2 = (class462)var1;

			for (int var3 = 0; var3 < 16; ++var3) {
				if (var2.field4772[var3] != this.field4772[var3]) {
					return false;
				}
			}

			return true;
		}
	}
}
