import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ke")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	static final WorldMapID field2715;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	static final WorldMapID field2714;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1916320005
	)
	@Export("value")
	final int value;

	static {
		field2715 = new WorldMapID(0);
		field2714 = new WorldMapID(1);
	}

	WorldMapID(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1445791075"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9';
	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(Lde;ZLug;I)V",
		garbageValue = "527582669"
	)
	@Export("updateNpcs")
	static final void updateNpcs(WorldView var0, boolean var1, PacketBuffer var2) {
		Client.field639 = 0;
		Client.npcCount = 0;
		var2.importIndex();
		int var3 = var2.readBits(8);
		int var4;
		if (var3 < var0.npcCount) {
			for (var4 = var3; var4 < var0.npcCount; ++var4) {
				Client.field644[++Client.field639 - 1] = var0.npcIndices[var4];
			}
		}

		if (var3 > var0.npcCount) {
			throw new RuntimeException("");
		} else {
			var0.npcCount = 0;

			int var7;
			int var8;
			int var9;
			int var10;
			for (var4 = 0; var4 < var3; ++var4) {
				int var20 = var0.npcIndices[var4];
				NPC var21 = var0.npcs[var20];
				var7 = var2.readBits(1);
				if (var7 == 0) {
					var0.npcIndices[++var0.npcCount - 1] = var20;
					var21.npcCycle = Client.cycle;
				} else {
					var8 = var2.readBits(2);
					if (var8 == 0) {
						var0.npcIndices[++var0.npcCount - 1] = var20;
						var21.npcCycle = Client.cycle;
						Client.npcIndices[++Client.npcCount - 1] = var20;
					} else if (var8 == 1) {
						var0.npcIndices[++var0.npcCount - 1] = var20;
						var21.npcCycle = Client.cycle;
						var9 = var2.readBits(3);
						var21.method2703(var9, class238.field2519);
						var10 = var2.readBits(1);
						if (var10 == 1) {
							Client.npcIndices[++Client.npcCount - 1] = var20;
						}
					} else if (var8 == 2) {
						var0.npcIndices[++var0.npcCount - 1] = var20;
						var21.npcCycle = Client.cycle;
						if (var2.readBits(1) == 1) {
							var9 = var2.readBits(3);
							var21.method2703(var9, class238.field2509);
							var10 = var2.readBits(3);
							var21.method2703(var10, class238.field2509);
						} else {
							var9 = var2.readBits(3);
							var21.method2703(var9, class238.field2520);
						}

						var9 = var2.readBits(1);
						if (var9 == 1) {
							Client.npcIndices[++Client.npcCount - 1] = var20;
						}
					} else if (var8 == 3) {
						Client.field644[++Client.field639 - 1] = var20;
					}
				}
			}

			class27.method430(var0, var1, var2);

			for (var3 = 0; var3 < Client.npcCount; ++var3) {
				var4 = Client.npcIndices[var3];
				NPC var5 = var0.npcs[var4];
				int var6 = var2.readUnsignedByte();
				if ((var6 & 128) != 0) {
					var7 = var2.readUnsignedByte();
					var6 += var7 << 8;
				}

				if ((var6 & 512) != 0) {
					var7 = var2.readUnsignedByte();
					var6 += var7 << 16;
				}

				if ((var6 & 65536) != 0) {
					var7 = var2.readUnsignedIntIME();
					var5.turnLeftSequence = (var7 & 1) != 0 ? var2.readUnsignedShort() : var5.definition.turnLeftSequence;
					var5.turnRightSequence = (var7 & 2) != 0 ? var2.readUnsignedShortAddLE() : var5.definition.turnRightSequence;
					var5.walkSequence = (var7 & 4) != 0 ? var2.readUnsignedShortLE() : var5.definition.walkSequence;
					var5.walkBackSequence = (var7 & 8) != 0 ? var2.readUnsignedShortAdd() : var5.definition.walkBackSequence;
					var5.walkLeftSequence = (var7 & 16) != 0 ? var2.readUnsignedShortLE() : var5.definition.walkLeftSequence;
					var5.walkRightSequence = (var7 & 32) != 0 ? var2.readUnsignedShortAdd() : var5.definition.walkRightSequence;
					var5.runSequence = (var7 & 64) != 0 ? var2.readUnsignedShortLE() : var5.definition.field2000;
					var5.field1262 = (var7 & 128) != 0 ? var2.readUnsignedShortAdd() : var5.definition.field2006;
					var5.field1219 = (var7 & 256) != 0 ? var2.readUnsignedShortLE() : var5.definition.field2002;
					var5.field1202 = (var7 & 512) != 0 ? var2.readUnsignedShortAddLE() : var5.definition.field2029;
					var5.field1205 = (var7 & 1024) != 0 ? var2.readUnsignedShortAddLE() : var5.definition.field2004;
					var5.field1208 = (var7 & 2048) != 0 ? var2.readUnsignedShort() : var5.definition.field2005;
					var5.field1249 = (var7 & 4096) != 0 ? var2.readUnsignedShortAdd() : var5.definition.field2011;
					var5.field1210 = (var7 & 8192) != 0 ? var2.readUnsignedShort() : var5.definition.field2007;
					var5.idleSequence = (var7 & 16384) != 0 ? var2.readUnsignedShortAddLE() : var5.definition.idleSequence;
				}

				int var11;
				int var12;
				if ((var6 & 1) != 0) {
					var7 = var2.readUnsignedByte();
					int var13;
					if (var7 > 0) {
						for (var8 = 0; var8 < var7; ++var8) {
							var10 = -1;
							var11 = -1;
							var12 = -1;
							var9 = var2.readUShortSmart();
							if (var9 == 32767) {
								var9 = var2.readUShortSmart();
								var11 = var2.readUShortSmart();
								var10 = var2.readUShortSmart();
								var12 = var2.readUShortSmart();
							} else if (var9 != 32766) {
								var11 = var2.readUShortSmart();
							} else {
								var9 = -1;
							}

							var13 = var2.readUShortSmart();
							var5.addHitSplat(var9, var11, var10, var12, Client.cycle, var13);
						}
					}

					var8 = var2.readUnsignedByteNeg();
					if (var8 > 0) {
						for (var9 = 0; var9 < var8; ++var9) {
							var10 = var2.readUShortSmart();
							var11 = var2.readUShortSmart();
							if (var11 != 32767) {
								var12 = var2.readUShortSmart();
								var13 = var2.readUnsignedByteNeg();
								int var14 = var11 > 0 ? var2.readUnsignedByteAdd() : var13;
								var5.addHealthBar(var10, Client.cycle, var11, var12, var13, var14);
							} else {
								var5.removeHealthBar(var10);
							}
						}
					}
				}

				if ((var6 & 262144) != 0) {
					var7 = var2.readUnsignedByte();

					for (var8 = 0; var8 < var7; ++var8) {
						var9 = var2.readUnsignedByte();
						var10 = var2.readUnsignedShortLE();
						var11 = var2.readUnsignedIntIME();
						var5.updateSpotAnimation(var9, var10, var11 >> 16, var11 & 65535);
					}
				}

				if ((var6 & 8) != 0) {
					var7 = var2.readUnsignedShortAdd();
					if (var7 == 65535) {
						var7 = -1;
					}

					var8 = var2.readUnsignedByteSub();
					if (var7 == var5.sequence && var7 != -1) {
						var9 = class353.SequenceDefinition_get(var7).restartMode;
						if (var9 == 1) {
							var5.sequenceFrame = 0;
							var5.sequenceFrameCycle = 0;
							var5.sequenceDelay = var8;
							var5.field1214 = 0;
						}

						if (var9 == 2) {
							var5.field1214 = 0;
						}
					} else if (var7 == -1 || var5.sequence == -1 || class353.SequenceDefinition_get(var7).field2298 >= class353.SequenceDefinition_get(var5.sequence).field2298) {
						var5.sequence = var7;
						var5.sequenceFrame = 0;
						var5.sequenceFrameCycle = 0;
						var5.sequenceDelay = var8;
						var5.field1214 = 0;
						var5.field1265 = var5.pathLength;
					}
				}

				if ((var6 & 8192) != 0) {
					var5.field1266 = var2.readInt();
				}

				if ((var6 & 2048) != 0) {
					var5.field1251 = Client.cycle + var2.readUnsignedShort();
					var5.field1215 = Client.cycle + var2.readUnsignedShortAddLE();
					var5.field1223 = var2.readByteSub();
					var5.field1254 = var2.readByteAdd();
					var5.field1255 = var2.readByteAdd();
					var5.field1239 = (byte)var2.readUnsignedByteSub();
				}

				if ((var6 & 16) != 0) {
					var5.definition = class76.getNpcDefinition(var2.readUnsignedShortLE());
					class489.method8833(var5);
					var5.method2723();
				}

				if ((var6 & 4096) != 0) {
					var5.method2700(var2.readUnsignedByteSub());
				}

				if ((var6 & 32) != 0) {
					var5.targetIndex = var2.readUnsignedShort();
					var5.targetIndex += var2.readUnsignedByte() << 16;
					var7 = 16777215;
					if (var7 == var5.targetIndex) {
						var5.targetIndex = -1;
					}
				}

				int[] var15;
				short[] var16;
				short[] var17;
				long var18;
				boolean var22;
				if ((var6 & 32768) != 0) {
					var7 = var2.readUnsignedByteSub();
					if ((var7 & 1) == 1) {
						var5.method2729();
					} else {
						var15 = null;
						if ((var7 & 2) == 2) {
							var9 = var2.readUnsignedByte();
							var15 = new int[var9];

							for (var10 = 0; var10 < var9; ++var10) {
								var11 = var2.readUnsignedShortAddLE();
								var11 = var11 == 65535 ? -1 : var11;
								var15[var10] = var11;
							}
						}

						var16 = null;
						if ((var7 & 4) == 4) {
							var10 = 0;
							if (var5.definition.recolorTo != null) {
								var10 = var5.definition.recolorTo.length;
							}

							var16 = new short[var10];

							for (var11 = 0; var11 < var10; ++var11) {
								var16[var11] = (short)var2.readUnsignedShortAddLE();
							}
						}

						var17 = null;
						if ((var7 & 8) == 8) {
							var11 = 0;
							if (var5.definition.retextureTo != null) {
								var11 = var5.definition.retextureTo.length;
							}

							var17 = new short[var11];

							for (var12 = 0; var12 < var11; ++var12) {
								var17[var12] = (short)var2.readUnsignedShortLE();
							}
						}

						var22 = false;
						if ((var7 & 16) != 0) {
							var22 = var2.readUnsignedByte() == 1;
						}

						var18 = (long)(++NPC.field1349 - 1);
						var5.method2714(new NpcOverrides(var18, var15, var16, var17, var22));
					}
				}

				if ((var6 & 16384) != 0) {
					var7 = var2.readUnsignedByteNeg();
					if ((var7 & 1) == 1) {
						var5.method2715();
					} else {
						var15 = null;
						if ((var7 & 2) == 2) {
							var9 = var2.readUnsignedByteAdd();
							var15 = new int[var9];

							for (var10 = 0; var10 < var9; ++var10) {
								var11 = var2.readUnsignedShort();
								var11 = var11 == 65535 ? -1 : var11;
								var15[var10] = var11;
							}
						}

						var16 = null;
						if ((var7 & 4) == 4) {
							var10 = 0;
							if (var5.definition.recolorTo != null) {
								var10 = var5.definition.recolorTo.length;
							}

							var16 = new short[var10];

							for (var11 = 0; var11 < var10; ++var11) {
								var16[var11] = (short)var2.readUnsignedShortLE();
							}
						}

						var17 = null;
						if ((var7 & 8) == 8) {
							var11 = 0;
							if (var5.definition.retextureTo != null) {
								var11 = var5.definition.retextureTo.length;
							}

							var17 = new short[var11];

							for (var12 = 0; var12 < var11; ++var12) {
								var17[var12] = (short)var2.readUnsignedShort();
							}
						}

						var22 = false;
						if ((var7 & 16) != 0) {
							var22 = var2.readUnsignedByteAdd() == 1;
						}

						var18 = (long)(++NPC.field1351 - 1);
						var5.method2712(new NpcOverrides(var18, var15, var16, var17, var22));
					}
				}

				if ((var6 & 4) != 0) {
					var5.overheadText = var2.readStringCp1252NullTerminated();
					var5.overheadTextCyclesRemaining = 100;
				}

				if ((var6 & 1024) != 0) {
					var5.field1242 = var2.readByteNeg();
					var5.field1244 = var2.readByteAdd();
					var5.field1243 = var2.readByteNeg();
					var5.field1245 = var2.readByteNeg();
					var5.spotAnimation = var2.readUnsignedShort() + Client.cycle;
					var5.field1260 = var2.readUnsignedShort() + Client.cycle;
					var5.field1248 = var2.readUnsignedShortLE();
					var5.pathLength = 1;
					var5.field1265 = 0;
					var5.field1242 += var5.pathX[0];
					var5.field1244 += var5.pathY[0];
					var5.field1243 += var5.pathX[0];
					var5.field1245 += var5.pathY[0];
				}

				if ((var6 & 256) != 0) {
					var5.method2698(var2.readStringCp1252NullTerminated());
				}

				if ((var6 & 2) != 0) {
					var2.readUnsignedShortAdd();
					var2.readUnsignedIntLE();
				}

				if ((var6 & 131072) != 0) {
					var7 = var2.readUnsignedByteAdd();
					var15 = new int[8];
					var16 = new short[8];

					for (var10 = 0; var10 < 8; ++var10) {
						if ((var7 & 1 << var10) != 0) {
							var15[var10] = var2.readNullableLargeSmart();
							var16[var10] = (short)var2.readShortSmartSub();
						} else {
							var15[var10] = -1;
							var16[var10] = -1;
						}
					}

					var5.method2710(var15, var16);
				}

				if ((var6 & 64) != 0) {
					var7 = var2.readUnsignedShortAddLE();
					var8 = var2.readUnsignedShort();
					var5.field1230 = var2.readUnsignedByteAdd() == 1;
					var5.field1252 = var7;
					var5.field1225 = var8;
				}
			}

			for (var3 = 0; var3 < Client.field639; ++var3) {
				var4 = Client.field644[var3];
				if (var0.npcs[var4].npcCycle != Client.cycle) {
					var0.npcs[var4].definition = null;
					var0.npcs[var4] = null;
				}
			}

			if (var2.offset != Client.packetWriter.serverPacketLength) {
				throw new RuntimeException(var2.offset + "," + Client.packetWriter.serverPacketLength);
			} else {
				for (var3 = 0; var3 < var0.npcCount; ++var3) {
					if (var0.npcs[var0.npcIndices[var3]] == null) {
						throw new RuntimeException(var3 + "," + var0.npcCount);
					}
				}

			}
		}
	}
}
