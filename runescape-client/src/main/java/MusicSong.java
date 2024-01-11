import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ma")
@Implements("MusicSong")
public class MusicSong {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("musicTrackArchive")
	public AbstractArchive musicTrackArchive;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1618502737
	)
	@Export("musicTrackGroupId")
	public int musicTrackGroupId;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1807007735
	)
	@Export("musicTrackFileId")
	public int musicTrackFileId;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1010038427
	)
	@Export("musicTrackVolume")
	public int musicTrackVolume;
	@ObfuscatedName("aq")
	public float field3576;
	@ObfuscatedName("ar")
	@Export("musicTrackBoolean")
	public boolean musicTrackBoolean;
	@ObfuscatedName("ag")
	public boolean field3575;
	@ObfuscatedName("ao")
	public boolean field3579;
	@ObfuscatedName("ae")
	public boolean field3580;
	@ObfuscatedName("aa")
	boolean field3581;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	@Export("midiPcmStream")
	public MidiPcmStream midiPcmStream;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lbi;"
	)
	public SoundCache field3583;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	public MusicTrack field3584;

	@ObfuscatedSignature(
		descriptor = "(Low;Ljava/lang/String;Ljava/lang/String;IZ)V"
	)
	public MusicSong(AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field3576 = 0.0F;
		this.musicTrackBoolean = false;
		this.field3580 = false;
		this.field3581 = false;
		this.musicTrackGroupId = var1.getGroupId(var2);
		this.musicTrackFileId = var1.getFileId(this.musicTrackGroupId, var3);
		this.method6306(var1, this.musicTrackGroupId, this.musicTrackFileId, var4, var5);
	}

	@ObfuscatedSignature(
		descriptor = "(Low;IIIZ)V"
	)
	public MusicSong(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field3576 = 0.0F;
		this.musicTrackBoolean = false;
		this.field3580 = false;
		this.field3581 = false;
		this.method6306(var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Low;IIIZI)V",
		garbageValue = "-2032716005"
	)
	void method6306(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.musicTrackArchive = var1;
		this.musicTrackGroupId = var2;
		this.musicTrackFileId = var3;
		this.musicTrackVolume = var4;
		this.musicTrackBoolean = var5;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;",
		garbageValue = "122"
	)
	static File method6303(String var0, String var1, int var2) {
		String var3 = var2 == 0 ? "" : "" + var2;
		class317.field3441 = new File(RouteStrategy.userHomeDirectory, "jagex_cl_" + var0 + "_" + var1 + var3 + ".dat");
		String var4 = null;
		String var5 = null;
		boolean var6 = false;
		int var11;
		File var26;
		if (class317.field3441.exists()) {
			try {
				AccessFile var7 = new AccessFile(class317.field3441, "rw", 10000L);

				Buffer var8;
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
			} catch (IOException var24) {
				var24.printStackTrace();
			}

			if (var4 != null) {
				var26 = new File(var4);
				if (!var26.exists()) {
					var4 = null;
				}
			}

			if (var4 != null) {
				var26 = new File(var4, "test.dat");

				boolean var27;
				try {
					RandomAccessFile var15 = new RandomAccessFile(var26, "rw");
					var11 = var15.read();
					var15.seek(0L);
					var15.write(var11);
					var15.seek(0L);
					var15.close();
					var26.delete();
					var27 = true;
				} catch (Exception var22) {
					var27 = false;
				}

				if (!var27) {
					var4 = null;
				}
			}
		}

		if (var4 == null && var2 == 0) {
			label140:
			for (int var16 = 0; var16 < UserComparator3.field1458.length; ++var16) {
				for (int var17 = 0; var17 < GrandExchangeOfferOwnWorldComparator.field494.length; ++var17) {
					File var18 = new File(GrandExchangeOfferOwnWorldComparator.field494[var17] + UserComparator3.field1458[var16] + File.separatorChar + var0 + File.separatorChar);
					if (var18.exists()) {
						File var19 = new File(var18, "test.dat");

						boolean var28;
						try {
							RandomAccessFile var12 = new RandomAccessFile(var19, "rw");
							int var13 = var12.read();
							var12.seek(0L);
							var12.write(var13);
							var12.seek(0L);
							var12.close();
							var19.delete();
							var28 = true;
						} catch (Exception var21) {
							var28 = false;
						}

						if (var28) {
							var4 = var18.toString();
							var6 = true;
							break label140;
						}
					}
				}
			}
		}

		if (var4 == null) {
			var4 = RouteStrategy.userHomeDirectory + File.separatorChar + "jagexcache" + var3 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
			var6 = true;
		}

		if (var5 != null) {
			File var25 = new File(var5);
			var26 = new File(var4);

			try {
				File[] var31 = var25.listFiles();
				File[] var30 = var31;

				for (var11 = 0; var11 < var30.length; ++var11) {
					File var29 = var30[var11];
					File var20 = new File(var26, var29.getName());
					boolean var14 = var29.renameTo(var20);
					if (!var14) {
						throw new IOException();
					}
				}
			} catch (Exception var23) {
				var23.printStackTrace();
			}

			var6 = true;
		}

		if (var6) {
			class148.method3280(new File(var4), (File)null);
		}

		return new File(var4);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-33"
	)
	static boolean method6302(char var0) {
		for (int var1 = 0; var1 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var1) {
			if (var0 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var1)) {
				return true;
			}
		}

		return false;
	}
}
