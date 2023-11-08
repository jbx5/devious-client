import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ld")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lld;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1591179597
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("clientPacket")
	ClientPacket clientPacket;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1596400087
	)
	@Export("clientPacketLength")
	int clientPacketLength;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Luo;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1934564091
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300];
		PacketBufferNode_packetBufferNodeCount = 0;
	}

	PacketBufferNode() {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1380070255"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) {
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1877979689"
	)
	public static int method5929(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1854762565"
	)
	static void method5917(boolean var0) {
		if (var0) {
			SecureRandomCallable.method2326();
		} else {
			for (int var1 = 0; var1 < class316.musicSongs.size(); ++var1) {
				MusicSong var2 = (MusicSong)class316.musicSongs.get(var1);
				if (var2 == null) {
					class316.musicSongs.remove(var1);
					--var1;
				} else if (var2.field3526) {
					if (var2.midiPcmStream.field3455 > 0) {
						--var2.midiPcmStream.field3455;
					}

					var2.midiPcmStream.clear();
					var2.midiPcmStream.method6011();
					var2.midiPcmStream.setPcmStreamVolume(0);
					class316.musicSongs.remove(var1);
					--var1;
				} else {
					var2.field3526 = true;
				}
			}
		}

	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)V",
		garbageValue = "-9846"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
			WorldMapSectionType.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3);
		}

		long var4 = -1L;
		long var6 = -1L;

		int var8;
		for (var8 = 0; var8 < class93.method2450(); ++var8) {
			long var25 = ViewportMouse.ViewportMouse_entityTags[var8];
			if (var25 != var6) {
				var6 = var25;
				long var15 = ViewportMouse.ViewportMouse_entityTags[var8];
				int var14 = (int)(var15 >>> 0 & 127L);
				var14 = var14;
				int var29 = GrandExchangeOfferAgeComparator.method7113(var8);
				int var16 = class128.method3081(var8);
				int var17 = class232.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var8]);
				int var18 = var17;
				int var22;
				if (var16 == 2 && class36.scene.getObjectFlags(ItemLayer.Client_plane, var14, var29, var25) >= 0) {
					ObjectComposition var19 = WorldMapSection2.getObjectDefinition(var17);
					if (var19.transforms != null) {
						var19 = var19.transform();
					}

					if (var19 == null) {
						continue;
					}

					PendingSpawn var20 = null;

					for (PendingSpawn var21 = (PendingSpawn)Client.pendingSpawns.last(); var21 != null; var21 = (PendingSpawn)Client.pendingSpawns.previous()) {
						if (var21.plane == ItemLayer.Client_plane && var14 == var21.x && var29 == var21.y && var18 == var21.field1162) {
							var20 = var21;
							break;
						}
					}

					if (Client.isItemSelected == 1) {
						WorldMapSectionType.insertMenuItemNoShift("Use", Client.field767 + " " + "->" + " " + class167.colorStartTag(65535) + var19.name, 1, var18, var14, var29);
					} else if (Client.isSpellSelected) {
						if ((UrlRequest.selectedSpellFlags & 4) == 4) {
							WorldMapSectionType.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class167.colorStartTag(65535) + var19.name, 2, var18, var14, var29);
						}
					} else {
						String[] var37 = var19.actions;
						if (var37 != null) {
							for (var22 = 4; var22 >= 0; --var22) {
								if ((var20 == null || var20.method2455(var22)) && var37[var22] != null) {
									short var23 = 0;
									if (var22 == 0) {
										var23 = 3;
									}

									if (var22 == 1) {
										var23 = 4;
									}

									if (var22 == 2) {
										var23 = 5;
									}

									if (var22 == 3) {
										var23 = 6;
									}

									if (var22 == 4) {
										var23 = 1001;
									}

									WorldMapSectionType.insertMenuItemNoShift(var37[var22], class167.colorStartTag(65535) + var19.name, var23, var18, var14, var29);
								}
							}
						}

						WorldMapSectionType.insertMenuItemNoShift("Examine", class167.colorStartTag(65535) + var19.name, 1002, var19.id, var14, var29);
					}
				}

				int var30;
				Player var31;
				NPC var38;
				int[] var39;
				if (var16 == 1) {
					NPC var33 = Client.npcs[var18];
					if (var33 == null) {
						continue;
					}

					if (var33.definition.size == 1 && (var33.x & 127) == 64 && (var33.y & 127) == 64) {
						for (var30 = 0; var30 < Client.npcCount; ++var30) {
							var38 = Client.npcs[Client.npcIndices[var30]];
							if (var38 != null && var38 != var33 && var38.definition.size == 1 && var38.x == var33.x && var38.y == var33.y) {
								WorldMapLabelSize.addNpcToMenu(var38, Client.npcIndices[var30], var14, var29);
							}
						}

						var30 = Players.Players_count;
						var39 = Players.Players_indices;

						for (var22 = 0; var22 < var30; ++var22) {
							var31 = Client.players[var39[var22]];
							if (var31 != null && var31.x == var33.x && var31.y == var33.y) {
								ArchiveDiskAction.addPlayerToMenu(var31, var39[var22], var14, var29);
							}
						}
					}

					WorldMapLabelSize.addNpcToMenu(var33, var18, var14, var29);
				}

				if (var16 == 0) {
					Player var34 = Client.players[var18];
					if (var34 == null) {
						continue;
					}

					if ((var34.x & 127) == 64 && (var34.y & 127) == 64) {
						for (var30 = 0; var30 < Client.npcCount; ++var30) {
							var38 = Client.npcs[Client.npcIndices[var30]];
							if (var38 != null && var38.definition.size == 1 && var34.x == var38.x && var34.y == var38.y) {
								WorldMapLabelSize.addNpcToMenu(var38, Client.npcIndices[var30], var14, var29);
							}
						}

						var30 = Players.Players_count;
						var39 = Players.Players_indices;

						for (var22 = 0; var22 < var30; ++var22) {
							var31 = Client.players[var39[var22]];
							if (var31 != null && var34 != var31 && var34.x == var31.x && var31.y == var34.y) {
								ArchiveDiskAction.addPlayerToMenu(var31, var39[var22], var14, var29);
							}
						}
					}

					if (var18 != Client.combatTargetPlayerIndex) {
						ArchiveDiskAction.addPlayerToMenu(var34, var18, var14, var29);
					} else {
						var4 = var25;
					}
				}

				if (var16 == 3) {
					NodeDeque var35 = Client.groundItems[ItemLayer.Client_plane][var14][var29];
					if (var35 != null) {
						for (TileItem var36 = (TileItem)var35.first(); var36 != null; var36 = (TileItem)var35.next()) {
							ItemComposition var40 = class214.ItemDefinition_get(var36.id);
							if (Client.isItemSelected == 1) {
								WorldMapSectionType.insertMenuItemNoShift("Use", Client.field767 + " " + "->" + " " + class167.colorStartTag(16748608) + var40.name, 16, var36.id, var14, var29);
							} else if (Client.isSpellSelected) {
								if ((UrlRequest.selectedSpellFlags & 1) == 1) {
									WorldMapSectionType.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class167.colorStartTag(16748608) + var40.name, 17, var36.id, var14, var29);
								}
							} else {
								String[] var32 = var40.groundActions;

								for (int var41 = 4; var41 >= 0; --var41) {
									if (var36.method2755(var41)) {
										if (var32 != null && var32[var41] != null) {
											byte var24 = 0;
											if (var41 == 0) {
												var24 = 18;
											}

											if (var41 == 1) {
												var24 = 19;
											}

											if (var41 == 2) {
												var24 = 20;
											}

											if (var41 == 3) {
												var24 = 21;
											}

											if (var41 == 4) {
												var24 = 22;
											}

											WorldMapSectionType.insertMenuItemNoShift(var32[var41], class167.colorStartTag(16748608) + var40.name, var24, var36.id, var14, var29);
										} else if (var41 == 2) {
											WorldMapSectionType.insertMenuItemNoShift("Take", class167.colorStartTag(16748608) + var40.name, 20, var36.id, var14, var29);
										}
									}
								}

								WorldMapSectionType.insertMenuItemNoShift("Examine", class167.colorStartTag(16748608) + var40.name, 1004, var36.id, var14, var29);
							}
						}
					}
				}
			}
		}

		if (-1L != var4) {
			var8 = (int)(var4 >>> 0 & 127L);
			int var10 = (int)(var4 >>> 7 & 127L);
			Player var12 = Client.players[Client.combatTargetPlayerIndex];
			ArchiveDiskAction.addPlayerToMenu(var12, Client.combatTargetPlayerIndex, var8, var10);
		}

	}

	@ObfuscatedName("oo")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1716534762"
	)
	public static boolean method5925() {
		return Client.clickedWidget != null;
	}
}
