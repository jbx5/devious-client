import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
public class class53 extends Node {
	@ObfuscatedName("ry")
	@ObfuscatedSignature(
		descriptor = "Ltx;"
	)
	@Export("Widget_cachedFonts")
	static class512 Widget_cachedFonts;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lbj;"
	)
	class47 field382;

	public class53() {
		this.field382 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(Lcw;)V"
	)
	class53(VorbisSample var1) {
		if (var1 != null) {
			this.field382 = new class47(var1, (RawSound)null);
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Lbs;)V"
	)
	public class53(RawSound var1) {
		this.field382 = new class47((VorbisSample)null, var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1320640993"
	)
	public boolean method1080() {
		return this.field382 == null;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lbs;",
		garbageValue = "248890116"
	)
	public RawSound method1081() {
		if (this.field382 != null && this.field382.field348.tryLock()) {
			RawSound var1;
			try {
				var1 = this.method1087();
			} finally {
				this.field382.field348.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lbs;",
		garbageValue = "-262816062"
	)
	public RawSound method1078() {
		if (this.field382 != null) {
			this.field382.field348.lock();

			RawSound var1;
			try {
				var1 = this.method1087();
			} finally {
				this.field382.field348.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Lbs;",
		garbageValue = "1547022770"
	)
	RawSound method1087() {
		if (this.field382.field344 == null) {
			this.field382.field344 = this.field382.field345.toRawSound((int[])null);
			this.field382.field345 = null;
		}

		return this.field382.field344;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Lcv;",
		garbageValue = "-111"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0;
		return DevicePcmPlayerProvider.getNextWorldListWorld();
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "1325251796"
	)
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
			var6 = Client.field791;
		} else if (var5 >= 100) {
			var6 = Client.field792;
		} else {
			var6 = (Client.field792 - Client.field791) * var5 / 100 + Client.field791;
		}

		int var7 = var3 * var6 * 512 / (var2 * 334);
		int var8;
		int var9;
		short var18;
		if (var7 < Client.field594) {
			var18 = Client.field594;
			var6 = var18 * var2 * 334 / (var3 * 512);
			if (var6 > Client.field662) {
				var6 = Client.field662;
				var8 = var3 * var6 * 512 / (var18 * 334);
				var9 = (var2 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216);
				}

				var0 += var9;
				var2 -= var9 * 2;
			}
		} else if (var7 > Client.field798) {
			var18 = Client.field798;
			var6 = var18 * var2 * 334 / (var3 * 512);
			if (var6 < Client.field795) {
				var6 = Client.field795;
				var8 = var18 * var2 * 334 / (var6 * 512);
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
			int[] var17 = new int[9];

			for (var9 = 0; var9 < var17.length; ++var9) {
				int var10 = var9 * 32 + 15 + 128;
				int var11 = var10 * 3 + 600;
				int var13 = Rasterizer3D.Rasterizer3D_sine[var10];
				int var15 = var3 - 334;
				if (var15 < 0) {
					var15 = 0;
				} else if (var15 > 100) {
					var15 = 100;
				}

				int var16 = (Client.zoomWidth - Client.zoomHeight) * var15 / 100 + Client.zoomHeight;
				int var14 = var16 * var11 / 256;
				var17[var9] = var13 * var14 >> 16;
			}

			Scene.Scene_buildVisiblityMap(var17, 500, 800, var2 * 334 / var3, 334);
		}

		Client.viewportOffsetX = var0;
		Client.viewportOffsetY = var1;
		Client.viewportWidth = var2;
		Client.viewportHeight = var3;
	}
}
