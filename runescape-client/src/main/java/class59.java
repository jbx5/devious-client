import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
public class class59 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lbu;"
	)
	VorbisFloor field452;
	@ObfuscatedName("ay")
	boolean field451;
	@ObfuscatedName("ar")
	int[] field450;
	@ObfuscatedName("am")
	int[] field453;
	@ObfuscatedName("as")
	boolean[] field454;

	@ObfuscatedSignature(
		descriptor = "(Lbu;Z[I[I[Z)V"
	)
	class59(VorbisFloor var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
		this.field452 = var1;
		this.field451 = var2;
		this.field450 = var3;
		this.field453 = var4;
		this.field454 = var5;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([FIS)V",
		garbageValue = "-3681"
	)
	void method1169(float[] var1, int var2) {
		int var3 = this.field452.field293.length;
		VorbisFloor var10000 = this.field452;
		int var4 = VorbisFloor.field294[this.field452.multiplier - 1];
		boolean[] var5 = this.field454;
		this.field454[1] = true;
		var5[0] = true;

		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		for (var6 = 2; var6 < var3; ++var6) {
			var7 = this.field452.method768(this.field450, var6);
			var8 = this.field452.method764(this.field450, var6);
			var9 = this.field452.method763(this.field450[var7], this.field453[var7], this.field450[var8], this.field453[var8], this.field450[var6]);
			var10 = this.field453[var6];
			int var11 = var4 - var9;
			int var13 = (var11 < var9 ? var11 : var9) << 1;
			if (var10 != 0) {
				boolean[] var14 = this.field454;
				this.field454[var8] = true;
				var14[var7] = true;
				this.field454[var6] = true;
				if (var10 >= var13) {
					this.field453[var6] = var11 > var9 ? var9 + (var10 - var9) : var11 + (var9 - var10) - 1;
				} else {
					this.field453[var6] = (var10 & 1) != 0 ? var9 - (var10 + 1) / 2 : var10 / 2 + var9;
				}
			} else {
				this.field454[var6] = false;
				this.field453[var6] = var9;
			}
		}

		this.VarbisFloor_sort(0, var3 - 1);
		var6 = 0;
		var7 = this.field452.multiplier * this.field453[0];

		for (var8 = 1; var8 < var3; ++var8) {
			if (this.field454[var8]) {
				var9 = this.field450[var8];
				var10 = this.field452.multiplier * this.field453[var8];
				this.field452.method766(var6, var7, var9, var10, var1, var2);
				if (var9 >= var2) {
					return;
				}

				var6 = var9;
				var7 = var10;
			}
		}

		var10000 = this.field452;
		float var16 = VorbisFloor.VorbisFloor_decibelStatics[var7];

		for (var9 = var6; var9 < var2; ++var9) {
			var1[var9] *= var16;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "4"
	)
	boolean method1173() {
		return this.field451;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-48"
	)
	@Export("VarbisFloor_sort")
	void VarbisFloor_sort(int var1, int var2) {
		if (var1 < var2) {
			int var3 = var1;
			int var4 = this.field450[var1];
			int var5 = this.field453[var1];
			boolean var6 = this.field454[var1];

			for (int var7 = var1 + 1; var7 <= var2; ++var7) {
				int var8 = this.field450[var7];
				if (var8 < var4) {
					this.field450[var3] = var8;
					this.field453[var3] = this.field453[var7];
					this.field454[var3] = this.field454[var7];
					++var3;
					this.field450[var7] = this.field450[var3];
					this.field453[var7] = this.field453[var3];
					this.field454[var7] = this.field454[var3];
				}
			}

			this.field450[var3] = var4;
			this.field453[var3] = var5;
			this.field454[var3] = var6;
			this.VarbisFloor_sort(var1, var3 - 1);
			this.VarbisFloor_sort(var3 + 1, var2);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-937523976"
	)
	static void method1175(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			var1.remove();
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-740402565"
	)
	public static void method1181() {
		Widget.Widget_cachedSprites.clear();
		Widget.Widget_cachedModels.clear();
		Widget.Widget_cachedFonts.clear();
		Widget.Widget_cachedSpriteMasks.clear();
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "26"
	)
	static final int method1178() {
		return Client.menuOptionsCount - 1;
	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1812783002"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
			JagexCache.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3);
		}

		long var4 = -1L;
		long var6 = -1L;

		int var8;
		for (var8 = 0; var8 < class467.method8426(); ++var8) {
			long var26 = ViewportMouse.ViewportMouse_entityTags[var8];
			if (var6 != var26) {
				var6 = var26;
				int var13 = class365.method6912(var8);
				int var14 = class197.method3772(ViewportMouse.ViewportMouse_entityTags[var8]);
				int var15 = var14;
				int var16 = class6.method44(ViewportMouse.ViewportMouse_entityTags[var8]);
				int var18 = class458.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var8]);
				int var19 = var18;
				int var23;
				if (var16 == 2 && UserComparator5.scene.getObjectFlags(class36.Client_plane, var13, var14, var26) >= 0) {
					ObjectComposition var20 = class90.getObjectDefinition(var18);
					if (var20.transforms != null) {
						var20 = var20.transform();
					}

					if (var20 == null) {
						continue;
					}

					PendingSpawn var21 = null;

					for (PendingSpawn var22 = (PendingSpawn)Client.pendingSpawns.last(); var22 != null; var22 = (PendingSpawn)Client.pendingSpawns.previous()) {
						if (var22.plane == class36.Client_plane && var13 == var22.x && var15 == var22.y && var19 == var22.field1173) {
							var21 = var22;
							break;
						}
					}

					if (Client.isItemSelected == 1) {
						JagexCache.insertMenuItemNoShift("Use", Client.field557 + " " + "->" + " " + MusicPatchPcmStream.colorStartTag(65535) + var20.name, 1, var19, var13, var15);
					} else if (Client.isSpellSelected) {
						if ((PcmPlayer.selectedSpellFlags & 4) == 4) {
							JagexCache.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + MusicPatchPcmStream.colorStartTag(65535) + var20.name, 2, var19, var13, var15);
						}
					} else {
						String[] var37 = var20.actions;
						if (var37 != null) {
							for (var23 = 4; var23 >= 0; --var23) {
								if ((var21 == null || var21.method2372(var23)) && var37[var23] != null) {
									short var24 = 0;
									if (var23 == 0) {
										var24 = 3;
									}

									if (var23 == 1) {
										var24 = 4;
									}

									if (var23 == 2) {
										var24 = 5;
									}

									if (var23 == 3) {
										var24 = 6;
									}

									if (var23 == 4) {
										var24 = 1001;
									}

									JagexCache.insertMenuItemNoShift(var37[var23], MusicPatchPcmStream.colorStartTag(65535) + var20.name, var24, var19, var13, var15);
								}
							}
						}

						JagexCache.insertMenuItemNoShift("Examine", MusicPatchPcmStream.colorStartTag(65535) + var20.name, 1002, var20.id, var13, var15);
					}
				}

				int var30;
				Player var31;
				NPC var38;
				int[] var39;
				if (var16 == 1) {
					NPC var33 = Client.npcs[var19];
					if (var33 == null) {
						continue;
					}

					if (var33.definition.size == 1 && (var33.x & 127) == 64 && (var33.y & 127) == 64) {
						for (var30 = 0; var30 < Client.npcCount; ++var30) {
							var38 = Client.npcs[Client.npcIndices[var30]];
							if (var38 != null && var38 != var33 && var38.definition.size == 1 && var33.x == var38.x && var33.y == var38.y) {
								VarpDefinition.addNpcToMenu(var38, Client.npcIndices[var30], var13, var15);
							}
						}

						var30 = Players.Players_count;
						var39 = Players.Players_indices;

						for (var23 = 0; var23 < var30; ++var23) {
							var31 = Client.players[var39[var23]];
							if (var31 != null && var33.x == var31.x && var33.y == var31.y) {
								WorldMapAreaData.addPlayerToMenu(var31, var39[var23], var13, var15);
							}
						}
					}

					VarpDefinition.addNpcToMenu(var33, var19, var13, var15);
				}

				if (var16 == 0) {
					Player var34 = Client.players[var19];
					if (var34 == null) {
						continue;
					}

					if ((var34.x & 127) == 64 && (var34.y & 127) == 64) {
						for (var30 = 0; var30 < Client.npcCount; ++var30) {
							var38 = Client.npcs[Client.npcIndices[var30]];
							if (var38 != null && var38.definition.size == 1 && var34.x == var38.x && var38.y == var34.y) {
								VarpDefinition.addNpcToMenu(var38, Client.npcIndices[var30], var13, var15);
							}
						}

						var30 = Players.Players_count;
						var39 = Players.Players_indices;

						for (var23 = 0; var23 < var30; ++var23) {
							var31 = Client.players[var39[var23]];
							if (var31 != null && var31 != var34 && var34.x == var31.x && var34.y == var31.y) {
								WorldMapAreaData.addPlayerToMenu(var31, var39[var23], var13, var15);
							}
						}
					}

					if (var19 != Client.combatTargetPlayerIndex) {
						WorldMapAreaData.addPlayerToMenu(var34, var19, var13, var15);
					} else {
						var4 = var26;
					}
				}

				if (var16 == 3) {
					NodeDeque var35 = Client.groundItems[class36.Client_plane][var13][var15];
					if (var35 != null) {
						for (TileItem var36 = (TileItem)var35.first(); var36 != null; var36 = (TileItem)var35.next()) {
							ItemComposition var40 = class125.ItemDefinition_get(var36.id);
							if (Client.isItemSelected == 1) {
								JagexCache.insertMenuItemNoShift("Use", Client.field557 + " " + "->" + " " + MusicPatchPcmStream.colorStartTag(16748608) + var40.name, 16, var36.id, var13, var15);
							} else if (Client.isSpellSelected) {
								if ((PcmPlayer.selectedSpellFlags & 1) == 1) {
									JagexCache.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + MusicPatchPcmStream.colorStartTag(16748608) + var40.name, 17, var36.id, var13, var15);
								}
							} else {
								String[] var32 = var40.groundActions;

								for (int var41 = 4; var41 >= 0; --var41) {
									if (var36.method2672(var41)) {
										if (var32 != null && var32[var41] != null) {
											byte var25 = 0;
											if (var41 == 0) {
												var25 = 18;
											}

											if (var41 == 1) {
												var25 = 19;
											}

											if (var41 == 2) {
												var25 = 20;
											}

											if (var41 == 3) {
												var25 = 21;
											}

											if (var41 == 4) {
												var25 = 22;
											}

											JagexCache.insertMenuItemNoShift(var32[var41], MusicPatchPcmStream.colorStartTag(16748608) + var40.name, var25, var36.id, var13, var15);
										} else if (var41 == 2) {
											JagexCache.insertMenuItemNoShift("Take", MusicPatchPcmStream.colorStartTag(16748608) + var40.name, 20, var36.id, var13, var15);
										}
									}
								}

								JagexCache.insertMenuItemNoShift("Examine", MusicPatchPcmStream.colorStartTag(16748608) + var40.name, 1004, var36.id, var13, var15);
							}
						}
					}
				}
			}
		}

		if (-1L != var4) {
			var8 = (int)(var4 >>> 0 & 127L);
			int var10 = class197.method3772(var4);
			Player var11 = Client.players[Client.combatTargetPlayerIndex];
			WorldMapAreaData.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var10);
		}

	}
}
