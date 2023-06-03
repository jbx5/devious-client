import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("az")
public class class18 {
   @ObfuscatedName("wf")
   @Export("foundItemIds")
   static short[] foundItemIds;
   @ObfuscatedName("at")
   Future field89;
   @ObfuscatedName("an")
   String field91;

   class18(Future var1) {
      this.field89 = var1;
   }

   class18(String var1) {
      this.method283(var1);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-709380893"
   )
   void method283(String var1) {
      if (var1 == null) {
         var1 = "";
      }

      this.field91 = var1;
      if (this.field89 != null) {
         this.field89.cancel(true);
         this.field89 = null;
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(S)Ljava/lang/String;",
      garbageValue = "-9590"
   )
   public final String method274() {
      return this.field91;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-19"
   )
   public boolean method280() {
      return this.field91 != null || this.field89 == null;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-104"
   )
   public final boolean method275() {
      return this.method280() ? true : this.field89.isDone();
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)Lai;",
      garbageValue = "-1982612952"
   )
   public final class20 method276() {
      if (this.method280()) {
         return new class20(this.field91);
      } else if (!this.method275()) {
         return null;
      } else {
         try {
            return (class20)this.field89.get();
         } catch (Exception var3) {
            String var2 = "Error retrieving REST request reply";
            System.err.println(var2 + "\r\n" + var3);
            this.method283(var2);
            return new class20(var2);
         }
      }
   }
}
