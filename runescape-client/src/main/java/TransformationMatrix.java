import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qf")
@Implements("TransformationMatrix")
public final class TransformationMatrix {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lqf;"
	)
	static TransformationMatrix[] field4734;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -661875089
	)
	static int field4735;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 378295407
	)
	static int field4738;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	public static final TransformationMatrix field4733;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lvt;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;
	@ObfuscatedName("ax")
	public float[] field4737;

	static {
		field4734 = new TransformationMatrix[0];
		SequenceDefinition.method4344(100);
		field4733 = new TransformationMatrix();
	}

	public TransformationMatrix() {
		this.field4737 = new float[16];
		this.method8130();
	}

	@ObfuscatedSignature(
		descriptor = "(Lqf;)V"
	)
	public TransformationMatrix(TransformationMatrix var1) {
		this.field4737 = new float[16];
		this.method8132(var1);
	}

	@ObfuscatedSignature(
		descriptor = "(Lvf;Z)V"
	)
	public TransformationMatrix(Buffer var1, boolean var2) {
		this.field4737 = new float[16];
		this.method8127(var1, var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1152413539"
	)
	public void method8125() {
		synchronized(field4734) {
			if (field4738 < field4735 - 1) {
				field4734[++field4738 - 1] = this;
			}

		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lvf;ZI)V",
		garbageValue = "-1353906288"
	)
	void method8127(Buffer var1, boolean var2) {
		if (var2) {
			class428 var4 = new class428();
			var4.method8210(Varps.method6780(var1.readShort()));
			var4.method8211(Varps.method6780(var1.readShort()));
			var4.method8212(Varps.method6780(var1.readShort()));
			var4.method8217((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort());
			this.method8152(var4);
		} else {
			for (int var3 = 0; var3 < 16; ++var3) {
				this.field4737[var3] = var1.method9934();
			}
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "9"
	)
	float[] method8128() {
		float[] var1 = new float[3];
		if ((double)this.field4737[2] < 0.999D && (double)this.field4737[2] > -0.999D) {
			var1[1] = (float)(-Math.asin((double)this.field4737[2]));
			double var2 = Math.cos((double)var1[1]);
			var1[0] = (float)Math.atan2((double)this.field4737[6] / var2, (double)this.field4737[10] / var2);
			var1[2] = (float)Math.atan2((double)this.field4737[1] / var2, (double)this.field4737[0] / var2);
		} else {
			var1[0] = 0.0F;
			var1[1] = (float)Math.atan2((double)this.field4737[2], 0.0D);
			var1[2] = (float)Math.atan2((double)(-this.field4737[9]), (double)this.field4737[5]);
		}

		return var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "1"
	)
	public float[] method8129() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4737[6])), 0.0F, 0.0F};
		double var2 = Math.cos((double)var1[0]);
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) {
			var4 = (double)this.field4737[2];
			var6 = (double)this.field4737[10];
			double var8 = (double)this.field4737[4];
			double var10 = (double)this.field4737[5];
			var1[1] = (float)Math.atan2(var4, var6);
			var1[2] = (float)Math.atan2(var8, var10);
		} else {
			var4 = (double)this.field4737[1];
			var6 = (double)this.field4737[0];
			if (this.field4737[6] < 0.0F) {
				var1[1] = (float)Math.atan2(var4, var6);
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6));
			}

			var1[2] = 0.0F;
		}

		return var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "10314"
	)
	void method8130() {
		this.field4737[0] = 1.0F;
		this.field4737[1] = 0.0F;
		this.field4737[2] = 0.0F;
		this.field4737[3] = 0.0F;
		this.field4737[4] = 0.0F;
		this.field4737[5] = 1.0F;
		this.field4737[6] = 0.0F;
		this.field4737[7] = 0.0F;
		this.field4737[8] = 0.0F;
		this.field4737[9] = 0.0F;
		this.field4737[10] = 1.0F;
		this.field4737[11] = 0.0F;
		this.field4737[12] = 0.0F;
		this.field4737[13] = 0.0F;
		this.field4737[14] = 0.0F;
		this.field4737[15] = 1.0F;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "117"
	)
	public void method8131() {
		this.field4737[0] = 0.0F;
		this.field4737[1] = 0.0F;
		this.field4737[2] = 0.0F;
		this.field4737[3] = 0.0F;
		this.field4737[4] = 0.0F;
		this.field4737[5] = 0.0F;
		this.field4737[6] = 0.0F;
		this.field4737[7] = 0.0F;
		this.field4737[8] = 0.0F;
		this.field4737[9] = 0.0F;
		this.field4737[10] = 0.0F;
		this.field4737[11] = 0.0F;
		this.field4737[12] = 0.0F;
		this.field4737[13] = 0.0F;
		this.field4737[14] = 0.0F;
		this.field4737[15] = 0.0F;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lqf;I)V",
		garbageValue = "1218100430"
	)
	public void method8132(TransformationMatrix var1) {
		System.arraycopy(var1.field4737, 0, this.field4737, 0, 16);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "0"
	)
	public void method8202(float var1) {
		this.method8133(var1, var1, var1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "1139304503"
	)
	public void method8133(float var1, float var2, float var3) {
		this.method8130();
		this.field4737[0] = var1;
		this.field4737[5] = var2;
		this.field4737[10] = var3;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lqf;I)V",
		garbageValue = "983296089"
	)
	public void method8144(TransformationMatrix var1) {
		for (int var2 = 0; var2 < this.field4737.length; ++var2) {
			float[] var10000 = this.field4737;
			var10000[var2] += var1.field4737[var2];
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lqf;I)V",
		garbageValue = "-2089771450"
	)
	public void method8135(TransformationMatrix var1) {
		float var2 = var1.field4737[4] * this.field4737[1] + this.field4737[0] * var1.field4737[0] + var1.field4737[8] * this.field4737[2] + this.field4737[3] * var1.field4737[12];
		float var3 = var1.field4737[13] * this.field4737[3] + this.field4737[1] * var1.field4737[5] + var1.field4737[1] * this.field4737[0] + var1.field4737[9] * this.field4737[2];
		float var4 = var1.field4737[6] * this.field4737[1] + var1.field4737[2] * this.field4737[0] + var1.field4737[10] * this.field4737[2] + this.field4737[3] * var1.field4737[14];
		float var5 = this.field4737[0] * var1.field4737[3] + var1.field4737[7] * this.field4737[1] + var1.field4737[11] * this.field4737[2] + this.field4737[3] * var1.field4737[15];
		float var6 = var1.field4737[8] * this.field4737[6] + this.field4737[5] * var1.field4737[4] + this.field4737[4] * var1.field4737[0] + this.field4737[7] * var1.field4737[12];
		float var7 = var1.field4737[13] * this.field4737[7] + var1.field4737[9] * this.field4737[6] + this.field4737[5] * var1.field4737[5] + var1.field4737[1] * this.field4737[4];
		float var8 = this.field4737[7] * var1.field4737[14] + var1.field4737[6] * this.field4737[5] + this.field4737[4] * var1.field4737[2] + var1.field4737[10] * this.field4737[6];
		float var9 = var1.field4737[3] * this.field4737[4] + this.field4737[5] * var1.field4737[7] + this.field4737[6] * var1.field4737[11] + var1.field4737[15] * this.field4737[7];
		float var10 = this.field4737[11] * var1.field4737[12] + this.field4737[8] * var1.field4737[0] + this.field4737[9] * var1.field4737[4] + this.field4737[10] * var1.field4737[8];
		float var11 = this.field4737[10] * var1.field4737[9] + var1.field4737[1] * this.field4737[8] + this.field4737[9] * var1.field4737[5] + this.field4737[11] * var1.field4737[13];
		float var12 = this.field4737[10] * var1.field4737[10] + this.field4737[8] * var1.field4737[2] + var1.field4737[6] * this.field4737[9] + this.field4737[11] * var1.field4737[14];
		float var13 = this.field4737[9] * var1.field4737[7] + this.field4737[8] * var1.field4737[3] + this.field4737[10] * var1.field4737[11] + var1.field4737[15] * this.field4737[11];
		float var14 = var1.field4737[8] * this.field4737[14] + this.field4737[12] * var1.field4737[0] + this.field4737[13] * var1.field4737[4] + this.field4737[15] * var1.field4737[12];
		float var15 = var1.field4737[13] * this.field4737[15] + this.field4737[12] * var1.field4737[1] + this.field4737[13] * var1.field4737[5] + this.field4737[14] * var1.field4737[9];
		float var16 = var1.field4737[14] * this.field4737[15] + var1.field4737[10] * this.field4737[14] + this.field4737[12] * var1.field4737[2] + var1.field4737[6] * this.field4737[13];
		float var17 = var1.field4737[15] * this.field4737[15] + var1.field4737[11] * this.field4737[14] + var1.field4737[7] * this.field4737[13] + var1.field4737[3] * this.field4737[12];
		this.field4737[0] = var2;
		this.field4737[1] = var3;
		this.field4737[2] = var4;
		this.field4737[3] = var5;
		this.field4737[4] = var6;
		this.field4737[5] = var7;
		this.field4737[6] = var8;
		this.field4737[7] = var9;
		this.field4737[8] = var10;
		this.field4737[9] = var11;
		this.field4737[10] = var12;
		this.field4737[11] = var13;
		this.field4737[12] = var14;
		this.field4737[13] = var15;
		this.field4737[14] = var16;
		this.field4737[15] = var17;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lqh;I)V",
		garbageValue = "213992596"
	)
	public void method8136(class421 var1) {
		float var2 = var1.field4704.field4731 * var1.field4704.field4731;
		float var3 = var1.field4704.field4731 * var1.field4704.field4728;
		float var4 = var1.field4704.field4732 * var1.field4704.field4731;
		float var5 = var1.field4704.field4730 * var1.field4704.field4731;
		float var6 = var1.field4704.field4728 * var1.field4704.field4728;
		float var7 = var1.field4704.field4732 * var1.field4704.field4728;
		float var8 = var1.field4704.field4730 * var1.field4704.field4728;
		float var9 = var1.field4704.field4732 * var1.field4704.field4732;
		float var10 = var1.field4704.field4732 * var1.field4704.field4730;
		float var11 = var1.field4704.field4730 * var1.field4704.field4730;
		this.field4737[0] = var2 + var6 - var11 - var9;
		this.field4737[1] = var7 + var5 + var7 + var5;
		this.field4737[2] = var8 + (var8 - var4 - var4);
		this.field4737[4] = var7 - var5 - var5 + var7;
		this.field4737[5] = var9 + var2 - var6 - var11;
		this.field4737[6] = var10 + var3 + var10 + var3;
		this.field4737[8] = var8 + var8 + var4 + var4;
		this.field4737[9] = var10 + (var10 - var3 - var3);
		this.field4737[10] = var11 + var2 - var9 - var6;
		float[] var12 = this.field4737;
		float[] var13 = this.field4737;
		this.field4737[11] = 0.0F;
		var13[7] = 0.0F;
		var12[3] = 0.0F;
		this.field4737[12] = var1.field4707.field4716;
		this.field4737[13] = var1.field4707.field4719;
		this.field4737[14] = var1.field4707.field4720;
		this.field4737[15] = 1.0F;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lqd;I)V",
		garbageValue = "299886161"
	)
	public void method8137(class426 var1) {
		float var2 = var1.field4731 * var1.field4731;
		float var3 = var1.field4728 * var1.field4731;
		float var4 = var1.field4731 * var1.field4732;
		float var5 = var1.field4731 * var1.field4730;
		float var6 = var1.field4728 * var1.field4728;
		float var7 = var1.field4728 * var1.field4732;
		float var8 = var1.field4730 * var1.field4728;
		float var9 = var1.field4732 * var1.field4732;
		float var10 = var1.field4732 * var1.field4730;
		float var11 = var1.field4730 * var1.field4730;
		this.field4737[0] = var2 + var6 - var11 - var9;
		this.field4737[1] = var5 + var7 + var7 + var5;
		this.field4737[2] = var8 + (var8 - var4 - var4);
		this.field4737[4] = var7 + (var7 - var5 - var5);
		this.field4737[5] = var9 + var2 - var6 - var11;
		this.field4737[6] = var3 + var10 + var10 + var3;
		this.field4737[8] = var8 + var4 + var8 + var4;
		this.field4737[9] = var10 - var3 - var3 + var10;
		this.field4737[10] = var11 + var2 - var9 - var6;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lqx;I)V",
		garbageValue = "716692522"
	)
	public void method8152(class428 var1) {
		this.field4737[0] = var1.field4750;
		this.field4737[1] = var1.field4752;
		this.field4737[2] = var1.field4743;
		this.field4737[3] = 0.0F;
		this.field4737[4] = var1.field4744;
		this.field4737[5] = var1.field4745;
		this.field4737[6] = var1.field4746;
		this.field4737[7] = 0.0F;
		this.field4737[8] = var1.field4747;
		this.field4737[9] = var1.field4742;
		this.field4737[10] = var1.field4749;
		this.field4737[11] = 0.0F;
		this.field4737[12] = var1.field4748;
		this.field4737[13] = var1.field4751;
		this.field4737[14] = var1.field4741;
		this.field4737[15] = 1.0F;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "-141188009"
	)
	float method8185() {
		return this.field4737[9] * this.field4737[3] * this.field4737[6] * this.field4737[12] + (this.field4737[3] * this.field4737[5] * this.field4737[8] * this.field4737[14] + this.field4737[13] * this.field4737[3] * this.field4737[4] * this.field4737[10] + (this.field4737[1] * this.field4737[6] * this.field4737[8] * this.field4737[15] + this.field4737[7] * this.field4737[0] * this.field4737[9] * this.field4737[14] + this.field4737[10] * this.field4737[0] * this.field4737[5] * this.field4737[15] - this.field4737[14] * this.field4737[5] * this.field4737[0] * this.field4737[11] - this.field4737[15] * this.field4737[9] * this.field4737[6] * this.field4737[0] + this.field4737[11] * this.field4737[6] * this.field4737[0] * this.field4737[13] - this.field4737[7] * this.field4737[0] * this.field4737[10] * this.field4737[13] - this.field4737[15] * this.field4737[1] * this.field4737[4] * this.field4737[10] + this.field4737[1] * this.field4737[4] * this.field4737[11] * this.field4737[14] - this.field4737[12] * this.field4737[11] * this.field4737[6] * this.field4737[1] - this.field4737[14] * this.field4737[8] * this.field4737[1] * this.field4737[7] + this.field4737[12] * this.field4737[10] * this.field4737[1] * this.field4737[7] + this.field4737[9] * this.field4737[2] * this.field4737[4] * this.field4737[15] - this.field4737[2] * this.field4737[4] * this.field4737[11] * this.field4737[13] - this.field4737[8] * this.field4737[2] * this.field4737[5] * this.field4737[15] + this.field4737[12] * this.field4737[5] * this.field4737[2] * this.field4737[11] + this.field4737[13] * this.field4737[7] * this.field4737[2] * this.field4737[8] - this.field4737[12] * this.field4737[2] * this.field4737[7] * this.field4737[9] - this.field4737[14] * this.field4737[3] * this.field4737[4] * this.field4737[9]) - this.field4737[12] * this.field4737[10] * this.field4737[5] * this.field4737[3] - this.field4737[13] * this.field4737[6] * this.field4737[3] * this.field4737[8]);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-62"
	)
	public void method8139() {
		float var1 = 1.0F / this.method8185();
		float var2 = (this.field4737[15] * this.field4737[10] * this.field4737[5] - this.field4737[11] * this.field4737[5] * this.field4737[14] - this.field4737[6] * this.field4737[9] * this.field4737[15] + this.field4737[6] * this.field4737[11] * this.field4737[13] + this.field4737[14] * this.field4737[9] * this.field4737[7] - this.field4737[10] * this.field4737[7] * this.field4737[13]) * var1;
		float var3 = var1 * (this.field4737[10] * this.field4737[3] * this.field4737[13] + (this.field4737[1] * this.field4737[11] * this.field4737[14] + this.field4737[10] * -this.field4737[1] * this.field4737[15] + this.field4737[15] * this.field4737[2] * this.field4737[9] - this.field4737[13] * this.field4737[11] * this.field4737[2] - this.field4737[14] * this.field4737[9] * this.field4737[3]));
		float var4 = (this.field4737[2] * this.field4737[7] * this.field4737[13] + (this.field4737[6] * this.field4737[1] * this.field4737[15] - this.field4737[14] * this.field4737[1] * this.field4737[7] - this.field4737[2] * this.field4737[5] * this.field4737[15]) + this.field4737[14] * this.field4737[3] * this.field4737[5] - this.field4737[6] * this.field4737[3] * this.field4737[13]) * var1;
		float var5 = (this.field4737[11] * -this.field4737[1] * this.field4737[6] + this.field4737[7] * this.field4737[1] * this.field4737[10] + this.field4737[2] * this.field4737[5] * this.field4737[11] - this.field4737[2] * this.field4737[7] * this.field4737[9] - this.field4737[5] * this.field4737[3] * this.field4737[10] + this.field4737[9] * this.field4737[6] * this.field4737[3]) * var1;
		float var6 = (this.field4737[15] * this.field4737[8] * this.field4737[6] + this.field4737[11] * this.field4737[4] * this.field4737[14] + this.field4737[10] * -this.field4737[4] * this.field4737[15] - this.field4737[12] * this.field4737[11] * this.field4737[6] - this.field4737[14] * this.field4737[8] * this.field4737[7] + this.field4737[12] * this.field4737[7] * this.field4737[10]) * var1;
		float var7 = (this.field4737[3] * this.field4737[8] * this.field4737[14] + this.field4737[10] * this.field4737[0] * this.field4737[15] - this.field4737[14] * this.field4737[0] * this.field4737[11] - this.field4737[15] * this.field4737[2] * this.field4737[8] + this.field4737[2] * this.field4737[11] * this.field4737[12] - this.field4737[12] * this.field4737[10] * this.field4737[3]) * var1;
		float var8 = (this.field4737[6] * -this.field4737[0] * this.field4737[15] + this.field4737[7] * this.field4737[0] * this.field4737[14] + this.field4737[15] * this.field4737[4] * this.field4737[2] - this.field4737[7] * this.field4737[2] * this.field4737[12] - this.field4737[14] * this.field4737[4] * this.field4737[3] + this.field4737[3] * this.field4737[6] * this.field4737[12]) * var1;
		float var9 = (this.field4737[8] * this.field4737[2] * this.field4737[7] + (this.field4737[11] * this.field4737[6] * this.field4737[0] - this.field4737[10] * this.field4737[7] * this.field4737[0] - this.field4737[11] * this.field4737[4] * this.field4737[2]) + this.field4737[10] * this.field4737[3] * this.field4737[4] - this.field4737[8] * this.field4737[6] * this.field4737[3]) * var1;
		float var10 = (this.field4737[13] * this.field4737[8] * this.field4737[7] + this.field4737[15] * this.field4737[9] * this.field4737[4] - this.field4737[4] * this.field4737[11] * this.field4737[13] - this.field4737[5] * this.field4737[8] * this.field4737[15] + this.field4737[11] * this.field4737[5] * this.field4737[12] - this.field4737[9] * this.field4737[7] * this.field4737[12]) * var1;
		float var11 = (this.field4737[0] * this.field4737[11] * this.field4737[13] + -this.field4737[0] * this.field4737[9] * this.field4737[15] + this.field4737[8] * this.field4737[1] * this.field4737[15] - this.field4737[1] * this.field4737[11] * this.field4737[12] - this.field4737[8] * this.field4737[3] * this.field4737[13] + this.field4737[3] * this.field4737[9] * this.field4737[12]) * var1;
		float var12 = (this.field4737[7] * this.field4737[1] * this.field4737[12] + (this.field4737[15] * this.field4737[0] * this.field4737[5] - this.field4737[13] * this.field4737[7] * this.field4737[0] - this.field4737[1] * this.field4737[4] * this.field4737[15]) + this.field4737[4] * this.field4737[3] * this.field4737[13] - this.field4737[3] * this.field4737[5] * this.field4737[12]) * var1;
		float var13 = (this.field4737[3] * this.field4737[5] * this.field4737[8] + (this.field4737[11] * this.field4737[4] * this.field4737[1] + this.field4737[0] * this.field4737[7] * this.field4737[9] + this.field4737[5] * -this.field4737[0] * this.field4737[11] - this.field4737[8] * this.field4737[7] * this.field4737[1] - this.field4737[9] * this.field4737[4] * this.field4737[3])) * var1;
		float var14 = (this.field4737[12] * this.field4737[6] * this.field4737[9] + (this.field4737[14] * this.field4737[8] * this.field4737[5] + this.field4737[14] * this.field4737[9] * -this.field4737[4] + this.field4737[4] * this.field4737[10] * this.field4737[13] - this.field4737[12] * this.field4737[5] * this.field4737[10] - this.field4737[13] * this.field4737[8] * this.field4737[6])) * var1;
		float var15 = (this.field4737[13] * this.field4737[8] * this.field4737[2] + this.field4737[14] * this.field4737[0] * this.field4737[9] - this.field4737[13] * this.field4737[10] * this.field4737[0] - this.field4737[8] * this.field4737[1] * this.field4737[14] + this.field4737[12] * this.field4737[1] * this.field4737[10] - this.field4737[2] * this.field4737[9] * this.field4737[12]) * var1;
		float var16 = (this.field4737[12] * this.field4737[5] * this.field4737[2] + (this.field4737[14] * -this.field4737[0] * this.field4737[5] + this.field4737[0] * this.field4737[6] * this.field4737[13] + this.field4737[14] * this.field4737[4] * this.field4737[1] - this.field4737[6] * this.field4737[1] * this.field4737[12] - this.field4737[13] * this.field4737[4] * this.field4737[2])) * var1;
		float var17 = (this.field4737[0] * this.field4737[5] * this.field4737[10] - this.field4737[6] * this.field4737[0] * this.field4737[9] - this.field4737[10] * this.field4737[4] * this.field4737[1] + this.field4737[6] * this.field4737[1] * this.field4737[8] + this.field4737[2] * this.field4737[4] * this.field4737[9] - this.field4737[8] * this.field4737[2] * this.field4737[5]) * var1;
		this.field4737[0] = var2;
		this.field4737[1] = var3;
		this.field4737[2] = var4;
		this.field4737[3] = var5;
		this.field4737[4] = var6;
		this.field4737[5] = var7;
		this.field4737[6] = var8;
		this.field4737[7] = var9;
		this.field4737[8] = var10;
		this.field4737[9] = var11;
		this.field4737[10] = var12;
		this.field4737[11] = var13;
		this.field4737[12] = var14;
		this.field4737[13] = var15;
		this.field4737[14] = var16;
		this.field4737[15] = var17;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(FFFFS)V",
		garbageValue = "-14059"
	)
	public void method8175(float var1, float var2, float var3, float var4) {
		this.field4737[0] = var1;
		this.field4737[1] = 0.0F;
		this.field4737[2] = 0.0F;
		this.field4737[3] = 0.0F;
		this.field4737[4] = 0.0F;
		this.field4737[5] = var2;
		this.field4737[6] = 0.0F;
		this.field4737[7] = 0.0F;
		this.field4737[8] = 0.0F;
		this.field4737[9] = 0.0F;
		this.field4737[10] = var3;
		this.field4737[11] = 0.0F;
		this.field4737[12] = 0.0F;
		this.field4737[13] = 0.0F;
		this.field4737[14] = 0.0F;
		this.field4737[15] = var4;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(FFF[FI)V",
		garbageValue = "1855652676"
	)
	@Export("transformPoint")
	public void transformPoint(float var1, float var2, float var3, float[] var4) {
		var4[0] = this.field4737[12] + var1 * this.field4737[0] + var2 * this.field4737[4] + this.field4737[8] * var3;
		var4[1] = this.field4737[9] * var3 + this.field4737[5] * var2 + this.field4737[1] * var1 + this.field4737[13];
		var4[2] = this.field4737[14] + this.field4737[2] * var1 + this.field4737[6] * var2 + var3 * this.field4737[10];
		if (var4.length > 3) {
			var4[3] = this.field4737[3] * var1 + this.field4737[7] * var2 + this.field4737[11] * var3 + this.field4737[15];
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(FFFI)F",
		garbageValue = "-2125951925"
	)
	public float method8141(float var1, float var2, float var3) {
		return this.field4737[8] * var3 + this.field4737[4] * var2 + var1 * this.field4737[0] + this.field4737[12];
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(FFFI)F",
		garbageValue = "844691753"
	)
	public float method8142(float var1, float var2, float var3) {
		return this.field4737[13] + var1 * this.field4737[1] + var2 * this.field4737[5] + var3 * this.field4737[9];
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(FFFI)F",
		garbageValue = "1626167259"
	)
	public float method8143(float var1, float var2, float var3) {
		return var3 * this.field4737[10] + var2 * this.field4737[6] + this.field4737[2] * var1 + this.field4737[14];
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-1345800832"
	)
	public float[] method8145() {
		float[] var1 = new float[3];
		class425 var2 = new class425(this.field4737[0], this.field4737[1], this.field4737[2]);
		class425 var3 = new class425(this.field4737[4], this.field4737[5], this.field4737[6]);
		class425 var4 = new class425(this.field4737[8], this.field4737[9], this.field4737[10]);
		var1[0] = var2.method8073();
		var1[1] = var3.method8073();
		var1[2] = var4.method8073();
		return var1;
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method8129();
		this.method8128();

		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.field4737[var3 + var2 * 4];
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
		int var3 = 31 * var2 + Arrays.hashCode(this.field4737);
		return var3;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof TransformationMatrix)) {
			return false;
		} else {
			TransformationMatrix var2 = (TransformationMatrix)var1;

			for (int var3 = 0; var3 < 16; ++var3) {
				if (this.field4737[var3] != var2.field4737[var3]) {
					return false;
				}
			}

			return true;
		}
	}
}
