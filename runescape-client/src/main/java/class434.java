import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qm")
public class class434 implements class432 {
   @ObfuscatedName("aj")
   final Map field4645;

   public class434(Map var1) {
      this.field4645 = var1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(B)Lqn;",
      garbageValue = "1"
   )
   public class431 vmethod7993() {
      return null;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(B)[B",
      garbageValue = "66"
   )
   public byte[] vmethod7994() throws UnsupportedEncodingException {
      return this.method7995().getBytes("UTF-8");
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "421465179"
   )
   public String method7995() throws UnsupportedEncodingException {
      StringBuilder var1 = new StringBuilder();
      Iterator var2 = this.field4645.entrySet().iterator();

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
