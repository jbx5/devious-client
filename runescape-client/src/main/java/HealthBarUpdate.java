import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("lb")
	@ObfuscatedGetter(
		intValue = 377744389
	)
	@Export("cameraYaw")
	static int cameraYaw;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 117482167
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1379394921
	)
	@Export("health")
	int health;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 954587129
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1959792261
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1277563512"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "908009629"
	)
	public static void method2495(String var0, String var1, String var2, int var3, int var4) throws IOException {
		if (var1 != null && !var1.isEmpty()) {
			var0 = var0 + "-" + var1;
		}

		JagexCache.field2303 = var4;
		class189.cacheGamebuild = var3;

		try {
			class108.osName = System.getProperty("os.name");
		} catch (Exception var21) {
			class108.osName = "Unknown";
		}

		class184.osNameLowercase = class108.osName.toLowerCase();
		RouteStrategy.userHomeDirectory = null;

		try {
			RouteStrategy.userHomeDirectory = System.getProperty("jagex.userhome");
		} catch (Exception var20) {
		}

		if (RouteStrategy.userHomeDirectory == null) {
			try {
				RouteStrategy.userHomeDirectory = System.getProperty("user.home");
			} catch (Exception var19) {
			}
		}

		if (RouteStrategy.userHomeDirectory != null) {
			RouteStrategy.userHomeDirectory = RouteStrategy.userHomeDirectory + "/";
		}

		try {
			if (class184.osNameLowercase.startsWith("win")) {
				if (RouteStrategy.userHomeDirectory == null) {
					RouteStrategy.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (RouteStrategy.userHomeDirectory == null) {
				RouteStrategy.userHomeDirectory = System.getenv("HOME");
			}

			if (RouteStrategy.userHomeDirectory != null) {
				RouteStrategy.userHomeDirectory = RouteStrategy.userHomeDirectory + "/";
			}
		} catch (Exception var18) {
		}

		if (RouteStrategy.userHomeDirectory == null) {
			RouteStrategy.userHomeDirectory = "~/";
		}

		GrandExchangeOfferOwnWorldComparator.field494 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", RouteStrategy.userHomeDirectory, "/tmp/", ""};
		UserComparator3.field1458 = new String[]{".jagex_cache_" + class189.cacheGamebuild, ".file_store_" + class189.cacheGamebuild};
		int var13 = 0;

		label157:
		while (var13 < 4) {
			class404.cacheDir = MusicSong.method6303(var0, var2, var13);
			if (!class404.cacheDir.exists()) {
				class404.cacheDir.mkdirs();
			}

			File[] var6 = class404.cacheDir.listFiles();
			if (var6 == null) {
				break;
			}

			File[] var7 = var6;
			int var8 = 0;

			while (true) {
				if (var8 >= var7.length) {
					break label157;
				}

				File var9 = var7[var8];

				boolean var10;
				try {
					RandomAccessFile var11 = new RandomAccessFile(var9, "rw");
					int var12 = var11.read();
					var11.seek(0L);
					var11.write(var12);
					var11.seek(0L);
					var11.close();
					var10 = true;
				} catch (Exception var17) {
					var10 = false;
				}

				if (!var10) {
					++var13;
					break;
				}

				++var8;
			}
		}

		GrandExchangeOfferNameComparator.method7178(class404.cacheDir);

		try {
			File var5 = new File(RouteStrategy.userHomeDirectory, "random.dat");
			int var15;
			if (var5.exists()) {
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var5, "rw", 25L), 24, 0);
			} else {
				label138:
				for (int var14 = 0; var14 < UserComparator3.field1458.length; ++var14) {
					for (var15 = 0; var15 < GrandExchangeOfferOwnWorldComparator.field494.length; ++var15) {
						File var16 = new File(GrandExchangeOfferOwnWorldComparator.field494[var15] + UserComparator3.field1458[var14] + File.separatorChar + "random.dat");
						if (var16.exists()) {
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var16, "rw", 25L), 24, 0);
							break label138;
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) {
				RandomAccessFile var23 = new RandomAccessFile(var5, "rw");
				var15 = var23.read();
				var23.seek(0L);
				var23.write(var15);
				var23.seek(0L);
				var23.close();
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var5, "rw", 25L), 24, 0);
			}
		} catch (IOException var22) {
		}

		JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(class176.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
		JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(class176.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
		JagexCache.JagexCache_idxFiles = new BufferedFile[JagexCache.field2303];

		for (var13 = 0; var13 < JagexCache.field2303; ++var13) {
			JagexCache.JagexCache_idxFiles[var13] = new BufferedFile(new AccessFile(class176.getFile("main_file_cache.idx" + var13), "rw", 1048576L), 6000, 0);
		}

	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(Loz;Ljava/lang/String;B)V",
		garbageValue = "14"
	)
	static void method2491(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1);
		Client.archiveLoaders.add(var2);
		Client.field785 += var2.groupCount;
	}

	@ObfuscatedName("oh")
	@ObfuscatedSignature(
		descriptor = "(Lnn;IB)Ljava/lang/String;",
		garbageValue = "23"
	)
	static String method2496(Widget var0, int var1) {
		int var3 = class405.getWidgetFlags(var0);
		boolean var2 = (var3 >> var1 + 1 & 1) != 0;
		if (!var2 && var0.onOp == null) {
			return null;
		} else {
			return var0.actions != null && var0.actions.length > var1 && var0.actions[var1] != null && var0.actions[var1].trim().length() != 0 ? var0.actions[var1] : null;
		}
	}
}
