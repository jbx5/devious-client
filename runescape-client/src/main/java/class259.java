import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("id")
public class class259 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "2045687167")
	static void method5188() {
		Tiles.Tiles_minPlane = 99;
		Tiles.Tiles_underlays = new byte[4][104][104];
		Tiles.Tiles_overlays = new byte[4][104][104];
		Tiles.Tiles_shapes = new byte[4][104][104];
		Tiles.field996 = new byte[4][104][104];
		class1.field2 = new int[4][105][105];
		UserComparator6.field1415 = new byte[4][105][105];
		class430.field4651 = new int[105][105];
		MusicPatchNode2.Tiles_hue = new int[104];
		Tiles.Tiles_saturation = new int[104];
		Varcs.Tiles_lightness = new int[104];
		class465.Tiles_hueMultiplier = new int[104];
		WorldMapScaleHandler.field2877 = new int[104];
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-387349075")
	static final void method5189() {
		Client.field690 = Client.cycleCntr;
		Projectile.ClanChat_inClanChat = true;
	}
}