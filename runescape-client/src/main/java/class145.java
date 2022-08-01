import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("et")
public class class145 {
	@ObfuscatedName("o")
	@ObfuscatedGetter(longValue = 9041886089643987619L)
	long field1665;

	@ObfuscatedName("q")
	@ObfuscatedGetter(longValue = -1333958306072738991L)
	long field1660 = -1L;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lln;")
	IterableNodeDeque field1659 = new IterableNodeDeque();

	@ObfuscatedSignature(descriptor = "(Lqw;)V")
	public class145(Buffer var1) {
		this.method3093(var1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lqw;I)V", garbageValue = "-1296229775")
	void method3093(Buffer var1) {
		this.field1665 = var1.readLong();
		this.field1660 = var1.readLong();
		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 1) {
				var3 = new class140(this);
			} else if (var2 == 4) {
				var3 = new class151(this);
			} else if (var2 == 3) {
				var3 = new class136(this);
			} else if (var2 == 2) {
				var3 = new class134(this);
			} else {
				if (var2 != 5) {
					throw new RuntimeException("");
				}
				var3 = new class141(this);
			}
			((class144) (var3)).vmethod3146(var1);
			this.field1659.addFirst(((Node) (var3)));
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Ley;I)V", garbageValue = "-2118805754")
	public void method3095(ClanChannel var1) {
		if (var1.key == this.field1665 && this.field1660 == var1.field1674) {
			for (class144 var2 = ((class144) (this.field1659.last())); var2 != null; var2 = ((class144) (this.field1659.previous()))) {
				var2.vmethod3145(var1);
			}
			++var1.field1674;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1311566170")
	public static void method3087() {
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(descriptor = "(ZLqy;B)V", garbageValue = "-37")
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field617 = 0;
		Client.field541 = 0;
		PacketBuffer var2 = Client.packetWriter.packetBuffer;
		var2.importIndex();
		int var3 = var2.readBits(8);
		int var4;
		if (var3 < Client.npcCount) {
			for (var4 = var3; var4 < Client.npcCount; ++var4) {
				Client.field636[++Client.field617 - 1] = Client.npcIndices[var4];
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
				NPC var13 = Client.npcs[var5];
				var7 = var2.readBits(1);
				if (var7 == 0) {
					Client.npcIndices[++Client.npcCount - 1] = var5;
					var13.npcCycle = Client.cycle;
				} else {
					var8 = var2.readBits(2);
					if (var8 == 0) {
						Client.npcIndices[++Client.npcCount - 1] = var5;
						var13.npcCycle = Client.cycle;
						Client.field729[++Client.field541 - 1] = var5;
					} else if (var8 == 1) {
						Client.npcIndices[++Client.npcCount - 1] = var5;
						var13.npcCycle = Client.cycle;
						var9 = var2.readBits(3);
						var13.method2414(var9, class192.field2194);
						var10 = var2.readBits(1);
						if (var10 == 1) {
							Client.field729[++Client.field541 - 1] = var5;
						}
					} else if (var8 == 2) {
						Client.npcIndices[++Client.npcCount - 1] = var5;
						var13.npcCycle = Client.cycle;
						if (var2.readBits(1) == 1) {
							var9 = var2.readBits(3);
							var13.method2414(var9, class192.field2197);
							var10 = var2.readBits(3);
							var13.method2414(var10, class192.field2197);
						} else {
							var9 = var2.readBits(3);
							var13.method2414(var9, class192.field2195);
						}
						var9 = var2.readBits(1);
						if (var9 == 1) {
							Client.field729[++Client.field541 - 1] = var5;
						}
					} else if (var8 == 3) {
						Client.field636[++Client.field617 - 1] = var5;
					}
				}
			}
			int var11;
			while (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= 27) {
				var11 = var1.readBits(15);
				if (var11 == 32767) {
					break;
				}
				boolean var14 = false;
				if (Client.npcs[var11] == null) {
					Client.npcs[var11] = new NPC();
					var14 = true;
				}
				NPC var12 = Client.npcs[var11];
				Client.npcIndices[++Client.npcCount - 1] = var11;
				var12.npcCycle = Client.cycle;
				int var6;
				if (ScriptFrame.field462) {
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
					boolean var15 = var1.readBits(1) == 1;
					if (var15) {
						var1.readBits(32);
					}
					var12.definition = class125.getNpcDefinition(var1.readBits(14));
					var9 = Client.defaultRotations[var1.readBits(3)];
					if (var14) {
						var12.orientation = var12.rotation = var9;
					}
					var10 = var1.readBits(1);
					if (var10 == 1) {
						Client.field729[++Client.field541 - 1] = var11;
					}
				} else {
					var12.definition = class125.getNpcDefinition(var1.readBits(14));
					var8 = var1.readBits(1);
					if (var8 == 1) {
						Client.field729[++Client.field541 - 1] = var11;
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
					boolean var16 = var1.readBits(1) == 1;
					if (var16) {
						var1.readBits(32);
					}
					var5 = var1.readBits(1);
					var10 = Client.defaultRotations[var1.readBits(3)];
					if (var14) {
						var12.orientation = var12.rotation = var10;
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
				var12.field1202 = var12.definition.size;
				var12.field1197 = var12.definition.rotation;
				if (var12.field1197 == 0) {
					var12.rotation = 0;
				}
				var12.walkSequence = var12.definition.walkSequence;
				var12.walkBackSequence = var12.definition.walkBackSequence;
				var12.walkLeftSequence = var12.definition.walkLeftSequence;
				var12.walkRightSequence = var12.definition.walkRightSequence;
				var12.idleSequence = var12.definition.idleSequence;
				var12.turnLeftSequence = var12.definition.turnLeftSequence;
				var12.turnRightSequence = var12.definition.turnRightSequence;
				var12.runSequence = var12.definition.field1920;
				var12.field1199 = var12.definition.field1946;
				var12.field1143 = var12.definition.field1922;
				var12.field1144 = var12.definition.field1923;
				var12.field1145 = var12.definition.field1924;
				var12.field1146 = var12.definition.field1904;
				var12.field1147 = var12.definition.field1926;
				var12.field1148 = var12.definition.field1910;
				var12.method2415(class28.localPlayer.pathX[0] + var6, class28.localPlayer.pathY[0] + var7, var5 == 1);
			} 
			var1.exportIndex();
			PcmPlayer.method751(var1);
			for (var11 = 0; var11 < Client.field617; ++var11) {
				var3 = Client.field636[var11];
				if (Client.npcs[var3].npcCycle != Client.cycle) {
					Client.npcs[var3].definition = null;
					Client.npcs[var3] = null;
				}
			}
			if (var1.offset != Client.packetWriter.serverPacketLength) {
				throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
			} else {
				for (var11 = 0; var11 < Client.npcCount; ++var11) {
					if (Client.npcs[Client.npcIndices[var11]] == null) {
						throw new RuntimeException(var11 + "," + Client.npcCount);
					}
				}
			}
		}
	}
}