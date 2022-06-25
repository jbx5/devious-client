import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.rs.ScriptOpcodes;
import java.util.Arrays;
@ObfuscatedName("ny")
public final class class387 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "[Lny;")
	static class387[] field4393;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 1126407779)
	static int field4396;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lny;")
	public static final class387 field4397;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 1178194851)
	static int field4395;

	@ObfuscatedName("e")
	public float[] field4394;

	static {
		field4393 = new class387[0];
		field4396 = 100;
		field4393 = new class387[100];
		field4395 = 0;
		field4397 = new class387();
	}

	public class387() {
		this.field4394 = new float[16];
		this.method6956();
	}

	@ObfuscatedSignature(descriptor = "(Lny;)V")
	public class387(class387 var1) {
		this.field4394 = new float[16];
		this.method6973(var1);
	}

	@ObfuscatedSignature(descriptor = "(Lqt;Z)V")
	public class387(Buffer var1, boolean var2) {
		this.field4394 = new float[16];
		this.method6957(var1, var2);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-48")
	public void method6968() {
		synchronized(field4393) {
			if (field4395 < field4396 - 1) {
				field4393[++field4395 - 1] = this;
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lqt;ZS)V", garbageValue = "128")
	void method6957(Buffer var1, boolean var2) {
		if (var2) {
			class388 var13 = new class388();
			int var6 = var1.readShort();
			var6 &= 16383;
			float var5 = ((float) (((double) (((float) (var6)) / 16384.0F)) * 6.283185307179586));
			var13.method7029(var5);
			int var9 = var1.readShort();
			var9 &= 16383;
			float var8 = ((float) (6.283185307179586 * ((double) (((float) (var9)) / 16384.0F))));
			var13.method7027(var8);
			int var12 = var1.readShort();
			var12 &= 16383;
			float var11 = ((float) (6.283185307179586 * ((double) (((float) (var12)) / 16384.0F))));
			var13.method7039(var11);
			var13.method7026(((float) (var1.readShort())), ((float) (var1.readShort())), ((float) (var1.readShort())));
			this.method6979(var13);
		} else {
			for (int var3 = 0; var3 < 16; ++var3) {
				this.field4394[var3] = var1.method7740();
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)[F", garbageValue = "1345466465")
	float[] method6958() {
		float[] var1 = new float[3];
		if (((double) (this.field4394[2])) < 0.999 && ((double) (this.field4394[2])) > -0.999) {
			var1[1] = ((float) (-Math.asin(((double) (this.field4394[2])))));
			double var2 = Math.cos(((double) (var1[1])));
			var1[0] = ((float) (Math.atan2(((double) (this.field4394[6])) / var2, ((double) (this.field4394[10])) / var2)));
			var1[2] = ((float) (Math.atan2(((double) (this.field4394[1])) / var2, ((double) (this.field4394[0])) / var2)));
		} else {
			var1[0] = 0.0F;
			var1[1] = ((float) (Math.atan2(((double) (this.field4394[2])), 0.0)));
			var1[2] = ((float) (Math.atan2(((double) (-this.field4394[9])), ((double) (this.field4394[5])))));
		}
		return var1;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(B)[F", garbageValue = "10")
	public float[] method6959() {
		float[] var1 = new float[]{ ((float) (-Math.asin(((double) (this.field4394[6]))))), 0.0F, 0.0F };
		double var2 = Math.cos(((double) (var1[0])));
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005) {
			var4 = ((double) (this.field4394[2]));
			var6 = ((double) (this.field4394[10]));
			double var8 = ((double) (this.field4394[4]));
			double var10 = ((double) (this.field4394[5]));
			var1[1] = ((float) (Math.atan2(var4, var6)));
			var1[2] = ((float) (Math.atan2(var8, var10)));
		} else {
			var4 = ((double) (this.field4394[1]));
			var6 = ((double) (this.field4394[0]));
			if (this.field4394[6] < 0.0F) {
				var1[1] = ((float) (Math.atan2(var4, var6)));
			} else {
				var1[1] = ((float) (-Math.atan2(var4, var6)));
			}
			var1[2] = 0.0F;
		}
		return var1;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-927373903")
	void method6956() {
		this.field4394[0] = 1.0F;
		this.field4394[1] = 0.0F;
		this.field4394[2] = 0.0F;
		this.field4394[3] = 0.0F;
		this.field4394[4] = 0.0F;
		this.field4394[5] = 1.0F;
		this.field4394[6] = 0.0F;
		this.field4394[7] = 0.0F;
		this.field4394[8] = 0.0F;
		this.field4394[9] = 0.0F;
		this.field4394[10] = 1.0F;
		this.field4394[11] = 0.0F;
		this.field4394[12] = 0.0F;
		this.field4394[13] = 0.0F;
		this.field4394[14] = 0.0F;
		this.field4394[15] = 1.0F;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "540046278")
	public void method7016() {
		this.field4394[0] = 0.0F;
		this.field4394[1] = 0.0F;
		this.field4394[2] = 0.0F;
		this.field4394[3] = 0.0F;
		this.field4394[4] = 0.0F;
		this.field4394[5] = 0.0F;
		this.field4394[6] = 0.0F;
		this.field4394[7] = 0.0F;
		this.field4394[8] = 0.0F;
		this.field4394[9] = 0.0F;
		this.field4394[10] = 0.0F;
		this.field4394[11] = 0.0F;
		this.field4394[12] = 0.0F;
		this.field4394[13] = 0.0F;
		this.field4394[14] = 0.0F;
		this.field4394[15] = 0.0F;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Lny;B)V", garbageValue = "-5")
	public void method6973(class387 var1) {
		System.arraycopy(var1.field4394, 0, this.field4394, 0, 16);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(FI)V", garbageValue = "-1114711003")
	public void method6963(float var1) {
		this.method6964(var1, var1, var1);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(FFFI)V", garbageValue = "-700106798")
	public void method6964(float var1, float var2, float var3) {
		this.method6956();
		this.field4394[0] = var1;
		this.field4394[5] = var2;
		this.field4394[10] = var3;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lny;I)V", garbageValue = "1311675690")
	public void method6965(class387 var1) {
		for (int var2 = 0; var2 < this.field4394.length; ++var2) {
			float[] var10000 = this.field4394;
			var10000[var2] += var1.field4394[var2];
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "(Lny;B)V", garbageValue = "-20")
	public void method6962(class387 var1) {
		float var2 = this.field4394[3] * var1.field4394[12] + var1.field4394[8] * this.field4394[2] + var1.field4394[0] * this.field4394[0] + var1.field4394[4] * this.field4394[1];
		float var3 = this.field4394[2] * var1.field4394[9] + this.field4394[0] * var1.field4394[1] + this.field4394[1] * var1.field4394[5] + this.field4394[3] * var1.field4394[13];
		float var4 = var1.field4394[10] * this.field4394[2] + var1.field4394[2] * this.field4394[0] + var1.field4394[6] * this.field4394[1] + var1.field4394[14] * this.field4394[3];
		float var5 = this.field4394[3] * var1.field4394[15] + this.field4394[2] * var1.field4394[11] + var1.field4394[3] * this.field4394[0] + this.field4394[1] * var1.field4394[7];
		float var6 = var1.field4394[12] * this.field4394[7] + this.field4394[4] * var1.field4394[0] + var1.field4394[4] * this.field4394[5] + this.field4394[6] * var1.field4394[8];
		float var7 = this.field4394[5] * var1.field4394[5] + this.field4394[4] * var1.field4394[1] + this.field4394[6] * var1.field4394[9] + var1.field4394[13] * this.field4394[7];
		float var8 = this.field4394[7] * var1.field4394[14] + var1.field4394[10] * this.field4394[6] + var1.field4394[2] * this.field4394[4] + this.field4394[5] * var1.field4394[6];
		float var9 = this.field4394[6] * var1.field4394[11] + var1.field4394[3] * this.field4394[4] + this.field4394[5] * var1.field4394[7] + var1.field4394[15] * this.field4394[7];
		float var10 = this.field4394[9] * var1.field4394[4] + this.field4394[8] * var1.field4394[0] + var1.field4394[8] * this.field4394[10] + this.field4394[11] * var1.field4394[12];
		float var11 = var1.field4394[13] * this.field4394[11] + this.field4394[10] * var1.field4394[9] + this.field4394[8] * var1.field4394[1] + this.field4394[9] * var1.field4394[5];
		float var12 = this.field4394[8] * var1.field4394[2] + this.field4394[9] * var1.field4394[6] + this.field4394[10] * var1.field4394[10] + this.field4394[11] * var1.field4394[14];
		float var13 = this.field4394[10] * var1.field4394[11] + var1.field4394[7] * this.field4394[9] + this.field4394[8] * var1.field4394[3] + var1.field4394[15] * this.field4394[11];
		float var14 = this.field4394[15] * var1.field4394[12] + var1.field4394[8] * this.field4394[14] + var1.field4394[4] * this.field4394[13] + this.field4394[12] * var1.field4394[0];
		float var15 = var1.field4394[9] * this.field4394[14] + var1.field4394[1] * this.field4394[12] + this.field4394[13] * var1.field4394[5] + this.field4394[15] * var1.field4394[13];
		float var16 = this.field4394[14] * var1.field4394[10] + this.field4394[12] * var1.field4394[2] + var1.field4394[6] * this.field4394[13] + var1.field4394[14] * this.field4394[15];
		float var17 = this.field4394[13] * var1.field4394[7] + var1.field4394[3] * this.field4394[12] + this.field4394[14] * var1.field4394[11] + this.field4394[15] * var1.field4394[15];
		this.field4394[0] = var2;
		this.field4394[1] = var3;
		this.field4394[2] = var4;
		this.field4394[3] = var5;
		this.field4394[4] = var6;
		this.field4394[5] = var7;
		this.field4394[6] = var8;
		this.field4394[7] = var9;
		this.field4394[8] = var10;
		this.field4394[9] = var11;
		this.field4394[10] = var12;
		this.field4394[11] = var13;
		this.field4394[12] = var14;
		this.field4394[13] = var15;
		this.field4394[14] = var16;
		this.field4394[15] = var17;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(Lni;B)V", garbageValue = "-93")
	public void method6967(class386 var1) {
		float var2 = var1.field4391 * var1.field4391;
		float var3 = var1.field4388 * var1.field4391;
		float var4 = var1.field4391 * var1.field4387;
		float var5 = var1.field4391 * var1.field4390;
		float var6 = var1.field4388 * var1.field4388;
		float var7 = var1.field4388 * var1.field4387;
		float var8 = var1.field4390 * var1.field4388;
		float var9 = var1.field4387 * var1.field4387;
		float var10 = var1.field4387 * var1.field4390;
		float var11 = var1.field4390 * var1.field4390;
		this.field4394[0] = var2 + var6 - var11 - var9;
		this.field4394[1] = var7 + var5 + var7 + var5;
		this.field4394[2] = var8 - var4 - var4 + var8;
		this.field4394[4] = var7 - var5 - var5 + var7;
		this.field4394[5] = var9 + var2 - var6 - var11;
		this.field4394[6] = var10 + var3 + var10 + var3;
		this.field4394[8] = var8 + var8 + var4 + var4;
		this.field4394[9] = var10 + (var10 - var3 - var3);
		this.field4394[10] = var2 + var11 - var9 - var6;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "(Lnu;I)V", garbageValue = "-2099825365")
	void method6979(class388 var1) {
		this.field4394[0] = var1.field4405;
		this.field4394[1] = var1.field4400;
		this.field4394[2] = var1.field4402;
		this.field4394[3] = 0.0F;
		this.field4394[4] = var1.field4409;
		this.field4394[5] = var1.field4403;
		this.field4394[6] = var1.field4408;
		this.field4394[7] = 0.0F;
		this.field4394[8] = var1.field4401;
		this.field4394[9] = var1.field4407;
		this.field4394[10] = var1.field4406;
		this.field4394[11] = 0.0F;
		this.field4394[12] = var1.field4404;
		this.field4394[13] = var1.field4410;
		this.field4394[14] = var1.field4411;
		this.field4394[15] = 1.0F;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)F", garbageValue = "1763200209")
	float method6969() {
		return this.field4394[12] * this.field4394[9] * this.field4394[3] * this.field4394[6] + (this.field4394[14] * this.field4394[8] * this.field4394[5] * this.field4394[3] + this.field4394[10] * this.field4394[4] * this.field4394[3] * this.field4394[13] + (this.field4394[12] * this.field4394[11] * this.field4394[5] * this.field4394[2] + (this.field4394[12] * this.field4394[1] * this.field4394[7] * this.field4394[10] + (this.field4394[15] * this.field4394[1] * this.field4394[6] * this.field4394[8] + this.field4394[11] * this.field4394[0] * this.field4394[6] * this.field4394[13] + (this.field4394[15] * this.field4394[10] * this.field4394[0] * this.field4394[5] - this.field4394[14] * this.field4394[11] * this.field4394[5] * this.field4394[0] - this.field4394[15] * this.field4394[9] * this.field4394[0] * this.field4394[6]) + this.field4394[7] * this.field4394[0] * this.field4394[9] * this.field4394[14] - this.field4394[10] * this.field4394[0] * this.field4394[7] * this.field4394[13] - this.field4394[10] * this.field4394[1] * this.field4394[4] * this.field4394[15] + this.field4394[1] * this.field4394[4] * this.field4394[11] * this.field4394[14] - this.field4394[11] * this.field4394[6] * this.field4394[1] * this.field4394[12] - this.field4394[14] * this.field4394[7] * this.field4394[1] * this.field4394[8]) + this.field4394[4] * this.field4394[2] * this.field4394[9] * this.field4394[15] - this.field4394[2] * this.field4394[4] * this.field4394[11] * this.field4394[13] - this.field4394[15] * this.field4394[8] * this.field4394[5] * this.field4394[2]) + this.field4394[13] * this.field4394[7] * this.field4394[2] * this.field4394[8] - this.field4394[2] * this.field4394[7] * this.field4394[9] * this.field4394[12] - this.field4394[9] * this.field4394[4] * this.field4394[3] * this.field4394[14]) - this.field4394[10] * this.field4394[3] * this.field4394[5] * this.field4394[12] - this.field4394[13] * this.field4394[3] * this.field4394[6] * this.field4394[8]);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "961919913")
	public void method6970() {
		float var1 = 1.0F / this.method6969();
		float var2 = (this.field4394[7] * this.field4394[9] * this.field4394[14] + this.field4394[5] * this.field4394[10] * this.field4394[15] - this.field4394[14] * this.field4394[5] * this.field4394[11] - this.field4394[15] * this.field4394[6] * this.field4394[9] + this.field4394[11] * this.field4394[6] * this.field4394[13] - this.field4394[13] * this.field4394[7] * this.field4394[10]) * var1;
		float var3 = (this.field4394[14] * this.field4394[11] * this.field4394[1] + this.field4394[15] * -this.field4394[1] * this.field4394[10] + this.field4394[9] * this.field4394[2] * this.field4394[15] - this.field4394[13] * this.field4394[2] * this.field4394[11] - this.field4394[9] * this.field4394[3] * this.field4394[14] + this.field4394[10] * this.field4394[3] * this.field4394[13]) * var1;
		float var4 = (this.field4394[14] * this.field4394[3] * this.field4394[5] + this.field4394[13] * this.field4394[7] * this.field4394[2] + (this.field4394[15] * this.field4394[6] * this.field4394[1] - this.field4394[14] * this.field4394[1] * this.field4394[7] - this.field4394[2] * this.field4394[5] * this.field4394[15]) - this.field4394[13] * this.field4394[6] * this.field4394[3]) * var1;
		float var5 = var1 * (this.field4394[6] * this.field4394[3] * this.field4394[9] + (this.field4394[5] * this.field4394[2] * this.field4394[11] + this.field4394[7] * this.field4394[1] * this.field4394[10] + this.field4394[11] * -this.field4394[1] * this.field4394[6] - this.field4394[9] * this.field4394[7] * this.field4394[2] - this.field4394[10] * this.field4394[3] * this.field4394[5]));
		float var6 = (this.field4394[12] * this.field4394[7] * this.field4394[10] + (this.field4394[15] * this.field4394[10] * -this.field4394[4] + this.field4394[4] * this.field4394[11] * this.field4394[14] + this.field4394[8] * this.field4394[6] * this.field4394[15] - this.field4394[12] * this.field4394[6] * this.field4394[11] - this.field4394[7] * this.field4394[8] * this.field4394[14])) * var1;
		float var7 = var1 * (this.field4394[2] * this.field4394[11] * this.field4394[12] + (this.field4394[15] * this.field4394[10] * this.field4394[0] - this.field4394[11] * this.field4394[0] * this.field4394[14] - this.field4394[15] * this.field4394[2] * this.field4394[8]) + this.field4394[3] * this.field4394[8] * this.field4394[14] - this.field4394[10] * this.field4394[3] * this.field4394[12]);
		float var8 = (this.field4394[2] * this.field4394[4] * this.field4394[15] + this.field4394[14] * this.field4394[7] * this.field4394[0] + -this.field4394[0] * this.field4394[6] * this.field4394[15] - this.field4394[2] * this.field4394[7] * this.field4394[12] - this.field4394[3] * this.field4394[4] * this.field4394[14] + this.field4394[12] * this.field4394[3] * this.field4394[6]) * var1;
		float var9 = (this.field4394[7] * this.field4394[2] * this.field4394[8] + (this.field4394[6] * this.field4394[0] * this.field4394[11] - this.field4394[10] * this.field4394[7] * this.field4394[0] - this.field4394[2] * this.field4394[4] * this.field4394[11]) + this.field4394[4] * this.field4394[3] * this.field4394[10] - this.field4394[8] * this.field4394[3] * this.field4394[6]) * var1;
		float var10 = var1 * (this.field4394[12] * this.field4394[5] * this.field4394[11] + (this.field4394[9] * this.field4394[4] * this.field4394[15] - this.field4394[4] * this.field4394[11] * this.field4394[13] - this.field4394[8] * this.field4394[5] * this.field4394[15]) + this.field4394[8] * this.field4394[7] * this.field4394[13] - this.field4394[12] * this.field4394[9] * this.field4394[7]);
		float var11 = (this.field4394[3] * this.field4394[9] * this.field4394[12] + (this.field4394[15] * this.field4394[9] * -this.field4394[0] + this.field4394[13] * this.field4394[11] * this.field4394[0] + this.field4394[1] * this.field4394[8] * this.field4394[15] - this.field4394[11] * this.field4394[1] * this.field4394[12] - this.field4394[8] * this.field4394[3] * this.field4394[13])) * var1;
		float var12 = (this.field4394[7] * this.field4394[1] * this.field4394[12] + (this.field4394[15] * this.field4394[5] * this.field4394[0] - this.field4394[7] * this.field4394[0] * this.field4394[13] - this.field4394[15] * this.field4394[1] * this.field4394[4]) + this.field4394[3] * this.field4394[4] * this.field4394[13] - this.field4394[12] * this.field4394[5] * this.field4394[3]) * var1;
		float var13 = var1 * (this.field4394[8] * this.field4394[5] * this.field4394[3] + (this.field4394[11] * this.field4394[4] * this.field4394[1] + this.field4394[9] * this.field4394[0] * this.field4394[7] + this.field4394[11] * -this.field4394[0] * this.field4394[5] - this.field4394[1] * this.field4394[7] * this.field4394[8] - this.field4394[4] * this.field4394[3] * this.field4394[9]));
		float var14 = var1 * (this.field4394[6] * this.field4394[9] * this.field4394[12] + (this.field4394[5] * this.field4394[8] * this.field4394[14] + this.field4394[9] * -this.field4394[4] * this.field4394[14] + this.field4394[13] * this.field4394[4] * this.field4394[10] - this.field4394[12] * this.field4394[10] * this.field4394[5] - this.field4394[6] * this.field4394[8] * this.field4394[13]));
		float var15 = var1 * (this.field4394[14] * this.field4394[9] * this.field4394[0] - this.field4394[10] * this.field4394[0] * this.field4394[13] - this.field4394[14] * this.field4394[8] * this.field4394[1] + this.field4394[12] * this.field4394[10] * this.field4394[1] + this.field4394[13] * this.field4394[8] * this.field4394[2] - this.field4394[9] * this.field4394[2] * this.field4394[12]);
		float var16 = var1 * (this.field4394[12] * this.field4394[2] * this.field4394[5] + (this.field4394[1] * this.field4394[4] * this.field4394[14] + this.field4394[13] * this.field4394[6] * this.field4394[0] + this.field4394[14] * this.field4394[5] * -this.field4394[0] - this.field4394[6] * this.field4394[1] * this.field4394[12] - this.field4394[4] * this.field4394[2] * this.field4394[13]));
		float var17 = (this.field4394[9] * this.field4394[2] * this.field4394[4] + this.field4394[5] * this.field4394[0] * this.field4394[10] - this.field4394[9] * this.field4394[0] * this.field4394[6] - this.field4394[10] * this.field4394[1] * this.field4394[4] + this.field4394[1] * this.field4394[6] * this.field4394[8] - this.field4394[5] * this.field4394[2] * this.field4394[8]) * var1;
		this.field4394[0] = var2;
		this.field4394[1] = var3;
		this.field4394[2] = var4;
		this.field4394[3] = var5;
		this.field4394[4] = var6;
		this.field4394[5] = var7;
		this.field4394[6] = var8;
		this.field4394[7] = var9;
		this.field4394[8] = var10;
		this.field4394[9] = var11;
		this.field4394[10] = var12;
		this.field4394[11] = var13;
		this.field4394[12] = var14;
		this.field4394[13] = var15;
		this.field4394[14] = var16;
		this.field4394[15] = var17;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(I)[F", garbageValue = "-1510680862")
	public float[] method6992() {
		float[] var1 = new float[3];
		class385 var2 = new class385(this.field4394[0], this.field4394[1], this.field4394[2]);
		class385 var3 = new class385(this.field4394[4], this.field4394[5], this.field4394[6]);
		class385 var4 = new class385(this.field4394[8], this.field4394[9], this.field4394[10]);
		var1[0] = var2.method6929();
		var1[1] = var3.method6929();
		var1[2] = var4.method6929();
		return var1;
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method6959();
		this.method6958();
		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}
				float var4 = this.field4394[var3 + var2 * 4];
				if (Math.sqrt(((double) (var4 * var4))) < 9.999999747378752E-5) {
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
		int var3 = var2 * 31 + Arrays.hashCode(this.field4394);
		return var3;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class387)) {
			return false;
		} else {
			class387 var2 = ((class387) (var1));
			for (int var3 = 0; var3 < 16; ++var3) {
				if (var2.field4394[var3] != this.field4394[var3]) {
					return false;
				}
			}
			return true;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(descriptor = "(ILbi;ZI)I", garbageValue = "-412405575")
	static int method7021(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
			class446.Interpreter_intStackSize -= 2;
			Client.field748 = ((short) (class20.method255(Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize])));
			if (Client.field748 <= 0) {
				Client.field748 = 256;
			}
			Client.field749 = ((short) (class20.method255(Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1])));
			if (Client.field749 <= 0) {
				Client.field749 = 256;
			}
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
			class446.Interpreter_intStackSize -= 2;
			Client.zoomHeight = ((short) (Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]));
			if (Client.zoomHeight <= 0) {
				Client.zoomHeight = 256;
			}
			Client.zoomWidth = ((short) (Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]));
			if (Client.zoomWidth <= 0) {
				Client.zoomWidth = 320;
			}
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
			class446.Interpreter_intStackSize -= 4;
			Client.field752 = ((short) (Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize]));
			if (Client.field752 <= 0) {
				Client.field752 = 1;
			}
			Client.field753 = ((short) (Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]));
			if (Client.field753 <= 0) {
				Client.field753 = 32767;
			} else if (Client.field753 < Client.field752) {
				Client.field753 = Client.field752;
			}
			Client.field754 = ((short) (Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2]));
			if (Client.field754 <= 0) {
				Client.field754 = 1;
			}
			Client.field755 = ((short) (Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 3]));
			if (Client.field755 <= 0) {
				Client.field755 = 32767;
			} else if (Client.field755 < Client.field754) {
				Client.field755 = Client.field754;
			}
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
			if (Client.viewportWidget != null) {
				class201.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false);
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.viewportWidth;
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.viewportHeight;
			} else {
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
			}
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.zoomHeight;
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.zoomWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Frames.method4350(Client.field748);
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Frames.method4350(Client.field749);
			return 1;
		} else if (var0 == 6220) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Script.canvasWidth;
			return 1;
		} else if (var0 == 6223) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class78.canvasHeight;
			return 1;
		} else {
			return 2;
		}
	}
}