import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.SecureRandom;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "[Luk;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;

	SecureRandomCallable() {
	}

	public Object call() {
		SecureRandom var2 = new SecureRandom();
		var2.nextInt();
		return var2;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "297617664"
	)
	public static void method2246(String var0, String var1, String var2, int var3, int var4) throws IOException {
		if (var1 != null && !var1.isEmpty()) {
			var0 = var0 + "-" + var1;
		}

		JagexCache.field1862 = var4;
		JagexCache.cacheGamebuild = var3;

		try {
			ScriptFrame.field491 = System.getProperty("os.name");
		} catch (Exception var31) {
			ScriptFrame.field491 = "Unknown";
		}

		Messages.field1422 = ScriptFrame.field491.toLowerCase();
		class36.userHomeDirectory = null;

		try {
			class36.userHomeDirectory = System.getProperty("jagex.userhome");
		} catch (Exception var30) {
		}

		if (class36.userHomeDirectory == null) {
			try {
				class36.userHomeDirectory = System.getProperty("user.home");
			} catch (Exception var29) {
			}
		}

		if (class36.userHomeDirectory != null) {
			class36.userHomeDirectory = class36.userHomeDirectory + "/";
		}

		try {
			if (Messages.field1422.startsWith("win")) {
				if (class36.userHomeDirectory == null) {
					class36.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (class36.userHomeDirectory == null) {
				class36.userHomeDirectory = System.getenv("HOME");
			}

			if (class36.userHomeDirectory != null) {
				class36.userHomeDirectory = class36.userHomeDirectory + "/";
			}
		} catch (Exception var28) {
		}

		if (class36.userHomeDirectory == null) {
			class36.userHomeDirectory = "~/";
		}

		DelayFadeTask.field4514 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class36.userHomeDirectory, "/tmp/", ""};
		JagexCache.field1867 = new String[]{".jagex_cache_" + JagexCache.cacheGamebuild, ".file_store_" + JagexCache.cacheGamebuild};
		int var19 = 0;

		label267:
		while (var19 < 4) {
			String var7 = var19 == 0 ? "" : "" + var19;
			JagexCache.field1869 = new File(class36.userHomeDirectory, "jagex_cl_" + var0 + "_" + var2 + var7 + ".dat");
			String var8 = null;
			String var9 = null;
			boolean var10 = false;
			int var15;
			File var36;
			if (JagexCache.field1869.exists()) {
				try {
					AccessFile var11 = new AccessFile(JagexCache.field1869, "rw", 10000L);

					Buffer var12;
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

					boolean var38;
					try {
						RandomAccessFile var20 = new RandomAccessFile(var36, "rw");
						var15 = var20.read();
						var20.seek(0L);
						var20.write(var15);
						var20.seek(0L);
						var20.close();
						var36.delete();
						var38 = true;
					} catch (Exception var27) {
						var38 = false;
					}

					if (!var38) {
						var8 = null;
					}
				}
			}

			if (var8 == null && var19 == 0) {
				label242:
				for (int var21 = 0; var21 < JagexCache.field1867.length; ++var21) {
					for (int var22 = 0; var22 < DelayFadeTask.field4514.length; ++var22) {
						File var23 = new File(DelayFadeTask.field4514[var22] + JagexCache.field1867[var21] + File.separatorChar + var0 + File.separatorChar);
						if (var23.exists() && Message.method1185(new File(var23, "test.dat"), true)) {
							var8 = var23.toString();
							var10 = true;
							break label242;
						}
					}
				}
			}

			if (var8 == null) {
				var8 = class36.userHomeDirectory + File.separatorChar + "jagexcache" + var7 + File.separatorChar + var0 + File.separatorChar + var2 + File.separatorChar;
				var10 = true;
			}

			if (var9 != null) {
				File var35 = new File(var9);
				var36 = new File(var8);

				try {
					File[] var40 = var35.listFiles();
					File[] var39 = var40;

					for (var15 = 0; var15 < var39.length; ++var15) {
						File var16 = var39[var15];
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
				class165.method3330(new File(var8), (File)null);
			}

			File var6 = new File(var8);
			JagexCache.cacheDir = var6;
			if (!JagexCache.cacheDir.exists()) {
				JagexCache.cacheDir.mkdirs();
			}

			File[] var34 = JagexCache.cacheDir.listFiles();
			if (var34 != null) {
				File[] var37 = var34;

				for (int var24 = 0; var24 < var37.length; ++var24) {
					File var25 = var37[var24];
					if (!Message.method1185(var25, false)) {
						++var19;
						continue label267;
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
			FileSystem.method3489();
			JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(class299.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
			JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(class299.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
			WallDecoration.JagexCache_idxFiles = new BufferedFile[JagexCache.field1862];

			for (int var26 = 0; var26 < JagexCache.field1862; ++var26) {
				WallDecoration.JagexCache_idxFiles[var26] = new BufferedFile(new AccessFile(class299.getFile("main_file_cache.idx" + var26), "rw", 1048576L), 6000, 0);
			}

		}
	}
}
