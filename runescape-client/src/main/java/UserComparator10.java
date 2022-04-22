import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dp")
@Implements("UserComparator10")
public class UserComparator10 extends AbstractUserComparator {
	@ObfuscatedName("v")
	@Export("reversed")
	final boolean reversed;

	public UserComparator10(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lnf;Lnf;I)I", garbageValue = 
	"-1424673720")

	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if ((Client.worldId == var1.world) && (var2.world == Client.worldId)) {
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy(((Buddy) (var1)), ((Buddy) (var2)));
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"([BI)V", garbageValue = 
	"1465062374")

	@Export("ByteArrayPool_release")
	public static synchronized void ByteArrayPool_release(byte[] var0) {
		if ((var0.length == 100) && (ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field4159)) {
			ByteArrayPool.ByteArrayPool_small[(++ByteArrayPool.ByteArrayPool_smallCount) - 1] = var0;
		} else if ((var0.length == 5000) && (ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field4160)) {
			ByteArrayPool.ByteArrayPool_medium[(++ByteArrayPool.ByteArrayPool_mediumCount) - 1] = var0;
		} else if ((var0.length == 10000) && (ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field4161)) {
			ByteArrayPool.ByteArrayPool_large[(++ByteArrayPool.ByteArrayPool_largeCount) - 1] = var0;
		} else if ((var0.length == 30000) && (ByteArrayPool.field4163 < ByteArrayPool.field4152)) {
			ByteArrayPool.field4162[(++ByteArrayPool.field4163) - 1] = var0;
		} else 
		if (BoundaryObject.ByteArrayPool_arrays != null) {
			for (int var1 = 0; var1 < FloorOverlayDefinition.ByteArrayPool_alternativeSizes.length; ++var1) {
				if ((var0.length == FloorOverlayDefinition.ByteArrayPool_alternativeSizes[var1]) && (class128.ByteArrayPool_altSizeArrayCounts[var1] < BoundaryObject.ByteArrayPool_arrays[var1].length)) {
					BoundaryObject.ByteArrayPool_arrays[var1][class128.ByteArrayPool_altSizeArrayCounts[var1]++] = var0;
					return;
				}
			}
		}


	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1291930273")

	static void method2622() {
		ItemContainer.itemContainers = new NodeHashTable(32);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"(IB)Z", garbageValue = 
	"56")

	public static boolean method2629(int var0) {
		return ((var0 >> 31) & 1) != 0;
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(descriptor = 
	"(III)Lgt;", garbageValue = 
	"1713441982")

	static RouteStrategy method2623(int var0, int var1) {
		Client.field783.approxDestinationX = var0;
		Client.field783.approxDestinationY = var1;
		Client.field783.approxDestinationSizeX = 1;
		Client.field783.approxDestinationSizeY = 1;
		return Client.field783;
	}
}