import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
final class class106 implements class334 {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1891344101
	)
	static int field1352;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lnn;)V"
	)
	class106(Widget var1) {
		this.val$cc = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "5"
	)
	public void vmethod6278() {
		if (this.val$cc != null && this.val$cc.method6767().field3591 != null) {
			ScriptEvent var1 = new ScriptEvent();
			var1.method2357(this.val$cc);
			var1.setArgs(this.val$cc.method6767().field3591);
			FileSystem.method4225().addFirst(var1);
		}

	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1624666505"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) {
			if (HealthBarDefinition.widgetDefinition.loadInterface(var0)) {
				Widget[] var1 = HealthBarDefinition.widgetDefinition.Widget_interfaceComponents[var0];

				for (int var2 = 0; var2 < var1.length; ++var2) {
					Widget var3 = var1[var2];
					if (var3.onLoad != null) {
						ScriptEvent var4 = new ScriptEvent();
						var4.widget = var3;
						var4.args = var3.onLoad;
						class323.runScript(var4, 5000000, 0);
					}
				}

			}
		}
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(Lly;B)V",
		garbageValue = "1"
	)
	static final void method2777(class306 var0) {
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
		if (class306.field3233 == var0) {
			var2 = var1.readUnsignedShortLE();
			var3 = var1.readUnsignedByteNeg();
			var4 = (var3 >> 4 & 7) + class18.field85;
			var5 = (var3 & 7) + class6.field14;
			var6 = var1.readUnsignedByteNeg();
			var7 = var1.readUnsignedByteNeg();
			var8 = var7 >> 2;
			var9 = var7 & 3;
			var10 = Client.field563[var8];
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				TileItem.method2766(ItemLayer.Client_plane, var4, var5, var10, var2, var8, var9, var6, 0, -1);
			}

		} else {
			TileItem var32;
			if (class306.field3231 == var0) {
				var2 = var1.readUnsignedByte();
				var3 = (var2 >> 4 & 7) + class18.field85;
				var4 = (var2 & 7) + class6.field14;
				var5 = var1.readUnsignedByteAdd();
				var6 = var1.readUnsignedShortAddLE();
				var1.readUnsignedShortAdd();
				var1.readUnsignedByteSub();
				var7 = var1.readInt();
				var1.readUnsignedByteNeg();
				var1.readUnsignedShortAdd();
				if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
					var32 = new TileItem();
					var32.id = var6;
					var32.quantity = var7;
					var32.method2754(var5);
					if (Client.groundItems[ItemLayer.Client_plane][var3][var4] == null) {
						Client.groundItems[ItemLayer.Client_plane][var3][var4] = new NodeDeque();
					}

					Client.groundItems[ItemLayer.Client_plane][var3][var4].addFirst(var32);
					ClanSettings.updateItemPile(var3, var4);
				}

			} else {
				if (class306.field3226 == var0) {
					var2 = var1.readUnsignedByte();
					var3 = var2 >> 4 & 15;
					var4 = var2 & 7;
					var5 = var1.readUnsignedByteNeg();
					var6 = var1.readUnsignedShortAdd();
					var7 = var1.readUnsignedByteNeg();
					var8 = (var7 >> 4 & 7) + class18.field85;
					var9 = (var7 & 7) + class6.field14;
					if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
						var10 = var3 + 1;
						if (class229.localPlayer.pathX[0] >= var8 - var10 && class229.localPlayer.pathX[0] <= var10 + var8 && class229.localPlayer.pathY[0] >= var9 - var10 && class229.localPlayer.pathY[0] <= var9 + var10 && WorldMapIcon_1.clientPreferences.getAreaSoundEffectsVolume() != 0 && var4 > 0 && Client.soundEffectCount < 50) {
							Client.soundEffectIds[Client.soundEffectCount] = var6;
							Client.queuedSoundEffectLoops[Client.soundEffectCount] = var4;
							Client.queuedSoundEffectDelays[Client.soundEffectCount] = var5;
							Client.soundEffects[Client.soundEffectCount] = null;
							Client.soundLocations[Client.soundEffectCount] = var3 + (var9 << 8) + (var8 << 16);
							++Client.soundEffectCount;
						}
					}
				}

				if (class306.field3236 == var0) {
					var2 = var1.readUnsignedShortLE();
					var3 = var1.readUnsignedIntLE();
					var4 = var1.readUnsignedByteNeg();
					var5 = (var4 >> 4 & 7) + class18.field85;
					var6 = (var4 & 7) + class6.field14;
					var7 = var1.readInt();
					if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
						NodeDeque var48 = Client.groundItems[ItemLayer.Client_plane][var5][var6];
						if (var48 != null) {
							for (TileItem var36 = (TileItem)var48.last(); var36 != null; var36 = (TileItem)var48.previous()) {
								if ((var2 & 32767) == var36.id && var3 == var36.quantity) {
									var36.quantity = var7;
									break;
								}
							}

							ClanSettings.updateItemPile(var5, var6);
						}
					}

				} else {
					int var11;
					int var12;
					int var13;
					int var14;
					int var15;
					Projectile var35;
					byte var38;
					if (class306.field3235 == var0) {
						var2 = var1.readUnsignedByteSub();
						var38 = var1.readByteAdd();
						var4 = var1.readUnsignedShortAdd();
						var5 = var1.readUnsignedByteNeg();
						var6 = var1.readUnsignedByteNeg() * 4;
						var7 = var1.readUnsignedByte();
						var8 = (var7 >> 4 & 7) + class18.field85;
						var9 = (var7 & 7) + class6.field14;
						var10 = var1.readUnsignedShortLE();
						var11 = var1.method9489();
						var12 = var1.method9249();
						byte var44 = var1.readByteNeg();
						var14 = var1.readUnsignedByteNeg() * 4;
						var15 = var1.readUnsignedShortLE();
						var13 = var44 + var8;
						var3 = var38 + var9;
						if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104 && var13 >= 0 && var3 >= 0 && var13 < 104 && var3 < 104 && var10 != 65535) {
							var8 = var8 * 128 + 64;
							var9 = var9 * 128 + 64;
							var13 = var13 * 128 + 64;
							var3 = var3 * 128 + 64;
							var35 = new Projectile(var10, ItemLayer.Client_plane, var8, var9, WorldMapDecorationType.getTileHeight(var8, var9, ItemLayer.Client_plane) - var14, var15 + Client.cycle, var4 + Client.cycle, var2, var5, var11, var12, var6);
							var35.setDestination(var13, var3, WorldMapDecorationType.getTileHeight(var13, var3, ItemLayer.Client_plane) - var6, var15 + Client.cycle);
							Client.projectiles.addFirst(var35);
						}

					} else {
						NodeDeque var31;
						if (class306.field3232 == var0) {
							var2 = var1.readUnsignedByteAdd();
							var3 = (var2 >> 4 & 7) + class18.field85;
							var4 = (var2 & 7) + class6.field14;
							var5 = var1.readUnsignedShortLE();
							var6 = var1.readUnsignedByteAdd();
							if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
								var31 = Client.groundItems[ItemLayer.Client_plane][var3][var4];
								if (var31 != null) {
									for (var32 = (TileItem)var31.last(); var32 != null; var32 = (TileItem)var31.previous()) {
										if ((var5 & 32767) == var32.id) {
											var32.method2754(var6);
											break;
										}
									}
								}
							}

						} else {
							if (class306.field3227 == var0) {
								byte var37 = var1.readByteAdd();
								var38 = var1.readByteAdd();
								byte var39 = var1.readByteNeg();
								var5 = var1.readUnsignedShortAddLE();
								byte var40 = var1.readByte();
								var7 = var1.readUnsignedByteSub();
								var8 = (var7 >> 4 & 7) + class18.field85;
								var9 = (var7 & 7) + class6.field14;
								var10 = var1.readUnsignedShortAdd();
								var11 = var1.readUnsignedShortAddLE();
								var12 = var1.readUnsignedByteAdd();
								var13 = var12 >> 2;
								var14 = var12 & 3;
								var15 = Client.field563[var13];
								int var16 = var1.readUnsignedShortAddLE();
								Player var17;
								if (var16 == Client.localPlayerIndex) {
									var17 = class229.localPlayer;
								} else {
									var17 = Client.players[var16];
								}

								if (var17 != null) {
									ObjectComposition var18 = WorldMapSection2.getObjectDefinition(var10);
									int var19;
									int var20;
									if (var14 != 1 && var14 != 3) {
										var19 = var18.sizeX;
										var20 = var18.sizeY;
									} else {
										var19 = var18.sizeY;
										var20 = var18.sizeX;
									}

									int var21 = var8 + (var19 >> 1);
									int var22 = var8 + (var19 + 1 >> 1);
									int var23 = var9 + (var20 >> 1);
									int var24 = var9 + (var20 + 1 >> 1);
									int[][] var25 = Tiles.Tiles_heights[ItemLayer.Client_plane];
									int var26 = var25[var22][var24] + var25[var21][var24] + var25[var21][var23] + var25[var22][var23] >> 2;
									int var27 = (var8 << 7) + (var19 << 6);
									int var28 = (var9 << 7) + (var20 << 6);
									Model var29 = var18.getModel(var13, var14, var25, var27, var26, var28);
									if (var29 != null) {
										TileItem.method2766(ItemLayer.Client_plane, var8, var9, var15, -1, 0, 0, 31, var11 + 1, var5 + 1);
										var17.animationCycleStart = var11 + Client.cycle;
										var17.animationCycleEnd = var5 + Client.cycle;
										var17.model0 = var29;
										var17.field1106 = var8 * 128 + var19 * 64;
										var17.field1108 = var9 * 128 + var20 * 64;
										var17.tileHeight2 = var26;
										byte var30;
										if (var39 > var37) {
											var30 = var39;
											var39 = var37;
											var37 = var30;
										}

										if (var40 > var38) {
											var30 = var40;
											var40 = var38;
											var38 = var30;
										}

										var17.minX = var39 + var8;
										var17.maxX = var37 + var8;
										var17.minY = var9 + var40;
										var17.maxY = var9 + var38;
									}
								}
							}

							if (class306.field3237 == var0) {
								var2 = var1.readUnsignedByteAdd();
								var3 = (var2 >> 4 & 7) + class18.field85;
								var4 = (var2 & 7) + class6.field14;
								var5 = var1.readUnsignedByteAdd();
								var6 = var5 >> 2;
								var7 = var5 & 3;
								var8 = Client.field563[var6];
								if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
									TileItem.method2766(ItemLayer.Client_plane, var3, var4, var8, -1, var6, var7, 31, 0, -1);
								}

							} else if (class306.field3228 == var0) {
								var2 = var1.readUnsignedShortLE();
								var3 = var1.readUnsignedByte();
								var4 = (var3 >> 4 & 7) + class18.field85;
								var5 = (var3 & 7) + class6.field14;
								var6 = var1.readUnsignedShort();
								var7 = var1.readUnsignedByteAdd() * 4;
								byte var41 = var1.readByteSub();
								var9 = var1.readUnsignedByteSub();
								var10 = var1.readUnsignedByteSub() * 4;
								var11 = var1.readUnsignedShortAddLE();
								var12 = var1.method9489();
								var13 = var1.readUnsignedShortLE();
								var14 = var1.method9251();
								byte var45 = var1.readByteAdd();
								var15 = var45 + var4;
								var8 = var41 + var5;
								if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && var15 >= 0 && var8 >= 0 && var15 < 104 && var8 < 104 && var11 != 65535) {
									var4 = var4 * 128 + 64;
									var5 = var5 * 128 + 64;
									var15 = var15 * 128 + 64;
									var8 = var8 * 128 + 64;
									var35 = new Projectile(var11, ItemLayer.Client_plane, var4, var5, WorldMapDecorationType.getTileHeight(var4, var5, ItemLayer.Client_plane) - var7, var13 + Client.cycle, var2 + Client.cycle, var9, var6, var12, var14, var10);
									var35.setDestination(var15, var8, WorldMapDecorationType.getTileHeight(var15, var8, ItemLayer.Client_plane) - var10, var13 + Client.cycle);
									Client.projectiles.addFirst(var35);
								}

							} else if (class306.field3225 == var0) {
								var2 = var1.method9489();
								var3 = var1.readUnsignedShortAddLE();
								var4 = var1.readUnsignedByte();
								var5 = var1.readUnsignedByteAdd();
								var6 = (var5 >> 4 & 7) + class18.field85;
								var7 = (var5 & 7) + class6.field14;
								var8 = var1.readUnsignedByte() * 4;
								var9 = var1.readUnsignedShort();
								var10 = var1.readUnsignedShortLE();
								byte var42 = var1.readByteAdd();
								byte var43 = var1.readByteNeg();
								var13 = var1.readUnsignedByteNeg();
								var14 = var1.readUnsignedByteAdd() * 4;
								var11 = var42 + var6;
								var12 = var43 + var7;
								if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104 && var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104 && var10 != 65535) {
									var6 = var6 * 128 + 64;
									var7 = var7 * 128 + 64;
									var11 = var11 * 128 + 64;
									var12 = var12 * 128 + 64;
									Projectile var34 = new Projectile(var10, ItemLayer.Client_plane, var6, var7, WorldMapDecorationType.getTileHeight(var6, var7, ItemLayer.Client_plane) - var8, var9 + Client.cycle, var3 + Client.cycle, var13, var4, var2, var14);
									var34.setDestination(var11, var12, WorldMapDecorationType.getTileHeight(var11, var12, ItemLayer.Client_plane) - var14, var9 + Client.cycle);
									Client.projectiles.addFirst(var34);
								}

							} else if (class306.field3230 == var0) {
								var2 = var1.readUnsignedByte();
								var3 = var2 >> 2;
								var4 = var2 & 3;
								var5 = Client.field563[var3];
								var6 = var1.readUnsignedShortAdd();
								var7 = var1.readUnsignedByteNeg();
								var8 = (var7 >> 4 & 7) + class18.field85;
								var9 = (var7 & 7) + class6.field14;
								if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) {
									if (var5 == 0) {
										BoundaryObject var33 = class36.scene.method5346(ItemLayer.Client_plane, var8, var9);
										if (var33 != null) {
											var11 = class232.Entity_unpackID(var33.tag);
											if (var3 == 2) {
												var33.renderable1 = new DynamicObject(var11, 2, var4 + 4, ItemLayer.Client_plane, var8, var9, var6, false, var33.renderable1);
												var33.renderable2 = new DynamicObject(var11, 2, var4 + 1 & 3, ItemLayer.Client_plane, var8, var9, var6, false, var33.renderable2);
											} else {
												var33.renderable1 = new DynamicObject(var11, var3, var4, ItemLayer.Client_plane, var8, var9, var6, false, var33.renderable1);
											}

											return;
										}
									}

									if (var5 == 1) {
										WallDecoration var47 = class36.scene.method5347(ItemLayer.Client_plane, var8, var9);
										if (var47 != null) {
											var11 = class232.Entity_unpackID(var47.tag);
											if (var3 != 4 && var3 != 5) {
												if (var3 == 6) {
													var47.renderable1 = new DynamicObject(var11, 4, var4 + 4, ItemLayer.Client_plane, var8, var9, var6, false, var47.renderable1);
												} else if (var3 == 7) {
													var47.renderable1 = new DynamicObject(var11, 4, (var4 + 2 & 3) + 4, ItemLayer.Client_plane, var8, var9, var6, false, var47.renderable1);
												} else if (var3 == 8) {
													var47.renderable1 = new DynamicObject(var11, 4, var4 + 4, ItemLayer.Client_plane, var8, var9, var6, false, var47.renderable1);
													var47.renderable2 = new DynamicObject(var11, 4, (var4 + 2 & 3) + 4, ItemLayer.Client_plane, var8, var9, var6, false, var47.renderable2);
												}
											} else {
												var47.renderable1 = new DynamicObject(var11, 4, var4, ItemLayer.Client_plane, var8, var9, var6, false, var47.renderable1);
											}

											return;
										}
									}

									if (var5 == 2) {
										GameObject var49 = class36.scene.getGameObject(ItemLayer.Client_plane, var8, var9);
										if (var3 == 11) {
											var3 = 10;
										}

										if (var49 != null) {
											var49.renderable = new DynamicObject(class232.Entity_unpackID(var49.tag), var3, var4, ItemLayer.Client_plane, var8, var9, var6, false, var49.renderable);
											return;
										}
									}

									if (var5 == 3) {
										FloorDecoration var50 = class36.scene.getFloorDecoration(ItemLayer.Client_plane, var8, var9);
										if (var50 != null) {
											var50.renderable = new DynamicObject(class232.Entity_unpackID(var50.tag), 22, var4, ItemLayer.Client_plane, var8, var9, var6, false, var50.renderable);
											return;
										}
									}

									TaskHandler.method4201(ItemLayer.Client_plane, var8, var9, var5, var6);
								}

							} else if (class306.field3234 == var0) {
								var2 = var1.readUnsignedShort();
								var3 = var1.readUnsignedByteNeg();
								var4 = var1.readUnsignedShortAdd();
								var5 = var1.readUnsignedByteNeg();
								var6 = (var5 >> 4 & 7) + class18.field85;
								var7 = (var5 & 7) + class6.field14;
								if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
									var6 = var6 * 128 + 64;
									var7 = var7 * 128 + 64;
									GraphicsObject var46 = new GraphicsObject(var4, ItemLayer.Client_plane, var6, var7, WorldMapDecorationType.getTileHeight(var6, var7, ItemLayer.Client_plane) - var3, var2, Client.cycle);
									Client.graphicsObjects.addFirst(var46);
								}

							} else if (class306.field3229 == var0) {
								var2 = var1.readUnsignedIntIME();
								var3 = var1.readUnsignedByte();
								var4 = (var3 >> 4 & 7) + class18.field85;
								var5 = (var3 & 7) + class6.field14;
								var6 = var1.readUnsignedShortLE();
								if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
									var31 = Client.groundItems[ItemLayer.Client_plane][var4][var5];
									if (var31 != null) {
										for (var32 = (TileItem)var31.last(); var32 != null; var32 = (TileItem)var31.previous()) {
											if ((var6 & 32767) == var32.id && var2 == var32.quantity) {
												var32.remove();
												break;
											}
										}

										if (var31.last() == null) {
											Client.groundItems[ItemLayer.Client_plane][var4][var5] = null;
										}

										ClanSettings.updateItemPile(var4, var5);
									}
								}

							}
						}
					}
				}
			}
		}
	}
}
