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

@ObfuscatedName("i")
class class12 extends SSLSocket {
   @ObfuscatedName("h")
   Certificate[] field69;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lk;"
   )
   final class15 this$0;
   // $FF: synthetic field
   final TlsClientProtocol val$tlsClientProtocol;
   // $FF: synthetic field
   final String val$host;

   @ObfuscatedSignature(
      descriptor = "(Lk;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V"
   )
   class12(class15 var1, TlsClientProtocol var2, String var3) {
      this.this$0 = var1;
      this.val$tlsClientProtocol = var2;
      this.val$host = var3;
   }

   public void setUseClientMode(boolean var1) {
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

   public boolean getEnableSessionCreation() {
      return false;
   }

   public boolean getWantClientAuth() {
      return false;
   }

   public String[] getEnabledProtocols() {
      return null;
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

   public boolean getUseClientMode() {
      return false;
   }

   public void setEnableSessionCreation(boolean var1) {
   }

   public void setEnabledCipherSuites(String[] var1) {
   }

   public void startHandshake() throws IOException {
      this.val$tlsClientProtocol.connect(new class13(this));
   }

   public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
   }

   public void setWantClientAuth(boolean var1) {
   }

   public boolean getNeedClientAuth() {
      return false;
   }

   public String[] getEnabledCipherSuites() {
      return null;
   }

   public void setEnabledProtocols(String[] var1) {
   }

   public void setNeedClientAuth(boolean var1) {
   }

   public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
   }

   @ObfuscatedName("h")
   public static final void method157(long var0) {
      if (var0 > 0L) {
         if (var0 % 10L == 0L) {
            StructComposition.method3820(var0 - 1L);
            StructComposition.method3820(1L);
         } else {
            StructComposition.method3820(var0);
         }

      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;IB)Z",
      garbageValue = "-56"
   )
   static boolean method115(String var0, int var1) {
      return HealthBarUpdate.method2363(var0, var1, "openjs");
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)V",
      garbageValue = "90"
   )
   @Export("itemContainerSetItem")
   static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
      ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
      if (var4 == null) {
         var4 = new ItemContainer();
         ItemContainer.itemContainers.put(var4, (long)var0);
      }

      if (var4.ids.length <= var1) {
         int[] var5 = new int[var1 + 1];
         int[] var6 = new int[var1 + 1];

         int var7;
         for(var7 = 0; var7 < var4.ids.length; ++var7) {
            var5[var7] = var4.ids[var7];
            var6[var7] = var4.quantities[var7];
         }

         for(var7 = var4.ids.length; var7 < var1; ++var7) {
            var5[var7] = -1;
            var6[var7] = 0;
         }

         var4.ids = var5;
         var4.quantities = var6;
      }

      var4.ids[var1] = var2;
      var4.quantities[var1] = var3;
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "760477426"
   )
   static void method155(int var0) {
      if (var0 != Login.loginIndex) {
         Login.loginIndex = var0;
      }
   }
}
