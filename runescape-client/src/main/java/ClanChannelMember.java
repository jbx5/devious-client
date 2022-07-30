import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("em")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("ry")
	@Export("ClanChat_inClanChat")
	static boolean ClanChat_inClanChat;

	@ObfuscatedName("o")
	@Export("rank")
	public byte rank;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -142420601)
	@Export("world")
	public int world;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lqi;")
	@Export("username")
	public Username username;

	ClanChannelMember() {
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(descriptor = "(ILbc;ZI)I", garbageValue = "-1714284754")
	static int method2907(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) {
			var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (class192.method3904(var3)) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (class193.method3908(var3)) ? 1 : 0;
			return 1;
		} else if (var0 == 3502) {
			var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (class134.method2939(var3)) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(descriptor = "(Ljz;B)V", garbageValue = "93")
	static final void method2908(class263 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer;
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		if (class263.field3024 == var0) {
			var2 = var1.readUnsignedByteNeg();
			var3 = (var2 >> 4 & 7) + class326.field4097;
			var4 = (var2 & 7) + class10.field58;
			var5 = var1.readUnsignedByteSub();
			var6 = var5 >> 2;
			var7 = var5 & 3;
			var8 = Client.field556[var6];
			if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
				class65.updatePendingSpawn(FriendSystem.Client_plane, var3, var4, var8, -1, var6, var7, 0, -1);
			}
		} else if (class263.field3025 == var0) {
			var2 = var1.readUnsignedShortAdd();
			var3 = var1.readUnsignedShortAdd();
			var4 = var1.readUnsignedByteAdd();
			var5 = (var4 >> 4 & 7) + class326.field4097;
			var6 = (var4 & 7) + class10.field58;
			var7 = var1.readUnsignedByteAdd();
			if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
				var5 = var5 * 128 + 64;
				var6 = var6 * 128 + 64;
				GraphicsObject var41 = new GraphicsObject(var2, FriendSystem.Client_plane, var5, var6, SecureRandomFuture.getTileHeight(var5, var6, FriendSystem.Client_plane) - var7, var3, Client.cycle);
				Client.graphicsObjects.addFirst(var41);
			}
		} else {
			int var9;
			if (class263.field3028 == var0) {
				var2 = var1.readUnsignedByteAdd();
				var3 = var2 >> 2;
				var4 = var2 & 3;
				var5 = Client.field556[var3];
				var6 = var1.readUnsignedShortAddLE();
				var7 = var1.readUnsignedByte();
				var8 = (var7 >> 4 & 7) + class326.field4097;
				var9 = (var7 & 7) + class10.field58;
				if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
					class65.updatePendingSpawn(FriendSystem.Client_plane, var8, var9, var5, var6, var3, var4, 0, -1);
				}
			} else {
				int var10;
				if (class263.field3022 == var0) {
					var2 = var1.readUnsignedByteSub();
					var3 = var1.readUnsignedShortLE();
					var4 = var1.readUnsignedByteSub();
					var5 = (var4 >> 4 & 7) + class326.field4097;
					var6 = (var4 & 7) + class10.field58;
					var7 = var1.readUnsignedByteSub();
					var8 = var7 >> 4 & 15;
					var9 = var7 & 7;
					if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
						var10 = var8 + 1;
						if (class28.localPlayer.pathX[0] >= var5 - var10 && class28.localPlayer.pathX[0] <= var5 + var10 && class28.localPlayer.pathY[0] >= var6 - var10 && class28.localPlayer.pathY[0] <= var6 + var10 && class260.clientPreferences.method2329() != 0 && var9 > 0 && Client.soundEffectCount < 50) {
							Client.soundEffectIds[Client.soundEffectCount] = var3;
							Client.queuedSoundEffectLoops[Client.soundEffectCount] = var9;
							Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2;
							Client.soundEffects[Client.soundEffectCount] = null;
							Client.soundLocations[Client.soundEffectCount] = var8 + (var6 << 8) + (var5 << 16);
							++Client.soundEffectCount;
						}
					}
				}
				TileItem var33;
				if (class263.field3021 == var0) {
					var2 = var1.readUnsignedShort();
					var3 = var1.readUnsignedByteNeg();
					var4 = (var3 >> 4 & 7) + class326.field4097;
					var5 = (var3 & 7) + class10.field58;
					var6 = var1.readUnsignedShortAdd();
					if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
						var33 = new TileItem();
						var33.id = var6;
						var33.quantity = var2;
						if (Client.groundItems[FriendSystem.Client_plane][var4][var5] == null) {
							Client.groundItems[FriendSystem.Client_plane][var4][var5] = new NodeDeque();
						}
						Client.groundItems[FriendSystem.Client_plane][var4][var5].addFirst(var33);
						WorldMapManager.updateItemPile(var4, var5);
					}
				} else {
					int var11;
					if (class263.field3027 == var0) {
						var2 = var1.readUnsignedByteNeg();
						var3 = var2 >> 2;
						var4 = var2 & 3;
						var5 = Client.field556[var3];
						var6 = var1.readUnsignedByte();
						var7 = (var6 >> 4 & 7) + class326.field4097;
						var8 = (var6 & 7) + class10.field58;
						var9 = var1.readUnsignedShortAdd();
						if (var7 >= 0 && var8 >= 0 && var7 < 103 && var8 < 103) {
							if (var5 == 0) {
								BoundaryObject var36 = Decimator.scene.method4129(FriendSystem.Client_plane, var7, var8);
								if (var36 != null) {
									var11 = class141.Entity_unpackID(var36.tag);
									if (var3 == 2) {
										var36.renderable1 = new DynamicObject(var11, 2, var4 + 4, FriendSystem.Client_plane, var7, var8, var9, false, var36.renderable1);
										var36.renderable2 = new DynamicObject(var11, 2, var4 + 1 & 3, FriendSystem.Client_plane, var7, var8, var9, false, var36.renderable2);
									} else {
										var36.renderable1 = new DynamicObject(var11, var3, var4, FriendSystem.Client_plane, var7, var8, var9, false, var36.renderable1);
									}
								}
							}
							if (var5 == 1) {
								WallDecoration var42 = Decimator.scene.method4130(FriendSystem.Client_plane, var7, var8);
								if (var42 != null) {
									var11 = class141.Entity_unpackID(var42.tag);
									if (var3 != 4 && var3 != 5) {
										if (var3 == 6) {
											var42.renderable1 = new DynamicObject(var11, 4, var4 + 4, FriendSystem.Client_plane, var7, var8, var9, false, var42.renderable1);
										} else if (var3 == 7) {
											var42.renderable1 = new DynamicObject(var11, 4, (var4 + 2 & 3) + 4, FriendSystem.Client_plane, var7, var8, var9, false, var42.renderable1);
										} else if (var3 == 8) {
											var42.renderable1 = new DynamicObject(var11, 4, var4 + 4, FriendSystem.Client_plane, var7, var8, var9, false, var42.renderable1);
											var42.renderable2 = new DynamicObject(var11, 4, (var4 + 2 & 3) + 4, FriendSystem.Client_plane, var7, var8, var9, false, var42.renderable2);
										}
									} else {
										var42.renderable1 = new DynamicObject(var11, 4, var4, FriendSystem.Client_plane, var7, var8, var9, false, var42.renderable1);
									}
								}
							}
							if (var5 == 2) {
								GameObject var43 = Decimator.scene.getGameObject(FriendSystem.Client_plane, var7, var8);
								if (var3 == 11) {
									var3 = 10;
								}
								if (var43 != null) {
									var43.renderable = new DynamicObject(class141.Entity_unpackID(var43.tag), var3, var4, FriendSystem.Client_plane, var7, var8, var9, false, var43.renderable);
								}
							}
							if (var5 == 3) {
								FloorDecoration var44 = Decimator.scene.getFloorDecoration(FriendSystem.Client_plane, var7, var8);
								if (var44 != null) {
									var44.renderable = new DynamicObject(class141.Entity_unpackID(var44.tag), 22, var4, FriendSystem.Client_plane, var7, var8, var9, false, var44.renderable);
								}
							}
						}
					} else {
						int var12;
						int var13;
						int var14;
						byte var38;
						if (class263.field3020 == var0) {
							var2 = var1.readUnsignedByteAdd();
							var3 = (var2 >> 4 & 7) + class326.field4097;
							var4 = (var2 & 7) + class10.field58;
							var5 = var1.readUnsignedShortAddLE();
							byte var37 = var1.readByteSub();
							var38 = var1.readByte();
							byte var39 = var1.readByteAdd();
							var9 = var1.readUnsignedShortAdd();
							var10 = var1.readUnsignedByteNeg();
							var11 = var10 >> 2;
							var12 = var10 & 3;
							var13 = Client.field556[var11];
							var14 = var1.readByte();
							int var15 = var1.readUnsignedShortAdd();
							int var16 = var1.readUnsignedShortLE();
							Player var17;
							if (var16 == Client.localPlayerIndex) {
								var17 = class28.localPlayer;
							} else {
								var17 = Client.players[var16];
							}
							if (var17 != null) {
								ObjectComposition var18 = WorldMapDecoration.getObjectDefinition(var9);
								int var19;
								int var20;
								if (var12 != 1 && var12 != 3) {
									var19 = var18.sizeX;
									var20 = var18.sizeY;
								} else {
									var19 = var18.sizeY;
									var20 = var18.sizeX;
								}
								int var21 = var3 + (var19 >> 1);
								int var22 = var3 + (var19 + 1 >> 1);
								int var23 = var4 + (var20 >> 1);
								int var24 = var4 + (var20 + 1 >> 1);
								int[][] var25 = Tiles.Tiles_heights[FriendSystem.Client_plane];
								int var26 = var25[var21][var24] + var25[var22][var23] + var25[var21][var23] + var25[var22][var24] >> 2;
								int var27 = (var3 << 7) + (var19 << 6);
								int var28 = (var4 << 7) + (var20 << 6);
								Model var29 = var18.getModel(var11, var12, var25, var27, var26, var28);
								if (var29 != null) {
									class65.updatePendingSpawn(FriendSystem.Client_plane, var3, var4, var13, -1, 0, 0, var15 + 1, var5 + 1);
									var17.animationCycleStart = var15 + Client.cycle;
									var17.animationCycleEnd = var5 + Client.cycle;
									var17.model0 = var29;
									var17.field1095 = var3 * 128 + var19 * 64;
									var17.field1097 = var4 * 128 + var20 * 64;
									var17.tileHeight2 = var26;
									byte var30;
									if (var39 > var38) {
										var30 = var39;
										var39 = var38;
										var38 = var30;
									}
									if (var14 > var37) {
										var30 = ((byte) (var14));
										var14 = var37;
										var37 = var30;
									}
									var17.minX = var39 + var3;
									var17.maxX = var38 + var3;
									var17.minY = var14 + var4;
									var17.maxY = var4 + var37;
								}
							}
						}
						if (class263.field3019 == var0) {
							var2 = var1.readUnsignedByteNeg();
							var3 = (var2 >> 4 & 7) + class326.field4097;
							var4 = (var2 & 7) + class10.field58;
							var5 = var1.readUnsignedShortAdd();
							var6 = var1.readUnsignedShortLE();
							var7 = var1.readUnsignedShortAddLE();
							if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
								NodeDeque var34 = Client.groundItems[FriendSystem.Client_plane][var3][var4];
								if (var34 != null) {
									for (TileItem var35 = ((TileItem) (var34.last())); var35 != null; var35 = ((TileItem) (var34.previous()))) {
										if ((var6 & 32767) == var35.id && var5 == var35.quantity) {
											var35.quantity = var7;
											break;
										}
									}
									WorldMapManager.updateItemPile(var3, var4);
								}
							}
						} else if (class263.field3026 != var0) {
							if (class263.field3023 == var0) {
								var2 = var1.readUnsignedByteSub();
								var3 = var1.readUnsignedByteAdd();
								var4 = (var3 >> 4 & 7) + class326.field4097;
								var5 = (var3 & 7) + class10.field58;
								var6 = var1.readUnsignedByteAdd() * 4;
								var38 = var1.readByte();
								var8 = var1.readUnsignedShortAddLE();
								byte var40 = var1.readByteSub();
								var10 = var1.readUnsignedByte();
								var11 = var1.readUnsignedByteNeg() * 4;
								var12 = var1.readUnsignedShortAdd();
								var13 = var1.readUnsignedShortAddLE();
								var14 = var1.readShortAddLE();
								var9 = var40 + var4;
								var7 = var38 + var5;
								if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104 && var9 >= 0 && var7 >= 0 && var9 < 104 && var7 < 104 && var12 != 65535) {
									var4 = var4 * 128 + 64;
									var5 = var5 * 128 + 64;
									var9 = var9 * 128 + 64;
									var7 = var7 * 128 + 64;
									Projectile var31 = new Projectile(var12, FriendSystem.Client_plane, var4, var5, SecureRandomFuture.getTileHeight(var4, var5, FriendSystem.Client_plane) - var11, var8 + Client.cycle, var13 + Client.cycle, var10, var2, var14, var6);
									var31.setDestination(var9, var7, SecureRandomFuture.getTileHeight(var9, var7, FriendSystem.Client_plane) - var6, var8 + Client.cycle);
									Client.projectiles.addFirst(var31);
								}
							}
						} else {
							var2 = var1.readUnsignedByte();
							var3 = (var2 >> 4 & 7) + class326.field4097;
							var4 = (var2 & 7) + class10.field58;
							var5 = var1.readUnsignedShortAdd();
							if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
								NodeDeque var32 = Client.groundItems[FriendSystem.Client_plane][var3][var4];
								if (var32 != null) {
									for (var33 = ((TileItem) (var32.last())); var33 != null; var33 = ((TileItem) (var32.previous()))) {
										if ((var5 & 32767) == var33.id) {
											var33.remove();
											break;
										}
									}
									if (var32.last() == null) {
										Client.groundItems[FriendSystem.Client_plane][var3][var4] = null;
									}
									WorldMapManager.updateItemPile(var3, var4);
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(descriptor = "(II)Ljava/lang/String;", garbageValue = "102639413")
	static String method2906(int var0) {
		if (var0 < 0) {
			return "";
		} else {
			return Client.menuTargets[var0].length() > 0 ? Client.menuActions[var0] + " " + Client.menuTargets[var0] : Client.menuActions[var0];
		}
	}
}