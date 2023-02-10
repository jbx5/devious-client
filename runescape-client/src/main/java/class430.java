import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pt")
public class class430 implements class428 {
   @ObfuscatedName("f")
   final Map field4684;

   public class430(Map var1) {
      this.field4684 = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)Lpf;",
      garbageValue = "1"
   )
   public class427 vmethod8059() {
      return null;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(B)[B",
      garbageValue = "1"
   )
   public byte[] vmethod8061() throws UnsupportedEncodingException {
      return this.method8060().getBytes("UTF-8");
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "1"
   )
   public String method8060() throws UnsupportedEncodingException {
      StringBuilder var1 = new StringBuilder();
      Iterator var2 = this.field4684.entrySet().iterator();

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
