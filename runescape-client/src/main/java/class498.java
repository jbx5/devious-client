import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ts")
public class class498 extends class500 {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1332316819
	)
	int field5004;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1382713073
	)
	int field5005;

	public class498(int var1, int var2, int var3, int var4) {
		super(var3, var4);
		this.field5004 = 0;
		this.field5005 = 0;
		this.field5004 = var1;
		this.field5005 = var2;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	public int method8666() {
		double var1 = this.method8680();
		return (int)Math.round((double)this.field5004 + var1 * (double)(this.field5005 - this.field5004));
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "99"
	)
	public static void method8662(String var0, String var1, String var2, int var3, int var4) throws IOException {
		if (var1 != null && !var1.isEmpty()) {
			var0 = var0 + "-" + var1;
		}

		class404.field4558 = var4;
		class409.cacheGamebuild = var3;

		try {
			UserComparator7.osName = System.getProperty("os.name");
		} catch (Exception var35) {
			UserComparator7.osName = "Unknown";
		}

		class268.osNameLowercase = UserComparator7.osName.toLowerCase();
		class136.userHomeDirectory = null;

		try {
			class136.userHomeDirectory = System.getProperty("jagex.userhome");
		} catch (Exception var34) {
		}

		if (class136.userHomeDirectory == null) {
			try {
				class136.userHomeDirectory = System.getProperty("user.home");
			} catch (Exception var33) {
			}
		}

		if (class136.userHomeDirectory != null) {
			class136.userHomeDirectory = class136.userHomeDirectory + "/";
		}

		try {
			if (class268.osNameLowercase.startsWith("win")) {
				if (class136.userHomeDirectory == null) {
					class136.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (class136.userHomeDirectory == null) {
				class136.userHomeDirectory = System.getenv("HOME");
			}

			if (class136.userHomeDirectory != null) {
				class136.userHomeDirectory = class136.userHomeDirectory + "/";
			}
		} catch (Exception var32) {
		}

		if (class136.userHomeDirectory == null) {
			class136.userHomeDirectory = "~/";
		}

		HealthBar.field1327 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class136.userHomeDirectory, "/tmp/", ""};
		class60.field423 = new String[]{".jagex_cache_" + class409.cacheGamebuild, ".file_store_" + class409.cacheGamebuild};
		int var19 = 0;

		label279:
		while (var19 < 4) {
			String var7 = var19 == 0 ? "" : "" + var19;
			class193.field1986 = new File(class136.userHomeDirectory, "jagex_cl_" + var0 + "_" + var2 + var7 + ".dat");
			String var8 = null;
			String var9 = null;
			boolean var10 = false;
			int var13;
			int var15;
			File var40;
			if (class193.field1986.exists()) {
				try {
					AccessFile var11 = new AccessFile(class193.field1986, "rw", 10000L);

					Buffer var12;
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
				} catch (IOException var37) {
					var37.printStackTrace();
				}

				if (var8 != null) {
					var40 = new File(var8);
					if (!var40.exists()) {
						var8 = null;
					}
				}

				if (var8 != null) {
					var40 = new File(var8, "test.dat");

					boolean var43;
					try {
						RandomAccessFile var20 = new RandomAccessFile(var40, "rw");
						var15 = var20.read();
						var20.seek(0L);
						var20.write(var15);
						var20.seek(0L);
						var20.close();
						var40.delete();
						var43 = true;
					} catch (Exception var31) {
						var43 = false;
					}

					if (!var43) {
						var8 = null;
					}
				}
			}

			if (var8 == null && var19 == 0) {
				label253:
				for (int var21 = 0; var21 < class60.field423.length; ++var21) {
					for (int var22 = 0; var22 < HealthBar.field1327.length; ++var22) {
						File var23 = new File(HealthBar.field1327[var22] + class60.field423[var21] + File.separatorChar + var0 + File.separatorChar);
						if (var23.exists()) {
							File var24 = new File(var23, "test.dat");

							boolean var44;
							try {
								RandomAccessFile var16 = new RandomAccessFile(var24, "rw");
								int var17 = var16.read();
								var16.seek(0L);
								var16.write(var17);
								var16.seek(0L);
								var16.close();
								var24.delete();
								var44 = true;
							} catch (Exception var30) {
								var44 = false;
							}

							if (var44) {
								var8 = var23.toString();
								var10 = true;
								break label253;
							}
						}
					}
				}
			}

			if (var8 == null) {
				var8 = class136.userHomeDirectory + File.separatorChar + "jagexcache" + var7 + File.separatorChar + var0 + File.separatorChar + var2 + File.separatorChar;
				var10 = true;
			}

			if (var9 != null) {
				File var39 = new File(var9);
				var40 = new File(var8);

				try {
					File[] var48 = var39.listFiles();
					File[] var46 = var48;

					for (var15 = 0; var15 < var46.length; ++var15) {
						File var45 = var46[var15];
						File var25 = new File(var40, var45.getName());
						boolean var18 = var45.renameTo(var25);
						if (!var18) {
							throw new IOException();
						}
					}
				} catch (Exception var36) {
					var36.printStackTrace();
				}

				var10 = true;
			}

			if (var10) {
				class172.method3496(new File(var8), (File)null);
			}

			File var6 = new File(var8);
			JagexCache.cacheDir = var6;
			if (!JagexCache.cacheDir.exists()) {
				JagexCache.cacheDir.mkdirs();
			}

			File[] var38 = JagexCache.cacheDir.listFiles();
			if (var38 != null) {
				File[] var41 = var38;

				for (int var26 = 0; var26 < var41.length; ++var26) {
					File var27 = var41[var26];

					boolean var47;
					try {
						RandomAccessFile var42 = new RandomAccessFile(var27, "rw");
						var13 = var42.read();
						var42.seek(0L);
						var42.write(var13);
						var42.seek(0L);
						var42.close();
						var47 = true;
					} catch (Exception var29) {
						var47 = false;
					}

					if (!var47) {
						++var19;
						continue label279;
					}
				}
			}
			break;
		}

		File var5 = JagexCache.cacheDir;
		FileSystem.FileSystem_cacheDir = var5;
		if (!FileSystem.FileSystem_cacheDir.exists()) {
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true;
			LoginPacket.createRandomDatFile();
			JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(class129.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
			JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(class129.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
			UserComparator5.JagexCache_idxFiles = new BufferedFile[class404.field4558];

			for (int var28 = 0; var28 < class404.field4558; ++var28) {
				UserComparator5.JagexCache_idxFiles[var28] = new BufferedFile(new AccessFile(class129.getFile("main_file_cache.idx" + var28), "rw", 1048576L), 6000, 0);
			}

		}
	}
}
