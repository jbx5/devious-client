import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jj")
public class class270 {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Llg;I)V",
      garbageValue = "-2097032346"
   )
   public static void method5370(AbstractArchive var0) {
      FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var0;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(Lbt;Lbt;IZI)I",
      garbageValue = "2003112674"
   )
   @Export("compareWorlds")
   static int compareWorlds(World var0, World var1, int var2, boolean var3) {
      if (var2 == 1) {
         int var4 = var0.population;
         int var5 = var1.population;
         if (!var3) {
            if (var4 == -1) {
               var4 = 2001;
            }

            if (var5 == -1) {
               var5 = 2001;
            }
         }

         return var4 - var5;
      } else if (var2 == 2) {
         return var0.location - var1.location;
      } else if (var2 == 3) {
         if (var0.activity.equals("-")) {
            if (var1.activity.equals("-")) {
               return 0;
            } else {
               return var3 ? -1 : 1;
            }
         } else if (var1.activity.equals("-")) {
            return var3 ? 1 : -1;
         } else {
            return var0.activity.compareTo(var1.activity);
         }
      } else if (var2 == 4) {
         return var0.method1727() ? (var1.method1727() ? 0 : 1) : (var1.method1727() ? -1 : 0);
      } else if (var2 == 5) {
         return var0.method1729() ? (var1.method1729() ? 0 : 1) : (var1.method1729() ? -1 : 0);
      } else if (var2 == 6) {
         return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
      } else if (var2 == 7) {
         return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
      } else {
         return var0.id - var1.id;
      }
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(IIB)I",
      garbageValue = "-8"
   )
   public static int method5371(int var0, int var1) {
      int var2 = var0 >>> 31;
      return (var0 + var2) / var1 - var2;
   }
}
