import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rq")
public class class445 extends SongTask {
	@ObfuscatedSignature(
		descriptor = "(Lra;)V"
	)
	public class445(SongTask var1) {
		super(var1);
		super.field4881 = "StartSongTask";
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "343486624"
	)
	public boolean vmethod8740() {
		Iterator var1 = class333.musicSongs.iterator();

		while (var1.hasNext()) {
			MusicSong var2 = (MusicSong)var1.next();
			if (var2 != null && !var2.field3750 && var2.midiPcmStream != null) {
				try {
					var2.midiPcmStream.method6605();
					var2.midiPcmStream.setPcmStreamVolume(0);
					if (var2.field3753 != null) {
						var2.midiPcmStream.setMusicTrack(var2.field3753, var2.musicTrackBoolean);
					}

					var2.field3753 = null;
					var2.field3754 = null;
					var2.musicTrackArchive = null;
					var2.field3750 = true;
				} catch (Exception var4) {
					HttpHeaders.RunException_sendStackTrace((String)null, var4);
					this.method8725(var4.getMessage());
					return true;
				}
			}
		}

		super.field4885 = true;
		return true;
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-27405570"
	)
	@Export("loadRegion")
	static final void loadRegion() {
		TileItem.method3066(false);
		Client.field653 = 0;
		boolean var0 = true;

		int var1;
		for (var1 = 0; var1 < StudioGame.regionLandArchives.length; ++var1) {
			if (class159.regionMapArchiveIds[var1] != -1 && StudioGame.regionLandArchives[var1] == null) {
				StudioGame.regionLandArchives[var1] = EnumComposition.archive9.takeFile(class159.regionMapArchiveIds[var1], 0);
				if (StudioGame.regionLandArchives[var1] == null) {
					var0 = false;
					++Client.field653;
				}
			}

			if (class215.regionLandArchiveIds[var1] != -1 && class4.regionMapArchives[var1] == null) {
				class4.regionMapArchives[var1] = EnumComposition.archive9.takeFileEncrypted(class215.regionLandArchiveIds[var1], 0, class133.xteaKeys[var1]);
				if (class4.regionMapArchives[var1] == null) {
					var0 = false;
					++Client.field653;
				}
			}
		}

		if (!var0) {
			Client.field514 = 1;
		} else {
			Client.field571 = 0;
			var0 = true;

			int var3;
			int var4;
			for (var1 = 0; var1 < StudioGame.regionLandArchives.length; ++var1) {
				byte[] var17 = class4.regionMapArchives[var1];
				if (var17 != null) {
					var3 = (MoveSpeed.regions[var1] >> 8) * 64 - class198.topLevelWorldView.baseX;
					var4 = (MoveSpeed.regions[var1] & 255) * 64 - class198.topLevelWorldView.baseY;
					if (Client.isInInstance) {
						var3 = 10;
						var4 = 10;
					}

					var0 &= ChatChannel.method2472(var17, var3, var4);
				}
			}

			if (!var0) {
				Client.field514 = 2;
			} else {
				if (Client.field514 != 0) {
					ObjectComposition.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				class149.method3569();
				class198.topLevelWorldView.scene.clearTempGameObjects();

				for (var1 = 0; var1 < 4; ++var1) {
					class198.topLevelWorldView.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) {
					for (var2 = 0; var2 < 104; ++var2) {
						for (var3 = 0; var3 < 104; ++var3) {
							class198.topLevelWorldView.tileSettings[var1][var2][var3] = 0;
						}
					}
				}

				class149.method3569();
				UrlRequest.method3253();
				var1 = StudioGame.regionLandArchives.length;
				class289.method6205();
				TileItem.method3066(true);
				int var5;
				if (!Client.isInInstance) {
					byte[] var16;
					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (MoveSpeed.regions[var2] >> 8) * 64 - class198.topLevelWorldView.baseX;
						var4 = (MoveSpeed.regions[var2] & 255) * 64 - class198.topLevelWorldView.baseY;
						var16 = StudioGame.regionLandArchives[var2];
						if (var16 != null) {
							class149.method3569();
							class1.method12(class198.topLevelWorldView, var16, var3, var4, class357.field3813 * 8 - 48, class133.field1546 * 8 - 48);
						}
					}

					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (MoveSpeed.regions[var2] >> 8) * 64 - class198.topLevelWorldView.baseX;
						var4 = (MoveSpeed.regions[var2] & 255) * 64 - class198.topLevelWorldView.baseY;
						var16 = StudioGame.regionLandArchives[var2];
						if (var16 == null && class133.field1546 < 800) {
							class149.method3569();
							DynamicObject.method2455(class198.topLevelWorldView, var3, var4, 64, 64);
						}
					}

					TileItem.method3066(true);

					for (var2 = 0; var2 < var1; ++var2) {
						byte[] var15 = class4.regionMapArchives[var2];
						if (var15 != null) {
							var4 = (MoveSpeed.regions[var2] >> 8) * 64 - class198.topLevelWorldView.baseX;
							var5 = (MoveSpeed.regions[var2] & 255) * 64 - class198.topLevelWorldView.baseY;
							class149.method3569();
							class6.method44(class198.topLevelWorldView, var15, var4, var5);
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
						class149.method3569();

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

									for (int var12 = 0; var12 < MoveSpeed.regions.length; ++var12) {
										if (MoveSpeed.regions[var12] == var11 && StudioGame.regionLandArchives[var12] != null) {
											int var13 = (var9 - var3) * 8;
											int var14 = (var10 - var4) * 8;
											class463.method8879(class198.topLevelWorldView, StudioGame.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14);
											var18 = true;
											break;
										}
									}
								}

								if (!var18) {
									class141.method3497(class198.topLevelWorldView.tileHeights, var2, var3 * 8, var4 * 8);
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) {
						for (var3 = 0; var3 < 13; ++var3) {
							var4 = Client.instanceChunkTemplates[0][var2][var3];
							if (var4 == -1) {
								DynamicObject.method2455(class198.topLevelWorldView, var2 * 8, var3 * 8, 8, 8);
							}
						}
					}

					TileItem.method3066(true);

					for (var2 = 0; var2 < 4; ++var2) {
						class149.method3569();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								var5 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var5 != -1) {
									var6 = var5 >> 24 & 3;
									var7 = var5 >> 1 & 3;
									var8 = var5 >> 14 & 1023;
									var9 = var5 >> 3 & 2047;
									var10 = (var8 / 8 << 8) + var9 / 8;

									for (var11 = 0; var11 < MoveSpeed.regions.length; ++var11) {
										if (MoveSpeed.regions[var11] == var10 && class4.regionMapArchives[var11] != null) {
											Tiles.method2515(class198.topLevelWorldView, class4.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7);
											break;
										}
									}
								}
							}
						}
					}
				}

