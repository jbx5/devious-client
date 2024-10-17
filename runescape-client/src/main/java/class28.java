import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bv")
public class class28 {
	@ObfuscatedName("du")
	@Export("KeyHandler_keyCodes")
	static int[] KeyHandler_keyCodes;

	static {
		KeyHandler_keyCodes = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1453593363"
	)
	static final void method443(int var0) {
		int[] var1 = Decimator.sceneMinimapSprite.pixels;
		int var2 = var1.length;

		int var3;
		for (var3 = 0; var3 < var2; ++var3) {
			var1[var3] = 0;
		}

		int var4;
		int var5;
		for (var3 = 1; var3 < 103; ++var3) {
			var4 = (103 - var3) * 2048 + 24628;

			for (var5 = 1; var5 < 103; ++var5) {
				if ((class198.topLevelWorldView.tileSettings[var0][var5][var3] & 24) == 0) {
					class198.topLevelWorldView.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
				}

				if (var0 < 3 && (class198.topLevelWorldView.tileSettings[var0 + 1][var5][var3] & 8) != 0) {
					class198.topLevelWorldView.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
				}

				var4 += 4;
			}
		}

		var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
		var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
		Decimator.sceneMinimapSprite.setRaster();

		int var6;
		for (var5 = 1; var5 < 103; ++var5) {
			for (var6 = 1; var6 < 103; ++var6) {
				if ((class198.topLevelWorldView.tileSettings[var0][var6][var5] & 24) == 0) {
					class179.drawObject(var0, var6, var5, var3, var4);
				}

				if (var0 < 3 && (class198.topLevelWorldView.tileSettings[var0 + 1][var6][var5] & 8) != 0) {
					class179.drawObject(var0 + 1, var6, var5, var3, var4);
				}
			}
		}

		Client.mapIconCount = 0;

		for (var5 = 0; var5 < 104; ++var5) {
			for (var6 = 0; var6 < 104; ++var6) {
				long var7 = class198.topLevelWorldView.scene.getFloorDecorationTag(class198.topLevelWorldView.plane, var5, var6);
				if (0L != var7) {
					int var9 = class309.Entity_unpackID(var7);
					int var10 = UrlRequest.getObjectDefinition(var9).mapIconId;
					if (var10 >= 0 && AsyncRestClient.WorldMapElement_get(var10).field1916) {
						Client.mapIcons[Client.mapIconCount] = AsyncRestClient.WorldMapElement_get(var10).getSpriteBool(false);
						Client.mapIconXs[Client.mapIconCount] = var5;
						Client.mapIconYs[Client.mapIconCount] = var6;
						++Client.mapIconCount;
					}
				}
			}
		}

		class213.rasterProvider.apply();
	}
}
