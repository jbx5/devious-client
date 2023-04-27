import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nl")
@Implements("NetCache")
public class NetCache {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lph;"
   )
   @Export("NetCache_socket")
   public static AbstractSocket NetCache_socket;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -942339237
   )
   @Export("NetCache_loadTime")
   public static int NetCache_loadTime = 0;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      longValue = -2114584129517998633L
   )
   public static long field4259;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lrc;"
   )
   @Export("NetCache_pendingPriorityWrites")
   public static NodeHashTable NetCache_pendingPriorityWrites = new NodeHashTable(4096);
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -1171541559
   )
   @Export("NetCache_pendingPriorityWritesCount")
   public static int NetCache_pendingPriorityWritesCount = 0;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lrc;"
   )
   @Export("NetCache_pendingPriorityResponses")
   public static NodeHashTable NetCache_pendingPriorityResponses = new NodeHashTable(32);
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1952694793
   )
   @Export("NetCache_pendingPriorityResponsesCount")
   public static int NetCache_pendingPriorityResponsesCount = 0;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lni;"
   )
   @Export("NetCache_pendingWritesQueue")
   public static DualNodeDeque NetCache_pendingWritesQueue = new DualNodeDeque();
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lrc;"
   )
   @Export("NetCache_pendingWrites")
   public static NodeHashTable NetCache_pendingWrites = new NodeHashTable(4096);
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -32010957
   )
   @Export("NetCache_pendingWritesCount")
   public static int NetCache_pendingWritesCount = 0;
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "Lrc;"
   )
   @Export("NetCache_pendingResponses")
   public static NodeHashTable NetCache_pendingResponses = new NodeHashTable(4096);
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1651605431
   )
   @Export("NetCache_pendingResponsesCount")
   public static int NetCache_pendingResponsesCount = 0;
   @ObfuscatedName("ax")
   static boolean field4247;
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "Lsg;"
   )
   @Export("NetCache_responseHeaderBuffer")
   public static Buffer NetCache_responseHeaderBuffer = new Buffer(8);
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "Lsg;"
   )
   @Export("NetCache_responseArchiveBuffer")
   public static Buffer NetCache_responseArchiveBuffer;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -1961769541
   )
   public static int field4253 = 0;
   @ObfuscatedName("am")
   @Export("NetCache_crc")
   static CRC32 NetCache_crc = new CRC32();
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "[Lnd;"
   )
   @Export("NetCache_archives")
   static Archive[] NetCache_archives = new Archive[256];
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 1097614811
   )
   static int field4238 = -1;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = 1745465359
   )
   static int field4257 = 255;
   @ObfuscatedName("ad")
   public static byte field4255 = 0;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 1551453085
   )
   @Export("NetCache_crcMismatches")
   public static int NetCache_crcMismatches = 0;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1386597723
   )
   @Export("NetCache_ioExceptions")
   public static int NetCache_ioExceptions = 0;

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1990174320"
   )
   @Export("getGcDuration")
   protected static int getGcDuration() {
      int var0 = 0;
      if (class291.garbageCollector == null || !class291.garbageCollector.isValid()) {
         try {
            Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

            while(var1.hasNext()) {
               GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
               if (var2.isValid()) {
                  class291.garbageCollector = var2;
                  GameEngine.garbageCollectorLastCheckTimeMs = -1L;
                  GameEngine.garbageCollectorLastCollectionTime = -1L;
               }
            }
         } catch (Throwable var11) {
         }
      }

      if (class291.garbageCollector != null) {
         long var9 = class96.method2634();
         long var3 = class291.garbageCollector.getCollectionTime();
         if (GameEngine.garbageCollectorLastCollectionTime != -1L) {
            long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime;
            long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs;
            if (var7 != 0L) {
               var0 = (int)(100L * var5 / var7);
            }
         }

         GameEngine.garbageCollectorLastCollectionTime = var3;
         GameEngine.garbageCollectorLastCheckTimeMs = var9;
      }

      return var0;
   }
}
