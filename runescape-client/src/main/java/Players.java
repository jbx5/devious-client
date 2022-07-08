import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ca")
@Implements("Players")
public class Players {
	@ObfuscatedName("q")
	static byte[] field1311;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "[Lgn;")
	static class192[] field1304;

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "[Lqt;")
	static Buffer[] field1307;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 698385475)
	@Export("Players_count")
	static int Players_count;

	@ObfuscatedName("g")
	@Export("Players_indices")
	static int[] Players_indices;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 581177589)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;

	@ObfuscatedName("y")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;

	@ObfuscatedName("i")
	@Export("Players_regions")
	static int[] Players_regions;

	@ObfuscatedName("s")
	@Export("Players_orientations")
	static int[] Players_orientations;

	@ObfuscatedName("t")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 1123966373)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;

	@ObfuscatedName("r")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lqt;")
	static Buffer field1317;

	@ObfuscatedName("bp")
	@ObfuscatedSignature(descriptor = "Lka;")
	static GameBuild field1305;

	static {
		field1311 = new byte[2048];
		field1304 = new class192[2048];
		field1307 = new Buffer[2048];
		Players_count = 0;
		Players_indices = new int[2048];
		Players_emptyIdxCount = 0;
		Players_emptyIndices = new int[2048];
		Players_regions = new int[2048];
		Players_orientations = new int[2048];
		Players_targetIndices = new int[2048];
		Players_pendingUpdateCount = 0;
		Players_pendingUpdateIndices = new int[2048];
		field1317 = new Buffer(new byte[5000]);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(Lqt;IIIIIII)V", garbageValue = "1254271887")
	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0;
			while (true) {
				var7 = var0.readUnsignedByte();
				if (var7 == 0) {
					if (var1 == 0) {
						Tiles.Tiles_heights[0][var2][var3] = -class14.method156(var2 + 932731 + var4, 556238 + var3 + var5) * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240;
					}
					break;
				}
				if (var7 == 1) {
					int var8 = var0.readUnsignedByte();
					if (var8 == 1) {
						var8 = 0;
					}
					if (var1 == 0) {
						Tiles.Tiles_heights[0][var2][var3] = -var8 * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var8 * 8;
					}
					break;
				}
				if (var7 <= 49) {
					Tiles.Tiles_overlays[var1][var2][var3] = var0.readByte();
					Tiles.Tiles_shapes[var1][var2][var3] = ((byte) ((var7 - 2) / 4));
					Tiles.field996[var1][var2][var3] = ((byte) (var7 - 2 + var6 & 3));
				} else if (var7 <= 81) {
					Tiles.Tiles_renderFlags[var1][var2][var3] = ((byte) (var7 - 49));
				} else {
					Tiles.Tiles_underlays[var1][var2][var3] = ((byte) (var7 - 81));
				}
			} 
		} else {
			while (true) {
				var7 = var0.readUnsignedByte();
				if (var7 == 0) {
					break;
				}
				if (var7 == 1) {
					var0.readUnsignedByte();
					break;
				}
				if (var7 <= 49) {
					var0.readUnsignedByte();
				}
			} 
		}
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V", garbageValue = "94")
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) {
			PacketBufferNode var1 = EnumComposition.getPacketBufferNode(ClientPacket.CLAN_LEAVECHAT, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(ScriptEvent.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}