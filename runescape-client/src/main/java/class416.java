import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qt")
public class class416 {
	@ObfuscatedName("ac")
	@Export("cp1252AsciiExtension")
	public static final char[] cp1252AsciiExtension;
	@ObfuscatedName("as")
	@Export("ByteArrayPool_arrays")
	public static byte[][][] ByteArrayPool_arrays;

	static {
		cp1252AsciiExtension = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'};
	}

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(Ldd;IIIIIIIII)V",
		garbageValue = "-35039602"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Scene var9 = var0.scene;
		if (var3 >= 1 && var4 >= 1 && var3 <= var0.sizeX - 1 && var4 <= var0.sizeY - 1) {
			if (Client.isLowDetail && var0.plane != var1) {
				return;
			}

			long var10 = 0L;
			boolean var12 = true;
			boolean var13 = false;
			boolean var14 = false;
			if (var2 == 0) {
				var10 = var9.getBoundaryObjectTag(var1, var3, var4);
			}

			if (var2 == 1) {
				var10 = var9.getWallDecorationTag(var1, var3, var4);
			}

			if (var2 == 2) {
				var10 = var9.getGameObjectTag(var1, var3, var4);
			}

			if (var2 == 3) {
				var10 = var9.getFloorDecorationTag(var1, var3, var4);
			}

			int var15;
			if (0L != var10) {
				var15 = var9.getObjectFlags(var1, var3, var4, var10);
				int var42 = class213.Entity_unpackID(var10);
				int var43 = var15 & 31;
				int var44 = var15 >> 6 & 3;
				ObjectComposition var16 = class273.getObjectDefinition(var42);
				MouseHandler.method693(var1, var3, var4, var16, var44);
				if (var2 == 0) {
					var9.removeBoundaryObject(var1, var3, var4);
					if (var16.interactType != 0) {
						var0.collisionMaps[var1].method5610(var3, var4, var43, var44, var16.boolean1);
					}
				}

				if (var2 == 1) {
					var9.removeWallDecoration(var1, var3, var4);
				}

				if (var2 == 2) {
					var9.removeGameObject(var1, var3, var4);
					if (var3 + var16.sizeX > var0.sizeX - 1 || var4 + var16.sizeX > var0.sizeY - 1 || var3 + var16.sizeY > var0.sizeX - 1 || var4 + var16.sizeY > var0.sizeY - 1) {
						return;
					}

					if (var16.interactType != 0) {
						var0.collisionMaps[var1].setFlagOffNonSquare(var3, var4, var16.sizeX, var16.sizeY, var44, var16.boolean1);
					}
				}

				if (var2 == 3) {
					var9.removeFloorDecoration(var1, var3, var4);
					if (var16.interactType == 1) {
						var0.collisionMaps[var1].method5613(var3, var4);
					}
				}
			}

			if (var5 >= 0) {
				var15 = var1;
				if (var1 < 3 && (var0.tileSettings[1][var3][var4] & 2) == 2) {
					var15 = var1 + 1;
				}

				CollisionMap var45 = var0.collisionMaps[var1];
				ObjectComposition var17 = class273.getObjectDefinition(var5);
				int var18 = var8 >= 0 ? var8 : var17.animationId;
				int var19;
				int var20;
				if (var6 != 1 && var6 != 3) {
					var19 = var17.sizeX;
					var20 = var17.sizeY;
				} else {
					var19 = var17.sizeY;
					var20 = var17.sizeX;
				}

				int var21;
				int var22;
				if (var3 + var19 <= var0.sizeX) {
					var21 = var3 + (var19 >> 1);
					var22 = var3 + (var19 + 1 >> 1);
				} else {
					var21 = var3;
					var22 = var3 + 1;
				}

				int var23;
				int var24;
				if (var20 + var4 <= var0.sizeY) {
					var23 = (var20 >> 1) + var4;
					var24 = (var20 + 1 >> 1) + var4;
				} else {
					var23 = var4;
					var24 = var4 + 1;
				}

				int[][] var25 = var0.tileHeights[var15];
				int var26 = var25[var21][var24] + var25[var22][var23] + var25[var21][var23] + var25[var22][var24] >> 2;
				int var27 = (var3 << 7) + (var19 << 6);
				int var28 = (var4 << 7) + (var20 << 6);
				Scene var29 = var0.scene;
				long var30 = class273.calculateTag(var3, var4, 2, var17.int1 == 0, var5, var0.id);
				int var32 = (var6 << 6) + var7;
				if (var17.int3 == 1) {
					var32 += 256;
				}

				Object var40;
				if (var7 == 22) {
					if (var18 == -1 && var17.transforms == null) {
						var40 = var17.getModel(22, var6, var25, var27, var26, var28);
					} else {
						var40 = new DynamicObject(var0, var5, 22, var6, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
					}

					var29.newFloorDecoration(var1, var3, var4, var26, (Renderable)var40, var30, var32);
					if (var17.interactType == 1 && var45 != null) {
						var45.setBlockedByFloorDec(var3, var4);
					}
				} else if (var7 != 10 && var7 != 11) {
					if (var7 >= 12) {
						if (var18 == -1 && var17.transforms == null) {
							var40 = var17.getModel(var7, var6, var25, var27, var26, var28);
						} else {
							var40 = new DynamicObject(var0, var5, var7, var6, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
						}

						var29.method4903(var1, var3, var4, var26, 1, 1, (Renderable)var40, 0, var30, var32);
						if (var17.interactType != 0 && var45 != null) {
							var45.addGameObject(var3, var4, var19, var20, var17.boolean1);
						}
					} else if (var7 == 0) {
						if (var18 == -1 && var17.transforms == null) {
							var40 = var17.getModel(0, var6, var25, var27, var26, var28);
						} else {
							var40 = new DynamicObject(var0, var5, 0, var6, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
						}

						var29.newBoundaryObject(var1, var3, var4, var26, (Renderable)var40, (Renderable)null, Tiles.field1057[var6], 0, var30, var32);
						if (var17.interactType != 0 && var45 != null) {
							var45.method5605(var3, var4, var7, var6, var17.boolean1);
						}
					} else if (var7 == 1) {
						if (var18 == -1 && var17.transforms == null) {
							var40 = var17.getModel(1, var6, var25, var27, var26, var28);
						} else {
							var40 = new DynamicObject(var0, var5, 1, var6, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
						}

						var29.newBoundaryObject(var1, var3, var4, var26, (Renderable)var40, (Renderable)null, Tiles.field1058[var6], 0, var30, var32);
						if (var17.interactType != 0 && var45 != null) {
							var45.method5605(var3, var4, var7, var6, var17.boolean1);
						}
					} else {
						int var33;
						if (var7 == 2) {
							var33 = var6 + 1 & 3;
							Object var35;
							Object var41;
							if (var18 == -1 && var17.transforms == null) {
								var41 = var17.getModel(2, var6 + 4, var25, var27, var26, var28);
								var35 = var17.getModel(2, var33, var25, var27, var26, var28);
							} else {
								var41 = new DynamicObject(var0, var5, 2, var6 + 4, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
								var35 = new DynamicObject(var0, var5, 2, var33, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
							}

							var29.newBoundaryObject(var1, var3, var4, var26, (Renderable)var41, (Renderable)var35, Tiles.field1057[var6], Tiles.field1057[var33], var30, var32);
							if (var17.interactType != 0 && var45 != null) {
								var45.method5605(var3, var4, var7, var6, var17.boolean1);
							}
						} else if (var7 == 3) {
							if (var18 == -1 && var17.transforms == null) {
								var40 = var17.getModel(3, var6, var25, var27, var26, var28);
							} else {
								var40 = new DynamicObject(var0, var5, 3, var6, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
							}

							var29.newBoundaryObject(var1, var3, var4, var26, (Renderable)var40, (Renderable)null, Tiles.field1058[var6], 0, var30, var32);
							if (var17.interactType != 0 && var45 != null) {
								var45.method5605(var3, var4, var7, var6, var17.boolean1);
							}
						} else if (var7 == 9) {
							if (var18 == -1 && var17.transforms == null) {
								var40 = var17.getModel(var7, var6, var25, var27, var26, var28);
							} else {
								var40 = new DynamicObject(var0, var5, var7, var6, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
							}

							var29.method4903(var1, var3, var4, var26, 1, 1, (Renderable)var40, 0, var30, var32);
							if (var17.interactType != 0 && var45 != null) {
								var45.addGameObject(var3, var4, var19, var20, var17.boolean1);
							}
						} else if (var7 == 4) {
							if (var18 == -1 && var17.transforms == null) {
								var40 = var17.getModel(4, var6, var25, var27, var26, var28);
							} else {
								var40 = new DynamicObject(var0, var5, 4, var6, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
							}

							var29.newWallDecoration(var1, var3, var4, var26, (Renderable)var40, (Renderable)null, Tiles.field1057[var6], 0, 0, 0, var30, var32);
						} else {
							long var34;
							Object var36;
							if (var7 == 5) {
								var33 = 16;
								var34 = var29.getBoundaryObjectTag(var1, var3, var4);
								if (var34 != 0L) {
									var33 = class273.getObjectDefinition(class213.Entity_unpackID(var34)).int2;
								}

								if (var18 == -1 && var17.transforms == null) {
									var36 = var17.getModel(4, var6, var25, var27, var26, var28);
								} else {
									var36 = new DynamicObject(var0, var5, 4, var6, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
								}

								var29.newWallDecoration(var1, var3, var4, var26, (Renderable)var36, (Renderable)null, Tiles.field1057[var6], 0, Tiles.field1061[var6] * var33, Tiles.field1060[var6] * var33, var30, var32);
							} else if (var7 == 6) {
								var33 = 8;
								var34 = var29.getBoundaryObjectTag(var1, var3, var4);
								if (var34 != 0L) {
									var33 = class273.getObjectDefinition(class213.Entity_unpackID(var34)).int2 / 2;
								}

								if (var18 == -1 && var17.transforms == null) {
									var36 = var17.getModel(4, var6 + 4, var25, var27, var26, var28);
								} else {
									var36 = new DynamicObject(var0, var5, 4, var6 + 4, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
								}

								var29.newWallDecoration(var1, var3, var4, var26, (Renderable)var36, (Renderable)null, 256, var6, Tiles.field1063[var6] * var33, Tiles.field1062[var6] * var33, var30, var32);
							} else if (var7 == 7) {
								int var39 = var6 + 2 & 3;
								if (var18 == -1 && var17.transforms == null) {
									var40 = var17.getModel(4, var39 + 4, var25, var27, var26, var28);
								} else {
									var40 = new DynamicObject(var0, var5, 4, var39 + 4, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
								}

								var29.newWallDecoration(var1, var3, var4, var26, (Renderable)var40, (Renderable)null, 256, var39, 0, 0, var30, var32);
							} else if (var7 == 8) {
								var33 = 8;
								var34 = var29.getBoundaryObjectTag(var1, var3, var4);
								if (0L != var34) {
									var33 = class273.getObjectDefinition(class213.Entity_unpackID(var34)).int2 / 2;
								}

								int var38 = var6 + 2 & 3;
								Object var37;
								if (var18 == -1 && var17.transforms == null) {
									var36 = var17.getModel(4, var6 + 4, var25, var27, var26, var28);
									var37 = var17.getModel(4, var38 + 4, var25, var27, var26, var28);
								} else {
									var36 = new DynamicObject(var0, var5, 4, var6 + 4, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
									var37 = new DynamicObject(var0, var5, 4, var38 + 4, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
								}

								var29.newWallDecoration(var1, var3, var4, var26, (Renderable)var36, (Renderable)var37, 256, var6, Tiles.field1063[var6] * var33, Tiles.field1062[var6] * var33, var30, var32);
							}
						}
					}
				} else {
					if (var18 == -1 && var17.transforms == null) {
						var40 = var17.getModel(10, var6, var25, var27, var26, var28);
					} else {
						var40 = new DynamicObject(var0, var5, 10, var6, var15, var3, var4, var18, var17.boolean3, (Renderable)null);
					}

					if (var40 != null) {
						var29.method4903(var1, var3, var4, var26, var19, var20, (Renderable)var40, var7 == 11 ? 256 : 0, var30, var32);
					}

					if (var17.interactType != 0 && var45 != null) {
						var45.addGameObject(var3, var4, var19, var20, var17.boolean1);
					}
				}

				var17 = class273.getObjectDefinition(var5);
				if (var17 != null && var17.hasSound()) {
					class289.createObjectSound(var15, var3, var4, var17, var6);
				}
			}
		}

	}

	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILjava/lang/String;Ljava/lang/String;III)V",
		garbageValue = "-886112733"
	)
	@Export("menuAction")
	public static final void menuAction(int var0, int var1, int var2, int var3, int var4, int var5, String var6, String var7, int var8, int var9) {
		WorldView var10 = null;
		if (var5 >= 0 && ClientPreferences.topLevelWorldView.worldEntities[var5] != null) {
			var10 = ClientPreferences.topLevelWorldView.worldEntities[var5].worldView;
		} else if (var5 == -1) {
			var10 = ClientPreferences.topLevelWorldView;
		}

		if (var10 != null) {
			int var11 = var10.baseX;
			int var12 = var10.baseY;
			NPC[] var13 = var10.npcs;
			Player[] var14 = var10.players;
			if (var2 >= 2000) {
				var2 -= 2000;
			}

			if (var2 == 30 && Client.meslayerContinueWidget == null) {
				class531.resumePauseWidget(var1, var0);
				Client.meslayerContinueWidget = TaskHandler.widgetDefinition.getWidgetChild(var1, var0);
				SecureRandomCallable.invalidateWidget(Client.meslayerContinueWidget);
			}

			PacketBufferNode var15;
			Widget var16;
			int var17;
			if (var2 == 29) {
				var15 = class141.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeInt(var1);
				Client.packetWriter.addNode(var15);
				var16 = TaskHandler.widgetDefinition.method6841(var1);
				if (var16 != null && var16.cs1Instructions != null && var16.cs1Instructions[0][0] == 5) {
					var17 = var16.cs1Instructions[0][1];
					if (Varps.Varps_main[var17] != var16.cs1ComparisonValues[0]) {
						Varps.Varps_main[var17] = var16.cs1ComparisonValues[0];
						class153.changeGameOptions(var17);
					}
				}
			}

			Player var21;
			PacketBufferNode var22;
			if (var2 == 14) {
				var21 = var14[var3];
				if (var21 != null) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var22 = class141.getPacketBufferNode(ClientPacket.field3350, Client.packetWriter.isaacCipher);
					var22.packetBuffer.writeShortAdd(WorldMapSprite.field3219);
					var22.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var22.packetBuffer.writeShortAdd(KeyHandler.Players_count);
					var22.packetBuffer.writeShortAddLE(var3);
					var22.packetBuffer.writeInt(ScriptEvent.field1113);
					Client.packetWriter.addNode(var22);
				}
			}

			if (var2 == 21) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = class141.getPacketBufferNode(ClientPacket.OPOBJ4, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShortAddLE(var0 + var11);
				var15.packetBuffer.writeShortAddLE(var12 + var1);
				var15.packetBuffer.writeShortAddLE(var3);
				Client.packetWriter.addNode(var15);
			}

			if (var2 == 45) {
				var21 = var14[var3];
				if (var21 != null) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var22 = class141.getPacketBufferNode(ClientPacket.OPPLAYER2, Client.packetWriter.isaacCipher);
					var22.packetBuffer.writeShortAdd(var3);
					var22.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					Client.packetWriter.addNode(var22);
				}
			}

			if (var2 == 51) {
				var21 = var14[var3];
				if (var21 != null) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var22 = class141.getPacketBufferNode(ClientPacket.OPPLAYER8, Client.packetWriter.isaacCipher);
					var22.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var22.packetBuffer.writeShort(var3);
					Client.packetWriter.addNode(var22);
				}
			}

			if (var2 == 1) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = class141.getPacketBufferNode(ClientPacket.field3322, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShort(var0 + var11);
				var15.packetBuffer.writeIntLE(ScriptEvent.field1113);
				var15.packetBuffer.writeShort(KeyHandler.Players_count);
				var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShortLE(WorldMapSprite.field3219);
				var15.packetBuffer.writeShort(var3);
				var15.packetBuffer.writeShortAddLE(var12 + var1);
				Client.packetWriter.addNode(var15);
			}

			if (var2 == 23) {
				if (Client.isMenuOpen) {
					ClientPreferences.topLevelWorldView.scene.method4967();
				} else {
					ClientPreferences.topLevelWorldView.scene.menuOpen(ClientPreferences.topLevelWorldView.plane, var0, var1, true);
				}

				for (int var18 = 0; var18 < ClientPreferences.topLevelWorldView.worldEntityCount; ++var18) {
					WorldEntity var23 = ClientPreferences.topLevelWorldView.worldEntities[ClientPreferences.topLevelWorldView.worldEntityIndices[var18]];
					if (var23 != null) {
						if (Client.isMenuOpen) {
							var23.worldView.scene.method4967();
						} else {
							var23.worldView.scene.menuOpen(var23.worldView.plane, var0, var1, true);
						}
					}
				}
			}

			if (var2 == 3) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = class141.getPacketBufferNode(ClientPacket.OPLOC1, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortAddLE(var0 + var11);
				var15.packetBuffer.writeShort(var3);
				var15.packetBuffer.writeShort(var12 + var1);
				var15.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				Client.packetWriter.addNode(var15);
			}

			if (var2 == 18) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = class141.getPacketBufferNode(ClientPacket.OPOBJ1, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortAddLE(var0 + var11);
				var15.packetBuffer.writeShortLE(var12 + var1);
				var15.packetBuffer.writeShortAdd(var3);
				var15.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				Client.packetWriter.addNode(var15);
			}

			if (var2 == 44) {
				var21 = var14[var3];
				if (var21 != null) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var22 = class141.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
					var22.packetBuffer.writeShortLE(var3);
					var22.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					Client.packetWriter.addNode(var22);
				}
			}

			if (var2 == 22) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = class141.getPacketBufferNode(ClientPacket.OPOBJ5, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShort(var3);
				var15.packetBuffer.writeShort(var0 + var11);
				var15.packetBuffer.writeShortAdd(var12 + var1);
				var15.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				Client.packetWriter.addNode(var15);
			}

			PacketBufferNode var20;
			Widget var24;
			if (var2 == 24) {
				var24 = TaskHandler.widgetDefinition.method6841(var1);
				if (var24 != null) {
					boolean var19 = true;
					if (var24.contentType > 0) {
						var19 = class137.method3343(var24);
					}

					if (var19) {
						var20 = class141.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
						var20.packetBuffer.writeInt(var1);
						Client.packetWriter.addNode(var20);
					}
				}
			}

			if (var2 == 16) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = class141.getPacketBufferNode(ClientPacket.field3312, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShortAdd(var12 + var1);
				var15.packetBuffer.writeShort(var3);
				var15.packetBuffer.writeShort(KeyHandler.Players_count);
				var15.packetBuffer.writeShortAddLE(var0 + var11);
				var15.packetBuffer.writeIntLE(ScriptEvent.field1113);
				var15.packetBuffer.writeShort(WorldMapSprite.field3219);
				Client.packetWriter.addNode(var15);
			}

			if (var2 == 20) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = class141.getPacketBufferNode(ClientPacket.OPOBJ3, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShort(var3);
				var15.packetBuffer.writeShortAddLE(var0 + var11);
				var15.packetBuffer.writeShortAdd(var12 + var1);
				Client.packetWriter.addNode(var15);
			}

			if (var2 == 1001) {
				Client.mouseCrossX = var8;
				Client.mouseCrossY = var9;
				Client.mouseCrossColor = 2;
				Client.mouseCrossState = 0;
				Client.destinationX = var0;
				Client.destinationY = var1;
				var15 = class141.getPacketBufferNode(ClientPacket.OPLOC5, Client.packetWriter.isaacCipher);
				var15.packetBuffer.writeShortAddLE(var12 + var1);
				var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
				var15.packetBuffer.writeShortLE(var0 + var11);
				var15.packetBuffer.writeShortAddLE(var3);
				Client.packetWriter.addNode(var15);
			}

			NPC var26;
			if (var2 == 13) {
				var26 = var13[var3];
				if (var26 != null) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var22 = class141.getPacketBufferNode(ClientPacket.OPNPC5, Client.packetWriter.isaacCipher);
					var22.packetBuffer.writeShortAddLE(var3);
					var22.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					Client.packetWriter.addNode(var22);
				}
			}

			if (var2 == 25) {
				var24 = TaskHandler.widgetDefinition.getWidgetChild(var1, var0);
				if (var24 != null) {
					class134.method3310();
					class113.method3038(var1, var0, FontName.Widget_unpackTargetMask(class310.getWidgetFlags(var24)), var4);
					Client.isItemSelected = 0;
					Client.selectedSpellActionName = UserComparator3.Widget_getSpellActionName(var24);
					if (Client.selectedSpellActionName == null) {
						Client.selectedSpellActionName = "null";
					}

					if (var24.isIf3) {
						Client.selectedSpellName = var24.dataText + HttpMethod.colorStartTag(16777215);
					} else {
						Client.selectedSpellName = HttpMethod.colorStartTag(65280) + var24.field3983 + HttpMethod.colorStartTag(16777215);
					}
				}

			} else {
				if (var2 == 1002) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					var15 = class141.getPacketBufferNode(ClientPacket.OPLOCE, Client.packetWriter.isaacCipher);
					var15.packetBuffer.writeShort(var3);
					Client.packetWriter.addNode(var15);
				}

				if (var2 == 48) {
					var21 = var14[var3];
					if (var21 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var22 = class141.getPacketBufferNode(ClientPacket.OPPLAYER5, Client.packetWriter.isaacCipher);
						var22.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var22.packetBuffer.writeShortLE(var3);
						Client.packetWriter.addNode(var22);
					}
				}

				if (var2 == 46) {
					var21 = var14[var3];
					if (var21 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var22 = class141.getPacketBufferNode(ClientPacket.OPPLAYER3, Client.packetWriter.isaacCipher);
						var22.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var22.packetBuffer.writeShortAddLE(var3);
						Client.packetWriter.addNode(var22);
					}
				}

				if (var2 == 9) {
					var26 = var13[var3];
					if (var26 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var22 = class141.getPacketBufferNode(ClientPacket.OPNPC1, Client.packetWriter.isaacCipher);
						var22.packetBuffer.writeShortAdd(var3);
						var22.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var22);
					}
				}

				if (var2 == 19) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var15 = class141.getPacketBufferNode(ClientPacket.OPOBJ2, Client.packetWriter.isaacCipher);
					var15.packetBuffer.writeShortLE(var3);
					var15.packetBuffer.writeShortLE(var12 + var1);
					var15.packetBuffer.writeShortLE(var0 + var11);
					var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					Client.packetWriter.addNode(var15);
				}

				if (var2 == 58) {
					var24 = TaskHandler.widgetDefinition.getWidgetChild(var1, var0);
					if (var24 != null) {
						if (var24.field3982 != null) {
							ScriptEvent var25 = new ScriptEvent();
							var25.widget = var24;
							var25.opIndex = var3;
							var25.targetName = var7;
							var25.args = var24.field3982;
							class215.runScriptEvent(var25);
						}

						var22 = class141.getPacketBufferNode(ClientPacket.IF_BUTTONT, Client.packetWriter.isaacCipher);
						var22.packetBuffer.writeShortAdd(var0);
						var22.packetBuffer.writeIntME(class36.selectedSpellWidget);
						var22.packetBuffer.writeShortAdd(var4);
						var22.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
						var22.packetBuffer.writeShortLE(Client.selectedSpellItemId);
						var22.packetBuffer.writeIntIME(var1);
						Client.packetWriter.addNode(var22);
					}
				}

				if (var2 == 10) {
					var26 = var13[var3];
					if (var26 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var22 = class141.getPacketBufferNode(ClientPacket.OPNPC2, Client.packetWriter.isaacCipher);
						var22.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var22.packetBuffer.writeShortLE(var3);
						Client.packetWriter.addNode(var22);
					}
				}

				if (var2 == 17) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var15 = class141.getPacketBufferNode(ClientPacket.OPOBJT, Client.packetWriter.isaacCipher);
					var15.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var15.packetBuffer.writeShortAddLE(var3);
					var15.packetBuffer.writeIntIME(class36.selectedSpellWidget);
					var15.packetBuffer.writeShortLE(Client.selectedSpellItemId);
					var15.packetBuffer.writeShortLE(var0 + var11);
					var15.packetBuffer.writeShortAdd(Client.selectedSpellChildIndex);
					var15.packetBuffer.writeShortAdd(var12 + var1);
					Client.packetWriter.addNode(var15);
				}

				if (var2 == 47) {
					var21 = var14[var3];
					if (var21 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var22 = class141.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
						var22.packetBuffer.writeShort(var3);
						var22.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var22);
					}
				}

				if (var2 == 50) {
					var21 = var14[var3];
					if (var21 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var22 = class141.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
						var22.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var22.packetBuffer.writeShortAdd(var3);
						Client.packetWriter.addNode(var22);
					}
				}

				if (var2 == 15) {
					var21 = var14[var3];
					if (var21 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var22 = class141.getPacketBufferNode(ClientPacket.OPPLAYERT, Client.packetWriter.isaacCipher);
						var22.packetBuffer.writeIntLE(class36.selectedSpellWidget);
						var22.packetBuffer.writeShortAddLE(Client.selectedSpellChildIndex);
						var22.packetBuffer.writeShortAddLE(var3);
						var22.packetBuffer.writeShortAdd(Client.selectedSpellItemId);
						var22.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var22);
					}
				}

				if (var2 == 12) {
					var26 = var13[var3];
					if (var26 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var22 = class141.getPacketBufferNode(ClientPacket.OPNPC4, Client.packetWriter.isaacCipher);
						var22.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var22.packetBuffer.writeShort(var3);
						Client.packetWriter.addNode(var22);
					}
				}

				if (var2 == 1003) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					var26 = var13[var3];
					if (var26 != null) {
						NPCComposition var27 = var26.definition;
						if (var27.transforms != null) {
							var27 = var27.transform();
						}

						if (var27 != null) {
							var20 = class141.getPacketBufferNode(ClientPacket.OPNPCE, Client.packetWriter.isaacCipher);
							var20.packetBuffer.writeShortLE(var27.id);
							Client.packetWriter.addNode(var20);
						}
					}
				}

				if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) {
					UserComparator8.worldMap.worldMapMenuAction(var2, var3, new Coord(var0), new Coord(var1));
				}

				if (var2 == 8) {
					var26 = var13[var3];
					if (var26 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var22 = class141.getPacketBufferNode(ClientPacket.OPNPCT, Client.packetWriter.isaacCipher);
						var22.packetBuffer.writeShortLE(var3);
						var22.packetBuffer.writeShortAdd(Client.selectedSpellItemId);
						var22.packetBuffer.writeIntLE(class36.selectedSpellWidget);
						var22.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
						var22.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var22);
					}
				}

