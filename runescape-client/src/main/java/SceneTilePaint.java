import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("hu")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("cj")
	@ObfuscatedSignature(descriptor = "Lqu;")
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 1769216381)
	@Export("swColor")
	int swColor;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -78289351)
	@Export("seColor")
	int seColor;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -184307337)
	@Export("neColor")
	int neColor;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -1175452837)
	@Export("nwColor")
	int nwColor;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 516518743)
	@Export("texture")
	int texture;

	@ObfuscatedName("e")
	@Export("isFlat")
	boolean isFlat;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 1480522927)
	@Export("rgb")
	int rgb;

	SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.isFlat = true;
		this.swColor = var1;
		this.seColor = var2;
		this.neColor = var3;
		this.nwColor = var4;
		this.texture = var5;
		this.rgb = var6;
		this.isFlat = var7;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "([BIIB)Ljava/lang/String;", garbageValue = "-117")
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2];
		int var4 = 0;
		for (int var5 = 0; var5 < var2; ++var5) {
			int var6 = var0[var5 + var1] & 255;
			if (var6 != 0) {
				if (var6 >= 128 && var6 < 160) {
					char var7 = class340.cp1252AsciiExtension[var6 - 128];
					if (var7 == 0) {
						var7 = '?';
					}
					var6 = var7;
				}
				var3[var4++] = ((char) (var6));
			}
		}
		return new String(var3, 0, var4);
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(descriptor = "(IIII)I", garbageValue = "744577981")
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7;
		int var4 = var1 >> 7;
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) {
			int var5 = var2;
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) {
				var5 = var2 + 1;
			}
			int var6 = var0 & 127;
			int var7 = var1 & 127;
			int var8 = Tiles.Tiles_heights[var5][var3 + 1][var4] * var6 + (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] >> 7;
			int var9 = var6 * Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] + Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) >> 7;
			return var8 * (128 - var7) + var9 * var7 >> 7;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(descriptor = "(IIZI)V", garbageValue = "1779675406")
	static final void method4530(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3113()) {
				ClanChannelMember var3 = ((ClanChannelMember) (Client.currentClanChannels[var0].members.get(var1)));
				PacketBufferNode var4 = EnumComposition.getPacketBufferNode(ClientPacket.field2960, Client.packetWriter.isaacCipher);
				var4.packetBuffer.writeByte(4 + ScriptEvent.stringCp1252NullTerminatedByteSize(var3.username.getName()));
				var4.packetBuffer.writeByte(var0);
				var4.packetBuffer.writeShort(var1);
				var4.packetBuffer.writeBoolean(var2);
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName());
				Client.packetWriter.addNode(var4);
			}
		}
	}
}