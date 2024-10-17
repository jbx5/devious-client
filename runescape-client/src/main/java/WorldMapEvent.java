import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("bd")
	@Export("hasFocus")
	protected static boolean hasFocus;
	@ObfuscatedName("es")
	@ObfuscatedGetter(
		longValue = 9046951798768527623L
	)
	static long field3284;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1102307627
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILnn;Lnn;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1;
		this.coord1 = var2;
		this.coord2 = var3;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[Loo;",
		garbageValue = "1477512673"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.PlayerType_jagexModerator, PlayerType.field4515, PlayerType.field4513, PlayerType.PlayerType_playerModerator, PlayerType.field4521, PlayerType.field4510, PlayerType.field4517, PlayerType.field4512, PlayerType.field4516, PlayerType.field4514, PlayerType.field4509, PlayerType.PlayerType_normal, PlayerType.PlayerType_hardcoreIronman, PlayerType.PlayerType_ultimateIronman, PlayerType.PlayerType_ironman, PlayerType.field4519, PlayerType.field4518};
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1206437042"
	)
	static int method6438(int var0, int var1, int var2) {
		int var3 = var0 >> 16 & 255;
		int var4 = var0 >> 8 & 255;
		int var5 = var0 & 255;
		int var6 = var1 >> 16 & 255;
		int var7 = var1 >> 8 & 255;
		int var8 = var1 & 255;
		int var9 = (var6 - var3 + 1) * var2 / 64 + var3 & 255;
		int var10 = var4 + (var7 - var4 + 1) * var2 / 64 & 255;
		int var11 = var5 + (var8 - var5 + 1) * var2 / 64 & 255;
		return var9 << 16 | var10 << 8 | var11;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IB)I",
		garbageValue = "1"
	)
	public static int method6440(CharSequence var0, int var1) {
		return AbstractWorldMapIcon.method6363(var0, var1, true);
	}
}
