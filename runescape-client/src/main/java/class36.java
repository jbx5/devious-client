import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bt")
public class class36 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Loi;"
   )
   @Export("reflectionChecks")
   public static IterableNodeDeque reflectionChecks = new IterableNodeDeque();
   @ObfuscatedName("jl")
   @ObfuscatedSignature(
      descriptor = "[Ltq;"
   )
   @Export("headIconPkSprites")
   static SpritePixels[] headIconPkSprites;
   @ObfuscatedName("kx")
   @ObfuscatedGetter(
      intValue = -2100544359
   )
   @Export("cameraX")
   static int cameraX;

   @ObfuscatedName("ie")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-32"
   )
   static void method722() {
      if (class126.worldMap != null) {
         class126.worldMap.method8628(GameEngine.Client_plane, WorldMapData_0.baseX * 64 + (MusicPatchNode.localPlayer.x >> 7), GameObject.baseY * 64 + (MusicPatchNode.localPlayer.y >> 7), false);
         class126.worldMap.loadCache();
      }

   }

   @ObfuscatedName("it")
   @ObfuscatedSignature(
      descriptor = "(IIIIZI)V",
      garbageValue = "-1386012109"
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
         var6 = Client.field758;
      } else if (var5 >= 100) {
         var6 = Client.field759;
      } else {
         var6 = (Client.field759 - Client.field758) * var5 / 100 + Client.field758;
      }

      int var7 = var3 * var6 * 512 / (var2 * 334);
      int var8;
      int var9;
      short var17;
      if (var7 < Client.field620) {
         var17 = Client.field620;
         var6 = var17 * var2 * 334 / (var3 * 512);
         if (var6 > Client.field763) {
            var6 = Client.field763;
            var8 = var3 * var6 * 512 / (var17 * 334);
            var9 = (var2 - var8) / 2;
            if (var4) {
               Rasterizer2D.Rasterizer2D_resetClip();
               Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216);
               Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216);
            }

            var0 += var9;
            var2 -= var9 * 2;
         }
      } else if (var7 > Client.field694) {
         var17 = Client.field694;
         var6 = var17 * var2 * 334 / (var3 * 512);
         if (var6 < Client.field572) {
            var6 = Client.field572;
            var8 = var17 * var2 * 334 / (var6 * 512);
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
         int[] var16 = new int[9];

         for(var9 = 0; var9 < var16.length; ++var9) {
            int var10 = var9 * 32 + 15 + 128;
            int var11 = WorldMapData_0.method5041(var10);
            int var12 = Rasterizer3D.Rasterizer3D_sine[var10];
            int var14 = var3 - 334;
            if (var14 < 0) {
               var14 = 0;
            } else if (var14 > 100) {
               var14 = 100;
            }

            int var15 = (Client.zoomWidth - Client.zoomHeight) * var14 / 100 + Client.zoomHeight;
            int var13 = var11 * var15 / 256;
            var16[var9] = var13 * var12 >> 16;
         }

         Scene.Scene_buildVisiblityMap(var16, 500, 800, var2 * 334 / var3, 334);
      }

      Client.viewportOffsetX = var0;
      Client.viewportOffsetY = var1;
      Client.viewportWidth = var2;
      Client.viewportHeight = var3;
   }

   @ObfuscatedName("la")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIB)V",
      garbageValue = "109"
   )
   static final void method716(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var2 - var0;
      int var7 = var3 - var1;
      int var8 = var6 >= 0 ? var6 : -var6;
      int var9 = var7 >= 0 ? var7 : -var7;
      int var10 = var8;
      if (var8 < var9) {
         var10 = var9;
      }

      if (var10 != 0) {
         int var11 = (var6 << 16) / var10;
         int var12 = (var7 << 16) / var10;
         if (var12 <= var11) {
            var11 = -var11;
         } else {
            var12 = -var12;
         }

         int var13 = var5 * var12 >> 17;
         int var14 = var5 * var12 + 1 >> 17;
         int var15 = var5 * var11 >> 17;
         int var16 = var5 * var11 + 1 >> 17;
         var0 -= Rasterizer2D.Rasterizer2D_xClipStart;
         var1 -= Rasterizer2D.Rasterizer2D_yClipStart;
         int var17 = var0 + var13;
         int var18 = var0 - var14;
         int var19 = var0 + var6 - var14;
         int var20 = var0 + var6 + var13;
         int var21 = var15 + var1;
         int var22 = var1 - var16;
         int var23 = var7 + var1 - var16;
         int var24 = var7 + var15 + var1;
         VarpDefinition.method3653(var17, var18, var19);
         class144.method3256(var21, var22, var23, var17, var18, var19, 0.0F, 0.0F, 0.0F, var4);
         VarpDefinition.method3653(var17, var19, var20);
         class144.method3256(var21, var23, var24, var17, var19, var20, 0.0F, 0.0F, 0.0F, var4);
      }
   }

   @ObfuscatedName("no")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1230139284"
   )
   static final void method723() {
      Client.field691 = Client.cycleCntr;
      ItemContainer.field1024 = true;
   }
}
