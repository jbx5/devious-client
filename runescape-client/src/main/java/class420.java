import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("po")
public class class420 implements class418 {
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "Lqr;"
   )
   @Export("NetCache_responseArchiveBuffer")
   public static Buffer NetCache_responseArchiveBuffer;
   @ObfuscatedName("f")
   final Map field4609;

   public class420(Map var1) {
      this.field4609 = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(B)[B",
      garbageValue = "-39"
   )
   public byte[] vmethod7797() throws UnsupportedEncodingException {
      return this.method7798().getBytes("UTF-8");
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "3"
   )
   public String method7798() throws UnsupportedEncodingException {
      StringBuilder var1 = new StringBuilder();
      Iterator var2 = this.field4609.entrySet().iterator();

      while(var2.hasNext()) {
         Map.Entry var3 = (Map.Entry)var2.next();
         String var4 = URLEncoder.encode((String)var3.getKey(), "UTF-8");
         String var5 = URLEncoder.encode((String)var3.getValue(), "UTF-8");
         var1.append(var4).append("=").append(var5).append("&");
      }

      if (var1.length() == 0) {
         return "";
      } else {
         var1.deleteCharAt(var1.length() - 1);
         var1.insert(0, "?");
         return var1.toString();
      }
   }

   @ObfuscatedName("hc")
   @ObfuscatedSignature(
      descriptor = "(S)Lme;",
      garbageValue = "-19976"
   )
   public static NodeDeque method7802() {
      return Client.scriptEvents;
   }
}
