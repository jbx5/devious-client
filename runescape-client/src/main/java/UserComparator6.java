import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
@Implements("UserComparator6")
public class UserComparator6 extends AbstractUserComparator {
   @ObfuscatedName("aj")
   @Export("reversed")
   final boolean reversed;

   public UserComparator6(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lpt;Lpt;I)I",
      garbageValue = "-351875320"
   )
   @Export("compareBuddy")
   int compareBuddy(Buddy var1, Buddy var2) {
      if (var1.world != 0 && var2.world != 0) {
         return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
      } else {
         return this.compareUser(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2);
   }
}
