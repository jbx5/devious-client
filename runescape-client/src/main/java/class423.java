import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ql")
public final class class423 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lql;"
	)
	public static class423[] field4691;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1072253169
	)
	static int field4693;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	public static final class423 field4695;
	@ObfuscatedName("af")
	public float[] field4694;

	static {
		field4691 = new class423[0];
		class415.method7750(100);
		field4695 = new class423();
	}

	public class423() {
		this.field4694 = new float[16];
		this.method7884();
	}

	@ObfuscatedSignature(
		descriptor = "(Lql;)V"
	)
	public class423(class423 var1) {
		this.field4694 = new float[16];
		this.method7918(var1);
	}

	@ObfuscatedSignature(
		descriptor = "(Lua;Z)V"
	)
	public class423(Buffer var1, boolean var2) {
		this.field4694 = new float[16];
		this.method7844(var1, var2);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-94"
	)
	public void method7871() {
		synchronized(field4691) {
			if (AccessFile.field5239 < field4693 - 1) {
				field4691[++AccessFile.field5239 - 1] = this;
			}

		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lua;ZI)V",
		garbageValue = "2040678529"
	)
	void method7844(Buffer var1, boolean var2) {
		if (var2) {
			class424 var13 = new class424();
			int var6 = var1.readShort();
			var6 &= 16383;
			float var5 = (float)(6.283185307179586D * (double)((float)var6 / 16384.0F));
			var13.method7925(var5);
			int var9 = var1.readShort();
			var9 &= 16383;
			float var8 = (float)((double)((float)var9 / 16384.0F) * 6.283185307179586D);
			var13.method7926(var8);
			int var12 = var1.readShort();
			var12 &= 16383;
			float var11 = (float)((double)((float)var12 / 16384.0F) * 6.283185307179586D);
			var13.method7927(var11);
			var13.method7928((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort());
			this.method7919(var13);
		} else {
			for (int var3 = 0; var3 < 16; ++var3) {
				this.field4694[var3] = var1.method9665();
			}
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "1"
	)
	float[] method7845() {
		float[] var1 = new float[3];
		if ((double)this.field4694[2] < 0.999D && (double)this.field4694[2] > -0.999D) {
			var1[1] = (float)(-Math.asin((double)this.field4694[2]));
			double var2 = Math.cos((double)var1[1]);
			var1[0] = (float)Math.atan2((double)this.field4694[6] / var2, (double)this.field4694[10] / var2);
			var1[2] = (float)Math.atan2((double)this.field4694[1] / var2, (double)this.field4694[0] / var2);
		} else {
			var1[0] = 0.0F;
			var1[1] = (float)Math.atan2((double)this.field4694[2], 0.0D);
			var1[2] = (float)Math.atan2((double)(-this.field4694[9]), (double)this.field4694[5]);
		}

		return var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "-37"
	)
	public float[] method7846() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4694[6])), 0.0F, 0.0F};
		double var2 = Math.cos((double)var1[0]);
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) {
			var4 = (double)this.field4694[2];
			var6 = (double)this.field4694[10];
			double var8 = (double)this.field4694[4];
			double var10 = (double)this.field4694[5];
			var1[1] = (float)Math.atan2(var4, var6);
			var1[2] = (float)Math.atan2(var8, var10);
		} else {
			var4 = (double)this.field4694[1];
			var6 = (double)this.field4694[0];
			if (this.field4694[6] < 0.0F) {
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
		garbageValue = "105"
	)
	public void method7884() {
		this.field4694[0] = 1.0F;
		this.field4694[1] = 0.0F;
		this.field4694[2] = 0.0F;
		this.field4694[3] = 0.0F;
		this.field4694[4] = 0.0F;
		this.field4694[5] = 1.0F;
		this.field4694[6] = 0.0F;
		this.field4694[7] = 0.0F;
		this.field4694[8] = 0.0F;
		this.field4694[9] = 0.0F;
		this.field4694[10] = 1.0F;
		this.field4694[11] = 0.0F;
		this.field4694[12] = 0.0F;
		this.field4694[13] = 0.0F;
		this.field4694[14] = 0.0F;
		this.field4694[15] = 1.0F;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "28"
	)
	public void method7855() {
		this.field4694[0] = 0.0F;
		this.field4694[1] = 0.0F;
		this.field4694[2] = 0.0F;
		this.field4694[3] = 0.0F;
		this.field4694[4] = 0.0F;
		this.field4694[5] = 0.0F;
		this.field4694[6] = 0.0F;
		this.field4694[7] = 0.0F;
		this.field4694[8] = 0.0F;
		this.field4694[9] = 0.0F;
		this.field4694[10] = 0.0F;
		this.field4694[11] = 0.0F;
		this.field4694[12] = 0.0F;
		this.field4694[13] = 0.0F;
		this.field4694[14] = 0.0F;
		this.field4694[15] = 0.0F;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lql;B)V",
		garbageValue = "3"
	)
	public void method7918(class423 var1) {
		System.arraycopy(var1.field4694, 0, this.field4694, 0, 16);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "957478911"
	)
	public void method7850(float var1) {
		this.method7851(var1, var1, var1);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(FFFS)V",
		garbageValue = "-9579"
	)
	public void method7851(float var1, float var2, float var3) {
		this.method7884();
		this.field4694[0] = var1;
		this.field4694[5] = var2;
		this.field4694[10] = var3;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lql;B)V",
		garbageValue = "24"
	)
	public void method7852(class423 var1) {
		for (int var2 = 0; var2 < this.field4694.length; ++var2) {
			float[] var10000 = this.field4694;
			var10000[var2] += var1.field4694[var2];
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lql;I)V",
		garbageValue = "-504606065"
	)
	public void method7898(class423 var1) {
		float var2 = this.field4694[3] * var1.field4694[12] + var1.field4694[8] * this.field4694[2] + this.field4694[0] * var1.field4694[0] + var1.field4694[4] * this.field4694[1];
		float var3 = this.field4694[2] * var1.field4694[9] + this.field4694[1] * var1.field4694[5] + this.field4694[0] * var1.field4694[1] + var1.field4694[13] * this.field4694[3];
		float var4 = this.field4694[3] * var1.field4694[14] + var1.field4694[2] * this.field4694[0] + var1.field4694[6] * this.field4694[1] + var1.field4694[10] * this.field4694[2];
		float var5 = this.field4694[3] * var1.field4694[15] + this.field4694[2] * var1.field4694[11] + var1.field4694[7] * this.field4694[1] + this.field4694[0] * var1.field4694[3];
		float var6 = var1.field4694[8] * this.field4694[6] + this.field4694[5] * var1.field4694[4] + this.field4694[4] * var1.field4694[0] + var1.field4694[12] * this.field4694[7];
		float var7 = this.field4694[7] * var1.field4694[13] + this.field4694[6] * var1.field4694[9] + this.field4694[5] * var1.field4694[5] + this.field4694[4] * var1.field4694[1];
		float var8 = var1.field4694[14] * this.field4694[7] + var1.field4694[10] * this.field4694[6] + this.field4694[5] * var1.field4694[6] + this.field4694[4] * var1.field4694[2];
		float var9 = this.field4694[7] * var1.field4694[15] + this.field4694[6] * var1.field4694[11] + var1.field4694[7] * this.field4694[5] + var1.field4694[3] * this.field4694[4];
		float var10 = this.field4694[10] * var1.field4694[8] + this.field4694[9] * var1.field4694[4] + var1.field4694[0] * this.field4694[8] + var1.field4694[12] * this.field4694[11];
		float var11 = var1.field4694[13] * this.field4694[11] + this.field4694[8] * var1.field4694[1] + this.field4694[9] * var1.field4694[5] + var1.field4694[9] * this.field4694[10];
		float var12 = var1.field4694[14] * this.field4694[11] + this.field4694[9] * var1.field4694[6] + this.field4694[8] * var1.field4694[2] + this.field4694[10] * var1.field4694[10];
		float var13 = var1.field4694[11] * this.field4694[10] + this.field4694[9] * var1.field4694[7] + this.field4694[8] * var1.field4694[3] + this.field4694[11] * var1.field4694[15];
		float var14 = var1.field4694[8] * this.field4694[14] + this.field4694[12] * var1.field4694[0] + this.field4694[13] * var1.field4694[4] + var1.field4694[12] * this.field4694[15];
		float var15 = var1.field4694[9] * this.field4694[14] + this.field4694[13] * var1.field4694[5] + this.field4694[12] * var1.field4694[1] + this.field4694[15] * var1.field4694[13];
		float var16 = this.field4694[15] * var1.field4694[14] + var1.field4694[6] * this.field4694[13] + this.field4694[12] * var1.field4694[2] + this.field4694[14] * var1.field4694[10];
		float var17 = var1.field4694[11] * this.field4694[14] + this.field4694[12] * var1.field4694[3] + this.field4694[13] * var1.field4694[7] + this.field4694[15] * var1.field4694[15];
		this.field4694[0] = var2;
		this.field4694[1] = var3;
		this.field4694[2] = var4;
		this.field4694[3] = var5;
		this.field4694[4] = var6;
		this.field4694[5] = var7;
		this.field4694[6] = var8;
		this.field4694[7] = var9;
		this.field4694[8] = var10;
		this.field4694[9] = var11;
		this.field4694[10] = var12;
		this.field4694[11] = var13;
		this.field4694[12] = var14;
		this.field4694[13] = var15;
		this.field4694[14] = var16;
		this.field4694[15] = var17;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lqd;I)V",
		garbageValue = "-568095839"
	)
	public void method7860(class417 var1) {
		float var2 = var1.field4667.field4685 * var1.field4667.field4685;
		float var3 = var1.field4667.field4685 * var1.field4667.field4687;
		float var4 = var1.field4667.field4684 * var1.field4667.field4685;
		float var5 = var1.field4667.field4689 * var1.field4667.field4685;
		float var6 = var1.field4667.field4687 * var1.field4667.field4687;
		float var7 = var1.field4667.field4684 * var1.field4667.field4687;
		float var8 = var1.field4667.field4689 * var1.field4667.field4687;
		float var9 = var1.field4667.field4684 * var1.field4667.field4684;
		float var10 = var1.field4667.field4689 * var1.field4667.field4684;
		float var11 = var1.field4667.field4689 * var1.field4667.field4689;
		this.field4694[0] = var2 + var6 - var11 - var9;
		this.field4694[1] = var5 + var7 + var5 + var7;
		this.field4694[2] = var8 - var4 - var4 + var8;
		this.field4694[4] = var7 - var5 - var5 + var7;
		this.field4694[5] = var2 + var9 - var6 - var11;
		this.field4694[6] = var10 + var10 + var3 + var3;
		this.field4694[8] = var8 + var8 + var4 + var4;
		this.field4694[9] = var10 - var3 - var3 + var10;
		this.field4694[10] = var2 + var11 - var9 - var6;
		float[] var12 = this.field4694;
		float[] var13 = this.field4694;
		this.field4694[11] = 0.0F;
		var13[7] = 0.0F;
		var12[3] = 0.0F;
		this.field4694[12] = var1.field4668.field4683;
		this.field4694[13] = var1.field4668.field4680;
		this.field4694[14] = var1.field4668.field4681;
		this.field4694[15] = 1.0F;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lqz;I)V",
		garbageValue = "-2062673507"
	)
	public void method7847(class422 var1) {
		float var2 = var1.field4685 * var1.field4685;
		float var3 = var1.field4687 * var1.field4685;
		float var4 = var1.field4684 * var1.field4685;
		float var5 = var1.field4689 * var1.field4685;
		float var6 = var1.field4687 * var1.field4687;
		float var7 = var1.field4687 * var1.field4684;
		float var8 = var1.field4689 * var1.field4687;
		float var9 = var1.field4684 * var1.field4684;
		float var10 = var1.field4689 * var1.field4684;
		float var11 = var1.field4689 * var1.field4689;
		this.field4694[0] = var6 + var2 - var11 - var9;
		this.field4694[1] = var7 + var5 + var7 + var5;
		this.field4694[2] = var8 + (var8 - var4 - var4);
		this.field4694[4] = var7 - var5 - var5 + var7;
		this.field4694[5] = var9 + var2 - var6 - var11;
		this.field4694[6] = var10 + var3 + var10 + var3;
		this.field4694[8] = var8 + var8 + var4 + var4;
		this.field4694[9] = var10 + (var10 - var3 - var3);
		this.field4694[10] = var2 + var11 - var9 - var6;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lqx;I)V",
		garbageValue = "-1194566833"
	)
	public void method7919(class424 var1) {
		this.field4694[0] = var1.field4700;
		this.field4694[1] = var1.field4708;
		this.field4694[2] = var1.field4697;
		this.field4694[3] = 0.0F;
		this.field4694[4] = var1.field4699;
		this.field4694[5] = var1.field4701;
		this.field4694[6] = var1.field4702;
		this.field4694[7] = 0.0F;
		this.field4694[8] = var1.field4703;
		this.field4694[9] = var1.field4704;
		this.field4694[10] = var1.field4705;
		this.field4694[11] = 0.0F;
		this.field4694[12] = var1.field4706;
		this.field4694[13] = var1.field4707;
		this.field4694[14] = var1.field4698;
		this.field4694[15] = 1.0F;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "1"
	)
	float method7857() {
		return this.field4694[8] * this.field4694[5] * this.field4694[3] * this.field4694[14] + this.field4694[7] * this.field4694[2] * this.field4694[8] * this.field4694[13] + this.field4694[11] * this.field4694[2] * this.field4694[5] * this.field4694[12] + (this.field4694[12] * this.field4694[1] * this.field4694[7] * this.field4694[10] + (this.field4694[6] * this.field4694[0] * this.field4694[11] * this.field4694[13] + (this.field4694[0] * this.field4694[5] * this.field4694[10] * this.field4694[15] - this.field4694[5] * this.field4694[0] * this.field4694[11] * this.field4694[14] - this.field4694[15] * this.field4694[6] * this.field4694[0] * this.field4694[9]) + this.field4694[9] * this.field4694[0] * this.field4694[7] * this.field4694[14] - this.field4694[13] * this.field4694[7] * this.field4694[0] * this.field4694[10] - this.field4694[15] * this.field4694[4] * this.field4694[1] * this.field4694[10] + this.field4694[1] * this.field4694[4] * this.field4694[11] * this.field4694[14] + this.field4694[8] * this.field4694[1] * this.field4694[6] * this.field4694[15] - this.field4694[12] * this.field4694[11] * this.field4694[6] * this.field4694[1] - this.field4694[14] * this.field4694[7] * this.field4694[1] * this.field4694[8]) + this.field4694[9] * this.field4694[2] * this.field4694[4] * this.field4694[15] - this.field4694[11] * this.field4694[4] * this.field4694[2] * this.field4694[13] - this.field4694[15] * this.field4694[8] * this.field4694[5] * this.field4694[2]) - this.field4694[2] * this.field4694[7] * this.field4694[9] * this.field4694[12] - this.field4694[14] * this.field4694[3] * this.field4694[4] * this.field4694[9] + this.field4694[13] * this.field4694[3] * this.field4694[4] * this.field4694[10] - this.field4694[12] * this.field4694[3] * this.field4694[5] * this.field4694[10] - this.field4694[13] * this.field4694[8] * this.field4694[6] * this.field4694[3] + this.field4694[12] * this.field4694[9] * this.field4694[6] * this.field4694[3];
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1794061155"
	)
	public void method7864() {
		float var1 = 1.0F / this.method7857();
		float var2 = (this.field4694[14] * this.field4694[7] * this.field4694[9] + this.field4694[13] * this.field4694[11] * this.field4694[6] + (this.field4694[10] * this.field4694[5] * this.field4694[15] - this.field4694[11] * this.field4694[5] * this.field4694[14] - this.field4694[15] * this.field4694[6] * this.field4694[9]) - this.field4694[13] * this.field4694[7] * this.field4694[10]) * var1;
		float var3 = var1 * (this.field4694[2] * this.field4694[9] * this.field4694[15] + this.field4694[14] * this.field4694[1] * this.field4694[11] + -this.field4694[1] * this.field4694[10] * this.field4694[15] - this.field4694[11] * this.field4694[2] * this.field4694[13] - this.field4694[3] * this.field4694[9] * this.field4694[14] + this.field4694[13] * this.field4694[10] * this.field4694[3]);
		float var4 = var1 * (this.field4694[14] * this.field4694[5] * this.field4694[3] + this.field4694[13] * this.field4694[2] * this.field4694[7] + (this.field4694[1] * this.field4694[6] * this.field4694[15] - this.field4694[14] * this.field4694[7] * this.field4694[1] - this.field4694[15] * this.field4694[5] * this.field4694[2]) - this.field4694[13] * this.field4694[6] * this.field4694[3]);
		float var5 = var1 * (this.field4694[9] * this.field4694[3] * this.field4694[6] + (this.field4694[11] * this.field4694[2] * this.field4694[5] + this.field4694[7] * this.field4694[1] * this.field4694[10] + this.field4694[6] * -this.field4694[1] * this.field4694[11] - this.field4694[9] * this.field4694[2] * this.field4694[7] - this.field4694[3] * this.field4694[5] * this.field4694[10]));
		float var6 = var1 * (this.field4694[15] * this.field4694[10] * -this.field4694[4] + this.field4694[14] * this.field4694[11] * this.field4694[4] + this.field4694[8] * this.field4694[6] * this.field4694[15] - this.field4694[6] * this.field4694[11] * this.field4694[12] - this.field4694[14] * this.field4694[8] * this.field4694[7] + this.field4694[7] * this.field4694[10] * this.field4694[12]);
		float var7 = (this.field4694[2] * this.field4694[11] * this.field4694[12] + (this.field4694[15] * this.field4694[10] * this.field4694[0] - this.field4694[14] * this.field4694[11] * this.field4694[0] - this.field4694[15] * this.field4694[2] * this.field4694[8]) + this.field4694[3] * this.field4694[8] * this.field4694[14] - this.field4694[10] * this.field4694[3] * this.field4694[12]) * var1;
		float var8 = var1 * (this.field4694[15] * this.field4694[2] * this.field4694[4] + -this.field4694[0] * this.field4694[6] * this.field4694[15] + this.field4694[14] * this.field4694[0] * this.field4694[7] - this.field4694[12] * this.field4694[7] * this.field4694[2] - this.field4694[3] * this.field4694[4] * this.field4694[14] + this.field4694[12] * this.field4694[3] * this.field4694[6]);
		float var9 = (this.field4694[10] * this.field4694[3] * this.field4694[4] + this.field4694[6] * this.field4694[0] * this.field4694[11] - this.field4694[0] * this.field4694[7] * this.field4694[10] - this.field4694[4] * this.field4694[2] * this.field4694[11] + this.field4694[2] * this.field4694[7] * this.field4694[8] - this.field4694[6] * this.field4694[3] * this.field4694[8]) * var1;
		float var10 = var1 * (this.field4694[7] * this.field4694[8] * this.field4694[13] + this.field4694[5] * this.field4694[11] * this.field4694[12] + (this.field4694[15] * this.field4694[4] * this.field4694[9] - this.field4694[4] * this.field4694[11] * this.field4694[13] - this.field4694[15] * this.field4694[8] * this.field4694[5]) - this.field4694[12] * this.field4694[7] * this.field4694[9]);
		float var11 = (this.field4694[1] * this.field4694[8] * this.field4694[15] + this.field4694[13] * this.field4694[11] * this.field4694[0] + this.field4694[15] * -this.field4694[0] * this.field4694[9] - this.field4694[12] * this.field4694[11] * this.field4694[1] - this.field4694[13] * this.field4694[3] * this.field4694[8] + this.field4694[12] * this.field4694[3] * this.field4694[9]) * var1;
		float var12 = var1 * (this.field4694[7] * this.field4694[1] * this.field4694[12] + (this.field4694[15] * this.field4694[5] * this.field4694[0] - this.field4694[13] * this.field4694[7] * this.field4694[0] - this.field4694[15] * this.field4694[1] * this.field4694[4]) + this.field4694[3] * this.field4694[4] * this.field4694[13] - this.field4694[3] * this.field4694[5] * this.field4694[12]);
		float var13 = (this.field4694[11] * this.field4694[1] * this.field4694[4] + this.field4694[11] * this.field4694[5] * -this.field4694[0] + this.field4694[0] * this.field4694[7] * this.field4694[9] - this.field4694[8] * this.field4694[7] * this.field4694[1] - this.field4694[9] * this.field4694[4] * this.field4694[3] + this.field4694[8] * this.field4694[5] * this.field4694[3]) * var1;
		float var14 = (this.field4694[12] * this.field4694[9] * this.field4694[6] + (-this.field4694[4] * this.field4694[9] * this.field4694[14] + this.field4694[10] * this.field4694[4] * this.field4694[13] + this.field4694[8] * this.field4694[5] * this.field4694[14] - this.field4694[12] * this.field4694[10] * this.field4694[5] - this.field4694[13] * this.field4694[6] * this.field4694[8])) * var1;
		float var15 = var1 * (this.field4694[12] * this.field4694[1] * this.field4694[10] + (this.field4694[14] * this.field4694[0] * this.field4694[9] - this.field4694[0] * this.field4694[10] * this.field4694[13] - this.field4694[1] * this.field4694[8] * this.field4694[14]) + this.field4694[13] * this.field4694[8] * this.field4694[2] - this.field4694[2] * this.field4694[9] * this.field4694[12]);
		float var16 = (this.field4694[6] * this.field4694[0] * this.field4694[13] + this.field4694[14] * -this.field4694[0] * this.field4694[5] + this.field4694[4] * this.field4694[1] * this.field4694[14] - this.field4694[12] * this.field4694[6] * this.field4694[1] - this.field4694[2] * this.field4694[4] * this.field4694[13] + this.field4694[5] * this.field4694[2] * this.field4694[12]) * var1;
		float var17 = var1 * (this.field4694[6] * this.field4694[1] * this.field4694[8] + (this.field4694[0] * this.field4694[5] * this.field4694[10] - this.field4694[9] * this.field4694[0] * this.field4694[6] - this.field4694[10] * this.field4694[1] * this.field4694[4]) + this.field4694[9] * this.field4694[4] * this.field4694[2] - this.field4694[2] * this.field4694[5] * this.field4694[8]);
		this.field4694[0] = var2;
		this.field4694[1] = var3;
		this.field4694[2] = var4;
		this.field4694[3] = var5;
		this.field4694[4] = var6;
		this.field4694[5] = var7;
		this.field4694[6] = var8;
		this.field4694[7] = var9;
		this.field4694[8] = var10;
		this.field4694[9] = var11;
		this.field4694[10] = var12;
		this.field4694[11] = var13;
		this.field4694[12] = var14;
		this.field4694[13] = var15;
		this.field4694[14] = var16;
		this.field4694[15] = var17;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "-1717168123"
	)
	public void method7859(float var1, float var2, float var3, float var4) {
		this.field4694[0] = var1;
		this.field4694[1] = 0.0F;
		this.field4694[2] = 0.0F;
		this.field4694[3] = 0.0F;
		this.field4694[4] = 0.0F;
		this.field4694[5] = var2;
		this.field4694[6] = 0.0F;
		this.field4694[7] = 0.0F;
		this.field4694[8] = 0.0F;
		this.field4694[9] = 0.0F;
		this.field4694[10] = var3;
		this.field4694[11] = 0.0F;
		this.field4694[12] = 0.0F;
		this.field4694[13] = 0.0F;
		this.field4694[14] = 0.0F;
		this.field4694[15] = var4;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(FFF[FI)V",
		garbageValue = "-549124523"
	)
	public void method7867(float var1, float var2, float var3, float[] var4) {
		var4[0] = var1 * this.field4694[0] + var2 * this.field4694[4] + var3 * this.field4694[8] + this.field4694[12];
		var4[1] = this.field4694[13] + var3 * this.field4694[9] + this.field4694[5] * var2 + var1 * this.field4694[1];
		var4[2] = this.field4694[14] + var1 * this.field4694[2] + this.field4694[6] * var2 + var3 * this.field4694[10];
		if (var4.length > 3) {
			var4[3] = var2 * this.field4694[7] + var1 * this.field4694[3] + var3 * this.field4694[11] + this.field4694[15];
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(FFFI)F",
		garbageValue = "-1443825046"
	)
	public float method7877(float var1, float var2, float var3) {
		return var2 * this.field4694[4] + var1 * this.field4694[0] + var3 * this.field4694[8] + this.field4694[12];
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(FFFI)F",
		garbageValue = "-2094429859"
	)
	public float method7861(float var1, float var2, float var3) {
		return this.field4694[13] + this.field4694[5] * var2 + var1 * this.field4694[1] + this.field4694[9] * var3;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(FFFB)F",
		garbageValue = "5"
	)
	public float method7863(float var1, float var2, float var3) {
		return this.field4694[10] * var3 + this.field4694[6] * var2 + this.field4694[2] * var1 + this.field4694[14];
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "-122"
	)
	public float[] method7865() {
		float[] var1 = new float[3];
		class421 var2 = new class421(this.field4694[0], this.field4694[1], this.field4694[2]);
		class421 var3 = new class421(this.field4694[4], this.field4694[5], this.field4694[6]);
		class421 var4 = new class421(this.field4694[8], this.field4694[9], this.field4694[10]);
		var1[0] = var2.method7799();
		var1[1] = var3.method7799();
		var1[2] = var4.method7799();
		return var1;
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method7846();
		this.method7845();

		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.field4694[var3 + var2 * 4];
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
		int var3 = var2 * 31 + Arrays.hashCode(this.field4694);
		return var3;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class423)) {
			return false;
		} else {
			class423 var2 = (class423)var1;

			for (int var3 = 0; var3 < 16; ++var3) {
				if (this.field4694[var3] != var2.field4694[var3]) {
					return false;
				}
			}

			return true;
		}
	}
}
