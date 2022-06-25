import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("gq")
public class class201 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "[Ldc;")
	class115[] field2365;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -77062685)
	int field2366;

	@ObfuscatedSignature(descriptor = "(Lqt;I)V")
	class201(Buffer var1, int var2) {
		this.field2365 = new class115[var2];
		this.field2366 = var1.readUnsignedByte();
		for (int var3 = 0; var3 < this.field2365.length; ++var3) {
			class115 var4 = new class115(this.field2366, var1, false);
			this.field2365[var3] = var4;
		}
		this.method4131();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1005826580")
	void method4131() {
		class115[] var1 = this.field2365;
		for (int var2 = 0; var2 < var1.length; ++var2) {
			class115 var3 = var1[var2];
			if (var3.field1448 >= 0) {
				var3.field1440 = this.field2365[var3.field1448];
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "3")
	public int method4130() {
		return this.field2365.length;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(IB)Ldc;", garbageValue = "-62")
	class115 method4123(int var1) {
		return this.field2365[var1];
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)[Ldc;", garbageValue = "1269137329")
	class115[] method4124() {
		return this.field2365;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(Lda;II)V", garbageValue = "-1587521432")
	void method4146(class122 var1, int var2) {
		this.method4126(var1, var2, ((boolean[]) (null)), false);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(Lda;I[ZZI)V", garbageValue = "-482543177")
	void method4126(class122 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method2766();
		int var6 = 0;
		class115[] var7 = this.method4124();
		for (int var8 = 0; var8 < var7.length; ++var8) {
			class115 var9 = var7[var8];
			if (var3 == null || var4 == var3[var6]) {
				var1.method2790(var2, var9, var6, var5);
			}
			++var6;
		}
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(descriptor = "(IIIIZI)V", garbageValue = "-102591137")
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) {
			var2 = 1;
		}
		if (var3 < 1) {
			var3 = 1;
		}
		int var5 = var3 - 334;
		int var6;
		if (var5 < 0) {
			var6 = Client.field748;
		} else if (var5 >= 100) {
			var6 = Client.field749;
		} else {
			var6 = (Client.field749 - Client.field748) * var5 / 100 + Client.field748;
		}
		int var7 = var3 * var6 * 512 / (var2 * 334);
		int var8;
		int var9;
		short var17;
		if (var7 < Client.field754) {
			var17 = Client.field754;
			var6 = var17 * var2 * 334 / (var3 * 512);
			if (var6 > Client.field753) {
				var6 = Client.field753;
				var8 = var3 * var6 * 512 / (var17 * 334);
				var9 = (var2 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216);
				}
				var0 += var9;
				var2 -= var9 * 2;
			}
		} else if (var7 > Client.field755) {
			var17 = Client.field755;
			var6 = var17 * var2 * 334 / (var3 * 512);
			if (var6 < Client.field752) {
				var6 = Client.field752;
				var8 = var17 * var2 * 334 / (var6 * 512);
				var9 = (var3 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216);
				}
				var1 += var9;
				var3 -= var9 * 2;
			}
		}
		Client.viewportZoom = var3 * var6 / 334;
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) {
			int[] var16 = new int[9];
			for (var9 = 0; var9 < var16.length; ++var9) {
				int var10 = var9 * 32 + 15 + 128;
				int var11 = GZipDecompressor.method8314(var10);
				int var12 = Rasterizer3D.Rasterizer3D_sine[var10];
				int var14 = var3 - 334;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 100) {
					var14 = 100;
				}
				int var15 = (Client.zoomWidth - Client.zoomHeight) * var14 / 100 + Client.zoomHeight;
				int var13 = var15 * var11 / 256;
				var16[var9] = var13 * var12 >> 16;
			}
			Scene.Scene_buildVisiblityMap(var16, 500, 800, var2 * 334 / var3, 334);
		}
		Client.viewportOffsetX = var0;
		Client.viewportOffsetY = var1;
		Client.viewportWidth = var2;
		Client.viewportHeight = var3;
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(descriptor = "(IIIIII)V", garbageValue = "868430801")
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		class126.scrollBarSprites[0].drawAt(var0, var1);
		class126.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field556);
		int var5 = var3 * (var3 - 32) / var4;
		if (var5 < 8) {
			var5 = 8;
		}
		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field653);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field553);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field553);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field553);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field553);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field558);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field558);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var5 + var6 + var1 + 15, 16, Client.field558);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var5 + var6 + var1 + 14, 15, Client.field558);
	}
}