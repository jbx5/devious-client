import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bt")
public class class71 {
   @ObfuscatedName("h")
   static final BigInteger field911 = new BigInteger("10001", 16);
   @ObfuscatedName("e")
   static final BigInteger field908 = new BigInteger("ad3d9ce586e8174849a64e9a4c026a0e0b9e654a319951144939f4cc7869cd5660e3ee34d1ef221b4c86970d1370225f8c5c1dd04f2182a7eeaa5227c04f38692a85384e06228c1bf5da9c76971ad9b891964f096fc3a8d2ab6cff41d20a678c81990dce1e9c587798d638f848ade22a1232d9c2452834ec87a43a26c325080f", 16);
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -373657743
   )
   @Export("KitDefinition_fileCount")
   public static int KitDefinition_fileCount;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "[[Lkd;"
   )
   @Export("Widget_interfaceComponents")
   public static Widget[][] Widget_interfaceComponents;
   @ObfuscatedName("ed")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("archive12")
   static Archive archive12;

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)V",
      garbageValue = "74"
   )
   static final void method2032(int var0, int var1, int var2, int var3) {
      for(int var4 = var1; var4 <= var3 + var1; ++var4) {
         for(int var5 = var0; var5 <= var0 + var2; ++var5) {
            if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
               Canvas.Tiles_underlays[0][var5][var4] = 127;
               if (var0 == var5 && var5 > 0) {
                  Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
               }

               if (var0 + var2 == var5 && var5 < 103) {
                  Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
               }

               if (var4 == var1 && var4 > 0) {
                  Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
               }

               if (var3 + var1 == var4 && var4 < 103) {
                  Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
               }
            }
         }
      }

   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(ILbm;ZI)I",
      garbageValue = "-1238835819"
   )
   static int method2033(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? class190.scriptDotWidget : class360.scriptActiveWidget;
      if (var0 == ScriptOpcodes.CC_GETX) {
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.x;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETY) {
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.y;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETWIDTH) {
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.width;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETHEIGHT) {
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.height;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETHIDE) {
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETLAYER) {
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.parentId;
         return 1;
      } else {
         return 2;
      }
   }
}
