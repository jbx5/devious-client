import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
@Implements("UserComparator5")
public class UserComparator5 extends AbstractUserComparator {
   @ObfuscatedName("oh")
   @ObfuscatedGetter(
      intValue = -1074459873
   )
   @Export("selectedSpellFlags")
   static int selectedSpellFlags;
   @ObfuscatedName("a")
   @Export("reversed")
   final boolean reversed;

   public UserComparator5(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lof;Lof;I)I",
      garbageValue = "-1769224585"
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
}
