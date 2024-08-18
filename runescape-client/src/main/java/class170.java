import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gr")
public class class170 extends class148 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = -5093457467157408865L
	)
	long field1812;
	@ObfuscatedName("ay")
	String field1813;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	final class151 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfy;)V"
	)
	class170(class151 var1) {
		this.this$0 = var1;
		this.field1812 = -1L;
		this.field1813 = null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)V",
		garbageValue = "-1070155477"
	)
	void vmethod3619(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1812 = var1.readLong();
		}

		this.field1813 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "1070728869"
	)
	void vmethod3621(ClanSettings var1) {
		var1.method3445(this.field1812, this.field1813);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-67"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0;
		if (var0 < 0 || var0 >= 65536) {
			var0 >>>= 16;
			var1 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var1 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var1 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var1 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var1;
		}

		return var0 + var1;
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(Ldy;ZI)V",
		garbageValue = "1827694647"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(WorldView var0, boolean var1) {
		for (int var2 = 0; var2 < var0.npcCount; ++var2) {
			NPC var3 = var0.npcs[var0.npcIndices[var2]];
			if (var3 != null && var3.isVisible() && var3.definition.isVisible == var1 && var3.definition.transformIsVisible()) {
				int var4 = var3.x >> 7;
				int var5 = var3.y >> 7;
				if (var4 >= 0 && var4 < var0.sizeX && var5 >= 0 && var5 < var0.sizeY) {
					if (var3.field1183 == 1 && (var3.x & 127) == 64 && (var3.y & 127) == 64) {
						if (var0.tileLastDrawnActor[var4][var5] == Client.viewportDrawCount) {
							continue;
						}

						var0.tileLastDrawnActor[var4][var5] = Client.viewportDrawCount;
					}

					long var6 = class218.calculateTag(0, 0, 1, !var3.definition.isInteractable, var0.npcIndices[var2], var0.id);
					var3.playerCycle = Client.cycle;
					var0.scene.drawEntity(var0.plane, var3.x, var3.y, class162.getTileHeight(var0, var3.field1183 * 64 - 64 + var3.x, var3.field1183 * 64 - 64 + var3.y, var0.plane), var3.field1183 * 64 - 64 + 60, var3, var3.rotation, var6, var3.isWalking);
				}
			}
		}

	}

	@ObfuscatedName("od")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1946273903"
	)
	static final void method3607(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3577()) {
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				if (var2.rank == -1) {
					PacketBufferNode var3 = class218.getPacketBufferNode(ClientPacket.field3314, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(3 + class526.stringCp1252NullTerminatedByteSize(var2.username.getName()));
					var3.packetBuffer.writeByte(var0);
					var3.packetBuffer.writeShort(var1);
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName());
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}
}
