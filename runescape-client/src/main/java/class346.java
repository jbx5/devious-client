import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("my")
public final class class346 {
	@ObfuscatedName("c")
	@Export("base37Table")
	public static final char[] base37Table;
	@ObfuscatedName("p")
	static long[] field4199;

	static {
		base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'}; // L: 4
		field4199 = new long[12]; // L: 5

		for (int var0 = 0; var0 < field4199.length; ++var0) { // L: 8
			field4199[var0] = (long)Math.pow(37.0D, (double)var0);
		}

	} // L: 9

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "-2128298432"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) { // L: 4591
			var2 = 1;
		}

		if (var3 < 1) { // L: 4592
			var3 = 1;
		}

		int var5 = var3 - 334; // L: 4593
		int var6;
		if (var5 < 0) { // L: 4595
			var6 = Client.field760;
		} else if (var5 >= 100) { // L: 4596
			var6 = Client.field762;
		} else {
			var6 = (Client.field762 - Client.field760) * var5 / 100 + Client.field760; // L: 4597
		}

		int var7 = var3 * var6 * 512 / (var2 * 334); // L: 4598
		int var8;
		int var9;
		short var10;
		if (var7 < Client.field537) { // L: 4599
			var10 = Client.field537; // L: 4600
			var6 = var10 * var2 * 334 / (var3 * 512); // L: 4601
			if (var6 > Client.field756) { // L: 4602
				var6 = Client.field756; // L: 4603
				var8 = var3 * var6 * 512 / (var10 * 334); // L: 4604
				var9 = (var2 - var8) / 2; // L: 4605
				if (var4) { // L: 4606
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4607
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216); // L: 4608
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216); // L: 4609
				}

				var0 += var9; // L: 4611
				var2 -= var9 * 2; // L: 4612
			}
		} else if (var7 > Client.field638) { // L: 4615
			var10 = Client.field638; // L: 4616
			var6 = var10 * var2 * 334 / (var3 * 512); // L: 4617
			if (var6 < Client.field764) { // L: 4618
				var6 = Client.field764; // L: 4619
				var8 = var10 * var2 * 334 / (var6 * 512); // L: 4620
				var9 = (var3 - var8) / 2; // L: 4621
				if (var4) { // L: 4622
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 4623
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216); // L: 4624
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216); // L: 4625
				}

				var1 += var9; // L: 4627
				var3 -= var9 * 2; // L: 4628
			}
		}

		Client.viewportZoom = var3 * var6 / 334; // L: 4631
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) { // L: 4632
			Canvas.method376(var2, var3); // L: 4633
		}

		Client.viewportOffsetX = var0; // L: 4635
		Client.viewportOffsetY = var1; // L: 4636
		Client.viewportWidth = var2; // L: 4637
		Client.viewportHeight = var3; // L: 4638
	} // L: 4639
}
