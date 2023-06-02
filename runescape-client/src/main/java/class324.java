import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ml")
public class class324 {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Let;"
   )
   UrlRequest field3526;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Ltm;"
   )
   SpritePixels field3527;

   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Lea;)V"
   )
   class324(String var1, UrlRequester var2) {
      try {
         this.field3526 = var2.request(new URL(var1));
      } catch (MalformedURLException var4) {
         this.field3526 = null;
      }

   }

   @ObfuscatedSignature(
      descriptor = "(Let;)V"
   )
   class324(UrlRequest var1) {
      this.field3526 = var1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)Ltm;",
      garbageValue = "-1022014310"
   )
   SpritePixels method6005() {
      if (this.field3527 == null && this.field3526 != null && this.field3526.isDone()) {
         if (this.field3526.getResponse() != null) {
            this.field3527 = Interpreter.method2032(this.field3526.getResponse());
         }

         this.field3526 = null;
      }

      return this.field3527;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ltz;Ljava/lang/String;B)I",
      garbageValue = "73"
   )
   public static int method6006(Buffer var0, String var1) {
      int var2 = var0.offset;
      byte[] var3 = class60.method1132(var1);
      var0.writeSmartByteShort(var3.length);
      var0.offset += class332.huffman.compress(var3, 0, var3.length, var0.array, var0.offset);
      return var0.offset - var2;
   }

   @ObfuscatedName("hm")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "2103724368"
   )
   @Export("doCheat")
   static final void doCheat(String var0) {
      if (var0.equalsIgnoreCase("toggleroof")) {
         class10.clientPreferences.method2489(!class10.clientPreferences.method2434());
         if (class10.clientPreferences.method2434()) {
            class59.addGameMessage(99, "", "Roofs are now all hidden");
         } else {
            class59.addGameMessage(99, "", "Roofs will only be removed selectively");
         }
      }

      if (var0.startsWith("zbuf")) {
         boolean var1 = TextureProvider.method4744(var0.substring(5).trim()) == 1;
         class347.client.method512(var1);
         Rasterizer3D.method4416(var1);
      }

      if (var0.equalsIgnoreCase("z")) {
         Client.renderSelf = !Client.renderSelf;
      }

      if (var0.equalsIgnoreCase("displayfps")) {
         class10.clientPreferences.method2439();
      }

      if (var0.equalsIgnoreCase("renderself")) {
         Client.field751 = !Client.field751;
      }

      if (var0.equalsIgnoreCase("mouseovertext")) {
         Client.showMouseOverText = !Client.showMouseOverText;
      }

      if (Client.staffModLevel >= 2) {
         if (var0.equalsIgnoreCase("errortest")) {
            throw new RuntimeException();
         }

         if (var0.equalsIgnoreCase("showcoord")) {
            ScriptFrame.worldMap.showCoord = !ScriptFrame.worldMap.showCoord;
         }

         if (var0.equalsIgnoreCase("fpson")) {
            class10.clientPreferences.method2438(true);
         }

         if (var0.equalsIgnoreCase("fpsoff")) {
            class10.clientPreferences.method2438(false);
         }

         if (var0.equalsIgnoreCase("gc")) {
            System.gc();
         }

         if (var0.equalsIgnoreCase("clientdrop")) {
            Interpreter.method2034();
         }
      }

      PacketBufferNode var2 = ObjectComposition.getPacketBufferNode(ClientPacket.DOCHEAT, Client.packetWriter.isaacCipher);
      var2.packetBuffer.writeByte(var0.length() + 1);
      var2.packetBuffer.writeStringCp1252NullTerminated(var0);
      Client.packetWriter.addNode(var2);
   }
}
