import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hu")
public class class199 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("field2136")
	public static EvictingDualNodeHashTable field2136;
	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("archive6")
	static Archive archive6;

	static {
		field2136 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([BI)Lvg;",
		garbageValue = "-733013164"
	)
	@Export("readSpritePixelsFromBytes")
	public static final SpritePixels readSpritePixelsFromBytes(byte[] var0) {
		BufferedImage var1 = null;

		try {
			Class var2 = ImageIO.class;
			synchronized(ImageIO.class) {
				var1 = ImageIO.read(new ByteArrayInputStream(var0));
			}

			int var6 = var1.getWidth();
			int var7 = var1.getHeight();
			int[] var4 = new int[var7 * var6];
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var6, var7, var4, 0, var6);
			var5.grabPixels();
			return new SpritePixels(var4, var6, var7);
		} catch (IOException var9) {
		} catch (InterruptedException var10) {
		}

		return new SpritePixels(0, 0);
	}

	@ObfuscatedName("pm")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "620280580"
	)
	static void method3809(int var0) {
		Client.oculusOrbState = var0;
	}
}
