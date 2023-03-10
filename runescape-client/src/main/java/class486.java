import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("sj")
public class class486 {
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -1862181409
   )
   public final int field4967;
   @ObfuscatedName("al")
   public Object field4966;

   public class486(int var1) {
      this.field4967 = var1;
   }

   public class486(int var1, Object var2) {
      this.field4967 = var1;
      this.field4966 = var2;
   }

   public int hashCode() {
      return super.hashCode();
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class486)) {
         return false;
      } else {
         class486 var2 = (class486)var1;
         if (var2.field4966 == null && this.field4966 != null) {
            return false;
         } else if (this.field4966 == null && var2.field4966 != null) {
            return false;
         } else {
            return var2.field4967 == this.field4967 && var2.field4966.equals(this.field4966);
         }
      }
   }
}
