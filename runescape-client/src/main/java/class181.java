import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
public class class181 {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;",
		garbageValue = "-820569311"
	)
	static File method3661(String var0, String var1, int var2) {
		String var3 = var2 == 0 ? "" : "" + var2;
		JagexCache.field2284 = new File(Login.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat");
		String var4 = null;
		String var5 = null;
		boolean var6 = false;
		Buffer var8;
		int var11;
		File var27;
		if (JagexCache.field2284.exists()) {
			try {
				AccessFile var7 = new AccessFile(JagexCache.field2284, "rw", 10000L);

				int var9;
				for (var8 = new Buffer((int)var7.length()); var8.offset < var8.array.length; var8.offset += var9) {
					var9 = var7.read(var8.array, var8.offset, var8.array.length - var8.offset);
					if (var9 == -1) {
						throw new IOException();
					}
				}

				var8.offset = 0;
				var9 = var8.readUnsignedByte();
				if (var9 < 1 || var9 > 3) {
					throw new IOException("" + var9);
				}

				int var10 = 0;
				if (var9 > 1) {
					var10 = var8.readUnsignedByte();
				}

				if (var9 <= 2) {
					var4 = var8.readStringCp1252NullCircumfixed();
					if (var10 == 1) {
						var5 = var8.readStringCp1252NullCircumfixed();
					}
				} else {
					var4 = var8.readCESU8();
					if (var10 == 1) {
						var5 = var8.readCESU8();
					}
				}

				var7.close();
			} catch (IOException var25) {
				var25.printStackTrace();
			}

			if (var4 != null) {
				var27 = new File(var4);
				if (!var27.exists()) {
					var4 = null;
				}
			}

			if (var4 != null) {
				var27 = new File(var4, "test.dat");

				boolean var28;
				try {
					RandomAccessFile var15 = new RandomAccessFile(var27, "rw");
					var11 = var15.read();
					var15.seek(0L);
					var15.write(var11);
					var15.seek(0L);
					var15.close();
					var27.delete();
					var28 = true;
				} catch (Exception var23) {
					var28 = false;
				}

				if (!var28) {
					var4 = null;
				}
			}
		}

		if (var4 == null && var2 == 0) {
			label156:
			for (int var16 = 0; var16 < class85.field1039.length; ++var16) {
				for (int var17 = 0; var17 < GameObject.field3091.length; ++var17) {
					File var18 = new File(GameObject.field3091[var17] + class85.field1039[var16] + File.separatorChar + var0 + File.separatorChar);
					if (var18.exists()) {
						File var19 = new File(var18, "test.dat");

						boolean var29;
						try {
							RandomAccessFile var12 = new RandomAccessFile(var19, "rw");
							int var13 = var12.read();
							var12.seek(0L);
							var12.write(var13);
							var12.seek(0L);
							var12.close();
							var19.delete();
							var29 = true;
						} catch (Exception var22) {
							var29 = false;
						}

						if (var29) {
							var4 = var18.toString();
							var6 = true;
							break label156;
						}
					}
				}
			}
		}

		if (var4 == null) {
			var4 = Login.userHomeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
			var6 = true;
		}

		File var26;
		if (var5 != null) {
			var26 = new File(var5);
			var27 = new File(var4);

			try {
				File[] var33 = var26.listFiles();
				File[] var31 = var33;

				for (var11 = 0; var11 < var31.length; ++var11) {
					File var30 = var31[var11];
					File var20 = new File(var27, var30.getName());
					boolean var14 = var30.renameTo(var20);
					if (!var14) {
						throw new IOException();
					}
				}
			} catch (Exception var24) {
				var24.printStackTrace();
			}

			var6 = true;
		}

		if (var6) {
			var26 = new File(var4);
			var8 = null;

			try {
				AccessFile var34 = new AccessFile(JagexCache.field2284, "rw", 10000L);
				Buffer var32 = new Buffer(500);
				var32.writeByte(3);
				var32.writeByte(var8 != null ? 1 : 0);
				var32.writeCESU8(var26.getPath());
				if (var8 != null) {
					var32.writeCESU8("");
				}

				var34.write(var32.array, 0, var32.offset);
				var34.close();
			} catch (IOException var21) {
				var21.printStackTrace();
			}
		}

		return new File(var4);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([Lcr;II[I[II)V",
		garbageValue = "450863022"
	)
	@Export("sortWorlds")
	static void sortWorlds(World[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) {
			int var5 = var1 - 1;
			int var6 = var2 + 1;
			int var7 = (var2 + var1) / 2;
			World var8 = var0[var7];
			var0[var7] = var0[var1];
			var0[var1] = var8;

			while (var5 < var6) {
				boolean var9 = true;

				int var10;
				int var11;
				int var12;
				do {
					--var6;

					for (var10 = 0; var10 < 4; ++var10) {
						if (var3[var10] == 2) {
							var11 = var0[var6].index;
							var12 = var8.index;
						} else if (var3[var10] == 1) {
							var11 = var0[var6].population;
							var12 = var8.population;
							if (var11 == -1 && var4[var10] == 1) {
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) {
								var12 = 2001;
							}
						} else if (var3[var10] == 3) {
							var11 = var0[var6].isMembersOnly() ? 1 : 0;
							var12 = var8.isMembersOnly() ? 1 : 0;
						} else {
							var11 = var0[var6].id;
							var12 = var8.id;
						}

						if (var12 != var11) {
							if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) {
								var9 = false;
							}
							break;
						}

						if (var10 == 3) {
							var9 = false;
						}
					}
				} while(var9);

				var9 = true;

				do {
					++var5;

					for (var10 = 0; var10 < 4; ++var10) {
						if (var3[var10] == 2) {
							var11 = var0[var5].index;
							var12 = var8.index;
						} else if (var3[var10] == 1) {
							var11 = var0[var5].population;
							var12 = var8.population;
							if (var11 == -1 && var4[var10] == 1) {
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) {
								var12 = 2001;
							}
						} else if (var3[var10] == 3) {
							var11 = var0[var5].isMembersOnly() ? 1 : 0;
							var12 = var8.isMembersOnly() ? 1 : 0;
						} else {
							var11 = var0[var5].id;
							var12 = var8.id;
						}

						if (var11 != var12) {
							if ((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) {
								var9 = false;
							}
							break;
						}

						if (var10 == 3) {
							var9 = false;
						}
					}
				} while(var9);

				if (var5 < var6) {
					World var13 = var0[var5];
					var0[var5] = var0[var6];
					var0[var6] = var13;
				}
			}

			sortWorlds(var0, var1, var6, var3, var4);
			sortWorlds(var0, var6 + 1, var2, var3, var4);
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "111"
	)
	protected static final int method3656() {
		return GameEngine.keyHandler.method360();
	}
}
