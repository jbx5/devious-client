import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mm")
public class class320 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 313486493
	)
	int field3475;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lcg;"
	)
	class53 field3474;

	@ObfuscatedSignature(
		descriptor = "(ILcg;)V"
	)
	class320(int var1, class53 var2) {
		this.field3475 = var1;
		this.field3474 = var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)[Loc;",
		garbageValue = "48"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.field4254, PlayerType.PlayerType_playerModerator, PlayerType.field4241, PlayerType.PlayerType_normal, PlayerType.field4249, PlayerType.field4243, PlayerType.field4256, PlayerType.PlayerType_hardcoreIronman, PlayerType.field4248, PlayerType.PlayerType_ironman, PlayerType.PlayerType_ultimateIronman, PlayerType.field4250, PlayerType.PlayerType_jagexModerator, PlayerType.field4257, PlayerType.field4253, PlayerType.field4255, PlayerType.field4247};
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "194"
	)
	static void method6187() {
		class74.Tiles_underlays = null;
		Interpreter.Tiles_overlays = null;
		ViewportMouse.Tiles_shapes = null;
		class369.field4297 = null;
		class344.field3814 = null;
		class93.Tiles_underlays2 = null;
		Tiles.field999 = null;
		class337.Tiles_hue = null;
		Tiles.Tiles_saturation = null;
		class185.Tiles_lightness = null;
		MenuAction.Tiles_hueMultiplier = null;
		WorldMapLabelSize.field2441 = null;
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1466473405"
	)
	static void method6188() {
		if (Client.renderSelf) {
			AccessFile.addPlayerToScene(class229.localPlayer, false);
		}

	}
}
