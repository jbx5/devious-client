import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ne")
@Implements("ClanMate")
public class ClanMate extends Buddy {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lni;")

	@Export("friend")
	TriBool friend;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lni;")

	@Export("ignored")
	TriBool ignored;

	ClanMate() {
		this.friend = TriBool.TriBool_unknown;
		this.ignored = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"131518086")

	@Export("clearIsFriend")
	void clearIsFriend() {
		this.friend = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"-1955315992")

	@Export("isFriend")
	public final boolean isFriend() {
		if (this.friend == TriBool.TriBool_unknown) {
			this.fillIsFriend();
		}

		return this.friend == TriBool.TriBool_true;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1874980316")

	@Export("fillIsFriend")
	void fillIsFriend() {
		this.friend = (Decimator.friendSystem.friendsList.contains(super.username)) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(S)V", garbageValue = 
	"-23167")

	@Export("clearIsIgnored")
	void clearIsIgnored() {
		this.ignored = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"(B)Z", garbageValue = 
	"0")

	@Export("isIgnored")
	public final boolean isIgnored() {
		if (this.ignored == TriBool.TriBool_unknown) {
			this.fillIsIgnored();
		}

		return this.ignored == TriBool.TriBool_true;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"374210417")

	@Export("fillIsIgnored")
	void fillIsIgnored() {
		this.ignored = (Decimator.friendSystem.ignoreList.contains(super.username)) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(descriptor = 
	"(Ljp;I)V", garbageValue = 
	"1119895393")

	static final void method6700(class263 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer;
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		if (class263.field3012 == var0) {
			var2 = var1.readUnsignedByteSub();
			var3 = ((var2 >> 4) & 7) + PlayerComposition.field3307;
			var4 = (var2 & 7) + class29.field181;
			var5 = var1.readUnsignedByte();
			var6 = var5 >> 2;
			var7 = var5 & 3;
			var8 = Client.field748[var6];
			if ((((var3 >= 0) && (var4 >= 0)) && (var3 < 104)) && (var4 < 104)) {
				GrandExchangeOfferWorldComparator.updatePendingSpawn(class18.Client_plane, var3, var4, var8, -1, var6, var7, 0, -1);
			}

		} else {
			int var9;
			int var10;
			if (class263.field3006 == var0) {
				var2 = var1.readUnsignedByteSub();
				var3 = var1.readUnsignedByteAdd();
				var4 = ((var3 >> 4) & 7) + PlayerComposition.field3307;
				var5 = (var3 & 7) + class29.field181;
				var6 = var1.readUnsignedByteSub();
				var7 = (var6 >> 4) & 15;
				var8 = var6 & 7;
				var9 = var1.readUnsignedShortLE();
				if ((((var4 >= 0) && (var5 >= 0)) && (var4 < 104)) && (var5 < 104)) {
					var10 = var7 + 1;
					if (((((((GrandExchangeEvents.localPlayer.pathX[0] >= (var4 - var10)) && (GrandExchangeEvents.localPlayer.pathX[0] <= (var10 + var4))) && (GrandExchangeEvents.localPlayer.pathY[0] >= (var5 - var10))) && (GrandExchangeEvents.localPlayer.pathY[0] <= (var10 + var5))) && (class131.clientPreferences.method2270() != 0)) && (var8 > 0)) && (Client.soundEffectCount < 50)) {
						Client.soundEffectIds[Client.soundEffectCount] = var9;
						Client.queuedSoundEffectLoops[Client.soundEffectCount] = var8;
						Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2;
						Client.soundEffects[Client.soundEffectCount] = null;
						Client.soundLocations[Client.soundEffectCount] = (var7 + (var5 << 8)) + (var4 << 16);
						++Client.soundEffectCount;
					}
				}
			}

			TileItem var31;
			if (class263.field3009 == var0) {
				var2 = var1.readUnsignedByteAdd();
				var3 = ((var2 >> 4) & 7) + PlayerComposition.field3307;
				var4 = (var2 & 7) + class29.field181;
				var5 = var1.readUnsignedShortAdd();
				if ((((var3 >= 0) && (var4 >= 0)) && (var3 < 104)) && (var4 < 104)) {
					NodeDeque var36 = Client.groundItems[class18.Client_plane][var3][var4];
					if (var36 != null) {
						for (var31 = ((TileItem) (var36.last())); var31 != null; var31 = ((TileItem) (var36.previous()))) {
							if ((var5 & 32767) == var31.id) {
								var31.remove();
								break;
							}
						}

						if (var36.last() == null) {
							Client.groundItems[class18.Client_plane][var3][var4] = null;
						}

						UserComparator3.updateItemPile(var3, var4);
					}
				}

			} else {
				int var11;
				int var12;
				int var13;
				int var14;
				if (class263.field3004 == var0) {
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
					var12 = Client.field748[var10];
					var13 = var1.readUnsignedByteNeg();
					var14 = ((var13 >> 4) & 7) + PlayerComposition.field3307;
					int var15 = (var13 & 7) + class29.field181;
					int var16 = var1.readUnsignedShortAdd();
					Player var17;
					if (var3 == Client.localPlayerIndex) {
						var17 = GrandExchangeEvents.localPlayer;
					} else {
						var17 = Client.players[var3];
					}

					if (var17 != null) {
						ObjectComposition var18 = class146.getObjectDefinition(var8);
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
						int[][] var25 = Tiles.Tiles_heights[class18.Client_plane];
						int var26 = (((var25[var21][var24] + var25[var22][var23]) + var25[var21][var23]) + var25[var22][var24]) >> 2;
						int var27 = (var14 << 7) + (var19 << 6);
						int var28 = (var15 << 7) + (var20 << 6);
						Model var29 = var18.getModel(var10, var11, var25, var27, var26, var28);
						if (var29 != null) {
							GrandExchangeOfferWorldComparator.updatePendingSpawn(class18.Client_plane, var14, var15, var12, -1, 0, 0, var16 + 1, var6 + 1);
							var17.animationCycleStart = var16 + Client.cycle;
							var17.animationCycleEnd = var6 + Client.cycle;
							var17.model0 = var29;
							var17.field1080 = (var19 * 64) + (var14 * 128);
							var17.field1082 = (var20 * 64) + (var15 * 128);
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

							var17.minX = var38 + var14;
							var17.maxX = var14 + var40;
							var17.minY = var15 + var39;
							var17.maxY = var37 + var15;
						}
					}
				}

				if (class263.field3007 == var0) {
					var2 = var1.readUnsignedShort();
					var3 = var1.readUnsignedByte();
					var4 = ((var3 >> 4) & 7) + PlayerComposition.field3307;
					var5 = (var3 & 7) + class29.field181;
					var6 = var1.readUnsignedShortLE();
					var7 = var1.readUnsignedShortLE();
					if ((((var4 >= 0) && (var5 >= 0)) && (var4 < 104)) && (var5 < 104)) {
						NodeDeque var46 = Client.groundItems[class18.Client_plane][var4][var5];
						if (var46 != null) {
							for (TileItem var35 = ((TileItem) (var46.last())); var35 != null; var35 = ((TileItem) (var46.previous()))) {
								if (((var2 & 32767) == var35.id) && (var6 == var35.quantity)) {
									var35.quantity = var7;
									break;
								}
							}

							UserComparator3.updateItemPile(var4, var5);
						}
					}

				} else if (class263.field3015 == var0) {
					var2 = var1.readUnsignedByteNeg();
					var3 = var1.readUnsignedShort();
					var4 = var1.readUnsignedShortAddLE();
					var5 = var1.readUnsignedByteAdd();
					var6 = ((var5 >> 4) & 7) + PlayerComposition.field3307;
					var7 = (var5 & 7) + class29.field181;
					if ((((var6 >= 0) && (var7 >= 0)) && (var6 < 104)) && (var7 < 104)) {
						var6 = (var6 * 128) + 64;
						var7 = (var7 * 128) + 64;
						GraphicsObject var34 = new GraphicsObject(var3, class18.Client_plane, var6, var7, WorldMapLabel.getTileHeight(var6, var7, class18.Client_plane) - var2, var4, Client.cycle);
						Client.graphicsObjects.addFirst(var34);
					}

				} else if (class263.field3013 == var0) {
					var2 = var1.readUnsignedByteSub();
					var3 = ((var2 >> 4) & 7) + PlayerComposition.field3307;
					var4 = (var2 & 7) + class29.field181;
					var5 = var1.readUnsignedByteSub();
					var6 = var5 >> 2;
					var7 = var5 & 3;
					var8 = Client.field748[var6];
					var9 = var1.readUnsignedShortAdd();
					if ((((var3 >= 0) && (var4 >= 0)) && (var3 < 104)) && (var4 < 104)) {
						GrandExchangeOfferWorldComparator.updatePendingSpawn(class18.Client_plane, var3, var4, var8, var9, var6, var7, 0, -1);
					}

				} else if (class263.field3011 == var0) {
					var2 = var1.readUnsignedByteAdd() * 4;
					var3 = var1.readUnsignedShortAdd();
					var4 = var1.readShortAdd();
					var5 = var1.readUnsignedByteNeg();
					var6 = ((var5 >> 4) & 7) + PlayerComposition.field3307;
					var7 = (var5 & 7) + class29.field181;
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
						Projectile var33 = new Projectile(var14, class18.Client_plane, var6, var7, WorldMapLabel.getTileHeight(var6, var7, class18.Client_plane) - var2, var3 + Client.cycle, var8 + Client.cycle, var10, var13, var4, var12);
						var33.setDestination(var9, var11, WorldMapLabel.getTileHeight(var9, var11, class18.Client_plane) - var12, var3 + Client.cycle);
						Client.projectiles.addFirst(var33);
					}

				} else if (class263.field3005 != var0) {
					if (class263.field3008 == var0) {
						var2 = var1.readUnsignedShortAdd();
						var3 = var1.readUnsignedByte();
						var4 = ((var3 >> 4) & 7) + PlayerComposition.field3307;
						var5 = (var3 & 7) + class29.field181;
						var6 = var1.readUnsignedShortAdd();
						if ((((var4 >= 0) && (var5 >= 0)) && (var4 < 104)) && (var5 < 104)) {
							var31 = new TileItem();
							var31.id = var2;
							var31.quantity = var6;
							if (Client.groundItems[class18.Client_plane][var4][var5] == null) {
								Client.groundItems[class18.Client_plane][var4][var5] = new NodeDeque();
							}

							Client.groundItems[class18.Client_plane][var4][var5].addFirst(var31);
							UserComparator3.updateItemPile(var4, var5);
						}

					}
				} else {
					var2 = var1.readUnsignedShortAdd();
					var3 = var1.readUnsignedByteNeg();
					var4 = var3 >> 2;
					var5 = var3 & 3;
					var6 = Client.field748[var4];
					var7 = var1.readUnsignedByteAdd();
					var8 = ((var7 >> 4) & 7) + PlayerComposition.field3307;
					var9 = (var7 & 7) + class29.field181;
					if ((((var8 >= 0) && (var9 >= 0)) && (var8 < 103)) && (var9 < 103)) {
						if (var6 == 0) {
							BoundaryObject var32 = ArchiveLoader.scene.method4754(class18.Client_plane, var8, var9);
							if (var32 != null) {
								var11 = FileSystem.Entity_unpackID(var32.tag);
								if (var4 == 2) {
									var32.renderable1 = new DynamicObject(var11, 2, var5 + 4, class18.Client_plane, var8, var9, var2, false, var32.renderable1);
									var32.renderable2 = new DynamicObject(var11, 2, (var5 + 1) & 3, class18.Client_plane, var8, var9, var2, false, var32.renderable2);
								} else {
									var32.renderable1 = new DynamicObject(var11, var4, var5, class18.Client_plane, var8, var9, var2, false, var32.renderable1);
								}
							}
						}

						if (var6 == 1) {
							WallDecoration var43 = ArchiveLoader.scene.method4860(class18.Client_plane, var8, var9);
							if (var43 != null) {
								var11 = FileSystem.Entity_unpackID(var43.tag);
								if ((var4 != 4) && (var4 != 5)) {
									if (var4 == 6) {
										var43.renderable1 = new DynamicObject(var11, 4, var5 + 4, class18.Client_plane, var8, var9, var2, false, var43.renderable1);
									} else if (var4 == 7) {
										var43.renderable1 = new DynamicObject(var11, 4, ((var5 + 2) & 3) + 4, class18.Client_plane, var8, var9, var2, false, var43.renderable1);
									} else if (var4 == 8) {
										var43.renderable1 = new DynamicObject(var11, 4, var5 + 4, class18.Client_plane, var8, var9, var2, false, var43.renderable1);
										var43.renderable2 = new DynamicObject(var11, 4, ((var5 + 2) & 3) + 4, class18.Client_plane, var8, var9, var2, false, var43.renderable2);
									}
								} else {
									var43.renderable1 = new DynamicObject(var11, 4, var5, class18.Client_plane, var8, var9, var2, false, var43.renderable1);
								}
							}
						}

						if (var6 == 2) {
							GameObject var44 = ArchiveLoader.scene.getGameObject(class18.Client_plane, var8, var9);
							if (var4 == 11) {
								var4 = 10;
							}

							if (var44 != null) {
								var44.renderable = new DynamicObject(FileSystem.Entity_unpackID(var44.tag), var4, var5, class18.Client_plane, var8, var9, var2, false, var44.renderable);
							}
						}

						if (var6 == 3) {
							FloorDecoration var45 = ArchiveLoader.scene.getFloorDecoration(class18.Client_plane, var8, var9);
							if (var45 != null) {
								var45.renderable = new DynamicObject(FileSystem.Entity_unpackID(var45.tag), 22, var5, class18.Client_plane, var8, var9, var2, false, var45.renderable);
							}
						}
					}

				}
			}
		}
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(descriptor = 
	"(IIIIB)V", garbageValue = 
	"83")

	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if ((Client.isItemSelected == 0) && (!Client.isSpellSelected)) {
			class21.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3);
		}

		long var4 = -1L;
		long var6 = -1L;

		int var8;
		for (var8 = 0; var8 < StructComposition.method3618(); ++var8) {
			long var25 = ViewportMouse.ViewportMouse_entityTags[var8];
			if (var25 != var6) {
				var6 = var25;
				int var13 = World.method1673(var8);
				long var16 = ViewportMouse.ViewportMouse_entityTags[var8];
				int var15 = ((int) ((var16 >>> 7) & 127L));
				var15 = var15;
				int var29 = FloorDecoration.method4592(ViewportMouse.ViewportMouse_entityTags[var8]);
				int var18 = Frames.method4934(var8);
				if ((var29 == 2) && (ArchiveLoader.scene.getObjectFlags(class18.Client_plane, var13, var15, var25) >= 0)) {
					ObjectComposition var19 = class146.getObjectDefinition(var18);
					if (var19.transforms != null) {
						var19 = var19.transform();
					}

					if (var19 == null) {
						continue;
					}

					if (Client.isItemSelected == 1) {
						class21.insertMenuItemNoShift("Use", ((((Client.selectedItemName + " ") + "->") + " ") + UserComparator9.colorStartTag(65535)) + var19.name, 1, var18, var13, var15);
					} else if (Client.isSpellSelected) {
						if ((class17.selectedSpellFlags & 4) == 4) {
							class21.insertMenuItemNoShift(Client.selectedSpellActionName, ((((Client.selectedSpellName + " ") + "->") + " ") + UserComparator9.colorStartTag(65535)) + var19.name, 2, var18, var13, var15);
						}
					} else {
						String[] var20 = var19.actions;
						if (var20 != null) {
							for (int var21 = 4; var21 >= 0; --var21) {
								if (var20[var21] != null) {
									short var22 = 0;
									if (var21 == 0) {
										var22 = 3;
									}

									if (var21 == 1) {
										var22 = 4;
									}

									if (var21 == 2) {
										var22 = 5;
									}

									if (var21 == 3) {
										var22 = 6;
									}

									if (var21 == 4) {
										var22 = 1001;
									}

									class21.insertMenuItemNoShift(var20[var21], UserComparator9.colorStartTag(65535) + var19.name, var22, var18, var13, var15);
								}
							}
						}

						class21.insertMenuItemNoShift("Examine", UserComparator9.colorStartTag(65535) + var19.name, 1002, var19.id, var13, var15);
					}
				}

				Player var23;
				int var30;
				NPC var31;
				int var38;
				int[] var39;
				if (var29 == 1) {
					NPC var34 = Client.npcs[var18];
					if (var34 == null) {
						continue;
					}

					if (((var34.definition.size == 1) && ((var34.x & 127) == 64)) && ((var34.y & 127) == 64)) {
						for (var30 = 0; var30 < Client.npcCount; ++var30) {
							var31 = Client.npcs[Client.npcIndices[var30]];
							if (((((var31 != null) && (var31 != var34)) && (var31.definition.size == 1)) && (var31.x == var34.x)) && (var31.y == var34.y)) {
								class12.addNpcToMenu(var31, Client.npcIndices[var30], var13, var15);
							}
						}

						var30 = Players.Players_count;
						var39 = Players.Players_indices;

						for (var38 = 0; var38 < var30; ++var38) {
							var23 = Client.players[var39[var38]];
							if (((var23 != null) && (var23.x == var34.x)) && (var34.y == var23.y)) {
								class20.addPlayerToMenu(var23, var39[var38], var13, var15);
							}
						}
					}

					class12.addNpcToMenu(var34, var18, var13, var15);
				}

				if (var29 == 0) {
					Player var35 = Client.players[var18];
					if (var35 == null) {
						continue;
					}

					if (((var35.x & 127) == 64) && ((var35.y & 127) == 64)) {
						for (var30 = 0; var30 < Client.npcCount; ++var30) {
							var31 = Client.npcs[Client.npcIndices[var30]];
							if ((((var31 != null) && (var31.definition.size == 1)) && (var31.x == var35.x)) && (var35.y == var31.y)) {
								class12.addNpcToMenu(var31, Client.npcIndices[var30], var13, var15);
							}
						}

						var30 = Players.Players_count;
						var39 = Players.Players_indices;

						for (var38 = 0; var38 < var30; ++var38) {
							var23 = Client.players[var39[var38]];
							if ((((var23 != null) && (var35 != var23)) && (var23.x == var35.x)) && (var35.y == var23.y)) {
								class20.addPlayerToMenu(var23, var39[var38], var13, var15);
							}
						}
					}

					if (var18 != Client.combatTargetPlayerIndex) {
						class20.addPlayerToMenu(var35, var18, var13, var15);
					} else {
						var4 = var25;
					}
				}

				if (var29 == 3) {
					NodeDeque var37 = Client.groundItems[class18.Client_plane][var13][var15];
					if (var37 != null) {
						for (TileItem var36 = ((TileItem) (var37.first())); var36 != null; var36 = ((TileItem) (var37.next()))) {
							ItemComposition var40 = class19.ItemDefinition_get(var36.id);
							if (Client.isItemSelected == 1) {
								class21.insertMenuItemNoShift("Use", ((((Client.selectedItemName + " ") + "->") + " ") + UserComparator9.colorStartTag(16748608)) + var40.name, 16, var36.id, var13, var15);
							} else if (Client.isSpellSelected) {
								if ((class17.selectedSpellFlags & 1) == 1) {
									class21.insertMenuItemNoShift(Client.selectedSpellActionName, ((((Client.selectedSpellName + " ") + "->") + " ") + UserComparator9.colorStartTag(16748608)) + var40.name, 17, var36.id, var13, var15);
								}
							} else {
								String[] var32 = var40.groundActions;

								for (int var33 = 4; var33 >= 0; --var33) {
									if ((var32 != null) && (var32[var33] != null)) {
										byte var24 = 0;
										if (var33 == 0) {
											var24 = 18;
										}

										if (var33 == 1) {
											var24 = 19;
										}

										if (var33 == 2) {
											var24 = 20;
										}

										if (var33 == 3) {
											var24 = 21;
										}

										if (var33 == 4) {
											var24 = 22;
										}

										class21.insertMenuItemNoShift(var32[var33], UserComparator9.colorStartTag(16748608) + var40.name, var24, var36.id, var13, var15);
									} else if (var33 == 2) {
										class21.insertMenuItemNoShift("Take", UserComparator9.colorStartTag(16748608) + var40.name, 20, var36.id, var13, var15);
									}
								}

								class21.insertMenuItemNoShift("Examine", UserComparator9.colorStartTag(16748608) + var40.name, 1004, var36.id, var13, var15);
							}
						}
					}
				}
			}
		}

		if ((-1L) != var4) {
			var8 = ((int) ((var4 >>> 0) & 127L));
			int var10 = ((int) ((var4 >>> 7) & 127L));
			Player var12 = Client.players[Client.combatTargetPlayerIndex];
			class20.addPlayerToMenu(var12, Client.combatTargetPlayerIndex, var8, var10);
		}

	}
}