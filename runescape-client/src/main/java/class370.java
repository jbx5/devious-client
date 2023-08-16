import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("og")
public class class370 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	static final class370 field4370;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	static final class370 field4373;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	static final class370 field4369;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	static final class370 field4372;
	@ObfuscatedName("br")
	@Export("hasFocus")
	protected static boolean hasFocus;

	static {
		field4370 = new class370();
		field4373 = new class370();
		field4369 = new class370();
		field4372 = new class370();
	}

	class370() {
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2133764143"
	)
	static final void method6926() {
		class108.method2716(false);
		Client.field596 = 0;
		boolean var0 = true;

		int var1;
		for (var1 = 0; var1 < UserComparator5.regionLandArchives.length; ++var1) {
			if (class59.regionMapArchiveIds[var1] != -1 && UserComparator5.regionLandArchives[var1] == null) {
				UserComparator5.regionLandArchives[var1] = class499.archive9.takeFile(class59.regionMapArchiveIds[var1], 0);
				if (UserComparator5.regionLandArchives[var1] == null) {
					var0 = false;
					++Client.field596;
				}
			}

			if (PlayerCompositionColorTextureOverride.regionLandArchiveIds[var1] != -1 && class197.regionMapArchives[var1] == null) {
				class197.regionMapArchives[var1] = class499.archive9.takeFileEncrypted(PlayerCompositionColorTextureOverride.regionLandArchiveIds[var1], 0, RunException.xteaKeys[var1]);
				if (class197.regionMapArchives[var1] == null) {
					var0 = false;
					++Client.field596;
				}
			}
		}

		if (!var0) {
			Client.field600 = 1;
		} else {
			Client.field598 = 0;
			var0 = true;

			int var3;
			int var4;
			for (var1 = 0; var1 < UserComparator5.regionLandArchives.length; ++var1) {
				byte[] var17 = class197.regionMapArchives[var1];
				if (var17 != null) {
					var3 = (class191.regions[var1] >> 8) * 64 - UrlRequester.baseX * 64;
					var4 = (class191.regions[var1] & 255) * 64 - class47.baseY * 64;
					if (Client.isInInstance) {
						var3 = 10;
						var4 = 10;
					}

					var0 &= class142.method3104(var17, var3, var4);
				}
			}

			if (!var0) {
				Client.field600 = 2;
			} else {
				if (Client.field600 != 0) {
					FadeInTask.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				class301.method5721();
				class130.scene.clear();

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

				class301.method5721();
				Language.method6952();
				var1 = UserComparator5.regionLandArchives.length;
				class388.method7220();
				class108.method2716(true);
				int var5;
				if (!Client.isInInstance) {
					byte[] var16;
					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (class191.regions[var2] >> 8) * 64 - UrlRequester.baseX * 64;
						var4 = (class191.regions[var2] & 255) * 64 - class47.baseY * 64;
						var16 = UserComparator5.regionLandArchives[var2];
						if (var16 != null) {
							class301.method5721();
							class261.method5395(var16, var3, var4, Tiles.field1037 * 8 - 48, MouseRecorder.field1105 * 8 - 48, Client.collisionMaps);
						}
					}

					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (class191.regions[var2] >> 8) * 64 - UrlRequester.baseX * 64;
						var4 = (class191.regions[var2] & 255) * 64 - class47.baseY * 64;
						var16 = UserComparator5.regionLandArchives[var2];
						if (var16 == null && MouseRecorder.field1105 < 800) {
							class301.method5721();
							class17.method265(var3, var4, 64, 64);
						}
					}

					class108.method2716(true);

					for (var2 = 0; var2 < var1; ++var2) {
						byte[] var15 = class197.regionMapArchives[var2];
						if (var15 != null) {
							var4 = (class191.regions[var2] >> 8) * 64 - UrlRequester.baseX * 64;
							var5 = (class191.regions[var2] & 255) * 64 - class47.baseY * 64;
							class301.method5721();
							FriendsChat.method7860(var15, var4, var5, class130.scene, Client.collisionMaps);
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
						class301.method5721();

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

									for (int var12 = 0; var12 < class191.regions.length; ++var12) {
										if (class191.regions[var12] == var11 && UserComparator5.regionLandArchives[var12] != null) {
											int var13 = (var9 - var3) * 8;
											int var14 = (var10 - var4) * 8;
											class132.method3038(UserComparator5.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14, Client.collisionMaps);
											var18 = true;
											break;
										}
									}
								}

								if (!var18) {
									class372.method6935(var2, var3 * 8, var4 * 8);
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) {
						for (var3 = 0; var3 < 13; ++var3) {
							var4 = Client.instanceChunkTemplates[0][var2][var3];
							if (var4 == -1) {
								class17.method265(var2 * 8, var3 * 8, 8, 8);
							}
						}
					}

					class108.method2716(true);

					for (var2 = 0; var2 < 4; ++var2) {
						class301.method5721();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								var5 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var5 != -1) {
									var6 = var5 >> 24 & 3;
									var7 = var5 >> 1 & 3;
									var8 = var5 >> 14 & 1023;
									var9 = var5 >> 3 & 2047;
									var10 = (var8 / 8 << 8) + var9 / 8;

									for (var11 = 0; var11 < class191.regions.length; ++var11) {
										if (class191.regions[var11] == var10 && class197.regionMapArchives[var11] != null) {
											Tiles.method2202(class197.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, class130.scene, Client.collisionMaps);
											break;
										}
									}
								}
							}
						}
					}
				}

				class108.method2716(true);
				class301.method5721();
				class129.method2989(class130.scene, Client.collisionMaps);
				class108.method2716(true);
				var2 = Tiles.Tiles_minPlane;
				if (var2 > HealthBar.Client_plane) {
					var2 = HealthBar.Client_plane;
				}

				if (var2 < HealthBar.Client_plane - 1) {
					var2 = HealthBar.Client_plane - 1;
				}

				if (Client.isLowDetail) {
					class130.scene.init(Tiles.Tiles_minPlane);
				} else {
					class130.scene.init(0);
				}

				for (var3 = 0; var3 < 104; ++var3) {
					for (var4 = 0; var4 < 104; ++var4) {
						class135.updateItemPile(var3, var4);
					}
				}

				class301.method5721();
				class165.method3325();
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				PacketBufferNode var19;
				if (class219.client.hasFrame()) {
					var19 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.DETECT_MODIFIED_CLIENT, Client.packetWriter.isaacCipher);
					var19.packetBuffer.writeInt(1057001181);
					Client.packetWriter.addNode(var19);
				}

				if (!Client.isInInstance) {
					var3 = (Tiles.field1037 - 6) / 8;
					var4 = (Tiles.field1037 + 6) / 8;
					var5 = (MouseRecorder.field1105 - 6) / 8;
					var6 = (MouseRecorder.field1105 + 6) / 8;

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) {
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) {
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) {
								class499.archive9.loadRegionFromName("m" + var7 + "_" + var8);
								class499.archive9.loadRegionFromName("l" + var7 + "_" + var8);
							}
						}
					}
				}

				MusicSong.updateGameState(30);
				class301.method5721();
				ObjectSound.method1927();
				var19 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3153, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var19);
				PacketWriter.method2798();
			}
		}
	}
}
