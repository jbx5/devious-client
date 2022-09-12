import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pc")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("j")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;
	@ObfuscatedName("s")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full"); // L: 7
		FontName_plain12 = new FontName("p12_full"); // L: 8
		FontName_bold12 = new FontName("b12_full"); // L: 9
		FontName_verdana11 = new FontName("verdana_11pt_regular"); // L: 10
		FontName_verdana13 = new FontName("verdana_13pt_regular"); // L: 11
		FontName_verdana15 = new FontName("verdana_15pt_regular"); // L: 12
	}

	FontName(String var1) {
		this.name = var1; // L: 16
	} // L: 17

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[Lcq;",
		garbageValue = "-1814894957"
	)
	static AttackOption[] method7594() {
		return new AttackOption[]{AttackOption.AttackOption_hidden, AttackOption.AttackOption_alwaysRightClick, AttackOption.field1282, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.field1275}; // L: 12228
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1573839974"
	)
	static final void method7596() {
		int var0;
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		if (Client.oculusOrbState == 0) { // L: 3718
			var0 = class67.localPlayer.x; // L: 3719
			var1 = class67.localPlayer.y; // L: 3720
			if (class147.oculusOrbFocalPointX - var0 < -500 || class147.oculusOrbFocalPointX - var0 > 500 || Language.oculusOrbFocalPointY - var1 < -500 || Language.oculusOrbFocalPointY - var1 > 500) { // L: 3721
				class147.oculusOrbFocalPointX = var0; // L: 3722
				Language.oculusOrbFocalPointY = var1; // L: 3723
			}

			if (var0 != class147.oculusOrbFocalPointX) { // L: 3725
				class147.oculusOrbFocalPointX += (var0 - class147.oculusOrbFocalPointX) / 16;
			}

			if (var1 != Language.oculusOrbFocalPointY) { // L: 3726
				Language.oculusOrbFocalPointY += (var1 - Language.oculusOrbFocalPointY) / 16;
			}

			var2 = class147.oculusOrbFocalPointX >> 7; // L: 3727
			var3 = Language.oculusOrbFocalPointY >> 7; // L: 3728
			var4 = class120.getTileHeight(class147.oculusOrbFocalPointX, Language.oculusOrbFocalPointY, Tiles.Client_plane); // L: 3729
			var5 = 0; // L: 3730
			int var6;
			if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) { // L: 3731
				for (var6 = var2 - 4; var6 <= var2 + 4; ++var6) { // L: 3732
					for (int var7 = var3 - 4; var7 <= var3 + 4; ++var7) { // L: 3733
						int var8 = Tiles.Client_plane; // L: 3734
						if (var8 < 3 && (Tiles.Tiles_renderFlags[1][var6][var7] & 2) == 2) { // L: 3735
							++var8;
						}

						int var9 = var4 - Tiles.Tiles_heights[var8][var6][var7]; // L: 3736
						if (var9 > var5) { // L: 3737
							var5 = var9;
						}
					}
				}
			}

			var6 = var5 * 192; // L: 3741
			if (var6 > 98048) { // L: 3742
				var6 = 98048;
			}

			if (var6 < 32768) { // L: 3743
				var6 = 32768;
			}

			if (var6 > Client.field589) { // L: 3744
				Client.field589 += (var6 - Client.field589) / 24;
			} else if (var6 < Client.field589) { // L: 3745
				Client.field589 += (var6 - Client.field589) / 80;
			}

			class120.field1505 = class120.getTileHeight(class67.localPlayer.x, class67.localPlayer.y, Tiles.Client_plane) - Client.camFollowHeight; // L: 3746
		} else if (Client.oculusOrbState == 1) { // L: 3748
			if (Client.field586 && class67.localPlayer != null) { // L: 3750
				var0 = class67.localPlayer.pathX[0]; // L: 3751
				var1 = class67.localPlayer.pathY[0]; // L: 3752
				if (var0 >= 0 && var1 >= 0 && var0 < 104 && var1 < 104) { // L: 3753
					class147.oculusOrbFocalPointX = class67.localPlayer.x; // L: 3754
					var2 = class120.getTileHeight(class67.localPlayer.x, class67.localPlayer.y, Tiles.Client_plane) - Client.camFollowHeight; // L: 3755
					if (var2 < class120.field1505) { // L: 3756
						class120.field1505 = var2;
					}

					Language.oculusOrbFocalPointY = class67.localPlayer.y; // L: 3757
					Client.field586 = false; // L: 3758
				}
			}

			short var10 = -1; // L: 3761
			if (KeyHandler.KeyHandler_pressedKeys[33]) { // L: 3762
				var10 = 0;
			} else if (KeyHandler.KeyHandler_pressedKeys[49]) { // L: 3763
				var10 = 1024;
			}

			if (KeyHandler.KeyHandler_pressedKeys[48]) { // L: 3764
				if (var10 == 0) { // L: 3765
					var10 = 1792;
				} else if (var10 == 1024) { // L: 3766
					var10 = 1280;
				} else {
					var10 = 1536; // L: 3767
				}
			} else if (KeyHandler.KeyHandler_pressedKeys[50]) { // L: 3769
				if (var10 == 0) { // L: 3770
					var10 = 256;
				} else if (var10 == 1024) { // L: 3771
					var10 = 768;
				} else {
					var10 = 512; // L: 3772
				}
			}

			byte var11 = 0; // L: 3774
			if (KeyHandler.KeyHandler_pressedKeys[35]) { // L: 3775
				var11 = -1;
			} else if (KeyHandler.KeyHandler_pressedKeys[51]) { // L: 3776
				var11 = 1;
			}

			var2 = 0; // L: 3777
			if (var10 >= 0 || var11 != 0) { // L: 3778
				var2 = KeyHandler.KeyHandler_pressedKeys[81] ? Client.oculusOrbSlowedSpeed : Client.oculusOrbNormalSpeed; // L: 3779
				var2 *= 16; // L: 3780
				Client.field581 = var10; // L: 3781
				Client.field582 = var11; // L: 3782
			}

			if (Client.field580 < var2) { // L: 3784
				Client.field580 += var2 / 8; // L: 3785
				if (Client.field580 > var2) { // L: 3786
					Client.field580 = var2;
				}
			} else if (Client.field580 > var2) { // L: 3788
				Client.field580 = Client.field580 * 9 / 10;
			}

			if (Client.field580 > 0) { // L: 3789
				var3 = Client.field580 / 16; // L: 3790
				if (Client.field581 >= 0) { // L: 3791
					var0 = Client.field581 - class10.cameraYaw & 2047; // L: 3792
					var4 = Rasterizer3D.Rasterizer3D_sine[var0]; // L: 3793
					var5 = Rasterizer3D.Rasterizer3D_cosine[var0]; // L: 3794
					class147.oculusOrbFocalPointX += var4 * var3 / 65536; // L: 3795
					Language.oculusOrbFocalPointY += var5 * var3 / 65536; // L: 3796
				}

				if (Client.field582 != 0) { // L: 3798
					class120.field1505 += var3 * Client.field582; // L: 3799
					if (class120.field1505 > 0) { // L: 3800
						class120.field1505 = 0;
					}
				}
			} else {
				Client.field581 = -1; // L: 3804
				Client.field582 = -1; // L: 3805
			}

			if (KeyHandler.KeyHandler_pressedKeys[13]) { // L: 3807
				method7595(); // L: 3808
			}
		}

		if (MouseHandler.MouseHandler_currentButton == 4 && Renderable.mouseCam) { // L: 3811
			var0 = MouseHandler.MouseHandler_y - Client.mouseCamClickedY; // L: 3812
			Client.camAngleDX = var0 * 2; // L: 3813
			Client.mouseCamClickedY = var0 != -1 && var0 != 1 ? (MouseHandler.MouseHandler_y + Client.mouseCamClickedY) / 2 : MouseHandler.MouseHandler_y; // L: 3814
			var1 = Client.mouseCamClickedX - MouseHandler.MouseHandler_x; // L: 3815
			Client.camAngleDY = var1 * 2; // L: 3816
			Client.mouseCamClickedX = var1 != -1 && var1 != 1 ? (Client.mouseCamClickedX + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x; // L: 3817
		} else {
			if (KeyHandler.KeyHandler_pressedKeys[96]) { // L: 3820
				Client.camAngleDY += (-24 - Client.camAngleDY) / 2;
			} else if (KeyHandler.KeyHandler_pressedKeys[97]) { // L: 3821
				Client.camAngleDY += (24 - Client.camAngleDY) / 2;
			} else {
				Client.camAngleDY /= 2; // L: 3822
			}

			if (KeyHandler.KeyHandler_pressedKeys[98]) { // L: 3823
				Client.camAngleDX += (12 - Client.camAngleDX) / 2;
			} else if (KeyHandler.KeyHandler_pressedKeys[99]) { // L: 3824
				Client.camAngleDX += (-12 - Client.camAngleDX) / 2;
			} else {
				Client.camAngleDX /= 2; // L: 3825
			}

			Client.mouseCamClickedY = MouseHandler.MouseHandler_y; // L: 3826
			Client.mouseCamClickedX = MouseHandler.MouseHandler_x; // L: 3827
		}

		Client.camAngleY = Client.camAngleDY / 2 + Client.camAngleY & 2047; // L: 3829
		Client.camAngleX += Client.camAngleDX / 2; // L: 3830
		if (Client.camAngleX < 128) { // L: 3831
			Client.camAngleX = 128;
		}

		if (Client.camAngleX > 383) { // L: 3832
			Client.camAngleX = 383;
		}

	} // L: 3833

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	static void method7595() {
		Client.packetWriter.addNode(class120.getPacketBufferNode(ClientPacket.FREECAM_EXIT, Client.packetWriter.isaacCipher)); // L: 12143
		Client.oculusOrbState = 0; // L: 12144
	} // L: 12145
}
