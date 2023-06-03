import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qi")
@Implements("AbstractUserComparator")
public abstract class AbstractUserComparator implements Comparator {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lbl;"
   )
   @Export("pcmPlayerProvider")
   static class51 pcmPlayerProvider;
   @ObfuscatedName("an")
   @Export("nextComparator")
   Comparator nextComparator;

   protected AbstractUserComparator() {
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/Comparator;B)V",
      garbageValue = "7"
   )
   @Export("addComparator")
   final void addComparator(Comparator var1) {
      if (this.nextComparator == null) {
         this.nextComparator = var1;
      } else if (this.nextComparator instanceof AbstractUserComparator) {
         ((AbstractUserComparator)this.nextComparator).addComparator(var1);
      }

   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(Lqm;Lqm;I)I",
      garbageValue = "-1645723371"
   )
   @Export("compareUser")
   protected final int compareUser(User var1, User var2) {
      return this.nextComparator == null ? 0 : this.nextComparator.compare(var1, var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
