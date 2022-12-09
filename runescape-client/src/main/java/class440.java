import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("pg")
public class class440 {
   @ObfuscatedName("h")
   public final Object field4811;
   @ObfuscatedName("e")
   public final Object field4809;

   public class440(Object var1, Object var2) {
      this.field4811 = var1;
      this.field4809 = var2;
   }

   public int hashCode() {
      int var1 = 0;
      if (this.field4811 != null) {
         var1 += this.field4811.hashCode();
      }

      if (this.field4809 != null) {
         var1 += 31 * this.field4809.hashCode();
      }

      return var1;
   }

   public boolean equals(Object var1) {
      if (var1 != null && var1 instanceof class440) {
         class440 var2 = (class440)var1;
         if (this.field4811 == null) {
            if (var2.field4811 != null) {
               return false;
            }
         } else if (!this.field4811.equals(var2.field4811)) {
            return false;
         }

         if (this.field4809 == null) {
            if (var2.field4809 != null) {
               return false;
            }
         } else if (!this.field4809.equals(var2.field4809)) {
            return false;
         }

         return true;
      } else {
         return false;
      }
   }

   public String toString() {
      return this.field4811 + ", " + this.field4809;
   }
}
