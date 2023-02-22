import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qn")
public class class431 {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lqn;"
   )
   public static final class431 field4639 = new class431("application/json");
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lqn;"
   )
   static final class431 field4640 = new class431("text/plain");
   @ObfuscatedName("ac")
   String field4641;

   class431(String var1) {
      this.field4641 = var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-1837842196"
   )
   public String method7965() {
      return this.field4641;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;B)Ljava/lang/String;",
      garbageValue = "-23"
   )
   public static String method7966(CharSequence var0) {
      int var1 = var0.length();
      StringBuilder var2 = new StringBuilder(var1);

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') {
            if (var4 == ' ') {
               var2.append('+');
            } else {
               byte var5 = class18.charToByteCp1252(var4);
               var2.append('%');
               int var6 = var5 >> 4 & 15;
               if (var6 >= 10) {
                  var2.append((char)(var6 + 55));
               } else {
                  var2.append((char)(var6 + 48));
               }

               var6 = var5 & 15;
               if (var6 >= 10) {
                  var2.append((char)(var6 + 55));
               } else {
                  var2.append((char)(var6 + 48));
               }
            }
         } else {
            var2.append(var4);
         }
      }

      return var2.toString();
   }
}
