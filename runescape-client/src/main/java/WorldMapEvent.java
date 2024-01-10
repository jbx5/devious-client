import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 277157787
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILmu;Lmu;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1;
		this.coord1 = var2;
		this.coord2 = var3;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IZI)[B",
		garbageValue = "633780632"
	)
	@Export("ByteArrayPool_getArrayBool")
	public static byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		synchronized(ByteArrayPool.field4614) {
			byte[] var3;
			if ((var0 == 100 || var0 < 100 && var1) && ByteArrayPool.ByteArrayPool_smallCount > 0) {
				var3 = ByteArrayPool.ByteArrayPool_small[--ByteArrayPool.ByteArrayPool_smallCount];
				ByteArrayPool.ByteArrayPool_small[ByteArrayPool.ByteArrayPool_smallCount] = null;
				return var3;
			}

			if ((var0 == 5000 || var0 < 5000 && var1) && ByteArrayPool.ByteArrayPool_mediumCount > 0) {
				var3 = ByteArrayPool.ByteArrayPool_medium[--ByteArrayPool.ByteArrayPool_mediumCount];
				ByteArrayPool.ByteArrayPool_medium[ByteArrayPool.ByteArrayPool_mediumCount] = null;
				return var3;
			}

			if ((var0 == 10000 || var0 < 10000 && var1) && ByteArrayPool.ByteArrayPool_largeCount > 0) {
				var3 = ByteArrayPool.ByteArrayPool_large[--ByteArrayPool.ByteArrayPool_largeCount];
				ByteArrayPool.ByteArrayPool_large[ByteArrayPool.ByteArrayPool_largeCount] = null;
				return var3;
			}

			if ((var0 == 30000 || var0 < 30000 && var1) && ByteArrayPool.field4618 > 0) {
				var3 = ByteArrayPool.field4626[--ByteArrayPool.field4618];
				ByteArrayPool.field4626[ByteArrayPool.field4618] = null;
				return var3;
			}

			int var6;
			if (class155.ByteArrayPool_arrays != null) {
				for (var6 = 0; var6 < class208.ByteArrayPool_alternativeSizes.length; ++var6) {
					if ((class208.ByteArrayPool_alternativeSizes[var6] == var0 || var0 < class208.ByteArrayPool_alternativeSizes[var6] && var1) && FileSystem.ByteArrayPool_altSizeArrayCounts[var6] > 0) {
						byte[] var4 = class155.ByteArrayPool_arrays[var6][--FileSystem.ByteArrayPool_altSizeArrayCounts[var6]];
						class155.ByteArrayPool_arrays[var6][FileSystem.ByteArrayPool_altSizeArrayCounts[var6]] = null;
						return var4;
					}
				}
			}

			if (var1 && class208.ByteArrayPool_alternativeSizes != null) {
				for (var6 = 0; var6 < class208.ByteArrayPool_alternativeSizes.length; ++var6) {
					if (var0 <= class208.ByteArrayPool_alternativeSizes[var6] && FileSystem.ByteArrayPool_altSizeArrayCounts[var6] < class155.ByteArrayPool_arrays[var6].length) {
						return new byte[class208.ByteArrayPool_alternativeSizes[var6]];
					}
				}
			}
		}

		return new byte[var0];
	}
}
