import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oy")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("LIVE")
	static final GameBuild LIVE;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("RC")
	static final GameBuild RC;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	@Export("WIP")
	static final GameBuild WIP;
	@ObfuscatedName("tq")
	@ObfuscatedGetter(
		intValue = 501795079
	)
	static int field3978;
	@ObfuscatedName("ar")
	@Export("name")
	public final String name;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2048598199
	)
	@Export("buildId")
	final int buildId;

	static {
		LIVE = new GameBuild("LIVE", 0);
		BUILDLIVE = new GameBuild("BUILDLIVE", 3);
		RC = new GameBuild("RC", 1);
		WIP = new GameBuild("WIP", 2);
	}

	GameBuild(String var1, int var2) {
		this.name = var1;
		this.buildId = var2;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lun;ILdj;IB)V",
		garbageValue = "97"
	)
	static final void method6999(PacketBuffer var0, int var1, Player var2, int var3) {
		byte var4 = class233.field2471.field2473;
		if ((var3 & 4096) != 0) {
			var2.field1257 = var0.readByteSub();
			var2.field1259 = var0.readByteSub();
			var2.field1258 = var0.readByteSub();
			var2.field1248 = var0.readByteNeg();
			var2.spotAnimation = var0.readUnsignedShort() + Client.cycle;
			var2.field1271 = var0.readUnsignedShortAddLE() + Client.cycle;
			var2.field1223 = var0.readUnsignedShortAdd();
			if (var2.field1147) {
				var2.field1257 += var2.tileX;
				var2.field1259 += var2.tileY;
				var2.field1258 += var2.tileX;
				var2.field1248 += var2.tileY;
				var2.pathLength = 0;
			} else {
				var2.field1257 += var2.pathX[0];
				var2.field1259 += var2.pathY[0];
				var2.field1258 += var2.pathX[0];
				var2.field1248 += var2.pathY[0];
				var2.pathLength = 1;
			}

			var2.field1280 = 0;
		}

		if ((var3 & 16384) != 0) {
			var2.field1262 = Client.cycle + var0.readUnsignedShortAdd();
			var2.field1278 = Client.cycle + var0.readUnsignedShortAddLE();
			var2.field1268 = var0.readByteAdd();
			var2.field1269 = var0.readByteAdd();
			var2.field1276 = var0.readByte();
			var2.field1255 = (byte)var0.readUnsignedByteSub();
		}

		int var5;
		if ((var3 & 8) != 0) {
			var2.targetIndex = var0.readUnsignedShortLE();
			var2.targetIndex += var0.readUnsignedByteSub() << 16;
			var5 = 16777215;
			if (var2.targetIndex == var5) {
				var2.targetIndex = -1;
			}
		}

		int var6;
		if ((var3 & 128) != 0) {
			var5 = var0.readUnsignedShortLE();
			if (var5 == 65535) {
				var5 = -1;
			}

			var6 = var0.readUnsignedByte();
			class485.performPlayerAnimation(var2, var5, var6);
		}

		if ((var3 & 32) != 0) {
			var5 = var0.readUnsignedByteAdd();
			byte[] var16 = new byte[var5];
			Buffer var7 = new Buffer(var16);
			var0.method9562(var16, 0, var5);
			Players.field1389[var1] = var7;
			var2.read(var7);
		}

		if ((var3 & 2) != 0) {
			var2.overheadText = var0.readStringCp1252NullTerminated();
			if (var2.overheadText.charAt(0) == '~') {
				var2.overheadText = var2.overheadText.substring(1);
				class209.addGameMessage(2, var2.username.getName(), var2.overheadText);
			} else if (var2 == VarpDefinition.localPlayer) {
				class209.addGameMessage(2, var2.username.getName(), var2.overheadText);
			}

			var2.field1228 = false;
			var2.field1208 = 0;
			var2.field1231 = 0;
			var2.overheadTextCyclesRemaining = 150;
		}

		if ((var3 & 256) != 0) {
			class233[] var17 = Players.field1378;
			class233[] var21 = new class233[]{class233.field2472, class233.field2469, class233.field2470, class233.field2471};
			var17[var1] = (class233)class356.findEnumerated(var21, var0.readByte());
		}

		int var8;
		int var9;
		int var10;
		int var12;
		int var18;
		int var20;
		if ((var3 & 4) != 0) {
			var5 = var0.readUnsignedByte();
			if (var5 > 0) {
				for (var6 = 0; var6 < var5; ++var6) {
					var8 = -1;
					var9 = -1;
					var10 = -1;
					var18 = var0.readUShortSmart();
					if (var18 == 32767) {
						var18 = var0.readUShortSmart();
						var9 = var0.readUShortSmart();
						var8 = var0.readUShortSmart();
						var10 = var0.readUShortSmart();
					} else if (var18 != 32766) {
						var9 = var0.readUShortSmart();
					} else {
						var18 = -1;
					}

					var20 = var0.readUShortSmart();
					var2.addHitSplat(var18, var9, var8, var10, Client.cycle, var20);
				}
			}

			var6 = var0.readUnsignedByte();
			if (var6 > 0) {
				for (var18 = 0; var18 < var6; ++var18) {
					var8 = var0.readUShortSmart();
					var9 = var0.readUShortSmart();
					if (var9 != 32767) {
						var10 = var0.readUShortSmart();
						var20 = var0.readUnsignedByteAdd();
						var12 = var9 > 0 ? var0.readUnsignedByteNeg() : var20;
						var2.addHealthBar(var8, Client.cycle, var9, var10, var20, var12);
					} else {
						var2.removeHealthBar(var8);
					}
				}
			}
		}

		if ((var3 & 64) != 0) {
			var5 = var0.readUnsignedShortAdd();
			PlayerType var25 = (PlayerType)class356.findEnumerated(FontName.PlayerType_values(), var0.readUnsignedByte());
			boolean var28 = var0.readUnsignedByte() == 1;
			var8 = var0.readUnsignedByte();
			var9 = var0.offset;
			if (var2.username != null && var2.appearance != null) {
				boolean var23 = false;
				if (var25.isUser && InterfaceParent.friendSystem.isIgnored(var2.username)) {
					var23 = true;
				}

				if (!var23 && Client.field649 == 0 && !var2.isHidden) {
					Players.field1381.offset = 0;
					var0.readBytes(Players.field1381.array, 0, var8);
					Players.field1381.offset = 0;
					String var11 = AbstractFont.escapeBrackets(ClanChannel.method3490(class495.method8856(Players.field1381)));
					var2.overheadText = var11.trim();
					var2.field1208 = var5 >> 8;
					var2.field1231 = var5 & 255;
					var2.overheadTextCyclesRemaining = 150;
					var2.field1226 = null;
					var2.field1228 = var28;
					var2.field1205 = var2 != VarpDefinition.localPlayer && var25.isUser && !Client.field643.isEmpty() && var11.toLowerCase().indexOf(Client.field643) == -1;
					if (var25.isPrivileged) {
						var12 = var28 ? 91 : 1;
					} else {
						var12 = var28 ? 90 : 2;
					}

					if (var25.modIcon != -1) {
						class209.addGameMessage(var12, class415.method7833(var25.modIcon) + var2.username.getName(), var11);
					} else {
						class209.addGameMessage(var12, var2.username.getName(), var11);
					}
				}
			}

			var0.offset = var9 + var8;
		}

		if ((var3 & 512) != 0) {
			var5 = var0.readUnsignedShort();
			var6 = var5 >> 8;
			var18 = var6 >= 13 && var6 <= 20 ? var6 - 12 : 0;
			PlayerType var19 = (PlayerType)class356.findEnumerated(FontName.PlayerType_values(), var0.readUnsignedByteSub());
			boolean var22 = var0.readUnsignedByte() == 1;
			var10 = var0.readUnsignedByteAdd();
			var20 = var0.offset;
			if (var2.username != null && var2.appearance != null) {
				boolean var24 = false;
				if (var19.isUser && InterfaceParent.friendSystem.isIgnored(var2.username)) {
					var24 = true;
				}

				if (!var24 && Client.field649 == 0 && !var2.isHidden) {
					Players.field1381.offset = 0;
					var0.method9531(Players.field1381.array, 0, var10);
					Players.field1381.offset = 0;
					String var13 = AbstractFont.escapeBrackets(ClanChannel.method3490(class495.method8856(Players.field1381)));
					var2.overheadText = var13.trim();
					var2.field1208 = var5 >> 8;
					var2.field1231 = var5 & 255;
					var2.overheadTextCyclesRemaining = 150;
					byte[] var14 = null;
					int var15;
					if (var18 > 0 && var18 <= 8) {
						var14 = new byte[var18];

						for (var15 = 0; var15 < var18; ++var15) {
							var14[var15] = var0.readByteSub();
						}
					}

					var2.field1226 = class321.method6147(var14);
					var2.field1228 = var22;
					var2.field1205 = var2 != VarpDefinition.localPlayer && var19.isUser && !Client.field643.isEmpty() && var13.toLowerCase().indexOf(Client.field643) == -1;
					if (var19.isPrivileged) {
						var15 = var22 ? 91 : 1;
					} else {
						var15 = var22 ? 90 : 2;
					}

					if (var19.modIcon != -1) {
						class209.addGameMessage(var15, class415.method7833(var19.modIcon) + var2.username.getName(), var13);
					} else {
						class209.addGameMessage(var15, var2.username.getName(), var13);
					}
				}
			}

			var0.offset = var20 + var10 + var18;
		}

		if ((var3 & 1024) != 0) {
			for (var5 = 0; var5 < 3; ++var5) {
				var2.actions[var5] = var0.readStringCp1252NullTerminated();
			}
		}

		if ((var3 & 65536) != 0) {
			var5 = var0.readUnsignedByteSub();

			for (var6 = 0; var6 < var5; ++var6) {
				var18 = var0.readUnsignedByteAdd();
				var8 = var0.readUnsignedShort();
				var9 = var0.readUnsignedIntLE();
				var2.updateSpotAnimation(var18, var8, var9 >> 16, var9 & 65535);
			}
		}

		if ((var3 & 32768) != 0) {
			var4 = var0.readByte();
		}

		if ((var3 & 1) != 0) {
			var2.field1242 = var0.readUnsignedShortAddLE();
			if (var2.pathLength == 0) {
				var2.orientation = var2.field1242;
				var2.method2470();
			}
		}

		if (var2.field1147) {
			if (var4 == 127) {
				var2.resetPath(var2.tileX, var2.tileY);
			} else {
				class233 var27;
				if (var4 != class233.field2471.field2473) {
					class233[] var26 = new class233[]{class233.field2472, class233.field2469, class233.field2470, class233.field2471};
					var27 = (class233)class356.findEnumerated(var26, var4);
				} else {
					var27 = Players.field1378[var1];
				}

				var2.method2433(var2.tileX, var2.tileY, var27);
			}
		}

	}
}
