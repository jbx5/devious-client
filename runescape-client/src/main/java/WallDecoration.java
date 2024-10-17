import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ku")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 512272339
	)
	@Export("z")
	int z;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 908660977
	)
	@Export("x")
	int x;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 98110665
	)
	@Export("y")
	int y;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1058608153
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -942637765
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 454787773
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1489115595
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = 7961066021200506019L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1818078851
	)
	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "64"
	)
	public static boolean method5613() {
		if (!class333.field3623.isEmpty()) {
			return true;
		} else {
			return !class333.musicSongs.isEmpty() && class333.musicSongs.get(0) != null && ((MusicSong)class333.musicSongs.get(0)).midiPcmStream != null ? ((MusicSong)class333.musicSongs.get(0)).midiPcmStream.isReady() : false;
		}
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(ZLvm;I)V",
		garbageValue = "1822551560"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0;
		int var2;
		int var3;
		int var5;
		int var6;
		int var7;
		if (!Client.isInInstance) {
			var1.method10134();
			var2 = var1.readUnsignedShortAdd();
			var3 = var1.readUnsignedShort();
			int var4 = var1.readUnsignedShort();
			class133.xteaKeys = new int[var4][4];

			for (var5 = 0; var5 < var4; ++var5) {
				for (var6 = 0; var6 < 4; ++var6) {
					class133.xteaKeys[var5][var6] = var1.readInt();
				}
			}

			MoveSpeed.regions = new int[var4];
			class159.regionMapArchiveIds = new int[var4];
			class215.regionLandArchiveIds = new int[var4];
			StudioGame.regionLandArchives = new byte[var4][];
			class4.regionMapArchives = new byte[var4][];
			var4 = 0;

			for (var5 = (var2 - 6) / 8; var5 <= (var2 + 6) / 8; ++var5) {
				for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
					var7 = var6 + (var5 << 8);
					MoveSpeed.regions[var4] = var7;
					class159.regionMapArchiveIds[var4] = EnumComposition.archive9.getGroupId("m" + var5 + "_" + var6);
					class215.regionLandArchiveIds[var4] = EnumComposition.archive9.getGroupId("l" + var5 + "_" + var6);
					++var4;
				}
			}

			MouseRecorder.method2575(var2, var3, true);
		} else {
			var2 = var1.readUnsignedShortAddLE();
			var3 = var1.readUnsignedShortAddLE();
			boolean var15 = var1.readUnsignedByteNeg() == 1;
			var5 = var1.readUnsignedShort();
			var1.importIndex();

			int var8;
			int var9;
			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = var1.readBits(1);
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26);
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1;
						}
					}
				}
			}

			var1.exportIndex();
			class133.xteaKeys = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					class133.xteaKeys[var6][var7] = var1.readInt();
				}
			}

			MoveSpeed.regions = new int[var5];
			class159.regionMapArchiveIds = new int[var5];
			class215.regionLandArchiveIds = new int[var5];
			StudioGame.regionLandArchives = new byte[var5][];
			class4.regionMapArchives = new byte[var5][];
			var5 = 0;

			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = Client.instanceChunkTemplates[var6][var7][var8];
						if (var9 != -1) {
							int var10 = var9 >> 14 & 1023;
							int var11 = var9 >> 3 & 2047;
							int var12 = (var10 / 8 << 8) + var11 / 8;

							int var13;
							for (var13 = 0; var13 < var5; ++var13) {
								if (MoveSpeed.regions[var13] == var12) {
									var12 = -1;
									break;
								}
							}

							if (var12 != -1) {
								MoveSpeed.regions[var5] = var12;
								var13 = var12 >> 8 & 255;
								int var14 = var12 & 255;
								class159.regionMapArchiveIds[var5] = EnumComposition.archive9.getGroupId("m" + var13 + "_" + var14);
								class215.regionLandArchiveIds[var5] = EnumComposition.archive9.getGroupId("l" + var13 + "_" + var14);
								++var5;
							}
						}
					}
				}
			}

			MouseRecorder.method2575(var3, var2, !var15);
		}

	}
}
