import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qg")
public final class class424 {
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[Lqg;"
	)
	public static class424[] field4704;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1373796869
	)
	static int field4705;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1620544593
	)
	public static int field4706;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	public static final class424 field4707;
	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field4703;
	@ObfuscatedName("ap")
	public float[] field4709;

	static {
		field4704 = new class424[0];
		FaceNormal.method5685(100);
		field4707 = new class424();
	}

	public class424() {
		this.field4709 = new float[16];
		this.method7789();
	}

	@ObfuscatedSignature(
		descriptor = "(Lqg;)V"
	)
	public class424(class424 var1) {
		this.field4709 = new float[16];
		this.method7809(var1);
	}

	@ObfuscatedSignature(
		descriptor = "(Lvp;Z)V"
	)
	public class424(Buffer var1, boolean var2) {
		this.field4709 = new float[16];
		this.method7777(var1, var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1696304839"
	)
	public void method7801() {
		synchronized(field4704) {
			if (field4706 < field4705 - 1) {
				field4704[++field4706 - 1] = this;
			}

		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvp;ZI)V",
		garbageValue = "1801643449"
	)
	void method7777(Buffer var1, boolean var2) {
		if (var2) {
			class425 var13 = new class425();
			int var6 = var1.readShort();
			var6 &= 16383;
			float var5 = (float)((double)((float)var6 / 16384.0F) * 6.283185307179586D);
			var13.method7861(var5);
			int var9 = var1.readShort();
			var9 &= 16383;
			float var8 = (float)(6.283185307179586D * (double)((float)var9 / 16384.0F));
			var13.method7871(var8);
			int var12 = var1.readShort();
			var12 &= 16383;
			float var11 = (float)(6.283185307179586D * (double)((float)var12 / 16384.0F));
			var13.method7863(var11);
			var13.method7864((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort());
			this.method7788(var13);
		} else {
			for (int var3 = 0; var3 < 16; ++var3) {
				this.field4709[var3] = var1.method9565();
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "425158414"
	)
	float[] method7778() {
		float[] var1 = new float[3];
		if ((double)this.field4709[2] < 0.999D && (double)this.field4709[2] > -0.999D) {
			var1[1] = (float)(-Math.asin((double)this.field4709[2]));
			double var2 = Math.cos((double)var1[1]);
			var1[0] = (float)Math.atan2((double)this.field4709[6] / var2, (double)this.field4709[10] / var2);
			var1[2] = (float)Math.atan2((double)this.field4709[1] / var2, (double)this.field4709[0] / var2);
		} else {
			var1[0] = 0.0F;
			var1[1] = (float)Math.atan2((double)this.field4709[2], 0.0D);
			var1[2] = (float)Math.atan2((double)(-this.field4709[9]), (double)this.field4709[5]);
		}

		return var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-1983045784"
	)
	public float[] method7779() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4709[6])), 0.0F, 0.0F};
		double var2 = Math.cos((double)var1[0]);
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) {
			var4 = (double)this.field4709[2];
			var6 = (double)this.field4709[10];
			double var8 = (double)this.field4709[4];
			double var10 = (double)this.field4709[5];
			var1[1] = (float)Math.atan2(var4, var6);
			var1[2] = (float)Math.atan2(var8, var10);
		} else {
			var4 = (double)this.field4709[1];
			var6 = (double)this.field4709[0];
			if (this.field4709[6] < 0.0F) {
				var1[1] = (float)Math.atan2(var4, var6);
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6));
			}

			var1[2] = 0.0F;
		}

		return var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2101209059"
	)
	public void method7789() {
		this.field4709[0] = 1.0F;
		this.field4709[1] = 0.0F;
		this.field4709[2] = 0.0F;
		this.field4709[3] = 0.0F;
		this.field4709[4] = 0.0F;
		this.field4709[5] = 1.0F;
		this.field4709[6] = 0.0F;
		this.field4709[7] = 0.0F;
		this.field4709[8] = 0.0F;
		this.field4709[9] = 0.0F;
		this.field4709[10] = 1.0F;
		this.field4709[11] = 0.0F;
		this.field4709[12] = 0.0F;
		this.field4709[13] = 0.0F;
		this.field4709[14] = 0.0F;
		this.field4709[15] = 1.0F;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1044154901"
	)
	public void method7781() {
		this.field4709[0] = 0.0F;
		this.field4709[1] = 0.0F;
		this.field4709[2] = 0.0F;
		this.field4709[3] = 0.0F;
		this.field4709[4] = 0.0F;
		this.field4709[5] = 0.0F;
		this.field4709[6] = 0.0F;
		this.field4709[7] = 0.0F;
		this.field4709[8] = 0.0F;
		this.field4709[9] = 0.0F;
		this.field4709[10] = 0.0F;
		this.field4709[11] = 0.0F;
		this.field4709[12] = 0.0F;
		this.field4709[13] = 0.0F;
		this.field4709[14] = 0.0F;
		this.field4709[15] = 0.0F;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lqg;B)V",
		garbageValue = "70"
	)
	public void method7809(class424 var1) {
		System.arraycopy(var1.field4709, 0, this.field4709, 0, 16);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "-21"
	)
	public void method7783(float var1) {
		this.method7804(var1, var1, var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(FFFB)V",
		garbageValue = "0"
	)
	public void method7804(float var1, float var2, float var3) {
		this.method7789();
		this.field4709[0] = var1;
		this.field4709[5] = var2;
		this.field4709[10] = var3;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lqg;I)V",
		garbageValue = "-746584732"
	)
	public void method7782(class424 var1) {
		for (int var2 = 0; var2 < this.field4709.length; ++var2) {
			float[] var10000 = this.field4709;
			var10000[var2] += var1.field4709[var2];
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lqg;I)V",
		garbageValue = "-578486569"
	)
	public void method7785(class424 var1) {
		float var2 = this.field4709[0] * var1.field4709[0] + this.field4709[1] * var1.field4709[4] + var1.field4709[8] * this.field4709[2] + this.field4709[3] * var1.field4709[12];
		float var3 = this.field4709[3] * var1.field4709[13] + var1.field4709[5] * this.field4709[1] + var1.field4709[1] * this.field4709[0] + var1.field4709[9] * this.field4709[2];
		float var4 = var1.field4709[2] * this.field4709[0] + this.field4709[1] * var1.field4709[6] + this.field4709[2] * var1.field4709[10] + var1.field4709[14] * this.field4709[3];
		float var5 = var1.field4709[3] * this.field4709[0] + var1.field4709[7] * this.field4709[1] + var1.field4709[11] * this.field4709[2] + var1.field4709[15] * this.field4709[3];
		float var6 = this.field4709[6] * var1.field4709[8] + var1.field4709[0] * this.field4709[4] + var1.field4709[4] * this.field4709[5] + this.field4709[7] * var1.field4709[12];
		float var7 = var1.field4709[13] * this.field4709[7] + this.field4709[6] * var1.field4709[9] + var1.field4709[5] * this.field4709[5] + var1.field4709[1] * this.field4709[4];
		float var8 = this.field4709[7] * var1.field4709[14] + var1.field4709[10] * this.field4709[6] + this.field4709[5] * var1.field4709[6] + this.field4709[4] * var1.field4709[2];
		float var9 = this.field4709[7] * var1.field4709[15] + this.field4709[5] * var1.field4709[7] + var1.field4709[3] * this.field4709[4] + var1.field4709[11] * this.field4709[6];
		float var10 = this.field4709[10] * var1.field4709[8] + var1.field4709[0] * this.field4709[8] + var1.field4709[4] * this.field4709[9] + var1.field4709[12] * this.field4709[11];
		float var11 = var1.field4709[9] * this.field4709[10] + this.field4709[8] * var1.field4709[1] + var1.field4709[5] * this.field4709[9] + this.field4709[11] * var1.field4709[13];
		float var12 = var1.field4709[10] * this.field4709[10] + var1.field4709[6] * this.field4709[9] + this.field4709[8] * var1.field4709[2] + var1.field4709[14] * this.field4709[11];
		float var13 = this.field4709[11] * var1.field4709[15] + var1.field4709[7] * this.field4709[9] + var1.field4709[3] * this.field4709[8] + var1.field4709[11] * this.field4709[10];
		float var14 = var1.field4709[8] * this.field4709[14] + var1.field4709[0] * this.field4709[12] + var1.field4709[4] * this.field4709[13] + this.field4709[15] * var1.field4709[12];
		float var15 = this.field4709[14] * var1.field4709[9] + var1.field4709[1] * this.field4709[12] + var1.field4709[5] * this.field4709[13] + this.field4709[15] * var1.field4709[13];
		float var16 = var1.field4709[14] * this.field4709[15] + this.field4709[14] * var1.field4709[10] + this.field4709[13] * var1.field4709[6] + this.field4709[12] * var1.field4709[2];
		float var17 = var1.field4709[15] * this.field4709[15] + this.field4709[14] * var1.field4709[11] + var1.field4709[7] * this.field4709[13] + this.field4709[12] * var1.field4709[3];
		this.field4709[0] = var2;
		this.field4709[1] = var3;
		this.field4709[2] = var4;
		this.field4709[3] = var5;
		this.field4709[4] = var6;
		this.field4709[5] = var7;
		this.field4709[6] = var8;
		this.field4709[7] = var9;
		this.field4709[8] = var10;
		this.field4709[9] = var11;
		this.field4709[10] = var12;
		this.field4709[11] = var13;
		this.field4709[12] = var14;
		this.field4709[13] = var15;
		this.field4709[14] = var16;
		this.field4709[15] = var17;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lqe;B)V",
		garbageValue = "0"
	)
	public void method7786(class418 var1) {
		float var2 = var1.field4681.field4702 * var1.field4681.field4702;
		float var3 = var1.field4681.field4702 * var1.field4681.field4699;
		float var4 = var1.field4681.field4700 * var1.field4681.field4702;
		float var5 = var1.field4681.field4702 * var1.field4681.field4696;
		float var6 = var1.field4681.field4699 * var1.field4681.field4699;
		float var7 = var1.field4681.field4700 * var1.field4681.field4699;
		float var8 = var1.field4681.field4696 * var1.field4681.field4699;
		float var9 = var1.field4681.field4700 * var1.field4681.field4700;
		float var10 = var1.field4681.field4696 * var1.field4681.field4700;
		float var11 = var1.field4681.field4696 * var1.field4681.field4696;
		this.field4709[0] = var6 + var2 - var11 - var9;
		this.field4709[1] = var5 + var7 + var5 + var7;
		this.field4709[2] = var8 - var4 - var4 + var8;
		this.field4709[4] = var7 + (var7 - var5 - var5);
		this.field4709[5] = var9 + var2 - var6 - var11;
		this.field4709[6] = var3 + var10 + var10 + var3;
		this.field4709[8] = var4 + var4 + var8 + var8;
		this.field4709[9] = var10 - var3 - var3 + var10;
		this.field4709[10] = var11 + var2 - var9 - var6;
		float[] var12 = this.field4709;
		float[] var13 = this.field4709;
		this.field4709[11] = 0.0F;
		var13[7] = 0.0F;
		var12[3] = 0.0F;
		this.field4709[12] = var1.field4682.field4695;
		this.field4709[13] = var1.field4682.field4692;
		this.field4709[14] = var1.field4682.field4693;
		this.field4709[15] = 1.0F;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lqi;I)V",
		garbageValue = "2094394353"
	)
	public void method7797(class423 var1) {
		float var2 = var1.field4702 * var1.field4702;
		float var3 = var1.field4702 * var1.field4699;
		float var4 = var1.field4700 * var1.field4702;
		float var5 = var1.field4696 * var1.field4702;
		float var6 = var1.field4699 * var1.field4699;
		float var7 = var1.field4699 * var1.field4700;
		float var8 = var1.field4699 * var1.field4696;
		float var9 = var1.field4700 * var1.field4700;
		float var10 = var1.field4696 * var1.field4700;
		float var11 = var1.field4696 * var1.field4696;
		this.field4709[0] = var2 + var6 - var11 - var9;
		this.field4709[1] = var7 + var7 + var5 + var5;
		this.field4709[2] = var8 + (var8 - var4 - var4);
		this.field4709[4] = var7 + (var7 - var5 - var5);
		this.field4709[5] = var9 + var2 - var6 - var11;
		this.field4709[6] = var3 + var10 + var3 + var10;
		this.field4709[8] = var8 + var8 + var4 + var4;
		this.field4709[9] = var10 - var3 - var3 + var10;
		this.field4709[10] = var2 + var11 - var9 - var6;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lqx;B)V",
		garbageValue = "4"
	)
	public void method7788(class425 var1) {
		this.field4709[0] = var1.field4711;
		this.field4709[1] = var1.field4710;
		this.field4709[2] = var1.field4712;
		this.field4709[3] = 0.0F;
		this.field4709[4] = var1.field4713;
		this.field4709[5] = var1.field4714;
		this.field4709[6] = var1.field4715;
		this.field4709[7] = 0.0F;
		this.field4709[8] = var1.field4719;
		this.field4709[9] = var1.field4717;
		this.field4709[10] = var1.field4716;
		this.field4709[11] = 0.0F;
		this.field4709[12] = var1.field4720;
		this.field4709[13] = var1.field4718;
		this.field4709[14] = var1.field4721;
		this.field4709[15] = 1.0F;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "-1547223641"
	)
	float method7839() {
		return this.field4709[14] * this.field4709[8] * this.field4709[5] * this.field4709[3] + this.field4709[7] * this.field4709[2] * this.field4709[8] * this.field4709[13] + this.field4709[12] * this.field4709[2] * this.field4709[5] * this.field4709[11] + (this.field4709[4] * this.field4709[2] * this.field4709[9] * this.field4709[15] + this.field4709[12] * this.field4709[10] * this.field4709[1] * this.field4709[7] + (this.field4709[14] * this.field4709[9] * this.field4709[7] * this.field4709[0] + this.field4709[0] * this.field4709[5] * this.field4709[10] * this.field4709[15] - this.field4709[14] * this.field4709[11] * this.field4709[0] * this.field4709[5] - this.field4709[15] * this.field4709[9] * this.field4709[6] * this.field4709[0] + this.field4709[6] * this.field4709[0] * this.field4709[11] * this.field4709[13] - this.field4709[13] * this.field4709[10] * this.field4709[0] * this.field4709[7] - this.field4709[15] * this.field4709[4] * this.field4709[1] * this.field4709[10] + this.field4709[4] * this.field4709[1] * this.field4709[11] * this.field4709[14] + this.field4709[15] * this.field4709[8] * this.field4709[6] * this.field4709[1] - this.field4709[12] * this.field4709[11] * this.field4709[1] * this.field4709[6] - this.field4709[1] * this.field4709[7] * this.field4709[8] * this.field4709[14]) - this.field4709[13] * this.field4709[11] * this.field4709[2] * this.field4709[4] - this.field4709[15] * this.field4709[5] * this.field4709[2] * this.field4709[8]) - this.field4709[12] * this.field4709[2] * this.field4709[7] * this.field4709[9] - this.field4709[4] * this.field4709[3] * this.field4709[9] * this.field4709[14] + this.field4709[4] * this.field4709[3] * this.field4709[10] * this.field4709[13] - this.field4709[10] * this.field4709[3] * this.field4709[5] * this.field4709[12] - this.field4709[3] * this.field4709[6] * this.field4709[8] * this.field4709[13] + this.field4709[12] * this.field4709[6] * this.field4709[3] * this.field4709[9];
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1366817561"
	)
	public void method7790() {
		float var1 = 1.0F / this.method7839();
		float var2 = var1 * (this.field4709[7] * this.field4709[9] * this.field4709[14] + this.field4709[15] * this.field4709[5] * this.field4709[10] - this.field4709[11] * this.field4709[5] * this.field4709[14] - this.field4709[9] * this.field4709[6] * this.field4709[15] + this.field4709[11] * this.field4709[6] * this.field4709[13] - this.field4709[13] * this.field4709[10] * this.field4709[7]);
		float var3 = (this.field4709[15] * this.field4709[2] * this.field4709[9] + this.field4709[11] * this.field4709[1] * this.field4709[14] + this.field4709[15] * this.field4709[10] * -this.field4709[1] - this.field4709[13] * this.field4709[2] * this.field4709[11] - this.field4709[14] * this.field4709[9] * this.field4709[3] + this.field4709[3] * this.field4709[10] * this.field4709[13]) * var1;
		float var4 = var1 * (this.field4709[13] * this.field4709[2] * this.field4709[7] + (this.field4709[1] * this.field4709[6] * this.field4709[15] - this.field4709[14] * this.field4709[1] * this.field4709[7] - this.field4709[15] * this.field4709[5] * this.field4709[2]) + this.field4709[3] * this.field4709[5] * this.field4709[14] - this.field4709[13] * this.field4709[6] * this.field4709[3]);
		float var5 = (this.field4709[3] * this.field4709[6] * this.field4709[9] + (this.field4709[7] * this.field4709[1] * this.field4709[10] + this.field4709[6] * -this.field4709[1] * this.field4709[11] + this.field4709[2] * this.field4709[5] * this.field4709[11] - this.field4709[9] * this.field4709[7] * this.field4709[2] - this.field4709[5] * this.field4709[3] * this.field4709[10])) * var1;
		float var6 = (this.field4709[10] * -this.field4709[4] * this.field4709[15] + this.field4709[4] * this.field4709[11] * this.field4709[14] + this.field4709[15] * this.field4709[6] * this.field4709[8] - this.field4709[11] * this.field4709[6] * this.field4709[12] - this.field4709[7] * this.field4709[8] * this.field4709[14] + this.field4709[12] * this.field4709[10] * this.field4709[7]) * var1;
		float var7 = var1 * (this.field4709[14] * this.field4709[8] * this.field4709[3] + this.field4709[15] * this.field4709[0] * this.field4709[10] - this.field4709[14] * this.field4709[0] * this.field4709[11] - this.field4709[15] * this.field4709[8] * this.field4709[2] + this.field4709[12] * this.field4709[11] * this.field4709[2] - this.field4709[10] * this.field4709[3] * this.field4709[12]);
		float var8 = (this.field4709[14] * this.field4709[0] * this.field4709[7] + -this.field4709[0] * this.field4709[6] * this.field4709[15] + this.field4709[4] * this.field4709[2] * this.field4709[15] - this.field4709[12] * this.field4709[7] * this.field4709[2] - this.field4709[4] * this.field4709[3] * this.field4709[14] + this.field4709[6] * this.field4709[3] * this.field4709[12]) * var1;
		float var9 = var1 * (this.field4709[4] * this.field4709[3] * this.field4709[10] + this.field4709[8] * this.field4709[7] * this.field4709[2] + (this.field4709[11] * this.field4709[0] * this.field4709[6] - this.field4709[7] * this.field4709[0] * this.field4709[10] - this.field4709[11] * this.field4709[4] * this.field4709[2]) - this.field4709[8] * this.field4709[3] * this.field4709[6]);
		float var10 = var1 * (this.field4709[13] * this.field4709[7] * this.field4709[8] + this.field4709[12] * this.field4709[11] * this.field4709[5] + (this.field4709[9] * this.field4709[4] * this.field4709[15] - this.field4709[11] * this.field4709[4] * this.field4709[13] - this.field4709[8] * this.field4709[5] * this.field4709[15]) - this.field4709[12] * this.field4709[9] * this.field4709[7]);
		float var11 = (this.field4709[13] * this.field4709[0] * this.field4709[11] + this.field4709[15] * -this.field4709[0] * this.field4709[9] + this.field4709[15] * this.field4709[1] * this.field4709[8] - this.field4709[12] * this.field4709[11] * this.field4709[1] - this.field4709[13] * this.field4709[3] * this.field4709[8] + this.field4709[12] * this.field4709[3] * this.field4709[9]) * var1;
		float var12 = var1 * (this.field4709[3] * this.field4709[4] * this.field4709[13] + this.field4709[12] * this.field4709[1] * this.field4709[7] + (this.field4709[5] * this.field4709[0] * this.field4709[15] - this.field4709[7] * this.field4709[0] * this.field4709[13] - this.field4709[4] * this.field4709[1] * this.field4709[15]) - this.field4709[12] * this.field4709[3] * this.field4709[5]);
		float var13 = (this.field4709[5] * this.field4709[3] * this.field4709[8] + (this.field4709[11] * this.field4709[5] * -this.field4709[0] + this.field4709[7] * this.field4709[0] * this.field4709[9] + this.field4709[11] * this.field4709[1] * this.field4709[4] - this.field4709[1] * this.field4709[7] * this.field4709[8] - this.field4709[4] * this.field4709[3] * this.field4709[9])) * var1;
		float var14 = (this.field4709[12] * this.field4709[9] * this.field4709[6] + (this.field4709[14] * this.field4709[9] * -this.field4709[4] + this.field4709[4] * this.field4709[10] * this.field4709[13] + this.field4709[5] * this.field4709[8] * this.field4709[14] - this.field4709[12] * this.field4709[5] * this.field4709[10] - this.field4709[6] * this.field4709[8] * this.field4709[13])) * var1;
		float var15 = (this.field4709[0] * this.field4709[9] * this.field4709[14] - this.field4709[13] * this.field4709[0] * this.field4709[10] - this.field4709[8] * this.field4709[1] * this.field4709[14] + this.field4709[12] * this.field4709[1] * this.field4709[10] + this.field4709[13] * this.field4709[2] * this.field4709[8] - this.field4709[12] * this.field4709[2] * this.field4709[9]) * var1;
		float var16 = (this.field4709[14] * this.field4709[4] * this.field4709[1] + this.field4709[13] * this.field4709[6] * this.field4709[0] + this.field4709[14] * this.field4709[5] * -this.field4709[0] - this.field4709[1] * this.field4709[6] * this.field4709[12] - this.field4709[13] * this.field4709[4] * this.field4709[2] + this.field4709[2] * this.field4709[5] * this.field4709[12]) * var1;
		float var17 = var1 * (this.field4709[0] * this.field4709[5] * this.field4709[10] - this.field4709[6] * this.field4709[0] * this.field4709[9] - this.field4709[4] * this.field4709[1] * this.field4709[10] + this.field4709[8] * this.field4709[6] * this.field4709[1] + this.field4709[4] * this.field4709[2] * this.field4709[9] - this.field4709[8] * this.field4709[5] * this.field4709[2]);
		this.field4709[0] = var2;
		this.field4709[1] = var3;
		this.field4709[2] = var4;
		this.field4709[3] = var5;
		this.field4709[4] = var6;
		this.field4709[5] = var7;
		this.field4709[6] = var8;
		this.field4709[7] = var9;
		this.field4709[8] = var10;
		this.field4709[9] = var11;
		this.field4709[10] = var12;
		this.field4709[11] = var13;
		this.field4709[12] = var14;
		this.field4709[13] = var15;
		this.field4709[14] = var16;
		this.field4709[15] = var17;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "1440282828"
	)
	public void method7791(float var1, float var2, float var3, float var4) {
		this.field4709[0] = var1;
		this.field4709[1] = 0.0F;
		this.field4709[2] = 0.0F;
		this.field4709[3] = 0.0F;
		this.field4709[4] = 0.0F;
		this.field4709[5] = var2;
		this.field4709[6] = 0.0F;
		this.field4709[7] = 0.0F;
		this.field4709[8] = 0.0F;
		this.field4709[9] = 0.0F;
		this.field4709[10] = var3;
		this.field4709[11] = 0.0F;
		this.field4709[12] = 0.0F;
		this.field4709[13] = 0.0F;
		this.field4709[14] = 0.0F;
		this.field4709[15] = var4;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(FFF[FB)V",
		garbageValue = "36"
	)
	public void method7792(float var1, float var2, float var3, float[] var4) {
		var4[0] = this.field4709[12] + var3 * this.field4709[8] + var1 * this.field4709[0] + this.field4709[4] * var2;
		var4[1] = this.field4709[13] + this.field4709[9] * var3 + this.field4709[5] * var2 + var1 * this.field4709[1];
		var4[2] = this.field4709[14] + var3 * this.field4709[10] + var2 * this.field4709[6] + this.field4709[2] * var1;
		if (var4.length > 3) {
			var4[3] = this.field4709[15] + var2 * this.field4709[7] + this.field4709[3] * var1 + this.field4709[11] * var3;
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(FFFI)F",
		garbageValue = "-17904142"
	)
	public float method7784(float var1, float var2, float var3) {
		return this.field4709[4] * var2 + var1 * this.field4709[0] + this.field4709[8] * var3 + this.field4709[12];
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(FFFB)F",
		garbageValue = "105"
	)
	public float method7853(float var1, float var2, float var3) {
		return this.field4709[1] * var1 + this.field4709[5] * var2 + var3 * this.field4709[9] + this.field4709[13];
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(FFFB)F",
		garbageValue = "42"
	)
	public float method7795(float var1, float var2, float var3) {
		return this.field4709[2] * var1 + this.field4709[6] * var2 + var3 * this.field4709[10] + this.field4709[14];
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "1293258905"
	)
	public float[] method7798() {
		float[] var1 = new float[3];
		class422 var2 = new class422(this.field4709[0], this.field4709[1], this.field4709[2]);
		class422 var3 = new class422(this.field4709[4], this.field4709[5], this.field4709[6]);
		class422 var4 = new class422(this.field4709[8], this.field4709[9], this.field4709[10]);
		var1[0] = var2.method7723();
		var1[1] = var3.method7723();
		var1[2] = var4.method7723();
		return var1;
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method7779();
		this.method7778();

		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.field4709[var3 + var2 * 4];
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
		int var3 = 31 * var2 + Arrays.hashCode(this.field4709);
		return var3;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class424)) {
			return false;
		} else {
			class424 var2 = (class424)var1;

			for (int var3 = 0; var3 < 16; ++var3) {
				if (this.field4709[var3] != var2.field4709[var3]) {
					return false;
				}
			}

			return true;
		}
	}
}
