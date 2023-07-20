import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nx")
public class class358 extends DualNode {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	Archive field4272;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1172378273
	)
	int field4271;
	@ObfuscatedName("ar")
	byte field4270;

	class358() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "70"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count;
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "([BIIB)I",
		garbageValue = "0"
	)
	static int method6748(byte[] var0, int var1, int var2) {
		int var3 = -1;

		for (int var4 = var1; var4 < var2; ++var4) {
			var3 = var3 >>> 8 ^ Buffer.field5070[(var3 ^ var0[var4]) & 255];
		}

		var3 = ~var3;
		return var3;
	}

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(ZLtc;I)V",
		garbageValue = "-720645536"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field645 = 0;
		Client.field801 = 0;
		class53.method1105(var1);

		int var3;
		int var7;
		int var8;
		int var9;
		int var10;
		int var12;
		while (true) {
			byte var2 = 16;
			var3 = 1 << var2;
			if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) < var2 + 12) {
				break;
			}

			int var4 = var1.readBits(var2);
			if (var4 == var3 - 1) {
				break;
			}

			boolean var5 = false;
			if (Client.npcs[var4] == null) {
				Client.npcs[var4] = new NPC();
				var5 = true;
			}

			NPC var21 = Client.npcs[var4];
			Client.npcIndices[++Client.npcCount - 1] = var4;
			var21.npcCycle = Client.cycle;
			var10 = var1.readBits(1);
			if (var10 == 1) {
				Client.field587[++Client.field801 - 1] = var4;
			}

			var7 = var1.readBits(1);
			boolean var11 = var1.readBits(1) == 1;
			if (var11) {
				var1.readBits(32);
			}

			if (var0) {
				var9 = var1.readBits(8);
				if (var9 > 127) {
					var9 -= 256;
				}
			} else {
				var9 = var1.readBits(5);
				if (var9 > 15) {
					var9 -= 32;
				}
			}

			if (var0) {
				var8 = var1.readBits(8);
				if (var8 > 127) {
					var8 -= 256;
				}
			} else {
				var8 = var1.readBits(5);
				if (var8 > 15) {
					var8 -= 32;
				}
			}

			var21.definition = Tile.getNpcDefinition(var1.readBits(14));
			var12 = Client.defaultRotations[var1.readBits(3)];
			if (var5) {
				var21.orientation = var21.rotation = var12;
			}

			Client.method1623(var21);
			if (var21.field1251 == 0) {
				var21.rotation = 0;
			}

			var21.method2593(class136.localPlayer.pathX[0] + var8, class136.localPlayer.pathY[0] + var9, var7 == 1);
		}

		var1.exportIndex();

		int var22;
		for (var22 = 0; var22 < Client.field801; ++var22) {
			var3 = Client.field587[var22];
			NPC var14 = Client.npcs[var3];
			int var23 = var1.readUnsignedByte();
			int var6;
			if ((var23 & 32) != 0) {
				var6 = var1.readUnsignedByte();
				var23 += var6 << 8;
			}

			if ((var23 & 1024) != 0) {
				var6 = var1.readUnsignedByte();
				var23 += var6 << 16;
			}

			if ((var23 & 8) != 0) {
				var14.targetIndex = var1.readUnsignedShort();
				var14.targetIndex += var1.readUnsignedByte() << 16;
				var6 = 16777215;
				if (var6 == var14.targetIndex) {
					var14.targetIndex = -1;
				}
			}

			if ((var23 & 1) != 0) {
				var14.definition = Tile.getNpcDefinition(var1.readUnsignedShortAdd());
				Client.method1623(var14);
				var14.method2625();
			}

			if ((var23 & 4) != 0) {
				var6 = var1.readUnsignedShortLE();
				if (var6 == 65535) {
					var6 = -1;
				}

				var7 = var1.readUnsignedByteSub();
				if (var6 == var14.sequence && var6 != -1) {
					var8 = class135.SequenceDefinition_get(var6).field2274;
					if (var8 == 1) {
						var14.sequenceFrame = 0;
						var14.sequenceFrameCycle = 0;
						var14.sequenceDelay = var7;
						var14.field1199 = 0;
					}

					if (var8 == 2) {
						var14.field1199 = 0;
					}
				} else if (var6 == -1 || var14.sequence == -1 || class135.SequenceDefinition_get(var6).field2258 >= class135.SequenceDefinition_get(var14.sequence).field2258) {
					var14.sequence = var6;
					var14.sequenceFrame = 0;
					var14.sequenceFrameCycle = 0;
					var14.sequenceDelay = var7;
					var14.field1199 = 0;
					var14.field1257 = var14.pathLength;
				}
			}

			if ((var23 & 64) != 0) {
				var1.readUnsignedShortLE();
				var1.readInt();
			}

			int[] var15;
			short[] var16;
			short[] var17;
			long var18;
			int var24;
			boolean var25;
			if ((var23 & 512) != 0) {
				var6 = var1.readUnsignedByteSub();
				if ((var6 & 1) == 1) {
					var14.method2604();
				} else {
					var15 = null;
					if ((var6 & 2) == 2) {
						var8 = var1.readUnsignedByteNeg();
						var15 = new int[var8];

						for (var9 = 0; var9 < var8; ++var9) {
							var10 = var1.readUnsignedShort();
							var10 = var10 == 65535 ? -1 : var10;
							var15[var9] = var10;
						}
					}

					var16 = null;
					if ((var6 & 4) == 4) {
						var9 = 0;
						if (var14.definition.recolorTo != null) {
							var9 = var14.definition.recolorTo.length;
						}

						var16 = new short[var9];

						for (var10 = 0; var10 < var9; ++var10) {
							var16[var10] = (short)var1.readUnsignedShort();
						}
					}

					var17 = null;
					if ((var6 & 8) == 8) {
						var10 = 0;
						if (var14.definition.retextureTo != null) {
							var10 = var14.definition.retextureTo.length;
						}

						var17 = new short[var10];

						for (var24 = 0; var24 < var10; ++var24) {
							var17[var24] = (short)var1.readUnsignedShortAdd();
						}
					}

					var25 = false;
					if ((var6 & 16) != 0) {
						var25 = var1.readUnsignedByte() == 1;
					}

					var18 = (long)(++NPC.field1317 - 1);
					var14.method2605(new NewStuff(var18, var15, var16, var17, var25));
				}
			}

			if ((var23 & 256) != 0) {
				var6 = var1.readUnsignedByteSub();
				if ((var6 & 1) == 1) {
					var14.method2598();
				} else {
					var15 = null;
					if ((var6 & 2) == 2) {
						var8 = var1.readUnsignedByteAdd();
						var15 = new int[var8];

						for (var9 = 0; var9 < var8; ++var9) {
							var10 = var1.readUnsignedShort();
							var10 = var10 == 65535 ? -1 : var10;
							var15[var9] = var10;
						}
					}

					var16 = null;
					if ((var6 & 4) == 4) {
						var9 = 0;
						if (var14.definition.recolorTo != null) {
							var9 = var14.definition.recolorTo.length;
						}

						var16 = new short[var9];

						for (var10 = 0; var10 < var9; ++var10) {
							var16[var10] = (short)var1.readUnsignedShortLE();
						}
					}

					var17 = null;
					if ((var6 & 8) == 8) {
						var10 = 0;
						if (var14.definition.retextureTo != null) {
							var10 = var14.definition.retextureTo.length;
						}

						var17 = new short[var10];

						for (var24 = 0; var24 < var10; ++var24) {
							var17[var24] = (short)var1.readUnsignedShortLE();
						}
					}

					var25 = false;
					if ((var6 & 16) != 0) {
						var25 = var1.readUnsignedByteNeg() == 1;
					}

					var18 = (long)(++NPC.field1315 - 1);
					var14.method2603(new NewStuff(var18, var15, var16, var17, var25));
				}
			}

			if ((var23 & 262144) != 0) {
				var6 = var1.readUnsignedIntIME();
				var14.turnLeftSequence = (var6 & 1) != 0 ? var1.readUnsignedShortLE() : var14.definition.turnLeftSequence;
				var14.turnRightSequence = (var6 & 2) != 0 ? var1.readUnsignedShort() : var14.definition.turnRightSequence;
				var14.walkSequence = (var6 & 4) != 0 ? var1.readUnsignedShort() : var14.definition.walkSequence;
				var14.walkBackSequence = (var6 & 8) != 0 ? var1.readUnsignedShortLE() : var14.definition.walkBackSequence;
				var14.walkLeftSequence = (var6 & 16) != 0 ? var1.readUnsignedShortAddLE() : var14.definition.walkLeftSequence;
				var14.walkRightSequence = (var6 & 32) != 0 ? var1.readUnsignedShortAdd() : var14.definition.walkRightSequence;
				var14.runSequence = (var6 & 64) != 0 ? var1.readUnsignedShortAdd() : var14.definition.field1996;
				var14.field1194 = (var6 & 128) != 0 ? var1.readUnsignedShort() : var14.definition.field2013;
				var14.field1197 = (var6 & 256) != 0 ? var1.readUnsignedShortAddLE() : var14.definition.field1998;
				var14.field1198 = (var6 & 512) != 0 ? var1.readUnsignedShortAddLE() : var14.definition.field2015;
				var14.field1211 = (var6 & 1024) != 0 ? var1.readUnsignedShortLE() : var14.definition.field2016;
				var14.field1200 = (var6 & 2048) != 0 ? var1.readUnsignedShortLE() : var14.definition.field2017;
				var14.field1201 = (var6 & 4096) != 0 ? var1.readUnsignedShortAddLE() : var14.definition.field2018;
				var14.field1202 = (var6 & 8192) != 0 ? var1.readUnsignedShortAdd() : var14.definition.field2024;
				var14.idleSequence = (var6 & 16384) != 0 ? var1.readUnsignedShortLE() : var14.definition.idleSequence;
			}

			if ((var23 & 131072) != 0) {
				var6 = var1.readUnsignedByteNeg();

				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var1.readUnsignedByteNeg();
					var9 = var1.readUnsignedShort();
					var10 = var1.readUnsignedIntIME();
					var14.updateSpotAnimation(var8, var9, var10 >> 16, var10 & 65535);
				}
			}

			if ((var23 & 32768) != 0) {
				var14.field1234 = var1.readByteSub();
				var14.field1236 = var1.readByteAdd();
				var14.field1196 = var1.readByte();
				var14.field1224 = var1.readByte();
				var14.spotAnimation = var1.readUnsignedShort() + Client.cycle;
				var14.field1239 = var1.readUnsignedShortLE() + Client.cycle;
				var14.field1232 = var1.readUnsignedShortAdd();
				var14.pathLength = 1;
				var14.field1257 = 0;
				var14.field1234 += var14.pathX[0];
				var14.field1236 += var14.pathY[0];
				var14.field1196 += var14.pathX[0];
				var14.field1224 += var14.pathY[0];
			}

			if ((var23 & 2) != 0) {
				var6 = var1.readUnsignedShortAddLE();
				var7 = var1.readUnsignedShortAddLE();
				var14.field1222 = var1.readUnsignedByte() == 1;
				if (Client.field525 >= 212) {
					var14.field1220 = var6;
					var14.field1221 = var7;
				} else {
					var8 = var14.x - (var6 - AbstractArchive.baseX * 64 - AbstractArchive.baseX * 64) * 64;
					var9 = var14.y - (var7 - class148.baseY * 64 - class148.baseY * 64) * 64;
					if (var8 != 0 || var9 != 0) {
						var24 = (int)(Math.atan2((double)var8, (double)var9) * 325.94932345220167D) & 2047;
						var14.field1219 = var24;
					}
				}
			}

			if ((var23 & 4096) != 0) {
				var14.field1183 = Client.cycle + var1.readUnsignedShortLE();
				var14.field1244 = Client.cycle + var1.readUnsignedShort();
				var14.field1245 = var1.readByteAdd();
				var14.field1238 = var1.readByte();
				var14.field1247 = var1.readByteNeg();
				var14.field1248 = (byte)var1.readUnsignedByte();
			}

			if ((var23 & 16) != 0) {
				var6 = var1.readUnsignedByte();
				if (var6 > 0) {
					for (var7 = 0; var7 < var6; ++var7) {
						var9 = -1;
						var10 = -1;
						var24 = -1;
						var8 = var1.readUShortSmart();
						if (var8 == 32767) {
							var8 = var1.readUShortSmart();
							var10 = var1.readUShortSmart();
							var9 = var1.readUShortSmart();
							var24 = var1.readUShortSmart();
						} else if (var8 != 32766) {
							var10 = var1.readUShortSmart();
						} else {
							var8 = -1;
						}

						var12 = var1.readUShortSmart();
						var14.addHitSplat(var8, var10, var9, var24, Client.cycle, var12);
					}
				}

				var7 = var1.readUnsignedByte();
				if (var7 > 0) {
					for (var8 = 0; var8 < var7; ++var8) {
						var9 = var1.readUShortSmart();
						var10 = var1.readUShortSmart();
						if (var10 != 32767) {
							var24 = var1.readUShortSmart();
							var12 = var1.readUnsignedByteSub();
							int var13 = var10 > 0 ? var1.readUnsignedByteSub() : var12;
							var14.addHealthBar(var9, Client.cycle, var10, var24, var12, var13);
						} else {
							var14.removeHealthBar(var9);
						}
					}
				}
			}

			if ((var23 & 8192) != 0) {
				var14.method2601(var1.readUnsignedByteNeg());
			}

			if ((var23 & 16384) != 0) {
				var14.field1258 = var1.readUnsignedIntLE();
			}

			if ((var23 & 65536) != 0) {
				var6 = var1.readUnsignedByteAdd();
				var15 = new int[8];
				var16 = new short[8];

				for (var9 = 0; var9 < 8; ++var9) {
					if ((var6 & 1 << var9) != 0) {
						var15[var9] = var1.readNullableLargeSmart();
						var16[var9] = (short)var1.readShortSmartSub();
					} else {
						var15[var9] = -1;
						var16[var9] = -1;
					}
				}

				var14.method2594(var15, var16);
			}

			if ((var23 & 2048) != 0) {
				var14.method2588(var1.readStringCp1252NullTerminated());
			}

			if ((var23 & 128) != 0) {
				var14.overheadText = var1.readStringCp1252NullTerminated();
				var14.overheadTextCyclesRemaining = 100;
			}
		}

		for (var22 = 0; var22 < Client.field645; ++var22) {
			var3 = Client.field601[var22];
			if (Client.npcs[var3].npcCycle != Client.cycle) {
				Client.npcs[var3].definition = null;
				Client.npcs[var3] = null;
			}
		}

		if (var1.offset != Client.packetWriter.serverPacketLength) {
			throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
		} else {
			for (var22 = 0; var22 < Client.npcCount; ++var22) {
				if (Client.npcs[Client.npcIndices[var22]] == null) {
					throw new RuntimeException(var22 + "," + Client.npcCount);
				}
			}

		}
	}
}
