import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pn")
public class class423 implements class421 {
   @ObfuscatedName("e")
   final Map field4660;

   public class423(Map var1) {
      this.field4660 = var1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(B)[B",
      garbageValue = "0"
   )
   public byte[] vmethod7924() throws UnsupportedEncodingException {
      return this.method7925().getBytes("UTF-8");
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "1995090155"
   )
   public String method7925() throws UnsupportedEncodingException {
      StringBuilder var1 = new StringBuilder();
      Iterator var2 = this.field4660.entrySet().iterator();

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
}
