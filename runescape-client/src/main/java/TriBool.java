import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ni")
@Implements("TriBool")
public class TriBool {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lni;")

	@Export("TriBool_unknown")
	public static final TriBool TriBool_unknown;
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Lni;")

	@Export("TriBool_true")
	public static final TriBool TriBool_true;
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Lni;")

	@Export("TriBool_false")
	public static final TriBool TriBool_false;
	static 
	{
		TriBool_unknown = new TriBool();
		TriBool_true = new TriBool();
		TriBool_false = new TriBool();
	}

	TriBool() {
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(Llu;IIIBZI)V", garbageValue = 
	"1922844254")

	@Export("requestNetFile")
	static void requestNetFile(Archive var0, int var1, int var2, int var3, byte var4, boolean var5) {
		long var6 = ((long) ((var1 << 16) + var2));
		NetFileRequest var8 = ((NetFileRequest) (NetCache.NetCache_pendingPriorityWrites.get(var6)));
		if (var8 == null) {
			var8 = ((NetFileRequest) (NetCache.NetCache_pendingPriorityResponses.get(var6)));
			if (var8 == null) {
				var8 = ((NetFileRequest) (NetCache.NetCache_pendingWrites.get(var6)));
				if (var8 != null) {
					if (var5) {
						var8.removeDual();
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6);
						--NetCache.NetCache_pendingWritesCount;
						++NetCache.NetCache_pendingPriorityWritesCount;
					}

				} else {
					if (!var5) {
						var8 = ((NetFileRequest) (NetCache.NetCache_pendingResponses.get(var6)));
						if (var8 != null) {
							return;
						}
					}

					var8 = new NetFileRequest();
					var8.archive = var0;
					var8.crc = var3;
					var8.padding = var4;
					if (var5) {
						NetCache.NetCache_pendingPriorityWrites.put(var8, var6);
						++NetCache.NetCache_pendingPriorityWritesCount;
					} else {
						NetCache.NetCache_pendingWritesQueue.addFirst(var8);
						NetCache.NetCache_pendingWrites.put(var8, var6);
						++NetCache.NetCache_pendingWritesCount;
					}

				}
			}
		}
	}
}