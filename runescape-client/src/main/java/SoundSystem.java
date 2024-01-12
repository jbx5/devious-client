import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bw")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("ur")
	@ObfuscatedGetter(
		intValue = 1574144384
	)
	static int field314;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[Lbb;"
	)
	@Export("players")
	public volatile PcmPlayer[] players;

	public SoundSystem() {
		this.players = new PcmPlayer[2];
	}

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) {
				PcmPlayer var2 = this.players[var1];
				if (var2 != null) {
					var2.run();
				}
			}
		} catch (Exception var4) {
			class368.RunException_sendStackTrace((String)null, var4);
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIII)J",
		garbageValue = "-1312935267"
	)
	static long method870(int var0, int var1, int var2) {
		return (long)(var2 << 16 | var0 << 8 | var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IS)Lgy;",
		garbageValue = "8247"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0);
			var1 = new InvDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)F",
		garbageValue = "0"
	)
	static final float method871(int var0) {
		float var1 = 10075.0F - (float)var0;
		return (var1 * 1.0075567F - 75.56675F) / var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luo;I)V",
		garbageValue = "850217673"
	)
	static final void method877(PacketBuffer var0) {
		for (int var1 = 0; var1 < Players.Players_pendingUpdateCount; ++var1) {
			int var2 = Players.Players_pendingUpdateIndices[var1];
			Player var3 = Client.players[var2];
			int var4 = var0.readUnsignedByte();
			if ((var4 & 128) != 0) {
				var4 += var0.readUnsignedByte() << 8;
			}

			if ((var4 & 16384) != 0) {
				var4 += var0.readUnsignedByte() << 16;
			}

			byte var5 = class231.field2460.field2457;
			if ((var4 & 1) != 0) {
				var3.overheadText = var0.readStringCp1252NullTerminated();
				if (var3.overheadText.charAt(0) == '~') {
					var3.overheadText = var3.overheadText.substring(1);
					GrandExchangeEvents.addGameMessage(2, var3.username.getName(), var3.overheadText);
				} else if (var3 == KeyHandler.localPlayer) {
					GrandExchangeEvents.addGameMessage(2, var3.username.getName(), var3.overheadText);
				}

				var3.field1202 = false;
				var3.field1185 = 0;
				var3.field1197 = 0;
				var3.overheadTextCyclesRemaining = 150;
			}

			if ((var4 & 2) != 0) {
				var3.field1208 = var0.readUnsignedShortLE();
				if (var3.pathLength == 0) {
					var3.orientation = var3.field1208;
					var3.method2460();
				}
			}

			int var6;
			if ((var4 & 64) != 0) {
				var3.targetIndex = var0.readUnsignedShort();
				var3.targetIndex += var0.readUnsignedByte() << 16;
				var6 = 16777215;
				if (var6 == var3.targetIndex) {
					var3.targetIndex = -1;
				}
			}

			int var9;
			int var10;
			int var13;
			if ((var4 & 16) != 0) {
				var6 = var0.readUnsignedShortLE();
				PlayerType var7 = (PlayerType)GrandExchangeEvents.findEnumerated(class184.PlayerType_values(), var0.readUnsignedByteSub());
				boolean var8 = var0.readUnsignedByteSub() == 1;
				var9 = var0.readUnsignedByteNeg();
				var10 = var0.offset;
				if (var3.username != null && var3.appearance != null) {
					boolean var11 = false;
					if (var7.isUser && class332.friendSystem.isIgnored(var3.username)) {
						var11 = true;
					}

					if (!var11 && Client.field621 == 0 && !var3.isHidden) {
						Players.field1351.offset = 0;
						var0.method9533(Players.field1351.array, 0, var9);
						Players.field1351.offset = 0;
						String var12 = AbstractFont.escapeBrackets(class167.method3535(Huffman.method6899(Players.field1351)));
						var3.overheadText = var12.trim();
						var3.field1185 = var6 >> 8;
						var3.field1197 = var6 & 255;
						var3.overheadTextCyclesRemaining = 150;
						var3.field1198 = null;
						var3.field1202 = var8;
						var3.field1194 = var3 != KeyHandler.localPlayer && var7.isUser && !Client.field733.isEmpty() && var12.toLowerCase().indexOf(Client.field733) == -1;
						if (var7.isPrivileged) {
							var13 = var8 ? 91 : 1;
						} else {
							var13 = var8 ? 90 : 2;
						}

						if (var7.modIcon != -1) {
							GrandExchangeEvents.addGameMessage(var13, class228.method4503(var7.modIcon) + var3.username.getName(), var12);
						} else {
							GrandExchangeEvents.addGameMessage(var13, var3.username.getName(), var12);
						}
					}
				}

				var0.offset = var10 + var9;
			}

			int var17;
			if ((var4 & 8) != 0) {
				var6 = var0.readUnsignedShortAddLE();
				if (var6 == 65535) {
					var6 = -1;
				}

				var17 = var0.readUnsignedByte();
				class358.performPlayerAnimation(var3, var6, var17);
			}

			int var19;
			int var24;
			int var26;
			if ((var4 & 32768) != 0) {
				var6 = var0.readUnsignedShortLE();
				var17 = var6 >> 8;
				var24 = var17 >= 13 && var17 <= 20 ? var17 - 12 : 0;
				PlayerType var18 = (PlayerType)GrandExchangeEvents.findEnumerated(class184.PlayerType_values(), var0.readUnsignedByteNeg());
				boolean var25 = var0.readUnsignedByteSub() == 1;
				var26 = var0.readUnsignedByteNeg();
				var19 = var0.offset;
				if (var3.username != null && var3.appearance != null) {
					boolean var27 = false;
					if (var18.isUser && class332.friendSystem.isIgnored(var3.username)) {
						var27 = true;
					}

					if (!var27 && Client.field621 == 0 && !var3.isHidden) {
						Players.field1351.offset = 0;
						var0.method9533(Players.field1351.array, 0, var26);
						Players.field1351.offset = 0;
						String var14 = AbstractFont.escapeBrackets(class167.method3535(Huffman.method6899(Players.field1351)));
						var3.overheadText = var14.trim();
						var3.field1185 = var6 >> 8;
						var3.field1197 = var6 & 255;
						var3.overheadTextCyclesRemaining = 150;
						byte[] var15 = null;
						int var16;
						if (var24 > 0 && var24 <= 8) {
							var15 = new byte[var24];

							for (var16 = 0; var16 < var24; ++var16) {
								var15[var16] = var0.readByteAdd();
							}
						}

						var3.field1198 = class431.method8065(var15);
						var3.field1202 = var25;
						var3.field1194 = var3 != KeyHandler.localPlayer && var18.isUser && !Client.field733.isEmpty() && var14.toLowerCase().indexOf(Client.field733) == -1;
						if (var18.isPrivileged) {
							var16 = var25 ? 91 : 1;
						} else {
							var16 = var25 ? 90 : 2;
						}

						if (var18.modIcon != -1) {
							GrandExchangeEvents.addGameMessage(var16, class228.method4503(var18.modIcon) + var3.username.getName(), var14);
						} else {
							GrandExchangeEvents.addGameMessage(var16, var3.username.getName(), var14);
						}
					}
				}

				var0.offset = var19 + var26 + var24;
			}

			if ((var4 & 32) != 0) {
				var6 = var0.readUnsignedByteNeg();
				if (var6 > 0) {
					for (var17 = 0; var17 < var6; ++var17) {
						var9 = -1;
						var10 = -1;
						var26 = -1;
						var24 = var0.readUShortSmart();
						if (var24 == 32767) {
							var24 = var0.readUShortSmart();
							var10 = var0.readUShortSmart();
							var9 = var0.readUShortSmart();
							var26 = var0.readUShortSmart();
						} else if (var24 != 32766) {
							var10 = var0.readUShortSmart();
						} else {
							var24 = -1;
						}

						var19 = var0.readUShortSmart();
						var3.addHitSplat(var24, var10, var9, var26, Client.cycle, var19);
					}
				}

				var17 = var0.readUnsignedByteSub();
				if (var17 > 0) {
					for (var24 = 0; var24 < var17; ++var24) {
						var9 = var0.readUShortSmart();
						var10 = var0.readUShortSmart();
						if (var10 != 32767) {
							var26 = var0.readUShortSmart();
							var19 = var0.readUnsignedByteSub();
							var13 = var10 > 0 ? var0.readUnsignedByteNeg() : var19;
							var3.addHealthBar(var9, Client.cycle, var10, var26, var19, var13);
						} else {
							var3.removeHealthBar(var9);
						}
					}
				}
			}

			if ((var4 & 4096) != 0) {
				class231[] var20 = Players.field1348;
				class231[] var21 = new class231[]{class231.field2459, class231.field2458, class231.field2460, class231.field2456};
				var20[var2] = (class231)GrandExchangeEvents.findEnumerated(var21, var0.readByteNeg());
			}

			if ((var4 & 4) != 0) {
				var6 = var0.readUnsignedByteNeg();
				byte[] var22 = new byte[var6];
				Buffer var29 = new Buffer(var22);
				var0.method9533(var22, 0, var6);
				Players.field1347[var2] = var29;
				var3.read(var29);
			}

			if ((var4 & 2048) != 0) {
				for (var6 = 0; var6 < 3; ++var6) {
					var3.actions[var6] = var0.readStringCp1252NullTerminated();
				}
			}

			if ((var4 & 1024) != 0) {
				var3.field1223 = var0.readByteSub();
				var3.field1225 = var0.readByteSub();
				var3.field1224 = var0.readByteNeg();
				var3.field1226 = var0.readByteAdd();
				var3.spotAnimation = var0.readUnsignedShortAddLE() + Client.cycle;
				var3.field1228 = var0.readUnsignedShort() + Client.cycle;
				var3.field1173 = var0.readUnsignedShortAddLE();
				if (var3.field1124) {
					var3.field1223 += var3.tileX;
					var3.field1225 += var3.tileY;
					var3.field1224 += var3.tileX;
					var3.field1226 += var3.tileY;
					var3.pathLength = 0;
				} else {
					var3.field1223 += var3.pathX[0];
					var3.field1225 += var3.pathY[0];
					var3.field1224 += var3.pathX[0];
					var3.field1226 += var3.pathY[0];
					var3.pathLength = 1;
				}

				var3.field1215 = 0;
			}

			if ((var4 & 8192) != 0) {
				var5 = var0.readByteSub();
			}

			if ((var4 & 65536) != 0) {
				var6 = var0.readUnsignedByteAdd();

				for (var17 = 0; var17 < var6; ++var17) {
					var24 = var0.readUnsignedByte();
					var9 = var0.readUnsignedShort();
					var10 = var0.readUnsignedIntIME();
					var3.updateSpotAnimation(var24, var9, var10 >> 16, var10 & 65535);
				}
			}

			if ((var4 & 512) != 0) {
				var3.field1180 = Client.cycle + var0.readUnsignedShortLE();
				var3.field1233 = Client.cycle + var0.readUnsignedShortLE();
				var3.field1234 = var0.readByteSub();
				var3.field1193 = var0.readByte();
				var3.field1204 = var0.readByteAdd();
				var3.field1237 = (byte)var0.readUnsignedByteNeg();
			}

			if (var3.field1124) {
				if (var5 == 127) {
					var3.resetPath(var3.tileX, var3.tileY);
				} else {
					class231 var28;
					if (var5 != class231.field2460.field2457) {
						class231[] var23 = new class231[]{class231.field2459, class231.field2458, class231.field2460, class231.field2456};
						var28 = (class231)GrandExchangeEvents.findEnumerated(var23, var5);
					} else {
						var28 = Players.field1348[var2];
					}

					var3.method2429(var3.tileX, var3.tileY, var28);
				}
			}
		}

	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(S)Liz;",
		garbageValue = "-14960"
	)
	public static class226 method879() {
		return Client.field661;
	}

	@ObfuscatedName("nv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2090704793"
	)
	static void method876(int var0) {
		class74.tempMenuAction = new MenuAction();
		class74.tempMenuAction.param0 = Client.menuArguments1[var0];
		class74.tempMenuAction.param1 = Client.menuArguments2[var0];
		class74.tempMenuAction.opcode = Client.menuOpcodes[var0];
		class74.tempMenuAction.identifier = Client.menuIdentifiers[var0];
		class74.tempMenuAction.itemId = Client.menuItemIds[var0];
		class74.tempMenuAction.action = Client.menuActions[var0];
		class74.tempMenuAction.target = Client.menuTargets[var0];
	}
}
