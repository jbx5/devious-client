import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
@Implements("NetCache")
public class NetCache {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lou;"
   )
   @Export("NetCache_socket")
   public static AbstractSocket NetCache_socket;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -38046757
   )
   @Export("NetCache_loadTime")
   public static int NetCache_loadTime = 0;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      longValue = -7487830085444458825L
   )
   public static long field4218;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lqp;"
   )
   @Export("NetCache_pendingPriorityWrites")
   public static NodeHashTable NetCache_pendingPriorityWrites = new NodeHashTable(4096);
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -912683751
   )
   @Export("NetCache_pendingPriorityWritesCount")
   public static int NetCache_pendingPriorityWritesCount = 0;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Lqp;"
   )
   @Export("NetCache_pendingPriorityResponses")
   public static NodeHashTable NetCache_pendingPriorityResponses = new NodeHashTable(32);
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1360562841
   )
   @Export("NetCache_pendingPriorityResponsesCount")
   public static int NetCache_pendingPriorityResponsesCount = 0;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "Lmd;"
   )
   @Export("NetCache_pendingWritesQueue")
   public static DualNodeDeque NetCache_pendingWritesQueue = new DualNodeDeque();
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "Lqp;"
   )
   @Export("NetCache_pendingWrites")
   public static NodeHashTable NetCache_pendingWrites = new NodeHashTable(4096);
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 767219283
   )
   @Export("NetCache_pendingWritesCount")
   public static int NetCache_pendingWritesCount = 0;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lqp;"
   )
   @Export("NetCache_pendingResponses")
   public static NodeHashTable NetCache_pendingResponses = new NodeHashTable(4096);
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -273303851
   )
   @Export("NetCache_pendingResponsesCount")
   public static int NetCache_pendingResponsesCount = 0;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lqy;"
   )
   @Export("NetCache_responseHeaderBuffer")
   public static Buffer NetCache_responseHeaderBuffer = new Buffer(8);
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1267001511
   )
   public static int field4216 = 0;
   @ObfuscatedName("l")
   @Export("NetCache_crc")
   static CRC32 NetCache_crc = new CRC32();
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "[Lln;"
   )
   @Export("NetCache_archives")
   static Archive[] NetCache_archives = new Archive[256];
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 608271417
   )
   static int field4236 = -1;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1995959275
   )
   static int field4217 = 255;
   @ObfuscatedName("y")
   public static byte field4232 = 0;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -436432309
   )
   @Export("NetCache_crcMismatches")
   public static int NetCache_crcMismatches = 0;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1247182669
   )
   @Export("NetCache_ioExceptions")
   public static int NetCache_ioExceptions = 0;

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lf;B)Lx;",
      garbageValue = "-35"
   )
   public static class3 method6566(class6 var0) {
      switch (var0.field16) {
         case 0:
            return new class0();
         default:
            throw new IllegalArgumentException();
      }
   }
}