				TileItem.method3066(true);
				class149.method3569();
				class508.method9435(class198.topLevelWorldView);
				TileItem.method3066(true);
				var2 = Tiles.Tiles_minPlane;
				if (var2 > class198.topLevelWorldView.plane) {
					var2 = class198.topLevelWorldView.plane;
				}

				if (var2 < class198.topLevelWorldView.plane - 1) {
					var2 = class198.topLevelWorldView.plane - 1;
				}

				if (Client.isLowDetail) {
					class198.topLevelWorldView.scene.init(Tiles.Tiles_minPlane);
				} else {
					class198.topLevelWorldView.scene.init(0);
				}

				for (var3 = 0; var3 < 104; ++var3) {
					for (var4 = 0; var4 < 104; ++var4) {
						GrandExchangeOfferTotalQuantityComparator.updateItemPile3(class198.topLevelWorldView, var3, var4);
					}
				}

				class149.method3569();
				Actor.method2771();
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				PacketBufferNode var19;
				if (Projectile.client.hasFrame()) {
					var19 = class113.getPacketBufferNode(ClientPacket.DETECT_MODIFIED_CLIENT, Client.packetWriter.isaacCipher);
					var19.packetBuffer.writeInt(1057001181);
					Client.packetWriter.addNode(var19);
				}

				if (!Client.isInInstance) {
					var3 = (class357.field3813 - 6) / 8;
					var4 = (class357.field3813 + 6) / 8;
					var5 = (class133.field1546 - 6) / 8;
					var6 = (class133.field1546 + 6) / 8;

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) {
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) {
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) {
								EnumComposition.archive9.loadRegionFromName("m" + var7 + "_" + var8);
								EnumComposition.archive9.loadRegionFromName("l" + var7 + "_" + var8);
							}
						}
					}
				}

				class149.method3569();
				class93.method2587();
				var19 = class113.getPacketBufferNode(ClientPacket.field3338, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var19);
				ClanChannel.method3806();
				Client.field510 = false;
			}
		}
	}
}
