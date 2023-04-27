import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qa")
public class class438 implements class436 {
   @ObfuscatedName("af")
   final Map field4712;

   public class438(Map var1) {
      this.field4712 = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)Lqz;",
      garbageValue = "-1368831969"
   )
   public class435 vmethod8346() {
      return null;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)[B",
      garbageValue = "888549065"
   )
   public byte[] vmethod8347() throws UnsupportedEncodingException {
      return this.method8348().getBytes("UTF-8");
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-759167743"
   )
   public String method8348() throws UnsupportedEncodingException {
      StringBuilder var1 = new StringBuilder();
      Iterator var2 = this.field4712.entrySet().iterator();

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
