import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
public class class130 {
	@ObfuscatedName("mx")
	@ObfuscatedGetter(
		intValue = 1642842793
	)
	static int field1562;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1589988821
	)
	public final int field1557;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	public class130 field1558;
	@ObfuscatedName("aj")
	float[][] field1550;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[Lql;"
	)
	final class423[] field1551;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[Lql;"
	)
	class423[] field1552;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[Lql;"
	)
	class423[] field1556;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	class423 field1554;
	@ObfuscatedName("ab")
	boolean field1555;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	class423 field1553;
	@ObfuscatedName("ao")
	boolean field1564;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	class423 field1548;
	@ObfuscatedName("av")
	float[][] field1559;
	@ObfuscatedName("aq")
	float[][] field1560;
	@ObfuscatedName("ap")
	float[][] field1561;

	@ObfuscatedSignature(
		descriptor = "(ILua;Z)V"
	)
	public class130(int var1, Buffer var2, boolean var3) {
		this.field1554 = new class423();
		this.field1555 = true;
		this.field1553 = new class423();
		this.field1564 = true;
		this.field1548 = new class423();
		this.field1557 = var2.readShort();
		this.field1551 = new class423[var1];
		this.field1552 = new class423[this.field1551.length];
		this.field1556 = new class423[this.field1551.length];
		this.field1550 = new float[this.field1551.length][3];

		for (int var4 = 0; var4 < this.field1551.length; ++var4) {
			this.field1551[var4] = new class423(var2, var3);
			this.field1550[var4][0] = var2.method9665();
			this.field1550[var4][1] = var2.method9665();
			this.field1550[var4][2] = var2.method9665();
		}

		this.method3041();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2143693863"
	)
	void method3041() {
		this.field1559 = new float[this.field1551.length][3];
		this.field1560 = new float[this.field1551.length][3];
		this.field1561 = new float[this.field1551.length][3];
		class423 var1;
		synchronized(class423.field4691) {
			if (AccessFile.field5239 == 0) {
				var1 = new class423();
			} else {
				class423.field4691[--AccessFile.field5239].method7884();
				var1 = class423.field4691[AccessFile.field5239];
			}
		}

		class423 var2 = var1;

		for (int var5 = 0; var5 < this.field1551.length; ++var5) {
			class423 var4 = this.method3042(var5);
			var2.method7918(var4);
			var2.method7864();
			this.field1559[var5] = var2.method7846();
			this.field1560[var5][0] = var4.field4694[12];
			this.field1560[var5][1] = var4.field4694[13];
			this.field1560[var5][2] = var4.field4694[14];
			this.field1561[var5] = var4.method7865();
		}

		var2.method7871();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lql;",
		garbageValue = "1183049626"
	)
	class423 method3042(int var1) {
		return this.field1551[var1];
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lql;",
		garbageValue = "-1468709124"
	)
	class423 method3043(int var1) {
		if (this.field1552[var1] == null) {
			this.field1552[var1] = new class423(this.method3042(var1));
			if (this.field1558 != null) {
				this.field1552[var1].method7898(this.field1558.method3043(var1));
			} else {
				this.field1552[var1].method7898(class423.field4695);
			}
		}

		return this.field1552[var1];
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Lql;",
		garbageValue = "1402974626"
	)
	class423 method3044(int var1) {
		if (this.field1556[var1] == null) {
			this.field1556[var1] = new class423(this.method3043(var1));
			this.field1556[var1].method7864();
		}

		return this.field1556[var1];
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lql;B)V",
		garbageValue = "19"
	)
	void method3061(class423 var1) {
		this.field1554.method7918(var1);
		this.field1555 = true;
		this.field1564 = true;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Lql;",
		garbageValue = "-1857064802"
	)
	class423 method3067() {
		return this.field1554;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Lql;",
		garbageValue = "126"
	)
	class423 method3065() {
		if (this.field1555) {
			this.field1553.method7918(this.method3067());
			if (this.field1558 != null) {
				this.field1553.method7898(this.field1558.method3065());
			}

			this.field1555 = false;
		}

		return this.field1553;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Lql;",
		garbageValue = "96"
	)
	public class423 method3048(int var1) {
		if (this.field1564) {
			this.field1548.method7918(this.method3044(var1));
			this.field1548.method7898(this.method3065());
			this.field1564 = false;
		}

		return this.field1548;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "1095915504"
	)
	float[] method3049(int var1) {
		return this.field1559[var1];
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-428439214"
	)
	float[] method3050(int var1) {
		return this.field1560[var1];
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)[F",
		garbageValue = "-64"
	)
	float[] method3046(int var1) {
		return this.field1561[var1];
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ldt;IIIIIILir;B)V",
		garbageValue = "39"
	)
	@Export("addObjects")
	static final void addObjects(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, CollisionMap var7) {
		if (!Client.isLowDetail || (var0.tileSettings[0][var2][var3] & 2) != 0 || (var0.tileSettings[var1][var2][var3] & 16) == 0) {
			if (var1 < Tiles.Tiles_minPlane) {
				Tiles.Tiles_minPlane = var1;
			}

			ObjectComposition var8 = HitSplatDefinition.getObjectDefinition(var4);
			int var9;
			int var10;
			if (var5 != 1 && var5 != 3) {
				var9 = var8.sizeX;
				var10 = var8.sizeY;
			} else {
				var9 = var8.sizeY;
				var10 = var8.sizeX;
			}

			int var11;
			int var12;
			if (var9 + var2 <= var0.sizeX) {
				var11 = (var9 >> 1) + var2;
				var12 = var2 + (var9 + 1 >> 1);
			} else {
				var11 = var2;
				var12 = var2 + 1;
			}

			int var13;
			int var14;
			if (var3 + var10 <= var0.sizeY) {
				var13 = var3 + (var10 >> 1);
				var14 = var3 + (var10 + 1 >> 1);
			} else {
				var13 = var3;
				var14 = var3 + 1;
			}

			int[][] var15 = var0.tileHeights[var1];
			int var16 = var15[var12][var13] + var15[var11][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
			int var17 = (var2 << 7) + (var9 << 6);
			int var18 = (var3 << 7) + (var10 << 6);
			long var19 = KitDefinition.calculateTag(var2, var3, 2, var8.int1 == 0, var4, var0.id);
			int var21 = (var5 << 6) + var6;
			if (var8.int3 == 1) {
				var21 += 256;
			}

			if (var8.hasSound()) {
				SoundCache.createObjectSound(var1, var2, var3, var8, var5);
			}

			Scene var22 = var0.scene;
			Object var30;
			if (var6 == 22) {
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) {
					if (var8.animationId == -1 && var8.transforms == null) {
						var30 = var8.getEntity(22, var5, var15, var17, var16, var18);
					} else {
						var30 = new DynamicObject(var0, var4, 22, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
					}

					var22.newFloorDecoration(var1, var2, var3, var16, (Renderable)var30, var19, var21);
					if (var8.interactType == 1 && var7 != null) {
						var7.setBlockedByFloorDec(var2, var3);
					}

				}
			} else {
				int var29;
				if (var6 != 10 && var6 != 11) {
					int[] var10000;
					if (var6 >= 12) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var30 = var8.getEntity(var6, var5, var15, var17, var16, var18);
						} else {
							var30 = new DynamicObject(var0, var4, var6, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
						}

						var22.method4861(var1, var2, var3, var16, 1, 1, (Renderable)var30, 0, var19, var21);
						if (var6 >= 12 && var6 <= 17 && var6 != 13 && var1 > 0) {
							var10000 = SongTask.field4795[var1][var2];
							var10000[var3] |= 2340;
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.addGameObject(var2, var3, var9, var10, var8.boolean1);
						}

					} else if (var6 == 0) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var30 = var8.getEntity(0, var5, var15, var17, var16, var18);
						} else {
							var30 = new DynamicObject(var0, var4, 0, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
						}

						var22.newBoundaryObject(var1, var2, var3, var16, (Renderable)var30, (Renderable)null, Tiles.field1059[var5], 0, var19, var21);
						if (var5 == 0) {
							if (var8.clipped) {
								class202.Tiles_underlays2[var1][var2][var3] = 50;
								class202.Tiles_underlays2[var1][var2][var3 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = SongTask.field4795[var1][var2];
								var10000[var3] |= 585;
							}
						} else if (var5 == 1) {
							if (var8.clipped) {
								class202.Tiles_underlays2[var1][var2][var3 + 1] = 50;
								class202.Tiles_underlays2[var1][var2 + 1][var3 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = SongTask.field4795[var1][var2];
								var10000[1 + var3] |= 1170;
							}
						} else if (var5 == 2) {
							if (var8.clipped) {
								class202.Tiles_underlays2[var1][var2 + 1][var3] = 50;
								class202.Tiles_underlays2[var1][var2 + 1][var3 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = SongTask.field4795[var1][var2 + 1];
								var10000[var3] |= 585;
							}
						} else if (var5 == 3) {
							if (var8.clipped) {
								class202.Tiles_underlays2[var1][var2][var3] = 50;
								class202.Tiles_underlays2[var1][var2 + 1][var3] = 50;
							}

							if (var8.modelClipped) {
								var10000 = SongTask.field4795[var1][var2];
								var10000[var3] |= 1170;
							}
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.method4457(var2, var3, var6, var5, var8.boolean1);
						}

						if (var8.int2 != 16) {
							var22.method4886(var1, var2, var3, var8.int2);
						}

					} else if (var6 == 1) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var30 = var8.getEntity(1, var5, var15, var17, var16, var18);
						} else {
							var30 = new DynamicObject(var0, var4, 1, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
						}

						var22.newBoundaryObject(var1, var2, var3, var16, (Renderable)var30, (Renderable)null, Tiles.field1047[var5], 0, var19, var21);
						if (var8.clipped) {
							if (var5 == 0) {
								class202.Tiles_underlays2[var1][var2][var3 + 1] = 50;
							} else if (var5 == 1) {
								class202.Tiles_underlays2[var1][var2 + 1][var3 + 1] = 50;
							} else if (var5 == 2) {
								class202.Tiles_underlays2[var1][var2 + 1][var3] = 50;
							} else if (var5 == 3) {
								class202.Tiles_underlays2[var1][var2][var3] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.method4457(var2, var3, var6, var5, var8.boolean1);
						}

					} else {
						int var23;
						if (var6 == 2) {
							var23 = var5 + 1 & 3;
							Object var25;
							Object var31;
							if (var8.animationId == -1 && var8.transforms == null) {
								var31 = var8.getEntity(2, var5 + 4, var15, var17, var16, var18);
								var25 = var8.getEntity(2, var23, var15, var17, var16, var18);
							} else {
								var31 = new DynamicObject(var0, var4, 2, var5 + 4, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
								var25 = new DynamicObject(var0, var4, 2, var23, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var22.newBoundaryObject(var1, var2, var3, var16, (Renderable)var31, (Renderable)var25, Tiles.field1059[var5], Tiles.field1059[var23], var19, var21);
							if (var8.modelClipped) {
								if (var5 == 0) {
									var10000 = SongTask.field4795[var1][var2];
									var10000[var3] |= 585;
									var10000 = SongTask.field4795[var1][var2];
									var10000[var3 + 1] |= 1170;
								} else if (var5 == 1) {
									var10000 = SongTask.field4795[var1][var2];
									var10000[var3 + 1] |= 1170;
									var10000 = SongTask.field4795[var1][var2 + 1];
									var10000[var3] |= 585;
								} else if (var5 == 2) {
									var10000 = SongTask.field4795[var1][var2 + 1];
									var10000[var3] |= 585;
									var10000 = SongTask.field4795[var1][var2];
									var10000[var3] |= 1170;
								} else if (var5 == 3) {
									var10000 = SongTask.field4795[var1][var2];
									var10000[var3] |= 1170;
									var10000 = SongTask.field4795[var1][var2];
									var10000[var3] |= 585;
								}
							}

							if (var8.interactType != 0 && var7 != null) {
								var7.method4457(var2, var3, var6, var5, var8.boolean1);
							}

							if (var8.int2 != 16) {
								var22.method4886(var1, var2, var3, var8.int2);
							}

						} else if (var6 == 3) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var30 = var8.getEntity(3, var5, var15, var17, var16, var18);
							} else {
								var30 = new DynamicObject(var0, var4, 3, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var22.newBoundaryObject(var1, var2, var3, var16, (Renderable)var30, (Renderable)null, Tiles.field1047[var5], 0, var19, var21);
							if (var8.clipped) {
								if (var5 == 0) {
									class202.Tiles_underlays2[var1][var2][var3 + 1] = 50;
								} else if (var5 == 1) {
									class202.Tiles_underlays2[var1][var2 + 1][var3 + 1] = 50;
								} else if (var5 == 2) {
									class202.Tiles_underlays2[var1][var2 + 1][var3] = 50;
								} else if (var5 == 3) {
									class202.Tiles_underlays2[var1][var2][var3] = 50;
								}
							}

							if (var8.interactType != 0 && var7 != null) {
								var7.method4457(var2, var3, var6, var5, var8.boolean1);
							}

						} else if (var6 == 9) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var30 = var8.getEntity(var6, var5, var15, var17, var16, var18);
							} else {
								var30 = new DynamicObject(var0, var4, var6, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var22.method4861(var1, var2, var3, var16, 1, 1, (Renderable)var30, 0, var19, var21);
							if (var8.interactType != 0 && var7 != null) {
								var7.addGameObject(var2, var3, var9, var10, var8.boolean1);
							}

							if (var8.int2 != 16) {
								var22.method4886(var1, var2, var3, var8.int2);
							}

						} else if (var6 == 4) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var30 = var8.getEntity(4, var5, var15, var17, var16, var18);
							} else {
								var30 = new DynamicObject(var0, var4, 4, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var22.newWallDecoration(var1, var2, var3, var16, (Renderable)var30, (Renderable)null, Tiles.field1059[var5], 0, 0, 0, var19, var21);
						} else {
							long var24;
							Object var26;
							if (var6 == 5) {
								var23 = 16;
								var24 = var22.getBoundaryObjectTag(var1, var2, var3);
								if (var24 != 0L) {
									var23 = HitSplatDefinition.getObjectDefinition(class105.Entity_unpackID(var24)).int2;
								}

								if (var8.animationId == -1 && var8.transforms == null) {
									var26 = var8.getEntity(4, var5, var15, var17, var16, var18);
								} else {
									var26 = new DynamicObject(var0, var4, 4, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var22.newWallDecoration(var1, var2, var3, var16, (Renderable)var26, (Renderable)null, Tiles.field1059[var5], 0, var23 * Tiles.field1053[var5], var23 * Tiles.field1054[var5], var19, var21);
							} else if (var6 == 6) {
								var23 = 8;
								var24 = var22.getBoundaryObjectTag(var1, var2, var3);
								if (0L != var24) {
									var23 = HitSplatDefinition.getObjectDefinition(class105.Entity_unpackID(var24)).int2 / 2;
								}

								if (var8.animationId == -1 && var8.transforms == null) {
									var26 = var8.getEntity(4, var5 + 4, var15, var17, var16, var18);
								} else {
									var26 = new DynamicObject(var0, var4, 4, var5 + 4, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var22.newWallDecoration(var1, var2, var3, var16, (Renderable)var26, (Renderable)null, 256, var5, var23 * Tiles.field1055[var5], var23 * Tiles.field1056[var5], var19, var21);
							} else if (var6 == 7) {
								var29 = var5 + 2 & 3;
								if (var8.animationId == -1 && var8.transforms == null) {
									var30 = var8.getEntity(4, var29 + 4, var15, var17, var16, var18);
								} else {
									var30 = new DynamicObject(var0, var4, 4, var29 + 4, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var22.newWallDecoration(var1, var2, var3, var16, (Renderable)var30, (Renderable)null, 256, var29, 0, 0, var19, var21);
							} else if (var6 == 8) {
								var23 = 8;
								var24 = var22.getBoundaryObjectTag(var1, var2, var3);
								if (0L != var24) {
									var23 = HitSplatDefinition.getObjectDefinition(class105.Entity_unpackID(var24)).int2 / 2;
								}

								int var28 = var5 + 2 & 3;
								Object var27;
								if (var8.animationId == -1 && var8.transforms == null) {
									var26 = var8.getEntity(4, var5 + 4, var15, var17, var16, var18);
									var27 = var8.getEntity(4, var28 + 4, var15, var17, var16, var18);
								} else {
									var26 = new DynamicObject(var0, var4, 4, var5 + 4, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
									var27 = new DynamicObject(var0, var4, 4, var28 + 4, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var22.newWallDecoration(var1, var2, var3, var16, (Renderable)var26, (Renderable)var27, 256, var5, var23 * Tiles.field1055[var5], var23 * Tiles.field1056[var5], var19, var21);
							}
						}
					}
				} else {
					if (var8.animationId == -1 && var8.transforms == null) {
						var30 = var8.getEntity(10, var5, var15, var17, var16, var18);
					} else {
						var30 = new DynamicObject(var0, var4, 10, var5, var1, var2, var3, var8.animationId, var8.boolean3, (Renderable)null);
					}

					if (var30 != null && var22.method4861(var1, var2, var3, var16, var9, var10, (Renderable)var30, var6 == 11 ? 256 : 0, var19, var21) && var8.clipped) {
						var29 = 15;
						if (var30 instanceof Model) {
							var29 = ((Model)var30).method5185() / 4;
							if (var29 > 30) {
								var29 = 30;
							}
						}

						for (int var32 = 0; var32 <= var9; ++var32) {
							for (int var33 = 0; var33 <= var10; ++var33) {
								if (var29 > class202.Tiles_underlays2[var1][var32 + var2][var3 + var33]) {
									class202.Tiles_underlays2[var1][var32 + var2][var3 + var33] = (byte)var29;
								}
							}
						}
					}

					if (var8.interactType != 0 && var7 != null) {
						var7.addGameObject(var2, var3, var9, var10, var8.boolean1);
					}

				}
			}
		}
	}
}
