import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("im")
@Implements("TextureProvider")
public class TextureProvider implements TextureLoader {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "[Lih;"
   )
   @Export("textures")
   Texture[] textures;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lnh;"
   )
   @Export("deque")
   NodeDeque deque = new NodeDeque();
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -642952757
   )
   @Export("capacity")
   int capacity;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1759525447
   )
   @Export("remaining")
   int remaining = 0;
   @ObfuscatedName("au")
   @Export("brightness")
   double brightness = 1.0;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1962784445
   )
   @Export("textureSize")
   int textureSize = 128;
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lnm;"
   )
   @Export("archive")
   AbstractArchive archive;

   @ObfuscatedSignature(
      descriptor = "(Lnm;Lnm;IDI)V"
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

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1658187175"
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
                  if (this.archive.method6701(var8)) {
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

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(II)[I",
      garbageValue = "-1596513386"
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

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-570572153"
   )
   @Export("getAverageTextureRGB")
   public int getAverageTextureRGB(int var1) {
      return this.textures[var1] != null ? this.textures[var1].averageRGB : 0;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "-101"
   )
   public boolean vmethod5013(int var1) {
      return this.textures[var1].field2473;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-407888071"
   )
   @Export("isLowDetail")
   public boolean isLowDetail(int var1) {
      return this.textureSize == 64;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1471941846"
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

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "224047431"
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

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "2117448791"
   )
   static final void method4737(int var0, int var1, int var2) {
      int var3;
      for(var3 = 0; var3 < 8; ++var3) {
         for(int var4 = 0; var4 < 8; ++var4) {
            Tiles.Tiles_heights[var0][var3 + var1][var4 + var2] = 0;
         }
      }

      if (var1 > 0) {
         for(var3 = 1; var3 < 8; ++var3) {
            Tiles.Tiles_heights[var0][var1][var3 + var2] = Tiles.Tiles_heights[var0][var1 - 1][var3 + var2];
         }
      }

      if (var2 > 0) {
         for(var3 = 1; var3 < 8; ++var3) {
            Tiles.Tiles_heights[var0][var3 + var1][var2] = Tiles.Tiles_heights[var0][var3 + var1][var2 - 1];
         }
      }

      if (var1 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2] != 0) {
         Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2];
      } else if (var2 > 0 && Tiles.Tiles_heights[var0][var1][var2 - 1] != 0) {
         Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1][var2 - 1];
      } else if (var1 > 0 && var2 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2 - 1] != 0) {
         Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2 - 1];
      }

   }

   @ObfuscatedName("al")
   public static int method4736(long var0) {
      return (int)(var0 >>> 14 & 3L);
   }
}
