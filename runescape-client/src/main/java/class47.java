import java.util.concurrent.locks.ReentrantLock;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
public class class47 {
	@ObfuscatedName("sf")
	@ObfuscatedSignature(
		descriptor = "Lgx;"
	)
	@Export("guestClanChannel")
	static ClanChannel guestClanChannel;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lcz;"
	)
	VorbisSample field309;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lbq;"
	)
	RawSound field308;
	@ObfuscatedName("an")
	ReentrantLock field310;

	@ObfuscatedSignature(
		descriptor = "(Lcz;Lbq;)V"
	)
	class47(VorbisSample var1, RawSound var2) {
		this.field309 = var1;
		this.field308 = var2;
		this.field310 = new ReentrantLock();
	}

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1106001778"
	)
	@Export("loadRegion")
	static final void loadRegion() {
		ReflectionCheck.method672(false);
		Client.field573 = 0;
		boolean var0 = true;

		int var1;
		for (var1 = 0; var1 < Canvas.regionLandArchives.length; ++var1) {
			if (WorldMapRectangle.regionMapArchiveIds[var1] != -1 && Canvas.regionLandArchives[var1] == null) {
				Canvas.regionLandArchives[var1] = ClientPreferences.archive9.takeFile(WorldMapRectangle.regionMapArchiveIds[var1], 0);
				if (Canvas.regionLandArchives[var1] == null) {
					var0 = false;
					++Client.field573;
				}
			}

			if (Interpreter.regionLandArchiveIds[var1] != -1 && Skeleton.regionMapArchives[var1] == null) {
				Skeleton.regionMapArchives[var1] = ClientPreferences.archive9.takeFileEncrypted(Interpreter.regionLandArchiveIds[var1], 0, class60.xteaKeys[var1]);
				if (Skeleton.regionMapArchives[var1] == null) {
					var0 = false;
					++Client.field573;
				}
			}
		}

		if (!var0) {
			Client.field704 = 1;
		} else {
			Client.field575 = 0;
			var0 = true;

			int var3;
			int var4;
			for (var1 = 0; var1 < Canvas.regionLandArchives.length; ++var1) {
				byte[] var17 = Skeleton.regionMapArchives[var1];
				if (var17 != null) {
					var3 = (class92.regions[var1] >> 8) * 64 - ConcurrentMidiTask.topLevelWorldView.baseX;
					var4 = (class92.regions[var1] & 255) * 64 - ConcurrentMidiTask.topLevelWorldView.baseY;
					if (Client.isInInstance) {
						var3 = 10;
						var4 = 10;
					}

					var0 &= RestClientThreadFactory.method190(var17, var3, var4);
				}
			}

			if (!var0) {
				Client.field704 = 2;
			} else {
				if (Client.field704 != 0) {
					HorizontalAlignment.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				ClanChannelMember.method3363();
				ConcurrentMidiTask.topLevelWorldView.scene.clearTempGameObjects();

				for (var1 = 0; var1 < 4; ++var1) {
					ConcurrentMidiTask.topLevelWorldView.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) {
					for (var2 = 0; var2 < 104; ++var2) {
						for (var3 = 0; var3 < 104; ++var3) {
							ConcurrentMidiTask.topLevelWorldView.tileSettings[var1][var2][var3] = 0;
						}
					}
				}

				ClanChannelMember.method3363();
				Occluder.method4145();
				var1 = Canvas.regionLandArchives.length;
				AbstractWorldMapData.method5949();
				ReflectionCheck.method672(true);
				int var5;
				if (!Client.isInInstance) {
					byte[] var16;
					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (class92.regions[var2] >> 8) * 64 - ConcurrentMidiTask.topLevelWorldView.baseX;
						var4 = (class92.regions[var2] & 255) * 64 - ConcurrentMidiTask.topLevelWorldView.baseY;
						var16 = Canvas.regionLandArchives[var2];
						if (var16 != null) {
							ClanChannelMember.method3363();
							World.method1928(ConcurrentMidiTask.topLevelWorldView, var16, var3, var4, HttpMethod.field33 * 8 - 48, class30.field136 * 8 - 48);
						}
					}

					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (class92.regions[var2] >> 8) * 64 - ConcurrentMidiTask.topLevelWorldView.baseX;
						var4 = (class92.regions[var2] & 255) * 64 - ConcurrentMidiTask.topLevelWorldView.baseY;
						var16 = Canvas.regionLandArchives[var2];
						if (var16 == null && class30.field136 < 800) {
							ClanChannelMember.method3363();
							PlayerCompositionColorTextureOverride.method4751(ConcurrentMidiTask.topLevelWorldView, var3, var4, 64, 64);
						}
					}

					ReflectionCheck.method672(true);

					for (var2 = 0; var2 < var1; ++var2) {
						byte[] var15 = Skeleton.regionMapArchives[var2];
						if (var15 != null) {
							var4 = (class92.regions[var2] >> 8) * 64 - ConcurrentMidiTask.topLevelWorldView.baseX;
							var5 = (class92.regions[var2] & 255) * 64 - ConcurrentMidiTask.topLevelWorldView.baseY;
							ClanChannelMember.method3363();
							class155.method3409(ConcurrentMidiTask.topLevelWorldView, var15, var4, var5);
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
						ClanChannelMember.method3363();

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

									for (int var12 = 0; var12 < class92.regions.length; ++var12) {
										if (class92.regions[var12] == var11 && Canvas.regionLandArchives[var12] != null) {
											int var13 = (var9 - var3) * 8;
											int var14 = (var10 - var4) * 8;
											TaskHandler.method4571(ConcurrentMidiTask.topLevelWorldView, Canvas.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14);
											var18 = true;
											break;
										}
									}
								}

								if (!var18) {
									UserComparator10.method3083(ConcurrentMidiTask.topLevelWorldView.tileHeights, var2, var3 * 8, var4 * 8);
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) {
						for (var3 = 0; var3 < 13; ++var3) {
							var4 = Client.instanceChunkTemplates[0][var2][var3];
							if (var4 == -1) {
								PlayerCompositionColorTextureOverride.method4751(ConcurrentMidiTask.topLevelWorldView, var2 * 8, var3 * 8, 8, 8);
							}
						}
					}

					ReflectionCheck.method672(true);

					for (var2 = 0; var2 < 4; ++var2) {
						ClanChannelMember.method3363();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								var5 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var5 != -1) {
									var6 = var5 >> 24 & 3;
									var7 = var5 >> 1 & 3;
									var8 = var5 >> 14 & 1023;
									var9 = var5 >> 3 & 2047;
									var10 = (var8 / 8 << 8) + var9 / 8;

									for (var11 = 0; var11 < class92.regions.length; ++var11) {
										if (class92.regions[var11] == var10 && Skeleton.regionMapArchives[var11] != null) {
											Tiles.method2347(ConcurrentMidiTask.topLevelWorldView, Skeleton.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7);
											break;
										}
									}
								}
							}
						}
					}
				}

				ReflectionCheck.method672(true);
				ClanChannelMember.method3363();
				class430.method7978(ConcurrentMidiTask.topLevelWorldView);
				ReflectionCheck.method672(true);
				var2 = Tiles.Tiles_minPlane;
				if (var2 > ConcurrentMidiTask.topLevelWorldView.plane) {
					var2 = ConcurrentMidiTask.topLevelWorldView.plane;
				}

				if (var2 < ConcurrentMidiTask.topLevelWorldView.plane - 1) {
					var2 = ConcurrentMidiTask.topLevelWorldView.plane - 1;
				}

				if (Client.isLowDetail) {
					ConcurrentMidiTask.topLevelWorldView.scene.init(Tiles.Tiles_minPlane);
				} else {
					ConcurrentMidiTask.topLevelWorldView.scene.init(0);
				}

				for (var3 = 0; var3 < 104; ++var3) {
					for (var4 = 0; var4 < 104; ++var4) {
						ClanChannelMember.method3364(ConcurrentMidiTask.topLevelWorldView, var3, var4);
					}
				}

				ClanChannelMember.method3363();
				ItemLayer.method3632();
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				PacketBufferNode var19;
				if (DynamicObject.client.hasFrame()) {
					var19 = class218.getPacketBufferNode(ClientPacket.DETECT_MODIFIED_CLIENT, Client.packetWriter.isaacCipher);
					var19.packetBuffer.writeInt(1057001181);
					Client.packetWriter.addNode(var19);
				}

				if (!Client.isInInstance) {
					var3 = (HttpMethod.field33 - 6) / 8;
					var4 = (HttpMethod.field33 + 6) / 8;
					var5 = (class30.field136 - 6) / 8;
					var6 = (class30.field136 + 6) / 8;

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) {
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) {
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) {
								ClientPreferences.archive9.loadRegionFromName("m" + var7 + "_" + var8);
								ClientPreferences.archive9.loadRegionFromName("l" + var7 + "_" + var8);
							}
						}
					}
				}

				ClanChannelMember.method3363();
				LoginState.method1213();
				var19 = class218.getPacketBufferNode(ClientPacket.field3321, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var19);
				UserComparator5.method3061();
				Client.field512 = false;
			}
		}
	}

	@ObfuscatedName("nf")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1273927055"
	)
	static void method849(int var0, int var1) {
		class453.method8429(class7.tempMenuAction, var0, var1);
		class7.tempMenuAction = null;
	}
}
