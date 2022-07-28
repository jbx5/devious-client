import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("do")
public class class115 {
	@ObfuscatedName("tq")
	@ObfuscatedGetter(intValue = -224609185)
	static int field1419;

	@ObfuscatedName("le")
	@ObfuscatedSignature(descriptor = "Lku;")
	@Export("dragInventoryWidget")
	static Widget dragInventoryWidget;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -2126008347)
	public final int field1406;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Ldo;")
	public class115 field1405;

	@ObfuscatedName("f")
	float[][] field1404;

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "[Lnb;")
	final class388[] field1407;

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "[Lnb;")
	class388[] field1408;

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "[Lnb;")
	class388[] field1409;

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "Lnb;")
	class388 field1411 = new class388();

	@ObfuscatedName("j")
	boolean field1414 = true;

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Lnb;")
	class388 field1412 = new class388();

	@ObfuscatedName("a")
	boolean field1413 = true;

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "Lnb;")
	class388 field1416 = new class388();

	@ObfuscatedName("n")
	float[][] field1415;

	@ObfuscatedName("x")
	float[][] field1410;

	@ObfuscatedName("g")
	float[][] field1417;

	@ObfuscatedSignature(descriptor = "(ILqw;Z)V")
	public class115(int var1, Buffer var2, boolean var3) {
		this.field1406 = var2.readShort();
		this.field1407 = new class388[var1];
		this.field1408 = new class388[this.field1407.length];
		this.field1409 = new class388[this.field1407.length];
		this.field1404 = new float[this.field1407.length][3];
		for (int var4 = 0; var4 < this.field1407.length; ++var4) {
			this.field1407[var4] = new class388(var2, var3);
			this.field1404[var4][0] = var2.readFloat();
			this.field1404[var4][1] = var2.readFloat();
			this.field1404[var4][2] = var2.readFloat();
		}
		this.method2726();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "55")
	void method2726() {
		this.field1415 = new float[this.field1407.length][3];
		this.field1410 = new float[this.field1407.length][3];
		this.field1417 = new float[this.field1407.length][3];
		class388 var1 = MouseHandler.method574();
		for (int var2 = 0; var2 < this.field1407.length; ++var2) {
			class388 var3 = this.method2727(var2);
			var1.method7005(var3);
			var1.method6999();
			this.field1415[var2] = var1.method7003();
			this.field1410[var2][0] = var3.field4410[12];
			this.field1410[var2][1] = var3.field4410[13];
			this.field1410[var2][2] = var3.field4410[14];
			this.field1417[var2] = var3.method7015();
		}
		var1.method7027();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(IB)Lnb;", garbageValue = "10")
	class388 method2727(int var1) {
		return this.field1407[var1];
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(IB)Lnb;", garbageValue = "67")
	class388 method2728(int var1) {
		if (this.field1408[var1] == null) {
			this.field1408[var1] = new class388(this.method2727(var1));
			if (this.field1405 != null) {
				this.field1408[var1].method7009(this.field1405.method2728(var1));
			} else {
				this.field1408[var1].method7009(class388.field4407);
			}
		}
		return this.field1408[var1];
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(IB)Lnb;", garbageValue = "4")
	class388 method2753(int var1) {
		if (this.field1409[var1] == null) {
			this.field1409[var1] = new class388(this.method2728(var1));
			this.field1409[var1].method6999();
		}
		return this.field1409[var1];
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lnb;I)V", garbageValue = "2125757376")
	void method2749(class388 var1) {
		this.field1411.method7005(var1);
		this.field1414 = true;
		this.field1413 = true;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(I)Lnb;", garbageValue = "2122027554")
	class388 method2731() {
		return this.field1411;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(I)Lnb;", garbageValue = "1964110211")
	class388 method2737() {
		if (this.field1414) {
			this.field1412.method7005(this.method2731());
			if (this.field1405 != null) {
				this.field1412.method7009(this.field1405.method2737());
			}
			this.field1414 = false;
		}
		return this.field1412;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(IB)Lnb;", garbageValue = "14")
	public class388 method2733(int var1) {
		if (this.field1413) {
			this.field1416.method7005(this.method2753(var1));
			this.field1416.method7009(this.method2737());
			this.field1413 = false;
		}
		return this.field1416;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(II)[F", garbageValue = "10044670")
	float[] method2734(int var1) {
		return this.field1415[var1];
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(II)[F", garbageValue = "-2104420634")
	float[] method2739(int var1) {
		return this.field1410[var1];
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(IB)[F", garbageValue = "33")
	float[] method2736(int var1) {
		return this.field1417[var1];
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(descriptor = "(IIIIZB)V", garbageValue = "95")
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
			var6 = Client.field644;
		} else if (var5 >= 100) {
			var6 = Client.field695;
		} else {
			var6 = (Client.field695 - Client.field644) * var5 / 100 + Client.field644;
		}
		int var7 = var3 * var6 * 512 / (var2 * 334);
		int var8;
		int var9;
		short var10;
		if (var7 < Client.field757) {
			var10 = Client.field757;
			var6 = var10 * var2 * 334 / (var3 * 512);
			if (var6 > Client.field756) {
				var6 = Client.field756;
				var8 = var3 * var6 * 512 / (var10 * 334);
				var9 = (var2 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216);
				}
				var0 += var9;
				var2 -= var9 * 2;
			}
		} else if (var7 > Client.field567) {
			var10 = Client.field567;
			var6 = var10 * var2 * 334 / (var3 * 512);
			if (var6 < Client.field677) {
				var6 = Client.field677;
				var8 = var10 * var2 * 334 / (var6 * 512);
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
			ArchiveDiskActionHandler.method5800(var2, var3);
		}
		Client.viewportOffsetX = var0;
		Client.viewportOffsetY = var1;
		Client.viewportWidth = var2;
		Client.viewportHeight = var3;
	}
}