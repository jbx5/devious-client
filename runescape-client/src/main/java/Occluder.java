import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 155436271
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -140487037
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1444741107
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1939662075
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1536780987
	)
	@Export("type")
	int type;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1816592861
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 111975105
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1231135201
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1514526569
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -868912655
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1093592635
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 556028659
	)
	int field2680;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -288941295
	)
	int field2669;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 882122285
	)
	int field2685;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2140217143
	)
	int field2683;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2040444371
	)
	int field2684;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 164362021
	)
	int field2678;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 272946227
	)
	int field2686;

	Occluder() {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-104"
	)
	static int method4859(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1093816432"
	)
	static final void method4858() {
		class193.method3644(false);
		Client.field588 = 0;
		boolean var0 = true;

		int var1;
		for (var1 = 0; var1 < class345.regionLandArchives.length; ++var1) {
			if (HorizontalAlignment.regionMapArchiveIds[var1] != -1 && class345.regionLandArchives[var1] == null) {
				class345.regionLandArchives[var1] = class198.archive9.takeFile(HorizontalAlignment.regionMapArchiveIds[var1], 0);
				if (class345.regionLandArchives[var1] == null) {
					var0 = false;
					++Client.field588;
				}
			}

			if (WorldMapIcon_0.regionLandArchiveIds[var1] != -1 && class201.regionMapArchives[var1] == null) {
				class201.regionMapArchives[var1] = class198.archive9.takeFileEncrypted(WorldMapIcon_0.regionLandArchiveIds[var1], 0, class178.xteaKeys[var1]);
				if (class201.regionMapArchives[var1] == null) {
					var0 = false;
					++Client.field588;
				}
			}
		}

		if (!var0) {
			Client.field545 = 1;
		} else {
			Client.field590 = 0;
			var0 = true;

			int var3;
			int var4;
			for (var1 = 0; var1 < class345.regionLandArchives.length; ++var1) {
				byte[] var17 = class201.regionMapArchives[var1];
				if (var17 != null) {
					var3 = (class152.regions[var1] >> 8) * 64 - class20.baseX * 64;
					var4 = (class152.regions[var1] & 255) * 64 - class19.baseY * 64;
					if (Client.isInInstance) {
						var3 = 10;
						var4 = 10;
					}

					var0 &= class208.method3846(var17, var3, var4);
				}
			}

			if (!var0) {
				Client.field545 = 2;
			} else {
				if (Client.field545 != 0) {
					class427.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				class313.method5891();
				class10.scene.clear();

				for (var1 = 0; var1 < 4; ++var1) {
					Client.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) {
					for (var2 = 0; var2 < 104; ++var2) {
						for (var3 = 0; var3 < 104; ++var3) {
							Tiles.Tiles_renderFlags[var1][var2][var3] = 0;
						}
					}
				}

				class313.method5891();
				PlayerCompositionColorTextureOverride.method3598();
				var1 = class345.regionLandArchives.length;
				SoundCache.method866();
				class193.method3644(true);
				int var5;
				if (!Client.isInInstance) {
					byte[] var16;
					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (class152.regions[var2] >> 8) * 64 - class20.baseX * 64;
						var4 = (class152.regions[var2] & 255) * 64 - class19.baseY * 64;
						var16 = class345.regionLandArchives[var2];
						if (var16 != null) {
							class313.method5891();
							BufferedSource.method8232(var16, var3, var4, class94.field1150 * 8 - 48, class365.field3943 * 8 - 48, Client.collisionMaps);
						}
					}

					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (class152.regions[var2] >> 8) * 64 - class20.baseX * 64;
						var4 = (class152.regions[var2] & 255) * 64 - class19.baseY * 64;
						var16 = class345.regionLandArchives[var2];
						if (var16 == null && class365.field3943 < 800) {
							class313.method5891();
							Decimator.method1132(var3, var4, 64, 64);
						}
					}

					class193.method3644(true);

					for (var2 = 0; var2 < var1; ++var2) {
						byte[] var15 = class201.regionMapArchives[var2];
						if (var15 != null) {
							var4 = (class152.regions[var2] >> 8) * 64 - class20.baseX * 64;
							var5 = (class152.regions[var2] & 255) * 64 - class19.baseY * 64;
							class313.method5891();
							PacketBuffer.method9143(var15, var4, var5, class10.scene, Client.collisionMaps);
						}
					}
				}

				int var6;
				int var7;
				int var8;
				if (Client.isInInstance) {
					int var9;
					int var10;
					int var11;
					for (var2 = 0; var2 < 4; ++var2) {
						class313.method5891();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								boolean var18 = false;
								var6 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var6 != -1) {
									var7 = var6 >> 24 & 3;
									var8 = var6 >> 1 & 3;
									var9 = var6 >> 14 & 1023;
									var10 = var6 >> 3 & 2047;
									var11 = (var9 / 8 << 8) + var10 / 8;

									for (int var12 = 0; var12 < class152.regions.length; ++var12) {
										if (class152.regions[var12] == var11 && class345.regionLandArchives[var12] != null) {
											int var13 = (var9 - var3) * 8;
											int var14 = (var10 - var4) * 8;
											UserComparator5.method2902(class345.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14, Client.collisionMaps);
											var18 = true;
											break;
										}
									}
								}

								if (!var18) {
									class4.method16(var2, var3 * 8, var4 * 8);
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) {
						for (var3 = 0; var3 < 13; ++var3) {
							var4 = Client.instanceChunkTemplates[0][var2][var3];
							if (var4 == -1) {
								Decimator.method1132(var2 * 8, var3 * 8, 8, 8);
							}
						}
					}

					class193.method3644(true);

					for (var2 = 0; var2 < 4; ++var2) {
						class313.method5891();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								var5 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var5 != -1) {
									var6 = var5 >> 24 & 3;
									var7 = var5 >> 1 & 3;
									var8 = var5 >> 14 & 1023;
									var9 = var5 >> 3 & 2047;
									var10 = (var8 / 8 << 8) + var9 / 8;

									for (var11 = 0; var11 < class152.regions.length; ++var11) {
										if (class152.regions[var11] == var10 && class201.regionMapArchives[var11] != null) {
											Tiles.method2231(class201.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, class10.scene, Client.collisionMaps);
											break;
										}
									}
								}
							}
						}
					}
				}

				class193.method3644(true);
				class313.method5891();
				class481.method8542(class10.scene, Client.collisionMaps);
				class193.method3644(true);
				var2 = Tiles.Tiles_minPlane;
				if (var2 > class87.Client_plane) {
					var2 = class87.Client_plane;
				}

				if (var2 < class87.Client_plane - 1) {
					var2 = class87.Client_plane - 1;
				}

				if (Client.isLowDetail) {
					class10.scene.init(Tiles.Tiles_minPlane);
				} else {
					class10.scene.init(0);
				}

				for (var3 = 0; var3 < 104; ++var3) {
					for (var4 = 0; var4 < 104; ++var4) {
						class30.updateItemPile(var3, var4);
					}
				}

				class313.method5891();
				WorldMapDecoration.method5650();
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				PacketBufferNode var19;
				if (class159.client.hasFrame()) {
					var19 = ClanChannelMember.getPacketBufferNode(ClientPacket.DETECT_MODIFIED_CLIENT, Client.packetWriter.isaacCipher);
					var19.packetBuffer.writeInt(1057001181);
					Client.packetWriter.addNode(var19);
				}

				if (!Client.isInInstance) {
					var3 = (class94.field1150 - 6) / 8;
					var4 = (class94.field1150 + 6) / 8;
					var5 = (class365.field3943 - 6) / 8;
					var6 = (class365.field3943 + 6) / 8;

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) {
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) {
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) {
								class198.archive9.loadRegionFromName("m" + var7 + "_" + var8);
								class198.archive9.loadRegionFromName("l" + var7 + "_" + var8);
							}
						}
					}
				}

				DefaultsGroup.updateGameState(30);
				class313.method5891();
				BuddyRankComparator.method2933();
				var19 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3174, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var19);
				class19.method283();
			}
		}
	}
}
