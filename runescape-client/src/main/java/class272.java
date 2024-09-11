import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ka")
public class class272 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1343333809
	)
	int field3016;

	@ObfuscatedSignature(
		descriptor = "(Lkb;I)V"
	)
	public class272(class277 var1, int var2) {
		this.field3016 = var2;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1996420004"
	)
	public int method5650() {
		return this.field3016;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "-1756615865"
	)
	static final int method5652(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var3 * var1 >> 16;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)[B",
		garbageValue = "1237037826"
	)
	public static byte[] method5649(CharSequence var0) {
		int var1 = var0.length();
		byte[] var2 = new byte[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if (var4 > 127) {
				var2[var3] = 63;
			} else {
				var2[var3] = (byte)var4;
			}
		}

		return var2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/io/File;",
		garbageValue = "-886717922"
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-10"
	)
	public static int method5654(int var0) {
		return class363.method7375(ViewportMouse.ViewportMouse_entityTags[var0]);
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(III)Ljava/lang/String;",
		garbageValue = "-484962039"
	)
	static final String method5655(int var0, int var1) {
		int var2 = var1 - var0;
		if (var2 < -9) {
			return HttpMethod.colorStartTag(16711680);
		} else if (var2 < -6) {
			return HttpMethod.colorStartTag(16723968);
		} else if (var2 < -3) {
			return HttpMethod.colorStartTag(16740352);
		} else if (var2 < 0) {
			return HttpMethod.colorStartTag(16756736);
		} else if (var2 > 9) {
			return HttpMethod.colorStartTag(65280);
		} else if (var2 > 6) {
			return HttpMethod.colorStartTag(4259584);
		} else if (var2 > 3) {
			return HttpMethod.colorStartTag(8453888);
		} else {
			return var2 > 0 ? HttpMethod.colorStartTag(12648192) : HttpMethod.colorStartTag(16776960);
		}
	}
}
