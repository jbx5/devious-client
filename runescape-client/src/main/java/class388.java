import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("nu")
public class class388 {
	@ObfuscatedName("c")
	float field4405;

	@ObfuscatedName("v")
	float field4400;

	@ObfuscatedName("q")
	float field4402;

	@ObfuscatedName("f")
	float field4409;

	@ObfuscatedName("j")
	float field4403;

	@ObfuscatedName("e")
	float field4408;

	@ObfuscatedName("g")
	float field4401;

	@ObfuscatedName("w")
	float field4407;

	@ObfuscatedName("y")
	float field4406;

	@ObfuscatedName("i")
	float field4404;

	@ObfuscatedName("s")
	float field4410;

	@ObfuscatedName("t")
	float field4411;

	static {
		new class388();
	}

	class388() {
		this.method7022();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1938760120")
	void method7022() {
		this.field4411 = 0.0F;
		this.field4410 = 0.0F;
		this.field4404 = 0.0F;
		this.field4407 = 0.0F;
		this.field4401 = 0.0F;
		this.field4408 = 0.0F;
		this.field4409 = 0.0F;
		this.field4402 = 0.0F;
		this.field4400 = 0.0F;
		this.field4406 = 1.0F;
		this.field4403 = 1.0F;
		this.field4405 = 1.0F;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(FI)V", garbageValue = "1277086210")
	void method7029(float var1) {
		float var2 = ((float) (Math.cos(((double) (var1)))));
		float var3 = ((float) (Math.sin(((double) (var1)))));
		float var4 = this.field4400;
		float var5 = this.field4403;
		float var6 = this.field4407;
		float var7 = this.field4410;
		this.field4400 = var4 * var2 - var3 * this.field4402;
		this.field4402 = this.field4402 * var2 + var3 * var4;
		this.field4403 = var5 * var2 - var3 * this.field4408;
		this.field4408 = var3 * var5 + var2 * this.field4408;
		this.field4407 = var2 * var6 - this.field4406 * var3;
		this.field4406 = var3 * var6 + var2 * this.field4406;
		this.field4410 = var2 * var7 - var3 * this.field4411;
		this.field4411 = this.field4411 * var2 + var3 * var7;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(FI)V", garbageValue = "287874371")
	void method7027(float var1) {
		float var2 = ((float) (Math.cos(((double) (var1)))));
		float var3 = ((float) (Math.sin(((double) (var1)))));
		float var4 = this.field4405;
		float var5 = this.field4409;
		float var6 = this.field4401;
		float var7 = this.field4404;
		this.field4405 = var4 * var2 + this.field4402 * var3;
		this.field4402 = this.field4402 * var2 - var3 * var4;
		this.field4409 = var2 * var5 + this.field4408 * var3;
		this.field4408 = var2 * this.field4408 - var5 * var3;
		this.field4401 = var2 * var6 + this.field4406 * var3;
		this.field4406 = var2 * this.field4406 - var6 * var3;
		this.field4404 = var7 * var2 + var3 * this.field4411;
		this.field4411 = this.field4411 * var2 - var7 * var3;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(FI)V", garbageValue = "736372883")
	void method7039(float var1) {
		float var2 = ((float) (Math.cos(((double) (var1)))));
		float var3 = ((float) (Math.sin(((double) (var1)))));
		float var4 = this.field4405;
		float var5 = this.field4409;
		float var6 = this.field4401;
		float var7 = this.field4404;
		this.field4405 = var4 * var2 - var3 * this.field4400;
		this.field4400 = var4 * var3 + var2 * this.field4400;
		this.field4409 = var5 * var2 - this.field4403 * var3;
		this.field4403 = var3 * var5 + this.field4403 * var2;
		this.field4401 = var2 * var6 - this.field4407 * var3;
		this.field4407 = var6 * var3 + this.field4407 * var2;
		this.field4404 = var7 * var2 - var3 * this.field4410;
		this.field4410 = var3 * var7 + var2 * this.field4410;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(FFFI)V", garbageValue = "1389632603")
	void method7026(float var1, float var2, float var3) {
		this.field4404 += var1;
		this.field4410 += var2;
		this.field4411 += var3;
	}

	public String toString() {
		return this.field4405 + "," + this.field4409 + "," + this.field4401 + "," + this.field4404 + "\n" + this.field4400 + "," + this.field4403 + "," + this.field4407 + "," + this.field4410 + "\n" + this.field4402 + "," + this.field4408 + "," + this.field4406 + "," + this.field4411;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(IB)I", garbageValue = "-34")
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var1 = WorldMapCacheName.method5054(var0);
		int var2 = var1.baseVar;
		int var3 = var1.startBit;
		int var4 = var1.endBit;
		int var5 = Varps.Varps_masks[var4 - var3];
		return Varps.Varps_main[var2] >> var3 & var5;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(FFFF[FI)V", garbageValue = "-885047060")
	static void method7040(float var0, float var1, float var2, float var3, float[] var4) {
		float var5 = var1 - var0;
		float var6 = var2 - var1;
		float var7 = var3 - var2;
		float var8 = var6 - var5;
		var4[3] = var7 - var6 - var8;
		var4[2] = var8 + var8 + var8;
		var4[1] = var5 + var5 + var5;
		var4[0] = var0;
	}
}