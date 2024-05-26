import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
public class class95 {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "-943240884"
	)
	public static void method2410(String var0, String var1, String var2, int var3, int var4) throws IOException {
		if (var1 != null && !var1.isEmpty()) {
			var0 = var0 + "-" + var1;
		}

		ModelData0.field2994 = var4;
		JagexCache.cacheGamebuild = var3;

		try {
			class154.osName = System.getProperty("os.name");
		} catch (Exception var17) {
			class154.osName = "Unknown";
		}

		Login.osNameLowercase = class154.osName.toLowerCase();
		ScriptEvent.userHomeDirectory = null;

		try {
			ScriptEvent.userHomeDirectory = System.getProperty("jagex.userhome");
		} catch (Exception var16) {
		}

		if (ScriptEvent.userHomeDirectory == null) {
			try {
				ScriptEvent.userHomeDirectory = System.getProperty("user.home");
			} catch (Exception var15) {
			}
		}

		if (ScriptEvent.userHomeDirectory != null) {
			ScriptEvent.userHomeDirectory = ScriptEvent.userHomeDirectory + "/";
		}

		try {
			if (Login.osNameLowercase.startsWith("win")) {
				if (ScriptEvent.userHomeDirectory == null) {
					ScriptEvent.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (ScriptEvent.userHomeDirectory == null) {
				ScriptEvent.userHomeDirectory = System.getenv("HOME");
			}

			if (ScriptEvent.userHomeDirectory != null) {
				ScriptEvent.userHomeDirectory = ScriptEvent.userHomeDirectory + "/";
			}
		} catch (Exception var14) {
		}

		if (ScriptEvent.userHomeDirectory == null) {
			ScriptEvent.userHomeDirectory = "~/";
		}

		class165.field1815 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", ScriptEvent.userHomeDirectory, "/tmp/", ""};
		Script.field1016 = new String[]{".jagex_cache_" + JagexCache.cacheGamebuild, ".file_store_" + JagexCache.cacheGamebuild};
		int var10 = 0;

		label146:
		while (var10 < 4) {
			class7.cacheDir = class510.method9055(var0, var2, var10);
			if (!class7.cacheDir.exists()) {
				class7.cacheDir.mkdirs();
			}

			File[] var6 = class7.cacheDir.listFiles();
			if (var6 == null) {
				break;
			}

			File[] var7 = var6;
			int var8 = 0;

			while (true) {
				if (var8 >= var7.length) {
					break label146;
				}

				File var9 = var7[var8];
				if (!DelayFadeTask.method8280(var9, false)) {
					++var10;
					break;
				}

				++var8;
			}
		}

		Bounds.method7788(class7.cacheDir);

		try {
			File var5 = new File(ScriptEvent.userHomeDirectory, "random.dat");
			int var12;
			if (var5.exists()) {
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var5, "rw", 25L), 24, 0);
			} else {
				label128:
				for (int var11 = 0; var11 < Script.field1016.length; ++var11) {
					for (var12 = 0; var12 < class165.field1815.length; ++var12) {
						File var13 = new File(class165.field1815[var12] + Script.field1016[var11] + File.separatorChar + "random.dat");
						if (var13.exists()) {
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var13, "rw", 25L), 24, 0);
							break label128;
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) {
				RandomAccessFile var19 = new RandomAccessFile(var5, "rw");
				var12 = var19.read();
				var19.seek(0L);
				var19.write(var12);
				var19.seek(0L);
				var19.close();
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var5, "rw", 25L), 24, 0);
			}
		} catch (IOException var18) {
		}

		JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(class232.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
		JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(class232.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
		class74.JagexCache_idxFiles = new BufferedFile[ModelData0.field2994];

		for (var10 = 0; var10 < ModelData0.field2994; ++var10) {
			class74.JagexCache_idxFiles[var10] = new BufferedFile(new AccessFile(class232.getFile("main_file_cache.idx" + var10), "rw", 1048576L), 6000, 0);
		}

	}
}
