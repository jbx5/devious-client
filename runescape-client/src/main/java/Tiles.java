import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("ac")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("al")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1568637397
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("ab")
	@Export("Tiles_underlays2")
	static byte[][][] Tiles_underlays2;
	@ObfuscatedName("aa")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("ai")
	static final int[] field1036;
	@ObfuscatedName("ae")
	static final int[] field1037;
	@ObfuscatedName("aw")
	static final int[] field1038;
	@ObfuscatedName("aq")
	static final int[] field1033;
	@ObfuscatedName("az")
	static final int[] field1040;
	@ObfuscatedName("at")
	static final int[] field1042;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 823363237
	)
	@Export("rndHue")
	static int rndHue;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 418849099
	)
	@Export("rndLightness")
	static int rndLightness;
	@ObfuscatedName("gs")
	@ObfuscatedGetter(
		intValue = -1731271633
	)
	static int field1039;

	static {
		Tiles_heights = new int[4][105][105];
		Tiles_renderFlags = new byte[4][104][104];
		Tiles_minPlane = 99;
		field1036 = new int[]{1, 2, 4, 8};
		field1037 = new int[]{16, 32, 64, 128};
		field1038 = new int[]{1, 0, -1, 0};
		field1033 = new int[]{0, -1, 0, 1};
		field1040 = new int[]{1, -1, -1, 1};
		field1042 = new int[]{-1, -1, 1, 1};
		rndHue = (int)(Math.random() * 17.0D) - 8;
		rndLightness = (int)(Math.random() * 33.0D) - 16;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "-1109073895"
	)
	static void method2281(Component var0) {
		var0.addMouseListener(MouseHandler.MouseHandler_instance);
		var0.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var0.addFocusListener(MouseHandler.MouseHandler_instance);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luy;II)V",
		garbageValue = "90907201"
	)
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset;
		Players.Players_pendingUpdateCount = 0;
		GrandExchangeOfferTotalQuantityComparator.method7048(var0);

		for (int var3 = 0; var3 < Players.Players_pendingUpdateCount; ++var3) {
			int var4 = Players.Players_pendingUpdateIndices[var3];
			Player var5 = Client.players[var4];
			int var6 = var0.readUnsignedByte();
			if ((var6 & 1) != 0) {
				var6 += var0.readUnsignedByte() << 8;
			}

			if ((var6 & 4096) != 0) {
				var6 += var0.readUnsignedByte() << 16;
			}

			byte var7 = class231.field2429.field2430;
			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var13;
			int var15;
			int var27;
			if ((var6 & 128) != 0) {
				var8 = var0.readUnsignedByteAdd();
				if (var8 > 0) {
					for (var9 = 0; var9 < var8; ++var9) {
						var11 = -1;
						var12 = -1;
						var13 = -1;
						var10 = var0.readUShortSmart();
						if (var10 == 32767) {
							var10 = var0.readUShortSmart();
							var12 = var0.readUShortSmart();
							var11 = var0.readUShortSmart();
							var13 = var0.readUShortSmart();
						} else if (var10 != 32766) {
							var12 = var0.readUShortSmart();
						} else {
							var10 = -1;
						}

						var27 = var0.readUShortSmart();
						var5.addHitSplat(var10, var12, var11, var13, Client.cycle, var27);
					}
				}

				var9 = var0.readUnsignedByte();
				if (var9 > 0) {
					for (var10 = 0; var10 < var9; ++var10) {
						var11 = var0.readUShortSmart();
						var12 = var0.readUShortSmart();
						if (var12 != 32767) {
							var13 = var0.readUShortSmart();
							var27 = var0.readUnsignedByte();
							var15 = var12 > 0 ? var0.readUnsignedByteNeg() : var27;
							var5.addHealthBar(var11, Client.cycle, var12, var13, var27, var15);
						} else {
							var5.removeHealthBar(var11);
						}
					}
				}
			}

			if ((var6 & 65536) != 0) {
				var8 = var0.readUnsignedByteAdd();

				for (var9 = 0; var9 < var8; ++var9) {
					var10 = var0.readUnsignedByte();
					var11 = var0.readUnsignedShortLE();
					var12 = var0.readUnsignedIntLE();
					var5.updateSpotAnimation(var10, var11, var12 >> 16, var12 & 65535);
				}
			}

			if ((var6 & 16) != 0) {
				var5.targetIndex = var0.readUnsignedShortAdd();
				var5.targetIndex += var0.readUnsignedByteNeg() << 16;
				var8 = 16777215;
				if (var8 == var5.targetIndex) {
					var5.targetIndex = -1;
				}
			}

			if ((var6 & 1024) != 0) {
				class231[] var23 = Players.field1370;
				class231[] var24 = new class231[]{class231.field2426, class231.field2429, class231.field2428, class231.field2427};
				var23[var4] = (class231)SequenceDefinition.findEnumerated(var24, var0.readByte());
			}

			if ((var6 & 256) != 0) {
				var5.field1247 = Client.cycle + var0.readUnsignedShortLE();
				var5.field1248 = Client.cycle + var0.readUnsignedShortAdd();
				var5.field1249 = var0.readByteNeg();
				var5.field1250 = var0.readByteAdd();
				var5.field1251 = var0.readByteSub();
				var5.field1252 = (byte)var0.readUnsignedByteNeg();
			}

			if ((var6 & 2) != 0) {
				var5.overheadText = var0.readStringCp1252NullTerminated();
				if (var5.overheadText.charAt(0) == '~') {
					var5.overheadText = var5.overheadText.substring(1);
					class411.addGameMessage(2, var5.username.getName(), var5.overheadText);
				} else if (var5 == TextureProvider.localPlayer) {
					class411.addGameMessage(2, var5.username.getName(), var5.overheadText);
				}

				var5.field1207 = false;
				var5.field1255 = 0;
				var5.field1211 = 0;
				var5.overheadTextCyclesRemaining = 150;
			}

			if ((var6 & 16384) != 0) {
				var5.field1238 = var0.readByteAdd();
				var5.field1185 = var0.readByteSub();
				var5.field1239 = var0.readByte();
				var5.field1204 = var0.readByteAdd();
				var5.spotAnimation = var0.readUnsignedShortLE() + Client.cycle;
				var5.field1243 = var0.readUnsignedShort() + Client.cycle;
				var5.field1254 = var0.readUnsignedShortAdd();
				if (var5.field1124) {
					var5.field1238 += var5.tileX;
					var5.field1185 += var5.tileY;
					var5.field1239 += var5.tileX;
					var5.field1204 += var5.tileY;
					var5.pathLength = 0;
				} else {
					var5.field1238 += var5.pathX[0];
					var5.field1185 += var5.pathY[0];
					var5.field1239 += var5.pathX[0];
					var5.field1204 += var5.pathY[0];
					var5.pathLength = 1;
				}

				var5.field1261 = 0;
			}

			if ((var6 & 4) != 0) {
				var8 = var0.readUnsignedShortAdd();
				if (var8 == 65535) {
					var8 = -1;
				}

				var9 = var0.readUnsignedByteAdd();
				WorldMapEvent.performPlayerAnimation(var5, var8, var9);
			}

			if ((var6 & 2048) != 0) {
				for (var8 = 0; var8 < 3; ++var8) {
					var5.actions[var8] = var0.readStringCp1252NullTerminated();
				}
			}

			if ((var6 & 32) != 0) {
				var5.field1223 = var0.readUnsignedShortAddLE();
				if (var5.pathLength == 0) {
					var5.orientation = var5.field1223;
					var5.method2430();
				}
			}

			if ((var6 & 8) != 0) {
				var8 = var0.readUnsignedShortAddLE();
				PlayerType var25 = (PlayerType)SequenceDefinition.findEnumerated(class183.PlayerType_values(), var0.readUnsignedByte());
				boolean var30 = var0.readUnsignedByteSub() == 1;
				var11 = var0.readUnsignedByteNeg();
				var12 = var0.offset;
				if (var5.username != null && var5.appearance != null) {
					boolean var31 = false;
					if (var25.isUser && InvDefinition.friendSystem.isIgnored(var5.username)) {
						var31 = true;
					}

					if (!var31 && Client.field790 == 0 && !var5.isHidden) {
						Players.field1371.offset = 0;
						var0.method9263(Players.field1371.array, 0, var11);
						Players.field1371.offset = 0;
						String var14 = AbstractFont.escapeBrackets(HealthBarUpdate.method2462(class172.method3430(Players.field1371)));
						var5.overheadText = var14.trim();
						var5.field1255 = var8 >> 8;
						var5.field1211 = var8 & 255;
						var5.overheadTextCyclesRemaining = 150;
						var5.field1194 = null;
						var5.field1207 = var30;
						var5.field1246 = var5 != TextureProvider.localPlayer && var25.isUser && !Client.field752.isEmpty() && var14.toLowerCase().indexOf(Client.field752) == -1;
						if (var25.isPrivileged) {
							var15 = var30 ? 91 : 1;
						} else {
							var15 = var30 ? 90 : 2;
						}

						if (var25.modIcon != -1) {
							class411.addGameMessage(var15, class436.method7916(var25.modIcon) + var5.username.getName(), var14);
						} else {
							class411.addGameMessage(var15, var5.username.getName(), var14);
						}
					}
				}

				var0.offset = var11 + var12;
			}

			if ((var6 & 512) != 0) {
				var8 = var0.readUnsignedShortAdd();
				var9 = var8 >> 8;
				var10 = var9 >= 13 && var9 <= 20 ? var9 - 12 : 0;
				PlayerType var26 = (PlayerType)SequenceDefinition.findEnumerated(class183.PlayerType_values(), var0.readUnsignedByte());
				boolean var32 = var0.readUnsignedByteSub() == 1;
				var13 = var0.readUnsignedByte();
				var27 = var0.offset;
				if (var5.username != null && var5.appearance != null) {
					boolean var33 = false;
					if (var26.isUser && InvDefinition.friendSystem.isIgnored(var5.username)) {
						var33 = true;
					}

					if (!var33 && Client.field790 == 0 && !var5.isHidden) {
						Players.field1371.offset = 0;
						var0.readBytes(Players.field1371.array, 0, var13);
						Players.field1371.offset = 0;
						String var16 = AbstractFont.escapeBrackets(HealthBarUpdate.method2462(class172.method3430(Players.field1371)));
						var5.overheadText = var16.trim();
						var5.field1255 = var8 >> 8;
						var5.field1211 = var8 & 255;
						var5.overheadTextCyclesRemaining = 150;
						byte[] var17 = null;
						if (var10 > 0 && var10 <= 8) {
							var17 = new byte[var10];

							for (int var18 = 0; var18 < var10; ++var18) {
								var17[var18] = var0.readByteAdd();
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

								if (var20[var22] < 0 || var20[var22] > class553.field5289.length) {
									var19 = null;
									break;
								}

								var21[var22] = class553.field5289[var20[var22]];
								++var22;
							}
						} else {
							var19 = null;
						}

						var5.field1194 = var19;
						var5.field1207 = var32;
						var5.field1246 = var5 != TextureProvider.localPlayer && var26.isUser && !Client.field752.isEmpty() && var16.toLowerCase().indexOf(Client.field752) == -1;
						int var29;
						if (var26.isPrivileged) {
							var29 = var32 ? 91 : 1;
						} else {
							var29 = var32 ? 90 : 2;
						}

						if (var26.modIcon != -1) {
							class411.addGameMessage(var29, class436.method7916(var26.modIcon) + var5.username.getName(), var16);
						} else {
							class411.addGameMessage(var29, var5.username.getName(), var16);
						}
					}
				}

				var0.offset = var13 + var27 + var10;
			}

			if ((var6 & 64) != 0) {
				var8 = var0.readUnsignedByteNeg();
				byte[] var36 = new byte[var8];
				Buffer var35 = new Buffer(var36);
				var0.method9326(var36, 0, var8);
				Players.field1373[var4] = var35;
				var5.read(var35);
			}

			if ((var6 & 8192) != 0) {
				var7 = var0.readByte();
			}

			if (var5.field1124) {
				if (var7 == 127) {
					var5.resetPath(var5.tileX, var5.tileY);
				} else {
					class231 var34;
					if (var7 != class231.field2429.field2430) {
						class231[] var37 = new class231[]{class231.field2426, class231.field2429, class231.field2428, class231.field2427};
						var34 = (class231)SequenceDefinition.findEnumerated(var37, var7);
					} else {
						var34 = Players.field1370[var4];
					}

					var5.method2374(var5.tileX, var5.tileY, var34);
				}
			}
		}

		if (var0.offset - var2 != var1) {
			throw new RuntimeException(var0.offset - var2 + " " + var1);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIILjt;[Lih;)V"
	)
	static final void method2231(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
		Buffer var10 = new Buffer(var0);
		int var11 = -1;

		while (true) {
			int var12 = var10.readIncrSmallSmart();
			if (var12 == 0) {
				return;
			}

			var11 += var12;
			int var13 = 0;

			while (true) {
				int var14 = var10.readUShortSmart();
				if (var14 == 0) {
					break;
				}

				var13 += var14 - 1;
				int var15 = var13 & 63;
				int var16 = var13 >> 6 & 63;
				int var17 = var13 >> 12;
				int var18 = var10.readUnsignedByte();
				int var19 = var18 >> 2;
				int var20 = var18 & 3;
				if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
					ObjectComposition var21 = class91.getObjectDefinition(var11);
					int var22 = var2 + class153.method3220(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20);
					int var25 = var16 & 7;
					int var26 = var15 & 7;
					int var28 = var21.sizeX;
					int var29 = var21.sizeY;
					int var30;
					if ((var20 & 1) == 1) {
						var30 = var28;
						var28 = var29;
						var29 = var30;
					}

					int var27 = var7 & 3;
					int var24;
					if (var27 == 0) {
						var24 = var26;
					} else if (var27 == 1) {
						var24 = 7 - var25 - (var28 - 1);
					} else if (var27 == 2) {
						var24 = 7 - var26 - (var29 - 1);
					} else {
						var24 = var25;
					}

					var30 = var24 + var3;
					if (var22 > 0 && var30 > 0 && var22 < 103 && var30 < 103) {
						int var31 = var1;
						if ((Tiles_renderFlags[1][var22][var30] & 2) == 2) {
							var31 = var1 - 1;
						}

						CollisionMap var32 = null;
						if (var31 >= 0) {
							var32 = var9[var31];
						}

						class314.addObjects(var1, var22, var30, var11, var20 + var7 & 3, var19, var8, var32);
					}
				}
			}
		}
	}
}
