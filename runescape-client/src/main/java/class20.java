import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("a")
public class class20 {
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 720016323
   )
   @Export("musicTrackGroupId")
   public static int musicTrackGroupId;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 70424649
   )
   @Export("Interpreter_stringStackSize")
   static int Interpreter_stringStackSize;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -1209841967
   )
   static int field117;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Ljd;"
   )
   @Export("worldMapEvent")
   static WorldMapEvent worldMapEvent;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1330057679
   )
   final int field123;
   @ObfuscatedName("w")
   final Map field125;
   @ObfuscatedName("v")
   final String field115;

   class20(String var1) {
      this.field123 = 400;
      this.field125 = null;
      this.field115 = "";
   }

   class20(HttpURLConnection var1) throws IOException {
      this.field123 = var1.getResponseCode();
      var1.getResponseMessage();
      this.field125 = var1.getHeaderFields();
      StringBuilder var2 = new StringBuilder();
      InputStream var3 = this.field123 >= 300 ? var1.getErrorStream() : var1.getInputStream();
      if (var3 != null) {
         InputStreamReader var4 = new InputStreamReader(var3);
         BufferedReader var5 = new BufferedReader(var4);

         String var6;
         while((var6 = var5.readLine()) != null) {
            var2.append(var6);
         }

         var3.close();
      }

      this.field115 = var2.toString();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "1"
   )
   public int method300() {
      return this.field123;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/util/Map;",
      garbageValue = "63"
   )
   public Map method297() {
      return this.field125;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "-5"
   )
   public String method298() {
      return this.field115;
   }
}
