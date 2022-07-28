import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("lh")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("ee")
	@ObfuscatedSignature(descriptor = "Llu;")
	@Export("archive19")
	static Archive archive19;

	@ObfuscatedName("o")
	@Export("state")
	byte state;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -2026185243)
	@Export("id")
	public int id;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -1258297859)
	@Export("unitPrice")
	public int unitPrice;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = -1246758821)
	@Export("totalQuantity")
	public int totalQuantity;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -1190136297)
	@Export("currentQuantity")
	public int currentQuantity;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 1875537815)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	}

	@ObfuscatedSignature(descriptor = "(Lqw;Z)V", garbageValue = "0")
	public GrandExchangeOffer(Buffer var1, boolean var2) {
		this.state = var1.readByte();
		this.id = var1.readUnsignedShort();
		this.unitPrice = var1.readInt();
		this.totalQuantity = var1.readInt();
		this.currentQuantity = var1.readInt();
		this.currentPrice = var1.readInt();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "64")
	@Export("status")
	public int status() {
		return this.state & 7;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1180687899")
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1532037296")
	void method6031(int var1) {
		this.state &= -8;
		this.state = ((byte) (this.state | var1 & 7));
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "134349312")
	void method6035(int var1) {
		this.state &= -9;
		if (var1 == 1) {
			this.state = ((byte) (this.state | 8));
		}
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "15761617")
	static final void method6027() {
		AbstractWorldMapData.method4959(false);
		Client.field613 = 0;
		boolean var0 = true;
		int var1;
		for (var1 = 0; var1 < class7.regionLandArchives.length; ++var1) {
			if (MidiPcmStream.regionMapArchiveIds[var1] != -1 && class7.regionLandArchives[var1] == null) {
				class7.regionLandArchives[var1] = class21.archive9.takeFile(MidiPcmStream.regionMapArchiveIds[var1], 0);
				if (class7.regionLandArchives[var1] == null) {
					var0 = false;
					++Client.field613;
				}
			}
			if (class19.regionLandArchiveIds[var1] != -1 && PcmPlayer.regionMapArchives[var1] == null) {
				PcmPlayer.regionMapArchives[var1] = class21.archive9.takeFileEncrypted(class19.regionLandArchiveIds[var1], 0, class131.xteaKeys[var1]);
				if (PcmPlayer.regionMapArchives[var1] == null) {
					var0 = false;
					++Client.field613;
				}
			}
		}
		if (!var0) {
			Client.field552 = 1;
		} else {
			Client.field609 = 0;
			var0 = true;
			int var3;
			int var4;
			for (var1 = 0; var1 < class7.regionLandArchives.length; ++var1) {
				byte[] var15 = PcmPlayer.regionMapArchives[var1];
				if (var15 != null) {
					var3 = (FileSystem.regions[var1] >> 8) * 64 - class300.baseX * 8;
					var4 = (FileSystem.regions[var1] & 255) * 64 - Message.baseY * 64;
					if (Client.isInInstance) {
						var3 = 10;
						var4 = 10;
					}
					var0 &= SecureRandomFuture.method2022(var15, var3, var4);
				}
			}
			if (!var0) {
				Client.field552 = 2;
			} else {
				if (Client.field552 != 0) {
					class273.drawLoadingMessage("Loading - please wait." + ("<br>" + " (") + 100 + "%" + ")", true);
				}
				class12.playPcmPlayers();
				Decimator.scene.clear();
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
				class12.playPcmPlayers();
				class116.method2767();
				var1 = class7.regionLandArchives.length;
				ItemComposition.method3703();
				AbstractWorldMapData.method4959(true);
				int var5;
				if (!Client.isInInstance) {
					byte[] var14;
					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (FileSystem.regions[var2] >> 8) * 64 - class300.baseX * 8;
						var4 = (FileSystem.regions[var2] & 255) * 64 - Message.baseY * 64;
						var14 = class7.regionLandArchives[var2];
						if (var14 != null) {
							class12.playPcmPlayers();
							class433.method7605(var14, var3, var4, WorldMapCacheName.field2868 * 8 - 48, SoundSystem.field319 * 8 - 48, Client.collisionMaps);
						}
					}
					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (FileSystem.regions[var2] >> 8) * 64 - class300.baseX * 8;
						var4 = (FileSystem.regions[var2] & 255) * 64 - Message.baseY * 64;
						var14 = class7.regionLandArchives[var2];
						if (var14 == null && SoundSystem.field319 < 800) {
							class12.playPcmPlayers();
							class155.method3235(var3, var4, 64, 64);
						}
					}
					AbstractWorldMapData.method4959(true);
					for (var2 = 0; var2 < var1; ++var2) {
						byte[] var13 = PcmPlayer.regionMapArchives[var2];
						if (var13 != null) {
							var4 = (FileSystem.regions[var2] >> 8) * 64 - class300.baseX * 8;
							var5 = (FileSystem.regions[var2] & 255) * 64 - Message.baseY * 64;
							class12.playPcmPlayers();
							Script.method2039(var13, var4, var5, Decimator.scene, Client.collisionMaps);
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
						class12.playPcmPlayers();
						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								boolean var16 = false;
								var6 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var6 != -1) {
									var7 = var6 >> 24 & 3;
									var8 = var6 >> 1 & 3;
									var9 = var6 >> 14 & 1023;
									var10 = var6 >> 3 & 2047;
									var11 = (var9 / 8 << 8) + var10 / 8;
									for (int var12 = 0; var12 < FileSystem.regions.length; ++var12) {
										if (FileSystem.regions[var12] == var11 && class7.regionLandArchives[var12] != null) {
											class136.method2954(class7.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, Client.collisionMaps);
											var16 = true;
											break;
										}
									}
								}
								if (!var16) {
									ChatChannel.method2056(var2, var3 * 8, var4 * 8);
								}
							}
						}
					}
					for (var2 = 0; var2 < 13; ++var2) {
						for (var3 = 0; var3 < 13; ++var3) {
							var4 = Client.instanceChunkTemplates[0][var2][var3];
							if (var4 == -1) {
								class155.method3235(var2 * 8, var3 * 8, 8, 8);
							}
						}
					}
					AbstractWorldMapData.method4959(true);
					for (var2 = 0; var2 < 4; ++var2) {
						class12.playPcmPlayers();
						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								var5 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var5 != -1) {
									var6 = var5 >> 24 & 3;
									var7 = var5 >> 1 & 3;
									var8 = var5 >> 14 & 1023;
									var9 = var5 >> 3 & 2047;
									var10 = (var8 / 8 << 8) + var9 / 8;
									for (var11 = 0; var11 < FileSystem.regions.length; ++var11) {
										if (FileSystem.regions[var11] == var10 && PcmPlayer.regionMapArchives[var11] != null) {
											Tiles.method2104(PcmPlayer.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, Decimator.scene, Client.collisionMaps);
											break;
										}
									}
								}
							}
						}
					}
				}
				AbstractWorldMapData.method4959(true);
				class12.playPcmPlayers();
				ClientPreferences.method2401(Decimator.scene, Client.collisionMaps);
				AbstractWorldMapData.method4959(true);
				var2 = Tiles.Tiles_minPlane;
				if (var2 > FriendSystem.Client_plane) {
					var2 = FriendSystem.Client_plane;
				}
				if (var2 < FriendSystem.Client_plane - 1) {
					var2 = FriendSystem.Client_plane - 1;
				}
				if (Client.isLowDetail) {
					Decimator.scene.init(Tiles.Tiles_minPlane);
				} else {
					Decimator.scene.init(0);
				}
				for (var3 = 0; var3 < 104; ++var3) {
					for (var4 = 0; var4 < 104; ++var4) {
						WorldMapManager.updateItemPile(var3, var4);
					}
				}
				class12.playPcmPlayers();
				class129.method2904();
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				PacketBufferNode var17;
				if (class329.client.hasFrame()) {
					var17 = class433.getPacketBufferNode(ClientPacket.DETECT_MODIFIED_CLIENT, Client.packetWriter.isaacCipher);
					var17.packetBuffer.writeInt(1057001181);
					Client.packetWriter.addNode(var17);
				}
				if (!Client.isInInstance) {
					var3 = (WorldMapCacheName.field2868 - 6) / 8;
					var4 = (WorldMapCacheName.field2868 + 6) / 8;
					var5 = (SoundSystem.field319 - 6) / 8;
					var6 = (SoundSystem.field319 + 6) / 8;
					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) {
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) {
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) {
								class21.archive9.loadRegionFromName("m" + var7 + "_" + var8);
								class21.archive9.loadRegionFromName("l" + var7 + "_" + var8);
							}
						}
					}
				}
				class82.updateGameState(30);
				class12.playPcmPlayers();
				class142.method3069();
				var17 = class433.getPacketBufferNode(ClientPacket.field2993, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var17);
				FriendSystem.method1769();
			}
		}
	}
}