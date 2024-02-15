import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sr")
public final class class469 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lsr;"
	)
	static class469[] field4845;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1870351339
	)
	static int field4841;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1730714885
	)
	static int field4842;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	public static final class469 field4844;
	@ObfuscatedName("ar")
	public float[] field4843;

	static {
		field4845 = new class469[0];
		field4841 = 100;
		field4845 = new class469[100];
		field4842 = 0;
		field4844 = new class469();
	}

	public class469() {
		this.field4843 = new float[16];
		this.method8627();
	}

	@ObfuscatedSignature(
		descriptor = "(Lsr;)V"
	)
	public class469(class469 var1) {
		this.field4843 = new float[16];
		this.method8629(var1);
	}

	@ObfuscatedSignature(
		descriptor = "(Luq;Z)V"
	)
	public class469(Buffer var1, boolean var2) {
		this.field4843 = new float[16];
		this.method8624(var1, var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "412828198"
	)
	public void method8648() {
		synchronized(field4845) {
			if (field4842 < field4841 - 1) {
				field4845[++field4842 - 1] = this;
			}

		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luq;ZI)V",
		garbageValue = "-984331291"
	)
	void method8624(Buffer var1, boolean var2) {
		if (var2) {
			class470 var13 = new class470();
			int var6 = var1.readShort();
			var6 &= 16383;
			float var5 = (float)(6.283185307179586D * (double)((float)var6 / 16384.0F));
			var13.method8687(var5);
			int var9 = var1.readShort();
			var9 &= 16383;
			float var8 = (float)((double)((float)var9 / 16384.0F) * 6.283185307179586D);
			var13.method8692(var8);
			int var12 = var1.readShort();
			var12 &= 16383;
			float var11 = (float)((double)((float)var12 / 16384.0F) * 6.283185307179586D);
			var13.method8689(var11);
			var13.method8688((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort());
			this.method8659(var13);
		} else {
			for (int var3 = 0; var3 < 16; ++var3) {
				this.field4843[var3] = var1.method9481();
			}
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "1978256666"
	)
	float[] method8625() {
		float[] var1 = new float[3];
		if ((double)this.field4843[2] < 0.999D && (double)this.field4843[2] > -0.999D) {
			var1[1] = (float)(-Math.asin((double)this.field4843[2]));
			double var2 = Math.cos((double)var1[1]);
			var1[0] = (float)Math.atan2((double)this.field4843[6] / var2, (double)this.field4843[10] / var2);
			var1[2] = (float)Math.atan2((double)this.field4843[1] / var2, (double)this.field4843[0] / var2);
		} else {
			var1[0] = 0.0F;
			var1[1] = (float)Math.atan2((double)this.field4843[2], 0.0D);
			var1[2] = (float)Math.atan2((double)(-this.field4843[9]), (double)this.field4843[5]);
		}

		return var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "232663535"
	)
	public float[] method8634() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4843[6])), 0.0F, 0.0F};
		double var2 = Math.cos((double)var1[0]);
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) {
			var4 = (double)this.field4843[2];
			var6 = (double)this.field4843[10];
			double var8 = (double)this.field4843[4];
			double var10 = (double)this.field4843[5];
			var1[1] = (float)Math.atan2(var4, var6);
			var1[2] = (float)Math.atan2(var8, var10);
		} else {
			var4 = (double)this.field4843[1];
			var6 = (double)this.field4843[0];
			if (this.field4843[6] < 0.0F) {
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
		descriptor = "(I)V",
		garbageValue = "1212896580"
	)
	void method8627() {
		this.field4843[0] = 1.0F;
		this.field4843[1] = 0.0F;
		this.field4843[2] = 0.0F;
		this.field4843[3] = 0.0F;
		this.field4843[4] = 0.0F;
		this.field4843[5] = 1.0F;
		this.field4843[6] = 0.0F;
		this.field4843[7] = 0.0F;
		this.field4843[8] = 0.0F;
		this.field4843[9] = 0.0F;
		this.field4843[10] = 1.0F;
		this.field4843[11] = 0.0F;
		this.field4843[12] = 0.0F;
		this.field4843[13] = 0.0F;
		this.field4843[14] = 0.0F;
		this.field4843[15] = 1.0F;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-67"
	)
	public void method8656() {
		this.field4843[0] = 0.0F;
		this.field4843[1] = 0.0F;
		this.field4843[2] = 0.0F;
		this.field4843[3] = 0.0F;
		this.field4843[4] = 0.0F;
		this.field4843[5] = 0.0F;
		this.field4843[6] = 0.0F;
		this.field4843[7] = 0.0F;
		this.field4843[8] = 0.0F;
		this.field4843[9] = 0.0F;
		this.field4843[10] = 0.0F;
		this.field4843[11] = 0.0F;
		this.field4843[12] = 0.0F;
		this.field4843[13] = 0.0F;
		this.field4843[14] = 0.0F;
		this.field4843[15] = 0.0F;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lsr;S)V",
		garbageValue = "-26778"
	)
	public void method8629(class469 var1) {
		System.arraycopy(var1.field4843, 0, this.field4843, 0, 16);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "543049726"
	)
	public void method8630(float var1) {
		this.method8631(var1, var1, var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(FFFB)V",
		garbageValue = "43"
	)
	public void method8631(float var1, float var2, float var3) {
		this.method8627();
		this.field4843[0] = var1;
		this.field4843[5] = var2;
		this.field4843[10] = var3;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lsr;B)V",
		garbageValue = "-93"
	)
	public void method8657(class469 var1) {
		for (int var2 = 0; var2 < this.field4843.length; ++var2) {
			float[] var10000 = this.field4843;
			var10000[var2] += var1.field4843[var2];
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lsr;I)V",
		garbageValue = "1817605058"
	)
	public void method8633(class469 var1) {
		float var2 = var1.field4843[0] * this.field4843[0] + var1.field4843[4] * this.field4843[1] + this.field4843[2] * var1.field4843[8] + this.field4843[3] * var1.field4843[12];
		float var3 = var1.field4843[13] * this.field4843[3] + var1.field4843[5] * this.field4843[1] + this.field4843[0] * var1.field4843[1] + var1.field4843[9] * this.field4843[2];
		float var4 = var1.field4843[10] * this.field4843[2] + this.field4843[1] * var1.field4843[6] + this.field4843[0] * var1.field4843[2] + this.field4843[3] * var1.field4843[14];
		float var5 = var1.field4843[7] * this.field4843[1] + var1.field4843[3] * this.field4843[0] + var1.field4843[11] * this.field4843[2] + var1.field4843[15] * this.field4843[3];
		float var6 = var1.field4843[12] * this.field4843[7] + var1.field4843[8] * this.field4843[6] + var1.field4843[0] * this.field4843[4] + this.field4843[5] * var1.field4843[4];
		float var7 = this.field4843[6] * var1.field4843[9] + this.field4843[4] * var1.field4843[1] + var1.field4843[5] * this.field4843[5] + this.field4843[7] * var1.field4843[13];
		float var8 = this.field4843[7] * var1.field4843[14] + var1.field4843[6] * this.field4843[5] + this.field4843[4] * var1.field4843[2] + var1.field4843[10] * this.field4843[6];
		float var9 = var1.field4843[15] * this.field4843[7] + this.field4843[4] * var1.field4843[3] + this.field4843[5] * var1.field4843[7] + this.field4843[6] * var1.field4843[11];
		float var10 = this.field4843[11] * var1.field4843[12] + this.field4843[9] * var1.field4843[4] + this.field4843[8] * var1.field4843[0] + var1.field4843[8] * this.field4843[10];
		float var11 = var1.field4843[9] * this.field4843[10] + var1.field4843[5] * this.field4843[9] + var1.field4843[1] * this.field4843[8] + this.field4843[11] * var1.field4843[13];
		float var12 = var1.field4843[14] * this.field4843[11] + this.field4843[10] * var1.field4843[10] + var1.field4843[6] * this.field4843[9] + this.field4843[8] * var1.field4843[2];
		float var13 = this.field4843[11] * var1.field4843[15] + var1.field4843[7] * this.field4843[9] + var1.field4843[3] * this.field4843[8] + this.field4843[10] * var1.field4843[11];
		float var14 = var1.field4843[12] * this.field4843[15] + var1.field4843[8] * this.field4843[14] + this.field4843[12] * var1.field4843[0] + var1.field4843[4] * this.field4843[13];
		float var15 = this.field4843[14] * var1.field4843[9] + var1.field4843[1] * this.field4843[12] + var1.field4843[5] * this.field4843[13] + var1.field4843[13] * this.field4843[15];
		float var16 = this.field4843[15] * var1.field4843[14] + var1.field4843[10] * this.field4843[14] + var1.field4843[6] * this.field4843[13] + this.field4843[12] * var1.field4843[2];
		float var17 = this.field4843[15] * var1.field4843[15] + var1.field4843[3] * this.field4843[12] + var1.field4843[7] * this.field4843[13] + var1.field4843[11] * this.field4843[14];
		this.field4843[0] = var2;
		this.field4843[1] = var3;
		this.field4843[2] = var4;
		this.field4843[3] = var5;
		this.field4843[4] = var6;
		this.field4843[5] = var7;
		this.field4843[6] = var8;
		this.field4843[7] = var9;
		this.field4843[8] = var10;
		this.field4843[9] = var11;
		this.field4843[10] = var12;
		this.field4843[11] = var13;
		this.field4843[12] = var14;
		this.field4843[13] = var15;
		this.field4843[14] = var16;
		this.field4843[15] = var17;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsf;I)V",
		garbageValue = "395557333"
	)
	public void method8660(class468 var1) {
		float var2 = var1.field4832 * var1.field4832;
		float var3 = var1.field4832 * var1.field4835;
		float var4 = var1.field4832 * var1.field4836;
		float var5 = var1.field4837 * var1.field4832;
		float var6 = var1.field4835 * var1.field4835;
		float var7 = var1.field4836 * var1.field4835;
		float var8 = var1.field4837 * var1.field4835;
		float var9 = var1.field4836 * var1.field4836;
		float var10 = var1.field4836 * var1.field4837;
		float var11 = var1.field4837 * var1.field4837;
		this.field4843[0] = var6 + var2 - var11 - var9;
		this.field4843[1] = var7 + var7 + var5 + var5;
		this.field4843[2] = var8 - var4 - var4 + var8;
		this.field4843[4] = var7 + (var7 - var5 - var5);
		this.field4843[5] = var9 + var2 - var6 - var11;
		this.field4843[6] = var10 + var3 + var10 + var3;
		this.field4843[8] = var8 + var4 + var8 + var4;
		this.field4843[9] = var10 + (var10 - var3 - var3);
		this.field4843[10] = var11 + var2 - var9 - var6;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lss;B)V",
		garbageValue = "0"
	)
	void method8659(class470 var1) {
		this.field4843[0] = var1.field4849;
		this.field4843[1] = var1.field4848;
		this.field4843[2] = var1.field4856;
		this.field4843[3] = 0.0F;
		this.field4843[4] = var1.field4850;
		this.field4843[5] = var1.field4851;
		this.field4843[6] = var1.field4847;
		this.field4843[7] = 0.0F;
		this.field4843[8] = var1.field4853;
		this.field4843[9] = var1.field4854;
		this.field4843[10] = var1.field4859;
		this.field4843[11] = 0.0F;
		this.field4843[12] = var1.field4855;
		this.field4843[13] = var1.field4857;
		this.field4843[14] = var1.field4858;
		this.field4843[15] = 1.0F;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "1728145044"
	)
	float method8635() {
		return this.field4843[12] * this.field4843[9] * this.field4843[3] * this.field4843[6] + (this.field4843[3] * this.field4843[5] * this.field4843[8] * this.field4843[14] + this.field4843[7] * this.field4843[2] * this.field4843[8] * this.field4843[13] + this.field4843[9] * this.field4843[2] * this.field4843[4] * this.field4843[15] + this.field4843[13] * this.field4843[11] * this.field4843[0] * this.field4843[6] + (this.field4843[15] * this.field4843[5] * this.field4843[0] * this.field4843[10] - this.field4843[11] * this.field4843[5] * this.field4843[0] * this.field4843[14] - this.field4843[15] * this.field4843[0] * this.field4843[6] * this.field4843[9]) + this.field4843[0] * this.field4843[7] * this.field4843[9] * this.field4843[14] - this.field4843[13] * this.field4843[10] * this.field4843[0] * this.field4843[7] - this.field4843[15] * this.field4843[10] * this.field4843[1] * this.field4843[4] + this.field4843[14] * this.field4843[4] * this.field4843[1] * this.field4843[11] + this.field4843[8] * this.field4843[1] * this.field4843[6] * this.field4843[15] - this.field4843[12] * this.field4843[11] * this.field4843[6] * this.field4843[1] - this.field4843[8] * this.field4843[7] * this.field4843[1] * this.field4843[14] + this.field4843[10] * this.field4843[7] * this.field4843[1] * this.field4843[12] - this.field4843[2] * this.field4843[4] * this.field4843[11] * this.field4843[13] - this.field4843[8] * this.field4843[5] * this.field4843[2] * this.field4843[15] + this.field4843[11] * this.field4843[5] * this.field4843[2] * this.field4843[12] - this.field4843[12] * this.field4843[9] * this.field4843[7] * this.field4843[2] - this.field4843[14] * this.field4843[3] * this.field4843[4] * this.field4843[9] + this.field4843[13] * this.field4843[4] * this.field4843[3] * this.field4843[10] - this.field4843[3] * this.field4843[5] * this.field4843[10] * this.field4843[12] - this.field4843[13] * this.field4843[8] * this.field4843[6] * this.field4843[3]);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-648106395"
	)
	public void method8685() {
		float var1 = 1.0F / this.method8635();
		float var2 = (this.field4843[9] * this.field4843[7] * this.field4843[14] + this.field4843[15] * this.field4843[5] * this.field4843[10] - this.field4843[14] * this.field4843[11] * this.field4843[5] - this.field4843[6] * this.field4843[9] * this.field4843[15] + this.field4843[11] * this.field4843[6] * this.field4843[13] - this.field4843[13] * this.field4843[7] * this.field4843[10]) * var1;
		float var3 = (this.field4843[3] * this.field4843[10] * this.field4843[13] + (this.field4843[11] * this.field4843[1] * this.field4843[14] + this.field4843[15] * -this.field4843[1] * this.field4843[10] + this.field4843[15] * this.field4843[2] * this.field4843[9] - this.field4843[13] * this.field4843[2] * this.field4843[11] - this.field4843[3] * this.field4843[9] * this.field4843[14])) * var1;
		float var4 = (this.field4843[5] * this.field4843[3] * this.field4843[14] + this.field4843[7] * this.field4843[2] * this.field4843[13] + (this.field4843[15] * this.field4843[6] * this.field4843[1] - this.field4843[14] * this.field4843[1] * this.field4843[7] - this.field4843[5] * this.field4843[2] * this.field4843[15]) - this.field4843[13] * this.field4843[3] * this.field4843[6]) * var1;
		float var5 = var1 * (this.field4843[11] * this.field4843[2] * this.field4843[5] + this.field4843[1] * this.field4843[7] * this.field4843[10] + -this.field4843[1] * this.field4843[6] * this.field4843[11] - this.field4843[9] * this.field4843[2] * this.field4843[7] - this.field4843[3] * this.field4843[5] * this.field4843[10] + this.field4843[6] * this.field4843[3] * this.field4843[9]);
		float var6 = var1 * (this.field4843[12] * this.field4843[7] * this.field4843[10] + (this.field4843[10] * -this.field4843[4] * this.field4843[15] + this.field4843[14] * this.field4843[11] * this.field4843[4] + this.field4843[15] * this.field4843[6] * this.field4843[8] - this.field4843[12] * this.field4843[11] * this.field4843[6] - this.field4843[14] * this.field4843[8] * this.field4843[7]));
		float var7 = var1 * (this.field4843[8] * this.field4843[3] * this.field4843[14] + this.field4843[10] * this.field4843[0] * this.field4843[15] - this.field4843[14] * this.field4843[11] * this.field4843[0] - this.field4843[15] * this.field4843[2] * this.field4843[8] + this.field4843[12] * this.field4843[2] * this.field4843[11] - this.field4843[3] * this.field4843[10] * this.field4843[12]);
		float var8 = (this.field4843[12] * this.field4843[6] * this.field4843[3] + (this.field4843[2] * this.field4843[4] * this.field4843[15] + this.field4843[15] * -this.field4843[0] * this.field4843[6] + this.field4843[0] * this.field4843[7] * this.field4843[14] - this.field4843[12] * this.field4843[7] * this.field4843[2] - this.field4843[3] * this.field4843[4] * this.field4843[14])) * var1;
		float var9 = (this.field4843[10] * this.field4843[4] * this.field4843[3] + this.field4843[2] * this.field4843[7] * this.field4843[8] + (this.field4843[6] * this.field4843[0] * this.field4843[11] - this.field4843[10] * this.field4843[0] * this.field4843[7] - this.field4843[4] * this.field4843[2] * this.field4843[11]) - this.field4843[6] * this.field4843[3] * this.field4843[8]) * var1;
		float var10 = (this.field4843[8] * this.field4843[7] * this.field4843[13] + this.field4843[9] * this.field4843[4] * this.field4843[15] - this.field4843[13] * this.field4843[11] * this.field4843[4] - this.field4843[8] * this.field4843[5] * this.field4843[15] + this.field4843[12] * this.field4843[5] * this.field4843[11] - this.field4843[9] * this.field4843[7] * this.field4843[12]) * var1;
		float var11 = (this.field4843[9] * this.field4843[3] * this.field4843[12] + (this.field4843[9] * -this.field4843[0] * this.field4843[15] + this.field4843[13] * this.field4843[0] * this.field4843[11] + this.field4843[8] * this.field4843[1] * this.field4843[15] - this.field4843[12] * this.field4843[11] * this.field4843[1] - this.field4843[3] * this.field4843[8] * this.field4843[13])) * var1;
		float var12 = var1 * (this.field4843[13] * this.field4843[3] * this.field4843[4] + this.field4843[12] * this.field4843[1] * this.field4843[7] + (this.field4843[15] * this.field4843[0] * this.field4843[5] - this.field4843[13] * this.field4843[7] * this.field4843[0] - this.field4843[15] * this.field4843[4] * this.field4843[1]) - this.field4843[5] * this.field4843[3] * this.field4843[12]);
		float var13 = (this.field4843[11] * this.field4843[5] * -this.field4843[0] + this.field4843[0] * this.field4843[7] * this.field4843[9] + this.field4843[11] * this.field4843[4] * this.field4843[1] - this.field4843[1] * this.field4843[7] * this.field4843[8] - this.field4843[9] * this.field4843[3] * this.field4843[4] + this.field4843[5] * this.field4843[3] * this.field4843[8]) * var1;
		float var14 = var1 * (this.field4843[5] * this.field4843[8] * this.field4843[14] + this.field4843[14] * -this.field4843[4] * this.field4843[9] + this.field4843[4] * this.field4843[10] * this.field4843[13] - this.field4843[12] * this.field4843[10] * this.field4843[5] - this.field4843[13] * this.field4843[6] * this.field4843[8] + this.field4843[12] * this.field4843[6] * this.field4843[9]);
		float var15 = (this.field4843[2] * this.field4843[8] * this.field4843[13] + this.field4843[12] * this.field4843[10] * this.field4843[1] + (this.field4843[9] * this.field4843[0] * this.field4843[14] - this.field4843[0] * this.field4843[10] * this.field4843[13] - this.field4843[14] * this.field4843[1] * this.field4843[8]) - this.field4843[12] * this.field4843[2] * this.field4843[9]) * var1;
		float var16 = var1 * (this.field4843[5] * this.field4843[2] * this.field4843[12] + (this.field4843[4] * this.field4843[1] * this.field4843[14] + this.field4843[14] * this.field4843[5] * -this.field4843[0] + this.field4843[0] * this.field4843[6] * this.field4843[13] - this.field4843[12] * this.field4843[6] * this.field4843[1] - this.field4843[13] * this.field4843[4] * this.field4843[2]));
		float var17 = var1 * (this.field4843[6] * this.field4843[1] * this.field4843[8] + (this.field4843[10] * this.field4843[5] * this.field4843[0] - this.field4843[9] * this.field4843[0] * this.field4843[6] - this.field4843[4] * this.field4843[1] * this.field4843[10]) + this.field4843[4] * this.field4843[2] * this.field4843[9] - this.field4843[8] * this.field4843[2] * this.field4843[5]);
		this.field4843[0] = var2;
		this.field4843[1] = var3;
		this.field4843[2] = var4;
		this.field4843[3] = var5;
		this.field4843[4] = var6;
		this.field4843[5] = var7;
		this.field4843[6] = var8;
		this.field4843[7] = var9;
		this.field4843[8] = var10;
		this.field4843[9] = var11;
		this.field4843[10] = var12;
		this.field4843[11] = var13;
		this.field4843[12] = var14;
		this.field4843[13] = var15;
		this.field4843[14] = var16;
		this.field4843[15] = var17;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "2002528794"
	)
	public float[] method8623() {
		float[] var1 = new float[3];
		class467 var2 = new class467(this.field4843[0], this.field4843[1], this.field4843[2]);
		class467 var3 = new class467(this.field4843[4], this.field4843[5], this.field4843[6]);
		class467 var4 = new class467(this.field4843[8], this.field4843[9], this.field4843[10]);
		var1[0] = var2.method8586();
		var1[1] = var3.method8586();
		var1[2] = var4.method8586();
		return var1;
	}

	public int hashCode() {
		boolean var1 = true;
		byte var2 = 1;
		int var3 = var2 * 31 + Arrays.hashCode(this.field4843);
		return var3;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class469)) {
			return false;
		} else {
			class469 var2 = (class469)var1;

			for (int var3 = 0; var3 < 16; ++var3) {
				if (this.field4843[var3] != var2.field4843[var3]) {
					return false;
				}
			}

			return true;
		}
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method8634();
		this.method8625();

		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.field4843[var3 + var2 * 4];
				if (Math.sqrt((double)(var4 * var4)) < 9.999999747378752E-5D) {
					var4 = 0.0F;
				}

				var1.append(var4);
			}

			var1.append("\n");
		}

		return var1.toString();
	}
}
