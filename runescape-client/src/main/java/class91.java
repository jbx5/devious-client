import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
public enum class91 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	field1097(0, -1),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	field1084(1, 1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	field1086(2, 7),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	field1087(3, 8),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	field1088(4, 9);

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "Lsx;"
	)
	static AbstractSocket field1091;
	@ObfuscatedName("st")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1976573843
	)
	final int field1092;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1872885131
	)
	final int field1090;

	class91(int var3, int var4) {
		this.field1092 = var3;
		this.field1090 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "111"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1090;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "932843841"
	)
	public static void method2431(String var0, String var1, String var2, int var3, int var4) throws IOException {
		if (var1 != null && !var1.isEmpty()) {
			var0 = var0 + "-" + var1;
		}

		JagexCache.field2352 = var4;
		class532.cacheGamebuild = var3;

		try {
			FadeOutTask.osName = System.getProperty("os.name");
		} catch (Exception var37) {
			FadeOutTask.osName = "Unknown";
		}

		class133.osNameLowercase = FadeOutTask.osName.toLowerCase();
		WorldMapLabelSize.userHomeDirectory = null;

		try {
			WorldMapLabelSize.userHomeDirectory = System.getProperty("jagex.userhome");
		} catch (Exception var36) {
		}

		if (WorldMapLabelSize.userHomeDirectory == null) {
			try {
				WorldMapLabelSize.userHomeDirectory = System.getProperty("user.home");
			} catch (Exception var35) {
			}
		}

		if (WorldMapLabelSize.userHomeDirectory != null) {
			WorldMapLabelSize.userHomeDirectory = WorldMapLabelSize.userHomeDirectory + "/";
		}

		try {
			if (class133.osNameLowercase.startsWith("win")) {
				if (WorldMapLabelSize.userHomeDirectory == null) {
					WorldMapLabelSize.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (WorldMapLabelSize.userHomeDirectory == null) {
				WorldMapLabelSize.userHomeDirectory = System.getenv("HOME");
			}

			if (WorldMapLabelSize.userHomeDirectory != null) {
				WorldMapLabelSize.userHomeDirectory = WorldMapLabelSize.userHomeDirectory + "/";
			}
		} catch (Exception var34) {
		}

		if (WorldMapLabelSize.userHomeDirectory == null) {
			WorldMapLabelSize.userHomeDirectory = "~/";
		}

		class139.field1625 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", WorldMapLabelSize.userHomeDirectory, "/tmp/", ""};
		JagexCache.field2359 = new String[]{".jagex_cache_" + class532.cacheGamebuild, ".file_store_" + class532.cacheGamebuild};
		int var19 = 0;

		label334:
		while (var19 < 4) {
			String var7 = var19 == 0 ? "" : "" + var19;
			JagexCache.field2357 = new File(WorldMapLabelSize.userHomeDirectory, "jagex_cl_" + var0 + "_" + var2 + var7 + ".dat");
			String var8 = null;
			String var9 = null;
			boolean var10 = false;
			Buffer var12;
			int var13;
			int var15;
			File var44;
			if (JagexCache.field2357.exists()) {
				try {
					AccessFile var11 = new AccessFile(JagexCache.field2357, "rw", 10000L);

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
				label308:
				for (int var21 = 0; var21 < JagexCache.field2359.length; ++var21) {
					for (int var22 = 0; var22 < class139.field1625.length; ++var22) {
						File var23 = new File(class139.field1625[var22] + JagexCache.field2359[var21] + File.separatorChar + var0 + File.separatorChar);
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
								break label308;
							}
						}
					}
				}
			}

			if (var8 == null) {
				var8 = WorldMapLabelSize.userHomeDirectory + File.separatorChar + "jagexcache" + var7 + File.separatorChar + var0 + File.separatorChar + var2 + File.separatorChar;
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
					AccessFile var55 = new AccessFile(JagexCache.field2357, "rw", 10000L);
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
			class423.cacheDir = var6;
			if (!class423.cacheDir.exists()) {
				class423.cacheDir.mkdirs();
			}

			File[] var42 = class423.cacheDir.listFiles();
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

		class163.method3535(class423.cacheDir);

		try {
			File var5 = new File(WorldMapLabelSize.userHomeDirectory, "random.dat");
			int var29;
			if (var5.exists()) {
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var5, "rw", 25L), 24, 0);
			} else {
				label259:
				for (int var28 = 0; var28 < JagexCache.field2359.length; ++var28) {
					for (var29 = 0; var29 < class139.field1625.length; ++var29) {
						File var46 = new File(class139.field1625[var29] + JagexCache.field2359[var28] + File.separatorChar + "random.dat");
						if (var46.exists()) {
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var46, "rw", 25L), 24, 0);
							break label259;
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

		JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(class160.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
		JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(class160.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
		ItemContainer.JagexCache_idxFiles = new BufferedFile[JagexCache.field2352];

		for (var19 = 0; var19 < JagexCache.field2352; ++var19) {
			ItemContainer.JagexCache_idxFiles[var19] = new BufferedFile(new AccessFile(class160.getFile("main_file_cache.idx" + var19), "rw", 1048576L), 6000, 0);
		}

	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(Lmf;I)V",
		garbageValue = "-1352089470"
	)
	static void method2432(PacketBufferNode var0) {
		var0.packetBuffer.writeIntLE(ReflectionCheck.archive10.hash);
		var0.packetBuffer.writeIntLE(class59.archive8.hash);
		var0.packetBuffer.writeIntME(class424.field4678.hash);
		var0.packetBuffer.writeInt(class33.archive6.hash);
		var0.packetBuffer.writeIntLE(class167.field1796.hash);
		var0.packetBuffer.writeIntIME(Projectile.soundEffectsArchive.hash);
		var0.packetBuffer.writeIntME(Actor.archive13.hash);
	}

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-24919"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop;
	}
}
