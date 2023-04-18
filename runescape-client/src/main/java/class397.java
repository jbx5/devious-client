import java.util.Comparator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pg")
class class397 implements Comparator {
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -56662835
   )
   static int field4534;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lpk;"
   )
   final class398 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lpk;)V"
   )
   class397(class398 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lpj;Lpj;I)I",
      garbageValue = "386384998"
   )
   int method7683(class399 var1, class399 var2) {
      if (var1.field4544 > var2.field4544) {
         return 1;
      } else {
         return var1.field4544 < var2.field4544 ? -1 : 0;
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method7683((class399)var1, (class399)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
      garbageValue = "1798518611"
   )
   public static String method7696(CharSequence var0) {
      int var1 = var0.length();
      StringBuilder var2 = new StringBuilder(var1);

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') {
            if (var4 == ' ') {
               var2.append('+');
            } else {
               byte var5 = class100.charToByteCp1252(var4);
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
