import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("mq")
@Implements("ByteArrayPool")
public class ByteArrayPool {
    @ObfuscatedName("r")
    @ObfuscatedGetter(intValue = -1690986053)
    @Export("ByteArrayPool_smallCount")
    static int ByteArrayPool_smallCount;

    @ObfuscatedName("o")
    @ObfuscatedGetter(intValue = -2143429099)
    @Export("ByteArrayPool_mediumCount")
    static int ByteArrayPool_mediumCount;

    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = -1419473161)
    @Export("ByteArrayPool_largeCount")
    static int ByteArrayPool_largeCount;

    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = -853735569)
    static int field4072;

    @ObfuscatedName("v")
    @ObfuscatedGetter(intValue = 2007909183)
    static int field4073;

    @ObfuscatedName("a")
    @ObfuscatedGetter(intValue = -957572747)
    static int field4074;

    @ObfuscatedName("y")
    @ObfuscatedGetter(intValue = -816148267)
    static int field4071;

    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = -2026598395)
    static int field4076;

    @ObfuscatedName("h")
    @Export("ByteArrayPool_small")
    static byte[][] ByteArrayPool_small;

    @ObfuscatedName("q")
    @Export("ByteArrayPool_medium")
    static byte[][] ByteArrayPool_medium;

    @ObfuscatedName("x")
    @Export("ByteArrayPool_large")
    static byte[][] ByteArrayPool_large;

    @ObfuscatedName("p")
    static byte[][] field4080;

    @ObfuscatedName("n")
    @Export("ByteArrayPool_alternativeSizes")
    public static int[] ByteArrayPool_alternativeSizes;

    @ObfuscatedName("j")
    public static ArrayList field4083;

    @ObfuscatedName("ot")
    @ObfuscatedGetter(intValue = -908422523)
    @Export("widgetDragDuration")
    static int widgetDragDuration;

    static {
        ByteArrayPool_smallCount = 0;
        ByteArrayPool_mediumCount = 0;
        ByteArrayPool_largeCount = 0;
        field4072 = 0;
        field4073 = 1000;
        field4074 = 250;
        field4071 = 100;
        field4076 = 50;
        ByteArrayPool_small = new byte[1000][];
        ByteArrayPool_medium = new byte[250][];
        ByteArrayPool_large = new byte[100][];
        field4080 = new byte[50][];
        field4083 = new ArrayList();
        NetCache.method5677();
        new HashMap();
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(IZB)[B", garbageValue = "50")
    @Export("ByteArrayPool_getArrayBool")
    static synchronized byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
        byte[] var4;
        if (var0 != 100) {
            if (var0 < 100) {
            }
        } else if (ByteArrayPool_smallCount > 0) {
            var4 = ByteArrayPool_small[--ByteArrayPool_smallCount];
            ByteArrayPool_small[ByteArrayPool_smallCount] = null;
            return var4;
        }
        if (var0 != 5000) {
            if (var0 < 5000) {
            }
        } else if (ByteArrayPool_mediumCount > 0) {
            var4 = ByteArrayPool_medium[--ByteArrayPool_mediumCount];
            ByteArrayPool_medium[ByteArrayPool_mediumCount] = null;
            return var4;
        }
        if (var0 != 10000) {
            if (var0 < 10000) {
            }
        } else if (ByteArrayPool_largeCount > 0) {
            var4 = ByteArrayPool_large[--ByteArrayPool_largeCount];
            ByteArrayPool_large[ByteArrayPool_largeCount] = null;
            return var4;
        }
        if (var0 != 30000) {
            if (var0 < 30000) {
            }
        } else if (field4072 > 0) {
            var4 = field4080[--field4072];
            field4080[field4072] = null;
            return var4;
        }
        if (class113.ByteArrayPool_arrays != null) {
            for (int var2 = 0; var2 < ByteArrayPool.ByteArrayPool_alternativeSizes.length; ++var2) {
                if (ByteArrayPool_alternativeSizes[var2] != var0) {
                    if (var0 < ByteArrayPool_alternativeSizes[var2]) {
                    }
                } else if (ArchiveDiskActionHandler.ByteArrayPool_altSizeArrayCounts[var2] > 0) {
                    byte[] var3 = class113.ByteArrayPool_arrays[var2][--ArchiveDiskActionHandler.ByteArrayPool_altSizeArrayCounts[var2]];
                    class113.ByteArrayPool_arrays[var2][ArchiveDiskActionHandler.ByteArrayPool_altSizeArrayCounts[var2]] = null;
                    return var3;
                }
            }
        }
        return new byte[var0];
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lqy;")
    @Export("newRunException")
    public static RunException newRunException(Throwable var0, String var1) {
        RunException var2;
        if (var0 instanceof RunException) {
            var2 = ((RunException) (var0));
            var2.message = (var2.message + ' ') + var1;
        } else {
            var2 = new RunException(var0, var1);
        }
        return var2;
    }
}