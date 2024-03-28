import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
public class class102 {
	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(Lun;I)V",
		garbageValue = "-1720385947"
	)
	static final void method2657(PacketBuffer var0) {
		for (int var1 = 0; var1 < Client.field571; ++var1) {
			int var2 = Client.field742[var1];
			NPC var3 = Client.npcs[var2];
			int var4 = var0.readUnsignedByte();
			int var5;
			if ((var4 & 2) != 0) {
				var5 = var0.readUnsignedByte();
				var4 += var5 << 8;
			}

			if ((var4 & 256) != 0) {
				var5 = var0.readUnsignedByte();
				var4 += var5 << 16;
			}

			if ((var4 & 64) != 0) {
				var0.readUnsignedShortAdd();
				var0.readUnsignedIntME();
			}

			int var6;
			int var7;
			int var8;
			int var9;
			if ((var4 & 65536) != 0) {
				var5 = var0.readUnsignedByteAdd();

				for (var6 = 0; var6 < var5; ++var6) {
					var7 = var0.readUnsignedByteNeg();
					var8 = var0.readUnsignedShortAddLE();
					var9 = var0.readInt();
					var3.updateSpotAnimation(var7, var8, var9 >> 16, var9 & 65535);
				}
			}

			if ((var4 & 1) != 0) {
				var3.overheadText = var0.readStringCp1252NullTerminated();
				var3.overheadTextCyclesRemaining = 100;
			}

			if ((var4 & 16384) != 0) {
				var3.method2582(var0.readUnsignedByteSub());
			}

			if ((var4 & 8192) != 0) {
				var3.field1251 = var0.readByteNeg();
				var3.field1238 = var0.readByteSub();
				var3.field1258 = var0.readByteAdd();
				var3.field1253 = var0.readByteAdd();
				var3.spotAnimation = var0.readUnsignedShort() + Client.cycle;
				var3.field1256 = var0.readUnsignedShortAddLE() + Client.cycle;
				var3.field1203 = var0.readUnsignedShortLE();
				var3.pathLength = 1;
				var3.field1274 = 0;
				var3.field1251 += var3.pathX[0];
				var3.field1238 += var3.pathY[0];
				var3.field1258 += var3.pathX[0];
				var3.field1253 += var3.pathY[0];
			}

			if ((var4 & 32) != 0) {
				var5 = var0.readUnsignedShortAddLE();
				if (var5 == 65535) {
					var5 = -1;
				}

				var6 = var0.readUnsignedByte();
				if (var5 == var3.sequence && var5 != -1) {
					var7 = DevicePcmPlayerProvider.SequenceDefinition_get(var5).restartMode;
					if (var7 == 1) {
						var3.sequenceFrame = 0;
						var3.sequenceFrameCycle = 0;
						var3.sequenceDelay = var6;
						var3.field1248 = 0;
					}

					if (var7 == 2) {
						var3.field1248 = 0;
					}
				} else if (var5 == -1 || var3.sequence == -1 || DevicePcmPlayerProvider.SequenceDefinition_get(var5).field2393 >= DevicePcmPlayerProvider.SequenceDefinition_get(var3.sequence).field2393) {
					var3.sequence = var5;
					var3.sequenceFrame = 0;
					var3.sequenceFrameCycle = 0;
					var3.sequenceDelay = var6;
					var3.field1248 = 0;
					var3.field1274 = var3.pathLength;
				}
			}

			if ((var4 & 4096) != 0) {
				var3.field1260 = Client.cycle + var0.readUnsignedShort();
				var3.field1236 = Client.cycle + var0.readUnsignedShortAddLE();
				var3.field1261 = var0.readByteAdd();
				var3.field1263 = var0.readByte();
				var3.field1235 = var0.readByteSub();
				var3.field1265 = (byte)var0.readUnsignedByteAdd();
			}

			int[] var13;
			short[] var14;
			if ((var4 & 131072) != 0) {
				var5 = var0.readUnsignedByteSub();
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

				var3.method2591(var13, var14);
			}

			if ((var4 & 32768) != 0) {
				var3.method2626(var0.readStringCp1252NullTerminated());
			}

			int var10;
			short[] var15;
			long var16;
			boolean var18;
			if ((var4 & 1024) != 0) {
				var5 = var0.readUnsignedByteNeg();
				if ((var5 & 1) == 1) {
					var3.method2625();
				} else {
					var13 = null;
					if ((var5 & 2) == 2) {
						var7 = var0.readUnsignedByteNeg();
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
							var15[var10] = (short)var0.readUnsignedShortAdd();
						}
					}

					var18 = false;
					if ((var5 & 16) != 0) {
						var18 = var0.readUnsignedByteAdd() == 1;
					}

					var16 = (long)(++NPC.field1337 - 1);
					var3.method2593(new NpcOverrides(var16, var13, var14, var15, var18));
				}
			}

			if ((var4 & 512) != 0) {
				var5 = var0.readUnsignedByteNeg();
				if ((var5 & 1) == 1) {
					var3.method2597();
				} else {
					var13 = null;
					if ((var5 & 2) == 2) {
						var7 = var0.readUnsignedByte();
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
							var14[var9] = (short)var0.readUnsignedShort();
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

					var18 = false;
					if ((var5 & 16) != 0) {
						var18 = var0.readUnsignedByte() == 1;
					}

					var16 = (long)(++NPC.field1338 - 1);
					var3.method2586(new NpcOverrides(var16, var13, var14, var15, var18));
				}
			}

			if ((var4 & 16) != 0) {
				var3.definition = UserComparator10.getNpcDefinition(var0.readUnsignedShortLE());
				SoundCache.method843(var3);
				var3.method2590();
			}

			if ((var4 & 2048) != 0) {
				var3.field1275 = var0.readUnsignedIntME();
			}

			if ((var4 & 4) != 0) {
				var5 = var0.readUnsignedByte();
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

				var6 = var0.readUnsignedByte();
				if (var6 > 0) {
					for (var7 = 0; var7 < var6; ++var7) {
						var8 = var0.readUShortSmart();
						var9 = var0.readUShortSmart();
						if (var9 != 32767) {
							var10 = var0.readUShortSmart();
							var11 = var0.readUnsignedByte();
							int var12 = var9 > 0 ? var0.readUnsignedByteAdd() : var11;
							var3.addHealthBar(var8, Client.cycle, var9, var10, var11, var12);
						} else {
							var3.removeHealthBar(var8);
						}
					}
				}
			}

			if ((var4 & 8) != 0) {
				var5 = var0.readUnsignedShortAddLE();
				var6 = var0.readUnsignedShortAddLE();
				var3.field1239 = var0.readUnsignedByte() == 1;
				var3.field1237 = var5;
				var3.field1216 = var6;
			}

			if ((var4 & 128) != 0) {
				var3.targetIndex = var0.readUnsignedShortAddLE();
				var3.targetIndex += var0.readUnsignedByte() << 16;
				var5 = 16777215;
				if (var5 == var3.targetIndex) {
					var3.targetIndex = -1;
				}
			}

			if ((var4 & 262144) != 0) {
				var5 = var0.readUnsignedIntME();
				var3.turnLeftSequence = (var5 & 1) != 0 ? var0.readUnsignedShort() : var3.definition.turnLeftSequence;
				var3.turnRightSequence = (var5 & 2) != 0 ? var0.readUnsignedShortLE() : var3.definition.turnRightSequence;
				var3.walkSequence = (var5 & 4) != 0 ? var0.readUnsignedShort() : var3.definition.walkSequence;
				var3.walkBackSequence = (var5 & 8) != 0 ? var0.readUnsignedShort() : var3.definition.walkBackSequence;
				var3.walkLeftSequence = (var5 & 16) != 0 ? var0.readUnsignedShortLE() : var3.definition.walkLeftSequence;
				var3.walkRightSequence = (var5 & 32) != 0 ? var0.readUnsignedShortAddLE() : var3.definition.walkRightSequence;
				var3.runSequence = (var5 & 64) != 0 ? var0.readUnsignedShortAdd() : var3.definition.field2117;
				var3.field1213 = (var5 & 128) != 0 ? var0.readUnsignedShortAdd() : var3.definition.field2105;
				var3.field1214 = (var5 & 256) != 0 ? var0.readUnsignedShortAdd() : var3.definition.field2119;
				var3.field1215 = (var5 & 512) != 0 ? var0.readUnsignedShortAddLE() : var3.definition.field2111;
				var3.field1264 = (var5 & 1024) != 0 ? var0.readUnsignedShortAdd() : var3.definition.field2121;
				var3.field1269 = (var5 & 2048) != 0 ? var0.readUnsignedShortAddLE() : var3.definition.field2122;
				var3.field1218 = (var5 & 4096) != 0 ? var0.readUnsignedShortLE() : var3.definition.field2123;
				var3.field1226 = (var5 & 8192) != 0 ? var0.readUnsignedShortAddLE() : var3.definition.field2124;
				var3.idleSequence = (var5 & 16384) != 0 ? var0.readUnsignedShort() : var3.definition.idleSequence;
			}
		}

	}

	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "(Lcu;I)V",
		garbageValue = "94460787"
	)
	@Export("updateLoginState")
	static void updateLoginState(LoginState var0) {
		if (GraphicsObject.loginState != var0) {
			GraphicsObject.loginState = var0;
		}
	}
}
