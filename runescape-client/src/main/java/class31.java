import java.io.File;
import java.io.RandomAccessFile;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("af")
public class class31 {
   @ObfuscatedName("tc")
   @ObfuscatedGetter(
      intValue = -1712117609
   )
   static int field171;
   @ObfuscatedName("jn")
   @ObfuscatedGetter(
      intValue = -1913824329
   )
   @Export("cameraY")
   static int cameraY;
   @ObfuscatedName("jr")
   @ObfuscatedGetter(
      intValue = -1710875137
   )
   @Export("oculusOrbFocalPointX")
   static int oculusOrbFocalPointX;

   static {
      ImageIO.setUseCache(false);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ljava/io/File;ZI)Z",
      garbageValue = "1209207588"
   )
   public static boolean method464(File var0, boolean var1) {
      try {
         RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
         int var3 = var2.read();
         var2.seek(0L);
         var2.write(var3);
         var2.seek(0L);
         var2.close();
         if (var1) {
            var0.delete();
         }

         return true;
      } catch (Exception var4) {
         return false;
      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)Lri;",
      garbageValue = "1608391408"
   )
   static SpritePixels method466() {
      SpritePixels var0 = new SpritePixels();
      var0.width = class477.SpriteBuffer_spriteWidth;
      var0.height = class477.SpriteBuffer_spriteHeight;
      var0.xOffset = class451.SpriteBuffer_xOffsets[0];
      var0.yOffset = class319.SpriteBuffer_yOffsets[0];
      var0.subWidth = class450.SpriteBuffer_spriteWidths[0];
      var0.subHeight = class477.SpriteBuffer_spriteHeights[0];
      int var1 = var0.subWidth * var0.subHeight;
      byte[] var2 = class453.SpriteBuffer_pixels[0];
      var0.pixels = new int[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         var0.pixels[var3] = class477.SpriteBuffer_spritePalette[var2[var3] & 255];
      }

      class451.SpriteBuffer_xOffsets = null;
      class319.SpriteBuffer_yOffsets = null;
      class450.SpriteBuffer_spriteWidths = null;
      class477.SpriteBuffer_spriteHeights = null;
      class477.SpriteBuffer_spritePalette = null;
      class453.SpriteBuffer_pixels = null;
      return var0;
   }

   @ObfuscatedName("lu")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "71"
   )
   static final void method465() {
      for(int var0 = 0; var0 < Players.Players_count; ++var0) {
         Player var1 = Client.players[Players.Players_indices[var0]];
         var1.method2264();
      }

   }
}
