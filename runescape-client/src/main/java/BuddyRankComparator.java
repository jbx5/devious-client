import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
   @ObfuscatedName("ti")
   @ObfuscatedGetter(
      intValue = 1161612672
   )
   static int field1431;
   @ObfuscatedName("iq")
   @ObfuscatedSignature(
      descriptor = "Lri;"
   )
   @Export("compass")
   static SpritePixels compass;
   @ObfuscatedName("a")
   @Export("reversed")
   final boolean reversed;

   public BuddyRankComparator(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lof;Lof;I)I",
      garbageValue = "-1386108744"
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

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(CB)Z",
      garbageValue = "-93"
   )
   @Export("isCharAlphabetic")
   public static boolean isCharAlphabetic(char var0) {
      return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }
}
