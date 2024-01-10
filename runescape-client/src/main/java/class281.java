import java.io.IOException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
public class class281 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "309166143"
	)
	@Export("loadWorlds")
	static boolean loadWorlds() {
		try {
			if (class101.World_request == null) {
				class101.World_request = SecureUrlRequester.urlRequester.request(new URL(PacketWriter.field1412));
			} else if (class101.World_request.isDone()) {
				byte[] var0 = class101.World_request.getResponse();
				Buffer var1 = new Buffer(var0);
				var1.readInt();
				World.World_count = var1.readUnsignedShort();
				World.World_worlds = new World[World.World_count];

				World var3;
				for (int var2 = 0; var2 < World.World_count; var3.index = var2++) {
					var3 = World.World_worlds[var2] = new World();
					var3.id = var1.readUnsignedShort();
					var3.properties = var1.readInt();
					var3.host = var1.readStringCp1252NullTerminated();
					var3.activity = var1.readStringCp1252NullTerminated();
					var3.location = var1.readUnsignedByte();
					var3.population = var1.readShort();
				}

				ModeWhere.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
				class101.World_request = null;
				return true;
			}
		} catch (Exception var4) {
			var4.printStackTrace();
			class101.World_request = null;
		}

		return false;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-15"
	)
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var4 == null) {
			var4 = new ItemContainer();
			ItemContainer.itemContainers.put(var4, (long)var0);
		}

		if (var4.ids.length <= var1) {
			int[] var5 = new int[var1 + 1];
			int[] var6 = new int[var1 + 1];

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) {
				var5[var7] = var4.ids[var7];
				var6[var7] = var4.quantities[var7];
			}

			for (var7 = var4.ids.length; var7 < var1; ++var7) {
				var5[var7] = -1;
				var6[var7] = 0;
			}

			var4.ids = var5;
			var4.quantities = var6;
		}

		var4.ids[var1] = var2;
		var4.quantities[var1] = var3;
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1406439569"
	)
	@Export("reinitializeClient")
	static void reinitializeClient() {
		if (ClientPreferences.varcs.hasUnwrittenChanges()) {
			ClientPreferences.varcs.write();
		}

		WorldMapElement.method3627();
		if (Canvas.mouseRecorder != null) {
			Canvas.mouseRecorder.isRunning = false;
		}

		Canvas.mouseRecorder = null;
		Client.packetWriter.close();
		if (GameEngine.taskHandler != null) {
			try {
				GameEngine.taskHandler.close();
			} catch (Exception var3) {
			}
		}

		GameEngine.taskHandler = null;
		LoginPacket.clear();
		Player.method2436();
		GrandExchangeOfferOwnWorldComparator.scene.clear();

		for (int var1 = 0; var1 < 4; ++var1) {
			Client.collisionMaps[var1].clear();
		}

		GrandExchangeOfferUnitPriceComparator.worldMap = null;
		Actor.method2488(0, 0);
		FontName.method9049();
		Client.playingJingle = false;
		WorldMapSection1.method5058();
		if (WorldMap.pcmPlayer1 != null) {
			WorldMap.pcmPlayer1.shutdown();
		}

		UrlRequester.field1418.method7134();
		Skeleton.method5380();
		if (SecureUrlRequester.urlRequester != null) {
			SecureUrlRequester.urlRequester.close();
		}

		class106.method2774();
		JagexCache.JagexCache_dat2File = null;
		JagexCache.JagexCache_idx255File = null;
		JagexCache.JagexCache_idxFiles = null;
		class235.method4603();
		class357.masterDisk = null;
		Client.archiveLoaders.clear();
		Client.field785 = 0;
		UrlRequester.field1418 = new JagNetThread();
		SecureUrlRequester.urlRequester = new SecureUrlRequester(VertexNormal.client.https, 219);

		try {
			HealthBarUpdate.method2495("oldschool", WorldMapCacheName.field2676, class28.field153.name, 0, 23);
		} catch (IOException var2) {
			throw new RuntimeException(var2);
		}

		class357.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
		GameEngine.taskHandler = new TaskHandler();
		VertexNormal.client.method516();
		Client.field528 = class92.field1139;
		class131.updateGameState(0);
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1795637744"
	)
	static final int method5633() {
		if (class93.clientPreferences.isRoofsHidden()) {
			return SecureUrlRequester.Client_plane;
		} else {
			int var0 = 3;
			if (UserComparator3.cameraPitch < 310) {
				int var1;
				int var2;
				if (Client.oculusOrbState == 1) {
					var1 = class367.oculusOrbFocalPointX >> 7;
					var2 = WorldMapCacheName.oculusOrbFocalPointY >> 7;
				} else {
					var1 = KeyHandler.localPlayer.x >> 7;
					var2 = KeyHandler.localPlayer.y >> 7;
				}

				int var3 = GameEngine.cameraX >> 7;
				int var4 = GrandExchangeOfferTotalQuantityComparator.cameraZ >> 7;
				if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
					return SecureUrlRequester.Client_plane;
				}

				if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
					return SecureUrlRequester.Client_plane;
				}

				if ((Tiles.Tiles_renderFlags[SecureUrlRequester.Client_plane][var3][var4] & 4) != 0) {
					var0 = SecureUrlRequester.Client_plane;
				}

				int var5;
				if (var1 > var3) {
					var5 = var1 - var3;
				} else {
					var5 = var3 - var1;
				}

				int var6;
				if (var2 > var4) {
					var6 = var2 - var4;
				} else {
					var6 = var4 - var2;
				}

				int var7;
				int var8;
				if (var5 > var6) {
					var7 = var6 * 65536 / var5;
					var8 = 32768;

					while (var1 != var3) {
						if (var3 < var1) {
							++var3;
						} else if (var3 > var1) {
							--var3;
						}

						if ((Tiles.Tiles_renderFlags[SecureUrlRequester.Client_plane][var3][var4] & 4) != 0) {
							var0 = SecureUrlRequester.Client_plane;
						}

						var8 += var7;
						if (var8 >= 65536) {
							var8 -= 65536;
							if (var4 < var2) {
								++var4;
							} else if (var4 > var2) {
								--var4;
							}

							if ((Tiles.Tiles_renderFlags[SecureUrlRequester.Client_plane][var3][var4] & 4) != 0) {
								var0 = SecureUrlRequester.Client_plane;
							}
						}
					}
				} else if (var6 > 0) {
					var7 = var5 * 65536 / var6;
					var8 = 32768;

					while (var4 != var2) {
						if (var4 < var2) {
							++var4;
						} else if (var4 > var2) {
							--var4;
						}

						if ((Tiles.Tiles_renderFlags[SecureUrlRequester.Client_plane][var3][var4] & 4) != 0) {
							var0 = SecureUrlRequester.Client_plane;
						}

						var8 += var7;
						if (var8 >= 65536) {
							var8 -= 65536;
							if (var3 < var1) {
								++var3;
							} else if (var3 > var1) {
								--var3;
							}

							if ((Tiles.Tiles_renderFlags[SecureUrlRequester.Client_plane][var3][var4] & 4) != 0) {
								var0 = SecureUrlRequester.Client_plane;
							}
						}
					}
				}
			}

			if (KeyHandler.localPlayer.x >= 0 && KeyHandler.localPlayer.y >= 0 && KeyHandler.localPlayer.x < 13312 && KeyHandler.localPlayer.y < 13312) {
				if ((Tiles.Tiles_renderFlags[SecureUrlRequester.Client_plane][KeyHandler.localPlayer.x >> 7][KeyHandler.localPlayer.y >> 7] & 4) != 0) {
					var0 = SecureUrlRequester.Client_plane;
				}

				return var0;
			} else {
				return SecureUrlRequester.Client_plane;
			}
		}
	}
}
