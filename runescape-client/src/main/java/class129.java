import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.io.File;
import java.io.RandomAccessFile;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
public enum class129 implements Enum {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	field1548(0, 0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	field1546(1, 1),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	field1545(2, 2),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	field1547(3, 3),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	field1544(4, 4);

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lbg;"
	)
	@Export("pcmPlayerProvider")
	public static class51 pcmPlayerProvider;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1689495935
	)
	final int field1549;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1487275861
	)
	final int field1550;

	class129(int var3, int var4) {
		this.field1549 = var3;
		this.field1550 = var4;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "800883718"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1550;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)Ljava/io/File;",
		garbageValue = "27943"
	)
	@Export("getFile")
	static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) {
			throw new RuntimeException("");
		} else {
			File var1 = (File)FileSystem.FileSystem_cacheFiles.get(var0);
			if (var1 != null) {
				return var1;
			} else {
				File var2 = new File(FileSystem.FileSystem_cacheDir, var0);
				RandomAccessFile var3 = null;

				try {
					File var4 = new File(var2.getParent());
					if (!var4.exists()) {
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw");
						int var5 = var3.read();
						var3.seek(0L);
						var3.write(var5);
						var3.seek(0L);
						var3.close();
						FileSystem.FileSystem_cacheFiles.put(var0, var2);
						return var2;
					}
				} catch (Exception var8) {
					try {
						if (var3 != null) {
							var3.close();
							var3 = null;
						}
					} catch (Exception var7) {
					}

					throw new RuntimeException();
				}
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZI)V",
		garbageValue = "-910811303"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		if (var1) {
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (Exception var4) {
				}
			}

			if (class31.field150.startsWith("win")) {
				class286.method5688(var0, 0);
			} else if (class31.field150.startsWith("mac")) {
				class360.method6859(var0, 1, "openjs");
			} else {
				class286.method5688(var0, 2);
			}
		} else {
			class286.method5688(var0, 3);
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-43"
	)
	public static boolean method3000(int var0) {
		return (var0 >> 21 & 1) != 0;
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-47"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
			int var3 = Canvas.getTileHeight(var0, var1, class172.Client_plane) - var2;
			var0 -= WorldMapLabelSize.cameraX;
			var3 -= MouseHandler.cameraY;
			var1 -= class193.cameraZ;
			int var4 = Rasterizer3D.Rasterizer3D_sine[UserComparator10.cameraPitch];
			int var5 = Rasterizer3D.Rasterizer3D_cosine[UserComparator10.cameraPitch];
			int var6 = Rasterizer3D.Rasterizer3D_sine[class17.cameraYaw];
			int var7 = Rasterizer3D.Rasterizer3D_cosine[class17.cameraYaw];
			int var8 = var6 * var1 + var0 * var7 >> 16;
			var1 = var7 * var1 - var0 * var6 >> 16;
			var0 = var8;
			var8 = var5 * var3 - var4 * var1 >> 16;
			var1 = var4 * var3 + var5 * var1 >> 16;
			if (var1 >= 50) {
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2;
				Client.viewportTempY = var8 * Client.viewportZoom / var1 + Client.viewportHeight / 2;
			} else {
				Client.viewportTempX = -1;
				Client.viewportTempY = -1;
			}

		} else {
			Client.viewportTempX = -1;
			Client.viewportTempY = -1;
		}
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIIIILdi;I)V",
		garbageValue = "150568763"
	)
	static void method3005(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Player var13) {
		ObjectComposition var14 = MouseRecorder.getObjectDefinition(var6);
		int var15;
		int var16;
		if (var4 != 1 && var4 != 3) {
			var15 = var14.sizeX;
			var16 = var14.sizeY;
		} else {
			var15 = var14.sizeY;
			var16 = var14.sizeX;
		}

		int var17 = (var15 >> 1) + var1;
		int var18 = (var15 + 1 >> 1) + var1;
		int var19 = (var16 >> 1) + var2;
		int var20 = var2 + (var16 + 1 >> 1);
		int[][] var21 = Tiles.Tiles_heights[var0];
		int var22 = var21[var18][var20] + var21[var17][var19] + var21[var18][var19] + var21[var17][var20] >> 2;
		int var23 = (var1 << 7) + (var15 << 6);
		int var24 = (var2 << 7) + (var16 << 6);
		Model var25 = var14.getModel(var3, var4, var21, var23, var22, var24);
		if (var25 != null) {
			class332.method6230(var0, var1, var2, var5, -1, 0, 0, 31, var7 + 1, var8 + 1);
			var13.animationCycleStart = var7 + Client.cycle;
			var13.animationCycleEnd = var8 + Client.cycle;
			var13.model0 = var25;
			var13.field1140 = var15 * 64 + var1 * 128;
			var13.field1137 = var2 * 128 + var16 * 64;
			var13.tileHeight2 = var22;
			int var26;
			if (var9 > var11) {
				var26 = var9;
				var9 = var11;
				var11 = var26;
			}

			if (var10 > var12) {
				var26 = var10;
				var10 = var12;
				var12 = var26;
			}

			var13.minX = var9 + var1;
			var13.maxX = var11 + var1;
			var13.minY = var10 + var2;
			var13.maxY = var2 + var12;
		}

	}
}
