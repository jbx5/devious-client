import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("su")
@Implements("DesktopPlatformInfoProvider")
public class DesktopPlatformInfoProvider implements class476 {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 934001659
	)
	int field4823;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -350512903
	)
	int field4820;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1643880639
	)
	int field4822;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lsy;",
		garbageValue = "1568411855"
	)
	@Export("get")
	public PlatformInfo get() {
		byte var1;
		if (CollisionMap.field2347.startsWith("win")) {
			var1 = 1;
		} else if (CollisionMap.field2347.startsWith("mac")) {
			var1 = 2;
		} else if (CollisionMap.field2347.startsWith("linux")) {
			var1 = 3;
		} else {
			var1 = 4;
		}

		String var2;
		try {
			var2 = System.getProperty("os.arch").toLowerCase();
		} catch (Exception var31) {
			var2 = "";
		}

		String var3;
		try {
			var3 = System.getProperty("os.version").toLowerCase();
		} catch (Exception var30) {
			var3 = "";
		}

		String var4 = "Unknown";
		String var5 = "1.1";

		try {
			var4 = System.getProperty("java.vendor");
			var5 = System.getProperty("java.version");
		} catch (Exception var29) {
		}

		boolean var28;
		if (!var2.startsWith("amd64") && !var2.startsWith("x86_64")) {
			var28 = false;
		} else {
			var28 = true;
		}

		byte var7 = 0;
		if (var1 == 1) {
			if (var3.indexOf("4.0") != -1) {
				var7 = 1;
			} else if (var3.indexOf("4.1") != -1) {
				var7 = 2;
			} else if (var3.indexOf("4.9") != -1) {
				var7 = 3;
			} else if (var3.indexOf("5.0") != -1) {
				var7 = 4;
			} else if (var3.indexOf("5.1") != -1) {
				var7 = 5;
			} else if (var3.indexOf("5.2") != -1) {
				var7 = 8;
			} else if (var3.indexOf("6.0") != -1) {
				var7 = 6;
			} else if (var3.indexOf("6.1") != -1) {
				var7 = 7;
			} else if (var3.indexOf("6.2") != -1) {
				var7 = 9;
			} else if (var3.indexOf("6.3") != -1) {
				var7 = 10;
			} else if (var3.indexOf("10.0") != -1) {
				var7 = 11;
			}
		} else if (var1 == 2) {
			if (var3.indexOf("10.4") != -1) {
				var7 = 20;
			} else if (var3.indexOf("10.5") != -1) {
				var7 = 21;
			} else if (var3.indexOf("10.6") != -1) {
				var7 = 22;
			} else if (var3.indexOf("10.7") != -1) {
				var7 = 23;
			} else if (var3.indexOf("10.8") != -1) {
				var7 = 24;
			} else if (var3.indexOf("10.9") != -1) {
				var7 = 25;
			} else if (var3.indexOf("10.10") != -1) {
				var7 = 26;
			} else if (var3.indexOf("10.11") != -1) {
				var7 = 27;
			} else if (var3.indexOf("10.12") != -1) {
				var7 = 28;
			} else if (var3.indexOf("10.13") != -1) {
				var7 = 29;
			}
		}

		byte var8;
		if (var4.toLowerCase().indexOf("sun") != -1) {
			var8 = 1;
		} else if (var4.toLowerCase().indexOf("microsoft") != -1) {
			var8 = 2;
		} else if (var4.toLowerCase().indexOf("apple") != -1) {
			var8 = 3;
		} else if (var4.toLowerCase().indexOf("oracle") != -1) {
			var8 = 5;
		} else {
			var8 = 4;
		}

		this.method8451(var5);
		boolean var9 = false;
		int var10 = (int)(Runtime.getRuntime().maxMemory() / 1048576L) + 1;
		int var11;
		if (this.field4823 > 3) {
			var11 = Runtime.getRuntime().availableProcessors();
		} else {
			var11 = 0;
		}

		byte var12 = 0;
		String var13 = "";
		String var14 = "";
		String var15 = "";
		String var16 = "";
		String var17 = "";
		String var18 = "";
		boolean var19 = false;
		boolean var20 = false;
		boolean var21 = false;
		boolean var22 = false;
		int[] var23 = new int[3];
		boolean var24 = false;
		String var25 = "";
		String var26 = "";
		boolean var27 = false;
		return new PlatformInfo(var1, var28, var7, var8, this.field4823, this.field4820, this.field4822, false, var10, var11, var12, 0, var13, var14, var15, var16, 0, 0, 0, 0, var17, var18, var23, 0, "", "");
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-738858129"
	)
	void method8451(String var1) {
		if (var1.startsWith("1.")) {
			this.method8459(var1);
		} else {
			this.method8453(var1);
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "234184738"
	)
	void method8459(String var1) {
		String[] var2 = var1.split("\\.");

		try {
			this.field4823 = Integer.parseInt(var2[1]);
			var2 = var2[2].split("_");
			this.field4820 = Integer.parseInt(var2[0]);
			this.field4822 = Integer.parseInt(var2[1]);
		} catch (Exception var4) {
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "21471391"
	)
	void method8453(String var1) {
		String[] var2 = var1.split("\\.");

		try {
			this.field4823 = Integer.parseInt(var2[0]);
			this.field4820 = Integer.parseInt(var2[1]);
			this.field4822 = Integer.parseInt(var2[2]);
		} catch (Exception var4) {
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lnd;Ljava/lang/String;Ljava/lang/String;I)[Luu;",
		garbageValue = "-578185470"
	)
	public static IndexedSprite[] method8449(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			byte[] var7 = var0.takeFile(var3, var4);
			boolean var6;
			if (var7 == null) {
				var6 = false;
			} else {
				VarbitComposition.SpriteBuffer_decode(var7);
				var6 = true;
			}

			IndexedSprite[] var5;
			if (!var6) {
				var5 = null;
			} else {
				IndexedSprite[] var8 = new IndexedSprite[class528.SpriteBuffer_spriteCount];

				for (int var9 = 0; var9 < class528.SpriteBuffer_spriteCount; ++var9) {
					IndexedSprite var10 = var8[var9] = new IndexedSprite();
					var10.width = class528.SpriteBuffer_spriteWidth;
					var10.height = class528.SpriteBuffer_spriteHeight;
					var10.xOffset = class492.SpriteBuffer_xOffsets[var9];
					var10.yOffset = class134.SpriteBuffer_yOffsets[var9];
					var10.subWidth = class172.SpriteBuffer_spriteWidths[var9];
					var10.subHeight = class528.SpriteBuffer_spriteHeights[var9];
					var10.palette = class528.SpriteBuffer_spritePalette;
					var10.pixels = ArchiveDiskAction.SpriteBuffer_pixels[var9];
				}

				DbTableType.method8985();
				var5 = var8;
			}

			return var5;
		}
	}
}
