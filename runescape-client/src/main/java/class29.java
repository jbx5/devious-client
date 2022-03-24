import java.applet.Applet;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("au")
public class class29 {
	@ObfuscatedName("v")
	public static Applet field168;
	@ObfuscatedName("o")
	public static String field169;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(descriptor = 
	"[Lqx;")

	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("ee")
	@ObfuscatedGetter(longValue = 
	-3391706969016340745L)

	static long field165;
	static 
	{
		field168 = null;
		field169 = "";
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"([BS)Lql;", garbageValue = 
	"-13194")

	public static final SpritePixels method433(byte[] var0) {
		BufferedImage var1 = null;

		try {
			var1 = ImageIO.read(new ByteArrayInputStream(var0));
			int var2 = var1.getWidth();
			int var3 = var1.getHeight();
			int[] var4 = new int[var3 * var2];
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var2, var3, var4, 0, var2);
			var5.grabPixels();
			return new SpritePixels(var4, var2, var3);
		} catch (IOException var7) {
		} catch (InterruptedException var8) {
		}

		return new SpritePixels(0, 0);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;", garbageValue = 
	"717512947")

	public static File method431(String var0, String var1, int var2) {
		String var3 = (var2 == 0) ? "" : "" + var2;
		AccessFile.JagexCache_locationFile = new File(class230.userHomeDirectory, (((("jagex_cl_" + var0) + "_") + var1) + var3) + ".dat");
		String var4 = null;
		String var5 = null;
		boolean var6 = false;
		File var22;
		if (AccessFile.JagexCache_locationFile.exists()) {
			try {
				AccessFile var7 = new AccessFile(AccessFile.JagexCache_locationFile, "rw", 10000L);

				Buffer var8;
				int var9;
				for (var8 = new Buffer(((int) (var7.length()))); var8.offset < var8.array.length; var8.offset += var9) {
					var9 = var7.read(var8.array, var8.offset, var8.array.length - var8.offset);
					if (var9 == (-1)) {
						throw new IOException();
					}
				}

				var8.offset = 0;
				var9 = var8.readUnsignedByte();
				if ((var9 < 1) || (var9 > 3)) {
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
			} catch (IOException var20) {
				var20.printStackTrace();
			}

			if (var4 != null) {
				var22 = new File(var4);
				if (!var22.exists()) {
					var4 = null;
				}
			}

			if (var4 != null) {
				var22 = new File(var4, "test.dat");
				if (!SecureRandomCallable.method2069(var22, true)) {
					var4 = null;
				}
			}
		}

		if ((var4 == null) && (var2 == 0)) {
			label125 : for (
			int var15 = 0; var15 < WorldMapSection1.cacheSubPaths.length; ++var15) {
				for (int var16 = 0; var16 < PendingSpawn.cacheParentPaths.length; ++var16) {
					File var17 = new File((((PendingSpawn.cacheParentPaths[var16] + WorldMapSection1.cacheSubPaths[var15]) + File.separatorChar) + var0) + File.separatorChar);
					if (var17.exists() && SecureRandomCallable.method2069(new File(var17, "test.dat"), true)) {
						var4 = var17.toString();
						var6 = true;
						break label125;
					}
				}
			}
		}

		if (var4 == null) {
			var4 = (((((((class230.userHomeDirectory + File.separatorChar) + "jagexcache") + var3) + File.separatorChar) + var0) + File.separatorChar) + var1) + File.separatorChar;
			var6 = true;
		}

		if (var5 != null) {
			File var21 = new File(var5);
			var22 = new File(var4);

			try {
				File[] var23 = var21.listFiles();
				File[] var18 = var23;

				for (int var11 = 0; var11 < var18.length; ++var11) {
					File var12 = var18[var11];
					File var13 = new File(var22, var12.getName());
					boolean var14 = var12.renameTo(var13);
					if (!var14) {
						throw new IOException();
					}
				}
			} catch (Exception var19) {
				var19.printStackTrace();
			}

			var6 = true;
		}

		if (var6) {
			ViewportMouse.method4493(new File(var4), ((File) (null)));
		}

		return new File(var4);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"([BI)Ljava/lang/String;", garbageValue = 
	"2046831505")

	public static String method425(byte[] var0) {
		int var2 = var0.length;
		StringBuilder var3 = new StringBuilder();

		for (int var4 = 0; var4 < (var2 + 0); var4 += 3) {
			int var5 = var0[var4] & 255;
			var3.append(class346.field4147[var5 >>> 2]);
			if (var4 < (var2 - 1)) {
				int var6 = var0[var4 + 1] & 255;
				var3.append(class346.field4147[((var5 & 3) << 4) | (var6 >>> 4)]);
				if (var4 < (var2 - 2)) {
					int var7 = var0[var4 + 2] & 255;
					var3.append(class346.field4147[((var6 & 15) << 2) | (var7 >>> 6)]).append(class346.field4147[var7 & 63]);
				} else {
					var3.append(class346.field4147[(var6 & 15) << 2]).append("=");
				}
			} else {
				var3.append(class346.field4147[(var5 & 3) << 4]).append("==");
			}
		}

		String var1 = var3.toString();
		return var1;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(IIIII)V", garbageValue = 
	"1353852155")

	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = ((ItemContainer) (ItemContainer.itemContainers.get(((long) (var0)))));
		if (var4 == null) {
			var4 = new ItemContainer();
			ItemContainer.itemContainers.put(var4, ((long) (var0)));
		}

		if (var4.ids.length <= var1) {
			int[] var5 = new int[var1 + 1];
			int[] var6 = new int[var1 + 1];

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) {
				var5[var7] = var4.ids[var7];
				var6[var7] = var4.quantities[var7];
			}

			for (var7 = var4.ids.length; var7 < var1; ++var7) {
				var5[var7] = -1;
				var6[var7] = 0;
			}

			var4.ids = var5;
			var4.quantities = var6;
		}

		var4.ids[var1] = var2;
		var4.quantities[var1] = var3;
	}
}