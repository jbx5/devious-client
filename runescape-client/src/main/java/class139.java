import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
public class class139 extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 819829641
	)
	int field1605;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[[Lfz;"
	)
	public class132[][] field1603;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[[Lfz;"
	)
	class132[][] field1610;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	public Skeleton field1606;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 629474045
	)
	int field1607;
	@ObfuscatedName("ah")
	boolean field1608;
	@ObfuscatedName("am")
	Future field1609;
	@ObfuscatedName("av")
	List field1604;

	@ObfuscatedSignature(
		descriptor = "(Lom;Lom;IZ)V",
		garbageValue = "0"
	)
	public class139(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		this.field1603 = null;
		this.field1610 = null;
		this.field1607 = 0;
		this.field1605 = var3;
		byte[] var5 = var1.takeFile(this.field1605 >> 16 & 65535, this.field1605 & 65535);
		Buffer var6 = new Buffer(var5);
		int var7 = var6.readUnsignedByte();
		int var8 = var6.readUnsignedShort();
		byte[] var9 = var2.getFile(var8, 0);
		this.field1606 = new Skeleton(var8, var9);
		this.field1604 = new ArrayList();
		this.field1609 = SoundCache.field333.submit(new class136(this, var6, var7));
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;II)V",
		garbageValue = "2000104113"
	)
	void method3103(Buffer var1, int var2) {
		var1.readUnsignedShort();
		var1.readUnsignedShort();
		this.field1607 = var1.readUnsignedByte();
		int var3 = var1.readUnsignedShort();
		this.field1610 = new class132[this.field1606.method4657().method4604()][];
		this.field1603 = new class132[this.field1606.method4654()][];
		class131[] var4 = new class131[var3];

		int var5;
		int var7;
		for (var5 = 0; var5 < var3; ++var5) {
			class133 var12 = class406.method7419(var1.readUnsignedByte());
			var7 = var1.readShortSmart();
			class134 var13 = class179.method3553(var1.readUnsignedByte());
			class132 var14 = new class132();
			var14.method3029(var1, var2);
			var4[var5] = new class131(this, var14, var12, var13, var7);
			int var10 = var12.method3048();
			class132[][] var15;
			if (var12 == class133.field1569) {
				var15 = this.field1610;
			} else {
				var15 = this.field1603;
			}

			if (var15[var7] == null) {
				var15[var7] = new class132[var10];
			}

			if (var12 == class133.field1565) {
				this.field1608 = true;
			}
		}

		var5 = var3 / MusicPatchPcmStream.field3510;
		int var6 = var3 % MusicPatchPcmStream.field3510;
		int var8 = 0;

		for (int var9 = 0; var9 < MusicPatchPcmStream.field3510; ++var9) {
			var7 = var8;
			var8 += var5;
			if (var6 > 0) {
				++var8;
				--var6;
			}

			if (var8 == var7) {
				break;
			}

			this.field1604.add(SoundCache.field333.submit(new class138(this, var7, var8, var4)));
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	public boolean method3091() {
		if (this.field1609 == null && this.field1604 == null) {
			return true;
		} else {
			if (this.field1609 != null) {
				if (!this.field1609.isDone()) {
					return false;
				}

				this.field1609 = null;
			}

			boolean var1 = true;

			for (int var2 = 0; var2 < this.field1604.size(); ++var2) {
				if (!((Future)this.field1604.get(var2)).isDone()) {
					var1 = false;
				} else {
					this.field1604.remove(var2);
					--var2;
				}
			}

			if (!var1) {
				return false;
			} else {
				this.field1604 = null;
				return true;
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-17"
	)
	public int method3107() {
		return this.field1607;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-19"
	)
	public boolean method3088() {
		return this.field1608;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILed;III)V",
		garbageValue = "2056920821"
	)
	public void method3089(int var1, class129 var2, int var3, int var4) {
		class465 var5 = ParamComposition.method3936();
		this.method3090(var5, var3, var2, var1);
		this.method3086(var5, var3, var2, var1);
		this.method3097(var5, var3, var2, var1);
		var2.method2988(var5);
		var5.method8399();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lrb;ILed;II)V",
		garbageValue = "8414091"
	)
	void method3090(class465 var1, int var2, class129 var3, int var4) {
		float[] var5 = var3.method2972(this.field1607);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1610[var2] != null) {
			class132 var9 = this.field1610[var2][0];
			class132 var10 = this.field1610[var2][1];
			class132 var11 = this.field1610[var2][2];
			if (var9 != null) {
				var6 = var9.method3022(var4);
			}

			if (var10 != null) {
				var7 = var10.method3022(var4);
			}

			if (var11 != null) {
				var8 = var11.method3022(var4);
			}
		}

		class464 var16 = Friend.method8028();
		var16.method8318(1.0F, 0.0F, 0.0F, var6);
		class464 var14 = Friend.method8028();
		var14.method8318(0.0F, 1.0F, 0.0F, var7);
		class464 var15 = Friend.method8028();
		var15.method8318(0.0F, 0.0F, 1.0F, var8);
		class464 var12 = Friend.method8028();
		var12.method8326(var15);
		var12.method8326(var16);
		var12.method8326(var14);
		class465 var13 = ParamComposition.method3936();
		var13.method8368(var12);
		var1.method8359(var13);
		var16.method8338();
		var14.method8338();
		var15.method8338();
		var12.method8338();
		var13.method8399();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lrb;ILed;II)V",
		garbageValue = "1859229364"
	)
	void method3097(class465 var1, int var2, class129 var3, int var4) {
		float[] var5 = var3.method2981(this.field1607);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1610[var2] != null) {
			class132 var9 = this.field1610[var2][3];
			class132 var10 = this.field1610[var2][4];
			class132 var11 = this.field1610[var2][5];
			if (var9 != null) {
				var6 = var9.method3022(var4);
			}

			if (var10 != null) {
				var7 = var10.method3022(var4);
			}

			if (var11 != null) {
				var8 = var11.method3022(var4);
			}
		}

		var1.field4785[12] = var6;
		var1.field4785[13] = var7;
		var1.field4785[14] = var8;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lrb;ILed;IB)V",
		garbageValue = "2"
	)
	void method3086(class465 var1, int var2, class129 var3, int var4) {
		float[] var5 = var3.method2974(this.field1607);
		float var6 = var5[0];
		float var7 = var5[1];
		float var8 = var5[2];
		if (this.field1610[var2] != null) {
			class132 var9 = this.field1610[var2][6];
			class132 var10 = this.field1610[var2][7];
			class132 var11 = this.field1610[var2][8];
			if (var9 != null) {
				var6 = var9.method3022(var4);
			}

			if (var10 != null) {
				var7 = var10.method3022(var4);
			}

			if (var11 != null) {
				var8 = var11.method3022(var4);
			}
		}

		class465 var12 = ParamComposition.method3936();
		var12.method8380(var6, var7, var8);
		var1.method8359(var12);
		var12.method8399();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIB)V",
		garbageValue = "8"
	)
	public static void method3110(String var0, String var1, String var2, int var3, int var4) throws IOException {
		if (var1 != null && !var1.isEmpty()) {
			var0 = var0 + "-" + var1;
		}

		UrlRequester.field1438 = var4;
		FileSystem.cacheGamebuild = var3;

		try {
			GrandExchangeOfferNameComparator.field4377 = System.getProperty("os.name");
		} catch (Exception var19) {
			GrandExchangeOfferNameComparator.field4377 = "Unknown";
		}

		class223.field2350 = GrandExchangeOfferNameComparator.field4377.toLowerCase();
		DevicePcmPlayerProvider.userHomeDirectory = null;

		try {
			DevicePcmPlayerProvider.userHomeDirectory = System.getProperty("jagex.userhome");
		} catch (Exception var18) {
		}

		if (DevicePcmPlayerProvider.userHomeDirectory == null) {
			try {
				DevicePcmPlayerProvider.userHomeDirectory = System.getProperty("user.home");
			} catch (Exception var17) {
			}
		}

		if (DevicePcmPlayerProvider.userHomeDirectory != null) {
			DevicePcmPlayerProvider.userHomeDirectory = DevicePcmPlayerProvider.userHomeDirectory + "/";
		}

		try {
			if (class223.field2350.startsWith("win")) {
				if (DevicePcmPlayerProvider.userHomeDirectory == null) {
					DevicePcmPlayerProvider.userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (DevicePcmPlayerProvider.userHomeDirectory == null) {
				DevicePcmPlayerProvider.userHomeDirectory = System.getenv("HOME");
			}

			if (DevicePcmPlayerProvider.userHomeDirectory != null) {
				DevicePcmPlayerProvider.userHomeDirectory = DevicePcmPlayerProvider.userHomeDirectory + "/";
			}
		} catch (Exception var16) {
		}

		if (DevicePcmPlayerProvider.userHomeDirectory == null) {
			DevicePcmPlayerProvider.userHomeDirectory = "~/";
		}

		FriendsList.field4675 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", DevicePcmPlayerProvider.userHomeDirectory, "/tmp/", ""};
		class27.field147 = new String[]{".jagex_cache_" + FileSystem.cacheGamebuild, ".file_store_" + FileSystem.cacheGamebuild};
		int var13 = 0;

		label121:
		while (var13 < 4) {
			class500.cacheDir = InvDefinition.method3617(var0, var2, var13);
			if (!class500.cacheDir.exists()) {
				class500.cacheDir.mkdirs();
			}

			File[] var6 = class500.cacheDir.listFiles();
			if (var6 == null) {
				break;
			}

			File[] var7 = var6;
			int var8 = 0;

			while (true) {
				if (var8 >= var7.length) {
					break label121;
				}

				File var9 = var7[var8];

				boolean var10;
				try {
					RandomAccessFile var11 = new RandomAccessFile(var9, "rw");
					int var12 = var11.read();
					var11.seek(0L);
					var11.write(var12);
					var11.seek(0L);
					var11.close();
					var10 = true;
				} catch (Exception var15) {
					var10 = false;
				}

				if (!var10) {
					++var13;
					break;
				}

				++var8;
			}
		}

		File var5 = class500.cacheDir;
		FileSystem.FileSystem_cacheDir = var5;
		if (!FileSystem.FileSystem_cacheDir.exists()) {
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true;
			UserComparator5.method2904();
			JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(WallDecoration.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
			JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(WallDecoration.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
			UserComparator8.JagexCache_idxFiles = new BufferedFile[UrlRequester.field1438];

			for (int var14 = 0; var14 < UrlRequester.field1438; ++var14) {
				UserComparator8.JagexCache_idxFiles[var14] = new BufferedFile(new AccessFile(WallDecoration.getFile("main_file_cache.idx" + var14), "rw", 1048576L), 6000, 0);
			}

		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1287194553"
	)
	static void method3111() {
		WorldMapRegion.WorldMapRegion_cachedSprites.clear();
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "16777215"
	)
	static final void method3084() {
		int var0 = Players.Players_count;
		int[] var1 = Players.Players_indices;

		for (int var2 = 0; var2 < var0; ++var2) {
			Player var3 = Client.players[var1[var2]];
			if (var3 != null) {
				class6.updateActorSequence(var3, 1);
			}
		}

	}
}
