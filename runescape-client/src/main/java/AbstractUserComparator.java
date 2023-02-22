import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pl")
@Implements("AbstractUserComparator")
public abstract class AbstractUserComparator implements Comparator {
   @ObfuscatedName("al")
   @Export("nextComparator")
   Comparator nextComparator;

   protected AbstractUserComparator() {
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/Comparator;I)V",
      garbageValue = "-757378534"
   )
   @Export("addComparator")
   final void addComparator(Comparator var1) {
      if (this.nextComparator == null) {
         this.nextComparator = var1;
      } else if (this.nextComparator instanceof AbstractUserComparator) {
         ((AbstractUserComparator)this.nextComparator).addComparator(var1);
      }

   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Lpb;Lpb;I)I",
      garbageValue = "1351948063"
   )
   @Export("compareUser")
   protected final int compareUser(User var1, User var2) {
      return this.nextComparator == null ? 0 : this.nextComparator.compare(var1, var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
