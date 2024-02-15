import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	@Export("scrollBarSprites")
	static IndexedSprite[] scrollBarSprites;
	@ObfuscatedName("aq")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -98830189
	)
	@Export("world")
	public int world;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lvn;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IZI)[B",
		garbageValue = "1398041784"
	)
	@Export("ByteArrayPool_getArrayBool")
	public static byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		synchronized(ByteArrayPool.field4643) {
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

			if ((var0 == 30000 || var0 < 30000 && var1) && ByteArrayPool.field4650 > 0) {
				var3 = ByteArrayPool.field4658[--ByteArrayPool.field4650];
				ByteArrayPool.field4658[ByteArrayPool.field4650] = null;
				return var3;
			}

			int var6;
			if (Varcs.ByteArrayPool_arrays != null) {
				for (var6 = 0; var6 < ByteArrayPool.ByteArrayPool_alternativeSizes.length; ++var6) {
					if ((ByteArrayPool.ByteArrayPool_alternativeSizes[var6] == var0 || var0 < ByteArrayPool.ByteArrayPool_alternativeSizes[var6] && var1) && class130.ByteArrayPool_altSizeArrayCounts[var6] > 0) {
						byte[] var4 = Varcs.ByteArrayPool_arrays[var6][--class130.ByteArrayPool_altSizeArrayCounts[var6]];
						Varcs.ByteArrayPool_arrays[var6][class130.ByteArrayPool_altSizeArrayCounts[var6]] = null;
						return var4;
					}
				}
			}

			if (var1 && ByteArrayPool.ByteArrayPool_alternativeSizes != null) {
				for (var6 = 0; var6 < ByteArrayPool.ByteArrayPool_alternativeSizes.length; ++var6) {
					if (var0 <= ByteArrayPool.ByteArrayPool_alternativeSizes[var6] && class130.ByteArrayPool_altSizeArrayCounts[var6] < Varcs.ByteArrayPool_arrays[var6].length) {
						return new byte[ByteArrayPool.ByteArrayPool_alternativeSizes[var6]];
					}
				}
			}
		}

		return new byte[var0];
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1231060837"
	)
	@Export("ByteArrayPool_release")
	public static void ByteArrayPool_release(byte[] var0) {
		synchronized(ByteArrayPool.field4643) {
			if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field4651) {
				ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0;
			} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field4652) {
				ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0;
			} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field4653) {
				ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0;
			} else if (var0.length == 30000 && ByteArrayPool.field4650 < ByteArrayPool.field4654) {
				ByteArrayPool.field4658[++ByteArrayPool.field4650 - 1] = var0;
			} else {
				if (Varcs.ByteArrayPool_arrays != null) {
					for (int var2 = 0; var2 < ByteArrayPool.ByteArrayPool_alternativeSizes.length; ++var2) {
						if (var0.length == ByteArrayPool.ByteArrayPool_alternativeSizes[var2] && class130.ByteArrayPool_altSizeArrayCounts[var2] < Varcs.ByteArrayPool_arrays[var2].length) {
							Varcs.ByteArrayPool_arrays[var2][class130.ByteArrayPool_altSizeArrayCounts[var2]++] = var0;
							return;
						}
					}
				}

			}
		}
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1597695959"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
			int var3 = class272.getTileHeight(var0, var1, class473.Client_plane) - var2;
			var0 -= ClanMate.cameraX;
			var3 -= AsyncHttpResponse.cameraY;
			var1 -= class317.cameraZ;
			int var4 = Rasterizer3D.Rasterizer3D_sine[FriendSystem.cameraPitch];
			int var5 = Rasterizer3D.Rasterizer3D_cosine[FriendSystem.cameraPitch];
			int var6 = Rasterizer3D.Rasterizer3D_sine[Script.cameraYaw];
			int var7 = Rasterizer3D.Rasterizer3D_cosine[Script.cameraYaw];
			int var8 = var6 * var1 + var0 * var7 >> 16;
			var1 = var7 * var1 - var0 * var6 >> 16;
			var0 = var8;
			var8 = var3 * var5 - var4 * var1 >> 16;
			var1 = var5 * var1 + var3 * var4 >> 16;
			if (var1 >= 50) {
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2;
				Client.viewportTempY = Client.viewportHeight / 2 + var8 * Client.viewportZoom / var1;
			} else {
				Client.viewportTempX = -1;
				Client.viewportTempY = -1;
			}

		} else {
			Client.viewportTempX = -1;
			Client.viewportTempY = -1;
		}
	}
}
