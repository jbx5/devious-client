import java.util.BitSet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("my")
public class class332 extends Node {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -705162889
	)
	int field3555;
	@ObfuscatedName("al")
	BitSet field3554;

	class332(int var1) {
		this.field3555 = var1;
		this.field3554 = new BitSet(128);
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(ZLuy;I)V",
		garbageValue = "2118721779"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field650 = 0;
		Client.field581 = 0;
		var1.importIndex();
		int var2 = var1.readBits(8);
		int var3;
		if (var2 < Client.npcCount) {
			for (var3 = var2; var3 < Client.npcCount; ++var3) {
				Client.field651[++Client.field650 - 1] = Client.npcIndices[var3];
			}
		}

		if (var2 > Client.npcCount) {
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0;

			int var6;
			int var7;
			int var8;
			int var9;
			for (var3 = 0; var3 < var2; ++var3) {
				int var20 = Client.npcIndices[var3];
				NPC var21 = Client.npcs[var20];
				var6 = var1.readBits(1);
				if (var6 == 0) {
					Client.npcIndices[++Client.npcCount - 1] = var20;
					var21.npcCycle = Client.cycle;
				} else {
					var7 = var1.readBits(2);
					if (var7 == 0) {
						Client.npcIndices[++Client.npcCount - 1] = var20;
						var21.npcCycle = Client.cycle;
						Client.field533[++Client.field581 - 1] = var20;
					} else if (var7 == 1) {
						Client.npcIndices[++Client.npcCount - 1] = var20;
						var21.npcCycle = Client.cycle;
						var8 = var1.readBits(3);
						var21.method2625(var8, class231.field2428);
						var9 = var1.readBits(1);
						if (var9 == 1) {
							Client.field533[++Client.field581 - 1] = var20;
						}
					} else if (var7 == 2) {
						Client.npcIndices[++Client.npcCount - 1] = var20;
						var21.npcCycle = Client.cycle;
						if (var1.readBits(1) == 1) {
							var8 = var1.readBits(3);
							var21.method2625(var8, class231.field2427);
							var9 = var1.readBits(3);
							var21.method2625(var9, class231.field2427);
						} else {
							var8 = var1.readBits(3);
							var21.method2625(var8, class231.field2426);
						}

						var8 = var1.readBits(1);
						if (var8 == 1) {
							Client.field533[++Client.field581 - 1] = var20;
						}
					} else if (var7 == 3) {
						Client.field651[++Client.field650 - 1] = var20;
					}
				}
			}

			class13.method169(var0, var1);

			for (var2 = 0; var2 < Client.field581; ++var2) {
				var3 = Client.field533[var2];
				NPC var4 = Client.npcs[var3];
				int var5 = var1.readUnsignedByte();
				if ((var5 & 64) != 0) {
					var6 = var1.readUnsignedByte();
					var5 += var6 << 8;
				}

				if ((var5 & 2048) != 0) {
					var6 = var1.readUnsignedByte();
					var5 += var6 << 16;
				}

				if ((var5 & 128) != 0) {
					var6 = var1.readUnsignedShortAdd();
					if (var6 == 65535) {
						var6 = -1;
					}

					var7 = var1.readUnsignedByte();
					if (var6 == var4.sequence && var6 != -1) {
						var8 = class36.SequenceDefinition_get(var6).field2340;
						if (var8 == 1) {
							var4.sequenceFrame = 0;
							var4.sequenceFrameCycle = 0;
							var4.sequenceDelay = var7;
							var4.field1235 = 0;
						}

						if (var8 == 2) {
							var4.field1235 = 0;
						}
					} else if (var6 == -1 || var4.sequence == -1 || class36.SequenceDefinition_get(var6).field2333 >= class36.SequenceDefinition_get(var4.sequence).field2333) {
						var4.sequence = var6;
						var4.sequenceFrame = 0;
						var4.sequenceFrameCycle = 0;
						var4.sequenceDelay = var7;
						var4.field1235 = 0;
						var4.field1261 = var4.pathLength;
					}
				}

				if ((var5 & 2) != 0) {
					var4.definition = class190.getNpcDefinition(var1.readUnsignedShortLE());
					WorldMapLabel.method5655(var4);
					var4.method2633();
				}

				if ((var5 & 32768) != 0) {
					var4.field1238 = var1.readByteAdd();
					var4.field1185 = var1.readByte();
					var4.field1239 = var1.readByte();
					var4.field1204 = var1.readByteSub();
					var4.spotAnimation = var1.readUnsignedShortLE() + Client.cycle;
					var4.field1243 = var1.readUnsignedShort() + Client.cycle;
					var4.field1254 = var1.readUnsignedShortAdd();
					var4.pathLength = 1;
					var4.field1261 = 0;
					var4.field1238 += var4.pathX[0];
					var4.field1185 += var4.pathY[0];
					var4.field1239 += var4.pathX[0];
					var4.field1204 += var4.pathY[0];
				}

				if ((var5 & 8) != 0) {
					var1.readUnsignedShort();
					var1.readInt();
				}

				int var10;
				int var11;
				int[] var14;
				short[] var15;
				short[] var16;
				long var17;
				boolean var22;
				if ((var5 & 16384) != 0) {
					var6 = var1.readUnsignedByte();
					if ((var6 & 1) == 1) {
						var4.method2637();
					} else {
						var14 = null;
						if ((var6 & 2) == 2) {
							var8 = var1.readUnsignedByteAdd();
							var14 = new int[var8];

							for (var9 = 0; var9 < var8; ++var9) {
								var10 = var1.readUnsignedShortAdd();
								var10 = var10 == 65535 ? -1 : var10;
								var14[var9] = var10;
							}
						}

						var15 = null;
						if ((var6 & 4) == 4) {
							var9 = 0;
							if (var4.definition.recolorTo != null) {
								var9 = var4.definition.recolorTo.length;
							}

							var15 = new short[var9];

							for (var10 = 0; var10 < var9; ++var10) {
								var15[var10] = (short)var1.readUnsignedShortAdd();
							}
						}

						var16 = null;
						if ((var6 & 8) == 8) {
							var10 = 0;
							if (var4.definition.retextureTo != null) {
								var10 = var4.definition.retextureTo.length;
							}

							var16 = new short[var10];

							for (var11 = 0; var11 < var10; ++var11) {
								var16[var11] = (short)var1.readUnsignedShort();
							}
						}

						var22 = false;
						if ((var6 & 16) != 0) {
							var22 = var1.readUnsignedByteNeg() == 1;
						}

						var17 = (long)(++NPC.field1326 - 1);
						var4.method2634(new NpcOverrides(var17, var14, var15, var16, var22));
					}
				}

				if ((var5 & 512) != 0) {
					var4.method2621(var1.readStringCp1252NullTerminated());
				}

				if ((var5 & 4096) != 0) {
					var6 = var1.readUnsignedByteAdd();
					if ((var6 & 1) == 1) {
						var4.method2638();
					} else {
						var14 = null;
						if ((var6 & 2) == 2) {
							var8 = var1.readUnsignedByte();
							var14 = new int[var8];

							for (var9 = 0; var9 < var8; ++var9) {
								var10 = var1.readUnsignedShortLE();
								var10 = var10 == 65535 ? -1 : var10;
								var14[var9] = var10;
							}
						}

						var15 = null;
						if ((var6 & 4) == 4) {
							var9 = 0;
							if (var4.definition.recolorTo != null) {
								var9 = var4.definition.recolorTo.length;
							}

							var15 = new short[var9];

							for (var10 = 0; var10 < var9; ++var10) {
								var15[var10] = (short)var1.readUnsignedShortLE();
							}
						}

						var16 = null;
						if ((var6 & 8) == 8) {
							var10 = 0;
							if (var4.definition.retextureTo != null) {
								var10 = var4.definition.retextureTo.length;
							}

							var16 = new short[var10];

							for (var11 = 0; var11 < var10; ++var11) {
								var16[var11] = (short)var1.readUnsignedShortAdd();
							}
						}

						var22 = false;
						if ((var6 & 16) != 0) {
							var22 = var1.readUnsignedByte() == 1;
						}

						var17 = (long)(++NPC.field1324 - 1);
						var4.method2636(new NpcOverrides(var17, var14, var15, var16, var22));
					}
				}

				if ((var5 & 262144) != 0) {
					var6 = var1.readInt();
					var4.turnLeftSequence = (var6 & 1) != 0 ? var1.readUnsignedShortAddLE() : var4.definition.turnLeftSequence;
					var4.turnRightSequence = (var6 & 2) != 0 ? var1.readUnsignedShortAddLE() : var4.definition.turnRightSequence;
					var4.walkSequence = (var6 & 4) != 0 ? var1.readUnsignedShortAdd() : var4.definition.walkSequence;
					var4.walkBackSequence = (var6 & 8) != 0 ? var1.readUnsignedShortAddLE() : var4.definition.walkBackSequence;
					var4.walkLeftSequence = (var6 & 16) != 0 ? var1.readUnsignedShort() : var4.definition.walkLeftSequence;
					var4.walkRightSequence = (var6 & 32) != 0 ? var1.readUnsignedShortLE() : var4.definition.walkRightSequence;
					var4.runSequence = (var6 & 64) != 0 ? var1.readUnsignedShortAddLE() : var4.definition.field2059;
					var4.field1217 = (var6 & 128) != 0 ? var1.readUnsignedShortAdd() : var4.definition.field2060;
					var4.field1202 = (var6 & 256) != 0 ? var1.readUnsignedShortLE() : var4.definition.field2061;
					var4.field1201 = (var6 & 512) != 0 ? var1.readUnsignedShort() : var4.definition.field2088;
					var4.field1196 = (var6 & 1024) != 0 ? var1.readUnsignedShort() : var4.definition.field2063;
					var4.field1203 = (var6 & 2048) != 0 ? var1.readUnsignedShort() : var4.definition.field2064;
					var4.field1219 = (var6 & 4096) != 0 ? var1.readUnsignedShortLE() : var4.definition.field2065;
					var4.field1205 = (var6 & 8192) != 0 ? var1.readUnsignedShortAdd() : var4.definition.field2074;
					var4.idleSequence = (var6 & 16384) != 0 ? var1.readUnsignedShortAddLE() : var4.definition.idleSequence;
				}

				if ((var5 & 131072) != 0) {
					var6 = var1.readUnsignedByteAdd();

					for (var7 = 0; var7 < var6; ++var7) {
						var8 = var1.readUnsignedByteSub();
						var9 = var1.readUnsignedShortAddLE();
						var10 = var1.readUnsignedIntME();
						var4.updateSpotAnimation(var8, var9, var10 >> 16, var10 & 65535);
					}
				}

				if ((var5 & 8192) != 0) {
					var4.method2622(var1.readUnsignedByteSub());
				}

				if ((var5 & 32) != 0) {
					var4.overheadText = var1.readStringCp1252NullTerminated();
					var4.overheadTextCyclesRemaining = 100;
				}

				if ((var5 & 16) != 0) {
					var6 = var1.readUnsignedShort();
					var7 = var1.readUnsignedShortLE();
					var4.field1240 = var1.readUnsignedByteAdd() == 1;
					if (Client.revision >= 212) {
						var4.field1224 = var6;
						var4.field1225 = var7;
					} else {
						var8 = var4.x - (var6 - class20.baseX * 64 - class20.baseX * 64) * 64;
						var9 = var4.y - (var7 - class19.baseY * 64 - class19.baseY * 64) * 64;
						if (var8 != 0 || var9 != 0) {
							var11 = (int)(Math.atan2((double)var8, (double)var9) * 325.94932345220167D) & 2047;
							var4.field1223 = var11;
						}
					}
				}

				if ((var5 & 256) != 0) {
					var4.field1262 = var1.readUnsignedIntLE();
				}

				if ((var5 & 4) != 0) {
					var4.targetIndex = var1.readUnsignedShortLE();
					var4.targetIndex += var1.readUnsignedByte() << 16;
					var6 = 16777215;
					if (var6 == var4.targetIndex) {
						var4.targetIndex = -1;
					}
				}

				if ((var5 & 1) != 0) {
					var6 = var1.readUnsignedByte();
					int var12;
					if (var6 > 0) {
						for (var7 = 0; var7 < var6; ++var7) {
							var9 = -1;
							var10 = -1;
							var11 = -1;
							var8 = var1.readUShortSmart();
							if (var8 == 32767) {
								var8 = var1.readUShortSmart();
								var10 = var1.readUShortSmart();
								var9 = var1.readUShortSmart();
								var11 = var1.readUShortSmart();
							} else if (var8 != 32766) {
								var10 = var1.readUShortSmart();
							} else {
								var8 = -1;
							}

							var12 = var1.readUShortSmart();
							var4.addHitSplat(var8, var10, var9, var11, Client.cycle, var12);
						}
					}

					var7 = var1.readUnsignedByteAdd();
					if (var7 > 0) {
						for (var8 = 0; var8 < var7; ++var8) {
							var9 = var1.readUShortSmart();
							var10 = var1.readUShortSmart();
							if (var10 != 32767) {
								var11 = var1.readUShortSmart();
								var12 = var1.readUnsignedByte();
								int var13 = var10 > 0 ? var1.readUnsignedByteNeg() : var12;
								var4.addHealthBar(var9, Client.cycle, var10, var11, var12, var13);
							} else {
								var4.removeHealthBar(var9);
							}
						}
					}
				}

				if ((var5 & 1024) != 0) {
					var4.field1247 = Client.cycle + var1.readUnsignedShort();
					var4.field1248 = Client.cycle + var1.readUnsignedShortAddLE();
					var4.field1249 = var1.readByteSub();
					var4.field1250 = var1.readByte();
					var4.field1251 = var1.readByteNeg();
					var4.field1252 = (byte)var1.readUnsignedByte();
				}

				if ((var5 & 65536) != 0) {
					var6 = var1.readUnsignedByteNeg();
					var14 = new int[8];
					var15 = new short[8];

					for (var9 = 0; var9 < 8; ++var9) {
						if ((var6 & 1 << var9) != 0) {
							var14[var9] = var1.readNullableLargeSmart();
							var15[var9] = (short)var1.readShortSmartSub();
						} else {
							var14[var9] = -1;
							var15[var9] = -1;
						}
					}

					var4.method2653(var14, var15);
				}
			}

			for (var2 = 0; var2 < Client.field650; ++var2) {
				var3 = Client.field651[var2];
				if (Client.npcs[var3].npcCycle != Client.cycle) {
					Client.npcs[var3].definition = null;
					Client.npcs[var3] = null;
				}
			}

			if (var1.offset != Client.packetWriter.serverPacketLength) {
				throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
			} else {
				for (var2 = 0; var2 < Client.npcCount; ++var2) {
					if (Client.npcs[Client.npcIndices[var2]] == null) {
						throw new RuntimeException(var2 + "," + Client.npcCount);
					}
				}

			}
		}
	}
}
