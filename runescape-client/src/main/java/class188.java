import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
public class class188 extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("field2007")
	static EvictingDualNodeHashTable field2007;

	static {
		field2007 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)[Loq;",
		garbageValue = "-2137673667"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.field4489, PlayerType.PlayerType_ultimateIronman, PlayerType.PlayerType_hardcoreIronman, PlayerType.field4486, PlayerType.field4485, PlayerType.field4469, PlayerType.field4481, PlayerType.field4484, PlayerType.field4478, PlayerType.field4483, PlayerType.PlayerType_normal, PlayerType.field4482, PlayerType.PlayerType_jagexModerator, PlayerType.PlayerType_ironman, PlayerType.field4480, PlayerType.field4477, PlayerType.PlayerType_playerModerator};
	}

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(Ldd;ZLva;B)V",
		garbageValue = "-105"
	)
	@Export("updateNpcs")
	static final void updateNpcs(WorldView var0, boolean var1, PacketBuffer var2) {
		Client.field525 = 0;
		Client.npcCount = 0;
		GrandExchangeOffer.method7697(var0, var2);
		CollisionMap.method5614(var0, var1, var2);
		VertexNormal.method5412(var0, var2);

		int var3;
		for (var3 = 0; var3 < Client.field525; ++var3) {
			int var4 = Client.field526[var3];
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
