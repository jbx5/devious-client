import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ks")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Llo;")
	@Export("ArchiveDiskActionHandler_requestQueue")
	public static NodeDeque ArchiveDiskActionHandler_requestQueue;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Llo;")
	@Export("ArchiveDiskActionHandler_responseQueue")
	public static NodeDeque ArchiveDiskActionHandler_responseQueue;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -962043785)
	public static int field3971;

	@ObfuscatedName("f")
	@Export("ArchiveDiskActionHandler_lock")
	public static Object ArchiveDiskActionHandler_lock;

	@ObfuscatedName("j")
	@Export("ArchiveDiskActionHandler_thread")
	static Thread ArchiveDiskActionHandler_thread;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque();
		ArchiveDiskActionHandler_responseQueue = new NodeDeque();
		field3971 = 0;
		ArchiveDiskActionHandler_lock = new Object();
	}

	ArchiveDiskActionHandler() {
	}

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) {
					var1 = ((ArchiveDiskAction) (ArchiveDiskActionHandler_requestQueue.last()));
				}
				if (var1 != null) {
					if (var1.type == 0) {
						var1.archiveDisk.write(((int) (var1.key)), var1.data, var1.data.length);
						synchronized(ArchiveDiskActionHandler_requestQueue) {
							var1.remove();
						}
					} else if (var1.type == 1) {
						var1.data = var1.archiveDisk.read(((int) (var1.key)));
						synchronized(ArchiveDiskActionHandler_requestQueue) {
							ArchiveDiskActionHandler_responseQueue.addFirst(var1);
						}
					}
					synchronized(ArchiveDiskActionHandler_lock) {
						if (field3971 <= 1) {
							field3971 = 0;
							ArchiveDiskActionHandler_lock.notifyAll();
							return;
						}
						field3971 = 600;
					}
				} else {
					DynamicObject.method1991(100L);
					synchronized(ArchiveDiskActionHandler_lock) {
						if (field3971 <= 1) {
							field3971 = 0;
							ArchiveDiskActionHandler_lock.notifyAll();
							return;
						}
						--field3971;
					}
				}
			} 
		} catch (Exception var13) {
			class249.RunException_sendStackTrace(((String) (null)), var13);
		}
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1673600098")
	static final void method5793() {
		Script.method1978(false);
		Client.field694 = 0;
		boolean var0 = true;
		int var1;
		for (var1 = 0; var1 < Actor.regionLandArchives.length; ++var1) {
			if (PcmPlayer.regionMapArchiveIds[var1] != -1 && Actor.regionLandArchives[var1] == null) {
				Actor.regionLandArchives[var1] = WorldMapSectionType.archive9.takeFile(PcmPlayer.regionMapArchiveIds[var1], 0);
				if (Actor.regionLandArchives[var1] == null) {
					var0 = false;
					++Client.field694;
				}
			}
			if (ObjectSound.regionLandArchiveIds[var1] != -1 && class145.regionMapArchives[var1] == null) {
				class145.regionMapArchives[var1] = WorldMapSectionType.archive9.takeFileEncrypted(ObjectSound.regionLandArchiveIds[var1], 0, WorldMapRegion.xteaKeys[var1]);
				if (class145.regionMapArchives[var1] == null) {
					var0 = false;
					++Client.field694;
				}
			}
		}
		if (!var0) {
			Client.field549 = 1;
		} else {
			Client.field547 = 0;
			var0 = true;
			int var3;
			int var4;
			for (var1 = 0; var1 < Actor.regionLandArchives.length; ++var1) {
				byte[] var15 = class145.regionMapArchives[var1];
				if (var15 != null) {
					var3 = (Client.regions[var1] >> 8) * 64 - class28.baseX;
					var4 = (Client.regions[var1] & 255) * 64 - WorldMapLabelSize.baseY;
					if (Client.isInInstance) {
						var3 = 10;
						var4 = 10;
					}
					var0 &= UserComparator10.method2611(var15, var3, var4);
				}
			}
			if (!var0) {
				Client.field549 = 2;
			} else {
				if (Client.field549 != 0) {
					SequenceDefinition.drawLoadingMessage("Loading - please wait." + ("<br>" + " (") + 100 + "%" + ")", true);
				}
				Renderable.playPcmPlayers();
				class356.scene.clear();
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
				Renderable.playPcmPlayers();
				class259.method5188();
				var1 = Actor.regionLandArchives.length;
				Decimator.method1018();
				Script.method1978(true);
				int var5;
				if (!Client.isInInstance) {
					byte[] var14;
					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (Client.regions[var2] >> 8) * 64 - class28.baseX;
						var4 = (Client.regions[var2] & 255) * 64 - WorldMapLabelSize.baseY;
						var14 = Actor.regionLandArchives[var2];
						if (var14 != null) {
							Renderable.playPcmPlayers();
							UserComparator1.method8020(var14, var3, var4, GrandExchangeOffer.field4070 * 8 - 48, ApproximateRouteStrategy.field466 * 8 - 48, Client.collisionMaps);
						}
					}
					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (Client.regions[var2] >> 8) * 64 - class28.baseX;
						var4 = (Client.regions[var2] & 255) * 64 - WorldMapLabelSize.baseY;
						var14 = Actor.regionLandArchives[var2];
						if (var14 == null && ApproximateRouteStrategy.field466 < 800) {
							Renderable.playPcmPlayers();
							class11.method98(var3, var4, 64, 64);
						}
					}
					Script.method1978(true);
					for (var2 = 0; var2 < var1; ++var2) {
						byte[] var13 = class145.regionMapArchives[var2];
						if (var13 != null) {
							var4 = (Client.regions[var2] >> 8) * 64 - class28.baseX;
							var5 = (Client.regions[var2] & 255) * 64 - WorldMapLabelSize.baseY;
							Renderable.playPcmPlayers();
							VertexNormal.method4527(var13, var4, var5, class356.scene, Client.collisionMaps);
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
						Renderable.playPcmPlayers();
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
									for (int var12 = 0; var12 < Client.regions.length; ++var12) {
										if (Client.regions[var12] == var11 && Actor.regionLandArchives[var12] != null) {
											Canvas.method315(Actor.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, Client.collisionMaps);
											var16 = true;
											break;
										}
									}
								}
								if (!var16) {
									class28.method352(var2, var3 * 8, var4 * 8);
								}
							}
						}
					}
					for (var2 = 0; var2 < 13; ++var2) {
						for (var3 = 0; var3 < 13; ++var3) {
							var4 = Client.instanceChunkTemplates[0][var2][var3];
							if (var4 == -1) {
								class11.method98(var2 * 8, var3 * 8, 8, 8);
							}
						}
					}
					Script.method1978(true);
					for (var2 = 0; var2 < 4; ++var2) {
						Renderable.playPcmPlayers();
						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								var5 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var5 != -1) {
									var6 = var5 >> 24 & 3;
									var7 = var5 >> 1 & 3;
									var8 = var5 >> 14 & 1023;
									var9 = var5 >> 3 & 2047;
									var10 = (var8 / 8 << 8) + var9 / 8;
									for (var11 = 0; var11 < Client.regions.length; ++var11) {
										if (Client.regions[var11] == var10 && class145.regionMapArchives[var11] != null) {
											Tiles.method2007(class145.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, class356.scene, Client.collisionMaps);
											break;
										}
									}
								}
							}
						}
					}
				}
				Script.method1978(true);
				Renderable.playPcmPlayers();
				class134.method2905(class356.scene, Client.collisionMaps);
				Script.method1978(true);
				var2 = Tiles.Tiles_minPlane;
				if (var2 > PacketWriter.Client_plane) {
					var2 = PacketWriter.Client_plane;
				}
				if (var2 < PacketWriter.Client_plane - 1) {
					var2 = PacketWriter.Client_plane - 1;
				}
				if (Client.isLowDetail) {
					class356.scene.init(Tiles.Tiles_minPlane);
				} else {
					class356.scene.init(0);
				}
				for (var3 = 0; var3 < 104; ++var3) {
					for (var4 = 0; var4 < 104; ++var4) {
						class133.updateItemPile(var3, var4);
					}
				}
				Renderable.playPcmPlayers();
				class4.method11();
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				PacketBufferNode var17;
				if (class353.client.hasFrame()) {
					var17 = EnumComposition.getPacketBufferNode(ClientPacket.DETECT_MODIFIED_CLIENT, Client.packetWriter.isaacCipher);
					var17.packetBuffer.writeInt(1057001181);
					Client.packetWriter.addNode(var17);
				}
				if (!Client.isInInstance) {
					var3 = (GrandExchangeOffer.field4070 - 6) / 8;
					var4 = (GrandExchangeOffer.field4070 + 6) / 8;
					var5 = (ApproximateRouteStrategy.field466 - 6) / 8;
					var6 = (ApproximateRouteStrategy.field466 + 6) / 8;
					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) {
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) {
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) {
								WorldMapSectionType.archive9.loadRegionFromName("m" + var7 + "_" + var8);
								WorldMapSectionType.archive9.loadRegionFromName("l" + var7 + "_" + var8);
							}
						}
					}
				}
				HealthBarUpdate.updateGameState(30);
				Renderable.playPcmPlayers();
				class361.method6552();
				var17 = EnumComposition.getPacketBufferNode(ClientPacket.field2989, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var17);
				Calendar.method5504();
			}
		}
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-232514392")
	static final void method5779() {
		int var0 = UserComparator3.menuX;
		int var1 = ViewportMouse.menuY;
		int var2 = Language.menuWidth;
		int var3 = Player.menuHeight;
		int var4 = 6116423;
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, var4);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0 + 1, var1 + 1, var2 - 2, 16, 0);
		Rasterizer2D.Rasterizer2D_drawRectangle(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
		TileItem.fontBold12.draw("Choose Option", var0 + 3, var1 + 14, var4, -1);
		int var5 = MouseHandler.MouseHandler_x;
		int var6 = MouseHandler.MouseHandler_y;
		int var7;
		int var8;
		int var9;
		for (var7 = 0; var7 < Client.menuOptionsCount; ++var7) {
			var8 = var1 + (Client.menuOptionsCount - 1 - var7) * 15 + 31;
			var9 = 16777215;
			if (var5 > var0 && var5 < var2 + var0 && var6 > var8 - 13 && var6 < var8 + 3) {
				var9 = 16776960;
			}
			Font var12 = TileItem.fontBold12;
			String var13;
			if (var7 < 0) {
				var13 = "";
			} else if (Client.menuTargets[var7].length() > 0) {
				var13 = Client.menuActions[var7] + " " + Client.menuTargets[var7];
			} else {
				var13 = Client.menuActions[var7];
			}
			var12.draw(var13, var0 + 3, var8, var9, 0);
		}
		var7 = UserComparator3.menuX;
		var8 = ViewportMouse.menuY;
		var9 = Language.menuWidth;
		int var10 = Player.menuHeight;
		for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) {
			if (Client.rootWidgetWidths[var11] + Client.rootWidgetXs[var11] > var7 && Client.rootWidgetXs[var11] < var7 + var9 && Client.rootWidgetHeights[var11] + Client.rootWidgetYs[var11] > var8 && Client.rootWidgetYs[var11] < var8 + var10) {
				Client.field704[var11] = true;
			}
		}
	}
}