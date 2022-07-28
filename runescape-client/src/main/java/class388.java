import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import java.util.Arrays;
import java.util.Date;
@ObfuscatedName("nb")
public final class class388 {
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "[Lnb;")
	static class388[] field4409 = new class388[0];

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lnb;")
	public static final class388 field4407;

	@ObfuscatedName("w")
	public float[] field4410 = new float[16];

	static {
		EnumComposition.method3461(100);
		field4407 = new class388();
	}

	public class388() {
		this.method7004();
	}

	@ObfuscatedSignature(descriptor = "(Lnb;)V")
	public class388(class388 var1) {
		this.method7005(var1);
	}

	@ObfuscatedSignature(descriptor = "(Lqw;Z)V")
	public class388(Buffer var1, boolean var2) {
		this.method7001(var1, var2);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "2102182031")
	public void method7027() {
		synchronized(field4409) {
			if (class259.field2903 < IgnoreList.field4293 - 1) {
				field4409[++class259.field2903 - 1] = this;
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(Lqw;ZB)V", garbageValue = "97")
	void method7001(Buffer var1, boolean var2) {
		if (var2) {
			class389 var7 = new class389();
			var7.method7061(WorldMapManager.method4818(var1.readShort()));
			var7.method7062(WorldMapManager.method4818(var1.readShort()));
			int var6 = var1.readShort();
			var6 &= 16383;
			float var5 = ((float) (((double) (((float) (var6)) / 16384.0F)) * 6.283185307179586));
			var7.method7063(var5);
			var7.method7064(((float) (var1.readShort())), ((float) (var1.readShort())), ((float) (var1.readShort())));
			this.method7011(var7);
		} else {
			for (int var3 = 0; var3 < 16; ++var3) {
				this.field4410[var3] = var1.readFloat();
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)[F", garbageValue = "1489460418")
	float[] method7023() {
		float[] var1 = new float[3];
		if (((double) (this.field4410[2])) < 0.999 && ((double) (this.field4410[2])) > -0.999) {
			var1[1] = ((float) (-Math.asin(((double) (this.field4410[2])))));
			double var2 = Math.cos(((double) (var1[1])));
			var1[0] = ((float) (Math.atan2(((double) (this.field4410[6])) / var2, ((double) (this.field4410[10])) / var2)));
			var1[2] = ((float) (Math.atan2(((double) (this.field4410[1])) / var2, ((double) (this.field4410[0])) / var2)));
		} else {
			var1[0] = 0.0F;
			var1[1] = ((float) (Math.atan2(((double) (this.field4410[2])), 0.0)));
			var1[2] = ((float) (Math.atan2(((double) (-this.field4410[9])), ((double) (this.field4410[5])))));
		}
		return var1;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(B)[F", garbageValue = "82")
	public float[] method7003() {
		float[] var1 = new float[]{ ((float) (-Math.asin(((double) (this.field4410[6]))))), 0.0F, 0.0F };
		double var2 = Math.cos(((double) (var1[0])));
		double var4;
		double var6;
		if (Math.abs(var2) > 0.005) {
			var4 = ((double) (this.field4410[2]));
			var6 = ((double) (this.field4410[10]));
			double var8 = ((double) (this.field4410[4]));
			double var10 = ((double) (this.field4410[5]));
			var1[1] = ((float) (Math.atan2(var4, var6)));
			var1[2] = ((float) (Math.atan2(var8, var10)));
		} else {
			var4 = ((double) (this.field4410[1]));
			var6 = ((double) (this.field4410[0]));
			if (this.field4410[6] < 0.0F) {
				var1[1] = ((float) (Math.atan2(var4, var6)));
			} else {
				var1[1] = ((float) (-Math.atan2(var4, var6)));
			}
			var1[2] = 0.0F;
		}
		return var1;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "3")
	void method7004() {
		this.field4410[0] = 1.0F;
		this.field4410[1] = 0.0F;
		this.field4410[2] = 0.0F;
		this.field4410[3] = 0.0F;
		this.field4410[4] = 0.0F;
		this.field4410[5] = 1.0F;
		this.field4410[6] = 0.0F;
		this.field4410[7] = 0.0F;
		this.field4410[8] = 0.0F;
		this.field4410[9] = 0.0F;
		this.field4410[10] = 1.0F;
		this.field4410[11] = 0.0F;
		this.field4410[12] = 0.0F;
		this.field4410[13] = 0.0F;
		this.field4410[14] = 0.0F;
		this.field4410[15] = 1.0F;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1645302970")
	public void method7045() {
		this.field4410[0] = 0.0F;
		this.field4410[1] = 0.0F;
		this.field4410[2] = 0.0F;
		this.field4410[3] = 0.0F;
		this.field4410[4] = 0.0F;
		this.field4410[5] = 0.0F;
		this.field4410[6] = 0.0F;
		this.field4410[7] = 0.0F;
		this.field4410[8] = 0.0F;
		this.field4410[9] = 0.0F;
		this.field4410[10] = 0.0F;
		this.field4410[11] = 0.0F;
		this.field4410[12] = 0.0F;
		this.field4410[13] = 0.0F;
		this.field4410[14] = 0.0F;
		this.field4410[15] = 0.0F;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Lnb;I)V", garbageValue = "-2073948325")
	public void method7005(class388 var1) {
		System.arraycopy(var1.field4410, 0, this.field4410, 0, 16);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(FI)V", garbageValue = "1147825847")
	public void method7006(float var1) {
		this.method7007(var1, var1, var1);
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(FFFB)V", garbageValue = "-27")
	public void method7007(float var1, float var2, float var3) {
		this.method7004();
		this.field4410[0] = var1;
		this.field4410[5] = var2;
		this.field4410[10] = var3;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(Lnb;I)V", garbageValue = "1561270174")
	public void method7008(class388 var1) {
		for (int var2 = 0; var2 < this.field4410.length; ++var2) {
			float[] var10000 = this.field4410;
			var10000[var2] += var1.field4410[var2];
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(Lnb;I)V", garbageValue = "333295335")
	public void method7009(class388 var1) {
		float var2 = this.field4410[2] * var1.field4410[8] + this.field4410[1] * var1.field4410[4] + this.field4410[0] * var1.field4410[0] + var1.field4410[12] * this.field4410[3];
		float var3 = this.field4410[3] * var1.field4410[13] + var1.field4410[9] * this.field4410[2] + this.field4410[0] * var1.field4410[1] + var1.field4410[5] * this.field4410[1];
		float var4 = this.field4410[2] * var1.field4410[10] + this.field4410[1] * var1.field4410[6] + var1.field4410[2] * this.field4410[0] + var1.field4410[14] * this.field4410[3];
		float var5 = this.field4410[3] * var1.field4410[15] + var1.field4410[11] * this.field4410[2] + this.field4410[0] * var1.field4410[3] + this.field4410[1] * var1.field4410[7];
		float var6 = this.field4410[7] * var1.field4410[12] + var1.field4410[0] * this.field4410[4] + var1.field4410[4] * this.field4410[5] + var1.field4410[8] * this.field4410[6];
		float var7 = this.field4410[7] * var1.field4410[13] + var1.field4410[1] * this.field4410[4] + this.field4410[5] * var1.field4410[5] + var1.field4410[9] * this.field4410[6];
		float var8 = this.field4410[7] * var1.field4410[14] + var1.field4410[6] * this.field4410[5] + this.field4410[4] * var1.field4410[2] + this.field4410[6] * var1.field4410[10];
		float var9 = var1.field4410[15] * this.field4410[7] + this.field4410[6] * var1.field4410[11] + this.field4410[5] * var1.field4410[7] + var1.field4410[3] * this.field4410[4];
		float var10 = this.field4410[9] * var1.field4410[4] + this.field4410[8] * var1.field4410[0] + this.field4410[10] * var1.field4410[8] + this.field4410[11] * var1.field4410[12];
		float var11 = var1.field4410[9] * this.field4410[10] + this.field4410[8] * var1.field4410[1] + var1.field4410[5] * this.field4410[9] + this.field4410[11] * var1.field4410[13];
		float var12 = var1.field4410[2] * this.field4410[8] + this.field4410[9] * var1.field4410[6] + var1.field4410[10] * this.field4410[10] + this.field4410[11] * var1.field4410[14];
		float var13 = var1.field4410[15] * this.field4410[11] + var1.field4410[11] * this.field4410[10] + var1.field4410[7] * this.field4410[9] + this.field4410[8] * var1.field4410[3];
		float var14 = this.field4410[15] * var1.field4410[12] + var1.field4410[4] * this.field4410[13] + var1.field4410[0] * this.field4410[12] + this.field4410[14] * var1.field4410[8];
		float var15 = this.field4410[12] * var1.field4410[1] + var1.field4410[5] * this.field4410[13] + this.field4410[14] * var1.field4410[9] + var1.field4410[13] * this.field4410[15];
		float var16 = var1.field4410[10] * this.field4410[14] + this.field4410[13] * var1.field4410[6] + var1.field4410[2] * this.field4410[12] + var1.field4410[14] * this.field4410[15];
		float var17 = var1.field4410[15] * this.field4410[15] + var1.field4410[3] * this.field4410[12] + this.field4410[13] * var1.field4410[7] + var1.field4410[11] * this.field4410[14];
		this.field4410[0] = var2;
		this.field4410[1] = var3;
		this.field4410[2] = var4;
		this.field4410[3] = var5;
		this.field4410[4] = var6;
		this.field4410[5] = var7;
		this.field4410[6] = var8;
		this.field4410[7] = var9;
		this.field4410[8] = var10;
		this.field4410[9] = var11;
		this.field4410[10] = var12;
		this.field4410[11] = var13;
		this.field4410[12] = var14;
		this.field4410[13] = var15;
		this.field4410[14] = var16;
		this.field4410[15] = var17;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(Lno;I)V", garbageValue = "-403429597")
	public void method7051(class387 var1) {
		float var2 = var1.field4406 * var1.field4406;
		float var3 = var1.field4406 * var1.field4405;
		float var4 = var1.field4404 * var1.field4406;
		float var5 = var1.field4406 * var1.field4401;
		float var6 = var1.field4405 * var1.field4405;
		float var7 = var1.field4405 * var1.field4404;
		float var8 = var1.field4401 * var1.field4405;
		float var9 = var1.field4404 * var1.field4404;
		float var10 = var1.field4401 * var1.field4404;
		float var11 = var1.field4401 * var1.field4401;
		this.field4410[0] = var2 + var6 - var11 - var9;
		this.field4410[1] = var5 + var7 + var7 + var5;
		this.field4410[2] = var8 - var4 - var4 + var8;
		this.field4410[4] = var7 + (var7 - var5 - var5);
		this.field4410[5] = var2 + var9 - var6 - var11;
		this.field4410[6] = var3 + var3 + var10 + var10;
		this.field4410[8] = var8 + var4 + var8 + var4;
		this.field4410[9] = var10 + (var10 - var3 - var3);
		this.field4410[10] = var11 + var2 - var9 - var6;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(Lnn;B)V", garbageValue = "44")
	void method7011(class389 var1) {
		this.field4410[0] = var1.field4422;
		this.field4410[1] = var1.field4423;
		this.field4410[2] = var1.field4414;
		this.field4410[3] = 0.0F;
		this.field4410[4] = var1.field4418;
		this.field4410[5] = var1.field4416;
		this.field4410[6] = var1.field4417;
		this.field4410[7] = 0.0F;
		this.field4410[8] = var1.field4412;
		this.field4410[9] = var1.field4419;
		this.field4410[10] = var1.field4420;
		this.field4410[11] = 0.0F;
		this.field4410[12] = var1.field4421;
		this.field4410[13] = var1.field4413;
		this.field4410[14] = var1.field4415;
		this.field4410[15] = 1.0F;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "(B)F", garbageValue = "0")
	float method7012() {
		return this.field4410[10] * this.field4410[4] * this.field4410[3] * this.field4410[13] + (this.field4410[13] * this.field4410[8] * this.field4410[7] * this.field4410[2] + this.field4410[12] * this.field4410[5] * this.field4410[2] * this.field4410[11] + (this.field4410[15] * this.field4410[4] * this.field4410[2] * this.field4410[9] + this.field4410[12] * this.field4410[1] * this.field4410[7] * this.field4410[10] + (this.field4410[14] * this.field4410[1] * this.field4410[4] * this.field4410[11] + (this.field4410[13] * this.field4410[6] * this.field4410[0] * this.field4410[11] + (this.field4410[10] * this.field4410[0] * this.field4410[5] * this.field4410[15] - this.field4410[5] * this.field4410[0] * this.field4410[11] * this.field4410[14] - this.field4410[15] * this.field4410[9] * this.field4410[0] * this.field4410[6]) + this.field4410[14] * this.field4410[0] * this.field4410[7] * this.field4410[9] - this.field4410[13] * this.field4410[7] * this.field4410[0] * this.field4410[10] - this.field4410[15] * this.field4410[4] * this.field4410[1] * this.field4410[10]) + this.field4410[1] * this.field4410[6] * this.field4410[8] * this.field4410[15] - this.field4410[12] * this.field4410[11] * this.field4410[1] * this.field4410[6] - this.field4410[14] * this.field4410[8] * this.field4410[1] * this.field4410[7]) - this.field4410[13] * this.field4410[11] * this.field4410[2] * this.field4410[4] - this.field4410[15] * this.field4410[5] * this.field4410[2] * this.field4410[8]) - this.field4410[7] * this.field4410[2] * this.field4410[9] * this.field4410[12] - this.field4410[14] * this.field4410[9] * this.field4410[4] * this.field4410[3]) + this.field4410[14] * this.field4410[3] * this.field4410[5] * this.field4410[8] - this.field4410[12] * this.field4410[3] * this.field4410[5] * this.field4410[10] - this.field4410[8] * this.field4410[6] * this.field4410[3] * this.field4410[13] + this.field4410[12] * this.field4410[3] * this.field4410[6] * this.field4410[9];
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "226481954")
	public void method6999() {
		float var1 = 1.0F / this.method7012();
		float var2 = var1 * (this.field4410[15] * this.field4410[10] * this.field4410[5] - this.field4410[11] * this.field4410[5] * this.field4410[14] - this.field4410[9] * this.field4410[6] * this.field4410[15] + this.field4410[13] * this.field4410[11] * this.field4410[6] + this.field4410[14] * this.field4410[9] * this.field4410[7] - this.field4410[13] * this.field4410[7] * this.field4410[10]);
		float var3 = (this.field4410[13] * this.field4410[3] * this.field4410[10] + (this.field4410[14] * this.field4410[1] * this.field4410[11] + -this.field4410[1] * this.field4410[10] * this.field4410[15] + this.field4410[2] * this.field4410[9] * this.field4410[15] - this.field4410[13] * this.field4410[2] * this.field4410[11] - this.field4410[14] * this.field4410[9] * this.field4410[3])) * var1;
		float var4 = (this.field4410[13] * this.field4410[2] * this.field4410[7] + (this.field4410[1] * this.field4410[6] * this.field4410[15] - this.field4410[14] * this.field4410[7] * this.field4410[1] - this.field4410[5] * this.field4410[2] * this.field4410[15]) + this.field4410[3] * this.field4410[5] * this.field4410[14] - this.field4410[13] * this.field4410[6] * this.field4410[3]) * var1;
		float var5 = var1 * (this.field4410[11] * this.field4410[2] * this.field4410[5] + this.field4410[7] * this.field4410[1] * this.field4410[10] + -this.field4410[1] * this.field4410[6] * this.field4410[11] - this.field4410[9] * this.field4410[7] * this.field4410[2] - this.field4410[10] * this.field4410[3] * this.field4410[5] + this.field4410[3] * this.field4410[6] * this.field4410[9]);
		float var6 = var1 * (this.field4410[15] * this.field4410[6] * this.field4410[8] + -this.field4410[4] * this.field4410[10] * this.field4410[15] + this.field4410[11] * this.field4410[4] * this.field4410[14] - this.field4410[11] * this.field4410[6] * this.field4410[12] - this.field4410[14] * this.field4410[8] * this.field4410[7] + this.field4410[12] * this.field4410[10] * this.field4410[7]);
		float var7 = var1 * (this.field4410[14] * this.field4410[3] * this.field4410[8] + this.field4410[15] * this.field4410[0] * this.field4410[10] - this.field4410[14] * this.field4410[11] * this.field4410[0] - this.field4410[8] * this.field4410[2] * this.field4410[15] + this.field4410[2] * this.field4410[11] * this.field4410[12] - this.field4410[10] * this.field4410[3] * this.field4410[12]);
		float var8 = (this.field4410[6] * this.field4410[3] * this.field4410[12] + (this.field4410[15] * this.field4410[2] * this.field4410[4] + this.field4410[14] * this.field4410[7] * this.field4410[0] + this.field4410[15] * -this.field4410[0] * this.field4410[6] - this.field4410[2] * this.field4410[7] * this.field4410[12] - this.field4410[3] * this.field4410[4] * this.field4410[14])) * var1;
		float var9 = (this.field4410[4] * this.field4410[3] * this.field4410[10] + this.field4410[0] * this.field4410[6] * this.field4410[11] - this.field4410[0] * this.field4410[7] * this.field4410[10] - this.field4410[4] * this.field4410[2] * this.field4410[11] + this.field4410[8] * this.field4410[7] * this.field4410[2] - this.field4410[3] * this.field4410[6] * this.field4410[8]) * var1;
		float var10 = var1 * (this.field4410[15] * this.field4410[9] * this.field4410[4] - this.field4410[4] * this.field4410[11] * this.field4410[13] - this.field4410[15] * this.field4410[5] * this.field4410[8] + this.field4410[5] * this.field4410[11] * this.field4410[12] + this.field4410[13] * this.field4410[8] * this.field4410[7] - this.field4410[12] * this.field4410[7] * this.field4410[9]);
		float var11 = var1 * (this.field4410[9] * this.field4410[3] * this.field4410[12] + (this.field4410[9] * -this.field4410[0] * this.field4410[15] + this.field4410[13] * this.field4410[11] * this.field4410[0] + this.field4410[1] * this.field4410[8] * this.field4410[15] - this.field4410[11] * this.field4410[1] * this.field4410[12] - this.field4410[13] * this.field4410[3] * this.field4410[8]));
		float var12 = var1 * (this.field4410[5] * this.field4410[0] * this.field4410[15] - this.field4410[7] * this.field4410[0] * this.field4410[13] - this.field4410[15] * this.field4410[4] * this.field4410[1] + this.field4410[12] * this.field4410[1] * this.field4410[7] + this.field4410[3] * this.field4410[4] * this.field4410[13] - this.field4410[12] * this.field4410[5] * this.field4410[3]);
		float var13 = (this.field4410[8] * this.field4410[5] * this.field4410[3] + (this.field4410[9] * this.field4410[7] * this.field4410[0] + this.field4410[11] * -this.field4410[0] * this.field4410[5] + this.field4410[11] * this.field4410[1] * this.field4410[4] - this.field4410[7] * this.field4410[1] * this.field4410[8] - this.field4410[9] * this.field4410[4] * this.field4410[3])) * var1;
		float var14 = (this.field4410[6] * this.field4410[9] * this.field4410[12] + (this.field4410[14] * this.field4410[8] * this.field4410[5] + this.field4410[14] * -this.field4410[4] * this.field4410[9] + this.field4410[13] * this.field4410[10] * this.field4410[4] - this.field4410[10] * this.field4410[5] * this.field4410[12] - this.field4410[13] * this.field4410[8] * this.field4410[6])) * var1;
		float var15 = (this.field4410[2] * this.field4410[8] * this.field4410[13] + this.field4410[12] * this.field4410[10] * this.field4410[1] + (this.field4410[9] * this.field4410[0] * this.field4410[14] - this.field4410[13] * this.field4410[0] * this.field4410[10] - this.field4410[8] * this.field4410[1] * this.field4410[14]) - this.field4410[9] * this.field4410[2] * this.field4410[12]) * var1;
		float var16 = (this.field4410[13] * this.field4410[0] * this.field4410[6] + -this.field4410[0] * this.field4410[5] * this.field4410[14] + this.field4410[14] * this.field4410[4] * this.field4410[1] - this.field4410[12] * this.field4410[6] * this.field4410[1] - this.field4410[13] * this.field4410[4] * this.field4410[2] + this.field4410[2] * this.field4410[5] * this.field4410[12]) * var1;
		float var17 = (this.field4410[5] * this.field4410[0] * this.field4410[10] - this.field4410[6] * this.field4410[0] * this.field4410[9] - this.field4410[4] * this.field4410[1] * this.field4410[10] + this.field4410[8] * this.field4410[1] * this.field4410[6] + this.field4410[2] * this.field4410[4] * this.field4410[9] - this.field4410[5] * this.field4410[2] * this.field4410[8]) * var1;
		this.field4410[0] = var2;
		this.field4410[1] = var3;
		this.field4410[2] = var4;
		this.field4410[3] = var5;
		this.field4410[4] = var6;
		this.field4410[5] = var7;
		this.field4410[6] = var8;
		this.field4410[7] = var9;
		this.field4410[8] = var10;
		this.field4410[9] = var11;
		this.field4410[10] = var12;
		this.field4410[11] = var13;
		this.field4410[12] = var14;
		this.field4410[13] = var15;
		this.field4410[14] = var16;
		this.field4410[15] = var17;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(S)[F", garbageValue = "10880")
	public float[] method7015() {
		float[] var1 = new float[3];
		class386 var2 = new class386(this.field4410[0], this.field4410[1], this.field4410[2]);
		class386 var3 = new class386(this.field4410[4], this.field4410[5], this.field4410[6]);
		class386 var4 = new class386(this.field4410[8], this.field4410[9], this.field4410[10]);
		var1[0] = var2.method6962();
		var1[1] = var3.method6962();
		var1[2] = var4.method6962();
		return var1;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class388)) {
			return false;
		} else {
			class388 var2 = ((class388) (var1));
			for (int var3 = 0; var3 < 16; ++var3) {
				if (var2.field4410[var3] != this.field4410[var3]) {
					return false;
				}
			}
			return true;
		}
	}

	public int hashCode() {
		boolean var1 = true;
		int var2 = 1;
		var2 = var2 * 31 + Arrays.hashCode(this.field4410);
		return var2;
	}

	public String toString() {
		StringBuilder var1 = new StringBuilder();
		this.method7003();
		this.method7023();
		for (int var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < 4; ++var3) {
				if (var3 > 0) {
					var1.append("\t");
				}
				float var4 = this.field4410[var3 + var2 * 4];
				if (Math.sqrt(((double) (var4 * var4))) < 9.999999747378752E-5) {
					var4 = 0.0F;
				}
				var1.append(var4);
			}
			var1.append("\n");
		}
		return var1.toString();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Ljava/util/Date;B)Z", garbageValue = "-31")
	static boolean method7052(Date var0) {
		Date var1 = ClanMate.method6695();
		return var0.after(var1);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(Lmx;Lmx;B)V", garbageValue = "36")
	static void method7058(Font var0, Font var1) {
		int var4;
		int var5;
		if (class12.worldSelectBackSprites == null) {
			Archive var3 = AbstractWorldMapData.archive8;
			var4 = var3.getGroupId("sl_back");
			var5 = var3.getFileId(var4, "");
			SpritePixels[] var2 = NPC.method2434(var3, var4, var5);
			class12.worldSelectBackSprites = var2;
		}
		if (VerticalAlignment.worldSelectFlagSprites == null) {
			VerticalAlignment.worldSelectFlagSprites = class342.method6304(AbstractWorldMapData.archive8, "sl_flags", "");
		}
		if (Login.worldSelectArrows == null) {
			Login.worldSelectArrows = class342.method6304(AbstractWorldMapData.archive8, "sl_arrows", "");
		}
		if (class12.worldSelectStars == null) {
			class12.worldSelectStars = class342.method6304(AbstractWorldMapData.archive8, "sl_stars", "");
		}
		if (class118.worldSelectLeftSprite == null) {
			class118.worldSelectLeftSprite = BufferedNetSocket.SpriteBuffer_getIndexedSpriteByName(AbstractWorldMapData.archive8, "leftarrow", "");
		}
		if (class33.worldSelectRightSprite == null) {
			class33.worldSelectRightSprite = BufferedNetSocket.SpriteBuffer_getIndexedSpriteByName(AbstractWorldMapData.archive8, "rightarrow", "");
		}
		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
		var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
		if (class12.worldSelectStars != null) {
			class12.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
			var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
			class12.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
			var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
		}
		if (Login.worldSelectArrows != null) {
			int var22 = Login.xPadding + 280;
			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
				Login.worldSelectArrows[2].drawAt(var22, 4);
			} else {
				Login.worldSelectArrows[0].drawAt(var22, 4);
			}
			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
				Login.worldSelectArrows[3].drawAt(var22 + 15, 4);
			} else {
				Login.worldSelectArrows[1].drawAt(var22 + 15, 4);
			}
			var0.draw("World", var22 + 32, 17, 16777215, -1);
			int var23 = Login.xPadding + 390;
			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
				Login.worldSelectArrows[2].drawAt(var23, 4);
			} else {
				Login.worldSelectArrows[0].drawAt(var23, 4);
			}
			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
				Login.worldSelectArrows[3].drawAt(var23 + 15, 4);
			} else {
				Login.worldSelectArrows[1].drawAt(var23 + 15, 4);
			}
			var0.draw("Players", var23 + 32, 17, 16777215, -1);
			var4 = Login.xPadding + 500;
			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
				Login.worldSelectArrows[2].drawAt(var4, 4);
			} else {
				Login.worldSelectArrows[0].drawAt(var4, 4);
			}
			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
				Login.worldSelectArrows[3].drawAt(var4 + 15, 4);
			} else {
				Login.worldSelectArrows[1].drawAt(var4 + 15, 4);
			}
			var0.draw("Location", var4 + 32, 17, 16777215, -1);
			var5 = Login.xPadding + 610;
			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
				Login.worldSelectArrows[2].drawAt(var5, 4);
			} else {
				Login.worldSelectArrows[0].drawAt(var5, 4);
			}
			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
				Login.worldSelectArrows[3].drawAt(var5 + 15, 4);
			} else {
				Login.worldSelectArrows[1].drawAt(var5 + 15, 4);
			}
			var0.draw("Type", var5 + 32, 17, 16777215, -1);
		}
		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
		var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
		Login.hoveredWorldIndex = -1;
		if (class12.worldSelectBackSprites != null) {
			byte var26 = 88;
			byte var27 = 19;
			var4 = 765 / (var26 + 1) - 1;
			var5 = 480 / (var27 + 1);
			int var6;
			int var7;
			do {
				var6 = var5;
				var7 = var4;
				if (var5 * (var4 - 1) >= World.World_count) {
					--var4;
				}
				if (var4 * (var5 - 1) >= World.World_count) {
					--var5;
				}
				if (var4 * (var5 - 1) >= World.World_count) {
					--var5;
				}
			} while (var5 != var6 || var4 != var7 );
			var6 = (765 - var4 * var26) / (var4 + 1);
			if (var6 > 5) {
				var6 = 5;
			}
			var7 = (480 - var27 * var5) / (var5 + 1);
			if (var7 > 5) {
				var7 = 5;
			}
			int var8 = (765 - var4 * var26 - var6 * (var4 - 1)) / 2;
			int var9 = (480 - var5 * var27 - var7 * (var5 - 1)) / 2;
			int var10 = (var5 + World.World_count - 1) / var5;
			Login.worldSelectPagesCount = var10 - var4;
			if (class118.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
				class118.worldSelectLeftSprite.drawAt(8, class228.canvasHeight / 2 - class118.worldSelectLeftSprite.subHeight / 2);
			}
			if (class33.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
				class33.worldSelectRightSprite.drawAt(class352.canvasWidth - class33.worldSelectRightSprite.subWidth - 8, class228.canvasHeight / 2 - class33.worldSelectRightSprite.subHeight / 2);
			}
			int var11 = var9 + 23;
			int var12 = var8 + Login.xPadding;
			int var13 = 0;
			boolean var14 = false;
			int var15 = Login.worldSelectPage;
			int var16;
			for (var16 = var15 * var5; var16 < World.World_count && var15 - Login.worldSelectPage < var4; ++var16) {
				World var17 = class93.World_worlds[var16];
				boolean var18 = true;
				String var19 = Integer.toString(var17.population);
				if (var17.population == -1) {
					var19 = "OFF";
					var18 = false;
				} else if (var17.population > 1980) {
					var19 = "FULL";
					var18 = false;
				}
				int var21 = 0;
				byte var20;
				if (var17.isBeta()) {
					if (var17.isMembersOnly()) {
						var20 = 7;
					} else {
						var20 = 6;
					}
				} else if (var17.isDeadman()) {
					var21 = 16711680;
					if (var17.isMembersOnly()) {
						var20 = 5;
					} else {
						var20 = 4;
					}
				} else if (var17.method1647()) {
					if (var17.isMembersOnly()) {
						var20 = 9;
					} else {
						var20 = 8;
					}
				} else if (var17.isPvp()) {
					if (var17.isMembersOnly()) {
						var20 = 3;
					} else {
						var20 = 2;
					}
				} else if (var17.isMembersOnly()) {
					var20 = 1;
				} else {
					var20 = 0;
				}
				if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var11 && MouseHandler.MouseHandler_x < var26 + var12 && MouseHandler.MouseHandler_y < var27 + var11 && var18) {
					Login.hoveredWorldIndex = var16;
					class12.worldSelectBackSprites[var20].drawTransOverlayAt(var12, var11, 128, 16777215);
					var14 = true;
				} else {
					class12.worldSelectBackSprites[var20].drawAt(var12, var11);
				}
				if (VerticalAlignment.worldSelectFlagSprites != null) {
					VerticalAlignment.worldSelectFlagSprites[(var17.isMembersOnly() ? 8 : 0) + var17.location].drawAt(var12 + 29, var11);
				}
				var0.drawCentered(Integer.toString(var17.id), var12 + 15, var27 / 2 + var11 + 5, var21, -1);
				var1.drawCentered(var19, var12 + 60, var27 / 2 + var11 + 5, 268435455, -1);
				var11 = var11 + var7 + var27;
				++var13;
				if (var13 >= var5) {
					var11 = var9 + 23;
					var12 = var12 + var26 + var6;
					var13 = 0;
					++var15;
				}
			}
			if (var14) {
				var16 = var1.stringWidth(class93.World_worlds[Login.hoveredWorldIndex].activity) + 6;
				int var24 = var1.ascent + 8;
				int var25 = MouseHandler.MouseHandler_y + 25;
				if (var24 + var25 > 480) {
					var25 = MouseHandler.MouseHandler_y - 25 - var24;
				}
				Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var24, 16777120);
				Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var24, 0);
				var1.drawCentered(class93.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var25 + var1.ascent + 4, 0, -1);
			}
		}
		class268.rasterProvider.drawFull(0, 0);
	}
}