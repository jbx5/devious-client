import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
public class class82 {
   @ObfuscatedName("di")
   @Export("mouseCam")
   static boolean mouseCam;

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
      garbageValue = "2142843749"
   )
   public static String method2229(String var0) {
      StringBuilder var1 = new StringBuilder(var0.length());
      int var2 = 0;
      int var3 = -1;

      for(int var4 = 0; var4 < var0.length(); ++var4) {
         char var5 = var0.charAt(var4);
         if (var5 == '<') {
            var1.append(var0.substring(var2, var4));
            var3 = var4;
         } else if (var5 == '>' && var3 != -1) {
            String var6 = var0.substring(var3 + 1, var4);
            var3 = -1;
            if (var6.equals("lt")) {
               var1.append("<");
            } else if (var6.equals("gt")) {
               var1.append(">");
            } else if (var6.equals("br")) {
               var1.append("\n");
            }

            var2 = var4 + 1;
         }
      }

      if (var2 < var0.length()) {
         var1.append(var0.substring(var2, var0.length()));
      }

      return var1.toString();
   }
}
