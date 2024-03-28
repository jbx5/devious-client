import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("an")
public final class class4 {
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "[Lvl;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "847756638"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.playingJingle) {
			class11.method108(0, 0);
		} else if (var0 != -1) {
			boolean var1;
			if (class321.field3496.isEmpty()) {
				var1 = false;
			} else {
				MusicSong var2 = (MusicSong)class321.field3496.get(0);
				var1 = var2 != null && var0 == var2.musicTrackGroupId;
			}

			if (!var1 && NPC.clientPreferences.getMusicVolume() != 0) {
				ArrayList var3 = new ArrayList();
				var3.add(new MusicSong(UserComparator6.archive6, var0, 0, NPC.clientPreferences.getMusicVolume(), false));
				if (Client.playingJingle) {
					HealthBar.method2572(var3, 0, 100, 100, 0);
				} else {
					Renderable.method4881(var3, 0, 100, 100, 0, false);
				}
			}
		}

	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1508155305"
	)
	static boolean method18() {
		return (Client.drawPlayerNames & 1) != 0;
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(ZLun;I)V",
		garbageValue = "1109808750"
	)
	static final void method19(boolean var0, PacketBuffer var1) {
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

					int var10 = var1.readBits(1);
					if (var10 == 1) {
						Client.field742[++Client.field571 - 1] = var4;
					}

					int var7 = var1.readBits(1);
					int var11 = Client.defaultRotations[var1.readBits(3)];
					if (var5) {
						var6.orientation = var6.rotation = var11;
					}

					var6.definition = UserComparator10.getNpcDefinition(var1.readBits(14));
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

					boolean var12 = var1.readBits(1) == 1;
					if (var12) {
						var1.readBits(32);
					}

					SoundCache.method843(var6);
					if (var6.field1268 == 0) {
						var6.rotation = 0;
					}

					var6.method2633(class133.localPlayer.pathX[0] + var8, class133.localPlayer.pathY[0] + var9, var7 == 1);
					continue;
				}
			}

			var1.exportIndex();
			return;
		}
	}
}
