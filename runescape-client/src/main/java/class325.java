import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mh")
public final class class325 {
	@ObfuscatedName("ag")
	static final HashMap field3549;

	static {
		field3549 = new HashMap();
		TimeZone var0;
		synchronized(field3549) {
			TimeZone var2 = (TimeZone)field3549.get("Europe/London");
			if (var2 == null) {
				var2 = TimeZone.getTimeZone("Europe/London");
				field3549.put("Europe/London", var2);
			}

			var0 = var2;
		}

		java.util.Calendar.getInstance(var0);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I[III)V",
		garbageValue = "1967563830"
	)
	static void method6121(int var0, int[] var1, int var2) {
		for (int var3 = 0; var3 < class333.KitDefinition_fileCount; ++var3) {
			KitDefinition var4 = PcmPlayer.KitDefinition_get(var3);
			if (var4 != null && !var4.nonSelectable && var4.bodypartID == (var0 == 1 ? 7 : 0) + var2) {
				var1[PlayerComposition.equipmentIndices[var2]] = var3 + 256;
				break;
			}
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "969724405"
	)
	static final int method6120(int var0, int var1, int var2, int var3) {
		int var4 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var2 * 1024 / var3] >> 1;
		return ((65536 - var4) * var0 >> 16) + (var4 * var1 >> 16);
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1088804478"
	)
	static boolean method6119() {
		return (Client.drawPlayerNames & 1) != 0;
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(ZLug;B)V",
		garbageValue = "1"
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
			var1.readShortLE();
			int var2 = var1.readUnsignedShortAdd();
			var3 = var1.readUnsignedShortLE();
			var4 = var1.readUnsignedShort();
			UserComparator10.xteaKeys = new int[var4][4];

			for (var5 = 0; var5 < var4; ++var5) {
				for (var6 = 0; var6 < 4; ++var6) {
					UserComparator10.xteaKeys[var5][var6] = var1.readInt();
				}
			}

			class76.regions = new int[var4];
			UrlRequest.regionMapArchiveIds = new int[var4];
			class131.regionLandArchiveIds = new int[var4];
			class279.regionLandArchives = new byte[var4][];
			ModeWhere.regionMapArchives = new byte[var4][];
			var4 = 0;

			for (var5 = (var2 - 6) / 8; var5 <= (var2 + 6) / 8; ++var5) {
				for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
					var7 = var6 + (var5 << 8);
					class76.regions[var4] = var7;
					UrlRequest.regionMapArchiveIds[var4] = class157.archive9.getGroupId("m" + var5 + "_" + var6);
					class131.regionLandArchiveIds[var4] = class157.archive9.getGroupId("l" + var5 + "_" + var6);
					++var4;
				}
			}

			ScriptEvent.method2384(var2, var3, true);
		} else {
			boolean var15 = var1.readUnsignedByteSub() == 1;
			var3 = var1.readUnsignedShortAddLE();
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
			UserComparator10.xteaKeys = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					UserComparator10.xteaKeys[var6][var7] = var1.readInt();
				}
			}

			class76.regions = new int[var5];
			UrlRequest.regionMapArchiveIds = new int[var5];
			class131.regionLandArchiveIds = new int[var5];
			class279.regionLandArchives = new byte[var5][];
			ModeWhere.regionMapArchives = new byte[var5][];
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
								if (class76.regions[var13] == var12) {
									var12 = -1;
									break;
								}
							}

							if (var12 != -1) {
								class76.regions[var5] = var12;
								var13 = var12 >> 8 & 255;
								int var14 = var12 & 255;
								UrlRequest.regionMapArchiveIds[var5] = class157.archive9.getGroupId("m" + var13 + "_" + var14);
								class131.regionLandArchiveIds[var5] = class157.archive9.getGroupId("l" + var13 + "_" + var14);
								++var5;
							}
						}
					}
				}
			}

			ScriptEvent.method2384(var4, var3, !var15);
		}

	}
}
