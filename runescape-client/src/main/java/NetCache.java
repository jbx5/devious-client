import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nx")
@Implements("NetCache")
public class NetCache {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lqz;"
   )
   @Export("NetCache_socket")
   public static AbstractSocket NetCache_socket;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 174086543
   )
   @Export("NetCache_loadTime")
   public static int NetCache_loadTime = 0;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lsh;"
   )
   @Export("NetCache_pendingPriorityWrites")
   public static NodeHashTable NetCache_pendingPriorityWrites = new NodeHashTable(4096);
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 1300900423
   )
   @Export("NetCache_pendingPriorityWritesCount")
   public static int NetCache_pendingPriorityWritesCount = 0;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lsh;"
   )
   @Export("NetCache_pendingPriorityResponses")
   public static NodeHashTable NetCache_pendingPriorityResponses = new NodeHashTable(32);
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1340654805
   )
   @Export("NetCache_pendingPriorityResponsesCount")
   public static int NetCache_pendingPriorityResponsesCount = 0;
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "Loi;"
   )
   @Export("NetCache_pendingWritesQueue")
   public static DualNodeDeque NetCache_pendingWritesQueue = new DualNodeDeque();
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "Lsh;"
   )
   @Export("NetCache_pendingWrites")
   static NodeHashTable NetCache_pendingWrites = new NodeHashTable(4096);
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1292993967
   )
   @Export("NetCache_pendingWritesCount")
   public static int NetCache_pendingWritesCount = 0;
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lsh;"
   )
   @Export("NetCache_pendingResponses")
   public static NodeHashTable NetCache_pendingResponses = new NodeHashTable(4096);
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -419999939
   )
   @Export("NetCache_pendingResponsesCount")
   public static int NetCache_pendingResponsesCount = 0;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Ltz;"
   )
   @Export("NetCache_responseHeaderBuffer")
   public static Buffer NetCache_responseHeaderBuffer = new Buffer(8);
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 313957591
   )
   public static int field4278 = 0;
   @ObfuscatedName("az")
   @Export("NetCache_crc")
   public static CRC32 NetCache_crc = new CRC32();
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "[Lny;"
   )
   @Export("NetCache_archives")
   public static Archive[] NetCache_archives = new Archive[256];
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1051503651
   )
   static int field4281 = -1;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1873899565
   )
   static int field4267 = 255;
   @ObfuscatedName("ay")
   public static byte field4282 = 0;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1077767189
   )
   @Export("NetCache_crcMismatches")
   public static int NetCache_crcMismatches = 0;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -135057883
   )
   @Export("NetCache_ioExceptions")
   public static int NetCache_ioExceptions = 0;
}
