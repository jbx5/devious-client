import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
@Implements("PlayerCompositionColorTextureOverride")
public class PlayerCompositionColorTextureOverride {
	@ObfuscatedName("ak")
	@Export("playerCompositionRecolorTo")
	public short[] playerCompositionRecolorTo;
	@ObfuscatedName("ax")
	@Export("playerCompositionRetextureTo")
	public short[] playerCompositionRetextureTo;

	public PlayerCompositionColorTextureOverride(int var1) {
		ItemComposition var2 = class214.ItemDefinition_get(var1);
		if (var2.method4066()) {
			this.playerCompositionRecolorTo = new short[var2.recolorTo.length];
			System.arraycopy(var2.recolorTo, 0, this.playerCompositionRecolorTo, 0, this.playerCompositionRecolorTo.length);
		}

		if (var2.method4067()) {
			this.playerCompositionRetextureTo = new short[var2.retextureTo.length];
			System.arraycopy(var2.retextureTo, 0, this.playerCompositionRetextureTo, 0, this.playerCompositionRetextureTo.length);
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "466779098"
	)
	static void method3598() {
		Tiles.Tiles_minPlane = 99;
		World.Tiles_underlays = new short[4][104][104];
		VertexNormal.Tiles_overlays = new short[4][104][104];
		SecureRandomFuture.Tiles_shapes = new byte[4][104][104];
		class199.field2004 = new byte[4][104][104];
		UserComparator6.field1486 = new int[4][105][105];
		Tiles.Tiles_underlays2 = new byte[4][105][105];
		class158.field1739 = new int[105][105];
		SecureRandomFuture.Tiles_hue = new int[104];
		class135.Tiles_saturation = new int[104];
		Tiles.Tiles_lightness = new int[104];
		WorldMapSection2.Tiles_hueMultiplier = new int[104];
		Script.field1008 = new int[104];
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "841575506"
	)
	public static void method3597() {
		InvDefinition.InvDefinition_cached.clear();
	}
}
