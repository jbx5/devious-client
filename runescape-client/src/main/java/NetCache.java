import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nk")
@Implements("NetCache")
public class NetCache {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lpj;"
   )
   @Export("NetCache_socket")
   public static AbstractSocket NetCache_socket;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1180496763
   )
   @Export("NetCache_loadTime")
   public static int NetCache_loadTime = 0;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      longValue = -5798342046050268773L
   )
   public static long field4204;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lrh;"
   )
   @Export("NetCache_pendingPriorityWrites")
   public static NodeHashTable NetCache_pendingPriorityWrites = new NodeHashTable(4096);
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 73591553
   )
   @Export("NetCache_pendingPriorityWritesCount")
   public static int NetCache_pendingPriorityWritesCount = 0;
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lrh;"
   )
   @Export("NetCache_pendingPriorityResponses")
   public static NodeHashTable NetCache_pendingPriorityResponses = new NodeHashTable(32);
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 569947331
   )
   @Export("NetCache_pendingPriorityResponsesCount")
   public static int NetCache_pendingPriorityResponsesCount = 0;
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lnl;"
   )
   @Export("NetCache_pendingWritesQueue")
   public static DualNodeDeque NetCache_pendingWritesQueue = new DualNodeDeque();
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lrh;"
   )
   @Export("NetCache_pendingWrites")
   public static NodeHashTable NetCache_pendingWrites = new NodeHashTable(4096);
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 1074039989
   )
   @Export("NetCache_pendingWritesCount")
   public static int NetCache_pendingWritesCount = 0;
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "Lrh;"
   )
   @Export("NetCache_pendingResponses")
   public static NodeHashTable NetCache_pendingResponses = new NodeHashTable(4096);
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -1997263581
   )
   @Export("NetCache_pendingResponsesCount")
   public static int NetCache_pendingResponsesCount = 0;
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "Lsy;"
   )
   @Export("NetCache_responseHeaderBuffer")
   public static Buffer NetCache_responseHeaderBuffer = new Buffer(8);
   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "Lsy;"
   )
   @Export("NetCache_responseArchiveBuffer")
   public static Buffer NetCache_responseArchiveBuffer;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -1060120023
   )
   public static int field4216 = 0;
   @ObfuscatedName("ag")
   @Export("NetCache_crc")
   public static CRC32 NetCache_crc = new CRC32();
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "[Lmx;"
   )
   @Export("NetCache_archives")
   public static Archive[] NetCache_archives = new Archive[256];
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -886563131
   )
   static int field4219 = -1;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 82319179
   )
   static int field4220 = 255;
   @ObfuscatedName("aa")
   public static byte field4213 = 0;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 1034579133
   )
   @Export("NetCache_crcMismatches")
   public static int NetCache_crcMismatches = 0;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -744142975
   )
   @Export("NetCache_ioExceptions")
   public static int NetCache_ioExceptions = 0;

   @ObfuscatedName("ls")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1019053742"
   )
   static final int method6534() {
      float var0 = 200.0F * ((float)WorldMapSectionType.clientPreferences.method2438() - 0.5F);
      return 100 - Math.round(var0);
   }
}
