import net.runelite.mapping.ObfuscatedName;
import java.io.RandomAccessFile;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.io.IOException;
import java.io.File;
@ObfuscatedName("do")
public class class117 {
	@ObfuscatedName("c")
	boolean field1463;

	@ObfuscatedName("v")
	boolean field1459;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Ldn;")
	class116 field1468;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Ldn;")
	class116 field1461;

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "[Ldx;")
	class113[] field1462;

	@ObfuscatedName("e")
	boolean field1470;

	@ObfuscatedName("g")
	float field1464;

	@ObfuscatedName("w")
	float field1458;

	@ObfuscatedName("y")
	float[] field1465;

	@ObfuscatedName("i")
	float[] field1467;

	@ObfuscatedName("s")
	boolean field1472;

	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = 1656446909)
	int field1469;

	@ObfuscatedName("z")
	float[] field1460;

	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = -1725270903)
	int field1471;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = -1480629139)
	int field1466;

	@ObfuscatedName("k")
	float field1473;

	@ObfuscatedName("h")
	float field1474;

	class117() {
		this.field1465 = new float[4];
		this.field1467 = new float[4];
		this.field1472 = true;
		this.field1469 = 0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lqt;II)I", garbageValue = "1937348414")
	int method2702(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort();
		ScriptFrame.method1052(var1.readUnsignedByte());
		int var5 = var1.readUnsignedByte();
		class116[] var6 = new class116[]{ class116.field1455, class116.field1451, class116.field1450, class116.field1453, class116.field1454 };
		class116 var7 = ((class116) (Actor.findEnumerated(var6, var5)));
		if (var7 == null) {
			var7 = class116.field1455;
		}
		this.field1468 = var7;
		int var11 = var1.readUnsignedByte();
		class116[] var8 = new class116[]{ class116.field1455, class116.field1451, class116.field1450, class116.field1453, class116.field1454 };
		class116 var9 = ((class116) (Actor.findEnumerated(var8, var11)));
		if (var9 == null) {
			var9 = class116.field1455;
		}
		this.field1461 = var9;
		this.field1463 = var1.readUnsignedByte() != 0;
		this.field1462 = new class113[var3];
		class113 var13 = null;
		int var12;
		for (var12 = 0; var12 < var3; ++var12) {
			class113 var10 = new class113();
			var10.method2630(var1, var2);
			this.field1462[var12] = var10;
			if (var13 != null) {
				var13.field1426 = var10;
			}
			var13 = var10;
		}
		this.field1471 = this.field1462[0].field1420;
		this.field1466 = this.field1462[this.method2709() - 1].field1420;
		this.field1460 = new float[this.method2706() + 1];
		for (var12 = this.method2704(); var12 <= this.method2703(); ++var12) {
			this.field1460[var12 - this.method2704()] = WorldMapSection0.method4918(this, ((float) (var12)));
		}
		this.field1462 = null;
		this.field1473 = WorldMapSection0.method4918(this, ((float) (this.method2704() - 1)));
		this.field1474 = WorldMapSection0.method4918(this, ((float) (this.method2703() + 1)));
		return var3;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(II)F", garbageValue = "1796106515")
	public float method2701(int var1) {
		if (var1 < this.method2704()) {
			return this.field1473;
		} else {
			return var1 > this.method2703() ? this.field1474 : this.field1460[var1 - this.method2704()];
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "176047889")
	int method2704() {
		return this.field1471;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1241672779")
	int method2703() {
		return this.field1466;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "5")
	int method2706() {
		return this.method2703() - this.method2704();
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(FI)I", garbageValue = "-938650750")
	int method2705(float var1) {
		if (this.field1469 < 0 || ((float) (this.field1462[this.field1469].field1420)) > var1 || this.field1462[this.field1469].field1426 != null && ((float) (this.field1462[this.field1469].field1426.field1420)) <= var1) {
			if (var1 >= ((float) (this.method2704())) && var1 <= ((float) (this.method2703()))) {
				int var2 = this.method2709();
				int var3 = this.field1469;
				if (var2 > 0) {
					int var4 = 0;
					int var5 = var2 - 1;
					do {
						int var6 = var4 + var5 >> 1;
						if (var1 < ((float) (this.field1462[var6].field1420))) {
							if (var1 > ((float) (this.field1462[var6 - 1].field1420))) {
								var3 = var6 - 1;
								break;
							}
							var5 = var6 - 1;
						} else {
							if (var1 <= ((float) (this.field1462[var6].field1420))) {
								var3 = var6;
								break;
							}
							if (var1 < ((float) (this.field1462[var6 + 1].field1420))) {
								var3 = var6;
								break;
							}
							var4 = var6 + 1;
						}
					} while (var4 <= var5 );
				}
				if (var3 != this.field1469) {
					this.field1469 = var3;
					this.field1472 = true;
				}
				return this.field1469;
			} else {
				return -1;
			}
		} else {
			return this.field1469;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(FI)Ldx;", garbageValue = "-1377164530")
	class113 method2717(float var1) {
		int var2 = this.method2705(var1);
		return var2 >= 0 && var2 < this.field1462.length ? this.field1462[var2] : null;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "273043499")
	int method2709() {
		return this.field1462 == null ? 0 : this.field1462.length;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;III)V", garbageValue = "-1404648911")
	public static void method2727(String var0, String var1, int var2, int var3) throws IOException {
		class142.idxCount = var3;
		class93.cacheGamebuild = var2;
		try {
			class115.operatingSystemName = System.getProperty("os.name");
		} catch (Exception var15) {
			class115.operatingSystemName = "Unknown";
		}
		NetFileRequest.formattedOperatingSystemName = class115.operatingSystemName.toLowerCase();
		try {
			class123.userHomeDirectory = System.getProperty("user.home");
			if (class123.userHomeDirectory != null) {
				class123.userHomeDirectory = class123.userHomeDirectory + "/";
			}
		} catch (Exception var14) {
		}
		try {
			if (NetFileRequest.formattedOperatingSystemName.startsWith("win")) {
				if (class123.userHomeDirectory == null) {
					class123.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (class123.userHomeDirectory == null) {
				class123.userHomeDirectory = System.getenv("HOME");
			}
			if (class123.userHomeDirectory != null) {
				class123.userHomeDirectory = class123.userHomeDirectory + "/";
			}
		} catch (Exception var13) {
		}
		if (class123.userHomeDirectory == null) {
			class123.userHomeDirectory = "~/";
		}
		Fonts.cacheParentPaths = new String[]{ "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class123.userHomeDirectory, "/tmp/", "" };
		JagexCache.cacheSubPaths = new String[]{ ".jagex_cache_" + class93.cacheGamebuild, ".file_store_" + class93.cacheGamebuild };
		int var9 = 0;
		label129 : while (var9 < 4) {
			JagexCache.cacheDir = Friend.method6630(var0, var1, var9);
			if (!JagexCache.cacheDir.exists()) {
				JagexCache.cacheDir.mkdirs();
			}
			File[] var5 = JagexCache.cacheDir.listFiles();
			if (var5 == null) {
				break;
			}
			File[] var6 = var5;
			int var7 = 0;
			while (true) {
				if (var7 >= var6.length) {
					break label129;
				}
				File var8 = var6[var7];
				if (!Varcs.method2474(var8, false)) {
					++var9;
					break;
				}
				++var7;
			} 
		} 
		MilliClock.method3309(JagexCache.cacheDir);
		try {
			File var4 = new File(class123.userHomeDirectory, "random.dat");
			int var11;
			if (var4.exists()) {
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var4, "rw", 25L), 24, 0);
			} else {
				label111 : for (int var10 = 0; var10 < JagexCache.cacheSubPaths.length; ++var10) {
					for (var11 = 0; var11 < Fonts.cacheParentPaths.length; ++var11) {
						File var12 = new File(Fonts.cacheParentPaths[var11] + JagexCache.cacheSubPaths[var10] + File.separatorChar + "random.dat");
						if (var12.exists()) {
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var12, "rw", 25L), 24, 0);
							break label111;
						}
					}
				}
			}
			if (JagexCache.JagexCache_randomDat == null) {
				RandomAccessFile var17 = new RandomAccessFile(var4, "rw");
				var11 = var17.read();
				var17.seek(0L);
				var17.write(var11);
				var17.seek(0L);
				var17.close();
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var4, "rw", 25L), 24, 0);
			}
		} catch (IOException var16) {
		}
		JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(GameEngine.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
		JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(GameEngine.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
		class359.JagexCache_idxFiles = new BufferedFile[class142.idxCount];
		for (var9 = 0; var9 < class142.idxCount; ++var9) {
			class359.JagexCache_idxFiles[var9] = new BufferedFile(new AccessFile(GameEngine.getFile("main_file_cache.idx" + var9), "rw", 1048576L), 6000, 0);
		}
	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-625330098")
	static int method2719() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			int var0 = 0;
			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) {
				var0 += ((ArchiveLoader) (Client.archiveLoaders.get(var1))).loadedCount;
			}
			return var0 * 10000 / Client.field626;
		} else {
			return 10000;
		}
	}
}