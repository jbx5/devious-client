import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("po")
public class class414 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	class410 field4575;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1185274461
	)
	int field4572;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1184796903
	)
	int field4577;

	@ObfuscatedSignature(
		descriptor = "(Lpx;II)V"
	)
	class414(class410 var1, int var2, int var3) {
		this.field4572 = 0;
		this.field4577 = 0;
		this.field4575 = var1;
		this.field4572 = var2;
		this.field4577 = var3;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2110295444"
	)
	public String method7883() {
		if (this.method7882()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method7895());

			for (int var2 = this.field4572; var2 < this.field4577; ++var2) {
				class412 var3 = this.field4575.method7603(var2);
				var1.append(var3.field4545);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-109"
	)
	boolean method7881(int var1) {
		return this.field4575.method7699() == 2 || this.field4575.method7699() == 1 && (!this.field4575.field4538 || this.field4577 - 1 != var1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "4"
	)
	public boolean method7882() {
		return this.field4572 == this.field4577;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public int method7895() {
		return this.field4577 - this.field4572;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lpc;I)Z",
		garbageValue = "906618451"
	)
	boolean method7884(class412 var1) {
		if (this.field4575.field4528 == 2) {
			return true;
		} else if (this.field4575.field4528 == 0) {
			return false;
		} else {
			return this.field4575.method7604() != var1;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1764486864"
	)
	int method7885() {
		if (this.method7882()) {
			return 0;
		} else {
			class412 var1 = this.field4575.method7603(this.field4577 - 1);
			if (var1.field4545 == '\n') {
				return 0;
			} else if (this.method7884(var1)) {
				return this.field4575.field4529.advances[42];
			} else {
				int var2 = this.field4575.field4529.advances[var1.field4545];
				if (var2 == 0) {
					return var1.field4545 == '\t' ? this.field4575.field4529.advances[32] * 3 : this.field4575.field4529.advances[32];
				} else {
					return var2;
				}
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Ltg;",
		garbageValue = "-1070745654"
	)
	public class501 method7886() {
		if (this.method7882()) {
			return new class501(0, 0);
		} else {
			class412 var1 = this.field4575.method7603(this.field4577 - 1);
			return new class501(var1.field4544 + this.method7885(), var1.field4546);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Lpc;",
		garbageValue = "2023584422"
	)
	public class412 method7902(int var1) {
		return var1 >= 0 && var1 < this.method7895() ? this.field4575.method7603(this.field4572 + var1) : null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Z",
		garbageValue = "2022025665"
	)
	static boolean method7910(String var0, int var1) {
		return class28.method428(var0, var1, "openjs");
	}

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)V",
		garbageValue = "13540"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
			class385.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3);
		}

		long var4 = -1L;
		long var6 = -1L;

		int var8;
		for (var8 = 0; var8 < class407.method7558(); ++var8) {
			long var25 = ViewportMouse.ViewportMouse_entityTags[var8];
			if (var6 != var25) {
				var6 = var25;
				long var15 = ViewportMouse.ViewportMouse_entityTags[var8];
				int var14 = (int)(var15 >>> 0 & 127L);
				var14 = var14;
				int var29 = class93.method2439(var8);
				int var16 = SequenceDefinition.method4123(ViewportMouse.ViewportMouse_entityTags[var8]);
				int var18 = class156.method3433(var8);
				int var22;
				if (var16 == 2 && GrandExchangeOfferOwnWorldComparator.scene.getObjectFlags(SecureUrlRequester.Client_plane, var14, var29, var25) >= 0) {
					ObjectComposition var19 = class137.getObjectDefinition(var18);
					if (var19.transforms != null) {
						var19 = var19.transform();
					}

					if (var19 == null) {
						continue;
					}

					PendingSpawn var20 = null;

					for (PendingSpawn var21 = (PendingSpawn)Client.pendingSpawns.last(); var21 != null; var21 = (PendingSpawn)Client.pendingSpawns.previous()) {
						if (var21.plane == SecureUrlRequester.Client_plane && var14 == var21.x && var29 == var21.y && var18 == var21.field1164) {
							var20 = var21;
							break;
						}
					}

					if (Client.isItemSelected == 1) {
						class385.insertMenuItemNoShift("Use", Client.field664 + " " + "->" + " " + class208.colorStartTag(65535) + var19.name, 1, var18, var14, var29);
					} else if (Client.isSpellSelected) {
						if ((class60.selectedSpellFlags & 4) == 4) {
							class385.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class208.colorStartTag(65535) + var19.name, 2, var18, var14, var29);
						}
					} else {
						String[] var37 = var19.actions;
						if (var37 != null) {
							for (var22 = 4; var22 >= 0; --var22) {
								if ((var20 == null || var20.method2442(var22)) && var37[var22] != null) {
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

									class385.insertMenuItemNoShift(var37[var22], class208.colorStartTag(65535) + var19.name, var23, var18, var14, var29);
								}
							}
						}

						class385.insertMenuItemNoShift("Examine", class208.colorStartTag(65535) + var19.name, 1002, var19.id, var14, var29);
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
							if (var38 != null && var33 != var38 && var38.definition.size == 1 && var38.x == var33.x && var38.y == var33.y) {
								class133.addNpcToMenu(var38, Client.npcIndices[var30], var14, var29);
							}
						}

						var30 = Players.Players_count;
						var39 = Players.Players_indices;

						for (var22 = 0; var22 < var30; ++var22) {
							var31 = Client.players[var39[var22]];
							if (var31 != null && var31.x == var33.x && var33.y == var31.y) {
								HttpHeaders.addPlayerToMenu(var31, var39[var22], var14, var29);
							}
						}
					}

					class133.addNpcToMenu(var33, var18, var14, var29);
				}

				if (var16 == 0) {
					Player var34 = Client.players[var18];
					if (var34 == null) {
						continue;
					}

					if ((var34.x & 127) == 64 && (var34.y & 127) == 64) {
						for (var30 = 0; var30 < Client.npcCount; ++var30) {
							var38 = Client.npcs[Client.npcIndices[var30]];
							if (var38 != null && var38.definition.size == 1 && var38.x == var34.x && var38.y == var34.y) {
								class133.addNpcToMenu(var38, Client.npcIndices[var30], var14, var29);
							}
						}

						var30 = Players.Players_count;
						var39 = Players.Players_indices;

						for (var22 = 0; var22 < var30; ++var22) {
							var31 = Client.players[var39[var22]];
							if (var31 != null && var34 != var31 && var34.x == var31.x && var31.y == var34.y) {
								HttpHeaders.addPlayerToMenu(var31, var39[var22], var14, var29);
							}
						}
					}

					if (var18 != Client.combatTargetPlayerIndex) {
						HttpHeaders.addPlayerToMenu(var34, var18, var14, var29);
					} else {
						var4 = var25;
					}
				}

				if (var16 == 3) {
					NodeDeque var35 = Client.groundItems[SecureUrlRequester.Client_plane][var14][var29];
					if (var35 != null) {
						for (TileItem var36 = (TileItem)var35.first(); var36 != null; var36 = (TileItem)var35.next()) {
							ItemComposition var40 = class341.ItemDefinition_get(var36.id);
							if (Client.isItemSelected == 1) {
								class385.insertMenuItemNoShift("Use", Client.field664 + " " + "->" + " " + class208.colorStartTag(16748608) + var40.name, 16, var36.id, var14, var29);
							} else if (Client.isSpellSelected) {
								if ((class60.selectedSpellFlags & 1) == 1) {
									class385.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class208.colorStartTag(16748608) + var40.name, 17, var36.id, var14, var29);
								}
							} else {
								String[] var32 = var40.groundActions;

								for (int var41 = 4; var41 >= 0; --var41) {
									if (var36.method2751(var41)) {
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

											class385.insertMenuItemNoShift(var32[var41], class208.colorStartTag(16748608) + var40.name, var24, var36.id, var14, var29);
										} else if (var41 == 2) {
											class385.insertMenuItemNoShift("Take", class208.colorStartTag(16748608) + var40.name, 20, var36.id, var14, var29);
										}
									}
								}

								class385.insertMenuItemNoShift("Examine", class208.colorStartTag(16748608) + var40.name, 1004, var36.id, var14, var29);
							}
						}
					}
				}
			}
		}

		if (var4 != -1L) {
			var8 = (int)(var4 >>> 0 & 127L);
			int var10 = class135.method3149(var4);
			Player var11 = Client.players[Client.combatTargetPlayerIndex];
			HttpHeaders.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var10);
		}

	}
}
