import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.net.URL;
import java.net.URLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aa")
public class class33 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	@Export("reflectionChecks")
	public static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("ho")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;

	static {
		reflectionChecks = new IterableNodeDeque(); // L: 17
	}

	@ObfuscatedName("c")
	static double method644(double var0) {
		return Math.exp(-var0 * var0 / 2.0D) / Math.sqrt(6.283185307179586D); // L: 9
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIS)V",
		garbageValue = "25840"
	)
	public static void method641(String var0, String var1, int var2, int var3) throws IOException {
		JagexCache.idxCount = var3;
		class151.cacheGamebuild = var2;

		try {
			class124.operatingSystemName = System.getProperty("os.name");
		} catch (Exception var35) {
			class124.operatingSystemName = "Unknown";
		}

		ItemContainer.formattedOperatingSystemName = class124.operatingSystemName.toLowerCase();

		try {
			JagexCache.userHomeDirectory = System.getProperty("user.home");
			if (JagexCache.userHomeDirectory != null) {
				JagexCache.userHomeDirectory = JagexCache.userHomeDirectory + "/";
			}
		} catch (Exception var34) {
		}

		try {
			if (ItemContainer.formattedOperatingSystemName.startsWith("win")) {
				if (JagexCache.userHomeDirectory == null) {
					JagexCache.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (JagexCache.userHomeDirectory == null) {
				JagexCache.userHomeDirectory = System.getenv("HOME");
			}

			if (JagexCache.userHomeDirectory != null) { // L: 61
				JagexCache.userHomeDirectory = JagexCache.userHomeDirectory + "/";
			}
		} catch (Exception var33) {
		}

		if (JagexCache.userHomeDirectory == null) {
			JagexCache.userHomeDirectory = "~/";
		}

		JagexCache.cacheParentPaths = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", JagexCache.userHomeDirectory, "/tmp/", ""};
		JagexCache.cacheSubPaths = new String[]{".jagex_cache_" + class151.cacheGamebuild, ".file_store_" + class151.cacheGamebuild};
		int var18 = 0;

		label318:
		while (var18 < 4) {
			String var6 = var18 == 0 ? "" : "" + var18;
			JagexCache.JagexCache_locationFile = new File(JagexCache.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var6 + ".dat");
			String var7 = null;
			String var8 = null;
			boolean var9 = false;
			Buffer var11;
			int var12;
			int var14;
			File var42;
			if (JagexCache.JagexCache_locationFile.exists()) {
				try {
					AccessFile var10 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L);

					for (var11 = new Buffer((int)var10.length()); var11.offset < var11.array.length; var11.offset += var12) { // L: 80 83
						var12 = var10.read(var11.array, var11.offset, var11.array.length - var11.offset);
						if (var12 == -1) { // L: 82
							throw new IOException();
						}
					}

					var11.offset = 0;
					var12 = var11.readUnsignedByte(); // L: 86
					if (var12 < 1 || var12 > 3) { // L: 87
						throw new IOException("" + var12);
					}

					int var13 = 0; // L: 88
					if (var12 > 1) {
						var13 = var11.readUnsignedByte();
					}

					if (var12 <= 2) {
						var7 = var11.readStringCp1252NullCircumfixed(); // L: 91
						if (var13 == 1) {
							var8 = var11.readStringCp1252NullCircumfixed();
						}
					} else {
						var7 = var11.readCESU8(); // L: 95
						if (var13 == 1) {
							var8 = var11.readCESU8();
						}
					}

					var10.close(); // L: 98
				} catch (IOException var38) {
					var38.printStackTrace(); // L: 101
				}

				if (var7 != null) {
					var42 = new File(var7);
					if (!var42.exists()) {
						var7 = null;
					}
				}

				if (var7 != null) {
					var42 = new File(var7, "test.dat");

					boolean var45;
					try {
						RandomAccessFile var19 = new RandomAccessFile(var42, "rw");
						var14 = var19.read(); // L: 115
						var19.seek(0L); // L: 116
						var19.write(var14);
						var19.seek(0L); // L: 118
						var19.close();
						var42.delete(); // L: 120
						var45 = true; // L: 121
					} catch (Exception var32) { // L: 123
						var45 = false; // L: 124
					}

					if (!var45) { // L: 127
						var7 = null; // L: 128
					}
				}
			}

			if (var7 == null && var18 == 0) { // L: 132
				label293:
				for (int var20 = 0; var20 < JagexCache.cacheSubPaths.length; ++var20) { // L: 133
					for (int var21 = 0; var21 < JagexCache.cacheParentPaths.length; ++var21) { // L: 134
						File var22 = new File(JagexCache.cacheParentPaths[var21] + JagexCache.cacheSubPaths[var20] + File.separatorChar + var0 + File.separatorChar); // L: 135
						if (var22.exists()) { // L: 136
							File var23 = new File(var22, "test.dat"); // L: 138

							boolean var47;
							try {
								RandomAccessFile var15 = new RandomAccessFile(var23, "rw"); // L: 141
								int var16 = var15.read(); // L: 142
								var15.seek(0L); // L: 143
								var15.write(var16); // L: 144
								var15.seek(0L); // L: 145
								var15.close(); // L: 146
								var23.delete(); // L: 147
								var47 = true; // L: 148
							} catch (Exception var31) { // L: 150
								var47 = false; // L: 151
							}

							if (var47) { // L: 154
								var7 = var22.toString(); // L: 155
								var9 = true; // L: 156
								break label293; // L: 157
							}
						}
					}
				}
			}

			if (var7 == null) {
				var7 = JagexCache.userHomeDirectory + File.separatorChar + "jagexcache" + var6 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
				var9 = true; // L: 165
			}

			File var41;
			if (var8 != null) { // L: 167
				var41 = new File(var8); // L: 168
				var42 = new File(var7); // L: 169

				try {
					File[] var52 = var41.listFiles();
					File[] var49 = var52;

					for (var14 = 0; var14 < var49.length; ++var14) { // L: 174
						File var48 = var49[var14];
						File var24 = new File(var42, var48.getName()); // L: 177
						boolean var17 = var48.renameTo(var24); // L: 178
						if (!var17) {
							throw new IOException();
						}
					}
				} catch (Exception var37) { // L: 184
					var37.printStackTrace(); // L: 185
				}

				var9 = true; // L: 187
			}

			if (var9) { // L: 189
				var41 = new File(var7); // L: 190
				var11 = null; // L: 191

				try {
					AccessFile var53 = new AccessFile(JagexCache.JagexCache_locationFile, "rw", 10000L); // L: 195
					Buffer var50 = new Buffer(500); // L: 196
					var50.writeByte(3); // L: 197
					var50.writeByte(var11 != null ? 1 : 0); // L: 198
					var50.writeCESU8(var41.getPath()); // L: 199
					if (var11 != null) { // L: 200
						var50.writeCESU8("");
					}

					var53.write(var50.array, 0, var50.offset); // L: 201
					var53.close(); // L: 202
				} catch (IOException var30) { // L: 204
					var30.printStackTrace(); // L: 205
				}
			}

			File var5 = new File(var7); // L: 209
			JagexCache.cacheDir = var5; // L: 211
			if (!JagexCache.cacheDir.exists()) { // L: 212
				JagexCache.cacheDir.mkdirs();
			}

			File[] var40 = JagexCache.cacheDir.listFiles(); // L: 213
			if (var40 != null) { // L: 214
				File[] var43 = var40; // L: 216

				for (int var25 = 0; var25 < var43.length; ++var25) { // L: 217
					File var26 = var43[var25]; // L: 218

					boolean var51;
					try {
						RandomAccessFile var46 = new RandomAccessFile(var26, "rw"); // L: 223
						var12 = var46.read(); // L: 224
						var46.seek(0L); // L: 225
						var46.write(var12); // L: 226
						var46.seek(0L); // L: 227
						var46.close(); // L: 228
						var51 = true; // L: 230
					} catch (Exception var29) { // L: 232
						var51 = false; // L: 233
					}

					if (!var51) { // L: 236
						++var18;
						continue label318;
					}
				}
			}
			break;
		}

		Player.method2324(JagexCache.cacheDir); // L: 243

		try {
			File var4 = new File(JagexCache.userHomeDirectory, "random.dat"); // L: 246
			int var28;
			if (var4.exists()) { // L: 247
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var4, "rw", 25L), 24, 0); // L: 248
			} else {
				label244:
				for (int var27 = 0; var27 < JagexCache.cacheSubPaths.length; ++var27) { // L: 251
					for (var28 = 0; var28 < JagexCache.cacheParentPaths.length; ++var28) { // L: 252
						File var44 = new File(JagexCache.cacheParentPaths[var28] + JagexCache.cacheSubPaths[var27] + File.separatorChar + "random.dat"); // L: 253
						if (var44.exists()) { // L: 254
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var44, "rw", 25L), 24, 0); // L: 255
							break label244; // L: 256
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) { // L: 261
				RandomAccessFile var39 = new RandomAccessFile(var4, "rw"); // L: 262
				var28 = var39.read(); // L: 263
				var39.seek(0L); // L: 264
				var39.write(var28); // L: 265
				var39.seek(0L); // L: 266
				var39.close(); // L: 267
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var4, "rw", 25L), 24, 0); // L: 268
			}
		} catch (IOException var36) { // L: 271
		}

		JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(class21.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0); // L: 273
		JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(class21.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0); // L: 274
		JagexCache.JagexCache_idxFiles = new BufferedFile[JagexCache.idxCount]; // L: 275

		for (var18 = 0; var18 < JagexCache.idxCount; ++var18) { // L: 276
			JagexCache.JagexCache_idxFiles[var18] = new BufferedFile(new AccessFile(class21.getFile("main_file_cache.idx" + var18), "rw", 1048576L), 6000, 0); // L: 277
		}

	} // L: 279

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ldi;FS)F",
		garbageValue = "255"
	)
	static float method636(class118 var0, float var1) {
		if (var0 != null && var0.method2876() != 0) { // L: 18
			if (var1 < (float)var0.field1467[0].field1407) { // L: 21
				return var0.field1454 == class117.field1451 ? var0.field1467[0].field1409 : Renderable.method4464(var0, var1, true); // L: 22 23 25
			} else if (var1 > (float)var0.field1467[var0.method2876() - 1].field1407) { // L: 27
				return var0.field1455 == class117.field1451 ? var0.field1467[var0.method2876() - 1].field1409 : Renderable.method4464(var0, var1, false); // L: 28 29 31
			} else if (var0.field1453) { // L: 33
				return var0.field1467[0].field1409; // L: 34
			} else {
				class114 var2 = var0.method2892(var1);
				boolean var3 = false;
				boolean var4 = false;
				if (var2 == null) {
					return 0.0F; // L: 125
				} else {
					if (0.0D == (double)var2.field1410 && (double)var2.field1411 == 0.0D) {
						var3 = true;
					} else if (var2.field1410 == Float.MAX_VALUE && var2.field1411 == Float.MAX_VALUE) {
						var4 = true;
					} else if (var2.field1414 != null) {
						if (var0.field1452) { // L: 47
							float[] var5 = new float[4];
							float[] var6 = new float[4];
							var5[0] = (float)var2.field1407;
							var6[0] = var2.field1409;
							var5[1] = var5[0] + 0.33333334F * var2.field1410;
							var6[1] = var6[0] + 0.33333334F * var2.field1411; // L: 53
							var5[3] = (float)var2.field1414.field1407; // L: 54
							var6[3] = var2.field1414.field1409;
							var5[2] = var5[3] - 0.33333334F * var2.field1414.field1406;
							var6[2] = var6[3] - var2.field1414.field1412 * 0.33333334F;
							if (var0.field1456) { // L: 58
								UrlRequester.method2679(var0, var5, var6);
							} else {
								InterfaceParent.method2237(var0, var5, var6); // L: 62
							}

							var0.field1452 = false;
						}
					} else {
						var3 = true; // L: 68
					}

					if (var3) { // L: 70
						return var2.field1409; // L: 71
					} else if (var4) {
						return (float)var2.field1407 != var1 && var2.field1414 != null ? var2.field1414.field1409 : var2.field1409;
					} else if (var0.field1456) { // L: 81
						float var12;
						if (var0 == null) { // L: 84
							var12 = 0.0F; // L: 85
						} else {
							float var11;
							if (var0.field1458 == var1) { // L: 89
								var11 = 0.0F; // L: 90
							} else if (var1 == var0.field1459) { // L: 92
								var11 = 1.0F; // L: 93
							} else {
								var11 = (var1 - var0.field1458) / (var0.field1459 - var0.field1458); // L: 96
							}

							float var7;
							if (var0.field1457) { // L: 99
								var7 = var11; // L: 100
							} else {
								float[] var8 = new float[]{var0.field1460[0] - var11, var0.field1460[1], var0.field1460[2], var0.field1460[3]}; // L: 103 104 105 106 107
								float[] var9 = new float[5]; // L: 108
								int var10 = class163.method3466(var8, 3, 0.0F, true, 1.0F, true, var9); // L: 109
								if (var10 == 1) { // L: 110
									var7 = var9[0]; // L: 111
								} else {
									var7 = 0.0F; // L: 114
								}
							}

							var12 = (var0.field1462[1] + var7 * (var7 * var0.field1462[3] + var0.field1462[2])) * var7 + var0.field1462[0]; // L: 117
						}

						return var12; // L: 119
					} else {
						return class28.method410(var0, var1); // L: 122
					}
				}
			}
		} else {
			return 0.0F; // L: 19
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llv;Llv;I)I",
		garbageValue = "1727737026"
	)
	static int method642(AbstractArchive var0, AbstractArchive var1) {
		int var2 = 0; // L: 160
		String[] var3 = Login.field896; // L: 162

		int var4;
		String var5;
		for (var4 = 0; var4 < var3.length; ++var4) { // L: 163
			var5 = var3[var4]; // L: 164
			if (var0.tryLoadFileByNames(var5, "")) { // L: 166
				++var2;
			}
		}

		var3 = Login.field927; // L: 171

		for (var4 = 0; var4 < var3.length; ++var4) { // L: 172
			var5 = var3[var4]; // L: 173
			if (var1.tryLoadFileByNames(var5, "")) { // L: 175
				++var2;
			}
		}

		return var2; // L: 179
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-848662673"
	)
	static long method630() {
		try {
			URL var0 = new URL(SecureRandomCallable.method2205("services", false) + "m=accountappeal/login.ws"); // L: 36
			URLConnection var1 = var0.openConnection(); // L: 37
			var1.setRequestProperty("connection", "close"); // L: 38
			var1.setDoInput(true); // L: 39
			var1.setDoOutput(true); // L: 40
			var1.setConnectTimeout(5000); // L: 41
			OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream()); // L: 42
			var2.write("data1=req"); // L: 43
			var2.flush(); // L: 44
			InputStream var3 = var1.getInputStream(); // L: 45
			Buffer var4 = new Buffer(new byte[1000]); // L: 46

			do {
				int var5 = var3.read(var4.array, var4.offset, 1000 - var4.offset); // L: 48
				if (var5 == -1) { // L: 49
					var4.offset = 0; // L: 55
					long var7 = var4.readLong(); // L: 56
					return var7; // L: 57
				}

				var4.offset += var5; // L: 50
			} while(var4.offset < 1000); // L: 51

			return 0L; // L: 52
		} catch (Exception var9) { // L: 59
			return 0L; // L: 60
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-135389463"
	)
	static void method639(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 72
		if (var1 != null) {
			var1.remove(); // L: 74
		}
	} // L: 73 75

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "43898482"
	)
	static void method640() {
		ItemContainer.itemContainers = new NodeHashTable(32); // L: 78
	} // L: 79

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lqq;J)V"
	)
	static void method643(Buffer var0, long var1) {
		var1 /= 10L; // L: 63
		if (var1 < 0L) { // L: 64
			var1 = 0L;
		} else if (var1 > 65535L) { // L: 65
			var1 = 65535L;
		}

		var0.writeShort((int)var1); // L: 66
	} // L: 67

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	static void method647() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) { // L: 11480
			int var1 = var0.group; // L: 11481
			if (FloorOverlayDefinition.loadInterface(var1)) { // L: 11482
				boolean var2 = true; // L: 11483
				Widget[] var3 = Calendar.Widget_interfaceComponents[var1]; // L: 11484

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) { // L: 11485
					if (var3[var4] != null) { // L: 11486
						var2 = var3[var4].isIf3; // L: 11487
						break;
					}
				}

				if (!var2) { // L: 11491
					var4 = (int)var0.key; // L: 11492
					Widget var5 = SpotAnimationDefinition.getWidget(var4); // L: 11493
					if (var5 != null) { // L: 11494
						class403.invalidateWidget(var5);
					}
				}
			}
		}

	} // L: 11498
}
