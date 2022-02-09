import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.TlsClientProtocol;
@ObfuscatedName("h")
class class12 extends SSLSocket {
    @ObfuscatedName("sk")
    @ObfuscatedGetter(intValue = -536820815)
    static int field75;

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Lkq;")
    @Export("ObjectDefinition_archive")
    static AbstractArchive ObjectDefinition_archive;

    @ObfuscatedName("n")
    @ObfuscatedGetter(intValue = 708907497)
    static int field74;

    @ObfuscatedName("c")
    Certificate[] field71;

    @ObfuscatedSignature(descriptor = "Lp;")
    final class15 this$0;

    final TlsClientProtocol val$tlsClientProtocol;

    final String val$host;

    @ObfuscatedSignature(descriptor = "(Lp;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V")
    class12(class15 var1, TlsClientProtocol var2, String var3) {
        this.this$0 = var1;
        this.val$tlsClientProtocol = var2;
        this.val$host = var3;
    }

    public String[] getSupportedCipherSuites() {
        return null;
    }

    public OutputStream getOutputStream() throws IOException {
        return this.val$tlsClientProtocol.getOutputStream();
    }

    public synchronized void close() throws IOException {
        this.val$tlsClientProtocol.close();
    }

    public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
    }

    public boolean getEnableSessionCreation() {
        return false;
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

    public boolean getUseClientMode() {
        return false;
    }

    public boolean getWantClientAuth() {
        return false;
    }

    public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
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

    public void setWantClientAuth(boolean var1) {
    }

    public SSLSession getSession() {
        return new class17(this);
    }

    public InputStream getInputStream() throws IOException {
        return this.val$tlsClientProtocol.getInputStream();
    }

    public String[] getSupportedProtocols() {
        return null;
    }

    public void setEnableSessionCreation(boolean var1) {
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/Float;Ljava/lang/Float;I)V", garbageValue = "-1321795090")
    static void method155(Float var0, Float var1) {
        if ((var0 + class112.field1386) < 1.3333334F) {
            float var2 = var0 - 2.0F;
            float var3 = var0 - 1.0F;
            float var4 = ((float) (Math.sqrt(((double) ((var2 * var2) - ((4.0F * var3) * var3))))));
            float var5 = (var4 + (-var2)) * 0.5F;
            if ((var1 + class112.field1386) > var5) {
                var1 = var5 - class112.field1386;
            } else {
                var5 = 0.5F * ((-var2) - var4);
                if (var1 < (class112.field1386 + var5)) {
                    var1 = var5 + class112.field1386;
                }
            }
        } else {
            var0 = 1.3333334F - class112.field1386;
            var1 = 0.33333334F - class112.field1386;
        }
    }

    @ObfuscatedName("p")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/String;IB)V", garbageValue = "-3")
    static final void method158(String var0, int var1) {
        PacketBufferNode var2 = class135.getPacketBufferNode(ClientPacket.field2907, Client.packetWriter.isaacCipher);
        var2.packetBuffer.writeByte(GrandExchangeEvents.stringCp1252NullTerminatedByteSize(var0) + 1);
        var2.packetBuffer.writeStringCp1252NullTerminated(var0);
        var2.packetBuffer.writeByte(var1);
        Client.packetWriter.addNode(var2);
    }

    @ObfuscatedName("km")
    @ObfuscatedSignature(descriptor = "(IIIILpt;Ljq;I)V", garbageValue = "-178422566")
    @Export("worldToMinimap")
    static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
        int var6 = (var3 * var3) + (var2 * var2);
        if ((var6 > 4225) && (var6 < 90000)) {
            int var7 = Client.camAngleY & 2047;
            int var8 = Rasterizer3D.Rasterizer3D_sine[var7];
            int var9 = Rasterizer3D.Rasterizer3D_cosine[var7];
            int var10 = ((var9 * var2) + (var3 * var8)) >> 16;
            int var11 = ((var3 * var9) - (var8 * var2)) >> 16;
            double var12 = Math.atan2(((double) (var10)), ((double) (var11)));
            int var14 = (var5.width / 2) - 25;
            int var15 = ((int) (Math.sin(var12) * ((double) (var14))));
            int var16 = ((int) (Math.cos(var12) * ((double) (var14))));
            byte var17 = 20;
            class78.redHintArrowSprite.method7801(var15 + ((var0 + (var5.width / 2)) - (var17 / 2)), ((((var5.height / 2) + var1) - (var17 / 2)) - var16) - 10, var17, var17, 15, 15, var12, 256);
        } else {
            Interpreter.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5);
        }
    }
}