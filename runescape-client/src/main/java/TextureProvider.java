import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
@Implements("TextureProvider")
public class TextureProvider implements TextureLoader {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "[Liq;"
   )
   @Export("textures")
   Texture[] textures;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Loy;"
   )
   @Export("deque")
   NodeDeque deque = new NodeDeque();
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -300508505
   )
   @Export("capacity")
   int capacity;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -578773067
   )
   @Export("remaining")
   int remaining = 0;
   @ObfuscatedName("ax")
   @Export("brightness")
   double brightness = 1.0;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -2070337693
   )
   @Export("textureSize")
   int textureSize = 128;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lnq;"
   )
   @Export("archive")
   AbstractArchive archive;

   @ObfuscatedSignature(
      descriptor = "(Lnq;Lnq;IDI)V"
   )
   public TextureProvider(AbstractArchive var1, AbstractArchive var2, int var3, double var4, int var6) {
      this.archive = var2;
      this.capacity = var3;
      this.remaining = this.capacity;
      this.brightness = var4;
      this.textureSize = var6;
      int[] var7 = var1.getGroupFileIds(0);
      if (var7 != null) {
         int var8 = var7.length;
         this.textures = new Texture[var1.getGroupFileCount(0)];

         for(int var9 = 0; var9 < var8; ++var9) {
            Buffer var10 = new Buffer(var1.takeFile(0, var7[var9]));
            this.textures[var7[var9]] = new Texture(var10);
         }
      } else {
         this.textures = new Texture[0];
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-2129653920"
   )
   @Export("getLoadedPercentage")
   public int getLoadedPercentage() {
      if (this.textures.length == 0) {
         return 100;
      } else {
         int var1 = 0;
         int var2 = 0;
         Texture[] var3 = this.textures;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            Texture var5 = var3[var4];
            if (var5 != null && var5.fileIds != null) {
               var1 += var5.fileIds.length;
               int[] var6 = var5.fileIds;

               for(int var7 = 0; var7 < var6.length; ++var7) {
                  int var8 = var6[var7];
                  if (this.archive.method6694(var8)) {
                     ++var2;
                  }
               }
            }
         }

         if (var1 == 0) {
            return 0;
         } else {
            return var2 * 100 / var1;
         }
      }
   }

   @ObfuscatedName("an")
   @Export("setBrightness")
   public void setBrightness(double var1) {
      this.brightness = var1;
      this.clear();
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(II)[I",
      garbageValue = "1457358156"
   )
   @Export("getTexturePixels")
   public int[] getTexturePixels(int var1) {
      Texture var2 = this.textures[var1];
      if (var2 != null) {
         if (var2.pixels != null) {
            this.deque.addLast(var2);
            var2.isLoaded = true;
            return var2.pixels;
         }

         boolean var3 = var2.load(this.brightness, this.textureSize, this.archive);
         if (var3) {
            if (this.remaining == 0) {
               Texture var4 = (Texture)this.deque.removeFirst();
               var4.reset();
            } else {
               --this.remaining;
            }

            this.deque.addLast(var2);
            var2.isLoaded = true;
            return var2.pixels;
         }
      }

      return null;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "0"
   )
   @Export("getAverageTextureRGB")
   public int getAverageTextureRGB(int var1) {
      return this.textures[var1] != null ? this.textures[var1].averageRGB : 0;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "1"
   )
   public boolean vmethod5030(int var1) {
      return this.textures[var1].field2469;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "28"
   )
   @Export("isLowDetail")
   public boolean isLowDetail(int var1) {
      return this.textureSize == 64;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "108"
   )
   @Export("clear")
   public void clear() {
      for(int var1 = 0; var1 < this.textures.length; ++var1) {
         if (this.textures[var1] != null) {
            this.textures[var1].reset();
         }
      }

      this.deque = new NodeDeque();
      this.remaining = this.capacity;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "858578069"
   )
   @Export("animate")
   public void animate(int var1) {
      for(int var2 = 0; var2 < this.textures.length; ++var2) {
         Texture var3 = this.textures[var2];
         if (var3 != null && var3.animationDirection != 0 && var3.isLoaded) {
            var3.animate(var1);
            var3.isLoaded = false;
         }
      }

   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;B)I",
      garbageValue = "-54"
   )
   public static int method4744(CharSequence var0) {
      return class211.method4167(var0, 10, true);
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "-81"
   )
   static void method4755(int var0, int var1) {
      long var2 = (long)((var0 << 16) + var1);
      NetFileRequest var4 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var2);
      if (var4 != null) {
         NetCache.NetCache_pendingWritesQueue.addLast(var4);
      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1705195685"
   )
   public static void method4758() {
      class515.SpriteBuffer_xOffsets = null;
      class402.SpriteBuffer_yOffsets = null;
      class515.SpriteBuffer_spriteWidths = null;
      class515.SpriteBuffer_spriteHeights = null;
      class515.SpriteBuffer_spritePalette = null;
      class515.SpriteBuffer_pixels = null;
   }
}
