import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.LinkedList;
import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

@ObfuscatedName("g")
class class11 implements TlsAuthentication {
   @ObfuscatedName("q")
   @Export("SpriteBuffer_spriteWidths")
   public static int[] SpriteBuffer_spriteWidths;
   @ObfuscatedName("r")
   @Export("soundSystemExecutor")
   static ScheduledExecutorService soundSystemExecutor;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lo;"
   )
   final class13 this$2;

   @ObfuscatedSignature(
      descriptor = "(Lo;)V"
   )
   class11(class13 var1) {
      this.this$2 = var1;
   }

   public void notifyServerCertificate(Certificate var1) throws IOException {
      try {
         CertificateFactory var2 = CertificateFactory.getInstance("X.509");
         LinkedList var3 = new LinkedList();
         org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList();

         for(int var5 = 0; var5 < var4.length; ++var5) {
            org.bouncycastle.asn1.x509.Certificate var6 = var4[var5];
            var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded())));
         }

         this.this$2.this$1.field69 = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0]));
      } catch (CertificateException var7) {
         throw new IOException(var7);
      }
   }

   public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
      return null;
   }

   @ObfuscatedName("jk")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIIIII)V",
      garbageValue = "-507085025"
   )
   static final void method105(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      PendingSpawn var10 = null;

      for(PendingSpawn var11 = (PendingSpawn)Client.pendingSpawns.last(); var11 != null; var11 = (PendingSpawn)Client.pendingSpawns.previous()) {
         if (var0 == var11.plane && var11.x == var1 && var2 == var11.y && var3 == var11.type) {
            var10 = var11;
            break;
         }
      }

      if (var10 == null) {
         var10 = new PendingSpawn();
         var10.plane = var0;
         var10.type = var3;
         var10.x = var1;
         var10.y = var2;
         UserComparator4.method2809(var10);
         Client.pendingSpawns.addFirst(var10);
      }

      var10.field1167 = var4;
      var10.field1169 = var5;
      var10.field1168 = var6;
      var10.delay = var8;
      var10.hitpoints = var9;
      var10.method2338(var7);
   }
}
