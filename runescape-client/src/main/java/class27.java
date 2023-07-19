import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Arrays;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bb")
public class class27 {
	@ObfuscatedName("ag")
	int[] field143;
	@ObfuscatedName("az")
	int[] field144;

	public class27() {
		this.field143 = new int[112];
		this.field144 = new int[192];
		Arrays.fill(this.field143, 3);
		Arrays.fill(this.field144, 3);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "19"
	)
	public void method389(int var1, int var2) {
		if (this.method397(var1) && this.method399(var2)) {
			this.field143[var1] = var2;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(CII)V",
		garbageValue = "1505085994"
	)
	public void method390(char var1, int var2) {
		if (this.method409(var1) && this.method399(var2)) {
			this.field144[var1] = var2;
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "62"
	)
	public int method391(int var1) {
		return this.method397(var1) ? this.field143[var1] : 0;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(CS)I",
		garbageValue = "-2560"
	)
	public int method388(char var1) {
		return this.method409(var1) ? this.field144[var1] : 0;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2027151744"
	)
	public boolean method393(int var1) {
		return this.method397(var1) && (this.field143[var1] == 1 || this.field143[var1] == 3);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-2113017491"
	)
	public boolean method394(char var1) {
		return this.method409(var1) && (this.field144[var1] == 1 || this.field144[var1] == 3);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-651027133"
	)
	public boolean method396(int var1) {
		return this.method397(var1) && (this.field143[var1] == 2 || this.field143[var1] == 3);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "392210402"
	)
	public boolean method404(char var1) {
		return this.method409(var1) && (this.field144[var1] == 2 || this.field144[var1] == 3);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "295186281"
	)
	boolean method397(int var1) {
		if (var1 >= 0 && var1 < 112) {
			return true;
		} else {
			System.out.println("Invalid keycode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "16"
	)
	boolean method409(char var1) {
		if (var1 >= 0 && var1 < 192) {
			return true;
		} else {
			System.out.println("Invalid keychar: " + var1);
			return false;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1832967657"
	)
	boolean method399(int var1) {
		if (var1 >= 0 && var1 < 4) {
			return true;
		} else {
			System.out.println("Invalid mode: " + var1);
			return false;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "0"
	)
	static int method422(String var0) {
		if (var0.equals("centre")) {
			return 1;
		} else {
			return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2;
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "937542062"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0;
		if (UserComparator4.garbageCollector == null || !UserComparator4.garbageCollector.isValid()) {
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
					if (var2.isValid()) {
						UserComparator4.garbageCollector = var2;
						GameEngine.garbageCollectorLastCheckTimeMs = -1L;
						GameEngine.garbageCollectorLastCollectionTime = -1L;
					}
				}
			} catch (Throwable var11) {
			}
		}

		if (UserComparator4.garbageCollector != null) {
			long var9 = class113.method2835();
			long var3 = UserComparator4.garbageCollector.getCollectionTime();
			if (GameEngine.garbageCollectorLastCollectionTime != -1L) {
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime;
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs;
				if (var7 != 0L) {
					var0 = (int)(var5 * 100L / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3;
			GameEngine.garbageCollectorLastCheckTimeMs = var9;
		}

		return var0;
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "193"
	)
	static final void method421() {
		int var0 = Players.Players_count;
		int[] var1 = Players.Players_indices;

		for (int var2 = 0; var2 < var0; ++var2) {
			Player var3 = Client.players[var1[var2]];
			if (var3 != null) {
				class47.updateActorSequence(var3, 1);
			}
		}

	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-71"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount;
		if (class136.localPlayer.x >> 7 == Client.destinationX && class136.localPlayer.y >> 7 == Client.destinationY) {
			Client.destinationX = 0;
		}

		class89.method2308();
		ArchiveLoader.method2260();
		class510.addNpcsToScene(true);
		int var4 = Players.Players_count;
		int[] var5 = Players.Players_indices;

		int var6;
		for (var6 = 0; var6 < var4; ++var6) {
			if (var5[var6] != Client.combatTargetPlayerIndex && var5[var6] != Client.localPlayerIndex) {
				GrandExchangeOfferNameComparator.addPlayerToScene(Client.players[var5[var6]], true);
			}
		}

		class510.addNpcsToScene(false);
		class393.method7302();
		class133.method3043();
		class31.setViewportShape(var0, var1, var2, var3, true);
		var0 = Client.viewportOffsetX;
		var1 = Client.viewportOffsetY;
		var2 = Client.viewportWidth;
		var3 = Client.viewportHeight;
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
		Rasterizer3D.method4417();
		Rasterizer2D.method9445();
		var4 = Client.camAngleX;
		if (Client.field616 / 256 > var4) {
			var4 = Client.field616 / 256;
		}

		if (Client.field618[4] && Client.field784[4] + 128 > var4) {
			var4 = Client.field784[4] + 128;
		}

		int var17 = Client.camAngleY & 2047;
		class30.method446(class467.oculusOrbFocalPointX, class90.field1108, class36.oculusOrbFocalPointY, var4, var17, ClanMate.method7946(var4), var3);
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		int var15;
		if (!Client.isCameraLocked) {
			if (class150.clientPreferences.method2465()) {
				var7 = class36.Client_plane;
			} else {
				label339: {
					var8 = 3;
					if (class19.cameraPitch < 310) {
						label336: {
							if (Client.oculusOrbState == 1) {
								var9 = class467.oculusOrbFocalPointX >> 7;
								var10 = class36.oculusOrbFocalPointY >> 7;
							} else {
								var9 = class136.localPlayer.x >> 7;
								var10 = class136.localPlayer.y >> 7;
							}

							var11 = class157.cameraX >> 7;
							var12 = SoundSystem.cameraZ >> 7;
							if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104) {
								if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) {
									if ((Tiles.Tiles_renderFlags[class36.Client_plane][var11][var12] & 4) != 0) {
										var8 = class36.Client_plane;
									}

									if (var9 > var11) {
										var13 = var9 - var11;
									} else {
										var13 = var11 - var9;
									}

									if (var10 > var12) {
										var14 = var10 - var12;
									} else {
										var14 = var12 - var10;
									}

									int var16;
									if (var13 > var14) {
										var15 = var14 * 65536 / var13;
										var16 = 32768;

										while (true) {
											if (var9 == var11) {
												break label336;
											}

											if (var11 < var9) {
												++var11;
											} else if (var11 > var9) {
												--var11;
											}

											if ((Tiles.Tiles_renderFlags[class36.Client_plane][var11][var12] & 4) != 0) {
												var8 = class36.Client_plane;
											}

											var16 += var15;
											if (var16 >= 65536) {
												var16 -= 65536;
												if (var12 < var10) {
													++var12;
												} else if (var12 > var10) {
													--var12;
												}

												if ((Tiles.Tiles_renderFlags[class36.Client_plane][var11][var12] & 4) != 0) {
													var8 = class36.Client_plane;
												}
											}
										}
									} else {
										if (var14 > 0) {
											var15 = var13 * 65536 / var14;
											var16 = 32768;

											while (var10 != var12) {
												if (var12 < var10) {
													++var12;
												} else if (var12 > var10) {
													--var12;
												}

												if ((Tiles.Tiles_renderFlags[class36.Client_plane][var11][var12] & 4) != 0) {
													var8 = class36.Client_plane;
												}

												var16 += var15;
												if (var16 >= 65536) {
													var16 -= 65536;
													if (var11 < var9) {
														++var11;
													} else if (var11 > var9) {
														--var11;
													}

													if ((Tiles.Tiles_renderFlags[class36.Client_plane][var11][var12] & 4) != 0) {
														var8 = class36.Client_plane;
													}
												}
											}
										}
										break label336;
									}
								}

								var7 = class36.Client_plane;
								break label339;
							}

							var7 = class36.Client_plane;
							break label339;
						}
					}

					if (class136.localPlayer.x >= 0 && class136.localPlayer.y >= 0 && class136.localPlayer.x < 13312 && class136.localPlayer.y < 13312) {
						if ((Tiles.Tiles_renderFlags[class36.Client_plane][class136.localPlayer.x >> 7][class136.localPlayer.y >> 7] & 4) != 0) {
							var8 = class36.Client_plane;
						}

						var7 = var8;
					} else {
						var7 = class36.Client_plane;
					}
				}
			}

			var6 = var7;
		} else {
			if (class150.clientPreferences.method2465()) {
				var7 = class36.Client_plane;
			} else {
				var8 = class306.getTileHeight(class157.cameraX, SoundSystem.cameraZ, class36.Client_plane);
				if (var8 - class384.cameraY < 800 && (Tiles.Tiles_renderFlags[class36.Client_plane][class157.cameraX >> 7][SoundSystem.cameraZ >> 7] & 4) != 0) {
					var7 = class36.Client_plane;
				} else {
					var7 = 3;
				}
			}

			var6 = var7;
		}

		var7 = class157.cameraX;
		var8 = class384.cameraY;
		var9 = SoundSystem.cameraZ;
		var10 = class19.cameraPitch;
		var11 = class456.cameraYaw;

		for (var12 = 0; var12 < 5; ++var12) {
			if (Client.field618[var12]) {
				var13 = (int)(Math.random() * (double)(Client.field783[var12] * 2 + 1) - (double)Client.field783[var12] + Math.sin((double)Client.field785[var12] / 100.0D * (double)Client.field771[var12]) * (double)Client.field784[var12]);
				if (var12 == 0) {
					class157.cameraX += var13;
				}

				if (var12 == 1) {
					class384.cameraY += var13;
				}

				if (var12 == 2) {
					SoundSystem.cameraZ += var13;
				}

				if (var12 == 3) {
					class456.cameraYaw = var13 + class456.cameraYaw & 2047;
				}

				if (var12 == 4) {
					class19.cameraPitch += var13;
					if (class19.cameraPitch < 128) {
						class19.cameraPitch = 128;
					}

					if (class19.cameraPitch > 383) {
						class19.cameraPitch = 383;
					}
				}
			}
		}

		var12 = MouseHandler.MouseHandler_x;
		var13 = MouseHandler.MouseHandler_y;
		if (MouseHandler.MouseHandler_lastButton != 0) {
			var12 = MouseHandler.MouseHandler_lastPressedX;
			var13 = MouseHandler.MouseHandler_lastPressedY;
		}

		if (var12 >= var0 && var12 < var0 + var2 && var13 >= var1 && var13 < var3 + var1) {
			var14 = var12 - var0;
			var15 = var13 - var1;
			ViewportMouse.ViewportMouse_x = var14;
			ViewportMouse.ViewportMouse_y = var15;
			ViewportMouse.ViewportMouse_isInViewport = true;
			ViewportMouse.ViewportMouse_entityCount = 0;
			ViewportMouse.ViewportMouse_false0 = false;
		} else {
			ViewportMouse.ViewportMouse_isInViewport = false;
			ViewportMouse.ViewportMouse_entityCount = 0;
		}

		class105.method2684();
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
		class105.method2684();
		var14 = Rasterizer3D.get3dZoom();
		Rasterizer3D.method4403(TileItem.client.field210);
		Rasterizer3D.clips.field2781 = Client.viewportZoom;
		UserComparator5.scene.draw(class157.cameraX, class384.cameraY, SoundSystem.cameraZ, class19.cameraPitch, class456.cameraYaw, var6);
		Rasterizer3D.method4403(false);
		if (Client.renderSelf) {
			Rasterizer2D.method9446();
		}

		Rasterizer3D.clips.field2781 = var14;
		class105.method2684();
		UserComparator5.scene.clearTempGameObjects();
		UserComparator7.method2869(var0, var1, var2, var3);
		if (Client.hintArrowType == 2) {
			ReflectionCheck.worldToScreen(Client.hintArrowSubX * 64 + (Client.hintArrowX - AbstractArchive.baseX * 64 << 7), Client.hintArrowSubY * 64 + (Client.hintArrowY - class148.baseY * 64 << 7), Client.hintArrowHeight * 2);
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) {
				class345.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).animate(Client.graphicsCycle);
		FriendLoginUpdate.method7930();
		class157.cameraX = var7;
		class384.cameraY = var8;
		SoundSystem.cameraZ = var9;
		class19.cameraPitch = var10;
		class456.cameraYaw = var11;
		if (Client.isLoading && class153.field1700.method6852(true, false) == 0) {
			Client.isLoading = false;
		}

		if (Client.isLoading) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
			Actor.drawLoadingMessage("Loading - please wait.", false);
		}

	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(Llo;B)V",
		garbageValue = "-63"
	)
	static final void method408(class296 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer;
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		if (class296.field3195 == var0) {
			var2 = var1.readUnsignedByteNeg();
			var3 = var2 >> 4 & 15;
			var4 = var2 & 7;
			var5 = var1.readUnsignedByteAdd();
			var6 = var1.readUnsignedByteSub();
			var7 = (var6 >> 4 & 7) + WorldMapSectionType.field2978;
			var8 = (var6 & 7) + class387.field4440;
			var9 = var1.readUnsignedShortLE();
			if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
				var10 = var3 + 1;
				if (class136.localPlayer.pathX[0] >= var7 - var10 && class136.localPlayer.pathX[0] <= var7 + var10 && class136.localPlayer.pathY[0] >= var8 - var10 && class136.localPlayer.pathY[0] <= var10 + var8 && class150.clientPreferences.method2481() != 0 && var4 > 0 && Client.soundEffectCount < 50) {
					Client.soundEffectIds[Client.soundEffectCount] = var9;
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var4;
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = var5;
					Client.soundEffects[Client.soundEffectCount] = null;
					Client.soundLocations[Client.soundEffectCount] = var3 + (var8 << 8) + (var7 << 16);
					++Client.soundEffectCount;
				}
			}
		}

		TileItem var32;
		if (class296.field3194 == var0) {
			var2 = var1.readUnsignedIntLE();
			var3 = var1.readUnsignedByteSub();
			var1.readUnsignedShort();
			var1.readUnsignedByteNeg();
			var4 = var1.readUnsignedShort();
			var5 = var1.readUnsignedByte();
			var6 = (var5 >> 4 & 7) + WorldMapSectionType.field2978;
			var7 = (var5 & 7) + class387.field4440;
			var1.readUnsignedByte();
			var1.readUnsignedShortAdd();
			if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
				var32 = new TileItem();
				var32.id = var4;
				var32.quantity = var2;
				var32.method2671(var3);
				if (Client.groundItems[class36.Client_plane][var6][var7] == null) {
					Client.groundItems[class36.Client_plane][var6][var7] = new NodeDeque();
				}

				Client.groundItems[class36.Client_plane][var6][var7].addFirst(var32);
				class344.updateItemPile(var6, var7);
			}

		} else {
			int var11;
			if (class296.field3193 == var0) {
				var2 = var1.readUnsignedShortLE();
				var3 = var1.readUnsignedByte();
				var4 = (var3 >> 4 & 7) + WorldMapSectionType.field2978;
				var5 = (var3 & 7) + class387.field4440;
				var6 = var1.readUnsignedByteSub();
				var7 = var6 >> 2;
				var8 = var6 & 3;
				var9 = Client.field591[var7];
				if (var4 >= 0 && var5 >= 0 && var4 < 103 && var5 < 103) {
					if (var9 == 0) {
						BoundaryObject var35 = UserComparator5.scene.method4581(class36.Client_plane, var4, var5);
						if (var35 != null) {
							var11 = class458.Entity_unpackID(var35.tag);
							if (var7 == 2) {
								var35.renderable1 = new DynamicObject(var11, 2, var8 + 4, class36.Client_plane, var4, var5, var2, false, var35.renderable1);
								var35.renderable2 = new DynamicObject(var11, 2, var8 + 1 & 3, class36.Client_plane, var4, var5, var2, false, var35.renderable2);
							} else {
								var35.renderable1 = new DynamicObject(var11, var7, var8, class36.Client_plane, var4, var5, var2, false, var35.renderable1);
							}

							return;
						}
					}

					if (var9 == 1) {
						WallDecoration var42 = UserComparator5.scene.method4616(class36.Client_plane, var4, var5);
						if (var42 != null) {
							var11 = class458.Entity_unpackID(var42.tag);
							if (var7 != 4 && var7 != 5) {
								if (var7 == 6) {
									var42.renderable1 = new DynamicObject(var11, 4, var8 + 4, class36.Client_plane, var4, var5, var2, false, var42.renderable1);
								} else if (var7 == 7) {
									var42.renderable1 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, class36.Client_plane, var4, var5, var2, false, var42.renderable1);
								} else if (var7 == 8) {
									var42.renderable1 = new DynamicObject(var11, 4, var8 + 4, class36.Client_plane, var4, var5, var2, false, var42.renderable1);
									var42.renderable2 = new DynamicObject(var11, 4, (var8 + 2 & 3) + 4, class36.Client_plane, var4, var5, var2, false, var42.renderable2);
								}
							} else {
								var42.renderable1 = new DynamicObject(var11, 4, var8, class36.Client_plane, var4, var5, var2, false, var42.renderable1);
							}

							return;
						}
					}

					if (var9 == 2) {
						GameObject var43 = UserComparator5.scene.getGameObject(class36.Client_plane, var4, var5);
						if (var7 == 11) {
							var7 = 10;
						}

						if (var43 != null) {
							var43.renderable = new DynamicObject(class458.Entity_unpackID(var43.tag), var7, var8, class36.Client_plane, var4, var5, var2, false, var43.renderable);
							return;
						}
					}

					if (var9 == 3) {
						FloorDecoration var44 = UserComparator5.scene.getFloorDecoration(class36.Client_plane, var4, var5);
						if (var44 != null) {
							var44.renderable = new DynamicObject(class458.Entity_unpackID(var44.tag), 22, var8, class36.Client_plane, var4, var5, var2, false, var44.renderable);
							return;
						}
					}

					AABB.method4740(class36.Client_plane, var4, var5, var9, var2);
				}

			} else if (class296.field3202 == var0) {
				var2 = var1.readUnsignedByteSub();
				var3 = var1.readUnsignedByte();
				var4 = (var3 >> 4 & 7) + WorldMapSectionType.field2978;
				var5 = (var3 & 7) + class387.field4440;
				var6 = var1.readUnsignedShort();
				var7 = var1.readUnsignedShortAdd();
				if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
					var4 = var4 * 128 + 64;
					var5 = var5 * 128 + 64;
					GraphicsObject var41 = new GraphicsObject(var6, class36.Client_plane, var4, var5, class306.getTileHeight(var4, var5, class36.Client_plane) - var2, var7, Client.cycle);
					Client.graphicsObjects.addFirst(var41);
				}

			} else if (class296.field3197 == var0) {
				var2 = var1.readUnsignedByteAdd();
				var3 = (var2 >> 4 & 7) + WorldMapSectionType.field2978;
				var4 = (var2 & 7) + class387.field4440;
				var5 = var1.readUnsignedShort();
				var6 = var1.readUnsignedIntME();
				var7 = var1.readUnsignedIntME();
				if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
					NodeDeque var40 = Client.groundItems[class36.Client_plane][var3][var4];
					if (var40 != null) {
						for (TileItem var34 = (TileItem)var40.last(); var34 != null; var34 = (TileItem)var40.previous()) {
							if ((var5 & 32767) == var34.id && var6 == var34.quantity) {
								var34.quantity = var7;
								break;
							}
						}

						class344.updateItemPile(var3, var4);
					}
				}

			} else {
				NodeDeque var31;
				if (class296.field3198 == var0) {
					var2 = var1.readUnsignedByte();
					var3 = var1.readUnsignedByte();
					var4 = (var3 >> 4 & 7) + WorldMapSectionType.field2978;
					var5 = (var3 & 7) + class387.field4440;
					var6 = var1.readUnsignedShort();
					if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
						var31 = Client.groundItems[class36.Client_plane][var4][var5];
						if (var31 != null) {
							for (var32 = (TileItem)var31.last(); var32 != null; var32 = (TileItem)var31.previous()) {
								if ((var6 & 32767) == var32.id) {
									var32.method2671(var2);
									break;
								}
							}
						}
					}

				} else if (class296.field3200 == var0) {
					var2 = var1.readUnsignedByteSub();
					var3 = (var2 >> 4 & 7) + WorldMapSectionType.field2978;
					var4 = (var2 & 7) + class387.field4440;
					var5 = var1.readUnsignedByteAdd();
					var6 = var1.readUnsignedShortLE();
					var7 = var1.readUnsignedByte();
					var8 = var7 >> 2;
					var9 = var7 & 3;
					var10 = Client.field591[var8];
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
						AbstractWorldMapIcon.method5565(class36.Client_plane, var3, var4, var10, var6, var8, var9, var5, 0, -1);
					}

				} else {
					int var12;
					int var13;
					int var14;
					if (class296.field3203 == var0) {
						byte var36 = var1.readByteAdd();
						var3 = var1.readUnsignedByteAdd();
						var4 = (var3 >> 4 & 7) + WorldMapSectionType.field2978;
						var5 = (var3 & 7) + class387.field4440;
						var6 = var1.readUnsignedShortAdd();
						var7 = var1.readUnsignedShortLE();
						var8 = var1.readUnsignedShort();
						var9 = var1.readUnsignedShortAdd();
						byte var38 = var1.readByte();
						var11 = var1.readUnsignedByte();
						var12 = var11 >> 2;
						var13 = var11 & 3;
						var14 = Client.field591[var12];
						byte var15 = var1.readByteAdd();
						byte var16 = var1.readByte();
						Player var17;
						if (var6 == Client.localPlayerIndex) {
							var17 = class136.localPlayer;
						} else {
							var17 = Client.players[var6];
						}

						if (var17 != null) {
							ObjectComposition var18 = class90.getObjectDefinition(var7);
							int var19;
							int var20;
							if (var13 != 1 && var13 != 3) {
								var19 = var18.sizeX;
								var20 = var18.sizeY;
							} else {
								var19 = var18.sizeY;
								var20 = var18.sizeX;
							}

							int var21 = var4 + (var19 >> 1);
							int var22 = var4 + (var19 + 1 >> 1);
							int var23 = var5 + (var20 >> 1);
							int var24 = var5 + (var20 + 1 >> 1);
							int[][] var25 = Tiles.Tiles_heights[class36.Client_plane];
							int var26 = var25[var21][var23] + var25[var22][var23] + var25[var21][var24] + var25[var22][var24] >> 2;
							int var27 = (var4 << 7) + (var19 << 6);
							int var28 = (var5 << 7) + (var20 << 6);
							Model var29 = var18.getModel(var12, var13, var25, var27, var26, var28);
							if (var29 != null) {
								AbstractWorldMapIcon.method5565(class36.Client_plane, var4, var5, var14, -1, 0, 0, 31, var9 + 1, var8 + 1);
								var17.animationCycleStart = var9 + Client.cycle;
								var17.animationCycleEnd = var8 + Client.cycle;
								var17.model0 = var29;
								var17.field1122 = var4 * 128 + var19 * 64;
								var17.field1119 = var5 * 128 + var20 * 64;
								var17.tileHeight2 = var26;
								byte var30;
								if (var36 > var16) {
									var30 = var36;
									var36 = var16;
									var16 = var30;
								}

								if (var38 > var15) {
									var30 = var38;
									var38 = var15;
									var15 = var30;
								}

								var17.minX = var4 + var36;
								var17.maxX = var4 + var16;
								var17.minY = var5 + var38;
								var17.maxY = var5 + var15;
							}
						}
					}

					if (class296.field3201 == var0) {
						var2 = var1.readUnsignedShort();
						var3 = var1.method9136();
						var4 = var1.readUnsignedByteNeg();
						byte var37 = var1.readByteSub();
						var6 = var1.readUnsignedByteNeg();
						var7 = (var6 >> 4 & 7) + WorldMapSectionType.field2978;
						var8 = (var6 & 7) + class387.field4440;
						var9 = var1.readUnsignedByteAdd();
						var10 = var1.readUnsignedShortAdd();
						var11 = var1.readUnsignedShortAdd();
						byte var39 = var1.readByteAdd();
						var13 = var1.readUnsignedByteAdd() * 4;
						var14 = var1.readUnsignedByteNeg() * 4;
						var5 = var37 + var7;
						var12 = var39 + var8;
						if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var5 >= 0 && var12 >= 0 && var5 < 104 && var12 < 104 && var11 != 65535) {
							var7 = var7 * 128 + 64;
							var8 = var8 * 128 + 64;
							var5 = var5 * 128 + 64;
							var12 = var12 * 128 + 64;
							Projectile var33 = new Projectile(var11, class36.Client_plane, var7, var8, class306.getTileHeight(var7, var8, class36.Client_plane) - var14, var2 + Client.cycle, var10 + Client.cycle, var9, var4, var3, var13);
							var33.setDestination(var5, var12, class306.getTileHeight(var5, var12, class36.Client_plane) - var13, var2 + Client.cycle);
							Client.projectiles.addFirst(var33);
						}

					} else if (class296.field3196 != var0) {
						if (class296.field3199 == var0) {
							var2 = var1.readUnsignedByteSub();
							var3 = (var2 >> 4 & 7) + WorldMapSectionType.field2978;
							var4 = (var2 & 7) + class387.field4440;
							var5 = var1.readUnsignedByte();
							var6 = var5 >> 2;
							var7 = var5 & 3;
							var8 = Client.field591[var6];
							if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
								AbstractWorldMapIcon.method5565(class36.Client_plane, var3, var4, var8, -1, var6, var7, 31, 0, -1);
							}

						}
					} else {
						var2 = var1.readUnsignedIntLE();
						var3 = var1.readUnsignedShort();
						var4 = var1.readUnsignedByteNeg();
						var5 = (var4 >> 4 & 7) + WorldMapSectionType.field2978;
						var6 = (var4 & 7) + class387.field4440;
						if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
							var31 = Client.groundItems[class36.Client_plane][var5][var6];
							if (var31 != null) {
								for (var32 = (TileItem)var31.last(); var32 != null; var32 = (TileItem)var31.previous()) {
									if ((var3 & 32767) == var32.id && var2 == var32.quantity) {
										var32.remove();
										break;
									}
								}

								if (var31.last() == null) {
									Client.groundItems[class36.Client_plane][var5][var6] = null;
								}

								class344.updateItemPile(var5, var6);
							}
						}

					}
				}
			}
		}
	}
}
