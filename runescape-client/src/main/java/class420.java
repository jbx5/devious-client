import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qq")
public class class420 {
	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "[Lvc;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;

	@ObfuscatedName("kq")
	@ObfuscatedSignature(
		descriptor = "(Ldn;ZLvm;IB)V",
		garbageValue = "7"
	)
	@Export("updateNpcs")
	static final void updateNpcs(WorldView var0, boolean var1, PacketBuffer var2, int var3) {
		Client.field637 = 0;
		Client.npcCount = 0;
		var2.importIndex();
		int var4 = var2.readBits(8);
		int var5;
		if (var4 < var0.npcCount) {
			for (var5 = var4; var5 < var0.npcCount; ++var5) {
				Client.field638[++Client.field637 - 1] = var0.npcIndices[var5];
			}
		}

		if (var4 > var0.npcCount) {
			throw new RuntimeException("");
		} else {
			var0.npcCount = 0;

			int var6;
			int var10;
			int var11;
			for (var5 = 0; var5 < var4; ++var5) {
				var6 = var0.npcIndices[var5];
				NPC var16 = var0.npcs[var6];
				int var8 = var2.readBits(1);
				if (var8 == 0) {
					var0.npcIndices[++var0.npcCount - 1] = var6;
					var16.npcCycle = Client.cycle;
				} else {
					int var17 = var2.readBits(2);
					if (var17 == 0) {
						var0.npcIndices[++var0.npcCount - 1] = var6;
						var16.npcCycle = Client.cycle;
						Client.npcIndices[++Client.npcCount - 1] = var6;
					} else if (var17 == 1) {
						var0.npcIndices[++var0.npcCount - 1] = var6;
						var16.npcCycle = Client.cycle;
						var10 = var2.readBits(3);
						var16.method2967(var10, MoveSpeed.field3048);
						var11 = var2.readBits(1);
						if (var11 == 1) {
							Client.npcIndices[++Client.npcCount - 1] = var6;
						}
					} else if (var17 == 2) {
						var0.npcIndices[++var0.npcCount - 1] = var6;
						var16.npcCycle = Client.cycle;
						if (var2.readBits(1) == 1) {
							var10 = var2.readBits(3);
							var16.method2967(var10, MoveSpeed.field3057);
							var11 = var2.readBits(3);
							var16.method2967(var11, MoveSpeed.field3057);
						} else {
							var10 = var2.readBits(3);
							var16.method2967(var10, MoveSpeed.field3046);
						}

						var10 = var2.readBits(1);
						if (var10 == 1) {
							Client.npcIndices[++Client.npcCount - 1] = var6;
						}
					} else if (var17 == 3) {
						Client.field638[++Client.field637 - 1] = var6;
					}
				}
			}

			while (true) {
				byte var18 = 16;
				var5 = 1 << var18;
				if (var2.bitsRemaining(Client.packetWriter.serverPacketLength) < var18 + 12) {
					break;
				}

				var6 = var2.readBits(var18);
				if (var6 == var5 - 1) {
					break;
				}

				int var7 = class182.field1903;
				boolean var19 = false;
				if (var0.npcs[var6] == null) {
					var0.npcs[var6] = new NPC();
					var19 = true;
				}

				NPC var9 = var0.npcs[var6];
				var9.field1372 = var7;
				var0.npcIndices[++var0.npcCount - 1] = var6;
				var9.npcCycle = Client.cycle;
				int var12;
				int var13;
				if (var3 == 4) {
					var9.definition = ActorSpotAnim.getNpcDefinition(var2.readBits(14));
					if (var1) {
						var12 = var2.readBits(8);
						if (var12 > 127) {
							var12 -= 256;
						}
					} else {
						var12 = var2.readBits(5);
						if (var12 > 15) {
							var12 -= 32;
						}
					}

					if (var1) {
						var11 = var2.readBits(8);
						if (var11 > 127) {
							var11 -= 256;
						}
					} else {
						var11 = var2.readBits(5);
						if (var11 > 15) {
							var11 -= 32;
						}
					}

					var13 = var2.readBits(1);
					if (var13 == 1) {
						Client.npcIndices[++Client.npcCount - 1] = var6;
					}

					var10 = var2.readBits(1);
					int var14 = Client.defaultRotations[var2.readBits(3)];
					if (var19) {
						var9.orientation = var9.rotation = var14;
					}

					boolean var15 = var2.readBits(1) == 1;
					if (var15) {
						var2.readBits(32);
					}
				} else if (var3 == 5) {
					if (var1) {
						var11 = var2.readBits(8);
						if (var11 > 127) {
							var11 -= 256;
						}
					} else {
						var11 = var2.readBits(6);
						if (var11 > 31) {
							var11 -= 64;
						}
					}

					if (var1) {
						var12 = var2.readBits(8);
						if (var12 > 127) {
							var12 -= 256;
						}
					} else {
						var12 = var2.readBits(6);
						if (var12 > 31) {
							var12 -= 64;
						}
					}

					var13 = Client.defaultRotations[var2.readBits(3)];
					if (var19) {
						var9.orientation = var9.rotation = var13;
					}

					boolean var20 = var2.readBits(1) == 1;
					if (var20) {
						var2.readBits(32);
					}

					int var21 = var2.readBits(1);
					if (var21 == 1) {
						Client.npcIndices[++Client.npcCount - 1] = var6;
					}

					var9.definition = ActorSpotAnim.getNpcDefinition(var2.readBits(14));
					var10 = var2.readBits(1);
				} else {
					var10 = 0;
					var11 = 0;
					var12 = 0;
				}

				MidiPcmStream.method6725(var9);
				if (var9.field1285 == 0) {
					var9.rotation = 0;
				}

				if (class555.field5457 >= 222) {
					var9.method2968(var11 + class180.field1896, var12 + WorldMapIcon_1.field3094, var10 == 1);
				} else {
					var9.method2968(SpriteMask.localPlayer.pathX[0] + var11, SpriteMask.localPlayer.pathY[0] + var12, var10 == 1);
				}
			}

			var2.exportIndex();
			PlayerComposition.method7006(var0, var2);

			for (var4 = 0; var4 < Client.field637; ++var4) {
				var5 = Client.field638[var4];
				if (var0.npcs[var5].npcCycle != Client.cycle) {
					var0.npcs[var5].definition = null;
					var0.npcs[var5] = null;
				}
			}

			if (var2.offset != Client.packetWriter.serverPacketLength) {
				throw new RuntimeException(var2.offset + "," + Client.packetWriter.serverPacketLength);
			} else {
				for (var4 = 0; var4 < var0.npcCount; ++var4) {
					if (var0.npcs[var0.npcIndices[var4]] == null) {
						throw new RuntimeException(var4 + "," + var0.npcCount);
					}
				}

			}
		}
	}
}
