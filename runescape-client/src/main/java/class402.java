import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("po")
public class class402 {
	@ObfuscatedName("am")
	static int[] field4683;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1985232299
	)
	static int field4682;
	@ObfuscatedName("ap")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("ak")
	int[] field4678;
	@ObfuscatedName("aj")
	int[] field4679;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1220810763
	)
	int field4685;

	public class402() {
		this.spriteMap = new HashMap();
		this.bounds = new Bounds(0, 0);
		this.field4678 = new int[2048];
		this.field4679 = new int[2048];
		this.field4685 = 0;
		field4683 = new int[2000];
		int var1 = 0;
		int var2 = 240;

		int var4;
		for (byte var3 = 12; var1 < 16; var2 -= var3) {
			var4 = TaskHandler.method4504((double)((float)var2 / 360.0F), 0.9998999834060669D, (double)(0.425F * (float)var1 / 16.0F + 0.075F));
			field4683[var1] = var4;
			++var1;
		}

		var2 = 48;

		for (int var6 = var2 / 6; var1 < field4683.length; var2 -= var6) {
			var4 = var1 * 2;

			for (int var5 = TaskHandler.method4504((double)((float)var2 / 360.0F), 0.9998999834060669D, 0.5D); var1 < var4 && var1 < field4683.length; ++var1) {
				field4683[var1] = var5;
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	void method7836(int var1) {
		int var2 = var1 * 2 + 1;
		double var4 = (double)((float)var1 / 3.0F);
		int var6 = var1 * 2 + 1;
		double[] var7 = new double[var6];
		int var8 = -var1;

		for (int var9 = 0; var8 <= var1; ++var9) {
			double var16 = (double)(var8 - 0) / var4;
			double var14 = Math.exp(var16 * -var16 / 2.0D) / Math.sqrt(6.283185307179586D);
			double var24 = var14 / var4;
			var7[var9] = var24;
			++var8;
		}

		double[] var18 = var7;
		double var19 = var7[var1] * var7[var1];
		int[] var21 = new int[var2 * var2];
		boolean var10 = false;

		for (int var11 = 0; var11 < var2; ++var11) {
			for (int var12 = 0; var12 < var2; ++var12) {
				int var13 = var21[var12 + var11 * var2] = (int)(256.0D * (var18[var12] * var18[var11] / var19));
				if (!var10 && var13 > 0) {
					var10 = true;
				}
			}
		}

		SpritePixels var22 = new SpritePixels(var21, var2, var2);
		this.spriteMap.put(var1, var22);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lvv;",
		garbageValue = "943299871"
	)
	SpritePixels method7816(int var1) {
		if (!this.spriteMap.containsKey(var1)) {
			this.method7836(var1);
		}

		return (SpritePixels)this.spriteMap.get(var1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "21"
	)
	public final void method7817(int var1, int var2) {
		if (this.field4685 < this.field4678.length) {
			this.field4678[this.field4685] = var1;
			this.field4679[this.field4685] = var2;
			++this.field4685;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-116"
	)
	public final void method7818() {
		this.field4685 = 0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IILvv;FB)V",
		garbageValue = "93"
	)
	public final void method7819(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(18.0F * var4);
		SpritePixels var6 = this.method7816(var5);
		int var7 = var5 * 2 + 1;
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
		Bounds var9 = new Bounds(0, 0);
		this.bounds.setHigh(var7, var7);
		System.nanoTime();

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field4685; ++var10) {
			var11 = this.field4678[var10];
			var12 = this.field4679[var10];
			int var13 = (int)((float)(var11 - var1) * var4) - var5;
			int var14 = (int)((float)var3.subHeight - (float)(var12 - var2) * var4) - var5;
			this.bounds.setLow(var13, var14);
			this.bounds.method8154(var8, var9);
			this.method7820(var6, var3, var9);
		}

		System.nanoTime();
		System.nanoTime();

		for (var10 = 0; var10 < var3.pixels.length; ++var10) {
			if (var3.pixels[var10] == 0) {
				var3.pixels[var10] = -16777216;
			} else {
				var11 = (var3.pixels[var10] + 64 - 1) / 256;
				if (var11 <= 0) {
					var3.pixels[var10] = -16777216;
				} else {
					if (var11 > field4683.length) {
						var11 = field4683.length;
					}

					var12 = field4683[var11 - 1];
					var3.pixels[var10] = -16777216 | var12;
				}
			}
		}

		System.nanoTime();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvv;Lvv;Lqg;I)V",
		garbageValue = "2122924856"
	)
	void method7820(SpritePixels var1, SpritePixels var2, Bounds var3) {
		if (var3.highX != 0 && var3.highY != 0) {
			int var4 = 0;
			int var5 = 0;
			if (var3.lowX == 0) {
				var4 = var1.subWidth - var3.highX;
			}

			if (var3.lowY == 0) {
				var5 = var1.subHeight - var3.highY;
			}

			int var6 = var4 + var5 * var1.subWidth;
			int var7 = var2.subWidth * var3.lowY + var3.lowX;

			for (int var8 = 0; var8 < var3.highY; ++var8) {
				for (int var9 = 0; var9 < var3.highX; ++var9) {
					int[] var10000 = var2.pixels;
					int var10001 = var7++;
					var10000[var10001] += var1.pixels[var6++];
				}

				var6 += var1.subWidth - var3.highX;
				var7 += var2.subWidth - var3.highX;
			}

		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1156462877"
	)
	static int method7822(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field866 - 7.0D) * 256.0D);
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(Ldv;III)V",
		garbageValue = "-1641914029"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) {
			int var3 = Widget.SequenceDefinition_get(var1).restartMode;
			if (var3 == 1) {
				var0.sequenceFrame = 0;
				var0.sequenceFrameCycle = 0;
				var0.sequenceDelay = var2;
				var0.field1237 = 0;
			}

			if (var3 == 2) {
				var0.field1237 = 0;
			}
		} else if (var1 == -1 || var0.sequence == -1 || Widget.SequenceDefinition_get(var1).field2320 >= Widget.SequenceDefinition_get(var0.sequence).field2320) {
			var0.sequence = var1;
			var0.sequenceFrame = 0;
			var0.sequenceFrameCycle = 0;
			var0.sequenceDelay = var2;
			var0.field1237 = 0;
			var0.field1291 = var0.pathLength;
		}

	}
}
