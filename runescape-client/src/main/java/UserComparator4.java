import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import java.util.Comparator;
import net.runelite.mapping.Export;
@ObfuscatedName("ch")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "Llh;")
	@Export("ItemDefinition_archive")
	static AbstractArchive ItemDefinition_archive;

	@ObfuscatedName("ik")
	@ObfuscatedSignature(descriptor = "[Lqe;")
	@Export("headIconHintSprites")
	static SpritePixels[] headIconHintSprites;

	@ObfuscatedName("c")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lnm;Lnm;B)I", garbageValue = "-8")
	@Export("compare_bridged")
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged(((Buddy) (var1)), ((Buddy) (var2)));
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(descriptor = "(ZLpq;I)V", garbageValue = "1468501785")
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field615 = 0;
		Client.field538 = 0;
		GrandExchangeOfferUnitPriceComparator.method6024();
		int var2;
		while (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= 27) {
			var2 = var1.readBits(15);
			if (var2 == 32767) {
				break;
			}
			boolean var3 = false;
			if (Client.npcs[var2] == null) {
				Client.npcs[var2] = new NPC();
				var3 = true;
			}
			NPC var4 = Client.npcs[var2];
			Client.npcIndices[++Client.npcCount - 1] = var2;
			var4.npcCycle = Client.cycle;
			int var5;
			int var6;
			int var7;
			int var10;
			if (class101.field1366) {
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
				boolean var8 = var1.readBits(1) == 1;
				if (var8) {
					var1.readBits(32);
				}
				var5 = var1.readBits(1);
				int var9 = Client.defaultRotations[var1.readBits(3)];
				if (var3) {
					var4.orientation = var4.rotation = var9;
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
				var10 = var1.readBits(1);
				if (var10 == 1) {
					Client.field539[++Client.field538 - 1] = var2;
				}
				var4.definition = BuddyRankComparator.getNpcDefinition(var1.readBits(14));
			} else {
				int var12 = Client.defaultRotations[var1.readBits(3)];
				if (var3) {
					var4.orientation = var4.rotation = var12;
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
				boolean var13 = var1.readBits(1) == 1;
				if (var13) {
					var1.readBits(32);
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
				var5 = var1.readBits(1);
				var10 = var1.readBits(1);
				if (var10 == 1) {
					Client.field539[++Client.field538 - 1] = var2;
				}
				var4.definition = BuddyRankComparator.getNpcDefinition(var1.readBits(14));
			}
			var4.field1205 = var4.definition.size;
			var4.field1129 = var4.definition.rotation;
			if (var4.field1129 == 0) {
				var4.rotation = 0;
			}
			var4.walkSequence = var4.definition.walkSequence;
			var4.walkBackSequence = var4.definition.walkBackSequence;
			var4.walkLeftSequence = var4.definition.walkLeftSequence;
			var4.walkRightSequence = var4.definition.walkRightSequence;
			var4.idleSequence = var4.definition.idleSequence;
			var4.turnLeftSequence = var4.definition.turnLeftSequence;
			var4.turnRightSequence = var4.definition.turnRightSequence;
			var4.runSequence = var4.definition.field1931;
			var4.field1180 = var4.definition.field1944;
			var4.field1144 = var4.definition.field1932;
			var4.field1145 = var4.definition.field1933;
			var4.field1155 = var4.definition.field1934;
			var4.field1179 = var4.definition.field1935;
			var4.field1137 = var4.definition.field1936;
			var4.field1149 = var4.definition.field1930;
			var4.method2362(class101.localPlayer.pathX[0] + var6, class101.localPlayer.pathY[0] + var7, var5 == 1);
		} 
		var1.exportIndex();
		SoundCache.method765(var1);
		for (var2 = 0; var2 < Client.field615; ++var2) {
			int var11 = Client.field616[var2];
			if (Client.npcs[var11].npcCycle != Client.cycle) {
				Client.npcs[var11].definition = null;
				Client.npcs[var11] = null;
			}
		}
		if (var1.offset != Client.packetWriter.serverPacketLength) {
			throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
		} else {
			for (var2 = 0; var2 < Client.npcCount; ++var2) {
				if (Client.npcs[Client.npcIndices[var2]] == null) {
					throw new RuntimeException(var2 + "," + Client.npcCount);
				}
			}
		}
	}
}