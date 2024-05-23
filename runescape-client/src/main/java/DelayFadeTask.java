import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qj")
@Implements("DelayFadeTask")
public class DelayFadeTask extends SongTask {
	@ObfuscatedName("ic")
	@ObfuscatedGetter(
		intValue = 135729133
	)
	static int field4786;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		longValue = -8846500232165804043L
	)
	long field4785;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1905821101
	)
	int field4784;

	@ObfuscatedSignature(
		descriptor = "(Lre;I)V"
	)
	public DelayFadeTask(SongTask var1, int var2) {
		super(var1);
		this.field4784 = var2;
		super.field4793 = "DelayFadeTask";
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1230726323"
	)
	public boolean vmethod8329() {
		if (this.field4785 < (long)this.field4784) {
			++this.field4785;
			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;ZS)Z",
		garbageValue = "10304"
	)
	static boolean method8280(File var0, boolean var1) {
		try {
			RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
			int var3 = var2.read();
			var2.seek(0L);
			var2.write(var3);
			var2.seek(0L);
			var2.close();
			if (var1) {
				var0.delete();
			}

			return true;
		} catch (Exception var4) {
			return false;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BII)I",
		garbageValue = "-195520347"
	)
	@Export("encodeStringCp1252")
	public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1;

		for (int var6 = 0; var6 < var5; ++var6) {
			char var7 = var0.charAt(var6 + var1);
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) {
				var3[var6 + var4] = (byte)var7;
			} else if (var7 == 8364) {
				var3[var6 + var4] = -128;
			} else if (var7 == 8218) {
				var3[var6 + var4] = -126;
			} else if (var7 == 402) {
				var3[var6 + var4] = -125;
			} else if (var7 == 8222) {
				var3[var6 + var4] = -124;
			} else if (var7 == 8230) {
				var3[var6 + var4] = -123;
			} else if (var7 == 8224) {
				var3[var6 + var4] = -122;
			} else if (var7 == 8225) {
				var3[var6 + var4] = -121;
			} else if (var7 == 710) {
				var3[var6 + var4] = -120;
			} else if (var7 == 8240) {
				var3[var6 + var4] = -119;
			} else if (var7 == 352) {
				var3[var6 + var4] = -118;
			} else if (var7 == 8249) {
				var3[var6 + var4] = -117;
			} else if (var7 == 338) {
				var3[var6 + var4] = -116;
			} else if (var7 == 381) {
				var3[var6 + var4] = -114;
			} else if (var7 == 8216) {
				var3[var6 + var4] = -111;
			} else if (var7 == 8217) {
				var3[var6 + var4] = -110;
			} else if (var7 == 8220) {
				var3[var6 + var4] = -109;
			} else if (var7 == 8221) {
				var3[var6 + var4] = -108;
			} else if (var7 == 8226) {
				var3[var6 + var4] = -107;
			} else if (var7 == 8211) {
				var3[var6 + var4] = -106;
			} else if (var7 == 8212) {
				var3[var6 + var4] = -105;
			} else if (var7 == 732) {
				var3[var6 + var4] = -104;
			} else if (var7 == 8482) {
				var3[var6 + var4] = -103;
			} else if (var7 == 353) {
				var3[var6 + var4] = -102;
			} else if (var7 == 8250) {
				var3[var6 + var4] = -101;
			} else if (var7 == 339) {
				var3[var6 + var4] = -100;
			} else if (var7 == 382) {
				var3[var6 + var4] = -98;
			} else if (var7 == 376) {
				var3[var6 + var4] = -97;
			} else {
				var3[var6 + var4] = 63;
			}
		}

		return var5;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lor;II)Z",
		garbageValue = "1511776240"
	)
	@Export("updateExternalPlayer")
	static boolean updateExternalPlayer(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1);
		if (var2 == null) {
			return false;
		} else {
			class185.SpriteBuffer_decode(var2);
			return true;
		}
	}

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(Ldt;Luk;B)V",
		garbageValue = "9"
	)
	static void method8284(class101 var0, PacketBuffer var1) {
		int var2 = var1.readUnsignedShort();
		class475 var3 = var0.field1347[var2];
		class101 var4 = var3.field4947;
		var4.field1337 = var1.readUnsignedShort();
		var4.field1333 = var1.readUnsignedShort();
		var4.field1336.method2776(var1, false);
		int var5 = var4.field1346 / 8;
		int var6 = var4.field1330 / 8;
		int var7 = var1.readUnsignedShort();
		var1.importIndex();

		int var8;
		int var9;
		int var10;
		int var11;
		for (var8 = 0; var8 < 4; ++var8) {
			for (var9 = 0; var9 < var5; ++var9) {
				for (var10 = 0; var10 < var6; ++var10) {
					var11 = var1.readBits(1);
					if (var11 == 1) {
						Client.field601[var8][var9][var10] = var1.readBits(26);
					} else {
						Client.field601[var8][var9][var10] = -1;
					}
				}
			}
		}

		var1.exportIndex();
		class508.field5102 = new int[var7][4];

		for (var8 = 0; var8 < var7; ++var8) {
			for (var9 = 0; var9 < 4; ++var9) {
				class508.field5102[var8][var9] = var1.readInt();
			}
		}

		UserComparator4.field1495 = new int[var7];
		class148.field1696 = new int[var7];
		class47.field333 = new int[var7];
		SpriteMask.field3706 = new byte[var7][];
		class135.field1636 = new byte[var7][];
		var7 = 0;

		for (var8 = 0; var8 < 4; ++var8) {
			for (var9 = 0; var9 < var5; ++var9) {
				for (var10 = 0; var10 < var6; ++var10) {
					var11 = Client.field601[var8][var9][var10];
					if (var11 != -1) {
						int var12 = var11 >> 14 & 1023;
						int var13 = var11 >> 3 & 2047;
						int var14 = (var12 / 8 << 8) + var13 / 8;

						int var15;
						for (var15 = 0; var15 < var7; ++var15) {
							if (UserComparator4.field1495[var15] == var14) {
								var14 = -1;
								break;
							}
						}

						if (var14 != -1) {
							UserComparator4.field1495[var7] = var14;
							var15 = var14 >> 8 & 255;
							int var16 = var14 & 255;
							class148.field1696[var7] = SceneTilePaint.archive9.getGroupId("m" + var15 + "_" + var16);
							class47.field333[var7] = SceneTilePaint.archive9.getGroupId("l" + var15 + "_" + var16);
							++var7;
						}
					}
				}
			}
		}

		class105.updateGameState(25);
		Client.field684 = true;
		class30.field155 = var4;
		class142.method3190(var4);
	}
}
