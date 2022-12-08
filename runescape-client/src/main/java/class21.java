import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("p")
public class class21 {
   @ObfuscatedName("ei")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   static Archive field123;
   @ObfuscatedName("ov")
   @ObfuscatedGetter(
      intValue = 429125907
   )
   @Export("selectedSpellFlags")
   static int selectedSpellFlags;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -1186998877
   )
   final int field121;
   @ObfuscatedName("e")
   final String field122;

   class21(String var1) {
      this.field121 = 400;
      this.field122 = "";
   }

   class21(HttpURLConnection var1) throws IOException {
      this.field121 = var1.getResponseCode();
      var1.getResponseMessage();
      var1.getHeaderFields();
      StringBuilder var2 = new StringBuilder();
      InputStream var3 = this.field121 >= 300 ? var1.getErrorStream() : var1.getInputStream();
      if (var3 != null) {
         InputStreamReader var4 = new InputStreamReader(var3);
         BufferedReader var5 = new BufferedReader(var4);

         String var6;
         while((var6 = var5.readLine()) != null) {
            var2.append(var6);
         }

         var3.close();
      }

      this.field122 = var2.toString();
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-2139924065"
   )
   public int method297() {
      return this.field121;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-309548900"
   )
   public String method298() {
      return this.field122;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(IB)Lgh;",
      garbageValue = "96"
   )
   public static FloorUnderlayDefinition method304(int var0) {
      FloorUnderlayDefinition var1 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class283.FloorUnderlayDefinition_archive.takeFile(1, var0);
         var1 = new FloorUnderlayDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2), var0);
         }

         var1.postDecode();
         FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }
}
