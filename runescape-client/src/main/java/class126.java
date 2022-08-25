import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("da")
public class class126 extends class128 {
	@ObfuscatedName("s")
	@ObfuscatedGetter(longValue = -4861736174354117555L)
	long field1532;

	@ObfuscatedName("h")
	String field1533;

	@ObfuscatedSignature(descriptor = "Lei;")
	final class131 this$0;

	@ObfuscatedSignature(descriptor = "(Lei;)V")
	class126(class131 var1) {
		this.this$0 = var1;
		this.field1532 = -1L;
		this.field1533 = null;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lqr;I)V", garbageValue = "-885940784")
	void vmethod3087(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1532 = var1.readLong();
		}
		this.field1533 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Leh;B)V", garbageValue = "0")
	void vmethod3084(ClanSettings var1) {
		var1.method2955(this.field1532, this.field1533, 0);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lqz;I)V", garbageValue = "507766968")
	static final void method2789(PacketBuffer var0) {
		for (int var1 = 0; var1 < Players.Players_pendingUpdateCount; ++var1) {
			int var2 = Players.Players_pendingUpdateIndices[var1];
			Player var3 = Client.players[var2];
			int var4 = var0.readUnsignedByte();
			if ((var4 & 32) != 0) {
				var4 += var0.readUnsignedByte() << 8;
			}
			FriendLoginUpdate.method6596(var0, var2, var3, var4);
		}
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(descriptor = "(ZLqz;I)V", garbageValue = "346209419")
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field495 = 0;
		Client.field533 = 0;
		PacketBuffer var2 = Client.packetWriter.packetBuffer;
		var2.importIndex();
		int var3 = var2.readBits(8);
		int var4;
		if (var3 < Client.npcCount) {
			for (var4 = var3; var4 < Client.npcCount; ++var4) {
				Client.field584[++Client.field495 - 1] = Client.npcIndices[var4];
			}
		}
		if (var3 > Client.npcCount) {
			throw new RuntimeException("");
		} else {
			Client.npcCount = 0;
			int var5;
			int var7;
			int var8;
			int var9;
			int var10;
			for (var4 = 0; var4 < var3; ++var4) {
				var5 = Client.npcIndices[var4];
				NPC var16 = Client.npcs[var5];
				var7 = var2.readBits(1);
				if (var7 == 0) {
					Client.npcIndices[++Client.npcCount - 1] = var5;
					var16.npcCycle = Client.cycle;
				} else {
					var8 = var2.readBits(2);
					if (var8 == 0) {
						Client.npcIndices[++Client.npcCount - 1] = var5;
						var16.npcCycle = Client.cycle;
						Client.field534[++Client.field533 - 1] = var5;
					} else if (var8 == 1) {
						Client.npcIndices[++Client.npcCount - 1] = var5;
						var16.npcCycle = Client.cycle;
						var9 = var2.readBits(3);
						var16.method2315(var9, class192.field2206);
						var10 = var2.readBits(1);
						if (var10 == 1) {
							Client.field534[++Client.field533 - 1] = var5;
						}
					} else if (var8 == 2) {
						Client.npcIndices[++Client.npcCount - 1] = var5;
						var16.npcCycle = Client.cycle;
						if (var2.readBits(1) == 1) {
							var9 = var2.readBits(3);
							var16.method2315(var9, class192.field2207);
							var10 = var2.readBits(3);
							var16.method2315(var10, class192.field2207);
						} else {
							var9 = var2.readBits(3);
							var16.method2315(var9, class192.field2209);
						}
						var9 = var2.readBits(1);
						if (var9 == 1) {
							Client.field534[++Client.field533 - 1] = var5;
						}
					} else if (var8 == 3) {
						Client.field584[++Client.field495 - 1] = var5;
					}
				}
			}
			int var6;
			int var14;
			NPC var15;
			while (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= 27) {
				var14 = var1.readBits(15);
				if (var14 == 32767) {
					break;
				}
				boolean var17 = false;
				if (Client.npcs[var14] == null) {
					Client.npcs[var14] = new NPC();
					var17 = true;
				}
				var15 = Client.npcs[var14];
				Client.npcIndices[++Client.npcCount - 1] = var14;
				var15.npcCycle = Client.cycle;
				if (class309.field3942) {
					if (var0) {
						var7 = var1.readBits(8);
						if (var7 > 127) {
							var7 -= 256;
						}
					} else {
						var7 = var1.readBits(5);
						if (var7 > 15) {
							var7 -= 32;
						}
					}
					if (var0) {
						var6 = var1.readBits(8);
						if (var6 > 127) {
							var6 -= 256;
						}
					} else {
						var6 = var1.readBits(5);
						if (var6 > 15) {
							var6 -= 32;
						}
					}
					var5 = var1.readBits(1);
					boolean var18 = var1.readBits(1) == 1;
					if (var18) {
						var1.readBits(32);
					}
					var15.definition = class119.getNpcDefinition(var1.readBits(14));
					var9 = Client.defaultRotations[var1.readBits(3)];
					if (var17) {
						var15.orientation = var15.rotation = var9;
					}
					var10 = var1.readBits(1);
					if (var10 == 1) {
						Client.field534[++Client.field533 - 1] = var14;
					}
				} else {
					var15.definition = class119.getNpcDefinition(var1.readBits(14));
					var8 = var1.readBits(1);
					if (var8 == 1) {
						Client.field534[++Client.field533 - 1] = var14;
					}
					if (var0) {
						var7 = var1.readBits(8);
						if (var7 > 127) {
							var7 -= 256;
						}
					} else {
						var7 = var1.readBits(5);
						if (var7 > 15) {
							var7 -= 32;
						}
					}
					boolean var19 = var1.readBits(1) == 1;
					if (var19) {
						var1.readBits(32);
					}
					var5 = var1.readBits(1);
					var10 = Client.defaultRotations[var1.readBits(3)];
					if (var17) {
						var15.orientation = var15.rotation = var10;
					}
					if (var0) {
						var6 = var1.readBits(8);
						if (var6 > 127) {
							var6 -= 256;
						}
					} else {
						var6 = var1.readBits(5);
						if (var6 > 15) {
							var6 -= 32;
						}
					}
				}
				var15.field1190 = var15.definition.size;
				var15.field1180 = var15.definition.rotation;
				if (var15.field1180 == 0) {
					var15.rotation = 0;
				}
				var15.walkSequence = var15.definition.walkSequence;
				var15.walkBackSequence = var15.definition.walkBackSequence;
				var15.walkLeftSequence = var15.definition.walkLeftSequence;
				var15.walkRightSequence = var15.definition.walkRightSequence;
				var15.idleSequence = var15.definition.idleSequence;
				var15.turnLeftSequence = var15.definition.turnLeftSequence;
				var15.turnRightSequence = var15.definition.turnRightSequence;
				var15.runSequence = var15.definition.field1914;
				var15.field1140 = var15.definition.field1919;
				var15.field1141 = var15.definition.field1918;
				var15.field1149 = var15.definition.field1938;
				var15.field1143 = var15.definition.field1920;
				var15.field1170 = var15.definition.field1933;
				var15.field1145 = var15.definition.field1922;
				var15.field1150 = var15.definition.field1923;
				var15.method2316(ScriptFrame.localPlayer.pathX[0] + var6, ScriptFrame.localPlayer.pathY[0] + var7, var5 == 1);
			} 
			var1.exportIndex();
			for (var14 = 0; var14 < Client.field533; ++var14) {
				var3 = Client.field534[var14];
				var15 = Client.npcs[var3];
				var5 = var1.readUnsignedByte();
				if (class309.field3942 && (var5 & 2) != 0) {
					var6 = var1.readUnsignedByte();
					var5 += var6 << 8;
				}
				if ((var5 & 64) != 0) {
					var15.targetIndex = var1.readUnsignedShort();
					if (var15.targetIndex == 65535) {
						var15.targetIndex = -1;
					}
				}
				if ((var5 & 256) != 0) {
					var15.method2333(var1.readStringCp1252NullTerminated());
				}
				if ((var5 & 8) != 0) {
					var6 = var1.readUnsignedShortAdd();
					if (var6 == 65535) {
						var6 = -1;
					}
					var7 = var1.readUnsignedByteNeg();
					if (var6 == var15.sequence && var6 != -1) {
						var8 = ByteArrayPool.SequenceDefinition_get(var6).field2181;
						if (var8 == 1) {
							var15.sequenceFrame = 0;
							var15.sequenceFrameCycle = 0;
							var15.sequenceDelay = var7;
							var15.field1172 = 0;
						}
						if (var8 == 2) {
							var15.field1172 = 0;
						}
					} else if (var6 == -1 || var15.sequence == -1 || ByteArrayPool.SequenceDefinition_get(var6).field2157 >= ByteArrayPool.SequenceDefinition_get(var15.sequence).field2157) {
						var15.sequence = var6;
						var15.sequenceFrame = 0;
						var15.sequenceFrameCycle = 0;
						var15.sequenceDelay = var7;
						var15.field1172 = 0;
						var15.field1201 = var15.pathLength;
					}
				}
				if ((var5 & 16) != 0) {
					var15.definition = class119.getNpcDefinition(var1.readUnsignedShortAddLE());
					var15.field1190 = var15.definition.size;
					var15.field1180 = var15.definition.rotation;
					var15.walkSequence = var15.definition.walkSequence;
					var15.walkBackSequence = var15.definition.walkBackSequence;
					var15.walkLeftSequence = var15.definition.walkLeftSequence;
					var15.walkRightSequence = var15.definition.walkRightSequence;
					var15.idleSequence = var15.definition.idleSequence;
					var15.turnLeftSequence = var15.definition.turnLeftSequence;
					var15.turnRightSequence = var15.definition.turnRightSequence;
				}
				if ((var5 & 32) != 0) {
					var15.overheadText = var1.readStringCp1252NullTerminated();
					var15.overheadTextCyclesRemaining = 100;
				}
				if ((var5 & 4) != 0) {
					var6 = var1.readUnsignedShortLE();
					var7 = var1.readUnsignedShortLE();
					if (class309.field3942) {
						var15.field1163 = var1.readUnsignedByte() == 1;
					}
					var8 = var15.x - (var6 - Decimator.baseX * 8 - Decimator.baseX * 8) * 64;
					var9 = var15.y - (var7 - class7.baseY * 64 - class7.baseY * 64) * 64;
					if (var8 != 0 || var9 != 0) {
						var15.field1162 = ((int) (Math.atan2(((double) (var8)), ((double) (var9))) * 325.949)) & 2047;
					}
				}
				if ((var5 & 128) != 0) {
					var6 = var1.readUnsignedByteAdd();
					int var11;
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
							var15.addHitSplat(var8, var10, var9, var11, Client.cycle, var12);
						}
					}
					var7 = var1.readUnsignedByte();
					if (var7 > 0) {
						for (var8 = 0; var8 < var7; ++var8) {
							var9 = var1.readUShortSmart();
							var10 = var1.readUShortSmart();
							if (var10 != 32767) {
								var11 = var1.readUShortSmart();
								var12 = var1.readUnsignedByteNeg();
								int var13 = (var10 > 0) ? var1.readUnsignedByteAdd() : var12;
								var15.addHealthBar(var9, Client.cycle, var10, var11, var12, var13);
							} else {
								var15.removeHealthBar(var9);
							}
						}
					}
				}
				if ((var5 & 1) != 0) {
					var15.spotAnimation = var1.readUnsignedShortLE();
					var6 = var1.readUnsignedIntIME();
					var15.spotAnimationHeight = var6 >> 16;
					var15.field1176 = (var6 & '￿') + Client.cycle;
					var15.spotAnimationFrame = 0;
					var15.spotAnimationFrameCycle = 0;
					if (var15.field1176 > Client.cycle) {
						var15.spotAnimationFrame = -1;
					}
					if (var15.spotAnimation == 65535) {
						var15.spotAnimation = -1;
					}
				}
				if ((var5 & 1024) != 0) {
					var15.field1187 = Client.cycle + var1.readUnsignedShortLE();
					var15.field1188 = Client.cycle + var1.readUnsignedShort();
					var15.field1189 = var1.readByteAdd();
					var15.field1131 = var1.readByte();
					var15.field1191 = var1.readByte();
					var15.field1192 = ((byte) (var1.readUnsignedByteAdd()));
				}
				if (class309.field3942 && (var5 & 512) != 0 || !class309.field3942 && (var5 & 2) != 0) {
					var15.field1178 = var1.readByteNeg();
					var15.field1127 = var1.readByteSub();
					var15.field1179 = var1.readByteNeg();
					var15.field1181 = var1.readByte();
					var15.field1182 = var1.readUnsignedShortAddLE() + Client.cycle;
					var15.field1183 = var1.readUnsignedShortAddLE() + Client.cycle;
					var15.field1136 = var1.readUnsignedShortAddLE();
					var15.pathLength = 1;
					var15.field1201 = 0;
					var15.field1178 += var15.pathX[0];
					var15.field1127 += var15.pathY[0];
					var15.field1179 += var15.pathX[0];
					var15.field1181 += var15.pathY[0];
				}
				if ((var5 & 2048) != 0) {
					var15.field1202 = var1.readUnsignedIntIME();
				}
			}
			for (var14 = 0; var14 < Client.field495; ++var14) {
				var3 = Client.field584[var14];
				if (Client.npcs[var3].npcCycle != Client.cycle) {
					Client.npcs[var3].definition = null;
					Client.npcs[var3] = null;
				}
			}
			if (var1.offset != Client.packetWriter.serverPacketLength) {
				throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
			} else {
				for (var14 = 0; var14 < Client.npcCount; ++var14) {
					if (Client.npcs[Client.npcIndices[var14]] == null) {
						throw new RuntimeException(var14 + "," + Client.npcCount);
					}
				}
			}
		}
	}
}