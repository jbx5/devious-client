import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nm")
public class class376 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lnp;"
   )
   class372 field4436;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1684694613
   )
   int field4435 = 0;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1377020075
   )
   int field4434 = 0;

   @ObfuscatedSignature(
      descriptor = "(Lnp;II)V"
   )
   class376(class372 var1, int var2, int var3) {
      this.field4436 = var1;
      this.field4435 = var2;
      this.field4434 = var3;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-1661938253"
   )
   public String method7307() {
      if (this.method7297()) {
         return "";
      } else {
         StringBuilder var1 = new StringBuilder(this.method7300());

         for(int var2 = this.field4435; var2 < this.field4434; ++var2) {
            class374 var3 = this.field4436.method7074(var2);
            var1.append(var3.field4411);
         }

         return var1.toString();
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "116"
   )
   boolean method7305(int var1) {
      return this.field4436.method7085() == 2 || this.field4436.method7085() == 1 && (!this.field4436.field4391 || this.field4434 - 1 != var1);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "147383283"
   )
   public boolean method7297() {
      return this.field4434 == this.field4435;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1907458407"
   )
   public int method7300() {
      return this.field4434 - this.field4435;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(Lnq;B)Z",
      garbageValue = "-126"
   )
   boolean method7298(class374 var1) {
      if (this.field4436.field4401 == 2) {
         return true;
      } else if (this.field4436.field4401 == 0) {
         return false;
      } else {
         return this.field4436.method7097() != var1;
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "2058328946"
   )
   int method7302() {
      if (this.method7297()) {
         return 0;
      } else {
         class374 var1 = this.field4436.method7074(this.field4434 - 1);
         if (var1.field4411 == '\n') {
            return 0;
         } else if (this.method7298(var1)) {
            return this.field4436.field4398.advances[42];
         } else {
            int var2 = this.field4436.field4398.advances[var1.field4411];
            if (var2 == 0) {
               return var1.field4411 == '\t' ? this.field4436.field4398.advances[32] * 3 : this.field4436.field4398.advances[32];
            } else {
               return var2;
            }
         }
      }
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(B)Lqd;",
      garbageValue = "4"
   )
   public class447 method7303() {
      if (this.method7297()) {
         return new class447(0, 0);
      } else {
         class374 var1 = this.field4436.method7074(this.field4434 - 1);
         return new class447(var1.field4408 + this.method7302(), var1.field4410);
      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(II)Lnq;",
      garbageValue = "1716209155"
   )
   public class374 method7304(int var1) {
      return var1 >= 0 && var1 < this.method7300() ? this.field4436.method7074(this.field4435 + var1) : null;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/util/Date;",
      garbageValue = "0"
   )
   static Date method7323() throws ParseException {
      SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
      var0.setLenient(false);
      StringBuilder var1 = new StringBuilder();
      String[] var2 = Login.field926;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         String var4 = var2[var3];
         if (var4 == null) {
            HealthBarUpdate.method2442("Date not valid.", "Please ensure all characters are populated.", "");
            return null;
         }

         var1.append(var4);
      }

      var1.append("12");
      return var0.parse(var1.toString());
   }
}
