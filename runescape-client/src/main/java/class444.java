import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rv")
public final class class444 implements Comparable {
	@ObfuscatedName("az")
	Object field4762;
	@ObfuscatedName("ah")
	Object field4761;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = -1978792705490221987L
	)
	long field4760;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = -4296732561949299543L
	)
	long field4763;

	class444(Object var1, Object var2) {
		this.field4762 = var1;
		this.field4761 = var2;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lrv;I)I",
		garbageValue = "940302158"
	)
	int method8020(class444 var1) {
		if (this.field4763 < var1.field4763) {
			return -1;
		} else {
			return this.field4763 > var1.field4763 ? 1 : 0;
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class444) {
			return this.field4761.equals(((class444)var1).field4761);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public int hashCode() {
		return this.field4761.hashCode();
	}

	public int compareTo(Object var1) {
		return this.method8020((class444)var1);
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "972835992"
	)
	static final void method8026() {
		UserComparator10.method2915(false);
		Client.field578 = 0;
		boolean var0 = true;

		int var1;
		for (var1 = 0; var1 < class73.regionLandArchives.length; ++var1) {
			if (class390.regionMapArchiveIds[var1] != -1 && class73.regionLandArchives[var1] == null) {
				class73.regionLandArchives[var1] = class73.archive9.takeFile(class390.regionMapArchiveIds[var1], 0);
				if (class73.regionLandArchives[var1] == null) {
					var0 = false;
					++Client.field578;
				}
			}

			if (Tile.regionLandArchiveIds[var1] != -1 && class127.regionMapArchives[var1] == null) {
				class127.regionMapArchives[var1] = class73.archive9.takeFileEncrypted(Tile.regionLandArchiveIds[var1], 0, MusicPatchPcmStream.xteaKeys[var1]);
				if (class127.regionMapArchives[var1] == null) {
					var0 = false;
					++Client.field578;
				}
			}
		}

		if (!var0) {
			Client.field582 = 1;
		} else {
			Client.field727 = 0;
			var0 = true;

			int var3;
			int var4;
			for (var1 = 0; var1 < class73.regionLandArchives.length; ++var1) {
				byte[] var17 = class127.regionMapArchives[var1];
				if (var17 != null) {
					var3 = (PcmPlayer.regions[var1] >> 8) * 64 - GrandExchangeOfferOwnWorldComparator.baseX * 64;
					var4 = (PcmPlayer.regions[var1] & 255) * 64 - DevicePcmPlayerProvider.baseY * 64;
					if (Client.isInInstance) {
						var3 = 10;
						var4 = 10;
					}

					var0 &= class30.method426(var17, var3, var4);
				}
			}

			if (!var0) {
				Client.field582 = 2;
			} else {
				if (Client.field582 != 0) {
					WorldMapSectionType.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				class167.method3417();
				LoginType.scene.clear();

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

				class167.method3417();
				ApproximateRouteStrategy.method1181();
				var1 = class73.regionLandArchives.length;
				Canvas.method294();
				UserComparator10.method2915(true);
				int var5;
				if (!Client.isInInstance) {
					byte[] var16;
					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (PcmPlayer.regions[var2] >> 8) * 64 - GrandExchangeOfferOwnWorldComparator.baseX * 64;
						var4 = (PcmPlayer.regions[var2] & 255) * 64 - DevicePcmPlayerProvider.baseY * 64;
						var16 = class73.regionLandArchives[var2];
						if (var16 != null) {
							class167.method3417();
							Language.method7192(var16, var3, var4, HttpRequestTask.field85 * 8 - 48, HttpMethod.field36 * 8 - 48, Client.collisionMaps);
						}
					}

					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (PcmPlayer.regions[var2] >> 8) * 64 - GrandExchangeOfferOwnWorldComparator.baseX * 64;
						var4 = (PcmPlayer.regions[var2] & 255) * 64 - DevicePcmPlayerProvider.baseY * 64;
						var16 = class73.regionLandArchives[var2];
						if (var16 == null && HttpMethod.field36 < 800) {
							class167.method3417();
							SpriteMask.method6248(var3, var4, 64, 64);
						}
					}

					UserComparator10.method2915(true);

					for (var2 = 0; var2 < var1; ++var2) {
						byte[] var15 = class127.regionMapArchives[var2];
						if (var15 != null) {
							var4 = (PcmPlayer.regions[var2] >> 8) * 64 - GrandExchangeOfferOwnWorldComparator.baseX * 64;
							var5 = (PcmPlayer.regions[var2] & 255) * 64 - DevicePcmPlayerProvider.baseY * 64;
							class167.method3417();
							class60.method1129(var15, var4, var5, LoginType.scene, Client.collisionMaps);
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
						class167.method3417();

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

									for (int var12 = 0; var12 < PcmPlayer.regions.length; ++var12) {
										if (PcmPlayer.regions[var12] == var11 && class73.regionLandArchives[var12] != null) {
											int var13 = (var9 - var3) * 8;
											int var14 = (var10 - var4) * 8;
											class150.method3200(class73.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14, Client.collisionMaps);
											var18 = true;
											break;
										}
									}
								}

								if (!var18) {
									class191.method3716(var2, var3 * 8, var4 * 8);
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) {
						for (var3 = 0; var3 < 13; ++var3) {
							var4 = Client.instanceChunkTemplates[0][var2][var3];
							if (var4 == -1) {
								SpriteMask.method6248(var2 * 8, var3 * 8, 8, 8);
							}
						}
					}

					UserComparator10.method2915(true);

					for (var2 = 0; var2 < 4; ++var2) {
						class167.method3417();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								var5 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var5 != -1) {
									var6 = var5 >> 24 & 3;
									var7 = var5 >> 1 & 3;
									var8 = var5 >> 14 & 1023;
									var9 = var5 >> 3 & 2047;
									var10 = (var8 / 8 << 8) + var9 / 8;

									for (var11 = 0; var11 < PcmPlayer.regions.length; ++var11) {
										if (PcmPlayer.regions[var11] == var10 && class127.regionMapArchives[var11] != null) {
											Tiles.method2260(class127.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, LoginType.scene, Client.collisionMaps);
											break;
										}
									}
								}
							}
						}
					}
				}

				UserComparator10.method2915(true);
				class167.method3417();
				HttpRequest.method100(LoginType.scene, Client.collisionMaps);
				UserComparator10.method2915(true);
				var2 = Tiles.Tiles_minPlane;
				if (var2 > class172.Client_plane) {
					var2 = class172.Client_plane;
				}

				if (var2 < class172.Client_plane - 1) {
					var2 = class172.Client_plane - 1;
				}

				if (Client.isLowDetail) {
					LoginType.scene.init(Tiles.Tiles_minPlane);
				} else {
					LoginType.scene.init(0);
				}

				for (var3 = 0; var3 < 104; ++var3) {
					for (var4 = 0; var4 < 104; ++var4) {
						class477.updateItemPile(class172.Client_plane, var3, var4);
					}
				}

				class167.method3417();
				UserComparator10.method2927();
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				PacketBufferNode var19;
				if (UrlRequest.client.hasFrame()) {
					var19 = FadeInTask.getPacketBufferNode(ClientPacket.DETECT_MODIFIED_CLIENT, Client.packetWriter.isaacCipher);
					var19.packetBuffer.writeInt(1057001181);
					Client.packetWriter.addNode(var19);
				}

				if (!Client.isInInstance) {
					var3 = (HttpRequestTask.field85 - 6) / 8;
					var4 = (HttpRequestTask.field85 + 6) / 8;
					var5 = (HttpMethod.field36 - 6) / 8;
					var6 = (HttpMethod.field36 + 6) / 8;

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) {
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) {
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) {
								class73.archive9.loadRegionFromName("m" + var7 + "_" + var8);
								class73.archive9.loadRegionFromName("l" + var7 + "_" + var8);
							}
						}
					}
				}

				FaceNormal.updateGameState(30);
				class167.method3417();
				class348.method6643();
				var19 = FadeInTask.getPacketBufferNode(ClientPacket.field3255, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var19);
				class11.method103();
			}
		}
	}
}
