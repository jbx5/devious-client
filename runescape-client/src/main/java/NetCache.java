import java.util.zip.CRC32;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("lr")
@Implements("NetCache")
public class NetCache {
	@ObfuscatedName("rr")
	@ObfuscatedSignature(descriptor = "Lec;")
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;

	@ObfuscatedName("ti")
	@ObfuscatedGetter(intValue = -1653527943)
	static int field4039;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = -1165629591)
	@Export("NetCache_loadTime")
	public static int NetCache_loadTime = 0;

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Lnc;")
	@Export("NetCache_socket")
	public static AbstractSocket NetCache_socket;

	@ObfuscatedName("w")
	@ObfuscatedGetter(longValue = 6088607561644097199L)
	public static long field4017;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lpa;")
	@Export("NetCache_pendingPriorityWrites")
	public static NodeHashTable NetCache_pendingPriorityWrites = new NodeHashTable(4096);

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -1247985289)
	@Export("NetCache_pendingPriorityWritesCount")
	public static int NetCache_pendingPriorityWritesCount = 0;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lpa;")
	@Export("NetCache_pendingPriorityResponses")
	public static NodeHashTable NetCache_pendingPriorityResponses = new NodeHashTable(32);

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 1405415599)
	@Export("NetCache_pendingPriorityResponsesCount")
	public static int NetCache_pendingPriorityResponsesCount = 0;

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "Llt;")
	@Export("NetCache_pendingWritesQueue")
	public static DualNodeDeque NetCache_pendingWritesQueue = new DualNodeDeque();

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lpa;")
	@Export("NetCache_pendingWrites")
	public static NodeHashTable NetCache_pendingWrites = new NodeHashTable(4096);

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 413706265)
	@Export("NetCache_pendingWritesCount")
	public static int NetCache_pendingWritesCount = 0;

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "Lpa;")
	@Export("NetCache_pendingResponses")
	public static NodeHashTable NetCache_pendingResponses = new NodeHashTable(4096);

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 222876107)
	@Export("NetCache_pendingResponsesCount")
	public static int NetCache_pendingResponsesCount = 0;

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "Lqr;")
	@Export("NetCache_responseHeaderBuffer")
	public static Buffer NetCache_responseHeaderBuffer = new Buffer(8);

	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 1938797)
	public static int field4028 = 0;

	@ObfuscatedName("p")
	@Export("NetCache_crc")
	static CRC32 NetCache_crc = new CRC32();

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "[Lln;")
	@Export("NetCache_archives")
	static Archive[] NetCache_archives = new Archive[256];

	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = 1057478507)
	static int field4031 = -1;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -1151493933)
	static int field4015 = 255;

	@ObfuscatedName("t")
	public static byte field4029 = 0;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 1534530293)
	@Export("NetCache_crcMismatches")
	public static int NetCache_crcMismatches = 0;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = -595359391)
	@Export("NetCache_ioExceptions")
	public static int NetCache_ioExceptions = 0;

	@ObfuscatedName("cf")
	@ObfuscatedSignature(descriptor = "[Lqe;")
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
}