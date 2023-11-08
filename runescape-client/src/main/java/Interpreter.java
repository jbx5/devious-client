import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("ao")
	@Export("Interpreter_intLocals")
	static int[] Interpreter_intLocals;
	@ObfuscatedName("ab")
	@Export("Tiles_overlays")
	static short[][][] Tiles_overlays;
	@ObfuscatedName("au")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("aa")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("ac")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("az")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1870568525
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Lcs;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;
	@ObfuscatedName("aq")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("ai")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("ae")
	static boolean field846;
	@ObfuscatedName("an")
	static boolean field842;
	@ObfuscatedName("ag")
	static ArrayList field847;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1157651787
	)
	static int field849;
	@ObfuscatedName("bl")
	static final double field852;
	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;

	static {
		Interpreter_arrayLengths = new int[5];
		Interpreter_arrays = new int[5][5000];
		Interpreter_intStack = new int[1000];
		Interpreter_stringStack = new String[1000];
		Interpreter_frameDepth = 0;
		Interpreter_frames = new ScriptFrame[50];
		Interpreter_calendar = java.util.Calendar.getInstance();
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		field846 = false;
		field842 = false;
		field847 = new ArrayList();
		field849 = 0;
		field852 = Math.log(2.0D);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Luo;II)V",
		garbageValue = "593247130"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset;
		Players.Players_pendingUpdateCount = 0;
		class221.method4304(var0);

		for (int var3 = 0; var3 < Players.Players_pendingUpdateCount; ++var3) {
			int var4 = Players.Players_pendingUpdateIndices[var3];
			Player var5 = Client.players[var4];
			int var6 = var0.readUnsignedByte();
			if ((var6 & 128) != 0) {
				var6 += var0.readUnsignedByte() << 8;
			}

			if ((var6 & 16384) != 0) {
				var6 += var0.readUnsignedByte() << 16;
			}

			byte var7 = class228.field2412.field2414;
			if ((var6 & 512) != 0) {
				var7 = var0.readByteSub();
			}

			if ((var6 & 1024) != 0) {
				class228[] var8 = Players.field1356;
				class228[] var10 = new class228[]{class228.field2409, class228.field2412, class228.field2408, class228.field2410};
				var8[var4] = (class228)class12.findEnumerated(var10, var0.readByteNeg());
			}

			if ((var6 & 4) != 0) {
				var5.field1208 = var0.readUnsignedShort();
				if (var5.pathLength == 0) {
					var5.orientation = var5.field1208;
					var5.method2480();
				}
			}

			if ((var6 & 4096) != 0) {
				var5.field1209 = var0.readByteNeg();
				var5.field1194 = var0.readByteNeg();
				var5.field1224 = var0.readByte();
				var5.field1203 = var0.readByteNeg();
				var5.spotAnimation = var0.readUnsignedShort() + Client.cycle;
				var5.field1187 = var0.readUnsignedShort() + Client.cycle;
				var5.field1229 = var0.readUnsignedShort();
				if (var5.field1122) {
					var5.field1209 += var5.tileX;
					var5.field1194 += var5.tileY;
					var5.field1224 += var5.tileX;
					var5.field1203 += var5.tileY;
					var5.pathLength = 0;
				} else {
					var5.field1209 += var5.pathX[0];
					var5.field1194 += var5.pathY[0];
					var5.field1224 += var5.pathX[0];
					var5.field1203 += var5.pathY[0];
					var5.pathLength = 1;
				}

				var5.field1220 = 0;
			}

			int var23;
			if ((var6 & 8192) != 0) {
				for (var23 = 0; var23 < 3; ++var23) {
					var5.actions[var23] = var0.readStringCp1252NullTerminated();
				}
			}

			int var9;
			int var13;
			int var14;
			int var24;
			if ((var6 & 2048) != 0) {
				var23 = var0.readUnsignedShortAddLE();
				var9 = var23 >> 8;
				var24 = var9 >= 13 && var9 <= 20 ? var9 - 12 : 0;
				PlayerType var11 = (PlayerType)class12.findEnumerated(class320.PlayerType_values(), var0.readUnsignedByteAdd());
				boolean var12 = var0.readUnsignedByte() == 1;
				var13 = var0.readUnsignedByte();
				var14 = var0.offset;
				if (var5.username != null && var5.appearance != null) {
					boolean var15 = false;
					if (var11.isUser && class12.friendSystem.isIgnored(var5.username)) {
						var15 = true;
					}

					if (!var15 && Client.field736 == 0 && !var5.isHidden) {
						Players.field1367.offset = 0;
						var0.method9321(Players.field1367.array, 0, var13);
						Players.field1367.offset = 0;
						String var16 = AbstractFont.escapeBrackets(class20.method303(class128.method3076(Players.field1367)));
						var5.overheadText = var16.trim();
						var5.field1196 = var23 >> 8;
						var5.field1197 = var23 & 255;
						var5.overheadTextCyclesRemaining = 150;
						byte[] var17 = null;
						if (var24 > 0 && var24 <= 8) {
							var17 = new byte[var24];

							for (int var18 = 0; var18 < var24; ++var18) {
								var17[var18] = var0.readByte();
							}
						}

						byte[] var20 = var17;
						int[] var19;
						if (var17 != null && var17.length != 0 && var17.length <= 8) {
							int[] var21 = new int[var17.length];
							int var22 = 0;

							while (true) {
								if (var22 >= var20.length) {
									var19 = var21;
									break;
								}

								if (var20[var22] < 0 || var20[var22] > class550.field5294.length) {
									var19 = null;
									break;
								}

								var21[var22] = class550.field5294[var20[var22]];
								++var22;
							}
						} else {
							var19 = null;
						}

						var5.field1236 = var19;
						var5.field1206 = var12;
						var5.field1174 = var5 != class229.localPlayer && var11.isUser && !Client.field694.isEmpty() && var16.toLowerCase().indexOf(Client.field694) == -1;
						int var26;
						if (var11.isPrivileged) {
							var26 = var12 ? 91 : 1;
						} else {
							var26 = var12 ? 90 : 2;
						}

						if (var11.modIcon != -1) {
							GrandExchangeOfferUnitPriceComparator.addGameMessage(var26, FloorUnderlayDefinition.method3799(var11.modIcon) + var5.username.getName(), var16);
						} else {
							GrandExchangeOfferUnitPriceComparator.addGameMessage(var26, var5.username.getName(), var16);
						}
					}
				}

				var0.offset = var24 + var13 + var14;
			}

			int var28;
			int var32;
			if ((var6 & 65536) != 0) {
				var23 = var0.readUnsignedByteSub();

				for (var9 = 0; var9 < var23; ++var9) {
					var24 = var0.readUnsignedByteNeg();
					var28 = var0.readUnsignedShort();
					var32 = var0.readUnsignedIntIME();
					var5.updateSpotAnimation(var24, var28, var32 >> 16, var32 & 65535);
				}
			}

			if ((var6 & 32) != 0) {
				var5.overheadText = var0.readStringCp1252NullTerminated();
				if (var5.overheadText.charAt(0) == '~') {
					var5.overheadText = var5.overheadText.substring(1);
					GrandExchangeOfferUnitPriceComparator.addGameMessage(2, var5.username.getName(), var5.overheadText);
				} else if (var5 == class229.localPlayer) {
					GrandExchangeOfferUnitPriceComparator.addGameMessage(2, var5.username.getName(), var5.overheadText);
				}

				var5.field1206 = false;
				var5.field1196 = 0;
				var5.field1197 = 0;
				var5.overheadTextCyclesRemaining = 150;
			}

			int var34;
			if ((var6 & 16) != 0) {
				var23 = var0.readUnsignedByteAdd();
				if (var23 > 0) {
					for (var9 = 0; var9 < var23; ++var9) {
						var28 = -1;
						var32 = -1;
						var13 = -1;
						var24 = var0.readUShortSmart();
						if (var24 == 32767) {
							var24 = var0.readUShortSmart();
							var32 = var0.readUShortSmart();
							var28 = var0.readUShortSmart();
							var13 = var0.readUShortSmart();
						} else if (var24 != 32766) {
							var32 = var0.readUShortSmart();
						} else {
							var24 = -1;
						}

						var14 = var0.readUShortSmart();
						var5.addHitSplat(var24, var32, var28, var13, Client.cycle, var14);
					}
				}

				var9 = var0.readUnsignedByte();
				if (var9 > 0) {
					for (var24 = 0; var24 < var9; ++var24) {
						var28 = var0.readUShortSmart();
						var32 = var0.readUShortSmart();
						if (var32 != 32767) {
							var13 = var0.readUShortSmart();
							var14 = var0.readUnsignedByteAdd();
							var34 = var32 > 0 ? var0.readUnsignedByteSub() : var14;
							var5.addHealthBar(var28, Client.cycle, var32, var13, var14, var34);
						} else {
							var5.removeHealthBar(var28);
						}
					}
				}
			}

			if ((var6 & 2) != 0) {
				var23 = var0.readUnsignedByteAdd();
				byte[] var27 = new byte[var23];
				Buffer var31 = new Buffer(var27);
				var0.method9375(var27, 0, var23);
				Players.field1357[var4] = var31;
				var5.read(var31);
			}

			if ((var6 & 1) != 0) {
				var23 = var0.readUnsignedShortAddLE();
				if (var23 == 65535) {
					var23 = -1;
				}

				var9 = var0.readUnsignedByteNeg();
				WorldMapLabelSize.performPlayerAnimation(var5, var23, var9);
			}

			if ((var6 & 64) != 0) {
				var5.targetIndex = var0.readUnsignedShort();
				var5.targetIndex += var0.readUnsignedByteSub() << 16;
				var23 = 16777215;
				if (var23 == var5.targetIndex) {
					var5.targetIndex = -1;
				}
			}

			if ((var6 & 8) != 0) {
				var23 = var0.readUnsignedShortLE();
				PlayerType var36 = (PlayerType)class12.findEnumerated(class320.PlayerType_values(), var0.readUnsignedByteNeg());
				boolean var35 = var0.readUnsignedByteAdd() == 1;
				var28 = var0.readUnsignedByte();
				var32 = var0.offset;
				if (var5.username != null && var5.appearance != null) {
					boolean var33 = false;
					if (var36.isUser && class12.friendSystem.isIgnored(var5.username)) {
						var33 = true;
					}

					if (!var33 && Client.field736 == 0 && !var5.isHidden) {
						Players.field1367.offset = 0;
						var0.readBytes(Players.field1367.array, 0, var28);
						Players.field1367.offset = 0;
						String var29 = AbstractFont.escapeBrackets(class20.method303(class128.method3076(Players.field1367)));
						var5.overheadText = var29.trim();
						var5.field1196 = var23 >> 8;
						var5.field1197 = var23 & 255;
						var5.overheadTextCyclesRemaining = 150;
						var5.field1236 = null;
						var5.field1206 = var35;
						var5.field1174 = var5 != class229.localPlayer && var36.isUser && !Client.field694.isEmpty() && var29.toLowerCase().indexOf(Client.field694) == -1;
						if (var36.isPrivileged) {
							var34 = var35 ? 91 : 1;
						} else {
							var34 = var35 ? 90 : 2;
						}

						if (var36.modIcon != -1) {
							GrandExchangeOfferUnitPriceComparator.addGameMessage(var34, FloorUnderlayDefinition.method3799(var36.modIcon) + var5.username.getName(), var29);
						} else {
							GrandExchangeOfferUnitPriceComparator.addGameMessage(var34, var5.username.getName(), var29);
						}
					}
				}

				var0.offset = var28 + var32;
			}

			if ((var6 & 256) != 0) {
				var5.field1232 = Client.cycle + var0.readUnsignedShortLE();
				var5.field1215 = Client.cycle + var0.readUnsignedShortAddLE();
				var5.field1234 = var0.readByteAdd();
				var5.field1235 = var0.readByteNeg();
				var5.field1171 = var0.readByteSub();
				var5.field1237 = (byte)var0.readUnsignedByteSub();
			}

			if (var5.field1122) {
				if (var7 == 127) {
					var5.resetPath(var5.tileX, var5.tileY);
				} else {
					class228 var30;
					if (var7 != class228.field2412.field2414) {
						class228[] var37 = new class228[]{class228.field2409, class228.field2412, class228.field2408, class228.field2410};
						var30 = (class228)class12.findEnumerated(var37, var7);
					} else {
						var30 = Players.field1356[var4];
					}

					var5.method2398(var5.tileX, var5.tileY, var30);
				}
			}
		}

		if (var0.offset - var2 != var1) {
			throw new RuntimeException(var0.offset - var2 + " " + var1);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIIIILkf;Liw;B)V",
		garbageValue = "-60"
	)
	@Export("addObjects")
	static final void addObjects(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) {
			if (var0 < Tiles.Tiles_minPlane) {
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = WorldMapSection2.getObjectDefinition(var3);
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
			int var16 = var15[var12][var14] + var15[var11][var13] + var15[var12][var13] + var15[var11][var14] >> 2;
			int var17 = (var1 << 7) + (var9 << 6);
			int var18 = (var2 << 7) + (var10 << 6);
			long var19 = Player.calculateTag(var1, var2, 2, var8.int1 == 0, var3);
			int var21 = var5 + (var4 << 6);
			if (var8.int3 == 1) {
				var21 += 256;
			}

			if (var8.hasSound()) {
				UrlRequester.createObjectSound(var0, var1, var2, var8, var4);
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

						var6.method5334(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21);
						if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
							var10000 = class344.field3814[var0][var1];
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

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1006[var4], 0, var19, var21);
						if (var4 == 0) {
							if (var8.clipped) {
								class93.Tiles_underlays2[var0][var1][var2] = 50;
								class93.Tiles_underlays2[var0][var1][var2 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = class344.field3814[var0][var1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 1) {
							if (var8.clipped) {
								class93.Tiles_underlays2[var0][var1][var2 + 1] = 50;
								class93.Tiles_underlays2[var0][var1 + 1][var2 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = class344.field3814[var0][var1];
								var10000[1 + var2] |= 1170;
							}
						} else if (var4 == 2) {
							if (var8.clipped) {
								class93.Tiles_underlays2[var0][var1 + 1][var2] = 50;
								class93.Tiles_underlays2[var0][var1 + 1][var2 + 1] = 50;
							}

							if (var8.modelClipped) {
								var10000 = class344.field3814[var0][var1 + 1];
								var10000[var2] |= 585;
							}
						} else if (var4 == 3) {
							if (var8.clipped) {
								class93.Tiles_underlays2[var0][var1][var2] = 50;
								class93.Tiles_underlays2[var0][var1 + 1][var2] = 50;
							}

							if (var8.modelClipped) {
								var10000 = class344.field3814[var0][var1];
								var10000[var2] |= 1170;
							}
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.method4349(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) {
							var6.method5340(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 1) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var29 = var8.getEntity(1, var4, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1005[var4], 0, var19, var21);
						if (var8.clipped) {
							if (var4 == 0) {
								class93.Tiles_underlays2[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) {
								class93.Tiles_underlays2[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) {
								class93.Tiles_underlays2[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) {
								class93.Tiles_underlays2[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.method4349(var1, var2, var5, var4, var8.boolean1);
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

							var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var30, (Renderable)var24, Tiles.field1006[var4], Tiles.field1006[var22], var19, var21);
							if (var8.modelClipped) {
								if (var4 == 0) {
									var10000 = class344.field3814[var0][var1];
									var10000[var2] |= 585;
									var10000 = class344.field3814[var0][var1];
									var10000[var2 + 1] |= 1170;
								} else if (var4 == 1) {
									var10000 = class344.field3814[var0][var1];
									var10000[1 + var2] |= 1170;
									var10000 = class344.field3814[var0][var1 + 1];
									var10000[var2] |= 585;
								} else if (var4 == 2) {
									var10000 = class344.field3814[var0][var1 + 1];
									var10000[var2] |= 585;
									var10000 = class344.field3814[var0][var1];
									var10000[var2] |= 1170;
								} else if (var4 == 3) {
									var10000 = class344.field3814[var0][var1];
									var10000[var2] |= 1170;
									var10000 = class344.field3814[var0][var1];
									var10000[var2] |= 585;
								}
							}

							if (var8.interactType != 0 && var7 != null) {
								var7.method4349(var1, var2, var5, var4, var8.boolean1);
							}

							if (var8.int2 != 16) {
								var6.method5340(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 3) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var29 = var8.getEntity(3, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1005[var4], 0, var19, var21);
							if (var8.clipped) {
								if (var4 == 0) {
									class93.Tiles_underlays2[var0][var1][var2 + 1] = 50;
								} else if (var4 == 1) {
									class93.Tiles_underlays2[var0][var1 + 1][var2 + 1] = 50;
								} else if (var4 == 2) {
									class93.Tiles_underlays2[var0][var1 + 1][var2] = 50;
								} else if (var4 == 3) {
									class93.Tiles_underlays2[var0][var1][var2] = 50;
								}
							}

							if (var8.interactType != 0 && var7 != null) {
								var7.method4349(var1, var2, var5, var4, var8.boolean1);
							}

						} else if (var5 == 9) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var29 = var8.getEntity(var5, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var6.method5334(var0, var1, var2, var16, 1, 1, (Renderable)var29, 0, var19, var21);
							if (var8.interactType != 0 && var7 != null) {
								var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
							}

							if (var8.int2 != 16) {
								var6.method5340(var0, var1, var2, var8.int2);
							}

						} else if (var5 == 4) {
							if (var8.animationId == -1 && var8.transforms == null) {
								var29 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var29 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var29, (Renderable)null, Tiles.field1006[var4], 0, 0, 0, var19, var21);
						} else {
							long var23;
							Object var25;
							if (var5 == 5) {
								var22 = 16;
								var23 = var6.getBoundaryObjectTag(var0, var1, var2);
								if (0L != var23) {
									var22 = WorldMapSection2.getObjectDefinition(class232.Entity_unpackID(var23)).int2;
								}

								if (var8.animationId == -1 && var8.transforms == null) {
									var25 = var8.getEntity(4, var4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, Tiles.field1006[var4], 0, var22 * Tiles.field1010[var4], var22 * Tiles.field1007[var4], var19, var21);
							} else if (var5 == 6) {
								var22 = 8;
								var23 = var6.getBoundaryObjectTag(var0, var1, var2);
								if (var23 != 0L) {
									var22 = WorldMapSection2.getObjectDefinition(class232.Entity_unpackID(var23)).int2 / 2;
								}

								if (var8.animationId == -1 && var8.transforms == null) {
									var25 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
								} else {
									var25 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
								}

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)null, 256, var4, var22 * Tiles.field1008[var4], var22 * Tiles.field1009[var4], var19, var21);
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
								if (var23 != 0L) {
									var22 = WorldMapSection2.getObjectDefinition(class232.Entity_unpackID(var23)).int2 / 2;
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

								var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var25, (Renderable)var26, 256, var4, var22 * Tiles.field1008[var4], var22 * Tiles.field1009[var4], var19, var21);
							}
						}
					}
				} else {
					if (var8.animationId == -1 && var8.transforms == null) {
						var29 = var8.getEntity(10, var4, var15, var17, var16, var18);
					} else {
						var29 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.boolean3, (Renderable)null);
					}

					if (var29 != null && var6.method5334(var0, var1, var2, var16, var9, var10, (Renderable)var29, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) {
						var28 = 15;
						if (var29 instanceof Model) {
							var28 = ((Model)var29).method5569() / 4;
							if (var28 > 30) {
								var28 = 30;
							}
						}

						for (int var31 = 0; var31 <= var9; ++var31) {
							for (int var32 = 0; var32 <= var10; ++var32) {
								if (var28 > class93.Tiles_underlays2[var0][var31 + var1][var32 + var2]) {
									class93.Tiles_underlays2[var0][var31 + var1][var32 + var2] = (byte)var28;
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
}
