import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mo")
public class class330 {
	@ObfuscatedName("ab")
	static int[] field3547;

	static {
		new Object();
		field3547 = new int[33];
		field3547[0] = 0;
		int var0 = 2;

		for (int var1 = 1; var1 < 33; ++var1) {
			field3547[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-62933878"
	)
	static final int method6206() {
		if (TileItem.clientPreferences.isRoofsHidden()) {
			return ConcurrentMidiTask.topLevelWorldView.plane;
		} else {
			int var0 = 3;
			int var1 = class354.entity.getX() >> 7;
			int var2 = class354.entity.getY() >> 7;
			if (UserComparator6.cameraPitch < 310) {
				int var3;
				int var4;
				if (Client.oculusOrbState == 1) {
					var3 = class130.oculusOrbFocalPointX >> 7;
					var4 = class499.oculusOrbFocalPointY >> 7;
				} else {
					var3 = var1;
					var4 = var2;
				}

				int var5 = class433.cameraX >> 7;
				int var6 = WorldMapSection0.cameraZ >> 7;
				if (var5 < 0 || 104 <= var5 || var6 < 0 || 104 <= var6) {
					return ConcurrentMidiTask.topLevelWorldView.plane;
				}

				if (var3 < 0 || 104 <= var3 || var4 < 0 || 104 <= var4) {
					return ConcurrentMidiTask.topLevelWorldView.plane;
				}

				if ((ConcurrentMidiTask.topLevelWorldView.tileSettings[ConcurrentMidiTask.topLevelWorldView.plane][var5][var6] & 4) != 0) {
					var0 = ConcurrentMidiTask.topLevelWorldView.plane;
				}

				int var7;
				if (var3 > var5) {
					var7 = var3 - var5;
				} else {
					var7 = var5 - var3;
				}

				int var8;
				if (var4 > var6) {
					var8 = var4 - var6;
				} else {
					var8 = var6 - var4;
				}

				int var9;
				int var10;
				if (var7 > var8) {
					var9 = var8 * 65536 / var7;
					var10 = 32768;

					while (var5 != var3) {
						if (var5 < var3) {
							++var5;
						} else if (var5 > var3) {
							--var5;
						}

						if ((ConcurrentMidiTask.topLevelWorldView.tileSettings[ConcurrentMidiTask.topLevelWorldView.plane][var5][var6] & 4) != 0) {
							var0 = ConcurrentMidiTask.topLevelWorldView.plane;
						}

						var10 += var9;
						if (var10 >= 65536) {
							var10 -= 65536;
							if (var6 < var4) {
								++var6;
							} else if (var6 > var4) {
								--var6;
							}

							if ((ConcurrentMidiTask.topLevelWorldView.tileSettings[ConcurrentMidiTask.topLevelWorldView.plane][var5][var6] & 4) != 0) {
								var0 = ConcurrentMidiTask.topLevelWorldView.plane;
							}
						}
					}
				} else if (var8 > 0) {
					var9 = var7 * 65536 / var8;
					var10 = 32768;

					while (var4 != var6) {
						if (var6 < var4) {
							++var6;
						} else if (var6 > var4) {
							--var6;
						}

						if ((ConcurrentMidiTask.topLevelWorldView.tileSettings[ConcurrentMidiTask.topLevelWorldView.plane][var5][var6] & 4) != 0) {
							var0 = ConcurrentMidiTask.topLevelWorldView.plane;
						}

						var10 += var9;
						if (var10 >= 65536) {
							var10 -= 65536;
							if (var5 < var3) {
								++var5;
							} else if (var5 > var3) {
								--var5;
							}

							if ((ConcurrentMidiTask.topLevelWorldView.tileSettings[ConcurrentMidiTask.topLevelWorldView.plane][var5][var6] & 4) != 0) {
								var0 = ConcurrentMidiTask.topLevelWorldView.plane;
							}
						}
					}
				}
			}

			if (var1 >= 0 && 104 > var1 && var2 >= 0 && 104 > var2) {
				if ((ConcurrentMidiTask.topLevelWorldView.tileSettings[ConcurrentMidiTask.topLevelWorldView.plane][var1][var2] & 4) != 0) {
					var0 = ConcurrentMidiTask.topLevelWorldView.plane;
				}

				return var0;
			} else {
				return ConcurrentMidiTask.topLevelWorldView.plane;
			}
		}
	}
}
