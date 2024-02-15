import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
public class class30 {
	@ObfuscatedName("vx")
	@ObfuscatedSignature(
		descriptor = "Ldf;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;

	static {
		ImageIO.setUseCache(false);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "1496145760"
	)
	public static void method422(String var0, String var1, String var2, int var3, int var4) throws IOException {
		if (var1 != null && !var1.isEmpty()) {
			var0 = var0 + "-" + var1;
		}

		class33.field169 = var4;
		JagexCache.cacheGamebuild = var3;

		try {
			BufferedNetSocket.osName = System.getProperty("os.name");
		} catch (Exception var31) {
			BufferedNetSocket.osName = "Unknown";
		}

		TaskHandler.osNameLowercase = BufferedNetSocket.osName.toLowerCase();
		class334.userHomeDirectory = null;

		try {
			class334.userHomeDirectory = System.getProperty("jagex.userhome");
		} catch (Exception var30) {
		}

		if (class334.userHomeDirectory == null) {
			try {
				class334.userHomeDirectory = System.getProperty("user.home");
			} catch (Exception var29) {
			}
		}

		if (class334.userHomeDirectory != null) {
			class334.userHomeDirectory = class334.userHomeDirectory + "/";
		}

		try {
			if (TaskHandler.osNameLowercase.startsWith("win")) {
				if (class334.userHomeDirectory == null) {
					class334.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (class334.userHomeDirectory == null) {
				class334.userHomeDirectory = System.getenv("HOME");
			}

			if (class334.userHomeDirectory != null) {
				class334.userHomeDirectory = class334.userHomeDirectory + "/";
			}
		} catch (Exception var28) {
		}

		if (class334.userHomeDirectory == null) {
			class334.userHomeDirectory = "~/";
		}

		HttpRequest.field43 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class334.userHomeDirectory, "/tmp/", ""};
		class136.field1621 = new String[]{".jagex_cache_" + JagexCache.cacheGamebuild, ".file_store_" + JagexCache.cacheGamebuild};
		int var19 = 0;

		label276:
		while (var19 < 4) {
			String var7 = var19 == 0 ? "" : "" + var19;
			JagexCache.field2331 = new File(class334.userHomeDirectory, "jagex_cl_" + var0 + "_" + var2 + var7 + ".dat");
			String var8 = null;
			String var9 = null;
			boolean var10 = false;
			Buffer var12;
			File var36;
			if (JagexCache.field2331.exists()) {
				try {
					AccessFile var11 = new AccessFile(JagexCache.field2331, "rw", 10000L);

					int var13;
					for (var12 = new Buffer((int)var11.length()); var12.offset < var12.array.length; var12.offset += var13) {
						var13 = var11.read(var12.array, var12.offset, var12.array.length - var12.offset);
						if (var13 == -1) {
							throw new IOException();
						}
					}

					var12.offset = 0;
					var13 = var12.readUnsignedByte();
					if (var13 < 1 || var13 > 3) {
						throw new IOException("" + var13);
					}

					int var14 = 0;
					if (var13 > 1) {
						var14 = var12.readUnsignedByte();
					}

					if (var13 <= 2) {
						var8 = var12.readStringCp1252NullCircumfixed();
						if (var14 == 1) {
							var9 = var12.readStringCp1252NullCircumfixed();
						}
					} else {
						var8 = var12.readCESU8();
						if (var14 == 1) {
							var9 = var12.readCESU8();
						}
					}

					var11.close();
				} catch (IOException var33) {
					var33.printStackTrace();
				}

				if (var8 != null) {
					var36 = new File(var8);
					if (!var36.exists()) {
						var8 = null;
					}
				}

				if (var8 != null) {
					var36 = new File(var8, "test.dat");
					if (!HealthBarUpdate.method2494(var36, true)) {
						var8 = null;
					}
				}
			}

			if (var8 == null && var19 == 0) {
				label250:
				for (int var20 = 0; var20 < class136.field1621.length; ++var20) {
					for (int var21 = 0; var21 < HttpRequest.field43.length; ++var21) {
						File var22 = new File(HttpRequest.field43[var21] + class136.field1621[var20] + File.separatorChar + var0 + File.separatorChar);
						if (var22.exists() && HealthBarUpdate.method2494(new File(var22, "test.dat"), true)) {
							var8 = var22.toString();
							var10 = true;
							break label250;
						}
					}
				}
			}

			if (var8 == null) {
				var8 = class334.userHomeDirectory + File.separatorChar + "jagexcache" + var7 + File.separatorChar + var0 + File.separatorChar + var2 + File.separatorChar;
				var10 = true;
			}

			File var35;
			if (var9 != null) {
				var35 = new File(var9);
				var36 = new File(var8);

				try {
					File[] var38 = var35.listFiles();
					File[] var23 = var38;

					for (int var15 = 0; var15 < var23.length; ++var15) {
						File var16 = var23[var15];
						File var17 = new File(var36, var16.getName());
						boolean var18 = var16.renameTo(var17);
						if (!var18) {
							throw new IOException();
						}
					}
				} catch (Exception var32) {
					var32.printStackTrace();
				}

				var10 = true;
			}

			if (var10) {
				var35 = new File(var8);
				var12 = null;

				try {
					AccessFile var39 = new AccessFile(JagexCache.field2331, "rw", 10000L);
					Buffer var40 = new Buffer(500);
					var40.writeByte(3);
					var40.writeByte(var12 != null ? 1 : 0);
					var40.writeCESU8(var35.getPath());
					if (var12 != null) {
						var40.writeCESU8("");
					}

					var39.write(var40.array, 0, var40.offset);
					var39.close();
				} catch (IOException var27) {
					var27.printStackTrace();
				}
			}

			File var6 = new File(var8);
			class11.cacheDir = var6;
			if (!class11.cacheDir.exists()) {
				class11.cacheDir.mkdirs();
			}

			File[] var34 = class11.cacheDir.listFiles();
			if (var34 != null) {
				File[] var37 = var34;

				for (int var24 = 0; var24 < var37.length; ++var24) {
					File var25 = var37[var24];
					if (!HealthBarUpdate.method2494(var25, false)) {
						++var19;
						continue label276;
					}
				}
			}
			break;
		}

		File var5 = class11.cacheDir;
		class154.FileSystem_cacheDir = var5;
		if (!class154.FileSystem_cacheDir.exists()) {
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true;
			NPCComposition.method3708();
			JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(ClanSettings.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
			JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(ClanSettings.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
			class173.JagexCache_idxFiles = new BufferedFile[class33.field169];

			for (int var26 = 0; var26 < class33.field169; ++var26) {
				class173.JagexCache_idxFiles[var26] = new BufferedFile(new AccessFile(ClanSettings.getFile("main_file_cache.idx" + var26), "rw", 1048576L), 6000, 0);
			}

		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-408994455"
	)
	public static void method420() {
		WorldMapElement.HitSplatDefinition_cached.clear();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "468440439"
	)
	static final void method416(String var0) {
		SecureRandomCallable.method2319(var0 + " is already on your friend list");
	}
}
