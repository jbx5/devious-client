import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sf")
public class class473 {
   @ObfuscatedName("at")
   public final Object field4903;
   @ObfuscatedName("an")
   public final Object field4904;

   public class473(Object var1, Object var2) {
      this.field4903 = var1;
      this.field4904 = var2;
   }

   public String toString() {
      return this.field4903 + ", " + this.field4904;
   }

   public int hashCode() {
      int var1 = 0;
      if (this.field4903 != null) {
         var1 += this.field4903.hashCode();
      }

      if (this.field4904 != null) {
         var1 += 31 * this.field4904.hashCode();
      }

      return var1;
   }

   public boolean equals(Object var1) {
      if (var1 != null && var1 instanceof class473) {
         class473 var2 = (class473)var1;
         if (this.field4903 == null) {
            if (var2.field4903 != null) {
               return false;
            }
         } else if (!this.field4903.equals(var2.field4903)) {
            return false;
         }

         if (this.field4904 == null) {
            if (var2.field4904 != null) {
               return false;
            }
         } else if (!this.field4904.equals(var2.field4904)) {
            return false;
         }

         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(IB)Ltp;",
      garbageValue = "0"
   )
   @Export("getDbRowType")
   public static DbRowType getDbRowType(int var0) {
      DbRowType var1 = (DbRowType)DbRowType.DBRowType_cache.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = DbRowType.field4997.takeFile(38, var0);
         var1 = new DbRowType();
         if (var2 != null) {
            var1.method8811(new Buffer(var2));
         }

         var1.method8814();
         DbRowType.DBRowType_cache.put(var1, (long)var0);
         return var1;
      }
   }
}
