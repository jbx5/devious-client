import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
@Implements("TextureProvider")
public class TextureProvider implements TextureLoader {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "[Lhv;"
   )
   @Export("textures")
   Texture[] textures;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lmo;"
   )
   @Export("deque")
   NodeDeque deque = new NodeDeque();
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1321183309
   )
   @Export("capacity")
   int capacity;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1105723629
   )
   @Export("remaining")
   int remaining = 0;
   @ObfuscatedName("z")
   @Export("brightness")
   double brightness = 1.0;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1025033257
   )
   @Export("textureSize")
   int textureSize = 128;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("archive")
   AbstractArchive archive;

   @ObfuscatedSignature(
      descriptor = "(Lln;Lln;IDI)V"
   )
   public TextureProvider(AbstractArchive var1, AbstractArchive var2, int var3, double var4, int var6) {
      this.archive = var2;
      this.capacity = var3;
      this.remaining = this.capacity;
      this.brightness = var4;
      this.textureSize = var6;
      int[] var7 = var1.getGroupFileIds(0);
      int var8 = var7.length;
      this.textures = new Texture[var1.getGroupFileCount(0)];

      for(int var9 = 0; var9 < var8; ++var9) {
         Buffer var10 = new Buffer(var1.takeFile(0, var7[var9]));
         this.textures[var7[var9]] = new Texture(var10);
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-42"
   )
   @Export("getLoadedPercentage")
   public int getLoadedPercentage() {
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
               if (this.archive.method6603(var8)) {
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

   @ObfuscatedName("w")
   @Export("setBrightness")
   public void setBrightness(double var1) {
      this.brightness = var1;
      this.clear();
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(II)[I",
      garbageValue = "1661663667"
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

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-1511027024"
   )
   @Export("getAverageTextureRGB")
   public int getAverageTextureRGB(int var1) {
      return this.textures[var1] != null ? this.textures[var1].averageRGB : 0;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(IS)Z",
      garbageValue = "27425"
   )
   public boolean vmethod4859(int var1) {
      return this.textures[var1].field2453;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "81"
   )
   @Export("isLowDetail")
   public boolean isLowDetail(int var1) {
      return this.textureSize == 64;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1988825307"
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

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-255146767"
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

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(IIIIIZB)Lrs;",
      garbageValue = "-94"
   )
   @Export("getItemSprite")
   public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
      if (var1 == -1) {
         var4 = 0;
      } else if (var4 == 2 && var1 != 1) {
         var4 = 1;
      }

      long var6 = ((long)var3 << 42) + ((long)var4 << 40) + ((long)var2 << 38) + ((long)var1 << 16) + (long)var0;
      SpritePixels var8;
      if (!var5) {
         var8 = (SpritePixels)ItemComposition.ItemDefinition_cachedSprites.get(var6);
         if (var8 != null) {
            return var8;
         }
      }

      ItemComposition var9 = TileItem.ItemDefinition_get(var0);
      if (var1 > 1 && var9.countobj != null) {
         int var10 = -1;

         for(int var11 = 0; var11 < 10; ++var11) {
            if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) {
               var10 = var9.countobj[var11];
            }
         }

         if (var10 != -1) {
            var9 = TileItem.ItemDefinition_get(var10);
         }
      }

      Model var19 = var9.getModel(1);
      if (var19 == null) {
         return null;
      } else {
         SpritePixels var20 = null;
         if (var9.noteTemplate != -1) {
            var20 = getItemSprite(var9.note, 10, 1, 0, 0, true);
            if (var20 == null) {
               return null;
            }
         } else if (var9.notedId != -1) {
            var20 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false);
            if (var20 == null) {
               return null;
            }
         } else if (var9.placeholderTemplate != -1) {
            var20 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false);
            if (var20 == null) {
               return null;
            }
         }

         int[] var12 = Rasterizer2D.Rasterizer2D_pixels;
         int var13 = Rasterizer2D.Rasterizer2D_width;
         int var14 = Rasterizer2D.Rasterizer2D_height;
         int[] var15 = new int[4];
         Rasterizer2D.Rasterizer2D_getClipArray(var15);
         var8 = new SpritePixels(36, 32);
         Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32);
         Rasterizer2D.Rasterizer2D_clear();
         Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
         Rasterizer3D.method4417(16, 16);
         Rasterizer3D.field2500 = false;
         if (var9.placeholderTemplate != -1) {
            var20.drawTransBgAt(0, 0);
         }

         int var16 = var9.zoom2d;
         if (var5) {
            var16 = (int)(1.5 * (double)var16);
         } else if (var2 == 2) {
            var16 = (int)((double)var16 * 1.04);
         }

         int var17 = var16 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16;
         int var18 = var16 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16;
         var19.calculateBoundsCylinder();
         var19.method4706(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var19.height / 2 + var17 + var9.offsetY2d, var18 + var9.offsetY2d);
         if (var9.notedId != -1) {
            var20.drawTransBgAt(0, 0);
         }

         if (var2 >= 1) {
            var8.outline(1);
         }

         if (var2 >= 2) {
            var8.outline(16777215);
         }

         if (var3 != 0) {
            var8.shadow(var3);
         }

         Rasterizer2D.Rasterizer2D_replace(var8.pixels, 36, 32);
         if (var9.noteTemplate != -1) {
            var20.drawTransBgAt(0, 0);
         }

         if (var4 == 1 || var4 == 2 && var9.isStackable == 1) {
            class138.ItemDefinition_fontPlain11.draw(class303.method5869(var1), 0, 9, 16776960, 1);
         }

         if (!var5) {
            ItemComposition.ItemDefinition_cachedSprites.put(var8, var6);
         }

         Rasterizer2D.Rasterizer2D_replace(var12, var13, var14);
         Rasterizer2D.Rasterizer2D_setClipArray(var15);
         Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
         Rasterizer3D.field2500 = true;
         return var8;
      }
   }

   @ObfuscatedName("hm")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "88"
   )
   static final void method4681() {
      for(GraphicsObject var0 = (GraphicsObject)Client.graphicsObjects.last(); var0 != null; var0 = (GraphicsObject)Client.graphicsObjects.previous()) {
         if (var0.plane == class103.Client_plane && !var0.isFinished) {
            if (Client.cycle >= var0.cycleStart) {
               var0.advance(Client.graphicsCycle);
               if (var0.isFinished) {
                  var0.remove();
               } else {
                  WorldMapAreaData.scene.drawEntity(var0.plane, var0.x, var0.y, var0.z, 60, var0, 0, -1L, false);
               }
            }
         } else {
            var0.remove();
         }
      }

   }
}
