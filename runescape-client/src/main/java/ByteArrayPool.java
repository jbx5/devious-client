import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("pv")
@Implements("ByteArrayPool")
public class ByteArrayPool {
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 1296808291
   )
   @Export("ByteArrayPool_smallCount")
   static int ByteArrayPool_smallCount = 0;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -664251455
   )
   @Export("ByteArrayPool_mediumCount")
   static int ByteArrayPool_mediumCount = 0;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -412578041
   )
   @Export("ByteArrayPool_largeCount")
   static int ByteArrayPool_largeCount = 0;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 406675343
   )
   static int field4479 = 0;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 1644263995
   )
   static int field4483 = 1000;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -436632225
   )
   static int field4484 = 250;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -653047613
   )
   static int field4485 = 100;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -1312298357
   )
   static int field4486 = 50;
   @ObfuscatedName("aj")
   @Export("ByteArrayPool_small")
   static byte[][] ByteArrayPool_small = new byte[1000][];
   @ObfuscatedName("ad")
   @Export("ByteArrayPool_medium")
   static byte[][] ByteArrayPool_medium = new byte[250][];
   @ObfuscatedName("ac")
   @Export("ByteArrayPool_large")
   static byte[][] ByteArrayPool_large = new byte[100][];
   @ObfuscatedName("ag")
   static byte[][] field4494 = new byte[50][];
   @ObfuscatedName("au")
   static ArrayList field4491 = new ArrayList();
   @ObfuscatedName("ko")
   @ObfuscatedGetter(
      intValue = -2063059311
   )
   @Export("cameraZ")
   static int cameraZ;

   static {
      field4491.clear();
      field4491.add(100);
      field4491.add(5000);
      field4491.add(10000);
      field4491.add(30000);
      new HashMap();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IZI)[B",
      garbageValue = "968818845"
   )
   @Export("ByteArrayPool_getArrayBool")
   public static synchronized byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
      byte[] var4;
      if ((var0 == 100 || var0 < 100 && var1) && ByteArrayPool_smallCount > 0) {
         var4 = ByteArrayPool_small[--ByteArrayPool_smallCount];
         ByteArrayPool_small[ByteArrayPool_smallCount] = null;
         return var4;
      } else if ((var0 == 5000 || var0 < 5000 && var1) && ByteArrayPool_mediumCount > 0) {
         var4 = ByteArrayPool_medium[--ByteArrayPool_mediumCount];
         ByteArrayPool_medium[ByteArrayPool_mediumCount] = null;
         return var4;
      } else if ((var0 == 10000 || var0 < 10000 && var1) && ByteArrayPool_largeCount > 0) {
         var4 = ByteArrayPool_large[--ByteArrayPool_largeCount];
         ByteArrayPool_large[ByteArrayPool_largeCount] = null;
         return var4;
      } else if ((var0 == 30000 || var0 < 30000 && var1) && field4479 > 0) {
         var4 = field4494[--field4479];
         field4494[field4479] = null;
         return var4;
      } else {
         int var2;
         if (JagexCache.ByteArrayPool_arrays != null) {
            for(var2 = 0; var2 < class152.ByteArrayPool_alternativeSizes.length; ++var2) {
               if ((class152.ByteArrayPool_alternativeSizes[var2] == var0 || var0 < class152.ByteArrayPool_alternativeSizes[var2] && var1) && PendingSpawn.ByteArrayPool_altSizeArrayCounts[var2] > 0) {
                  byte[] var3 = JagexCache.ByteArrayPool_arrays[var2][--PendingSpawn.ByteArrayPool_altSizeArrayCounts[var2]];
                  JagexCache.ByteArrayPool_arrays[var2][PendingSpawn.ByteArrayPool_altSizeArrayCounts[var2]] = null;
                  return var3;
               }
            }
         }

         if (var1 && class152.ByteArrayPool_alternativeSizes != null) {
            for(var2 = 0; var2 < class152.ByteArrayPool_alternativeSizes.length; ++var2) {
               if (var0 <= class152.ByteArrayPool_alternativeSizes[var2] && PendingSpawn.ByteArrayPool_altSizeArrayCounts[var2] < JagexCache.ByteArrayPool_arrays[var2].length) {
                  return new byte[class152.ByteArrayPool_alternativeSizes[var2]];
               }
            }
         }

         return new byte[var0];
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(ILdd;ZI)I",
      garbageValue = "548182647"
   )
   static int method7598(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? class53.scriptDotWidget : Interpreter.scriptActiveWidget;
      if (var0 == ScriptOpcodes.CC_GETSCROLLX) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollX;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETSCROLLY) {
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollY;
         return 1;
      } else {
         class327 var7;
         if (var0 == ScriptOpcodes.CC_GETTEXT) {
            if (var3.type == 12) {
               var7 = var3.method6380();
               if (var7 != null) {
                  Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var7.method6163().method7267();
                  return 1;
               }
            }

            Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var3.text;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollWidth;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollHeight;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelZoom;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleX;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleZ;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleY;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETTRANS) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyTop;
            return 1;
         } else if (var0 == 1610) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyBot;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETCOLOUR) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color2;
            return 1;
         } else if (var0 == 1613) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) {
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
            return 1;
         } else {
            class322 var4;
            if (var0 == 1617) {
               var4 = var3.method6381();
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3522 : 0;
            }

            if (var0 == 1618) {
               var4 = var3.method6381();
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3519 : 0;
               return 1;
            } else if (var0 == 1619) {
               var7 = var3.method6380();
               Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6105().method7267() : "";
               return 1;
            } else if (var0 == 1620) {
               var4 = var3.method6381();
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3520 : 0;
               return 1;
            } else if (var0 == 1621) {
               var7 = var3.method6380();
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6115() : 0;
               return 1;
            } else if (var0 == 1622) {
               var7 = var3.method6380();
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6170() : 0;
               return 1;
            } else if (var0 == 1623) {
               var7 = var3.method6380();
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6117() : 0;
               return 1;
            } else if (var0 == 1624) {
               var7 = var3.method6380();
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method6107() ? 1 : 0;
               return 1;
            } else if (var0 != 1625) {
               if (var0 == 1626) {
                  var7 = var3.method6380();
                  Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6106().method7529() : "";
                  return 1;
               } else if (var0 == 1627) {
                  var7 = var3.method6380();
                  int var5 = var7 != null ? var7.method6232() : 0;
                  int var6 = var7 != null ? var7.method6239() : 0;
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.min(var5, var6);
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.max(var5, var6);
                  return 1;
               } else if (var0 == 1628) {
                  var7 = var3.method6380();
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6239() : 0;
                  return 1;
               } else if (var0 == 1629) {
                  var7 = var3.method6380();
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6229() : 0;
                  return 1;
               } else if (var0 == 1630) {
                  var7 = var3.method6380();
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6118() : 0;
                  return 1;
               } else if (var0 == 1631) {
                  var7 = var3.method6380();
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6305() : 0;
                  return 1;
               } else if (var0 == 1632) {
                  var7 = var3.method6380();
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6121() : 0;
                  return 1;
               } else {
                  class27 var8;
                  if (var0 == 1633) {
                     var8 = var3.method6382();
                     Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method420(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0;
                     return 1;
                  } else if (var0 == 1634) {
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
