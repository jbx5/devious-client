import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("m")
class class17 implements SSLSession {
    @ObfuscatedName("t")
    @ObfuscatedSignature(descriptor = "Lih;")
    @Export("worldMapEvent")
    static WorldMapEvent worldMapEvent;

    @ObfuscatedSignature(descriptor = "Lh;")
    final class12 this$1;

    @ObfuscatedSignature(descriptor = "(Lh;)V")
    class17(class12 var1) {
        this.this$1 = var1;
    }

    public int getApplicationBufferSize() {
        return 0;
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

    public boolean isValid() {
        throw new UnsupportedOperationException();
    }

    public Principal getLocalPrincipal() {
        throw new UnsupportedOperationException();
    }

    public void removeValue(String var1) {
        throw new UnsupportedOperationException();
    }

    public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
        return null;
    }

    public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
        return this.this$1.field71;
    }

    public String getPeerHost() {
        throw new UnsupportedOperationException();
    }

    public int getPeerPort() {
        return 0;
    }

    public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
        return null;
    }

    public String getProtocol() {
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

    public void putValue(String var1, Object var2) {
        throw new UnsupportedOperationException();
    }

    public SSLSessionContext getSessionContext() {
        throw new UnsupportedOperationException();
    }

    public Certificate[] getLocalCertificates() {
        throw new UnsupportedOperationException();
    }

    public int getPacketBufferSize() {
        throw new UnsupportedOperationException();
    }

    @ObfuscatedName("fz")
    @ObfuscatedSignature(descriptor = "(S)V", garbageValue = "8045")
    static final void method258() {
        if (Client.logoutTimer > 0) {
            class133.logOut();
        } else {
            Client.timer.method6243();
            class111.updateGameState(40);
            JagexCache.field1699 = Client.packetWriter.getSocket();
            Client.packetWriter.removeSocket();
        }
    }

    @ObfuscatedName("gr")
    @ObfuscatedSignature(descriptor = "(Lcq;I)V", garbageValue = "-464852881")
    static final void method219(Actor var0) {
        var0.movementSequence = var0.idleSequence;
        if (var0.pathLength == 0) {
            var0.field1175 = 0;
        } else {
            if ((var0.sequence != (-1)) && (var0.sequenceDelay == 0)) {
                SequenceDefinition var1 = class78.SequenceDefinition_get(var0.sequence);
                if ((var0.field1176 > 0) && (var1.field2107 == 0)) {
                    ++var0.field1175;
                    return;
                }
                if ((var0.field1176 <= 0) && (var1.field2099 == 0)) {
                    ++var0.field1175;
                    return;
                }
            }
            int var10 = var0.x;
            int var2 = var0.y;
            int var3 = (var0.field1113 * 64) + (var0.pathX[var0.pathLength - 1] * 128);
            int var4 = (var0.field1113 * 64) + (var0.pathY[var0.pathLength - 1] * 128);
            if (var10 < var3) {
                if (var2 < var4) {
                    var0.orientation = 1280;
                } else if (var2 > var4) {
                    var0.orientation = 1792;
                } else {
                    var0.orientation = 1536;
                }
            } else if (var10 > var3) {
                if (var2 < var4) {
                    var0.orientation = 768;
                } else if (var2 > var4) {
                    var0.orientation = 256;
                } else {
                    var0.orientation = 512;
                }
            } else if (var2 < var4) {
                var0.orientation = 1024;
            } else if (var2 > var4) {
                var0.orientation = 0;
            }
            class185 var5 = var0.pathTraversed[var0.pathLength - 1];
            if (((((var3 - var10) <= 256) && ((var3 - var10) >= (-256))) && ((var4 - var2) <= 256)) && ((var4 - var2) >= (-256))) {
                int var6 = (var0.orientation - var0.rotation) & 2047;
                if (var6 > 1024) {
                    var6 -= 2048;
                }
                int var7 = var0.walkBackSequence;
                if ((var6 >= (-256)) && (var6 <= 256)) {
                    var7 = var0.walkSequence;
                } else if ((var6 >= 256) && (var6 < 768)) {
                    var7 = var0.walkRightSequence;
                } else if ((var6 >= (-768)) && (var6 <= (-256))) {
                    var7 = var0.walkLeftSequence;
                }
                if (var7 == (-1)) {
                    var7 = var0.walkSequence;
                }
                var0.movementSequence = var7;
                int var8 = 4;
                boolean var9 = true;
                if (var0 instanceof NPC) {
                    var9 = ((NPC) (var0)).definition.isClickable;
                }
                if (var9) {
                    if (((var0.orientation != var0.rotation) && (var0.targetIndex == (-1))) && (var0.field1170 != 0)) {
                        var8 = 2;
                    }
                    if (var0.pathLength > 2) {
                        var8 = 6;
                    }
                    if (var0.pathLength > 3) {
                        var8 = 8;
                    }
                    if ((var0.field1175 > 0) && (var0.pathLength > 1)) {
                        var8 = 8;
                        --var0.field1175;
                    }
                } else {
                    if (var0.pathLength > 1) {
                        var8 = 6;
                    }
                    if (var0.pathLength > 2) {
                        var8 = 8;
                    }
                    if ((var0.field1175 > 0) && (var0.pathLength > 1)) {
                        var8 = 8;
                        --var0.field1175;
                    }
                }
                if (var5 == class185.field2132) {
                    var8 <<= 1;
                } else if (var5 == class185.field2133) {
                    var8 >>= 1;
                }
                if (((var8 >= 8) && (var0.walkSequence == var0.movementSequence)) && (var0.runSequence != (-1))) {
                    var0.movementSequence = var0.runSequence;
                }
                if ((var10 != var3) || (var2 != var4)) {
                    if (var10 < var3) {
                        var0.x += var8;
                        if (var0.x > var3) {
                            var0.x = var3;
                        }
                    } else if (var10 > var3) {
                        var0.x -= var8;
                        if (var0.x < var3) {
                            var0.x = var3;
                        }
                    }
                    if (var2 < var4) {
                        var0.y += var8;
                        if (var0.y > var4) {
                            var0.y = var4;
                        }
                    } else if (var2 > var4) {
                        var0.y -= var8;
                        if (var0.y < var4) {
                            var0.y = var4;
                        }
                    }
                }
                if ((var3 == var0.x) && (var4 == var0.y)) {
                    --var0.pathLength;
                    if (var0.field1176 > 0) {
                        --var0.field1176;
                    }
                }
            } else {
                var0.x = var3;
                var0.y = var4;
                --var0.pathLength;
                if (var0.field1176 > 0) {
                    --var0.field1176;
                }
            }
        }
    }

    @ObfuscatedName("ik")
    @ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "0")
    static final boolean method247() {
        return Client.isMenuOpen;
    }
}