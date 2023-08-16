import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	static final WorldMapID field3043;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	static final WorldMapID field3044;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -2072119163
	)
	@Export("value")
	final int value;

	static {
		field3043 = new WorldMapID(0);
		field3044 = new WorldMapID(1);
	}

	WorldMapID(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[Lio;",
		garbageValue = "-681739410"
	)
	static class214[] method5495() {
		return new class214[]{class214.field2381, class214.field2385, class214.field2379, class214.field2380, class214.field2386, class214.field2384, class214.field2382};
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/CharSequence;III)Ljava/lang/String;",
		garbageValue = "2076822771"
	)
	public static String method5496(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			CharSequence var10 = var0[var1];
			return var10 == null ? "null" : var10.toString();
		} else {
			int var3 = var2 + var1;
			int var4 = 0;

			for (int var5 = var1; var5 < var3; ++var5) {
				CharSequence var9 = var0[var5];
				if (var9 == null) {
					var4 += 4;
				} else {
					var4 += var9.length();
				}
			}

			StringBuilder var8 = new StringBuilder(var4);

			for (int var6 = var1; var6 < var3; ++var6) {
				CharSequence var7 = var0[var6];
				if (var7 == null) {
					var8.append("null");
				} else {
					var8.append(var7);
				}
			}

			return var8.toString();
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Lhu;",
		garbageValue = "1432274466"
	)
	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0);
			var1 = new EnumComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(ZLto;I)V",
		garbageValue = "1816945767"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		if (!Client.isInInstance) {
			int var2 = var1.readUnsignedShort();
			var3 = var1.readUnsignedShortAddLE();
			var4 = var1.readUnsignedShort();
			RunException.xteaKeys = new int[var4][4];

			for (var5 = 0; var5 < var4; ++var5) {
				for (var6 = 0; var6 < 4; ++var6) {
					RunException.xteaKeys[var5][var6] = var1.readInt();
				}
			}

			class191.regions = new int[var4];
			class59.regionMapArchiveIds = new int[var4];
			PlayerCompositionColorTextureOverride.regionLandArchiveIds = new int[var4];
			UserComparator5.regionLandArchives = new byte[var4][];
			class197.regionMapArchives = new byte[var4][];
			var4 = 0;

			for (var5 = (var2 - 6) / 8; var5 <= (var2 + 6) / 8; ++var5) {
				for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
					var7 = var6 + (var5 << 8);
					class191.regions[var4] = var7;
					class59.regionMapArchiveIds[var4] = class499.archive9.getGroupId("m" + var5 + "_" + var6);
					PlayerCompositionColorTextureOverride.regionLandArchiveIds[var4] = class499.archive9.getGroupId("l" + var5 + "_" + var6);
					++var4;
				}
			}

			class316.method6003(var2, var3, true);
		} else {
			boolean var15 = var1.readUnsignedByte() == 1;
			var3 = var1.readUnsignedShort();
			var4 = var1.readUnsignedShort();
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
			RunException.xteaKeys = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					RunException.xteaKeys[var6][var7] = var1.readInt();
				}
			}

			class191.regions = new int[var5];
			class59.regionMapArchiveIds = new int[var5];
			PlayerCompositionColorTextureOverride.regionLandArchiveIds = new int[var5];
			UserComparator5.regionLandArchives = new byte[var5][];
			class197.regionMapArchives = new byte[var5][];
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
								if (class191.regions[var13] == var12) {
									var12 = -1;
									break;
								}
							}

							if (var12 != -1) {
								class191.regions[var5] = var12;
								var13 = var12 >> 8 & 255;
								int var14 = var12 & 255;
								class59.regionMapArchiveIds[var5] = class499.archive9.getGroupId("m" + var13 + "_" + var14);
								PlayerCompositionColorTextureOverride.regionLandArchiveIds[var5] = class499.archive9.getGroupId("l" + var13 + "_" + var14);
								++var5;
							}
						}
					}
				}
			}

			class316.method6003(var4, var3, !var15);
		}

	}
}
