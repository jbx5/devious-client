import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hi")
public class class221 {
	@ObfuscatedName("hy")
	@ObfuscatedGetter(intValue = 
	-1143760795)

	static int field2647;

	@ObfuscatedName("hz")
	@ObfuscatedSignature(descriptor = 
	"(Lji;I)V", garbageValue = 
	"1145478954")

	static final void method4531(class263 var0) {
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
		int var11;
		int var12;
		int var13;
		int var14;
		if (class263.field3013 == var0) {
			var2 = var1.readUnsignedByteAdd() * 4;
			var3 = var1.readUnsignedShortAdd();
			var4 = var1.readShortAdd();
			var5 = var1.readUnsignedByteNeg();
			var6 = ((var5 >> 4) & 7) + FriendSystem.field803;
			var7 = (var5 & 7) + class9.field34;
			var8 = var1.readUnsignedShortAdd();
			byte var41 = var1.readByteNeg();
			var10 = var1.readUnsignedByteSub();
			byte var42 = var1.readByteSub();
			var12 = var1.readUnsignedByte() * 4;
			var13 = var1.readUnsignedByteNeg();
			var14 = var1.readUnsignedShortAdd();
			var9 = var41 + var6;
			var11 = var42 + var7;
			if (((((((((var6 >= 0) && (var7 >= 0)) && (var6 < 104)) && (var7 < 104)) && (var9 >= 0)) && (var11 >= 0)) && (var9 < 104)) && (var11 < 104)) && (var14 != 65535)) {
				var6 = (var6 * 128) + 64;
				var7 = (var7 * 128) + 64;
				var9 = (var9 * 128) + 64;
				var11 = (var11 * 128) + 64;
				Projectile var36 = new Projectile(var14, class160.Client_plane, var6, var7, Archive.getTileHeight(var6, var7, class160.Client_plane) - var2, var3 + Client.cycle, var8 + Client.cycle, var10, var13, var4, var12);
				var36.setDestination(var9, var11, Archive.getTileHeight(var9, var11, class160.Client_plane) - var12, var3 + Client.cycle);
				Client.projectiles.addFirst(var36);
			}

		} else if (class263.field3011 == var0) {
			var2 = var1.readUnsignedByteSub();
			var3 = ((var2 >> 4) & 7) + FriendSystem.field803;
			var4 = (var2 & 7) + class9.field34;
			var5 = var1.readUnsignedByte();
			var6 = var5 >> 2;
			var7 = var5 & 3;
			var8 = Client.field711[var6];
			if ((((var3 >= 0) && (var4 >= 0)) && (var3 < 104)) && (var4 < 104)) {
				class137.updatePendingSpawn(class160.Client_plane, var3, var4, var8, -1, var6, var7, 0, -1);
			}

		} else if (class263.field3006 == var0) {
			var2 = var1.readUnsignedShort();
			var3 = var1.readUnsignedByte();
			var4 = ((var3 >> 4) & 7) + FriendSystem.field803;
			var5 = (var3 & 7) + class9.field34;
			var6 = var1.readUnsignedShortLE();
			var7 = var1.readUnsignedShortLE();
			if ((((var4 >= 0) && (var5 >= 0)) && (var4 < 104)) && (var5 < 104)) {
				NodeDeque var43 = Client.groundItems[class160.Client_plane][var4][var5];
				if (var43 != null) {
					for (TileItem var35 = ((TileItem) (var43.last())); var35 != null; var35 = ((TileItem) (var43.previous()))) {
						if (((var2 & 32767) == var35.id) && (var6 == var35.quantity)) {
							var35.quantity = var7;
							break;
						}
					}

					class162.updateItemPile(var4, var5);
				}
			}

		} else if (class263.field3004 == var0) {
			var2 = var1.readUnsignedShortAdd();
			var3 = var1.readUnsignedByteNeg();
			var4 = var3 >> 2;
			var5 = var3 & 3;
			var6 = Client.field711[var4];
			var7 = var1.readUnsignedByteAdd();
			var8 = ((var7 >> 4) & 7) + FriendSystem.field803;
			var9 = (var7 & 7) + class9.field34;
			if ((((var8 >= 0) && (var9 >= 0)) && (var8 < 103)) && (var9 < 103)) {
				if (var6 == 0) {
					BoundaryObject var34 = FriendSystem.scene.method4150(class160.Client_plane, var8, var9);
					if (var34 != null) {
						var11 = class121.Entity_unpackID(var34.tag);
						if (var4 == 2) {
							var34.renderable1 = new DynamicObject(var11, 2, var5 + 4, class160.Client_plane, var8, var9, var2, false, var34.renderable1);
							var34.renderable2 = new DynamicObject(var11, 2, (var5 + 1) & 3, class160.Client_plane, var8, var9, var2, false, var34.renderable2);
						} else {
							var34.renderable1 = new DynamicObject(var11, var4, var5, class160.Client_plane, var8, var9, var2, false, var34.renderable1);
						}
					}
				}

				if (var6 == 1) {
					WallDecoration var44 = FriendSystem.scene.method4224(class160.Client_plane, var8, var9);
					if (var44 != null) {
						var11 = class121.Entity_unpackID(var44.tag);
						if ((var4 != 4) && (var4 != 5)) {
							if (var4 == 6) {
								var44.renderable1 = new DynamicObject(var11, 4, var5 + 4, class160.Client_plane, var8, var9, var2, false, var44.renderable1);
							} else if (var4 == 7) {
								var44.renderable1 = new DynamicObject(var11, 4, ((var5 + 2) & 3) + 4, class160.Client_plane, var8, var9, var2, false, var44.renderable1);
							} else if (var4 == 8) {
								var44.renderable1 = new DynamicObject(var11, 4, var5 + 4, class160.Client_plane, var8, var9, var2, false, var44.renderable1);
								var44.renderable2 = new DynamicObject(var11, 4, ((var5 + 2) & 3) + 4, class160.Client_plane, var8, var9, var2, false, var44.renderable2);
							}
						} else {
							var44.renderable1 = new DynamicObject(var11, 4, var5, class160.Client_plane, var8, var9, var2, false, var44.renderable1);
						}
					}
				}

				if (var6 == 2) {
					GameObject var45 = FriendSystem.scene.getGameObject(class160.Client_plane, var8, var9);
					if (var4 == 11) {
						var4 = 10;
					}

					if (var45 != null) {
						var45.renderable = new DynamicObject(class121.Entity_unpackID(var45.tag), var4, var5, class160.Client_plane, var8, var9, var2, false, var45.renderable);
					}
				}

				if (var6 == 3) {
					FloorDecoration var46 = FriendSystem.scene.getFloorDecoration(class160.Client_plane, var8, var9);
					if (var46 != null) {
						var46.renderable = new DynamicObject(class121.Entity_unpackID(var46.tag), 22, var5, class160.Client_plane, var8, var9, var2, false, var46.renderable);
					}
				}
			}

		} else {
			if (class263.field3010 == var0) {
				var2 = var1.readUnsignedByteSub();
				var3 = var1.readUnsignedByteAdd();
				var4 = ((var3 >> 4) & 7) + FriendSystem.field803;
				var5 = (var3 & 7) + class9.field34;
				var6 = var1.readUnsignedByteSub();
				var7 = (var6 >> 4) & 15;
				var8 = var6 & 7;
				var9 = var1.readUnsignedShortLE();
				if ((((var4 >= 0) && (var5 >= 0)) && (var4 < 104)) && (var5 < 104)) {
					var10 = var7 + 1;
					if (((((((class19.localPlayer.pathX[0] >= (var4 - var10)) && (class19.localPlayer.pathX[0] <= (var10 + var4))) && (class19.localPlayer.pathY[0] >= (var5 - var10))) && (class19.localPlayer.pathY[0] <= (var10 + var5))) && (Interpreter.clientPreferences.method2286() != 0)) && (var8 > 0)) && (Client.soundEffectCount < 50)) {
						Client.soundEffectIds[Client.soundEffectCount] = var9;
						Client.queuedSoundEffectLoops[Client.soundEffectCount] = var8;
						Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2;
						Client.soundEffects[Client.soundEffectCount] = null;
						Client.soundLocations[Client.soundEffectCount] = (var7 + (var5 << 8)) + (var4 << 16);
						++Client.soundEffectCount;
					}
				}
			}

			TileItem var32;
			if (class263.field3007 == var0) {
				var2 = var1.readUnsignedShortAdd();
				var3 = var1.readUnsignedByte();
				var4 = ((var3 >> 4) & 7) + FriendSystem.field803;
				var5 = (var3 & 7) + class9.field34;
				var6 = var1.readUnsignedShortAdd();
				if ((((var4 >= 0) && (var5 >= 0)) && (var4 < 104)) && (var5 < 104)) {
					var32 = new TileItem();
					var32.id = var2;
					var32.quantity = var6;
					if (Client.groundItems[class160.Client_plane][var4][var5] == null) {
						Client.groundItems[class160.Client_plane][var4][var5] = new NodeDeque();
					}

					Client.groundItems[class160.Client_plane][var4][var5].addFirst(var32);
					class162.updateItemPile(var4, var5);
				}

			} else {
				if (class263.field3009 == var0) {
					byte var37 = var1.readByte();
					var3 = var1.readUnsignedShort();
					byte var38 = var1.readByteAdd();
					byte var39 = var1.readByte();
					var6 = var1.readUnsignedShortAddLE();
					byte var40 = var1.readByteAdd();
					var8 = var1.readUnsignedShortAdd();
					var9 = var1.readUnsignedByteNeg();
					var10 = var9 >> 2;
					var11 = var9 & 3;
					var12 = Client.field711[var10];
					var13 = var1.readUnsignedByteNeg();
					var14 = ((var13 >> 4) & 7) + FriendSystem.field803;
					int var15 = (var13 & 7) + class9.field34;
					int var16 = var1.readUnsignedShortAdd();
					Player var17;
					if (var3 == Client.localPlayerIndex) {
						var17 = class19.localPlayer;
					} else {
						var17 = Client.players[var3];
					}

					if (var17 != null) {
						ObjectComposition var18 = class116.getObjectDefinition(var8);
						int var19;
						int var20;
						if ((var11 != 1) && (var11 != 3)) {
							var19 = var18.sizeX;
							var20 = var18.sizeY;
						} else {
							var19 = var18.sizeY;
							var20 = var18.sizeX;
						}

						int var21 = var14 + (var19 >> 1);
						int var22 = var14 + ((var19 + 1) >> 1);
						int var23 = var15 + (var20 >> 1);
						int var24 = var15 + ((var20 + 1) >> 1);
						int[][] var25 = Tiles.Tiles_heights[class160.Client_plane];
						int var26 = (((var25[var22][var24] + var25[var21][var24]) + var25[var21][var23]) + var25[var22][var23]) >> 2;
						int var27 = (var14 << 7) + (var19 << 6);
						int var28 = (var15 << 7) + (var20 << 6);
						Model var29 = var18.getModel(var10, var11, var25, var27, var26, var28);
						if (var29 != null) {
							class137.updatePendingSpawn(class160.Client_plane, var14, var15, var12, -1, 0, 0, var16 + 1, var6 + 1);
							var17.animationCycleStart = var16 + Client.cycle;
							var17.animationCycleEnd = var6 + Client.cycle;
							var17.model0 = var29;
							var17.field1084 = (var19 * 64) + (var14 * 128);
							var17.field1095 = (var20 * 64) + (var15 * 128);
							var17.tileHeight2 = var26;
							byte var30;
							if (var38 > var40) {
								var30 = var38;
								var38 = var40;
								var40 = var30;
							}

							if (var39 > var37) {
								var30 = var39;
								var39 = var37;
								var37 = var30;
							}

							var17.minX = var14 + var38;
							var17.maxX = var14 + var40;
							var17.minY = var39 + var15;
							var17.maxY = var15 + var37;
						}
					}
				}

				if (class263.field3005 == var0) {
					var2 = var1.readUnsignedByteNeg();
					var3 = var1.readUnsignedShort();
					var4 = var1.readUnsignedShortAddLE();
					var5 = var1.readUnsignedByteAdd();
					var6 = ((var5 >> 4) & 7) + FriendSystem.field803;
					var7 = (var5 & 7) + class9.field34;
					if ((((var6 >= 0) && (var7 >= 0)) && (var6 < 104)) && (var7 < 104)) {
						var6 = (var6 * 128) + 64;
						var7 = (var7 * 128) + 64;
						GraphicsObject var33 = new GraphicsObject(var3, class160.Client_plane, var6, var7, Archive.getTileHeight(var6, var7, class160.Client_plane) - var2, var4, Client.cycle);
						Client.graphicsObjects.addFirst(var33);
					}

				} else if (class263.field3012 == var0) {
					var2 = var1.readUnsignedByteSub();
					var3 = ((var2 >> 4) & 7) + FriendSystem.field803;
					var4 = (var2 & 7) + class9.field34;
					var5 = var1.readUnsignedByteSub();
					var6 = var5 >> 2;
					var7 = var5 & 3;
					var8 = Client.field711[var6];
					var9 = var1.readUnsignedShortAdd();
					if ((((var3 >= 0) && (var4 >= 0)) && (var3 < 104)) && (var4 < 104)) {
						class137.updatePendingSpawn(class160.Client_plane, var3, var4, var8, var9, var6, var7, 0, -1);
					}

				} else if (class263.field3008 == var0) {
					var2 = var1.readUnsignedByteAdd();
					var3 = ((var2 >> 4) & 7) + FriendSystem.field803;
					var4 = (var2 & 7) + class9.field34;
					var5 = var1.readUnsignedShortAdd();
					if ((((var3 >= 0) && (var4 >= 0)) && (var3 < 104)) && (var4 < 104)) {
						NodeDeque var31 = Client.groundItems[class160.Client_plane][var3][var4];
						if (var31 != null) {
							for (var32 = ((TileItem) (var31.last())); var32 != null; var32 = ((TileItem) (var31.previous()))) {
								if ((var5 & 32767) == var32.id) {
									var32.remove();
									break;
								}
							}

							if (var31.last() == null) {
								Client.groundItems[class160.Client_plane][var3][var4] = null;
							}

							class162.updateItemPile(var3, var4);
						}
					}

				}
			}
		}
	}
}