				if (var2 == 1004) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					var15 = class141.getPacketBufferNode(ClientPacket.OPOBJE, Client.packetWriter.isaacCipher);
					var15.packetBuffer.writeShort(var12 + var1);
					var15.packetBuffer.writeShortAddLE(var0 + var11);
					var15.packetBuffer.writeShortLE(var3);
					Client.packetWriter.addNode(var15);
				}

				if (var2 == 5) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var15 = class141.getPacketBufferNode(ClientPacket.OPLOC3, Client.packetWriter.isaacCipher);
					var15.packetBuffer.writeShort(var12 + var1);
					var15.packetBuffer.writeShortLE(var3);
					var15.packetBuffer.writeByteSub(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var15.packetBuffer.writeShortAddLE(var0 + var11);
					Client.packetWriter.addNode(var15);
				}

				if (var2 == 11) {
					var26 = var13[var3];
					if (var26 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var22 = class141.getPacketBufferNode(ClientPacket.OPNPC3, Client.packetWriter.isaacCipher);
						var22.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var22.packetBuffer.writeShortAdd(var3);
						Client.packetWriter.addNode(var22);
					}
				}

				if (var2 == 57 || var2 == 1007) {
					var24 = TaskHandler.widgetDefinition.getWidgetChild(var1, var0);
					if (var24 != null) {
						class216.widgetDefaultMenuAction(var3, var1, var0, var4, var7);
					}
				}

				if (var2 == 2) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var15 = class141.getPacketBufferNode(ClientPacket.OPLOCT, Client.packetWriter.isaacCipher);
					var15.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var15.packetBuffer.writeShortAdd(var3);
					var15.packetBuffer.writeShort(Client.selectedSpellItemId);
					var15.packetBuffer.writeShortLE(var12 + var1);
					var15.packetBuffer.writeShortLE(var0 + var11);
					var15.packetBuffer.writeIntLE(class36.selectedSpellWidget);
					var15.packetBuffer.writeShortLE(Client.selectedSpellChildIndex);
					Client.packetWriter.addNode(var15);
				}

				if (var2 == 26) {
					LoginScreenAnimation.method2731();
				}

				if (var2 == 28) {
					var15 = class141.getPacketBufferNode(ClientPacket.WIDGET_TYPE, Client.packetWriter.isaacCipher);
					var15.packetBuffer.writeInt(var1);
					Client.packetWriter.addNode(var15);
					var16 = TaskHandler.widgetDefinition.method6841(var1);
					if (var16 != null && var16.cs1Instructions != null && var16.cs1Instructions[0][0] == 5) {
						var17 = var16.cs1Instructions[0][1];
						Varps.Varps_main[var17] = 1 - Varps.Varps_main[var17];
						class153.changeGameOptions(var17);
					}
				}

				if (var2 == 4) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var15 = class141.getPacketBufferNode(ClientPacket.OPLOC2, Client.packetWriter.isaacCipher);
					var15.packetBuffer.writeShort(var12 + var1);
					var15.packetBuffer.writeShortAddLE(var3);
					var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var15.packetBuffer.writeShortLE(var0 + var11);
					Client.packetWriter.addNode(var15);
				}

				if (var2 == 7) {
					var26 = var13[var3];
					if (var26 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var22 = class141.getPacketBufferNode(ClientPacket.field3372, Client.packetWriter.isaacCipher);
						var22.packetBuffer.writeShortAdd(WorldMapSprite.field3219);
						var22.packetBuffer.writeIntIME(ScriptEvent.field1113);
						var22.packetBuffer.writeShortAdd(var3);
						var22.packetBuffer.writeByte(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						var22.packetBuffer.writeShortAddLE(KeyHandler.Players_count);
						Client.packetWriter.addNode(var22);
					}
				}

				if (var2 == 6) {
					Client.mouseCrossX = var8;
					Client.mouseCrossY = var9;
					Client.mouseCrossColor = 2;
					Client.mouseCrossState = 0;
					Client.destinationX = var0;
					Client.destinationY = var1;
					var15 = class141.getPacketBufferNode(ClientPacket.OPLOC4, Client.packetWriter.isaacCipher);
					var15.packetBuffer.writeShort(var12 + var1);
					var15.packetBuffer.writeShortLE(var0 + var11);
					var15.packetBuffer.writeByteNeg(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
					var15.packetBuffer.writeShortAddLE(var3);
					Client.packetWriter.addNode(var15);
				}

				if (var2 == 49) {
					var21 = var14[var3];
					if (var21 != null) {
						Client.mouseCrossX = var8;
						Client.mouseCrossY = var9;
						Client.mouseCrossColor = 2;
						Client.mouseCrossState = 0;
						Client.destinationX = var0;
						Client.destinationY = var1;
						var22 = class141.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
						var22.packetBuffer.writeShortAdd(var3);
						var22.packetBuffer.writeByteAdd(Client.indexCheck.isValidIndexInRange(82) ? 1 : 0);
						Client.packetWriter.addNode(var22);
					}
				}

				if (Client.isItemSelected != 0) {
					Client.isItemSelected = 0;
					SecureRandomCallable.invalidateWidget(TaskHandler.widgetDefinition.method6841(ScriptEvent.field1113));
				}

				if (Client.isSpellSelected) {
					class134.method3310();
				}

			}
		}
	}
}
