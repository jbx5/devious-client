import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
public class class151 extends class159 {
	@ObfuscatedName("bw")
	static String field1714;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1307725651
	)
	int field1712;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	final class160 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgg;)V"
	)
	class151(class160 var1) {
		this.this$0 = var1;
		this.field1712 = -1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltm;B)V",
		garbageValue = "1"
	)
	void vmethod3333(Buffer var1) {
		this.field1712 = var1.readUnsignedShort();
		var1.readUnsignedByte();
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lgo;I)V",
		garbageValue = "831405774"
	)
	void vmethod3332(ClanChannel var1) {
		var1.removeMember(this.field1712);
	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(Lto;I)V",
		garbageValue = "-619616137"
	)
	static final void method3155(PacketBuffer var0) {
		for (int var1 = 0; var1 < Client.field640; ++var1) {
			int var2 = Client.field737[var1];
			NPC var3 = Client.npcs[var2];
			int var4 = var0.readUnsignedByte();
			int var5;
			if ((var4 & 8) != 0) {
				var5 = var0.readUnsignedByte();
				var4 += var5 << 8;
			}

			if ((var4 & 2048) != 0) {
				var5 = var0.readUnsignedByte();
				var4 += var5 << 16;
			}

			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			if ((var4 & 128) != 0) {
				var5 = var0.readUnsignedByteNeg();
				int var11;
				if (var5 > 0) {
					for (var6 = 0; var6 < var5; ++var6) {
						var8 = -1;
						var9 = -1;
						var10 = -1;
						var7 = var0.readUShortSmart();
						if (var7 == 32767) {
							var7 = var0.readUShortSmart();
							var9 = var0.readUShortSmart();
							var8 = var0.readUShortSmart();
							var10 = var0.readUShortSmart();
						} else if (var7 != 32766) {
							var9 = var0.readUShortSmart();
						} else {
							var7 = -1;
						}

						var11 = var0.readUShortSmart();
						var3.addHitSplat(var7, var9, var8, var10, Client.cycle, var11);
					}
				}

				var6 = var0.readUnsignedByteSub();
				if (var6 > 0) {
					for (var7 = 0; var7 < var6; ++var7) {
						var8 = var0.readUShortSmart();
						var9 = var0.readUShortSmart();
						if (var9 != 32767) {
							var10 = var0.readUShortSmart();
							var11 = var0.readUnsignedByteNeg();
							int var12 = var9 > 0 ? var0.readUnsignedByteNeg() : var11;
							var3.addHealthBar(var8, Client.cycle, var9, var10, var11, var12);
						} else {
							var3.removeHealthBar(var8);
						}
					}
				}
			}

			int[] var13;
			short[] var14;
			short[] var15;
			long var16;
			boolean var19;
			if ((var4 & 512) != 0) {
				var5 = var0.readUnsignedByte();
				if ((var5 & 1) == 1) {
					var3.method2582();
				} else {
					var13 = null;
					if ((var5 & 2) == 2) {
						var7 = var0.readUnsignedByteAdd();
						var13 = new int[var7];

						for (var8 = 0; var8 < var7; ++var8) {
							var9 = var0.readUnsignedShortAddLE();
							var9 = var9 == 65535 ? -1 : var9;
							var13[var8] = var9;
						}
					}

					var14 = null;
					if ((var5 & 4) == 4) {
						var8 = 0;
						if (var3.definition.recolorTo != null) {
							var8 = var3.definition.recolorTo.length;
						}

						var14 = new short[var8];

						for (var9 = 0; var9 < var8; ++var9) {
							var14[var9] = (short)var0.readUnsignedShortAdd();
						}
					}

					var15 = null;
					if ((var5 & 8) == 8) {
						var9 = 0;
						if (var3.definition.retextureTo != null) {
							var9 = var3.definition.retextureTo.length;
						}

						var15 = new short[var9];

						for (var10 = 0; var10 < var9; ++var10) {
							var15[var10] = (short)var0.readUnsignedShortAdd();
						}
					}

					var19 = false;
					if ((var5 & 16) != 0) {
						var19 = var0.readUnsignedByteSub() == 1;
					}

					var16 = (long)(++NPC.field1333 - 1);
					var3.method2608(new NpcOverrides(var16, var13, var14, var15, var19));
				}
			}

			if ((var4 & 32) != 0) {
				var5 = var0.readUnsignedShortAdd();
				var6 = var0.readUnsignedShort();
				var3.field1237 = var0.readUnsignedByteNeg() == 1;
				if (Client.revision >= 212) {
					var3.field1235 = var5;
					var3.field1236 = var6;
				} else {
					var7 = var3.x - (var5 - UrlRequester.baseX * 64 - UrlRequester.baseX * 64) * 64;
					var8 = var3.y - (var6 - class47.baseY * 64 - class47.baseY * 64) * 64;
					if (var7 != 0 || var8 != 0) {
						var10 = (int)(Math.atan2((double)var7, (double)var8) * 325.94932345220167D) & 2047;
						var3.field1234 = var10;
					}
				}
			}

			if ((var4 & 64) != 0) {
				var5 = var0.readUnsignedShort();
				if (var5 == 65535) {
					var5 = -1;
				}

				var6 = var0.readUnsignedByteSub();
				if (var5 == var3.sequence && var5 != -1) {
					var7 = EnumComposition.SequenceDefinition_get(var5).field2327;
					if (var7 == 1) {
						var3.sequenceFrame = 0;
						var3.sequenceFrameCycle = 0;
						var3.sequenceDelay = var6;
						var3.field1224 = 0;
					}

					if (var7 == 2) {
						var3.field1224 = 0;
					}
				} else if (var5 == -1 || var3.sequence == -1 || EnumComposition.SequenceDefinition_get(var5).field2320 >= EnumComposition.SequenceDefinition_get(var3.sequence).field2320) {
					var3.sequence = var5;
					var3.sequenceFrame = 0;
					var3.sequenceFrameCycle = 0;
					var3.sequenceDelay = var6;
					var3.field1224 = 0;
					var3.field1261 = var3.pathLength;
				}
			}

			if ((var4 & 131072) != 0) {
				var5 = var0.readUnsignedByteNeg();

				for (var6 = 0; var6 < var5; ++var6) {
					var7 = var0.readUnsignedByteSub();
					var8 = var0.readUnsignedShortAddLE();
					var9 = var0.readUnsignedIntLE();
					var3.updateSpotAnimation(var7, var8, var9 >> 16, var9 & 65535);
				}
			}

			if ((var4 & 4) != 0) {
				var3.definition = class90.getNpcDefinition(var0.readUnsignedShort());
				ItemLayer.method4266(var3);
				var3.method2581();
			}

			if ((var4 & 16) != 0) {
				var3.targetIndex = var0.readUnsignedShortLE();
				var3.targetIndex += var0.readUnsignedByteSub() << 16;
				var5 = 16777215;
				if (var5 == var3.targetIndex) {
					var3.targetIndex = -1;
				}
			}

			if ((var4 & 4096) != 0) {
				var3.field1249 = var0.readByteSub();
				var3.field1251 = var0.readByteSub();
				var3.field1247 = var0.readByteNeg();
				var3.field1217 = var0.readByteAdd();
				var3.spotAnimation = var0.readUnsignedShortLE() + Client.cycle;
				var3.field1254 = var0.readUnsignedShort() + Client.cycle;
				var3.field1255 = var0.readUnsignedShortAddLE();
				var3.pathLength = 1;
				var3.field1261 = 0;
				var3.field1249 += var3.pathX[0];
				var3.field1251 += var3.pathY[0];
				var3.field1247 += var3.pathX[0];
				var3.field1217 += var3.pathY[0];
			}

			if ((var4 & 65536) != 0) {
				var5 = var0.readUnsignedIntME();
				var3.turnLeftSequence = (var5 & 1) != 0 ? var0.readUnsignedShortAddLE() : var3.definition.turnLeftSequence;
				var3.turnRightSequence = (var5 & 2) != 0 ? var0.readUnsignedShortAdd() : var3.definition.turnRightSequence;
				var3.walkSequence = (var5 & 4) != 0 ? var0.readUnsignedShortLE() : var3.definition.walkSequence;
				var3.walkBackSequence = (var5 & 8) != 0 ? var0.readUnsignedShortAddLE() : var3.definition.walkBackSequence;
				var3.walkLeftSequence = (var5 & 16) != 0 ? var0.readUnsignedShortAdd() : var3.definition.walkLeftSequence;
				var3.walkRightSequence = (var5 & 32) != 0 ? var0.readUnsignedShortAdd() : var3.definition.walkRightSequence;
				var3.runSequence = (var5 & 64) != 0 ? var0.readUnsignedShortAddLE() : var3.definition.field2047;
				var3.field1211 = (var5 & 128) != 0 ? var0.readUnsignedShortAddLE() : var3.definition.field2048;
				var3.field1252 = (var5 & 256) != 0 ? var0.readUnsignedShortLE() : var3.definition.field2049;
				var3.field1213 = (var5 & 512) != 0 ? var0.readUnsignedShortAddLE() : var3.definition.field2075;
				var3.field1214 = (var5 & 1024) != 0 ? var0.readUnsignedShortLE() : var3.definition.field2043;
				var3.field1215 = (var5 & 2048) != 0 ? var0.readUnsignedShortAddLE() : var3.definition.field2052;
				var3.field1216 = (var5 & 4096) != 0 ? var0.readUnsignedShortLE() : var3.definition.field2059;
				var3.field1246 = (var5 & 8192) != 0 ? var0.readUnsignedShortAdd() : var3.definition.field2076;
				var3.idleSequence = (var5 & 16384) != 0 ? var0.readUnsignedShortLE() : var3.definition.idleSequence;
			}

			if ((var4 & 262144) != 0) {
				var5 = var0.readUnsignedByte();
				var13 = new int[8];
				var14 = new short[8];

				for (var8 = 0; var8 < 8; ++var8) {
					if ((var5 & 1 << var8) != 0) {
						var13[var8] = var0.readNullableLargeSmart();
						var14[var8] = (short)var0.readShortSmartSub();
					} else {
						var13[var8] = -1;
						var14[var8] = -1;
					}
				}

				var3.method2580(var13, var14);
			}

			if ((var4 & 32768) != 0) {
				var3.method2569(var0.readStringCp1252NullTerminated());
			}

			if ((var4 & 2) != 0) {
				var0.readUnsignedShort();
				var0.readInt();
			}

			if ((var4 & 1) != 0) {
				var3.overheadText = var0.readStringCp1252NullTerminated();
				var3.overheadTextCyclesRemaining = 100;
			}

			if ((var4 & 8192) != 0) {
				var3.field1258 = Client.cycle + var0.readUnsignedShort();
				var3.field1200 = Client.cycle + var0.readUnsignedShort();
				var3.field1260 = var0.readByteNeg();
				var3.field1218 = var0.readByteNeg();
				var3.field1212 = var0.readByteNeg();
				var3.field1250 = (byte)var0.readUnsignedByte();
			}

			if ((var4 & 256) != 0) {
				var5 = var0.readUnsignedByteAdd();
				if ((var5 & 1) == 1) {
					var3.method2586();
				} else {
					var13 = null;
					if ((var5 & 2) == 2) {
						var7 = var0.readUnsignedByteAdd();
						var13 = new int[var7];

						for (var8 = 0; var8 < var7; ++var8) {
							var9 = var0.readUnsignedShortAdd();
							var9 = var9 == 65535 ? -1 : var9;
							var13[var8] = var9;
						}
					}

					var14 = null;
					if ((var5 & 4) == 4) {
						var8 = 0;
						if (var3.definition.recolorTo != null) {
							var8 = var3.definition.recolorTo.length;
						}

						var14 = new short[var8];

						for (var9 = 0; var9 < var8; ++var9) {
							var14[var9] = (short)var0.readUnsignedShortAdd();
						}
					}

					var15 = null;
					if ((var5 & 8) == 8) {
						var9 = 0;
						if (var3.definition.retextureTo != null) {
							var9 = var3.definition.retextureTo.length;
						}

						var15 = new short[var9];

						for (var10 = 0; var10 < var9; ++var10) {
							var15[var10] = (short)var0.readUnsignedShortLE();
						}
					}

					var19 = false;
					if ((var5 & 16) != 0) {
						var19 = var0.readUnsignedByteSub() == 1;
					}

					var16 = (long)(++NPC.field1325 - 1);
					var3.method2584(new NpcOverrides(var16, var13, var14, var15, var19));
				}
			}

			if ((var4 & 16384) != 0) {
				var3.method2570(var0.readUnsignedByteAdd());
			}

			if ((var4 & 1024) != 0) {
				var3.field1273 = var0.readInt();
			}
		}

	}
}
