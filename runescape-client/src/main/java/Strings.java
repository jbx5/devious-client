import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mk")
@Implements("Strings")
public class Strings {
   @ObfuscatedName("fi")
   public static String field3967 = "Please visit the support page for assistance.";
   @ObfuscatedName("la")
   public static String field4008 = "";
   @ObfuscatedName("lp")
   public static String field4032 = "Page has opened in the browser.";
   @ObfuscatedName("ly")
   public static String field4117 = "";

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "([BI)Ltq;",
      garbageValue = "504889561"
   )
   public static final SpritePixels method6601(byte[] var0) {
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

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(B)Ltc;",
      garbageValue = "1"
   )
   static IndexedSprite method6600() {
      IndexedSprite var0 = new IndexedSprite();
      var0.width = class503.SpriteBuffer_spriteWidth;
      var0.height = class503.SpriteBuffer_spriteHeight;
      var0.xOffset = class503.SpriteBuffer_xOffsets[0];
      var0.yOffset = class17.SpriteBuffer_yOffsets[0];
      var0.subWidth = class97.SpriteBuffer_spriteWidths[0];
      var0.subHeight = class138.SpriteBuffer_spriteHeights[0];
      var0.palette = class394.SpriteBuffer_spritePalette;
      var0.pixels = VarbitComposition.SpriteBuffer_pixels[0];
      class398.method7709();
      return var0;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1979549952"
   )
   public static void method6602() {
      WorldMapElement.WorldMapElement_cachedSprites.clear();
   }
}
