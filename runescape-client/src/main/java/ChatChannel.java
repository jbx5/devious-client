import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
@Implements("ChatChannel")
public class ChatChannel {
   @ObfuscatedName("au")
   @Export("hasFocus")
   protected static boolean hasFocus;
   @ObfuscatedName("eq")
   @ObfuscatedSignature(
      descriptor = "Llx;"
   )
   @Export("archive14")
   static Archive archive14;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "[Lbk;"
   )
   @Export("messages")
   Message[] messages = new Message[100];
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -709054483
   )
   @Export("count")
   int count;

   ChatChannel() {
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lbk;",
      garbageValue = "349940904"
   )
   @Export("addMessage")
   Message addMessage(int var1, String var2, String var3, String var4) {
      Message var5 = this.messages[99];

      for(int var6 = this.count; var6 > 0; --var6) {
         if (var6 != 100) {
            this.messages[var6] = this.messages[var6 - 1];
         }
      }

      if (var5 == null) {
         var5 = new Message(var1, var2, var4, var3);
      } else {
         var5.remove();
         var5.removeDual();
         var5.set(var1, var2, var4, var3);
      }

      this.messages[0] = var5;
      if (this.count < 100) {
         ++this.count;
      }

      return var5;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(II)Lbk;",
      garbageValue = "758824821"
   )
   @Export("getMessage")
   Message getMessage(int var1) {
      return var1 >= 0 && var1 < this.count ? this.messages[var1] : null;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-59"
   )
   @Export("size")
   int size() {
      return this.count;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(IIIIIZB)Lri;",
      garbageValue = "-28"
   )
   @Export("getItemSprite")
   public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
      if (var1 == -1) {
         var4 = 0;
      } else if (var4 == 2 && var1 != 1) {
         var4 = 1;
      }

      long var6 = ((long)var2 << 38) + ((long)var1 << 16) + (long)var0 + ((long)var4 << 40) + ((long)var3 << 42);
      SpritePixels var8;
      if (!var5) {
         var8 = (SpritePixels)ItemComposition.ItemDefinition_cachedSprites.get(var6);
         if (var8 != null) {
            return var8;
         }
      }

      ItemComposition var9 = MidiPcmStream.ItemDefinition_get(var0);
      if (var1 > 1 && var9.countobj != null) {
         int var10 = -1;

         for(int var11 = 0; var11 < 10; ++var11) {
            if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) {
               var10 = var9.countobj[var11];
            }
         }

         if (var10 != -1) {
            var9 = MidiPcmStream.ItemDefinition_get(var10);
         }
      }

      Model var21 = var9.getModel(1);
      if (var21 == null) {
         return null;
      } else {
         SpritePixels var22 = null;
         if (var9.noteTemplate != -1) {
            var22 = getItemSprite(var9.note, 10, 1, 0, 0, true);
            if (var22 == null) {
               return null;
            }
         } else if (var9.notedId != -1) {
            var22 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false);
            if (var22 == null) {
               return null;
            }
         } else if (var9.placeholderTemplate != -1) {
            var22 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false);
            if (var22 == null) {
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
         Rasterizer3D.method4192(16, 16);
         Rasterizer3D.field2414 = false;
         if (var9.placeholderTemplate != -1) {
            var22.drawTransBgAt(0, 0);
         }

         int var16 = var9.zoom2d;
         if (var5) {
            var16 = (int)((double)var16 * 1.5);
         } else if (var2 == 2) {
            var16 = (int)((double)var16 * 1.04);
         }

         int var17 = var16 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16;
         int var18 = var16 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16;
         var21.calculateBoundsCylinder();
         var21.method4590(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var21.height / 2 + var17 + var9.offsetY2d, var18 + var9.offsetY2d);
         if (var9.notedId != -1) {
            var22.drawTransBgAt(0, 0);
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
            var22.drawTransBgAt(0, 0);
         }

         if (var4 == 1 || var4 == 2 && var9.isStackable == 1) {
            Font var19 = class139.ItemDefinition_fontPlain11;
            String var20;
            if (var1 < 100000) {
               var20 = "<col=ffff00>" + var1 + "</col>";
            } else if (var1 < 10000000) {
               var20 = "<col=ffffff>" + var1 / 1000 + "K" + "</col>";
            } else {
               var20 = "<col=00ff80>" + var1 / 1000000 + "M" + "</col>";
            }

            var19.draw(var20, 0, 9, 16776960, 1);
         }

         if (!var5) {
            ItemComposition.ItemDefinition_cachedSprites.put(var8, var6);
         }

         Rasterizer2D.Rasterizer2D_replace(var12, var13, var14);
         Rasterizer2D.Rasterizer2D_setClipArray(var15);
         Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
         Rasterizer3D.field2414 = true;
         return var8;
      }
   }
}
