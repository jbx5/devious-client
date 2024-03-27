import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
public class class204 extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("field2026")
	static EvictingDualNodeHashTable field2026;

	static {
		field2026 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ah")
	public static String method3849(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (var0 % 37L == 0L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; var3 != 0L; var3 /= 37L) {
					++var2;
				}

				StringBuilder var5 = new StringBuilder(var2);

				while (0L != var0) {
					long var6 = var0;
					var0 /= 37L;
					var5.append(class408.base37Table[(int)(var6 - 37L * var0)]);
				}

				return var5.reverse().toString();
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lun;ILdi;II)V",
		garbageValue = "-497859810"
	)
	static final void method3848(PacketBuffer var0, int var1, Player var2, int var3) {
		byte var4 = class233.field2488.field2482;
		if ((var3 & 2) != 0) {
			var2.field1272 = var0.readUnsignedShort();
			if (var2.pathLength == 0) {
				var2.orientation = var2.field1272;
				var2.method2419();
			}
		}

		int var5;
		int var8;
		int var9;
		int var12;
		if ((var3 & 16) != 0) {
			var5 = var0.readUnsignedShortAddLE();
			PlayerType var6 = (PlayerType)KitDefinition.findEnumerated(Huffman.PlayerType_values(), var0.readUnsignedByteAdd());
			boolean var7 = var0.readUnsignedByteSub() == 1;
			var8 = var0.readUnsignedByteSub();
			var9 = var0.offset;
			if (var2.username != null && var2.appearance != null) {
				boolean var10 = false;
				if (var6.isUser && class334.friendSystem.isIgnored(var2.username)) {
					var10 = true;
				}

				if (!var10 && Client.field750 == 0 && !var2.isHidden) {
					Players.field1384.offset = 0;
					var0.readBytes(Players.field1384.array, 0, var8);
					Players.field1384.offset = 0;
					String var11 = AbstractFont.escapeBrackets(VertexNormal.method5102(class342.method6308(Players.field1384)));
					var2.overheadText = var11.trim();
					var2.field1224 = var5 >> 8;
					var2.field1225 = var5 & 255;
					var2.overheadTextCyclesRemaining = 150;
					var2.field1262 = null;
					var2.field1252 = var7;
					var2.field1222 = var2 != class133.localPlayer && var6.isUser && !Client.field745.isEmpty() && var11.toLowerCase().indexOf(Client.field745) == -1;
					if (var6.isPrivileged) {
						var12 = var7 ? 91 : 1;
					} else {
						var12 = var7 ? 90 : 2;
					}

					if (var6.modIcon != -1) {
						SecureRandomCallable.addGameMessage(var12, AbstractByteArrayCopier.method6833(var6.modIcon) + var2.username.getName(), var11);
					} else {
						SecureRandomCallable.addGameMessage(var12, var2.username.getName(), var11);
					}
				}
			}

			var0.offset = var9 + var8;
		}

		int var16;
		if ((var3 & 128) != 0) {
			var5 = var0.readUnsignedShortAddLE();
			if (var5 == 65535) {
				var5 = -1;
			}

			var16 = var0.readUnsignedByteSub();
			class182.performPlayerAnimation(var2, var5, var16);
		}

		int var18;
		int var22;
		int var24;
		if ((var3 & 32) != 0) {
			var5 = var0.readUnsignedByteSub();
			if (var5 > 0) {
				for (var16 = 0; var16 < var5; ++var16) {
					var8 = -1;
					var9 = -1;
					var24 = -1;
					var22 = var0.readUShortSmart();
					if (var22 == 32767) {
						var22 = var0.readUShortSmart();
						var9 = var0.readUShortSmart();
						var8 = var0.readUShortSmart();
						var24 = var0.readUShortSmart();
					} else if (var22 != 32766) {
						var9 = var0.readUShortSmart();
					} else {
						var22 = -1;
					}

					var18 = var0.readUShortSmart();
					var2.addHitSplat(var22, var9, var8, var24, Client.cycle, var18);
				}
			}

			var16 = var0.readUnsignedByteAdd();
			if (var16 > 0) {
				for (var22 = 0; var22 < var16; ++var22) {
					var8 = var0.readUShortSmart();
					var9 = var0.readUShortSmart();
					if (var9 != 32767) {
						var24 = var0.readUShortSmart();
						var18 = var0.readUnsignedByte();
						var12 = var9 > 0 ? var0.readUnsignedByteAdd() : var18;
						var2.addHealthBar(var8, Client.cycle, var9, var24, var18, var12);
					} else {
						var2.removeHealthBar(var8);
					}
				}
			}
		}

		if ((var3 & 16384) != 0) {
			var2.field1251 = var0.readByteNeg();
			var2.field1238 = var0.readByteSub();
			var2.field1258 = var0.readByteSub();
			var2.field1253 = var0.readByteAdd();
			var2.spotAnimation = var0.readUnsignedShort() + Client.cycle;
			var2.field1256 = var0.readUnsignedShort() + Client.cycle;
			var2.field1203 = var0.readUnsignedShortLE();
			if (var2.field1147) {
				var2.field1251 += var2.tileX;
				var2.field1238 += var2.tileY;
				var2.field1258 += var2.tileX;
				var2.field1253 += var2.tileY;
				var2.pathLength = 0;
			} else {
				var2.field1251 += var2.pathX[0];
				var2.field1238 += var2.pathY[0];
				var2.field1258 += var2.pathX[0];
				var2.field1253 += var2.pathY[0];
				var2.pathLength = 1;
			}

			var2.field1274 = 0;
		}

		if ((var3 & 1024) != 0) {
			var5 = var0.readUnsignedShortLE();
			var16 = var5 >> 8;
			var22 = var16 >= 13 && var16 <= 20 ? var16 - 12 : 0;
			PlayerType var17 = (PlayerType)KitDefinition.findEnumerated(Huffman.PlayerType_values(), var0.readUnsignedByteNeg());
			boolean var23 = var0.readUnsignedByte() == 1;
			var24 = var0.readUnsignedByteAdd();
			var18 = var0.offset;
			if (var2.username != null && var2.appearance != null) {
				boolean var25 = false;
				if (var17.isUser && class334.friendSystem.isIgnored(var2.username)) {
					var25 = true;
				}

				if (!var25 && Client.field750 == 0 && !var2.isHidden) {
					Players.field1384.offset = 0;
					var0.readBytes(Players.field1384.array, 0, var24);
					Players.field1384.offset = 0;
					String var13 = AbstractFont.escapeBrackets(VertexNormal.method5102(class342.method6308(Players.field1384)));
					var2.overheadText = var13.trim();
					var2.field1224 = var5 >> 8;
					var2.field1225 = var5 & 255;
					var2.overheadTextCyclesRemaining = 150;
					byte[] var14 = null;
					int var15;
					if (var22 > 0 && var22 <= 8) {
						var14 = new byte[var22];

						for (var15 = 0; var15 < var22; ++var15) {
							var14[var15] = var0.readByte();
						}
					}

					var2.field1262 = GraphicsDefaults.method8340(var14);
					var2.field1252 = var23;
					var2.field1222 = var2 != class133.localPlayer && var17.isUser && !Client.field745.isEmpty() && var13.toLowerCase().indexOf(Client.field745) == -1;
					if (var17.isPrivileged) {
						var15 = var23 ? 91 : 1;
					} else {
						var15 = var23 ? 90 : 2;
					}

					if (var17.modIcon != -1) {
						SecureRandomCallable.addGameMessage(var15, AbstractByteArrayCopier.method6833(var17.modIcon) + var2.username.getName(), var13);
					} else {
						SecureRandomCallable.addGameMessage(var15, var2.username.getName(), var13);
					}
				}
			}

			var0.offset = var24 + var18 + var22;
		}

		if ((var3 & 4096) != 0) {
			var4 = var0.readByteSub();
		}

		if ((var3 & 256) != 0) {
			for (var5 = 0; var5 < 3; ++var5) {
				var2.actions[var5] = var0.readStringCp1252NullTerminated();
			}
		}

		if ((var3 & 8) != 0) {
			var2.overheadText = var0.readStringCp1252NullTerminated();
			if (var2.overheadText.charAt(0) == '~') {
				var2.overheadText = var2.overheadText.substring(1);
				SecureRandomCallable.addGameMessage(2, var2.username.getName(), var2.overheadText);
			} else if (var2 == class133.localPlayer) {
				SecureRandomCallable.addGameMessage(2, var2.username.getName(), var2.overheadText);
			}

			var2.field1252 = false;
			var2.field1224 = 0;
			var2.field1225 = 0;
			var2.overheadTextCyclesRemaining = 150;
		}

		if ((var3 & 8192) != 0) {
			var2.field1260 = Client.cycle + var0.readUnsignedShortAddLE();
			var2.field1236 = Client.cycle + var0.readUnsignedShortLE();
			var2.field1261 = var0.readByteNeg();
			var2.field1263 = var0.readByte();
			var2.field1235 = var0.readByte();
			var2.field1265 = (byte)var0.readUnsignedByteNeg();
		}

		if ((var3 & 512) != 0) {
			Players.field1383[var1] = (class233)KitDefinition.findEnumerated(class147.method3172(), var0.readByte());
		}

		if ((var3 & 4) != 0) {
			var5 = var0.readUnsignedByteNeg();
			byte[] var21 = new byte[var5];
			Buffer var19 = new Buffer(var21);
			var0.method9320(var21, 0, var5);
			Players.field1395[var1] = var19;
			var2.read(var19);
		}

		if ((var3 & 64) != 0) {
			var2.targetIndex = var0.readUnsignedShortAddLE();
			var2.targetIndex += var0.readUnsignedByteNeg() << 16;
			var5 = 16777215;
			if (var2.targetIndex == var5) {
				var2.targetIndex = -1;
			}
		}

		if ((var3 & 65536) != 0) {
			var5 = var0.readUnsignedByteSub();

			for (var16 = 0; var16 < var5; ++var16) {
				var22 = var0.readUnsignedByteAdd();
				var8 = var0.readUnsignedShort();
				var9 = var0.readUnsignedIntIME();
				var2.updateSpotAnimation(var22, var8, var9 >> 16, var9 & 65535);
			}
		}

		if (var2.field1147) {
			if (var4 == 127) {
				var2.resetPath(var2.tileX, var2.tileY);
			} else {
				class233 var20;
				if (var4 != class233.field2488.field2482) {
					var20 = (class233)KitDefinition.findEnumerated(class147.method3172(), var4);
				} else {
					var20 = Players.field1383[var1];
				}

				var2.method2342(var2.tileX, var2.tileY, var20);
			}
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Lja;",
		garbageValue = "-2126649800"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			var1 = class133.method3068(class343.SequenceDefinition_animationsArchive, UrlRequest.SequenceDefinition_skeletonsArchive, var0, false);
			if (var1 != null) {
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var1, (long)var0);
			}

			return var1;
		}
	}
}
