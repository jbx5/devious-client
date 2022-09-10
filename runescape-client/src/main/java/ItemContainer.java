import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("g")
	@Export("formattedOperatingSystemName")
	public static String formattedOperatingSystemName;
	@ObfuscatedName("p")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("f")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32); // L: 7
	}

	ItemContainer() {
		this.ids = new int[]{-1}; // L: 8
		this.quantities = new int[]{0}; // L: 9
	} // L: 11

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1170860570"
	)
	static int method2230(int var0, int var1) {
		for (int var2 = 0; var2 < 8; ++var2) { // L: 1102
			if (var1 <= var0 + 30) { // L: 1103
				return var2; // L: 1104
			}

			var0 += 30; // L: 1106
			var0 += var2 != 1 && var2 != 3 ? 5 : 20; // L: 1107
		}

		return 0; // L: 1109
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1134132490"
	)
	static final int method2233() {
		if (Player.clientPreferences.method2452()) { // L: 4718
			return Tiles.Client_plane;
		} else {
			int var0 = 3; // L: 4719
			if (class163.cameraPitch < 310) { // L: 4720
				int var1;
				int var2;
				if (Client.oculusOrbState == 1) { // L: 4723
					var1 = class147.oculusOrbFocalPointX >> 7; // L: 4724
					var2 = Language.oculusOrbFocalPointY >> 7; // L: 4725
				} else {
					var1 = class67.localPlayer.x >> 7; // L: 4728
					var2 = class67.localPlayer.y >> 7; // L: 4729
				}

				int var3 = TaskHandler.cameraX >> 7; // L: 4731
				int var4 = ApproximateRouteStrategy.cameraZ >> 7; // L: 4732
				if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) { // L: 4733
					return Tiles.Client_plane;
				}

				if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) { // L: 4734
					return Tiles.Client_plane;
				}

				if ((Tiles.Tiles_renderFlags[Tiles.Client_plane][var3][var4] & 4) != 0) { // L: 4735
					var0 = Tiles.Client_plane;
				}

				int var5;
				if (var1 > var3) { // L: 4737
					var5 = var1 - var3;
				} else {
					var5 = var3 - var1; // L: 4738
				}

				int var6;
				if (var2 > var4) { // L: 4740
					var6 = var2 - var4;
				} else {
					var6 = var4 - var2; // L: 4741
				}

				int var7;
				int var8;
				if (var5 > var6) { // L: 4742
					var7 = var6 * 65536 / var5; // L: 4743
					var8 = 32768; // L: 4744

					while (var1 != var3) { // L: 4745
						if (var3 < var1) {
							++var3; // L: 4746
						} else if (var3 > var1) { // L: 4747
							--var3;
						}

						if ((Tiles.Tiles_renderFlags[Tiles.Client_plane][var3][var4] & 4) != 0) { // L: 4748
							var0 = Tiles.Client_plane;
						}

						var8 += var7; // L: 4749
						if (var8 >= 65536) { // L: 4750
							var8 -= 65536; // L: 4751
							if (var4 < var2) { // L: 4752
								++var4;
							} else if (var4 > var2) { // L: 4753
								--var4;
							}

							if ((Tiles.Tiles_renderFlags[Tiles.Client_plane][var3][var4] & 4) != 0) { // L: 4754
								var0 = Tiles.Client_plane;
							}
						}
					}
				} else if (var6 > 0) { // L: 4758
					var7 = var5 * 65536 / var6; // L: 4759
					var8 = 32768; // L: 4760

					while (var4 != var2) { // L: 4761
						if (var4 < var2) { // L: 4762
							++var4;
						} else if (var4 > var2) { // L: 4763
							--var4;
						}

						if ((Tiles.Tiles_renderFlags[Tiles.Client_plane][var3][var4] & 4) != 0) { // L: 4764
							var0 = Tiles.Client_plane;
						}

						var8 += var7; // L: 4765
						if (var8 >= 65536) { // L: 4766
							var8 -= 65536; // L: 4767
							if (var3 < var1) { // L: 4768
								++var3;
							} else if (var3 > var1) { // L: 4769
								--var3;
							}

							if ((Tiles.Tiles_renderFlags[Tiles.Client_plane][var3][var4] & 4) != 0) { // L: 4770
								var0 = Tiles.Client_plane;
							}
						}
					}
				}
			}

			if (class67.localPlayer.x >= 0 && class67.localPlayer.y >= 0 && class67.localPlayer.x < 13312 && class67.localPlayer.y < 13312) { // L: 4775
				if ((Tiles.Tiles_renderFlags[Tiles.Client_plane][class67.localPlayer.x >> 7][class67.localPlayer.y >> 7] & 4) != 0) { // L: 4776
					var0 = Tiles.Client_plane;
				}

				return var0; // L: 4777
			} else {
				return Tiles.Client_plane;
			}
		}
	}
}
