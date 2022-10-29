import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("lr")
public class class316 {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Llr;"
   )
   static final class316 field3724 = new class316(51, 27, 800, 0, 16, 16);
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Llr;"
   )
   static final class316 field3725 = new class316(25, 28, 800, 656, 40, 40);
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 775704293
   )
   final int field3726;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -152632739
   )
   final int field3727;

   class316(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.field3726 = var5;
      this.field3727 = var6;
   }

   @ObfuscatedName("mj")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-114144397"
   )
   static void method6251(String var0) {
      DynamicObject.field974 = var0;

      try {
         String var1 = ClanChannelMember.client.getParameter(Integer.toString(18));
         String var2 = ClanChannelMember.client.getParameter(Integer.toString(13));
         String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
         if (var0.length() == 0) {
            var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
         } else {
            var3 = var3 + "; Expires=" + class295.method5712(UserComparator8.method2748() + 94608000000L) + "; Max-Age=" + 94608000L;
         }

         Client var4 = ClanChannelMember.client;
         String var5 = "document.cookie=\"" + var3 + "\"";
         JSObject.getWindow(var4).eval(var5);
      } catch (Throwable var6) {
      }

   }
}
