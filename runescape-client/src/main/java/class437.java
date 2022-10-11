import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("pv")
public class class437 {
   @ObfuscatedName("a")
   public final Object field4764;
   @ObfuscatedName("f")
   public final Object field4765;

   public class437(Object var1, Object var2) {
      this.field4764 = var1;
      this.field4765 = var2;
   }

   public boolean equals(Object var1) {
      if (var1 != null && var1 instanceof class437) {
         class437 var2 = (class437)var1;
         if (this.field4764 == null) {
            if (var2.field4764 != null) {
               return false;
            }
         } else if (!this.field4764.equals(var2.field4764)) {
            return false;
         }

         if (this.field4765 == null) {
            if (var2.field4765 != null) {
               return false;
            }
         } else if (!this.field4765.equals(var2.field4765)) {
            return false;
         }

         return true;
      } else {
         return false;
      }
   }

   public String toString() {
      return this.field4764 + ", " + this.field4765;
   }

   public int hashCode() {
      int var1 = 0;
      if (this.field4764 != null) {
         var1 += this.field4764.hashCode();
      }

      if (this.field4765 != null) {
         var1 += 31 * this.field4765.hashCode();
      }

      return var1;
   }
}
