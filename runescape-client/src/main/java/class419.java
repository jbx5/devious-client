import java.io.UnsupportedEncodingException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("pi")
public class class419 implements class418 {
   @ObfuscatedName("c")
   JSONObject field4604;

   public class419(byte[] var1) throws UnsupportedEncodingException {
      this.method7785(var1);
   }

   public class419(String var1) throws UnsupportedEncodingException {
      this.method7794(var1);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(B)[B",
      garbageValue = "-39"
   )
   public byte[] vmethod7797() throws UnsupportedEncodingException {
      return this.field4604 == null ? new byte[0] : this.field4604.toString().getBytes("UTF-8");
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "([BI)V",
      garbageValue = "520204581"
   )
   void method7785(byte[] var1) throws UnsupportedEncodingException {
      String var2 = new String(var1, "UTF-8");
      this.method7794(var2);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-1808858081"
   )
   void method7794(String var1) throws UnsupportedEncodingException {
      try {
         if (var1.charAt(0) == '{') {
            this.field4604 = new JSONObject(var1);
         } else {
            if (var1.charAt(0) != '[') {
               throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }

            JSONArray var2 = new JSONArray(var1);
            this.field4604 = new JSONObject();
            this.field4604.method8392("arrayValues", var2);
         }

      } catch (JSONException var3) {
         throw new UnsupportedEncodingException(var3.getMessage());
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)Lorg/json/JSONObject;",
      garbageValue = "2097664875"
   )
   public JSONObject method7786() {
      return this.field4604;
   }
}
