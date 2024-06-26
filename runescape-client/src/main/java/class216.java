import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
public class class216 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "122"
	)
	public static void method4191(String var0, String var1, String var2, int var3, int var4) throws IOException {
		if (var1 != null && !var1.isEmpty()) {
			var0 = var0 + "-" + var1;
		}

		RestClientThreadFactory.field76 = var4;
		JagexCache.cacheGamebuild = var3;

		try {
			JagexCache.osName = System.getProperty("os.name");
		} catch (Exception var17) {
			JagexCache.osName = "Unknown";
		}

		HealthBarUpdate.osNameLowercase = JagexCache.osName.toLowerCase();
		class74.userHomeDirectory = null;

		try {
			class74.userHomeDirectory = System.getProperty("jagex.userhome");
		} catch (Exception var16) {
		}

		if (class74.userHomeDirectory == null) {
			try {
				class74.userHomeDirectory = System.getProperty("user.home");
			} catch (Exception var15) {
			}
		}

		if (class74.userHomeDirectory != null) {
			class74.userHomeDirectory = class74.userHomeDirectory + "/";
		}

		try {
			if (HealthBarUpdate.osNameLowercase.startsWith("win")) {
				if (class74.userHomeDirectory == null) {
					class74.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (class74.userHomeDirectory == null) {
				class74.userHomeDirectory = System.getenv("HOME");
			}

			if (class74.userHomeDirectory != null) {
				class74.userHomeDirectory = class74.userHomeDirectory + "/";
			}
		} catch (Exception var14) {
		}

		if (class74.userHomeDirectory == null) {
			class74.userHomeDirectory = "~/";
		}

		class147.field1695 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class74.userHomeDirectory, "/tmp/", ""};
		class87.field1073 = new String[]{".jagex_cache_" + JagexCache.cacheGamebuild, ".file_store_" + JagexCache.cacheGamebuild};
		int var10 = 0;

		label147:
		while (var10 < 4) {
			class214.cacheDir = SoundSystem.method875(var0, var2, var10);
			if (!class214.cacheDir.exists()) {
				class214.cacheDir.mkdirs();
			}

			File[] var6 = class214.cacheDir.listFiles();
			if (var6 == null) {
				break;
			}

			File[] var7 = var6;
			int var8 = 0;

			while (true) {
				if (var8 >= var7.length) {
					break label147;
				}

				File var9 = var7[var8];
				if (!class159.method3418(var9, false)) {
					++var10;
					break;
				}

				++var8;
			}
		}

		class104.method2770(class214.cacheDir);

		try {
			File var5 = new File(class74.userHomeDirectory, "random.dat");
			int var12;
			if (var5.exists()) {
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var5, "rw", 25L), 24, 0);
			} else {
				label129:
				for (int var11 = 0; var11 < class87.field1073.length; ++var11) {
					for (var12 = 0; var12 < class147.field1695.length; ++var12) {
						File var13 = new File(class147.field1695[var12] + class87.field1073[var11] + File.separatorChar + "random.dat");
						if (var13.exists()) {
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var13, "rw", 25L), 24, 0);
							break label129;
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

		JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(class251.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
		JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(class251.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
		class163.JagexCache_idxFiles = new BufferedFile[RestClientThreadFactory.field76];

		for (var10 = 0; var10 < RestClientThreadFactory.field76; ++var10) {
			class163.JagexCache_idxFiles[var10] = new BufferedFile(new AccessFile(class251.getFile("main_file_cache.idx" + var10), "rw", 1048576L), 6000, 0);
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILvp;B)Lgz;",
		garbageValue = "16"
	)
	public static PlayerCompositionColorTextureOverride method4192(int var0, Buffer var1) {
		int var2 = var1.readUnsignedByte();
		boolean var3 = (var2 & 1) != 0;
		boolean var4 = (var2 & 2) != 0;
		PlayerCompositionColorTextureOverride var5 = new PlayerCompositionColorTextureOverride(var0);
		int var6;
		int[] var7;
		boolean var8;
		int var9;
		short var10;
		if (var3) {
			var6 = var1.readUnsignedByte();
			var7 = new int[]{var6 & 15, var6 >> 4 & 15};
			var8 = var5.playerCompositionRecolorTo != null && var7.length == var5.playerCompositionRecolorTo.length;

			for (var9 = 0; var9 < 2; ++var9) {
				if (var7[var9] != 15) {
					var10 = (short)var1.readUnsignedShort();
					if (var8) {
						var5.playerCompositionRecolorTo[var7[var9]] = var10;
					}
				}
			}
		}

		if (var4) {
			var6 = var1.readUnsignedByte();
			var7 = new int[]{var6 & 15, var6 >> 4 & 15};
			var8 = var5.playerCompositionRetextureTo != null && var7.length == var5.playerCompositionRetextureTo.length;

			for (var9 = 0; var9 < 2; ++var9) {
				if (var7[var9] != 15) {
					var10 = (short)var1.readUnsignedShort();
					if (var8) {
						var5.playerCompositionRetextureTo[var7[var9]] = var10;
					}
				}
			}
		}

		return var5;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "56"
	)
	public static int method4190(int var0) {
		if (var0 > 0) {
			return 1;
		} else {
			return var0 < 0 ? -1 : 0;
		}
	}
}
