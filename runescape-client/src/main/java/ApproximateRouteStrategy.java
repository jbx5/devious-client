import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("co")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	ApproximateRouteStrategy() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIILij;I)Z",
		garbageValue = "2142084611"
	)
	@Export("hasArrived")
	protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lfm;FI)F",
		garbageValue = "451306103"
	)
	static float method1245(class130 var0, float var1) {
		if (var0 != null && var0.method2999() != 0) {
			if (var1 < (float)var0.field1536[0].field1483) {
				return var0.field1534 == class128.field1524 ? var0.field1536[0].field1488 : Language.method7006(var0, var1, true);
			} else if (var1 > (float)var0.field1536[var0.method2999() - 1].field1483) {
				return var0.field1547 == class128.field1524 ? var0.field1536[var0.method2999() - 1].field1488 : Language.method7006(var0, var1, false);
			} else if (var0.field1533) {
				return var0.field1536[0].field1488;
			} else {
				class125 var2 = var0.method2998(var1);
				boolean var3 = false;
				boolean var4 = false;
				if (var2 == null) {
					return 0.0F;
				} else {
					if (0.0D == (double)var2.field1486 && (double)var2.field1487 == 0.0D) {
						var3 = true;
					} else if (Float.MAX_VALUE == var2.field1486 && Float.MAX_VALUE == var2.field1487) {
						var4 = true;
					} else if (var2.field1485 != null) {
						if (var0.field1548) {
							float var5 = (float)var2.field1483;
							float var9 = var2.field1488;
							float var6 = 0.33333334F * var2.field1486 + var5;
							float var10 = var9 + 0.33333334F * var2.field1487;
							float var8 = (float)var2.field1485.field1483;
							float var12 = var2.field1485.field1488;
							float var7 = var8 - 0.33333334F * var2.field1485.field1484;
							float var11 = var12 - 0.33333334F * var2.field1485.field1482;
							float var13;
							float var14;
							float var15;
							float var16;
							float var17;
							float var18;
							float var19;
							if (var0.field1532) {
								var15 = var10;
								var16 = var11;
								if (var0 != null) {
									var17 = var8 - var5;
									if ((double)var17 != 0.0D) {
										var18 = var6 - var5;
										var19 = var7 - var5;
										float[] var27 = new float[]{var18 / var17, var19 / var17};
										var0.field1543 = 0.33333334F == var27[0] && var27[1] == 0.6666667F;
										float var21 = var27[0];
										float var22 = var27[1];
										if ((double)var27[0] < 0.0D) {
											var27[0] = 0.0F;
										}

										if ((double)var27[1] > 1.0D) {
											var27[1] = 1.0F;
										}

										if ((double)var27[0] > 1.0D || var27[1] < -1.0F) {
											UserComparator3.method2886(var27);
										}

										if (var21 != var27[0]) {
											var13 = var17 * var27[0] + var5;
											if ((double)var21 != 0.0D) {
												var15 = (var10 - var9) * var27[0] / var21 + var9;
											}
										}

										if (var22 != var27[1]) {
											var14 = var17 * var27[1] + var5;
											if (1.0D != (double)var22) {
												var16 = (float)((double)var12 - (double)(var12 - var11) * (1.0D - (double)var27[1]) / (1.0D - (double)var22));
											}
										}

										var0.field1538 = var5;
										var0.field1535 = var8;
										ParamComposition.method3847(0.0F, var27[0], var27[1], 1.0F, var0);
										float var23 = var15 - var9;
										float var24 = var16 - var15;
										float var25 = var12 - var16;
										float var26 = var24 - var23;
										var0.field1537 = var25 - var24 - var26;
										var0.field1546 = var26 + var26 + var26;
										var0.field1553 = var23 + var23 + var23;
										var0.field1544 = var9;
									}
								}
							} else if (var0 != null) {
								var0.field1538 = var5;
								var13 = var8 - var5;
								var14 = var12 - var9;
								var15 = var6 - var5;
								var16 = 0.0F;
								var17 = 0.0F;
								if ((double)var15 != 0.0D) {
									var16 = (var10 - var9) / var15;
								}

								var15 = var8 - var7;
								if (0.0D != (double)var15) {
									var17 = (var12 - var11) / var15;
								}

								var18 = 1.0F / (var13 * var13);
								var19 = var13 * var16;
								float var20 = var17 * var13;
								var0.field1540 = var18 * (var20 + var19 - var14 - var14) / var13;
								var0.field1541 = var18 * (var14 + var14 + var14 - var19 - var19 - var20);
								var0.field1542 = var16;
								var0.field1550 = var9;
							}

							var0.field1548 = false;
						}
					} else {
						var3 = true;
					}

					if (var3) {
						return var2.field1488;
					} else if (var4) {
						return (float)var2.field1483 != var1 && var2.field1485 != null ? var2.field1485.field1488 : var2.field1488;
					} else {
						return var0.field1532 ? NewStuff.method3703(var0, var1) : class165.method3402(var0, var1);
					}
				}
			}
		} else {
			return 0.0F;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1468252059"
	)
	public static void method1244(int var0) {
		MouseHandler.MouseHandler_idleCycles = var0;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZS)I",
		garbageValue = "-12497"
	)
	static int method1246(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.cycle;
			return 1;
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = PacketBufferNode.method5736(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_GETNUM) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = FontName.ItemContainer_getCount(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_TOTAL) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ObjectSound.method1947(var3, var4);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_SIZE) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GameEngine.getInvDefinition(var3).size;
				return 1;
			} else if (var0 == ScriptOpcodes.STAT) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.currentLevels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_BASE) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.levels[var3];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_XP) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.experience[var3];
				return 1;
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) {
					var3 = class36.Client_plane;
					var4 = AbstractArchive.baseX * 64 + (class136.localPlayer.x >> 7);
					var5 = class148.baseY * 64 + (class136.localPlayer.y >> 7);
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28);
					return 1;
				} else if (var0 == ScriptOpcodes.COORDX) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 >> 14 & 16383;
					return 1;
				} else if (var0 == ScriptOpcodes.COORDZ) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 >> 28;
					return 1;
				} else if (var0 == ScriptOpcodes.COORDY) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 & 16383;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) {
					Interpreter.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = PacketBufferNode.method5736(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) {
					Interpreter.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = FontName.ItemContainer_getCount(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) {
					Interpreter.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768;
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ObjectSound.method1947(var3, var4);
					return 1;
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) {
					if (Client.staffModLevel >= 2) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.rebootTimer;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_WORLD) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.worldId;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.runEnergy / 100;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.weight;
					return 1;
				} else if (var0 == ScriptOpcodes.PLAYERMOD) {
					if (Client.playerMod) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.worldProperties;
					return 1;
				} else if (var0 == ScriptOpcodes.MOVECOORD) {
					Interpreter.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
					int var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
					var3 += var4 << 14;
					var3 += var5 << 28;
					var3 += var6;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3;
					return 1;
				} else if (var0 == 3326) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field743;
					return 1;
				} else if (var0 == 3327) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field532;
					return 1;
				} else if (var0 == 3331) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.runEnergy;
					return 1;
				} else {
					return 2;
				}
			}
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "2112043439"
	)
	static int method1247(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
			Interpreter.Interpreter_intStackSize -= 2;
			Client.field787 = (short)GameObject.method5073(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
			if (Client.field787 <= 0) {
				Client.field787 = 256;
			}

			Client.field777 = (short)GameObject.method5073(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
			if (Client.field777 <= 0) {
				Client.field777 = 256;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
			Interpreter.Interpreter_intStackSize -= 2;
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			if (Client.zoomHeight <= 0) {
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			if (Client.zoomWidth <= 0) {
				Client.zoomWidth = 320;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
			Interpreter.Interpreter_intStackSize -= 4;
			Client.field791 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			if (Client.field791 <= 0) {
				Client.field791 = 1;
			}

			Client.field592 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			if (Client.field592 <= 0) {
				Client.field592 = 32767;
			} else if (Client.field592 < Client.field791) {
				Client.field592 = Client.field791;
			}

			Client.field759 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
			if (Client.field759 <= 0) {
				Client.field759 = 1;
			}

			Client.field794 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
			if (Client.field794 <= 0) {
				Client.field794 = 32767;
			} else if (Client.field794 < Client.field759) {
				Client.field794 = Client.field759;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
			if (Client.viewportWidget != null) {
				class31.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false);
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportWidth;
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportHeight;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomHeight;
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class159.method3337(Client.field787);
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class159.method3337(Client.field777);
			return 1;
		} else if (var0 == 6220) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOfferTotalQuantityComparator.canvasWidth;
			return 1;
		} else if (var0 == 6223) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapArchiveLoader.canvasHeight;
			return 1;
		} else {
			return 2;
		}
	}
}
