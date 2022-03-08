import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("ja")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
    @ObfuscatedName("k")
    @ObfuscatedGetter(intValue = -1534991819)
    @Export("canvasWidth")
    public static int canvasWidth;

    @ObfuscatedName("cd")
    @ObfuscatedSignature(descriptor = "Lpg;")
    @Export("worldSelectRightSprite")
    static IndexedSprite worldSelectRightSprite;

    @ObfuscatedName("c")
    @Export("directBuffer")
    ByteBuffer directBuffer;

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(I)[B", garbageValue = "1552068154")
    @Export("get")
    byte[] get() {
        byte[] var1 = new byte[this.directBuffer.capacity()];
        this.directBuffer.position(0);
        this.directBuffer.get(var1);
        return var1;
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "([BB)V", garbageValue = "46")
    @Export("set")
    public void set(byte[] var1) {
        this.directBuffer = ByteBuffer.allocateDirect(var1.length);
        this.directBuffer.position(0);
        this.directBuffer.put(var1);
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(I)J", garbageValue = "2011171655")
    public static synchronized final long getServerTime() {
        long var0 = System.currentTimeMillis();
        if (var0 < class261.field3087) {
            class261.field3083 += class261.field3087 - var0;
        }
        class261.field3087 = var0;
        return var0 + class261.field3083;
    }
}