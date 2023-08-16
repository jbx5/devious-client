import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rz")
public final class class450 {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lrz;"
	)
	public static class450[] field4737;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	public static final class450 field4740;
	@ObfuscatedName("ac")
	public float[] field4739;

	static {
		field4737 = new class450[0];
		class272.method5502(100);
		field4740 = new class450();
	}

	public class450() {
		this.field4739 = new float[16];
		this.method8194();
	}

	@ObfuscatedSignature(
		descriptor = "(Lrz;)V"
	)
	public class450(class450 var1) {
		this.field4739 = new float[16];
		this.method8221(var1);
	}

	@ObfuscatedSignature(
		descriptor = "(Ltm;Z)V"
	)
	public class450(Buffer var1, boolean var2) {
		this.field4739 = new float[16];
		this.method8232(var1, var2);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1723077119"
	)
	public void method8235() {
		synchronized(field4737) {
			if (class462.field4778 < GrandExchangeOfferOwnWorldComparator.field518 - 1) {
				field4737[++class462.field4778 - 1] = this;
			}

		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ltm;ZI)V",
		garbageValue = "1560038466"
	)
	void method8232(Buffer var1, boolean var2) {
		if (var2) {
			class451 var13 = new class451();
			int var6 = var1.readShort();
			var6 &= 16383;
			float var5 = (float)(6.283185307179586D * (double)((float)var6 / 16384.0F));
			var13.method8257(var5);
			int var9 = var1.readShort();
			var9 &= 16383;
			float var8 = (float)((double)((float)var9 / 16384.0F) * 6.283185307179586D);
			var13.method8261(var8);
			int var12 = var1.readShort();
			var12 &= 16383;
			float var11 = (float)((double)((float)var12 / 16384.0F) * 6.283185307179586D);
			var13.method8258(var11);
			var13.method8259((float)var1.readShort(), (float)var1.readShort(), (float)var1.readShort());
			this.method8189(var13);
		} else {
			for (int var3 = 0; var3 < 16; ++var3) {
				this.field4739[var3] = var1.method9066();
			}
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "-57"
	)
	float[] method8192() {
		float[] var1 = new float[3];
		if ((double)this.field4739[2] < 0.999D && (double)this.field4739[2] > -0.999D) {
			var1[1] = (float)(-Math.asin((double)this.field4739[2]));
			double var2 = Math.cos((double)var1[1]);
			var1[0] = (float)Math.atan2((double)this.field4739[6] / var2, (double)this.field4739[10] / var2);
			var1[2] = (float)Math.atan2((double)this.field4739[1] / var2, (double)this.field4739[0] / var2);
		} else {
			var1[0] = 0.0F;
			var1[1] = (float)Math.atan2((double)this.field4739[2], 0.0D);
			var1[2] = (float)Math.atan2((double)(-this.field4739[9]), (double)this.field4739[5]);
		}

		return var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "1952444493"
	)
	public float[] method8193() {
		float[] var1 = new float[]{(float)(-Math.asin((double)this.field4739[6])), 0.0F, 0.0F};
		double var2 = Math.cos((double)var1[0]);
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005D) {
			var4 = (double)this.field4739[2];
			var6 = (double)this.field4739[10];
			double var8 = (double)this.field4739[4];
			double var10 = (double)this.field4739[5];
			var1[1] = (float)Math.atan2(var4, var6);
			var1[2] = (float)Math.atan2(var8, var10);
		} else {
			var4 = (double)this.field4739[1];
			var6 = (double)this.field4739[0];
			if (this.field4739[6] < 0.0F) {
				var1[1] = (float)Math.atan2(var4, var6);
			} else {
				var1[1] = (float)(-Math.atan2(var4, var6));
			}

			var1[2] = 0.0F;
		}

		return var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1131918254"
	)
	public void method8194() {
		this.field4739[0] = 1.0F;
		this.field4739[1] = 0.0F;
		this.field4739[2] = 0.0F;
		this.field4739[3] = 0.0F;
		this.field4739[4] = 0.0F;
		this.field4739[5] = 1.0F;
		this.field4739[6] = 0.0F;
		this.field4739[7] = 0.0F;
		this.field4739[8] = 0.0F;
		this.field4739[9] = 0.0F;
		this.field4739[10] = 1.0F;
		this.field4739[11] = 0.0F;
		this.field4739[12] = 0.0F;
		this.field4739[13] = 0.0F;
		this.field4739[14] = 0.0F;
		this.field4739[15] = 1.0F;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "109"
	)
	public void method8195() {
		this.field4739[0] = 0.0F;
		this.field4739[1] = 0.0F;
		this.field4739[2] = 0.0F;
		this.field4739[3] = 0.0F;
		this.field4739[4] = 0.0F;
		this.field4739[5] = 0.0F;
		this.field4739[6] = 0.0F;
		this.field4739[7] = 0.0F;
		this.field4739[8] = 0.0F;
		this.field4739[9] = 0.0F;
		this.field4739[10] = 0.0F;
		this.field4739[11] = 0.0F;
		this.field4739[12] = 0.0F;
		this.field4739[13] = 0.0F;
		this.field4739[14] = 0.0F;
		this.field4739[15] = 0.0F;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lrz;I)V",
		garbageValue = "1658923125"
	)
	public void method8221(class450 var1) {
		System.arraycopy(var1.field4739, 0, this.field4739, 0, 16);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "54"
	)
	public void method8197(float var1) {
		this.method8198(var1, var1, var1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(FFFB)V",
		garbageValue = "0"
	)
	public void method8198(float var1, float var2, float var3) {
		this.method8194();
		this.field4739[0] = var1;
		this.field4739[5] = var2;
		this.field4739[10] = var3;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lrz;I)V",
		garbageValue = "1420506541"
	)
	public void method8199(class450 var1) {
		for (int var2 = 0; var2 < this.field4739.length; ++var2) {
			float[] var10000 = this.field4739;
			var10000[var2] += var1.field4739[var2];
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lrz;I)V",
		garbageValue = "2026698221"
	)
	public void method8237(class450 var1) {
		float var2 = this.field4739[2] * var1.field4739[8] + var1.field4739[0] * this.field4739[0] + var1.field4739[4] * this.field4739[1] + var1.field4739[12] * this.field4739[3];
		float var3 = this.field4739[0] * var1.field4739[1] + var1.field4739[5] * this.field4739[1] + var1.field4739[9] * this.field4739[2] + this.field4739[3] * var1.field4739[13];
		float var4 = var1.field4739[14] * this.field4739[3] + this.field4739[2] * var1.field4739[10] + var1.field4739[6] * this.field4739[1] + var1.field4739[2] * this.field4739[0];
		float var5 = this.field4739[0] * var1.field4739[3] + var1.field4739[7] * this.field4739[1] + this.field4739[2] * var1.field4739[11] + this.field4739[3] * var1.field4739[15];
		float var6 = this.field4739[7] * var1.field4739[12] + this.field4739[4] * var1.field4739[0] + this.field4739[5] * var1.field4739[4] + var1.field4739[8] * this.field4739[6];
		float var7 = this.field4739[6] * var1.field4739[9] + var1.field4739[1] * this.field4739[4] + var1.field4739[5] * this.field4739[5] + this.field4739[7] * var1.field4739[13];
		float var8 = this.field4739[7] * var1.field4739[14] + this.field4739[5] * var1.field4739[6] + this.field4739[4] * var1.field4739[2] + var1.field4739[10] * this.field4739[6];
		float var9 = var1.field4739[15] * this.field4739[7] + this.field4739[6] * var1.field4739[11] + this.field4739[4] * var1.field4739[3] + this.field4739[5] * var1.field4739[7];
		float var10 = var1.field4739[12] * this.field4739[11] + this.field4739[10] * var1.field4739[8] + var1.field4739[4] * this.field4739[9] + this.field4739[8] * var1.field4739[0];
		float var11 = this.field4739[11] * var1.field4739[13] + this.field4739[9] * var1.field4739[5] + var1.field4739[1] * this.field4739[8] + var1.field4739[9] * this.field4739[10];
		float var12 = var1.field4739[14] * this.field4739[11] + this.field4739[9] * var1.field4739[6] + var1.field4739[2] * this.field4739[8] + this.field4739[10] * var1.field4739[10];
		float var13 = var1.field4739[15] * this.field4739[11] + var1.field4739[11] * this.field4739[10] + var1.field4739[7] * this.field4739[9] + this.field4739[8] * var1.field4739[3];
		float var14 = this.field4739[14] * var1.field4739[8] + var1.field4739[0] * this.field4739[12] + this.field4739[13] * var1.field4739[4] + this.field4739[15] * var1.field4739[12];
		float var15 = var1.field4739[13] * this.field4739[15] + var1.field4739[5] * this.field4739[13] + this.field4739[12] * var1.field4739[1] + var1.field4739[9] * this.field4739[14];
		float var16 = this.field4739[14] * var1.field4739[10] + var1.field4739[6] * this.field4739[13] + this.field4739[12] * var1.field4739[2] + var1.field4739[14] * this.field4739[15];
		float var17 = var1.field4739[15] * this.field4739[15] + var1.field4739[3] * this.field4739[12] + this.field4739[13] * var1.field4739[7] + var1.field4739[11] * this.field4739[14];
		this.field4739[0] = var2;
		this.field4739[1] = var3;
		this.field4739[2] = var4;
		this.field4739[3] = var5;
		this.field4739[4] = var6;
		this.field4739[5] = var7;
		this.field4739[6] = var8;
		this.field4739[7] = var9;
		this.field4739[8] = var10;
		this.field4739[9] = var11;
		this.field4739[10] = var12;
		this.field4739[11] = var13;
		this.field4739[12] = var14;
		this.field4739[13] = var15;
		this.field4739[14] = var16;
		this.field4739[15] = var17;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lro;I)V",
		garbageValue = "1037679755"
	)
	public void method8240(class449 var1) {
		float var2 = var1.field4729 * var1.field4729;
		float var3 = var1.field4733 * var1.field4729;
		float var4 = var1.field4729 * var1.field4732;
		float var5 = var1.field4734 * var1.field4729;
		float var6 = var1.field4733 * var1.field4733;
		float var7 = var1.field4733 * var1.field4732;
		float var8 = var1.field4734 * var1.field4733;
		float var9 = var1.field4732 * var1.field4732;
		float var10 = var1.field4732 * var1.field4734;
		float var11 = var1.field4734 * var1.field4734;
		this.field4739[0] = var6 + var2 - var11 - var9;
		this.field4739[1] = var7 + var5 + var7 + var5;
		this.field4739[2] = var8 - var4 - var4 + var8;
		this.field4739[4] = var7 - var5 - var5 + var7;
		this.field4739[5] = var2 + var9 - var6 - var11;
		this.field4739[6] = var3 + var10 + var3 + var10;
		this.field4739[8] = var8 + var4 + var8 + var4;
		this.field4739[9] = var10 - var3 - var3 + var10;
		this.field4739[10] = var11 + var2 - var9 - var6;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lrm;I)V",
		garbageValue = "-552331483"
	)
	void method8189(class451 var1) {
		this.field4739[0] = var1.field4749;
		this.field4739[1] = var1.field4744;
		this.field4739[2] = var1.field4745;
		this.field4739[3] = 0.0F;
		this.field4739[4] = var1.field4746;
		this.field4739[5] = var1.field4748;
		this.field4739[6] = var1.field4743;
		this.field4739[7] = 0.0F;
		this.field4739[8] = var1.field4753;
		this.field4739[9] = var1.field4750;
		this.field4739[10] = var1.field4747;
		this.field4739[11] = 0.0F;
		this.field4739[12] = var1.field4752;
		this.field4739[13] = var1.field4751;
		this.field4739[14] = var1.field4754;
		this.field4739[15] = 1.0F;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "-1874677140"
	)
	float method8203() {
		return this.field4739[12] * this.field4739[9] * this.field4739[6] * this.field4739[3] + (this.field4739[8] * this.field4739[7] * this.field4739[2] * this.field4739[13] + this.field4739[8] * this.field4739[1] * this.field4739[6] * this.field4739[15] + this.field4739[14] * this.field4739[11] * this.field4739[4] * this.field4739[1] + (this.field4739[0] * this.field4739[7] * this.field4739[9] * this.field4739[14] + this.field4739[15] * this.field4739[5] * this.field4739[0] * this.field4739[10] - this.field4739[0] * this.field4739[5] * this.field4739[11] * this.field4739[14] - this.field4739[15] * this.field4739[0] * this.field4739[6] * this.field4739[9] + this.field4739[13] * this.field4739[0] * this.field4739[6] * this.field4739[11] - this.field4739[10] * this.field4739[0] * this.field4739[7] * this.field4739[13] - this.field4739[15] * this.field4739[4] * this.field4739[1] * this.field4739[10]) - this.field4739[12] * this.field4739[1] * this.field4739[6] * this.field4739[11] - this.field4739[7] * this.field4739[1] * this.field4739[8] * this.field4739[14] + this.field4739[12] * this.field4739[10] * this.field4739[7] * this.field4739[1] + this.field4739[15] * this.field4739[4] * this.field4739[2] * this.field4739[9] - this.field4739[13] * this.field4739[11] * this.field4739[4] * this.field4739[2] - this.field4739[15] * this.field4739[8] * this.field4739[2] * this.field4739[5] + this.field4739[11] * this.field4739[2] * this.field4739[5] * this.field4739[12] - this.field4739[9] * this.field4739[7] * this.field4739[2] * this.field4739[12] - this.field4739[14] * this.field4739[3] * this.field4739[4] * this.field4739[9] + this.field4739[13] * this.field4739[10] * this.field4739[4] * this.field4739[3] + this.field4739[14] * this.field4739[8] * this.field4739[5] * this.field4739[3] - this.field4739[12] * this.field4739[3] * this.field4739[5] * this.field4739[10] - this.field4739[6] * this.field4739[3] * this.field4739[8] * this.field4739[13]);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-93"
	)
	public void method8254() {
		float var1 = 1.0F / this.method8203();
		float var2 = (this.field4739[11] * this.field4739[6] * this.field4739[13] + (this.field4739[15] * this.field4739[5] * this.field4739[10] - this.field4739[14] * this.field4739[11] * this.field4739[5] - this.field4739[9] * this.field4739[6] * this.field4739[15]) + this.field4739[14] * this.field4739[7] * this.field4739[9] - this.field4739[7] * this.field4739[10] * this.field4739[13]) * var1;
		float var3 = (this.field4739[13] * this.field4739[3] * this.field4739[10] + (this.field4739[15] * -this.field4739[1] * this.field4739[10] + this.field4739[14] * this.field4739[11] * this.field4739[1] + this.field4739[9] * this.field4739[2] * this.field4739[15] - this.field4739[11] * this.field4739[2] * this.field4739[13] - this.field4739[14] * this.field4739[9] * this.field4739[3])) * var1;
		float var4 = (this.field4739[15] * this.field4739[6] * this.field4739[1] - this.field4739[1] * this.field4739[7] * this.field4739[14] - this.field4739[15] * this.field4739[2] * this.field4739[5] + this.field4739[2] * this.field4739[7] * this.field4739[13] + this.field4739[3] * this.field4739[5] * this.field4739[14] - this.field4739[13] * this.field4739[6] * this.field4739[3]) * var1;
		float var5 = (this.field4739[9] * this.field4739[3] * this.field4739[6] + (this.field4739[7] * this.field4739[1] * this.field4739[10] + this.field4739[11] * -this.field4739[1] * this.field4739[6] + this.field4739[11] * this.field4739[2] * this.field4739[5] - this.field4739[7] * this.field4739[2] * this.field4739[9] - this.field4739[5] * this.field4739[3] * this.field4739[10])) * var1;
		float var6 = (this.field4739[12] * this.field4739[10] * this.field4739[7] + (this.field4739[6] * this.field4739[8] * this.field4739[15] + this.field4739[15] * this.field4739[10] * -this.field4739[4] + this.field4739[4] * this.field4739[11] * this.field4739[14] - this.field4739[11] * this.field4739[6] * this.field4739[12] - this.field4739[14] * this.field4739[8] * this.field4739[7])) * var1;
		float var7 = (this.field4739[2] * this.field4739[11] * this.field4739[12] + (this.field4739[0] * this.field4739[10] * this.field4739[15] - this.field4739[14] * this.field4739[0] * this.field4739[11] - this.field4739[15] * this.field4739[2] * this.field4739[8]) + this.field4739[14] * this.field4739[8] * this.field4739[3] - this.field4739[3] * this.field4739[10] * this.field4739[12]) * var1;
		float var8 = (this.field4739[15] * this.field4739[2] * this.field4739[4] + this.field4739[15] * this.field4739[6] * -this.field4739[0] + this.field4739[0] * this.field4739[7] * this.field4739[14] - this.field4739[7] * this.field4739[2] * this.field4739[12] - this.field4739[3] * this.field4739[4] * this.field4739[14] + this.field4739[12] * this.field4739[3] * this.field4739[6]) * var1;
		float var9 = (this.field4739[10] * this.field4739[4] * this.field4739[3] + this.field4739[0] * this.field4739[6] * this.field4739[11] - this.field4739[10] * this.field4739[0] * this.field4739[7] - this.field4739[2] * this.field4739[4] * this.field4739[11] + this.field4739[7] * this.field4739[2] * this.field4739[8] - this.field4739[8] * this.field4739[6] * this.field4739[3]) * var1;
		float var10 = (this.field4739[15] * this.field4739[4] * this.field4739[9] - this.field4739[13] * this.field4739[4] * this.field4739[11] - this.field4739[15] * this.field4739[5] * this.field4739[8] + this.field4739[11] * this.field4739[5] * this.field4739[12] + this.field4739[13] * this.field4739[8] * this.field4739[7] - this.field4739[12] * this.field4739[9] * this.field4739[7]) * var1;
		float var11 = var1 * (this.field4739[15] * this.field4739[9] * -this.field4739[0] + this.field4739[13] * this.field4739[0] * this.field4739[11] + this.field4739[1] * this.field4739[8] * this.field4739[15] - this.field4739[11] * this.field4739[1] * this.field4739[12] - this.field4739[8] * this.field4739[3] * this.field4739[13] + this.field4739[9] * this.field4739[3] * this.field4739[12]);
		float var12 = (this.field4739[4] * this.field4739[3] * this.field4739[13] + this.field4739[12] * this.field4739[1] * this.field4739[7] + (this.field4739[15] * this.field4739[5] * this.field4739[0] - this.field4739[13] * this.field4739[0] * this.field4739[7] - this.field4739[1] * this.field4739[4] * this.field4739[15]) - this.field4739[12] * this.field4739[3] * this.field4739[5]) * var1;
		float var13 = var1 * (this.field4739[8] * this.field4739[3] * this.field4739[5] + (-this.field4739[0] * this.field4739[5] * this.field4739[11] + this.field4739[9] * this.field4739[7] * this.field4739[0] + this.field4739[4] * this.field4739[1] * this.field4739[11] - this.field4739[8] * this.field4739[1] * this.field4739[7] - this.field4739[3] * this.field4739[4] * this.field4739[9]));
		float var14 = (this.field4739[12] * this.field4739[6] * this.field4739[9] + (this.field4739[14] * this.field4739[9] * -this.field4739[4] + this.field4739[13] * this.field4739[10] * this.field4739[4] + this.field4739[8] * this.field4739[5] * this.field4739[14] - this.field4739[12] * this.field4739[10] * this.field4739[5] - this.field4739[8] * this.field4739[6] * this.field4739[13])) * var1;
		float var15 = (this.field4739[13] * this.field4739[8] * this.field4739[2] + this.field4739[0] * this.field4739[9] * this.field4739[14] - this.field4739[13] * this.field4739[0] * this.field4739[10] - this.field4739[1] * this.field4739[8] * this.field4739[14] + this.field4739[1] * this.field4739[10] * this.field4739[12] - this.field4739[12] * this.field4739[2] * this.field4739[9]) * var1;
		float var16 = var1 * (-this.field4739[0] * this.field4739[5] * this.field4739[14] + this.field4739[6] * this.field4739[0] * this.field4739[13] + this.field4739[14] * this.field4739[1] * this.field4739[4] - this.field4739[6] * this.field4739[1] * this.field4739[12] - this.field4739[4] * this.field4739[2] * this.field4739[13] + this.field4739[2] * this.field4739[5] * this.field4739[12]);
		float var17 = (this.field4739[5] * this.field4739[0] * this.field4739[10] - this.field4739[0] * this.field4739[6] * this.field4739[9] - this.field4739[1] * this.field4739[4] * this.field4739[10] + this.field4739[1] * this.field4739[6] * this.field4739[8] + this.field4739[2] * this.field4739[4] * this.field4739[9] - this.field4739[8] * this.field4739[2] * this.field4739[5]) * var1;
		this.field4739[0] = var2;
		this.field4739[1] = var3;
		this.field4739[2] = var4;
		this.field4739[3] = var5;
		this.field4739[4] = var6;
		this.field4739[5] = var7;
		this.field4739[6] = var8;
		this.field4739[7] = var9;
		this.field4739[8] = var10;
		this.field4739[9] = var11;
		this.field4739[10] = var12;
		this.field4739[11] = var13;
		this.field4739[12] = var14;
		this.field4739[13] = var15;
		this.field4739[14] = var16;
		this.field4739[15] = var17;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "6"
	)
	public float[] method8205() {
		float[] var1 = new float[3];
		class448 var2 = new class448(this.field4739[0], this.field4739[1], this.field4739[2]);
		class448 var3 = new class448(this.field4739[4], this.field4739[5], this.field4739[6]);
		class448 var4 = new class448(this.field4739[8], this.field4739[9], this.field4739[10]);
		var1[0] = var2.method8152();
		var1[1] = var3.method8152();
		var1[2] = var4.method8152();
		return var1;
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method8193();
		this.method8192();

		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.field4739[var3 + var2 * 4];
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
		int var3 = var2 * 31 + Arrays.hashCode(this.field4739);
		return var3;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class450)) {
			return false;
		} else {
			class450 var2 = (class450)var1;

			for (int var3 = 0; var3 < 16; ++var3) {
				if (this.field4739[var3] != var2.field4739[var3]) {
					return false;
				}
			}

			return true;
		}
	}
}
