import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;
@ObfuscatedName("q")
class class13 extends DefaultTlsClient {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Lje;")
    @Export("huffman")
    static Huffman huffman;

    @ObfuscatedName("d")
    @ObfuscatedSignature(descriptor = "Leg;")
    static ClanChannel field78;

    @ObfuscatedSignature(descriptor = "Lh;")
    final class12 this$1;

    @ObfuscatedSignature(descriptor = "(Lh;)V")
    class13(class12 var1) {
        this.this$1 = var1;
    }

    public Hashtable getClientExtensions() throws IOException {
        Hashtable var1 = super.getClientExtensions();
        if (var1 == null) {
            var1 = new Hashtable();
        }
        byte[] var2 = this.this$1.val$host.getBytes();
        ByteArrayOutputStream var3 = new ByteArrayOutputStream();
        DataOutputStream var4 = new DataOutputStream(var3);
        var4.writeShort(var2.length + 3);
        var4.writeByte(0);
        var4.writeShort(var2.length);
        var4.write(var2);
        var4.close();
        var1.put(0, var3.toByteArray());
        return var1;
    }

    public TlsAuthentication getAuthentication() throws IOException {
        return new class11(this);
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(II)Z", garbageValue = "-670757670")
    @Export("loadInterface")
    public static boolean loadInterface(int var0) {
        if (class145.Widget_loadedInterfaces[var0]) {
            return true;
        } else if (!UserComparator6.Widget_archive.tryLoadGroup(var0)) {
            return false;
        } else {
            int var1 = UserComparator6.Widget_archive.getGroupFileCount(var0);
            if (var1 == 0) {
                class145.Widget_loadedInterfaces[var0] = true;
                return true;
            } else {
                if (Widget.Widget_interfaceComponents[var0] == null) {
                    Widget.Widget_interfaceComponents[var0] = new Widget[var1];
                }
                for (int var2 = 0; var2 < var1; ++var2) {
                    if (Widget.Widget_interfaceComponents[var0][var2] == null) {
                        byte[] var3 = UserComparator6.Widget_archive.takeFile(var0, var2);
                        if (var3 != null) {
                            Widget.Widget_interfaceComponents[var0][var2] = new Widget();
                            Widget.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16);
                            if (var3[0] == (-1)) {
                                Widget.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
                            } else {
                                Widget.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3));
                            }
                        }
                    }
                }
                class145.Widget_loadedInterfaces[var0] = true;
                return true;
            }
        }
    }
}