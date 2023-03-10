import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("rv")
public class class451 {
   @ObfuscatedName("aj")
   public final Object field4798;
   @ObfuscatedName("al")
   public final Object field4799;

   public class451(Object var1, Object var2) {
      this.field4798 = var1;
      this.field4799 = var2;
   }

   public boolean equals(Object var1) {
      if (var1 != null && var1 instanceof class451) {
         class451 var2 = (class451)var1;
         if (this.field4798 == null) {
            if (var2.field4798 != null) {
               return false;
            }
         } else if (!this.field4798.equals(var2.field4798)) {
            return false;
         }

         if (this.field4799 == null) {
            if (var2.field4799 != null) {
               return false;
            }
         } else if (!this.field4799.equals(var2.field4799)) {
            return false;
         }

         return true;
      } else {
         return false;
      }
   }

   public String toString() {
      return this.field4798 + ", " + this.field4799;
   }

   public int hashCode() {
      int var1 = 0;
      if (this.field4798 != null) {
         var1 += this.field4798.hashCode();
      }

      if (this.field4799 != null) {
         var1 += 31 * this.field4799.hashCode();
      }

      return var1;
   }
}
