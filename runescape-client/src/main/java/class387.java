import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nt")
public final class class387 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"[Lnt;")

	public static class387[] field4346;
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"Lnt;")

	public static final class387 field4345;
	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 
	288254709)

	public static int field4347;
	@ObfuscatedName("n")
	public float[] field4348;
	static 
	{
		field4346 = new class387[0];
		class250.method5112(100);
		field4345 = new class387();
	}

	public class387() {
		this.field4348 = new float[16];
		this.method7011();
	}

	@ObfuscatedSignature(descriptor = 
	"(Lnt;)V")

	public class387(class387 var1) {
		this.field4348 = new float[16];
		this.method7032(var1);
	}

	@ObfuscatedSignature(descriptor = 
	"(Lpi;Z)V")

	public class387(Buffer var1, boolean var2) {
		this.field4348 = new float[16];
		this.method7014(var1, var2);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"37")

	public void method7029() {
		synchronized(field4346) {
			if (field4347 < (class356.field4185 - 1)) {
				field4346[(++field4347) - 1] = this;
			}

		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;ZB)V", garbageValue = 
	"-26")

	void method7014(Buffer var1, boolean var2) {
		if (var2) {
			class388 var13 = new class388();
			int var6 = var1.readShort();
			var6 &= 16383;
			float var5 = ((float) (6.283185307179586 * ((double) (((float) (var6)) / 16384.0F))));
			var13.method7078(var5);
			int var9 = var1.readShort();
			var9 &= 16383;
			float var8 = ((float) (6.283185307179586 * ((double) (((float) (var9)) / 16384.0F))));
			var13.method7083(var8);
			int var12 = var1.readShort();
			var12 &= 16383;
			float var11 = ((float) (6.283185307179586 * ((double) (((float) (var12)) / 16384.0F))));
			var13.method7082(var11);
			var13.method7091(((float) (var1.readShort())), ((float) (var1.readShort())), ((float) (var1.readShort())));
			this.method7012(var13);
		} else {
			for (int var3 = 0; var3 < 16; ++var3) {
				this.field4348[var3] = var1.method7681();
			}
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(I)[F", garbageValue = 
	"426109978")

	float[] method7009() {
		float[] var1 = new float[3];
		if ((((double) (this.field4348[2])) < 0.999) && (((double) (this.field4348[2])) > (-0.999))) {
			var1[1] = ((float) (-Math.asin(((double) (this.field4348[2])))));
			double var2 = Math.cos(((double) (var1[1])));
			var1[0] = ((float) (Math.atan2(((double) (this.field4348[6])) / var2, ((double) (this.field4348[10])) / var2)));
			var1[2] = ((float) (Math.atan2(((double) (this.field4348[1])) / var2, ((double) (this.field4348[0])) / var2)));
		} else {
			var1[0] = 0.0F;
			var1[1] = ((float) (Math.atan2(((double) (this.field4348[2])), 0.0)));
			var1[2] = ((float) (Math.atan2(((double) (-this.field4348[9])), ((double) (this.field4348[5])))));
		}

		return var1;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(I)[F", garbageValue = 
	"1375072290")

	public float[] method7010() {
		float[] var1 = new float[]{ ((float) (-Math.asin(((double) (this.field4348[6]))))), 0.0F, 0.0F };
		double var2 = Math.cos(((double) (var1[0])));
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005) {
			var4 = ((double) (this.field4348[2]));
			var6 = ((double) (this.field4348[10]));
			double var8 = ((double) (this.field4348[4]));
			double var10 = ((double) (this.field4348[5]));
			var1[1] = ((float) (Math.atan2(var4, var6)));
			var1[2] = ((float) (Math.atan2(var8, var10)));
		} else {
			var4 = ((double) (this.field4348[1]));
			var6 = ((double) (this.field4348[0]));
			if (this.field4348[6] < 0.0F) {
				var1[1] = ((float) (Math.atan2(var4, var6)));
			} else {
				var1[1] = ((float) (-Math.atan2(var4, var6)));
			}

			var1[2] = 0.0F;
		}

		return var1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1674890086")

	public void method7011() {
		this.field4348[0] = 1.0F;
		this.field4348[1] = 0.0F;
		this.field4348[2] = 0.0F;
		this.field4348[3] = 0.0F;
		this.field4348[4] = 0.0F;
		this.field4348[5] = 1.0F;
		this.field4348[6] = 0.0F;
		this.field4348[7] = 0.0F;
		this.field4348[8] = 0.0F;
		this.field4348[9] = 0.0F;
		this.field4348[10] = 1.0F;
		this.field4348[11] = 0.0F;
		this.field4348[12] = 0.0F;
		this.field4348[13] = 0.0F;
		this.field4348[14] = 0.0F;
		this.field4348[15] = 1.0F;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"39")

	public void method7064() {
		this.field4348[0] = 0.0F;
		this.field4348[1] = 0.0F;
		this.field4348[2] = 0.0F;
		this.field4348[3] = 0.0F;
		this.field4348[4] = 0.0F;
		this.field4348[5] = 0.0F;
		this.field4348[6] = 0.0F;
		this.field4348[7] = 0.0F;
		this.field4348[8] = 0.0F;
		this.field4348[9] = 0.0F;
		this.field4348[10] = 0.0F;
		this.field4348[11] = 0.0F;
		this.field4348[12] = 0.0F;
		this.field4348[13] = 0.0F;
		this.field4348[14] = 0.0F;
		this.field4348[15] = 0.0F;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(Lnt;I)V", garbageValue = 
	"1612769001")

	public void method7032(class387 var1) {
		System.arraycopy(var1.field4348, 0, this.field4348, 0, 16);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"(FI)V", garbageValue = 
	"1962810997")

	public void method7043(float var1) {
		this.method7049(var1, var1, var1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(FFFB)V", garbageValue = 
	"-93")

	public void method7049(float var1, float var2, float var3) {
		this.method7011();
		this.field4348[0] = var1;
		this.field4348[5] = var2;
		this.field4348[10] = var3;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(Lnt;I)V", garbageValue = 
	"-290385011")

	public void method7016(class387 var1) {
		for (int var2 = 0; var2 < this.field4348.length; ++var2) {
			float[] var10000 = this.field4348;
			var10000[var2] += var1.field4348[var2];
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"(Lnt;I)V", garbageValue = 
	"-1551118407")

	public void method7017(class387 var1) {
		float var2 = (((var1.field4348[0] * this.field4348[0]) + (var1.field4348[4] * this.field4348[1])) + (this.field4348[2] * var1.field4348[8])) + (this.field4348[3] * var1.field4348[12]);
		float var3 = (((var1.field4348[13] * this.field4348[3]) + (this.field4348[1] * var1.field4348[5])) + (this.field4348[0] * var1.field4348[1])) + (var1.field4348[9] * this.field4348[2]);
		float var4 = (((var1.field4348[14] * this.field4348[3]) + (this.field4348[2] * var1.field4348[10])) + (this.field4348[0] * var1.field4348[2])) + (this.field4348[1] * var1.field4348[6]);
		float var5 = (((var1.field4348[15] * this.field4348[3]) + (var1.field4348[7] * this.field4348[1])) + (this.field4348[0] * var1.field4348[3])) + (var1.field4348[11] * this.field4348[2]);
		float var6 = (((this.field4348[6] * var1.field4348[8]) + (var1.field4348[0] * this.field4348[4])) + (var1.field4348[4] * this.field4348[5])) + (var1.field4348[12] * this.field4348[7]);
		float var7 = (((this.field4348[6] * var1.field4348[9]) + (var1.field4348[5] * this.field4348[5])) + (var1.field4348[1] * this.field4348[4])) + (this.field4348[7] * var1.field4348[13]);
		float var8 = (((this.field4348[7] * var1.field4348[14]) + (var1.field4348[2] * this.field4348[4])) + (var1.field4348[6] * this.field4348[5])) + (var1.field4348[10] * this.field4348[6]);
		float var9 = (((var1.field4348[15] * this.field4348[7]) + (this.field4348[5] * var1.field4348[7])) + (this.field4348[4] * var1.field4348[3])) + (this.field4348[6] * var1.field4348[11]);
		float var10 = (((var1.field4348[12] * this.field4348[11]) + (var1.field4348[8] * this.field4348[10])) + (var1.field4348[4] * this.field4348[9])) + (this.field4348[8] * var1.field4348[0]);
		float var11 = (((this.field4348[11] * var1.field4348[13]) + (this.field4348[10] * var1.field4348[9])) + (this.field4348[8] * var1.field4348[1])) + (this.field4348[9] * var1.field4348[5]);
		float var12 = (((this.field4348[10] * var1.field4348[10]) + (var1.field4348[6] * this.field4348[9])) + (this.field4348[8] * var1.field4348[2])) + (var1.field4348[14] * this.field4348[11]);
		float var13 = (((this.field4348[10] * var1.field4348[11]) + (this.field4348[8] * var1.field4348[3])) + (var1.field4348[7] * this.field4348[9])) + (var1.field4348[15] * this.field4348[11]);
		float var14 = (((var1.field4348[4] * this.field4348[13]) + (this.field4348[12] * var1.field4348[0])) + (this.field4348[14] * var1.field4348[8])) + (this.field4348[15] * var1.field4348[12]);
		float var15 = (((var1.field4348[13] * this.field4348[15]) + (this.field4348[14] * var1.field4348[9])) + (var1.field4348[1] * this.field4348[12])) + (this.field4348[13] * var1.field4348[5]);
		float var16 = (((var1.field4348[14] * this.field4348[15]) + (var1.field4348[10] * this.field4348[14])) + (var1.field4348[6] * this.field4348[13])) + (this.field4348[12] * var1.field4348[2]);
		float var17 = (((var1.field4348[7] * this.field4348[13]) + (this.field4348[12] * var1.field4348[3])) + (var1.field4348[11] * this.field4348[14])) + (this.field4348[15] * var1.field4348[15]);
		this.field4348[0] = var2;
		this.field4348[1] = var3;
		this.field4348[2] = var4;
		this.field4348[3] = var5;
		this.field4348[4] = var6;
		this.field4348[5] = var7;
		this.field4348[6] = var8;
		this.field4348[7] = var9;
		this.field4348[8] = var10;
		this.field4348[9] = var11;
		this.field4348[10] = var12;
		this.field4348[11] = var13;
		this.field4348[12] = var14;
		this.field4348[13] = var15;
		this.field4348[14] = var16;
		this.field4348[15] = var17;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = 
	"(Lnq;I)V", garbageValue = 
	"1080708844")

	public void method7006(class386 var1) {
		float var2 = var1.field4343 * var1.field4343;
		float var3 = var1.field4340 * var1.field4343;
		float var4 = var1.field4341 * var1.field4343;
		float var5 = var1.field4343 * var1.field4342;
		float var6 = var1.field4340 * var1.field4340;
		float var7 = var1.field4341 * var1.field4340;
		float var8 = var1.field4340 * var1.field4342;
		float var9 = var1.field4341 * var1.field4341;
		float var10 = var1.field4341 * var1.field4342;
		float var11 = var1.field4342 * var1.field4342;
		this.field4348[0] = ((var2 + var6) - var11) - var9;
		this.field4348[1] = ((var5 + var7) + var7) + var5;
		this.field4348[2] = ((var8 - var4) - var4) + var8;
		this.field4348[4] = var7 + ((var7 - var5) - var5);
		this.field4348[5] = ((var2 + var9) - var6) - var11;
		this.field4348[6] = ((var3 + var10) + var10) + var3;
		this.field4348[8] = ((var4 + var8) + var8) + var4;
		this.field4348[9] = var10 + ((var10 - var3) - var3);
		this.field4348[10] = ((var2 + var11) - var9) - var6;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"(Lnb;B)V", garbageValue = 
	"-22")

	void method7012(class388 var1) {
		this.field4348[0] = var1.field4355;
		this.field4348[1] = var1.field4357;
		this.field4348[2] = var1.field4353;
		this.field4348[3] = 0.0F;
		this.field4348[4] = var1.field4354;
		this.field4348[5] = var1.field4352;
		this.field4348[6] = var1.field4356;
		this.field4348[7] = 0.0F;
		this.field4348[8] = var1.field4351;
		this.field4348[9] = var1.field4360;
		this.field4348[10] = var1.field4359;
		this.field4348[11] = 0.0F;
		this.field4348[12] = var1.field4362;
		this.field4348[13] = var1.field4361;
		this.field4348[14] = var1.field4358;
		this.field4348[15] = 1.0F;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(B)F", garbageValue = 
	"110")

	float method7075() {
		return (((((((((((((((((((((((this.field4348[13] * this.field4348[8]) * this.field4348[7]) * this.field4348[2]) + (((this.field4348[15] * this.field4348[9]) * this.field4348[2]) * this.field4348[4])) + (((this.field4348[15] * this.field4348[8]) * this.field4348[1]) * this.field4348[6])) + (((this.field4348[0] * this.field4348[7]) * this.field4348[9]) * this.field4348[14])) + (((this.field4348[11] * this.field4348[0]) * this.field4348[6]) * this.field4348[13])) + (((((this.field4348[15] * this.field4348[0]) * this.field4348[5]) * this.field4348[10]) - (((this.field4348[5] * this.field4348[0]) * this.field4348[11]) * this.field4348[14])) - (((this.field4348[15] * this.field4348[9]) * this.field4348[6]) * this.field4348[0]))) - (((this.field4348[13] * this.field4348[10]) * this.field4348[7]) * this.field4348[0])) - (((this.field4348[10] * this.field4348[1]) * this.field4348[4]) * this.field4348[15])) + (((this.field4348[4] * this.field4348[1]) * this.field4348[11]) * this.field4348[14])) - (((this.field4348[11] * this.field4348[6]) * this.field4348[1]) * this.field4348[12])) - (((this.field4348[1] * this.field4348[7]) * this.field4348[8]) * this.field4348[14])) + (((this.field4348[10] * this.field4348[7]) * this.field4348[1]) * this.field4348[12])) - (((this.field4348[13] * this.field4348[11]) * this.field4348[4]) * this.field4348[2])) - (((this.field4348[2] * this.field4348[5]) * this.field4348[8]) * this.field4348[15])) + (((this.field4348[11] * this.field4348[5]) * this.field4348[2]) * this.field4348[12])) - (((this.field4348[7] * this.field4348[2]) * this.field4348[9]) * this.field4348[12])) - (((this.field4348[14] * this.field4348[4]) * this.field4348[3]) * this.field4348[9])) + (((this.field4348[10] * this.field4348[4]) * this.field4348[3]) * this.field4348[13])) + (((this.field4348[14] * this.field4348[8]) * this.field4348[5]) * this.field4348[3])) - (((this.field4348[10] * this.field4348[5]) * this.field4348[3]) * this.field4348[12])) - (((this.field4348[13] * this.field4348[6]) * this.field4348[3]) * this.field4348[8])) + (((this.field4348[9] * this.field4348[6]) * this.field4348[3]) * this.field4348[12]);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1244640444")

	public void method7021() {
		float var1 = 1.0F / this.method7075();
		float var2 = var1 * (((((((this.field4348[10] * this.field4348[5]) * this.field4348[15]) - ((this.field4348[11] * this.field4348[5]) * this.field4348[14])) - ((this.field4348[15] * this.field4348[9]) * this.field4348[6])) + ((this.field4348[11] * this.field4348[6]) * this.field4348[13])) + ((this.field4348[14] * this.field4348[9]) * this.field4348[7])) - ((this.field4348[13] * this.field4348[7]) * this.field4348[10]));
		float var3 = (((this.field4348[13] * this.field4348[10]) * this.field4348[3]) + ((((((this.field4348[15] * (-this.field4348[1])) * this.field4348[10]) + ((this.field4348[14] * this.field4348[11]) * this.field4348[1])) + ((this.field4348[2] * this.field4348[9]) * this.field4348[15])) - ((this.field4348[13] * this.field4348[11]) * this.field4348[2])) - ((this.field4348[3] * this.field4348[9]) * this.field4348[14]))) * var1;
		float var4 = var1 * (((((((this.field4348[5] * this.field4348[3]) * this.field4348[14]) + ((this.field4348[6] * this.field4348[1]) * this.field4348[15])) - ((this.field4348[14] * this.field4348[7]) * this.field4348[1])) - ((this.field4348[5] * this.field4348[2]) * this.field4348[15])) + ((this.field4348[13] * this.field4348[7]) * this.field4348[2])) - ((this.field4348[6] * this.field4348[3]) * this.field4348[13]));
		float var5 = (((((((this.field4348[5] * this.field4348[2]) * this.field4348[11]) + (((-this.field4348[1]) * this.field4348[6]) * this.field4348[11])) + ((this.field4348[10] * this.field4348[7]) * this.field4348[1])) - ((this.field4348[7] * this.field4348[2]) * this.field4348[9])) - ((this.field4348[10] * this.field4348[5]) * this.field4348[3])) + ((this.field4348[9] * this.field4348[3]) * this.field4348[6])) * var1;
		float var6 = (((this.field4348[10] * this.field4348[7]) * this.field4348[12]) + ((((((this.field4348[11] * this.field4348[4]) * this.field4348[14]) + (((-this.field4348[4]) * this.field4348[10]) * this.field4348[15])) + ((this.field4348[15] * this.field4348[6]) * this.field4348[8])) - ((this.field4348[12] * this.field4348[6]) * this.field4348[11])) - ((this.field4348[14] * this.field4348[7]) * this.field4348[8]))) * var1;
		float var7 = var1 * (((((this.field4348[14] * this.field4348[3]) * this.field4348[8]) + ((this.field4348[12] * this.field4348[2]) * this.field4348[11])) + ((((this.field4348[15] * this.field4348[0]) * this.field4348[10]) - ((this.field4348[11] * this.field4348[0]) * this.field4348[14])) - ((this.field4348[8] * this.field4348[2]) * this.field4348[15]))) - ((this.field4348[3] * this.field4348[10]) * this.field4348[12]));
		float var8 = (((((((this.field4348[2] * this.field4348[4]) * this.field4348[15]) + ((this.field4348[14] * this.field4348[7]) * this.field4348[0])) + ((this.field4348[6] * (-this.field4348[0])) * this.field4348[15])) - ((this.field4348[2] * this.field4348[7]) * this.field4348[12])) - ((this.field4348[14] * this.field4348[4]) * this.field4348[3])) + ((this.field4348[12] * this.field4348[3]) * this.field4348[6])) * var1;
		float var9 = var1 * (((((this.field4348[2] * this.field4348[7]) * this.field4348[8]) + ((((this.field4348[11] * this.field4348[0]) * this.field4348[6]) - ((this.field4348[0] * this.field4348[7]) * this.field4348[10])) - ((this.field4348[4] * this.field4348[2]) * this.field4348[11]))) + ((this.field4348[4] * this.field4348[3]) * this.field4348[10])) - ((this.field4348[6] * this.field4348[3]) * this.field4348[8]));
		float var10 = var1 * (((((this.field4348[7] * this.field4348[8]) * this.field4348[13]) + ((this.field4348[12] * this.field4348[5]) * this.field4348[11])) + ((((this.field4348[15] * this.field4348[4]) * this.field4348[9]) - ((this.field4348[13] * this.field4348[4]) * this.field4348[11])) - ((this.field4348[5] * this.field4348[8]) * this.field4348[15]))) - ((this.field4348[9] * this.field4348[7]) * this.field4348[12]));
		float var11 = var1 * (((((((this.field4348[15] * this.field4348[8]) * this.field4348[1]) + ((this.field4348[13] * this.field4348[11]) * this.field4348[0])) + ((this.field4348[15] * (-this.field4348[0])) * this.field4348[9])) - ((this.field4348[12] * this.field4348[1]) * this.field4348[11])) - ((this.field4348[8] * this.field4348[3]) * this.field4348[13])) + ((this.field4348[12] * this.field4348[9]) * this.field4348[3]));
		float var12 = var1 * (((((((this.field4348[5] * this.field4348[0]) * this.field4348[15]) - ((this.field4348[13] * this.field4348[0]) * this.field4348[7])) - ((this.field4348[4] * this.field4348[1]) * this.field4348[15])) + ((this.field4348[12] * this.field4348[7]) * this.field4348[1])) + ((this.field4348[13] * this.field4348[3]) * this.field4348[4])) - ((this.field4348[5] * this.field4348[3]) * this.field4348[12]));
		float var13 = var1 * (((this.field4348[8] * this.field4348[5]) * this.field4348[3]) + ((((((this.field4348[4] * this.field4348[1]) * this.field4348[11]) + (((-this.field4348[0]) * this.field4348[5]) * this.field4348[11])) + ((this.field4348[9] * this.field4348[0]) * this.field4348[7])) - ((this.field4348[1] * this.field4348[7]) * this.field4348[8])) - ((this.field4348[4] * this.field4348[3]) * this.field4348[9])));
		float var14 = (((this.field4348[6] * this.field4348[9]) * this.field4348[12]) + ((((((this.field4348[5] * this.field4348[8]) * this.field4348[14]) + ((this.field4348[13] * this.field4348[4]) * this.field4348[10])) + ((this.field4348[14] * (-this.field4348[4])) * this.field4348[9])) - ((this.field4348[12] * this.field4348[10]) * this.field4348[5])) - ((this.field4348[8] * this.field4348[6]) * this.field4348[13]))) * var1;
		float var15 = var1 * (((((((this.field4348[0] * this.field4348[9]) * this.field4348[14]) - ((this.field4348[13] * this.field4348[0]) * this.field4348[10])) - ((this.field4348[8] * this.field4348[1]) * this.field4348[14])) + ((this.field4348[12] * this.field4348[1]) * this.field4348[10])) + ((this.field4348[13] * this.field4348[2]) * this.field4348[8])) - ((this.field4348[12] * this.field4348[2]) * this.field4348[9]));
		float var16 = var1 * (((this.field4348[12] * this.field4348[5]) * this.field4348[2]) + ((((((this.field4348[14] * (-this.field4348[0])) * this.field4348[5]) + ((this.field4348[13] * this.field4348[6]) * this.field4348[0])) + ((this.field4348[4] * this.field4348[1]) * this.field4348[14])) - ((this.field4348[12] * this.field4348[6]) * this.field4348[1])) - ((this.field4348[2] * this.field4348[4]) * this.field4348[13])));
		float var17 = var1 * (((((this.field4348[9] * this.field4348[2]) * this.field4348[4]) + ((this.field4348[8] * this.field4348[6]) * this.field4348[1])) + ((((this.field4348[10] * this.field4348[5]) * this.field4348[0]) - ((this.field4348[0] * this.field4348[6]) * this.field4348[9])) - ((this.field4348[10] * this.field4348[1]) * this.field4348[4]))) - ((this.field4348[2] * this.field4348[5]) * this.field4348[8]));
		this.field4348[0] = var2;
		this.field4348[1] = var3;
		this.field4348[2] = var4;
		this.field4348[3] = var5;
		this.field4348[4] = var6;
		this.field4348[5] = var7;
		this.field4348[6] = var8;
		this.field4348[7] = var9;
		this.field4348[8] = var10;
		this.field4348[9] = var11;
		this.field4348[10] = var12;
		this.field4348[11] = var13;
		this.field4348[12] = var14;
		this.field4348[13] = var15;
		this.field4348[14] = var16;
		this.field4348[15] = var17;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"(I)[F", garbageValue = 
	"926402902")

	public float[] method7023() {
		float[] var1 = new float[3];
		class385 var2 = new class385(this.field4348[0], this.field4348[1], this.field4348[2]);
		class385 var3 = new class385(this.field4348[4], this.field4348[5], this.field4348[6]);
		class385 var4 = new class385(this.field4348[8], this.field4348[9], this.field4348[10]);
		var1[0] = var2.method6973();
		var1[1] = var3.method6973();
		var1[2] = var4.method6973();
		return var1;
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method7010();
		this.method7009();

		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.field4348[var3 + (var2 * 4)];
				if (Math.sqrt(((double) (var4 * var4))) < 9.999999747378752E-5) {
					var4 = 0.0F;
				}

				var1.append(var4);
			}

			var1.append("\n");
		}

		return var1.toString();
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class387)) {
			return false;
		} else {
			class387 var2 = ((class387) (var1));

			for (int var3 = 0; var3 < 16; ++var3) {
				if (this.field4348[var3] != var2.field4348[var3]) {
					return false;
				}
			}

			return true;
		}
	}

	public int hashCode() {
		byte var2 = 1;
		int var3 = (var2 * 31) + Arrays.hashCode(this.field4348);
		return var3;
	}
}