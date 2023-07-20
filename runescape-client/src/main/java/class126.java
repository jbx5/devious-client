import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
public class class126 {
	@ObfuscatedName("am")
	public static final float field1494;
	@ObfuscatedName("as")
	public static final float field1496;
	@ObfuscatedName("aj")
	static float[] field1492;
	@ObfuscatedName("ag")
	static float[] field1497;
	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("archive12")
	static Archive archive12;

	static {
		field1494 = Math.ulp(1.0F);
		field1496 = 2.0F * field1494;
		field1492 = new float[4];
		field1497 = new float[5];
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lda;",
		garbageValue = "-1786451104"
	)
	static ClientPreferences method2941() {
		AccessFile var0 = null;
		ClientPreferences var1 = new ClientPreferences();

		try {
			var0 = Decimator.getPreferencesFile("", KeyHandler.field138.name, false);
			byte[] var2 = new byte[(int)var0.length()];

			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) {
				var4 = var0.read(var2, var3, var2.length - var3);
				if (var4 == -1) {
					throw new IOException();
				}
			}

			var1 = new ClientPreferences(new Buffer(var2));
		} catch (Exception var6) {
		}

		try {
			if (var0 != null) {
				var0.close();
			}
		} catch (Exception var5) {
		}

		return var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1080653526"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static final void method2939() {
		CollisionMap.method4214(false);
		Client.field730 = 0;
		boolean var0 = true;

		int var1;
		for (var1 = 0; var1 < class155.regionLandArchives.length; ++var1) {
			if (UserComparator4.regionMapArchiveIds[var1] != -1 && class155.regionLandArchives[var1] == null) {
				class155.regionLandArchives[var1] = Canvas.archive9.takeFile(UserComparator4.regionMapArchiveIds[var1], 0);
				if (class155.regionLandArchives[var1] == null) {
					var0 = false;
					++Client.field730;
				}
			}

			if (class170.regionLandArchiveIds[var1] != -1 && class389.regionMapArchives[var1] == null) {
				class389.regionMapArchives[var1] = Canvas.archive9.takeFileEncrypted(class170.regionLandArchiveIds[var1], 0, class18.xteaKeys[var1]);
				if (class389.regionMapArchives[var1] == null) {
					var0 = false;
					++Client.field730;
				}
			}
		}

