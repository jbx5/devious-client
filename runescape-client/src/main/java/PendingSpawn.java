import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("rg")
	@ObfuscatedSignature(
		descriptor = "Lew;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -411248035
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 410725973
	)
	@Export("type")
	int type;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1700327617
	)
	@Export("x")
	int x;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -623481861
	)
	@Export("y")
	int y;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1750556275
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1209713311
	)
	int field1168;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -7205691
	)
	int field1169;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 952908339
	)
	int field1173;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 243961051
	)
	int field1171;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2017659571
	)
	int field1170;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 593252615
	)
	int field1172;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -2080090047
	)
	int field1174;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1028756101
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -2036158661
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.field1174 = 31;
		this.delay = 0;
		this.hitpoints = -1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2117178902"
	)
	void method2376(int var1) {
		this.field1174 = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1391421037"
	)
	boolean method2372(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1174 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[Lnw;",
		garbageValue = "-1780334162"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.PlayerType_jagexModerator, PlayerType.PlayerType_normal, PlayerType.field4214, PlayerType.field4228, PlayerType.field4230, PlayerType.PlayerType_hardcoreIronman, PlayerType.PlayerType_ironman, PlayerType.field4221, PlayerType.field4231, PlayerType.PlayerType_ultimateIronman, PlayerType.field4226, PlayerType.field4224, PlayerType.PlayerType_playerModerator, PlayerType.field4223, PlayerType.field4227, PlayerType.field4225, PlayerType.field4222};
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILiz;Lij;I)V",
		garbageValue = "235941196"
	)
	@Export("addObjects")
	static final void addObjects(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) {
			if (var0 < Tiles.Tiles_minPlane) {
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = class90.getObjectDefinition(var3);
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) {
				var9 = var8.sizeX;
				var10 = var8.sizeY;
			} else {
				var9 = var8.sizeY;
				var10 = var8.sizeX;
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) {
				var11 = (var9 >> 1) + var1;
				var12 = (var9 + 1 >> 1) + var1;
			} else {
				var11 = var1;
				var12 = var1 + 1;
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) {
				var13 = (var10 >> 1) + var2;
				var14 = var2 + (var10 + 1 >> 1);
			} else {
				var13 = var2;
				var14 = var2 + 1;
			}

			int[][] var15 = Tiles.Tiles_heights[var0];
			int var16 = var15[var11][var14] + var15[var11][var13] + var15[var12][var13] + var15[var12][var14] >> 2;
			int var17 = (var1 << 7) + (var9 << 6);
			int var18 = (var2 << 7) + (var10 << 6);
			long var19 = BufferedNetSocket.calculateTag(var1, var2, 2, var8.int1 == 0, var3);
			int var21 = var5 + (var4 << 6);
			if (var8.int3 == 1) {
				var21 += 256;
			}

			if (var8.hasSound()) {
				GrandExchangeOfferOwnWorldComparator.method1250(var0, var1, var2, var8, var4);
			}

			Object var29;
			if (var5 == 22) {
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) {
					if (var8.animationId == -1 && var8.transforms == null) {
						var29 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
					}

					var6.newFloorDecoration(var0, var1, var2, var16, (Renderable)var29, var19, var21);
					if (var8.interactType == 1 && var7 != null) {
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else {
				int var28;
				if (var5 != 10 && var5 != 11) {
					int[] var10000;
					if (var5 >= 12) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
						}

						var6.method4569(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21);
						if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
							var10000 = BufferedNetSocket.field4681[var0][var1];
							var10000[var2] |= 2340;
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

					} else if (var5 == 0) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var29 = var8.getEntity(0, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1027[var4], 0, var19, var21);
						if (var4 == 0) {
							if (var8.clipped) {
								InvDefinition.Tiles_underlays2[var0][var1][var2] = 50;
								InvDefinition.Tiles_underlays2[var0][var1][var2 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = BufferedNetSocket.field4681[var0][var1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 1) {
							if (var8.clipped) {
								InvDefinition.Tiles_underlays2[var0][var1][var2 + 1] = 50;
								InvDefinition.Tiles_underlays2[var0][var1 + 1][var2 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = BufferedNetSocket.field4681[var0][var1];
								var10000[var2 + 1] |= 1170;
							}
						} else if (var4 == 2) {
							if (var8.clipped) {
								InvDefinition.Tiles_underlays2[var0][var1 + 1][var2] = 50;
								InvDefinition.Tiles_underlays2[var0][var1 + 1][var2 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = BufferedNetSocket.field4681[var0][var1 + 1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 3) {
							if (var8.clipped) {
								InvDefinition.Tiles_underlays2[var0][var1][var2] = 50;
								InvDefinition.Tiles_underlays2[var0][var1 + 1][var2] = 50;
							}

							if (var8.modelClipped) {
								var10000 = BufferedNetSocket.field4681[var0][var1];
								var10000[var2] |= 1170;
							}
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.method4191(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) {
							var6.method4575(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 1) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var29 = var8.getEntity(1, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1028[var4], 0, var19, var21);
						if (var8.clipped) {
							if (var4 == 0) {
								InvDefinition.Tiles_underlays2[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) {
								InvDefinition.Tiles_underlays2[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) {
								InvDefinition.Tiles_underlays2[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) {
								InvDefinition.Tiles_underlays2[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.method4191(var1, var2, var5, var4, var8.boolean1);
						}

					} else {
						int var22;
						if (var5 == 2) {
							var22 = var4 + 1 & 3;
							Object var24;
							Object var30;
							if (var8.animationId == -1 && var8.transforms == null) {
								var30 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18);
								var24 = var8.getEntity(2, var22, var15, var17, var16, var18);
							} else {
								var30 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
								var24 = new DynamicObject(var3, 2, var22, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var30, (Renderable)var24, Tiles.field1027[var4], Tiles.field1027[var22], var19, var21);
							if (var8.modelClipped) {
								if (var4 == 0) {
									var10000 = BufferedNetSocket.field4681[var0][var1];
									var10000[var2] |= 585;
									var10000 = BufferedNetSocket.field4681[var0][var1];
									var10000[var2 + 1] |= 1170;
								} else if (var4 == 1) {
									var10000 = BufferedNetSocket.field4681[var0][var1];
									var10000[var2 + 1] |= 1170;
									var10000 = BufferedNetSocket.field4681[var0][var1 + 1];
									var10000[var2] |= 585;
								} else if (var4 == 2) {
									var10000 = BufferedNetSocket.field4681[var0][var1 + 1];
									var10000[var2] |= 585;
									var10000 = BufferedNetSocket.field4681[var0][var1];
									var10000[var2] |= 1170;
								} else if (var4 == 3) {
									var10000 = BufferedNetSocket.field4681[var0][var1];
									var10000[var2] |= 1170;
									var10000 = BufferedNetSocket.field4681[var0][var1];
									var10000[var2] |= 585;
								}
							}

							if (var8.interactType != 0 && var7 != null) {
								var7.method4191(var1, var2, var5, var4, var8.boolean1);
							}

							if (var8.int2 != 16) {
								var6.method4575(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 3) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var29 = var8.getEntity(3, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1028[var4], 0, var19, var21);
							if (var8.clipped) {
								if (var4 == 0) {
									InvDefinition.Tiles_underlays2[var0][var1][var2 + 1] = 50;
								} else if (var4 == 1) {
									InvDefinition.Tiles_underlays2[var0][var1 + 1][var2 + 1] = 50;
								} else if (var4 == 2) {
									InvDefinition.Tiles_underlays2[var0][var1 + 1][var2] = 50;
								} else if (var4 == 3) {
									InvDefinition.Tiles_underlays2[var0][var1][var2] = 50;
								}
							}

							if (var8.interactType != 0 && var7 != null) {
								var7.method4191(var1, var2, var5, var4, var8.boolean1);
							}

						} else if (var5 == 9) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var6.method4569(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21);
							if (var8.interactType != 0 && var7 != null) {
								var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
							}

							if (var8.int2 != 16) {
								var6.method4575(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 4) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var29 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1027[var4], 0, 0, 0, var19, var21);
						} else {
							long var23;
							Object var25;
							if (var5 == 5) {
								var22 = 16;
								var23 = var6.getBoundaryObjectTag(var0, var1, var2);
								if (0L != var23) {
									var22 = class90.getObjectDefinition(class458.Entity_unpackID(var23)).int2;
								}

								if (var8.animationId == -1 && var8.transforms == null) {
									var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field1027[var4], 0, var22 * Tiles.field1037[var4], var22 * Tiles.field1034[var4], var19, var21);
							} else if (var5 == 6) {
								var22 = 8;
								var23 = var6.getBoundaryObjectTag(var0, var1, var2);
								if (var23 != 0L) {
									var22 = class90.getObjectDefinition(class458.Entity_unpackID(var23)).int2 / 2;
								}

								if (var8.animationId == -1 && var8.transforms == null) {
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var22 * Tiles.field1031[var4], var22 * Tiles.field1032[var4], var19, var21);
							} else if (var5 == 7) {
								var28 = var4 + 2 & 3;
								if (var8.animationId == -1 && var8.transforms == null) {
									var29 = var8.getEntity(4, var28 + 4, var15, var17, var16, var18);
								} else {
									var29 = new DynamicObject(var3, 4, var28 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, 256, var28, 0, 0, var19, var21);
							} else if (var5 == 8) {
								var22 = 8;
								var23 = var6.getBoundaryObjectTag(var0, var1, var2);
								if (0L != var23) {
									var22 = class90.getObjectDefinition(class458.Entity_unpackID(var23)).int2 / 2;
								}

								int var27 = var4 + 2 & 3;
								Object var26;
								if (var8.animationId == -1 && var8.transforms == null) {
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
									var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
									var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var22 * Tiles.field1031[var4], var22 * Tiles.field1032[var4], var19, var21);
							}
						}
					}
				} else {
					if (var8.animationId == -1 && var8.transforms == null) {
						var29 = var8.getEntity(10, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
					}

					if (var29 != null && var6.method4569(var0, var1, var2, var16, var9, var10, (Renderable)var29, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) {
						var28 = 15;
						if (var29 instanceof Model) {
							var28 = ((Model)var29).method4800() / 4;
							if (var28 > 30) {
								var28 = 30;
							}
						}

						for (int var31 = 0; var31 <= var9; ++var31) {
							for (int var32 = 0; var32 <= var10; ++var32) {
								if (var28 > InvDefinition.Tiles_underlays2[var0][var31 + var1][var32 + var2]) {
									InvDefinition.Tiles_underlays2[var0][var31 + var1][var32 + var2] = (byte)var28;
								}
							}
						}
					}

					if (var8.interactType != 0 && var7 != null) {
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				}
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-230258157"
	)
	public static void method2378(boolean var0) {
		if (var0 != class502.ItemDefinition_inMembersWorld) {
			GrandExchangeOfferOwnWorldComparator.method1251();
			class502.ItemDefinition_inMembersWorld = var0;
		}

	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(IZZZZS)Lny;",
		garbageValue = "-12533"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		ArchiveDisk var5 = null;
		if (JagexCache.JagexCache_dat2File != null) {
			var5 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, class302.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var5, class158.masterDisk, class153.field1700, var0, var1, var2, var3, var4);
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "1729163536"
	)
	static long method2375() {
		return Client.field642;
	}
}
