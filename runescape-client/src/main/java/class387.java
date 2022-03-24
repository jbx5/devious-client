import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nu")
public final class class387 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"[Lnu;")

	static class387[] field4344;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	623605303)

	static int field4345;
	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 
	-29781141)

	static int field4346;
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"Lnu;")

	public static final class387 field4348;
	@ObfuscatedName("l")
	public float[] field4347;
	static 
	{
		field4344 = new class387[0];
		field4345 = 100;
		field4344 = new class387[100];
		field4346 = 0;
		field4348 = new class387();
	}

	public class387() {
		this.field4347 = new float[16];
		this.method7061();
	}

	@ObfuscatedSignature(descriptor = 
	"(Lnu;)V")

	public class387(class387 var1) {
		this.field4347 = new float[16];
		this.method7064(var1);
	}

	@ObfuscatedSignature(descriptor = 
	"(Lpd;Z)V")

	public class387(Buffer var1, boolean var2) {
		this.field4347 = new float[16];
		this.method7059(var1, var2);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"57")

	public void method7095() {
		synchronized(field4344) {
			if (field4346 < (field4345 - 1)) {
				field4344[(++field4346) - 1] = this;
			}

		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;ZI)V", garbageValue = 
	"-1865581813")

	void method7059(Buffer var1, boolean var2) {
		if (var2) {
			class388 var4 = new class388();
			var4.method7128(HealthBarDefinition.method3433(var1.readShort()));
			var4.method7129(HealthBarDefinition.method3433(var1.readShort()));
			var4.method7139(HealthBarDefinition.method3433(var1.readShort()));
			var4.method7131(((float) (var1.readShort())), ((float) (var1.readShort())), ((float) (var1.readShort())));
			this.method7070(var4);
		} else {
			for (int var3 = 0; var3 < 16; ++var3) {
				this.field4347[var3] = var1.method7965();
			}
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(B)[F", garbageValue = 
	"57")

	float[] method7086() {
		float[] var1 = new float[3];
		if ((((double) (this.field4347[2])) < 0.999) && (((double) (this.field4347[2])) > (-0.999))) {
			var1[1] = ((float) (-Math.asin(((double) (this.field4347[2])))));
			double var2 = Math.cos(((double) (var1[1])));
			var1[0] = ((float) (Math.atan2(((double) (this.field4347[6])) / var2, ((double) (this.field4347[10])) / var2)));
			var1[2] = ((float) (Math.atan2(((double) (this.field4347[1])) / var2, ((double) (this.field4347[0])) / var2)));
		} else {
			var1[0] = 0.0F;
			var1[1] = ((float) (Math.atan2(((double) (this.field4347[2])), 0.0)));
			var1[2] = ((float) (Math.atan2(((double) (-this.field4347[9])), ((double) (this.field4347[5])))));
		}

		return var1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(I)[F", garbageValue = 
	"-2013640874")

	public float[] method7072() {
		float[] var1 = new float[]{ ((float) (-Math.asin(((double) (this.field4347[6]))))), 0.0F, 0.0F };
		double var2 = Math.cos(((double) (var1[0])));
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005) {
			var4 = ((double) (this.field4347[2]));
			var6 = ((double) (this.field4347[10]));
			double var8 = ((double) (this.field4347[4]));
			double var10 = ((double) (this.field4347[5]));
			var1[1] = ((float) (Math.atan2(var4, var6)));
			var1[2] = ((float) (Math.atan2(var8, var10)));
		} else {
			var4 = ((double) (this.field4347[1]));
			var6 = ((double) (this.field4347[0]));
			if (this.field4347[6] < 0.0F) {
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
	"-521108963")

	void method7061() {
		this.field4347[0] = 1.0F;
		this.field4347[1] = 0.0F;
		this.field4347[2] = 0.0F;
		this.field4347[3] = 0.0F;
		this.field4347[4] = 0.0F;
		this.field4347[5] = 1.0F;
		this.field4347[6] = 0.0F;
		this.field4347[7] = 0.0F;
		this.field4347[8] = 0.0F;
		this.field4347[9] = 0.0F;
		this.field4347[10] = 1.0F;
		this.field4347[11] = 0.0F;
		this.field4347[12] = 0.0F;
		this.field4347[13] = 0.0F;
		this.field4347[14] = 0.0F;
		this.field4347[15] = 1.0F;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"73")

	public void method7063() {
		this.field4347[0] = 0.0F;
		this.field4347[1] = 0.0F;
		this.field4347[2] = 0.0F;
		this.field4347[3] = 0.0F;
		this.field4347[4] = 0.0F;
		this.field4347[5] = 0.0F;
		this.field4347[6] = 0.0F;
		this.field4347[7] = 0.0F;
		this.field4347[8] = 0.0F;
		this.field4347[9] = 0.0F;
		this.field4347[10] = 0.0F;
		this.field4347[11] = 0.0F;
		this.field4347[12] = 0.0F;
		this.field4347[13] = 0.0F;
		this.field4347[14] = 0.0F;
		this.field4347[15] = 0.0F;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(Lnu;I)V", garbageValue = 
	"-2027114909")

	public void method7064(class387 var1) {
		System.arraycopy(var1.field4347, 0, this.field4347, 0, 16);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"(FI)V", garbageValue = 
	"-1159327963")

	public void method7065(float var1) {
		this.method7066(var1, var1, var1);
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(FFFI)V", garbageValue = 
	"1632887499")

	public void method7066(float var1, float var2, float var3) {
		this.method7061();
		this.field4347[0] = var1;
		this.field4347[5] = var2;
		this.field4347[10] = var3;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"(Lnu;I)V", garbageValue = 
	"853213330")

	public void method7067(class387 var1) {
		for (int var2 = 0; var2 < this.field4347.length; ++var2) {
			float[] var10000 = this.field4347;
			var10000[var2] += var1.field4347[var2];
		}

	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = 
	"(Lnu;B)V", garbageValue = 
	"39")

	public void method7109(class387 var1) {
		float var2 = (((var1.field4347[0] * this.field4347[0]) + (var1.field4347[4] * this.field4347[1])) + (this.field4347[2] * var1.field4347[8])) + (var1.field4347[12] * this.field4347[3]);
		float var3 = (((var1.field4347[1] * this.field4347[0]) + (var1.field4347[5] * this.field4347[1])) + (var1.field4347[9] * this.field4347[2])) + (this.field4347[3] * var1.field4347[13]);
		float var4 = (((this.field4347[3] * var1.field4347[14]) + (this.field4347[0] * var1.field4347[2])) + (this.field4347[1] * var1.field4347[6])) + (var1.field4347[10] * this.field4347[2]);
		float var5 = (((this.field4347[3] * var1.field4347[15]) + (this.field4347[2] * var1.field4347[11])) + (this.field4347[1] * var1.field4347[7])) + (var1.field4347[3] * this.field4347[0]);
		float var6 = (((this.field4347[5] * var1.field4347[4]) + (this.field4347[4] * var1.field4347[0])) + (this.field4347[6] * var1.field4347[8])) + (var1.field4347[12] * this.field4347[7]);
		float var7 = (((var1.field4347[5] * this.field4347[5]) + (this.field4347[4] * var1.field4347[1])) + (this.field4347[6] * var1.field4347[9])) + (this.field4347[7] * var1.field4347[13]);
		float var8 = (((this.field4347[5] * var1.field4347[6]) + (this.field4347[4] * var1.field4347[2])) + (var1.field4347[10] * this.field4347[6])) + (var1.field4347[14] * this.field4347[7]);
		float var9 = (((var1.field4347[7] * this.field4347[5]) + (var1.field4347[3] * this.field4347[4])) + (this.field4347[6] * var1.field4347[11])) + (var1.field4347[15] * this.field4347[7]);
		float var10 = (((var1.field4347[0] * this.field4347[8]) + (var1.field4347[4] * this.field4347[9])) + (var1.field4347[8] * this.field4347[10])) + (var1.field4347[12] * this.field4347[11]);
		float var11 = (((var1.field4347[13] * this.field4347[11]) + (var1.field4347[1] * this.field4347[8])) + (var1.field4347[5] * this.field4347[9])) + (var1.field4347[9] * this.field4347[10]);
		float var12 = (((var1.field4347[6] * this.field4347[9]) + (this.field4347[8] * var1.field4347[2])) + (var1.field4347[10] * this.field4347[10])) + (var1.field4347[14] * this.field4347[11]);
		float var13 = (((this.field4347[11] * var1.field4347[15]) + (this.field4347[8] * var1.field4347[3])) + (this.field4347[9] * var1.field4347[7])) + (var1.field4347[11] * this.field4347[10]);
		float var14 = (((this.field4347[15] * var1.field4347[12]) + (var1.field4347[4] * this.field4347[13])) + (var1.field4347[0] * this.field4347[12])) + (this.field4347[14] * var1.field4347[8]);
		float var15 = (((this.field4347[14] * var1.field4347[9]) + (var1.field4347[5] * this.field4347[13])) + (this.field4347[12] * var1.field4347[1])) + (var1.field4347[13] * this.field4347[15]);
		float var16 = (((var1.field4347[14] * this.field4347[15]) + (this.field4347[13] * var1.field4347[6])) + (var1.field4347[2] * this.field4347[12])) + (this.field4347[14] * var1.field4347[10]);
		float var17 = (((var1.field4347[3] * this.field4347[12]) + (this.field4347[13] * var1.field4347[7])) + (this.field4347[14] * var1.field4347[11])) + (this.field4347[15] * var1.field4347[15]);
		this.field4347[0] = var2;
		this.field4347[1] = var3;
		this.field4347[2] = var4;
		this.field4347[3] = var5;
		this.field4347[4] = var6;
		this.field4347[5] = var7;
		this.field4347[6] = var8;
		this.field4347[7] = var9;
		this.field4347[8] = var10;
		this.field4347[9] = var11;
		this.field4347[10] = var12;
		this.field4347[11] = var13;
		this.field4347[12] = var14;
		this.field4347[13] = var15;
		this.field4347[14] = var16;
		this.field4347[15] = var17;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Lnf;I)V", garbageValue = 
	"-1554495705")

	public void method7069(class386 var1) {
		float var2 = var1.field4338 * var1.field4338;
		float var3 = var1.field4338 * var1.field4339;
		float var4 = var1.field4338 * var1.field4340;
		float var5 = var1.field4341 * var1.field4338;
		float var6 = var1.field4339 * var1.field4339;
		float var7 = var1.field4340 * var1.field4339;
		float var8 = var1.field4339 * var1.field4341;
		float var9 = var1.field4340 * var1.field4340;
		float var10 = var1.field4340 * var1.field4341;
		float var11 = var1.field4341 * var1.field4341;
		this.field4347[0] = ((var2 + var6) - var11) - var9;
		this.field4347[1] = ((var7 + var5) + var7) + var5;
		this.field4347[2] = var8 + ((var8 - var4) - var4);
		this.field4347[4] = ((var7 - var5) - var5) + var7;
		this.field4347[5] = ((var9 + var2) - var6) - var11;
		this.field4347[6] = ((var3 + var10) + var3) + var10;
		this.field4347[8] = ((var4 + var4) + var8) + var8;
		this.field4347[9] = var10 + ((var10 - var3) - var3);
		this.field4347[10] = ((var11 + var2) - var9) - var6;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = 
	"(Lnr;B)V", garbageValue = 
	"-72")

	void method7070(class388 var1) {
		this.field4347[0] = var1.field4359;
		this.field4347[1] = var1.field4350;
		this.field4347[2] = var1.field4351;
		this.field4347[3] = 0.0F;
		this.field4347[4] = var1.field4352;
		this.field4347[5] = var1.field4353;
		this.field4347[6] = var1.field4357;
		this.field4347[7] = 0.0F;
		this.field4347[8] = var1.field4355;
		this.field4347[9] = var1.field4349;
		this.field4347[10] = var1.field4356;
		this.field4347[11] = 0.0F;
		this.field4347[12] = var1.field4358;
		this.field4347[13] = var1.field4354;
		this.field4347[14] = var1.field4360;
		this.field4347[15] = 1.0F;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"(B)F", garbageValue = 
	"0")

	float method7071() {
		return (((this.field4347[12] * this.field4347[3]) * this.field4347[6]) * this.field4347[9]) + (((((((this.field4347[8] * this.field4347[3]) * this.field4347[5]) * this.field4347[14]) + (((this.field4347[13] * this.field4347[3]) * this.field4347[4]) * this.field4347[10])) + (((((((((((this.field4347[13] * this.field4347[2]) * this.field4347[7]) * this.field4347[8]) + (((this.field4347[10] * this.field4347[1]) * this.field4347[7]) * this.field4347[12])) + (((((((((((((this.field4347[15] * this.field4347[0]) * this.field4347[5]) * this.field4347[10]) - (((this.field4347[14] * this.field4347[11]) * this.field4347[0]) * this.field4347[5])) - (((this.field4347[15] * this.field4347[9]) * this.field4347[6]) * this.field4347[0])) + (((this.field4347[11] * this.field4347[0]) * this.field4347[6]) * this.field4347[13])) + (((this.field4347[0] * this.field4347[7]) * this.field4347[9]) * this.field4347[14])) - (((this.field4347[13] * this.field4347[7]) * this.field4347[0]) * this.field4347[10])) - (((this.field4347[15] * this.field4347[10]) * this.field4347[4]) * this.field4347[1])) + (((this.field4347[14] * this.field4347[11]) * this.field4347[4]) * this.field4347[1])) + (((this.field4347[6] * this.field4347[1]) * this.field4347[8]) * this.field4347[15])) - (((this.field4347[1] * this.field4347[6]) * this.field4347[11]) * this.field4347[12])) - (((this.field4347[8] * this.field4347[7]) * this.field4347[1]) * this.field4347[14]))) + (((this.field4347[15] * this.field4347[2]) * this.field4347[4]) * this.field4347[9])) - (((this.field4347[2] * this.field4347[4]) * this.field4347[11]) * this.field4347[13])) - (((this.field4347[15] * this.field4347[8]) * this.field4347[5]) * this.field4347[2])) + (((this.field4347[12] * this.field4347[11]) * this.field4347[2]) * this.field4347[5])) - (((this.field4347[12] * this.field4347[9]) * this.field4347[2]) * this.field4347[7])) - (((this.field4347[4] * this.field4347[3]) * this.field4347[9]) * this.field4347[14]))) - (((this.field4347[12] * this.field4347[10]) * this.field4347[3]) * this.field4347[5])) - (((this.field4347[13] * this.field4347[8]) * this.field4347[6]) * this.field4347[3]));
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"2")

	public void method7111() {
		float var1 = 1.0F / this.method7071();
		float var2 = (((((this.field4347[13] * this.field4347[6]) * this.field4347[11]) + ((((this.field4347[10] * this.field4347[5]) * this.field4347[15]) - ((this.field4347[11] * this.field4347[5]) * this.field4347[14])) - ((this.field4347[15] * this.field4347[9]) * this.field4347[6]))) + ((this.field4347[7] * this.field4347[9]) * this.field4347[14])) - ((this.field4347[13] * this.field4347[7]) * this.field4347[10])) * var1;
		float var3 = var1 * (((this.field4347[10] * this.field4347[3]) * this.field4347[13]) + ((((((this.field4347[10] * (-this.field4347[1])) * this.field4347[15]) + ((this.field4347[14] * this.field4347[11]) * this.field4347[1])) + ((this.field4347[15] * this.field4347[2]) * this.field4347[9])) - ((this.field4347[13] * this.field4347[2]) * this.field4347[11])) - ((this.field4347[14] * this.field4347[3]) * this.field4347[9])));
		float var4 = var1 * (((((this.field4347[13] * this.field4347[2]) * this.field4347[7]) + ((((this.field4347[6] * this.field4347[1]) * this.field4347[15]) - ((this.field4347[1] * this.field4347[7]) * this.field4347[14])) - ((this.field4347[15] * this.field4347[5]) * this.field4347[2]))) + ((this.field4347[5] * this.field4347[3]) * this.field4347[14])) - ((this.field4347[3] * this.field4347[6]) * this.field4347[13]));
		float var5 = (((this.field4347[9] * this.field4347[6]) * this.field4347[3]) + ((((((this.field4347[10] * this.field4347[1]) * this.field4347[7]) + ((this.field4347[6] * (-this.field4347[1])) * this.field4347[11])) + ((this.field4347[2] * this.field4347[5]) * this.field4347[11])) - ((this.field4347[9] * this.field4347[2]) * this.field4347[7])) - ((this.field4347[3] * this.field4347[5]) * this.field4347[10]))) * var1;
		float var6 = (((this.field4347[7] * this.field4347[10]) * this.field4347[12]) + ((((((this.field4347[14] * this.field4347[11]) * this.field4347[4]) + ((this.field4347[15] * (-this.field4347[4])) * this.field4347[10])) + ((this.field4347[8] * this.field4347[6]) * this.field4347[15])) - ((this.field4347[6] * this.field4347[11]) * this.field4347[12])) - ((this.field4347[14] * this.field4347[7]) * this.field4347[8]))) * var1;
		float var7 = (((((this.field4347[3] * this.field4347[8]) * this.field4347[14]) + ((this.field4347[12] * this.field4347[11]) * this.field4347[2])) + ((((this.field4347[15] * this.field4347[0]) * this.field4347[10]) - ((this.field4347[11] * this.field4347[0]) * this.field4347[14])) - ((this.field4347[15] * this.field4347[2]) * this.field4347[8]))) - ((this.field4347[12] * this.field4347[3]) * this.field4347[10])) * var1;
		float var8 = var1 * (((((((this.field4347[15] * this.field4347[2]) * this.field4347[4]) + (((-this.field4347[0]) * this.field4347[6]) * this.field4347[15])) + ((this.field4347[14] * this.field4347[7]) * this.field4347[0])) - ((this.field4347[12] * this.field4347[2]) * this.field4347[7])) - ((this.field4347[14] * this.field4347[3]) * this.field4347[4])) + ((this.field4347[6] * this.field4347[3]) * this.field4347[12]));
		float var9 = var1 * (((((this.field4347[2] * this.field4347[7]) * this.field4347[8]) + ((((this.field4347[11] * this.field4347[0]) * this.field4347[6]) - ((this.field4347[7] * this.field4347[0]) * this.field4347[10])) - ((this.field4347[11] * this.field4347[2]) * this.field4347[4]))) + ((this.field4347[3] * this.field4347[4]) * this.field4347[10])) - ((this.field4347[8] * this.field4347[6]) * this.field4347[3]));
		float var10 = var1 * (((((this.field4347[12] * this.field4347[11]) * this.field4347[5]) + ((((this.field4347[4] * this.field4347[9]) * this.field4347[15]) - ((this.field4347[4] * this.field4347[11]) * this.field4347[13])) - ((this.field4347[15] * this.field4347[5]) * this.field4347[8]))) + ((this.field4347[7] * this.field4347[8]) * this.field4347[13])) - ((this.field4347[12] * this.field4347[9]) * this.field4347[7]));
		float var11 = var1 * (((((((this.field4347[0] * this.field4347[11]) * this.field4347[13]) + ((this.field4347[9] * (-this.field4347[0])) * this.field4347[15])) + ((this.field4347[15] * this.field4347[8]) * this.field4347[1])) - ((this.field4347[12] * this.field4347[11]) * this.field4347[1])) - ((this.field4347[13] * this.field4347[3]) * this.field4347[8])) + ((this.field4347[12] * this.field4347[9]) * this.field4347[3]));
		float var12 = var1 * (((((((this.field4347[4] * this.field4347[3]) * this.field4347[13]) + ((this.field4347[15] * this.field4347[5]) * this.field4347[0])) - ((this.field4347[0] * this.field4347[7]) * this.field4347[13])) - ((this.field4347[4] * this.field4347[1]) * this.field4347[15])) + ((this.field4347[12] * this.field4347[7]) * this.field4347[1])) - ((this.field4347[12] * this.field4347[3]) * this.field4347[5]));
		float var13 = var1 * (((this.field4347[8] * this.field4347[5]) * this.field4347[3]) + (((((((-this.field4347[0]) * this.field4347[5]) * this.field4347[11]) + ((this.field4347[7] * this.field4347[0]) * this.field4347[9])) + ((this.field4347[1] * this.field4347[4]) * this.field4347[11])) - ((this.field4347[8] * this.field4347[1]) * this.field4347[7])) - ((this.field4347[9] * this.field4347[4]) * this.field4347[3])));
		float var14 = var1 * (((((((this.field4347[13] * this.field4347[4]) * this.field4347[10]) + (((-this.field4347[4]) * this.field4347[9]) * this.field4347[14])) + ((this.field4347[14] * this.field4347[8]) * this.field4347[5])) - ((this.field4347[5] * this.field4347[10]) * this.field4347[12])) - ((this.field4347[13] * this.field4347[8]) * this.field4347[6])) + ((this.field4347[12] * this.field4347[9]) * this.field4347[6]));
		float var15 = var1 * (((((((this.field4347[13] * this.field4347[8]) * this.field4347[2]) + ((this.field4347[14] * this.field4347[0]) * this.field4347[9])) - ((this.field4347[10] * this.field4347[0]) * this.field4347[13])) - ((this.field4347[8] * this.field4347[1]) * this.field4347[14])) + ((this.field4347[12] * this.field4347[10]) * this.field4347[1])) - ((this.field4347[12] * this.field4347[9]) * this.field4347[2]));
		float var16 = var1 * ((((((((-this.field4347[0]) * this.field4347[5]) * this.field4347[14]) + ((this.field4347[13] * this.field4347[6]) * this.field4347[0])) + ((this.field4347[14] * this.field4347[4]) * this.field4347[1])) - ((this.field4347[1] * this.field4347[6]) * this.field4347[12])) - ((this.field4347[2] * this.field4347[4]) * this.field4347[13])) + ((this.field4347[2] * this.field4347[5]) * this.field4347[12]));
		float var17 = var1 * (((((((this.field4347[2] * this.field4347[4]) * this.field4347[9]) + ((this.field4347[10] * this.field4347[0]) * this.field4347[5])) - ((this.field4347[9] * this.field4347[0]) * this.field4347[6])) - ((this.field4347[10] * this.field4347[1]) * this.field4347[4])) + ((this.field4347[8] * this.field4347[6]) * this.field4347[1])) - ((this.field4347[5] * this.field4347[2]) * this.field4347[8]));
		this.field4347[0] = var2;
		this.field4347[1] = var3;
		this.field4347[2] = var4;
		this.field4347[3] = var5;
		this.field4347[4] = var6;
		this.field4347[5] = var7;
		this.field4347[6] = var8;
		this.field4347[7] = var9;
		this.field4347[8] = var10;
		this.field4347[9] = var11;
		this.field4347[10] = var12;
		this.field4347[11] = var13;
		this.field4347[12] = var14;
		this.field4347[13] = var15;
		this.field4347[14] = var16;
		this.field4347[15] = var17;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(B)[F", garbageValue = 
	"100")

	public float[] method7074() {
		float[] var1 = new float[3];
		class385 var2 = new class385(this.field4347[0], this.field4347[1], this.field4347[2]);
		class385 var3 = new class385(this.field4347[4], this.field4347[5], this.field4347[6]);
		class385 var4 = new class385(this.field4347[8], this.field4347[9], this.field4347[10]);
		var1[0] = var2.method7026();
		var1[1] = var3.method7026();
		var1[2] = var4.method7026();
		return var1;
	}

	public int hashCode() {
		boolean var1 = true;
		byte var2 = 1;
		int var3 = (var2 * 31) + Arrays.hashCode(this.field4347);
		return var3;
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method7072();
		this.method7086();

		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}

				float var4 = this.field4347[var3 + (var2 * 4)];
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
				if (var2.field4347[var3] != this.field4347[var3]) {
					return false;
				}
			}

			return true;
		}
	}
}