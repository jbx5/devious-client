import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("rj")
public class class471 {
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -855630925
   )
   public final int field4932;
   @ObfuscatedName("f")
   public Object field4930;

   public class471(int var1) {
      this.field4932 = var1;
   }

   public class471(int var1, Object var2) {
      this.field4932 = var1;
      this.field4930 = var2;
   }

   public int hashCode() {
      return super.hashCode();
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class471)) {
         return false;
      } else {
         class471 var2 = (class471)var1;
         if (var2.field4930 == null && this.field4930 != null) {
            return false;
         } else if (this.field4930 == null && var2.field4930 != null) {
            return false;
         } else {
            return var2.field4932 == this.field4932 && var2.field4930.equals(this.field4930);
         }
      }
   }
}
