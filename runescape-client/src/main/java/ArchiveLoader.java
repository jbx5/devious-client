import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bw")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 
	-1959822029)

	@Export("musicTrackGroupId")
	public static int musicTrackGroupId;
	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 
	-1499561111)

	@Export("ItemDefinition_fileCount")
	public static int ItemDefinition_fileCount;
	@ObfuscatedName("ed")
	@ObfuscatedSignature(descriptor = 
	"Llu;")

	@Export("archive6")
	static Archive archive6;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(descriptor = 
	"Llu;")

	@Export("archive17")
	static Archive archive17;
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Llu;")

	@Export("archive")
	final Archive archive;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	-1918110489)

	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 
	276484209)

	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(descriptor = 
	"(Llu;Ljava/lang/String;)V")

	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0;
		this.archive = var1;
		this.groupCount = var1.getGroupCount();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"1138782971")

	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0;

		for (int var1 = 0; var1 < this.groupCount; ++var1) {
			if ((!this.archive.method5829(var1)) || this.archive.method5828(var1)) {
				++this.loadedCount;
			}
		}

		return this.loadedCount >= this.groupCount;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(B)[Lkh;", garbageValue = 
	"77")

	public static StudioGame[] method2076() {
		return new StudioGame[]{ StudioGame.oldscape, StudioGame.stellardawn, StudioGame.game4, StudioGame.runescape, StudioGame.game3, StudioGame.game5 };
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(IIILge;Lgf;Z[I[II)I", garbageValue = 
	"34153163")

	public static int method2075(int var0, int var1, int var2, RouteStrategy var3, CollisionMap var4, boolean var5, int[] var6, int[] var7) {
		int var9;
		for (int var8 = 0; var8 < 128; ++var8) {
			for (var9 = 0; var9 < 128; ++var9) {
				class194.directions[var8][var9] = 0;
				class194.distances[var8][var9] = 99999999;
			}
		}

		int var10;
		int var11;
		byte var13;
		int var14;
		int var15;
		int var17;
		int var19;
		int var20;
		int var21;
		boolean var28;
		int var30;
		int var31;
		int var33;
		if (var2 == 1) {
			var10 = var0;
			var11 = var1;
			byte var12 = 64;
			var13 = 64;
			var14 = var0 - var12;
			var15 = var1 - var13;
			class194.directions[var12][var13] = 99;
			class194.distances[var12][var13] = 0;
			byte var16 = 0;
			var17 = 0;
			class194.bufferX[var16] = var0;
			var33 = var16 + 1;
			class194.bufferY[var16] = var1;
			int[][] var18 = var4.flags;

			boolean var29;
			while (true) {
				if (var17 == var33) {
					VarpDefinition.field1819 = var10;
					class194.field2202 = var11;
					var29 = false;
					break;
				}

				var10 = class194.bufferX[var17];
				var11 = class194.bufferY[var17];
				var17 = (var17 + 1) & 4095;
				var30 = var10 - var14;
				var31 = var11 - var15;
				var19 = var10 - var4.xInset;
				var20 = var11 - var4.yInset;
				if (var3.hasArrived(1, var10, var11, var4)) {
					VarpDefinition.field1819 = var10;
					class194.field2202 = var11;
					var29 = true;
					break;
				}

				var21 = class194.distances[var30][var31] + 1;
				if (((var30 > 0) && (class194.directions[var30 - 1][var31] == 0)) && ((var18[var19 - 1][var20] & 19136776) == 0)) {
					class194.bufferX[var33] = var10 - 1;
					class194.bufferY[var33] = var11;
					var33 = (var33 + 1) & 4095;
					class194.directions[var30 - 1][var31] = 2;
					class194.distances[var30 - 1][var31] = var21;
				}

				if (((var30 < 127) && (class194.directions[var30 + 1][var31] == 0)) && ((var18[var19 + 1][var20] & 19136896) == 0)) {
					class194.bufferX[var33] = var10 + 1;
					class194.bufferY[var33] = var11;
					var33 = (var33 + 1) & 4095;
					class194.directions[var30 + 1][var31] = 8;
					class194.distances[var30 + 1][var31] = var21;
				}

				if (((var31 > 0) && (class194.directions[var30][var31 - 1] == 0)) && ((var18[var19][var20 - 1] & 19136770) == 0)) {
					class194.bufferX[var33] = var10;
					class194.bufferY[var33] = var11 - 1;
					var33 = (var33 + 1) & 4095;
					class194.directions[var30][var31 - 1] = 1;
					class194.distances[var30][var31 - 1] = var21;
				}

				if (((var31 < 127) && (class194.directions[var30][var31 + 1] == 0)) && ((var18[var19][var20 + 1] & 19136800) == 0)) {
					class194.bufferX[var33] = var10;
					class194.bufferY[var33] = var11 + 1;
					var33 = (var33 + 1) & 4095;
					class194.directions[var30][var31 + 1] = 4;
					class194.distances[var30][var31 + 1] = var21;
				}

				if ((((((var30 > 0) && (var31 > 0)) && (class194.directions[var30 - 1][var31 - 1] == 0)) && ((var18[var19 - 1][var20 - 1] & 19136782) == 0)) && ((var18[var19 - 1][var20] & 19136776) == 0)) && ((var18[var19][var20 - 1] & 19136770) == 0)) {
					class194.bufferX[var33] = var10 - 1;
					class194.bufferY[var33] = var11 - 1;
					var33 = (var33 + 1) & 4095;
					class194.directions[var30 - 1][var31 - 1] = 3;
					class194.distances[var30 - 1][var31 - 1] = var21;
				}

				if ((((((var30 < 127) && (var31 > 0)) && (class194.directions[var30 + 1][var31 - 1] == 0)) && ((var18[var19 + 1][var20 - 1] & 19136899) == 0)) && ((var18[var19 + 1][var20] & 19136896) == 0)) && ((var18[var19][var20 - 1] & 19136770) == 0)) {
					class194.bufferX[var33] = var10 + 1;
					class194.bufferY[var33] = var11 - 1;
					var33 = (var33 + 1) & 4095;
					class194.directions[var30 + 1][var31 - 1] = 9;
					class194.distances[var30 + 1][var31 - 1] = var21;
				}

				if ((((((var30 > 0) && (var31 < 127)) && (class194.directions[var30 - 1][var31 + 1] == 0)) && ((var18[var19 - 1][var20 + 1] & 19136824) == 0)) && ((var18[var19 - 1][var20] & 19136776) == 0)) && ((var18[var19][var20 + 1] & 19136800) == 0)) {
					class194.bufferX[var33] = var10 - 1;
					class194.bufferY[var33] = var11 + 1;
					var33 = (var33 + 1) & 4095;
					class194.directions[var30 - 1][var31 + 1] = 6;
					class194.distances[var30 - 1][var31 + 1] = var21;
				}

				if ((((((var30 < 127) && (var31 < 127)) && (class194.directions[var30 + 1][var31 + 1] == 0)) && ((var18[var19 + 1][var20 + 1] & 19136992) == 0)) && ((var18[var19 + 1][var20] & 19136896) == 0)) && ((var18[var19][var20 + 1] & 19136800) == 0)) {
					class194.bufferX[var33] = var10 + 1;
					class194.bufferY[var33] = var11 + 1;
					var33 = (var33 + 1) & 4095;
					class194.directions[var30 + 1][var31 + 1] = 12;
					class194.distances[var30 + 1][var31 + 1] = var21;
				}
			} 

			var28 = var29;
		} else if (var2 == 2) {
			var28 = class146.method3041(var0, var1, var3, var4);
		} else {
			var28 = class290.method5577(var0, var1, var2, var3, var4);
		}

		var9 = var0 - 64;
		var10 = var1 - 64;
		var11 = VarpDefinition.field1819;
		var30 = class194.field2202;
		if (!var28) {
			var31 = Integer.MAX_VALUE;
			var14 = Integer.MAX_VALUE;
			byte var32 = 10;
			var33 = var3.approxDestinationX;
			var17 = var3.approxDestinationY;
			int var27 = var3.approxDestinationSizeX;
			var19 = var3.approxDestinationSizeY;

			for (var20 = var33 - var32; var20 <= (var33 + var32); ++var20) {
				for (var21 = var17 - var32; var21 <= (var17 + var32); ++var21) {
					int var22 = var20 - var9;
					int var23 = var21 - var10;
					if (((((var22 >= 0) && (var23 >= 0)) && (var22 < 128)) && (var23 < 128)) && (class194.distances[var22][var23] < 100)) {
						int var24 = 0;
						if (var20 < var33) {
							var24 = var33 - var20;
						} else if (var20 > ((var33 + var27) - 1)) {
							var24 = var20 - ((var33 + var27) - 1);
						}

						int var25 = 0;
						if (var21 < var17) {
							var25 = var17 - var21;
						} else if (var21 > ((var17 + var19) - 1)) {
							var25 = var21 - ((var19 + var17) - 1);
						}

						int var26 = (var24 * var24) + (var25 * var25);
						if ((var26 < var31) || ((var26 == var31) && (class194.distances[var22][var23] < var14))) {
							var31 = var26;
							var14 = class194.distances[var22][var23];
							var11 = var20;
							var30 = var21;
						}
					}
				}
			}

			if (var31 == Integer.MAX_VALUE) {
				return -1;
			}
		}

		if ((var0 == var11) && (var30 == var1)) {
			var6[0] = var11;
			var7[0] = var30;
			return 0;
		} else {
			var13 = 0;
			class194.bufferX[var13] = var11;
			var31 = var13 + 1;
			class194.bufferY[var13] = var30;

			for (var14 = var15 = class194.directions[var11 - var9][var30 - var10]; (var0 != var11) || (var30 != var1); var14 = class194.directions[var11 - var9][var30 - var10]) {
				if (var14 != var15) {
					var15 = var14;
					class194.bufferX[var31] = var11;
					class194.bufferY[var31++] = var30;
				}

				if ((var14 & 2) != 0) {
					++var11;
				} else if ((var14 & 8) != 0) {
					--var11;
				}

				if ((var14 & 1) != 0) {
					++var30;
				} else if ((var14 & 4) != 0) {
					--var30;
				}
			}

			var33 = 0;

			while ((var31--) > 0) {
				var6[var33] = class194.bufferX[var31];
				var7[var33++] = class194.bufferY[var31];
				if (var33 >= var6.length) {
					break;
				}
			} 

			return var33;
		}
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(descriptor = 
	"(IB)Z", garbageValue = 
	"-59")

	static final boolean method2071(int var0) {
		if (var0 < 0) {
			return false;
		} else {
			int var1 = Client.menuOpcodes[var0];
			if (var1 >= 2000) {
				var1 -= 2000;
			}

			return var1 == 1007;
		}
	}
}