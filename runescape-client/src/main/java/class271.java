import java.io.IOException;
import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("kx")
public class class271 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	static final class271 field3010;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	static final class271 field3006;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	static final class271 field3007;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	static final class271 field3005;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	static final class271 field3009;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	static final class271 field3011;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	static final class271 field3008;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lkx;"
	)
	static final class271[] field3015;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 369639135
	)
	final int field3012;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1458469399
	)
	final int field3013;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 756967091
	)
	final int field3014;

	static {
		field3010 = new class271(1, 8, 8);
		field3006 = new class271(6, 16, 16);
		field3007 = new class271(2, 32, 32);
		field3005 = new class271(0, 48, 48);
		field3009 = new class271(4, 64, 64);
		field3011 = new class271(3, 96, 96);
		field3008 = new class271(5, 128, 128);
		field3015 = class47.method895();
		Arrays.sort(field3015, new class279());
	}

	class271(int var1, int var2, int var3) {
		this.field3012 = var1;
		this.field3013 = var2;
		this.field3014 = var3;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-58"
	)
	int method5638() {
		return this.field3013 * this.field3014;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lpo;Ljava/lang/String;Ljava/lang/String;S)[Lvv;",
		garbageValue = "-19919"
	)
	public static SpritePixels[] method5642(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			return BuddyRankComparator.method3234(var0, var3, var4);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "876561148"
	)
	static final boolean method5639() {
		return ViewportMouse.ViewportMouse_isInViewport;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "-1532125529"
	)
	static int method5645(int var0, Script var1, boolean var2) {
		Widget var3 = TaskHandler.widgetDefinition.method6841(Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETX) {
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETY) {
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) {
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) {
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) {
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1662870484"
	)
	static final void method5644(boolean var0) {
		GrandExchangeOffer.method7712();
		++Client.packetWriter.pendingWrites;
		if (Client.packetWriter.pendingWrites >= 50 || var0) {
			Client.packetWriter.pendingWrites = 0;
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) {
				PacketBufferNode var1 = class141.getPacketBufferNode(ClientPacket.NO_TIMEOUT, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var1);

				try {
					Client.packetWriter.flush();
				} catch (IOException var3) {
					Client.hadNetworkError = true;
				}
			}

		}
	}

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-329066369"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
			Projection.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3);
		}

		long var4 = -1L;
		int var6 = 0;
		long var7 = -1L;

		int var9;
		for (var9 = 0; var9 < AsyncRestClient.method174(); ++var9) {
			long var32 = ViewportMouse.ViewportMouse_entityTags[var9];
			if (var32 != var7) {
				var7 = var32;
				int var14 = class141.method3380(ViewportMouse.ViewportMouse_entityTags[var9]);
				int var15 = var14;
				int var16 = UserComparator7.method3190(ViewportMouse.ViewportMouse_entityTags[var9]);
				int var17 = var16;
				int var18 = class272.method5654(var9);
				int var19 = class213.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var9]);
				int var20 = var19;
				int var21 = StructComposition.method4125(var9);
				if (var21 == 2047) {
					var21 = -1;
				}

				WorldEntity var22 = null;
				WorldView var23 = null;
				if (var21 >= 0 && ClientPreferences.topLevelWorldView.worldEntities[var21] != null) {
					var22 = ClientPreferences.topLevelWorldView.worldEntities[var21];
					var23 = var22.worldView;
				} else if (var21 == -1) {
					var22 = null;
					var23 = ClientPreferences.topLevelWorldView;
				}

				if (var23 != null) {
					int var25 = -1;
					if (var21 == HealthBarUpdate.field1304) {
						var25 = var23.plane;
					} else if (HealthBarUpdate.field1304 == -1) {
						var25 = var22.field5006;
					} else {
						WorldEntity var26 = ClientPreferences.topLevelWorldView.worldEntities[HealthBarUpdate.field1304];
						WorldView var27 = var26.worldView;
						if (var27.plane == var26.field5006) {
							if (var21 == -1) {
								var25 = ClientPreferences.topLevelWorldView.worldEntities[HealthBarUpdate.field1304].getPlane();
							} else {
								var25 = var22.field5006;
							}
						}
					}

					var25 = var25;
					if (var25 != -1) {
						int var29;
						if (var18 == 2 && var23.scene.getObjectFlags(var25, var14, var16, var32) >= 0) {
							ObjectComposition var37 = class273.getObjectDefinition(var19);
							if (var37.transforms != null) {
								var37 = var37.transform();
							}

							if (var37 == null) {
								continue;
							}

							PendingSpawn var39 = null;

							for (PendingSpawn var28 = (PendingSpawn)var23.pendingSpawns.last(); var28 != null; var28 = (PendingSpawn)var23.pendingSpawns.previous()) {
								if (var25 == var28.plane && var15 == var28.x && var17 == var28.y && var20 == var28.field1215) {
									var39 = var28;
									break;
								}
							}

							if (!class77.field941 && Client.isItemSelected == 1) {
								SoundCache.insertMenuItem("Use", Client.field674 + " " + "->" + " " + HttpMethod.colorStartTag(65535) + var37.name, 1, var20, var15, var17, -1, false, var21);
							} else if (Client.isSpellSelected) {
								if (!class77.field941 && (class320.selectedSpellFlags & 4) == 4) {
									SoundCache.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + HttpMethod.colorStartTag(65535) + var37.name, 2, var20, var15, var17, -1, false, var21);
								}
							} else {
								String[] var43 = var37.actions;
								if (var43 != null) {
									for (var29 = 4; var29 >= 0; --var29) {
										if (!class77.field941 && (var39 == null || var39.method2629(var29)) && var43[var29] != null) {
											short var30 = 0;
											if (var29 == 0) {
												var30 = 3;
											}

											if (var29 == 1) {
												var30 = 4;
											}

											if (var29 == 2) {
												var30 = 5;
											}

											if (var29 == 3) {
												var30 = 6;
											}

											if (var29 == 4) {
												var30 = 1001;
											}

											SoundCache.insertMenuItem(var43[var29], HttpMethod.colorStartTag(65535) + var37.name, var30, var20, var15, var17, -1, false, var21);
										}
									}
								}

								SoundCache.insertMenuItem("Examine", HttpMethod.colorStartTag(65535) + var37.name, 1002, var37.id, var15, var17, -1, false, var21);
							}
						}

						int var34;
						Player var35;
						NPC var44;
						int[] var45;
						if (var18 == 1) {
							NPC var38 = var23.npcs[var20];
							if (var38 == null) {
								continue;
							}

							if (var38.definition.size == 1 && (var38.x & 127) == 64 && (var38.y & 127) == 64) {
								for (var34 = 0; var34 < var23.npcCount; ++var34) {
									var44 = var23.npcs[var23.npcIndices[var34]];
									if (var44 != null && var38 != var44 && var44.definition.size == 1 && var38.x == var44.x && var44.y == var38.y) {
										DevicePcmPlayerProvider.addNpcToMenu(var44, var23.npcIndices[var34], var15, var17, var21);
									}
								}

								var34 = Client.playerUpdateManager.playerCount;
								var45 = Client.playerUpdateManager.playerIndices;

								for (var29 = 0; var29 < var34; ++var29) {
									var35 = var23.players[var45[var29]];
									if (var35 != null && var35.x == var38.x && var35.y == var38.y) {
										class275.addPlayerToMenu(var35, var45[var29], var15, var17, var21);
									}
								}
							}

							DevicePcmPlayerProvider.addNpcToMenu(var38, var20, var15, var17, var21);
						}

						if (var18 == 0) {
							Player var40 = var23.players[var20];
							if (var40 == null) {
								continue;
							}

							if ((var40.x & 127) == 64 && (var40.y & 127) == 64) {
								for (var34 = 0; var34 < var23.npcCount; ++var34) {
									var44 = var23.npcs[var23.npcIndices[var34]];
									if (var44 != null && var44.definition.size == 1 && var40.x == var44.x && var44.y == var40.y) {
										DevicePcmPlayerProvider.addNpcToMenu(var44, var23.npcIndices[var34], var15, var17, var21);
									}
								}

								var34 = Client.playerUpdateManager.playerCount;
								var45 = Client.playerUpdateManager.playerIndices;

								for (var29 = 0; var29 < var34; ++var29) {
									var35 = var23.players[var45[var29]];
									if (var35 != null && var35 != var40 && var40.x == var35.x && var40.y == var35.y) {
										class275.addPlayerToMenu(var35, var45[var29], var15, var17, var21);
									}
								}
							}

							if (var20 != Client.combatTargetPlayerIndex) {
								class275.addPlayerToMenu(var40, var20, var15, var17, var21);
							} else {
								var4 = var32;
								var6 = var21;
							}
						}

						if (var18 == 3) {
							NodeDeque var41 = var23.groundItems[var25][var15][var17];
							if (var41 != null) {
								for (TileItem var42 = (TileItem)var41.first(); var42 != null; var42 = (TileItem)var41.next()) {
									ItemComposition var46 = MouseRecorder.ItemDefinition_get(var42.id);
									if (!class73.field893 && Client.isItemSelected == 1) {
										SoundCache.insertMenuItem("Use", Client.field674 + " " + "->" + " " + HttpMethod.colorStartTag(16748608) + var46.name, 16, var42.id, var15, var17, -1, false, var21);
									} else if (Client.isSpellSelected) {
										if (!class73.field893 && (class320.selectedSpellFlags & 1) == 1) {
											SoundCache.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + HttpMethod.colorStartTag(16748608) + var46.name, 17, var42.id, var15, var17, -1, false, var21);
										}
									} else {
										String[] var36 = var46.groundActions;

										for (int var47 = 4; var47 >= 0; --var47) {
											if (!class73.field893 && var42.method2980(var47)) {
												if (var36 != null && var36[var47] != null) {
													byte var31 = 0;
													if (var47 == 0) {
														var31 = 18;
													}

													if (var47 == 1) {
														var31 = 19;
													}

													if (var47 == 2) {
														var31 = 20;
													}

													if (var47 == 3) {
														var31 = 21;
													}

													if (var47 == 4) {
														var31 = 22;
													}

													SoundCache.insertMenuItem(var36[var47], HttpMethod.colorStartTag(16748608) + var46.name, var31, var42.id, var15, var17, -1, false, var21);
												} else if (var47 == 2) {
													SoundCache.insertMenuItem("Take", HttpMethod.colorStartTag(16748608) + var46.name, 20, var42.id, var15, var17, -1, false, var21);
												}
											}
										}

										SoundCache.insertMenuItem("Examine", HttpMethod.colorStartTag(16748608) + var46.name, 1004, var42.id, var15, var17, -1, false, var21);
									}
								}
							}
						}
					}
				}
			}
		}

		if (-1L != var4) {
			var9 = class141.method3380(var4);
			int var10 = UserComparator7.method3190(var4);
			Player var11 = ClientPreferences.topLevelWorldView.players[Client.combatTargetPlayerIndex];
			class275.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var9, var10, var6);
		}

	}
}
