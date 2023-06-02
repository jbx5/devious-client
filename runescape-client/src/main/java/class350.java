import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("nb")
public enum class350 implements MouseWheel {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lnb;"
   )
   field4190(-1),
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lnb;"
   )
   field4195(0),
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lnb;"
   )
   field4192(1),
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lnb;"
   )
   field4193(2);

   @ObfuscatedName("fk")
   @ObfuscatedSignature(
      descriptor = "Lny;"
   )
   @Export("archive18")
   static Archive archive18;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 1585725759
   )
   final int field4191;

   class350(int var3) {
      this.field4191 = var3;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-14"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field4191;
   }

   @ObfuscatedName("gm")
   @ObfuscatedSignature(
      descriptor = "(B)Lil;",
      garbageValue = "0"
   )
   public static class211 method6624() {
      return Client.field739;
   }

   @ObfuscatedName("nn")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;S)V",
      garbageValue = "-21759"
   )
   static void method6623(String var0) {
      class443.field4710 = var0;

      try {
         String var1 = class347.client.getParameter(Integer.toString(18));
         String var2 = class347.client.getParameter(Integer.toString(13));
         String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
         if (var0.length() == 0) {
            var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
         } else {
            var3 = var3 + "; Expires=" + HorizontalAlignment.method3685(BoundaryObject.method5027() + 94608000000L) + "; Max-Age=" + 94608000L;
         }

         Client var4 = class347.client;
         String var5 = "document.cookie=\"" + var3 + "\"";
         JSObject.getWindow(var4).eval(var5);
      } catch (Throwable var6) {
      }

   }
}
