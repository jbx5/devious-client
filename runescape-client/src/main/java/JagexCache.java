import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
@Implements("JagexCache")
public class JagexCache {
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Lrq;"
   )
   @Export("JagexCache_randomDat")
   public static BufferedFile JagexCache_randomDat = null;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lrq;"
   )
   @Export("JagexCache_dat2File")
   public static BufferedFile JagexCache_dat2File = null;
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "Lrq;"
   )
   @Export("JagexCache_idx255File")
   public static BufferedFile JagexCache_idx255File = null;
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "[Lrq;"
   )
   @Export("JagexCache_idxFiles")
   public static BufferedFile[] JagexCache_idxFiles;

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(CI)C",
      garbageValue = "982885700"
   )
   static char method3483(char var0) {
      switch (var0) {
         case ' ':
         case '-':
         case '_':
         case ' ':
            return '_';
         case '#':
         case '[':
         case ']':
            return var0;
         case 'À':
         case 'Á':
         case 'Â':
         case 'Ã':
         case 'Ä':
         case 'à':
         case 'á':
         case 'â':
         case 'ã':
         case 'ä':
            return 'a';
         case 'Ç':
         case 'ç':
            return 'c';
         case 'È':
         case 'É':
         case 'Ê':
         case 'Ë':
         case 'è':
         case 'é':
         case 'ê':
         case 'ë':
            return 'e';
         case 'Í':
         case 'Î':
         case 'Ï':
         case 'í':
         case 'î':
         case 'ï':
            return 'i';
         case 'Ñ':
         case 'ñ':
            return 'n';
         case 'Ò':
         case 'Ó':
         case 'Ô':
         case 'Õ':
         case 'Ö':
         case 'ò':
         case 'ó':
         case 'ô':
         case 'õ':
         case 'ö':
            return 'o';
         case 'Ù':
         case 'Ú':
         case 'Û':
         case 'Ü':
         case 'ù':
         case 'ú':
         case 'û':
         case 'ü':
            return 'u';
         case 'ß':
            return 'b';
         case 'ÿ':
         case 'Ÿ':
            return 'y';
         default:
            return Character.toLowerCase(var0);
      }
   }

   @ObfuscatedName("lg")
   @ObfuscatedSignature(
      descriptor = "(Lmy;I)Z",
      garbageValue = "126902740"
   )
   @Export("runCs1")
   static final boolean runCs1(Widget var0) {
      if (var0.cs1Comparisons == null) {
         return false;
      } else {
         for(int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) {
            int var2 = Language.method6661(var0, var1);
            int var3 = var0.cs1ComparisonValues[var1];
            if (var0.cs1Comparisons[var1] == 2) {
               if (var2 >= var3) {
                  return false;
               }
            } else if (var0.cs1Comparisons[var1] == 3) {
               if (var2 <= var3) {
                  return false;
               }
            } else if (var0.cs1Comparisons[var1] == 4) {
               if (var3 == var2) {
                  return false;
               }
            } else if (var2 != var3) {
               return false;
            }
         }

         return true;
      }
   }
}
