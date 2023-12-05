import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ly")
public class class306 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	public static final class306 field3232;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	public static final class306 field3226;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	public static final class306 field3228;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	public static final class306 field3230;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	public static final class306 field3225;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	public static final class306 field3234;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	public static final class306 field3231;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	public static final class306 field3227;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	public static final class306 field3233;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	public static final class306 field3229;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	public static final class306 field3235;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	public static final class306 field3236;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	public static final class306 field3237;

	static {
		field3232 = new class306(4);
		field3226 = new class306(5);
		field3228 = new class306(20);
		field3230 = new class306(4);
		field3225 = new class306(16);
		field3234 = new class306(6);
		field3231 = new class306(14);
		field3227 = new class306(14);
		field3233 = new class306(5);
		field3229 = new class306(7);
		field3235 = new class306(19);
		field3236 = new class306(11);
		field3237 = new class306(2);
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "4"
	)
	class306(int var1) {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILuj;I)Lgx;",
		garbageValue = "-485620123"
	)
	public static PlayerCompositionColorTextureOverride method5914(int var0, Buffer var1) {
		int var2 = var1.readUnsignedByte();
		boolean var3 = (var2 & 1) != 0;
		boolean var4 = (var2 & 2) != 0;
		PlayerCompositionColorTextureOverride var5 = new PlayerCompositionColorTextureOverride(var0);
		int var6;
		int[] var7;
		boolean var8;
		int var9;
		short var10;
		if (var3) {
			var6 = var1.readUnsignedByte();
			var7 = new int[]{var6 & 15, var6 >> 4 & 15};
			var8 = var5.playerCompositionRecolorTo != null && var7.length == var5.playerCompositionRecolorTo.length;

			for (var9 = 0; var9 < 2; ++var9) {
				if (var7[var9] != 15) {
					var10 = (short)var1.readUnsignedShort();
					if (var8) {
						var5.playerCompositionRecolorTo[var7[var9]] = var10;
					}
				}
			}
		}

		if (var4) {
			var6 = var1.readUnsignedByte();
			var7 = new int[]{var6 & 15, var6 >> 4 & 15};
			var8 = var5.playerCompositionRetextureTo != null && var7.length == var5.playerCompositionRetextureTo.length;

			for (var9 = 0; var9 < 2; ++var9) {
				if (var7[var9] != 15) {
					var10 = (short)var1.readUnsignedShort();
					if (var8) {
						var5.playerCompositionRetextureTo[var7[var9]] = var10;
					}
				}
			}
		}

		return var5;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "744218081"
	)
	public static void method5910(int var0, int var1) {
		VarbitComposition var2 = ClientPreferences.method2644(var0);
		int var3 = var2.baseVar;
		int var4 = var2.startBit;
		int var5 = var2.endBit;
		int var6 = Varps.Varps_masks[var5 - var4];
		if (var1 < 0 || var1 > var6) {
			var1 = 0;
		}

		var6 <<= var4;
		Varps.Varps_main[var3] = Varps.Varps_main[var3] & ~var6 | var1 << var4 & var6;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-373898981"
	)
	public static int method5916(int var0) {
		return var0 >>> 4 & class520.field5087;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lnn;IIS)V",
		garbageValue = "-21324"
	)
	public static void method5915(Widget var0, int var1, int var2) {
		var0.field3717.bodyColors[var1] = var2;
		var0.field3717.method6323();
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "56799465"
	)
	static final int method5913() {
		if (WorldMapIcon_1.clientPreferences.isRoofsHidden()) {
			return ItemLayer.Client_plane;
		} else {
			int var0 = 3;
			if (Varcs.cameraPitch < 310) {
				label169: {
					int var1;
					int var2;
					if (Client.oculusOrbState == 1) {
						var1 = LoginScreenAnimation.oculusOrbFocalPointX >> 7;
						var2 = ScriptFrame.oculusOrbFocalPointY >> 7;
					} else {
						var1 = class229.localPlayer.x >> 7;
						var2 = class229.localPlayer.y >> 7;
					}

					int var3 = ViewportMouse.cameraX >> 7;
					int var4 = class36.cameraZ >> 7;
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
						if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
							if ((Tiles.Tiles_renderFlags[ItemLayer.Client_plane][var3][var4] & 4) != 0) {
								var0 = ItemLayer.Client_plane;
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

								while (true) {
									if (var1 == var3) {
										break label169;
									}

									if (var3 < var1) {
										++var3;
									} else if (var3 > var1) {
										--var3;
									}

									if ((Tiles.Tiles_renderFlags[ItemLayer.Client_plane][var3][var4] & 4) != 0) {
										var0 = ItemLayer.Client_plane;
									}

									var8 += var7;
									if (var8 >= 65536) {
										var8 -= 65536;
										if (var4 < var2) {
											++var4;
										} else if (var4 > var2) {
											--var4;
										}

										if ((Tiles.Tiles_renderFlags[ItemLayer.Client_plane][var3][var4] & 4) != 0) {
											var0 = ItemLayer.Client_plane;
										}
									}
								}
							} else {
								if (var6 > 0) {
									var7 = var5 * 65536 / var6;
									var8 = 32768;

									while (var2 != var4) {
										if (var4 < var2) {
											++var4;
										} else if (var4 > var2) {
											--var4;
										}

										if ((Tiles.Tiles_renderFlags[ItemLayer.Client_plane][var3][var4] & 4) != 0) {
											var0 = ItemLayer.Client_plane;
										}

										var8 += var7;
										if (var8 >= 65536) {
											var8 -= 65536;
											if (var3 < var1) {
												++var3;
											} else if (var3 > var1) {
												--var3;
											}

											if ((Tiles.Tiles_renderFlags[ItemLayer.Client_plane][var3][var4] & 4) != 0) {
												var0 = ItemLayer.Client_plane;
											}
										}
									}
								}
								break label169;
							}
						}

						return ItemLayer.Client_plane;
					}

					return ItemLayer.Client_plane;
				}
			}

			if (class229.localPlayer.x >= 0 && class229.localPlayer.y >= 0 && class229.localPlayer.x < 13312 && class229.localPlayer.y < 13312) {
				if ((Tiles.Tiles_renderFlags[ItemLayer.Client_plane][class229.localPlayer.x >> 7][class229.localPlayer.y >> 7] & 4) != 0) {
					var0 = ItemLayer.Client_plane;
				}

				return var0;
			} else {
				return ItemLayer.Client_plane;
			}
		}
	}
}
