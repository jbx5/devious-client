import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("sb")
	@ObfuscatedSignature(
		descriptor = "Lst;"
	)
	@Export("friendsChat")
	static FriendsChat friendsChat;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1321466283
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1704766835
	)
	@Export("type")
	int type;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -440355905
	)
	@Export("x")
	int x;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1462658139
	)
	@Export("y")
	int y;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -753560163
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 883033335
	)
	int field1202;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 160531641
	)
	int field1204;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 451987923
	)
	int field1200;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1734556861
	)
	int field1206;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1107956009
	)
	int field1207;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1922579283
	)
	int field1214;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 655247679
	)
	int field1209;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 444888627
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -278358679
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.field1209 = 31;
		this.delay = 0;
		this.hitpoints = -1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1098669309"
	)
	void method2702(int var1) {
		this.field1209 = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2894369"
	)
	boolean method2704(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1209 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "1703692079"
	)
	public static void method2712(String var0, String var1, String var2, int var3, int var4) throws IOException {
		if (var1 != null && !var1.isEmpty()) {
			var0 = var0 + "-" + var1;
		}

		JagexCache.field2391 = var4;
		class197.cacheGamebuild = var3;

		try {
			class333.osName = System.getProperty("os.name");
		} catch (Exception var34) {
			class333.osName = "Unknown";
		}

		VarbitComposition.osNameLowercase = class333.osName.toLowerCase();
		class188.userHomeDirectory = null;

		try {
			class188.userHomeDirectory = System.getProperty("jagex.userhome");
		} catch (Exception var33) {
		}

		if (class188.userHomeDirectory == null) {
			try {
				class188.userHomeDirectory = System.getProperty("user.home");
			} catch (Exception var32) {
			}
		}

		if (class188.userHomeDirectory != null) {
			class188.userHomeDirectory = class188.userHomeDirectory + "/";
		}

		try {
			if (VarbitComposition.osNameLowercase.startsWith("win")) {
				if (class188.userHomeDirectory == null) {
					class188.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (class188.userHomeDirectory == null) {
				class188.userHomeDirectory = System.getenv("HOME");
			}

			if (class188.userHomeDirectory != null) {
				class188.userHomeDirectory = class188.userHomeDirectory + "/";
			}
		} catch (Exception var31) {
		}

		if (class188.userHomeDirectory == null) {
			class188.userHomeDirectory = "~/";
		}

		Sound.field1740 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class188.userHomeDirectory, "/tmp/", ""};
		class202.field2113 = new String[]{".jagex_cache_" + class197.cacheGamebuild, ".file_store_" + class197.cacheGamebuild};
		int var19 = 0;

		label276:
		while (var19 < 4) {
			String var7 = var19 == 0 ? "" : "" + var19;
			class151.field1708 = new File(class188.userHomeDirectory, "jagex_cl_" + var0 + "_" + var2 + var7 + ".dat");
			String var8 = null;
			String var9 = null;
			boolean var10 = false;
			int var13;
			int var15;
			File var39;
			if (class151.field1708.exists()) {
				try {
					AccessFile var11 = new AccessFile(class151.field1708, "rw", 10000L);

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
				} catch (IOException var36) {
					var36.printStackTrace();
				}

				if (var8 != null) {
					var39 = new File(var8);
					if (!var39.exists()) {
						var8 = null;
					}
				}

				if (var8 != null) {
					var39 = new File(var8, "test.dat");

					boolean var42;
					try {
						RandomAccessFile var20 = new RandomAccessFile(var39, "rw");
						var15 = var20.read();
						var20.seek(0L);
						var20.write(var15);
						var20.seek(0L);
						var20.close();
						var39.delete();
						var42 = true;
					} catch (Exception var30) {
						var42 = false;
					}

					if (!var42) {
						var8 = null;
					}
				}
			}

			if (var8 == null && var19 == 0) {
				label251:
				for (int var21 = 0; var21 < class202.field2113.length; ++var21) {
					for (int var22 = 0; var22 < Sound.field1740.length; ++var22) {
						File var23 = new File(Sound.field1740[var22] + class202.field2113[var21] + File.separatorChar + var0 + File.separatorChar);
						if (var23.exists()) {
							File var24 = new File(var23, "test.dat");

							boolean var43;
							try {
								RandomAccessFile var16 = new RandomAccessFile(var24, "rw");
								int var17 = var16.read();
								var16.seek(0L);
								var16.write(var17);
								var16.seek(0L);
								var16.close();
								var24.delete();
								var43 = true;
							} catch (Exception var29) {
								var43 = false;
							}

							if (var43) {
								var8 = var23.toString();
								var10 = true;
								break label251;
							}
						}
					}
				}
			}

			if (var8 == null) {
				var8 = class188.userHomeDirectory + File.separatorChar + "jagexcache" + var7 + File.separatorChar + var0 + File.separatorChar + var2 + File.separatorChar;
				var10 = true;
			}

			if (var9 != null) {
				File var38 = new File(var9);
				var39 = new File(var8);

				try {
					File[] var47 = var38.listFiles();
					File[] var45 = var47;

					for (var15 = 0; var15 < var45.length; ++var15) {
						File var44 = var45[var15];
						File var25 = new File(var39, var44.getName());
						boolean var18 = var44.renameTo(var25);
						if (!var18) {
							throw new IOException();
						}
					}
				} catch (Exception var35) {
					var35.printStackTrace();
				}

				var10 = true;
			}

			if (var10) {
				HealthBarUpdate.method2776(new File(var8), (File)null);
			}

			File var6 = new File(var8);
			JagexCache.cacheDir = var6;
			if (!JagexCache.cacheDir.exists()) {
				JagexCache.cacheDir.mkdirs();
			}

			File[] var37 = JagexCache.cacheDir.listFiles();
			if (var37 != null) {
				File[] var40 = var37;

				for (int var26 = 0; var26 < var40.length; ++var26) {
					File var27 = var40[var26];

					boolean var46;
					try {
						RandomAccessFile var41 = new RandomAccessFile(var27, "rw");
						var13 = var41.read();
						var41.seek(0L);
						var41.write(var13);
						var41.seek(0L);
						var41.close();
						var46 = true;
					} catch (Exception var28) {
						var46 = false;
					}

					if (!var46) {
						++var19;
						continue label276;
					}
				}
			}
			break;
		}

		class327.method6530(JagexCache.cacheDir);
		class7.method49();
		JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(Player.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
		JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(Player.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
		UserComparator6.JagexCache_idxFiles = new BufferedFile[JagexCache.field2391];

		for (var19 = 0; var19 < JagexCache.field2391; ++var19) {
			UserComparator6.JagexCache_idxFiles[var19] = new BufferedFile(new AccessFile(Player.getFile("main_file_cache.idx" + var19), "rw", 1048576L), 6000, 0);
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)[B",
		garbageValue = "1454210871"
	)
	public static byte[] method2713(CharSequence var0) {
		int var1 = var0.length();
		byte[] var2 = new byte[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if (var4 > 0 && var4 < 128 || var4 >= 160 && var4 <= 255) {
				var2[var3] = (byte)var4;
			} else if (var4 == 8364) {
				var2[var3] = -128;
			} else if (var4 == 8218) {
				var2[var3] = -126;
			} else if (var4 == 402) {
				var2[var3] = -125;
			} else if (var4 == 8222) {
				var2[var3] = -124;
			} else if (var4 == 8230) {
				var2[var3] = -123;
			} else if (var4 == 8224) {
				var2[var3] = -122;
			} else if (var4 == 8225) {
				var2[var3] = -121;
			} else if (var4 == 710) {
				var2[var3] = -120;
			} else if (var4 == 8240) {
				var2[var3] = -119;
			} else if (var4 == 352) {
				var2[var3] = -118;
			} else if (var4 == 8249) {
				var2[var3] = -117;
			} else if (var4 == 338) {
				var2[var3] = -116;
			} else if (var4 == 381) {
				var2[var3] = -114;
			} else if (var4 == 8216) {
				var2[var3] = -111;
			} else if (var4 == 8217) {
				var2[var3] = -110;
			} else if (var4 == 8220) {
				var2[var3] = -109;
			} else if (var4 == 8221) {
				var2[var3] = -108;
			} else if (var4 == 8226) {
				var2[var3] = -107;
			} else if (var4 == 8211) {
				var2[var3] = -106;
			} else if (var4 == 8212) {
				var2[var3] = -105;
			} else if (var4 == 732) {
				var2[var3] = -104;
			} else if (var4 == 8482) {
				var2[var3] = -103;
			} else if (var4 == 353) {
				var2[var3] = -102;
			} else if (var4 == 8250) {
				var2[var3] = -101;
			} else if (var4 == 339) {
				var2[var3] = -100;
			} else if (var4 == 382) {
				var2[var3] = -98;
			} else if (var4 == 376) {
				var2[var3] = -97;
			} else {
				var2[var3] = 63;
			}
		}

		return var2;
	}
}
