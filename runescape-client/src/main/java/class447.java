import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("qd")
public class class447 {
   @ObfuscatedName("f")
   public final Object field4832;
   @ObfuscatedName("w")
   public final Object field4833;

   public class447(Object var1, Object var2) {
      this.field4832 = var1;
      this.field4833 = var2;
   }

   public boolean equals(Object var1) {
      if (var1 != null && var1 instanceof class447) {
         class447 var2 = (class447)var1;
         if (this.field4832 == null) {
            if (var2.field4832 != null) {
               return false;
            }
         } else if (!this.field4832.equals(var2.field4832)) {
            return false;
         }

         if (this.field4833 == null) {
            if (var2.field4833 != null) {
               return false;
            }
         } else if (!this.field4833.equals(var2.field4833)) {
            return false;
         }

         return true;
      } else {
         return false;
      }
   }

   public String toString() {
      return this.field4832 + ", " + this.field4833;
   }

   public int hashCode() {
      int var1 = 0;
      if (this.field4832 != null) {
         var1 += this.field4832.hashCode();
      }

      if (this.field4833 != null) {
         var1 += 31 * this.field4833.hashCode();
      }

      return var1;
   }
}
