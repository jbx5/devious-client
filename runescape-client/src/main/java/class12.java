import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

@ObfuscatedName("as")
class class12 extends SSLSocket {
   @ObfuscatedName("dd")
   @ObfuscatedSignature(
      descriptor = "Lsp;"
   )
   @Export("worldSelectLeftSprite")
   static IndexedSprite worldSelectLeftSprite;
   @ObfuscatedName("gg")
   static String field63;
   @ObfuscatedName("jr")
   @Export("regions")
   static int[] regions;
   @ObfuscatedName("aj")
   Certificate[] field61;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Laz;"
   )
   final class15 this$0;
   // $FF: synthetic field
   final TlsClientProtocol val$tlsClientProtocol;
   // $FF: synthetic field
   final String val$host;

   @ObfuscatedSignature(
      descriptor = "(Laz;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V"
   )
   class12(class15 var1, TlsClientProtocol var2, String var3) {
      this.this$0 = var1;
      this.val$tlsClientProtocol = var2;
      this.val$host = var3;
   }

   public InputStream getInputStream() throws IOException {
      return this.val$tlsClientProtocol.getInputStream();
   }

   public OutputStream getOutputStream() throws IOException {
      return this.val$tlsClientProtocol.getOutputStream();
   }

   public synchronized void close() throws IOException {
      this.val$tlsClientProtocol.close();
   }

   public String[] getEnabledCipherSuites() {
      return null;
   }

   public boolean getNeedClientAuth() {
      return false;
   }

   public SSLSession getSession() {
      return new class17(this);
   }

   public String[] getSupportedProtocols() {
      return null;
   }

   public String[] getSupportedCipherSuites() {
      return null;
   }

   public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
   }

   public void setEnableSessionCreation(boolean var1) {
   }

   public void setEnabledCipherSuites(String[] var1) {
   }

   public void setEnabledProtocols(String[] var1) {
   }

   public void setNeedClientAuth(boolean var1) {
   }

   public void setWantClientAuth(boolean var1) {
   }

   public boolean getEnableSessionCreation() {
      return false;
   }

   public String[] getEnabledProtocols() {
      return null;
   }

   public boolean getUseClientMode() {
      return false;
   }

   public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
   }

   public boolean getWantClientAuth() {
      return false;
   }

   public void setUseClientMode(boolean var1) {
   }

   public void startHandshake() throws IOException {
      this.val$tlsClientProtocol.connect(new class13(this));
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-42"
   )
   static void method109() {
      Tiles.Tiles_minPlane = 99;
      Tiles.Tiles_underlays = new short[4][104][104];
      Tiles.Tiles_overlays = new short[4][104][104];
      class16.Tiles_shapes = new byte[4][104][104];
      Tiles.field997 = new byte[4][104][104];
      class17.field88 = new int[4][105][105];
      Decimator.Tiles_underlays2 = new byte[4][105][105];
      class306.field3445 = new int[105][105];
      Tiles.Tiles_hue = new int[104];
      class134.Tiles_saturation = new int[104];
      Language.Tiles_lightness = new int[104];
      TileItem.Tiles_hueMultiplier = new int[104];
      Interpreter.field840 = new int[104];
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
      garbageValue = "-2"
   )
   @Export("addChatMessage")
   static void addChatMessage(int var0, String var1, String var2, String var3) {
      ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0);
      if (var4 == null) {
         var4 = new ChatChannel();
         Messages.Messages_channels.put(var0, var4);
      }

      Message var5 = var4.addMessage(var0, var1, var2, var3);
      Messages.Messages_hashTable.put(var5, (long)var5.count);
      Messages.Messages_queue.add(var5);
      Client.chatCycle = Client.cycleCntr;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IIIZIZI)V",
      garbageValue = "675774745"
   )
   @Export("doWorldSorting")
   static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
      if (var0 < var1) {
         int var6 = (var0 + var1) / 2;
         int var7 = var0;
         World var8 = class260.World_worlds[var6];
         class260.World_worlds[var6] = class260.World_worlds[var1];
         class260.World_worlds[var1] = var8;

         for(int var9 = var0; var9 < var1; ++var9) {
            if (class60.method1161(class260.World_worlds[var9], var8, var2, var3, var4, var5) <= 0) {
               World var10 = class260.World_worlds[var9];
               class260.World_worlds[var9] = class260.World_worlds[var7];
               class260.World_worlds[var7++] = var10;
            }
         }

         class260.World_worlds[var1] = class260.World_worlds[var7];
         class260.World_worlds[var7] = var8;
         doWorldSorting(var0, var7 - 1, var2, var3, var4, var5);
         doWorldSorting(var7 + 1, var1, var2, var3, var4, var5);
      }

   }

   @ObfuscatedName("ly")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1142912299"
   )
   static final void method151(int var0) {
      var0 = Math.min(Math.max(var0, 0), 127);
      WorldMapSectionType.clientPreferences.method2443(var0);
   }
}
