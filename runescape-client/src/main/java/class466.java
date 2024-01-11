import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rh")
public final class class466 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lrh;"
	)
	static class466[] field4811;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -692792871
	)
	static int field4808;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lrh;"
	)
	public static final class466 field4807;
	@ObfuscatedName("aq")
	public float[] field4809;

	static {
		field4811 = new class466[0];
		class319.method6068(100);
		field4807 = new class466();
	}

	public class466() {
		this.field4809 = new float[16];
		this.method8546();
	}

	@ObfuscatedSignature(
		descriptor = "(Lrh;)V"
	)
	public class466(class466 var1) {
		this.field4809 = new float[16];
		this.method8548(var1);
	}

	@ObfuscatedSignature(
		descriptor = "(Luk;Z)V"
	)
	public class466(Buffer var1, boolean var2) {
		this.field4809 = new float[16];
		this.method8543(var1, var2);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1815141661"
	)
	public void method8559() {
		synchronized(field4811) {
			if (class431.field4647 < field4808 - 1) {
				field4811[++class431.field4647 - 1] = this;
			}

		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Luk;ZI)V",
		garbageValue = "1014844409"
	)
	void method8543(Buffer var1, boolean var2) {
		if (var2) {
			class467 var4 = new class467();
			var4.method8615(class360.method6933(var1.readShort()));
			var4.method8627(class360.method6933(var1.readShort()));
			var4.method8619(class360.method6933(var1.readShort()));
			var4.method8618((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort());
			this.method8558(var4);
		} else {
			for (int var3 = 0; var3 < 16; ++var3) {
				this.field4809[var3] = var1.method9394();
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-1574409963"
	)
	float[] method8544() {
		float[] var1 = new float[3];
		if ((double)this.field4809[2] < 0.999D && (double)this.field4809[2] > -0.999D) {
			var1[1] = (float)(-Math.asin((double)this.field4809[2]));
			double var2 = Math.cos((double)var1[1]);
			var1[0] = (float)Math.atan2((double)this.field4809[6] / var2, (double)this.field4809[10] / var2);
			var1[2] = (float)Math.atan2((double)this.field4809[1] / var2, (double)this.field4809[0] / var2);
		} else {
			var1[0] = 0.0F;
			var1[1] = (float)Math.atan2((double)this.field4809[2], 0.0D);
			var1[2] = (float)Math.atan2((double)(-this.field4809[9]), (double)this.field4809[5]);
		}

		return var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-1633958144"
	)
	public float[] method8542() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4809[6])), 0.0F, 0.0F};
		double var2 = Math.cos((double)var1[0]);
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) {
			var4 = (double)this.field4809[2];
			var6 = (double)this.field4809[10];
			double var8 = (double)this.field4809[4];
			double var10 = (double)this.field4809[5];
			var1[1] = (float)Math.atan2(var4, var6);
			var1[2] = (float)Math.atan2(var8, var10);
		} else {
			var4 = (double)this.field4809[1];
			var6 = (double)this.field4809[0];
			if (this.field4809[6] < 0.0F) {
				var1[1] = (float)Math.atan2(var4, var6);
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6));
			}

			var1[2] = 0.0F;
		}

		return var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1984279029"
	)
	void method8546() {
		this.field4809[0] = 1.0F;
		this.field4809[1] = 0.0F;
		this.field4809[2] = 0.0F;
		this.field4809[3] = 0.0F;
		this.field4809[4] = 0.0F;
		this.field4809[5] = 1.0F;
		this.field4809[6] = 0.0F;
		this.field4809[7] = 0.0F;
		this.field4809[8] = 0.0F;
		this.field4809[9] = 0.0F;
		this.field4809[10] = 1.0F;
		this.field4809[11] = 0.0F;
		this.field4809[12] = 0.0F;
		this.field4809[13] = 0.0F;
		this.field4809[14] = 0.0F;
		this.field4809[15] = 1.0F;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1865275779"
	)
	public void method8547() {
		this.field4809[0] = 0.0F;
		this.field4809[1] = 0.0F;
		this.field4809[2] = 0.0F;
		this.field4809[3] = 0.0F;
		this.field4809[4] = 0.0F;
		this.field4809[5] = 0.0F;
		this.field4809[6] = 0.0F;
		this.field4809[7] = 0.0F;
		this.field4809[8] = 0.0F;
		this.field4809[9] = 0.0F;
		this.field4809[10] = 0.0F;
		this.field4809[11] = 0.0F;
		this.field4809[12] = 0.0F;
		this.field4809[13] = 0.0F;
		this.field4809[14] = 0.0F;
		this.field4809[15] = 0.0F;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lrh;I)V",
		garbageValue = "237221980"
	)
	public void method8548(class466 var1) {
		System.arraycopy(var1.field4809, 0, this.field4809, 0, 16);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-1219288981"
	)
	public void method8549(float var1) {
		this.method8579(var1, var1, var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "1136615889"
	)
	public void method8579(float var1, float var2, float var3) {
		this.method8546();
		this.field4809[0] = var1;
		this.field4809[5] = var2;
		this.field4809[10] = var3;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lrh;B)V",
		garbageValue = "-44"
	)
	public void method8551(class466 var1) {
		for (int var2 = 0; var2 < this.field4809.length; ++var2) {
			float[] var10000 = this.field4809;
			var10000[var2] += var1.field4809[var2];
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lrh;I)V",
		garbageValue = "198310472"
	)
	public void method8552(class466 var1) {
		float var2 = var1.field4809[4] * this.field4809[1] + var1.field4809[0] * this.field4809[0] + var1.field4809[8] * this.field4809[2] + var1.field4809[12] * this.field4809[3];
		float var3 = var1.field4809[13] * this.field4809[3] + this.field4809[0] * var1.field4809[1] + var1.field4809[5] * this.field4809[1] + var1.field4809[9] * this.field4809[2];
		float var4 = this.field4809[3] * var1.field4809[14] + var1.field4809[6] * this.field4809[1] + var1.field4809[2] * this.field4809[0] + var1.field4809[10] * this.field4809[2];
		float var5 = var1.field4809[15] * this.field4809[3] + this.field4809[0] * var1.field4809[3] + var1.field4809[7] * this.field4809[1] + var1.field4809[11] * this.field4809[2];
		float var6 = var1.field4809[12] * this.field4809[7] + this.field4809[5] * var1.field4809[4] + var1.field4809[0] * this.field4809[4] + this.field4809[6] * var1.field4809[8];
		float var7 = var1.field4809[13] * this.field4809[7] + this.field4809[4] * var1.field4809[1] + this.field4809[5] * var1.field4809[5] + this.field4809[6] * var1.field4809[9];
		float var8 = var1.field4809[2] * this.field4809[4] + this.field4809[5] * var1.field4809[6] + var1.field4809[10] * this.field4809[6] + this.field4809[7] * var1.field4809[14];
		float var9 = this.field4809[6] * var1.field4809[11] + var1.field4809[7] * this.field4809[5] + this.field4809[4] * var1.field4809[3] + var1.field4809[15] * this.field4809[7];
		float var10 = var1.field4809[12] * this.field4809[11] + var1.field4809[8] * this.field4809[10] + var1.field4809[4] * this.field4809[9] + var1.field4809[0] * this.field4809[8];
		float var11 = var1.field4809[5] * this.field4809[9] + this.field4809[8] * var1.field4809[1] + this.field4809[10] * var1.field4809[9] + var1.field4809[13] * this.field4809[11];
		float var12 = var1.field4809[14] * this.field4809[11] + var1.field4809[10] * this.field4809[10] + var1.field4809[2] * this.field4809[8] + this.field4809[9] * var1.field4809[6];
		float var13 = this.field4809[11] * var1.field4809[15] + this.field4809[9] * var1.field4809[7] + var1.field4809[3] * this.field4809[8] + var1.field4809[11] * this.field4809[10];
		float var14 = var1.field4809[12] * this.field4809[15] + var1.field4809[8] * this.field4809[14] + this.field4809[13] * var1.field4809[4] + this.field4809[12] * var1.field4809[0];
		float var15 = this.field4809[13] * var1.field4809[5] + this.field4809[12] * var1.field4809[1] + var1.field4809[9] * this.field4809[14] + var1.field4809[13] * this.field4809[15];
		float var16 = this.field4809[14] * var1.field4809[10] + this.field4809[12] * var1.field4809[2] + this.field4809[13] * var1.field4809[6] + var1.field4809[14] * this.field4809[15];
		float var17 = this.field4809[15] * var1.field4809[15] + this.field4809[13] * var1.field4809[7] + var1.field4809[3] * this.field4809[12] + this.field4809[14] * var1.field4809[11];
		this.field4809[0] = var2;
		this.field4809[1] = var3;
		this.field4809[2] = var4;
		this.field4809[3] = var5;
		this.field4809[4] = var6;
		this.field4809[5] = var7;
		this.field4809[6] = var8;
		this.field4809[7] = var9;
		this.field4809[8] = var10;
		this.field4809[9] = var11;
		this.field4809[10] = var12;
		this.field4809[11] = var13;
		this.field4809[12] = var14;
		this.field4809[13] = var15;
		this.field4809[14] = var16;
		this.field4809[15] = var17;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lro;S)V",
		garbageValue = "929"
	)
	public void method8590(class465 var1) {
		float var2 = var1.field4799 * var1.field4799;
		float var3 = var1.field4799 * var1.field4802;
		float var4 = var1.field4803 * var1.field4799;
		float var5 = var1.field4799 * var1.field4804;
		float var6 = var1.field4802 * var1.field4802;
		float var7 = var1.field4803 * var1.field4802;
		float var8 = var1.field4802 * var1.field4804;
		float var9 = var1.field4803 * var1.field4803;
		float var10 = var1.field4803 * var1.field4804;
		float var11 = var1.field4804 * var1.field4804;
		this.field4809[0] = var6 + var2 - var11 - var9;
		this.field4809[1] = var5 + var7 + var7 + var5;
		this.field4809[2] = var8 + (var8 - var4 - var4);
		this.field4809[4] = var7 - var5 - var5 + var7;
		this.field4809[5] = var2 + var9 - var6 - var11;
		this.field4809[6] = var10 + var3 + var10 + var3;
		this.field4809[8] = var8 + var4 + var8 + var4;
		this.field4809[9] = var10 - var3 - var3 + var10;
		this.field4809[10] = var11 + var2 - var9 - var6;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lrg;I)V",
		garbageValue = "1152944347"
	)
	void method8558(class467 var1) {
		this.field4809[0] = var1.field4822;
		this.field4809[1] = var1.field4813;
		this.field4809[2] = var1.field4816;
		this.field4809[3] = 0.0F;
		this.field4809[4] = var1.field4821;
		this.field4809[5] = var1.field4815;
		this.field4809[6] = var1.field4817;
		this.field4809[7] = 0.0F;
		this.field4809[8] = var1.field4818;
		this.field4809[9] = var1.field4819;
		this.field4809[10] = var1.field4820;
		this.field4809[11] = 0.0F;
		this.field4809[12] = var1.field4812;
		this.field4809[13] = var1.field4814;
		this.field4809[14] = var1.field4823;
		this.field4809[15] = 1.0F;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "97"
	)
	float method8555() {
		return this.field4809[12] * this.field4809[3] * this.field4809[6] * this.field4809[9] + (this.field4809[3] * this.field4809[5] * this.field4809[8] * this.field4809[14] + this.field4809[3] * this.field4809[4] * this.field4809[10] * this.field4809[13] + (this.field4809[5] * this.field4809[2] * this.field4809[11] * this.field4809[12] + (this.field4809[15] * this.field4809[2] * this.field4809[4] * this.field4809[9] + this.field4809[0] * this.field4809[5] * this.field4809[10] * this.field4809[15] - this.field4809[14] * this.field4809[0] * this.field4809[5] * this.field4809[11] - this.field4809[15] * this.field4809[9] * this.field4809[0] * this.field4809[6] + this.field4809[11] * this.field4809[0] * this.field4809[6] * this.field4809[13] + this.field4809[9] * this.field4809[0] * this.field4809[7] * this.field4809[14] - this.field4809[13] * this.field4809[7] * this.field4809[0] * this.field4809[10] - this.field4809[4] * this.field4809[1] * this.field4809[10] * this.field4809[15] + this.field4809[11] * this.field4809[1] * this.field4809[4] * this.field4809[14] + this.field4809[15] * this.field4809[8] * this.field4809[6] * this.field4809[1] - this.field4809[6] * this.field4809[1] * this.field4809[11] * this.field4809[12] - this.field4809[8] * this.field4809[7] * this.field4809[1] * this.field4809[14] + this.field4809[10] * this.field4809[7] * this.field4809[1] * this.field4809[12] - this.field4809[13] * this.field4809[2] * this.field4809[4] * this.field4809[11] - this.field4809[8] * this.field4809[5] * this.field4809[2] * this.field4809[15]) + this.field4809[7] * this.field4809[2] * this.field4809[8] * this.field4809[13] - this.field4809[12] * this.field4809[2] * this.field4809[7] * this.field4809[9] - this.field4809[14] * this.field4809[9] * this.field4809[4] * this.field4809[3]) - this.field4809[10] * this.field4809[5] * this.field4809[3] * this.field4809[12] - this.field4809[13] * this.field4809[3] * this.field4809[6] * this.field4809[8]);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2130575828"
	)
	public void method8556() {
		float var1 = 1.0F / this.method8555();
		float var2 = (this.field4809[7] * this.field4809[9] * this.field4809[14] + this.field4809[13] * this.field4809[11] * this.field4809[6] + (this.field4809[15] * this.field4809[10] * this.field4809[5] - this.field4809[14] * this.field4809[11] * this.field4809[5] - this.field4809[15] * this.field4809[9] * this.field4809[6]) - this.field4809[10] * this.field4809[7] * this.field4809[13]) * var1;
		float var3 = (this.field4809[10] * this.field4809[3] * this.field4809[13] + (this.field4809[14] * this.field4809[11] * this.field4809[1] + this.field4809[10] * -this.field4809[1] * this.field4809[15] + this.field4809[15] * this.field4809[9] * this.field4809[2] - this.field4809[13] * this.field4809[2] * this.field4809[11] - this.field4809[9] * this.field4809[3] * this.field4809[14])) * var1;
		float var4 = (this.field4809[14] * this.field4809[3] * this.field4809[5] + this.field4809[2] * this.field4809[7] * this.field4809[13] + (this.field4809[15] * this.field4809[1] * this.field4809[6] - this.field4809[7] * this.field4809[1] * this.field4809[14] - this.field4809[15] * this.field4809[5] * this.field4809[2]) - this.field4809[13] * this.field4809[6] * this.field4809[3]) * var1;
		float var5 = (this.field4809[3] * this.field4809[6] * this.field4809[9] + (-this.field4809[1] * this.field4809[6] * this.field4809[11] + this.field4809[7] * this.field4809[1] * this.field4809[10] + this.field4809[2] * this.field4809[5] * this.field4809[11] - this.field4809[2] * this.field4809[7] * this.field4809[9] - this.field4809[10] * this.field4809[5] * this.field4809[3])) * var1;
		float var6 = (this.field4809[15] * this.field4809[6] * this.field4809[8] + -this.field4809[4] * this.field4809[10] * this.field4809[15] + this.field4809[4] * this.field4809[11] * this.field4809[14] - this.field4809[6] * this.field4809[11] * this.field4809[12] - this.field4809[7] * this.field4809[8] * this.field4809[14] + this.field4809[10] * this.field4809[7] * this.field4809[12]) * var1;
		float var7 = (this.field4809[11] * this.field4809[2] * this.field4809[12] + (this.field4809[10] * this.field4809[0] * this.field4809[15] - this.field4809[0] * this.field4809[11] * this.field4809[14] - this.field4809[15] * this.field4809[2] * this.field4809[8]) + this.field4809[14] * this.field4809[3] * this.field4809[8] - this.field4809[12] * this.field4809[10] * this.field4809[3]) * var1;
		float var8 = (this.field4809[12] * this.field4809[3] * this.field4809[6] + (this.field4809[14] * this.field4809[0] * this.field4809[7] + this.field4809[15] * -this.field4809[0] * this.field4809[6] + this.field4809[4] * this.field4809[2] * this.field4809[15] - this.field4809[2] * this.field4809[7] * this.field4809[12] - this.field4809[14] * this.field4809[3] * this.field4809[4])) * var1;
		float var9 = var1 * (this.field4809[7] * this.field4809[2] * this.field4809[8] + (this.field4809[11] * this.field4809[0] * this.field4809[6] - this.field4809[10] * this.field4809[7] * this.field4809[0] - this.field4809[11] * this.field4809[4] * this.field4809[2]) + this.field4809[4] * this.field4809[3] * this.field4809[10] - this.field4809[6] * this.field4809[3] * this.field4809[8]);
		float var10 = (this.field4809[15] * this.field4809[9] * this.field4809[4] - this.field4809[11] * this.field4809[4] * this.field4809[13] - this.field4809[15] * this.field4809[8] * this.field4809[5] + this.field4809[5] * this.field4809[11] * this.field4809[12] + this.field4809[13] * this.field4809[7] * this.field4809[8] - this.field4809[12] * this.field4809[9] * this.field4809[7]) * var1;
		float var11 = var1 * (this.field4809[8] * this.field4809[1] * this.field4809[15] + -this.field4809[0] * this.field4809[9] * this.field4809[15] + this.field4809[13] * this.field4809[0] * this.field4809[11] - this.field4809[1] * this.field4809[11] * this.field4809[12] - this.field4809[8] * this.field4809[3] * this.field4809[13] + this.field4809[9] * this.field4809[3] * this.field4809[12]);
		float var12 = var1 * (this.field4809[13] * this.field4809[4] * this.field4809[3] + this.field4809[12] * this.field4809[7] * this.field4809[1] + (this.field4809[0] * this.field4809[5] * this.field4809[15] - this.field4809[0] * this.field4809[7] * this.field4809[13] - this.field4809[1] * this.field4809[4] * this.field4809[15]) - this.field4809[12] * this.field4809[5] * this.field4809[3]);
		float var13 = var1 * (this.field4809[8] * this.field4809[5] * this.field4809[3] + (this.field4809[11] * this.field4809[1] * this.field4809[4] + this.field4809[5] * -this.field4809[0] * this.field4809[11] + this.field4809[9] * this.field4809[7] * this.field4809[0] - this.field4809[8] * this.field4809[1] * this.field4809[7] - this.field4809[3] * this.field4809[4] * this.field4809[9]));
		float var14 = (this.field4809[9] * this.field4809[6] * this.field4809[12] + (-this.field4809[4] * this.field4809[9] * this.field4809[14] + this.field4809[13] * this.field4809[4] * this.field4809[10] + this.field4809[14] * this.field4809[5] * this.field4809[8] - this.field4809[12] * this.field4809[5] * this.field4809[10] - this.field4809[8] * this.field4809[6] * this.field4809[13])) * var1;
		float var15 = (this.field4809[13] * this.field4809[8] * this.field4809[2] + this.field4809[1] * this.field4809[10] * this.field4809[12] + (this.field4809[9] * this.field4809[0] * this.field4809[14] - this.field4809[13] * this.field4809[0] * this.field4809[10] - this.field4809[14] * this.field4809[8] * this.field4809[1]) - this.field4809[12] * this.field4809[2] * this.field4809[9]) * var1;
		float var16 = var1 * (this.field4809[5] * this.field4809[2] * this.field4809[12] + (this.field4809[14] * this.field4809[4] * this.field4809[1] + this.field4809[13] * this.field4809[6] * this.field4809[0] + -this.field4809[0] * this.field4809[5] * this.field4809[14] - this.field4809[1] * this.field4809[6] * this.field4809[12] - this.field4809[2] * this.field4809[4] * this.field4809[13]));
		float var17 = var1 * (this.field4809[9] * this.field4809[2] * this.field4809[4] + this.field4809[10] * this.field4809[5] * this.field4809[0] - this.field4809[0] * this.field4809[6] * this.field4809[9] - this.field4809[10] * this.field4809[4] * this.field4809[1] + this.field4809[1] * this.field4809[6] * this.field4809[8] - this.field4809[2] * this.field4809[5] * this.field4809[8]);
		this.field4809[0] = var2;
		this.field4809[1] = var3;
		this.field4809[2] = var4;
		this.field4809[3] = var5;
		this.field4809[4] = var6;
		this.field4809[5] = var7;
		this.field4809[6] = var8;
		this.field4809[7] = var9;
		this.field4809[8] = var10;
		this.field4809[9] = var11;
		this.field4809[10] = var12;
		this.field4809[11] = var13;
		this.field4809[12] = var14;
		this.field4809[13] = var15;
		this.field4809[14] = var16;
		this.field4809[15] = var17;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "71"
	)
	public float[] method8560() {
		float[] var1 = new float[3];
		class464 var2 = new class464(this.field4809[0], this.field4809[1], this.field4809[2]);
		class464 var3 = new class464(this.field4809[4], this.field4809[5], this.field4809[6]);
		class464 var4 = new class464(this.field4809[8], this.field4809[9], this.field4809[10]);
		var1[0] = var2.method8504();
		var1[1] = var3.method8504();
		var1[2] = var4.method8504();
		return var1;
	}

	public int hashCode() {
		boolean var1 = true;
		byte var2 = 1;
		int var3 = 31 * var2 + Arrays.hashCode(this.field4809);
		return var3;
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method8542();
		this.method8544();

		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.field4809[var3 + var2 * 4];
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) {
					var4 = 0.0F;
				}

				var1.append(var4);
			}

			var1.append("\n");
		}

		return var1.toString();
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class466)) {
			return false;
		} else {
			class466 var2 = (class466)var1;

			for (int var3 = 0; var3 < 16; ++var3) {
				if (this.field4809[var3] != var2.field4809[var3]) {
					return false;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1190086448"
	)
	static final void method8613() {
		World.method1896(false);
		Client.field566 = 0;
		boolean var0 = true;

		int var1;
		for (var1 = 0; var1 < class319.regionLandArchives.length; ++var1) {
			if (WorldMapData_0.regionMapArchiveIds[var1] != -1 && class319.regionLandArchives[var1] == null) {
				class319.regionLandArchives[var1] = class30.archive9.takeFile(WorldMapData_0.regionMapArchiveIds[var1], 0);
				if (class319.regionLandArchives[var1] == null) {
					var0 = false;
					++Client.field566;
				}
			}

			if (class364.regionLandArchiveIds[var1] != -1 && class341.regionMapArchives[var1] == null) {
				class341.regionMapArchives[var1] = class30.archive9.takeFileEncrypted(class364.regionLandArchiveIds[var1], 0, class166.xteaKeys[var1]);
				if (class341.regionMapArchives[var1] == null) {
					var0 = false;
					++Client.field566;
				}
			}
		}

		if (!var0) {
			Client.field568 = 1;
		} else {
			Client.field555 = 0;
			var0 = true;

			int var3;
			int var4;
			for (var1 = 0; var1 < class319.regionLandArchives.length; ++var1) {
				byte[] var17 = class341.regionMapArchives[var1];
				if (var17 != null) {
					var3 = (class33.regions[var1] >> 8) * 64 - HealthBarDefinition.baseX * 64;
					var4 = (class33.regions[var1] & 255) * 64 - WorldMapScaleHandler.baseY * 64;
					if (Client.isInInstance) {
						var3 = 10;
						var4 = 10;
					}

					var0 &= class342.method6370(var17, var3, var4);
				}
			}

			if (!var0) {
				Client.field568 = 2;
			} else {
				if (Client.field568 != 0) {
					StructComposition.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				WorldMapRectangle.method5020();
				GrandExchangeOfferOwnWorldComparator.scene.clear();

				for (var1 = 0; var1 < 4; ++var1) {
					Client.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) {
					for (var2 = 0; var2 < 104; ++var2) {
						for (var3 = 0; var3 < 104; ++var3) {
							Tiles.Tiles_renderFlags[var1][var2][var3] = 0;
						}
					}
				}

				WorldMapRectangle.method5020();
				class482.method8743();
				var1 = class319.regionLandArchives.length;
				WorldMapSection1.method5058();
				World.method1896(true);
				int var5;
				if (!Client.isInInstance) {
					byte[] var16;
					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (class33.regions[var2] >> 8) * 64 - HealthBarDefinition.baseX * 64;
						var4 = (class33.regions[var2] & 255) * 64 - WorldMapScaleHandler.baseY * 64;
						var16 = class319.regionLandArchives[var2];
						if (var16 != null) {
							WorldMapRectangle.method5020();
							class30.method456(var16, var3, var4, KeyHandler.field134 * 8 - 48, class184.field1925 * 8 - 48, Client.collisionMaps);
						}
					}

					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (class33.regions[var2] >> 8) * 64 - HealthBarDefinition.baseX * 64;
						var4 = (class33.regions[var2] & 255) * 64 - WorldMapScaleHandler.baseY * 64;
						var16 = class319.regionLandArchives[var2];
						if (var16 == null && class184.field1925 < 800) {
							WorldMapRectangle.method5020();
							GrandExchangeOfferOwnWorldComparator.method1245(var3, var4, 64, 64);
						}
					}

					World.method1896(true);

					for (var2 = 0; var2 < var1; ++var2) {
						byte[] var15 = class341.regionMapArchives[var2];
						if (var15 != null) {
							var4 = (class33.regions[var2] >> 8) * 64 - HealthBarDefinition.baseX * 64;
							var5 = (class33.regions[var2] & 255) * 64 - WorldMapScaleHandler.baseY * 64;
							WorldMapRectangle.method5020();
							JagexCache.method4247(var15, var4, var5, GrandExchangeOfferOwnWorldComparator.scene, Client.collisionMaps);
						}
					}
				}

				int var6;
				int var7;
				int var8;
				if (Client.isInInstance) {
					int var9;
					int var10;
					int var11;
					for (var2 = 0; var2 < 4; ++var2) {
						WorldMapRectangle.method5020();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								boolean var18 = false;
								var6 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var6 != -1) {
									var7 = var6 >> 24 & 3;
									var8 = var6 >> 1 & 3;
									var9 = var6 >> 14 & 1023;
									var10 = var6 >> 3 & 2047;
									var11 = (var9 / 8 << 8) + var10 / 8;

									for (int var12 = 0; var12 < class33.regions.length; ++var12) {
										if (class33.regions[var12] == var11 && class319.regionLandArchives[var12] != null) {
											int var13 = (var9 - var3) * 8;
											int var14 = (var10 - var4) * 8;
											class142.method3226(class319.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14, Client.collisionMaps);
											var18 = true;
											break;
										}
									}
								}

								if (!var18) {
									class59.method1167(var2, var3 * 8, var4 * 8);
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) {
						for (var3 = 0; var3 < 13; ++var3) {
							var4 = Client.instanceChunkTemplates[0][var2][var3];
							if (var4 == -1) {
								GrandExchangeOfferOwnWorldComparator.method1245(var2 * 8, var3 * 8, 8, 8);
							}
						}
					}

					World.method1896(true);

					for (var2 = 0; var2 < 4; ++var2) {
						WorldMapRectangle.method5020();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								var5 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var5 != -1) {
									var6 = var5 >> 24 & 3;
									var7 = var5 >> 1 & 3;
									var8 = var5 >> 14 & 1023;
									var9 = var5 >> 3 & 2047;
									var10 = (var8 / 8 << 8) + var9 / 8;

									for (var11 = 0; var11 < class33.regions.length; ++var11) {
										if (class33.regions[var11] == var10 && class341.regionMapArchives[var11] != null) {
											Tiles.method2274(class341.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, GrandExchangeOfferOwnWorldComparator.scene, Client.collisionMaps);
											break;
										}
									}
								}
							}
						}
					}
				}

				World.method1896(true);
				WorldMapRectangle.method5020();
				UserComparator9.method2979(GrandExchangeOfferOwnWorldComparator.scene, Client.collisionMaps);
				World.method1896(true);
				var2 = Tiles.Tiles_minPlane;
				if (var2 > SecureUrlRequester.Client_plane) {
					var2 = SecureUrlRequester.Client_plane;
				}

				if (var2 < SecureUrlRequester.Client_plane - 1) {
					var2 = SecureUrlRequester.Client_plane - 1;
				}

				if (Client.isLowDetail) {
					GrandExchangeOfferOwnWorldComparator.scene.init(Tiles.Tiles_minPlane);
				} else {
					GrandExchangeOfferOwnWorldComparator.scene.init(0);
				}

				for (var3 = 0; var3 < 104; ++var3) {
					for (var4 = 0; var4 < 104; ++var4) {
						class134.updateItemPile(SecureUrlRequester.Client_plane, var3, var4);
					}
				}

				WorldMapRectangle.method5020();
				BuddyRankComparator.method2990();
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				PacketBufferNode var19;
				if (VertexNormal.client.hasFrame()) {
					var19 = class482.getPacketBufferNode(ClientPacket.DETECT_MODIFIED_CLIENT, Client.packetWriter.isaacCipher);
					var19.packetBuffer.writeInt(1057001181);
					Client.packetWriter.addNode(var19);
				}

				if (!Client.isInInstance) {
					var3 = (KeyHandler.field134 - 6) / 8;
					var4 = (KeyHandler.field134 + 6) / 8;
					var5 = (class184.field1925 - 6) / 8;
					var6 = (class184.field1925 + 6) / 8;

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) {
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) {
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) {
								class30.archive9.loadRegionFromName("m" + var7 + "_" + var8);
								class30.archive9.loadRegionFromName("l" + var7 + "_" + var8);
							}
						}
					}
				}

				class131.updateGameState(30);
				WorldMapRectangle.method5020();
				class148.method3273();
				var19 = class482.getPacketBufferNode(ClientPacket.field3230, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var19);
				WorldMapLabelSize.method4610();
			}
		}
	}
}
