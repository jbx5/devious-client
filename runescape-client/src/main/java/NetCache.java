import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ll")
@Implements("NetCache")
public class NetCache {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lok;"
   )
   @Export("NetCache_socket")
   public static AbstractSocket NetCache_socket;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1472801941
   )
   @Export("NetCache_loadTime")
   public static int NetCache_loadTime = 0;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lpr;"
   )
   @Export("NetCache_pendingPriorityWrites")
   public static NodeHashTable NetCache_pendingPriorityWrites = new NodeHashTable(4096);
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 774779403
   )
   @Export("NetCache_pendingPriorityWritesCount")
   public static int NetCache_pendingPriorityWritesCount = 0;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lpr;"
   )
   @Export("NetCache_pendingPriorityResponses")
   public static NodeHashTable NetCache_pendingPriorityResponses = new NodeHashTable(32);
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -422823653
   )
   @Export("NetCache_pendingPriorityResponsesCount")
   public static int NetCache_pendingPriorityResponsesCount = 0;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Lmp;"
   )
   @Export("NetCache_pendingWritesQueue")
   public static DualNodeDeque NetCache_pendingWritesQueue = new DualNodeDeque();
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lpr;"
   )
   @Export("NetCache_pendingWrites")
   public static NodeHashTable NetCache_pendingWrites = new NodeHashTable(4096);
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -401948435
   )
   @Export("NetCache_pendingWritesCount")
   public static int NetCache_pendingWritesCount = 0;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "Lpr;"
   )
   @Export("NetCache_pendingResponses")
   public static NodeHashTable NetCache_pendingResponses = new NodeHashTable(4096);
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -825952713
   )
   @Export("NetCache_pendingResponsesCount")
   public static int NetCache_pendingResponsesCount = 0;
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "Lqr;"
   )
   @Export("NetCache_responseHeaderBuffer")
   public static Buffer NetCache_responseHeaderBuffer = new Buffer(8);
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -603864155
   )
   public static int field4178 = 0;
   @ObfuscatedName("w")
   @Export("NetCache_crc")
   public static CRC32 NetCache_crc = new CRC32();
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "[Llx;"
   )
   @Export("NetCache_archives")
   public static Archive[] NetCache_archives = new Archive[256];
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 365191785
   )
   static int field4174 = -1;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 286622071
   )
   static int field4179 = 255;
   @ObfuscatedName("g")
   public static byte field4180 = 0;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1843499485
   )
   @Export("NetCache_crcMismatches")
   public static int NetCache_crcMismatches = 0;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -144751561
   )
   @Export("NetCache_ioExceptions")
   public static int NetCache_ioExceptions = 0;
   @ObfuscatedName("fm")
   @ObfuscatedSignature(
      descriptor = "Llx;"
   )
   @Export("archive18")
   static Archive archive18;
}
