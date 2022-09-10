import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hi")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1605596789
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1617192677
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 487682617
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 137187413
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1593720321
	)
	@Export("type")
	int type;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -964537863
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1361380143
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 223200283
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1105032199
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1399281183
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1916248411
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1282854379
	)
	int field2501;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1769519663
	)
	int field2499;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1424390111
	)
	int field2500;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1455414205
	)
	int field2491;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -87483173
	)
	int field2502;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1629881229
	)
	int field2494;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 546307651
	)
	int field2504;

	Occluder() {
	} // L: 23

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lqq;I)Ljava/lang/String;",
		garbageValue = "807708444"
	)
	public static String method4474(Buffer var0) {
		return PacketBufferNode.method5356(var0, 32767); // L: 60
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Llv;IIB)Z",
		garbageValue = "-102"
	)
	static boolean method4475(AbstractArchive var0, int var1, int var2) {
		byte[] var3 = var0.takeFile(var1, var2); // L: 178
		if (var3 == null) {
			return false; // L: 179
		} else {
			class428.SpriteBuffer_decode(var3); // L: 180
			return true; // L: 181
		}
	}
}
