import java.awt.datatransfer.Clipboard;
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

@ObfuscatedName("b")
class class12 extends SSLSocket {
   @ObfuscatedName("vg")
   @ObfuscatedSignature(
      descriptor = "Loi;"
   )
   @Export("masterDisk")
   static ArchiveDisk masterDisk;
   @ObfuscatedName("ez")
   @ObfuscatedSignature(
      descriptor = "Llm;"
   )
   @Export("archive12")
   static Archive archive12;
   @ObfuscatedName("f")
   Certificate[] field68;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lh;"
   )
   final class15 this$0;
   // $FF: synthetic field
   final TlsClientProtocol val$tlsClientProtocol;
   // $FF: synthetic field
   final String val$host;

   @ObfuscatedSignature(
      descriptor = "(Lh;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V"
   )
   class12(class15 var1, TlsClientProtocol var2, String var3) {
      this.this$0 = var1;
      this.val$tlsClientProtocol = var2;
      this.val$host = var3;
   }

   public InputStream getInputStream() throws IOException {
      return this.val$tlsClientProtocol.getInputStream();
   }

   public synchronized void close() throws IOException {
      this.val$tlsClientProtocol.close();
   }

   public OutputStream getOutputStream() throws IOException {
      return this.val$tlsClientProtocol.getOutputStream();
   }

   public String[] getEnabledCipherSuites() {
      return null;
   }

   public String[] getEnabledProtocols() {
      return null;
   }

   public boolean getNeedClientAuth() {
      return false;
   }

   public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
   }

   public String[] getSupportedProtocols() {
      return null;
   }

   public boolean getEnableSessionCreation() {
      return false;
   }

   public boolean getWantClientAuth() {
      return false;
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

   public void setUseClientMode(boolean var1) {
   }

   public void startHandshake() throws IOException {
      this.val$tlsClientProtocol.connect(new class13(this));
   }

   public String[] getSupportedCipherSuites() {
      return null;
   }

   public boolean getUseClientMode() {
      return false;
   }

   public void setWantClientAuth(boolean var1) {
   }

   public SSLSession getSession() {
      return new class17(this);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)V",
      garbageValue = "89"
   )
   static void method172(int var0, int var1, int var2, int var3) {
      for(ObjectSound var4 = (ObjectSound)ObjectSound.objectSounds.last(); var4 != null; var4 = (ObjectSound)ObjectSound.objectSounds.previous()) {
         if (var4.soundEffectId != -1 || var4.soundEffectIds != null) {
            int var5 = 0;
            if (var1 > var4.maxX * 16384) {
               var5 += var1 - var4.maxX * 16384;
            } else if (var1 < var4.x * 16384) {
               var5 += var4.x * 16384 - var1;
            }

            if (var2 > var4.maxY * 16384) {
               var5 += var2 - var4.maxY * 16384;
            } else if (var2 < var4.y * 16384) {
               var5 += var4.y * 16384 - var2;
            }

            if (var5 - 64 <= var4.field837 && PacketWriter.clientPreferences.method2499() != 0 && var0 == var4.plane) {
               var5 -= 64;
               if (var5 < 0) {
                  var5 = 0;
               }

               int var6 = (var4.field837 - var5) * PacketWriter.clientPreferences.method2499() / var4.field837;
               if (var4.stream1 == null) {
                  if (var4.soundEffectId >= 0) {
                     SoundEffect var7 = SoundEffect.readSoundEffect(DynamicObject.field1001, var4.soundEffectId, 0);
                     if (var7 != null) {
                        RawSound var8 = var7.toRawSound().resample(class257.decimator);
                        RawPcmStream var9 = RawPcmStream.createRawPcmStream(var8, 100, var6);
                        var9.setNumLoops(-1);
                        class209.pcmStreamMixer.addSubStream(var9);
                        var4.stream1 = var9;
                     }
                  }
               } else {
                  var4.stream1.method885(var6);
               }

               if (var4.stream2 == null) {
                  if (var4.soundEffectIds != null && (var4.field843 -= var3) <= 0) {
                     int var11 = (int)(Math.random() * (double)var4.soundEffectIds.length);
                     SoundEffect var12 = SoundEffect.readSoundEffect(DynamicObject.field1001, var4.soundEffectIds[var11], 0);
                     if (var12 != null) {
                        RawSound var13 = var12.toRawSound().resample(class257.decimator);
                        RawPcmStream var10 = RawPcmStream.createRawPcmStream(var13, 100, var6);
                        var10.setNumLoops(0);
                        class209.pcmStreamMixer.addSubStream(var10);
                        var4.stream2 = var10;
                        var4.field843 = var4.field845 + (int)(Math.random() * (double)(var4.field841 - var4.field845));
                     }
                  }
               } else {
                  var4.stream2.method885(var6);
                  if (!var4.stream2.hasNext()) {
                     var4.stream2 = null;
                  }
               }
            } else {
               if (var4.stream1 != null) {
                  class209.pcmStreamMixer.removeSubStream(var4.stream1);
                  var4.stream1 = null;
               }

               if (var4.stream2 != null) {
                  class209.pcmStreamMixer.removeSubStream(var4.stream2);
                  var4.stream2 = null;
               }
            }
         }
      }

   }

   @ObfuscatedName("fa")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1608124150"
   )
   static void method169() {
      Client.packetWriter.clearBuffer();
      Client.packetWriter.packetBuffer.offset = 0;
      Client.packetWriter.serverPacket = null;
      Client.packetWriter.field1405 = null;
      Client.packetWriter.field1401 = null;
      Client.packetWriter.field1402 = null;
      Client.packetWriter.serverPacketLength = 0;
      Client.packetWriter.field1398 = 0;
      Client.rebootTimer = 0;
      ScriptFrame.method1156();
      Client.minimapState = 0;
      Client.destinationX = 0;

      int var0;
      for(var0 = 0; var0 < 2048; ++var0) {
         Client.players[var0] = null;
      }

      class387.localPlayer = null;

      for(var0 = 0; var0 < Client.npcs.length; ++var0) {
         NPC var1 = Client.npcs[var0];
         if (var1 != null) {
            var1.targetIndex = -1;
            var1.false0 = false;
         }
      }

      class320.method6429();
      class246.updateGameState(30);

      for(var0 = 0; var0 < 100; ++var0) {
         Client.field725[var0] = true;
      }

      PacketBufferNode var2 = Renderable.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
      var2.packetBuffer.writeByte(Message.getWindowedMode());
      var2.packetBuffer.writeShort(GameEngine.canvasWidth);
      var2.packetBuffer.writeShort(class127.canvasHeight);
      Client.packetWriter.addNode(var2);
   }

   @ObfuscatedName("hr")
   @ObfuscatedSignature(
      descriptor = "(I)Lmo;",
      garbageValue = "1067755495"
   )
   public static NodeDeque method171() {
      return Client.scriptEvents;
   }

   @ObfuscatedName("my")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/awt/datatransfer/Clipboard;",
      garbageValue = "17"
   )
   public static Clipboard method170() {
      return Decimator.client.method502();
   }
}
