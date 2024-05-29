import java.io.File;
import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tt")
public abstract class class510 extends class511 {
	class510(int var1, int var2) {
		super(var1, var2);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-31"
	)
	public abstract int vmethod9046();

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-915809137"
	)
	public abstract int vmethod9049();

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "119291980"
	)
	public abstract int vmethod9047();

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;",
		garbageValue = "84"
	)
	static File method9055(String var0, String var1, int var2) {
		String var3 = var2 == 0 ? "" : "" + var2;
		JagexCache.field1889 = new File(ScriptEvent.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat");
		String var4 = null;
		String var5 = null;
		boolean var6 = false;
		Buffer var8;
		File var23;
		if (JagexCache.field1889.exists()) {
			try {
				AccessFile var7 = new AccessFile(JagexCache.field1889, "rw", 10000L);

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
			} catch (IOException var21) {
				var21.printStackTrace();
			}

			if (var4 != null) {
				var23 = new File(var4);
				if (!var23.exists()) {
					var4 = null;
				}
			}

			if (var4 != null) {
				var23 = new File(var4, "test.dat");
				if (!DelayFadeTask.method8280(var23, true)) {
					var4 = null;
				}
			}
		}

		if (var4 == null && var2 == 0) {
			label139:
			for (int var15 = 0; var15 < Script.field1016.length; ++var15) {
				for (int var16 = 0; var16 < class165.field1815.length; ++var16) {
					File var17 = new File(class165.field1815[var16] + Script.field1016[var15] + File.separatorChar + var0 + File.separatorChar);
					if (var17.exists() && DelayFadeTask.method8280(new File(var17, "test.dat"), true)) {
						var4 = var17.toString();
						var6 = true;
						break label139;
					}
				}
			}
		}

		if (var4 == null) {
			var4 = ScriptEvent.userHomeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
			var6 = true;
		}

		File var22;
		if (var5 != null) {
			var22 = new File(var5);
			var23 = new File(var4);

			try {
				File[] var24 = var22.listFiles();
				File[] var18 = var24;

				for (int var11 = 0; var11 < var18.length; ++var11) {
					File var12 = var18[var11];
					File var13 = new File(var23, var12.getName());
					boolean var14 = var12.renameTo(var13);
					if (!var14) {
						throw new IOException();
					}
				}
			} catch (Exception var20) {
				var20.printStackTrace();
			}

			var6 = true;
		}

		if (var6) {
			var22 = new File(var4);
			var8 = null;

			try {
				AccessFile var25 = new AccessFile(JagexCache.field1889, "rw", 10000L);
				Buffer var26 = new Buffer(500);
				var26.writeByte(3);
				var26.writeByte(var8 != null ? 1 : 0);
				var26.writeCESU8(var22.getPath());
				if (var8 != null) {
					var26.writeCESU8("");
				}

				var25.write(var26.array, 0, var26.offset);
				var25.close();
			} catch (IOException var19) {
				var19.printStackTrace();
			}
		}

		return new File(var4);
	}
}
