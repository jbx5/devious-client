import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import java.io.ByteArrayInputStream;
import net.runelite.mapping.ObfuscatedGetter;
import java.io.IOException;
import java.awt.image.PixelGrabber;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import net.runelite.mapping.Export;
@ObfuscatedName("ep")
public class class147 extends class128 {
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -1773571435)
	int field1668;

	@ObfuscatedSignature(descriptor = "Lec;")
	final class131 this$0;

	@ObfuscatedSignature(descriptor = "(Lec;)V")
	class147(class131 var1) {
		this.this$0 = var1;
		this.field1668 = -1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lqw;I)V", garbageValue = "-423569520")
	void vmethod3155(Buffer var1) {
		this.field1668 = var1.readUnsignedShort();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lez;I)V", garbageValue = "-1755436064")
	void vmethod3154(ClanSettings var1) {
		var1.method3040(this.field1668);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "([BI)Lqj;", garbageValue = "-487565939")
	public static final SpritePixels method3105(byte[] var0) {
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(CB)Z", garbageValue = "67")
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}
}