		if (!var0) {
			Client.field537 = 1;
		} else {
			Client.field679 = 0;
			var0 = true;

			int var3;
			int var4;
			for (var1 = 0; var1 < class155.regionLandArchives.length; ++var1) {
				byte[] var17 = class389.regionMapArchives[var1];
				if (var17 != null) {
					var3 = (MusicPatch.regions[var1] >> 8) * 64 - AbstractArchive.baseX * 64;
					var4 = (MusicPatch.regions[var1] & 255) * 64 - class148.baseY * 64;
					if (Client.isInInstance) {
						var3 = 10;
						var4 = 10;
					}

					var0 &= class303.method5753(var17, var3, var4);
				}
			}

			if (!var0) {
				Client.field537 = 2;
			} else {
				if (Client.field537 != 0) {
					Actor.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				class105.method2684();
				UserComparator5.scene.clear();

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

				class105.method2684();
				class325.method6104();
				var1 = class155.regionLandArchives.length;
				class133.method3041();
				CollisionMap.method4214(true);
				int var5;
				if (!Client.isInInstance) {
					byte[] var16;
					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (MusicPatch.regions[var2] >> 8) * 64 - AbstractArchive.baseX * 64;
						var4 = (MusicPatch.regions[var2] & 255) * 64 - class148.baseY * 64;
						var16 = class155.regionLandArchives[var2];
						if (var16 != null) {
							class105.method2684();
							World.method1862(var16, var3, var4, class309.field3456 * 8 - 48, class140.field1640 * 8 - 48, Client.collisionMaps);
						}
					}

					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (MusicPatch.regions[var2] >> 8) * 64 - AbstractArchive.baseX * 64;
						var4 = (MusicPatch.regions[var2] & 255) * 64 - class148.baseY * 64;
						var16 = class155.regionLandArchives[var2];
						if (var16 == null && class140.field1640 < 800) {
							class105.method2684();
							class203.method3851(var3, var4, 64, 64);
						}
					}

					CollisionMap.method4214(true);

					for (var2 = 0; var2 < var1; ++var2) {
						byte[] var15 = class389.regionMapArchives[var2];
						if (var15 != null) {
							var4 = (MusicPatch.regions[var2] >> 8) * 64 - AbstractArchive.baseX * 64;
							var5 = (MusicPatch.regions[var2] & 255) * 64 - class148.baseY * 64;
							class105.method2684();
							class19.method282(var15, var4, var5, UserComparator5.scene, Client.collisionMaps);
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
						class105.method2684();

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

									for (int var12 = 0; var12 < MusicPatch.regions.length; ++var12) {
										if (MusicPatch.regions[var12] == var11 && class155.regionLandArchives[var12] != null) {
											int var13 = (var9 - var3) * 8;
											int var14 = (var10 - var4) * 8;
											class177.method3543(class155.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14, Client.collisionMaps);
											var18 = true;
											break;
										}
									}
								}

								if (!var18) {
									class74.method2087(var2, var3 * 8, var4 * 8);
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) {
						for (var3 = 0; var3 < 13; ++var3) {
							var4 = Client.instanceChunkTemplates[0][var2][var3];
							if (var4 == -1) {
								class203.method3851(var2 * 8, var3 * 8, 8, 8);
							}
						}
					}

					CollisionMap.method4214(true);

					for (var2 = 0; var2 < 4; ++var2) {
						class105.method2684();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								var5 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var5 != -1) {
									var6 = var5 >> 24 & 3;
									var7 = var5 >> 1 & 3;
									var8 = var5 >> 14 & 1023;
									var9 = var5 >> 3 & 2047;
									var10 = (var8 / 8 << 8) + var9 / 8;

									for (var11 = 0; var11 < MusicPatch.regions.length; ++var11) {
										if (MusicPatch.regions[var11] == var10 && class389.regionMapArchives[var11] != null) {
											Tiles.method2192(class389.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, UserComparator5.scene, Client.collisionMaps);
											break;
										}
									}
								}
							}
						}
					}
				}

				CollisionMap.method4214(true);
				class105.method2684();
				AbstractUserComparator.method7982(UserComparator5.scene, Client.collisionMaps);
				CollisionMap.method4214(true);
				var2 = Tiles.Tiles_minPlane;
				if (var2 > class36.Client_plane) {
					var2 = class36.Client_plane;
				}

				if (var2 < class36.Client_plane - 1) {
					var2 = class36.Client_plane - 1;
				}

				if (Client.isLowDetail) {
					UserComparator5.scene.init(Tiles.Tiles_minPlane);
				} else {
					UserComparator5.scene.init(0);
				}

				for (var3 = 0; var3 < 104; ++var3) {
					for (var4 = 0; var4 < 104; ++var4) {
						class344.updateItemPile(var3, var4);
					}
				}

				class105.method2684();
				ScriptFrame.method1208();
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				PacketBufferNode var19;
				if (TileItem.client.hasFrame()) {
					var19 = class503.getPacketBufferNode(ClientPacket.DETECT_MODIFIED_CLIENT, Client.packetWriter.isaacCipher);
					var19.packetBuffer.writeInt(1057001181);
					Client.packetWriter.addNode(var19);
				}

				if (!Client.isInInstance) {
					var3 = (class309.field3456 - 6) / 8;
					var4 = (class309.field3456 + 6) / 8;
					var5 = (class140.field1640 - 6) / 8;
					var6 = (class140.field1640 + 6) / 8;

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) {
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) {
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) {
								Canvas.archive9.loadRegionFromName("m" + var7 + "_" + var8);
								Canvas.archive9.loadRegionFromName("l" + var7 + "_" + var8);
							}
						}
					}
				}

				class129.updateGameState(30);
				class105.method2684();
				class164.method3394();
				var19 = class503.getPacketBufferNode(ClientPacket.field3173, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var19);
				HealthBarDefinition.method3672();
			}
		}
	}
}
