import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rb")
public final class class465 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lrb;"
	)
	static class465[] field4783;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 948805899
	)
	static int field4784;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1039080813
	)
	static int field4781;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	public static final class465 field4782;
	@ObfuscatedName("ui")
	@ObfuscatedGetter(
		intValue = 2136812353
	)
	static int field4788;
	@ObfuscatedName("ao")
	public float[] field4785;

	static {
		field4783 = new class465[0];
		class76.method2123(100);
		field4782 = new class465();
	}

	public class465() {
		this.field4785 = new float[16];
		this.method8354();
	}

	@ObfuscatedSignature(
		descriptor = "(Lrb;)V"
	)
	public class465(class465 var1) {
		this.field4785 = new float[16];
		this.method8356(var1);
	}

	@ObfuscatedSignature(
		descriptor = "(Lul;Z)V"
	)
	public class465(Buffer var1, boolean var2) {
		this.field4785 = new float[16];
		this.method8350(var1, var2);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-695246876"
	)
	public void method8399() {
		synchronized(field4783) {
			if (field4781 < field4784 - 1) {
				field4783[++field4781 - 1] = this;
			}

		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lul;ZI)V",
		garbageValue = "332749023"
	)
	void method8350(Buffer var1, boolean var2) {
		if (var2) {
			class466 var4 = new class466();
			var4.method8418(class143.method3138(var1.readShort()));
			var4.method8413(class143.method3138(var1.readShort()));
			var4.method8414(class143.method3138(var1.readShort()));
			var4.method8415((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort());
			this.method8361(var4);
		} else {
			for (int var3 = 0; var3 < 16; ++var3) {
				this.field4785[var3] = var1.method9211();
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-1165307425"
	)
	float[] method8402() {
		float[] var1 = new float[3];
		if ((double)this.field4785[2] < 0.999D && (double)this.field4785[2] > -0.999D) {
			var1[1] = (float)(-Math.asin((double)this.field4785[2]));
			double var2 = Math.cos((double)var1[1]);
			var1[0] = (float)Math.atan2((double)this.field4785[6] / var2, (double)this.field4785[10] / var2);
			var1[2] = (float)Math.atan2((double)this.field4785[1] / var2, (double)this.field4785[0] / var2);
		} else {
			var1[0] = 0.0F;
			var1[1] = (float)Math.atan2((double)this.field4785[2], 0.0D);
			var1[2] = (float)Math.atan2((double)(-this.field4785[9]), (double)this.field4785[5]);
		}

		return var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "83"
	)
	public float[] method8353() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4785[6])), 0.0F, 0.0F};
		double var2 = Math.cos((double)var1[0]);
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) {
			var4 = (double)this.field4785[2];
			var6 = (double)this.field4785[10];
			double var8 = (double)this.field4785[4];
			double var10 = (double)this.field4785[5];
			var1[1] = (float)Math.atan2(var4, var6);
			var1[2] = (float)Math.atan2(var8, var10);
		} else {
			var4 = (double)this.field4785[1];
			var6 = (double)this.field4785[0];
			if (this.field4785[6] < 0.0F) {
				var1[1] = (float)Math.atan2(var4, var6);
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6));
			}

			var1[2] = 0.0F;
		}

		return var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "624646995"
	)
	void method8354() {
		this.field4785[0] = 1.0F;
		this.field4785[1] = 0.0F;
		this.field4785[2] = 0.0F;
		this.field4785[3] = 0.0F;
		this.field4785[4] = 0.0F;
		this.field4785[5] = 1.0F;
		this.field4785[6] = 0.0F;
		this.field4785[7] = 0.0F;
		this.field4785[8] = 0.0F;
		this.field4785[9] = 0.0F;
		this.field4785[10] = 1.0F;
		this.field4785[11] = 0.0F;
		this.field4785[12] = 0.0F;
		this.field4785[13] = 0.0F;
		this.field4785[14] = 0.0F;
		this.field4785[15] = 1.0F;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1094416342"
	)
	public void method8355() {
		this.field4785[0] = 0.0F;
		this.field4785[1] = 0.0F;
		this.field4785[2] = 0.0F;
		this.field4785[3] = 0.0F;
		this.field4785[4] = 0.0F;
		this.field4785[5] = 0.0F;
		this.field4785[6] = 0.0F;
		this.field4785[7] = 0.0F;
		this.field4785[8] = 0.0F;
		this.field4785[9] = 0.0F;
		this.field4785[10] = 0.0F;
		this.field4785[11] = 0.0F;
		this.field4785[12] = 0.0F;
		this.field4785[13] = 0.0F;
		this.field4785[14] = 0.0F;
		this.field4785[15] = 0.0F;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lrb;I)V",
		garbageValue = "-1754099381"
	)
	public void method8356(class465 var1) {
		System.arraycopy(var1.field4785, 0, this.field4785, 0, 16);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-184544595"
	)
	public void method8357(float var1) {
		this.method8380(var1, var1, var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-1816436529"
	)
	public void method8380(float var1, float var2, float var3) {
		this.method8354();
		this.field4785[0] = var1;
		this.field4785[5] = var2;
		this.field4785[10] = var3;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lrb;B)V",
		garbageValue = "6"
	)
	public void method8381(class465 var1) {
		for (int var2 = 0; var2 < this.field4785.length; ++var2) {
			float[] var10000 = this.field4785;
			var10000[var2] += var1.field4785[var2];
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lrb;B)V",
		garbageValue = "-104"
	)
	public void method8359(class465 var1) {
		float var2 = var1.field4785[0] * this.field4785[0] + var1.field4785[4] * this.field4785[1] + this.field4785[2] * var1.field4785[8] + var1.field4785[12] * this.field4785[3];
		float var3 = this.field4785[2] * var1.field4785[9] + this.field4785[1] * var1.field4785[5] + var1.field4785[1] * this.field4785[0] + this.field4785[3] * var1.field4785[13];
		float var4 = var1.field4785[14] * this.field4785[3] + var1.field4785[10] * this.field4785[2] + var1.field4785[6] * this.field4785[1] + var1.field4785[2] * this.field4785[0];
		float var5 = var1.field4785[15] * this.field4785[3] + var1.field4785[11] * this.field4785[2] + this.field4785[0] * var1.field4785[3] + this.field4785[1] * var1.field4785[7];
		float var6 = var1.field4785[12] * this.field4785[7] + var1.field4785[0] * this.field4785[4] + var1.field4785[4] * this.field4785[5] + this.field4785[6] * var1.field4785[8];
		float var7 = this.field4785[4] * var1.field4785[1] + var1.field4785[5] * this.field4785[5] + this.field4785[6] * var1.field4785[9] + var1.field4785[13] * this.field4785[7];
		float var8 = var1.field4785[10] * this.field4785[6] + var1.field4785[2] * this.field4785[4] + var1.field4785[6] * this.field4785[5] + this.field4785[7] * var1.field4785[14];
		float var9 = var1.field4785[11] * this.field4785[6] + this.field4785[5] * var1.field4785[7] + this.field4785[4] * var1.field4785[3] + this.field4785[7] * var1.field4785[15];
		float var10 = var1.field4785[0] * this.field4785[8] + this.field4785[9] * var1.field4785[4] + var1.field4785[8] * this.field4785[10] + var1.field4785[12] * this.field4785[11];
		float var11 = this.field4785[11] * var1.field4785[13] + this.field4785[10] * var1.field4785[9] + this.field4785[8] * var1.field4785[1] + var1.field4785[5] * this.field4785[9];
		float var12 = this.field4785[10] * var1.field4785[10] + this.field4785[9] * var1.field4785[6] + this.field4785[8] * var1.field4785[2] + var1.field4785[14] * this.field4785[11];
		float var13 = var1.field4785[3] * this.field4785[8] + var1.field4785[7] * this.field4785[9] + var1.field4785[11] * this.field4785[10] + var1.field4785[15] * this.field4785[11];
		float var14 = this.field4785[15] * var1.field4785[12] + this.field4785[14] * var1.field4785[8] + this.field4785[13] * var1.field4785[4] + this.field4785[12] * var1.field4785[0];
		float var15 = var1.field4785[13] * this.field4785[15] + var1.field4785[9] * this.field4785[14] + this.field4785[13] * var1.field4785[5] + var1.field4785[1] * this.field4785[12];
		float var16 = var1.field4785[14] * this.field4785[15] + var1.field4785[10] * this.field4785[14] + var1.field4785[6] * this.field4785[13] + var1.field4785[2] * this.field4785[12];
		float var17 = var1.field4785[11] * this.field4785[14] + this.field4785[12] * var1.field4785[3] + var1.field4785[7] * this.field4785[13] + this.field4785[15] * var1.field4785[15];
		this.field4785[0] = var2;
		this.field4785[1] = var3;
		this.field4785[2] = var4;
		this.field4785[3] = var5;
		this.field4785[4] = var6;
		this.field4785[5] = var7;
		this.field4785[6] = var8;
		this.field4785[7] = var9;
		this.field4785[8] = var10;
		this.field4785[9] = var11;
		this.field4785[10] = var12;
		this.field4785[11] = var13;
		this.field4785[12] = var14;
		this.field4785[13] = var15;
		this.field4785[14] = var16;
		this.field4785[15] = var17;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lrd;I)V",
		garbageValue = "-2131255556"
	)
	public void method8368(class464 var1) {
		float var2 = var1.field4780 * var1.field4780;
		float var3 = var1.field4780 * var1.field4777;
		float var4 = var1.field4780 * var1.field4778;
		float var5 = var1.field4780 * var1.field4779;
		float var6 = var1.field4777 * var1.field4777;
		float var7 = var1.field4778 * var1.field4777;
		float var8 = var1.field4777 * var1.field4779;
		float var9 = var1.field4778 * var1.field4778;
		float var10 = var1.field4779 * var1.field4778;
		float var11 = var1.field4779 * var1.field4779;
		this.field4785[0] = var6 + var2 - var11 - var9;
		this.field4785[1] = var7 + var7 + var5 + var5;
		this.field4785[2] = var8 - var4 - var4 + var8;
		this.field4785[4] = var7 - var5 - var5 + var7;
		this.field4785[5] = var9 + var2 - var6 - var11;
		this.field4785[6] = var10 + var3 + var10 + var3;
		this.field4785[8] = var4 + var8 + var8 + var4;
		this.field4785[9] = var10 + (var10 - var3 - var3);
		this.field4785[10] = var11 + var2 - var9 - var6;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lrz;B)V",
		garbageValue = "76"
	)
	void method8361(class466 var1) {
		this.field4785[0] = var1.field4797;
		this.field4785[1] = var1.field4790;
		this.field4785[2] = var1.field4798;
		this.field4785[3] = 0.0F;
		this.field4785[4] = var1.field4792;
		this.field4785[5] = var1.field4793;
		this.field4785[6] = var1.field4789;
		this.field4785[7] = 0.0F;
		this.field4785[8] = var1.field4795;
		this.field4785[9] = var1.field4796;
		this.field4785[10] = var1.field4800;
		this.field4785[11] = 0.0F;
		this.field4785[12] = var1.field4794;
		this.field4785[13] = var1.field4799;
		this.field4785[14] = var1.field4791;
		this.field4785[15] = 1.0F;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "-125"
	)
	float method8362() {
		return this.field4785[6] * this.field4785[3] * this.field4785[9] * this.field4785[12] + (this.field4785[10] * this.field4785[7] * this.field4785[1] * this.field4785[12] + (this.field4785[11] * this.field4785[4] * this.field4785[1] * this.field4785[14] + (this.field4785[14] * this.field4785[0] * this.field4785[7] * this.field4785[9] + this.field4785[15] * this.field4785[0] * this.field4785[5] * this.field4785[10] - this.field4785[14] * this.field4785[11] * this.field4785[5] * this.field4785[0] - this.field4785[15] * this.field4785[9] * this.field4785[6] * this.field4785[0] + this.field4785[11] * this.field4785[0] * this.field4785[6] * this.field4785[13] - this.field4785[10] * this.field4785[7] * this.field4785[0] * this.field4785[13] - this.field4785[10] * this.field4785[4] * this.field4785[1] * this.field4785[15]) + this.field4785[8] * this.field4785[6] * this.field4785[1] * this.field4785[15] - this.field4785[11] * this.field4785[6] * this.field4785[1] * this.field4785[12] - this.field4785[8] * this.field4785[7] * this.field4785[1] * this.field4785[14]) + this.field4785[15] * this.field4785[2] * this.field4785[4] * this.field4785[9] - this.field4785[13] * this.field4785[11] * this.field4785[2] * this.field4785[4] - this.field4785[15] * this.field4785[8] * this.field4785[5] * this.field4785[2] + this.field4785[2] * this.field4785[5] * this.field4785[11] * this.field4785[12] + this.field4785[13] * this.field4785[8] * this.field4785[7] * this.field4785[2] - this.field4785[12] * this.field4785[7] * this.field4785[2] * this.field4785[9] - this.field4785[14] * this.field4785[9] * this.field4785[4] * this.field4785[3] + this.field4785[13] * this.field4785[4] * this.field4785[3] * this.field4785[10] + this.field4785[5] * this.field4785[3] * this.field4785[8] * this.field4785[14] - this.field4785[10] * this.field4785[3] * this.field4785[5] * this.field4785[12] - this.field4785[13] * this.field4785[3] * this.field4785[6] * this.field4785[8]);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1302965817"
	)
	public void method8363() {
		float var1 = 1.0F / this.method8362();
		float var2 = var1 * (this.field4785[13] * this.field4785[6] * this.field4785[11] + (this.field4785[10] * this.field4785[5] * this.field4785[15] - this.field4785[11] * this.field4785[5] * this.field4785[14] - this.field4785[15] * this.field4785[6] * this.field4785[9]) + this.field4785[7] * this.field4785[9] * this.field4785[14] - this.field4785[10] * this.field4785[7] * this.field4785[13]);
		float var3 = (this.field4785[14] * this.field4785[1] * this.field4785[11] + this.field4785[15] * this.field4785[10] * -this.field4785[1] + this.field4785[15] * this.field4785[2] * this.field4785[9] - this.field4785[11] * this.field4785[2] * this.field4785[13] - this.field4785[14] * this.field4785[3] * this.field4785[9] + this.field4785[13] * this.field4785[10] * this.field4785[3]) * var1;
		float var4 = (this.field4785[1] * this.field4785[6] * this.field4785[15] - this.field4785[14] * this.field4785[7] * this.field4785[1] - this.field4785[15] * this.field4785[2] * this.field4785[5] + this.field4785[13] * this.field4785[7] * this.field4785[2] + this.field4785[14] * this.field4785[3] * this.field4785[5] - this.field4785[13] * this.field4785[3] * this.field4785[6]) * var1;
		float var5 = var1 * (this.field4785[9] * this.field4785[3] * this.field4785[6] + (this.field4785[11] * this.field4785[2] * this.field4785[5] + this.field4785[6] * -this.field4785[1] * this.field4785[11] + this.field4785[1] * this.field4785[7] * this.field4785[10] - this.field4785[7] * this.field4785[2] * this.field4785[9] - this.field4785[10] * this.field4785[3] * this.field4785[5]));
		float var6 = var1 * (this.field4785[10] * this.field4785[7] * this.field4785[12] + (this.field4785[14] * this.field4785[11] * this.field4785[4] + this.field4785[15] * -this.field4785[4] * this.field4785[10] + this.field4785[15] * this.field4785[6] * this.field4785[8] - this.field4785[12] * this.field4785[6] * this.field4785[11] - this.field4785[14] * this.field4785[8] * this.field4785[7]));
		float var7 = (this.field4785[10] * this.field4785[0] * this.field4785[15] - this.field4785[0] * this.field4785[11] * this.field4785[14] - this.field4785[15] * this.field4785[2] * this.field4785[8] + this.field4785[2] * this.field4785[11] * this.field4785[12] + this.field4785[14] * this.field4785[8] * this.field4785[3] - this.field4785[10] * this.field4785[3] * this.field4785[12]) * var1;
		float var8 = var1 * (this.field4785[15] * this.field4785[6] * -this.field4785[0] + this.field4785[14] * this.field4785[7] * this.field4785[0] + this.field4785[2] * this.field4785[4] * this.field4785[15] - this.field4785[12] * this.field4785[7] * this.field4785[2] - this.field4785[14] * this.field4785[3] * this.field4785[4] + this.field4785[12] * this.field4785[3] * this.field4785[6]);
		float var9 = (this.field4785[10] * this.field4785[3] * this.field4785[4] + this.field4785[7] * this.field4785[2] * this.field4785[8] + (this.field4785[11] * this.field4785[6] * this.field4785[0] - this.field4785[7] * this.field4785[0] * this.field4785[10] - this.field4785[2] * this.field4785[4] * this.field4785[11]) - this.field4785[8] * this.field4785[3] * this.field4785[6]) * var1;
		float var10 = (this.field4785[15] * this.field4785[4] * this.field4785[9] - this.field4785[4] * this.field4785[11] * this.field4785[13] - this.field4785[5] * this.field4785[8] * this.field4785[15] + this.field4785[12] * this.field4785[5] * this.field4785[11] + this.field4785[13] * this.field4785[8] * this.field4785[7] - this.field4785[12] * this.field4785[7] * this.field4785[9]) * var1;
		float var11 = var1 * (this.field4785[12] * this.field4785[9] * this.field4785[3] + (this.field4785[15] * this.field4785[1] * this.field4785[8] + this.field4785[15] * -this.field4785[0] * this.field4785[9] + this.field4785[0] * this.field4785[11] * this.field4785[13] - this.field4785[11] * this.field4785[1] * this.field4785[12] - this.field4785[3] * this.field4785[8] * this.field4785[13]));
		float var12 = (this.field4785[13] * this.field4785[4] * this.field4785[3] + this.field4785[7] * this.field4785[1] * this.field4785[12] + (this.field4785[0] * this.field4785[5] * this.field4785[15] - this.field4785[0] * this.field4785[7] * this.field4785[13] - this.field4785[15] * this.field4785[4] * this.field4785[1]) - this.field4785[5] * this.field4785[3] * this.field4785[12]) * var1;
		float var13 = (this.field4785[9] * this.field4785[7] * this.field4785[0] + this.field4785[5] * -this.field4785[0] * this.field4785[11] + this.field4785[11] * this.field4785[4] * this.field4785[1] - this.field4785[7] * this.field4785[1] * this.field4785[8] - this.field4785[4] * this.field4785[3] * this.field4785[9] + this.field4785[8] * this.field4785[5] * this.field4785[3]) * var1;
		float var14 = (this.field4785[12] * this.field4785[6] * this.field4785[9] + (this.field4785[13] * this.field4785[4] * this.field4785[10] + -this.field4785[4] * this.field4785[9] * this.field4785[14] + this.field4785[8] * this.field4785[5] * this.field4785[14] - this.field4785[12] * this.field4785[10] * this.field4785[5] - this.field4785[13] * this.field4785[6] * this.field4785[8])) * var1;
		float var15 = (this.field4785[9] * this.field4785[0] * this.field4785[14] - this.field4785[13] * this.field4785[0] * this.field4785[10] - this.field4785[14] * this.field4785[1] * this.field4785[8] + this.field4785[10] * this.field4785[1] * this.field4785[12] + this.field4785[13] * this.field4785[8] * this.field4785[2] - this.field4785[12] * this.field4785[2] * this.field4785[9]) * var1;
		float var16 = var1 * (this.field4785[4] * this.field4785[1] * this.field4785[14] + this.field4785[14] * this.field4785[5] * -this.field4785[0] + this.field4785[0] * this.field4785[6] * this.field4785[13] - this.field4785[1] * this.field4785[6] * this.field4785[12] - this.field4785[2] * this.field4785[4] * this.field4785[13] + this.field4785[5] * this.field4785[2] * this.field4785[12]);
		float var17 = var1 * (this.field4785[4] * this.field4785[2] * this.field4785[9] + this.field4785[5] * this.field4785[0] * this.field4785[10] - this.field4785[9] * this.field4785[0] * this.field4785[6] - this.field4785[10] * this.field4785[4] * this.field4785[1] + this.field4785[8] * this.field4785[1] * this.field4785[6] - this.field4785[5] * this.field4785[2] * this.field4785[8]);
		this.field4785[0] = var2;
		this.field4785[1] = var3;
		this.field4785[2] = var4;
		this.field4785[3] = var5;
		this.field4785[4] = var6;
		this.field4785[5] = var7;
		this.field4785[6] = var8;
		this.field4785[7] = var9;
		this.field4785[8] = var10;
		this.field4785[9] = var11;
		this.field4785[10] = var12;
		this.field4785[11] = var13;
		this.field4785[12] = var14;
		this.field4785[13] = var15;
		this.field4785[14] = var16;
		this.field4785[15] = var17;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "1974456847"
	)
	public float[] method8348() {
		float[] var1 = new float[3];
		class463 var2 = new class463(this.field4785[0], this.field4785[1], this.field4785[2]);
		class463 var3 = new class463(this.field4785[4], this.field4785[5], this.field4785[6]);
		class463 var4 = new class463(this.field4785[8], this.field4785[9], this.field4785[10]);
		var1[0] = var2.method8309();
		var1[1] = var3.method8309();
		var1[2] = var4.method8309();
		return var1;
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method8353();
		this.method8402();

		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.field4785[var3 + var2 * 4];
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
		int var3 = var2 * 31 + Arrays.hashCode(this.field4785);
		return var3;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class465)) {
			return false;
		} else {
			class465 var2 = (class465)var1;

			for (int var3 = 0; var3 < 16; ++var3) {
				if (var2.field4785[var3] != this.field4785[var3]) {
					return false;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([BILjava/lang/CharSequence;B)I",
		garbageValue = "-72"
	)
	public static int method8410(byte[] var0, int var1, CharSequence var2) {
		int var3 = var2.length();
		int var4 = var1;

		for (int var5 = 0; var5 < var3; ++var5) {
			char var6 = var2.charAt(var5);
			if (var6 <= 127) {
				var0[var4++] = (byte)var6;
			} else if (var6 <= 2047) {
				var0[var4++] = (byte)(192 | var6 >> 6);
				var0[var4++] = (byte)(128 | var6 & '?');
			} else {
				var0[var4++] = (byte)(224 | var6 >> '\f');
				var0[var4++] = (byte)(128 | var6 >> 6 & 63);
				var0[var4++] = (byte)(128 | var6 & '?');
			}
		}

		return var4 - var1;
	}
}
