import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gc")
@Implements("FloorOverlayDefinition")
public class FloorOverlayDefinition extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lln;")

	@Export("FloorOverlayDefinition_archive")
	public static AbstractArchive FloorOverlayDefinition_archive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lig;")

	@Export("FloorOverlayDefinition_cached")
	public static EvictingDualNodeHashTable FloorOverlayDefinition_cached;
	@ObfuscatedName("u")
	@Export("ByteArrayPool_alternativeSizes")
	static int[] ByteArrayPool_alternativeSizes;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	858309139)

	@Export("primaryRgb")
	public int primaryRgb;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	-297032293)

	@Export("texture")
	public int texture;
	@ObfuscatedName("b")
	@Export("hideUnderlay")
	public boolean hideUnderlay;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	183406227)

	@Export("secondaryRgb")
	public int secondaryRgb;
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 
	-769091361)

	@Export("hue")
	public int hue;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	-1068550667)

	@Export("saturation")
	public int saturation;
	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 
	539781723)

	@Export("lightness")
	public int lightness;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	1744203063)

	@Export("secondaryHue")
	public int secondaryHue;
	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 
	-1545602265)

	@Export("secondarySaturation")
	public int secondarySaturation;
	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = 
	658215089)

	@Export("secondaryLightness")
	public int secondaryLightness;
	static 
	{
		FloorOverlayDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	FloorOverlayDefinition() {
		this.primaryRgb = 0;
		this.texture = -1;
		this.hideUnderlay = true;
		this.secondaryRgb = -1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1367888420")

	@Export("postDecode")
	void postDecode() {
		if (this.secondaryRgb != (-1)) {
			this.setHsl(this.secondaryRgb);
			this.secondaryHue = this.hue;
			this.secondarySaturation = this.saturation;
			this.secondaryLightness = this.lightness;
		}

		this.setHsl(this.primaryRgb);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;II)V", garbageValue = 
	"1515870395")

	@Export("decode")
	void decode(Buffer var1, int var2) {
		while (true) {
			int var3 = var1.readUnsignedByte();
			if (var3 == 0) {
				return;
			}

			this.decodeNext(var1, var3, var2);
		} 
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;III)V", garbageValue = 
	"-343485551")

	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2, int var3) {
		if (var2 == 1) {
			this.primaryRgb = var1.readMedium();
		} else if (var2 == 2) {
			this.texture = var1.readUnsignedByte();
		} else if (var2 == 5) {
			this.hideUnderlay = false;
		} else if (var2 == 7) {
			this.secondaryRgb = var1.readMedium();
		} else if (var2 == 8) {
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"1828314979")

	@Export("setHsl")
	void setHsl(int var1) {
		double var2 = ((double) ((var1 >> 16) & 255)) / 256.0;
		double var4 = ((double) ((var1 >> 8) & 255)) / 256.0;
		double var6 = ((double) (var1 & 255)) / 256.0;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}

		if (var6 < var8) {
			var8 = var6;
		}

		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}

		if (var6 > var10) {
			var10 = var6;
		}

		double var12 = 0.0;
		double var14 = 0.0;
		double var16 = (var8 + var10) / 2.0;
		if (var8 != var10) {
			if (var16 < 0.5) {
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5) {
				var14 = (var10 - var8) / ((2.0 - var10) - var8);
			}

			if (var10 == var2) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var10 == var4) {
				var12 = 2.0 + ((var6 - var2) / (var10 - var8));
			} else if (var10 == var6) {
				var12 = ((var2 - var4) / (var10 - var8)) + 4.0;
			}
		}

		var12 /= 6.0;
		this.hue = ((int) (var12 * 256.0));
		this.saturation = ((int) (256.0 * var14));
		this.lightness = ((int) (256.0 * var16));
		if (this.saturation < 0) {
			this.saturation = 0;
		} else if (this.saturation > 255) {
			this.saturation = 255;
		}

		if (this.lightness < 0) {
			this.lightness = 0;
		} else if (this.lightness > 255) {
			this.lightness = 255;
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;Ljava/lang/String;IIB)V", garbageValue = 
	"55")

	public static void method3788(String var0, String var1, int var2, int var3) throws IOException {
		JagexCache.idxCount = var3;
		WorldMapSection1.cacheGamebuild = var2;

		try {
			class10.operatingSystemName = System.getProperty("os.name");
		} catch (Exception var15) {
			class10.operatingSystemName = "Unknown";
		}

		class128.formattedOperatingSystemName = class10.operatingSystemName.toLowerCase();

		try {
			NetSocket.userHomeDirectory = System.getProperty("user.home");
			if (NetSocket.userHomeDirectory != null) {
				NetSocket.userHomeDirectory = NetSocket.userHomeDirectory + "/";
			}
		} catch (Exception var14) {
		}

		try {
			if (class128.formattedOperatingSystemName.startsWith("win")) {
				if (NetSocket.userHomeDirectory == null) {
					NetSocket.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (NetSocket.userHomeDirectory == null) {
				NetSocket.userHomeDirectory = System.getenv("HOME");
			}

			if (NetSocket.userHomeDirectory != null) {
				NetSocket.userHomeDirectory = NetSocket.userHomeDirectory + "/";
			}
		} catch (Exception var13) {
		}

		if (NetSocket.userHomeDirectory == null) {
			NetSocket.userHomeDirectory = "~/";
		}

		ItemContainer.cacheParentPaths = new String[]{ "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", NetSocket.userHomeDirectory, "/tmp/", "" };
		class216.cacheSubPaths = new String[]{ ".jagex_cache_" + WorldMapSection1.cacheGamebuild, ".file_store_" + WorldMapSection1.cacheGamebuild };
		int var9 = 0;

		label128 : while (
		var9 < 4) {
			JagexCache.cacheDir = WorldMapArea.method4036(var0, var1, var9);
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
					break label128;
				}

				File var8 = var6[var7];
				if (!AbstractWorldMapIcon.method4405(var8, false)) {
					++var9;
					break;
				}

				++var7;
			} 
		} 

		class128.method2856(JagexCache.cacheDir);

		try {
			File var4 = new File(NetSocket.userHomeDirectory, "random.dat");
			int var11;
			if (var4.exists()) {
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var4, "rw", 25L), 24, 0);
			} else {
				label110 : for (
				int var10 = 0; var10 < class216.cacheSubPaths.length; ++var10) {
					for (var11 = 0; var11 < ItemContainer.cacheParentPaths.length; ++var11) {
						File var12 = new File(((ItemContainer.cacheParentPaths[var11] + class216.cacheSubPaths[var10]) + File.separatorChar) + "random.dat");
						if (var12.exists()) {
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var12, "rw", 25L), 24, 0);
							break label110;
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

		JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(Message.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
		JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(Message.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
		class115.JagexCache_idxFiles = new BufferedFile[JagexCache.idxCount];

		for (var9 = 0; var9 < JagexCache.idxCount; ++var9) {
			class115.JagexCache_idxFiles[var9] = new BufferedFile(new AccessFile(Message.getFile("main_file_cache.idx" + var9), "rw", 1048576L), 6000, 0);
		}

	}
}