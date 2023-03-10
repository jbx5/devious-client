import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
public class class33 {
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 1303528101
   )
   int field170;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -832417801
   )
   int field174;

   class33(int var1, int var2) {
      this.field170 = var1;
      this.field174 = var2;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lbs;B)Z",
      garbageValue = "2"
   )
   boolean method472(class29 var1) {
      if (var1 == null) {
         return false;
      } else {
         switch (this.field170) {
            case 1:
               return var1.vmethod4075(this.field174);
            case 2:
               return var1.vmethod4086(this.field174);
            case 3:
               return var1.vmethod4077((char)this.field174);
            case 4:
               return var1.vmethod4100(this.field174 == 1);
            default:
               return false;
         }
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-478775215"
   )
   static void method475() {
      Iterator var0 = Messages.Messages_hashTable.iterator();

      while(var0.hasNext()) {
         Message var1 = (Message)var0.next();
         var1.clearIsFromIgnored();
      }

   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
      garbageValue = "0"
   )
   public static String method471(String var0) {
      int var1 = var0.length();
      char[] var2 = new char[var1];
      byte var3 = 2;

      for(int var4 = 0; var4 < var1; ++var4) {
         char var5 = var0.charAt(var4);
         if (var3 == 0) {
            var5 = Character.toLowerCase(var5);
         } else if (var3 == 2 || Character.isUpperCase(var5)) {
            char var6;
            if (var5 != 181 && var5 != 402) {
               var6 = Character.toTitleCase(var5);
            } else {
               var6 = var5;
            }

            var5 = var6;
         }

         if (Character.isLetter(var5)) {
            var3 = 0;
         } else if (var5 != '.' && var5 != '?' && var5 != '!') {
            if (Character.isSpaceChar(var5)) {
               if (var3 != 2) {
                  var3 = 1;
               }
            } else {
               var3 = 1;
            }
         } else {
            var3 = 2;
         }

         var2[var4] = var5;
      }

      return new String(var2);
   }
}
