import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
public abstract class class266 implements class268 {
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "Lae;"
   )
   @Export("soundSystem")
   static SoundSystem soundSystem;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1800360111
   )
   protected int field3035;

   @ObfuscatedSignature(
      descriptor = "(Lle;Lmn;I)V"
   )
   protected class266(StudioGame var1, Language var2, int var3) {
      this.field3035 = var3;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "([BB)Lrs;",
      garbageValue = "121"
   )
   public static final SpritePixels method5471(byte[] var0) {
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
}
