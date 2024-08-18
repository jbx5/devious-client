import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	static Archive field2111;
	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1285920303
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 568714897
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1856391555
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -968759573
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1443002863
	)
	@Export("type")
	int type;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1140033735
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 10908625
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -95599341
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 265764403
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1730286529
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1841198647
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 315108617
	)
	int field2106;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 351587695
	)
	int field2107;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1052798291
	)
	int field2097;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1371378313
	)
	int field2109;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1368255267
	)
	int field2110;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1867245021
	)
	int field2099;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1595607165
	)
	int field2112;

	Occluder() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILsi;Loj;B)V",
		garbageValue = "103"
	)
	static void method4146(int var0, ArchiveDisk var1, Archive var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction();
		var3.type = 1;
		var3.key = (long)var0;
		var3.archiveDisk = var1;
		var3.archive = var2;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
		}

		class172.method3626();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1892831697"
	)
	static void method4145() {
		Tiles.Tiles_minPlane = 99;
		Tiles.Tiles_underlays = new short[4][104][104];
		Tiles.Tiles_overlays = new short[4][104][104];
		class213.Tiles_shapes = new byte[4][104][104];
		class4.field6 = new byte[4][104][104];
		WorldMapDecoration.field3177 = new int[4][105][105];
		class431.Tiles_underlays2 = new byte[4][105][105];
		Tiles.field1032 = new int[105][105];
		Tiles.Tiles_hue = new int[104];
		Huffman.Tiles_saturation = new int[104];
		Tiles.Tiles_lightness = new int[104];
		class361.Tiles_hueMultiplier = new int[104];
		class36.field218 = new int[104];
	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(Ldy;ZLvs;I)V",
		garbageValue = "87407634"
	)
	@Export("updateNpcs")
	static final void updateNpcs(WorldView var0, boolean var1, PacketBuffer var2) {
		Client.field637 = 0;
		Client.npcCount = 0;
		class142.method3294(var0, var2);
		class59.method1135(var0, var1, var2);

		int var3;
		int var4;
		for (var3 = 0; var3 < Client.npcCount; ++var3) {
			var4 = Client.npcIndices[var3];
			NPC var5 = var0.npcs[var4];
			int var6 = var2.readUnsignedByte();
			int var7;
			if ((var6 & 64) != 0) {
				var7 = var2.readUnsignedByte();
				var6 += var7 << 8;
			}

			if ((var6 & 32768) != 0) {
				var7 = var2.readUnsignedByte();
				var6 += var7 << 16;
			}

			if ((var6 & 4) != 0) {
				var5.targetIndex = var2.readUnsignedShortAdd();
				var5.targetIndex += var2.readUnsignedByte() << 16;
				var7 = 16777215;
				if (var7 == var5.targetIndex) {
					var5.targetIndex = -1;
				}
			}

			if ((var6 & 256) != 0) {
				var5.field1213 = var2.readUnsignedIntLE();
			}

			if ((var6 & 65536) != 0) {
				var7 = var2.readInt();
				var5.turnLeftSequence = (var7 & 1) != 0 ? var2.readUnsignedShort() : var5.definition.turnLeftSequence;
				var5.turnRightSequence = (var7 & 2) != 0 ? var2.readUnsignedShortAddLE() : var5.definition.turnRightSequence;
				var5.walkSequence = (var7 & 4) != 0 ? var2.readUnsignedShort() : var5.definition.walkSequence;
				var5.walkBackSequence = (var7 & 8) != 0 ? var2.readUnsignedShort() : var5.definition.walkBackSequence;
				var5.walkLeftSequence = (var7 & 16) != 0 ? var2.readUnsignedShortLE() : var5.definition.walkLeftSequence;
				var5.walkRightSequence = (var7 & 32) != 0 ? var2.readUnsignedShortLE() : var5.definition.walkRightSequence;
				var5.runSequence = (var7 & 64) != 0 ? var2.readUnsignedShort() : var5.definition.field2580;
				var5.field1251 = (var7 & 128) != 0 ? var2.readUnsignedShortAddLE() : var5.definition.field2579;
				var5.field1194 = (var7 & 256) != 0 ? var2.readUnsignedShortAdd() : var5.definition.field2582;
				var5.field1195 = (var7 & 512) != 0 ? var2.readUnsignedShortLE() : var5.definition.field2596;
				var5.field1196 = (var7 & 1024) != 0 ? var2.readUnsignedShortLE() : var5.definition.field2584;
				var5.field1197 = (var7 & 2048) != 0 ? var2.readUnsignedShortAdd() : var5.definition.field2585;
				var5.field1188 = (var7 & 4096) != 0 ? var2.readUnsignedShortLE() : var5.definition.field2586;
				var5.field1199 = (var7 & 8192) != 0 ? var2.readUnsignedShortAddLE() : var5.definition.field2587;
				var5.idleSequence = (var7 & 16384) != 0 ? var2.readUnsignedShortAddLE() : var5.definition.idleSequence;
			}

			if ((var6 & 512) != 0) {
				var5.field1244 = Client.cycle + var2.readUnsignedShort();
				var5.field1241 = Client.cycle + var2.readUnsignedShortAdd();
				var5.field1242 = var2.readByteNeg();
				var5.field1243 = var2.readByteAdd();
				var5.field1240 = var2.readByte();
				var5.field1220 = (byte)var2.readUnsignedByteSub();
			}

			int[] var8;
			short[] var9;
			int var10;
			if ((var6 & 131072) != 0) {
				var7 = var2.readUnsignedByteNeg();
				var8 = new int[8];
				var9 = new short[8];

				for (var10 = 0; var10 < 8; ++var10) {
					if ((var7 & 1 << var10) != 0) {
						var8[var10] = var2.readNullableLargeSmart();
						var9[var10] = (short)var2.readShortSmartSub();
					} else {
						var8[var10] = -1;
						var9[var10] = -1;
					}
				}

				var5.method2758(var8, var9);
			}

			int var11;
			int var12;
			int var15;
			short[] var16;
			long var17;
			boolean var20;
			if ((var6 & 16384) != 0) {
				var7 = var2.readUnsignedByteNeg();
				if ((var7 & 1) == 1) {
					var5.method2764();
				} else {
					var8 = null;
					if ((var7 & 2) == 2) {
						var15 = var2.readUnsignedByteNeg();
						var8 = new int[var15];

						for (var10 = 0; var10 < var15; ++var10) {
							var11 = var2.readUnsignedShortLE();
							var11 = var11 == 65535 ? -1 : var11;
							var8[var10] = var11;
						}
					}

					var9 = null;
					if ((var7 & 4) == 4) {
						var10 = 0;
						if (var5.definition.recolorTo != null) {
							var10 = var5.definition.recolorTo.length;
						}

						var9 = new short[var10];

						for (var11 = 0; var11 < var10; ++var11) {
							var9[var11] = (short)var2.readUnsignedShortAddLE();
						}
					}

					var16 = null;
					if ((var7 & 8) == 8) {
						var11 = 0;
						if (var5.definition.retextureTo != null) {
							var11 = var5.definition.retextureTo.length;
						}

						var16 = new short[var11];

						for (var12 = 0; var12 < var11; ++var12) {
							var16[var12] = (short)var2.readUnsignedShortAdd();
						}
					}

					var20 = false;
					if ((var7 & 16) != 0) {
						var20 = var2.readUnsignedByteNeg() == 1;
					}

					var17 = (long)(++NPC.field1341 - 1);
					var5.method2770(new NpcOverrides(var17, var8, var9, var16, var20));
				}
			}

			int var19;
			if ((var6 & 262144) != 0) {
				var7 = var2.readUnsignedByteAdd();

				for (var19 = 0; var19 < var7; ++var19) {
					var15 = var2.readUnsignedByteNeg();
					var10 = var2.readUnsignedShortAdd();
					var11 = var2.readUnsignedIntIME();
					var5.updateSpotAnimation(var15, var10, var11 >> 16, var11 & 65535);
				}
			}

			if ((var6 & 8192) != 0) {
				var5.method2747(var2.readStringCp1252NullTerminated());
			}

			if ((var6 & 1) != 0) {
				var7 = var2.readUnsignedShortLE();
				var19 = var2.readUnsignedShortAddLE();
				var5.field1219 = var2.readUnsignedByteSub() == 1;
				var5.field1200 = var7;
				var5.field1218 = var19;
			}

			if ((var6 & 8) != 0) {
				var7 = var2.readUnsignedByteNeg();
				int var13;
				if (var7 > 0) {
					for (var19 = 0; var19 < var7; ++var19) {
						var10 = -1;
						var11 = -1;
						var12 = -1;
						var15 = var2.readUShortSmart();
						if (var15 == 32767) {
							var15 = var2.readUShortSmart();
							var11 = var2.readUShortSmart();
							var10 = var2.readUShortSmart();
							var12 = var2.readUShortSmart();
						} else if (var15 != 32766) {
							var11 = var2.readUShortSmart();
						} else {
							var15 = -1;
						}

						var13 = var2.readUShortSmart();
						var5.addHitSplat(var15, var11, var10, var12, Client.cycle, var13);
					}
				}

				var19 = var2.readUnsignedByteNeg();
				if (var19 > 0) {
					for (var15 = 0; var15 < var19; ++var15) {
						var10 = var2.readUShortSmart();
						var11 = var2.readUShortSmart();
						if (var11 != 32767) {
							var12 = var2.readUShortSmart();
							var13 = var2.readUnsignedByteNeg();
							int var14 = var11 > 0 ? var2.readUnsignedByteSub() : var13;
							var5.addHealthBar(var10, Client.cycle, var11, var12, var13, var14);
						} else {
							var5.removeHealthBar(var10);
						}
					}
				}
			}

			if ((var6 & 2048) != 0) {
				var5.field1231 = var2.readByteAdd();
				var5.field1233 = var2.readByteSub();
				var5.field1232 = var2.readByteSub();
				var5.field1234 = var2.readByteSub();
				var5.spotAnimation = var2.readUnsignedShortAddLE() + Client.cycle;
				var5.field1236 = var2.readUnsignedShortLE() + Client.cycle;
				var5.field1237 = var2.readUnsignedShortLE();
				var5.pathLength = 1;
				var5.field1255 = 0;
				var5.field1231 += var5.pathX[0];
				var5.field1233 += var5.pathY[0];
				var5.field1232 += var5.pathX[0];
				var5.field1234 += var5.pathY[0];
			}

			if ((var6 & 4096) != 0) {
				var7 = var2.readUnsignedByteAdd();
				if ((var7 & 1) == 1) {
					var5.method2782();
				} else {
					var8 = null;
					if ((var7 & 2) == 2) {
						var15 = var2.readUnsignedByteNeg();
						var8 = new int[var15];

						for (var10 = 0; var10 < var15; ++var10) {
							var11 = var2.readUnsignedShortLE();
							var11 = var11 == 65535 ? -1 : var11;
							var8[var10] = var11;
						}
					}

					var9 = null;
					if ((var7 & 4) == 4) {
						var10 = 0;
						if (var5.definition.recolorTo != null) {
							var10 = var5.definition.recolorTo.length;
						}

						var9 = new short[var10];

						for (var11 = 0; var11 < var10; ++var11) {
							var9[var11] = (short)var2.readUnsignedShort();
						}
					}

					var16 = null;
					if ((var7 & 8) == 8) {
						var11 = 0;
						if (var5.definition.retextureTo != null) {
							var11 = var5.definition.retextureTo.length;
						}

						var16 = new short[var11];

						for (var12 = 0; var12 < var11; ++var12) {
							var16[var12] = (short)var2.readUnsignedShort();
						}
					}

					var20 = false;
					if ((var7 & 16) != 0) {
						var20 = var2.readUnsignedByteNeg() == 1;
					}

					var17 = (long)(++NPC.field1343 - 1);
					var5.method2760(new NpcOverrides(var17, var8, var9, var16, var20));
				}
			}

			if ((var6 & 2) != 0) {
				var5.definition = UserComparator8.getNpcDefinition(var2.readUnsignedShort());
				class229.method4770(var5);
				var5.method2759();
			}

			if ((var6 & 16) != 0) {
				var7 = var2.readUnsignedShort();
				if (var7 == 65535) {
					var7 = -1;
				}

				var19 = var2.readUnsignedByteAdd();
				if (var7 == var5.sequence && var7 != -1) {
					var15 = class182.SequenceDefinition_get(var7).restartMode;
					if (var15 == 1) {
						var5.sequenceFrame = 0;
						var5.sequenceFrameCycle = 0;
						var5.sequenceDelay = var19;
						var5.field1228 = 0;
					}

					if (var15 == 2) {
						var5.field1228 = 0;
					}
				} else if (var7 == -1 || var5.sequence == -1 || class182.SequenceDefinition_get(var7).field2867 >= class182.SequenceDefinition_get(var5.sequence).field2867) {
					var5.sequence = var7;
					var5.sequenceFrame = 0;
					var5.sequenceFrameCycle = 0;
					var5.sequenceDelay = var19;
					var5.field1228 = 0;
					var5.field1255 = var5.pathLength;
				}
			}

			if ((var6 & 32) != 0) {
				var2.readUnsignedShortAddLE();
				var2.readInt();
			}

			if ((var6 & 1024) != 0) {
				var5.method2748(var2.readUnsignedByteAdd());
			}

			if ((var6 & 128) != 0) {
				var5.overheadText = var2.readStringCp1252NullTerminated();
				var5.overheadTextCyclesRemaining = 100;
			}
		}

		for (var3 = 0; var3 < Client.field637; ++var3) {
			var4 = Client.field584[var3];
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
