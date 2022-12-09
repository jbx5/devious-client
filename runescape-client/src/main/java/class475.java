import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("rz")
public class class475 {
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -112517353
   )
   public final int field4980;
   @ObfuscatedName("e")
   public Object field4981;

   public class475(int var1) {
      this.field4980 = var1;
   }

   public class475(int var1, Object var2) {
      this.field4980 = var1;
      this.field4981 = var2;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class475)) {
         return false;
      } else {
         class475 var2 = (class475)var1;
         if (var2.field4981 == null && this.field4981 != null) {
            return false;
         } else if (this.field4981 == null && var2.field4981 != null) {
            return false;
         } else {
            return var2.field4980 == this.field4980 && var2.field4981.equals(this.field4981);
         }
      }
   }

   public int hashCode() {
      return super.hashCode();
   }
}
