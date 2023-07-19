import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rm")
public final class class451 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Lrm;"
	)
	static class451[] field4744;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1398857623
	)
	static int field4740;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -511681771
	)
	static int field4742;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	public static final class451 field4739;
	@ObfuscatedName("as")
	public float[] field4743;

	static {
		field4744 = new class451[0];
		field4740 = 100;
		field4744 = new class451[100];
		field4742 = 0;
		field4739 = new class451();
	}

	public class451() {
		this.field4743 = new float[16];
		this.method8249();
	}

	@ObfuscatedSignature(
		descriptor = "(Lrm;)V"
	)
	public class451(class451 var1) {
		this.field4743 = new float[16];
		this.method8289(var1);
	}

	@ObfuscatedSignature(
		descriptor = "(Lty;Z)V"
	)
	public class451(Buffer var1, boolean var2) {
		this.field4743 = new float[16];
		this.method8246(var1, var2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1298935751"
	)
	public void method8279() {
		synchronized(field4744) {
			if (field4742 < field4740 - 1) {
				field4744[++field4742 - 1] = this;
			}

		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lty;ZI)V",
		garbageValue = "-1389814144"
	)
	void method8246(Buffer var1, boolean var2) {
		if (var2) {
			class452 var13 = new class452();
			int var6 = var1.readShort();
			var6 &= 16383;
			float var5 = (float)(6.283185307179586D * (double)((float)var6 / 16384.0F));
			var13.method8315(var5);
			int var9 = var1.readShort();
			var9 &= 16383;
			float var8 = (float)((double)((float)var9 / 16384.0F) * 6.283185307179586D);
			var13.method8316(var8);
			int var12 = var1.readShort();
			var12 &= 16383;
			float var11 = (float)((double)((float)var12 / 16384.0F) * 6.283185307179586D);
			var13.method8329(var11);
			var13.method8318((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort());
			this.method8248(var13);
		} else {
			for (int var3 = 0; var3 < 16; ++var3) {
				this.field4743[var3] = var1.method9094();
			}
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "737121810"
	)
	float[] method8247() {
		float[] var1 = new float[3];
		if ((double)this.field4743[2] < 0.999D && (double)this.field4743[2] > -0.999D) {
			var1[1] = (float)(-Math.asin((double)this.field4743[2]));
			double var2 = Math.cos((double)var1[1]);
			var1[0] = (float)Math.atan2((double)this.field4743[6] / var2, (double)this.field4743[10] / var2);
			var1[2] = (float)Math.atan2((double)this.field4743[1] / var2, (double)this.field4743[0] / var2);
		} else {
			var1[0] = 0.0F;
			var1[1] = (float)Math.atan2((double)this.field4743[2], 0.0D);
			var1[2] = (float)Math.atan2((double)(-this.field4743[9]), (double)this.field4743[5]);
		}

		return var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "1036092257"
	)
	public float[] method8257() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4743[6])), 0.0F, 0.0F};
		double var2 = Math.cos((double)var1[0]);
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) {
			var4 = (double)this.field4743[2];
			var6 = (double)this.field4743[10];
			double var8 = (double)this.field4743[4];
			double var10 = (double)this.field4743[5];
			var1[1] = (float)Math.atan2(var4, var6);
			var1[2] = (float)Math.atan2(var8, var10);
		} else {
			var4 = (double)this.field4743[1];
			var6 = (double)this.field4743[0];
			if (this.field4743[6] < 0.0F) {
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
		descriptor = "(B)V",
		garbageValue = "-85"
	)
	void method8249() {
		this.field4743[0] = 1.0F;
		this.field4743[1] = 0.0F;
		this.field4743[2] = 0.0F;
		this.field4743[3] = 0.0F;
		this.field4743[4] = 0.0F;
		this.field4743[5] = 1.0F;
		this.field4743[6] = 0.0F;
		this.field4743[7] = 0.0F;
		this.field4743[8] = 0.0F;
		this.field4743[9] = 0.0F;
		this.field4743[10] = 1.0F;
		this.field4743[11] = 0.0F;
		this.field4743[12] = 0.0F;
		this.field4743[13] = 0.0F;
		this.field4743[14] = 0.0F;
		this.field4743[15] = 1.0F;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1783640512"
	)
	public void method8250() {
		this.field4743[0] = 0.0F;
		this.field4743[1] = 0.0F;
		this.field4743[2] = 0.0F;
		this.field4743[3] = 0.0F;
		this.field4743[4] = 0.0F;
		this.field4743[5] = 0.0F;
		this.field4743[6] = 0.0F;
		this.field4743[7] = 0.0F;
		this.field4743[8] = 0.0F;
		this.field4743[9] = 0.0F;
		this.field4743[10] = 0.0F;
		this.field4743[11] = 0.0F;
		this.field4743[12] = 0.0F;
		this.field4743[13] = 0.0F;
		this.field4743[14] = 0.0F;
		this.field4743[15] = 0.0F;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lrm;B)V",
		garbageValue = "2"
	)
	public void method8289(class451 var1) {
		System.arraycopy(var1.field4743, 0, this.field4743, 0, 16);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-1994849424"
	)
	public void method8252(float var1) {
		this.method8266(var1, var1, var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "1837928270"
	)
	public void method8266(float var1, float var2, float var3) {
		this.method8249();
		this.field4743[0] = var1;
		this.field4743[5] = var2;
		this.field4743[10] = var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lrm;S)V",
		garbageValue = "28816"
	)
	public void method8254(class451 var1) {
		for (int var2 = 0; var2 < this.field4743.length; ++var2) {
			float[] var10000 = this.field4743;
			var10000[var2] += var1.field4743[var2];
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lrm;S)V",
		garbageValue = "255"
	)
	public void method8285(class451 var1) {
		float var2 = var1.field4743[12] * this.field4743[3] + this.field4743[0] * var1.field4743[0] + this.field4743[1] * var1.field4743[4] + this.field4743[2] * var1.field4743[8];
		float var3 = var1.field4743[13] * this.field4743[3] + this.field4743[2] * var1.field4743[9] + var1.field4743[5] * this.field4743[1] + var1.field4743[1] * this.field4743[0];
		float var4 = this.field4743[2] * var1.field4743[10] + this.field4743[0] * var1.field4743[2] + var1.field4743[6] * this.field4743[1] + var1.field4743[14] * this.field4743[3];
		float var5 = this.field4743[0] * var1.field4743[3] + var1.field4743[7] * this.field4743[1] + this.field4743[2] * var1.field4743[11] + this.field4743[3] * var1.field4743[15];
		float var6 = this.field4743[7] * var1.field4743[12] + var1.field4743[8] * this.field4743[6] + this.field4743[4] * var1.field4743[0] + var1.field4743[4] * this.field4743[5];
		float var7 = var1.field4743[1] * this.field4743[4] + this.field4743[5] * var1.field4743[5] + this.field4743[6] * var1.field4743[9] + this.field4743[7] * var1.field4743[13];
		float var8 = this.field4743[7] * var1.field4743[14] + this.field4743[4] * var1.field4743[2] + this.field4743[5] * var1.field4743[6] + this.field4743[6] * var1.field4743[10];
		float var9 = this.field4743[7] * var1.field4743[15] + this.field4743[6] * var1.field4743[11] + var1.field4743[7] * this.field4743[5] + var1.field4743[3] * this.field4743[4];
		float var10 = var1.field4743[12] * this.field4743[11] + this.field4743[10] * var1.field4743[8] + var1.field4743[4] * this.field4743[9] + this.field4743[8] * var1.field4743[0];
		float var11 = this.field4743[8] * var1.field4743[1] + var1.field4743[5] * this.field4743[9] + var1.field4743[9] * this.field4743[10] + var1.field4743[13] * this.field4743[11];
		float var12 = this.field4743[8] * var1.field4743[2] + var1.field4743[6] * this.field4743[9] + this.field4743[10] * var1.field4743[10] + this.field4743[11] * var1.field4743[14];
		float var13 = this.field4743[10] * var1.field4743[11] + var1.field4743[3] * this.field4743[8] + this.field4743[9] * var1.field4743[7] + this.field4743[11] * var1.field4743[15];
		float var14 = this.field4743[15] * var1.field4743[12] + this.field4743[13] * var1.field4743[4] + this.field4743[12] * var1.field4743[0] + this.field4743[14] * var1.field4743[8];
		float var15 = var1.field4743[13] * this.field4743[15] + var1.field4743[9] * this.field4743[14] + this.field4743[13] * var1.field4743[5] + this.field4743[12] * var1.field4743[1];
		float var16 = this.field4743[12] * var1.field4743[2] + var1.field4743[6] * this.field4743[13] + var1.field4743[10] * this.field4743[14] + var1.field4743[14] * this.field4743[15];
		float var17 = var1.field4743[11] * this.field4743[14] + this.field4743[13] * var1.field4743[7] + var1.field4743[3] * this.field4743[12] + var1.field4743[15] * this.field4743[15];
		this.field4743[0] = var2;
		this.field4743[1] = var3;
		this.field4743[2] = var4;
		this.field4743[3] = var5;
		this.field4743[4] = var6;
		this.field4743[5] = var7;
		this.field4743[6] = var8;
		this.field4743[7] = var9;
		this.field4743[8] = var10;
		this.field4743[9] = var11;
		this.field4743[10] = var12;
		this.field4743[11] = var13;
		this.field4743[12] = var14;
		this.field4743[13] = var15;
		this.field4743[14] = var16;
		this.field4743[15] = var17;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lrj;I)V",
		garbageValue = "-2118656993"
	)
	public void method8255(class450 var1) {
		float var2 = var1.field4735 * var1.field4735;
		float var3 = var1.field4736 * var1.field4735;
		float var4 = var1.field4733 * var1.field4735;
		float var5 = var1.field4735 * var1.field4737;
		float var6 = var1.field4736 * var1.field4736;
		float var7 = var1.field4736 * var1.field4733;
		float var8 = var1.field4737 * var1.field4736;
		float var9 = var1.field4733 * var1.field4733;
		float var10 = var1.field4733 * var1.field4737;
		float var11 = var1.field4737 * var1.field4737;
		this.field4743[0] = var2 + var6 - var11 - var9;
		this.field4743[1] = var5 + var5 + var7 + var7;
		this.field4743[2] = var8 + (var8 - var4 - var4);
		this.field4743[4] = var7 + (var7 - var5 - var5);
		this.field4743[5] = var9 + var2 - var6 - var11;
		this.field4743[6] = var3 + var10 + var10 + var3;
		this.field4743[8] = var8 + var8 + var4 + var4;
		this.field4743[9] = var10 - var3 - var3 + var10;
		this.field4743[10] = var2 + var11 - var9 - var6;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lrv;I)V",
		garbageValue = "275615452"
	)
	void method8248(class452 var1) {
		this.field4743[0] = var1.field4750;
		this.field4743[1] = var1.field4746;
		this.field4743[2] = var1.field4747;
		this.field4743[3] = 0.0F;
		this.field4743[4] = var1.field4754;
		this.field4743[5] = var1.field4748;
		this.field4743[6] = var1.field4749;
		this.field4743[7] = 0.0F;
		this.field4743[8] = var1.field4752;
		this.field4743[9] = var1.field4745;
		this.field4743[10] = var1.field4753;
		this.field4743[11] = 0.0F;
		this.field4743[12] = var1.field4751;
		this.field4743[13] = var1.field4755;
		this.field4743[14] = var1.field4756;
		this.field4743[15] = 1.0F;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "-6"
	)
	float method8258() {
		return this.field4743[12] * this.field4743[3] * this.field4743[6] * this.field4743[9] + (this.field4743[14] * this.field4743[5] * this.field4743[3] * this.field4743[8] + this.field4743[13] * this.field4743[10] * this.field4743[4] * this.field4743[3] + (this.field4743[8] * this.field4743[2] * this.field4743[7] * this.field4743[13] + this.field4743[2] * this.field4743[5] * this.field4743[11] * this.field4743[12] + (this.field4743[4] * this.field4743[2] * this.field4743[9] * this.field4743[15] + this.field4743[14] * this.field4743[9] * this.field4743[7] * this.field4743[0] + this.field4743[15] * this.field4743[10] * this.field4743[5] * this.field4743[0] - this.field4743[11] * this.field4743[0] * this.field4743[5] * this.field4743[14] - this.field4743[15] * this.field4743[9] * this.field4743[0] * this.field4743[6] + this.field4743[13] * this.field4743[0] * this.field4743[6] * this.field4743[11] - this.field4743[13] * this.field4743[0] * this.field4743[7] * this.field4743[10] - this.field4743[15] * this.field4743[10] * this.field4743[1] * this.field4743[4] + this.field4743[14] * this.field4743[11] * this.field4743[1] * this.field4743[4] + this.field4743[8] * this.field4743[1] * this.field4743[6] * this.field4743[15] - this.field4743[1] * this.field4743[6] * this.field4743[11] * this.field4743[12] - this.field4743[8] * this.field4743[1] * this.field4743[7] * this.field4743[14] + this.field4743[12] * this.field4743[10] * this.field4743[7] * this.field4743[1] - this.field4743[11] * this.field4743[2] * this.field4743[4] * this.field4743[13] - this.field4743[15] * this.field4743[8] * this.field4743[2] * this.field4743[5]) - this.field4743[12] * this.field4743[9] * this.field4743[7] * this.field4743[2] - this.field4743[9] * this.field4743[4] * this.field4743[3] * this.field4743[14]) - this.field4743[12] * this.field4743[10] * this.field4743[3] * this.field4743[5] - this.field4743[13] * this.field4743[3] * this.field4743[6] * this.field4743[8]);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-882996558"
	)
	public void method8259() {
		float var1 = 1.0F / this.method8258();
		float var2 = (this.field4743[7] * this.field4743[9] * this.field4743[14] + this.field4743[15] * this.field4743[5] * this.field4743[10] - this.field4743[11] * this.field4743[5] * this.field4743[14] - this.field4743[9] * this.field4743[6] * this.field4743[15] + this.field4743[13] * this.field4743[6] * this.field4743[11] - this.field4743[7] * this.field4743[10] * this.field4743[13]) * var1;
		float var3 = var1 * (this.field4743[9] * this.field4743[2] * this.field4743[15] + this.field4743[14] * this.field4743[11] * this.field4743[1] + this.field4743[15] * -this.field4743[1] * this.field4743[10] - this.field4743[11] * this.field4743[2] * this.field4743[13] - this.field4743[3] * this.field4743[9] * this.field4743[14] + this.field4743[13] * this.field4743[10] * this.field4743[3]);
		float var4 = var1 * (this.field4743[3] * this.field4743[5] * this.field4743[14] + this.field4743[13] * this.field4743[2] * this.field4743[7] + (this.field4743[1] * this.field4743[6] * this.field4743[15] - this.field4743[7] * this.field4743[1] * this.field4743[14] - this.field4743[2] * this.field4743[5] * this.field4743[15]) - this.field4743[13] * this.field4743[3] * this.field4743[6]);
		float var5 = (this.field4743[9] * this.field4743[6] * this.field4743[3] + (this.field4743[10] * this.field4743[1] * this.field4743[7] + this.field4743[11] * this.field4743[6] * -this.field4743[1] + this.field4743[5] * this.field4743[2] * this.field4743[11] - this.field4743[2] * this.field4743[7] * this.field4743[9] - this.field4743[10] * this.field4743[5] * this.field4743[3])) * var1;
		float var6 = var1 * (this.field4743[10] * this.field4743[7] * this.field4743[12] + (this.field4743[6] * this.field4743[8] * this.field4743[15] + this.field4743[15] * this.field4743[10] * -this.field4743[4] + this.field4743[11] * this.field4743[4] * this.field4743[14] - this.field4743[6] * this.field4743[11] * this.field4743[12] - this.field4743[14] * this.field4743[8] * this.field4743[7]));
		float var7 = (this.field4743[3] * this.field4743[8] * this.field4743[14] + this.field4743[15] * this.field4743[10] * this.field4743[0] - this.field4743[14] * this.field4743[0] * this.field4743[11] - this.field4743[15] * this.field4743[8] * this.field4743[2] + this.field4743[2] * this.field4743[11] * this.field4743[12] - this.field4743[3] * this.field4743[10] * this.field4743[12]) * var1;
		float var8 = (this.field4743[12] * this.field4743[3] * this.field4743[6] + (this.field4743[6] * -this.field4743[0] * this.field4743[15] + this.field4743[14] * this.field4743[0] * this.field4743[7] + this.field4743[15] * this.field4743[2] * this.field4743[4] - this.field4743[12] * this.field4743[7] * this.field4743[2] - this.field4743[14] * this.field4743[4] * this.field4743[3])) * var1;
		float var9 = var1 * (this.field4743[0] * this.field4743[6] * this.field4743[11] - this.field4743[10] * this.field4743[7] * this.field4743[0] - this.field4743[11] * this.field4743[4] * this.field4743[2] + this.field4743[7] * this.field4743[2] * this.field4743[8] + this.field4743[4] * this.field4743[3] * this.field4743[10] - this.field4743[3] * this.field4743[6] * this.field4743[8]);
		float var10 = var1 * (this.field4743[13] * this.field4743[7] * this.field4743[8] + this.field4743[15] * this.field4743[4] * this.field4743[9] - this.field4743[13] * this.field4743[11] * this.field4743[4] - this.field4743[15] * this.field4743[8] * this.field4743[5] + this.field4743[12] * this.field4743[11] * this.field4743[5] - this.field4743[7] * this.field4743[9] * this.field4743[12]);
		float var11 = var1 * (this.field4743[9] * this.field4743[3] * this.field4743[12] + (this.field4743[15] * this.field4743[8] * this.field4743[1] + this.field4743[11] * this.field4743[0] * this.field4743[13] + this.field4743[15] * this.field4743[9] * -this.field4743[0] - this.field4743[12] * this.field4743[1] * this.field4743[11] - this.field4743[3] * this.field4743[8] * this.field4743[13]));
		float var12 = (this.field4743[4] * this.field4743[3] * this.field4743[13] + this.field4743[7] * this.field4743[1] * this.field4743[12] + (this.field4743[15] * this.field4743[5] * this.field4743[0] - this.field4743[0] * this.field4743[7] * this.field4743[13] - this.field4743[15] * this.field4743[1] * this.field4743[4]) - this.field4743[12] * this.field4743[5] * this.field4743[3]) * var1;
		float var13 = (this.field4743[8] * this.field4743[3] * this.field4743[5] + (this.field4743[4] * this.field4743[1] * this.field4743[11] + this.field4743[5] * -this.field4743[0] * this.field4743[11] + this.field4743[7] * this.field4743[0] * this.field4743[9] - this.field4743[7] * this.field4743[1] * this.field4743[8] - this.field4743[4] * this.field4743[3] * this.field4743[9])) * var1;
		float var14 = (this.field4743[9] * this.field4743[6] * this.field4743[12] + (this.field4743[14] * this.field4743[8] * this.field4743[5] + this.field4743[13] * this.field4743[10] * this.field4743[4] + this.field4743[14] * -this.field4743[4] * this.field4743[9] - this.field4743[12] * this.field4743[10] * this.field4743[5] - this.field4743[6] * this.field4743[8] * this.field4743[13])) * var1;
		float var15 = var1 * (this.field4743[1] * this.field4743[10] * this.field4743[12] + (this.field4743[14] * this.field4743[9] * this.field4743[0] - this.field4743[0] * this.field4743[10] * this.field4743[13] - this.field4743[14] * this.field4743[1] * this.field4743[8]) + this.field4743[13] * this.field4743[8] * this.field4743[2] - this.field4743[9] * this.field4743[2] * this.field4743[12]);
		float var16 = var1 * (this.field4743[12] * this.field4743[2] * this.field4743[5] + (this.field4743[13] * this.field4743[6] * this.field4743[0] + -this.field4743[0] * this.field4743[5] * this.field4743[14] + this.field4743[4] * this.field4743[1] * this.field4743[14] - this.field4743[12] * this.field4743[1] * this.field4743[6] - this.field4743[13] * this.field4743[4] * this.field4743[2]));
		float var17 = (this.field4743[9] * this.field4743[2] * this.field4743[4] + this.field4743[5] * this.field4743[0] * this.field4743[10] - this.field4743[9] * this.field4743[6] * this.field4743[0] - this.field4743[1] * this.field4743[4] * this.field4743[10] + this.field4743[6] * this.field4743[1] * this.field4743[8] - this.field4743[8] * this.field4743[2] * this.field4743[5]) * var1;
		this.field4743[0] = var2;
		this.field4743[1] = var3;
		this.field4743[2] = var4;
		this.field4743[3] = var5;
		this.field4743[4] = var6;
		this.field4743[5] = var7;
		this.field4743[6] = var8;
		this.field4743[7] = var9;
		this.field4743[8] = var10;
		this.field4743[9] = var11;
		this.field4743[10] = var12;
		this.field4743[11] = var13;
		this.field4743[12] = var14;
		this.field4743[13] = var15;
		this.field4743[14] = var16;
		this.field4743[15] = var17;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "24"
	)
	public float[] method8253() {
		float[] var1 = new float[3];
		class449 var2 = new class449(this.field4743[0], this.field4743[1], this.field4743[2]);
		class449 var3 = new class449(this.field4743[4], this.field4743[5], this.field4743[6]);
		class449 var4 = new class449(this.field4743[8], this.field4743[9], this.field4743[10]);
		var1[0] = var2.method8214();
		var1[1] = var3.method8214();
		var1[2] = var4.method8214();
		return var1;
	}

	public int hashCode() {
		boolean var1 = true;
		byte var2 = 1;
		int var3 = 31 * var2 + Arrays.hashCode(this.field4743);
		return var3;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class451)) {
			return false;
		} else {
			class451 var2 = (class451)var1;

			for (int var3 = 0; var3 < 16; ++var3) {
				if (this.field4743[var3] != var2.field4743[var3]) {
					return false;
				}
			}

			return true;
		}
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method8257();
		this.method8247();

		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.field4743[var3 + var2 * 4];
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) {
					var4 = 0.0F;
				}

				var1.append(var4);
			}

			var1.append("\n");
		}

		return var1.toString();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lnd;Ljava/lang/String;Ljava/lang/String;I)Luu;",
		garbageValue = "1008669226"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			return MouseRecorder.method2298(var0, var3, var4);
		}
	}
}
