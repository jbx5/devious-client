import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
@Implements("Tiles")
public final class Tiles {
   @ObfuscatedName("af")
   @Export("Tiles_heights")
   static int[][][] Tiles_heights = new int[4][105][105];
   @ObfuscatedName("an")
   @Export("Tiles_renderFlags")
   static byte[][][] Tiles_renderFlags = new byte[4][104][104];
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 1401144457
   )
   @Export("Tiles_minPlane")
   static int Tiles_minPlane = 99;
   @ObfuscatedName("au")
   @Export("Tiles_overlays")
   static short[][][] Tiles_overlays;
   @ObfuscatedName("ab")
   @Export("Tiles_shapes")
   static byte[][][] Tiles_shapes;
   @ObfuscatedName("aq")
   static byte[][][] field999;
   @ObfuscatedName("al")
   @Export("Tiles_underlays2")
   static byte[][][] Tiles_underlays2;
   @ObfuscatedName("at")
   static int[][] field996;
   @ObfuscatedName("ay")
   @Export("Tiles_saturation")
   static int[] Tiles_saturation;
   @ObfuscatedName("am")
   static final int[] field995 = new int[]{1, 2, 4, 8};
   @ObfuscatedName("as")
   static final int[] field1006 = new int[]{16, 32, 64, 128};
   @ObfuscatedName("aj")
   static final int[] field1007 = new int[]{1, 0, -1, 0};
   @ObfuscatedName("ak")
   static final int[] field1003 = new int[]{0, -1, 0, 1};
   @ObfuscatedName("az")
   static final int[] field1009 = new int[]{1, -1, -1, 1};
   @ObfuscatedName("ad")
   static final int[] field1010 = new int[]{-1, -1, 1, 1};
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -372405639
   )
   @Export("rndHue")
   static int rndHue = (int)(Math.random() * 17.0) - 8;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -647485415
   )
   @Export("rndLightness")
   static int rndLightness = (int)(Math.random() * 33.0) - 16;

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "1"
   )
   public static void method2222() {
      try {
         File var0 = new File(HorizontalAlignment.userHomeDirectory, "random.dat");
         int var2;
         if (var0.exists()) {
            JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0);
         } else {
            label39:
            for(int var1 = 0; var1 < class96.cacheSubPaths.length; ++var1) {
               for(var2 = 0; var2 < class130.cacheParentPaths.length; ++var2) {
                  File var3 = new File(class130.cacheParentPaths[var2] + class96.cacheSubPaths[var1] + File.separatorChar + "random.dat");
                  if (var3.exists()) {
                     JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var3, "rw", 25L), 24, 0);
                     break label39;
                  }
               }
            }
         }

         if (JagexCache.JagexCache_randomDat == null) {
            RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
            var2 = var4.read();
            var4.seek(0L);
            var4.write(var2);
            var4.seek(0L);
            var4.close();
            JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0);
         }
      } catch (IOException var5) {
      }

   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "([BIIIIIIILie;[Lif;)V"
   )
   static final void method2166(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
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
               ObjectComposition var21 = class144.getObjectDefinition(var11);
               int var24 = var16 & 7;
               int var25 = var15 & 7;
               int var27 = var21.sizeX;
               int var28 = var21.sizeY;
               int var29;
               if ((var20 & 1) == 1) {
                  var29 = var27;
                  var27 = var28;
                  var28 = var29;
               }

               int var26 = var7 & 3;
               int var23;
               if (var26 == 0) {
                  var23 = var24;
               } else if (var26 == 1) {
                  var23 = var25;
               } else if (var26 == 2) {
                  var23 = 7 - var24 - (var27 - 1);
               } else {
                  var23 = 7 - var25 - (var28 - 1);
               }

               var29 = var2 + var23;
               int var32 = var16 & 7;
               int var33 = var15 & 7;
               int var35 = var21.sizeX;
               int var36 = var21.sizeY;
               int var37;
               if ((var20 & 1) == 1) {
                  var37 = var35;
                  var35 = var36;
                  var36 = var37;
               }

               int var34 = var7 & 3;
               int var31;
               if (var34 == 0) {
                  var31 = var33;
               } else if (var34 == 1) {
                  var31 = 7 - var32 - (var35 - 1);
               } else if (var34 == 2) {
                  var31 = 7 - var33 - (var36 - 1);
               } else {
                  var31 = var32;
               }

               var37 = var3 + var31;
               if (var29 > 0 && var37 > 0 && var29 < 103 && var37 < 103) {
                  int var38 = var1;
                  if ((Tiles_renderFlags[1][var29][var37] & 2) == 2) {
                     var38 = var1 - 1;
                  }

                  CollisionMap var39 = null;
                  if (var38 >= 0) {
                     var39 = var9[var38];
                  }

                  class207.addObjects(var1, var29, var37, var11, var20 + var7 & 3, var19, var8, var39);
               }
            }
         }
      }
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1441948024"
   )
   public static void method2221() {
      Rasterizer3D.clips.method4943();
   }
}
