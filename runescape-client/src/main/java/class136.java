import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
class class136 implements Callable {
	@ObfuscatedName("us")
	@ObfuscatedSignature(
		descriptor = "Lcg;"
	)
	@Export("decimator")
	static Decimator decimator;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	final class139 this$0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lul;"
	)
	final Buffer val$p;
	// $FF: synthetic field
	final int val$version;

	@ObfuscatedSignature(
		descriptor = "(Lfk;Lul;I)V"
	)
	class136(class139 var1, Buffer var2, int var3) {
		this.this$0 = var1;
		this.val$p = var2;
		this.val$version = var3;
	}

	public Object call() {
		this.this$0.method3103(this.val$p, this.val$version);
		return null;
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1884389430"
	)
	static final int method3078() {
		if (class91.clientPreferences.method2502()) {
			return class87.Client_plane;
		} else {
			int var0 = 3;
			if (class365.cameraPitch < 310) {
				int var1;
				int var2;
				if (Client.oculusOrbState == 1) {
					var1 = ChatChannel.oculusOrbFocalPointX >> 7;
					var2 = AbstractWorldMapData.oculusOrbFocalPointY >> 7;
				} else {
					var1 = TextureProvider.localPlayer.x >> 7;
					var2 = TextureProvider.localPlayer.y >> 7;
				}

				int var3 = Client.cameraX >> 7;
				int var4 = WorldMapArea.cameraZ >> 7;
				if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
					return class87.Client_plane;
				}

				if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
					return class87.Client_plane;
				}

				if ((Tiles.Tiles_renderFlags[class87.Client_plane][var3][var4] & 4) != 0) {
					var0 = class87.Client_plane;
				}

				int var5;
				if (var1 > var3) {
					var5 = var1 - var3;
				} else {
					var5 = var3 - var1;
				}

				int var6;
				if (var2 > var4) {
					var6 = var2 - var4;
				} else {
					var6 = var4 - var2;
				}

				int var7;
				int var8;
				if (var5 > var6) {
					var7 = var6 * 65536 / var5;
					var8 = 32768;

					while (var1 != var3) {
						if (var3 < var1) {
							++var3;
						} else if (var3 > var1) {
							--var3;
						}

						if ((Tiles.Tiles_renderFlags[class87.Client_plane][var3][var4] & 4) != 0) {
							var0 = class87.Client_plane;
						}

						var8 += var7;
						if (var8 >= 65536) {
							var8 -= 65536;
							if (var4 < var2) {
								++var4;
							} else if (var4 > var2) {
								--var4;
							}

							if ((Tiles.Tiles_renderFlags[class87.Client_plane][var3][var4] & 4) != 0) {
								var0 = class87.Client_plane;
							}
						}
					}
				} else if (var6 > 0) {
					var7 = var5 * 65536 / var6;
					var8 = 32768;

					while (var4 != var2) {
						if (var4 < var2) {
							++var4;
						} else if (var4 > var2) {
							--var4;
						}

						if ((Tiles.Tiles_renderFlags[class87.Client_plane][var3][var4] & 4) != 0) {
							var0 = class87.Client_plane;
						}

						var8 += var7;
						if (var8 >= 65536) {
							var8 -= 65536;
							if (var3 < var1) {
								++var3;
							} else if (var3 > var1) {
								--var3;
							}

							if ((Tiles.Tiles_renderFlags[class87.Client_plane][var3][var4] & 4) != 0) {
								var0 = class87.Client_plane;
							}
						}
					}
				}
			}

			if (TextureProvider.localPlayer.x >= 0 && TextureProvider.localPlayer.y >= 0 && TextureProvider.localPlayer.x < 13312 && TextureProvider.localPlayer.y < 13312) {
				if ((Tiles.Tiles_renderFlags[class87.Client_plane][TextureProvider.localPlayer.x >> 7][TextureProvider.localPlayer.y >> 7] & 4) != 0) {
					var0 = class87.Client_plane;
				}

				return var0;
			} else {
				return class87.Client_plane;
			}
		}
	}
}
