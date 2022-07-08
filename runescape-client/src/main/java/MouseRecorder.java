import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("cx")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("bu")
	@ObfuscatedGetter(intValue = 1484453343)
	static int field1064;

	@ObfuscatedName("c")
	@Export("isRunning")
	boolean isRunning;

	@ObfuscatedName("v")
	@Export("lock")
	Object lock;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -1641337251)
	@Export("index")
	int index;

	@ObfuscatedName("f")
	@Export("xs")
	int[] xs;

	@ObfuscatedName("j")
	@Export("ys")
	int[] ys;

	@ObfuscatedName("e")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true;
		this.lock = new Object();
		this.index = 0;
		this.xs = new int[500];
		this.ys = new int[500];
		this.millis = new long[500];
	}

	public void run() {
		for (; this.isRunning; DynamicObject.method1991(50L)) {
			synchronized(this.lock) {
				if (this.index < 500) {
					this.xs[this.index] = MouseHandler.MouseHandler_x;
					this.ys[this.index] = MouseHandler.MouseHandler_y;
					this.millis[this.index] = MouseHandler.MouseHandler_millis;
					++this.index;
				}
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "([Lbc;II[I[IB)V", garbageValue = "0")
	@Export("sortWorlds")
	static void sortWorlds(World[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) {
			int var5 = var1 - 1;
			int var6 = var2 + 1;
			int var7 = (var2 + var1) / 2;
			World var8 = var0[var7];
			var0[var7] = var0[var1];
			var0[var1] = var8;
			while (var5 < var6) {
				boolean var9 = true;
				int var10;
				int var11;
				int var12;
				do {
					--var6;
					for (var10 = 0; var10 < 4; ++var10) {
						if (var3[var10] == 2) {
							var11 = var0[var6].index;
							var12 = var8.index;
						} else if (var3[var10] == 1) {
							var11 = var0[var6].population;
							var12 = var8.population;
							if (var11 == -1 && var4[var10] == 1) {
								var11 = 2001;
							}
							if (var12 == -1 && var4[var10] == 1) {
								var12 = 2001;
							}
						} else if (var3[var10] == 3) {
							var11 = (var0[var6].isMembersOnly()) ? 1 : 0;
							var12 = (var8.isMembersOnly()) ? 1 : 0;
						} else {
							var11 = var0[var6].id;
							var12 = var8.id;
						}
						if (var12 != var11) {
							if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) {
								var9 = false;
							}
							break;
						}
						if (var10 == 3) {
							var9 = false;
						}
					}
				} while (var9 );
				var9 = true;
				do {
					++var5;
					for (var10 = 0; var10 < 4; ++var10) {
						if (var3[var10] == 2) {
							var11 = var0[var5].index;
							var12 = var8.index;
						} else if (var3[var10] == 1) {
							var11 = var0[var5].population;
							var12 = var8.population;
							if (var11 == -1 && var4[var10] == 1) {
								var11 = 2001;
							}
							if (var12 == -1 && var4[var10] == 1) {
								var12 = 2001;
							}
						} else if (var3[var10] == 3) {
							var11 = (var0[var5].isMembersOnly()) ? 1 : 0;
							var12 = (var8.isMembersOnly()) ? 1 : 0;
						} else {
							var11 = var0[var5].id;
							var12 = var8.id;
						}
						if (var12 != var11) {
							if ((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) {
								var9 = false;
							}
							break;
						}
						if (var10 == 3) {
							var9 = false;
						}
					}
				} while (var9 );
				if (var5 < var6) {
					World var13 = var0[var5];
					var0[var5] = var0[var6];
					var0[var6] = var13;
				}
			} 
			sortWorlds(var0, var1, var6, var3, var4);
			sortWorlds(var0, var6 + 1, var2, var3, var4);
		}
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "76")
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close();
		Projectile.method1961();
		class356.scene.clear();
		for (int var0 = 0; var0 < 4; ++var0) {
			Client.collisionMaps[var0].clear();
		}
		System.gc();
		class272.musicPlayerStatus = 1;
		class272.musicTrackArchive = null;
		class272.musicTrackGroupId = -1;
		class151.musicTrackFileId = -1;
		class272.musicTrackVolume = 0;
		class11.musicTrackBoolean = false;
		class272.pcmSampleLength = 2;
		Client.currentTrackGroupId = -1;
		Client.playingJingle = false;
		Decimator.method1018();
		HealthBarUpdate.updateGameState(10);
	}
}