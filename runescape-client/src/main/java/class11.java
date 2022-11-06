import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

@ObfuscatedName("s")
class class11 implements TlsAuthentication {
   @ObfuscatedName("tm")
   @ObfuscatedGetter(
      intValue = -960217088
   )
   static int field62;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Llg;"
   )
   @Export("ParamDefinition_archive")
   static AbstractArchive ParamDefinition_archive;
   @ObfuscatedName("iu")
   @ObfuscatedGetter(
      intValue = -1280417715
   )
   static int field64;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lb;"
   )
   final class13 this$2;

   @ObfuscatedSignature(
      descriptor = "(Lb;)V"
   )
   class11(class13 var1) {
      this.this$2 = var1;
   }

   public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
      return null;
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

         this.this$2.this$1.field67 = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0]));
      } catch (CertificateException var7) {
         throw new IOException(var7);
      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "1845295776"
   )
   static final void method101(String var0) {
      MouseHandler.addGameMessage(30, "", var0);
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "91255593"
   )
   static void method102() {
      GrandExchangeOfferOwnWorldComparator.method1171(24);
      MusicPatchNode2.setLoginResponseString("", "You were disconnected from the server.", "");
   }

   @ObfuscatedName("hy")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-91915795"
   )
   static final void method100() {
      for(Projectile var0 = (Projectile)Client.projectiles.last(); var0 != null; var0 = (Projectile)Client.projectiles.previous()) {
         if (var0.plane == ApproximateRouteStrategy.Client_plane && Client.cycle <= var0.cycleEnd) {
            if (Client.cycle >= var0.cycleStart) {
               if (var0.targetIndex > 0) {
                  NPC var1 = Client.npcs[var0.targetIndex - 1];
                  if (var1 != null && var1.x >= 0 && var1.x < 13312 && var1.y >= 0 && var1.y < 13312) {
                     var0.setDestination(var1.x, var1.y, class132.getTileHeight(var1.x, var1.y, var0.plane) - var0.endHeight, Client.cycle);
                  }
               }

               if (var0.targetIndex < 0) {
                  int var2 = -var0.targetIndex - 1;
                  Player var3;
                  if (var2 == Client.localPlayerIndex) {
                     var3 = class296.localPlayer;
                  } else {
                     var3 = Client.players[var2];
                  }

                  if (var3 != null && var3.x >= 0 && var3.x < 13312 && var3.y >= 0 && var3.y < 13312) {
                     var0.setDestination(var3.x, var3.y, class132.getTileHeight(var3.x, var3.y, var0.plane) - var0.endHeight, Client.cycle);
                  }
               }

               var0.advance(Client.graphicsCycle);
               class139.scene.drawEntity(ApproximateRouteStrategy.Client_plane, (int)var0.x, (int)var0.y, (int)var0.z, 60, var0, var0.yaw, -1L, false);
            }
         } else {
            var0.remove();
         }
      }

   }
}
