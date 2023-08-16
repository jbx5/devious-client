import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ne")
public class class349 {
	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(ZLto;B)V",
		garbageValue = "-101"
	)
	static final void method6619(boolean var0, PacketBuffer var1) {
		while (true) {
			byte var2 = 16;
			int var3 = 1 << var2;
			if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= var2 + 12) {
				int var4 = var1.readBits(var2);
				if (var4 != var3 - 1) {
					boolean var5 = false;
					if (Client.npcs[var4] == null) {
						Client.npcs[var4] = new NPC();
						var5 = true;
					}

					NPC var6 = Client.npcs[var4];
					Client.npcIndices[++Client.npcCount - 1] = var4;
					var6.npcCycle = Client.cycle;
					int var8;
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

					boolean var10 = var1.readBits(1) == 1;
					if (var10) {
						var1.readBits(32);
					}

					int var7 = var1.readBits(1);
					int var11 = Client.defaultRotations[var1.readBits(3)];
					if (var5) {
						var6.orientation = var6.rotation = var11;
					}

					var6.definition = class90.getNpcDefinition(var1.readBits(14));
					int var12 = var1.readBits(1);
					if (var12 == 1) {
						Client.field737[++Client.field640 - 1] = var4;
					}

					int var9;
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

					ItemLayer.method4266(var6);
					if (var6.field1266 == 0) {
						var6.rotation = 0;
					}

					var6.method2574(VarbitComposition.localPlayer.pathX[0] + var8, VarbitComposition.localPlayer.pathY[0] + var9, var7 == 1);
					continue;
				}
			}

			var1.exportIndex();
			return;
		}
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "87449786"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		Frames.method4718();
		Client.menuActions[0] = "Cancel";
		Client.menuTargets[0] = "";
		Client.menuOpcodes[0] = 1006;
		Client.menuShiftClick[0] = false;
		Client.menuOptionsCount = 1;
	}
}
