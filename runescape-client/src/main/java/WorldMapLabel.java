import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ls")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("ac")
	@Export("text")
	String text;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -226092551
	)
	@Export("width")
	int width;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -736001327
	)
	@Export("height")
	int height;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILko;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1;
		this.width = var2;
		this.height = var3;
		this.size = var4;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "-624821005"
	)
	public static void method6195(String var0, String var1, String var2, int var3, int var4) throws IOException {
		if (var1 != null && !var1.isEmpty()) {
			var0 = var0 + "-" + var1;
		}

		class179.field1883 = var4;
		class489.cacheGamebuild = var3;

		try {
			class216.osName = System.getProperty("os.name");
		} catch (Exception var37) {
			class216.osName = "Unknown";
		}

		KitDefinition.osNameLowercase = class216.osName.toLowerCase();
		JagexCache.userHomeDirectory = null;

		try {
			JagexCache.userHomeDirectory = System.getProperty("jagex.userhome");
		} catch (Exception var36) {
		}

		if (JagexCache.userHomeDirectory == null) {
			try {
				JagexCache.userHomeDirectory = System.getProperty("user.home");
			} catch (Exception var35) {
			}
		}

		if (JagexCache.userHomeDirectory != null) {
			JagexCache.userHomeDirectory = JagexCache.userHomeDirectory + "/";
		}

		try {
			if (KitDefinition.osNameLowercase.startsWith("win")) {
				if (JagexCache.userHomeDirectory == null) {
					JagexCache.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (JagexCache.userHomeDirectory == null) {
				JagexCache.userHomeDirectory = System.getenv("HOME");
			}

			if (JagexCache.userHomeDirectory != null) {
				JagexCache.userHomeDirectory = JagexCache.userHomeDirectory + "/";
			}
		} catch (Exception var34) {
		}

		if (JagexCache.userHomeDirectory == null) {
			JagexCache.userHomeDirectory = "~/";
		}

		Sound.field2165 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", JagexCache.userHomeDirectory, "/tmp/", ""};
		FillMode.field5499 = new String[]{".jagex_cache_" + class489.cacheGamebuild, ".file_store_" + class489.cacheGamebuild};
		int var19 = 0;

		label334:
		while (var19 < 4) {
			String var7 = var19 == 0 ? "" : "" + var19;
			JagexCache.field2391 = new File(JagexCache.userHomeDirectory, "jagex_cl_" + var0 + "_" + var2 + var7 + ".dat");
			String var8 = null;
			String var9 = null;
			boolean var10 = false;
			Buffer var12;
			int var13;
			int var15;
			File var44;
			if (JagexCache.field2391.exists()) {
				try {
					AccessFile var11 = new AccessFile(JagexCache.field2391, "rw", 10000L);

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
				} catch (IOException var40) {
					var40.printStackTrace();
				}

				if (var8 != null) {
					var44 = new File(var8);
					if (!var44.exists()) {
						var8 = null;
					}
				}

				if (var8 != null) {
					var44 = new File(var8, "test.dat");

					boolean var47;
					try {
						RandomAccessFile var20 = new RandomAccessFile(var44, "rw");
						var15 = var20.read();
						var20.seek(0L);
						var20.write(var15);
						var20.seek(0L);
						var20.close();
						var44.delete();
						var47 = true;
					} catch (Exception var33) {
						var47 = false;
					}

					if (!var47) {
						var8 = null;
					}
				}
			}

			if (var8 == null && var19 == 0) {
				label309:
				for (int var21 = 0; var21 < FillMode.field5499.length; ++var21) {
					for (int var22 = 0; var22 < Sound.field2165.length; ++var22) {
						File var23 = new File(Sound.field2165[var22] + FillMode.field5499[var21] + File.separatorChar + var0 + File.separatorChar);
						if (var23.exists()) {
							File var24 = new File(var23, "test.dat");

							boolean var49;
							try {
								RandomAccessFile var16 = new RandomAccessFile(var24, "rw");
								int var17 = var16.read();
								var16.seek(0L);
								var16.write(var17);
								var16.seek(0L);
								var16.close();
								var24.delete();
								var49 = true;
							} catch (Exception var32) {
								var49 = false;
							}

							if (var49) {
								var8 = var23.toString();
								var10 = true;
								break label309;
							}
						}
					}
				}
			}

			if (var8 == null) {
				var8 = JagexCache.userHomeDirectory + File.separatorChar + "jagexcache" + var7 + File.separatorChar + var0 + File.separatorChar + var2 + File.separatorChar;
				var10 = true;
			}

			File var43;
			if (var9 != null) {
				var43 = new File(var9);
				var44 = new File(var8);

				try {
					File[] var54 = var43.listFiles();
					File[] var51 = var54;

					for (var15 = 0; var15 < var51.length; ++var15) {
						File var50 = var51[var15];
						File var25 = new File(var44, var50.getName());
						boolean var18 = var50.renameTo(var25);
						if (!var18) {
							throw new IOException();
						}
					}
				} catch (Exception var39) {
					var39.printStackTrace();
				}

				var10 = true;
			}

			if (var10) {
				var43 = new File(var8);
				var12 = null;

				try {
					AccessFile var55 = new AccessFile(JagexCache.field2391, "rw", 10000L);
					Buffer var52 = new Buffer(500);
					var52.writeByte(3);
					var52.writeByte(var12 != null ? 1 : 0);
					var52.writeCESU8(var43.getPath());
					if (var12 != null) {
						var52.writeCESU8("");
					}

					var55.write(var52.array, 0, var52.offset);
					var55.close();
				} catch (IOException var31) {
					var31.printStackTrace();
				}
			}

			File var6 = new File(var8);
			class177.cacheDir = var6;
			if (!class177.cacheDir.exists()) {
				class177.cacheDir.mkdirs();
			}

			File[] var42 = class177.cacheDir.listFiles();
			if (var42 != null) {
				File[] var45 = var42;

				for (int var26 = 0; var26 < var45.length; ++var26) {
					File var27 = var45[var26];

					boolean var53;
					try {
						RandomAccessFile var48 = new RandomAccessFile(var27, "rw");
						var13 = var48.read();
						var48.seek(0L);
						var48.write(var13);
						var48.seek(0L);
						var48.close();
						var53 = true;
					} catch (Exception var30) {
						var53 = false;
					}

					if (!var53) {
						++var19;
						continue label334;
					}
				}
			}
			break;
		}

		RestClientThreadFactory.method203(class177.cacheDir);

		try {
			File var5 = new File(JagexCache.userHomeDirectory, "random.dat");
			int var29;
			if (var5.exists()) {
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var5, "rw", 25L), 24, 0);
			} else {
				label260:
				for (int var28 = 0; var28 < FillMode.field5499.length; ++var28) {
					for (var29 = 0; var29 < Sound.field2165.length; ++var29) {
						File var46 = new File(Sound.field2165[var29] + FillMode.field5499[var28] + File.separatorChar + "random.dat");
						if (var46.exists()) {
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var46, "rw", 25L), 24, 0);
							break label260;
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) {
				RandomAccessFile var41 = new RandomAccessFile(var5, "rw");
				var29 = var41.read();
				var41.seek(0L);
				var41.write(var29);
				var41.seek(0L);
				var41.close();
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var5, "rw", 25L), 24, 0);
			}
		} catch (IOException var38) {
		}

		JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(class272.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
		JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(class272.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
		class215.JagexCache_idxFiles = new BufferedFile[class179.field1883];

		for (var19 = 0; var19 < class179.field1883; ++var19) {
			class215.JagexCache_idxFiles[var19] = new BufferedFile(new AccessFile(class272.getFile("main_file_cache.idx" + var19), "rw", 1048576L), 6000, 0);
		}

	}
}
