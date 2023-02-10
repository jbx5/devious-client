import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
@Implements("UserComparator5")
public class UserComparator5 extends AbstractUserComparator {
   @ObfuscatedName("s")
   @Export("JagexCache_locationFile")
   public static File JagexCache_locationFile;
   @ObfuscatedName("f")
   @Export("reversed")
   final boolean reversed;

   public UserComparator5(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Loa;Loa;I)I",
      garbageValue = "600195653"
   )
   @Export("compareBuddy")
   int compareBuddy(Buddy var1, Buddy var2) {
      if (var1.world != 0) {
         if (var2.world == 0) {
            return this.reversed ? -1 : 1;
         }
      } else if (var2.world != 0) {
         return this.reversed ? 1 : -1;
      }

      return this.compareUser(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2);
   }

   @ObfuscatedName("jk")
   @ObfuscatedSignature(
      descriptor = "(Lkz;I)Z",
      garbageValue = "-279294198"
   )
   @Export("runCs1")
   static final boolean runCs1(Widget var0) {
      if (var0.cs1Comparisons == null) {
         return false;
      } else {
         for(int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) {
            int var2 = Language.method6780(var0, var1);
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
