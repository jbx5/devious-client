import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ev")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
   @ObfuscatedName("aj")
   @Export("reversed")
   final boolean reversed;

   public UserComparator4(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lpt;Lpt;I)I",
      garbageValue = "-664521357"
   )
   @Export("compare_bridged")
   int compare_bridged(Buddy var1, Buddy var2) {
      return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
   }

   public int compare(Object var1, Object var2) {
      return this.compare_bridged((Buddy)var1, (Buddy)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lne;I)V",
      garbageValue = "-1194430739"
   )
   public static void method2842(AbstractArchive var0) {
      InvDefinition.InvDefinition_archive = var0;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(IIIIIII)I",
      garbageValue = "-401496193"
   )
   public static int method2843(int var0, int var1, int var2, int var3, int var4, int var5) {
      if ((var5 & 1) == 1) {
         int var6 = var3;
         var3 = var4;
         var4 = var6;
      }

      var2 &= 3;
      if (var2 == 0) {
         return var0;
      } else if (var2 == 1) {
         return var1;
      } else {
         return var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1);
      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-859160746"
   )
   public static void method2841() {
      StructComposition.StructDefinition_cached.clear();
   }
}
