import java.io.File;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("aq")
	@Export("FileSystem_hasPermissions")
	static boolean FileSystem_hasPermissions;
	@ObfuscatedName("ad")
	@Export("FileSystem_cacheDir")
	static File FileSystem_cacheDir;
	@ObfuscatedName("ag")
	@Export("FileSystem_cacheFiles")
	static Hashtable FileSystem_cacheFiles;

	static {
		FileSystem_hasPermissions = false;
		FileSystem_cacheFiles = new Hashtable(16);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lde;[BIIIIIIIIIB)V",
		garbageValue = "14"
	)
	static final void method4224(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		CollisionMap[] var11 = var0.collisionMaps;
		int var13;
		if (var11 != null) {
			for (int var12 = 0; var12 < 8; ++var12) {
				for (var13 = 0; var13 < 8; ++var13) {
					if (var3 + var12 > 0 && var3 + var12 < var11[var2].flags.length && var13 + var4 > 0 && var13 + var4 < var11[var2].flags[var3 + var12].length) {
						int[] var10000 = var11[var2].flags[var3 + var12];
						var10000[var4 + var13] &= -1073741825;
					}
				}
			}
		}

		Buffer var25 = new Buffer(var1);

		for (var13 = 0; var13 < 4; ++var13) {
			for (int var14 = 0; var14 < 64; ++var14) {
				for (int var15 = 0; var15 < 64; ++var15) {
					if (var5 == var13 && var14 >= var6 && var14 < var6 + 8 && var15 >= var7 && var15 < var7 + 8) {
						int var16 = var3 + MusicPatchPcmStream.method6418(var14 & 7, var15 & 7, var8);
						int var19 = var14 & 7;
						int var20 = var15 & 7;
						int var21 = var8 & 3;
						int var18;
						if (var21 == 0) {
							var18 = var20;
						} else if (var21 == 1) {
							var18 = 7 - var19;
						} else if (var21 == 2) {
							var18 = 7 - var20;
						} else {
							var18 = var19;
						}

						int var22 = var18 + var4;
						int var23 = var3 + (var14 & 7) + var9;
						int var24 = var10 + (var15 & 7) + var4;
						WorldMapSection1.loadTerrain(var0, var25, var2, var16, var22, var23, var24, var8);
					} else {
						WorldMapSection1.loadTerrain(var0, var25, 0, -1, -1, 0, 0, 0);
					}
				}
			}
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIZIII)J",
		garbageValue = "690823104"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4, int var5) {
		long var6 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17 | ((long)var5 & 2047L) << 49;
		if (var3) {
			var6 |= 65536L;
		}

		return var6;
	}
}
