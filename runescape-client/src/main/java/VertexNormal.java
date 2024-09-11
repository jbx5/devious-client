import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static Archive field2888;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1528767445
	)
	@Export("x")
	int x;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1043057419
	)
	@Export("y")
	int y;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1715968623
	)
	@Export("z")
	int z;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -608243259
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	}

	@ObfuscatedSignature(
		descriptor = "(Ljc;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x;
		this.y = var1.y;
		this.z = var1.z;
		this.magnitude = var1.magnitude;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "1187141301"
	)
	static int method5414(int var0, Script var1, boolean var2) {
		if (var0 == 6754) {
			int var5 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
			NPCComposition var6 = class168.getNpcDefinition(var5);
			Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var6 != null ? var6.name : "";
			return 1;
		} else {
			NPCComposition var3;
			if (var0 == 6764) {
				class320.Interpreter_intStackSize -= 2;
				var3 = class168.getNpcDefinition(Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize]);
				int var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.method4007(var4);
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3.method4006(var4);
				return 1;
			} else if (var0 == 6765) {
				var3 = class168.getNpcDefinition(Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3 != null ? var3.combatLevel : 0;
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "1114068733"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		int var2 = var1.readUnsignedByte();
		int var3 = var1.readInt();
		if (var3 < 0 || AbstractArchive.field4562 != 0 && var3 > AbstractArchive.field4562) {
			throw new RuntimeException();
		} else if (var2 == 0) {
			byte[] var6 = new byte[var3];
			var1.readBytes(var6, 0, var3);
			return var6;
		} else {
			int var4 = var1.readInt();
			if (var4 >= 0 && (AbstractArchive.field4562 == 0 || var4 <= AbstractArchive.field4562)) {
				byte[] var5 = new byte[var4];
				if (var2 == 1) {
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5);
				}

				return var5;
			} else {
				throw new RuntimeException();
			}
		}
	}

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "(Ldd;Lva;I)V",
		garbageValue = "1544332661"
	)
	static final void method5412(WorldView var0, PacketBuffer var1) {
		for (int var2 = 0; var2 < Client.npcCount; ++var2) {
			int var3 = Client.npcIndices[var2];
			NPC var4 = var0.npcs[var3];
			int var5 = var1.readUnsignedByte();
			int var6;
			if ((var5 & 32) != 0) {
				var6 = var1.readUnsignedByte();
				var5 += var6 << 8;
			}

			if ((var5 & 512) != 0) {
				var6 = var1.readUnsignedByte();
				var5 += var6 << 16;
			}

			if ((var5 & 64) != 0) {
				var4.definition = class168.getNpcDefinition(var1.readUnsignedShortAdd());
				DesktopPlatformInfoProvider.method9271(var4);
			}

			if ((var5 & 1) != 0) {
				var4.overheadText = var1.readStringCp1252NullTerminated();
				var4.overheadTextCyclesRemaining = 100;
			}

			int var7;
			if ((var5 & 8) != 0) {
				var6 = var1.readUnsignedShort();
				var7 = var1.readUnsignedShortLE();
				var4.field1263 = var1.readUnsignedByteNeg() == 1;
				var4.field1261 = var6;
				var4.field1262 = var7;
			}

			if ((var5 & 32768) != 0) {
				var4.method2932(var1.readUnsignedByte());
			}

			int var8;
			if ((var5 & 2) != 0) {
				var6 = var1.readUnsignedShortAddLE();
				if (var6 == 65535) {
					var6 = -1;
				}

				var7 = var1.readUnsignedByteAdd();
				if (var6 == var4.sequence && var6 != -1) {
					var8 = HealthBarUpdate.SequenceDefinition_get(var6).restartMode;
					if (var8 == 1) {
						var4.sequenceFrame = 0;
						var4.sequenceFrameCycle = 0;
						var4.sequenceDelay = var7;
						var4.field1272 = 0;
					}

					if (var8 == 2) {
						var4.field1272 = 0;
					}
				} else if (var6 == -1 || var4.sequence == -1 || HealthBarUpdate.SequenceDefinition_get(var6).field2321 >= HealthBarUpdate.SequenceDefinition_get(var4.sequence).field2321) {
					var4.sequence = var6;
					var4.sequenceFrame = 0;
					var4.sequenceFrameCycle = 0;
					var4.sequenceDelay = var7;
					var4.field1272 = 0;
					var4.field1298 = var4.pathLength;
				}
			}

			if ((var5 & 16) != 0) {
				var4.targetIndex = var1.readUnsignedShortAddLE();
				var4.targetIndex += var1.readUnsignedByteNeg() << 16;
				var6 = 16777215;
				if (var6 == var4.targetIndex) {
					var4.targetIndex = -1;
				}
			}

			int var9;
			int var10;
			int var11;
			int[] var14;
			short[] var15;
			short[] var16;
			long var17;
			boolean var19;
			if ((var5 & 2048) != 0) {
				var6 = var1.readUnsignedByteNeg();
				if ((var6 & 1) == 1) {
					var4.method2890();
				} else {
					var14 = null;
					if ((var6 & 2) == 2) {
						var8 = var1.readUnsignedByteAdd();
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
							var15[var10] = (short)var1.readUnsignedShortAddLE();
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

					var19 = false;
					if ((var6 & 16) != 0) {
						var19 = var1.readUnsignedByteSub() == 1;
					}

					var17 = (long)(++NPC.field1389 - 1);
					var4.method2888(new NpcOverrides(var17, var14, var15, var16, var19));
				}
			}

			if ((var5 & 16384) != 0) {
				var4.field1239 = var1.readUnsignedIntLE();
			}

			if ((var5 & 256) != 0) {
				var4.method2914(var1.readStringCp1252NullTerminated());
			}

			if ((var5 & 1024) != 0) {
				var4.field1284 = Client.cycle + var1.readUnsignedShortLE();
				var4.field1258 = Client.cycle + var1.readUnsignedShort();
				var4.field1259 = var1.readByteAdd();
				var4.field1287 = var1.readByteNeg();
				var4.field1288 = var1.readByte();
				var4.field1285 = (byte)var1.readUnsignedByteNeg();
			}

			if ((var5 & 65536) != 0) {
				var6 = var1.readUnsignedByteAdd();
				if (var6 == 0) {
					var4.method2885();
				} else {
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

					var4.method2873(var14, var15);
				}
			}

			if ((var5 & 131072) != 0) {
				var6 = var1.readUnsignedIntLE();
				var4.turnLeftSequence = (var6 & 1) != 0 ? var1.readUnsignedShortLE() : var4.definition.turnLeftSequence;
				var4.turnRightSequence = (var6 & 2) != 0 ? var1.readUnsignedShortAddLE() : var4.definition.turnRightSequence;
				var4.walkSequence = (var6 & 4) != 0 ? var1.readUnsignedShortAdd() : var4.definition.walkSequence;
				var4.walkBackSequence = (var6 & 8) != 0 ? var1.readUnsignedShort() : var4.definition.walkBackSequence;
				var4.walkLeftSequence = (var6 & 16) != 0 ? var1.readUnsignedShort() : var4.definition.walkLeftSequence;
				var4.walkRightSequence = (var6 & 32) != 0 ? var1.readUnsignedShortLE() : var4.definition.walkRightSequence;
				var4.runSequence = (var6 & 64) != 0 ? var1.readUnsignedShortLE() : var4.definition.field2012;
				var4.field1237 = (var6 & 128) != 0 ? var1.readUnsignedShortAddLE() : var4.definition.field2015;
				var4.field1238 = (var6 & 256) != 0 ? var1.readUnsignedShortAddLE() : var4.definition.field2021;
				var4.field1280 = (var6 & 512) != 0 ? var1.readUnsignedShortAdd() : var4.definition.field2029;
				var4.field1286 = (var6 & 1024) != 0 ? var1.readUnsignedShortAdd() : var4.definition.field2023;
				var4.field1240 = (var6 & 2048) != 0 ? var1.readUnsignedShortLE() : var4.definition.field2051;
				var4.field1241 = (var6 & 4096) != 0 ? var1.readUnsignedShortLE() : var4.definition.field2020;
				var4.field1243 = (var6 & 8192) != 0 ? var1.readUnsignedShortAdd() : var4.definition.field2026;
				var4.idleSequence = (var6 & 16384) != 0 ? var1.readUnsignedShortLE() : var4.definition.idleSequence;
			}

			if ((var5 & 8192) != 0) {
				var6 = var1.readUnsignedByteNeg();
				if ((var6 & 1) == 1) {
					var4.method2889();
				} else {
					var14 = null;
					if ((var6 & 2) == 2) {
						var8 = var1.readUnsignedByte();
						var14 = new int[var8];

						for (var9 = 0; var9 < var8; ++var9) {
							var10 = var1.readUnsignedShortAddLE();
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
							var15[var10] = (short)var1.readUnsignedShort();
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
							var16[var11] = (short)var1.readUnsignedShortAddLE();
						}
					}

					var19 = false;
					if ((var6 & 16) != 0) {
						var19 = var1.readUnsignedByteNeg() == 1;
					}

					var17 = (long)(++NPC.field1388 - 1);
					var4.method2938(new NpcOverrides(var17, var14, var15, var16, var19));
				}
			}

			if ((var5 & 4) != 0) {
				var1.readUnsignedShort();
				var1.readUnsignedIntME();
			}

			if ((var5 & 262144) != 0) {
				var6 = var1.readUnsignedByteAdd();

				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var1.readUnsignedByteSub();
					var9 = var1.readUnsignedShortAdd();
					var10 = var1.readInt();
					var4.updateSpotAnimation(var8, var9, var10 >> 16, var10 & 65535);
				}
			}

			if ((var5 & 128) != 0) {
				var6 = var1.readUnsignedByteSub();
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
							int var13 = var10 > 0 ? var1.readUnsignedByteAdd() : var12;
							var4.addHealthBar(var9, Client.cycle, var10, var11, var12, var13);
						} else {
							var4.removeHealthBar(var9);
						}
					}
				}
			}

			if ((var5 & 4096) != 0) {
				var4.field1257 = var1.readByteSub();
				var4.field1248 = var1.readByteAdd();
				var4.field1276 = var1.readByte();
				var4.field1231 = var1.readByteNeg();
				var4.spotAnimation = var1.readUnsignedShortLE() + Client.cycle;
				var4.field1233 = var1.readUnsignedShortLE() + Client.cycle;
				var4.field1291 = var1.readUnsignedShort();
				var4.pathLength = 1;
				var4.field1298 = 0;
				var4.field1257 += var4.pathX[0];
				var4.field1248 += var4.pathY[0];
				var4.field1276 += var4.pathX[0];
				var4.field1231 += var4.pathY[0];
			}
		}

	}
}
