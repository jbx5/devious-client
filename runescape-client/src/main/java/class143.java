import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
public class class143 extends class136 {
   @ObfuscatedName("bj")
   @ObfuscatedGetter(
      intValue = 1947806475
   )
   static int field1697;
   @ObfuscatedName("h")
   boolean field1699;
   @ObfuscatedName("e")
   byte field1695;
   @ObfuscatedName("v")
   byte field1694;
   @ObfuscatedName("x")
   byte field1693;
   @ObfuscatedName("m")
   byte field1692;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lem;"
   )
   final class139 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lem;)V"
   )
   class143(class139 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V",
      garbageValue = "1101327225"
   )
   void vmethod3349(Buffer var1) {
      this.field1699 = var1.readUnsignedByte() == 1;
      this.field1695 = var1.readByte();
      this.field1694 = var1.readByte();
      this.field1693 = var1.readByte();
      this.field1692 = var1.readByte();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lep;I)V",
      garbageValue = "839088249"
   )
   void vmethod3350(ClanSettings var1) {
      var1.allowGuests = this.field1699;
      var1.field1728 = this.field1695;
      var1.field1729 = this.field1694;
      var1.field1734 = this.field1693;
      var1.field1731 = this.field1692;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(ZZI)Lra;",
      garbageValue = "1805436151"
   )
   static IndexedSprite method3132(boolean var0, boolean var1) {
      return var0 ? (var1 ? Login.field927 : class89.options_buttons_2Sprite) : (var1 ? Login.field949 : WorldMapLabel.options_buttons_0Sprite);
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(Lbz;Lbz;IZIZI)I",
      garbageValue = "2109338644"
   )
   static int method3134(World var0, World var1, int var2, boolean var3, int var4, boolean var5) {
      int var6 = class109.compareWorlds(var0, var1, var2, var3);
      if (var6 != 0) {
         return var3 ? -var6 : var6;
      } else if (var4 == -1) {
         return 0;
      } else {
         int var7 = class109.compareWorlds(var0, var1, var4, var5);
         return var5 ? -var7 : var7;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1641630372"
   )
   public static void method3127() {
      ParamComposition.ParamDefinition_cached.clear();
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "508435519"
   )
   static final int method3131(int var0, int var1) {
      int var2 = WorldMapIcon_0.method5188(var0 - 1, var1 - 1) + WorldMapIcon_0.method5188(var0 + 1, var1 - 1) + WorldMapIcon_0.method5188(var0 - 1, 1 + var1) + WorldMapIcon_0.method5188(1 + var0, var1 + 1);
      int var3 = WorldMapIcon_0.method5188(var0 - 1, var1) + WorldMapIcon_0.method5188(1 + var0, var1) + WorldMapIcon_0.method5188(var0, var1 - 1) + WorldMapIcon_0.method5188(var0, var1 + 1);
      int var4 = WorldMapIcon_0.method5188(var0, var1);
      return var2 / 16 + var3 / 8 + var4 / 4;
   }

   @ObfuscatedName("hp")
   @ObfuscatedSignature(
      descriptor = "(IIIIZI)V",
      garbageValue = "-750872756"
   )
   @Export("setViewportShape")
   static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
      if (var2 < 1) {
         var2 = 1;
      }

      if (var3 < 1) {
         var3 = 1;
      }

      int var5 = var3 - 334;
      int var6;
      if (var5 < 0) {
         var6 = Client.field778;
      } else if (var5 >= 100) {
         var6 = Client.field550;
      } else {
         var6 = (Client.field550 - Client.field778) * var5 / 100 + Client.field778;
      }

      int var7 = var3 * var6 * 512 / (var2 * 334);
      int var8;
      int var9;
      short var18;
      if (var7 < Client.field784) {
         var18 = Client.field784;
         var6 = var18 * var2 * 334 / (var3 * 512);
         if (var6 > Client.field783) {
            var6 = Client.field783;
            var8 = var3 * var6 * 512 / (var18 * 334);
            var9 = (var2 - var8) / 2;
            if (var4) {
               Rasterizer2D.Rasterizer2D_resetClip();
               Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216);
               Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216);
            }

            var0 += var9;
            var2 -= var9 * 2;
         }
      } else if (var7 > Client.field510) {
         var18 = Client.field510;
         var6 = var18 * var2 * 334 / (var3 * 512);
         if (var6 < Client.field690) {
            var6 = Client.field690;
            var8 = var18 * var2 * 334 / (var6 * 512);
            var9 = (var3 - var8) / 2;
            if (var4) {
               Rasterizer2D.Rasterizer2D_resetClip();
               Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216);
               Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216);
            }

            var1 += var9;
            var3 -= var9 * 2;
         }
      }

      Client.viewportZoom = var3 * var6 / 334;
      if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) {
         int[] var17 = new int[9];

         for(var9 = 0; var9 < var17.length; ++var9) {
            int var10 = var9 * 32 + 15 + 128;
            int var11 = var10 * 3 + 600;
            int var13 = Rasterizer3D.Rasterizer3D_sine[var10];
            int var15 = var3 - 334;
            if (var15 < 0) {
               var15 = 0;
            } else if (var15 > 100) {
               var15 = 100;
            }

            int var16 = (Client.zoomWidth - Client.zoomHeight) * var15 / 100 + Client.zoomHeight;
            int var14 = var11 * var16 / 256;
            var17[var9] = var13 * var14 >> 16;
         }

         Scene.Scene_buildVisiblityMap(var17, 500, 800, var2 * 334 / var3, 334);
      }

      Client.viewportOffsetX = var0;
      Client.viewportOffsetY = var1;
      Client.viewportWidth = var2;
      Client.viewportHeight = var3;
   }
}
