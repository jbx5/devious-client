import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("t")
class class17 implements SSLSession {
   @ObfuscatedName("q")
   @Export("formattedOperatingSystemName")
   public static String formattedOperatingSystemName;
   @ObfuscatedName("ar")
   static String field95;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lp;"
   )
   final class12 this$1;

   @ObfuscatedSignature(
      descriptor = "(Lp;)V"
   )
   class17(class12 var1) {
      this.this$1 = var1;
   }

   public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
      return null;
   }

   public byte[] getId() {
      throw new UnsupportedOperationException();
   }

   public Certificate[] getLocalCertificates() {
      throw new UnsupportedOperationException();
   }

   public void putValue(String var1, Object var2) {
      throw new UnsupportedOperationException();
   }

   public int getPacketBufferSize() {
      throw new UnsupportedOperationException();
   }

   public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
      return this.this$1.field67;
   }

   public String getPeerHost() {
      throw new UnsupportedOperationException();
   }

   public int getPeerPort() {
      return 0;
   }

   public String getProtocol() {
      throw new UnsupportedOperationException();
   }

   public SSLSessionContext getSessionContext() {
      throw new UnsupportedOperationException();
   }

   public Object getValue(String var1) {
      throw new UnsupportedOperationException();
   }

   public String[] getValueNames() {
      throw new UnsupportedOperationException();
   }

   public void invalidate() {
      throw new UnsupportedOperationException();
   }

   public boolean isValid() {
      throw new UnsupportedOperationException();
   }

   public void removeValue(String var1) {
      throw new UnsupportedOperationException();
   }

   public long getLastAccessedTime() {
      throw new UnsupportedOperationException();
   }

   public long getCreationTime() {
      throw new UnsupportedOperationException();
   }

   public String getCipherSuite() {
      throw new UnsupportedOperationException();
   }

   public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
      return null;
   }

   public int getApplicationBufferSize() {
      return 0;
   }

   public Principal getLocalPrincipal() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Llg;I)V",
      garbageValue = "2002142302"
   )
   public static void method228(AbstractArchive var0) {
      VarcInt.VarcInt_archive = var0;
   }
}
