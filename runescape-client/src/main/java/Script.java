import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
@Implements("Script")
public class Script extends DualNode {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lkh;"
   )
   @Export("Script_cached")
   static EvictingDualNodeHashTable Script_cached = new EvictingDualNodeHashTable(128);
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "Lno;"
   )
   @Export("NetCache_currentResponse")
   public static NetFileRequest NetCache_currentResponse;
   @ObfuscatedName("an")
   String field961;
   @ObfuscatedName("aw")
   @Export("opcodes")
   int[] opcodes;
   @ObfuscatedName("ac")
   @Export("intOperands")
   int[] intOperands;
   @ObfuscatedName("au")
   @Export("stringOperands")
   String[] stringOperands;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 2144970855
   )
   @Export("localIntCount")
   int localIntCount;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1897224143
   )
   @Export("localStringCount")
   int localStringCount;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1203198865
   )
   @Export("intArgumentCount")
   int intArgumentCount;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1178893217
   )
   @Export("stringArgumentCount")
   int stringArgumentCount;
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "[Lro;"
   )
   @Export("switches")
   IterableNodeHashTable[] switches;

   Script() {
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(II)[Lro;",
      garbageValue = "-1544314186"
   )
   @Export("newIterableNodeHashTable")
   IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
      return new IterableNodeHashTable[var1];
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-2065195027"
   )
   public static int method2137(int var0, int var1) {
      int var2;
      for(var2 = 1; var1 > 1; var1 >>= 1) {
         if ((var1 & 1) != 0) {
            var2 = var0 * var2;
         }

         var0 *= var0;
      }

      if (var1 == 1) {
         return var0 * var2;
      } else {
         return var2;
      }
   }
}
