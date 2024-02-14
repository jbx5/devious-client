import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
public class class59 {
	@ObfuscatedName("ke")
	@ObfuscatedGetter(
		intValue = 1556739777
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lbp;"
	)
	VorbisFloor field427;
	@ObfuscatedName("aw")
	boolean field423;
	@ObfuscatedName("al")
	int[] field424;
	@ObfuscatedName("ai")
	int[] field422;
	@ObfuscatedName("ar")
	boolean[] field426;

	@ObfuscatedSignature(
		descriptor = "(Lbp;Z[I[I[Z)V"
	)
	class59(VorbisFloor var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
		this.field427 = var1;
		this.field423 = var2;
		this.field424 = var3;
		this.field422 = var4;
		this.field426 = var5;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([FIS)V",
		garbageValue = "12621"
	)
	void method1124(float[] var1, int var2) {
		int var3 = this.field427.field274.length;
		VorbisFloor var10000 = this.field427;
		int var4 = VorbisFloor.field276[this.field427.multiplier - 1];
		boolean[] var5 = this.field426;
		this.field426[1] = true;
		var5[0] = true;

		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		for (var6 = 2; var6 < var3; ++var6) {
			var7 = this.field427.method730(this.field424, var6);
			var8 = this.field427.method738(this.field424, var6);
			var9 = this.field427.method725(this.field424[var7], this.field422[var7], this.field424[var8], this.field422[var8], this.field424[var6]);
			var10 = this.field422[var6];
			int var11 = var4 - var9;
			int var13 = (var11 < var9 ? var11 : var9) << 1;
			if (var10 != 0) {
				boolean[] var14 = this.field426;
				this.field426[var8] = true;
				var14[var7] = true;
				this.field426[var6] = true;
				if (var10 >= var13) {
					this.field422[var6] = var11 > var9 ? var9 + (var10 - var9) : var11 + (var9 - var10) - 1;
				} else {
					this.field422[var6] = (var10 & 1) != 0 ? var9 - (var10 + 1) / 2 : var10 / 2 + var9;
				}
			} else {
				this.field426[var6] = false;
				this.field422[var6] = var9;
			}
		}

		this.VarbisFloor_sort(0, var3 - 1);
		var6 = 0;
		var7 = this.field427.multiplier * this.field422[0];

		for (var8 = 1; var8 < var3; ++var8) {
			if (this.field426[var8]) {
				var9 = this.field424[var8];
				var10 = this.field427.multiplier * this.field422[var8];
				this.field427.method726(var6, var7, var9, var10, var1, var2);
				if (var9 >= var2) {
					return;
				}

				var6 = var9;
				var7 = var10;
			}
		}

		var10000 = this.field427;
		float var16 = VorbisFloor.VorbisFloor_decibelStatics[var7];

		for (var9 = var6; var9 < var2; ++var9) {
			var1[var9] *= var16;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "811887838"
	)
	boolean method1125() {
		return this.field423;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "3"
	)
	@Export("VarbisFloor_sort")
	void VarbisFloor_sort(int var1, int var2) {
		if (var1 < var2) {
			int var3 = var1;
			int var4 = this.field424[var1];
			int var5 = this.field422[var1];
			boolean var6 = this.field426[var1];

			for (int var7 = var1 + 1; var7 <= var2; ++var7) {
				int var8 = this.field424[var7];
				if (var8 < var4) {
					this.field424[var3] = var8;
					this.field422[var3] = this.field422[var7];
					this.field426[var3] = this.field426[var7];
					++var3;
					this.field424[var7] = this.field424[var3];
					this.field422[var7] = this.field422[var3];
					this.field426[var7] = this.field426[var3];
				}
			}

			this.field424[var3] = var4;
			this.field422[var3] = var5;
			this.field426[var3] = var6;
			this.VarbisFloor_sort(var1, var3 - 1);
			this.VarbisFloor_sort(var3 + 1, var2);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILuu;B)Z",
		garbageValue = "-38"
	)
	public static boolean method1133(int var0, class529 var1) {
		return (var0 & var1.rsOrdinal()) != 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "26"
	)
	static final void method1137() {
		SecureRandomCallable.method2319("Your friend list is full. Max of 200 for free users, and 400 for members");
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-66317546"
	)
	public static void method1129() {
		HitSplatDefinition.HitSplatDefinition_cached.clear();
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "33"
	)
	static final void method1134() {
		DevicePcmPlayerProvider.method287(false);
		Client.field594 = 0;
		boolean var0 = true;

		int var1;
		for (var1 = 0; var1 < Player.regionLandArchives.length; ++var1) {
			if (class318.regionMapArchiveIds[var1] != -1 && Player.regionLandArchives[var1] == null) {
				Player.regionLandArchives[var1] = JagexCache.archive9.takeFile(class318.regionMapArchiveIds[var1], 0);
				if (Player.regionLandArchives[var1] == null) {
					var0 = false;
					++Client.field594;
				}
			}

			if (class146.regionLandArchiveIds[var1] != -1 && HorizontalAlignment.regionMapArchives[var1] == null) {
				HorizontalAlignment.regionMapArchives[var1] = JagexCache.archive9.takeFileEncrypted(class146.regionLandArchiveIds[var1], 0, FriendLoginUpdate.xteaKeys[var1]);
				if (HorizontalAlignment.regionMapArchives[var1] == null) {
					var0 = false;
					++Client.field594;
				}
			}
		}

		if (!var0) {
			Client.field598 = 1;
		} else {
			Client.field621 = 0;
			var0 = true;

			int var3;
			int var4;
			for (var1 = 0; var1 < Player.regionLandArchives.length; ++var1) {
				byte[] var17 = HorizontalAlignment.regionMapArchives[var1];
				if (var17 != null) {
					var3 = (class13.regions[var1] >> 8) * 64 - Projectile.baseX * 64;
					var4 = (class13.regions[var1] & 255) * 64 - GameEngine.baseY * 64;
					if (Client.isInInstance) {
						var3 = 10;
						var4 = 10;
					}

					var0 &= class127.method2999(var17, var3, var4);
				}
			}

			if (!var0) {
				Client.field598 = 2;
			} else {
				if (Client.field598 != 0) {
					RouteStrategy.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				class190.method3774();
				Actor.scene.clear();

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

				class190.method3774();
				GameEngine.method605();
				var1 = Player.regionLandArchives.length;
				InterfaceParent.method2350();
				DevicePcmPlayerProvider.method287(true);
				int var5;
				if (!Client.isInInstance) {
					byte[] var16;
					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (class13.regions[var2] >> 8) * 64 - Projectile.baseX * 64;
						var4 = (class13.regions[var2] & 255) * 64 - GameEngine.baseY * 64;
						var16 = Player.regionLandArchives[var2];
						if (var16 != null) {
							class190.method3774();
							HttpQueryParams.method8782(var16, var3, var4, JagNetThread.field4434 * 8 - 48, class317.field3456 * 8 - 48, Client.collisionMaps);
						}
					}

					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (class13.regions[var2] >> 8) * 64 - Projectile.baseX * 64;
						var4 = (class13.regions[var2] & 255) * 64 - GameEngine.baseY * 64;
						var16 = Player.regionLandArchives[var2];
						if (var16 == null && class317.field3456 < 800) {
							class190.method3774();
							Login.method2200(var3, var4, 64, 64);
						}
					}

					DevicePcmPlayerProvider.method287(true);

					for (var2 = 0; var2 < var1; ++var2) {
						byte[] var15 = HorizontalAlignment.regionMapArchives[var2];
						if (var15 != null) {
							var4 = (class13.regions[var2] >> 8) * 64 - Projectile.baseX * 64;
							var5 = (class13.regions[var2] & 255) * 64 - GameEngine.baseY * 64;
							class190.method3774();
							VarcInt.method3606(var15, var4, var5, Actor.scene, Client.collisionMaps);
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
						class190.method3774();

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

									for (int var12 = 0; var12 < class13.regions.length; ++var12) {
										if (class13.regions[var12] == var11 && Player.regionLandArchives[var12] != null) {
											int var13 = (var9 - var3) * 8;
											int var14 = (var10 - var4) * 8;
											HttpResponse.method269(Player.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14, Client.collisionMaps);
											var18 = true;
											break;
										}
									}
								}

								if (!var18) {
									class33.method454(var2, var3 * 8, var4 * 8);
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) {
						for (var3 = 0; var3 < 13; ++var3) {
							var4 = Client.instanceChunkTemplates[0][var2][var3];
							if (var4 == -1) {
								Login.method2200(var2 * 8, var3 * 8, 8, 8);
							}
						}
					}

					DevicePcmPlayerProvider.method287(true);

					for (var2 = 0; var2 < 4; ++var2) {
						class190.method3774();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								var5 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var5 != -1) {
									var6 = var5 >> 24 & 3;
									var7 = var5 >> 1 & 3;
									var8 = var5 >> 14 & 1023;
									var9 = var5 >> 3 & 2047;
									var10 = (var8 / 8 << 8) + var9 / 8;

									for (var11 = 0; var11 < class13.regions.length; ++var11) {
										if (class13.regions[var11] == var10 && HorizontalAlignment.regionMapArchives[var11] != null) {
											Tiles.method2285(HorizontalAlignment.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, Actor.scene, Client.collisionMaps);
											break;
										}
									}
								}
							}
						}
					}
				}

				DevicePcmPlayerProvider.method287(true);
				class190.method3774();
				class53.method1069(Actor.scene, Client.collisionMaps);
				DevicePcmPlayerProvider.method287(true);
				var2 = Tiles.Tiles_minPlane;
				if (var2 > class473.Client_plane) {
					var2 = class473.Client_plane;
				}

				if (var2 < class473.Client_plane - 1) {
					var2 = class473.Client_plane - 1;
				}

				if (Client.isLowDetail) {
					Actor.scene.init(Tiles.Tiles_minPlane);
				} else {
					Actor.scene.init(0);
				}

				for (var3 = 0; var3 < 104; ++var3) {
					for (var4 = 0; var4 < 104; ++var4) {
						class73.updateItemPile(class473.Client_plane, var3, var4);
					}
				}

				class190.method3774();
				CollisionMap.method4503();
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				PacketBufferNode var19;
				if (class193.client.hasFrame()) {
					var19 = ViewportMouse.getPacketBufferNode(ClientPacket.field3199, Client.packetWriter.isaacCipher);
					var19.packetBuffer.writeInt(1057001181);
					Client.packetWriter.addNode(var19);
				}

				if (!Client.isInInstance) {
					var3 = (JagNetThread.field4434 - 6) / 8;
					var4 = (JagNetThread.field4434 + 6) / 8;
					var5 = (class317.field3456 - 6) / 8;
					var6 = (class317.field3456 + 6) / 8;

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) {
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) {
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) {
								JagexCache.archive9.loadRegionFromName("m" + var7 + "_" + var8);
								JagexCache.archive9.loadRegionFromName("l" + var7 + "_" + var8);
							}
						}
					}
				}

				Interpreter.updateGameState(30);
				class190.method3774();
				MouseRecorder.method2366();
				var19 = ViewportMouse.getPacketBufferNode(ClientPacket.field3193, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var19);
				class321.method6145();
			}
		}
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1711332225"
	)
	static final void method1135() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) {
			if (var0.hitpoints > 0) {
				--var0.hitpoints;
			}

			if (var0.hitpoints == 0) {
				if (var0.objectId < 0 || class237.method4615(var0.objectId, var0.field1196)) {
					class439.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.objectId, var0.field1197, var0.field1196, var0.field1203);
					var0.remove();
				}
			} else {
				if (var0.delay > 0) {
					--var0.delay;
				}

				if (var0.delay == 0 && var0.x >= 1 && var0.y >= 1 && var0.x <= 102 && var0.y <= 102 && (var0.field1198 < 0 || class237.method4615(var0.field1198, var0.field1191))) {
					class439.addPendingSpawnToScene(var0.plane, var0.type, var0.x, var0.y, var0.field1198, var0.field1199, var0.field1191, var0.field1203);
					var0.delay = -1;
					if (var0.field1198 == var0.objectId && var0.objectId == -1) {
						var0.remove();
					} else if (var0.objectId == var0.field1198 && var0.field1197 == var0.field1199 && var0.field1191 == var0.field1196) {
						var0.remove();
					}
				}
			}
		}

	}
}
