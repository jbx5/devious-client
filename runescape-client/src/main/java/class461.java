import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("rg")
public class class461 {
   @ObfuscatedName("af")
   public final Object field4886;
   @ObfuscatedName("an")
   public final Object field4887;

   public class461(Object var1, Object var2) {
      this.field4886 = var1;
      this.field4887 = var2;
   }

   public String toString() {
      return this.field4886 + ", " + this.field4887;
   }

   public int hashCode() {
      int var1 = 0;
      if (this.field4886 != null) {
         var1 += this.field4886.hashCode();
      }

      if (this.field4887 != null) {
         var1 += 31 * this.field4887.hashCode();
      }

      return var1;
   }

   public boolean equals(Object var1) {
      if (var1 != null && var1 instanceof class461) {
         class461 var2 = (class461)var1;
         if (this.field4886 == null) {
            if (var2.field4886 != null) {
               return false;
            }
         } else if (!this.field4886.equals(var2.field4886)) {
            return false;
         }

         if (this.field4887 == null) {
            if (var2.field4887 != null) {
               return false;
            }
         } else if (!this.field4887.equals(var2.field4887)) {
            return false;
         }

         return true;
      } else {
         return false;
      }
   }
}
