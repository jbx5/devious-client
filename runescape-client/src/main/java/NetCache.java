import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("kk")
@Implements("NetCache")
public class NetCache {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Lmg;")
    @Export("NetCache_socket")
    public static AbstractSocket NetCache_socket;

    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = 1923542721)
    @Export("NetCache_loadTime")
    public static int NetCache_loadTime;

    @ObfuscatedName("s")
    @ObfuscatedGetter(longValue = 2465787363820954015L)
    public static long field3911;

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "Loj;")
    @Export("NetCache_pendingPriorityWrites")
    public static NodeHashTable NetCache_pendingPriorityWrites;

    @ObfuscatedName("r")
    @ObfuscatedGetter(intValue = 1981872173)
    @Export("NetCache_pendingPriorityWritesCount")
    public static int NetCache_pendingPriorityWritesCount;

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "Loj;")
    @Export("NetCache_pendingPriorityResponses")
    public static NodeHashTable NetCache_pendingPriorityResponses;

    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = 765478121)
    @Export("NetCache_pendingPriorityResponsesCount")
    public static int NetCache_pendingPriorityResponsesCount;

    @ObfuscatedName("w")
    @ObfuscatedSignature(descriptor = "Llo;")
    @Export("NetCache_pendingWritesQueue")
    public static DualNodeDeque NetCache_pendingWritesQueue;

    @ObfuscatedName("v")
    @ObfuscatedSignature(descriptor = "Loj;")
    @Export("NetCache_pendingWrites")
    public static NodeHashTable NetCache_pendingWrites;

    @ObfuscatedName("a")
    @ObfuscatedGetter(intValue = -24512561)
    @Export("NetCache_pendingWritesCount")
    public static int NetCache_pendingWritesCount;

    @ObfuscatedName("y")
    @ObfuscatedSignature(descriptor = "Loj;")
    @Export("NetCache_pendingResponses")
    public static NodeHashTable NetCache_pendingResponses;

    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = -871525075)
    @Export("NetCache_pendingResponsesCount")
    public static int NetCache_pendingResponsesCount;

    @ObfuscatedName("h")
    public static boolean field3922;

    @ObfuscatedName("x")
    @ObfuscatedSignature(descriptor = "Lpi;")
    @Export("NetCache_responseHeaderBuffer")
    public static Buffer NetCache_responseHeaderBuffer;

    @ObfuscatedName("p")
    @ObfuscatedSignature(descriptor = "Lpi;")
    @Export("NetCache_responseArchiveBuffer")
    public static Buffer NetCache_responseArchiveBuffer;

    @ObfuscatedName("n")
    @ObfuscatedGetter(intValue = 373280809)
    public static int field3926;

    @ObfuscatedName("d")
    @Export("NetCache_crc")
    public static CRC32 NetCache_crc;

    @ObfuscatedName("f")
    @ObfuscatedSignature(descriptor = "[Lkz;")
    @Export("NetCache_archives")
    public static Archive[] NetCache_archives;

    @ObfuscatedName("g")
    public static byte field3929;

    @ObfuscatedName("t")
    @ObfuscatedGetter(intValue = -1163414559)
    @Export("NetCache_crcMismatches")
    public static int NetCache_crcMismatches;

    @ObfuscatedName("k")
    @ObfuscatedGetter(intValue = 628378143)
    @Export("NetCache_ioExceptions")
    public static int NetCache_ioExceptions;

    static {
        NetCache_loadTime = 0;
        NetCache_pendingPriorityWrites = new NodeHashTable(4096);
        NetCache_pendingPriorityWritesCount = 0;
        NetCache_pendingPriorityResponses = new NodeHashTable(32);
        NetCache_pendingPriorityResponsesCount = 0;
        NetCache_pendingWritesQueue = new DualNodeDeque();
        NetCache_pendingWrites = new NodeHashTable(4096);
        NetCache_pendingWritesCount = 0;
        NetCache_pendingResponses = new NodeHashTable(4096);
        NetCache_pendingResponsesCount = 0;
        NetCache_responseHeaderBuffer = new Buffer(8);
        field3926 = 0;
        NetCache_crc = new CRC32();
        NetCache_archives = new Archive[256];
        field3929 = 0;
        NetCache_crcMismatches = 0;
        NetCache_ioExceptions = 0;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "380033529")
    public static void method5677() {
        ByteArrayPool.field4083.clear();
        ByteArrayPool.field4083.add(100);
        ByteArrayPool.field4083.add(5000);
        ByteArrayPool.field4083.add(10000);
        ByteArrayPool.field4083.add(30000);
    }

    @ObfuscatedName("jk")
    @ObfuscatedSignature(descriptor = "(Ljz;III)V", garbageValue = "1958547074")
    @Export("alignWidgetPosition")
    static void alignWidgetPosition(Widget var0, int var1, int var2) {
        if (var0.xAlignment == 0) {
            var0.x = var0.rawX;
        } else if (var0.xAlignment == 1) {
            var0.x = var0.rawX + ((var1 - var0.width) / 2);
        } else if (var0.xAlignment == 2) {
            var0.x = (var1 - var0.width) - var0.rawX;
        } else if (var0.xAlignment == 3) {
            var0.x = (var0.rawX * var1) >> 14;
        } else if (var0.xAlignment == 4) {
            var0.x = ((var0.rawX * var1) >> 14) + ((var1 - var0.width) / 2);
        } else {
            var0.x = (var1 - var0.width) - ((var0.rawX * var1) >> 14);
        }
        if (var0.yAlignment == 0) {
            var0.y = var0.rawY;
        } else if (var0.yAlignment == 1) {
            var0.y = ((var2 - var0.height) / 2) + var0.rawY;
        } else if (var0.yAlignment == 2) {
            var0.y = (var2 - var0.height) - var0.rawY;
        } else if (var0.yAlignment == 3) {
            var0.y = (var2 * var0.rawY) >> 14;
        } else if (var0.yAlignment == 4) {
            var0.y = ((var2 * var0.rawY) >> 14) + ((var2 - var0.height) / 2);
        } else {
            var0.y = (var2 - var0.height) - ((var2 * var0.rawY) >> 14);
        }
    }
}