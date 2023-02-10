import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
@Implements("NetCache")
public class NetCache {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lov;"
   )
   @Export("NetCache_socket")
   public static AbstractSocket NetCache_socket;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1225337139
   )
   @Export("NetCache_loadTime")
   public static int NetCache_loadTime = 0;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      longValue = -4342758360730342265L
   )
   public static long field4252;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lqg;"
   )
   @Export("NetCache_pendingPriorityWrites")
   public static NodeHashTable NetCache_pendingPriorityWrites = new NodeHashTable(4096);
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1605236251
   )
   @Export("NetCache_pendingPriorityWritesCount")
   public static int NetCache_pendingPriorityWritesCount = 0;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lqg;"
   )
   @Export("NetCache_pendingPriorityResponses")
   public static NodeHashTable NetCache_pendingPriorityResponses = new NodeHashTable(32);
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 387570927
   )
   @Export("NetCache_pendingPriorityResponsesCount")
   public static int NetCache_pendingPriorityResponsesCount = 0;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lmy;"
   )
   @Export("NetCache_pendingWritesQueue")
   public static DualNodeDeque NetCache_pendingWritesQueue = new DualNodeDeque();
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "Lqg;"
   )
   @Export("NetCache_pendingWrites")
   public static NodeHashTable NetCache_pendingWrites = new NodeHashTable(4096);
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1554539859
   )
   @Export("NetCache_pendingWritesCount")
   public static int NetCache_pendingWritesCount = 0;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lqg;"
   )
   @Export("NetCache_pendingResponses")
   public static NodeHashTable NetCache_pendingResponses = new NodeHashTable(4096);
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 716176413
   )
   @Export("NetCache_pendingResponsesCount")
   public static int NetCache_pendingResponsesCount = 0;
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "Lrd;"
   )
   @Export("NetCache_responseHeaderBuffer")
   public static Buffer NetCache_responseHeaderBuffer = new Buffer(8);
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1174830923
   )
   public static int field4250 = 0;
   @ObfuscatedName("u")
   @Export("NetCache_crc")
   static CRC32 NetCache_crc = new CRC32();
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "[Llm;"
   )
   @Export("NetCache_archives")
   static Archive[] NetCache_archives = new Archive[256];
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -807870043
   )
   static int field4253 = -1;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1476697241
   )
   static int field4254 = 255;
   @ObfuscatedName("e")
   public static byte field4248 = 0;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 1060159647
   )
   @Export("NetCache_crcMismatches")
   public static int NetCache_crcMismatches = 0;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -1955974775
   )
   @Export("NetCache_ioExceptions")
   public static int NetCache_ioExceptions = 0;
   @ObfuscatedName("ey")
   @ObfuscatedSignature(
      descriptor = "Llm;"
   )
   @Export("archive9")
   static Archive archive9;
   @ObfuscatedName("fr")
   @Export("worldHost")
   static String worldHost;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;I)[B",
      garbageValue = "670848294"
   )
   public static byte[] method6642(CharSequence var0) {
      int var1 = var0.length();
      byte[] var2 = new byte[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if (var4 > 127) {
            var2[var3] = 63;
         } else {
            var2[var3] = (byte)var4;
         }
      }

      return var2;
   }
}
