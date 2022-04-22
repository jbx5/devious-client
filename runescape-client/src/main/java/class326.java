import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lf")
public class class326 {
	@ObfuscatedName("q")
	static int[] field4041;
	@ObfuscatedName("v")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lnm;")

	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("i")
	int[] field4034;
	@ObfuscatedName("f")
	int[] field4037;
	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 
	-2113149807)

	int field4038;

	public class326() {
		this.spriteMap = new HashMap();
		this.bounds = new Bounds(0, 0);
		this.field4034 = new int[2048];
		this.field4037 = new int[2048];
		this.field4038 = 0;
		WorldMapSection2.method3959();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"1093596616")

	void method6042(int var1) {
		int var2 = (var1 * 2) + 1;
		double var4 = ((double) (((float) (var1)) / 3.0F));
		int var6 = (var1 * 2) + 1;
		double[] var7 = new double[var6];
		int var8 = -var1;

		for (int var9 = 0; var8 <= var1; ++var9) {
			var7[var9] = AbstractWorldMapIcon.method4415(((double) (var8)), 0.0, var4);
			++var8;
		}

		double[] var14 = var7;
		double var15 = var7[var1] * var7[var1];
		int[] var17 = new int[var2 * var2];
		boolean var10 = false;

		for (int var11 = 0; var11 < var2; ++var11) {
			for (int var12 = 0; var12 < var2; ++var12) {
				int var13 = var17[var12 + (var2 * var11)] = ((int) (((var14[var11] * var14[var12]) / var15) * 256.0));
				if ((!var10) && (var13 > 0)) {
					var10 = true;
				}
			}
		}

		SpritePixels var18 = new SpritePixels(var17, var2, var2);
		this.spriteMap.put(var1, var18);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(IS)Lqi;", garbageValue = 
	"255")

	SpritePixels method6043(int var1) {
		if (!this.spriteMap.containsKey(var1)) {
			this.method6042(var1);
		}

		return ((SpritePixels) (this.spriteMap.get(var1)));
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(IIB)V", garbageValue = 
	"-73")

	public final void method6044(int var1, int var2) {
		if (this.field4038 < this.field4034.length) {
			this.field4034[this.field4038] = var1;
			this.field4037[this.field4038] = var2;
			++this.field4038;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1343978449")

	public final void method6057() {
		this.field4038 = 0;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(IILqi;FI)V", garbageValue = 
	"1463676048")

	public final void method6045(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = ((int) (18.0F * var4));
		SpritePixels var6 = this.method6043(var5);
		int var7 = (var5 * 2) + 1;
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
		Bounds var9 = new Bounds(0, 0);
		this.bounds.setHigh(var7, var7);
		System.nanoTime();

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field4038; ++var10) {
			var11 = this.field4034[var10];
			var12 = this.field4037[var10];
			int var13 = ((int) (var4 * ((float) (var11 - var1)))) - var5;
			int var14 = ((int) (((float) (var3.subHeight)) - (((float) (var12 - var2)) * var4))) - var5;
			this.bounds.setLow(var13, var14);
			this.bounds.method6945(var8, var9);
			this.method6046(var6, var3, var9);
		}

		System.nanoTime();
		System.nanoTime();

		for (var10 = 0; var10 < var3.pixels.length; ++var10) {
			if (var3.pixels[var10] == 0) {
				var3.pixels[var10] = -16777216;
			} else {
				var11 = ((var3.pixels[var10] + 64) - 1) / 256;
				if (var11 <= 0) {
					var3.pixels[var10] = -16777216;
				} else {
					if (var11 > class326.field4041.length) {
						var11 = class326.field4041.length;
					}

					var12 = field4041[var11 - 1];
					var3.pixels[var10] = (-16777216) | var12;
				}
			}
		}

		System.nanoTime();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(Lqi;Lqi;Lnm;I)V", garbageValue = 
	"-1856311554")

	void method6046(SpritePixels var1, SpritePixels var2, Bounds var3) {
		if ((var3.highX != 0) && (var3.highY != 0)) {
			int var4 = 0;
			int var5 = 0;
			if (var3.lowX == 0) {
				var4 = var1.subWidth - var3.highX;
			}

			if (var3.lowY == 0) {
				var5 = var1.subHeight - var3.highY;
			}

			int var6 = var4 + (var5 * var1.subWidth);
			int var7 = (var2.subWidth * var3.lowY) + var3.lowX;

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

	@ObfuscatedName("lh")
	@ObfuscatedSignature(descriptor = 
	"(Lky;I)I", garbageValue = 
	"-658194090")

	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = ((IntegerNode) (Client.widgetFlags.get((((long) (var0.id)) << 32) + ((long) (var0.childIndex)))));
		return var1 != null ? var1.integer : var0.flags;
	}
}