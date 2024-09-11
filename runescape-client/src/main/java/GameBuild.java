import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oj")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("LIVE")
	static final GameBuild LIVE;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("RC")
	static final GameBuild RC;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("WIP")
	static final GameBuild WIP;
	@ObfuscatedName("ax")
	@Export("name")
	public final String name;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -528818889
	)
	@Export("buildId")
	final int buildId;

	static {
		LIVE = new GameBuild("LIVE", 0);
		BUILDLIVE = new GameBuild("BUILDLIVE", 3);
		RC = new GameBuild("RC", 1);
		WIP = new GameBuild("WIP", 2);
	}

	GameBuild(String var1, int var2) {
		this.name = var1;
		this.buildId = var2;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "166147139"
	)
	static int method7429() {
		return ++Messages.Messages_count - 1;
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "11"
	)
	@Export("loadRegion")
	static final void loadRegion() {
		class271.method5644(false);
		Client.field604 = 0;
		boolean var0 = true;

		int var1;
		for (var1 = 0; var1 < SecureRandomCallable.regionLandArchives.length; ++var1) {
			if (class7.regionMapArchiveIds[var1] != -1 && SecureRandomCallable.regionLandArchives[var1] == null) {
				SecureRandomCallable.regionLandArchives[var1] = Bounds.archive9.takeFile(class7.regionMapArchiveIds[var1], 0);
				if (SecureRandomCallable.regionLandArchives[var1] == null) {
					var0 = false;
					++Client.field604;
				}
			}

			if (class528.regionLandArchiveIds[var1] != -1 && FloorOverlayDefinition.regionMapArchives[var1] == null) {
				FloorOverlayDefinition.regionMapArchives[var1] = Bounds.archive9.takeFileEncrypted(class528.regionLandArchiveIds[var1], 0, class360.xteaKeys[var1]);
				if (FloorOverlayDefinition.regionMapArchives[var1] == null) {
					var0 = false;
					++Client.field604;
				}
			}
		}

		if (!var0) {
			Client.field590 = 1;
		} else {
			Client.field626 = 0;
			var0 = true;

			int var3;
			int var4;
			for (var1 = 0; var1 < SecureRandomCallable.regionLandArchives.length; ++var1) {
				byte[] var17 = FloorOverlayDefinition.regionMapArchives[var1];
				if (var17 != null) {
					var3 = (Occluder.regions[var1] >> 8) * 64 - ClientPreferences.topLevelWorldView.baseX;
					var4 = (Occluder.regions[var1] & 255) * 64 - ClientPreferences.topLevelWorldView.baseY;
					if (Client.isInInstance) {
						var3 = 10;
						var4 = 10;
					}

					var0 &= class230.method4622(var17, var3, var4);
				}
			}

			if (!var0) {
				Client.field590 = 2;
			} else {
				if (Client.field590 != 0) {
					class328.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				GrandExchangeOffer.method7712();
				ClientPreferences.topLevelWorldView.scene.clearTempGameObjects();

				for (var1 = 0; var1 < 4; ++var1) {
					ClientPreferences.topLevelWorldView.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) {
					for (var2 = 0; var2 < 104; ++var2) {
						for (var3 = 0; var3 < 104; ++var3) {
							ClientPreferences.topLevelWorldView.tileSettings[var1][var2][var3] = 0;
						}
					}
				}

				GrandExchangeOffer.method7712();
				PlayerUpdateManager.method3035();
				var1 = SecureRandomCallable.regionLandArchives.length;
				MenuAction.method2299();
				class271.method5644(true);
				int var5;
				if (!Client.isInInstance) {
					byte[] var16;
					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (Occluder.regions[var2] >> 8) * 64 - ClientPreferences.topLevelWorldView.baseX;
						var4 = (Occluder.regions[var2] & 255) * 64 - ClientPreferences.topLevelWorldView.baseY;
						var16 = SecureRandomCallable.regionLandArchives[var2];
						if (var16 != null) {
							GrandExchangeOffer.method7712();
							class198.method4027(ClientPreferences.topLevelWorldView, var16, var3, var4, class95.field1191 * 8 - 48, Message.field473 * 8 - 48);
						}
					}

					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (Occluder.regions[var2] >> 8) * 64 - ClientPreferences.topLevelWorldView.baseX;
						var4 = (Occluder.regions[var2] & 255) * 64 - ClientPreferences.topLevelWorldView.baseY;
						var16 = SecureRandomCallable.regionLandArchives[var2];
						if (var16 == null && Message.field473 < 800) {
							GrandExchangeOffer.method7712();
							WorldMapID.method6196(ClientPreferences.topLevelWorldView, var3, var4, 64, 64);
						}
					}

					class271.method5644(true);

					for (var2 = 0; var2 < var1; ++var2) {
						byte[] var15 = FloorOverlayDefinition.regionMapArchives[var2];
						if (var15 != null) {
							var4 = (Occluder.regions[var2] >> 8) * 64 - ClientPreferences.topLevelWorldView.baseX;
							var5 = (Occluder.regions[var2] & 255) * 64 - ClientPreferences.topLevelWorldView.baseY;
							GrandExchangeOffer.method7712();
							UserComparator9.method3218(ClientPreferences.topLevelWorldView, var15, var4, var5);
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
						GrandExchangeOffer.method7712();

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

									for (int var12 = 0; var12 < Occluder.regions.length; ++var12) {
										if (Occluder.regions[var12] == var11 && SecureRandomCallable.regionLandArchives[var12] != null) {
											int var13 = (var9 - var3) * 8;
											int var14 = (var10 - var4) * 8;
											WorldMapIcon_0.method6097(ClientPreferences.topLevelWorldView, SecureRandomCallable.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14);
											var18 = true;
											break;
										}
									}
								}

								if (!var18) {
									ClientPreferences.method2841(ClientPreferences.topLevelWorldView.tileHeights, var2, var3 * 8, var4 * 8);
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) {
						for (var3 = 0; var3 < 13; ++var3) {
							var4 = Client.instanceChunkTemplates[0][var2][var3];
							if (var4 == -1) {
								WorldMapID.method6196(ClientPreferences.topLevelWorldView, var2 * 8, var3 * 8, 8, 8);
							}
						}
					}

					class271.method5644(true);

					for (var2 = 0; var2 < 4; ++var2) {
						GrandExchangeOffer.method7712();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								var5 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var5 != -1) {
									var6 = var5 >> 24 & 3;
									var7 = var5 >> 1 & 3;
									var8 = var5 >> 14 & 1023;
									var9 = var5 >> 3 & 2047;
									var10 = (var8 / 8 << 8) + var9 / 8;

									for (var11 = 0; var11 < Occluder.regions.length; ++var11) {
										if (Occluder.regions[var11] == var10 && FloorOverlayDefinition.regionMapArchives[var11] != null) {
											Tiles.method2422(ClientPreferences.topLevelWorldView, FloorOverlayDefinition.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7);
											break;
										}
									}
								}
							}
						}
					}
				}

				class271.method5644(true);
				GrandExchangeOffer.method7712();
				class33.method479(ClientPreferences.topLevelWorldView);
				class271.method5644(true);
				var2 = Tiles.Tiles_minPlane;
				if (var2 > ClientPreferences.topLevelWorldView.plane) {
					var2 = ClientPreferences.topLevelWorldView.plane;
				}

				if (var2 < ClientPreferences.topLevelWorldView.plane - 1) {
					var2 = ClientPreferences.topLevelWorldView.plane - 1;
				}

				if (Client.isLowDetail) {
					ClientPreferences.topLevelWorldView.scene.init(Tiles.Tiles_minPlane);
				} else {
					ClientPreferences.topLevelWorldView.scene.init(0);
				}

				for (var3 = 0; var3 < 104; ++var3) {
					for (var4 = 0; var4 < 104; ++var4) {
						class383.updateItemPile3(ClientPreferences.topLevelWorldView, var3, var4);
					}
				}

				GrandExchangeOffer.method7712();
				class402.method7745();
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				PacketBufferNode var19;
				if (class1.client.hasFrame()) {
					var19 = class141.getPacketBufferNode(ClientPacket.DETECT_MODIFIED_CLIENT, Client.packetWriter.isaacCipher);
					var19.packetBuffer.writeInt(1057001181);
					Client.packetWriter.addNode(var19);
				}

				if (!Client.isInInstance) {
					var3 = (class95.field1191 - 6) / 8;
					var4 = (class95.field1191 + 6) / 8;
					var5 = (Message.field473 - 6) / 8;
					var6 = (Message.field473 + 6) / 8;

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) {
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) {
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) {
								Bounds.archive9.loadRegionFromName("m" + var7 + "_" + var8);
								Bounds.archive9.loadRegionFromName("l" + var7 + "_" + var8);
							}
						}
					}
				}

				GrandExchangeOffer.method7712();
				class111.method2994();
				var19 = class141.getPacketBufferNode(ClientPacket.field3368, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var19);
				KitDefinition.method3891();
				Client.field772 = false;
			}
		}
	}
}
