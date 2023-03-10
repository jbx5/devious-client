import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("au")
class class17 implements SSLSession {
   @ObfuscatedName("am")
   static int[][][] field88;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Las;"
   )
   final class12 this$1;

   @ObfuscatedSignature(
      descriptor = "(Las;)V"
   )
   class17(class12 var1) {
      this.this$1 = var1;
   }

   public Object getValue(String var1) {
      throw new UnsupportedOperationException();
   }

   public String getCipherSuite() {
      throw new UnsupportedOperationException();
   }

   public long getCreationTime() {
      throw new UnsupportedOperationException();
   }

   public byte[] getId() {
      throw new UnsupportedOperationException();
   }

   public long getLastAccessedTime() {
      throw new UnsupportedOperationException();
   }

   public Certificate[] getLocalCertificates() {
      throw new UnsupportedOperationException();
   }

   public int getPacketBufferSize() {
      throw new UnsupportedOperationException();
   }

   public Principal getLocalPrincipal() {
      throw new UnsupportedOperationException();
   }

   public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
      return this.this$1.field61;
   }

   public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
      return null;
   }

   public int getPeerPort() {
      return 0;
   }

   public SSLSessionContext getSessionContext() {
      throw new UnsupportedOperationException();
   }

   public String getProtocol() {
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

   public void putValue(String var1, Object var2) {
      throw new UnsupportedOperationException();
   }

   public void removeValue(String var1) {
      throw new UnsupportedOperationException();
   }

   public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
      return null;
   }

   public int getApplicationBufferSize() {
      return 0;
   }

   public String getPeerHost() {
      throw new UnsupportedOperationException();
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-956668575"
   )
   @Export("getVarbit")
   public static int getVarbit(int var0) {
      VarbitComposition var2 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0);
      VarbitComposition var1;
      if (var2 != null) {
         var1 = var2;
      } else {
         byte[] var3 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0);
         var2 = new VarbitComposition();
         if (var3 != null) {
            var2.decode(new Buffer(var3));
         }

         VarbitComposition.VarbitDefinition_cached.put(var2, (long)var0);
         var1 = var2;
      }

      int var7 = var1.baseVar;
      int var4 = var1.startBit;
      int var5 = var1.endBit;
      int var6 = Varps.Varps_masks[var5 - var4];
      return Varps.Varps_main[var7] >> var4 & var6;
   }

   @ObfuscatedName("mh")
   @ObfuscatedSignature(
      descriptor = "(Lde;ZB)V",
      garbageValue = "-59"
   )
   @Export("closeInterface")
   static final void closeInterface(InterfaceParent var0, boolean var1) {
      int var2 = var0.group;
      int var3 = (int)var0.key;
      var0.remove();
      if (var1) {
         class289.method5486(var2);
      }

      class211.method4147(var2);
      Widget var4 = WorldMapSection1.getWidget(var3);
      if (var4 != null) {
         class69.invalidateWidget(var4);
      }

      if (Client.rootInterface != -1) {
         NPCComposition.runIntfCloseListeners(Client.rootInterface, 1);
      }

   }

   @ObfuscatedName("ng")
   @ObfuscatedSignature(
      descriptor = "(Lsy;II)V",
      garbageValue = "1277645659"
   )
   static void method255(Buffer var0, int var1) {
      byte[] var2 = var0.array;
      if (Client.randomDatData == null) {
         Client.randomDatData = new byte[24];
      }

      class380.writeRandomDat(var2, var1, Client.randomDatData, 0, 24);
      class70.method2049(var0, var1);
   }
}
