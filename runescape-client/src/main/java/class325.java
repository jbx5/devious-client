import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("my")
public class class325 {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 486674949
	)
	public int field3539;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 987280921
	)
	public int field3540;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1386938305
	)
	public int field3541;

	class325() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "113"
	)
	static void method6104() {
		Tiles.Tiles_minPlane = 99;
		Tiles.Tiles_underlays = new short[4][104][104];
		Tiles.Tiles_overlays = new short[4][104][104];
		class19.Tiles_shapes = new byte[4][104][104];
		UserComparator10.field1474 = new byte[4][104][104];
		BufferedNetSocket.field4681 = new int[4][105][105];
		InvDefinition.Tiles_underlays2 = new byte[4][105][105];
		class135.field1601 = new int[105][105];
		class172.Tiles_hue = new int[104];
		GameBuild.Tiles_saturation = new int[104];
		Tiles.Tiles_lightness = new int[104];
		Language.Tiles_hueMultiplier = new int[104];
		class159.field1755 = new int[104];
	}
}
