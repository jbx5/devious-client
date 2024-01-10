import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
public class class181 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([BI)Luc;",
		garbageValue = "-318838913"
	)
	public static final SpritePixels method3691(byte[] var0) {
		BufferedImage var1 = null;

		try {
			Class var2 = ImageIO.class;
			synchronized(ImageIO.class) {
				var1 = ImageIO.read(new ByteArrayInputStream(var0));
			}

			int var6 = var1.getWidth();
			int var7 = var1.getHeight();
			int[] var4 = new int[var6 * var7];
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var6, var7, var4, 0, var6);
			var5.grabPixels();
			return new SpritePixels(var4, var6, var7);
		} catch (IOException var9) {
		} catch (InterruptedException var10) {
		}

		return new SpritePixels(0, 0);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "101709592"
	)
	static final void method3687() {
		if (!ViewportMouse.ViewportMouse_false0) {
			int var0 = Scene.Scene_cameraPitchSine;
			int var1 = Scene.Scene_cameraPitchCosine;
			int var2 = Scene.Scene_cameraYawSine;
			int var3 = Scene.Scene_cameraYawCosine;
			byte var4 = 50;
			short var5 = 3500;
			int var6 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.getClipMidX()) * var4 / Rasterizer3D.get3dZoom();
			int var7 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.getClipMidY()) * var4 / Rasterizer3D.get3dZoom();
			int var8 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.getClipMidX()) * var5 / Rasterizer3D.get3dZoom();
			int var9 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.getClipMidY()) * var5 / Rasterizer3D.get3dZoom();
			int var11 = var7 * var1 + var0 * var4 >> 16;
			int var15 = Occluder.method5588(var7, var4, var1, var0);
			int var12 = var5 * var0 + var1 * var9 >> 16;
			int var16 = Occluder.method5588(var9, var5, var1, var0);
			int var10 = class221.method4355(var6, var15, var3, var2);
			int var13 = var6 * var2 + var15 * var3 >> 16;
			var6 = var10;
			var10 = class221.method4355(var8, var16, var3, var2);
			int var14 = var3 * var16 + var2 * var8 >> 16;
			class403.field4501 = (var10 + var6) / 2;
			ViewportMouse.field3063 = (var12 + var11) / 2;
			ViewportMouse.field3054 = (var13 + var14) / 2;
			ViewportMouse.field3055 = (var10 - var6) / 2;
			class151.field1681 = (var12 - var11) / 2;
			class140.field1625 = (var14 - var13) / 2;
			class148.field1662 = Math.abs(ViewportMouse.field3055);
			UserComparator7.field1450 = Math.abs(class151.field1681);
			DynamicObject.field998 = Math.abs(class140.field1625);
		}
	}
}
