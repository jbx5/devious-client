import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("aq")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("aw")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor();
		this.future = this.executor.submit(new SecureRandomCallable());
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-29566"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown();
		this.executor = null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "255"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "-124866990"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get();
		} catch (Exception var4) {
			SecureRandom var3 = new SecureRandom();
			var3.nextInt();
			return var3;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1715856735"
	)
	public static int method2228() {
		return ViewportMouse.ViewportMouse_entityCount;
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(ZLun;B)V",
		garbageValue = "-96"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field658 = 0;
		Client.field634 = 0;
		var1.importIndex();
		int var2 = var1.readBits(8);
		int var3;
		if (var2 < Client.npcCount) {
			for (var3 = var2; var3 < Client.npcCount; ++var3) {
				Client.field659[++Client.field658 - 1] = Client.npcIndices[var3];
			}
		}

		if (var2 > Client.npcCount) {
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0;

			int var4;
			int var6;
			int var8;
			int var9;
			int var19;
			for (var3 = 0; var3 < var2; ++var3) {
				var4 = Client.npcIndices[var3];
				NPC var21 = Client.npcs[var4];
				var6 = var1.readBits(1);
				if (var6 == 0) {
					Client.npcIndices[++Client.npcCount - 1] = var4;
					var21.npcCycle = Client.cycle;
				} else {
					var19 = var1.readBits(2);
					if (var19 == 0) {
						Client.npcIndices[++Client.npcCount - 1] = var4;
						var21.npcCycle = Client.cycle;
						Client.field588[++Client.field634 - 1] = var4;
					} else if (var19 == 1) {
						Client.npcIndices[++Client.npcCount - 1] = var4;
						var21.npcCycle = Client.cycle;
						var8 = var1.readBits(3);
						var21.method2659(var8, class233.field2470);
						var9 = var1.readBits(1);
						if (var9 == 1) {
							Client.field588[++Client.field634 - 1] = var4;
						}
					} else if (var19 == 2) {
						Client.npcIndices[++Client.npcCount - 1] = var4;
						var21.npcCycle = Client.cycle;
						if (var1.readBits(1) == 1) {
							var8 = var1.readBits(3);
							var21.method2659(var8, class233.field2472);
							var9 = var1.readBits(3);
							var21.method2659(var9, class233.field2472);
						} else {
							var8 = var1.readBits(3);
							var21.method2659(var8, class233.field2469);
						}

						var8 = var1.readBits(1);
						if (var8 == 1) {
							Client.field588[++Client.field634 - 1] = var4;
						}
					} else if (var19 == 3) {
						Client.field659[++Client.field658 - 1] = var4;
					}
				}
			}

			int var10;
			int var12;
			while (true) {
				byte var22 = 16;
				var3 = 1 << var22;
				if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) < var22 + 12) {
					break;
				}

				var4 = var1.readBits(var22);
				if (var4 == var3 - 1) {
					break;
				}

				boolean var5 = false;
				if (Client.npcs[var4] == null) {
					Client.npcs[var4] = new NPC();
					var5 = true;
				}

				NPC var20 = Client.npcs[var4];
				Client.npcIndices[++Client.npcCount - 1] = var4;
				var20.npcCycle = Client.cycle;
				var10 = var1.readBits(1);
				if (var10 == 1) {
					Client.field588[++Client.field634 - 1] = var4;
				}

				boolean var11 = var1.readBits(1) == 1;
				if (var11) {
					var1.readBits(32);
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

				var20.definition = VarcInt.getNpcDefinition(var1.readBits(14));
				var19 = var1.readBits(1);
				var12 = Client.defaultRotations[var1.readBits(3)];
				if (var5) {
					var20.orientation = var20.rotation = var12;
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

				LoginPacket.method3207(var20);
				if (var20.field1249 == 0) {
					var20.rotation = 0;
				}

				var20.method2654(VarpDefinition.localPlayer.pathX[0] + var8, VarpDefinition.localPlayer.pathY[0] + var9, var19 == 1);
			}

			var1.exportIndex();

			for (var2 = 0; var2 < Client.field634; ++var2) {
				var3 = Client.field588[var2];
				NPC var14 = Client.npcs[var3];
				int var23 = var1.readUnsignedByte();
				if ((var23 & 8) != 0) {
					var6 = var1.readUnsignedByte();
					var23 += var6 << 8;
				}

				if ((var23 & 256) != 0) {
					var6 = var1.readUnsignedByte();
					var23 += var6 << 16;
				}

				if ((var23 & 32) != 0) {
					var14.overheadText = var1.readStringCp1252NullTerminated();
					var14.overheadTextCyclesRemaining = 100;
				}

				if ((var23 & 16384) != 0) {
					var14.field1257 = var1.readByteSub();
					var14.field1259 = var1.readByteNeg();
					var14.field1258 = var1.readByte();
					var14.field1248 = var1.readByte();
					var14.spotAnimation = var1.readUnsignedShortAddLE() + Client.cycle;
					var14.field1271 = var1.readUnsignedShortAddLE() + Client.cycle;
					var14.field1223 = var1.readUnsignedShortAdd();
					var14.pathLength = 1;
					var14.field1280 = 0;
					var14.field1257 += var14.pathX[0];
					var14.field1259 += var14.pathY[0];
					var14.field1258 += var14.pathX[0];
					var14.field1248 += var14.pathY[0];
				}

				if ((var23 & 131072) != 0) {
					var6 = var1.readUnsignedIntME();
					var14.turnLeftSequence = (var6 & 1) != 0 ? var1.readUnsignedShortLE() : var14.definition.turnLeftSequence;
					var14.turnRightSequence = (var6 & 2) != 0 ? var1.readUnsignedShortLE() : var14.definition.turnRightSequence;
					var14.walkSequence = (var6 & 4) != 0 ? var1.readUnsignedShortAdd() : var14.definition.walkSequence;
					var14.walkBackSequence = (var6 & 8) != 0 ? var1.readUnsignedShortAddLE() : var14.definition.walkBackSequence;
					var14.walkLeftSequence = (var6 & 16) != 0 ? var1.readUnsignedShort() : var14.definition.walkLeftSequence;
					var14.walkRightSequence = (var6 & 32) != 0 ? var1.readUnsignedShortAdd() : var14.definition.walkRightSequence;
					var14.runSequence = (var6 & 64) != 0 ? var1.readUnsignedShortLE() : var14.definition.field1979;
					var14.field1219 = (var6 & 128) != 0 ? var1.readUnsignedShortAdd() : var14.definition.field1980;
					var14.field1220 = (var6 & 256) != 0 ? var1.readUnsignedShortAddLE() : var14.definition.field1987;
					var14.field1221 = (var6 & 512) != 0 ? var1.readUnsignedShort() : var14.definition.field1982;
					var14.field1222 = (var6 & 1024) != 0 ? var1.readUnsignedShortAddLE() : var14.definition.field1983;
					var14.field1216 = (var6 & 2048) != 0 ? var1.readUnsignedShort() : var14.definition.field1966;
					var14.field1224 = (var6 & 4096) != 0 ? var1.readUnsignedShortLE() : var14.definition.field1984;
					var14.field1225 = (var6 & 8192) != 0 ? var1.readUnsignedShort() : var14.definition.field1986;
					var14.idleSequence = (var6 & 16384) != 0 ? var1.readUnsignedShortLE() : var14.definition.idleSequence;
				}

				int[] var7;
				short[] var15;
				short[] var16;
				long var17;
				int var24;
				boolean var25;
				if ((var23 & 32768) != 0) {
					var6 = var1.readUnsignedByte();
					if ((var6 & 1) == 1) {
						var14.method2672();
					} else {
						var7 = null;
						if ((var6 & 2) == 2) {
							var8 = var1.readUnsignedByteNeg();
							var7 = new int[var8];

							for (var9 = 0; var9 < var8; ++var9) {
								var10 = var1.readUnsignedShortAddLE();
								var10 = var10 == 65535 ? -1 : var10;
								var7[var9] = var10;
							}
						}

						var15 = null;
						if ((var6 & 4) == 4) {
							var9 = 0;
							if (var14.definition.recolorTo != null) {
								var9 = var14.definition.recolorTo.length;
							}

							var15 = new short[var9];

							for (var10 = 0; var10 < var9; ++var10) {
								var15[var10] = (short)var1.readUnsignedShortAdd();
							}
						}

						var16 = null;
						if ((var6 & 8) == 8) {
							var10 = 0;
							if (var14.definition.retextureTo != null) {
								var10 = var14.definition.retextureTo.length;
							}

							var16 = new short[var10];

							for (var24 = 0; var24 < var10; ++var24) {
								var16[var24] = (short)var1.readUnsignedShortLE();
							}
						}

						var25 = false;
						if ((var6 & 16) != 0) {
							var25 = var1.readUnsignedByteAdd() == 1;
						}

						var17 = (long)(++NPC.field1336 - 1);
						var14.method2703(new NpcOverrides(var17, var7, var15, var16, var25));
					}
				}

				if ((var23 & 128) != 0) {
					var6 = var1.readUnsignedShortAddLE();
					if (var6 == 65535) {
						var6 = -1;
					}

					var19 = var1.readUnsignedByteSub();
					if (var6 == var14.sequence && var6 != -1) {
						var8 = MilliClock.SequenceDefinition_get(var6).restartMode;
						if (var8 == 1) {
							var14.sequenceFrame = 0;
							var14.sequenceFrameCycle = 0;
							var14.sequenceDelay = var19;
							var14.field1254 = 0;
						}

						if (var8 == 2) {
							var14.field1254 = 0;
						}
					} else if (var6 == -1 || var14.sequence == -1 || MilliClock.SequenceDefinition_get(var6).field2266 >= MilliClock.SequenceDefinition_get(var14.sequence).field2266) {
						var14.sequence = var6;
						var14.sequenceFrame = 0;
						var14.sequenceFrameCycle = 0;
						var14.sequenceDelay = var19;
						var14.field1254 = 0;
						var14.field1280 = var14.pathLength;
					}
				}

				if ((var23 & 16) != 0) {
					var6 = var1.readUnsignedShortAdd();
					var19 = var1.readUnsignedShort();
					var14.field1245 = var1.readUnsignedByteNeg() == 1;
					var14.field1243 = var6;
					var14.field1244 = var19;
				}

				if ((var23 & 2) != 0) {
					var14.targetIndex = var1.readUnsignedShortLE();
					var14.targetIndex += var1.readUnsignedByteSub() << 16;
					var6 = 16777215;
					if (var6 == var14.targetIndex) {
						var14.targetIndex = -1;
					}
				}

				if ((var23 & 1024) != 0) {
					var14.method2655(var1.readStringCp1252NullTerminated());
				}

				if ((var23 & 4096) != 0) {
					var14.field1270 = var1.readUnsignedIntME();
				}

				if ((var23 & 64) != 0) {
					var6 = var1.readUnsignedByteAdd();
					if (var6 > 0) {
						for (var19 = 0; var19 < var6; ++var19) {
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

					var19 = var1.readUnsignedByteSub();
					if (var19 > 0) {
						for (var8 = 0; var8 < var19; ++var8) {
							var9 = var1.readUShortSmart();
							var10 = var1.readUShortSmart();
							if (var10 != 32767) {
								var24 = var1.readUShortSmart();
								var12 = var1.readUnsignedByte();
								int var13 = var10 > 0 ? var1.readUnsignedByteAdd() : var12;
								var14.addHealthBar(var9, Client.cycle, var10, var24, var12, var13);
							} else {
								var14.removeHealthBar(var9);
							}
						}
					}
				}

				if ((var23 & 65536) != 0) {
					var6 = var1.readUnsignedByteNeg();

					for (var19 = 0; var19 < var6; ++var19) {
						var8 = var1.readUnsignedByte();
						var9 = var1.readUnsignedShortLE();
						var10 = var1.readUnsignedIntIME();
						var14.updateSpotAnimation(var8, var9, var10 >> 16, var10 & 65535);
					}
				}

				if ((var23 & 262144) != 0) {
					var6 = var1.readUnsignedByteAdd();
					var7 = new int[8];
					var15 = new short[8];

					for (var9 = 0; var9 < 8; ++var9) {
						if ((var6 & 1 << var9) != 0) {
							var7[var9] = var1.readNullableLargeSmart();
							var15[var9] = (short)var1.readShortSmartSub();
						} else {
							var7[var9] = -1;
							var15[var9] = -1;
						}
					}

					var14.method2666(var7, var15);
				}

				if ((var23 & 512) != 0) {
					var6 = var1.readUnsignedByteNeg();
					if ((var6 & 1) == 1) {
						var14.method2671();
					} else {
						var7 = null;
						if ((var6 & 2) == 2) {
							var8 = var1.readUnsignedByteAdd();
							var7 = new int[var8];

							for (var9 = 0; var9 < var8; ++var9) {
								var10 = var1.readUnsignedShort();
								var10 = var10 == 65535 ? -1 : var10;
								var7[var9] = var10;
							}
						}

						var15 = null;
						if ((var6 & 4) == 4) {
							var9 = 0;
							if (var14.definition.recolorTo != null) {
								var9 = var14.definition.recolorTo.length;
							}

							var15 = new short[var9];

							for (var10 = 0; var10 < var9; ++var10) {
								var15[var10] = (short)var1.readUnsignedShort();
							}
						}

						var16 = null;
						if ((var6 & 8) == 8) {
							var10 = 0;
							if (var14.definition.retextureTo != null) {
								var10 = var14.definition.retextureTo.length;
							}

							var16 = new short[var10];

							for (var24 = 0; var24 < var10; ++var24) {
								var16[var24] = (short)var1.readUnsignedShortAdd();
							}
						}

						var25 = false;
						if ((var6 & 16) != 0) {
							var25 = var1.readUnsignedByteAdd() == 1;
						}

						var17 = (long)(++NPC.field1338 - 1);
						var14.method2713(new NpcOverrides(var17, var7, var15, var16, var25));
					}
				}

				if ((var23 & 8192) != 0) {
					var14.method2656(var1.readUnsignedByteSub());
				}

				if ((var23 & 4) != 0) {
					var14.definition = VarcInt.getNpcDefinition(var1.readUnsignedShort());
					LoginPacket.method3207(var14);
					var14.method2667();
				}

				if ((var23 & 2048) != 0) {
					var14.field1262 = Client.cycle + var1.readUnsignedShortAddLE();
					var14.field1278 = Client.cycle + var1.readUnsignedShortAdd();
					var14.field1268 = var1.readByte();
					var14.field1269 = var1.readByteSub();
					var14.field1276 = var1.readByteNeg();
					var14.field1255 = (byte)var1.readUnsignedByteSub();
				}

				if ((var23 & 1) != 0) {
					var1.readUnsignedShortAdd();
					var1.readInt();
				}
			}

			for (var2 = 0; var2 < Client.field658; ++var2) {
				var3 = Client.field659[var2];
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

	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "(Ldm;ZI)V",
		garbageValue = "1781553248"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group;
		int var3 = (int)var0.key;
		var0.remove();
		if (var1) {
			ArchiveLoader.widgetDefinition.method6434(var2);
		}

		class28.method398(var2);
		Widget var4 = ArchiveLoader.widgetDefinition.method6431(var3);
		if (var4 != null) {
			UserComparator5.invalidateWidget(var4);
		}

		if (Client.rootInterface != -1) {
			Canvas.runIntfCloseListeners(Client.rootInterface, 1);
		}

	}
}
