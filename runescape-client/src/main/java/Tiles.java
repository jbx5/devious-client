import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dg")
@Implements("Tiles")
public final class Tiles {
   @ObfuscatedName("aj")
   @Export("Tiles_heights")
   static int[][][] Tiles_heights = new int[4][105][105];
   @ObfuscatedName("al")
   @Export("Tiles_renderFlags")
   static byte[][][] Tiles_renderFlags = new byte[4][104][104];
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 587446233
   )
   @Export("Tiles_minPlane")
   static int Tiles_minPlane = 99;
   @ObfuscatedName("ab")
   @Export("Tiles_underlays")
   static short[][][] Tiles_underlays;
   @ObfuscatedName("an")
   @Export("Tiles_overlays")
   static short[][][] Tiles_overlays;
   @ObfuscatedName("av")
   static byte[][][] field997;
   @ObfuscatedName("ar")
   @Export("Tiles_hue")
   static int[] Tiles_hue;
   @ObfuscatedName("ag")
   static final int[] field998 = new int[]{1, 2, 4, 8};
   @ObfuscatedName("at")
   static final int[] field1006 = new int[]{16, 32, 64, 128};
   @ObfuscatedName("af")
   static final int[] field1000 = new int[]{1, 0, -1, 0};
   @ObfuscatedName("ai")
   static final int[] field1002 = new int[]{0, -1, 0, 1};
   @ObfuscatedName("aw")
   static final int[] field1003 = new int[]{1, -1, -1, 1};
   @ObfuscatedName("aa")
   static final int[] field1004 = new int[]{-1, -1, 1, 1};
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -2077266171
   )
   @Export("rndHue")
   static int rndHue = (int)(Math.random() * 17.0) - 8;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -77149953
   )
   @Export("rndLightness")
   static int rndLightness = (int)(Math.random() * 33.0) - 16;

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lew;FI)F",
      garbageValue = "-1929092975"
   )
   static float method2219(class127 var0, float var1) {
      if (var0 == null) {
         return 0.0F;
      } else {
         float var2;
         if (var0.field1505 == var1) {
            var2 = 0.0F;
         } else if (var0.field1504 == var1) {
            var2 = 1.0F;
         } else {
            var2 = (var1 - var0.field1505) / (var0.field1504 - var0.field1505);
         }

         float var3;
         if (var0.field1519) {
            var3 = var2;
         } else {
            class123.field1460[3] = var0.field1500;
            class123.field1460[2] = var0.field1507;
            class123.field1460[1] = var0.field1506;
            class123.field1460[0] = var0.field1521 - var2;
            class123.field1461[0] = 0.0F;
            class123.field1461[1] = 0.0F;
            class123.field1461[2] = 0.0F;
            class123.field1461[3] = 0.0F;
            class123.field1461[4] = 0.0F;
            int var4 = class368.method6936(class123.field1460, 3, 0.0F, true, 1.0F, true, class123.field1461);
            if (var4 == 1) {
               var3 = class123.field1461[0];
            } else {
               var3 = 0.0F;
            }
         }

         return var0.field1509 + (var0.field1510 + (var3 * var0.field1520 + var0.field1511) * var3) * var3;
      }
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(ILcv;ZI)I",
      garbageValue = "1859570443"
   )
   static int method2194(int var0, Script var1, boolean var2) {
      Widget var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         var3 = WorldMapSection1.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
      } else {
         var3 = var2 ? GameObject.scriptDotWidget : SoundSystem.scriptActiveWidget;
      }

      class69.invalidateWidget(var3);
      if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) {
         if (var0 == ScriptOpcodes.CC_SETNPCHEAD) {
            var3.modelType = 2;
            var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            return 1;
         } else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) {
            var3.modelType = 3;
            var3.modelId = BuddyRankComparator.localPlayer.appearance.getChatHeadId();
            return 1;
         } else {
            return 2;
         }
      } else {
         Interpreter.Interpreter_intStackSize -= 2;
         int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         var3.itemId = var4;
         var3.itemQuantity = var5;
         ItemComposition var6 = ParamComposition.ItemDefinition_get(var4);
         var3.modelAngleX = var6.xan2d;
         var3.modelAngleY = var6.yan2d;
         var3.modelAngleZ = var6.zan2d;
         var3.modelOffsetX = var6.offsetX2d;
         var3.modelOffsetY = var6.offsetY2d;
         var3.modelZoom = var6.zoom2d;
         if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) {
            var3.itemQuantityMode = 0;
         } else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | var6.isStackable == 1) {
            var3.itemQuantityMode = 1;
         } else {
            var3.itemQuantityMode = 2;
         }

         if (var3.field3532 > 0) {
            var3.modelZoom = var3.modelZoom * 32 / var3.field3532;
         } else if (var3.rawWidth > 0) {
            var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
         }

         return 1;
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "1637419736"
   )
   static final void method2216(String var0) {
      MusicPatchNode.addGameMessage(30, "", var0);
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "([BIIIIIIILir;[Liz;)V"
   )
   static final void method2163(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
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
               ObjectComposition var21 = WallDecoration.getObjectDefinition(var11);
               int var22 = var2 + UserComparator4.method2843(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20);
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

                  class30.addObjects(var1, var22, var30, var11, var20 + var7 & 3, var19, var8, var32);
               }
            }
         }
      }
   }

   @ObfuscatedName("ln")
   @ObfuscatedSignature(
      descriptor = "(Lmy;IIB)V",
      garbageValue = "-26"
   )
   @Export("alignWidgetPosition")
   static void alignWidgetPosition(Widget var0, int var1, int var2) {
      if (var0.xAlignment == 0) {
         var0.x = var0.rawX;
      } else if (var0.xAlignment == 1) {
         var0.x = var0.rawX + (var1 - var0.width) / 2;
      } else if (var0.xAlignment == 2) {
         var0.x = var1 - var0.width - var0.rawX;
      } else if (var0.xAlignment == 3) {
         var0.x = var0.rawX * var1 >> 14;
      } else if (var0.xAlignment == 4) {
         var0.x = (var1 - var0.width) / 2 + (var0.rawX * var1 >> 14);
      } else {
         var0.x = var1 - var0.width - (var0.rawX * var1 >> 14);
      }

      if (var0.yAlignment == 0) {
         var0.y = var0.rawY;
      } else if (var0.yAlignment == 1) {
         var0.y = (var2 - var0.height) / 2 + var0.rawY;
      } else if (var0.yAlignment == 2) {
         var0.y = var2 - var0.height - var0.rawY;
      } else if (var0.yAlignment == 3) {
         var0.y = var2 * var0.rawY >> 14;
      } else if (var0.yAlignment == 4) {
         var0.y = (var2 - var0.height) / 2 + (var2 * var0.rawY >> 14);
      } else {
         var0.y = var2 - var0.height - (var2 * var0.rawY >> 14);
      }

   }
}
