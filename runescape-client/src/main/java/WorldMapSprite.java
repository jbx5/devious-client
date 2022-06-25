import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("is")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
	@ObfuscatedName("em")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("archive14")
	static Archive archive14;

	@ObfuscatedName("v")
	@Export("tileColors")
	final int[] tileColors;

	WorldMapSprite() {
		this.tileColors = new int[4096];
	}

	WorldMapSprite(int[] var1) {
		this.tileColors = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(IIB)I", garbageValue = "14")
	@Export("getTileColor")
	final int getTileColor(int var1, int var2) {
		return this.tileColors[var2 * 64 + var1];
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(descriptor = "(Ljw;I)V", garbageValue = "-419484906")
	static final void method4998(class262 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer;
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		if (class262.field3022 == var0) {
			var2 = var1.readUnsignedShort();
			var3 = var1.readUnsignedByteSub();
			var4 = (var3 >> 4 & 7) + class10.field53;
			var5 = (var3 & 7) + class298.field3558;
			var6 = var1.readUnsignedByteSub();
			var7 = var1.readUnsignedShort();
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				var4 = var4 * 128 + 64;
				var5 = var5 * 128 + 64;
				GraphicsObject var45 = new GraphicsObject(var2, PacketWriter.Client_plane, var4, var5, SceneTilePaint.getTileHeight(var4, var5, PacketWriter.Client_plane) - var6, var7, Client.cycle);
				Client.graphicsObjects.addFirst(var45);
			}
		} else {
			int var8;
			if (class262.field3023 == var0) {
				var2 = var1.readUnsignedByteAdd();
				var3 = var2 >> 2;
				var4 = var2 & 3;
				var5 = Client.field582[var3];
				var6 = var1.readUnsignedByteAdd();
				var7 = (var6 >> 4 & 7) + class10.field53;
				var8 = (var6 & 7) + class298.field3558;
				if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
					Canvas.updatePendingSpawn(PacketWriter.Client_plane, var7, var8, var5, -1, var3, var4, 0, -1);
				}
			} else {
				int var9;
				int var10;
				int var11;
				int var12;
				int var13;
				byte var14;
				if (class262.field3021 == var0) {
					var2 = var1.readUnsignedByte() * 4;
					var3 = var1.readUnsignedShort();
					var4 = var1.readUnsignedShort();
					var5 = var1.readUnsignedByte();
					var6 = var1.readShortAdd();
					var7 = var1.readUnsignedByteSub();
					var8 = var1.readUnsignedByteAdd();
					var9 = (var8 >> 4 & 7) + class10.field53;
					var10 = (var8 & 7) + class298.field3558;
					var11 = var1.readUnsignedByteAdd() * 4;
					byte var40 = var1.readByteSub();
					var13 = var1.readUnsignedShortAddLE();
					var14 = var1.readByte();
					int var41 = var14 + var9;
					var12 = var40 + var10;
					if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104 && var41 >= 0 && var12 >= 0 && var41 < 104 && var12 < 104 && var4 != 65535) {
						var9 = var9 * 128 + 64;
						var10 = var10 * 128 + 64;
						var41 = var41 * 128 + 64;
						var12 = var12 * 128 + 64;
						Projectile var36 = new Projectile(var4, PacketWriter.Client_plane, var9, var10, SceneTilePaint.getTileHeight(var9, var10, PacketWriter.Client_plane) - var11, var13 + Client.cycle, var3 + Client.cycle, var7, var5, var6, var2);
						var36.setDestination(var41, var12, SceneTilePaint.getTileHeight(var41, var12, PacketWriter.Client_plane) - var2, var13 + Client.cycle);
						Client.projectiles.addFirst(var36);
					}
				} else {
					if (class262.field3020 == var0) {
						var2 = var1.readUnsignedByteAdd();
						var3 = var2 >> 4 & 15;
						var4 = var2 & 7;
						var5 = var1.readUnsignedByteSub();
						var6 = var1.readUnsignedShort();
						var7 = var1.readUnsignedByte();
						var8 = (var7 >> 4 & 7) + class10.field53;
						var9 = (var7 & 7) + class298.field3558;
						if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
							var10 = var3 + 1;
							if (class101.localPlayer.pathX[0] >= var8 - var10 && class101.localPlayer.pathX[0] <= var8 + var10 && class101.localPlayer.pathY[0] >= var9 - var10 && class101.localPlayer.pathY[0] <= var9 + var10 && class19.clientPreferences.method2262() != 0 && var4 > 0 && Client.soundEffectCount < 50) {
								Client.soundEffectIds[Client.soundEffectCount] = var6;
								Client.queuedSoundEffectLoops[Client.soundEffectCount] = var4;
								Client.queuedSoundEffectDelays[Client.soundEffectCount] = var5;
								Client.soundEffects[Client.soundEffectCount] = null;
								Client.soundLocations[Client.soundEffectCount] = var3 + (var9 << 8) + (var8 << 16);
								++Client.soundEffectCount;
							}
						}
					}
					if (class262.field3017 == var0) {
						var2 = var1.readUnsignedByte();
						var3 = (var2 >> 4 & 7) + class10.field53;
						var4 = (var2 & 7) + class298.field3558;
						var5 = var1.readUnsignedShortLE();
						var6 = var1.readUnsignedShortLE();
						var7 = var1.readUnsignedShort();
						if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
							NodeDeque var34 = Client.groundItems[PacketWriter.Client_plane][var3][var4];
							if (var34 != null) {
								for (TileItem var35 = ((TileItem) (var34.last())); var35 != null; var35 = ((TileItem) (var34.previous()))) {
									if ((var6 & 32767) == var35.id && var5 == var35.quantity) {
										var35.quantity = var7;
										break;
									}
								}
								class133.updateItemPile(var3, var4);
							}
						}
					} else {
						TileItem var32;
						if (class262.field3019 == var0) {
							var2 = var1.readUnsignedShort();
							var3 = var1.readUnsignedByteSub();
							var4 = (var3 >> 4 & 7) + class10.field53;
							var5 = (var3 & 7) + class298.field3558;
							var6 = var1.readUnsignedShortAdd();
							if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
								var32 = new TileItem();
								var32.id = var2;
								var32.quantity = var6;
								if (Client.groundItems[PacketWriter.Client_plane][var4][var5] == null) {
									Client.groundItems[PacketWriter.Client_plane][var4][var5] = new NodeDeque();
								}
								Client.groundItems[PacketWriter.Client_plane][var4][var5].addFirst(var32);
								class133.updateItemPile(var4, var5);
							}
						} else {
							if (class262.field3024 == var0) {
								var2 = var1.readUnsignedByteAdd();
								var3 = (var2 >> 4 & 7) + class10.field53;
								var4 = (var2 & 7) + class298.field3558;
								byte var37 = var1.readByteSub();
								var6 = var1.readUnsignedShortAdd();
								byte var38 = var1.readByteSub();
								byte var39 = var1.readByteAdd();
								var9 = var1.readUnsignedByteSub();
								var10 = var9 >> 2;
								var11 = var9 & 3;
								var12 = Client.field582[var10];
								var13 = var1.readUnsignedShortAddLE();
								var14 = var1.readByteNeg();
								int var15 = var1.readUnsignedShortAdd();
								int var16 = var1.readUnsignedShort();
								Player var17;
								if (var15 == Client.localPlayerIndex) {
									var17 = class101.localPlayer;
								} else {
									var17 = Client.players[var15];
								}
								if (var17 != null) {
									ObjectComposition var18 = class162.getObjectDefinition(var6);
									int var19;
									int var20;
									if (var11 != 1 && var11 != 3) {
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
									int[][] var25 = Tiles.Tiles_heights[PacketWriter.Client_plane];
									int var26 = var25[var22][var24] + var25[var21][var24] + var25[var21][var23] + var25[var22][var23] >> 2;
									int var27 = (var3 << 7) + (var19 << 6);
									int var28 = (var4 << 7) + (var20 << 6);
									Model var29 = var18.getModel(var10, var11, var25, var27, var26, var28);
									if (var29 != null) {
										Canvas.updatePendingSpawn(PacketWriter.Client_plane, var3, var4, var12, -1, 0, 0, var13 + 1, var16 + 1);
										var17.animationCycleStart = var13 + Client.cycle;
										var17.animationCycleEnd = var16 + Client.cycle;
										var17.model0 = var29;
										var17.field1095 = var19 * 64 + var3 * 128;
										var17.field1108 = var20 * 64 + var4 * 128;
										var17.tileHeight2 = var26;
										byte var30;
										if (var37 > var39) {
											var30 = var37;
											var37 = var39;
											var39 = var30;
										}
										if (var38 > var14) {
											var30 = var38;
											var38 = var14;
											var14 = var30;
										}
										var17.minX = var37 + var3;
										var17.maxX = var39 + var3;
										var17.minY = var4 + var38;
										var17.maxY = var4 + var14;
									}
								}
							}
							if (class262.field3015 == var0) {
								var2 = var1.readUnsignedByteAdd();
								var3 = var2 >> 2;
								var4 = var2 & 3;
								var5 = Client.field582[var3];
								var6 = var1.readUnsignedShortLE();
								var7 = var1.readUnsignedByte();
								var8 = (var7 >> 4 & 7) + class10.field53;
								var9 = (var7 & 7) + class298.field3558;
								if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) {
									if (var5 == 0) {
										BoundaryObject var33 = class356.scene.method4333(PacketWriter.Client_plane, var8, var9);
										if (var33 != null) {
											var11 = Decimator.Entity_unpackID(var33.tag);
											if (var3 == 2) {
												var33.renderable1 = new DynamicObject(var11, 2, var4 + 4, PacketWriter.Client_plane, var8, var9, var6, false, var33.renderable1);
												var33.renderable2 = new DynamicObject(var11, 2, var4 + 1 & 3, PacketWriter.Client_plane, var8, var9, var6, false, var33.renderable2);
											} else {
												var33.renderable1 = new DynamicObject(var11, var3, var4, PacketWriter.Client_plane, var8, var9, var6, false, var33.renderable1);
											}
										}
									}
									if (var5 == 1) {
										WallDecoration var42 = class356.scene.method4178(PacketWriter.Client_plane, var8, var9);
										if (var42 != null) {
											var11 = Decimator.Entity_unpackID(var42.tag);
											if (var3 != 4 && var3 != 5) {
												if (var3 == 6) {
													var42.renderable1 = new DynamicObject(var11, 4, var4 + 4, PacketWriter.Client_plane, var8, var9, var6, false, var42.renderable1);
												} else if (var3 == 7) {
													var42.renderable1 = new DynamicObject(var11, 4, (var4 + 2 & 3) + 4, PacketWriter.Client_plane, var8, var9, var6, false, var42.renderable1);
												} else if (var3 == 8) {
													var42.renderable1 = new DynamicObject(var11, 4, var4 + 4, PacketWriter.Client_plane, var8, var9, var6, false, var42.renderable1);
													var42.renderable2 = new DynamicObject(var11, 4, (var4 + 2 & 3) + 4, PacketWriter.Client_plane, var8, var9, var6, false, var42.renderable2);
												}
											} else {
												var42.renderable1 = new DynamicObject(var11, 4, var4, PacketWriter.Client_plane, var8, var9, var6, false, var42.renderable1);
											}
										}
									}
									if (var5 == 2) {
										GameObject var43 = class356.scene.getGameObject(PacketWriter.Client_plane, var8, var9);
										if (var3 == 11) {
											var3 = 10;
										}
										if (var43 != null) {
											var43.renderable = new DynamicObject(Decimator.Entity_unpackID(var43.tag), var3, var4, PacketWriter.Client_plane, var8, var9, var6, false, var43.renderable);
										}
									}
									if (var5 == 3) {
										FloorDecoration var44 = class356.scene.getFloorDecoration(PacketWriter.Client_plane, var8, var9);
										if (var44 != null) {
											var44.renderable = new DynamicObject(Decimator.Entity_unpackID(var44.tag), 22, var4, PacketWriter.Client_plane, var8, var9, var6, false, var44.renderable);
										}
									}
								}
							} else if (class262.field3018 == var0) {
								var2 = var1.readUnsignedByteNeg();
								var3 = var2 >> 2;
								var4 = var2 & 3;
								var5 = Client.field582[var3];
								var6 = var1.readUnsignedByteAdd();
								var7 = (var6 >> 4 & 7) + class10.field53;
								var8 = (var6 & 7) + class298.field3558;
								var9 = var1.readUnsignedShortLE();
								if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
									Canvas.updatePendingSpawn(PacketWriter.Client_plane, var7, var8, var5, var9, var3, var4, 0, -1);
								}
							} else if (class262.field3016 == var0) {
								var2 = var1.readUnsignedShort();
								var3 = var1.readUnsignedByteNeg();
								var4 = (var3 >> 4 & 7) + class10.field53;
								var5 = (var3 & 7) + class298.field3558;
								if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
									NodeDeque var31 = Client.groundItems[PacketWriter.Client_plane][var4][var5];
									if (var31 != null) {
										for (var32 = ((TileItem) (var31.last())); var32 != null; var32 = ((TileItem) (var31.previous()))) {
											if ((var2 & 32767) == var32.id) {
												var32.remove();
												break;
											}
										}
										if (var31.last() == null) {
											Client.groundItems[PacketWriter.Client_plane][var4][var5] = null;
										}
										class133.updateItemPile(var4, var5);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(descriptor = "(II)Ljava/lang/String;", garbageValue = "-1162269812")
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0);
		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
			var1 = var1.substring(0, var2) + "," + var1.substring(var2);
		}
		if (var1.length() > 9) {
			return " " + class122.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + class122.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + class122.colorStartTag(16776960) + var1 + "</col>";
		}
	}
}