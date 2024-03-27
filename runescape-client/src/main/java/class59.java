import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
public class class59 {
	@ObfuscatedName("wv")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lbb;"
	)
	VorbisFloor field412;
	@ObfuscatedName("ah")
	boolean field415;
	@ObfuscatedName("af")
	int[] field413;
	@ObfuscatedName("at")
	int[] field411;
	@ObfuscatedName("an")
	boolean[] field414;

	@ObfuscatedSignature(
		descriptor = "(Lbb;Z[I[I[Z)V"
	)
	class59(VorbisFloor var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
		this.field412 = var1;
		this.field415 = var2;
		this.field413 = var3;
		this.field411 = var4;
		this.field414 = var5;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([FII)V",
		garbageValue = "-1600788598"
	)
	void method1111(float[] var1, int var2) {
		int var3 = this.field412.field261.length;
		VorbisFloor var10000 = this.field412;
		int var4 = VorbisFloor.field265[this.field412.multiplier - 1];
		boolean[] var5 = this.field414;
		this.field414[1] = true;
		var5[0] = true;

		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		for (var6 = 2; var6 < var3; ++var6) {
			var7 = this.field412.method747(this.field413, var6);
			var8 = this.field412.method731(this.field413, var6);
			var9 = this.field412.method736(this.field413[var7], this.field411[var7], this.field413[var8], this.field411[var8], this.field413[var6]);
			var10 = this.field411[var6];
			int var11 = var4 - var9;
			int var13 = (var11 < var9 ? var11 : var9) << 1;
			if (var10 != 0) {
				boolean[] var14 = this.field414;
				this.field414[var8] = true;
				var14[var7] = true;
				this.field414[var6] = true;
				if (var10 >= var13) {
					this.field411[var6] = var11 > var9 ? var9 + (var10 - var9) : var11 + (var9 - var10) - 1;
				} else {
					this.field411[var6] = (var10 & 1) != 0 ? var9 - (var10 + 1) / 2 : var10 / 2 + var9;
				}
			} else {
				this.field414[var6] = false;
				this.field411[var6] = var9;
			}
		}

		this.VarbisFloor_sort(0, var3 - 1);
		var6 = 0;
		var7 = this.field412.multiplier * this.field411[0];

		for (var8 = 1; var8 < var3; ++var8) {
			if (this.field414[var8]) {
				var9 = this.field413[var8];
				var10 = this.field412.multiplier * this.field411[var8];
				this.field412.method746(var6, var7, var9, var10, var1, var2);
				if (var9 >= var2) {
					return;
				}

				var6 = var9;
				var7 = var10;
			}
		}

		var10000 = this.field412;
		float var16 = VorbisFloor.VorbisFloor_decibelStatics[var7];

		for (var9 = var6; var9 < var2; ++var9) {
			var1[var9] *= var16;
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "139624089"
	)
	boolean method1120() {
		return this.field415;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1754879302"
	)
	@Export("VarbisFloor_sort")
	void VarbisFloor_sort(int var1, int var2) {
		if (var1 < var2) {
			int var3 = var1;
			int var4 = this.field413[var1];
			int var5 = this.field411[var1];
			boolean var6 = this.field414[var1];

			for (int var7 = var1 + 1; var7 <= var2; ++var7) {
				int var8 = this.field413[var7];
				if (var8 < var4) {
					this.field413[var3] = var8;
					this.field411[var3] = this.field411[var7];
					this.field414[var3] = this.field414[var7];
					++var3;
					this.field413[var7] = this.field413[var3];
					this.field411[var7] = this.field411[var3];
					this.field414[var7] = this.field414[var3];
				}
			}

			this.field413[var3] = var4;
			this.field411[var3] = var5;
			this.field414[var3] = var6;
			this.VarbisFloor_sort(var1, var3 - 1);
			this.VarbisFloor_sort(var3 + 1, var2);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-785248472"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0;
		Login.Login_response2 = var1;
		Login.Login_response3 = var2;
	}
}
