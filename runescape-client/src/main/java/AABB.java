import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
@Implements("AABB")
public class AABB {
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -815710187
   )
   @Export("xMid")
   int xMid;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1622504827
   )
   @Export("yMid")
   int yMid;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -935812263
   )
   @Export("zMid")
   int zMid;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 717076899
   )
   @Export("xMidOffset")
   int xMidOffset;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -120678637
   )
   @Export("yMidOffset")
   int yMidOffset;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -877928513
   )
   @Export("zMidOffset")
   int zMidOffset;

   AABB(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.xMid = var1;
      this.yMid = var2;
      this.zMid = var3;
      this.xMidOffset = var4;
      this.yMidOffset = var5;
      this.zMidOffset = var6;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IIIII)I",
      garbageValue = "2095830606"
   )
   static final int method4705(int var0, int var1, int var2, int var3) {
      return var2 * var1 - var3 * var0 >> 16;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "([BIIIIIIIII[Lic;B)V",
      garbageValue = "0"
   )
   static final void method4706(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, CollisionMap[] var10) {
      int var12;
      for(int var11 = 0; var11 < 8; ++var11) {
         for(var12 = 0; var12 < 8; ++var12) {
            if (var11 + var2 > 0 && var11 + var2 < 103 && var3 + var12 > 0 && var3 + var12 < 103) {
               int[] var10000 = var10[var1].flags[var11 + var2];
               var10000[var3 + var12] &= -16777217;
            }
         }
      }

      Buffer var24 = new Buffer(var0);

      for(var12 = 0; var12 < 4; ++var12) {
         for(int var13 = 0; var13 < 64; ++var13) {
            for(int var14 = 0; var14 < 64; ++var14) {
               if (var12 == var4 && var13 >= var5 && var13 < var5 + 8 && var14 >= var6 && var14 < var6 + 8) {
                  int var15 = var2 + ModeWhere.method6929(var13 & 7, var14 & 7, var7);
                  int var18 = var13 & 7;
                  int var19 = var14 & 7;
                  int var20 = var7 & 3;
                  int var17;
                  if (var20 == 0) {
                     var17 = var19;
                  } else if (var20 == 1) {
                     var17 = 7 - var18;
                  } else if (var20 == 2) {
                     var17 = 7 - var19;
                  } else {
                     var17 = var18;
                  }

                  int var21 = var17 + var3;
                  int var22 = (var13 & 7) + var8 + var2;
                  int var23 = var3 + (var14 & 7) + var9;
                  DevicePcmPlayerProvider.loadTerrain(var24, var1, var15, var21, var22, var23, var7);
               } else {
                  DevicePcmPlayerProvider.loadTerrain(var24, 0, -1, -1, 0, 0, 0);
               }
            }
         }
      }

   }

   @ObfuscatedName("go")
   @ObfuscatedSignature(
      descriptor = "(I)Lse;",
      garbageValue = "1468482065"
   )
   @Export("getWorldMap")
   static WorldMap getWorldMap() {
      return ScriptFrame.worldMap;
   }

   @ObfuscatedName("iy")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;ZI)V",
      garbageValue = "1962397573"
   )
   @Export("drawLoadingMessage")
   static final void drawLoadingMessage(String var0, boolean var1) {
      if (Client.showLoadingMessages) {
         byte var2 = 4;
         int var3 = var2 + 6;
         int var4 = var2 + 6;
         int var5 = class404.fontPlain12.lineWidth(var0, 250);
         int var6 = class404.fontPlain12.lineCount(var0, 250) * 13;
         Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var2 + var6 + var2, 0);
         Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6, 16777215);
         class404.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
         class20.method305(var3 - var2, var4 - var2, var2 + var5 + var2, var6 + var2 + var2);
         if (var1) {
            WorldMapSectionType.rasterProvider.drawFull(0, 0);
         } else {
            class330.method6526(var3, var4, var5, var6);
         }

      }
   }
}
