import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gb")
public class class161 extends class142 {
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1002671373
   )
   int field1756;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfh;"
   )
   final class145 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfh;)V"
   )
   class161(class145 var1) {
      this.this$0 = var1;
      this.field1756 = -1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ltz;B)V",
      garbageValue = "59"
   )
   void vmethod3381(Buffer var1) {
      this.field1756 = var1.readUnsignedShort();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lfs;B)V",
      garbageValue = "-72"
   )
   void vmethod3382(ClanSettings var1) {
      var1.method3224(this.field1756);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;I)J",
      garbageValue = "-1137232353"
   )
   public static long method3326(CharSequence var0) {
      long var1 = 0L;
      int var3 = var0.length();

      for(int var4 = 0; var4 < var3; ++var4) {
         var1 *= 37L;
         char var5 = var0.charAt(var4);
         if (var5 >= 'A' && var5 <= 'Z') {
            var1 += (long)(var5 + 1 - 65);
         } else if (var5 >= 'a' && var5 <= 'z') {
            var1 += (long)(var5 + 1 - 97);
         } else if (var5 >= '0' && var5 <= '9') {
            var1 += (long)(var5 + 27 - 48);
         }

         if (var1 >= 177917621779460413L) {
            break;
         }
      }

      while(var1 % 37L == 0L && 0L != var1) {
         var1 /= 37L;
      }

      return var1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(ILtz;I)Lhe;",
      garbageValue = "-1861148269"
   )
   public static PlayerCompositionColorTextureOverride method3332(int var0, Buffer var1) {
      int var2 = var1.readUnsignedByte();
      boolean var3 = (var2 & 1) != 0;
      boolean var4 = (var2 & 2) != 0;
      PlayerCompositionColorTextureOverride var5 = new PlayerCompositionColorTextureOverride(var0);
      int var6;
      int[] var7;
      boolean var8;
      int var9;
      short var10;
      if (var3) {
         var6 = var1.readUnsignedByte();
         var7 = new int[]{var6 & 15, var6 >> 4 & 15};
         var8 = var5.playerCompositionRecolorTo != null && var7.length == var5.playerCompositionRecolorTo.length;

         for(var9 = 0; var9 < 2; ++var9) {
            if (var7[var9] != 15) {
               var10 = (short)var1.readUnsignedShort();
               if (var8) {
                  var5.playerCompositionRecolorTo[var7[var9]] = var10;
               }
            }
         }
      }

      if (var4) {
         var6 = var1.readUnsignedByte();
         var7 = new int[]{var6 & 15, var6 >> 4 & 15};
         var8 = var5.playerCompositionRetextureTo != null && var7.length == var5.playerCompositionRetextureTo.length;

         for(var9 = 0; var9 < 2; ++var9) {
            if (var7[var9] != 15) {
               var10 = (short)var1.readUnsignedShort();
               if (var8) {
                  var5.playerCompositionRetextureTo[var7[var9]] = var10;
               }
            }
         }
      }

      return var5;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-125"
   )
   static void method3331() {
      FaceNormal.Tiles_underlays = null;
      class74.Tiles_overlays = null;
      Player.Tiles_shapes = null;
      Tiles.field1018 = null;
      Tiles.field1020 = null;
      class305.Tiles_underlays2 = null;
      Canvas.field116 = null;
      UserComparator5.Tiles_hue = null;
      class210.Tiles_saturation = null;
      Tiles.Tiles_lightness = null;
      class149.Tiles_hueMultiplier = null;
      Tiles.field1019 = null;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(ILdd;ZB)I",
      garbageValue = "60"
   )
   static int method3327(int var0, Script var1, boolean var2) {
      Widget var3 = FriendSystem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
      if (var0 == ScriptOpcodes.IF_GETSCROLLX) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollX;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETSCROLLY) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollY;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETTEXT) {
         Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3.text;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollWidth;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollHeight;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelZoom;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleX;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleZ;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleY;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETTRANS) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyTop;
         return 1;
      } else if (var0 == 2610) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyBot;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETCOLOUR) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color;
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color2;
         return 1;
      } else if (var0 == 2613) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
         return 1;
      } else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
         return 1;
      } else {
         class322 var4;
         if (var0 == 2617) {
            var4 = var3.method6381();
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3522 : 0;
         }

         if (var0 == 2618) {
            var4 = var3.method6381();
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3519 : 0;
            return 1;
         } else {
            class327 var7;
            if (var0 == 2619) {
               var7 = var3.method6380();
               Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6105().method7267() : "";
               return 1;
            } else if (var0 == 2620) {
               var4 = var3.method6381();
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3520 : 0;
               return 1;
            } else if (var0 == 2621) {
               var7 = var3.method6380();
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6115() : 0;
               return 1;
            } else if (var0 == 2622) {
               var7 = var3.method6380();
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6170() : 0;
               return 1;
            } else if (var0 == 2623) {
               var7 = var3.method6380();
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6117() : 0;
               return 1;
            } else if (var0 == 2624) {
               var7 = var3.method6380();
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method6107() ? 1 : 0;
               return 1;
            } else if (var0 != 2625) {
               if (var0 == 2626) {
                  var7 = var3.method6380();
                  Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6106().method7529() : "";
                  return 1;
               } else if (var0 == 2627) {
                  var7 = var3.method6380();
                  int var5 = var7 != null ? var7.method6232() : 0;
                  int var6 = var7 != null ? var7.method6239() : 0;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.min(var5, var6);
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.max(var5, var6);
                  return 1;
               } else if (var0 == 2628) {
                  var7 = var3.method6380();
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6239() : 0;
                  return 1;
               } else if (var0 == 2629) {
                  var7 = var3.method6380();
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6229() : 0;
                  return 1;
               } else if (var0 == 2630) {
                  var7 = var3.method6380();
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6118() : 0;
                  return 1;
               } else if (var0 == 2631) {
                  var7 = var3.method6380();
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6305() : 0;
                  return 1;
               } else if (var0 == 2632) {
                  var7 = var3.method6380();
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6121() : 0;
                  return 1;
               } else {
                  class27 var8;
                  if (var0 == 2633) {
                     var8 = var3.method6382();
                     Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method420(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0;
                     return 1;
                  } else if (var0 == 2634) {
                     var8 = var3.method6382();
                     Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method385((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var7 = var3.method6380();
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method6156() ? 1 : 0;
               return 1;
            }
         }
      }
   }
}
