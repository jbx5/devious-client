import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
   @ObfuscatedName("f")
   @Export("reversed")
   final boolean reversed;

   public BuddyRankComparator(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Loa;Loa;I)I",
      garbageValue = "-556514740"
   )
   @Export("compareBuddy")
   int compareBuddy(Buddy var1, Buddy var2) {
      if (var2.rank != var1.rank) {
         return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank;
      } else {
         return this.compareUser(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2);
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(IIZB)Ljava/lang/String;",
      garbageValue = "-19"
   )
   static String method2965(int var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         if (var2 && var0 >= 0) {
            int var3 = 2;

            for(int var4 = var0 / var1; var4 != 0; ++var3) {
               var4 /= var1;
            }

            char[] var5 = new char[var3];
            var5[0] = '+';

            for(int var6 = var3 - 1; var6 > 0; --var6) {
               int var7 = var0;
               var0 /= var1;
               int var8 = var7 - var0 * var1;
               if (var8 >= 10) {
                  var5[var6] = (char)(var8 + 87);
               } else {
                  var5[var6] = (char)(var8 + 48);
               }
            }

            return new String(var5);
         } else {
            return Integer.toString(var0, var1);
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   @ObfuscatedName("hn")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-910910666"
   )
   static boolean method2958() {
      return (Client.drawPlayerNames & 8) != 0;
   }
}
