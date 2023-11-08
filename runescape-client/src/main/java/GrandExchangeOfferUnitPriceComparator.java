import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ob")
@Implements("GrandExchangeOfferUnitPriceComparator")
final class GrandExchangeOfferUnitPriceComparator implements Comparator {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Log;Log;I)I",
		garbageValue = "714689738"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.unitPrice < var2.grandExchangeOffer.unitPrice ? -1 : (var2.grandExchangeOffer.unitPrice == var1.grandExchangeOffer.unitPrice ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1588481788"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		ArchiveLoader.addChatMessage(var0, var1, var2, (String)null);
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(ZLuo;ZI)V",
		garbageValue = "151188621"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1, boolean var2) {
		Client.isInInstance = var0;
		int var3;
		int var5;
		int var6;
		int var7;
		int var8;
		if (!Client.isInInstance) {
			int var4;
			if (var2) {
				var1.readShortLE();
				var4 = var1.readUnsignedShort();
				var3 = var1.readUnsignedShort();
				var5 = var1.readUnsignedShort();
			} else {
				var4 = var1.readUnsignedShort();
				var3 = var1.readUnsignedShortAdd();
				var5 = var1.readUnsignedShort();
			}

			Varcs.xteaKeys = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					Varcs.xteaKeys[var6][var7] = var1.readInt();
				}
			}

			KitDefinition.regions = new int[var5];
			UserComparator7.regionMapArchiveIds = new int[var5];
			UserComparator3.regionLandArchiveIds = new int[var5];
			WorldMapData_1.regionLandArchives = new byte[var5][];
			GrandExchangeEvent.regionMapArchives = new byte[var5][];
			var5 = 0;

			for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
				for (var7 = (var4 - 6) / 8; var7 <= (var4 + 6) / 8; ++var7) {
					var8 = var7 + (var6 << 8);
					KitDefinition.regions[var5] = var8;
					UserComparator7.regionMapArchiveIds[var5] = WorldMapSection0.archive9.getGroupId("m" + var6 + "_" + var7);
					UserComparator3.regionLandArchiveIds[var5] = WorldMapSection0.archive9.getGroupId("l" + var6 + "_" + var7);
					++var5;
				}
			}

			class292.method5834(var3, var4, true);
		} else {
			var3 = var1.readUnsignedShortAdd();
			boolean var16 = var1.readUnsignedByte() == 1;
			var5 = var1.readUnsignedShort();
			var6 = var1.readUnsignedShort();
			var1.importIndex();

			int var9;
			int var10;
			for (var7 = 0; var7 < 4; ++var7) {
				for (var8 = 0; var8 < 13; ++var8) {
					for (var9 = 0; var9 < 13; ++var9) {
						var10 = var1.readBits(1);
						if (var10 == 1) {
							Client.instanceChunkTemplates[var7][var8][var9] = var1.readBits(26);
						} else {
							Client.instanceChunkTemplates[var7][var8][var9] = -1;
						}
					}
				}
			}

			var1.exportIndex();
			Varcs.xteaKeys = new int[var6][4];

			for (var7 = 0; var7 < var6; ++var7) {
				for (var8 = 0; var8 < 4; ++var8) {
					Varcs.xteaKeys[var7][var8] = var1.readInt();
				}
			}

			KitDefinition.regions = new int[var6];
			UserComparator7.regionMapArchiveIds = new int[var6];
			UserComparator3.regionLandArchiveIds = new int[var6];
			WorldMapData_1.regionLandArchives = new byte[var6][];
			GrandExchangeEvent.regionMapArchives = new byte[var6][];
			var6 = 0;

			for (var7 = 0; var7 < 4; ++var7) {
				for (var8 = 0; var8 < 13; ++var8) {
					for (var9 = 0; var9 < 13; ++var9) {
						var10 = Client.instanceChunkTemplates[var7][var8][var9];
						if (var10 != -1) {
							int var11 = var10 >> 14 & 1023;
							int var12 = var10 >> 3 & 2047;
							int var13 = (var11 / 8 << 8) + var12 / 8;

							int var14;
							for (var14 = 0; var14 < var6; ++var14) {
								if (KitDefinition.regions[var14] == var13) {
									var13 = -1;
									break;
								}
							}

							if (var13 != -1) {
								KitDefinition.regions[var6] = var13;
								var14 = var13 >> 8 & 255;
								int var15 = var13 & 255;
								UserComparator7.regionMapArchiveIds[var6] = WorldMapSection0.archive9.getGroupId("m" + var14 + "_" + var15);
								UserComparator3.regionLandArchiveIds[var6] = WorldMapSection0.archive9.getGroupId("l" + var14 + "_" + var15);
								++var6;
							}
						}
					}
				}
			}

			class292.method5834(var5, var3, !var16);
		}

	}
}
