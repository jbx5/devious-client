import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
@Implements("UserComparator7")
public class UserComparator7 extends AbstractUserComparator {
	@ObfuscatedName("ap")
	@Export("reversed")
	final boolean reversed;

	public UserComparator7(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lsv;Lsv;I)I",
		garbageValue = "-2080904015"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) {
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldb;",
		garbageValue = "1220862804"
	)
	static class93[] method3289() {
		return new class93[]{class93.field1129, class93.field1127, class93.field1126, class93.field1130, class93.field1128, class93.field1133};
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-26"
	)
	public static void method3291() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5);
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "65280"
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
			var6 = Client.field587;
		} else if (var5 >= 100) {
			var6 = Client.field579;
		} else {
			var6 = (Client.field579 - Client.field587) * var5 / 100 + Client.field587;
		}

		int var7 = var3 * var6 * 512 / (var2 * 334);
		int var8;
		int var9;
		short var17;
		if (var7 < Client.field776) {
			var17 = Client.field776;
			var6 = var17 * var2 * 334 / (var3 * 512);
			if (var6 > Client.field762) {
				var6 = Client.field762;
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
		} else if (var7 > Client.field777) {
			var17 = Client.field777;
			var6 = var17 * var2 * 334 / (var3 * 512);
			if (var6 < Client.field774) {
				var6 = Client.field774;
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
				int var11 = class208.method4212(var10);
				int var12 = Rasterizer3D.Rasterizer3D_sine[var10];
				int var14 = var3 - 334;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 100) {
					var14 = 100;
				}

				int var15 = (Client.zoomWidth - Client.zoomHeight) * var14 / 100 + Client.zoomHeight;
				int var13 = var15 * var11 / 256;
				var16[var9] = var12 * var13 >> 16;
			}

			class198.topLevelWorldView.scene.method5052(var16, 500, 800, var2 * 334 / var3, 334);
		}

		Client.viewportOffsetX = var0;
		Client.viewportOffsetY = var1;
		Client.viewportWidth = var2;
		Client.viewportHeight = var3;
	}
}
