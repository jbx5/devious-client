import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sq")
public final class class470 {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lsq;"
	)
	static class470[] field4870;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1954864157
	)
	static int field4875;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	public static final class470 field4873;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	static Archive field4874;
	@ObfuscatedName("an")
	public float[] field4872;

	static {
		field4870 = new class470[0];
		class225.method4274(100);
		field4873 = new class470();
	}

	public class470() {
		this.field4872 = new float[16];
		this.method8418();
	}

	@ObfuscatedSignature(
		descriptor = "(Lsq;)V"
	)
	public class470(class470 var1) {
		this.field4872 = new float[16];
		this.method8411(var1);
	}

	@ObfuscatedSignature(
		descriptor = "(Lur;Z)V"
	)
	public class470(Buffer var1, boolean var2) {
		this.field4872 = new float[16];
		this.method8407(var1, var2);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "22"
	)
	public void method8460() {
		synchronized(field4870) {
			if (ByteArrayPool.field4688 < field4875 - 1) {
				field4870[++ByteArrayPool.field4688 - 1] = this;
			}

		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lur;ZI)V",
		garbageValue = "-625842354"
	)
	void method8407(Buffer var1, boolean var2) {
		if (var2) {
			class471 var13 = new class471();
			int var6 = var1.readShort();
			var6 &= 16383;
			float var5 = (float)((double)((float)var6 / 16384.0F) * 6.283185307179586D);
			var13.method8469(var5);
			int var9 = var1.readShort();
			var9 &= 16383;
			float var8 = (float)((double)((float)var9 / 16384.0F) * 6.283185307179586D);
			var13.method8479(var8);
			int var12 = var1.readShort();
			var12 &= 16383;
			float var11 = (float)(6.283185307179586D * (double)((float)var12 / 16384.0F));
			var13.method8471(var11);
			var13.method8472((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort());
			this.method8446(var13);
		} else {
			for (int var3 = 0; var3 < 16; ++var3) {
				this.field4872[var3] = var1.method9273();
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "-41"
	)
	float[] method8447() {
		float[] var1 = new float[3];
		if ((double)this.field4872[2] < 0.999D && (double)this.field4872[2] > -0.999D) {
			var1[1] = (float)(-Math.asin((double)this.field4872[2]));
			double var2 = Math.cos((double)var1[1]);
			var1[0] = (float)Math.atan2((double)this.field4872[6] / var2, (double)this.field4872[10] / var2);
			var1[2] = (float)Math.atan2((double)this.field4872[1] / var2, (double)this.field4872[0] / var2);
		} else {
			var1[0] = 0.0F;
			var1[1] = (float)Math.atan2((double)this.field4872[2], 0.0D);
			var1[2] = (float)Math.atan2((double)(-this.field4872[9]), (double)this.field4872[5]);
		}

		return var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "2"
	)
	public float[] method8409() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4872[6])), 0.0F, 0.0F};
		double var2 = Math.cos((double)var1[0]);
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) {
			var4 = (double)this.field4872[2];
			var6 = (double)this.field4872[10];
			double var8 = (double)this.field4872[4];
			double var10 = (double)this.field4872[5];
			var1[1] = (float)Math.atan2(var4, var6);
			var1[2] = (float)Math.atan2(var8, var10);
		} else {
			var4 = (double)this.field4872[1];
			var6 = (double)this.field4872[0];
			if (this.field4872[6] < 0.0F) {
				var1[1] = (float)Math.atan2(var4, var6);
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6));
			}

			var1[2] = 0.0F;
		}

		return var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-510350437"
	)
	void method8418() {
		this.field4872[0] = 1.0F;
		this.field4872[1] = 0.0F;
		this.field4872[2] = 0.0F;
		this.field4872[3] = 0.0F;
		this.field4872[4] = 0.0F;
		this.field4872[5] = 1.0F;
		this.field4872[6] = 0.0F;
		this.field4872[7] = 0.0F;
		this.field4872[8] = 0.0F;
		this.field4872[9] = 0.0F;
		this.field4872[10] = 1.0F;
		this.field4872[11] = 0.0F;
		this.field4872[12] = 0.0F;
		this.field4872[13] = 0.0F;
		this.field4872[14] = 0.0F;
		this.field4872[15] = 1.0F;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1776603414"
	)
	public void method8435() {
		this.field4872[0] = 0.0F;
		this.field4872[1] = 0.0F;
		this.field4872[2] = 0.0F;
		this.field4872[3] = 0.0F;
		this.field4872[4] = 0.0F;
		this.field4872[5] = 0.0F;
		this.field4872[6] = 0.0F;
		this.field4872[7] = 0.0F;
		this.field4872[8] = 0.0F;
		this.field4872[9] = 0.0F;
		this.field4872[10] = 0.0F;
		this.field4872[11] = 0.0F;
		this.field4872[12] = 0.0F;
		this.field4872[13] = 0.0F;
		this.field4872[14] = 0.0F;
		this.field4872[15] = 0.0F;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lsq;B)V",
		garbageValue = "-34"
	)
	public void method8411(class470 var1) {
		System.arraycopy(var1.field4872, 0, this.field4872, 0, 16);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "10"
	)
	public void method8406(float var1) {
		this.method8410(var1, var1, var1);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-1913355271"
	)
	public void method8410(float var1, float var2, float var3) {
		this.method8418();
		this.field4872[0] = var1;
		this.field4872[5] = var2;
		this.field4872[10] = var3;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lsq;B)V",
		garbageValue = "-114"
	)
	public void method8413(class470 var1) {
		for (int var2 = 0; var2 < this.field4872.length; ++var2) {
			float[] var10000 = this.field4872;
			var10000[var2] += var1.field4872[var2];
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lsq;B)V",
		garbageValue = "-127"
	)
	public void method8414(class470 var1) {
		float var2 = this.field4872[2] * var1.field4872[8] + this.field4872[1] * var1.field4872[4] + this.field4872[0] * var1.field4872[0] + this.field4872[3] * var1.field4872[12];
		float var3 = var1.field4872[5] * this.field4872[1] + this.field4872[0] * var1.field4872[1] + this.field4872[2] * var1.field4872[9] + this.field4872[3] * var1.field4872[13];
		float var4 = var1.field4872[6] * this.field4872[1] + this.field4872[0] * var1.field4872[2] + this.field4872[2] * var1.field4872[10] + this.field4872[3] * var1.field4872[14];
		float var5 = var1.field4872[11] * this.field4872[2] + var1.field4872[3] * this.field4872[0] + var1.field4872[7] * this.field4872[1] + var1.field4872[15] * this.field4872[3];
		float var6 = this.field4872[6] * var1.field4872[8] + this.field4872[4] * var1.field4872[0] + var1.field4872[4] * this.field4872[5] + var1.field4872[12] * this.field4872[7];
		float var7 = this.field4872[7] * var1.field4872[13] + this.field4872[6] * var1.field4872[9] + this.field4872[5] * var1.field4872[5] + var1.field4872[1] * this.field4872[4];
		float var8 = this.field4872[6] * var1.field4872[10] + this.field4872[5] * var1.field4872[6] + var1.field4872[2] * this.field4872[4] + this.field4872[7] * var1.field4872[14];
		float var9 = this.field4872[5] * var1.field4872[7] + var1.field4872[3] * this.field4872[4] + this.field4872[6] * var1.field4872[11] + this.field4872[7] * var1.field4872[15];
		float var10 = var1.field4872[4] * this.field4872[9] + this.field4872[8] * var1.field4872[0] + this.field4872[10] * var1.field4872[8] + this.field4872[11] * var1.field4872[12];
		float var11 = this.field4872[9] * var1.field4872[5] + this.field4872[8] * var1.field4872[1] + var1.field4872[9] * this.field4872[10] + var1.field4872[13] * this.field4872[11];
		float var12 = var1.field4872[14] * this.field4872[11] + this.field4872[9] * var1.field4872[6] + this.field4872[8] * var1.field4872[2] + this.field4872[10] * var1.field4872[10];
		float var13 = this.field4872[11] * var1.field4872[15] + this.field4872[9] * var1.field4872[7] + var1.field4872[3] * this.field4872[8] + var1.field4872[11] * this.field4872[10];
		float var14 = this.field4872[15] * var1.field4872[12] + var1.field4872[4] * this.field4872[13] + this.field4872[12] * var1.field4872[0] + this.field4872[14] * var1.field4872[8];
		float var15 = this.field4872[14] * var1.field4872[9] + this.field4872[12] * var1.field4872[1] + this.field4872[13] * var1.field4872[5] + var1.field4872[13] * this.field4872[15];
		float var16 = this.field4872[12] * var1.field4872[2] + var1.field4872[6] * this.field4872[13] + this.field4872[14] * var1.field4872[10] + this.field4872[15] * var1.field4872[14];
		float var17 = this.field4872[12] * var1.field4872[3] + var1.field4872[7] * this.field4872[13] + var1.field4872[11] * this.field4872[14] + this.field4872[15] * var1.field4872[15];
		this.field4872[0] = var2;
		this.field4872[1] = var3;
		this.field4872[2] = var4;
		this.field4872[3] = var5;
		this.field4872[4] = var6;
		this.field4872[5] = var7;
		this.field4872[6] = var8;
		this.field4872[7] = var9;
		this.field4872[8] = var10;
		this.field4872[9] = var11;
		this.field4872[10] = var12;
		this.field4872[11] = var13;
		this.field4872[12] = var14;
		this.field4872[13] = var15;
		this.field4872[14] = var16;
		this.field4872[15] = var17;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lsh;I)V",
		garbageValue = "-774219799"
	)
	public void method8432(class469 var1) {
		float var2 = var1.field4867 * var1.field4867;
		float var3 = var1.field4863 * var1.field4867;
		float var4 = var1.field4865 * var1.field4867;
		float var5 = var1.field4864 * var1.field4867;
		float var6 = var1.field4863 * var1.field4863;
		float var7 = var1.field4863 * var1.field4865;
		float var8 = var1.field4863 * var1.field4864;
		float var9 = var1.field4865 * var1.field4865;
		float var10 = var1.field4864 * var1.field4865;
		float var11 = var1.field4864 * var1.field4864;
		this.field4872[0] = var2 + var6 - var11 - var9;
		this.field4872[1] = var5 + var7 + var7 + var5;
		this.field4872[2] = var8 + (var8 - var4 - var4);
		this.field4872[4] = var7 - var5 - var5 + var7;
		this.field4872[5] = var9 + var2 - var6 - var11;
		this.field4872[6] = var3 + var3 + var10 + var10;
		this.field4872[8] = var4 + var8 + var4 + var8;
		this.field4872[9] = var10 + (var10 - var3 - var3);
		this.field4872[10] = var2 + var11 - var9 - var6;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lsy;B)V",
		garbageValue = "82"
	)
	void method8446(class471 var1) {
		this.field4872[0] = var1.field4884;
		this.field4872[1] = var1.field4879;
		this.field4872[2] = var1.field4878;
		this.field4872[3] = 0.0F;
		this.field4872[4] = var1.field4883;
		this.field4872[5] = var1.field4880;
		this.field4872[6] = var1.field4881;
		this.field4872[7] = 0.0F;
		this.field4872[8] = var1.field4882;
		this.field4872[9] = var1.field4876;
		this.field4872[10] = var1.field4877;
		this.field4872[11] = 0.0F;
		this.field4872[12] = var1.field4885;
		this.field4872[13] = var1.field4886;
		this.field4872[14] = var1.field4887;
		this.field4872[15] = 1.0F;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "-987223281"
	)
	float method8417() {
		return this.field4872[9] * this.field4872[6] * this.field4872[3] * this.field4872[12] + (this.field4872[10] * this.field4872[4] * this.field4872[3] * this.field4872[13] + (this.field4872[13] * this.field4872[8] * this.field4872[7] * this.field4872[2] + this.field4872[9] * this.field4872[4] * this.field4872[2] * this.field4872[15] + this.field4872[7] * this.field4872[1] * this.field4872[10] * this.field4872[12] + (this.field4872[8] * this.field4872[6] * this.field4872[1] * this.field4872[15] + this.field4872[11] * this.field4872[4] * this.field4872[1] * this.field4872[14] + (this.field4872[9] * this.field4872[7] * this.field4872[0] * this.field4872[14] + this.field4872[13] * this.field4872[6] * this.field4872[0] * this.field4872[11] + (this.field4872[15] * this.field4872[0] * this.field4872[5] * this.field4872[10] - this.field4872[5] * this.field4872[0] * this.field4872[11] * this.field4872[14] - this.field4872[9] * this.field4872[0] * this.field4872[6] * this.field4872[15]) - this.field4872[7] * this.field4872[0] * this.field4872[10] * this.field4872[13] - this.field4872[10] * this.field4872[4] * this.field4872[1] * this.field4872[15]) - this.field4872[1] * this.field4872[6] * this.field4872[11] * this.field4872[12] - this.field4872[14] * this.field4872[8] * this.field4872[7] * this.field4872[1]) - this.field4872[13] * this.field4872[11] * this.field4872[4] * this.field4872[2] - this.field4872[15] * this.field4872[8] * this.field4872[2] * this.field4872[5] + this.field4872[5] * this.field4872[2] * this.field4872[11] * this.field4872[12] - this.field4872[12] * this.field4872[9] * this.field4872[2] * this.field4872[7] - this.field4872[14] * this.field4872[9] * this.field4872[4] * this.field4872[3]) + this.field4872[14] * this.field4872[8] * this.field4872[5] * this.field4872[3] - this.field4872[10] * this.field4872[5] * this.field4872[3] * this.field4872[12] - this.field4872[13] * this.field4872[3] * this.field4872[6] * this.field4872[8]);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "66"
	)
	public void method8445() {
		float var1 = 1.0F / this.method8417();
		float var2 = (this.field4872[6] * this.field4872[11] * this.field4872[13] + (this.field4872[5] * this.field4872[10] * this.field4872[15] - this.field4872[11] * this.field4872[5] * this.field4872[14] - this.field4872[15] * this.field4872[6] * this.field4872[9]) + this.field4872[14] * this.field4872[7] * this.field4872[9] - this.field4872[7] * this.field4872[10] * this.field4872[13]) * var1;
		float var3 = (this.field4872[2] * this.field4872[9] * this.field4872[15] + this.field4872[10] * -this.field4872[1] * this.field4872[15] + this.field4872[14] * this.field4872[11] * this.field4872[1] - this.field4872[2] * this.field4872[11] * this.field4872[13] - this.field4872[3] * this.field4872[9] * this.field4872[14] + this.field4872[10] * this.field4872[3] * this.field4872[13]) * var1;
		float var4 = (this.field4872[6] * this.field4872[1] * this.field4872[15] - this.field4872[14] * this.field4872[7] * this.field4872[1] - this.field4872[15] * this.field4872[5] * this.field4872[2] + this.field4872[13] * this.field4872[7] * this.field4872[2] + this.field4872[3] * this.field4872[5] * this.field4872[14] - this.field4872[3] * this.field4872[6] * this.field4872[13]) * var1;
		float var5 = (this.field4872[9] * this.field4872[6] * this.field4872[3] + (this.field4872[11] * this.field4872[2] * this.field4872[5] + -this.field4872[1] * this.field4872[6] * this.field4872[11] + this.field4872[10] * this.field4872[7] * this.field4872[1] - this.field4872[9] * this.field4872[7] * this.field4872[2] - this.field4872[10] * this.field4872[5] * this.field4872[3])) * var1;
		float var6 = var1 * (this.field4872[12] * this.field4872[7] * this.field4872[10] + (this.field4872[15] * this.field4872[6] * this.field4872[8] + this.field4872[14] * this.field4872[11] * this.field4872[4] + this.field4872[10] * -this.field4872[4] * this.field4872[15] - this.field4872[12] * this.field4872[6] * this.field4872[11] - this.field4872[14] * this.field4872[7] * this.field4872[8]));
		float var7 = var1 * (this.field4872[15] * this.field4872[0] * this.field4872[10] - this.field4872[14] * this.field4872[0] * this.field4872[11] - this.field4872[8] * this.field4872[2] * this.field4872[15] + this.field4872[12] * this.field4872[2] * this.field4872[11] + this.field4872[3] * this.field4872[8] * this.field4872[14] - this.field4872[12] * this.field4872[3] * this.field4872[10]);
		float var8 = var1 * (this.field4872[12] * this.field4872[3] * this.field4872[6] + (this.field4872[15] * this.field4872[2] * this.field4872[4] + this.field4872[14] * this.field4872[0] * this.field4872[7] + this.field4872[15] * -this.field4872[0] * this.field4872[6] - this.field4872[2] * this.field4872[7] * this.field4872[12] - this.field4872[4] * this.field4872[3] * this.field4872[14]));
		float var9 = var1 * (this.field4872[4] * this.field4872[3] * this.field4872[10] + this.field4872[8] * this.field4872[7] * this.field4872[2] + (this.field4872[0] * this.field4872[6] * this.field4872[11] - this.field4872[10] * this.field4872[7] * this.field4872[0] - this.field4872[11] * this.field4872[4] * this.field4872[2]) - this.field4872[8] * this.field4872[3] * this.field4872[6]);
		float var10 = var1 * (this.field4872[9] * this.field4872[4] * this.field4872[15] - this.field4872[4] * this.field4872[11] * this.field4872[13] - this.field4872[8] * this.field4872[5] * this.field4872[15] + this.field4872[12] * this.field4872[11] * this.field4872[5] + this.field4872[13] * this.field4872[7] * this.field4872[8] - this.field4872[12] * this.field4872[7] * this.field4872[9]);
		float var11 = var1 * (this.field4872[11] * this.field4872[0] * this.field4872[13] + this.field4872[15] * this.field4872[9] * -this.field4872[0] + this.field4872[1] * this.field4872[8] * this.field4872[15] - this.field4872[12] * this.field4872[11] * this.field4872[1] - this.field4872[3] * this.field4872[8] * this.field4872[13] + this.field4872[9] * this.field4872[3] * this.field4872[12]);
		float var12 = (this.field4872[0] * this.field4872[5] * this.field4872[15] - this.field4872[13] * this.field4872[7] * this.field4872[0] - this.field4872[15] * this.field4872[4] * this.field4872[1] + this.field4872[7] * this.field4872[1] * this.field4872[12] + this.field4872[13] * this.field4872[4] * this.field4872[3] - this.field4872[5] * this.field4872[3] * this.field4872[12]) * var1;
		float var13 = var1 * (this.field4872[0] * this.field4872[7] * this.field4872[9] + this.field4872[11] * -this.field4872[0] * this.field4872[5] + this.field4872[11] * this.field4872[4] * this.field4872[1] - this.field4872[1] * this.field4872[7] * this.field4872[8] - this.field4872[3] * this.field4872[4] * this.field4872[9] + this.field4872[5] * this.field4872[3] * this.field4872[8]);
		float var14 = (this.field4872[12] * this.field4872[6] * this.field4872[9] + (this.field4872[14] * this.field4872[5] * this.field4872[8] + this.field4872[4] * this.field4872[10] * this.field4872[13] + this.field4872[14] * -this.field4872[4] * this.field4872[9] - this.field4872[12] * this.field4872[10] * this.field4872[5] - this.field4872[8] * this.field4872[6] * this.field4872[13])) * var1;
		float var15 = var1 * (this.field4872[2] * this.field4872[8] * this.field4872[13] + this.field4872[10] * this.field4872[1] * this.field4872[12] + (this.field4872[14] * this.field4872[0] * this.field4872[9] - this.field4872[10] * this.field4872[0] * this.field4872[13] - this.field4872[14] * this.field4872[8] * this.field4872[1]) - this.field4872[2] * this.field4872[9] * this.field4872[12]);
		float var16 = var1 * (this.field4872[14] * this.field4872[4] * this.field4872[1] + this.field4872[13] * this.field4872[6] * this.field4872[0] + -this.field4872[0] * this.field4872[5] * this.field4872[14] - this.field4872[12] * this.field4872[1] * this.field4872[6] - this.field4872[4] * this.field4872[2] * this.field4872[13] + this.field4872[5] * this.field4872[2] * this.field4872[12]);
		float var17 = (this.field4872[4] * this.field4872[2] * this.field4872[9] + this.field4872[10] * this.field4872[5] * this.field4872[0] - this.field4872[0] * this.field4872[6] * this.field4872[9] - this.field4872[4] * this.field4872[1] * this.field4872[10] + this.field4872[6] * this.field4872[1] * this.field4872[8] - this.field4872[8] * this.field4872[2] * this.field4872[5]) * var1;
		this.field4872[0] = var2;
		this.field4872[1] = var3;
		this.field4872[2] = var4;
		this.field4872[3] = var5;
		this.field4872[4] = var6;
		this.field4872[5] = var7;
		this.field4872[6] = var8;
		this.field4872[7] = var9;
		this.field4872[8] = var10;
		this.field4872[9] = var11;
		this.field4872[10] = var12;
		this.field4872[11] = var13;
		this.field4872[12] = var14;
		this.field4872[13] = var15;
		this.field4872[14] = var16;
		this.field4872[15] = var17;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-1357026188"
	)
	public float[] method8420() {
		float[] var1 = new float[3];
		class468 var2 = new class468(this.field4872[0], this.field4872[1], this.field4872[2]);
		class468 var3 = new class468(this.field4872[4], this.field4872[5], this.field4872[6]);
		class468 var4 = new class468(this.field4872[8], this.field4872[9], this.field4872[10]);
		var1[0] = var2.method8372();
		var1[1] = var3.method8372();
		var1[2] = var4.method8372();
		return var1;
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method8409();
		this.method8447();

		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.field4872[var3 + var2 * 4];
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
		int var3 = var2 * 31 + Arrays.hashCode(this.field4872);
		return var3;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class470)) {
			return false;
		} else {
			class470 var2 = (class470)var1;

			for (int var3 = 0; var3 < 16; ++var3) {
				if (var2.field4872[var3] != this.field4872[var3]) {
					return false;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(CLpv;I)I",
		garbageValue = "-267393614"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var2 = (var0 << 4) + 1;
		}

		if (var0 == 241 && var1 == Language.Language_ES) {
			var2 = 1762;
		}

		return var2;
	}
}
