import java.io.File;
import java.io.RandomAccessFile;
import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("im")
public class class232 {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	static final class232 field2495;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	static final class232 field2500;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	static final class232 field2496;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	static final class232 field2497;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	static final class232 field2498;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	static final class232 field2494;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	static final class232 field2505;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lim;"
	)
	static final class232[] field2504;
	@ObfuscatedName("gx")
	@Export("refreshToken")
	static String refreshToken;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1004792327
	)
	final int field2501;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -54152801
	)
	final int field2499;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -620293915
	)
	final int field2503;

	static {
		field2495 = new class232(0, 8, 8);
		field2500 = new class232(5, 16, 16);
		field2496 = new class232(4, 32, 32);
		field2497 = new class232(3, 48, 48);
		field2498 = new class232(6, 64, 64);
		field2494 = new class232(1, 96, 96);
		field2505 = new class232(2, 128, 128);
		class232[] var0 = new class232[]{field2495, field2494, field2505, field2497, field2496, field2500, field2498};
		field2504 = var0;
		Arrays.sort(field2504, new class240());
	}

	class232(int var1, int var2, int var3) {
		this.field2501 = var1;
		this.field2499 = var2;
		this.field2503 = var3;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-17"
	)
	int method4488() {
		return this.field2499 * this.field2503;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/io/File;",
		garbageValue = "1470987644"
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
				File var2 = new File(class327.FileSystem_cacheDir, var0);
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ldt;IIIIB)V",
		garbageValue = "-17"
	)
	static final void method4489(WorldView var0, int var1, int var2, int var3, int var4) {
		int[][][] var5 = var0.tileHeights;
		int var6 = var0.sizeX - 1;
		int var7 = var0.sizeY - 1;

		for (int var8 = var2; var8 <= var2 + var4; ++var8) {
			for (int var9 = var1; var9 <= var3 + var1; ++var9) {
				if (var9 >= 0 && var9 < var5[0].length - 1 && var8 >= 0 && var8 < var5[0][0].length - 1) {
					class202.Tiles_underlays2[0][var9][var8] = 127;
					if (var9 == var1 && var9 > 0) {
						var5[0][var9][var8] = var5[0][var9 - 1][var8];
					}

					if (var3 + var1 == var9 && var9 < var6) {
						var5[0][var9][var8] = var5[0][var9 + 1][var8];
					}

					if (var8 == var2 && var8 > 0) {
						var5[0][var9][var8] = var5[0][var9][var8 - 1];
					}

					if (var8 == var2 + var4 && var8 < var7) {
						var5[0][var9][var8] = var5[0][var9][var8 + 1];
					}
				}
			}
		}

	}

	@ObfuscatedName("pg")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "458391555"
	)
	public static boolean method4491() {
		return Client.staffModLevel >= 2;
	}
}
