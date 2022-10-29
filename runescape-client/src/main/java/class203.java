import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gi")
public class class203 {
   @ObfuscatedName("c")
   @Export("directions")
   public static int[][] directions = new int[128][128];
   @ObfuscatedName("x")
   @Export("distances")
   public static int[][] distances = new int[128][128];
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 716158957
   )
   public static int field2291;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1550515171
   )
   public static int field2294;
   @ObfuscatedName("d")
   @Export("bufferX")
   public static int[] bufferX = new int[4096];
   @ObfuscatedName("n")
   @Export("bufferY")
   public static int[] bufferY = new int[4096];
   @ObfuscatedName("qy")
   @ObfuscatedSignature(
      descriptor = "Lqf;"
   )
   @Export("HitSplatDefinition_cached")
   static class448 HitSplatDefinition_cached;

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(II)Lge;",
      garbageValue = "-1505137813"
   )
   @Export("StructDefinition_getStructDefinition")
   public static StructComposition StructDefinition_getStructDefinition(int var0) {
      StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0);
         var1 = new StructComposition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         var1.postDecode();
         StructComposition.StructDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(ILbz;ZI)I",
      garbageValue = "-2022954984"
   )
   static int method4052(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? class140.scriptDotWidget : class136.scriptActiveWidget;
      if (var0 == ScriptOpcodes.CC_GETINVOBJECT) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.itemId;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) {
         if (var3.itemId != -1) {
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.itemQuantity;
         } else {
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
         }

         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETID) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.childIndex;
         return 1;
      } else if (var0 == 1707) {
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.method6075() ? 1 : 0;
         return 1;
      } else if (var0 == 1708) {
         return class409.method7736(var3);
      } else {
         return var0 == 1709 ? class129.method2946(var3) : 2;
      }
   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "(Lqi;B)Ljava/lang/Object;",
      garbageValue = "-54"
   )
   static Object method4050(class453 var0) {
      if (var0 == null) {
         throw new IllegalStateException("popValueOfType() failure - null baseVarType");
      } else {
         switch (var0.field4831) {
            case 0:
               return Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
            case 1:
               return Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize];
            default:
               throw new IllegalStateException("popValueOfType() failure - unsupported type");
         }
      }
   }
}
