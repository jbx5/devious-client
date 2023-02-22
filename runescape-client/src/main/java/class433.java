import java.io.UnsupportedEncodingException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("qg")
public class class433 implements class432 {
   @ObfuscatedName("gq")
   static String field4642;
   @ObfuscatedName("al")
   JSONObject field4643;

   public class433(byte[] var1) throws UnsupportedEncodingException {
      this.method7978(var1);
   }

   public class433(JSONObject var1) {
      this.field4643 = var1;
   }

   public class433(String var1) throws UnsupportedEncodingException {
      this.method7979(var1);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(B)Lqn;",
      garbageValue = "1"
   )
   public class431 vmethod7993() {
      return class431.field4639;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(B)[B",
      garbageValue = "66"
   )
   public byte[] vmethod7994() throws UnsupportedEncodingException {
      return this.field4643 == null ? new byte[0] : this.field4643.toString().getBytes("UTF-8");
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "([BB)V",
      garbageValue = "18"
   )
   void method7978(byte[] var1) throws UnsupportedEncodingException {
      String var2 = new String(var1, "UTF-8");
      this.method7979(var2);
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;S)V",
      garbageValue = "11699"
   )
   void method7979(String var1) throws UnsupportedEncodingException {
      try {
         if (var1.charAt(0) == '{') {
            this.field4643 = new JSONObject(var1);
         } else {
            if (var1.charAt(0) != '[') {
               throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }

            JSONArray var2 = new JSONArray(var1);
            this.field4643 = new JSONObject();
            this.field4643.method8392("arrayValues", var2);
         }

      } catch (JSONException var3) {
         throw new UnsupportedEncodingException(var3.getMessage());
      }
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(I)Lorg/json/JSONObject;",
      garbageValue = "214188933"
   )
   public JSONObject method7980() {
      return this.field4643;
   }
}
