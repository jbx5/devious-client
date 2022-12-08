import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
public class class200 extends Node {
   @ObfuscatedName("dj")
   @Export("isLargePlayerInfo")
   static boolean isLargePlayerInfo;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 494311763
   )
   public int field2311;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 976799233
   )
   public int field2310;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 1685883689
   )
   public int field2307;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Lkd;"
   )
   public Widget field2312;

   @ObfuscatedSignature(
      descriptor = "(IIILkd;)V"
   )
   public class200(int var1, int var2, int var3, Widget var4) {
      this.field2307 = var1;
      this.field2311 = var2;
      this.field2310 = var3;
      this.field2312 = var4;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "([BI)V",
      garbageValue = "1133722447"
   )
   @Export("ByteArrayPool_release")
   public static synchronized void ByteArrayPool_release(byte[] var0) {
      if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field4438) {
         ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0;
      } else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field4431) {
         ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0;
      } else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field4440) {
         ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0;
      } else if (var0.length == 30000 && ByteArrayPool.field4437 < ByteArrayPool.field4439) {
         ByteArrayPool.field4445[++ByteArrayPool.field4437 - 1] = var0;
      } else {
         if (SceneTilePaint.ByteArrayPool_arrays != null) {
            for(int var1 = 0; var1 < Frames.ByteArrayPool_alternativeSizes.length; ++var1) {
               if (var0.length == Frames.ByteArrayPool_alternativeSizes[var1] && ModelData0.ByteArrayPool_altSizeArrayCounts[var1] < SceneTilePaint.ByteArrayPool_arrays[var1].length) {
                  SceneTilePaint.ByteArrayPool_arrays[var1][ModelData0.ByteArrayPool_altSizeArrayCounts[var1]++] = var0;
                  return;
               }
            }
         }

      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "586283553"
   )
   static int method4095(int var0, int var1) {
      ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
      if (var2 == null) {
         return 0;
      } else if (var1 == -1) {
         return 0;
      } else {
         int var3 = 0;

         for(int var4 = 0; var4 < var2.quantities.length; ++var4) {
            if (var2.ids[var4] == var1) {
               var3 += var2.quantities[var4];
            }
         }

         return var3;
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/util/Date;",
      garbageValue = "-232656998"
   )
   static Date method4093() {
      java.util.Calendar var0 = java.util.Calendar.getInstance();
      var0.set(2, 0);
      var0.set(5, 1);
      var0.set(1, 1900);
      return var0.getTime();
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(IIIIIZB)Lrx;",
      garbageValue = "0"
   )
   @Export("getItemSprite")
   public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
      if (var1 == -1) {
         var4 = 0;
      } else if (var4 == 2 && var1 != 1) {
         var4 = 1;
      }

      long var6 = ((long)var1 << 16) + (long)var0 + ((long)var2 << 38) + ((long)var4 << 40) + ((long)var3 << 42);
      SpritePixels var8;
      if (!var5) {
         var8 = (SpritePixels)ItemComposition.ItemDefinition_cachedSprites.get(var6);
         if (var8 != null) {
            return var8;
         }
      }

      ItemComposition var9 = NPCComposition.ItemDefinition_get(var0);
      if (var1 > 1 && var9.countobj != null) {
         int var10 = -1;

         for(int var11 = 0; var11 < 10; ++var11) {
            if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) {
               var10 = var9.countobj[var11];
            }
         }

         if (var10 != -1) {
            var9 = NPCComposition.ItemDefinition_get(var10);
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
         Rasterizer3D.method4395(16, 16);
         Rasterizer3D.field2495 = false;
         if (var9.placeholderTemplate != -1) {
            var20.drawTransBgAt(0, 0);
         }

         int var16 = var9.zoom2d;
         if (var5) {
            var16 = (int)((double)var16 * 1.5);
         } else if (var2 == 2) {
            var16 = (int)((double)var16 * 1.04);
         }

         int var17 = var16 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16;
         int var18 = var16 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16;
         var19.calculateBoundsCylinder();
         var19.method4682(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var19.height / 2 + var17 + var9.offsetY2d, var18 + var9.offsetY2d);
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
            class262.ItemDefinition_fontPlain11.draw(PacketWriter.method2742(var1), 0, 9, 16776960, 1);
         }

         if (!var5) {
            ItemComposition.ItemDefinition_cachedSprites.put(var8, var6);
         }

         Rasterizer2D.Rasterizer2D_replace(var12, var13, var14);
         Rasterizer2D.Rasterizer2D_setClipArray(var15);
         Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
         Rasterizer3D.field2495 = true;
         return var8;
      }
   }
}
