import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bv")
@Implements("Tiles")
public final class Tiles {
   @ObfuscatedName("f")
   @Export("Tiles_heights")
   static int[][][] Tiles_heights = new int[4][105][105];
   @ObfuscatedName("w")
   @Export("Tiles_renderFlags")
   static byte[][][] Tiles_renderFlags = new byte[4][104][104];
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 2029245625
   )
   @Export("Tiles_minPlane")
   static int Tiles_minPlane = 99;
   @ObfuscatedName("s")
   @Export("Tiles_underlays")
   static short[][][] Tiles_underlays;
   @ObfuscatedName("j")
   @Export("Tiles_shapes")
   static byte[][][] Tiles_shapes;
   @ObfuscatedName("i")
   static byte[][][] field1012;
   @ObfuscatedName("n")
   @Export("Tiles_underlays2")
   static byte[][][] Tiles_underlays2;
   @ObfuscatedName("r")
   @Export("Tiles_lightness")
   static int[] Tiles_lightness;
   @ObfuscatedName("u")
   static final int[] field1015 = new int[]{1, 2, 4, 8};
   @ObfuscatedName("x")
   static final int[] field1016 = new int[]{16, 32, 64, 128};
   @ObfuscatedName("a")
   static final int[] field1017 = new int[]{1, 0, -1, 0};
   @ObfuscatedName("q")
   static final int[] field1007 = new int[]{0, -1, 0, 1};
   @ObfuscatedName("d")
   static final int[] field1019 = new int[]{1, -1, -1, 1};
   @ObfuscatedName("e")
   static final int[] field1020 = new int[]{-1, -1, 1, 1};
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1002490687
   )
   @Export("rndHue")
   static int rndHue = (int)(Math.random() * 17.0) - 8;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 1127262765
   )
   @Export("rndLightness")
   static int rndLightness = (int)(Math.random() * 33.0) - 16;

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "([BIIIIIIILhn;[Lgv;)V"
   )
   static final void method2274(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
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
               ObjectComposition var21 = class463.getObjectDefinition(var11);
               int var22 = var2 + WorldMapRegion.method5148(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20);
               int var25 = var16 & 7;
               int var26 = var15 & 7;
               int var28 = var21.sizeX;
               int var29 = var21.sizeY;
               int var30;
               if ((var20 & 1) == 1) {
                  var30 = var28;
                  var28 = var29;
                  var29 = var30;
               }

               int var27 = var7 & 3;
               int var24;
               if (var27 == 0) {
                  var24 = var26;
               } else if (var27 == 1) {
                  var24 = 7 - var25 - (var28 - 1);
               } else if (var27 == 2) {
                  var24 = 7 - var26 - (var29 - 1);
               } else {
                  var24 = var25;
               }

               var30 = var3 + var24;
               if (var22 > 0 && var30 > 0 && var22 < 103 && var30 < 103) {
                  int var31 = var1;
                  if ((Tiles_renderFlags[1][var22][var30] & 2) == 2) {
                     var31 = var1 - 1;
                  }

                  CollisionMap var32 = null;
                  if (var31 >= 0) {
                     var32 = var9[var31];
                  }

                  UserList.addObjects(var1, var22, var30, var11, var20 + var7 & 3, var19, var8, var32);
               }
            }
         }
      }
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(ILba;ZI)I",
      garbageValue = "1451168135"
   )
   static int method2277(int var0, Script var1, boolean var2) {
      Widget var7;
      if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) {
         int var4;
         if (var0 == ScriptOpcodes.CC_TRIGGEROP) {
            var7 = var2 ? Interpreter.scriptDotWidget : class85.scriptActiveWidget;
            var4 = Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize];
            if (var4 >= 1 && var4 <= 10) {
               class97 var8 = new class97(var4, var7.id, var7.childIndex, var7.itemId);
               Interpreter.field864.add(var8);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else if (var0 == ScriptOpcodes.IF_TRIGGEROP) {
            class302.Interpreter_intStackSize -= 3;
            int var3 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 1];
            int var5 = Interpreter.Interpreter_intStack[class302.Interpreter_intStackSize + 2];
            if (var5 >= 1 && var5 <= 10) {
               class97 var6 = new class97(var5, var3, var4, class133.getWidget(var3).itemId);
               Interpreter.field864.add(var6);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else {
            return 2;
         }
      } else if (Interpreter.field861 >= 10) {
         throw new RuntimeException();
      } else {
         if (var0 >= 2000) {
            var7 = class133.getWidget(Interpreter.Interpreter_intStack[--class302.Interpreter_intStackSize]);
         } else {
            var7 = var2 ? Interpreter.scriptDotWidget : class85.scriptActiveWidget;
         }

         if (var7.onResize == null) {
            return 0;
         } else {
            ScriptEvent var9 = new ScriptEvent();
            var9.widget = var7;
            var9.args = var7.onResize;
            var9.field1071 = Interpreter.field861 + 1;
            Client.scriptEvents.addFirst(var9);
            return 1;
         }
      }
   }

   @ObfuscatedName("mm")
   @ObfuscatedSignature(
      descriptor = "(IB)Lqc;",
      garbageValue = "-124"
   )
   static class467 method2276(int var0) {
      class467 var1 = (class467)Client.DBTableIndex_cache.get((long)var0);
      if (var1 == null) {
         var1 = new class467(Canvas.field132, WorldMapLabelSize.method4893(var0), MidiPcmStream.method5728(var0));
         Client.DBTableIndex_cache.put(var1, (long)var0);
      }

      return var1;
   }
}
