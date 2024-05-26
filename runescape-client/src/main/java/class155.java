import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
public class class155 extends class163 {
	@ObfuscatedName("at")
	static boolean[] field1748;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 982220485
	)
	int field1746;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgx;"
	)
	final class164 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgx;)V"
	)
	class155(class164 var1) {
		this.this$0 = var1;
		this.field1746 = -1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)V",
		garbageValue = "-406894472"
	)
	void vmethod3479(Buffer var1) {
		this.field1746 = var1.readUnsignedShort();
		var1.readUnsignedByte();
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgo;I)V",
		garbageValue = "-472458599"
	)
	void vmethod3480(ClanChannel var1) {
		var1.removeMember(this.field1746);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(BI)C",
		garbageValue = "-1382474219"
	)
	public static char method3301(byte var0) {
		int var1 = var0 & 255;
		if (var1 == 0) {
			throw new IllegalArgumentException("" + Integer.toString(var1, 16));
		} else {
			if (var1 >= 128 && var1 < 160) {
				char var2 = class412.cp1252AsciiExtension[var1 - 128];
				if (var2 == 0) {
					var2 = '?';
				}

				var1 = var2;
			}

			return (char)var1;
		}
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(Lot;Ljava/lang/String;B)V",
		garbageValue = "32"
	)
	static void method3303(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1);
		Client.archiveLoaders.add(var2);
		Client.field828 += var2.groupCount;
	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(Ldt;ZLuk;I)V",
		garbageValue = "1968808442"
	)
	static final void method3295(WorldView var0, boolean var1, PacketBuffer var2) {
		while (true) {
			byte var3 = 16;
			int var4 = 1 << var3;
			if (var2.bitsRemaining(Client.packetWriter.serverPacketLength) >= var3 + 12) {
				int var5 = var2.readBits(var3);
				if (var5 != var4 - 1) {
					boolean var6 = false;
					if (var0.npcs[var5] == null) {
						var0.npcs[var5] = new NPC();
						var6 = true;
					}

					NPC var7 = var0.npcs[var5];
					var0.npcIndices[++var0.npcCount - 1] = var5;
					var7.npcCycle = Client.cycle;
					var7.definition = class134.getNpcDefinition(var2.readBits(14));
					int var8 = var2.readBits(1);
					int var11 = var2.readBits(1);
					if (var11 == 1) {
						Client.npcIndices[++Client.npcCount - 1] = var5;
					}

					int var9;
					if (var1) {
						var9 = var2.readBits(8);
						if (var9 > 127) {
							var9 -= 256;
						}
					} else {
						var9 = var2.readBits(5);
						if (var9 > 15) {
							var9 -= 32;
						}
					}

					int var12 = Client.defaultRotations[var2.readBits(3)];
					if (var6) {
						var7.orientation = var7.rotation = var12;
					}

					boolean var13 = var2.readBits(1) == 1;
					if (var13) {
						var2.readBits(32);
					}

					int var10;
					if (var1) {
						var10 = var2.readBits(8);
						if (var10 > 127) {
							var10 -= 256;
						}
					} else {
						var10 = var2.readBits(5);
						if (var10 > 15) {
							var10 -= 32;
						}
					}

					class4.method15(var7);
					if (var7.field1238 == 0) {
						var7.rotation = 0;
					}

					if (Client.field557 >= 222) {
						var7.method2658(var9 + PcmPlayer.field296, var10 + class130.field1562, var8 == 1);
						continue;
					}

					var7.method2658(class17.localPlayer.pathX[0] + var9, class17.localPlayer.pathY[0] + var10, var8 == 1);
					continue;
				}
			}

			var2.exportIndex();
			return;
		}
	}
}
