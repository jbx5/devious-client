import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rl")
public class class458 {
   @ObfuscatedName("ac")
   static final char[] field4828 = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
   @ObfuscatedName("ab")
   static final char[] field4831 = new char[]{'[', ']', '#'};
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1173563887
   )
   @Export("clientType")
   public static int clientType;

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(II)Lrf;",
      garbageValue = "1805661214"
   )
   public static class467 method8343(int var0) {
      int var1 = class465.field4855[var0];
      if (var1 == 1) {
         return class467.field4866;
      } else if (var1 == 2) {
         return class467.field4865;
      } else {
         return var1 == 3 ? class467.field4859 : null;
      }
   }
}
