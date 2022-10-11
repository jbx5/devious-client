import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
@Implements("Tiles")
public final class Tiles {
   @ObfuscatedName("a")
   @Export("Tiles_heights")
   static int[][][] Tiles_heights = new int[4][105][105];
   @ObfuscatedName("f")
   @Export("Tiles_renderFlags")
   static byte[][][] Tiles_renderFlags = new byte[4][104][104];
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1539536263
   )
   @Export("Tiles_minPlane")
   static int Tiles_minPlane = 99;
   @ObfuscatedName("x")
   @Export("Tiles_underlays")
   static short[][][] Tiles_underlays;
   @ObfuscatedName("h")
   @Export("Tiles_overlays")
   static short[][][] Tiles_overlays;
   @ObfuscatedName("j")
   @Export("Tiles_shapes")
   static byte[][][] Tiles_shapes;
   @ObfuscatedName("n")
   static int[][] field995;
   @ObfuscatedName("w")
   static final int[] field999 = new int[]{1, 2, 4, 8};
   @ObfuscatedName("m")
   static final int[] field1000 = new int[]{16, 32, 64, 128};
   @ObfuscatedName("q")
   static final int[] field991 = new int[]{1, 0, -1, 0};
   @ObfuscatedName("i")
   static final int[] field1003 = new int[]{0, -1, 0, 1};
   @ObfuscatedName("e")
   static final int[] field993 = new int[]{1, -1, -1, 1};
   @ObfuscatedName("g")
   static final int[] field1004 = new int[]{-1, -1, 1, 1};
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 436439579
   )
   @Export("rndHue")
   static int rndHue = (int)(Math.random() * 17.0) - 8;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1964014913
   )
   @Export("rndLightness")
   static int rndLightness = (int)(Math.random() * 33.0) - 16;

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)[Ljk;",
      garbageValue = "1783443464"
   )
   public static class273[] method2169() {
      return new class273[]{class273.field3109, class273.field3107, class273.field3108, class273.field3116, class273.field3110, class273.field3111, class273.field3106, class273.field3119, class273.field3114, class273.field3113, class273.field3112, class273.field3117, class273.field3118, class273.field3121};
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "([BIIIIIIILhf;[Lgr;)V"
   )
   static final void method2170(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
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
               ObjectComposition var21 = InterfaceParent.getObjectDefinition(var11);
               int var22 = var2 + AttackOption.method2540(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20);
               int var23 = var3 + class230.method4681(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20);
               if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
                  int var24 = var1;
                  if ((Tiles_renderFlags[1][var22][var23] & 2) == 2) {
                     var24 = var1 - 1;
                  }

                  CollisionMap var25 = null;
                  if (var24 >= 0) {
                     var25 = var9[var24];
                  }

                  DbTableType.addObjects(var1, var22, var23, var11, var20 + var7 & 3, var19, var8, var25);
               }
            }
         }
      }
   }

   @ObfuscatedName("kd")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1950536426"
   )
   @Export("Widget_resetModelFrames")
   static final void Widget_resetModelFrames(int var0) {
      if (WorldMapManager.loadInterface(var0)) {
         Widget[] var1 = Widget.Widget_interfaceComponents[var0];

         for(int var2 = 0; var2 < var1.length; ++var2) {
            Widget var3 = var1[var2];
            if (var3 != null) {
               var3.modelFrame = 0;
               var3.modelFrameCycle = 0;
            }
         }

      }
   }
}
