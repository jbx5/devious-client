import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("vh")
	@ObfuscatedSignature(
		descriptor = "Lci;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("InvDefinition_archive")
	static AbstractArchive InvDefinition_archive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("InvDefinition_cached")
	static EvictingDualNodeHashTable InvDefinition_cached;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 596783157
	)
	@Export("size")
	public int size;

	static {
		InvDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	InvDefinition() {
		this.size = 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "1869609284"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lul;II)V",
		garbageValue = "-570859961"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) {
			this.size = var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;",
		garbageValue = "116"
	)
	static File method3617(String var0, String var1, int var2) {
		String var3 = var2 == 0 ? "" : "" + var2;
		JagexCache.field1837 = new File(DevicePcmPlayerProvider.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat");
		String var4 = null;
		String var5 = null;
		boolean var6 = false;
		Buffer var8;
		int var11;
		File var27;
		if (JagexCache.field1837.exists()) {
			try {
				AccessFile var7 = new AccessFile(JagexCache.field1837, "rw", 10000L);

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
			label155:
			for (int var16 = 0; var16 < class27.field147.length; ++var16) {
				for (int var17 = 0; var17 < FriendsList.field4675.length; ++var17) {
					File var18 = new File(FriendsList.field4675[var17] + class27.field147[var16] + File.separatorChar + var0 + File.separatorChar);
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
							break label155;
						}
					}
				}
			}
		}

		if (var4 == null) {
			var4 = DevicePcmPlayerProvider.userHomeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
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
				AccessFile var34 = new AccessFile(JagexCache.field1837, "rw", 10000L);
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lom;Ljava/lang/String;Ljava/lang/String;S)[Lun;",
		garbageValue = "20693"
	)
	public static IndexedSprite[] method3618(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			IndexedSprite[] var5;
			if (!class164.method3376(var0, var3, var4)) {
				var5 = null;
			} else {
				var5 = class512.method9001();
			}

			return var5;
		}
	}
}
