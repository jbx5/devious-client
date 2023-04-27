import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
@Implements("UrlRequest")
public class UrlRequest {
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1340146847
   )
   static int field1407 = -1;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1513206085
   )
   static int field1406 = -2;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -808987209
   )
   public static int field1410;
   @ObfuscatedName("af")
   final URL field1408;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -349727197
   )
   volatile int field1405;
   @ObfuscatedName("au")
   @Export("response0")
   volatile byte[] response0;

   UrlRequest(URL var1) {
      this.field1405 = field1407;
      this.field1408 = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-54"
   )
   @Export("isDone")
   public boolean isDone() {
      return this.field1405 != field1407;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(B)[B",
      garbageValue = "76"
   )
   @Export("getResponse")
   public byte[] getResponse() {
      return this.response0;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "82"
   )
   public String method2866() {
      return this.field1408.toString();
   }

   @ObfuscatedName("ac")
   @Export("Rasterizer3D_brighten")
   static int Rasterizer3D_brighten(int var0, double var1) {
      double var3 = (double)(var0 >> 16) / 256.0;
      double var5 = (double)(var0 >> 8 & 255) / 256.0;
      double var7 = (double)(var0 & 255) / 256.0;
      var3 = Math.pow(var3, var1);
      var5 = Math.pow(var5, var1);
      var7 = Math.pow(var7, var1);
      int var9 = (int)(var3 * 256.0);
      int var10 = (int)(var5 * 256.0);
      int var11 = (int)(256.0 * var7);
      return var11 + (var10 << 8) + (var9 << 16);
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-560341895"
   )
   static void method2867() {
      class129.method3124(24);
      class205.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", "");
   }
}
