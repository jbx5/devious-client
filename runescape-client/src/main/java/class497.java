import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("te")
public class class497 {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -52705447
   )
   public final int field5058;
   @ObfuscatedName("an")
   public Object field5057;

   public class497(int var1) {
      this.field5058 = var1;
   }

   public class497(int var1, Object var2) {
      this.field5058 = var1;
      this.field5057 = var2;
   }

   public int hashCode() {
      return super.hashCode();
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class497)) {
         return false;
      } else {
         class497 var2 = (class497)var1;
         if (var2.field5057 == null && this.field5057 != null) {
            return false;
         } else if (this.field5057 == null && var2.field5057 != null) {
            return false;
         } else {
            return var2.field5058 == this.field5058 && var2.field5057.equals(this.field5057);
         }
      }
   }
}
