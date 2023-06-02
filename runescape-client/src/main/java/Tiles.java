import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
@Implements("Tiles")
public final class Tiles {
   @ObfuscatedName("at")
   @Export("Tiles_heights")
   static int[][][] Tiles_heights = new int[4][105][105];
   @ObfuscatedName("an")
   @Export("Tiles_renderFlags")
   static byte[][][] Tiles_renderFlags = new byte[4][104][104];
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -1143562485
   )
   @Export("Tiles_minPlane")
   static int Tiles_minPlane = 99;
   @ObfuscatedName("ab")
   static byte[][][] field1018;
   @ObfuscatedName("aa")
   @Export("Tiles_lightness")
   static int[] Tiles_lightness;
   @ObfuscatedName("ad")
   static int[] field1019;
   @ObfuscatedName("ac")
   static int[][][] field1020;
   @ObfuscatedName("az")
   static final int[] field1021 = new int[]{1, 2, 4, 8};
   @ObfuscatedName("au")
   static final int[] field1022 = new int[]{16, 32, 64, 128};
   @ObfuscatedName("ai")
   static final int[] field1014 = new int[]{1, 0, -1, 0};
   @ObfuscatedName("aq")
   static final int[] field1023 = new int[]{0, -1, 0, 1};
   @ObfuscatedName("aw")
   static final int[] field1025 = new int[]{1, -1, -1, 1};
   @ObfuscatedName("ay")
   static final int[] field1026 = new int[]{-1, -1, 1, 1};
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -318893965
   )
   @Export("rndHue")
   static int rndHue = (int)(Math.random() * 17.0) - 8;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 1262350389
   )
   @Export("rndLightness")
   static int rndLightness = (int)(Math.random() * 33.0) - 16;

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(IIIII)I",
      garbageValue = "-31660228"
   )
   static final int method2209(int var0, int var1, int var2, int var3) {
      return var0 * var2 + var3 * var1 >> 16;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "([BIIIIIIILiz;[Lic;)V"
   )
   static final void method2167(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
      Buffer var10 = new Buffer(var0);
      int var11 = -1;

      while(true) {
         int var12 = var10.readIncrSmallSmart();
         if (var12 == 0) {
            return;
         }

         var11 += var12;
         int var13 = 0;

         while(true) {
            int var14 = var10.readUShortSmart();
            if (var14 == 0) {
               break;
            }

            var13 += var14 - 1;
            int var15 = var13 & 63;
            int var16 = var13 >> 6 & 63;
            int var17 = var13 >> 12;
            int var18 = var10.readUnsignedByte();
            int var19 = var18 >> 2;
            int var20 = var18 & 3;
            if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
               ObjectComposition var21 = class175.getObjectDefinition(var11);
               int var22 = var2 + Canvas.method327(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20);
               int var23 = var3 + class226.method4468(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20);
               if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
                  int var24 = var1;
                  if ((Tiles_renderFlags[1][var22][var23] & 2) == 2) {
                     var24 = var1 - 1;
                  }

                  CollisionMap var25 = null;
                  if (var24 >= 0) {
                     var25 = var9[var24];
                  }

                  SpriteMask.addObjects(var1, var22, var23, var11, var20 + var7 & 3, var19, var8, var25);
               }
            }
         }
      }
   }
}
