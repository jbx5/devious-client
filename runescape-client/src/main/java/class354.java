import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nk")
public class class354 {
	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "558881100"
	)
	static final int method6914() {
		if (TaskHandler.clientPreferences.isRoofsHidden()) {
			return class198.topLevelWorldView.plane;
		} else {
			int var0 = ScriptFrame.getTileHeight(class198.topLevelWorldView, AsyncHttpResponse.cameraX, PlayerType.cameraZ, class198.topLevelWorldView.plane);
			return var0 - FloorOverlayDefinition.cameraY < 800 && (class198.topLevelWorldView.tileSettings[class198.topLevelWorldView.plane][AsyncHttpResponse.cameraX >> 7][PlayerType.cameraZ >> 7] & 4) != 0 ? class198.topLevelWorldView.plane : 3;
		}
	}
}
