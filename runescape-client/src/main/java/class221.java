import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
public class class221 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1417616712"
	)
	public static int method4682(int var0, int var1) {
		return (-3 - var0 << 8) + var1; // L: 13
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "2110478291"
	)
	@Export("ByteArrayPool_release")
	public static synchronized void ByteArrayPool_release(byte[] var0) {
		if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field4251) { // L: 116
			ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0; // L: 117
		} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field4252) { // L: 120
			ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0; // L: 121
		} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field4253) { // L: 124
			ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0; // L: 125
		} else if (var0.length == 30000 && ByteArrayPool.field4250 < ByteArrayPool.field4254) { // L: 128
			ByteArrayPool.field4245[++ByteArrayPool.field4250 - 1] = var0; // L: 129
		} else {
			if (UrlRequest.ByteArrayPool_arrays != null) { // L: 132
				for (int var1 = 0; var1 < ArchiveDiskActionHandler.ByteArrayPool_alternativeSizes.length; ++var1) { // L: 133
					if (var0.length == ArchiveDiskActionHandler.ByteArrayPool_alternativeSizes[var1] && class137.ByteArrayPool_altSizeArrayCounts[var1] < UrlRequest.ByteArrayPool_arrays[var1].length) { // L: 134
						UrlRequest.ByteArrayPool_arrays[var1][class137.ByteArrayPool_altSizeArrayCounts[var1]++] = var0; // L: 135
						return; // L: 136
					}
				}
			}

		}
	} // L: 118 122 126 130 140

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lbo;B)V",
		garbageValue = "2"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) { // L: 1986
			Client.isMembersWorld = var0.isMembersOnly(); // L: 1987
			GrandExchangeOfferOwnWorldComparator.method1185(var0.isMembersOnly()); // L: 1988
		}

		if (var0.properties != Client.worldProperties) { // L: 1990
			Player.method2322(ChatChannel.archive8, var0.properties); // L: 1991
		}

		WorldMapLabelSize.worldHost = var0.host; // L: 1993
		Client.worldId = var0.id; // L: 1994
		Client.worldProperties = var0.properties; // L: 1995
		NPC.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000; // L: 1996
		TaskHandler.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000; // L: 1997
		BuddyRankComparator.currentPort = NPC.worldPort; // L: 1998
	} // L: 1999
}
