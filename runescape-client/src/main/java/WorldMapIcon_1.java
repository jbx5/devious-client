




import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.Implements; import net.runelite.mapping.ObfuscatedGetter; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("sb")
	@ObfuscatedSignature(descriptor = 
	"Laa;")

	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	-460630695)

	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Lhc;")

	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	308451519)

	@Export("element")
	int element;
	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"Liw;")

	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	1213792301)

	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	-1841576609)

	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(descriptor = 
	"(Lko;Lko;ILhc;)V")

	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2);
		this.objectDefId = var3;
		this.region = var4;
		this.init();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-58815243")

	@Export("init")
	void init() {
		this.element = class116.getObjectDefinition(this.objectDefId).transform().mapIconId;
		this.label = this.region.createMapLabel(class19.WorldMapElement_get(this.element));
		WorldMapElement var1 = class19.WorldMapElement_get(this.getElement());
		SpritePixels var2 = var1.getSpriteBool(false);
		if (var2 != null) {
			this.subWidth = var2.subWidth;
			this.subHeight = var2.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"2078584239")

	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(I)Liw;", garbageValue = 
	"-2105037058")

	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"388705804")

	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"-54")

	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"(IIIIIILgs;Lgf;I)V", garbageValue = 
	"-1640512620")

	static final void method4556(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (((!Client.isLowDetail) || ((Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0)) || ((Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0)) {
			if (var0 < Tiles.Tiles_minPlane) {
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = class116.getObjectDefinition(var3);
			int var9;
			int var10;
			if ((var4 != 1) && (var4 != 3)) {
				var9 = var8.sizeX;
				var10 = var8.sizeY;
			} else {
				var9 = var8.sizeY;
				var10 = var8.sizeX;
			}

			int var11;
			int var12;
			if ((var9 + var1) <= 104) {
				var11 = (var9 >> 1) + var1;
				var12 = ((var9 + 1) >> 1) + var1;
			} else {
				var11 = var1;
				var12 = var1 + 1;
			}

			int var13;
			int var14;
			if ((var10 + var2) <= 104) {
				var13 = (var10 >> 1) + var2;
				var14 = var2 + ((var10 + 1) >> 1);
			} else {
				var13 = var2;
				var14 = var2 + 1;
			}

			int[][] var15 = Tiles.Tiles_heights[var0];
			int var16 = (((var15[var11][var14] + var15[var11][var13]) + var15[var12][var13]) + var15[var12][var14]) >> 2;
			int var17 = (var1 << 7) + (var9 << 6);
			int var18 = (var2 << 7) + (var10 << 6);
			long var19 = MilliClock.calculateTag(var1, var2, 2, var8.int1 == 0, var3);
			int var21 = var5 + (var4 << 6);
			if (var8.int3 == 1) {
				var21 += 256;
			}

			int var23;
			int var24;
			if (var8.hasSound()) {
				ObjectSound var22 = new ObjectSound();
				var22.plane = var0;
				var22.x = var1 * 128;
				var22.y = var2 * 128;
				var23 = var8.sizeX;
				var24 = var8.sizeY;
				if ((var4 == 1) || (var4 == 3)) {
					var23 = var8.sizeY;
					var24 = var8.sizeX;
				}

				var22.maxX = (var23 + var1) * 128;
				var22.maxY = (var24 + var2) * 128;
				var22.soundEffectId = var8.ambientSoundId;
				var22.field813 = var8.int7 * 128;
				var22.field809 = var8.int5;
				var22.field819 = var8.int6;
				var22.soundEffectIds = var8.soundEffectIds;
				if (var8.transforms != null) {
					var22.obj = var8;
					var22.set();
				}

				ObjectSound.objectSounds.addFirst(var22);
				if (var22.soundEffectIds != null) {
					var22.field821 = var22.field809 + ((int) (Math.random() * ((double) (var22.field819 - var22.field809))));
				}
			}

			Object var34;
			if (var5 == 22) {
				if ((((!Client.isLowDetail) || (var8.int1 != 0)) || (var8.interactType == 1)) || var8.boolean2) {
					if ((var8.animationId == (-1)) && (var8.transforms == null)) {
						var34 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
					}

					var6.newFloorDecoration(var0, var1, var2, var16, ((Renderable) (var34)), var19, var21);
					if ((var8.interactType == 1) && (var7 != null)) {
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else if ((var5 != 10) && (var5 != 11)) {
				int[] var10000;
				if (var5 >= 12) {
					if ((var8.animationId == (-1)) && (var8.transforms == null)) {
						var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
					}

					var6.method4138(var0, var1, var2, var16, 1, 1, ((Renderable) (var34)), 0, var19, var21);
					if ((((var5 >= 12) && (var5 <= 17)) && (var5 != 13)) && (var0 > 0)) {
						var10000 = DirectByteArrayCopier.field3277[var0][var1];
						var10000[var2] |= 2340;
					}

					if ((var8.interactType != 0) && (var7 != null)) {
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				} else if (var5 == 0) {
					if ((var8.animationId == (-1)) && (var8.transforms == null)) {
						var34 = var8.getEntity(0, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
					}

					var6.newBoundaryObject(var0, var1, var2, var16, ((Renderable) (var34)), ((Renderable) (null)), Tiles.field988[var4], 0, var19, var21);
					if (var4 == 0) {
						if (var8.clipped) {
							GrandExchangeOfferNameComparator.field4010[var0][var1][var2] = 50;
							GrandExchangeOfferNameComparator.field4010[var0][var1][var2 + 1] = 50;
						}

						if (var8.modelClipped) {
							var10000 = DirectByteArrayCopier.field3277[var0][var1];
							var10000[var2] |= 585;
						}
					} else if (var4 == 1) {
						if (var8.clipped) {
							GrandExchangeOfferNameComparator.field4010[var0][var1][var2 + 1] = 50;
							GrandExchangeOfferNameComparator.field4010[var0][var1 + 1][var2 + 1] = 50;
						}

						if (var8.modelClipped) {
							var10000 = DirectByteArrayCopier.field3277[var0][var1];
							var10000[1 + var2] |= 1170;
						}
					} else if (var4 == 2) {
						if (var8.clipped) {
							GrandExchangeOfferNameComparator.field4010[var0][var1 + 1][var2] = 50;
							GrandExchangeOfferNameComparator.field4010[var0][var1 + 1][var2 + 1] = 50;
						}

						if (var8.modelClipped) {
							var10000 = DirectByteArrayCopier.field3277[var0][var1 + 1];
							var10000[var2] |= 585;
						}
					} else if (var4 == 3) {
						if (var8.clipped) {
							GrandExchangeOfferNameComparator.field4010[var0][var1][var2] = 50;
							GrandExchangeOfferNameComparator.field4010[var0][var1 + 1][var2] = 50;
						}

						if (var8.modelClipped) {
							var10000 = DirectByteArrayCopier.field3277[var0][var1];
							var10000[var2] |= 1170;
						}
					}

					if ((var8.interactType != 0) && (var7 != null)) {
						var7.method3838(var1, var2, var5, var4, var8.boolean1);
					}

					if (var8.int2 != 16) {
						var6.method4144(var0, var1, var2, var8.int2);
					}

				} else if (var5 == 1) {
					if ((var8.animationId == (-1)) && (var8.transforms == null)) {
						var34 = var8.getEntity(1, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
					}

					var6.newBoundaryObject(var0, var1, var2, var16, ((Renderable) (var34)), ((Renderable) (null)), Tiles.field989[var4], 0, var19, var21);
					if (var8.clipped) {
						if (var4 == 0) {
							GrandExchangeOfferNameComparator.field4010[var0][var1][var2 + 1] = 50;
						} else if (var4 == 1) {
							GrandExchangeOfferNameComparator.field4010[var0][var1 + 1][var2 + 1] = 50;
						} else if (var4 == 2) {
							GrandExchangeOfferNameComparator.field4010[var0][var1 + 1][var2] = 50;
						} else if (var4 == 3) {
							GrandExchangeOfferNameComparator.field4010[var0][var1][var2] = 50;
						}
					}

					if ((var8.interactType != 0) && (var7 != null)) {
						var7.method3838(var1, var2, var5, var4, var8.boolean1);
					}

				} else {
					int var28;
					if (var5 == 2) {
						var28 = (var4 + 1) & 3;
						Object var31;
						Object var32;
						if ((var8.animationId == (-1)) && (var8.transforms == null)) {
							var31 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18);
							var32 = var8.getEntity(2, var28, var15, var17, var16, var18);
						} else {
							var31 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
							var32 = new DynamicObject(var3, 2, var28, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
						}

						var6.newBoundaryObject(var0, var1, var2, var16, ((Renderable) (var31)), ((Renderable) (var32)), Tiles.field988[var4], Tiles.field988[var28], var19, var21);
						if (var8.modelClipped) {
							if (var4 == 0) {
								var10000 = DirectByteArrayCopier.field3277[var0][var1];
								var10000[var2] |= 585;
								var10000 = DirectByteArrayCopier.field3277[var0][var1];
								var10000[var2 + 1] |= 1170;
							} else if (var4 == 1) {
								var10000 = DirectByteArrayCopier.field3277[var0][var1];
								var10000[1 + var2] |= 1170;
								var10000 = DirectByteArrayCopier.field3277[var0][var1 + 1];
								var10000[var2] |= 585;
							} else if (var4 == 2) {
								var10000 = DirectByteArrayCopier.field3277[var0][var1 + 1];
								var10000[var2] |= 585;
								var10000 = DirectByteArrayCopier.field3277[var0][var1];
								var10000[var2] |= 1170;
							} else if (var4 == 3) {
								var10000 = DirectByteArrayCopier.field3277[var0][var1];
								var10000[var2] |= 1170;
								var10000 = DirectByteArrayCopier.field3277[var0][var1];
								var10000[var2] |= 585;
							}
						}

						if ((var8.interactType != 0) && (var7 != null)) {
							var7.method3838(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) {
							var6.method4144(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 3) {
						if ((var8.animationId == (-1)) && (var8.transforms == null)) {
							var34 = var8.getEntity(3, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
						}

						var6.newBoundaryObject(var0, var1, var2, var16, ((Renderable) (var34)), ((Renderable) (null)), Tiles.field989[var4], 0, var19, var21);
						if (var8.clipped) {
							if (var4 == 0) {
								GrandExchangeOfferNameComparator.field4010[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) {
								GrandExchangeOfferNameComparator.field4010[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) {
								GrandExchangeOfferNameComparator.field4010[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) {
								GrandExchangeOfferNameComparator.field4010[var0][var1][var2] = 50;
							}
						}

						if ((var8.interactType != 0) && (var7 != null)) {
							var7.method3838(var1, var2, var5, var4, var8.boolean1);
						}

					} else if (var5 == 9) {
						if ((var8.animationId == (-1)) && (var8.transforms == null)) {
							var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
						}

						var6.method4138(var0, var1, var2, var16, 1, 1, ((Renderable) (var34)), 0, var19, var21);
						if ((var8.interactType != 0) && (var7 != null)) {
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

						if (var8.int2 != 16) {
							var6.method4144(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 4) {
						if ((var8.animationId == (-1)) && (var8.transforms == null)) {
							var34 = var8.getEntity(4, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
						}

						var6.newWallDecoration(var0, var1, var2, var16, ((Renderable) (var34)), ((Renderable) (null)), Tiles.field988[var4], 0, 0, 0, var19, var21);
					} else {
						Object var25;
						long var29;
						if (var5 == 5) {
							var28 = 16;
							var29 = var6.getBoundaryObjectTag(var0, var1, var2);
							if (0L != var29) {
								var28 = class116.getObjectDefinition(class121.Entity_unpackID(var29)).int2;
							}

							if ((var8.animationId == (-1)) && (var8.transforms == null)) {
								var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
							}

							var6.newWallDecoration(var0, var1, var2, var16, ((Renderable) (var25)), ((Renderable) (null)), Tiles.field988[var4], 0, var28 * Tiles.field990[var4], var28 * Tiles.field991[var4], var19, var21);
						} else if (var5 == 6) {
							var28 = 8;
							var29 = var6.getBoundaryObjectTag(var0, var1, var2);
							if (0L != var29) {
								var28 = class116.getObjectDefinition(class121.Entity_unpackID(var29)).int2 / 2;
							}

							if ((var8.animationId == (-1)) && (var8.transforms == null)) {
								var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
							} else {
								var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
							}

							var6.newWallDecoration(var0, var1, var2, var16, ((Renderable) (var25)), ((Renderable) (null)), 256, var4, var28 * Tiles.field1000[var4], var28 * Tiles.field993[var4], var19, var21);
						} else if (var5 == 7) {
							var23 = (var4 + 2) & 3;
							if ((var8.animationId == (-1)) && (var8.transforms == null)) {
								var34 = var8.getEntity(4, var23 + 4, var15, var17, var16, var18);
							} else {
								var34 = new DynamicObject(var3, 4, var23 + 4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
							}

							var6.newWallDecoration(var0, var1, var2, var16, ((Renderable) (var34)), ((Renderable) (null)), 256, var23, 0, 0, var19, var21);
						} else if (var5 == 8) {
							var28 = 8;
							var29 = var6.getBoundaryObjectTag(var0, var1, var2);
							if (0L != var29) {
								var28 = class116.getObjectDefinition(class121.Entity_unpackID(var29)).int2 / 2;
							}

							int var27 = (var4 + 2) & 3;
							Object var26;
							if ((var8.animationId == (-1)) && (var8.transforms == null)) {
								var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
								var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18);
							} else {
								var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
								var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
							}

							var6.newWallDecoration(var0, var1, var2, var16, ((Renderable) (var25)), ((Renderable) (var26)), 256, var4, var28 * Tiles.field1000[var4], var28 * Tiles.field993[var4], var19, var21);
						}
					}
				}
			} else {
				if ((var8.animationId == (-1)) && (var8.transforms == null)) {
					var34 = var8.getEntity(10, var4, var15, var17, var16, var18);
				} else {
					var34 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.boolean3, ((Renderable) (null)));
				}

				if (((var34 != null) && var6.method4138(var0, var1, var2, var16, var9, var10, ((Renderable) (var34)), var5 == 11 ? 256 : 0, var19, var21)) && var8.clipped) {
					var23 = 15;
					if (var34 instanceof Model) {
						var23 = ((Model) (var34)).method4360() / 4;
						if (var23 > 30) {
							var23 = 30;
						}
					}

					for (var24 = 0; var24 <= var9; ++var24) {
						for (int var33 = 0; var33 <= var10; ++var33) {
							if (var23 > GrandExchangeOfferNameComparator.field4010[var0][var24 + var1][var33 + var2]) {
								GrandExchangeOfferNameComparator.field4010[var0][var24 + var1][var33 + var2] = ((byte) (var23));
							}
						}
					}
				}

				if ((var8.interactType != 0) && (var7 != null)) {
					var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
				}

			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(descriptor = 
	"(ILbo;ZI)I", garbageValue = 
	"694250385")

	static int method4559(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) {
			class295.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
			int var4 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
			if (!Client.isCameraLocked) {
				Client.camAngleX = var3;
				Client.camAngleY = var4;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) {
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = Client.camAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) {
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = Client.camAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) {
			var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
			if (var3 < 0) {
				var3 = 0;
			}

			Client.camFollowHeight = var3;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) {
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = Client.camFollowHeight;
			return 1;
		} else {
			return 2;
		}
	}
}