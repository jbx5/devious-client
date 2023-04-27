import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ty")
@Implements("UserComparator2")
public class UserComparator2 implements Comparator {
   @ObfuscatedName("af")
   @Export("reversed")
   final boolean reversed;

   public UserComparator2(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lpw;Lpw;I)I",
      garbageValue = "2140059241"
   )
   @Export("compare_bridged")
   int compare_bridged(User var1, User var2) {
      return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
   }

   public int compare(Object var1, Object var2) {
      return this.compare_bridged((User)var1, (User)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
