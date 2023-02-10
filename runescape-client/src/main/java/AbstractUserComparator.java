import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ou")
@Implements("AbstractUserComparator")
public abstract class AbstractUserComparator implements Comparator {
   @ObfuscatedName("w")
   @Export("nextComparator")
   Comparator nextComparator;

   protected AbstractUserComparator() {
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/Comparator;B)V",
      garbageValue = "8"
   )
   @Export("addComparator")
   final void addComparator(Comparator var1) {
      if (this.nextComparator == null) {
         this.nextComparator = var1;
      } else if (this.nextComparator instanceof AbstractUserComparator) {
         ((AbstractUserComparator)this.nextComparator).addComparator(var1);
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Low;Low;I)I",
      garbageValue = "508228633"
   )
   @Export("compareUser")
   protected final int compareUser(User var1, User var2) {
      return this.nextComparator == null ? 0 : this.nextComparator.compare(var1, var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "([FIFB)F",
      garbageValue = "123"
   )
   static float method7640(float[] var0, int var1, float var2) {
      float var3 = var0[var1];

      for(int var4 = var1 - 1; var4 >= 0; --var4) {
         var3 = var3 * var2 + var0[var4];
      }

      return var3;
   }
}
