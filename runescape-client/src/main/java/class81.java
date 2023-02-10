import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cp")
public class class81 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lln;B)V",
      garbageValue = "2"
   )
   public static void method2307(AbstractArchive var0) {
      EnumComposition.EnumDefinition_archive = var0;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(CI)C",
      garbageValue = "2080105393"
   )
   static char method2306(char var0) {
      if (var0 == 198) {
         return 'E';
      } else if (var0 == 230) {
         return 'e';
      } else if (var0 == 223) {
         return 's';
      } else if (var0 == 338) {
         return 'E';
      } else {
         return (char)(var0 == 339 ? 'e' : '\u0000');
      }
   }
}
