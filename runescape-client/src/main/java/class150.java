import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("ed")
public class class150 extends class128 {
	@ObfuscatedName("m")
	@ObfuscatedGetter(intValue = 182134033)
	static int field1677;

	@ObfuscatedName("ix")
	@ObfuscatedGetter(intValue = -241255257)
	@Export("selectedItemWidget")
	static int selectedItemWidget;

	@ObfuscatedName("s")
	@ObfuscatedGetter(longValue = -4544622703293666003L)
	long field1685;

	@ObfuscatedName("h")
	String field1678;

	@ObfuscatedSignature(descriptor = "Lei;")
	final class131 this$0;

	@ObfuscatedSignature(descriptor = "(Lei;)V")
	class150(class131 var1) {
		this.this$0 = var1;
		this.field1685 = -1L;
		this.field1678 = null;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lqr;I)V", garbageValue = "-885940784")
	void vmethod3087(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1685 = var1.readLong();
		}
		this.field1678 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Leh;B)V", garbageValue = "0")
	void vmethod3084(ClanSettings var1) {
		var1.method2908(this.field1685, this.field1678);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lls;Ljava/lang/String;Ljava/lang/String;I)Lqe;", garbageValue = "-1617212274")
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1);
		int var4 = var0.getFileId(var3, var2);
		return Clock.method3260(var0, var3, var4);
	}

	@ObfuscatedName("gx")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "137192030")
	static final void method3071() {
		class6.method45(false);
		Client.field670 = 0;
		boolean var0 = true;
		int var1;
		for (var1 = 0; var1 < TaskHandler.regionLandArchives.length; ++var1) {
			if (Archive.regionMapArchiveIds[var1] != -1 && TaskHandler.regionLandArchives[var1] == null) {
				TaskHandler.regionLandArchives[var1] = class120.archive9.takeFile(Archive.regionMapArchiveIds[var1], 0);
				if (TaskHandler.regionLandArchives[var1] == null) {
					var0 = false;
					++Client.field670;
				}
			}
			if (NetFileRequest.regionLandArchiveIds[var1] != -1 && Varcs.regionMapArchives[var1] == null) {
				Varcs.regionMapArchives[var1] = class120.archive9.takeFileEncrypted(NetFileRequest.regionLandArchiveIds[var1], 0, class220.xteaKeys[var1]);
				if (Varcs.regionMapArchives[var1] == null) {
					var0 = false;
					++Client.field670;
				}
			}
		}
		if (!var0) {
			Client.field539 = 1;
		} else {
			Client.field644 = 0;
			var0 = true;
			int var3;
			int var4;
			for (var1 = 0; var1 < TaskHandler.regionLandArchives.length; ++var1) {
				byte[] var15 = Varcs.regionMapArchives[var1];
				if (var15 != null) {
					var3 = (class394.regions[var1] >> 8) * 64 - Decimator.baseX * 8;
					var4 = (class394.regions[var1] & 255) * 64 - class7.baseY * 64;
					if (Client.isInInstance) {
						var3 = 10;
						var4 = 10;
					}
					var0 &= class140.method2968(var15, var3, var4);
				}
			}
			if (!var0) {
				Client.field539 = 2;
			} else {
				if (Client.field539 != 0) {
					class20.drawLoadingMessage("Loading - please wait." + ("<br>" + " (") + 100 + "%" + ")", true);
				}
				class83.playPcmPlayers();
				class12.scene.clear();
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
				class83.playPcmPlayers();
				class19.method284();
				var1 = TaskHandler.regionLandArchives.length;
				class83.method2085();
				class6.method45(true);
				int var5;
				if (!Client.isInInstance) {
					byte[] var14;
					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (class394.regions[var2] >> 8) * 64 - Decimator.baseX * 8;
						var4 = (class394.regions[var2] & 255) * 64 - class7.baseY * 64;
						var14 = TaskHandler.regionLandArchives[var2];
						if (var14 != null) {
							class83.playPcmPlayers();
							Script.method1948(var14, var3, var4, class352.field4196 * 8 - 48, class20.field105 * 8 - 48, Client.collisionMaps);
						}
					}
					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (class394.regions[var2] >> 8) * 64 - Decimator.baseX * 8;
						var4 = (class394.regions[var2] & 255) * 64 - class7.baseY * 64;
						var14 = TaskHandler.regionLandArchives[var2];
						if (var14 == null && class20.field105 < 800) {
							class83.playPcmPlayers();
							class125.method2776(var3, var4, 64, 64);
						}
					}
					class6.method45(true);
					for (var2 = 0; var2 < var1; ++var2) {
						byte[] var13 = Varcs.regionMapArchives[var2];
						if (var13 != null) {
							var4 = (class394.regions[var2] >> 8) * 64 - Decimator.baseX * 8;
							var5 = (class394.regions[var2] & 255) * 64 - class7.baseY * 64;
							class83.playPcmPlayers();
							class12.method157(var13, var4, var5, class12.scene, Client.collisionMaps);
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
						class83.playPcmPlayers();
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
									for (int var12 = 0; var12 < class394.regions.length; ++var12) {
										if (class394.regions[var12] == var11 && TaskHandler.regionLandArchives[var12] != null) {
											ItemComposition.method3657(TaskHandler.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, Client.collisionMaps);
											var16 = true;
											break;
										}
									}
								}
								if (!var16) {
									ArchiveDisk.method6835(var2, var3 * 8, var4 * 8);
								}
							}
						}
					}
					for (var2 = 0; var2 < 13; ++var2) {
						for (var3 = 0; var3 < 13; ++var3) {
							var4 = Client.instanceChunkTemplates[0][var2][var3];
							if (var4 == -1) {
								class125.method2776(var2 * 8, var3 * 8, 8, 8);
							}
						}
					}
					class6.method45(true);
					for (var2 = 0; var2 < 4; ++var2) {
						class83.playPcmPlayers();
						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								var5 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var5 != -1) {
									var6 = var5 >> 24 & 3;
									var7 = var5 >> 1 & 3;
									var8 = var5 >> 14 & 1023;
									var9 = var5 >> 3 & 2047;
									var10 = (var8 / 8 << 8) + var9 / 8;
									for (var11 = 0; var11 < class394.regions.length; ++var11) {
										if (class394.regions[var11] == var10 && Varcs.regionMapArchives[var11] != null) {
											Tiles.method2011(Varcs.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, class12.scene, Client.collisionMaps);
											break;
										}
									}
								}
							}
						}
					}
				}
				class6.method45(true);
				class83.playPcmPlayers();
				User.method6633(class12.scene, Client.collisionMaps);
				class6.method45(true);
				var2 = Tiles.Tiles_minPlane;
				if (var2 > class268.Client_plane) {
					var2 = class268.Client_plane;
				}
				if (var2 < class268.Client_plane - 1) {
					var2 = class268.Client_plane - 1;
				}
				if (Client.isLowDetail) {
					class12.scene.init(Tiles.Tiles_minPlane);
				} else {
					class12.scene.init(0);
				}
				for (var3 = 0; var3 < 104; ++var3) {
					for (var4 = 0; var4 < 104; ++var4) {
						class360.updateItemPile(var3, var4);
					}
				}
				class83.playPcmPlayers();
				MouseRecorder.method2070();
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				PacketBufferNode var17;
				if (AbstractByteArrayCopier.client.hasFrame()) {
					var17 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.DETECT_MODIFIED_CLIENT, Client.packetWriter.isaacCipher);
					var17.packetBuffer.writeInt(1057001181);
					Client.packetWriter.addNode(var17);
				}
				if (!Client.isInInstance) {
					var3 = (class352.field4196 - 6) / 8;
					var4 = (class352.field4196 + 6) / 8;
					var5 = (class20.field105 - 6) / 8;
					var6 = (class20.field105 + 6) / 8;
					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) {
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) {
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) {
								class120.archive9.loadRegionFromName("m" + var7 + "_" + var8);
								class120.archive9.loadRegionFromName("l" + var7 + "_" + var8);
							}
						}
					}
				}
				class4.updateGameState(30);
				class83.playPcmPlayers();
				class144.method3011();
				var17 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2948, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var17);
				class82.method2078();
			}
		}
	}
}